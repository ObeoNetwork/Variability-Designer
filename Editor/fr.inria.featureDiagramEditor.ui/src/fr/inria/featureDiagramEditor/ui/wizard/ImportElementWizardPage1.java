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

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.core.resources.ResourcesPlugin; 
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;

import featureDiagram.FeatureDiagramFactory;


/** This class defines the first page of the wizard that permits to select the base model file. */
public class ImportElementWizardPage1 extends WizardPage  {

	private ImportElementWizard wizard;
	private String pathFile; // The path to the selected file
	
	
	/** Constructor */
	protected ImportElementWizardPage1(ImportElementWizard wizard, String pageName) {
		super(pageName);
		this.wizard = wizard;
		setTitle("Import EObject element");
		setDescription("Choose the model on which you want to import elements.");
		this.pathFile ="";
		
	}

	/** Creates the wizard
	 * @param parent: the parent for the wizard */
	public void createControl(Composite parent) {
		Composite controls = new Composite(parent, SWT.NULL);
		controls.setLayout(new GridLayout());
		
		Composite panel = new Composite(controls, SWT.NONE);
		panel.setLayoutData(new GridData(GridData.FILL_BOTH)); 
		GridLayout layout = new GridLayout();
		panel.setLayout(layout);
		
		// Create a label : Select a model file
		Label label = new Label(panel, SWT.NONE);
		label.setText("Select a model file");
		label.setLayoutData(new GridData(SWT.BEGINNING));
		
		// Choose a file
		final Text path = new Text(panel,SWT.SINGLE | SWT.BORDER );
		path.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		path.setEditable(true);
		
		// Add a button to select the file
		Button button = new Button (panel, SWT.BEGINNING);
		button.setText("Browse File System");
		button.setVisible(true);
		button.setLayoutData(new GridData(SWT.END));
		final Shell shell = new Shell();
		
		class OpenFile implements SelectionListener{
			
		
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void widgetSelected(SelectionEvent e) {
				// Retrieve path file according to the user's choices
				FileDialog fd = new FileDialog(shell, SWT.OPEN);
		        fd.setText("Open");
		       fd.setFilterPath("/");
		        String[] filterExt = {};
		        fd.setFilterExtensions(filterExt);
		        pathFile = fd.open();
		        
		        // Display the selected path in the wizard and validate this page
		        path.setText(pathFile);
		        wizard.setPathFile(pathFile);
		        setPageComplete(validatePage(pathFile));
			}
			
		}
		button.addSelectionListener(new OpenFile());
		
		// Add button to select directly on workspace
		Button buttonWorkspace = new Button (panel, SWT.CENTER);
		buttonWorkspace.setText("Browse workspace");
		buttonWorkspace.setVisible(true);
		buttonWorkspace.setLayoutData(new GridData(SWT.END));
		final Shell shell2 = new Shell();
	
		
		class OpenWorkspaceFile implements SelectionListener{
			
		
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void widgetSelected(SelectionEvent e) {
				// Retrieve path file according to the user's choices
				FileDialog fd = new FileDialog(shell2, SWT.OPEN);
		        fd.setText("Open");
		        fd.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
		        String[] filterExt = {};
		        fd.setFilterExtensions(filterExt);
		        pathFile = fd.open();
		        
		        // Display the selected path in the wizard and validate this page
		        path.setText(pathFile);
		        wizard.setPathFile(pathFile);
		        setPageComplete(validatePage(pathFile));
			}
			
		}
		buttonWorkspace.addSelectionListener(new OpenWorkspaceFile());
		
		
		// The wizard can finish only when elements are selected on page2
		this.wizard.setCanFinish(false);
		setControl(controls);
	}

	/** Retrieve pathFile selected by the user
	 * @result : the path of the file selected by the user */
	public String getPathFile() {
		return pathFile;
	}
	
	/** This method is used to validate the page. It loads the file selected by the user. 
	 * @param pathFile : the file path selected by the user
	 * @result : true if the file is successfully loaded, false otherwise.*/
	private boolean validatePage(String pathFile) {
		// This method load the selected file
		
		
		// Reinitialize all
		this.wizard.setRootEObject(null);
		this.wizard.setEObjectsToImport(null);
		this.setErrorMessage(null);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
	       ("*",
	        new XMIResourceFactoryImpl() 
	        {
	          public Resource createResource(URI uri)
	          {
	            XMIResource xmiResource = new XMIResourceImpl(uri);
	            return xmiResource;
	          }
	        });

		// Load file from path
		
		
		File file = new File(pathFile);
		if (file == null) {
			return false;
		}
		else {
			try {
				// Create resource
				ResourceSet rs = new ResourceSetImpl();
				
				// Register XML resource factory
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, 
				new XMIResourceFactoryImpl());
				
				// File URI
				URI fileURI = URI.createFileURI(file.getAbsolutePath());
				// Load resource
				Resource r = rs.getResource(fileURI, true);
				EObject root = (EObject) r.getContents().get(0);
				if (root != null) {
				this.wizard.setRootEObject(root);
				this.wizard.updateInput(root);
				
				return true;
			}
			}
		catch (Exception e) {
			this.setErrorMessage("Unable to load this file. Please try again.");
		} 
		}
		return false;
	}
	
	


}

