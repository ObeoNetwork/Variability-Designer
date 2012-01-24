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


/**
 *  This plugin contains the EMF resolution model code generated with the genmodel.
 *  */

package resolutionmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see resolutionmodel.ResolutionmodelPackage
 * @generated
 */
public interface ResolutionmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResolutionmodelFactory eINSTANCE = resolutionmodel.impl.ResolutionmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resolution Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolution Model</em>'.
	 * @generated
	 */
	ResolutionModel createResolutionModel();

	/**
	 * Returns a new object of class '<em>Feature Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Selection</em>'.
	 * @generated
	 */
	FeatureSelection createFeatureSelection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResolutionmodelPackage getResolutionmodelPackage();

} //ResolutionmodelFactory
