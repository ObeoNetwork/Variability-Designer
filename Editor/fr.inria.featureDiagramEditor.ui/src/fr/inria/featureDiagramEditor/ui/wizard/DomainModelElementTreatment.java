/*******************************************************************************
 * Copyright (c) 2010-2012 Marie Gouyette.
 * INRIA-IRISA- Triskell
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     INRIA-IRISA- Triskell
 *     Marie Gouyette - initial API and implementation
 *     contact marie.gouyette@gmail.com
 ******************************************************************************/
package fr.inria.featureDiagramEditor.ui.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;

import fr.obeo.dsl.viewpoint.business.api.session.Session;
import fr.obeo.dsl.viewpoint.business.api.session.SessionManager;

/**
 * This class defines a method that call a wizard to let user select some Domain Model Elements and then it set a variable defined in the Feature Diagram Editor odesign model
 * to be able to reference these Domain Model Element in the current feature (on which popup menu was activated)and display it in the graphical Feature Diagram Editor.
 *  */
public class DomainModelElementTreatment {
	
	private EObject elementsContainer;
	private ImportElementWizard importElementWizard;
	private WizardDialog wizardDialog;
	private static DomainModelElementTreatment instance = new DomainModelElementTreatment();
	//ADDED TO PREVENT A BUG (Call called two times)
	private boolean canUse;
	
	/** 
	 * Constructor
	 * */
	public DomainModelElementTreatment() {
		this.canUse = true;
	}
	
	/**
	 * This method uses the singleton pattern to return an instance of the DomainModelElementTreatment class.
	 * @return : the instance of the DomainModelElementTreatment class
	 */
	public  static DomainModelElementTreatment getInstance() {
		return instance;
	}
	
	
	/** 
	 * This method permits to reference some Domain Model Elements selected by the user 
	 * through a wizard in the current feature 
	 * (feature on which the popup menu that called this method is executed)
	 * by setting a variable in the FeatureDiagramEditor.odesign model.
	 * @param elementContainer : the EObject (a Feature) on which we want to reference selected Domain Model Elements
	 * */
	public void addDomainModelElement(EObject elementContainer) {
		//ADDED TO PREVENT A BUG (Call called two times)
		if (getCanUse()) {
			
		// Create a new wizard and let user select some Domain Model Elements.
		// These Domain Model Elements will be stored in the selectedElements list.
		ImportElementWizard importElementWizard = new ImportElementWizard();
		 WizardDialog wizardDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),importElementWizard);
			
			 wizardDialog.create();
			 wizardDialog.open(); 
			 List<EObject> selectedElements = new ArrayList();
		    selectedElements = importElementWizard.getSelectedObject();
		
		// Retrieve elementContainer session
		Session session = SessionManager.INSTANCE.getSession(elementContainer);
		
		// The following line create a new variable $wizardReturnedElement used after in the FeatureDiagramEditor.odesign
		// Then, it permits to display the selected elements in the Feature Diagram Editor with the FeatureDiagramEditor.odesign file
		session.getInterpreter().setVariable("wizardReturnedElement",selectedElements);  
		}
	}
	
	/** Retrieve the ImportElementWizard element
	 *@return the ImportElementWizard element */
	public ImportElementWizard getImportElementWizard() {
		return importElementWizard;
	}
	
	
	/** Retrieve the WizardDialog element
	 *@return the  WizardDialog element */
	public  WizardDialog getWizardDialog() {
		return wizardDialog;
	}
	
	// Added to manage a bug (set the value of the boolean canUse)
	public void setCanUse(boolean b) {
		this.canUse = b;
	}
	
	// Added to manage a bug (obtain the value of the boolean canUse)
	public boolean getCanUse() {
		return this.canUse;
	}

}
