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
import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Matrix;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.dd.dg.Matrix} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class MatrixItemProvider extends TransformItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemColorProvider, IItemFontProvider {

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public MatrixItemProvider(AdapterFactory adapterFactory) {
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
			addAPropertyDescriptor(object);
			addBPropertyDescriptor(object);
			addCPropertyDescriptor(object);
			addDPropertyDescriptor(object);
			addEPropertyDescriptor(object);
			addFPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the A feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Matrix_a_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Matrix_a_feature", "_UI_Matrix_type"), DGPackage.Literals.MATRIX__A, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the B feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Matrix_b_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Matrix_b_feature", "_UI_Matrix_type"), DGPackage.Literals.MATRIX__B, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the C feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Matrix_c_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Matrix_c_feature", "_UI_Matrix_type"), DGPackage.Literals.MATRIX__C, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the D feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Matrix_d_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Matrix_d_feature", "_UI_Matrix_type"), DGPackage.Literals.MATRIX__D, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the E feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addEPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Matrix_e_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Matrix_e_feature", "_UI_Matrix_type"), DGPackage.Literals.MATRIX__E, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the F feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addFPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Matrix_f_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Matrix_f_feature", "_UI_Matrix_type"), DGPackage.Literals.MATRIX__F, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Matrix.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Matrix"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Matrix matrix = (Matrix) object;
		return getString("_UI_Matrix_type") + " " + matrix.getA();
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
		switch (notification.getFeatureID(Matrix.class)) {
		case DGPackage.MATRIX__A:
		case DGPackage.MATRIX__B:
		case DGPackage.MATRIX__C:
		case DGPackage.MATRIX__D:
		case DGPackage.MATRIX__E:
		case DGPackage.MATRIX__F:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}
}
