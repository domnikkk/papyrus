/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.dd.dg.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.papyrus.dd.dg.DGFactory;
import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Group;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.dd.dg.Group} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class GroupItemProvider extends GraphicalElementItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemColorProvider, IItemFontProvider {

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public GroupItemProvider(AdapterFactory adapterFactory) {
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
			addLayoutPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Layout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addLayoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Group_layout_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Group_layout_feature", "_UI_Group_type"), DGPackage.Literals.GROUP__LAYOUT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DGPackage.Literals.GROUP__MEMBER);
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
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.
		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Group.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Group"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = getLabel((Group) object);
		return label == null || label.length() == 0 ? getString("_UI_Group_type") : getString("_UI_Group_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		switch (notification.getFeatureID(Group.class)) {
		case DGPackage.GROUP__LAYOUT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DGPackage.GROUP__MEMBER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createGroup()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createCanvas()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createClipPath()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createCircle()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createEllipse()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createImage()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createLine()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createMarker()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createPath()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createPolygon()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createPolyline()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createRectangle()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createRootCanvas()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createText()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GROUP__MEMBER, DGFactory.eINSTANCE.createUse()));
	}
}
