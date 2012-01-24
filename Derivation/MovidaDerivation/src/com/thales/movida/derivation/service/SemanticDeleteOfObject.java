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

import org.eclipse.emf.ecore.EObject;

/** This interface can be customized to provide a specific deletion semantics. */
public interface SemanticDeleteOfObject {
	
	
	/** This method defines what objects should be deleted with the deletion of a given object.
	 * @param o : object to delete */
	public void delete(EObject o );
	
	
}
