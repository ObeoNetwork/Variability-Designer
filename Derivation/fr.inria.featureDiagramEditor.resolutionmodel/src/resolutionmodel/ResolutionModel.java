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

import featureDiagram.Attribute;
import featureDiagram.FeatureDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link resolutionmodel.ResolutionModel#getVersion <em>Version</em>}</li>
 *   <li>{@link resolutionmodel.ResolutionModel#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link resolutionmodel.ResolutionModel#getFeatureDiagram <em>Feature Diagram</em>}</li>
 *   <li>{@link resolutionmodel.ResolutionModel#getFeatureSelections <em>Feature Selections</em>}</li>
 * </ul>
 * </p>
 *
 * @see resolutionmodel.ResolutionmodelPackage#getResolutionModel()
 * @model
 * @generated
 */
public interface ResolutionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see resolutionmodel.ResolutionmodelPackage#getResolutionModel_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link resolutionmodel.ResolutionModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(Attribute)
	 * @see resolutionmodel.ResolutionmodelPackage#getResolutionModel_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	Attribute getAttributes();

	/**
	 * Sets the value of the '{@link resolutionmodel.ResolutionModel#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Attribute value);

	/**
	 * Returns the value of the '<em><b>Feature Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Diagram</em>' reference.
	 * @see #setFeatureDiagram(FeatureDiagram)
	 * @see resolutionmodel.ResolutionmodelPackage#getResolutionModel_FeatureDiagram()
	 * @model required="true"
	 * @generated
	 */
	FeatureDiagram getFeatureDiagram();

	/**
	 * Sets the value of the '{@link resolutionmodel.ResolutionModel#getFeatureDiagram <em>Feature Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Diagram</em>' reference.
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	void setFeatureDiagram(FeatureDiagram value);

	/**
	 * Returns the value of the '<em><b>Feature Selections</b></em>' containment reference list.
	 * The list contents are of type {@link resolutionmodel.FeatureSelection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Selections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Selections</em>' containment reference list.
	 * @see resolutionmodel.ResolutionmodelPackage#getResolutionModel_FeatureSelections()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureSelection> getFeatureSelections();

} // ResolutionModel
