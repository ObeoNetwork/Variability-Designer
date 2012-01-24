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
package fr.inria.exec_derivation.core;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



import org.eclipse.emf.common.util.URI;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;



import com.thales.movida.derivation.Derivation;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import resolutionmodel.FeatureSelection;
import resolutionmodel.ResolutionModel;

import featureDiagram.Feature;
import fr.obeo.dsl.viewpoint.business.api.session.Session;
import fr.obeo.dsl.viewpoint.business.api.session.SessionManager;

/**
 * This class permits to execute product derivation from a given resolution
 * model to obtain a resolved model (product model)
 * 
 * @author mgouyett
 * 
 */
public class ExecDerivation {

	Resource resolvedModelRes;
	
	Resource resolutionModelRes;
	

	
	List<String> excludingExtensions;

	/**
	 * This method permits to execute product derivation
	 * 
	 * 
	 * @resolutionModelPath : the path for the resolution model where user
	 *                      choices (selected or unselected features are stored)
	 * @resolvedModelPath : the path for the feature resolved model
	 */
	public void callProductDerivation( final URI file,final String resolvedModelPath)   {
		
		// Retrieve the URI file in the session
		for (Session s : SessionManager.INSTANCE.getSessions()) {
			for (Resource r : s.getSemanticResources()) {
				if (file.equals(r.getURI())) {
					resolutionModelRes = r;
				}
			} 
		} 
		
		// Retrieve base model URI
		final URI baseModelURI = getBaseModelURI(resolutionModelRes);
		
		
		// Retrieve session
		final Session sess = SessionManager.INSTANCE
		.getSession(resolutionModelRes);
		final TransactionalEditingDomain domain = sess.getTransactionalEditingDomain();
		
		
		
		
		
		 
		 
		 
		domain.getCommandStack().execute(new RecordingCommand(domain)   {

			@Override
			protected void doExecute() {
				
				
				
				// Derive domain model
				resolvedModelRes = Derivation.deriveFeatureDiagram(
						resolutionModelRes,baseModelURI.toString());
				
				
				
				// Save model
				URI uri1 = URI.createURI(resolvedModelPath + "." + baseModelURI.fileExtension());
				Resource copy = domain
						.getResourceSet().createResource(uri1);
				EcoreUtil.Copier copier = new EcoreUtil.Copier();

				for (EObject root : resolvedModelRes.getContents()) {
					copy.getContents().add(copier.copy(root));
				}
				copier.copyReferences();
				try {
					copy.save(Collections.emptyMap());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		
		// We undo the command to not keep some modifications in base model resource
		domain.getCommandStack().undo();
			
		}
	
	
	/** 
	 * Retrieve base model file extension
	 * @param resoutionModelRes : the resource of the resolution model
	 * @result the base model URI
	 * */
	public URI getBaseModelURI(Resource resolutionModelRes) {
		URI baseModelURI = null;
		EObject domainModelElt = null;
		
		ResolutionModel rm = (ResolutionModel) resolutionModelRes.getContents().get(0);
		
			if (rm.getFeatureSelections().size() != 0) {
				boolean stop = true;
				int i = 0;
				
				
				
				// Search the first available Domain Model Element associated with a given feature.
				// This given feature is associated with a given FeatureSelection
				while (stop) {
					FeatureSelection fs = (FeatureSelection) rm.getFeatureSelections().get(i);
					Feature f = fs.getFeature();
					if (f.getModelElements().size() != 0){
						domainModelElt = f.getModelElements().get(0);
						stop = false;
					}
				}
		
				// Retrieve resource from obtained Domain Model Element 
				if (domainModelElt != null) {
					baseModelURI = domainModelElt.eResource().getURI();
				}
			 
			}
			
		
		return baseModelURI;

	}
	
}


