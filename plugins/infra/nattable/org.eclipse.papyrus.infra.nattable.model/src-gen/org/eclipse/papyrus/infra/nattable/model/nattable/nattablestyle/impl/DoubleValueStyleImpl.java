/**
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.DoubleValueStyleImpl#getDoubleValue <em>Double Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoubleValueStyleImpl extends NamedStyleImpl implements DoubleValueStyle {
	/**
	 * The default value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDoubleValue()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUBLE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDoubleValue()
	 * @generated
	 * @ordered
	 */
	protected double doubleValue = DOUBLE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DoubleValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NattablestylePackage.Literals.DOUBLE_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double getDoubleValue() {
		return doubleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDoubleValue(double newDoubleValue) {
		double oldDoubleValue = doubleValue;
		doubleValue = newDoubleValue;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NattablestylePackage.DOUBLE_VALUE_STYLE__DOUBLE_VALUE, oldDoubleValue, doubleValue));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NattablestylePackage.DOUBLE_VALUE_STYLE__DOUBLE_VALUE:
			return getDoubleValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NattablestylePackage.DOUBLE_VALUE_STYLE__DOUBLE_VALUE:
			setDoubleValue((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case NattablestylePackage.DOUBLE_VALUE_STYLE__DOUBLE_VALUE:
			setDoubleValue(DOUBLE_VALUE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NattablestylePackage.DOUBLE_VALUE_STYLE__DOUBLE_VALUE:
			return doubleValue != DOUBLE_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (doubleValue: "); //$NON-NLS-1$
		result.append(doubleValue);
		result.append(')');
		return result.toString();
	}

} // DoubleValueStyleImpl
