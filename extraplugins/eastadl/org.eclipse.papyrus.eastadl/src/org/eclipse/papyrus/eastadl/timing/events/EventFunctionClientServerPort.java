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

import org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;
import org.eclipse.papyrus.eastadl.timing.Event;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Function Client Server Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Event that refers to the triggering of the Function at a client/server port, i.e., when the input data is sent / received, or when the output data is produced / received.
 *
 * Constraints:
 * [1] eventKind is sentRequest or receivedResponse for a FunctionClientServerPort of type client. Rationale: Only these values make sense for client ports.
 *
 * [2] eventKind is receivedRequest or sentResponse for a FunctionClientServerPort of type server. Rationale: Only these values make sense for server ports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort#getEventKind <em>Event Kind</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#getEventFunctionClientServerPort()
 * @model
 * @generated
 */
public interface EventFunctionClientServerPort extends Event, EAExpression {
	/**
	 * Returns the value of the '<em><b>Event Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPortKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Kind</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Event Kind</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPortKind
	 * @see #setEventKind(EventFunctionClientServerPortKind)
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#getEventFunctionClientServerPort_EventKind()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EventFunctionClientServerPortKind getEventKind();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(EventFunctionClientServerPortInstanceRef)
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#getEventFunctionClientServerPort_Port()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EventFunctionClientServerPortInstanceRef getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(EventFunctionClientServerPortInstanceRef value);

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort#getEventKind <em>Event Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Event Kind</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPortKind
	 * @see #getEventKind()
	 * @generated
	 */
	void setEventKind(EventFunctionClientServerPortKind value);

} // EventFunctionClientServerPort
