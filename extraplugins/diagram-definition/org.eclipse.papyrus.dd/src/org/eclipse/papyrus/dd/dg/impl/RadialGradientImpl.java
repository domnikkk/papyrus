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
import org.eclipse.papyrus.dd.dg.RadialGradient;

import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Radial Gradient</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.RadialGradientImpl#getCenter <em>Center</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.RadialGradientImpl#getFocus <em>Focus</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.RadialGradientImpl#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RadialGradientImpl extends GradientImpl implements RadialGradient {

	/**
	 * The cached value of the '{@link #getCenter() <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected Point center;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Point focus;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.5;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RadialGradientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.RADIAL_GRADIENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Point getCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCenter(Point newCenter, NotificationChain msgs) {
		Point oldCenter = center;
		center = newCenter;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.RADIAL_GRADIENT__CENTER, oldCenter, newCenter);
			if(msgs == null)
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
	public void setCenter(Point newCenter) {
		if(newCenter != center) {
			NotificationChain msgs = null;
			if(center != null)
				msgs = ((InternalEObject)center).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.RADIAL_GRADIENT__CENTER, null, msgs);
			if(newCenter != null)
				msgs = ((InternalEObject)newCenter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.RADIAL_GRADIENT__CENTER, null, msgs);
			msgs = basicSetCenter(newCenter, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.RADIAL_GRADIENT__CENTER, newCenter, newCenter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Point getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetFocus(Point newFocus, NotificationChain msgs) {
		Point oldFocus = focus;
		focus = newFocus;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.RADIAL_GRADIENT__FOCUS, oldFocus, newFocus);
			if(msgs == null)
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
	public void setFocus(Point newFocus) {
		if(newFocus != focus) {
			NotificationChain msgs = null;
			if(focus != null)
				msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.RADIAL_GRADIENT__FOCUS, null, msgs);
			if(newFocus != null)
				msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.RADIAL_GRADIENT__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.RADIAL_GRADIENT__FOCUS, newFocus, newFocus));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.RADIAL_GRADIENT__RADIUS, oldRadius, radius));
	}

	/**
	 * The cached validation expression for the '{@link #validCenterPoint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Center Point</em>}' invariant operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #validCenterPoint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_CENTER_POINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "centerX>=0 and centerX<=1 and centerY>=0 and centerY<=1";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validCenterPoint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DGValidator.validate(DGPackage.Literals.RADIAL_GRADIENT, this, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", DGPackage.Literals.RADIAL_GRADIENT___VALID_CENTER_POINT__DIAGNOSTICCHAIN_MAP, VALID_CENTER_POINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE, DGValidator.RADIAL_GRADIENT__VALID_CENTER_POINT);
	}

	/**
	 * The cached validation expression for the '{@link #validFocusPoint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Focus Point</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #validFocusPoint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_FOCUS_POINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "focusX>=0 and focusX<=1 and focusY>=0 and focusY<=1";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validFocusPoint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DGValidator.validate(DGPackage.Literals.RADIAL_GRADIENT, this, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", DGPackage.Literals.RADIAL_GRADIENT___VALID_FOCUS_POINT__DIAGNOSTICCHAIN_MAP, VALID_FOCUS_POINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE, DGValidator.RADIAL_GRADIENT__VALID_FOCUS_POINT);
	}

	/**
	 * The cached validation expression for the '{@link #validRadius(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Radius</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #validRadius(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_RADIUS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "radius>=0 and radius<=1";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validRadius(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DGValidator.validate(DGPackage.Literals.RADIAL_GRADIENT, this, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", DGPackage.Literals.RADIAL_GRADIENT___VALID_RADIUS__DIAGNOSTICCHAIN_MAP, VALID_RADIUS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE, DGValidator.RADIAL_GRADIENT__VALID_RADIUS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case DGPackage.RADIAL_GRADIENT__CENTER:
			return basicSetCenter(null, msgs);
		case DGPackage.RADIAL_GRADIENT__FOCUS:
			return basicSetFocus(null, msgs);
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
		switch(featureID) {
		case DGPackage.RADIAL_GRADIENT__CENTER:
			return getCenter();
		case DGPackage.RADIAL_GRADIENT__FOCUS:
			return getFocus();
		case DGPackage.RADIAL_GRADIENT__RADIUS:
			return getRadius();
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
		case DGPackage.RADIAL_GRADIENT__CENTER:
			setCenter((Point)newValue);
			return;
		case DGPackage.RADIAL_GRADIENT__FOCUS:
			setFocus((Point)newValue);
			return;
		case DGPackage.RADIAL_GRADIENT__RADIUS:
			setRadius((Double)newValue);
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
		case DGPackage.RADIAL_GRADIENT__CENTER:
			setCenter((Point)null);
			return;
		case DGPackage.RADIAL_GRADIENT__FOCUS:
			setFocus((Point)null);
			return;
		case DGPackage.RADIAL_GRADIENT__RADIUS:
			setRadius(RADIUS_EDEFAULT);
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
		case DGPackage.RADIAL_GRADIENT__CENTER:
			return center != null;
		case DGPackage.RADIAL_GRADIENT__FOCUS:
			return focus != null;
		case DGPackage.RADIAL_GRADIENT__RADIUS:
			return radius != RADIUS_EDEFAULT;
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
		case DGPackage.RADIAL_GRADIENT___VALID_CENTER_POINT__DIAGNOSTICCHAIN_MAP:
			return validCenterPoint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		case DGPackage.RADIAL_GRADIENT___VALID_FOCUS_POINT__DIAGNOSTICCHAIN_MAP:
			return validFocusPoint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		case DGPackage.RADIAL_GRADIENT___VALID_RADIUS__DIAGNOSTICCHAIN_MAP:
			return validRadius((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (radius: ");
		result.append(radius);
		result.append(')');
		return result.toString();
	}
} // RadialGradientImpl
