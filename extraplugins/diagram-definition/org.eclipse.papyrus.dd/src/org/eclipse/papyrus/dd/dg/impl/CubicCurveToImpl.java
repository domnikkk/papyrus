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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.dd.dc.Point;

import org.eclipse.papyrus.dd.dg.CubicCurveTo;
import org.eclipse.papyrus.dd.dg.DGPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Cubic Curve To</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.CubicCurveToImpl#getStartControl
 * <em>Start Control</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.CubicCurveToImpl#getEndControl <em>
 * End Control</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.CubicCurveToImpl#getPoint <em>Point
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CubicCurveToImpl extends PathCommandImpl implements CubicCurveTo {
	/**
	 * The cached value of the '{@link #getStartControl()
	 * <em>Start Control</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getStartControl()
	 * @generated
	 * @ordered
	 */
	protected Point startControl;

	/**
	 * The cached value of the '{@link #getEndControl() <em>End Control</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEndControl()
	 * @generated
	 * @ordered
	 */
	protected Point endControl;

	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected Point point;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CubicCurveToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.CUBIC_CURVE_TO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Point getPoint() {
		return point;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPoint(Point newPoint,
			NotificationChain msgs) {
		Point oldPoint = point;
		point = newPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DGPackage.CUBIC_CURVE_TO__POINT,
					oldPoint, newPoint);
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
	public void setPoint(Point newPoint) {
		if (newPoint != point) {
			NotificationChain msgs = null;
			if (point != null)
				msgs = ((InternalEObject) point).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- DGPackage.CUBIC_CURVE_TO__POINT, null, msgs);
			if (newPoint != null)
				msgs = ((InternalEObject) newPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- DGPackage.CUBIC_CURVE_TO__POINT, null, msgs);
			msgs = basicSetPoint(newPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.CUBIC_CURVE_TO__POINT, newPoint, newPoint));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Point getStartControl() {
		return startControl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStartControl(Point newStartControl,
			NotificationChain msgs) {
		Point oldStartControl = startControl;
		startControl = newStartControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DGPackage.CUBIC_CURVE_TO__START_CONTROL,
					oldStartControl, newStartControl);
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
	public void setStartControl(Point newStartControl) {
		if (newStartControl != startControl) {
			NotificationChain msgs = null;
			if (startControl != null)
				msgs = ((InternalEObject) startControl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- DGPackage.CUBIC_CURVE_TO__START_CONTROL,
						null, msgs);
			if (newStartControl != null)
				msgs = ((InternalEObject) newStartControl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- DGPackage.CUBIC_CURVE_TO__START_CONTROL,
						null, msgs);
			msgs = basicSetStartControl(newStartControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.CUBIC_CURVE_TO__START_CONTROL, newStartControl,
					newStartControl));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Point getEndControl() {
		return endControl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEndControl(Point newEndControl,
			NotificationChain msgs) {
		Point oldEndControl = endControl;
		endControl = newEndControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DGPackage.CUBIC_CURVE_TO__END_CONTROL,
					oldEndControl, newEndControl);
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
	public void setEndControl(Point newEndControl) {
		if (newEndControl != endControl) {
			NotificationChain msgs = null;
			if (endControl != null)
				msgs = ((InternalEObject) endControl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- DGPackage.CUBIC_CURVE_TO__END_CONTROL, null,
						msgs);
			if (newEndControl != null)
				msgs = ((InternalEObject) newEndControl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- DGPackage.CUBIC_CURVE_TO__END_CONTROL, null,
						msgs);
			msgs = basicSetEndControl(newEndControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.CUBIC_CURVE_TO__END_CONTROL, newEndControl,
					newEndControl));
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
		case DGPackage.CUBIC_CURVE_TO__START_CONTROL:
			return basicSetStartControl(null, msgs);
		case DGPackage.CUBIC_CURVE_TO__END_CONTROL:
			return basicSetEndControl(null, msgs);
		case DGPackage.CUBIC_CURVE_TO__POINT:
			return basicSetPoint(null, msgs);
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
		case DGPackage.CUBIC_CURVE_TO__START_CONTROL:
			return getStartControl();
		case DGPackage.CUBIC_CURVE_TO__END_CONTROL:
			return getEndControl();
		case DGPackage.CUBIC_CURVE_TO__POINT:
			return getPoint();
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
		case DGPackage.CUBIC_CURVE_TO__START_CONTROL:
			setStartControl((Point) newValue);
			return;
		case DGPackage.CUBIC_CURVE_TO__END_CONTROL:
			setEndControl((Point) newValue);
			return;
		case DGPackage.CUBIC_CURVE_TO__POINT:
			setPoint((Point) newValue);
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
		case DGPackage.CUBIC_CURVE_TO__START_CONTROL:
			setStartControl((Point) null);
			return;
		case DGPackage.CUBIC_CURVE_TO__END_CONTROL:
			setEndControl((Point) null);
			return;
		case DGPackage.CUBIC_CURVE_TO__POINT:
			setPoint((Point) null);
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
		case DGPackage.CUBIC_CURVE_TO__START_CONTROL:
			return startControl != null;
		case DGPackage.CUBIC_CURVE_TO__END_CONTROL:
			return endControl != null;
		case DGPackage.CUBIC_CURVE_TO__POINT:
			return point != null;
		}
		return super.eIsSet(featureID);
	}

} // CubicCurveToImpl
