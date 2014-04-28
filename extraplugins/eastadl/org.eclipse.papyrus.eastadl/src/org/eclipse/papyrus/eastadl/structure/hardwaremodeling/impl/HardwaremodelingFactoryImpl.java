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
package org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.Actuator;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.CommunicationHardwarePin;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.ElectricalComponent;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareBusKind;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentPrototype;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareComponentType;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwareConnector;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePort;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwarePortConnector;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingFactory;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.IOHardwarePin;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.IOHardwarePinKind;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.Node;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.PowerHardwarePin;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.Sensor;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwaremodelingFactoryImpl extends EFactoryImpl implements HardwaremodelingFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HardwaremodelingPackage getPackage() {
		return HardwaremodelingPackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HardwaremodelingFactory init() {
		try {
			HardwaremodelingFactory theHardwaremodelingFactory = (HardwaremodelingFactory)EPackage.Registry.INSTANCE.getEFactory(HardwaremodelingPackage.eNS_URI);
			if (theHardwaremodelingFactory != null) {
				return theHardwaremodelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HardwaremodelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwaremodelingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HardwaremodelingPackage.HARDWARE_BUS_KIND:
				return convertHardwareBusKindToString(eDataType, instanceValue);
			case HardwaremodelingPackage.IO_HARDWARE_PIN_KIND:
				return convertIOHardwarePinKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE: return createHardwareComponentType();
			case HardwaremodelingPackage.HARDWARE_CONNECTOR: return createHardwareConnector();
			case HardwaremodelingPackage.HARDWARE_COMPONENT_PROTOTYPE: return createHardwareComponentPrototype();
			case HardwaremodelingPackage.HARDWARE_PORT_CONNECTOR: return createHardwarePortConnector();
			case HardwaremodelingPackage.HARDWARE_PORT: return createHardwarePort();
			case HardwaremodelingPackage.IO_HARDWARE_PIN: return createIOHardwarePin();
			case HardwaremodelingPackage.POWER_HARDWARE_PIN: return createPowerHardwarePin();
			case HardwaremodelingPackage.COMMUNICATION_HARDWARE_PIN: return createCommunicationHardwarePin();
			case HardwaremodelingPackage.NODE: return createNode();
			case HardwaremodelingPackage.ELECTRICAL_COMPONENT: return createElectricalComponent();
			case HardwaremodelingPackage.SENSOR: return createSensor();
			case HardwaremodelingPackage.ACTUATOR: return createActuator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareBusKind createHardwareBusKindFromString(EDataType eDataType, String initialValue) {
		HardwareBusKind result = HardwareBusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHardwareBusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationHardwarePin createCommunicationHardwarePin() {
		CommunicationHardwarePinImpl communicationHardwarePin = new CommunicationHardwarePinImpl();
		return communicationHardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HardwaremodelingPackage.HARDWARE_BUS_KIND:
				return createHardwareBusKindFromString(eDataType, initialValue);
			case HardwaremodelingPackage.IO_HARDWARE_PIN_KIND:
				return createIOHardwarePinKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentPrototype createHardwareComponentPrototype() {
		HardwareComponentPrototypeImpl hardwareComponentPrototype = new HardwareComponentPrototypeImpl();
		return hardwareComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePortConnector createHardwarePortConnector() {
		HardwarePortConnectorImpl hardwarePortConnector = new HardwarePortConnectorImpl();
		return hardwarePortConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePort createHardwarePort() {
		HardwarePortImpl hardwarePort = new HardwarePortImpl();
		return hardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOHardwarePin createIOHardwarePin() {
		IOHardwarePinImpl ioHardwarePin = new IOHardwarePinImpl();
		return ioHardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentType createHardwareComponentType() {
		HardwareComponentTypeImpl hardwareComponentType = new HardwareComponentTypeImpl();
		return hardwareComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOHardwarePinKind createIOHardwarePinKindFromString(EDataType eDataType, String initialValue) {
		IOHardwarePinKind result = IOHardwarePinKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOHardwarePinKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareConnector createHardwareConnector() {
		HardwareConnectorImpl hardwareConnector = new HardwareConnectorImpl();
		return hardwareConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalComponent createElectricalComponent() {
		ElectricalComponentImpl electricalComponent = new ElectricalComponentImpl();
		return electricalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerHardwarePin createPowerHardwarePin() {
		PowerHardwarePinImpl powerHardwarePin = new PowerHardwarePinImpl();
		return powerHardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwaremodelingPackage getHardwaremodelingPackage() {
		return (HardwaremodelingPackage)getEPackage();
	}

} //HardwaremodelingFactoryImpl
