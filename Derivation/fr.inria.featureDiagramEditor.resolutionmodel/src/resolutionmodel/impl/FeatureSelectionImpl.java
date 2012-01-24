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

import featureDiagram.Feature;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import resolutionmodel.FeatureSelection;
import resolutionmodel.Operator;
import resolutionmodel.ResolutionmodelPackage;
import resolutionmodel.SelectionState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link resolutionmodel.impl.FeatureSelectionImpl#getState <em>State</em>}</li>
 *   <li>{@link resolutionmodel.impl.FeatureSelectionImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link resolutionmodel.impl.FeatureSelectionImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link resolutionmodel.impl.FeatureSelectionImpl#getOwningSelection <em>Owning Selection</em>}</li>
 *   <li>{@link resolutionmodel.impl.FeatureSelectionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureSelectionImpl extends EObjectImpl implements FeatureSelection {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final SelectionState STATE_EDEFAULT = SelectionState.UNSELECTED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected SelectionState state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwningSelection() <em>Owning Selection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningSelection()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureSelection> owningSelection;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Operator OPERATOR_EDEFAULT = Operator.OR;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResolutionmodelPackage.Literals.FEATURE_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(SelectionState newState) {
		SelectionState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResolutionmodelPackage.FEATURE_SELECTION__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(Feature newFeature, NotificationChain msgs) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResolutionmodelPackage.FEATURE_SELECTION__FEATURE, oldFeature, newFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		if (newFeature != feature) {
			NotificationChain msgs = null;
			if (feature != null)
				msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResolutionmodelPackage.FEATURE_SELECTION__FEATURE, null, msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResolutionmodelPackage.FEATURE_SELECTION__FEATURE, null, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResolutionmodelPackage.FEATURE_SELECTION__FEATURE, newFeature, newFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResolutionmodelPackage.FEATURE_SELECTION__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureSelection> getOwningSelection() {
		if (owningSelection == null) {
			owningSelection = new EObjectContainmentEList<FeatureSelection>(FeatureSelection.class, this, ResolutionmodelPackage.FEATURE_SELECTION__OWNING_SELECTION);
		}
		return owningSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		Operator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResolutionmodelPackage.FEATURE_SELECTION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResolutionmodelPackage.FEATURE_SELECTION__FEATURE:
				return basicSetFeature(null, msgs);
			case ResolutionmodelPackage.FEATURE_SELECTION__OWNING_SELECTION:
				return ((InternalEList<?>)getOwningSelection()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResolutionmodelPackage.FEATURE_SELECTION__STATE:
				return getState();
			case ResolutionmodelPackage.FEATURE_SELECTION__FEATURE:
				return getFeature();
			case ResolutionmodelPackage.FEATURE_SELECTION__FEATURE_NAME:
				return getFeatureName();
			case ResolutionmodelPackage.FEATURE_SELECTION__OWNING_SELECTION:
				return getOwningSelection();
			case ResolutionmodelPackage.FEATURE_SELECTION__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResolutionmodelPackage.FEATURE_SELECTION__STATE:
				setState((SelectionState)newValue);
				return;
			case ResolutionmodelPackage.FEATURE_SELECTION__FEATURE:
				setFeature((Feature)newValue);
				return;
			case ResolutionmodelPackage.FEATURE_SELECTION__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case ResolutionmodelPackage.FEATURE_SELECTION__OWNING_SELECTION:
				getOwningSelection().clear();
				getOwningSelection().addAll((Collection<? extends FeatureSelection>)newValue);
				return;
			case ResolutionmodelPackage.FEATURE_SELECTION__OPERATOR:
				setOperator((Operator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResolutionmodelPackage.FEATURE_SELECTION__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ResolutionmodelPackage.FEATURE_SELECTION__FEATURE:
				setFeature((Feature)null);
				return;
			case ResolutionmodelPackage.FEATURE_SELECTION__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case ResolutionmodelPackage.FEATURE_SELECTION__OWNING_SELECTION:
				getOwningSelection().clear();
				return;
			case ResolutionmodelPackage.FEATURE_SELECTION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResolutionmodelPackage.FEATURE_SELECTION__STATE:
				return state != STATE_EDEFAULT;
			case ResolutionmodelPackage.FEATURE_SELECTION__FEATURE:
				return feature != null;
			case ResolutionmodelPackage.FEATURE_SELECTION__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case ResolutionmodelPackage.FEATURE_SELECTION__OWNING_SELECTION:
				return owningSelection != null && !owningSelection.isEmpty();
			case ResolutionmodelPackage.FEATURE_SELECTION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (state: ");
		result.append(state);
		result.append(", featureName: ");
		result.append(featureName);
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //FeatureSelectionImpl
