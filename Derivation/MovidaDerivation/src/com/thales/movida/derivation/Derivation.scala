/*******************************************************************************
 * Copyright (c) 2010-2012 mgouyett
 * INRIA-IRISA- Triskell Team
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   Olivier Barais
 *     Marie Gouyette - initial API and implementation
 * 	INRIA-IRISA- Triskell Team
 * 	contact :	 olivier.barais@irisa.fr
 * 				 marie.gouyette@gmail.com
 ******************************************************************************/


package com.thales.movida.derivation
import org.eclipse.emf.ecore.resource.Resource
import featureDiagram.Feature
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore._
import org.eclipse.emf.ecore.resource.ResourceSet
import k2.standard.JavaConversions._
import resolutionmodel.SelectionState
import k2.io.StdIO
import resolutionmodel._
import org.eclipse.emf.ecore.util.EcoreUtil
import com.thales.movida.derivation.service.SemanticDeleteOfObject
import scala.reflect.BeanProperty
import com.thales.movida.derivation.service.CustomizedLoadOfDependantResources

/** In the derivation and selection engine, four models are used:
 *  Base model : the model on which we would like to add some variability
 *  Feature model : the model used to capture variability
 *  Resolution model : the model used to store user choices about the feature model
 *  Resolved model : the model obtained as a result of the derivation engine 
 *  
 *  The derivation engine takes into parameters the Resolution model obtained with 
 *  the selection engine and gives the Resolved model  as a result. In this version, we can associate only one base model to the feature model
 *  */

/** This class permits to derive the Resolution model to obtain the Resolved model.  */
object Derivation {

	/** Object used to express the deletion semantics used */
	@BeanProperty
	var semanticDelete : SemanticDeleteOfObject=null
 
	/** This object permits to use a customized load of dependant resources. */
	@BeanProperty
	var customizedLoad : CustomizedLoadOfDependantResources=null
  
  /** Used to be able to display message for log */
  var stdio: _root_.k2.io.StdIOClass = new _root_.k2.io.StdIOClass()
	
  /** List of unselected features */
  var notselected: java.util.List[Feature] = new java.util.ArrayList[Feature]()
  
  /** Resource for the base model */
  var domainResource: Resource = _
  
  /** List of objects to remove */
  var toRemove: java.util.List[EObject] = new java.util.ArrayList[EObject]()

  
  /** 
   * Derive a base model from a given resolution model resource
   * @param resolmodel : resource that contains the reolution model used for this derivation
   * @param baseModelURI : the base model extension (could be .* if we want to derive any extension)
   * */
  def deriveFeatureDiagram(resolmodel: Resource,baseModelURI : String): Resource = {
	// Retreive resolution model root
    val rm: ResolutionModel = resolmodel.getContents().get(0).asInstanceOf[ResolutionModel]
    
    // Obtain the whole FeatureSelection in the list featureSelections
    var featureSelections: java.util.List[resolutionmodel.FeatureSelection] = new java.util.ArrayList[resolutionmodel.FeatureSelection]
    featureSelections.addAll(rm.getFeatureSelections())
    rm.getFeatureSelections().each(e => this.getAllFeatureSelection(e, featureSelections));

    // Create a notselected list with all of the unselected feature
    notselected.addAll(featureSelections.select(f => { f.getState() == SelectionState.UNSELECTED }).collect(f1 => f1.getFeature))
    
    
    if (this.customizedLoad==null){ // In this case we have no special load
    	// Debug
    	stdio.writeln("Read resource")
    //
    	EcoreUtil.resolveAll(resolmodel)
    	EcoreUtil.resolveAll(resolmodel.getResourceSet())
    	
    	
    	// Debug
    	resolmodel.getResourceSet().getResources.each( e =>  stdio.writeln(" Resource " + e.getURI().toString() ))
    	// End debug
    
    	// Select the base model resource and store it into domainResource
	    domainResource = resolmodel.getResourceSet().getResources.select(e =>
	      (selectionCriteria (e , baseModelURI ) )).first
	      
	      

    }else{ // Special load of dependant resources
    	// Select the base model resource and store it into domainResource
    	domainResource = customizedLoad.getDependantResource(resolmodel).select(e =>
	      (selectionCriteria (e , baseModelURI) )).first    	
    
    }
    
    // Call removeObject method on base model root
    var root: EObject = domainResource.getContents().get(0)

    this.removeObject(root)

    
    
    if (semanticDelete == null){
    	stdio.writeln("call fix references")
    	// Deletion semantics is not defined by default we fix the references for the root object
    	this.fixReference(root)
    }

    //call to remove
    stdio.writeln("Remove object from resources")
    if (semanticDelete == null)
    	  // Use default Ecore deletion
          toRemove.each(o =>EcoreUtil.delete(o))
    else 
    	// use specific deletion
        toRemove.each(o =>semanticDelete.delete(o)) 
      
    return domainResource

  }


  /** Retrieve all of FeatureSelection children of a given FeatureSelection
   * @param select: a given FeatureSelection
   * @param selection : a list of feature selection to update */
  def getAllFeatureSelection(select: resolutionmodel.FeatureSelection, selection: java.util.List[resolutionmodel.FeatureSelection]) {
    selection.addAll(select.getOwningSelection)
    select.getOwningSelection.each(f => getAllFeatureSelection(f, selection))

  }
  
 
  
  /** Determines whether a resource can be selected as the base model resource 
   * @param e : resource to test
   * @param baseModelURI : the URI for the searched base model
   * @result : true if the resource corresponds to the baseModelURI, false otherwise. */
  def selectionCriteria (e : Resource, baseModelURI : String) : Boolean = {
    var res : Boolean = false
    
     if (baseModelURI.equals(".*")){ // Derivation on any kind of model, search the first resource that not have the excluding extensions
    	res =  (e.getURI() != null  && e.getURI().toString() != null ) 
    }
    else { // Derivation for a special extension, search the first resource with this given extension
    	res = e.getURI().toString() != null    && e.getURI().toString().equals(baseModelURI) 
      
    }
    
    return res
  }
  

  /** Update references for a given object to unset removed elements on it
   * @param : the object where references will be updated
   * @result : the new obtained object
   * */
  def fixReference(obj: EObject): Any = {
    if (obj != null) {
      // Add all containment properties of the object in a list
      var props: java.util.List[_ >: EStructuralFeature] = new java.util.ArrayList[EStructuralFeature]
      props.addAll(
        obj.eClass().getEAllReferences().select(prop => { prop.isContainment().booleanValue() }))
        
        // Fix references on each of these properties
      props.each(prop => {
        var o = obj.eGet(prop.asInstanceOf[EStructuralFeature], true)
        if (prop.asInstanceOf[EStructuralFeature].isMany) {
          var col: java.util.Collection[_ >: EObject] = o.asInstanceOf[java.util.Collection[_ >: EObject]]
          col.each(o1 => {
            //if (domainResource.getContents().contains(o1)) {
            this.fixReference(o1.asInstanceOf[EObject])
            //	    }
          })
        } else {
          //if (domainResource.getContents.contains(o))
          fixReference(o.asInstanceOf[EObject])
        }
      })

      // We do not take into account derived or transient properties
      props = obj.eClass().getEAllStructuralFeatures().select(prop => !prop.isDerived() && ! prop.isTransient())
      
      
      props.each(prop => {
        // Retreive value for the property
        var o = obj.eGet(prop.asInstanceOf[EStructuralFeature], true)
        
        // if the value is a collection
        if (prop.asInstanceOf[EStructuralFeature].isMany) {
          var col: java.util.List[_ >: EObject] = null
          col = o.asInstanceOf[java.util.List[_ >: EObject]]
          
          if (col != null) {
            var colleToRemove: java.util.List[_ >: EObject] = new java.util.ArrayList[EObject]
            
            // If the collection contains an object that need to be removed, this element is removed from the list
            col.each(o1 => {
              if (toRemove.exists(objtoremove => objtoremove.equals(o1))) {
                colleToRemove.add(o1.asInstanceOf[EObject])
              }
            })
            colleToRemove.each(element => col.remove(element))
            //else
            //	stdio.writeln("col est nulle " + o.toString)
          }
          
        } else { // The value is only one object
          // If the value is contained in the list of objects to remove, this value of the property is set to null
          if (toRemove.exists(objtoremove => { objtoremove.equals(o) })) {
            obj.eSet(prop.asInstanceOf[EStructuralFeature], null)
          }
        }
      })
    }
  }

  
  /** Determines whether an object is not selected according to the Resolution model
   *  @param obj : to Object to test
   *  @result : true if the object is not selected, false otherwise
   *  */
  def isNotSelected(obj: EObject): Boolean = {
    notselected.each(f =>
      {
        if (f.getModelElements.exists(ob1 =>
          {
        	  ob1 == obj
          })){
          return true
        }
      })
    return false

  }

  
  /** Add the object and all of its containing in the toRemove list (before removing the objects from this list)
   *  if the object is not selected
   *  obj : the object to test
   *  */
  def removeObject(obj: EObject) {
//    stdio.writeln("removeObject begin : " + obj.toString())
    
    // If the object is not selected remove it and all of its containing if the deletion semantics is not defined
    if (this.isNotSelected(obj)) {
      if (this.semanticDelete == null)
    	  this.removeObjectandAllContaining(obj.asInstanceOf[EObject])
      else
    	  toRemove.add(obj)
    	  
    	  
    } else { // call the removeObject method on each element contained by this object
      var props: java.util.List[EReference] = obj.eClass.getEAllReferences().select(prop => prop.isContainment())
      props.each(prop => {
        var o: Object = obj.eGet(prop, true)
        if (prop.isMany) {
          var col: java.util.List[_ >: EObject] = o.asInstanceOf[java.util.List[_ >: EObject]]
          if (col	 != null) {
            col.each(o1 =>
              //if (domainResource.getContents.contains(o1)){ 
              this.removeObject(o1.asInstanceOf[EObject]) //}
              )
          }
        } else {
          //				if (  domainResource.getContents.contains(o)){
          if (o.isInstanceOf[EObject])
            this.removeObject(o.asInstanceOf[EObject])
          //else
           // println("bizarre for "+ prop.getName() + " " + o)
          //				}
        }
      })

    }

  }

  /** This method is used to remove an object and all of its containing 
   * @param obj : the object to remove */
  def removeObjectandAllContaining(obj: EObject) {
    var props: java.util.List[EReference] = null
    if (obj != null) {
      
      // Retrieve all containment properties in a list
      props = obj.eClass().getEAllReferences().select(prop => { prop.isContainment() })
    
      // For each prop call removeObjectandAllContaining in the value elements
      props.each(prop => {
        var o: Object = obj.eGet(prop, true)
        if (prop.isMany()) {
          var col: java.util.List[EObject] = o.asInstanceOf[java.util.List[EObject]]
          if (col != null) {
            col.each(o1 =>
              this.removeObjectandAllContaining(o1))
          }
        } else {
          this.removeObjectandAllContaining(o.asInstanceOf[EObject])
        }

      })
      if (obj.eResource()== domainResource) {
    	  //stdio.writeln("remove from resource" + obj.toString)
    	  toRemove.add(obj)
      } else {
        stdio.writeln("removeObjectandAllContaining : Object " + obj.toString() + " not contained")
      }
    }
  }

}