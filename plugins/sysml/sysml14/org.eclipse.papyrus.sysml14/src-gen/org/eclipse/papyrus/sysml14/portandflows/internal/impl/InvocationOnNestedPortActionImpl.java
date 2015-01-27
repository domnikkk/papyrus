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

import org.eclipse.papyrus.sysml14.portandflows.InvocationOnNestedPortAction;
import org.eclipse.papyrus.sysml14.portandflows.PortandflowsPackage;

import org.eclipse.uml2.uml.InvocationAction;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation On Nested Port Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.InvocationOnNestedPortActionImpl#getBase_InvocationAction <em>Base Invocation Action</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.InvocationOnNestedPortActionImpl#getOnNestedPort <em>On Nested Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvocationOnNestedPortActionImpl extends ElementPropertyPathImpl implements InvocationOnNestedPortAction {
	/**
	 * The cached value of the '{@link #getBase_InvocationAction() <em>Base Invocation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_InvocationAction()
	 * @generated
	 * @ordered
	 */
	protected InvocationAction base_InvocationAction;

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
	protected InvocationOnNestedPortActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortandflowsPackage.Literals.INVOCATION_ON_NESTED_PORT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationAction getBase_InvocationAction() {
		if (base_InvocationAction != null && base_InvocationAction.eIsProxy()) {
			InternalEObject oldBase_InvocationAction = (InternalEObject)base_InvocationAction;
			base_InvocationAction = (InvocationAction)eResolveProxy(oldBase_InvocationAction);
			if (base_InvocationAction != oldBase_InvocationAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortandflowsPackage.INVOCATION_ON_NESTED_PORT_ACTION__BASE_INVOCATION_ACTION, oldBase_InvocationAction, base_InvocationAction));
			}
		}
		return base_InvocationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationAction basicGetBase_InvocationAction() {
		return base_InvocationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_InvocationAction(InvocationAction newBase_InvocationAction) {
		InvocationAction oldBase_InvocationAction = base_InvocationAction;
		base_InvocationAction = newBase_InvocationAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortandflowsPackage.INVOCATION_ON_NESTED_PORT_ACTION__BASE_INVOCATION_ACTION, oldBase_InvocationAction, base_InvocationAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOnNestedPort() {
		if (onNestedPort == null) {
			onNestedPort = new EObjectResolvingEList<Port>(Port.class, this, PortandflowsPackage.INVOCATION_ON_NESTED_PORT_ACTION__ON_NESTED_PORT);
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
			case PortandflowsPackage.INVOCATION_ON_NESTED_PORT_ACTION__BASE_INVOCATION_ACTION:
				if (resolve) return getBase_InvocationAction();
				return basicGetBase_InvocationAction();
			case PortandflowsPackage.INVOCATION_ON_NESTED_PORT_ACTION__ON_NESTED_PORT:
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
			case PortandflowsPackage.INVOCATION_ON_NESTED_PORT_ACTION__BASE_INVOCATION_ACTION:
				setBase_InvocationAction((InvocationAction)newValue);
				return;
			case PortandflowsPackage.INVOCATION_ON_NESTED_PORT_ACTION__ON_NESTED_PORT:
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
			case PortandflowsPackage.INVOCATION_ON_NESTED_PORT_ACTION__BASE_INVOCATION_ACTION:
				setBase_InvocationAction((InvocationAction)null);
				return;
			case PortandflowsPackage.INVOCATION_ON_NESTED_PORT_ACTION__ON_NESTED_PORT:
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
			case PortandflowsPackage.INVOCATION_ON_NESTED_PORT_ACTION__BASE_INVOCATION_ACTION:
				return base_InvocationAction != null;
			case PortandflowsPackage.INVOCATION_ON_NESTED_PORT_ACTION__ON_NESTED_PORT:
				return onNestedPort != null && !onNestedPort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InvocationOnNestedPortActionImpl
