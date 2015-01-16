/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.blocks.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml14.blocks.NestedConnectorEnd;

import org.eclipse.uml2.uml.ConnectorEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Connector End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.NestedConnectorEndImpl#getBase_ConnectorEnd <em>Base Connector End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NestedConnectorEndImpl extends ElementPropertyPathImpl implements NestedConnectorEnd {
	/**
	 * The cached value of the '{@link #getBase_ConnectorEnd() <em>Base Connector End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ConnectorEnd()
	 * @generated
	 * @ordered
	 */
	protected ConnectorEnd base_ConnectorEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedConnectorEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlocksPackage.Literals.NESTED_CONNECTOR_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd getBase_ConnectorEnd() {
		if (base_ConnectorEnd != null && base_ConnectorEnd.eIsProxy()) {
			InternalEObject oldBase_ConnectorEnd = (InternalEObject)base_ConnectorEnd;
			base_ConnectorEnd = (ConnectorEnd)eResolveProxy(oldBase_ConnectorEnd);
			if (base_ConnectorEnd != oldBase_ConnectorEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlocksPackage.NESTED_CONNECTOR_END__BASE_CONNECTOR_END, oldBase_ConnectorEnd, base_ConnectorEnd));
			}
		}
		return base_ConnectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd basicGetBase_ConnectorEnd() {
		return base_ConnectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ConnectorEnd(ConnectorEnd newBase_ConnectorEnd) {
		ConnectorEnd oldBase_ConnectorEnd = base_ConnectorEnd;
		base_ConnectorEnd = newBase_ConnectorEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlocksPackage.NESTED_CONNECTOR_END__BASE_CONNECTOR_END, oldBase_ConnectorEnd, base_ConnectorEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlocksPackage.NESTED_CONNECTOR_END__BASE_CONNECTOR_END:
				if (resolve) return getBase_ConnectorEnd();
				return basicGetBase_ConnectorEnd();
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
			case BlocksPackage.NESTED_CONNECTOR_END__BASE_CONNECTOR_END:
				setBase_ConnectorEnd((ConnectorEnd)newValue);
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
			case BlocksPackage.NESTED_CONNECTOR_END__BASE_CONNECTOR_END:
				setBase_ConnectorEnd((ConnectorEnd)null);
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
			case BlocksPackage.NESTED_CONNECTOR_END__BASE_CONNECTOR_END:
				return base_ConnectorEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //NestedConnectorEndImpl
