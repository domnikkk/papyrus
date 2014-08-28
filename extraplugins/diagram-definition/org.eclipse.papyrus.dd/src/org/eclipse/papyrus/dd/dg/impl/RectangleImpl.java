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
import org.eclipse.papyrus.dd.dc.Bounds;
import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Rectangle;
import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Rectangle</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.RectangleImpl#getBounds <em>Bounds</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.RectangleImpl#getCornerRadius <em>Corner Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RectangleImpl extends GraphicalElementImpl implements Rectangle {

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
	 * The default value of the '{@link #getCornerRadius() <em>Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double CORNER_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCornerRadius() <em>Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected double cornerRadius = CORNER_RADIUS_EDEFAULT;

	/**
	 * This is true if the Corner Radius attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	protected boolean cornerRadiusESet;

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.RECTANGLE__BOUNDS, oldBounds, newBounds);
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
				msgs = ((InternalEObject) bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.RECTANGLE__BOUNDS, null, msgs);
			}
			if (newBounds != null) {
				msgs = ((InternalEObject) newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.RECTANGLE__BOUNDS, null, msgs);
			}
			msgs = basicSetBounds(newBounds, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.RECTANGLE__BOUNDS, newBounds, newBounds));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public double getCornerRadius() {
		return cornerRadius;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCornerRadius(double newCornerRadius) {
		double oldCornerRadius = cornerRadius;
		cornerRadius = newCornerRadius;
		boolean oldCornerRadiusESet = cornerRadiusESet;
		cornerRadiusESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.RECTANGLE__CORNER_RADIUS, oldCornerRadius, cornerRadius, !oldCornerRadiusESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void unsetCornerRadius() {
		double oldCornerRadius = cornerRadius;
		boolean oldCornerRadiusESet = cornerRadiusESet;
		cornerRadius = CORNER_RADIUS_EDEFAULT;
		cornerRadiusESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.RECTANGLE__CORNER_RADIUS, oldCornerRadius, CORNER_RADIUS_EDEFAULT, oldCornerRadiusESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isSetCornerRadius() {
		return cornerRadiusESet;
	}

	/**
	 * The cached validation expression for the ' {@link #nonNegativeCornerRadius(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Non Negative Corner Radius</em>}' invariant operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #nonNegativeCornerRadius(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NON_NEGATIVE_CORNER_RADIUS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "cornerRadius >= 0";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean nonNegativeCornerRadius(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DGValidator.validate(DGPackage.Literals.RECTANGLE, this, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", DGPackage.Literals.RECTANGLE___NON_NEGATIVE_CORNER_RADIUS__DIAGNOSTICCHAIN_MAP,
				NON_NEGATIVE_CORNER_RADIUS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE, DGValidator.RECTANGLE__NON_NEGATIVE_CORNER_RADIUS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
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
			unsetCornerRadius();
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
			return isSetCornerRadius();
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
		switch (operationID) {
		case DGPackage.RECTANGLE___NON_NEGATIVE_CORNER_RADIUS__DIAGNOSTICCHAIN_MAP:
			return nonNegativeCornerRadius((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		if (eIsProxy()) {
			return super.toString();
		}
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cornerRadius: ");
		if (cornerRadiusESet) {
			result.append(cornerRadius);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}
} // RectangleImpl
