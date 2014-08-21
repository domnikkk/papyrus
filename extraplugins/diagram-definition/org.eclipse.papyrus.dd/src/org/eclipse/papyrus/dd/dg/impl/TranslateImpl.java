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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Translate;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Translate</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.TranslateImpl#getDeltaX <em>Delta X</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.TranslateImpl#getDeltaY <em>Delta Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TranslateImpl extends TransformImpl implements Translate {

	/**
	 * The default value of the '{@link #getDeltaX() <em>Delta X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDeltaX()
	 * @generated
	 * @ordered
	 */
	protected static final double DELTA_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeltaX() <em>Delta X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDeltaX()
	 * @generated
	 * @ordered
	 */
	protected double deltaX = DELTA_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaY() <em>Delta Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDeltaY()
	 * @generated
	 * @ordered
	 */
	protected static final double DELTA_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeltaY() <em>Delta Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDeltaY()
	 * @generated
	 * @ordered
	 */
	protected double deltaY = DELTA_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TranslateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.TRANSLATE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double getDeltaX() {
		return deltaX;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDeltaX(double newDeltaX) {
		double oldDeltaX = deltaX;
		deltaX = newDeltaX;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.TRANSLATE__DELTA_X, oldDeltaX, deltaX));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double getDeltaY() {
		return deltaY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDeltaY(double newDeltaY) {
		double oldDeltaY = deltaY;
		deltaY = newDeltaY;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.TRANSLATE__DELTA_Y, oldDeltaY, deltaY));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DGPackage.TRANSLATE__DELTA_X:
			return getDeltaX();
		case DGPackage.TRANSLATE__DELTA_Y:
			return getDeltaY();
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
		case DGPackage.TRANSLATE__DELTA_X:
			setDeltaX((Double) newValue);
			return;
		case DGPackage.TRANSLATE__DELTA_Y:
			setDeltaY((Double) newValue);
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
		case DGPackage.TRANSLATE__DELTA_X:
			setDeltaX(DELTA_X_EDEFAULT);
			return;
		case DGPackage.TRANSLATE__DELTA_Y:
			setDeltaY(DELTA_Y_EDEFAULT);
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
		case DGPackage.TRANSLATE__DELTA_X:
			return deltaX != DELTA_X_EDEFAULT;
		case DGPackage.TRANSLATE__DELTA_Y:
			return deltaY != DELTA_Y_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (deltaX: ");
		result.append(deltaX);
		result.append(", deltaY: ");
		result.append(deltaY);
		result.append(')');
		return result.toString();
	}
} // TranslateImpl
