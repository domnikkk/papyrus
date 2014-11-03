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

import org.eclipse.papyrus.dd.dc.Dimension;
import org.eclipse.papyrus.dd.dc.Point;

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Ellipse;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Ellipse</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.EllipseImpl#getCenter <em>Center</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.EllipseImpl#getRadii <em>Radii</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EllipseImpl extends GraphicalElementImpl implements Ellipse {

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
	 * The cached value of the '{@link #getRadii() <em>Radii</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRadii()
	 * @generated
	 * @ordered
	 */
	protected Dimension radii;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EllipseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.ELLIPSE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.ELLIPSE__CENTER, oldCenter, newCenter);
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
				msgs = ((InternalEObject)center).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.ELLIPSE__CENTER, null, msgs);
			if(newCenter != null)
				msgs = ((InternalEObject)newCenter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.ELLIPSE__CENTER, null, msgs);
			msgs = basicSetCenter(newCenter, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.ELLIPSE__CENTER, newCenter, newCenter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Dimension getRadii() {
		return radii;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRadii(Dimension newRadii, NotificationChain msgs) {
		Dimension oldRadii = radii;
		radii = newRadii;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.ELLIPSE__RADII, oldRadii, newRadii);
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
	public void setRadii(Dimension newRadii) {
		if(newRadii != radii) {
			NotificationChain msgs = null;
			if(radii != null)
				msgs = ((InternalEObject)radii).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.ELLIPSE__RADII, null, msgs);
			if(newRadii != null)
				msgs = ((InternalEObject)newRadii).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.ELLIPSE__RADII, null, msgs);
			msgs = basicSetRadii(newRadii, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.ELLIPSE__RADII, newRadii, newRadii));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case DGPackage.ELLIPSE__CENTER:
			return basicSetCenter(null, msgs);
		case DGPackage.ELLIPSE__RADII:
			return basicSetRadii(null, msgs);
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
		case DGPackage.ELLIPSE__CENTER:
			return getCenter();
		case DGPackage.ELLIPSE__RADII:
			return getRadii();
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
		case DGPackage.ELLIPSE__CENTER:
			setCenter((Point)newValue);
			return;
		case DGPackage.ELLIPSE__RADII:
			setRadii((Dimension)newValue);
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
		case DGPackage.ELLIPSE__CENTER:
			setCenter((Point)null);
			return;
		case DGPackage.ELLIPSE__RADII:
			setRadii((Dimension)null);
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
		case DGPackage.ELLIPSE__CENTER:
			return center != null;
		case DGPackage.ELLIPSE__RADII:
			return radii != null;
		}
		return super.eIsSet(featureID);
	}
} // EllipseImpl
