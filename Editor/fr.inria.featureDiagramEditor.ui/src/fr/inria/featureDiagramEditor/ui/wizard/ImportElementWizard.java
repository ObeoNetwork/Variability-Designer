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

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;


/**  This wizard let user choose what Domain Model Elements he would like to reference in a given feature.*/
public class ImportElementWizard extends Wizard {

	private ImportElementWizardPage1 page1;
	private ImportElementWizardPage2 page2;
	private String pathFile; // The base model file selected by the user
	private List selectedEObject = new ArrayList();
	private EObject rootEObject; // Root of the base model file
	private List eObjects = new ArrayList();
	private boolean canFinish = false;
	
	
	/** Constructor */
	public ImportElementWizard() {
		super();
		this.setForcePreviousAndNextButtons(true);
		this.setNeedsProgressMonitor(true);
		this.setWindowTitle("Add model elements to features");
		this.pathFile ="";
		
		// Add later an image 
		ImageDescriptor image =null;
		try {
			URL url = FileLocator.find(fr.inria.featureDiagramEditor.ui.Activator.getPlugin().getBundle(),new Path("icons/ModelElement.png"), null);
			image = ImageDescriptor.createFromURL(url);
			if (image == null) {
				this.setDefaultPageImageDescriptor(image);
			}
		} catch (Exception e) {}
		
		this.setNeedsProgressMonitor(true);
	}
	
	/* 
	 * The wizard can finish only when the user have selected model elements in the page 2.
	 * */
	/** Determines whether all actions were made by the user in the wizard and if the wizard can finish */
	public boolean canFinish() {
		return canFinish && eObjects != null;	
	}
	
	/** Set the value of the canFinish boolean
	 * @param b: the new value for canFinish */
	public void setCanFinish(boolean b) {
		canFinish = b;
	}
	
	/** Tasks to do before finishing the wizard */
	public boolean performFinish() {
		// Retrieve all objects selected by the user
		for (Object e : eObjects) {
			this.selectedEObject.add(e);
		}
		return true;
	}
	
	/**  Add pages elements in the wizard*/
	public void addPages() {
		page1 = new ImportElementWizardPage1(this,"Select page 1");
		addPage(page1);
		page2 = new ImportElementWizardPage2(this,"Select page 2");
		addPage(page2);
	}
	
	/** Retrieve the base model file selected by the user before adding Domain Model Element from this file */
	public String getPathFile() {
		return pathFile;
	}
	
	/** Set the base model path file selected by the user*/
	public void setPathFile(String path) {
		this.pathFile = path;
	}
	
	/** Update the base model root from the file selected by the user */
	public void setRootEObject(EObject root) {
		rootEObject = root;
	}
	
	/** Changes the tree view in the wizard according to the root */
	public void updateInput(Object root) {
		page2.updateInput(root);
	}
	
	/** Retrieve the base model root (root of the model selected by the user)
	 * @result: the base model root  */
	public EObject getRootEObject() {
		return this.rootEObject;
	}
	
	/**
	 * Store EObject to be imported
	 * @param list: list of Objects to be imported
	 * */
	public void setEObjectsToImport(List list) {
		eObjects = list;
	}
	
	/** Retrieve the list of objects selected by the user
	 * @result : the objects selected by the user */
	public List getSelectedObject () {
		return selectedEObject;
	}
	
	/** Retrieve the list of EObject to import
	 * @result :the list of EObject to import  */
	public List getEObjectsToImport() {
		return eObjects;
	}
	
	

}
