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
import org.eclipse.emf.ecore.provider.EModelElementItemProvider;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.provider.NattableEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FontStyleItemProvider extends EModelElementItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public FontStyleItemProvider(AdapterFactory adapterFactory) {
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

			addFontColorPropertyDescriptor(object);
			addFontNamePropertyDescriptor(object);
			addFontHeightPropertyDescriptor(object);
			addBoldPropertyDescriptor(object);
			addItalicPropertyDescriptor(object);
			addUnderlinePropertyDescriptor(object);
			addStrikeThroughPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Font Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addFontColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_FontStyle_fontColor_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_FontStyle_fontColor_feature", "_UI_FontStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattablestylePackage.Literals.FONT_STYLE__FONT_COLOR,
						true,
						false,
						false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
						null,
						null));
	}

	/**
	 * This adds a property descriptor for the Font Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addFontNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_FontStyle_fontName_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_FontStyle_fontName_feature", "_UI_FontStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattablestylePackage.Literals.FONT_STYLE__FONT_NAME,
						true,
						false,
						false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null,
						null));
	}

	/**
	 * This adds a property descriptor for the Font Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addFontHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_FontStyle_fontHeight_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_FontStyle_fontHeight_feature", "_UI_FontStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattablestylePackage.Literals.FONT_STYLE__FONT_HEIGHT,
						true,
						false,
						false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
						null,
						null));
	}

	/**
	 * This adds a property descriptor for the Bold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addBoldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_FontStyle_bold_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_FontStyle_bold_feature", "_UI_FontStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattablestylePackage.Literals.FONT_STYLE__BOLD,
						true,
						false,
						false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
						null,
						null));
	}

	/**
	 * This adds a property descriptor for the Italic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addItalicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_FontStyle_italic_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_FontStyle_italic_feature", "_UI_FontStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattablestylePackage.Literals.FONT_STYLE__ITALIC,
						true,
						false,
						false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
						null,
						null));
	}

	/**
	 * This adds a property descriptor for the Underline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addUnderlinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_FontStyle_underline_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_FontStyle_underline_feature", "_UI_FontStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattablestylePackage.Literals.FONT_STYLE__UNDERLINE,
						true,
						false,
						false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
						null,
						null));
	}

	/**
	 * This adds a property descriptor for the Strike Through feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addStrikeThroughPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
				(createItemPropertyDescriptor
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_FontStyle_strikeThrough_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_FontStyle_strikeThrough_feature", "_UI_FontStyle_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						NattablestylePackage.Literals.FONT_STYLE__STRIKE_THROUGH,
						true,
						false,
						false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
						null,
						null));
	}

	/**
	 * This returns FontStyle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FontStyle")); //$NON-NLS-1$
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
		String label = ((FontStyle) object).getFontName();
		return label == null || label.length() == 0 ?
				getString("_UI_FontStyle_type") : //$NON-NLS-1$
				getString("_UI_FontStyle_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(FontStyle.class)) {
		case NattablestylePackage.FONT_STYLE__FONT_COLOR:
		case NattablestylePackage.FONT_STYLE__FONT_NAME:
		case NattablestylePackage.FONT_STYLE__FONT_HEIGHT:
		case NattablestylePackage.FONT_STYLE__BOLD:
		case NattablestylePackage.FONT_STYLE__ITALIC:
		case NattablestylePackage.FONT_STYLE__UNDERLINE:
		case NattablestylePackage.FONT_STYLE__STRIKE_THROUGH:
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
