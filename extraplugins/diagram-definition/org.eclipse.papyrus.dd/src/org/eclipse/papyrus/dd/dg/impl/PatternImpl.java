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
import org.eclipse.papyrus.dd.dg.GraphicalElement;
import org.eclipse.papyrus.dd.dg.Pattern;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.PatternImpl#getBounds <em>Bounds</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.PatternImpl#getTile <em>Tile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternImpl extends PaintServerImpl implements Pattern {

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Bounds bounds;

	/**
	 * The cached value of the '{@link #getTile() <em>Tile</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTile()
	 * @generated
	 * @ordered
	 */
	protected GraphicalElement tile;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.PATTERN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Bounds getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetBounds(Bounds newBounds, NotificationChain msgs) {
		Bounds oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.PATTERN__BOUNDS, oldBounds, newBounds);
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
	public void setBounds(Bounds newBounds) {
		if (newBounds != bounds) {
			NotificationChain msgs = null;
			if (bounds != null) {
				msgs = ((InternalEObject) bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.PATTERN__BOUNDS, null, msgs);
			}
			if (newBounds != null) {
				msgs = ((InternalEObject) newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.PATTERN__BOUNDS, null, msgs);
			}
			msgs = basicSetBounds(newBounds, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.PATTERN__BOUNDS, newBounds, newBounds));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public GraphicalElement getTile() {
		return tile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetTile(GraphicalElement newTile, NotificationChain msgs) {
		GraphicalElement oldTile = tile;
		tile = newTile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.PATTERN__TILE, oldTile, newTile);
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
	public void setTile(GraphicalElement newTile) {
		if (newTile != tile) {
			NotificationChain msgs = null;
			if (tile != null) {
				msgs = ((InternalEObject) tile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.PATTERN__TILE, null, msgs);
			}
			if (newTile != null) {
				msgs = ((InternalEObject) newTile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.PATTERN__TILE, null, msgs);
			}
			msgs = basicSetTile(newTile, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.PATTERN__TILE, newTile, newTile));
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
		case DGPackage.PATTERN__BOUNDS:
			return basicSetBounds(null, msgs);
		case DGPackage.PATTERN__TILE:
			return basicSetTile(null, msgs);
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
		case DGPackage.PATTERN__BOUNDS:
			return getBounds();
		case DGPackage.PATTERN__TILE:
			return getTile();
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
		case DGPackage.PATTERN__BOUNDS:
			setBounds((Bounds) newValue);
			return;
		case DGPackage.PATTERN__TILE:
			setTile((GraphicalElement) newValue);
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
		case DGPackage.PATTERN__BOUNDS:
			setBounds((Bounds) null);
			return;
		case DGPackage.PATTERN__TILE:
			setTile((GraphicalElement) null);
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
		case DGPackage.PATTERN__BOUNDS:
			return bounds != null;
		case DGPackage.PATTERN__TILE:
			return tile != null;
		}
		return super.eIsSet(featureID);
	}
} // PatternImpl
