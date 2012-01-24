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
package fr.inria.product_derivation_engine.sample.wizard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import fr.inria.product_derivation_engine.sample.Activator;



public class SampleProductDerivationWizard extends AbstractExampleWizard  {

	public SampleProductDerivationWizard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(2);
		projects.add(new ProjectDescriptor(Activator.PROJECT_NAME, "zips/fr.inria.product_derivation_engine.tests.zip", "fr.inria.product_derivation_engine.tests"));
		projects.add(new ProjectDescriptor(Activator.PROJECT_NAME, "zips/fr.inria.sampleHouseController.zip", "fr.inria.sampleHouseController"));
		return projects;
		
	}

	

}
