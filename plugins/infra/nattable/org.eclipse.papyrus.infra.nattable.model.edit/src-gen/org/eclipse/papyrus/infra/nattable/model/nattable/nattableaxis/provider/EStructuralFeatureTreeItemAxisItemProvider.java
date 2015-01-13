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
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureTreeItemAxis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EStructuralFeatureTreeItemAxisItemProvider extends EStructuralFeatureAxisItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EStructuralFeatureTreeItemAxisItemProvider(AdapterFactory adapterFactory) {
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

			addParentPropertyDescriptor(object);
			addExpandedPropertyDescriptor(object);
			addChildrenPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_ITreeItemAxis_parent_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_ITreeItemAxis_parent_feature", "_UI_ITreeItemAxis_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattableaxisPackage.Literals.ITREE_ITEM_AXIS__PARENT,
						true,
						false,
						true,
						null,
						null,
						null));
	}

	/**
	 * This adds a property descriptor for the Expanded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addExpandedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_ITreeItemAxis_expanded_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_ITreeItemAxis_expanded_feature", "_UI_ITreeItemAxis_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattableaxisPackage.Literals.ITREE_ITEM_AXIS__EXPANDED,
						true,
						false,
						false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
						null,
						null));
	}

	/**
	 * This adds a property descriptor for the Children feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addChildrenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_ITreeItemAxis_children_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_ITreeItemAxis_children_feature", "_UI_ITreeItemAxis_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattableaxisPackage.Literals.ITREE_ITEM_AXIS__CHILDREN,
						true,
						false,
						true,
						null,
						null,
						null));
	}

	/**
	 * This returns EStructuralFeatureTreeItemAxis.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EStructuralFeatureTreeItemAxis")); //$NON-NLS-1$
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
		String label = ((EStructuralFeatureTreeItemAxis) object).getAlias();
		return label == null || label.length() == 0 ?
				getString("_UI_EStructuralFeatureTreeItemAxis_type") : //$NON-NLS-1$
				getString("_UI_EStructuralFeatureTreeItemAxis_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EStructuralFeatureTreeItemAxis.class)) {
		case NattableaxisPackage.ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS__EXPANDED:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
