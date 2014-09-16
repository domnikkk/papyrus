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
import org.eclipse.papyrus.dd.dg.LinearGradient;

import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Linear Gradient</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.LinearGradientImpl#getStart <em>Start</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.LinearGradientImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinearGradientImpl extends GradientImpl implements LinearGradient {

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Point start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Point end;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected LinearGradientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.LINEAR_GRADIENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Point getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetStart(Point newStart, NotificationChain msgs) {
		Point oldStart = start;
		start = newStart;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.LINEAR_GRADIENT__START, oldStart, newStart);
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
	public void setStart(Point newStart) {
		if(newStart != start) {
			NotificationChain msgs = null;
			if(start != null) {
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.LINEAR_GRADIENT__START, null, msgs);
			}
			if(newStart != null) {
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.LINEAR_GRADIENT__START, null, msgs);
			}
			msgs = basicSetStart(newStart, msgs);
			if(msgs != null) {
				msgs.dispatch();
			}
		} else if(eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.LINEAR_GRADIENT__START, newStart, newStart));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Point getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetEnd(Point newEnd, NotificationChain msgs) {
		Point oldEnd = end;
		end = newEnd;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.LINEAR_GRADIENT__END, oldEnd, newEnd);
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
	public void setEnd(Point newEnd) {
		if(newEnd != end) {
			NotificationChain msgs = null;
			if(end != null) {
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.LINEAR_GRADIENT__END, null, msgs);
			}
			if(newEnd != null) {
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.LINEAR_GRADIENT__END, null, msgs);
			}
			msgs = basicSetEnd(newEnd, msgs);
			if(msgs != null) {
				msgs.dispatch();
			}
		} else if(eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.LINEAR_GRADIENT__END, newEnd, newEnd));
		}
	}

	/**
	 * The cached validation expression for the '{@link #validGradientVector(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Gradient Vector</em>}' invariant operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #validGradientVector(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_GRADIENT_VECTOR_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "start.x>=0 and start.x<=1 and end.x>=0 and end.x<=1 and start.y>=0 and start.y<=1 and end.y>=0 and end.y<=1";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean validGradientVector(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DGValidator.validate(DGPackage.Literals.LINEAR_GRADIENT, this, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", DGPackage.Literals.LINEAR_GRADIENT___VALID_GRADIENT_VECTOR__DIAGNOSTICCHAIN_MAP, VALID_GRADIENT_VECTOR_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE, DGValidator.LINEAR_GRADIENT__VALID_GRADIENT_VECTOR);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case DGPackage.LINEAR_GRADIENT__START:
			return basicSetStart(null, msgs);
		case DGPackage.LINEAR_GRADIENT__END:
			return basicSetEnd(null, msgs);
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
		case DGPackage.LINEAR_GRADIENT__START:
			return getStart();
		case DGPackage.LINEAR_GRADIENT__END:
			return getEnd();
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
		case DGPackage.LINEAR_GRADIENT__START:
			setStart((Point)newValue);
			return;
		case DGPackage.LINEAR_GRADIENT__END:
			setEnd((Point)newValue);
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
		case DGPackage.LINEAR_GRADIENT__START:
			setStart((Point)null);
			return;
		case DGPackage.LINEAR_GRADIENT__END:
			setEnd((Point)null);
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
		case DGPackage.LINEAR_GRADIENT__START:
			return start != null;
		case DGPackage.LINEAR_GRADIENT__END:
			return end != null;
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
		case DGPackage.LINEAR_GRADIENT___VALID_GRADIENT_VECTOR__DIAGNOSTICCHAIN_MAP:
			return validGradientVector((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
} // LinearGradientImpl
