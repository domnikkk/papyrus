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

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.dd.dc.Point;

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Text;
import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Text</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.TextImpl#getData <em>Data</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.TextImpl#getPosition <em>Position
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TextImpl extends GraphicalElementImpl implements Text {
	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Point position;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.TEXT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.TEXT__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Point getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPosition(Point newPosition,
			NotificationChain msgs) {
		Point oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DGPackage.TEXT__POSITION, oldPosition,
					newPosition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPosition(Point newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject) position).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DGPackage.TEXT__POSITION,
						null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject) newPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DGPackage.TEXT__POSITION,
						null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.TEXT__POSITION, newPosition, newPosition));
	}

	/**
	 * The cached validation expression for the '
	 * {@link #dataCannotBeEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Data Cannot Be Empty</em>}' invariant operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #dataCannotBeEmpty(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_CANNOT_BE_EMPTY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "data->notEmpty() implies data.size() > 0";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean dataCannotBeEmpty(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DGValidator
				.validate(
						DGPackage.Literals.TEXT,
						this,
						diagnostics,
						context,
						"http://www.eclipse.org/emf/2002/Ecore/OCL",
						DGPackage.Literals.TEXT___DATA_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP,
						DATA_CANNOT_BE_EMPTY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
						Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE,
						DGValidator.TEXT__DATA_CANNOT_BE_EMPTY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DGPackage.TEXT__POSITION:
			return basicSetPosition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DGPackage.TEXT__DATA:
			return getData();
		case DGPackage.TEXT__POSITION:
			return getPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DGPackage.TEXT__DATA:
			setData((String) newValue);
			return;
		case DGPackage.TEXT__POSITION:
			setPosition((Point) newValue);
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
		case DGPackage.TEXT__DATA:
			setData(DATA_EDEFAULT);
			return;
		case DGPackage.TEXT__POSITION:
			setPosition((Point) null);
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
		case DGPackage.TEXT__DATA:
			return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT
					.equals(data);
		case DGPackage.TEXT__POSITION:
			return position != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case DGPackage.TEXT___DATA_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP:
			return dataCannotBeEmpty((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} // TextImpl
