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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Scale;
import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Scale</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.ScaleImpl#getFactorX <em>Factor X</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.ScaleImpl#getFactorY <em>Factor Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScaleImpl extends TransformImpl implements Scale {

	/**
	 * The default value of the '{@link #getFactorX() <em>Factor X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getFactorX()
	 * @generated
	 * @ordered
	 */
	protected static final double FACTOR_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFactorX() <em>Factor X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getFactorX()
	 * @generated
	 * @ordered
	 */
	protected double factorX = FACTOR_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactorY() <em>Factor Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getFactorY()
	 * @generated
	 * @ordered
	 */
	protected static final double FACTOR_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFactorY() <em>Factor Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getFactorY()
	 * @generated
	 * @ordered
	 */
	protected double factorY = FACTOR_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ScaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.SCALE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double getFactorX() {
		return factorX;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFactorX(double newFactorX) {
		double oldFactorX = factorX;
		factorX = newFactorX;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.SCALE__FACTOR_X, oldFactorX, factorX));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double getFactorY() {
		return factorY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFactorY(double newFactorY) {
		double oldFactorY = factorY;
		factorY = newFactorY;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.SCALE__FACTOR_Y, oldFactorY, factorY));
		}
	}

	/**
	 * The cached validation expression for the '{@link #nonnegativescale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Nonnegativescale</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #nonnegativescale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NONNEGATIVESCALE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "factorX>=0 and factorY>=0";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean nonnegativescale(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DGValidator.validate(DGPackage.Literals.SCALE, this, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", DGPackage.Literals.SCALE___NONNEGATIVESCALE__DIAGNOSTICCHAIN_MAP, NONNEGATIVESCALE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE, DGValidator.SCALE__NONNEGATIVESCALE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DGPackage.SCALE__FACTOR_X:
			return getFactorX();
		case DGPackage.SCALE__FACTOR_Y:
			return getFactorY();
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
		case DGPackage.SCALE__FACTOR_X:
			setFactorX((Double) newValue);
			return;
		case DGPackage.SCALE__FACTOR_Y:
			setFactorY((Double) newValue);
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
		case DGPackage.SCALE__FACTOR_X:
			setFactorX(FACTOR_X_EDEFAULT);
			return;
		case DGPackage.SCALE__FACTOR_Y:
			setFactorY(FACTOR_Y_EDEFAULT);
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
		case DGPackage.SCALE__FACTOR_X:
			return factorX != FACTOR_X_EDEFAULT;
		case DGPackage.SCALE__FACTOR_Y:
			return factorY != FACTOR_Y_EDEFAULT;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DGPackage.SCALE___NONNEGATIVESCALE__DIAGNOSTICCHAIN_MAP:
			return nonnegativescale((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		if (eIsProxy()) {
			return super.toString();
		}
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (factorX: ");
		result.append(factorX);
		result.append(", factorY: ");
		result.append(factorY);
		result.append(')');
		return result.toString();
	}
} // ScaleImpl
