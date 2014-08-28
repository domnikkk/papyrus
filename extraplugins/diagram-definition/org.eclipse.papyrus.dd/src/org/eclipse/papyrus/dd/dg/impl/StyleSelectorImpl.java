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
package org.eclipse.papyrus.dd.dg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.ElementKind;
import org.eclipse.papyrus.dd.dg.StyleSelector;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Style Selector</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleSelectorImpl#getKind <em>Kind</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleSelectorImpl#getClasses <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleSelectorImpl extends MinimalEObjectImpl.Container implements StyleSelector {

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ElementKind KIND_EDEFAULT = ElementKind.CANVAS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ElementKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The cached value of the '{@link #getClasses() <em>Class</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected StyleSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.STYLE_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ElementKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setKind(ElementKind newKind) {
		ElementKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.STYLE_SELECTOR__KIND, oldKind, kind, !oldKindESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void unsetKind() {
		ElementKind oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE_SELECTOR__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<String> getClasses() {
		if (classes == null) {
			classes = new EDataTypeUniqueEList<String>(String.class, this, DGPackage.STYLE_SELECTOR__CLASS);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DGPackage.STYLE_SELECTOR__KIND:
			return getKind();
		case DGPackage.STYLE_SELECTOR__CLASS:
			return getClasses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DGPackage.STYLE_SELECTOR__KIND:
			setKind((ElementKind) newValue);
			return;
		case DGPackage.STYLE_SELECTOR__CLASS:
			getClasses().clear();
			getClasses().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DGPackage.STYLE_SELECTOR__KIND:
			unsetKind();
			return;
		case DGPackage.STYLE_SELECTOR__CLASS:
			getClasses().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DGPackage.STYLE_SELECTOR__KIND:
			return isSetKind();
		case DGPackage.STYLE_SELECTOR__CLASS:
			return classes != null && !classes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: ");
		if (kindESet) {
			result.append(kind);
		} else {
			result.append("<unset>");
		}
		result.append(", class: ");
		result.append(classes);
		result.append(')');
		return result.toString();
	}
} // StyleSelectorImpl
