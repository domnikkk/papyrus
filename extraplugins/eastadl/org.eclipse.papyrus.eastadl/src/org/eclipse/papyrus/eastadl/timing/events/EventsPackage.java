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
package org.eclipse.papyrus.eastadl.timing.events;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.eastadl.timing.TimingPackage;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This section describes the concept of events for EAST-ADL2.
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.papyrus.eastadl.timing.events.EventsFactory
 * @model kind="package"
 * @generated
 */
public interface EventsPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionFlowPortImpl <em>Event Function Flow Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionFlowPortImpl
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getEventFunctionFlowPort()
		 * @generated
		 */
		EClass EVENT_FUNCTION_FLOW_PORT = eINSTANCE.getEventFunctionFlowPort();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT_FUNCTION_FLOW_PORT__PORT = eINSTANCE.getEventFunctionFlowPort_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionClientServerPortImpl <em>Event Function Client Server Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionClientServerPortImpl
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getEventFunctionClientServerPort()
		 * @generated
		 */
		EClass EVENT_FUNCTION_CLIENT_SERVER_PORT = eINSTANCE.getEventFunctionClientServerPort();

		/**
		 * The meta object literal for the '<em><b>Event Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND = eINSTANCE.getEventFunctionClientServerPort_EventKind();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT = eINSTANCE.getEventFunctionClientServerPort_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionImpl <em>Event Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionImpl
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getEventFunction()
		 * @generated
		 */
		EClass EVENT_FUNCTION = eINSTANCE.getEventFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT_FUNCTION__FUNCTION = eINSTANCE.getEventFunction_Function();

		/**
		 * The meta object literal for the '<em><b>Function Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT_FUNCTION__FUNCTION_TYPE = eINSTANCE.getEventFunction_FunctionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.AUTOSAREventImpl <em>AUTOSAR Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.AUTOSAREventImpl
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getAUTOSAREvent()
		 * @generated
		 */
		EClass AUTOSAR_EVENT = eINSTANCE.getAUTOSAREvent();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference AUTOSAR_EVENT__REF = eINSTANCE.getAUTOSAREvent_Ref();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFaultFailureImpl <em>Event Fault Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventFaultFailureImpl
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getEventFaultFailure()
		 * @generated
		 */
		EClass EVENT_FAULT_FAILURE = eINSTANCE.getEventFaultFailure();

		/**
		 * The meta object literal for the '<em><b>Fault Failure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT_FAULT_FAILURE__FAULT_FAILURE = eINSTANCE.getEventFaultFailure_FaultFailure();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFeatureFlawImpl <em>Event Feature Flaw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventFeatureFlawImpl
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getEventFeatureFlaw()
		 * @generated
		 */
		EClass EVENT_FEATURE_FLAW = eINSTANCE.getEventFeatureFlaw();

		/**
		 * The meta object literal for the '<em><b>Feature Flaw</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT_FEATURE_FLAW__FEATURE_FLAW = eINSTANCE.getEventFeatureFlaw_FeatureFlaw();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.ExternalEventImpl <em>External Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.ExternalEventImpl
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getExternalEvent()
		 * @generated
		 */
		EClass EXTERNAL_EVENT = eINSTANCE.getExternalEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.ModeEventImpl <em>Mode Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.ModeEventImpl
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getModeEvent()
		 * @generated
		 */
		EClass MODE_EVENT = eINSTANCE.getModeEvent();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODE_EVENT__START = eINSTANCE.getModeEvent_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODE_EVENT__END = eINSTANCE.getModeEvent_End();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPortKind <em>Event Function Client Server Port Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPortKind
		 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getEventFunctionClientServerPortKind()
		 * @generated
		 */
		EEnum EVENT_FUNCTION_CLIENT_SERVER_PORT_KIND = eINSTANCE.getEventFunctionClientServerPortKind();

	}

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "events";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Timing/Events/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "Events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	EventsPackage eINSTANCE = org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionFlowPortImpl <em>Event Function Flow Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionFlowPortImpl
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getEventFunctionFlowPort()
	 * @generated
	 */
	int EVENT_FUNCTION_FLOW_PORT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__BASE_NAMED_ELEMENT = TimingPackage.EVENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__NAME = TimingPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__OWNED_COMMENT = TimingPackage.EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__BASE_CLASS = TimingPackage.EVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__TYPE = TimingPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__BASE_VALUE_SPECIFICATION = TimingPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__PORT = TimingPackage.EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event Function Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT_FEATURE_COUNT = TimingPackage.EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Event Function Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT_OPERATION_COUNT = TimingPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionClientServerPortImpl <em>Event Function Client Server Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionClientServerPortImpl
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getEventFunctionClientServerPort()
	 * @generated
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT = 1;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__BASE_NAMED_ELEMENT = TimingPackage.EVENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__NAME = TimingPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__OWNED_COMMENT = TimingPackage.EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__BASE_CLASS = TimingPackage.EVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__TYPE = TimingPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__BASE_VALUE_SPECIFICATION = TimingPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND = TimingPackage.EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT = TimingPackage.EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event Function Client Server Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT_FEATURE_COUNT = TimingPackage.EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Event Function Client Server Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT_OPERATION_COUNT = TimingPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionImpl <em>Event Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventFunctionImpl
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getEventFunction()
	 * @generated
	 */
	int EVENT_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__BASE_NAMED_ELEMENT = TimingPackage.EVENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__NAME = TimingPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__OWNED_COMMENT = TimingPackage.EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__BASE_CLASS = TimingPackage.EVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__FUNCTION = TimingPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__FUNCTION_TYPE = TimingPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FEATURE_COUNT = TimingPackage.EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_OPERATION_COUNT = TimingPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.AUTOSAREventImpl <em>AUTOSAR Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.AUTOSAREventImpl
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getAUTOSAREvent()
	 * @generated
	 */
	int AUTOSAR_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_EVENT__BASE_NAMED_ELEMENT = TimingPackage.EVENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_EVENT__NAME = TimingPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_EVENT__OWNED_COMMENT = TimingPackage.EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_EVENT__BASE_CLASS = TimingPackage.EVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_EVENT__REF = TimingPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AUTOSAR Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_EVENT_FEATURE_COUNT = TimingPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AUTOSAR Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_EVENT_OPERATION_COUNT = TimingPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFaultFailureImpl <em>Event Fault Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventFaultFailureImpl
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getEventFaultFailure()
	 * @generated
	 */
	int EVENT_FAULT_FAILURE = 4;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FAULT_FAILURE__BASE_NAMED_ELEMENT = TimingPackage.EVENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FAULT_FAILURE__NAME = TimingPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FAULT_FAILURE__OWNED_COMMENT = TimingPackage.EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FAULT_FAILURE__BASE_CLASS = TimingPackage.EVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Fault Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FAULT_FAILURE__FAULT_FAILURE = TimingPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Fault Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FAULT_FAILURE_FEATURE_COUNT = TimingPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Fault Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FAULT_FAILURE_OPERATION_COUNT = TimingPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.EventFeatureFlawImpl <em>Event Feature Flaw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventFeatureFlawImpl
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getEventFeatureFlaw()
	 * @generated
	 */
	int EVENT_FEATURE_FLAW = 5;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_FLAW__BASE_NAMED_ELEMENT = TimingPackage.EVENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_FLAW__NAME = TimingPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_FLAW__OWNED_COMMENT = TimingPackage.EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_FLAW__BASE_CLASS = TimingPackage.EVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Feature Flaw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_FLAW__FEATURE_FLAW = TimingPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Feature Flaw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_FLAW_FEATURE_COUNT = TimingPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Feature Flaw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_FLAW_OPERATION_COUNT = TimingPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.ExternalEventImpl <em>External Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.ExternalEventImpl
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getExternalEvent()
	 * @generated
	 */
	int EXTERNAL_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__BASE_NAMED_ELEMENT = TimingPackage.EVENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__NAME = TimingPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__OWNED_COMMENT = TimingPackage.EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__BASE_CLASS = TimingPackage.EVENT__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT_FEATURE_COUNT = TimingPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT_OPERATION_COUNT = TimingPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.events.impl.ModeEventImpl <em>Mode Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.ModeEventImpl
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getModeEvent()
	 * @generated
	 */
	int MODE_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODE_EVENT__BASE_NAMED_ELEMENT = TimingPackage.EVENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODE_EVENT__NAME = TimingPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODE_EVENT__OWNED_COMMENT = TimingPackage.EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODE_EVENT__BASE_CLASS = TimingPackage.EVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODE_EVENT__START = TimingPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODE_EVENT__END = TimingPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mode Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODE_EVENT_FEATURE_COUNT = TimingPackage.EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mode Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODE_EVENT_OPERATION_COUNT = TimingPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPortKind <em>Event Function Client Server Port Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPortKind
	 * @see org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl#getEventFunctionClientServerPortKind()
	 * @generated
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT_KIND = 8;

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunction <em>Event Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Event Function</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunction
	 * @generated
	 */
	EClass getEventFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunction#getFunction()
	 * @see #getEventFunction()
	 * @generated
	 */
	EReference getEventFunction_Function();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunction#getFunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Function Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunction#getFunctionType()
	 * @see #getEventFunction()
	 * @generated
	 */
	EReference getEventFunction_FunctionType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.events.AUTOSAREvent <em>AUTOSAR Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>AUTOSAR Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.AUTOSAREvent
	 * @generated
	 */
	EClass getAUTOSAREvent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.events.AUTOSAREvent#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.AUTOSAREvent#getRef()
	 * @see #getAUTOSAREvent()
	 * @generated
	 */
	EReference getAUTOSAREvent_Ref();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.events.EventFaultFailure <em>Event Fault Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Event Fault Failure</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFaultFailure
	 * @generated
	 */
	EClass getEventFaultFailure();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.events.EventFaultFailure#getFaultFailure <em>Fault Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Fault Failure</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFaultFailure#getFaultFailure()
	 * @see #getEventFaultFailure()
	 * @generated
	 */
	EReference getEventFaultFailure_FaultFailure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.events.EventFeatureFlaw <em>Event Feature Flaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Event Feature Flaw</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFeatureFlaw
	 * @generated
	 */
	EClass getEventFeatureFlaw();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.events.EventFeatureFlaw#getFeatureFlaw <em>Feature Flaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Feature Flaw</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFeatureFlaw#getFeatureFlaw()
	 * @see #getEventFeatureFlaw()
	 * @generated
	 */
	EReference getEventFeatureFlaw_FeatureFlaw();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.events.ExternalEvent <em>External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>External Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.ExternalEvent
	 * @generated
	 */
	EClass getExternalEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.events.ModeEvent <em>Mode Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Mode Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.ModeEvent
	 * @generated
	 */
	EClass getModeEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.events.ModeEvent#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Start</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.ModeEvent#getStart()
	 * @see #getModeEvent()
	 * @generated
	 */
	EReference getModeEvent_Start();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.events.ModeEvent#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>End</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.ModeEvent#getEnd()
	 * @see #getModeEvent()
	 * @generated
	 */
	EReference getModeEvent_End();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort <em>Event Function Client Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Event Function Client Server Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort
	 * @generated
	 */
	EClass getEventFunctionClientServerPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort#getEventKind <em>Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Event Kind</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort#getEventKind()
	 * @see #getEventFunctionClientServerPort()
	 * @generated
	 */
	EAttribute getEventFunctionClientServerPort_EventKind();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort#getPort()
	 * @see #getEventFunctionClientServerPort()
	 * @generated
	 */
	EReference getEventFunctionClientServerPort_Port();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPortKind <em>Event Function Client Server Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Event Function Client Server Port Kind</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPortKind
	 * @generated
	 */
	EEnum getEventFunctionClientServerPortKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionFlowPort <em>Event Function Flow Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Event Function Flow Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunctionFlowPort
	 * @generated
	 */
	EClass getEventFunctionFlowPort();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionFlowPort#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunctionFlowPort#getPort()
	 * @see #getEventFunctionFlowPort()
	 * @generated
	 */
	EReference getEventFunctionFlowPort_Port();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EventsFactory getEventsFactory();

} // EventsPackage
