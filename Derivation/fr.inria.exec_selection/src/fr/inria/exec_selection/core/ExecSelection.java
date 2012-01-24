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
package fr.inria.exec_selection.core;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import resolutionmodel.ResolutionModel;
import resolutionmodel.ResolutionmodelPackage;

import com.thales.movida.derivation.Resolution;

import featureDiagram.FeatureDiagramPackage;


/**
 * This class permit to execute selection engine in order to store user's features choices (selected or not to a resolution model)
 * @author mgouyett
 *
 */
public class ExecSelection {
	
	/**
	 * This method permits to run selection
	 * @
	 */
	public void runSelection(String featureModelPath, String resolutionModelPath) {
		
		// Call product derivation
		 ResourceSet rs = new ResourceSetImpl();
		// Register XML resource factory
		  rs.getPackageRegistry().put(FeatureDiagramPackage.eNS_URI, FeatureDiagramPackage.eINSTANCE);
		  rs.getPackageRegistry().put(ResolutionmodelPackage.eNS_URI, ResolutionmodelPackage.eINSTANCE);
		  URI uri = URI.createDeviceURI(featureModelPath);
		  Resource res= rs.getResource(uri,true);
		  try {
			res.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		  ResolutionModel model = Resolution.deriveFeatureDiagram(res);
			Resource resource = rs.createResource(URI.createDeviceURI(resolutionModelPath));
				// add the root object to the resource
				resource.getContents().add(model);
				try {
					resource.save(null);
				} catch (IOException e) {
					e.printStackTrace();
				}		
		 
	}

}
