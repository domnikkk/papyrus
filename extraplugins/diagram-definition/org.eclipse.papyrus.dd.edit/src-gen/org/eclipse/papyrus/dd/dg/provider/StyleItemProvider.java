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
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.papyrus.dd.dg.DGFactory;
import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Style;
import org.eclipse.papyrus.dd.provider.DDEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.dd.dg.Style} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class StyleItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemColorProvider, IItemFontProvider {

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StyleItemProvider(AdapterFactory adapterFactory) {
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
		if(itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);
			addFillPropertyDescriptor(object);
			addFillOpacityPropertyDescriptor(object);
			addStrokePropertyDescriptor(object);
			addStrokeWidthPropertyDescriptor(object);
			addStrokeOpacityPropertyDescriptor(object);
			addStrokeDashLengthPropertyDescriptor(object);
			addFontSizePropertyDescriptor(object);
			addFontNamePropertyDescriptor(object);
			addFontItalicPropertyDescriptor(object);
			addFontBoldPropertyDescriptor(object);
			addFontDecorationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Fill feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFillPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Style_fill_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Style_fill_feature", "_UI_Style_type"), DGPackage.Literals.STYLE__FILL, true, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Fill Opacity feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFillOpacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Style_fillOpacity_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Style_fillOpacity_feature", "_UI_Style_type"), DGPackage.Literals.STYLE__FILL_OPACITY, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stroke feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStrokePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Style_stroke_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Style_stroke_feature", "_UI_Style_type"), DGPackage.Literals.STYLE__STROKE, true, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Stroke Width feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStrokeWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Style_strokeWidth_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Style_strokeWidth_feature", "_UI_Style_type"), DGPackage.Literals.STYLE__STROKE_WIDTH, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stroke Opacity feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStrokeOpacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Style_strokeOpacity_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Style_strokeOpacity_feature", "_UI_Style_type"), DGPackage.Literals.STYLE__STROKE_OPACITY, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stroke Dash Length feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStrokeDashLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Style_strokeDashLength_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Style_strokeDashLength_feature", "_UI_Style_type"), DGPackage.Literals.STYLE__STROKE_DASH_LENGTH, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Font Size feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFontSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Style_fontSize_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Style_fontSize_feature", "_UI_Style_type"), DGPackage.Literals.STYLE__FONT_SIZE, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Font Name feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFontNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Style_fontName_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Style_fontName_feature", "_UI_Style_type"), DGPackage.Literals.STYLE__FONT_NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Font Italic feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFontItalicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Style_fontItalic_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Style_fontItalic_feature", "_UI_Style_type"), DGPackage.Literals.STYLE__FONT_ITALIC, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Font Bold feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFontBoldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Style_fontBold_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Style_fontBold_feature", "_UI_Style_type"), DGPackage.Literals.STYLE__FONT_BOLD, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Font Decoration feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFontDecorationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Style_fontDecoration_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Style_fontDecoration_feature", "_UI_Style_type"), DGPackage.Literals.STYLE__FONT_DECORATION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if(childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DGPackage.Literals.STYLE__FILL);
			childrenFeatures.add(DGPackage.Literals.STYLE__STROKE);
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
	 * This returns Style.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Style"));
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
		String label = ((Style)object).getFontName();
		return label == null || label.length() == 0 ? getString("_UI_Style_type") : getString("_UI_Style_type") + " " + label;
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
		switch(notification.getFeatureID(Style.class)) {
		case DGPackage.STYLE__FILL_OPACITY:
		case DGPackage.STYLE__STROKE_WIDTH:
		case DGPackage.STYLE__STROKE_OPACITY:
		case DGPackage.STYLE__STROKE_DASH_LENGTH:
		case DGPackage.STYLE__FONT_SIZE:
		case DGPackage.STYLE__FONT_NAME:
		case DGPackage.STYLE__FONT_ITALIC:
		case DGPackage.STYLE__FONT_BOLD:
		case DGPackage.STYLE__FONT_DECORATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DGPackage.STYLE__FILL:
		case DGPackage.STYLE__STROKE:
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
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.STYLE__FILL, DGFactory.eINSTANCE.createPaint()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.STYLE__STROKE, DGFactory.eINSTANCE.createPaint()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;
		boolean qualify = childFeature == DGPackage.Literals.STYLE__FILL || childFeature == DGPackage.Literals.STYLE__STROKE;
		if(qualify) {
			return getString("_UI_CreateChild_text2", new Object[]{ getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DDEditPlugin.INSTANCE;
	}
}
