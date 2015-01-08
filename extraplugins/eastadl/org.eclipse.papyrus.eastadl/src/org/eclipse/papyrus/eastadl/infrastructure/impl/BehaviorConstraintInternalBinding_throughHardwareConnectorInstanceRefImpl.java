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
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefImpl#getHardwareConnector <em>Hardware Connector</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefImpl#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefImpl extends InstanceRefImpl implements BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef {
	/**
	 * The cached value of the '{@link #getHardwareConnector() <em>Hardware Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getHardwareConnector()
	 * @generated
	 * @ordered
	 */
	protected HardwareConnector hardwareConnector;

	/**
	 * The cached value of the '{@link #getHardwareComponentPrototype() <em>Hardware Component Prototype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareComponentPrototype> hardwareComponentPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefImpl() {
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
		return InfrastructurePackage.Literals.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HardwareConnector getHardwareConnector() {
		if (hardwareConnector != null && hardwareConnector.eIsProxy()) {
			InternalEObject oldHardwareConnector = (InternalEObject) hardwareConnector;
			hardwareConnector = (HardwareConnector) eResolveProxy(oldHardwareConnector);
			if (hardwareConnector != oldHardwareConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_CONNECTOR, oldHardwareConnector, hardwareConnector));
			}
		}
		return hardwareConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HardwareConnector basicGetHardwareConnector() {
		return hardwareConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setHardwareConnector(HardwareConnector newHardwareConnector) {
		HardwareConnector oldHardwareConnector = hardwareConnector;
		hardwareConnector = newHardwareConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_CONNECTOR, oldHardwareConnector, hardwareConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<HardwareComponentPrototype> getHardwareComponentPrototype() {
		if (hardwareComponentPrototype == null) {
			hardwareComponentPrototype = new EObjectResolvingEList<HardwareComponentPrototype>(HardwareComponentPrototype.class, this,
					InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE);
		}
		return hardwareComponentPrototype;
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_CONNECTOR:
			if (resolve)
				return getHardwareConnector();
			return basicGetHardwareConnector();
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE:
			return getHardwareComponentPrototype();
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_CONNECTOR:
			setHardwareConnector((HardwareConnector) newValue);
			return;
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE:
			getHardwareComponentPrototype().clear();
			getHardwareComponentPrototype().addAll((Collection<? extends HardwareComponentPrototype>) newValue);
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_CONNECTOR:
			setHardwareConnector((HardwareConnector) null);
			return;
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE:
			getHardwareComponentPrototype().clear();
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
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_CONNECTOR:
			return hardwareConnector != null;
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE:
			return hardwareComponentPrototype != null && !hardwareComponentPrototype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefImpl
