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
package org.eclipse.papyrus.dd.dc.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.dd.dc.Bounds;
import org.eclipse.papyrus.dd.dc.DCPackage;

import org.eclipse.papyrus.dd.dc.util.DCValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Bounds</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dc.impl.BoundsImpl#getX <em>X</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dc.impl.BoundsImpl#getY <em>Y</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dc.impl.BoundsImpl#getWidth <em>Width</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dc.impl.BoundsImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BoundsImpl extends MinimalEObjectImpl.Container implements Bounds {

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected double y = Y_EDEFAULT;

	/**
	 * This is true if the Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean yESet;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * This is true if the Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean widthESet;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * This is true if the Height attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean heightESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BoundsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DCPackage.Literals.BOUNDS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		boolean oldXESet = xESet;
		xESet = true;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.BOUNDS__X, oldX, x, !oldXESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetX() {
		double oldX = x;
		boolean oldXESet = xESet;
		x = X_EDEFAULT;
		xESet = false;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DCPackage.BOUNDS__X, oldX, X_EDEFAULT, oldXESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setY(double newY) {
		double oldY = y;
		y = newY;
		boolean oldYESet = yESet;
		yESet = true;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.BOUNDS__Y, oldY, y, !oldYESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetY() {
		double oldY = y;
		boolean oldYESet = yESet;
		y = Y_EDEFAULT;
		yESet = false;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DCPackage.BOUNDS__Y, oldY, Y_EDEFAULT, oldYESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetY() {
		return yESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		boolean oldWidthESet = widthESet;
		widthESet = true;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.BOUNDS__WIDTH, oldWidth, width, !oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetWidth() {
		double oldWidth = width;
		boolean oldWidthESet = widthESet;
		width = WIDTH_EDEFAULT;
		widthESet = false;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DCPackage.BOUNDS__WIDTH, oldWidth, WIDTH_EDEFAULT, oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetWidth() {
		return widthESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		boolean oldHeightESet = heightESet;
		heightESet = true;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.BOUNDS__HEIGHT, oldHeight, height, !oldHeightESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetHeight() {
		double oldHeight = height;
		boolean oldHeightESet = heightESet;
		height = HEIGHT_EDEFAULT;
		heightESet = false;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DCPackage.BOUNDS__HEIGHT, oldHeight, HEIGHT_EDEFAULT, oldHeightESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetHeight() {
		return heightESet;
	}

	/**
	 * The cached validation expression for the '{@link #nonNegativeWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Non Negative Width</em>}' invariant operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #nonNegativeWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NON_NEGATIVE_WIDTH_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "width >= 0";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean nonNegativeWidth(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DCValidator.validate(DCPackage.Literals.BOUNDS, this, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", DCPackage.Literals.BOUNDS___NON_NEGATIVE_WIDTH__DIAGNOSTICCHAIN_MAP, NON_NEGATIVE_WIDTH_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR, DCValidator.DIAGNOSTIC_SOURCE, DCValidator.BOUNDS__NON_NEGATIVE_WIDTH);
	}

	/**
	 * The cached validation expression for the '{@link #nonNegativeHeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Non Negative Height</em>}' invariant operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #nonNegativeHeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NON_NEGATIVE_HEIGHT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "height >=0";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean nonNegativeHeight(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DCValidator.validate(DCPackage.Literals.BOUNDS, this, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", DCPackage.Literals.BOUNDS___NON_NEGATIVE_HEIGHT__DIAGNOSTICCHAIN_MAP, NON_NEGATIVE_HEIGHT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR, DCValidator.DIAGNOSTIC_SOURCE, DCValidator.BOUNDS__NON_NEGATIVE_HEIGHT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
		case DCPackage.BOUNDS__X:
			return getX();
		case DCPackage.BOUNDS__Y:
			return getY();
		case DCPackage.BOUNDS__WIDTH:
			return getWidth();
		case DCPackage.BOUNDS__HEIGHT:
			return getHeight();
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
		switch(featureID) {
		case DCPackage.BOUNDS__X:
			setX((Double)newValue);
			return;
		case DCPackage.BOUNDS__Y:
			setY((Double)newValue);
			return;
		case DCPackage.BOUNDS__WIDTH:
			setWidth((Double)newValue);
			return;
		case DCPackage.BOUNDS__HEIGHT:
			setHeight((Double)newValue);
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
		switch(featureID) {
		case DCPackage.BOUNDS__X:
			unsetX();
			return;
		case DCPackage.BOUNDS__Y:
			unsetY();
			return;
		case DCPackage.BOUNDS__WIDTH:
			unsetWidth();
			return;
		case DCPackage.BOUNDS__HEIGHT:
			unsetHeight();
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
		switch(featureID) {
		case DCPackage.BOUNDS__X:
			return isSetX();
		case DCPackage.BOUNDS__Y:
			return isSetY();
		case DCPackage.BOUNDS__WIDTH:
			return isSetWidth();
		case DCPackage.BOUNDS__HEIGHT:
			return isSetHeight();
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
		switch(operationID) {
		case DCPackage.BOUNDS___NON_NEGATIVE_WIDTH__DIAGNOSTICCHAIN_MAP:
			return nonNegativeWidth((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		case DCPackage.BOUNDS___NON_NEGATIVE_HEIGHT__DIAGNOSTICCHAIN_MAP:
			return nonNegativeHeight((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		if(eIsProxy())
			return super.toString();
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (x: ");
		if(xESet)
			result.append(x);
		else
			result.append("<unset>");
		result.append(", y: ");
		if(yESet)
			result.append(y);
		else
			result.append("<unset>");
		result.append(", width: ");
		if(widthESet)
			result.append(width);
		else
			result.append("<unset>");
		result.append(", height: ");
		if(heightESet)
			result.append(height);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}
} // BoundsImpl
