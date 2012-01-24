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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureDiagram.ConstraintEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link featureDiagram.ConstraintEdge#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link featureDiagram.ConstraintEdge#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureDiagram.FeatureDiagramPackage#getConstraintEdge()
 * @model
 * @generated
 */
public interface ConstraintEdge extends FeatureElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Feature)
	 * @see featureDiagram.FeatureDiagramPackage#getConstraintEdge_Target()
	 * @model
	 * @generated
	 */
	Feature getTarget();

	/**
	 * Sets the value of the '{@link featureDiagram.ConstraintEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Feature value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link featureDiagram.Constraint#getOwningCE <em>Owning CE</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(Constraint)
	 * @see featureDiagram.FeatureDiagramPackage#getConstraintEdge_Constraint()
	 * @see featureDiagram.Constraint#getOwningCE
	 * @model opposite="owningCE" containment="true"
	 * @generated
	 */
	Constraint getConstraint();

	/**
	 * Sets the value of the '{@link featureDiagram.ConstraintEdge#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Feature)
	 * @see featureDiagram.FeatureDiagramPackage#getConstraintEdge_Source()
	 * @model
	 * @generated
	 */
	Feature getSource();

	/**
	 * Sets the value of the '{@link featureDiagram.ConstraintEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Feature value);

} // ConstraintEdge
