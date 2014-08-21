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
import org.eclipse.papyrus.dd.dg.GraphicalElement;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.dd.dg.GraphicalElement} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class GraphicalElementItemProvider extends DefinitionItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemColorProvider, IItemFontProvider {

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public GraphicalElementItemProvider(AdapterFactory adapterFactory) {
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
			addClipPathPropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addLayoutDataPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Clip Path feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addClipPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_GraphicalElement_clipPath_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_GraphicalElement_clipPath_feature", "_UI_GraphicalElement_type"), DGPackage.Literals.GRAPHICAL_ELEMENT__CLIP_PATH, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Class feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_GraphicalElement_class_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_GraphicalElement_class_feature", "_UI_GraphicalElement_type"), DGPackage.Literals.GRAPHICAL_ELEMENT__CLASS, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Layout Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addLayoutDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_GraphicalElement_layoutData_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_GraphicalElement_layoutData_feature", "_UI_GraphicalElement_type"), DGPackage.Literals.GRAPHICAL_ELEMENT__LAYOUT_DATA, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
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
			childrenFeatures.add(DGPackage.Literals.GRAPHICAL_ELEMENT__STYLE);
			childrenFeatures.add(DGPackage.Literals.GRAPHICAL_ELEMENT__TRANSFORM);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = getLabel((GraphicalElement) object);
		return label == null || label.length() == 0 ? getString("_UI_GraphicalElement_type") : getString("_UI_GraphicalElement_type") + " " + label;
	}

	/**
	 * Get the label of the given graphical element
	 *
	 * @param element
	 *            The graphical element
	 * @return String label of the graphical element
	 */
	protected String getLabel(GraphicalElement element) {
		String label = "";
		if (element.getId() != null) {
			label += "id=" + element.getId();
		}
		if (!element.getClasses().isEmpty()) {
			if (label.length() > 0) {
				label += ", ";
			}
			label += joinString("class", element.getClasses(), ",");
		}
		return (label.length() > 0) ? "[" + label + "]" : "";
	}

	private String joinString(String key, Collection<String> values, String sep) {
		String s = "";
		for (String v : values) {
			s += (s.length() > 0) ? ", " + v : v;
		}
		return key + "=" + s;
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
		switch (notification.getFeatureID(GraphicalElement.class)) {
		case DGPackage.GRAPHICAL_ELEMENT__CLASS:
		case DGPackage.GRAPHICAL_ELEMENT__LAYOUT_DATA:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DGPackage.GRAPHICAL_ELEMENT__STYLE:
		case DGPackage.GRAPHICAL_ELEMENT__TRANSFORM:
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
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GRAPHICAL_ELEMENT__STYLE, DGFactory.eINSTANCE.createStyle()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GRAPHICAL_ELEMENT__TRANSFORM, DGFactory.eINSTANCE.createMatrix()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GRAPHICAL_ELEMENT__TRANSFORM, DGFactory.eINSTANCE.createRotate()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GRAPHICAL_ELEMENT__TRANSFORM, DGFactory.eINSTANCE.createScale()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GRAPHICAL_ELEMENT__TRANSFORM, DGFactory.eINSTANCE.createSkew()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.GRAPHICAL_ELEMENT__TRANSFORM, DGFactory.eINSTANCE.createTranslate()));
	}
}
