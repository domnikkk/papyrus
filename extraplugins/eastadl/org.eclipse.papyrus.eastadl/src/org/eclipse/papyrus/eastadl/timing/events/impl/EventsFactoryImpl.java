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
package org.eclipse.papyrus.eastadl.timing.events.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.eastadl.timing.events.AUTOSAREvent;
import org.eclipse.papyrus.eastadl.timing.events.EventFaultFailure;
import org.eclipse.papyrus.eastadl.timing.events.EventFeatureFlaw;
import org.eclipse.papyrus.eastadl.timing.events.EventFunction;
import org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort;
import org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPortKind;
import org.eclipse.papyrus.eastadl.timing.events.EventFunctionFlowPort;
import org.eclipse.papyrus.eastadl.timing.events.EventsFactory;
import org.eclipse.papyrus.eastadl.timing.events.EventsPackage;
import org.eclipse.papyrus.eastadl.timing.events.ExternalEvent;
import org.eclipse.papyrus.eastadl.timing.events.ModeEvent;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EventsFactoryImpl extends EFactoryImpl implements EventsFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EventsPackage getPackage() {
		return EventsPackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static EventsFactory init() {
		try {
			EventsFactory theEventsFactory = (EventsFactory) EPackage.Registry.INSTANCE.getEFactory(EventsPackage.eNS_URI);
			if (theEventsFactory != null) {
				return theEventsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EventsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EventsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertEventFunctionClientServerPortKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_KIND:
			return convertEventFunctionClientServerPortKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EventsPackage.EVENT_FUNCTION_FLOW_PORT:
			return createEventFunctionFlowPort();
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT:
			return createEventFunctionClientServerPort();
		case EventsPackage.EVENT_FUNCTION:
			return createEventFunction();
		case EventsPackage.AUTOSAR_EVENT:
			return createAUTOSAREvent();
		case EventsPackage.EVENT_FAULT_FAILURE:
			return createEventFaultFailure();
		case EventsPackage.EVENT_FEATURE_FLAW:
			return createEventFeatureFlaw();
		case EventsPackage.EXTERNAL_EVENT:
			return createExternalEvent();
		case EventsPackage.MODE_EVENT:
			return createModeEvent();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EventFunction createEventFunction() {
		EventFunctionImpl eventFunction = new EventFunctionImpl();
		return eventFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AUTOSAREvent createAUTOSAREvent() {
		AUTOSAREventImpl autosarEvent = new AUTOSAREventImpl();
		return autosarEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EventFaultFailure createEventFaultFailure() {
		EventFaultFailureImpl eventFaultFailure = new EventFaultFailureImpl();
		return eventFaultFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EventFeatureFlaw createEventFeatureFlaw() {
		EventFeatureFlawImpl eventFeatureFlaw = new EventFeatureFlawImpl();
		return eventFeatureFlaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ExternalEvent createExternalEvent() {
		ExternalEventImpl externalEvent = new ExternalEventImpl();
		return externalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ModeEvent createModeEvent() {
		ModeEventImpl modeEvent = new ModeEventImpl();
		return modeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EventFunctionClientServerPort createEventFunctionClientServerPort() {
		EventFunctionClientServerPortImpl eventFunctionClientServerPort = new EventFunctionClientServerPortImpl();
		return eventFunctionClientServerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EventFunctionClientServerPortKind createEventFunctionClientServerPortKindFromString(EDataType eDataType, String initialValue) {
		EventFunctionClientServerPortKind result = EventFunctionClientServerPortKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EventFunctionFlowPort createEventFunctionFlowPort() {
		EventFunctionFlowPortImpl eventFunctionFlowPort = new EventFunctionFlowPortImpl();
		return eventFunctionFlowPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_KIND:
			return createEventFunctionClientServerPortKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EventsPackage getEventsPackage() {
		return (EventsPackage) getEPackage();
	}

} // EventsFactoryImpl
