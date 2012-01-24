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

import featureDiagram.Attribute;
import featureDiagram.FeatureDiagram;

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
import resolutionmodel.ResolutionModel;
import resolutionmodel.ResolutionmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolution Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link resolutionmodel.impl.ResolutionModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link resolutionmodel.impl.ResolutionModelImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link resolutionmodel.impl.ResolutionModelImpl#getFeatureDiagram <em>Feature Diagram</em>}</li>
 *   <li>{@link resolutionmodel.impl.ResolutionModelImpl#getFeatureSelections <em>Feature Selections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResolutionModelImpl extends EObjectImpl implements ResolutionModel {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributes;

	/**
	 * The cached value of the '{@link #getFeatureDiagram() <em>Feature Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureDiagram()
	 * @generated
	 * @ordered
	 */
	protected FeatureDiagram featureDiagram;

	/**
	 * The cached value of the '{@link #getFeatureSelections() <em>Feature Selections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureSelection> featureSelections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolutionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResolutionmodelPackage.Literals.RESOLUTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResolutionmodelPackage.RESOLUTION_MODEL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(Attribute newAttributes, NotificationChain msgs) {
		Attribute oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResolutionmodelPackage.RESOLUTION_MODEL__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Attribute newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResolutionmodelPackage.RESOLUTION_MODEL__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResolutionmodelPackage.RESOLUTION_MODEL__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResolutionmodelPackage.RESOLUTION_MODEL__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDiagram getFeatureDiagram() {
		if (featureDiagram != null && featureDiagram.eIsProxy()) {
			InternalEObject oldFeatureDiagram = (InternalEObject)featureDiagram;
			featureDiagram = (FeatureDiagram)eResolveProxy(oldFeatureDiagram);
			if (featureDiagram != oldFeatureDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResolutionmodelPackage.RESOLUTION_MODEL__FEATURE_DIAGRAM, oldFeatureDiagram, featureDiagram));
			}
		}
		return featureDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDiagram basicGetFeatureDiagram() {
		return featureDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureDiagram(FeatureDiagram newFeatureDiagram) {
		FeatureDiagram oldFeatureDiagram = featureDiagram;
		featureDiagram = newFeatureDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResolutionmodelPackage.RESOLUTION_MODEL__FEATURE_DIAGRAM, oldFeatureDiagram, featureDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureSelection> getFeatureSelections() {
		if (featureSelections == null) {
			featureSelections = new EObjectContainmentEList<FeatureSelection>(FeatureSelection.class, this, ResolutionmodelPackage.RESOLUTION_MODEL__FEATURE_SELECTIONS);
		}
		return featureSelections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResolutionmodelPackage.RESOLUTION_MODEL__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case ResolutionmodelPackage.RESOLUTION_MODEL__FEATURE_SELECTIONS:
				return ((InternalEList<?>)getFeatureSelections()).basicRemove(otherEnd, msgs);
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
			case ResolutionmodelPackage.RESOLUTION_MODEL__VERSION:
				return getVersion();
			case ResolutionmodelPackage.RESOLUTION_MODEL__ATTRIBUTES:
				return getAttributes();
			case ResolutionmodelPackage.RESOLUTION_MODEL__FEATURE_DIAGRAM:
				if (resolve) return getFeatureDiagram();
				return basicGetFeatureDiagram();
			case ResolutionmodelPackage.RESOLUTION_MODEL__FEATURE_SELECTIONS:
				return getFeatureSelections();
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
			case ResolutionmodelPackage.RESOLUTION_MODEL__VERSION:
				setVersion((String)newValue);
				return;
			case ResolutionmodelPackage.RESOLUTION_MODEL__ATTRIBUTES:
				setAttributes((Attribute)newValue);
				return;
			case ResolutionmodelPackage.RESOLUTION_MODEL__FEATURE_DIAGRAM:
				setFeatureDiagram((FeatureDiagram)newValue);
				return;
			case ResolutionmodelPackage.RESOLUTION_MODEL__FEATURE_SELECTIONS:
				getFeatureSelections().clear();
				getFeatureSelections().addAll((Collection<? extends FeatureSelection>)newValue);
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
			case ResolutionmodelPackage.RESOLUTION_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ResolutionmodelPackage.RESOLUTION_MODEL__ATTRIBUTES:
				setAttributes((Attribute)null);
				return;
			case ResolutionmodelPackage.RESOLUTION_MODEL__FEATURE_DIAGRAM:
				setFeatureDiagram((FeatureDiagram)null);
				return;
			case ResolutionmodelPackage.RESOLUTION_MODEL__FEATURE_SELECTIONS:
				getFeatureSelections().clear();
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
			case ResolutionmodelPackage.RESOLUTION_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ResolutionmodelPackage.RESOLUTION_MODEL__ATTRIBUTES:
				return attributes != null;
			case ResolutionmodelPackage.RESOLUTION_MODEL__FEATURE_DIAGRAM:
				return featureDiagram != null;
			case ResolutionmodelPackage.RESOLUTION_MODEL__FEATURE_SELECTIONS:
				return featureSelections != null && !featureSelections.isEmpty();
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ResolutionModelImpl
