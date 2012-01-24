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

package resolutionmodel.impl;

import featureDiagram.FeatureDiagramPackage;

import featureDiagram.impl.FeatureDiagramPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import resolutionmodel.FeatureSelection;
import resolutionmodel.Operator;
import resolutionmodel.ResolutionModel;
import resolutionmodel.ResolutionmodelFactory;
import resolutionmodel.ResolutionmodelPackage;
import resolutionmodel.SelectionState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResolutionmodelPackageImpl extends EPackageImpl implements ResolutionmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selectionStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see resolutionmodel.ResolutionmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResolutionmodelPackageImpl() {
		super(eNS_URI, ResolutionmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ResolutionmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResolutionmodelPackage init() {
		if (isInited) return (ResolutionmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ResolutionmodelPackage.eNS_URI);

		// Obtain or create and register package
		ResolutionmodelPackageImpl theResolutionmodelPackage = (ResolutionmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResolutionmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResolutionmodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FeatureDiagramPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theResolutionmodelPackage.createPackageContents();

		// Initialize created meta-data
		theResolutionmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResolutionmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResolutionmodelPackage.eNS_URI, theResolutionmodelPackage);
		return theResolutionmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionModel() {
		return resolutionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolutionModel_Version() {
		return (EAttribute)resolutionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolutionModel_Attributes() {
		return (EReference)resolutionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolutionModel_FeatureDiagram() {
		return (EReference)resolutionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolutionModel_FeatureSelections() {
		return (EReference)resolutionModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSelection() {
		return featureSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSelection_State() {
		return (EAttribute)featureSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureSelection_Feature() {
		return (EReference)featureSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSelection_FeatureName() {
		return (EAttribute)featureSelectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureSelection_OwningSelection() {
		return (EReference)featureSelectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSelection_Operator() {
		return (EAttribute)featureSelectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSelectionState() {
		return selectionStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionmodelFactory getResolutionmodelFactory() {
		return (ResolutionmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resolutionModelEClass = createEClass(RESOLUTION_MODEL);
		createEAttribute(resolutionModelEClass, RESOLUTION_MODEL__VERSION);
		createEReference(resolutionModelEClass, RESOLUTION_MODEL__ATTRIBUTES);
		createEReference(resolutionModelEClass, RESOLUTION_MODEL__FEATURE_DIAGRAM);
		createEReference(resolutionModelEClass, RESOLUTION_MODEL__FEATURE_SELECTIONS);

		featureSelectionEClass = createEClass(FEATURE_SELECTION);
		createEAttribute(featureSelectionEClass, FEATURE_SELECTION__STATE);
		createEReference(featureSelectionEClass, FEATURE_SELECTION__FEATURE);
		createEAttribute(featureSelectionEClass, FEATURE_SELECTION__FEATURE_NAME);
		createEReference(featureSelectionEClass, FEATURE_SELECTION__OWNING_SELECTION);
		createEAttribute(featureSelectionEClass, FEATURE_SELECTION__OPERATOR);

		// Create enums
		selectionStateEEnum = createEEnum(SELECTION_STATE);
		operatorEEnum = createEEnum(OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FeatureDiagramPackage theFeatureDiagramPackage = (FeatureDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(FeatureDiagramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(resolutionModelEClass, ResolutionModel.class, "ResolutionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResolutionModel_Version(), ecorePackage.getEString(), "version", null, 0, 1, ResolutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolutionModel_Attributes(), theFeatureDiagramPackage.getAttribute(), null, "attributes", null, 0, 1, ResolutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolutionModel_FeatureDiagram(), theFeatureDiagramPackage.getFeatureDiagram(), null, "featureDiagram", null, 1, 1, ResolutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolutionModel_FeatureSelections(), this.getFeatureSelection(), null, "featureSelections", null, 0, -1, ResolutionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSelectionEClass, FeatureSelection.class, "FeatureSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureSelection_State(), this.getSelectionState(), "state", null, 1, 1, FeatureSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureSelection_Feature(), theFeatureDiagramPackage.getFeature(), null, "feature", null, 1, 1, FeatureSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSelection_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, FeatureSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureSelection_OwningSelection(), this.getFeatureSelection(), null, "owningSelection", null, 0, -1, FeatureSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSelection_Operator(), this.getOperator(), "operator", null, 0, 1, FeatureSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(selectionStateEEnum, SelectionState.class, "SelectionState");
		addEEnumLiteral(selectionStateEEnum, SelectionState.UNSELECTED);
		addEEnumLiteral(selectionStateEEnum, SelectionState.SELECTED);

		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.OR);
		addEEnumLiteral(operatorEEnum, Operator.OPT);
		addEEnumLiteral(operatorEEnum, Operator.ALTERNATIVE);
		addEEnumLiteral(operatorEEnum, Operator.MANDATORY);
		addEEnumLiteral(operatorEEnum, Operator.CARD);

		// Create resource
		createResource(eNS_URI);
	}

} //ResolutionmodelPackageImpl
