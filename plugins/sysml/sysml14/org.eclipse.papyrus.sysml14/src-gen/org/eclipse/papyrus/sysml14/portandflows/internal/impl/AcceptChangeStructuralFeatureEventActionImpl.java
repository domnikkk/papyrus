/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.portandflows.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.sysml14.portandflows.AcceptChangeStructuralFeatureEventAction;
import org.eclipse.papyrus.sysml14.portandflows.PortandflowsPackage;

import org.eclipse.uml2.uml.AcceptEventAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Change Structural Feature Event Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.AcceptChangeStructuralFeatureEventActionImpl#getBase_AcceptEventAction <em>Base Accept Event Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceptChangeStructuralFeatureEventActionImpl extends MinimalEObjectImpl.Container implements AcceptChangeStructuralFeatureEventAction {
	/**
	 * The cached value of the '{@link #getBase_AcceptEventAction() <em>Base Accept Event Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_AcceptEventAction()
	 * @generated
	 * @ordered
	 */
	protected AcceptEventAction base_AcceptEventAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptChangeStructuralFeatureEventActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortandflowsPackage.Literals.ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction getBase_AcceptEventAction() {
		if (base_AcceptEventAction != null && base_AcceptEventAction.eIsProxy()) {
			InternalEObject oldBase_AcceptEventAction = (InternalEObject)base_AcceptEventAction;
			base_AcceptEventAction = (AcceptEventAction)eResolveProxy(oldBase_AcceptEventAction);
			if (base_AcceptEventAction != oldBase_AcceptEventAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortandflowsPackage.ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION__BASE_ACCEPT_EVENT_ACTION, oldBase_AcceptEventAction, base_AcceptEventAction));
			}
		}
		return base_AcceptEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction basicGetBase_AcceptEventAction() {
		return base_AcceptEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_AcceptEventAction(AcceptEventAction newBase_AcceptEventAction) {
		AcceptEventAction oldBase_AcceptEventAction = base_AcceptEventAction;
		base_AcceptEventAction = newBase_AcceptEventAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortandflowsPackage.ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION__BASE_ACCEPT_EVENT_ACTION, oldBase_AcceptEventAction, base_AcceptEventAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortandflowsPackage.ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION__BASE_ACCEPT_EVENT_ACTION:
				if (resolve) return getBase_AcceptEventAction();
				return basicGetBase_AcceptEventAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PortandflowsPackage.ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION__BASE_ACCEPT_EVENT_ACTION:
				setBase_AcceptEventAction((AcceptEventAction)newValue);
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
			case PortandflowsPackage.ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION__BASE_ACCEPT_EVENT_ACTION:
				setBase_AcceptEventAction((AcceptEventAction)null);
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
			case PortandflowsPackage.ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION__BASE_ACCEPT_EVENT_ACTION:
				return base_AcceptEventAction != null;
		}
		return super.eIsSet(featureID);
	}

} //AcceptChangeStructuralFeatureEventActionImpl
