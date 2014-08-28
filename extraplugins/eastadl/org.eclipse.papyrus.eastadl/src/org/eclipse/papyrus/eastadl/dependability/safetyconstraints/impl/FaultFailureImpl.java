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
package org.eclipse.papyrus.eastadl.dependability.safetyconstraints.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.eastadl.dependability.safetyconstraints.FaultFailure;
import org.eclipse.papyrus.eastadl.dependability.safetyconstraints.SafetyconstraintsPackage;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Failure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.safetyconstraints.impl.FaultFailureImpl#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.safetyconstraints.impl.FaultFailureImpl#getFaultFailureValue <em>Fault Failure Value</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.safetyconstraints.impl.FaultFailureImpl#getAnomaly <em>Anomaly</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultFailureImpl extends TraceableSpecificationImpl implements FaultFailure {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getAnomaly() <em>Anomaly</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAnomaly()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultFailure_anomalyInstanceRef> anomaly;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected FaultFailureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SafetyconstraintsPackage.FAULT_FAILURE__BASE_CLASS:
			if (resolve) {
				return getBase_Class();
			}
			return basicGetBase_Class();
		case SafetyconstraintsPackage.FAULT_FAILURE__FAULT_FAILURE_VALUE:
			if (resolve) {
				return getFaultFailureValue();
			}
			return basicGetFaultFailureValue();
		case SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY:
			return getAnomaly();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SafetyconstraintsPackage.FAULT_FAILURE__BASE_CLASS:
			return base_Class != null;
		case SafetyconstraintsPackage.FAULT_FAILURE__FAULT_FAILURE_VALUE:
			return basicGetFaultFailureValue() != null;
		case SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY:
			return anomaly != null && !anomaly.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SafetyconstraintsPackage.FAULT_FAILURE__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) newValue);
			return;
		case SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY:
			getAnomaly().clear();
			getAnomaly().addAll((Collection<? extends FaultFailure_anomalyInstanceRef>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyconstraintsPackage.Literals.FAULT_FAILURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject) base_Class;
			base_Class = (org.eclipse.uml2.uml.Class) eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SafetyconstraintsPackage.FAULT_FAILURE__BASE_CLASS, oldBase_Class, base_Class));
				}
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyconstraintsPackage.FAULT_FAILURE__BASE_CLASS, oldBase_Class, base_Class));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SafetyconstraintsPackage.FAULT_FAILURE__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) null);
			return;
		case SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY:
			getAnomaly().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<FaultFailure_anomalyInstanceRef> getAnomaly() {
		if (anomaly == null) {
			anomaly = new EObjectContainmentEList<FaultFailure_anomalyInstanceRef>(FaultFailure_anomalyInstanceRef.class, this, SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY);
		}
		return anomaly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY:
			return ((InternalEList<?>) getAnomaly()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAValue getFaultFailureValue() {
		EAValue faultFailureValue = basicGetFaultFailureValue();
		return faultFailureValue != null && faultFailureValue.eIsProxy() ? (EAValue) eResolveProxy((InternalEObject) faultFailureValue) : faultFailureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public EAValue basicGetFaultFailureValue() {
		EAValue eaValue = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				eaValue = UMLUtil.getStereotypeApplication(element, EAValue.class);
				if (eaValue != null) {
					return eaValue;
				}
			}
		}

		return eaValue;
	}

} // FaultFailureImpl
