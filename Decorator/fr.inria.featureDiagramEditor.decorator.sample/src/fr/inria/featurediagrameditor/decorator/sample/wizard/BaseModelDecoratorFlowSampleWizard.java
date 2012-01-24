/*******************************************************************************
 * Copyright (c) 2010-2012  mgouyett.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Marie Gouyette - initial API and implementation
 *      contact marie.gouyette@gmail.com
 ******************************************************************************/
package fr.inria.featurediagrameditor.decorator.sample.wizard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import fr.inria.featurediagrameditor.decorator.sample.Activator;
import fr.inria.featurediagrameditor.decorator.sample.wizard.AbstractExampleWizard.ProjectDescriptor;

/** This plugin is able to deploy the flow model demonstration into the user workspace */
public class BaseModelDecoratorFlowSampleWizard extends AbstractExampleWizard{

	@Override
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		System.out.println("Debug - enter in the wizard");
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor(Activator.PROJECT_NAME, "zips/fr.inria.featureDiagramEditor.flow.demo.zip", "fr.inria.featureDiagramEditor.flow.demo"));
		return projects;
	}

}
