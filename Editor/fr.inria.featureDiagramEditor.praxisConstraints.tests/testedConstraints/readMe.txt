#-------------------------------------------------------------------------------
# Copyright (c) 2010 mgouyett.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
# 
# Contributors:
#     mgouyett - initial API and implementation
#-------------------------------------------------------------------------------




This plugin contains the models used to tests the Praxis constraints on the Feature Diagram Editor.
Each constraints defined in the code have an folder with the featurediagram model, the Obeo Designer's session that correspond to it and the .actions file.
Before testing these constraints you need to have Praxis and Obeo Designer installed.
Firstly, open the Consistency view on Window->Show View -> Other -> Consistency -> Consistency.
Then , open the session file and right click on the feature diagram model ->Praxis-> ToPraxisProlog and then ->Praxis-> Activate Consistency Management.
You can click on the name of the model that you want to check and a table appears with the consistencies problems. This view is updated for each changes but you can reload it manually (green icon at the left).

The following paragraph describes in details the tests.
On this test we have a root feature with two children contained in an Or operator.

noTwoFeatureHaveSameName : ["Feature {2} has the same name of another feature in the feature diagram {1}"]
						   two features named "a" on the feature diagram
						 
noParentFeatureAsChildren : ["A feature children {2} cannot contain a parent feature {1}"]
							a have a feature c as child and these feature c has a as child (cycle)
							
noCyclesOnRequire : ["For two features f1 and f2, if f1 requires f2, f2 cannot requires f1"]
					The optional feature requires a but in this case a cannot requires c
					
					
noConstraintReflexive :  ["The feature with the name {2} requires or is mutually exclusive with itself"] 
						 Feature a cannot be mutually exclusive with itself and feature b cannot require itself.
						 
noSeveralMutexOnSameFeature : ["There cannot have several mutex between the same pair of features {2} {3}"]
							  There is a mutex between c and a and a and c
				

									
minCardLargerThanZero :  ["{1} cardinality minimum must be equal or larger than zero"]
						 Operator Card on  a feature has a mininum cardinality  at -5 which is forbidden whereas operator Card on feature c has correct values.
						 
noMinGreaterThanMax : [" {1}Cardinality maximum must be equal and greater than cardinality minimum"]	
					   The card operator on a feature has a cardinality minimum greater than the cardinality maximum which is forbidden.
					   Note that the card on b feature is not erroneous because cardinality maximum is equal to -1 which signify *.		
					   The card operator on c feature show a normal card use in finite bounds.			 
						 
noMaxLessThanMinusOne : [" {1} Cardinality maximum must be greater and equal than minus one"]
						The card operator on a feature violates these constraint because his maximum cardinality is -5.
						Note that this test violates also noMinGreaterThanMax (  -5 < 0 thus card max < card min)
					
									
nbFeatureMustBeMoreThanMin  : ["The number of children features of the operator Card on the feature{3} must be more than the minimum cardinality" ]
								The a feature has only two children whereas the card operator on require at least 3 features.
							
orOperatorMustHaveAtLeastTwoOperands : ["The or operator on the feature {3} must have at least two features  children" ]
										On this model the feature b was deleted, so the or operator on root feature have only one child
										
xorOperatorMustHaveAtLeastTwoOperands : ["The xor operator on the feature {3} must have at least two features  children" ]
										On this model the feature b was deleted and the or operator on feature a replaced by a xor operator, so the xor operator on root feature have only one child
										
noMutexBetweenFeeatureAndAncestor :  ["There cannot be mutual exclusivity between the feature {5} and one of his ancestor {4}"]
								    On this model feature a is a direct parent for features d and e and an ancestor for features h and i.
								    So, we add four forbidden mutex : 
								    	d to a
								    	a to e
								    	h to a 
								    	a to i
								    You must retrieve these inconsistencies on the Consistency view.
								    
noAncestorFeatureAsChildren :  ["The feature {4} cannot contains one of its ancestors {3} as child"]
							   On this model feature a has feature d and e as children and feature d has feature h and i as children.
							   We have added a parent-child link between feature e and feature a and  between feature h and feature a.
							   So we have the following messages : 
							   		The feature e cannot contains one of its ancestors a as child
							   		The feature h cannot contains one of its ancestors a as child
							   		The feature a cannot contains one of its ancestors d as child (because d is the parent of h and we put h as parent of a)
							   		The feature a cannot contains one of its ancestors e as child
							   		The feature d cannot contains one of its ancestors h as child (because d is a child of a and we put a as child of h)
							   		
							 
noBothRequireAndMutexOnSameFeature : ["There cannot be both mutex and require constraints between the same pair of features, {4} and {5}"]
									 feature a requires feature c and is mutually exclusive with it which is forbidden.
									 
noMutexBetweenAndFeatureChildren :  ["Features  {4} and  {5} cannot be mutually exclusive because they are children of the same feature {6} with an operator and"]
							   		Feature d is a child of feature a via an operator and. Features e,j, k are other children of feature a via another and operator. Respectively d and e and j and k cannot be mutually exclusive.
							  
noParentFeatureAsChildren : 		["The feature children named {4} cannot contain the parent feature named {3} "]
									Feature a cannot be both parent and child of feature c.
								     
									

						 
