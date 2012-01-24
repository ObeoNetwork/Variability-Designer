
:- dynamic timestampRestriction/1.
:- dynamic mofsub/2.
:- dynamic mofmult/3, mofmult/4.

library(isTypeOf(X,Y)) :- create0(X,Y, _).
library(isKindOf(X,Y)) :- library(isTypeOf(X,Y)). 
library(isKindOf(X,Y)) :- mofsub(C,Y), library(isTypeOf(X,C)). 
library(hasMultiplicity(C, P, LB, UB)) :- mofmult(C, P, LB, UB). 
library(hasMultiplicity(P, LB, UB)) :- mofmult(_, P, LB, UB). 

library(equal(X,Y)) :- X = Y.
library(cut) :- !.

%added : lt
library(lt(X,Y)) :- ground(X), 
					ground(Y), 
					cond_atom_number(X,NX), 
					cond_atom_number(Y,NY),
					NX < NY.
					
library(gt(X,Y)) :- ground(X), 
					ground(Y), 
					cond_atom_number(X,NX), 
					cond_atom_number(Y,NY),
					NX > NY.
					
library(eq(X,Y)) :- ground(X), 
					ground(Y), 
					cond_atom_number(X,NX), 
					cond_atom_number(Y,NY),
					NX =:= NY.
					
cond_atom_number(X,X) :- number(X).
cond_atom_number(X,NX) :- not(number(X)), atom_number(X,NX).

%  added : X and Y value are equal
library(eq2(X,Y) : - X =:= Y.

library(externalRule(R)) :- call(R).
library(externalRule(R), T) :- 
	R =.. PR, 
	append(PR, [T], PRExt), 
	RExt =.. PRExt,
	call(RExt).

library(temporalFormula(last, [create(X,Y,T)]))         :- limitedLastCreate(X,Y,T).
library(temporalFormula(last, [delete(X,T)]))           :- limitedLastDelete(X,_,T).
library(temporalFormula(last, [delete(X,Y,T)]))         :- limitedLastDelete(X,Y,T).
library(temporalFormula(last, [addProperty(X,Y,Z,T)]))  :- limitedLastAddProperty(X,Y,Z,T).
library(temporalFormula(last, [addReference(X,Y,Z,T)])) :- limitedLastAddReference(X,Y,Z,T).
library(temporalFormula(last, [setReference(X,Y,Z,_)])) :- limitedLastSetReference(X,Y,Z).
library(temporalFormula(last, [setProperty(X,Y,Z,_)]))  :- limitedLastSetProperty(X,Y,Z).

% TODO: make sure it's *the* last
library(temporalFormula(last, [F])) :-
									notForbiddenFunctor(F),
									catch(call(F), _, fail),
									getTimeStamp(F, T),
									not(afterLimit(T)).

library(temporalFormula(before, [F1, F2]))  :-
									catch(call(F1), _, fail),
									catch(call(F2), _, fail),
									getTimeStamp(F1, T1),
									getTimeStamp(F2, T2),
									before(T1,T2).

library(temporalFormula(after, [F1, F2]))  :-
									catch(call(F1), _, fail),
									catch(call(F2), _, fail),
									getTimeStamp(F1, T1),
									getTimeStamp(F2, T2),
									after(T1,T2).

library(temporalFormula(between, [F1, F2, F3]))  :-
									catch(call(F1), _, fail),
									catch(call(F2), _, fail),
									catch(call(F3), _, fail),
									getTimeStamp(F1, T1),
									getTimeStamp(F2, T2),
									getTimeStamp(F3, T3),
									before(T1,T2),
									before(T2,T3).

library(setActionRestriction,T) :- library(unsetActionRestriction), assert(timestampRestriction(T)).
library(unsetActionRestriction) :- retractall(timestampRestriction(_)).

library(navigationFormula([X,Y,Z]))  :- limitedLastAddProperty(X,Y,Z,_).
library(navigationFormula([X,Y,Z]))  :- limitedLastAddReference(X,Y,Z,_).
library(navigationFormula([X,Y|R]))  :- limitedLastAddReference(X,Y,V,_),
										library(navigationFormula([V|R])).

library(P) :- notForbiddenFunctor(P), catch(call(P), _, fail).
library(P,T) :- notForbiddenFunctor(P), 
				P =.. PR, 
				append(PR, [T], PRExt), 
				RExt =.. PRExt,
				catch(call(RExt), _, fail).

% helper predicates

notForbiddenFunctor(P) :- not((functor(P, F, A), forbiddenFunctor(F,A))).
forbiddenFunctor(create, 3).
forbiddenFunctor(delNode, 3).
forbiddenFunctor(addReference, 4).
forbiddenFunctor(remReference, 4).
forbiddenFunctor(addProperty, 4).
forbiddenFunctor(remProperty, 4).

getTimeStamp(F, T) :- functor(F, _, Arity), arg(Arity, F, T).

afterLimit(T) :- timestampRestriction(R), catch(after(T,R), _, fail).

% limited versions of temporal formulas
limitedLastCreate(Name,Type,TS1) :-
	create0(Name,Type,TS1),
	not((delNode(Name,Type,TS2),after(TS2,TS1))),
	not(afterLimit(TS1)).

limitedLastDelete(Name,Type,TS1) :-
	delNode(Name,Type,TS1),
	not(afterLimit(TS1)).

limitedLastAddProperty(Name,Type,Value,TS1) :-
	limitedLastCreate(Name,_,_),
	addProperty(Name,Type,Value,TS1),
	not(limitedPropertyDeleted(Name,Type,Value,TS1)),
	not(afterLimit(TS1)).

limitedLastAddReference(Name,Type,Value,TS1) :-
	limitedLastCreate(Name,_,_),
	addReference(Name,Type,Value,TS1),
	not(limitedReferenceDeleted(Name,Type,Value,TS1)),
	not(afterLimit(TS1)).

limitedLastAddReference(Name,Type,Value) :- limitedLastAddReference(Name,Type,Value,_).
limitedLastAddProperty(Name,Type,Value) :- limitedLastAddProperty(Name,Type,Value,_).

limitedPropertyDeleted(Name,Type,Value,TS) :-
	remProperty(Name,Type,Value,TS2), after(TS2,TS), not(afterLimit(TS2)).

limitedPropertyDeleted(Name,Type,_,TS) :-
	remProperty(Name,Type,'*',TS2), after(TS2,TS), not(afterLimit(TS2)).

limitedReferenceDeleted(Name,Type,Value,TS) :-
	remReference(Name,Type,Value,TS2), after(TS2,TS), not(afterLimit(TS2)).

limitedReferenceDeleted(Name,Type,_,TS) :-
	remReference(Name,Type,'*',TS2), after(TS2,TS), not(afterLimit(TS2)).

limitedLastSetReference(Name,Type,Values) :-
	setof(C, limitedLastAddReference(Name,Type,C), Values).

limitedLastSetProperty(Name,Type,Values) :-
	setof(C, limitedLastAddProperty(Name,Type,C), Values).

%identify if there is a path between X and Y along paths typed Arc.
library(path(X,Y,Arc)) :- pathAux(X,Y,Arc,[Y]).

pathAux(X,Y,Arc,_) :- call(Arc,X,Y).
pathAux(X,Y,Arc,L) :- call(Arc,Z,Y),
	not(member(Z,L)),
	pathAux(X,Z,Arc,[Z|L]).

library(cyclical(List,Relation)) :- call(Relation,P,_),
	setof(Dep, call(Relation,P,Dep), SetDep),
	dfs(P, SetDep, Path, Relation),
	sort(Path,List).

dfs(Goal, [Goal|_], [Goal], _).
dfs(Goal, [Current|Past], [Current|Future], Relation) :-
	call(Relation,Current,Next),
	\+ member(Next,Past),
	dfs(Goal, [Next, Current | Past], Future, Relation).


%identify X as part of a cycle along paths typed Arc.
library(cycle(X,Arc)) :- pathAux(X,X,Arc,[X]).

library(invalidCardinality1(Element,Reference,Cardinality)) :-
	create(Element,Class,_),
	(Class = Type; mofsub(Class,Type)),
	mofmult(Type, Reference,LBound,UBound),
	findall(Value, referenceOrPropertyAdded(Element,Reference,Value),RefValues),
	length(RefValues,Cardinality),
	(Cardinality < LBound;
		UBound \== -1,
		Cardinality>UBound).

library(setof(X,Y,Z)) :- setof(X,Y,Z).
library(findall(X,Y,Z)) :- findall(X,Y,Z).
library(member(X,Y)) :- member(X,Y).
library(union(X,Y,Z)):- union(X,Y,Z).
library(sort(X,Y)) :- sort(X,Y).
library(length(X,Y)) :- length(X,Y).
library(toNumber(Atom,Number)) :- atom_number(Atom,Number).
library(mofsub(X,Y)):-mofsub(X,Y).

addOneRef(Element,Reference) :-
	countRef(Element,Reference,Type,N),
	retract(countRef(Element,Reference,Type,N)),
	N1 is N+1,
	assert(countRef(Element,Reference,Type,N1)).
	
addOneProp(Element,Reference) :-
	countProp(Element,Reference,Type,N),
	retract(countProp(Element,Reference,Type,N)),
	N1 is N+1,
	assert(countProp(Element,Reference,Type,N1)).

library(invalidCardinality(_,_,_)) :- retractall(countRef(_,_,_,_)),
	retractall(countProp(_,_,_,_)),
	false.

library(invalidCardinality(Element,Reference,_)) :- library(isKindOf(Element,Type)),
	mofmultref(Type,Reference,LBound,UBound),
	(LBound > 0;
	UBound > 0),
	\+ countRef(Element,Reference,Type,_),
	assert(countRef(Element,Reference,Type,0)),
	false.
	
library(invalidCardinality(Element,Property,_)) :- library(isKindOf(Element,Type)),
	mofmultatt(Type,Property,LBound,UBound),
	(LBound > 0;
	UBound > 0),
	\+ countProp(Element,Property,Type,_),
	assert(countProp(Element,Property,Type,0)),
	false.

library(invalidCardinality(Element,Reference,_)) :- limitedLastAddReference(Element,Reference,_,_),
	addOneRef(Element,Reference),
	false.
	
library(invalidCardinality(Element,Property,_)) :- limitedLastAddProperty(Element,Property,_,_),
	addOneProp(Element,Property),
	false.

library(invalidCardinality(Element,Reference,Cardinality)) :-
	countRef(Element,Reference,Type,Cardinality),
	mofmultref(Type,Reference,LBound,UBound),
	(Cardinality < LBound;
	UBound \= -1,
	Cardinality > UBound).
	
library(invalidCardinality(Element,Property,Cardinality)) :-
	countProp(Element,Property,Type,Cardinality),
	mofmultatt(Type,Property,LBound,UBound),
	(Cardinality < LBound;
	UBound \= -1,
	Cardinality > UBound).	

library(invalidCardinality(_,_,_)) :- retractall(countRef(_,_,_,_)),
	retractall(countProp(_,_,_,_)),
	false.

%library(refCount(X,Y,Z)) :- refCount(X,Y,Z).

create0(Name,Type,TS1) :- create(Name,Type,TS1).
create0(Name,Type,TS1) :- create(Name,metaclass(_,_,Type),TS1).


% method added to solve constraint noMutexBetweenParentAndChild
isMutex (Feature1, Feature2, CEMutex) :-
((library(temporalFormula(last, [addReference(CEMutex, source, Feature1, _)])),
  library(temporalFormula(last, [addReference(CEMutex, target, Feature2, _)])),
  library(temporalFormula(last, [create(Mutex, mutex, _)])),
  library(temporalFormula(last, [addReference(CEMutex, constraint, Mutex, _)])));

  (library(temporalFormula(last, [addReference(CEMutex, source, Feature2, _)])),
  library(temporalFormula(last, [addReference(CEMutex, target, Feature1, _)])),
  library(temporalFormula(last, [create(Mutex2, mutex, _)])),
  library(temporalFormula(last, [addReference(CEMutex, constraint, Mutex2, _)])))), !.

isParent(FeatureParent, Feature) :-
                        (library(temporalFormula(last, [addReference(Feature, owningoperator, Op, _)])),                    library(temporalFormula(last, [addReference(FeatureParent, operator, Op, _)]))), !.

isAncestor(SearchedFeature, L, CurrentFeature) :- 
((isParent(SearchedFeature, CurrentFeature)); 
(library(setof(FParent, isParent(FParent, CurrentFeature), FeatureParents)), library(append(L, FeatureParents, L2)), ((L2)=([CurrentFeature| T])), ((T)=([NextFeature| T1])), isAncestor(SearchedFeature, T, NextFeature))).