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

import org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage;
import org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated;

import org.eclipse.papyrus.sysml14.requirements.Requirement;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Related</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.RequirementRelatedImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.RequirementRelatedImpl#getTracedFrom <em>Traced From</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.RequirementRelatedImpl#getSatisfies <em>Satisfies</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.RequirementRelatedImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.RequirementRelatedImpl#getVerifies <em>Verifies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementRelatedImpl extends MinimalEObjectImpl.Container implements RequirementRelated {
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
	protected RequirementRelatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeprecatedelementsPackage.Literals.REQUIREMENT_RELATED;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeprecatedelementsPackage.REQUIREMENT_RELATED__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeprecatedelementsPackage.REQUIREMENT_RELATED__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getTracedFrom() {
		// TODO: implement this method to return the 'Traced From' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getSatisfies() {
		// TODO: implement this method to return the 'Satisfies' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRefines() {
		// TODO: implement this method to return the 'Refines' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getVerifies() {
		// TODO: implement this method to return the 'Verifies' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__TRACED_FROM:
				return getTracedFrom();
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__SATISFIES:
				return getSatisfies();
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__REFINES:
				return getRefines();
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__VERIFIES:
				return getVerifies();
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
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
				return;
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__TRACED_FROM:
				getTracedFrom().clear();
				getTracedFrom().addAll((Collection<? extends Requirement>)newValue);
				return;
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__SATISFIES:
				getSatisfies().clear();
				getSatisfies().addAll((Collection<? extends Requirement>)newValue);
				return;
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__REFINES:
				getRefines().clear();
				getRefines().addAll((Collection<? extends Requirement>)newValue);
				return;
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__VERIFIES:
				getVerifies().clear();
				getVerifies().addAll((Collection<? extends Requirement>)newValue);
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
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
				return;
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__TRACED_FROM:
				getTracedFrom().clear();
				return;
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__SATISFIES:
				getSatisfies().clear();
				return;
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__REFINES:
				getRefines().clear();
				return;
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__VERIFIES:
				getVerifies().clear();
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
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__TRACED_FROM:
				return !getTracedFrom().isEmpty();
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__SATISFIES:
				return !getSatisfies().isEmpty();
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__REFINES:
				return !getRefines().isEmpty();
			case DeprecatedelementsPackage.REQUIREMENT_RELATED__VERIFIES:
				return !getVerifies().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementRelatedImpl
