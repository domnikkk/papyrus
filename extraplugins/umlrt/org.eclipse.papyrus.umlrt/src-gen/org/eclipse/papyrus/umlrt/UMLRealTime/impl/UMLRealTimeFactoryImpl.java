/**
 */
package org.eclipse.papyrus.umlrt.UMLRealTime.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.umlrt.UMLRealTime.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLRealTimeFactoryImpl extends EFactoryImpl implements UMLRealTimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UMLRealTimeFactory init() {
		try {
			UMLRealTimeFactory theUMLRealTimeFactory = (UMLRealTimeFactory)EPackage.Registry.INSTANCE.getEFactory(UMLRealTimePackage.eNS_URI);
			if (theUMLRealTimeFactory != null) {
				return theUMLRealTimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLRealTimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealTimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UMLRealTimePackage.CAPSULE: return createCapsule();
			case UMLRealTimePackage.CAPSULE_PART: return createCapsulePart();
			case UMLRealTimePackage.PROTOCOL: return createProtocol();
			case UMLRealTimePackage.RT_PORT: return createRTPort();
			case UMLRealTimePackage.RT_CONNECTOR: return createRTConnector();
			case UMLRealTimePackage.PROTOCOL_PACKAGE: return createProtocolPackage();
			case UMLRealTimePackage.RTR_EXCLUDED_ELEMENT: return createRTRExcludedElement();
			case UMLRealTimePackage.MESSAGE_SET: return createMessageSet();
			case UMLRealTimePackage.TRIGGER_EVENT: return createTriggerEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UMLRealTimePackage.PORT_REGISTRATION_TYPE:
				return createPortRegistrationTypeFromString(eDataType, initialValue);
			case UMLRealTimePackage.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UMLRealTimePackage.PORT_REGISTRATION_TYPE:
				return convertPortRegistrationTypeToString(eDataType, instanceValue);
			case UMLRealTimePackage.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capsule createCapsule() {
		CapsuleImpl capsule = new CapsuleImpl();
		return capsule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapsulePart createCapsulePart() {
		CapsulePartImpl capsulePart = new CapsulePartImpl();
		return capsulePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocol() {
		ProtocolImpl protocol = new ProtocolImpl();
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTPort createRTPort() {
		RTPortImpl rtPort = new RTPortImpl();
		return rtPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTConnector createRTConnector() {
		RTConnectorImpl rtConnector = new RTConnectorImpl();
		return rtConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolPackage createProtocolPackage() {
		ProtocolPackageImpl protocolPackage = new ProtocolPackageImpl();
		return protocolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTRExcludedElement createRTRExcludedElement() {
		RTRExcludedElementImpl rtrExcludedElement = new RTRExcludedElementImpl();
		return rtrExcludedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSet createMessageSet() {
		MessageSetImpl messageSet = new MessageSetImpl();
		return messageSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEvent createTriggerEvent() {
		TriggerEventImpl triggerEvent = new TriggerEventImpl();
		return triggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRegistrationType createPortRegistrationTypeFromString(EDataType eDataType, String initialValue) {
		PortRegistrationType result = PortRegistrationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortRegistrationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeFromString(EDataType eDataType, String initialValue) {
		EventType result = EventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealTimePackage getUMLRealTimePackage() {
		return (UMLRealTimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLRealTimePackage getPackage() {
		return UMLRealTimePackage.eINSTANCE;
	}

} //UMLRealTimeFactoryImpl
