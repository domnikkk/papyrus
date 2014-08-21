/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Failure Port hw Target Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePort_hwTargetInstanceRefImpl#getHardwarePort <em>Hardware Port</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePort_hwTargetInstanceRefImpl#getHardwareComponentProtype <em>Hardware Component Protype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultFailurePort_hwTargetInstanceRefImpl extends InstanceRefImpl implements FaultFailurePort_hwTargetInstanceRef {
	/**
	 * The cached value of the '{@link #getHardwarePort() <em>Hardware Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHardwarePort()
	 * @generated
	 * @ordered
	 */
	protected HardwarePin hardwarePort;

	/**
	 * The cached value of the '{@link #getHardwareComponentProtype() <em>Hardware Component Protype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHardwareComponentProtype()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareComponentPrototype> hardwareComponentProtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FaultFailurePort_hwTargetInstanceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public HardwarePin getHardwarePort() {
		if (hardwarePort != null && hardwarePort.eIsProxy()) {
			InternalEObject oldHardwarePort = (InternalEObject) hardwarePort;
			hardwarePort = (HardwarePin) eResolveProxy(oldHardwarePort);
			if (hardwarePort != oldHardwarePort) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_PORT, oldHardwarePort, hardwarePort));
				}
			}
		}
		return hardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HardwarePin basicGetHardwarePort() {
		return hardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHardwarePort(HardwarePin newHardwarePort) {
		HardwarePin oldHardwarePort = hardwarePort;
		hardwarePort = newHardwarePort;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_PORT, oldHardwarePort, hardwarePort));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<HardwareComponentPrototype> getHardwareComponentProtype() {
		if (hardwareComponentProtype == null) {
			hardwareComponentProtype = new EObjectResolvingEList<HardwareComponentPrototype>(HardwareComponentPrototype.class, this, InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE);
		}
		return hardwareComponentProtype;
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
		case InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_PORT:
			if (resolve) {
				return getHardwarePort();
			}
			return basicGetHardwarePort();
		case InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE:
			return getHardwareComponentProtype();
		}
		return super.eGet(featureID, resolve, coreType);
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
		case InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_PORT:
			setHardwarePort((HardwarePin) newValue);
			return;
		case InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE:
			getHardwareComponentProtype().clear();
			getHardwareComponentProtype().addAll((Collection<? extends HardwareComponentPrototype>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_PORT:
			setHardwarePort((HardwarePin) null);
			return;
		case InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE:
			getHardwareComponentProtype().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_PORT:
			return hardwarePort != null;
		case InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE:
			return hardwareComponentProtype != null && !hardwareComponentProtype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // FaultFailurePort_hwTargetInstanceRefImpl
