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

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.QuadraticCurveTo;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Quadratic Curve To</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.QuadraticCurveToImpl#getControl <em>Control</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.QuadraticCurveToImpl#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuadraticCurveToImpl extends PathCommandImpl implements QuadraticCurveTo {

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected Point control;

	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	protected QuadraticCurveToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.QUADRATIC_CURVE_TO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Point getPoint() {
		return point;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetPoint(Point newPoint, NotificationChain msgs) {
		Point oldPoint = point;
		point = newPoint;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.QUADRATIC_CURVE_TO__POINT, oldPoint, newPoint);
			if(msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setPoint(Point newPoint) {
		if(newPoint != point) {
			NotificationChain msgs = null;
			if(point != null) {
				msgs = ((InternalEObject)point).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.QUADRATIC_CURVE_TO__POINT, null, msgs);
			}
			if(newPoint != null) {
				msgs = ((InternalEObject)newPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.QUADRATIC_CURVE_TO__POINT, null, msgs);
			}
			msgs = basicSetPoint(newPoint, msgs);
			if(msgs != null) {
				msgs.dispatch();
			}
		} else if(eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.QUADRATIC_CURVE_TO__POINT, newPoint, newPoint));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Point getControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetControl(Point newControl, NotificationChain msgs) {
		Point oldControl = control;
		control = newControl;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.QUADRATIC_CURVE_TO__CONTROL, oldControl, newControl);
			if(msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setControl(Point newControl) {
		if(newControl != control) {
			NotificationChain msgs = null;
			if(control != null) {
				msgs = ((InternalEObject)control).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.QUADRATIC_CURVE_TO__CONTROL, null, msgs);
			}
			if(newControl != null) {
				msgs = ((InternalEObject)newControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.QUADRATIC_CURVE_TO__CONTROL, null, msgs);
			}
			msgs = basicSetControl(newControl, msgs);
			if(msgs != null) {
				msgs.dispatch();
			}
		} else if(eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.QUADRATIC_CURVE_TO__CONTROL, newControl, newControl));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case DGPackage.QUADRATIC_CURVE_TO__CONTROL:
			return basicSetControl(null, msgs);
		case DGPackage.QUADRATIC_CURVE_TO__POINT:
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
		switch(featureID) {
		case DGPackage.QUADRATIC_CURVE_TO__CONTROL:
			return getControl();
		case DGPackage.QUADRATIC_CURVE_TO__POINT:
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
		switch(featureID) {
		case DGPackage.QUADRATIC_CURVE_TO__CONTROL:
			setControl((Point)newValue);
			return;
		case DGPackage.QUADRATIC_CURVE_TO__POINT:
			setPoint((Point)newValue);
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
		case DGPackage.QUADRATIC_CURVE_TO__CONTROL:
			setControl((Point)null);
			return;
		case DGPackage.QUADRATIC_CURVE_TO__POINT:
			setPoint((Point)null);
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
		case DGPackage.QUADRATIC_CURVE_TO__CONTROL:
			return control != null;
		case DGPackage.QUADRATIC_CURVE_TO__POINT:
			return point != null;
		}
		return super.eIsSet(featureID);
	}
} // QuadraticCurveToImpl
