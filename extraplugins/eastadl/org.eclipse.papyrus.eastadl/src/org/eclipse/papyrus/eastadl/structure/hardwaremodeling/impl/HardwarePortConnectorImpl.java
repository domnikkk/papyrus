/**
 */
package org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAConnector;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareBusKind;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareConnector;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePortConnector;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage;
import org.eclipse.uml2.uml.Connector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Port Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwarePortConnectorImpl#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwarePortConnectorImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwarePortConnectorImpl#getBusSpeed <em>Bus Speed</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwarePortConnectorImpl#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwarePortConnectorImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwarePortConnectorImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwarePortConnectorImpl extends AllocationTargetImpl implements HardwarePortConnector {
	/**
	 * The cached value of the '{@link #getBase_Connector() <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Connector()
	 * @generated
	 * @ordered
	 */
	protected Connector base_Connector;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The default value of the '{@link #getBusSpeed() <em>Bus Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Float BUS_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusSpeed() <em>Bus Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSpeed()
	 * @generated
	 * @ordered
	 */
	protected Float busSpeed = BUS_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusType() <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected static final HardwareBusKind BUS_TYPE_EDEFAULT = HardwareBusKind.TIME_TRIGGERED;

	/**
	 * The cached value of the '{@link #getBusType() <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected HardwareBusKind busType = BUS_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareConnector> connector;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePortConnectorInstanceRef> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwarePortConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwaremodelingPackage.Literals.HARDWARE_PORT_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getBase_Connector() {
		if (base_Connector != null && base_Connector.eIsProxy()) {
			InternalEObject oldBase_Connector = (InternalEObject)base_Connector;
			base_Connector = (Connector)eResolveProxy(oldBase_Connector);
			if (base_Connector != oldBase_Connector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CONNECTOR, oldBase_Connector, base_Connector));
			}
		}
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetBase_Connector() {
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Connector(Connector newBase_Connector) {
		Connector oldBase_Connector = base_Connector;
		base_Connector = newBase_Connector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CONNECTOR, oldBase_Connector, base_Connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getBusSpeed() {
		return busSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusSpeed(Float newBusSpeed) {
		Float oldBusSpeed = busSpeed;
		busSpeed = newBusSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BUS_SPEED, oldBusSpeed, busSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareBusKind getBusType() {
		return busType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusType(HardwareBusKind newBusType) {
		HardwareBusKind oldBusType = busType;
		busType = newBusType == null ? BUS_TYPE_EDEFAULT : newBusType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BUS_TYPE, oldBusType, busType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareConnector> getConnector() {
		if (connector == null) {
			connector = new EObjectResolvingEList<HardwareConnector>(HardwareConnector.class, this, HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePortConnectorInstanceRef> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<HardwarePortConnectorInstanceRef>(HardwarePortConnectorInstanceRef.class, this, HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CONNECTOR:
				if (resolve) return getBase_Connector();
				return basicGetBase_Connector();
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BUS_SPEED:
				return getBusSpeed();
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BUS_TYPE:
				return getBusType();
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__CONNECTOR:
				return getConnector();
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__PORT:
				return getPort();
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
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CONNECTOR:
				setBase_Connector((Connector)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BUS_SPEED:
				setBusSpeed((Float)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BUS_TYPE:
				setBusType((HardwareBusKind)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends HardwareConnector>)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends HardwarePortConnectorInstanceRef>)newValue);
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
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CONNECTOR:
				setBase_Connector((Connector)null);
				return;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BUS_SPEED:
				setBusSpeed(BUS_SPEED_EDEFAULT);
				return;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BUS_TYPE:
				setBusType(BUS_TYPE_EDEFAULT);
				return;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__CONNECTOR:
				getConnector().clear();
				return;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__PORT:
				getPort().clear();
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
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CONNECTOR:
				return base_Connector != null;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CLASS:
				return base_Class != null;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BUS_SPEED:
				return BUS_SPEED_EDEFAULT == null ? busSpeed != null : !BUS_SPEED_EDEFAULT.equals(busSpeed);
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BUS_TYPE:
				return busType != BUS_TYPE_EDEFAULT;
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__CONNECTOR:
				return connector != null && !connector.isEmpty();
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__PORT:
				return port != null && !port.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EAConnector.class) {
			switch (derivedFeatureID) {
				case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CONNECTOR: return ElementsPackage.EA_CONNECTOR__BASE_CONNECTOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EAConnector.class) {
			switch (baseFeatureID) {
				case ElementsPackage.EA_CONNECTOR__BASE_CONNECTOR: return HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR__BASE_CONNECTOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (busSpeed: ");
		result.append(busSpeed);
		result.append(", busType: ");
		result.append(busType);
		result.append(')');
		return result.toString();
	}

} //HardwarePortConnectorImpl
