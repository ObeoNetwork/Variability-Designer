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
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureDiagram.Constraint#getOwningCE <em>Owning CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureDiagram.FeatureDiagramPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends FeatureElement {
	/**
	 * Returns the value of the '<em><b>Owning CE</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link featureDiagram.ConstraintEdge#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning CE</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning CE</em>' container reference.
	 * @see #setOwningCE(ConstraintEdge)
	 * @see featureDiagram.FeatureDiagramPackage#getConstraint_OwningCE()
	 * @see featureDiagram.ConstraintEdge#getConstraint
	 * @model opposite="constraint" transient="false"
	 * @generated
	 */
	ConstraintEdge getOwningCE();

	/**
	 * Sets the value of the '{@link featureDiagram.Constraint#getOwningCE <em>Owning CE</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning CE</em>' container reference.
	 * @see #getOwningCE()
	 * @generated
	 */
	void setOwningCE(ConstraintEdge value);

} // Constraint
