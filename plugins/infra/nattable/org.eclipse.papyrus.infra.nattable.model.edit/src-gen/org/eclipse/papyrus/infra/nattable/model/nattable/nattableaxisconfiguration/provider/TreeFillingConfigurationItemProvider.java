/**
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.NattableaxisconfigurationPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.provider.StyledElementItemProvider;
import org.eclipse.papyrus.infra.nattable.model.nattable.provider.NattableEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TreeFillingConfigurationItemProvider extends StyledElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TreeFillingConfigurationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPasteConfigurationPropertyDescriptor(object);
			addDepthPropertyDescriptor(object);
			addLabelProviderPropertyDescriptor(object);
			addLabelProviderContextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Paste Configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addPasteConfigurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TreeFillingConfiguration_pasteConfiguration_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_TreeFillingConfiguration_pasteConfiguration_feature", "_UI_TreeFillingConfiguration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__PASTE_CONFIGURATION,
						true,
						false,
						true,
						null,
						null,
						null));
	}

	/**
	 * This adds a property descriptor for the Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TreeFillingConfiguration_depth_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_TreeFillingConfiguration_depth_feature", "_UI_TreeFillingConfiguration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__DEPTH,
						true,
						false,
						false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
						null,
						null));
	}

	/**
	 * This adds a property descriptor for the Label Provider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addLabelProviderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TreeFillingConfiguration_labelProvider_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_TreeFillingConfiguration_labelProvider_feature", "_UI_TreeFillingConfiguration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER,
						true,
						false,
						true,
						null,
						null,
						null));
	}

	/**
	 * This adds a property descriptor for the Label Provider Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addLabelProviderContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_TreeFillingConfiguration_labelProviderContext_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_TreeFillingConfiguration_labelProviderContext_feature", "_UI_TreeFillingConfiguration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER_CONTEXT,
						true,
						false,
						false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null,
						null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TreeFillingConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TreeFillingConfiguration")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TreeFillingConfiguration treeFillingConfiguration = (TreeFillingConfiguration) object;
		return getString("_UI_TreeFillingConfiguration_type") + " " + treeFillingConfiguration.getDepth(); //$NON-NLS-1$ //$NON-NLS-2$
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TreeFillingConfiguration.class)) {
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__DEPTH:
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER_CONTEXT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER:
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
	 *
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
				(createChildParameter
				(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER,
						NattableaxisFactory.eINSTANCE.createIdTreeItemAxis()));

		newChildDescriptors.add
				(createChildParameter
				(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER,
						NattableaxisFactory.eINSTANCE.createEObjectAxis()));

		newChildDescriptors.add
				(createChildParameter
				(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER,
						NattableaxisFactory.eINSTANCE.createEObjectTreeItemAxis()));

		newChildDescriptors.add
				(createChildParameter
				(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER,
						NattableaxisFactory.eINSTANCE.createFeatureTreeItemAxis()));

		newChildDescriptors.add
				(createChildParameter
				(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER,
						NattableaxisFactory.eINSTANCE.createObjectTreeItemAxis()));

		newChildDescriptors.add
				(createChildParameter
				(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER,
						NattableaxisFactory.eINSTANCE.createFeatureIdAxis()));

		newChildDescriptors.add
				(createChildParameter
				(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER,
						NattableaxisFactory.eINSTANCE.createFeatureIdTreeItemAxis()));

		newChildDescriptors.add
				(createChildParameter
				(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER,
						NattableaxisFactory.eINSTANCE.createEStructuralFeatureAxis()));

		newChildDescriptors.add
				(createChildParameter
				(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER,
						NattableaxisFactory.eINSTANCE.createEStructuralFeatureTreeItemAxis()));

		newChildDescriptors.add
				(createChildParameter
				(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER,
						NattableaxisFactory.eINSTANCE.createObjectIdAxis()));

		newChildDescriptors.add
				(createChildParameter
				(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER,
						NattableaxisFactory.eINSTANCE.createObjectIdTreeItemAxis()));

		newChildDescriptors.add
				(createChildParameter
				(NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER,
						NattableaxisFactory.eINSTANCE.createAxisGroup()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return NattableEditPlugin.INSTANCE;
	}

}
