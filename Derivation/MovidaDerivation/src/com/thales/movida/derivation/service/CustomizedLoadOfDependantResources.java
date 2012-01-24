/*******************************************************************************
 * Copyright (c) 2010-2012 mgouyett
 * INRIA-IRISA- Triskell Team
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   Olivier Barais
 *     Marie Gouyette - initial API and implementation
 * 	INRIA-IRISA- Triskell Team
 * 	contact :	 olivier.barais@irisa.fr
 * 				 marie.gouyette@gmail.com
 ******************************************************************************/



package com.thales.movida.derivation.service;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;

/** This interface could be implemented to give a customized load of the dependant resources of a given resource. */
public interface CustomizedLoadOfDependantResources {

	/** According to a given resource, retrieve all of the dependencies for this resource.
	 * @param r : we search the resource dependencies for this resource
	 * @result the resource dependencies of the resource r
	 *  */
	Collection<Resource> getDependantResource(Resource r);
	
}
