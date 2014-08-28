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
import org.eclipse.papyrus.dd.dg.LineTo;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Line To</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.LineToImpl#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineToImpl extends PathCommandImpl implements LineTo {

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
	protected LineToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.LINE_TO;
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
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.LINE_TO__POINT, oldPoint, newPoint);
			if (msgs == null) {
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
		if (newPoint != point) {
			NotificationChain msgs = null;
			if (point != null) {
				msgs = ((InternalEObject) point).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.LINE_TO__POINT, null, msgs);
			}
			if (newPoint != null) {
				msgs = ((InternalEObject) newPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.LINE_TO__POINT, null, msgs);
			}
			msgs = basicSetPoint(newPoint, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.LINE_TO__POINT, newPoint, newPoint));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DGPackage.LINE_TO__POINT:
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
		case DGPackage.LINE_TO__POINT:
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
		case DGPackage.LINE_TO__POINT:
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
		case DGPackage.LINE_TO__POINT:
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
		case DGPackage.LINE_TO__POINT:
			return point != null;
		}
		return super.eIsSet(featureID);
	}
} // LineToImpl
