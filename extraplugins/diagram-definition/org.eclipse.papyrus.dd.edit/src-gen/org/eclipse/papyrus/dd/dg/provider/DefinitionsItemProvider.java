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
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.papyrus.dd.dg.DGFactory;
import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Definitions;
import org.eclipse.papyrus.dd.provider.DDEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.dd.dg.Definitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DefinitionsItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemColorProvider, IItemFontProvider {

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DefinitionsItemProvider(AdapterFactory adapterFactory) {
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
		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DGPackage.Literals.DEFINITIONS__DEFINITION);
			childrenFeatures.add(DGPackage.Literals.DEFINITIONS__STYLE_SHEET);
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
	 * This returns Definitions.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Definitions"));
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
		return getString("_UI_Definitions_type");
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
		switch(notification.getFeatureID(Definitions.class)) {
		case DGPackage.DEFINITIONS__DEFINITION:
		case DGPackage.DEFINITIONS__STYLE_SHEET:
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
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createGroup()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createCanvas()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createClipPath()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createCircle()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createEllipse()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createImage()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createLine()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createMarker()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createLinearGradient()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createPath()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createPattern()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createPolygon()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createPolyline()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createRadialGradient()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createRectangle()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createRootCanvas()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createText()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__DEFINITION, DGFactory.eINSTANCE.createUse()));
		newChildDescriptors.add(createChildParameter(DGPackage.Literals.DEFINITIONS__STYLE_SHEET, DGFactory.eINSTANCE.createStyleSheet()));
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
