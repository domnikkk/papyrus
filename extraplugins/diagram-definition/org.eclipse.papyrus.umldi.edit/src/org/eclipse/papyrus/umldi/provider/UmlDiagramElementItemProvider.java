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
package org.eclipse.papyrus.umldi.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.papyrus.dd.di.provider.DiagramElementItemProvider;

import org.eclipse.papyrus.umldi.UMLDIFactory;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;

/**
 * This is the item provider adapter for a {@link org.eclipse.papyrus.umldi.UmlDiagramElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlDiagramElementItemProvider
	extends DiagramElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IItemColorProvider,
		IItemFontProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlDiagramElementItemProvider(AdapterFactory adapterFactory) {
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

			addUmlModelElementPropertyDescriptor(object);
			addSharedUmlStylePropertyDescriptor(object);
			addTargetUmlEdgePropertyDescriptor(object);
			addSourceUmlEdgePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uml Model Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUmlModelElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UmlDiagramElement_umlModelElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UmlDiagramElement_umlModelElement_feature", "_UI_UmlDiagramElement_type"),
				 UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shared Uml Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSharedUmlStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UmlDiagramElement_sharedUmlStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UmlDiagramElement_sharedUmlStyle_feature", "_UI_UmlDiagramElement_type"),
				 UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Uml Edge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetUmlEdgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UmlDiagramElement_targetUmlEdge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UmlDiagramElement_targetUmlEdge_feature", "_UI_UmlDiagramElement_type"),
				 UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Uml Edge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceUmlEdgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UmlDiagramElement_sourceUmlEdge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UmlDiagramElement_sourceUmlEdge_feature", "_UI_UmlDiagramElement_type"),
				 UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE,
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
			childrenFeatures.add(UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE);
			childrenFeatures.add(UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_UmlDiagramElement_type");
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

		switch (notification.getFeatureID(UmlDiagramElement.class)) {
			case UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE:
			case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT:
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
				(UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE,
				 UMLDIFactory.eINSTANCE.createUmlStyle()));

		newChildDescriptors.add
			(createChildParameter
				(UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT,
				 UMLDIFactory.eINSTANCE.createUmlShape()));

		newChildDescriptors.add
			(createChildParameter
				(UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT,
				 UMLDIFactory.eINSTANCE.createUmlDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT,
				 UMLDIFactory.eINSTANCE.createUmlEdge()));

		newChildDescriptors.add
			(createChildParameter
				(UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT,
				 UMLDIFactory.eINSTANCE.createUmlCompartment()));

		newChildDescriptors.add
			(createChildParameter
				(UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT,
				 UMLDIFactory.eINSTANCE.createUmlLabel()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UMLDIEditPlugin.INSTANCE;
	}

}
