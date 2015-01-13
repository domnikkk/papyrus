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
package org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.provider.EModelElementItemProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestyleFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement;
import org.eclipse.papyrus.infra.nattable.model.nattable.provider.NattableEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StyledElementItemProvider extends EModelElementItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public StyledElementItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_StyledElement_type"); //$NON-NLS-1$
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

		switch (notification.getFeatureID(StyledElement.class)) {
		case NattablestylePackage.STYLED_ELEMENT__STYLES:
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
				(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES,
						NattablestyleFactory.eINSTANCE.createNamedStyle()));

		newChildDescriptors.add
				(createChildParameter
				(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES,
						NattablestyleFactory.eINSTANCE.createFontStyle()));

		newChildDescriptors.add
				(createChildParameter
				(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES,
						NattablestyleFactory.eINSTANCE.createCellTextStyle()));

		newChildDescriptors.add
				(createChildParameter
				(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES,
						NattablestyleFactory.eINSTANCE.createIntValueStyle()));

		newChildDescriptors.add
				(createChildParameter
				(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES,
						NattablestyleFactory.eINSTANCE.createIntListValueStyle()));

		newChildDescriptors.add
				(createChildParameter
				(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES,
						NattablestyleFactory.eINSTANCE.createBooleanValueStyle()));

		newChildDescriptors.add
				(createChildParameter
				(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES,
						NattablestyleFactory.eINSTANCE.createBooleanListValueStyle()));

		newChildDescriptors.add
				(createChildParameter
				(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES,
						NattablestyleFactory.eINSTANCE.createDoubleValueStyle()));

		newChildDescriptors.add
				(createChildParameter
				(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES,
						NattablestyleFactory.eINSTANCE.createDoubleListValueStyle()));

		newChildDescriptors.add
				(createChildParameter
				(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES,
						NattablestyleFactory.eINSTANCE.createStringValueStyle()));

		newChildDescriptors.add
				(createChildParameter
				(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES,
						NattablestyleFactory.eINSTANCE.createStringListValueStyle()));

		newChildDescriptors.add
				(createChildParameter
				(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES,
						NattablestyleFactory.eINSTANCE.createTableDisplayStyle()));
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
