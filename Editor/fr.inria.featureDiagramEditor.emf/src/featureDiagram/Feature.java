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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureDiagram.Feature#getName <em>Name</em>}</li>
 *   <li>{@link featureDiagram.Feature#getOwningFeatureDiagram <em>Owning Feature Diagram</em>}</li>
 *   <li>{@link featureDiagram.Feature#getOperator <em>Operator</em>}</li>
 *   <li>{@link featureDiagram.Feature#isSelected <em>Selected</em>}</li>
 *   <li>{@link featureDiagram.Feature#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link featureDiagram.Feature#getOwningOperator <em>Owning Operator</em>}</li>
 *   <li>{@link featureDiagram.Feature#getModelElements <em>Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureDiagram.FeatureDiagramPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends FeatureElement {
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
	 * @see featureDiagram.FeatureDiagramPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link featureDiagram.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owning Feature Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link featureDiagram.FeatureDiagram#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Feature Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Feature Diagram</em>' container reference.
	 * @see #setOwningFeatureDiagram(FeatureDiagram)
	 * @see featureDiagram.FeatureDiagramPackage#getFeature_OwningFeatureDiagram()
	 * @see featureDiagram.FeatureDiagram#getFeatures
	 * @model opposite="features" transient="false"
	 * @generated
	 */
	FeatureDiagram getOwningFeatureDiagram();

	/**
	 * Sets the value of the '{@link featureDiagram.Feature#getOwningFeatureDiagram <em>Owning Feature Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature Diagram</em>' container reference.
	 * @see #getOwningFeatureDiagram()
	 * @generated
	 */
	void setOwningFeatureDiagram(FeatureDiagram value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference list.
	 * The list contents are of type {@link featureDiagram.Operator}.
	 * It is bidirectional and its opposite is '{@link featureDiagram.Operator#getOwningFeature <em>Owning Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference list.
	 * @see featureDiagram.FeatureDiagramPackage#getFeature_Operator()
	 * @see featureDiagram.Operator#getOwningFeature
	 * @model opposite="owningFeature" containment="true"
	 * @generated
	 */
	EList<Operator> getOperator();

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see featureDiagram.FeatureDiagramPackage#getFeature_Selected()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link featureDiagram.Feature#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link featureDiagram.Attribute}.
	 * It is bidirectional and its opposite is '{@link featureDiagram.Attribute#getOwningFeature <em>Owning Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see featureDiagram.FeatureDiagramPackage#getFeature_Attributes()
	 * @see featureDiagram.Attribute#getOwningFeature
	 * @model opposite="owningFeature" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Owning Operator</b></em>' reference list.
	 * The list contents are of type {@link featureDiagram.Operator}.
	 * It is bidirectional and its opposite is '{@link featureDiagram.Operator#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Operator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Operator</em>' reference list.
	 * @see featureDiagram.FeatureDiagramPackage#getFeature_OwningOperator()
	 * @see featureDiagram.Operator#getFeatures
	 * @model opposite="features"
	 * @generated
	 */
	EList<Operator> getOwningOperator();

	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Elements</em>' reference list.
	 * @see featureDiagram.FeatureDiagramPackage#getFeature_ModelElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getModelElements();

} // Feature
