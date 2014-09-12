/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.profilebase.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.migration.rsa.default_.impl.AbstractConstraintImpl;
import org.eclipse.papyrus.migration.rsa.profilebase.ProfileBasePackage;
import org.eclipse.papyrus.migration.rsa.profilebase.ProfileConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.profilebase.impl.ProfileConstraintImpl#getMessageKey <em>Message Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileConstraintImpl extends AbstractConstraintImpl implements ProfileConstraint {
	/**
	 * The default value of the '{@link #getMessageKey() <em>Message Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMessageKey()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageKey() <em>Message Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMessageKey()
	 * @generated
	 * @ordered
	 */
	protected String messageKey = MESSAGE_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ProfileConstraintImpl() {
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
		return ProfileBasePackage.Literals.PROFILE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getMessageKey() {
		return messageKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMessageKey(String newMessageKey) {
		String oldMessageKey = messageKey;
		messageKey = newMessageKey;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ProfileBasePackage.PROFILE_CONSTRAINT__MESSAGE_KEY, oldMessageKey, messageKey));
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
		case ProfileBasePackage.PROFILE_CONSTRAINT__MESSAGE_KEY:
			return getMessageKey();
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
		case ProfileBasePackage.PROFILE_CONSTRAINT__MESSAGE_KEY:
			setMessageKey((String) newValue);
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
		case ProfileBasePackage.PROFILE_CONSTRAINT__MESSAGE_KEY:
			setMessageKey(MESSAGE_KEY_EDEFAULT);
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
		case ProfileBasePackage.PROFILE_CONSTRAINT__MESSAGE_KEY:
			return MESSAGE_KEY_EDEFAULT == null ? messageKey != null : !MESSAGE_KEY_EDEFAULT.equals(messageKey);
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
		result.append(" (messageKey: ");
		result.append(messageKey);
		result.append(')');
		return result.toString();
	}

} // ProfileConstraintImpl
