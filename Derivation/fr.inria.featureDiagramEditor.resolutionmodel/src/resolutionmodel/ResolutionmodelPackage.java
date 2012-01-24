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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see resolutionmodel.ResolutionmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ResolutionmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resolutionmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/resolutionModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resolutionmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResolutionmodelPackage eINSTANCE = resolutionmodel.impl.ResolutionmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link resolutionmodel.impl.ResolutionModelImpl <em>Resolution Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resolutionmodel.impl.ResolutionModelImpl
	 * @see resolutionmodel.impl.ResolutionmodelPackageImpl#getResolutionModel()
	 * @generated
	 */
	int RESOLUTION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_MODEL__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_MODEL__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Feature Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_MODEL__FEATURE_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Feature Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_MODEL__FEATURE_SELECTIONS = 3;

	/**
	 * The number of structural features of the '<em>Resolution Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link resolutionmodel.impl.FeatureSelectionImpl <em>Feature Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resolutionmodel.impl.FeatureSelectionImpl
	 * @see resolutionmodel.impl.ResolutionmodelPackageImpl#getFeatureSelection()
	 * @generated
	 */
	int FEATURE_SELECTION = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__STATE = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__FEATURE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Owning Selection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__OWNING_SELECTION = 3;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__OPERATOR = 4;

	/**
	 * The number of structural features of the '<em>Feature Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link resolutionmodel.SelectionState <em>Selection State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resolutionmodel.SelectionState
	 * @see resolutionmodel.impl.ResolutionmodelPackageImpl#getSelectionState()
	 * @generated
	 */
	int SELECTION_STATE = 2;


	/**
	 * The meta object id for the '{@link resolutionmodel.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resolutionmodel.Operator
	 * @see resolutionmodel.impl.ResolutionmodelPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 3;


	/**
	 * Returns the meta object for class '{@link resolutionmodel.ResolutionModel <em>Resolution Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Model</em>'.
	 * @see resolutionmodel.ResolutionModel
	 * @generated
	 */
	EClass getResolutionModel();

	/**
	 * Returns the meta object for the attribute '{@link resolutionmodel.ResolutionModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see resolutionmodel.ResolutionModel#getVersion()
	 * @see #getResolutionModel()
	 * @generated
	 */
	EAttribute getResolutionModel_Version();

	/**
	 * Returns the meta object for the containment reference '{@link resolutionmodel.ResolutionModel#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see resolutionmodel.ResolutionModel#getAttributes()
	 * @see #getResolutionModel()
	 * @generated
	 */
	EReference getResolutionModel_Attributes();

	/**
	 * Returns the meta object for the reference '{@link resolutionmodel.ResolutionModel#getFeatureDiagram <em>Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Diagram</em>'.
	 * @see resolutionmodel.ResolutionModel#getFeatureDiagram()
	 * @see #getResolutionModel()
	 * @generated
	 */
	EReference getResolutionModel_FeatureDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link resolutionmodel.ResolutionModel#getFeatureSelections <em>Feature Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Selections</em>'.
	 * @see resolutionmodel.ResolutionModel#getFeatureSelections()
	 * @see #getResolutionModel()
	 * @generated
	 */
	EReference getResolutionModel_FeatureSelections();

	/**
	 * Returns the meta object for class '{@link resolutionmodel.FeatureSelection <em>Feature Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Selection</em>'.
	 * @see resolutionmodel.FeatureSelection
	 * @generated
	 */
	EClass getFeatureSelection();

	/**
	 * Returns the meta object for the attribute '{@link resolutionmodel.FeatureSelection#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see resolutionmodel.FeatureSelection#getState()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EAttribute getFeatureSelection_State();

	/**
	 * Returns the meta object for the containment reference '{@link resolutionmodel.FeatureSelection#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see resolutionmodel.FeatureSelection#getFeature()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EReference getFeatureSelection_Feature();

	/**
	 * Returns the meta object for the attribute '{@link resolutionmodel.FeatureSelection#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see resolutionmodel.FeatureSelection#getFeatureName()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EAttribute getFeatureSelection_FeatureName();

	/**
	 * Returns the meta object for the containment reference list '{@link resolutionmodel.FeatureSelection#getOwningSelection <em>Owning Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owning Selection</em>'.
	 * @see resolutionmodel.FeatureSelection#getOwningSelection()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EReference getFeatureSelection_OwningSelection();

	/**
	 * Returns the meta object for the attribute '{@link resolutionmodel.FeatureSelection#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see resolutionmodel.FeatureSelection#getOperator()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EAttribute getFeatureSelection_Operator();

	/**
	 * Returns the meta object for enum '{@link resolutionmodel.SelectionState <em>Selection State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Selection State</em>'.
	 * @see resolutionmodel.SelectionState
	 * @generated
	 */
	EEnum getSelectionState();

	/**
	 * Returns the meta object for enum '{@link resolutionmodel.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see resolutionmodel.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResolutionmodelFactory getResolutionmodelFactory();

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
		 * The meta object literal for the '{@link resolutionmodel.impl.ResolutionModelImpl <em>Resolution Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resolutionmodel.impl.ResolutionModelImpl
		 * @see resolutionmodel.impl.ResolutionmodelPackageImpl#getResolutionModel()
		 * @generated
		 */
		EClass RESOLUTION_MODEL = eINSTANCE.getResolutionModel();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLUTION_MODEL__VERSION = eINSTANCE.getResolutionModel_Version();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION_MODEL__ATTRIBUTES = eINSTANCE.getResolutionModel_Attributes();

		/**
		 * The meta object literal for the '<em><b>Feature Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION_MODEL__FEATURE_DIAGRAM = eINSTANCE.getResolutionModel_FeatureDiagram();

		/**
		 * The meta object literal for the '<em><b>Feature Selections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION_MODEL__FEATURE_SELECTIONS = eINSTANCE.getResolutionModel_FeatureSelections();

		/**
		 * The meta object literal for the '{@link resolutionmodel.impl.FeatureSelectionImpl <em>Feature Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resolutionmodel.impl.FeatureSelectionImpl
		 * @see resolutionmodel.impl.ResolutionmodelPackageImpl#getFeatureSelection()
		 * @generated
		 */
		EClass FEATURE_SELECTION = eINSTANCE.getFeatureSelection();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SELECTION__STATE = eINSTANCE.getFeatureSelection_State();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_SELECTION__FEATURE = eINSTANCE.getFeatureSelection_Feature();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SELECTION__FEATURE_NAME = eINSTANCE.getFeatureSelection_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Owning Selection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_SELECTION__OWNING_SELECTION = eINSTANCE.getFeatureSelection_OwningSelection();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SELECTION__OPERATOR = eINSTANCE.getFeatureSelection_Operator();

		/**
		 * The meta object literal for the '{@link resolutionmodel.SelectionState <em>Selection State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resolutionmodel.SelectionState
		 * @see resolutionmodel.impl.ResolutionmodelPackageImpl#getSelectionState()
		 * @generated
		 */
		EEnum SELECTION_STATE = eINSTANCE.getSelectionState();

		/**
		 * The meta object literal for the '{@link resolutionmodel.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resolutionmodel.Operator
		 * @see resolutionmodel.impl.ResolutionmodelPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //ResolutionmodelPackage
