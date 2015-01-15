/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.portandflows.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.sysml14.blocks.internal.impl.ElementPropertyPathImpl;

import org.eclipse.papyrus.sysml14.portandflows.PortandflowsPackage;
import org.eclipse.papyrus.sysml14.portandflows.TriggerOnNestedPort;

import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger On Nested Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.TriggerOnNestedPortImpl#getBase_Trigger <em>Base Trigger</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.TriggerOnNestedPortImpl#getOnNestedPort <em>On Nested Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerOnNestedPortImpl extends ElementPropertyPathImpl implements TriggerOnNestedPort {
	/**
	 * The cached value of the '{@link #getBase_Trigger() <em>Base Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Trigger()
	 * @generated
	 * @ordered
	 */
	protected Trigger base_Trigger;

	/**
	 * The cached value of the '{@link #getOnNestedPort() <em>On Nested Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnNestedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> onNestedPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerOnNestedPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortandflowsPackage.Literals.TRIGGER_ON_NESTED_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getBase_Trigger() {
		if (base_Trigger != null && base_Trigger.eIsProxy()) {
			InternalEObject oldBase_Trigger = (InternalEObject)base_Trigger;
			base_Trigger = (Trigger)eResolveProxy(oldBase_Trigger);
			if (base_Trigger != oldBase_Trigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortandflowsPackage.TRIGGER_ON_NESTED_PORT__BASE_TRIGGER, oldBase_Trigger, base_Trigger));
			}
		}
		return base_Trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger basicGetBase_Trigger() {
		return base_Trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Trigger(Trigger newBase_Trigger) {
		Trigger oldBase_Trigger = base_Trigger;
		base_Trigger = newBase_Trigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortandflowsPackage.TRIGGER_ON_NESTED_PORT__BASE_TRIGGER, oldBase_Trigger, base_Trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOnNestedPort() {
		if (onNestedPort == null) {
			onNestedPort = new EObjectResolvingEList<Port>(Port.class, this, PortandflowsPackage.TRIGGER_ON_NESTED_PORT__ON_NESTED_PORT);
		}
		return onNestedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOnNestedPort(String name, Type type) {
		return getOnNestedPort(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOnNestedPort(String name, Type type, boolean ignoreCase) {
		onNestedPortLoop: for (Port onNestedPort : getOnNestedPort()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(onNestedPort.getName()) : name.equals(onNestedPort.getName())))
				continue onNestedPortLoop;
			if (type != null && !type.equals(onNestedPort.getType()))
				continue onNestedPortLoop;
			return onNestedPort;
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
			case PortandflowsPackage.TRIGGER_ON_NESTED_PORT__BASE_TRIGGER:
				if (resolve) return getBase_Trigger();
				return basicGetBase_Trigger();
			case PortandflowsPackage.TRIGGER_ON_NESTED_PORT__ON_NESTED_PORT:
				return getOnNestedPort();
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
			case PortandflowsPackage.TRIGGER_ON_NESTED_PORT__BASE_TRIGGER:
				setBase_Trigger((Trigger)newValue);
				return;
			case PortandflowsPackage.TRIGGER_ON_NESTED_PORT__ON_NESTED_PORT:
				getOnNestedPort().clear();
				getOnNestedPort().addAll((Collection<? extends Port>)newValue);
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
			case PortandflowsPackage.TRIGGER_ON_NESTED_PORT__BASE_TRIGGER:
				setBase_Trigger((Trigger)null);
				return;
			case PortandflowsPackage.TRIGGER_ON_NESTED_PORT__ON_NESTED_PORT:
				getOnNestedPort().clear();
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
			case PortandflowsPackage.TRIGGER_ON_NESTED_PORT__BASE_TRIGGER:
				return base_Trigger != null;
			case PortandflowsPackage.TRIGGER_ON_NESTED_PORT__ON_NESTED_PORT:
				return onNestedPort != null && !onNestedPort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TriggerOnNestedPortImpl
