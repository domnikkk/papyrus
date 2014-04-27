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
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelPrototype;
import org.eclipse.papyrus.eastadl.dependability.errormodel.FaultFailurePort;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_fromPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Failure Propagation Link from Port Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePropagationLink_fromPortInstanceRefImpl#getFaultFairelurePort <em>Fault Fairelure Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePropagationLink_fromPortInstanceRefImpl#getErrorModelPrototype <em>Error Model Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultFailurePropagationLink_fromPortInstanceRefImpl extends InstanceRefImpl implements FaultFailurePropagationLink_fromPortInstanceRef {
	/**
	 * The cached value of the '{@link #getFaultFairelurePort() <em>Fault Fairelure Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultFairelurePort()
	 * @generated
	 * @ordered
	 */
	protected FaultFailurePort faultFairelurePort;

	/**
	 * The cached value of the '{@link #getErrorModelPrototype() <em>Error Model Prototype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelPrototype()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelPrototype> errorModelPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultFailurePropagationLink_fromPortInstanceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePort getFaultFairelurePort() {
		if (faultFairelurePort != null && faultFairelurePort.eIsProxy()) {
			InternalEObject oldFaultFairelurePort = (InternalEObject)faultFairelurePort;
			faultFairelurePort = (FaultFailurePort)eResolveProxy(oldFaultFairelurePort);
			if (faultFairelurePort != oldFaultFairelurePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__FAULT_FAIRELURE_PORT, oldFaultFairelurePort, faultFairelurePort));
			}
		}
		return faultFairelurePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePort basicGetFaultFairelurePort() {
		return faultFairelurePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultFairelurePort(FaultFailurePort newFaultFairelurePort) {
		FaultFailurePort oldFaultFairelurePort = faultFairelurePort;
		faultFairelurePort = newFaultFairelurePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__FAULT_FAIRELURE_PORT, oldFaultFairelurePort, faultFairelurePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorModelPrototype> getErrorModelPrototype() {
		if (errorModelPrototype == null) {
			errorModelPrototype = new EObjectResolvingEList<ErrorModelPrototype>(ErrorModelPrototype.class, this, InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__ERROR_MODEL_PROTOTYPE);
		}
		return errorModelPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__FAULT_FAIRELURE_PORT:
				if (resolve) return getFaultFairelurePort();
				return basicGetFaultFairelurePort();
			case InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__ERROR_MODEL_PROTOTYPE:
				return getErrorModelPrototype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__FAULT_FAIRELURE_PORT:
				setFaultFairelurePort((FaultFailurePort)newValue);
				return;
			case InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__ERROR_MODEL_PROTOTYPE:
				getErrorModelPrototype().clear();
				getErrorModelPrototype().addAll((Collection<? extends ErrorModelPrototype>)newValue);
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
			case InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__FAULT_FAIRELURE_PORT:
				setFaultFairelurePort((FaultFailurePort)null);
				return;
			case InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__ERROR_MODEL_PROTOTYPE:
				getErrorModelPrototype().clear();
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
			case InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__FAULT_FAIRELURE_PORT:
				return faultFairelurePort != null;
			case InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__ERROR_MODEL_PROTOTYPE:
				return errorModelPrototype != null && !errorModelPrototype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FaultFailurePropagationLink_fromPortInstanceRefImpl
