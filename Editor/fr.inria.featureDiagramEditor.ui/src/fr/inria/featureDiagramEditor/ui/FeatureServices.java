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
package fr.inria.featureDiagramEditor.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


/** This class is used as a Java extension in the Feature Diagram Editor viewpoint (in the .odesign file) */
public class FeatureServices {

	/** 
	 * Retrieve the name of a given base model element or the name of its metaclass if the name attribute does not exist.
	 * This name will be displayed by another method.
	 * @param source: the Domain Model Element on which we want the name
	 * @result : the name of the Domain Model Element or the name of its metaclass if the name attribute does not exist
	 * */
	public String getNameIfExist(EObject source) {
		String res = "";
		EStructuralFeature nameFeat = source.eClass().getEStructuralFeature(
				"name");
		if (nameFeat != null) {
			if (source.eGet(nameFeat) != null) {
				res = source.eGet(nameFeat).toString();
			}
			 
		}
		else {
			res = "Metaclass : " + source.eClass().getName();
		}
		return res;
	}

}
