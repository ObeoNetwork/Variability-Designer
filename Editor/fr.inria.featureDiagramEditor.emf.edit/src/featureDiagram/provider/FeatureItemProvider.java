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
 * This project contains the EMF edit code of the Feature Diagram metamodel inspired from  the article of Perrouin et al. Reconciling Automation and Flexibility in Product Derivation
	(Software Product Line Conference, 2008 , SPLC’08, 12th Conference).
	This code is mainly generated with the genmodel file.
 * */


package featureDiagram.provider;


import featureDiagram.Alternative;
import featureDiagram.Card;
import featureDiagram.Feature;
import featureDiagram.FeatureDiagramFactory;
import featureDiagram.FeatureDiagramPackage;
import featureDiagram.Operator;
import featureDiagram.Opt;
import featureDiagram.Or;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link featureDiagram.Feature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureItemProvider
	extends FeatureElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addSelectedPropertyDescriptor(object);
			addOwningOperatorPropertyDescriptor(object);
			addModelElementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_name_feature", "_UI_Feature_type"),
				 FeatureDiagramPackage.Literals.FEATURE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_selected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_selected_feature", "_UI_Feature_type"),
				 FeatureDiagramPackage.Literals.FEATURE__SELECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owning Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwningOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_owningOperator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_owningOperator_feature", "_UI_Feature_type"),
				 FeatureDiagramPackage.Literals.FEATURE__OWNING_OPERATOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_modelElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_modelElements_feature", "_UI_Feature_type"),
				 FeatureDiagramPackage.Literals.FEATURE__MODEL_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FeatureDiagramPackage.Literals.FEATURE__OPERATOR);
			childrenFeatures.add(FeatureDiagramPackage.Literals.FEATURE__ATTRIBUTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Feature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		
		// Root Feature
		if (((Feature) object).getOwningFeatureDiagram().getRoot() != null && ((Feature) object).getOwningFeatureDiagram().getRoot().equals(object)) {
			return overlayImage(object,
					getResourceLocator()
							.getImage("RootFeature.png"));
		}
		// Alternative correspond to Xor in the metamodel
		// ALTERNATIVE
		else if (((Feature)object).getOwningOperator().size() != 0 && ((Feature)object).getOwningOperator().get(0) instanceof Alternative )
				 {
			return overlayImage(object,
					getResourceLocator()
							.getImage("Xor.png"));
			
		// CARD
		} else if (((Feature)object).getOwningOperator().size() != 0  && ((Feature)object).getOwningOperator().get(0) instanceof Card )
				 {
			return overlayImage(object,
					getResourceLocator()
							.getImage("Card.png"));
		

		// OPT
		} else if (((Feature)object).getOwningOperator().size() != 0  && ((Feature)object).getOwningOperator().get(0) instanceof Opt )
				 {
				return overlayImage(object,
						getResourceLocator()
							.getImage("Optional.png"));
			
		// OR	
		} else if (((Feature)object).getOwningOperator().size() != 0 && ((Feature)object).getOwningOperator().get(0)  instanceof Or ) {
			return overlayImage(object,
					getResourceLocator()
							.getImage("Or.png"));
			
		} else {
			// Mandatory 
			return overlayImage(object,
					getResourceLocator()
							.getImage("Mandatory.png"));
		}
	}

	
	


	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Feature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Feature_type") :
			getString("_UI_Feature_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Feature.class)) {
			case FeatureDiagramPackage.FEATURE__NAME:
			case FeatureDiagramPackage.FEATURE__SELECTED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FeatureDiagramPackage.FEATURE__OPERATOR:
			case FeatureDiagramPackage.FEATURE__ATTRIBUTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FeatureDiagramPackage.Literals.FEATURE__OPERATOR,
				 FeatureDiagramFactory.eINSTANCE.createOperator()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureDiagramPackage.Literals.FEATURE__OPERATOR,
				 FeatureDiagramFactory.eINSTANCE.createOpt()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureDiagramPackage.Literals.FEATURE__OPERATOR,
				 FeatureDiagramFactory.eINSTANCE.createMandatory()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureDiagramPackage.Literals.FEATURE__OPERATOR,
				 FeatureDiagramFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureDiagramPackage.Literals.FEATURE__OPERATOR,
				 FeatureDiagramFactory.eINSTANCE.createAlternative()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureDiagramPackage.Literals.FEATURE__OPERATOR,
				 FeatureDiagramFactory.eINSTANCE.createCard()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureDiagramPackage.Literals.FEATURE__ATTRIBUTES,
				 FeatureDiagramFactory.eINSTANCE.createAttribute()));
	}

}
