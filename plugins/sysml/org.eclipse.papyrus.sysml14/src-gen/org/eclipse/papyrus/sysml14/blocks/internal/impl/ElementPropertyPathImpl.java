/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.blocks.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml14.blocks.ElementPropertyPath;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Property Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.ElementPropertyPathImpl#getBase_Element <em>Base Element</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.ElementPropertyPathImpl#getPropertyPath <em>Property Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementPropertyPathImpl extends MinimalEObjectImpl.Container implements ElementPropertyPath {
	/**
	 * The cached value of the '{@link #getBase_Element() <em>Base Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Element()
	 * @generated
	 * @ordered
	 */
	protected Element base_Element;

	/**
	 * The cached value of the '{@link #getPropertyPath() <em>Property Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> propertyPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementPropertyPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlocksPackage.Literals.ELEMENT_PROPERTY_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getBase_Element() {
		if (base_Element != null && base_Element.eIsProxy()) {
			InternalEObject oldBase_Element = (InternalEObject)base_Element;
			base_Element = (Element)eResolveProxy(oldBase_Element);
			if (base_Element != oldBase_Element) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlocksPackage.ELEMENT_PROPERTY_PATH__BASE_ELEMENT, oldBase_Element, base_Element));
			}
		}
		return base_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetBase_Element() {
		return base_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Element(Element newBase_Element) {
		Element oldBase_Element = base_Element;
		base_Element = newBase_Element;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlocksPackage.ELEMENT_PROPERTY_PATH__BASE_ELEMENT, oldBase_Element, base_Element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getPropertyPath() {
		if (propertyPath == null) {
			propertyPath = new EObjectResolvingEList<Property>(Property.class, this, BlocksPackage.ELEMENT_PROPERTY_PATH__PROPERTY_PATH);
		}
		return propertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPropertyPath(String name, Type type) {
		return getPropertyPath(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPropertyPath(String name, Type type, boolean ignoreCase, EClass eClass) {
		propertyPathLoop: for (Property propertyPath : getPropertyPath()) {
			if (eClass != null && !eClass.isInstance(propertyPath))
				continue propertyPathLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(propertyPath.getName()) : name.equals(propertyPath.getName())))
				continue propertyPathLoop;
			if (type != null && !type.equals(propertyPath.getType()))
				continue propertyPathLoop;
			return propertyPath;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlocksPackage.ELEMENT_PROPERTY_PATH__BASE_ELEMENT:
				if (resolve) return getBase_Element();
				return basicGetBase_Element();
			case BlocksPackage.ELEMENT_PROPERTY_PATH__PROPERTY_PATH:
				return getPropertyPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BlocksPackage.ELEMENT_PROPERTY_PATH__BASE_ELEMENT:
				setBase_Element((Element)newValue);
				return;
			case BlocksPackage.ELEMENT_PROPERTY_PATH__PROPERTY_PATH:
				getPropertyPath().clear();
				getPropertyPath().addAll((Collection<? extends Property>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BlocksPackage.ELEMENT_PROPERTY_PATH__BASE_ELEMENT:
				setBase_Element((Element)null);
				return;
			case BlocksPackage.ELEMENT_PROPERTY_PATH__PROPERTY_PATH:
				getPropertyPath().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BlocksPackage.ELEMENT_PROPERTY_PATH__BASE_ELEMENT:
				return base_Element != null;
			case BlocksPackage.ELEMENT_PROPERTY_PATH__PROPERTY_PATH:
				return propertyPath != null && !propertyPath.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementPropertyPathImpl
