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
import org.eclipse.papyrus.dd.dg.Rotate;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Rotate</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.RotateImpl#getAngle <em>Angle</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.RotateImpl#getCenter <em>Center</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RotateImpl extends TransformImpl implements Rotate {

	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected double angle = ANGLE_EDEFAULT;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RotateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.ROTATE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAngle(double newAngle) {
		double oldAngle = angle;
		angle = newAngle;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.ROTATE__ANGLE, oldAngle, angle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.ROTATE__CENTER, oldCenter, newCenter);
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
				msgs = ((InternalEObject)center).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.ROTATE__CENTER, null, msgs);
			if(newCenter != null)
				msgs = ((InternalEObject)newCenter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.ROTATE__CENTER, null, msgs);
			msgs = basicSetCenter(newCenter, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.ROTATE__CENTER, newCenter, newCenter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case DGPackage.ROTATE__CENTER:
			return basicSetCenter(null, msgs);
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
		case DGPackage.ROTATE__ANGLE:
			return getAngle();
		case DGPackage.ROTATE__CENTER:
			return getCenter();
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
		case DGPackage.ROTATE__ANGLE:
			setAngle((Double)newValue);
			return;
		case DGPackage.ROTATE__CENTER:
			setCenter((Point)newValue);
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
		case DGPackage.ROTATE__ANGLE:
			setAngle(ANGLE_EDEFAULT);
			return;
		case DGPackage.ROTATE__CENTER:
			setCenter((Point)null);
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
		case DGPackage.ROTATE__ANGLE:
			return angle != ANGLE_EDEFAULT;
		case DGPackage.ROTATE__CENTER:
			return center != null;
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
		if(eIsProxy())
			return super.toString();
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (angle: ");
		result.append(angle);
		result.append(')');
		return result.toString();
	}
} // RotateImpl
