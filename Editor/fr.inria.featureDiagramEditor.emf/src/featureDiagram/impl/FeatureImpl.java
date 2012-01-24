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
package featureDiagram.impl;

import featureDiagram.Attribute;
import featureDiagram.Feature;
import featureDiagram.FeatureDiagram;
import featureDiagram.FeatureDiagramPackage;
import featureDiagram.Operator;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureDiagram.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link featureDiagram.impl.FeatureImpl#getOwningFeatureDiagram <em>Owning Feature Diagram</em>}</li>
 *   <li>{@link featureDiagram.impl.FeatureImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link featureDiagram.impl.FeatureImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link featureDiagram.impl.FeatureImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link featureDiagram.impl.FeatureImpl#getOwningOperator <em>Owning Operator</em>}</li>
 *   <li>{@link featureDiagram.impl.FeatureImpl#getModelElements <em>Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends FeatureElementImpl implements Feature {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<Operator> operator;

	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getOwningOperator() <em>Owning Operator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<Operator> owningOperator;

	/**
	 * The cached value of the '{@link #getModelElements() <em>Model Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> modelElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureDiagramPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureDiagramPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDiagram getOwningFeatureDiagram() {
		if (eContainerFeatureID() != FeatureDiagramPackage.FEATURE__OWNING_FEATURE_DIAGRAM) return null;
		return (FeatureDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningFeatureDiagram(FeatureDiagram newOwningFeatureDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningFeatureDiagram, FeatureDiagramPackage.FEATURE__OWNING_FEATURE_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFeatureDiagram(FeatureDiagram newOwningFeatureDiagram) {
		if (newOwningFeatureDiagram != eInternalContainer() || (eContainerFeatureID() != FeatureDiagramPackage.FEATURE__OWNING_FEATURE_DIAGRAM && newOwningFeatureDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newOwningFeatureDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningFeatureDiagram != null)
				msgs = ((InternalEObject)newOwningFeatureDiagram).eInverseAdd(this, FeatureDiagramPackage.FEATURE_DIAGRAM__FEATURES, FeatureDiagram.class, msgs);
			msgs = basicSetOwningFeatureDiagram(newOwningFeatureDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureDiagramPackage.FEATURE__OWNING_FEATURE_DIAGRAM, newOwningFeatureDiagram, newOwningFeatureDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operator> getOperator() {
		if (operator == null) {
			operator = new EObjectContainmentWithInverseEList<Operator>(Operator.class, this, FeatureDiagramPackage.FEATURE__OPERATOR, FeatureDiagramPackage.OPERATOR__OWNING_FEATURE);
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureDiagramPackage.FEATURE__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, FeatureDiagramPackage.FEATURE__ATTRIBUTES, FeatureDiagramPackage.ATTRIBUTE__OWNING_FEATURE);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operator> getOwningOperator() {
		if (owningOperator == null) {
			owningOperator = new EObjectWithInverseResolvingEList.ManyInverse<Operator>(Operator.class, this, FeatureDiagramPackage.FEATURE__OWNING_OPERATOR, FeatureDiagramPackage.OPERATOR__FEATURES);
		}
		return owningOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getModelElements() {
		if (modelElements == null) {
			modelElements = new EObjectResolvingEList<EObject>(EObject.class, this, FeatureDiagramPackage.FEATURE__MODEL_ELEMENTS);
		}
		return modelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureDiagramPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningFeatureDiagram((FeatureDiagram)otherEnd, msgs);
			case FeatureDiagramPackage.FEATURE__OPERATOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperator()).basicAdd(otherEnd, msgs);
			case FeatureDiagramPackage.FEATURE__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
			case FeatureDiagramPackage.FEATURE__OWNING_OPERATOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwningOperator()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureDiagramPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				return basicSetOwningFeatureDiagram(null, msgs);
			case FeatureDiagramPackage.FEATURE__OPERATOR:
				return ((InternalEList<?>)getOperator()).basicRemove(otherEnd, msgs);
			case FeatureDiagramPackage.FEATURE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case FeatureDiagramPackage.FEATURE__OWNING_OPERATOR:
				return ((InternalEList<?>)getOwningOperator()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FeatureDiagramPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, FeatureDiagramPackage.FEATURE_DIAGRAM__FEATURES, FeatureDiagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureDiagramPackage.FEATURE__NAME:
				return getName();
			case FeatureDiagramPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				return getOwningFeatureDiagram();
			case FeatureDiagramPackage.FEATURE__OPERATOR:
				return getOperator();
			case FeatureDiagramPackage.FEATURE__SELECTED:
				return isSelected();
			case FeatureDiagramPackage.FEATURE__ATTRIBUTES:
				return getAttributes();
			case FeatureDiagramPackage.FEATURE__OWNING_OPERATOR:
				return getOwningOperator();
			case FeatureDiagramPackage.FEATURE__MODEL_ELEMENTS:
				return getModelElements();
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
			case FeatureDiagramPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case FeatureDiagramPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				setOwningFeatureDiagram((FeatureDiagram)newValue);
				return;
			case FeatureDiagramPackage.FEATURE__OPERATOR:
				getOperator().clear();
				getOperator().addAll((Collection<? extends Operator>)newValue);
				return;
			case FeatureDiagramPackage.FEATURE__SELECTED:
				setSelected((Boolean)newValue);
				return;
			case FeatureDiagramPackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case FeatureDiagramPackage.FEATURE__OWNING_OPERATOR:
				getOwningOperator().clear();
				getOwningOperator().addAll((Collection<? extends Operator>)newValue);
				return;
			case FeatureDiagramPackage.FEATURE__MODEL_ELEMENTS:
				getModelElements().clear();
				getModelElements().addAll((Collection<? extends EObject>)newValue);
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
			case FeatureDiagramPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeatureDiagramPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				setOwningFeatureDiagram((FeatureDiagram)null);
				return;
			case FeatureDiagramPackage.FEATURE__OPERATOR:
				getOperator().clear();
				return;
			case FeatureDiagramPackage.FEATURE__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case FeatureDiagramPackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case FeatureDiagramPackage.FEATURE__OWNING_OPERATOR:
				getOwningOperator().clear();
				return;
			case FeatureDiagramPackage.FEATURE__MODEL_ELEMENTS:
				getModelElements().clear();
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
			case FeatureDiagramPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeatureDiagramPackage.FEATURE__OWNING_FEATURE_DIAGRAM:
				return getOwningFeatureDiagram() != null;
			case FeatureDiagramPackage.FEATURE__OPERATOR:
				return operator != null && !operator.isEmpty();
			case FeatureDiagramPackage.FEATURE__SELECTED:
				return selected != SELECTED_EDEFAULT;
			case FeatureDiagramPackage.FEATURE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case FeatureDiagramPackage.FEATURE__OWNING_OPERATOR:
				return owningOperator != null && !owningOperator.isEmpty();
			case FeatureDiagramPackage.FEATURE__MODEL_ELEMENTS:
				return modelElements != null && !modelElements.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
