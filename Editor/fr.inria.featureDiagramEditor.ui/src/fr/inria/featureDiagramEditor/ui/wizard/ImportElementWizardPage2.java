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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import featureDiagram.Feature;
import featureDiagram.FeatureDiagram;
import featureDiagram.FeatureDiagramFactory;



/** This second page of the wizard contains a tree viewer to be able to select some elements in the loaded base model  */
public class ImportElementWizardPage2  extends WizardPage implements IWizardPage, ISelectionChangedListener {

	
	private ImportElementWizard wizard;
	private TreeViewer treeViewer;
	
	/** Constructor */
	protected ImportElementWizardPage2(ImportElementWizard wizard, String pageName) {
		super(pageName);
		this.wizard = wizard;
		setTitle("Import Domain Model Element to features");
		setDescription("This wizard imports domain model elements from a file.");
		// TODO Auto-generated constructor stub
	}


	/** Creates the wizard
	 * @param parent: the parent for the wizard */
	public void createControl(Composite parent) {
		Composite controls = new Composite(parent, SWT.NULL);
		controls.setLayout(new GridLayout());
		controls.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));
		
		Composite panel = new Composite(controls, SWT.NONE);
		panel.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		panel.setLayout(layout);
		
		Label label = new Label (panel, SWT.NONE);
		label.setText("Select model elements to add in the features");
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
		
		treeViewer = new TreeViewer(panel, SWT.MULTI |SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = 200;
		layoutData.widthHint = 300;
		treeViewer.getTree().setLayoutData(layoutData);
		treeViewer.setContentProvider(new ModelElementContentProvider(panel));
		treeViewer.setLabelProvider(new ModelElementLabelProvider());
		treeViewer.addSelectionChangedListener(this);
		this.setControl(controls);
	}
	
	/**
	 * Update the treeViewer's input with the given root
	 * @param root : the root used as input of the tree viewer
	 */
	public void updateInput(Object root) {
		treeViewer.setInput(root);
		treeViewer.expandAll();
	}


	/** 
	 * Determines whether the user has made his selection and validate the page if it is the case.
	 * @param event: event that expresses that selection has changed
	 * */
	public void selectionChanged(SelectionChangedEvent event) {
		if (event.getSelection() instanceof IStructuredSelection){
			IStructuredSelection selection = (IStructuredSelection) event.getSelection();
			if (selection.size() >= 0) {
				this.wizard.setEObjectsToImport(selection.toList());
				this.setPageComplete(validatePage(true));
			}
			else {
				this.setPageComplete(validatePage(false));
			}
		}
		else {
			this.setPageComplete(validatePage(false));
		}	
	}
	
	// Method used to validate page
	private boolean validatePage(boolean b){
		if (!b) { // The page is not ever validate, we need to remove imported objects
			this.wizard.setEObjectsToImport(null);
		}
		this.wizard.setCanFinish(b);
		return b;
	}
	
	/** This class permits to manage the Base model contents */
	class ModelElementContentProvider implements ITreeContentProvider {
		
		/**Constructor */
		public ModelElementContentProvider(Composite Parent) {
		}

		/** Retreive the children of a given Model Element
		 * @param parentElement : the parentElement where children are searched
		 * @result: the tabular with all of the children of this parentElement  */
		public Object[] getChildren(Object parentElement) {
			EObject parent = (EObject) parentElement;
			ArrayList proposedElements = new ArrayList();
			
			
			for (EObject o : parent.eContents()) {
				proposedElements.add(o);
			}
			return proposedElements.toArray();
		}

	
		// Retrieve the parent of a given element
		public Object getParent(Object element) {
			// TODO Auto-generated method stub
			return null;
		}

	
		/** 
		 * Determines whether a given element has a children
		 * @param element: the element to test
		 * @result: true if the elements has children, false otherwise
		 * */
		public boolean hasChildren(Object element) {
			EObject parent = (EObject) element;
			ArrayList children = new ArrayList();
			for (EObject o : parent.eContents()) {
				children.add(o);
			}
			return children.size() > 0;
		}

		/**Retrieve elements contained in a given model element
		 * @param inputElement: the object on which we would like to obtain the contained elements
		 * @result: the tabular with all of the objects contained by inputElement
		 *  */
		public Object[] getElements(Object inputElement) {
			EObject root = wizard.getRootEObject();
			if (inputElement == null) {
				return null;
			}
			else {
			Object [] children = getChildren(inputElement);
			return children;
			}
		}

	
		public void dispose() {
			// TODO Auto-generated method stub
			
		}

	
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	/** This class permit to give a label for the Domain Model Elements in the tree view editor */
	class ModelElementLabelProvider extends LabelProvider {
		
		/** Obtain a text from a given object formed with MetaclassName ObjectName if an attribute name exists for the object and only with the MetaclassName otherwise
		 * @param : the object to use
		 * @result : a String formed with MetaclassName ObjectName if an attribute name exists for the object and only with the MetaclassName otherwise */
		public String getText(Object obj) {
			EObject element = (EObject) obj;
			String label = element.eClass().getName();
			if (retrieveName(element) != "") {
				label += " " + retrieveName(element);
			}
			return label;
		}
		
		
		/**
		 * Retrieve the name of a given object if an attribute name exists or return an empty string otherwise
		 * @param obj: the object on which we search the name
		 * @result : the name of the object or an empty String if the name attribute does not exist in this object
		 *  */
		public String retrieveName(EObject obj) {
				String name ="";
				
			for (EAttribute attribute : obj.eClass().getEAllAttributes()) {
				if (attribute.getName().equals("name")) {
					name = (String) obj.eGet(attribute);
				}
			}
			return name;
		}
		
		
		
	}

}
