/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.sysml14.deprecatedelements.Allocated;
import org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.AllocatedImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.AllocatedImpl#getAllocatedFrom <em>Allocated From</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.AllocatedImpl#getAllocatedTo <em>Allocated To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocatedImpl extends MinimalEObjectImpl.Container implements Allocated {
	/**
	 * The cached value of the '{@link #getBase_NamedElement() <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement base_NamedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeprecatedelementsPackage.Literals.ALLOCATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getBase_NamedElement() {
		if (base_NamedElement != null && base_NamedElement.eIsProxy()) {
			InternalEObject oldBase_NamedElement = (InternalEObject)base_NamedElement;
			base_NamedElement = (NamedElement)eResolveProxy(oldBase_NamedElement);
			if (base_NamedElement != oldBase_NamedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeprecatedelementsPackage.ALLOCATED__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
			}
		}
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetBase_NamedElement() {
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_NamedElement(NamedElement newBase_NamedElement) {
		NamedElement oldBase_NamedElement = base_NamedElement;
		base_NamedElement = newBase_NamedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeprecatedelementsPackage.ALLOCATED__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getAllocatedFrom() {
		// TODO: implement this method to return the 'Allocated From' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getAllocatedFrom(String name) {
		return getAllocatedFrom(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getAllocatedFrom(String name, boolean ignoreCase, EClass eClass) {
		allocatedFromLoop: for (NamedElement allocatedFrom : getAllocatedFrom()) {
			if (eClass != null && !eClass.isInstance(allocatedFrom))
				continue allocatedFromLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(allocatedFrom.getName()) : name.equals(allocatedFrom.getName())))
				continue allocatedFromLoop;
			return allocatedFrom;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getAllocatedTo() {
		// TODO: implement this method to return the 'Allocated To' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getAllocatedTo(String name) {
		return getAllocatedTo(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getAllocatedTo(String name, boolean ignoreCase, EClass eClass) {
		allocatedToLoop: for (NamedElement allocatedTo : getAllocatedTo()) {
			if (eClass != null && !eClass.isInstance(allocatedTo))
				continue allocatedToLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(allocatedTo.getName()) : name.equals(allocatedTo.getName())))
				continue allocatedToLoop;
			return allocatedTo;
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
			case DeprecatedelementsPackage.ALLOCATED__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
			case DeprecatedelementsPackage.ALLOCATED__ALLOCATED_FROM:
				return getAllocatedFrom();
			case DeprecatedelementsPackage.ALLOCATED__ALLOCATED_TO:
				return getAllocatedTo();
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
			case DeprecatedelementsPackage.ALLOCATED__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
				return;
			case DeprecatedelementsPackage.ALLOCATED__ALLOCATED_FROM:
				getAllocatedFrom().clear();
				getAllocatedFrom().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case DeprecatedelementsPackage.ALLOCATED__ALLOCATED_TO:
				getAllocatedTo().clear();
				getAllocatedTo().addAll((Collection<? extends NamedElement>)newValue);
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
			case DeprecatedelementsPackage.ALLOCATED__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
				return;
			case DeprecatedelementsPackage.ALLOCATED__ALLOCATED_FROM:
				getAllocatedFrom().clear();
				return;
			case DeprecatedelementsPackage.ALLOCATED__ALLOCATED_TO:
				getAllocatedTo().clear();
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
			case DeprecatedelementsPackage.ALLOCATED__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
			case DeprecatedelementsPackage.ALLOCATED__ALLOCATED_FROM:
				return !getAllocatedFrom().isEmpty();
			case DeprecatedelementsPackage.ALLOCATED__ALLOCATED_TO:
				return !getAllocatedTo().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllocatedImpl
