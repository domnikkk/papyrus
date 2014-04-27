/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.timing.timingconstraints.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;
import org.eclipse.papyrus.eastadl.timing.impl.TimingConstraintImpl;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.DelayConstraintImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.DelayConstraintImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.DelayConstraintImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.DelayConstraintImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelayConstraintImpl extends TimingConstraintImpl implements DelayConstraint {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Event target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Event source;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression lower;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected TimingExpression upper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingconstraintsPackage.DELAY_CONSTRAINT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case TimingconstraintsPackage.DELAY_CONSTRAINT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TimingconstraintsPackage.DELAY_CONSTRAINT__LOWER:
				if (resolve) return getLower();
				return basicGetLower();
			case TimingconstraintsPackage.DELAY_CONSTRAINT__UPPER:
				if (resolve) return getUpper();
				return basicGetUpper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimingconstraintsPackage.DELAY_CONSTRAINT__TARGET:
				return target != null;
			case TimingconstraintsPackage.DELAY_CONSTRAINT__SOURCE:
				return source != null;
			case TimingconstraintsPackage.DELAY_CONSTRAINT__LOWER:
				return lower != null;
			case TimingconstraintsPackage.DELAY_CONSTRAINT__UPPER:
				return upper != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimingconstraintsPackage.DELAY_CONSTRAINT__TARGET:
				setTarget((Event)newValue);
				return;
			case TimingconstraintsPackage.DELAY_CONSTRAINT__SOURCE:
				setSource((Event)newValue);
				return;
			case TimingconstraintsPackage.DELAY_CONSTRAINT__LOWER:
				setLower((TimingExpression)newValue);
				return;
			case TimingconstraintsPackage.DELAY_CONSTRAINT__UPPER:
				setUpper((TimingExpression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingconstraintsPackage.Literals.DELAY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Event)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.DELAY_CONSTRAINT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Event newTarget) {
		Event oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.DELAY_CONSTRAINT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Event)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.DELAY_CONSTRAINT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Event newSource) {
		Event oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.DELAY_CONSTRAINT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpression getLower() {
		if (lower != null && lower.eIsProxy()) {
			InternalEObject oldLower = (InternalEObject)lower;
			lower = (TimingExpression)eResolveProxy(oldLower);
			if (lower != oldLower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.DELAY_CONSTRAINT__LOWER, oldLower, lower));
			}
		}
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpression basicGetLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(TimingExpression newLower) {
		TimingExpression oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.DELAY_CONSTRAINT__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpression getUpper() {
		if (upper != null && upper.eIsProxy()) {
			InternalEObject oldUpper = (InternalEObject)upper;
			upper = (TimingExpression)eResolveProxy(oldUpper);
			if (upper != oldUpper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingconstraintsPackage.DELAY_CONSTRAINT__UPPER, oldUpper, upper));
			}
		}
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpression basicGetUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(TimingExpression newUpper) {
		TimingExpression oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.DELAY_CONSTRAINT__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimingconstraintsPackage.DELAY_CONSTRAINT__TARGET:
				setTarget((Event)null);
				return;
			case TimingconstraintsPackage.DELAY_CONSTRAINT__SOURCE:
				setSource((Event)null);
				return;
			case TimingconstraintsPackage.DELAY_CONSTRAINT__LOWER:
				setLower((TimingExpression)null);
				return;
			case TimingconstraintsPackage.DELAY_CONSTRAINT__UPPER:
				setUpper((TimingExpression)null);
				return;
		}
		super.eUnset(featureID);
	}

} //DelayConstraintImpl
