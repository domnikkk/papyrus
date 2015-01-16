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
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean List Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.BooleanListValueStyleImpl#getBooleanListValue <em>Boolean List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanListValueStyleImpl extends NamedStyleImpl implements BooleanListValueStyle {
	/**
	 * The cached value of the '{@link #getBooleanListValue() <em>Boolean List Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBooleanListValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> booleanListValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected BooleanListValueStyleImpl() {
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
		return NattablestylePackage.Literals.BOOLEAN_LIST_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Boolean> getBooleanListValue() {
		if (booleanListValue == null) {
			booleanListValue = new EDataTypeEList<Boolean>(Boolean.class, this, NattablestylePackage.BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE);
		}
		return booleanListValue;
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
		case NattablestylePackage.BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE:
			return getBooleanListValue();
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
		case NattablestylePackage.BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE:
			getBooleanListValue().clear();
			getBooleanListValue().addAll((Collection<? extends Boolean>) newValue);
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
		case NattablestylePackage.BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE:
			getBooleanListValue().clear();
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
		case NattablestylePackage.BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE:
			return booleanListValue != null && !booleanListValue.isEmpty();
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
		result.append(" (booleanListValue: "); //$NON-NLS-1$
		result.append(booleanListValue);
		result.append(')');
		return result.toString();
	}

} // BooleanListValueStyleImpl
