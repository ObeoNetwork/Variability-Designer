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
import featureDiagram._
import resolutionmodel._
import org.eclipse.emf.ecore.EObject
import k2.standard.JavaConversions._
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI


/** In the derivation and selection engine, four models are used:
 *  Base model : the model on which we would like to add some variability
 *  Feature model : the model used to capture variability
 *  Resolution model : the model used to store user choices about the feature model
 *  Resolved model : the model obtained as a result of the derivation engine 
 *  
 *  The selection engine takes into parameters the feature model and create a new resolution model that need later to be edited by the user to store his choices.
 *  */

/** This class permits to create the Resolution model from the Feature model.  */
object Resolution {

	/** Current FeatureSelection element */
	var currentFeatureSelection : FeatureSelection= null
	
	/** Parent Operartor */
	var parentOp : resolutionmodel.Operator= resolutionmodel.Operator.MANDATORY

	/** root for the new resolution model */
	var resolModel : resolutionmodel.ResolutionModel =null
	
		/** Retrieve the selected features on the feature diagram  pathDir : the directory where the feature diagram model is stored*/
	/** pathFeatureModel : the path of the feature model if it is already selected (with UI ...), or "" otherwise */
	/** Result : the path of the new resolutionmodel obtained */
	def deriveFeatureDiagram(pathFDModel : Resource) :ResolutionModel ={
		// Load feature diagram model

	  var fd : featureDiagram.FeatureDiagram = pathFDModel.getContents().get(0).asInstanceOf[featureDiagram.FeatureDiagram]
	  
		//Use selection algorithm on feature diagram
		resolModel = resolutionmodel.ResolutionmodelFactory.eINSTANCE.createResolutionModel()
		resolModel.setFeatureDiagram(fd)
		processFD(fd)
		
		return resolModel
	}
	

	/** This method processes the feature model to create the resolution model
	 * @param e : object in the feature model to process
	 * @result the new resolution model */
	def processFD(e : EObject ):Any={
	  e match {
	    case f : FeatureDiagram =>{
          
	      if (f.isGraphTypeTree() && f.getRoot()!= null){ 
	    	  processFD(f.getRoot())
	     }
	    }
	    case f : Feature =>{
	    		        var featureSelection: FeatureSelection = ResolutionmodelFactory.eINSTANCE.createFeatureSelection()
	    		        featureSelection.setFeature(f)
	    		        featureSelection.setFeatureName(f.getName())
	    		        if (parentOp == resolutionmodel.Operator.MANDATORY)
	    		        	featureSelection.setState(SelectionState.SELECTED)
	    		        else
	    		        	featureSelection.setState(SelectionState.UNSELECTED)
	    		        featureSelection.setOperator(parentOp)	    		        
	    		        if (currentFeatureSelection ==null)
	    		          resolModel.getFeatureSelections().add(featureSelection)
	    		        else
	    		          currentFeatureSelection.getOwningSelection().add(featureSelection)
	    		        
	    		        var oldcurrentFeatureSelection = currentFeatureSelection
	    		        currentFeatureSelection = featureSelection
	    		        f.getOperator().each( op => processFD(op))
	    		        currentFeatureSelection = oldcurrentFeatureSelection
		}
	    case m : featureDiagram.Operator => {
	      	    	m match {
	      	    	  case op : Mandatory => parentOp = resolutionmodel.Operator.MANDATORY
	      	    	  case op : Alternative => parentOp = resolutionmodel.Operator.ALTERNATIVE
	      	    	  case op : Card => parentOp = resolutionmodel.Operator.CARD
	      	    	  case op : Opt => parentOp = resolutionmodel.Operator.OPT
	      	    	  case op : Or => parentOp = resolutionmodel.Operator.OR
	      	    	}
	      	    		m.getFeatures.each(f =>processFD(f))
	    }

	  }
	}
}
