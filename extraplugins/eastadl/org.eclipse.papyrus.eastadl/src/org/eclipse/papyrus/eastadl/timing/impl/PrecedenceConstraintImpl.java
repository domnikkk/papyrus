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
package org.eclipse.papyrus.eastadl.timing.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef;
import org.eclipse.papyrus.eastadl.timing.PrecedenceConstraint;
import org.eclipse.papyrus.eastadl.timing.TimingPackage;


/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Precedence Constraint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.impl.PrecedenceConstraintImpl#getPreceding <em>Preceding</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.impl.PrecedenceConstraintImpl#getSuccessive <em>Successive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrecedenceConstraintImpl extends TimingConstraintImpl implements PrecedenceConstraint {

	/**
	 * The cached value of the '{@link #getPreceding() <em>Preceding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreceding()
	 * @generated
	 * @ordered
	 */
	protected PrecedenceConstraint_precedingInstanceRef preceding;

	/**
	 * The cached value of the '{@link #getSuccessive() <em>Successive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessive()
	 * @generated
	 * @ordered
	 */
	protected EList<PrecedenceConstraint_successiveInstanceRef> successive;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING:
				return getPreceding();
			case TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE:
				return getSuccessive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING:
				return preceding != null;
			case TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE:
				return successive != null && !successive.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING:
				setPreceding((PrecedenceConstraint_precedingInstanceRef)newValue);
				return;
			case TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE:
				getSuccessive().clear();
				getSuccessive().addAll((Collection<? extends PrecedenceConstraint_successiveInstanceRef>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingPackage.Literals.PRECEDENCE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING:
				setPreceding((PrecedenceConstraint_precedingInstanceRef)null);
				return;
			case TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE:
				getSuccessive().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceConstraint_precedingInstanceRef getPreceding() {
		return preceding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreceding(PrecedenceConstraint_precedingInstanceRef newPreceding, NotificationChain msgs) {
		PrecedenceConstraint_precedingInstanceRef oldPreceding = preceding;
		preceding = newPreceding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING, oldPreceding, newPreceding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreceding(PrecedenceConstraint_precedingInstanceRef newPreceding) {
		if (newPreceding != preceding) {
			NotificationChain msgs = null;
			if (preceding != null)
				msgs = ((InternalEObject)preceding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING, null, msgs);
			if (newPreceding != null)
				msgs = ((InternalEObject)newPreceding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING, null, msgs);
			msgs = basicSetPreceding(newPreceding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING, newPreceding, newPreceding));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrecedenceConstraint_successiveInstanceRef> getSuccessive() {
		if (successive == null) {
			successive = new EObjectContainmentEList<PrecedenceConstraint_successiveInstanceRef>(PrecedenceConstraint_successiveInstanceRef.class, this, TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE);
		}
		return successive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING:
				return basicSetPreceding(null, msgs);
			case TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE:
				return ((InternalEList<?>)getSuccessive()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

} // PrecedenceConstraintImpl
