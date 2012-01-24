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
 * A representation of the model object '<em><b>Feature Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureDiagram.FeatureDiagram#isGraphTypeTree <em>Graph Type Tree</em>}</li>
 *   <li>{@link featureDiagram.FeatureDiagram#getFeatures <em>Features</em>}</li>
 *   <li>{@link featureDiagram.FeatureDiagram#getRoot <em>Root</em>}</li>
 *   <li>{@link featureDiagram.FeatureDiagram#getConstraintEdges <em>Constraint Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureDiagram.FeatureDiagramPackage#getFeatureDiagram()
 * @model
 * @generated
 */
public interface FeatureDiagram extends FeatureElement {
	/**
	 * Returns the value of the '<em><b>Graph Type Tree</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Type Tree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Type Tree</em>' attribute.
	 * @see #setGraphTypeTree(boolean)
	 * @see featureDiagram.FeatureDiagramPackage#getFeatureDiagram_GraphTypeTree()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isGraphTypeTree();

	/**
	 * Sets the value of the '{@link featureDiagram.FeatureDiagram#isGraphTypeTree <em>Graph Type Tree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Type Tree</em>' attribute.
	 * @see #isGraphTypeTree()
	 * @generated
	 */
	void setGraphTypeTree(boolean value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link featureDiagram.Feature}.
	 * It is bidirectional and its opposite is '{@link featureDiagram.Feature#getOwningFeatureDiagram <em>Owning Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see featureDiagram.FeatureDiagramPackage#getFeatureDiagram_Features()
	 * @see featureDiagram.Feature#getOwningFeatureDiagram
	 * @model opposite="owningFeatureDiagram" containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Feature)
	 * @see featureDiagram.FeatureDiagramPackage#getFeatureDiagram_Root()
	 * @model required="true"
	 * @generated
	 */
	Feature getRoot();

	/**
	 * Sets the value of the '{@link featureDiagram.FeatureDiagram#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Feature value);

	/**
	 * Returns the value of the '<em><b>Constraint Edges</b></em>' containment reference list.
	 * The list contents are of type {@link featureDiagram.ConstraintEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Edges</em>' containment reference list.
	 * @see featureDiagram.FeatureDiagramPackage#getFeatureDiagram_ConstraintEdges()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstraintEdge> getConstraintEdges();

} // FeatureDiagram
