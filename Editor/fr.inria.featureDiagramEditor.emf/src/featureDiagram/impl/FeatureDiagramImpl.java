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

import featureDiagram.ConstraintEdge;
import featureDiagram.Feature;
import featureDiagram.FeatureDiagram;
import featureDiagram.FeatureDiagramPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureDiagram.impl.FeatureDiagramImpl#isGraphTypeTree <em>Graph Type Tree</em>}</li>
 *   <li>{@link featureDiagram.impl.FeatureDiagramImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link featureDiagram.impl.FeatureDiagramImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link featureDiagram.impl.FeatureDiagramImpl#getConstraintEdges <em>Constraint Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureDiagramImpl extends FeatureElementImpl implements FeatureDiagram {
	/**
	 * The default value of the '{@link #isGraphTypeTree() <em>Graph Type Tree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGraphTypeTree()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAPH_TYPE_TREE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGraphTypeTree() <em>Graph Type Tree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGraphTypeTree()
	 * @generated
	 * @ordered
	 */
	protected boolean graphTypeTree = GRAPH_TYPE_TREE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Feature root;

	/**
	 * The cached value of the '{@link #getConstraintEdges() <em>Constraint Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintEdge> constraintEdges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureDiagramPackage.Literals.FEATURE_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGraphTypeTree() {
		return graphTypeTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphTypeTree(boolean newGraphTypeTree) {
		boolean oldGraphTypeTree = graphTypeTree;
		graphTypeTree = newGraphTypeTree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureDiagramPackage.FEATURE_DIAGRAM__GRAPH_TYPE_TREE, oldGraphTypeTree, graphTypeTree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, FeatureDiagramPackage.FEATURE_DIAGRAM__FEATURES, FeatureDiagramPackage.FEATURE__OWNING_FEATURE_DIAGRAM);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (Feature)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureDiagramPackage.FEATURE_DIAGRAM__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Feature newRoot) {
		Feature oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureDiagramPackage.FEATURE_DIAGRAM__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintEdge> getConstraintEdges() {
		if (constraintEdges == null) {
			constraintEdges = new EObjectContainmentEList<ConstraintEdge>(ConstraintEdge.class, this, FeatureDiagramPackage.FEATURE_DIAGRAM__CONSTRAINT_EDGES);
		}
		return constraintEdges;
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
			case FeatureDiagramPackage.FEATURE_DIAGRAM__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
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
			case FeatureDiagramPackage.FEATURE_DIAGRAM__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case FeatureDiagramPackage.FEATURE_DIAGRAM__CONSTRAINT_EDGES:
				return ((InternalEList<?>)getConstraintEdges()).basicRemove(otherEnd, msgs);
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
			case FeatureDiagramPackage.FEATURE_DIAGRAM__GRAPH_TYPE_TREE:
				return isGraphTypeTree();
			case FeatureDiagramPackage.FEATURE_DIAGRAM__FEATURES:
				return getFeatures();
			case FeatureDiagramPackage.FEATURE_DIAGRAM__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case FeatureDiagramPackage.FEATURE_DIAGRAM__CONSTRAINT_EDGES:
				return getConstraintEdges();
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
			case FeatureDiagramPackage.FEATURE_DIAGRAM__GRAPH_TYPE_TREE:
				setGraphTypeTree((Boolean)newValue);
				return;
			case FeatureDiagramPackage.FEATURE_DIAGRAM__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case FeatureDiagramPackage.FEATURE_DIAGRAM__ROOT:
				setRoot((Feature)newValue);
				return;
			case FeatureDiagramPackage.FEATURE_DIAGRAM__CONSTRAINT_EDGES:
				getConstraintEdges().clear();
				getConstraintEdges().addAll((Collection<? extends ConstraintEdge>)newValue);
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
			case FeatureDiagramPackage.FEATURE_DIAGRAM__GRAPH_TYPE_TREE:
				setGraphTypeTree(GRAPH_TYPE_TREE_EDEFAULT);
				return;
			case FeatureDiagramPackage.FEATURE_DIAGRAM__FEATURES:
				getFeatures().clear();
				return;
			case FeatureDiagramPackage.FEATURE_DIAGRAM__ROOT:
				setRoot((Feature)null);
				return;
			case FeatureDiagramPackage.FEATURE_DIAGRAM__CONSTRAINT_EDGES:
				getConstraintEdges().clear();
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
			case FeatureDiagramPackage.FEATURE_DIAGRAM__GRAPH_TYPE_TREE:
				return graphTypeTree != GRAPH_TYPE_TREE_EDEFAULT;
			case FeatureDiagramPackage.FEATURE_DIAGRAM__FEATURES:
				return features != null && !features.isEmpty();
			case FeatureDiagramPackage.FEATURE_DIAGRAM__ROOT:
				return root != null;
			case FeatureDiagramPackage.FEATURE_DIAGRAM__CONSTRAINT_EDGES:
				return constraintEdges != null && !constraintEdges.isEmpty();
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
		result.append(" (graphTypeTree: ");
		result.append(graphTypeTree);
		result.append(')');
		return result.toString();
	}

} //FeatureDiagramImpl
