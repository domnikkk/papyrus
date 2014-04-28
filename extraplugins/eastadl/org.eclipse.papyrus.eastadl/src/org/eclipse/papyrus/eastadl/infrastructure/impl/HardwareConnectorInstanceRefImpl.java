/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;

import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Connector Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.HardwareConnectorInstanceRefImpl#getHardwarePin <em>Hardware Pin</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.HardwareConnectorInstanceRefImpl#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareConnectorInstanceRefImpl extends InstanceRefImpl implements HardwareConnectorInstanceRef {
	/**
	 * The cached value of the '{@link #getHardwarePin() <em>Hardware Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwarePin()
	 * @generated
	 * @ordered
	 */
	protected HardwarePin hardwarePin;

	/**
	 * The cached value of the '{@link #getHardwareComponentPrototype() <em>Hardware Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 * @ordered
	 */
	protected HardwareComponentPrototype hardwareComponentPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareConnectorInstanceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.HARDWARE_CONNECTOR_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePin getHardwarePin() {
		if (hardwarePin != null && hardwarePin.eIsProxy()) {
			InternalEObject oldHardwarePin = (InternalEObject)hardwarePin;
			hardwarePin = (HardwarePin)eResolveProxy(oldHardwarePin);
			if (hardwarePin != oldHardwarePin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_PIN, oldHardwarePin, hardwarePin));
			}
		}
		return hardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePin basicGetHardwarePin() {
		return hardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwarePin(HardwarePin newHardwarePin) {
		HardwarePin oldHardwarePin = hardwarePin;
		hardwarePin = newHardwarePin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_PIN, oldHardwarePin, hardwarePin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentPrototype getHardwareComponentPrototype() {
		if (hardwareComponentPrototype != null && hardwareComponentPrototype.eIsProxy()) {
			InternalEObject oldHardwareComponentPrototype = (InternalEObject)hardwareComponentPrototype;
			hardwareComponentPrototype = (HardwareComponentPrototype)eResolveProxy(oldHardwareComponentPrototype);
			if (hardwareComponentPrototype != oldHardwareComponentPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE, oldHardwareComponentPrototype, hardwareComponentPrototype));
			}
		}
		return hardwareComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentPrototype basicGetHardwareComponentPrototype() {
		return hardwareComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareComponentPrototype(HardwareComponentPrototype newHardwareComponentPrototype) {
		HardwareComponentPrototype oldHardwareComponentPrototype = hardwareComponentPrototype;
		hardwareComponentPrototype = newHardwareComponentPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE, oldHardwareComponentPrototype, hardwareComponentPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_PIN:
				if (resolve) return getHardwarePin();
				return basicGetHardwarePin();
			case InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE:
				if (resolve) return getHardwareComponentPrototype();
				return basicGetHardwareComponentPrototype();
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
			case InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_PIN:
				setHardwarePin((HardwarePin)newValue);
				return;
			case InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE:
				setHardwareComponentPrototype((HardwareComponentPrototype)newValue);
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
			case InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_PIN:
				setHardwarePin((HardwarePin)null);
				return;
			case InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE:
				setHardwareComponentPrototype((HardwareComponentPrototype)null);
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
			case InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_PIN:
				return hardwarePin != null;
			case InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE:
				return hardwareComponentPrototype != null;
		}
		return super.eIsSet(featureID);
	}

} //HardwareConnectorInstanceRefImpl
