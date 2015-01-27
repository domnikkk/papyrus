/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.activities.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.sysml14.activities.ActivitiesPackage;
import org.eclipse.papyrus.sysml14.activities.Rate;

import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.activities.internal.impl.RateImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.activities.internal.impl.RateImpl#getBase_ActivityEdge <em>Base Activity Edge</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.activities.internal.impl.RateImpl#getBase_ObjectNode <em>Base Object Node</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.activities.internal.impl.RateImpl#getBase_Parameter <em>Base Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RateImpl extends MinimalEObjectImpl.Container implements Rate {
	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected InstanceSpecification rate;

	/**
	 * The cached value of the '{@link #getBase_ActivityEdge() <em>Base Activity Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ActivityEdge()
	 * @generated
	 * @ordered
	 */
	protected ActivityEdge base_ActivityEdge;

	/**
	 * The cached value of the '{@link #getBase_ObjectNode() <em>Base Object Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ObjectNode()
	 * @generated
	 * @ordered
	 */
	protected ObjectNode base_ObjectNode;

	/**
	 * The cached value of the '{@link #getBase_Parameter() <em>Base Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Parameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter base_Parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.RATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getRate() {
		if (rate != null && rate.eIsProxy()) {
			InternalEObject oldRate = (InternalEObject)rate;
			rate = (InstanceSpecification)eResolveProxy(oldRate);
			if (rate != oldRate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.RATE__RATE, oldRate, rate));
			}
		}
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification basicGetRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(InstanceSpecification newRate) {
		InstanceSpecification oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.RATE__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getBase_ActivityEdge() {
		if (base_ActivityEdge != null && base_ActivityEdge.eIsProxy()) {
			InternalEObject oldBase_ActivityEdge = (InternalEObject)base_ActivityEdge;
			base_ActivityEdge = (ActivityEdge)eResolveProxy(oldBase_ActivityEdge);
			if (base_ActivityEdge != oldBase_ActivityEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.RATE__BASE_ACTIVITY_EDGE, oldBase_ActivityEdge, base_ActivityEdge));
			}
		}
		return base_ActivityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge basicGetBase_ActivityEdge() {
		return base_ActivityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ActivityEdge(ActivityEdge newBase_ActivityEdge) {
		ActivityEdge oldBase_ActivityEdge = base_ActivityEdge;
		base_ActivityEdge = newBase_ActivityEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.RATE__BASE_ACTIVITY_EDGE, oldBase_ActivityEdge, base_ActivityEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode getBase_ObjectNode() {
		if (base_ObjectNode != null && base_ObjectNode.eIsProxy()) {
			InternalEObject oldBase_ObjectNode = (InternalEObject)base_ObjectNode;
			base_ObjectNode = (ObjectNode)eResolveProxy(oldBase_ObjectNode);
			if (base_ObjectNode != oldBase_ObjectNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.RATE__BASE_OBJECT_NODE, oldBase_ObjectNode, base_ObjectNode));
			}
		}
		return base_ObjectNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode basicGetBase_ObjectNode() {
		return base_ObjectNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ObjectNode(ObjectNode newBase_ObjectNode) {
		ObjectNode oldBase_ObjectNode = base_ObjectNode;
		base_ObjectNode = newBase_ObjectNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.RATE__BASE_OBJECT_NODE, oldBase_ObjectNode, base_ObjectNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getBase_Parameter() {
		if (base_Parameter != null && base_Parameter.eIsProxy()) {
			InternalEObject oldBase_Parameter = (InternalEObject)base_Parameter;
			base_Parameter = (Parameter)eResolveProxy(oldBase_Parameter);
			if (base_Parameter != oldBase_Parameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.RATE__BASE_PARAMETER, oldBase_Parameter, base_Parameter));
			}
		}
		return base_Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetBase_Parameter() {
		return base_Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Parameter(Parameter newBase_Parameter) {
		Parameter oldBase_Parameter = base_Parameter;
		base_Parameter = newBase_Parameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.RATE__BASE_PARAMETER, oldBase_Parameter, base_Parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.RATE__RATE:
				if (resolve) return getRate();
				return basicGetRate();
			case ActivitiesPackage.RATE__BASE_ACTIVITY_EDGE:
				if (resolve) return getBase_ActivityEdge();
				return basicGetBase_ActivityEdge();
			case ActivitiesPackage.RATE__BASE_OBJECT_NODE:
				if (resolve) return getBase_ObjectNode();
				return basicGetBase_ObjectNode();
			case ActivitiesPackage.RATE__BASE_PARAMETER:
				if (resolve) return getBase_Parameter();
				return basicGetBase_Parameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitiesPackage.RATE__RATE:
				setRate((InstanceSpecification)newValue);
				return;
			case ActivitiesPackage.RATE__BASE_ACTIVITY_EDGE:
				setBase_ActivityEdge((ActivityEdge)newValue);
				return;
			case ActivitiesPackage.RATE__BASE_OBJECT_NODE:
				setBase_ObjectNode((ObjectNode)newValue);
				return;
			case ActivitiesPackage.RATE__BASE_PARAMETER:
				setBase_Parameter((Parameter)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.RATE__RATE:
				setRate((InstanceSpecification)null);
				return;
			case ActivitiesPackage.RATE__BASE_ACTIVITY_EDGE:
				setBase_ActivityEdge((ActivityEdge)null);
				return;
			case ActivitiesPackage.RATE__BASE_OBJECT_NODE:
				setBase_ObjectNode((ObjectNode)null);
				return;
			case ActivitiesPackage.RATE__BASE_PARAMETER:
				setBase_Parameter((Parameter)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.RATE__RATE:
				return rate != null;
			case ActivitiesPackage.RATE__BASE_ACTIVITY_EDGE:
				return base_ActivityEdge != null;
			case ActivitiesPackage.RATE__BASE_OBJECT_NODE:
				return base_ObjectNode != null;
			case ActivitiesPackage.RATE__BASE_PARAMETER:
				return base_Parameter != null;
		}
		return super.eIsSet(featureID);
	}

} //RateImpl
