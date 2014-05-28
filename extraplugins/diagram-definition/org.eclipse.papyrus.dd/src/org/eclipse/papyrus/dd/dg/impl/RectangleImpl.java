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

import org.eclipse.papyrus.dd.dc.Bounds;

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Rectangle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Rectangle</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.RectangleImpl#getBounds <em>Bounds
 * </em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.RectangleImpl#getCornerRadius <em>
 * Corner Radius</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RectangleImpl extends GraphicalElementImpl implements Rectangle {
	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Bounds bounds;

	/**
	 * The default value of the '{@link #getCornerRadius()
	 * <em>Corner Radius</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double CORNER_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCornerRadius()
	 * <em>Corner Radius</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected double cornerRadius = CORNER_RADIUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RectangleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.RECTANGLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Bounds getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBounds(Bounds newBounds,
			NotificationChain msgs) {
		Bounds oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DGPackage.RECTANGLE__BOUNDS, oldBounds,
					newBounds);
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
	public void setBounds(Bounds newBounds) {
		if (newBounds != bounds) {
			NotificationChain msgs = null;
			if (bounds != null)
				msgs = ((InternalEObject) bounds).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DGPackage.RECTANGLE__BOUNDS,
						null, msgs);
			if (newBounds != null)
				msgs = ((InternalEObject) newBounds).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DGPackage.RECTANGLE__BOUNDS,
						null, msgs);
			msgs = basicSetBounds(newBounds, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.RECTANGLE__BOUNDS, newBounds, newBounds));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getCornerRadius() {
		return cornerRadius;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCornerRadius(double newCornerRadius) {
		double oldCornerRadius = cornerRadius;
		cornerRadius = newCornerRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.RECTANGLE__CORNER_RADIUS, oldCornerRadius,
					cornerRadius));
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
		case DGPackage.RECTANGLE__BOUNDS:
			return basicSetBounds(null, msgs);
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
		case DGPackage.RECTANGLE__BOUNDS:
			return getBounds();
		case DGPackage.RECTANGLE__CORNER_RADIUS:
			return getCornerRadius();
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
		case DGPackage.RECTANGLE__BOUNDS:
			setBounds((Bounds) newValue);
			return;
		case DGPackage.RECTANGLE__CORNER_RADIUS:
			setCornerRadius((Double) newValue);
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
		case DGPackage.RECTANGLE__BOUNDS:
			setBounds((Bounds) null);
			return;
		case DGPackage.RECTANGLE__CORNER_RADIUS:
			setCornerRadius(CORNER_RADIUS_EDEFAULT);
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
		case DGPackage.RECTANGLE__BOUNDS:
			return bounds != null;
		case DGPackage.RECTANGLE__CORNER_RADIUS:
			return cornerRadius != CORNER_RADIUS_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cornerRadius: ");
		result.append(cornerRadius);
		result.append(')');
		return result.toString();
	}

} // RectangleImpl
