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

import java.awt.Color;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.GradientStop;

import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Gradient Stop</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.GradientStopImpl#getColor <em>Color
 * </em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.GradientStopImpl#getOffset <em>
 * Offset</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.GradientStopImpl#getOpacity <em>
 * Opacity</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GradientStopImpl extends MinimalEObjectImpl.Container implements
		GradientStop {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected double offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final double OPACITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getOpacity() <em>Opacity</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected double opacity = OPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GradientStopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.GRADIENT_STOP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.GRADIENT_STOP__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOffset(double newOffset) {
		double oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.GRADIENT_STOP__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getOpacity() {
		return opacity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOpacity(double newOpacity) {
		double oldOpacity = opacity;
		opacity = newOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.GRADIENT_STOP__OPACITY, oldOpacity, opacity));
	}

	/**
	 * The cached validation expression for the '
	 * {@link #validOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Offset</em>}' invariant operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #validOffset(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_OFFSET_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "offset>=0 and offset<=1";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validOffset(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DGValidator
				.validate(
						DGPackage.Literals.GRADIENT_STOP,
						this,
						diagnostics,
						context,
						"http://www.eclipse.org/emf/2002/Ecore/OCL",
						DGPackage.Literals.GRADIENT_STOP___VALID_OFFSET__DIAGNOSTICCHAIN_MAP,
						VALID_OFFSET_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
						Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE,
						DGValidator.GRADIENT_STOP__VALID_OFFSET);
	}

	/**
	 * The cached validation expression for the '
	 * {@link #validOpacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Opacity</em>}' invariant operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #validOpacity(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_OPACITY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "opacity>=0 and opacity<=1";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validOpacity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DGValidator
				.validate(
						DGPackage.Literals.GRADIENT_STOP,
						this,
						diagnostics,
						context,
						"http://www.eclipse.org/emf/2002/Ecore/OCL",
						DGPackage.Literals.GRADIENT_STOP___VALID_OPACITY__DIAGNOSTICCHAIN_MAP,
						VALID_OPACITY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
						Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE,
						DGValidator.GRADIENT_STOP__VALID_OPACITY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DGPackage.GRADIENT_STOP__COLOR:
			return getColor();
		case DGPackage.GRADIENT_STOP__OFFSET:
			return getOffset();
		case DGPackage.GRADIENT_STOP__OPACITY:
			return getOpacity();
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
		case DGPackage.GRADIENT_STOP__COLOR:
			setColor((Color) newValue);
			return;
		case DGPackage.GRADIENT_STOP__OFFSET:
			setOffset((Double) newValue);
			return;
		case DGPackage.GRADIENT_STOP__OPACITY:
			setOpacity((Double) newValue);
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
		case DGPackage.GRADIENT_STOP__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case DGPackage.GRADIENT_STOP__OFFSET:
			setOffset(OFFSET_EDEFAULT);
			return;
		case DGPackage.GRADIENT_STOP__OPACITY:
			setOpacity(OPACITY_EDEFAULT);
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
		case DGPackage.GRADIENT_STOP__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT
					.equals(color);
		case DGPackage.GRADIENT_STOP__OFFSET:
			return offset != OFFSET_EDEFAULT;
		case DGPackage.GRADIENT_STOP__OPACITY:
			return opacity != OPACITY_EDEFAULT;
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
		case DGPackage.GRADIENT_STOP___VALID_OFFSET__DIAGNOSTICCHAIN_MAP:
			return validOffset((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case DGPackage.GRADIENT_STOP___VALID_OPACITY__DIAGNOSTICCHAIN_MAP:
			return validOpacity((DiagnosticChain) arguments.get(0),
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
		result.append(" (color: ");
		result.append(color);
		result.append(", offset: ");
		result.append(offset);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(')');
		return result.toString();
	}

} // GradientStopImpl
