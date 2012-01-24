/*******************************************************************************
 * Copyright (c) 2010-2012 mgouyett.
 * INRIA-IRISA- Triskell Team
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     mgouyett - initial API and implementation
 * 	INRIA-IRISA- Triskell Team
 * 	contact : marie.gouyette@gmail.com
 ******************************************************************************/
package fr.inria.exec_selection.wizard;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;

public class WizardSelection extends Wizard {
	
	/**
	 * First page wizard to retrieve resolution model file name
	 */
	private WizardSelectionPage1 page1;
	
	/**
	 * The path to the resolution file 
	 */
	private String pathFile;
	
	public WizardSelection () {
		super();
		this.setForcePreviousAndNextButtons(true);
		this.setNeedsProgressMonitor(true);
		this.setWindowTitle("Add model elements to features");
		this.pathFile ="";
		
		// We can add later an imahe
		
		this.setNeedsProgressMonitor(true);
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

}
