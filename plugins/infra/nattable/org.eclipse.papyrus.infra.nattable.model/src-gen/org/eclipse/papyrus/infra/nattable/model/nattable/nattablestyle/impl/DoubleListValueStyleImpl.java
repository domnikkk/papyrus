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

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double List Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.DoubleListValueStyleImpl#getDoubleListValue <em>Double List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoubleListValueStyleImpl extends NamedStyleImpl implements DoubleListValueStyle {
	/**
	 * The cached value of the '{@link #getDoubleListValue() <em>Double List Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDoubleListValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> doubleListValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DoubleListValueStyleImpl() {
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
		return NattablestylePackage.Literals.DOUBLE_LIST_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Double> getDoubleListValue() {
		if (doubleListValue == null) {
			doubleListValue = new EDataTypeEList<Double>(Double.class, this, NattablestylePackage.DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE);
		}
		return doubleListValue;
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
		case NattablestylePackage.DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE:
			return getDoubleListValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NattablestylePackage.DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE:
			getDoubleListValue().clear();
			getDoubleListValue().addAll((Collection<? extends Double>) newValue);
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
		case NattablestylePackage.DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE:
			getDoubleListValue().clear();
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
		case NattablestylePackage.DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE:
			return doubleListValue != null && !doubleListValue.isEmpty();
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
		result.append(" (doubleListValue: "); //$NON-NLS-1$
		result.append(doubleListValue);
		result.append(')');
		return result.toString();
	}

} // DoubleListValueStyleImpl
