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
package org.eclipse.papyrus.eastadl.timing.events.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;
import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.TimingDescription;
import org.eclipse.papyrus.eastadl.timing.events.AUTOSAREvent;
import org.eclipse.papyrus.eastadl.timing.events.EventFaultFailure;
import org.eclipse.papyrus.eastadl.timing.events.EventFeatureFlaw;
import org.eclipse.papyrus.eastadl.timing.events.EventFunction;
import org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort;
import org.eclipse.papyrus.eastadl.timing.events.EventFunctionFlowPort;
import org.eclipse.papyrus.eastadl.timing.events.EventsPackage;
import org.eclipse.papyrus.eastadl.timing.events.ExternalEvent;
import org.eclipse.papyrus.eastadl.timing.events.ModeEvent;


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage
 * @generated
 */
public class EventsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static EventsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EventsSwitch() {
		if (modelPackage == null) {
			modelPackage = EventsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAValue(EAValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAExpression(EAExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFunction(EventFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AUTOSAR Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AUTOSAR Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAUTOSAREvent(AUTOSAREvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Fault Failure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Fault Failure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFaultFailure(EventFaultFailure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Feature Flaw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Feature Flaw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFeatureFlaw(EventFeatureFlaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalEvent(ExternalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeEvent(ModeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAElement(EAElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Function Client Server Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Function Client Server Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFunctionClientServerPort(EventFunctionClientServerPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Function Flow Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Function Flow Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFunctionFlowPort(EventFunctionFlowPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingDescription(TimingDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EventsPackage.EVENT_FUNCTION_FLOW_PORT: {
			EventFunctionFlowPort eventFunctionFlowPort = (EventFunctionFlowPort) theEObject;
			T result = caseEventFunctionFlowPort(eventFunctionFlowPort);
			if (result == null) {
				result = caseEvent(eventFunctionFlowPort);
			}
			if (result == null) {
				result = caseEAExpression(eventFunctionFlowPort);
			}
			if (result == null) {
				result = caseTimingDescription(eventFunctionFlowPort);
			}
			if (result == null) {
				result = caseEAValue(eventFunctionFlowPort);
			}
			if (result == null) {
				result = caseEAElement(eventFunctionFlowPort);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT: {
			EventFunctionClientServerPort eventFunctionClientServerPort = (EventFunctionClientServerPort) theEObject;
			T result = caseEventFunctionClientServerPort(eventFunctionClientServerPort);
			if (result == null) {
				result = caseEvent(eventFunctionClientServerPort);
			}
			if (result == null) {
				result = caseEAExpression(eventFunctionClientServerPort);
			}
			if (result == null) {
				result = caseTimingDescription(eventFunctionClientServerPort);
			}
			if (result == null) {
				result = caseEAValue(eventFunctionClientServerPort);
			}
			if (result == null) {
				result = caseEAElement(eventFunctionClientServerPort);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EventsPackage.EVENT_FUNCTION: {
			EventFunction eventFunction = (EventFunction) theEObject;
			T result = caseEventFunction(eventFunction);
			if (result == null) {
				result = caseEvent(eventFunction);
			}
			if (result == null) {
				result = caseTimingDescription(eventFunction);
			}
			if (result == null) {
				result = caseEAElement(eventFunction);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EventsPackage.AUTOSAR_EVENT: {
			AUTOSAREvent autosarEvent = (AUTOSAREvent) theEObject;
			T result = caseAUTOSAREvent(autosarEvent);
			if (result == null) {
				result = caseEvent(autosarEvent);
			}
			if (result == null) {
				result = caseTimingDescription(autosarEvent);
			}
			if (result == null) {
				result = caseEAElement(autosarEvent);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EventsPackage.EVENT_FAULT_FAILURE: {
			EventFaultFailure eventFaultFailure = (EventFaultFailure) theEObject;
			T result = caseEventFaultFailure(eventFaultFailure);
			if (result == null) {
				result = caseEvent(eventFaultFailure);
			}
			if (result == null) {
				result = caseTimingDescription(eventFaultFailure);
			}
			if (result == null) {
				result = caseEAElement(eventFaultFailure);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EventsPackage.EVENT_FEATURE_FLAW: {
			EventFeatureFlaw eventFeatureFlaw = (EventFeatureFlaw) theEObject;
			T result = caseEventFeatureFlaw(eventFeatureFlaw);
			if (result == null) {
				result = caseEvent(eventFeatureFlaw);
			}
			if (result == null) {
				result = caseTimingDescription(eventFeatureFlaw);
			}
			if (result == null) {
				result = caseEAElement(eventFeatureFlaw);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EventsPackage.EXTERNAL_EVENT: {
			ExternalEvent externalEvent = (ExternalEvent) theEObject;
			T result = caseExternalEvent(externalEvent);
			if (result == null) {
				result = caseEvent(externalEvent);
			}
			if (result == null) {
				result = caseTimingDescription(externalEvent);
			}
			if (result == null) {
				result = caseEAElement(externalEvent);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case EventsPackage.MODE_EVENT: {
			ModeEvent modeEvent = (ModeEvent) theEObject;
			T result = caseModeEvent(modeEvent);
			if (result == null) {
				result = caseEvent(modeEvent);
			}
			if (result == null) {
				result = caseTimingDescription(modeEvent);
			}
			if (result == null) {
				result = caseEAElement(modeEvent);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

} // EventsSwitch
