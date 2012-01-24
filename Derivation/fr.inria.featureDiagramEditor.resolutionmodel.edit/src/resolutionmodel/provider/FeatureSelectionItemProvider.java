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
 *  This plugin contains the EMF resolution edit code generated with the genmodel.
 *  */ 

package resolutionmodel.provider;

import featureDiagram.FeatureDiagramFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import resolutionmodel.FeatureSelection;
import resolutionmodel.Operator;
import resolutionmodel.ResolutionmodelFactory;
import resolutionmodel.ResolutionmodelPackage;
import resolutionmodel.SelectionState;

/**
 * This is the item provider adapter for a
 * {@link resolutionmodel.FeatureSelection} object. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class FeatureSelectionItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureSelectionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStatePropertyDescriptor(object);
			addFeatureNamePropertyDescriptor(object);
			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the State feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_FeatureSelection_state_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FeatureSelection_state_feature",
						"_UI_FeatureSelection_type"),
				ResolutionmodelPackage.Literals.FEATURE_SELECTION__STATE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Feature Name feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFeatureNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_FeatureSelection_featureName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_FeatureSelection_featureName_feature",
								"_UI_FeatureSelection_type"),
						ResolutionmodelPackage.Literals.FEATURE_SELECTION__FEATURE_NAME,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Operator feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_FeatureSelection_operator_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FeatureSelection_operator_feature",
						"_UI_FeatureSelection_type"),
				ResolutionmodelPackage.Literals.FEATURE_SELECTION__OPERATOR,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(ResolutionmodelPackage.Literals.FEATURE_SELECTION__OWNING_SELECTION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper
		// feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FeatureSelection.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		// Alternative correspond toXor in the metamodel
		
		// ALTERNATIVE
		if (Operator.ALTERNATIVE.equals(((FeatureSelection) object)
				.getOperator())) {
			
			// Selected alternative
			if (((FeatureSelection) object).getState().equals(SelectionState.SELECTED)){
			return overlayImage(object,
					getResourceLocator()
							.getImage("Xor.png"));
			}
			else { // Unselected alternative
				return overlayImage(object,
						getResourceLocator()
								.getImage("XorUns.png"));
			}

			
		// CARD
		} else if (Operator.CARD.equals(((FeatureSelection) object)
				.getOperator())) {
			// Selected card
			if (((FeatureSelection) object).getState().equals(SelectionState.SELECTED)){
			return overlayImage(object,
					getResourceLocator()
							.getImage("Card.png"));
			} 
			else { // Unselected card
				return overlayImage(object,
						getResourceLocator()
								.getImage("CardUns.png"));
			}

		// OPT
		} else if (Operator.OPT.equals(((FeatureSelection) object)
				.getOperator())) {
			// Selected opt
			if (((FeatureSelection) object).getState().equals(SelectionState.SELECTED)){
				return overlayImage(object,
						getResourceLocator()
							.getImage("Optional.png"));
			} else {
			// Unselected opt
			
			return overlayImage(object,
					getResourceLocator()
							.getImage("OptionalUns.png"));
			}
			
		// OR	
		} else if (Operator.OR.equals(((FeatureSelection) object)
				.getOperator())) {
			// Or selected
			if (((FeatureSelection) object).getState().equals(SelectionState.SELECTED)){
			return overlayImage(object,
					getResourceLocator()
							.getImage("Or.png"));
			}
			else { // Or unselected
				return overlayImage(object,
						getResourceLocator()
								.getImage("OrUns.png"));
			}

		} else
			// Mandatory (cannot be unselected)
			return overlayImage(object,
					getResourceLocator()
							.getImage("Mandatory.png"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FeatureSelection) object).getFeatureName();
		return label == null || label.length() == 0 ? getString("_UI_FeatureSelection_type")
				: getString("_UI_FeatureSelection_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FeatureSelection.class)) {
		case ResolutionmodelPackage.FEATURE_SELECTION__STATE:
		case ResolutionmodelPackage.FEATURE_SELECTION__FEATURE:
		case ResolutionmodelPackage.FEATURE_SELECTION__FEATURE_NAME:
		case ResolutionmodelPackage.FEATURE_SELECTION__OPERATOR:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case ResolutionmodelPackage.FEATURE_SELECTION__OWNING_SELECTION:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(
						ResolutionmodelPackage.Literals.FEATURE_SELECTION__OWNING_SELECTION,
						ResolutionmodelFactory.eINSTANCE
								.createFeatureSelection()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ResolutionmodelEditPlugin.INSTANCE;
	}

}
