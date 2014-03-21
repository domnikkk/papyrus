/*******************************************************************************
 * Copyright (c) 2013 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Dumoulin - cedric.dumoulin@lifl.fr
 ******************************************************************************/
/**
 */
package org.eclipse.papyrus.layers.stackmodel.layers.provider;


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

import org.eclipse.papyrus.layers.stackmodel.layers.LayerOperatorDescriptorRegistry;
import org.eclipse.papyrus.layers.stackmodel.layers.LayersFactory;
import org.eclipse.papyrus.layers.stackmodel.layers.LayersPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.layers.stackmodel.layers.LayerOperatorDescriptorRegistry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayerOperatorDescriptorRegistryItemProvider
	extends ItemProviderAdapter
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
	public LayerOperatorDescriptorRegistryItemProvider(AdapterFactory adapterFactory) {
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

			addPropertyCollectionSizePropertyDescriptor(object);
			addDefaultOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property Collection Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyCollectionSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayerOperatorDescriptorRegistry_propertyCollectionSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayerOperatorDescriptorRegistry_propertyCollectionSize_feature", "_UI_LayerOperatorDescriptorRegistry_type"),
				 LayersPackage.Literals.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__PROPERTY_COLLECTION_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayerOperatorDescriptorRegistry_defaultOperator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayerOperatorDescriptorRegistry_defaultOperator_feature", "_UI_LayerOperatorDescriptorRegistry_type"),
				 LayersPackage.Literals.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__DEFAULT_OPERATOR,
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
			childrenFeatures.add(LayersPackage.Literals.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__DESCRIPTORS);
			childrenFeatures.add(LayersPackage.Literals.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__PROPERTY_OPERATORS);
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
	 * This returns LayerOperatorDescriptorRegistry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LayerOperatorDescriptorRegistry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		LayerOperatorDescriptorRegistry layerOperatorDescriptorRegistry = (LayerOperatorDescriptorRegistry)object;
		return getString("_UI_LayerOperatorDescriptorRegistry_type") + " " + layerOperatorDescriptorRegistry.getPropertyCollectionSize();
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

		switch (notification.getFeatureID(LayerOperatorDescriptorRegistry.class)) {
			case LayersPackage.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__PROPERTY_COLLECTION_SIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LayersPackage.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__DESCRIPTORS:
			case LayersPackage.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__PROPERTY_OPERATORS:
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
				(LayersPackage.Literals.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__DESCRIPTORS,
				 LayersFactory.eINSTANCE.createLayerOperatorDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(LayersPackage.Literals.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__DESCRIPTORS,
				 LayersFactory.eINSTANCE.createTopLayerOperatorDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(LayersPackage.Literals.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__DESCRIPTORS,
				 LayersFactory.eINSTANCE.createStackedLayerOperatorDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(LayersPackage.Literals.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__DESCRIPTORS,
				 LayersFactory.eINSTANCE.createAndStackedLayerOperatorDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(LayersPackage.Literals.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__DESCRIPTORS,
				 LayersFactory.eINSTANCE.createOrStackedLayerOperatorDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(LayersPackage.Literals.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__PROPERTY_OPERATORS,
				 LayersFactory.eINSTANCE.createPropertyOperator()));

		newChildDescriptors.add
			(createChildParameter
				(LayersPackage.Literals.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__PROPERTY_OPERATORS,
				 LayersFactory.eINSTANCE.createDefaultPropertyOperator()));

		newChildDescriptors.add
			(createChildParameter
				(LayersPackage.Literals.LAYER_OPERATOR_DESCRIPTOR_REGISTRY__PROPERTY_OPERATORS,
				 LayersFactory.eINSTANCE.createCustomPropertyOperator()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LayersEditPlugin.INSTANCE;
	}

}
