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
package org.eclipse.papyrus.eastadl.dependability.errormodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrormodelPackage;
import org.eclipse.papyrus.eastadl.dependability.errormodel.FaultFailurePort;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPort;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.uml2.uml.Port;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Failure Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.FaultFailurePortImpl#getBase_Port <em>Base Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.FaultFailurePortImpl#getFunctionTarget <em>Function Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.impl.FaultFailurePortImpl#getHwTarget <em>Hw Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FaultFailurePortImpl extends AnomalyImpl implements FaultFailurePort {
	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

	/**
	 * The cached value of the '{@link #getFunctionTarget() <em>Function Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctionTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultFailurePort_functionTargetInstanceRef> functionTarget;

	/**
	 * The cached value of the '{@link #getHwTarget() <em>Hw Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHwTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultFailurePort_hwTargetInstanceRef> hwTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FaultFailurePortImpl() {
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
		case ErrormodelPackage.FAULT_FAILURE_PORT__BASE_PORT:
			if (resolve) {
				return getBase_Port();
			}
			return basicGetBase_Port();
		case ErrormodelPackage.FAULT_FAILURE_PORT__FUNCTION_TARGET:
			return getFunctionTarget();
		case ErrormodelPackage.FAULT_FAILURE_PORT__HW_TARGET:
			return getHwTarget();
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
		case ErrormodelPackage.FAULT_FAILURE_PORT__BASE_PORT:
			return base_Port != null;
		case ErrormodelPackage.FAULT_FAILURE_PORT__FUNCTION_TARGET:
			return functionTarget != null && !functionTarget.isEmpty();
		case ErrormodelPackage.FAULT_FAILURE_PORT__HW_TARGET:
			return hwTarget != null && !hwTarget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EAPort.class) {
			switch (derivedFeatureID) {
			case ErrormodelPackage.FAULT_FAILURE_PORT__BASE_PORT:
				return ElementsPackage.EA_PORT__BASE_PORT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EAPort.class) {
			switch (baseFeatureID) {
			case ElementsPackage.EA_PORT__BASE_PORT:
				return ErrormodelPackage.FAULT_FAILURE_PORT__BASE_PORT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		case ErrormodelPackage.FAULT_FAILURE_PORT__BASE_PORT:
			setBase_Port((Port) newValue);
			return;
		case ErrormodelPackage.FAULT_FAILURE_PORT__FUNCTION_TARGET:
			getFunctionTarget().clear();
			getFunctionTarget().addAll((Collection<? extends FaultFailurePort_functionTargetInstanceRef>) newValue);
			return;
		case ErrormodelPackage.FAULT_FAILURE_PORT__HW_TARGET:
			getHwTarget().clear();
			getHwTarget().addAll((Collection<? extends FaultFailurePort_hwTargetInstanceRef>) newValue);
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
		return ErrormodelPackage.Literals.FAULT_FAILURE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject) base_Port;
			base_Port = (Port) eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrormodelPackage.FAULT_FAILURE_PORT__BASE_PORT, oldBase_Port, base_Port));
				}
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.FAULT_FAILURE_PORT__BASE_PORT, oldBase_Port, base_Port));
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
		case ErrormodelPackage.FAULT_FAILURE_PORT__BASE_PORT:
			setBase_Port((Port) null);
			return;
		case ErrormodelPackage.FAULT_FAILURE_PORT__FUNCTION_TARGET:
			getFunctionTarget().clear();
			return;
		case ErrormodelPackage.FAULT_FAILURE_PORT__HW_TARGET:
			getHwTarget().clear();
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
	public EList<FaultFailurePort_functionTargetInstanceRef> getFunctionTarget() {
		if (functionTarget == null) {
			functionTarget = new EObjectContainmentEList<FaultFailurePort_functionTargetInstanceRef>(FaultFailurePort_functionTargetInstanceRef.class, this, ErrormodelPackage.FAULT_FAILURE_PORT__FUNCTION_TARGET);
		}
		return functionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<FaultFailurePort_hwTargetInstanceRef> getHwTarget() {
		if (hwTarget == null) {
			hwTarget = new EObjectContainmentEList<FaultFailurePort_hwTargetInstanceRef>(FaultFailurePort_hwTargetInstanceRef.class, this, ErrormodelPackage.FAULT_FAILURE_PORT__HW_TARGET);
		}
		return hwTarget;
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
		case ErrormodelPackage.FAULT_FAILURE_PORT__FUNCTION_TARGET:
			return ((InternalEList<?>) getFunctionTarget()).basicRemove(otherEnd, msgs);
		case ErrormodelPackage.FAULT_FAILURE_PORT__HW_TARGET:
			return ((InternalEList<?>) getHwTarget()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

} // FaultFailurePortImpl
