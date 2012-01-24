/*******************************************************************************
 * Copyright (c) 2007-2012 Marie Gouyette.
 * INRIA-IRISA/Univiersite Rennes 1 Triskell
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     INRIA-IRISA- Triskell
 *     Cyril Faucher <cfaucher@irisa.fr> 
 * 	   dvojtise <dvojtise.irisa.fr>
 *     Marie Gouyette 
 *      - initial API and implementation
 *     contact marie.gouyette@gmail.com
 ******************************************************************************/

/** 
 * This wizard permits to extract the example and test project fr.inria.featureDiagramEditor.praxisConstraints.tests in the user workspace.
 * */

package fr.inria.featurediagrameditor.sample.wizard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import fr.inria.featurediagrameditor.sample.Activator;


public class FDSampleExampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		
		System.out.println("Debug - enter in the wizard");
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor(Activator.PROJECT_NAME, "zips/fr.inria.featureDiagramEditor.praxisConstraints.tests.zip", "fr.inria.featureDiagramEditor.praxisConstraints.tests"));
		return projects;
	}
}
