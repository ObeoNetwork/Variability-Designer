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

import featureDiagram.Feature;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link resolutionmodel.FeatureSelection#getState <em>State</em>}</li>
 *   <li>{@link resolutionmodel.FeatureSelection#getFeature <em>Feature</em>}</li>
 *   <li>{@link resolutionmodel.FeatureSelection#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link resolutionmodel.FeatureSelection#getOwningSelection <em>Owning Selection</em>}</li>
 *   <li>{@link resolutionmodel.FeatureSelection#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see resolutionmodel.ResolutionmodelPackage#getFeatureSelection()
 * @model
 * @generated
 */
public interface FeatureSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link resolutionmodel.SelectionState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see resolutionmodel.SelectionState
	 * @see #setState(SelectionState)
	 * @see resolutionmodel.ResolutionmodelPackage#getFeatureSelection_State()
	 * @model required="true"
	 * @generated
	 */
	SelectionState getState();

	/**
	 * Sets the value of the '{@link resolutionmodel.FeatureSelection#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see resolutionmodel.SelectionState
	 * @see #getState()
	 * @generated
	 */
	void setState(SelectionState value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(Feature)
	 * @see resolutionmodel.ResolutionmodelPackage#getFeatureSelection_Feature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link resolutionmodel.FeatureSelection#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see resolutionmodel.ResolutionmodelPackage#getFeatureSelection_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link resolutionmodel.FeatureSelection#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Owning Selection</b></em>' containment reference list.
	 * The list contents are of type {@link resolutionmodel.FeatureSelection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Selection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Selection</em>' containment reference list.
	 * @see resolutionmodel.ResolutionmodelPackage#getFeatureSelection_OwningSelection()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureSelection> getOwningSelection();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link resolutionmodel.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see resolutionmodel.Operator
	 * @see #setOperator(Operator)
	 * @see resolutionmodel.ResolutionmodelPackage#getFeatureSelection_Operator()
	 * @model
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link resolutionmodel.FeatureSelection#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see resolutionmodel.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // FeatureSelection
