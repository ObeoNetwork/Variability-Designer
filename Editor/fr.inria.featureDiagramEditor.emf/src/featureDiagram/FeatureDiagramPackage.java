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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see featureDiagram.FeatureDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface FeatureDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featureDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/featureDiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "featureDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureDiagramPackage eINSTANCE = featureDiagram.impl.FeatureDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link featureDiagram.impl.FeatureElementImpl <em>Feature Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.FeatureElementImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getFeatureElement()
	 * @generated
	 */
	int FEATURE_ELEMENT = 13;

	/**
	 * The number of structural features of the '<em>Feature Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.FeatureDiagramImpl <em>Feature Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.FeatureDiagramImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getFeatureDiagram()
	 * @generated
	 */
	int FEATURE_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Graph Type Tree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__GRAPH_TYPE_TREE = FEATURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__FEATURES = FEATURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__ROOT = FEATURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraint Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__CONSTRAINT_EDGES = FEATURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM_FEATURE_COUNT = FEATURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.FeatureImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = FEATURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Feature Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNING_FEATURE_DIAGRAM = FEATURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OPERATOR = FEATURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SELECTED = FEATURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ATTRIBUTES = FEATURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owning Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNING_OPERATOR = FEATURE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MODEL_ELEMENTS = FEATURE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = FEATURE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.PrimitiveFeatureImpl <em>Primitive Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.PrimitiveFeatureImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getPrimitiveFeature()
	 * @generated
	 */
	int PRIMITIVE_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Owning Feature Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE__OWNING_FEATURE_DIAGRAM = FEATURE__OWNING_FEATURE_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE__OPERATOR = FEATURE__OPERATOR;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE__SELECTED = FEATURE__SELECTED;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE__ATTRIBUTES = FEATURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Owning Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE__OWNING_OPERATOR = FEATURE__OWNING_OPERATOR;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE__MODEL_ELEMENTS = FEATURE__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Primitive Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.ConstraintEdgeImpl <em>Constraint Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.ConstraintEdgeImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getConstraintEdge()
	 * @generated
	 */
	int CONSTRAINT_EDGE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_EDGE__TARGET = FEATURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_EDGE__CONSTRAINT = FEATURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_EDGE__SOURCE = FEATURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_EDGE_FEATURE_COUNT = FEATURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.OperatorImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OWNING_FEATURE = FEATURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__FEATURES = FEATURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__NAME = FEATURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = FEATURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.OptImpl <em>Opt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.OptImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getOpt()
	 * @generated
	 */
	int OPT = 5;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT__OWNING_FEATURE = OPERATOR__OWNING_FEATURE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT__FEATURES = OPERATOR__FEATURES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT__NAME = OPERATOR__NAME;

	/**
	 * The number of structural features of the '<em>Opt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPT_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.MandatoryImpl <em>Mandatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.MandatoryImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getMandatory()
	 * @generated
	 */
	int MANDATORY = 6;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__OWNING_FEATURE = OPERATOR__OWNING_FEATURE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__FEATURES = OPERATOR__FEATURES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__NAME = OPERATOR__NAME;

	/**
	 * The number of structural features of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.OrImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getOr()
	 * @generated
	 */
	int OR = 7;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OWNING_FEATURE = OPERATOR__OWNING_FEATURE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__FEATURES = OPERATOR__FEATURES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__NAME = OPERATOR__NAME;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.AlternativeImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 8;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__OWNING_FEATURE = OPERATOR__OWNING_FEATURE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__FEATURES = OPERATOR__FEATURES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__NAME = OPERATOR__NAME;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.CardImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 9;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__OWNING_FEATURE = OPERATOR__OWNING_FEATURE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__FEATURES = OPERATOR__FEATURES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__NAME = OPERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__MIN = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__MAX = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.ConstraintImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Owning CE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNING_CE = FEATURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = FEATURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.RequireImpl <em>Require</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.RequireImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getRequire()
	 * @generated
	 */
	int REQUIRE = 11;

	/**
	 * The feature id for the '<em><b>Owning CE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__OWNING_CE = CONSTRAINT__OWNING_CE;

	/**
	 * The number of structural features of the '<em>Require</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.MutexImpl <em>Mutex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.MutexImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getMutex()
	 * @generated
	 */
	int MUTEX = 12;

	/**
	 * The feature id for the '<em><b>Owning CE</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTEX__OWNING_CE = CONSTRAINT__OWNING_CE;

	/**
	 * The number of structural features of the '<em>Mutex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTEX_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureDiagram.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureDiagram.impl.AttributeImpl
	 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = FEATURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = FEATURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = FEATURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNING_FEATURE = FEATURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link featureDiagram.FeatureDiagram <em>Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Diagram</em>'.
	 * @see featureDiagram.FeatureDiagram
	 * @generated
	 */
	EClass getFeatureDiagram();

	/**
	 * Returns the meta object for the attribute '{@link featureDiagram.FeatureDiagram#isGraphTypeTree <em>Graph Type Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Type Tree</em>'.
	 * @see featureDiagram.FeatureDiagram#isGraphTypeTree()
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	EAttribute getFeatureDiagram_GraphTypeTree();

	/**
	 * Returns the meta object for the containment reference list '{@link featureDiagram.FeatureDiagram#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see featureDiagram.FeatureDiagram#getFeatures()
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	EReference getFeatureDiagram_Features();

	/**
	 * Returns the meta object for the reference '{@link featureDiagram.FeatureDiagram#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see featureDiagram.FeatureDiagram#getRoot()
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	EReference getFeatureDiagram_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link featureDiagram.FeatureDiagram#getConstraintEdges <em>Constraint Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint Edges</em>'.
	 * @see featureDiagram.FeatureDiagram#getConstraintEdges()
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	EReference getFeatureDiagram_ConstraintEdges();

	/**
	 * Returns the meta object for class '{@link featureDiagram.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see featureDiagram.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link featureDiagram.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see featureDiagram.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the container reference '{@link featureDiagram.Feature#getOwningFeatureDiagram <em>Owning Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Feature Diagram</em>'.
	 * @see featureDiagram.Feature#getOwningFeatureDiagram()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwningFeatureDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link featureDiagram.Feature#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operator</em>'.
	 * @see featureDiagram.Feature#getOperator()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Operator();

	/**
	 * Returns the meta object for the attribute '{@link featureDiagram.Feature#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see featureDiagram.Feature#isSelected()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Selected();

	/**
	 * Returns the meta object for the containment reference list '{@link featureDiagram.Feature#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see featureDiagram.Feature#getAttributes()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link featureDiagram.Feature#getOwningOperator <em>Owning Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owning Operator</em>'.
	 * @see featureDiagram.Feature#getOwningOperator()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwningOperator();

	/**
	 * Returns the meta object for the reference list '{@link featureDiagram.Feature#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Elements</em>'.
	 * @see featureDiagram.Feature#getModelElements()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_ModelElements();

	/**
	 * Returns the meta object for class '{@link featureDiagram.PrimitiveFeature <em>Primitive Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Feature</em>'.
	 * @see featureDiagram.PrimitiveFeature
	 * @generated
	 */
	EClass getPrimitiveFeature();

	/**
	 * Returns the meta object for class '{@link featureDiagram.ConstraintEdge <em>Constraint Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Edge</em>'.
	 * @see featureDiagram.ConstraintEdge
	 * @generated
	 */
	EClass getConstraintEdge();

	/**
	 * Returns the meta object for the reference '{@link featureDiagram.ConstraintEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see featureDiagram.ConstraintEdge#getTarget()
	 * @see #getConstraintEdge()
	 * @generated
	 */
	EReference getConstraintEdge_Target();

	/**
	 * Returns the meta object for the containment reference '{@link featureDiagram.ConstraintEdge#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see featureDiagram.ConstraintEdge#getConstraint()
	 * @see #getConstraintEdge()
	 * @generated
	 */
	EReference getConstraintEdge_Constraint();

	/**
	 * Returns the meta object for the reference '{@link featureDiagram.ConstraintEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see featureDiagram.ConstraintEdge#getSource()
	 * @see #getConstraintEdge()
	 * @generated
	 */
	EReference getConstraintEdge_Source();

	/**
	 * Returns the meta object for class '{@link featureDiagram.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see featureDiagram.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the container reference '{@link featureDiagram.Operator#getOwningFeature <em>Owning Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Feature</em>'.
	 * @see featureDiagram.Operator#getOwningFeature()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_OwningFeature();

	/**
	 * Returns the meta object for the reference list '{@link featureDiagram.Operator#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see featureDiagram.Operator#getFeatures()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Features();

	/**
	 * Returns the meta object for the attribute '{@link featureDiagram.Operator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see featureDiagram.Operator#getName()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Name();

	/**
	 * Returns the meta object for class '{@link featureDiagram.Opt <em>Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opt</em>'.
	 * @see featureDiagram.Opt
	 * @generated
	 */
	EClass getOpt();

	/**
	 * Returns the meta object for class '{@link featureDiagram.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory</em>'.
	 * @see featureDiagram.Mandatory
	 * @generated
	 */
	EClass getMandatory();

	/**
	 * Returns the meta object for class '{@link featureDiagram.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see featureDiagram.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link featureDiagram.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see featureDiagram.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for class '{@link featureDiagram.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see featureDiagram.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the attribute '{@link featureDiagram.Card#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see featureDiagram.Card#getMin()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Min();

	/**
	 * Returns the meta object for the attribute '{@link featureDiagram.Card#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see featureDiagram.Card#getMax()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Max();

	/**
	 * Returns the meta object for class '{@link featureDiagram.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see featureDiagram.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the container reference '{@link featureDiagram.Constraint#getOwningCE <em>Owning CE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning CE</em>'.
	 * @see featureDiagram.Constraint#getOwningCE()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_OwningCE();

	/**
	 * Returns the meta object for class '{@link featureDiagram.Require <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require</em>'.
	 * @see featureDiagram.Require
	 * @generated
	 */
	EClass getRequire();

	/**
	 * Returns the meta object for class '{@link featureDiagram.Mutex <em>Mutex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutex</em>'.
	 * @see featureDiagram.Mutex
	 * @generated
	 */
	EClass getMutex();

	/**
	 * Returns the meta object for class '{@link featureDiagram.FeatureElement <em>Feature Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Element</em>'.
	 * @see featureDiagram.FeatureElement
	 * @generated
	 */
	EClass getFeatureElement();

	/**
	 * Returns the meta object for class '{@link featureDiagram.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see featureDiagram.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link featureDiagram.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see featureDiagram.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link featureDiagram.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see featureDiagram.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link featureDiagram.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see featureDiagram.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the container reference '{@link featureDiagram.Attribute#getOwningFeature <em>Owning Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Feature</em>'.
	 * @see featureDiagram.Attribute#getOwningFeature()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_OwningFeature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeatureDiagramFactory getFeatureDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link featureDiagram.impl.FeatureDiagramImpl <em>Feature Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.FeatureDiagramImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getFeatureDiagram()
		 * @generated
		 */
		EClass FEATURE_DIAGRAM = eINSTANCE.getFeatureDiagram();

		/**
		 * The meta object literal for the '<em><b>Graph Type Tree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_DIAGRAM__GRAPH_TYPE_TREE = eINSTANCE.getFeatureDiagram_GraphTypeTree();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DIAGRAM__FEATURES = eINSTANCE.getFeatureDiagram_Features();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DIAGRAM__ROOT = eINSTANCE.getFeatureDiagram_Root();

		/**
		 * The meta object literal for the '<em><b>Constraint Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DIAGRAM__CONSTRAINT_EDGES = eINSTANCE.getFeatureDiagram_ConstraintEdges();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.FeatureImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Owning Feature Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OWNING_FEATURE_DIAGRAM = eINSTANCE.getFeature_OwningFeatureDiagram();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OPERATOR = eINSTANCE.getFeature_Operator();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SELECTED = eINSTANCE.getFeature_Selected();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ATTRIBUTES = eINSTANCE.getFeature_Attributes();

		/**
		 * The meta object literal for the '<em><b>Owning Operator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OWNING_OPERATOR = eINSTANCE.getFeature_OwningOperator();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__MODEL_ELEMENTS = eINSTANCE.getFeature_ModelElements();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.PrimitiveFeatureImpl <em>Primitive Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.PrimitiveFeatureImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getPrimitiveFeature()
		 * @generated
		 */
		EClass PRIMITIVE_FEATURE = eINSTANCE.getPrimitiveFeature();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.ConstraintEdgeImpl <em>Constraint Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.ConstraintEdgeImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getConstraintEdge()
		 * @generated
		 */
		EClass CONSTRAINT_EDGE = eINSTANCE.getConstraintEdge();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_EDGE__TARGET = eINSTANCE.getConstraintEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_EDGE__CONSTRAINT = eINSTANCE.getConstraintEdge_Constraint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_EDGE__SOURCE = eINSTANCE.getConstraintEdge_Source();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.OperatorImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Owning Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OWNING_FEATURE = eINSTANCE.getOperator_OwningFeature();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__FEATURES = eINSTANCE.getOperator_Features();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__NAME = eINSTANCE.getOperator_Name();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.OptImpl <em>Opt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.OptImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getOpt()
		 * @generated
		 */
		EClass OPT = eINSTANCE.getOpt();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.MandatoryImpl <em>Mandatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.MandatoryImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getMandatory()
		 * @generated
		 */
		EClass MANDATORY = eINSTANCE.getMandatory();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.OrImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.AlternativeImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.CardImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__MIN = eINSTANCE.getCard_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__MAX = eINSTANCE.getCard_Max();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.ConstraintImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Owning CE</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__OWNING_CE = eINSTANCE.getConstraint_OwningCE();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.RequireImpl <em>Require</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.RequireImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getRequire()
		 * @generated
		 */
		EClass REQUIRE = eINSTANCE.getRequire();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.MutexImpl <em>Mutex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.MutexImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getMutex()
		 * @generated
		 */
		EClass MUTEX = eINSTANCE.getMutex();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.FeatureElementImpl <em>Feature Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.FeatureElementImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getFeatureElement()
		 * @generated
		 */
		EClass FEATURE_ELEMENT = eINSTANCE.getFeatureElement();

		/**
		 * The meta object literal for the '{@link featureDiagram.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureDiagram.impl.AttributeImpl
		 * @see featureDiagram.impl.FeatureDiagramPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Owning Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OWNING_FEATURE = eINSTANCE.getAttribute_OwningFeature();

	}

} //FeatureDiagramPackage
