/*******************************************************************************
 * Copyright (c) 2010-2012 Marie Gouyette
 * INRIA-IRISA-Triskell Team 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Marie Gouyette - initial API and implementation
 *     INRIA-IRISA-Triskell Team
 *     Contact: marie.gouyette@gmail.com
 ******************************************************************************/

/** 
 * This project contains the EMF model code of the Feature Diagram metamodel inspired from  the article of Perrouin et al. Reconciling Automation and Flexibility in Product Derivation
	(Software Product Line Conference, 2008 , SPLC’08, 12th Conference)
	This code is generated with the genmodel file.
 * */
package featureDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureDiagram.Operator#getOwningFeature <em>Owning Feature</em>}</li>
 *   <li>{@link featureDiagram.Operator#getFeatures <em>Features</em>}</li>
 *   <li>{@link featureDiagram.Operator#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureDiagram.FeatureDiagramPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends FeatureElement {
	/**
	 * Returns the value of the '<em><b>Owning Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link featureDiagram.Feature#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Feature</em>' container reference.
	 * @see #setOwningFeature(Feature)
	 * @see featureDiagram.FeatureDiagramPackage#getOperator_OwningFeature()
	 * @see featureDiagram.Feature#getOperator
	 * @model opposite="operator" transient="false"
	 * @generated
	 */
	Feature getOwningFeature();

	/**
	 * Sets the value of the '{@link featureDiagram.Operator#getOwningFeature <em>Owning Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature</em>' container reference.
	 * @see #getOwningFeature()
	 * @generated
	 */
	void setOwningFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link featureDiagram.Feature}.
	 * It is bidirectional and its opposite is '{@link featureDiagram.Feature#getOwningOperator <em>Owning Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see featureDiagram.FeatureDiagramPackage#getOperator_Features()
	 * @see featureDiagram.Feature#getOwningOperator
	 * @model opposite="owningOperator" required="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see featureDiagram.FeatureDiagramPackage#getOperator_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link featureDiagram.Operator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Operator
