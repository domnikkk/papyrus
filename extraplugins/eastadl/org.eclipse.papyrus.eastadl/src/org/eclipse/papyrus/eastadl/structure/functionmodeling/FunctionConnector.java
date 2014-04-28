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
package org.eclipse.papyrus.eastadl.structure.functionmodeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAConnector;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FunctionConnector indicates that the connected FunctionPorts exchange signals or client-server requests/responses.
 * 
 * Semantics:
 * The FunctionConnector connects a pair of FunctionFlowPorts or FunctionClientServerPorts. If two FunctionFlowPorts are connected, data elements of the type of the output FunctionFlowPort flow from the output FunctionFlowPort to the input FunctionFlowPort. If FunctionClientServerPorts are connected, the client calls the server according to the operations of the interfaces. The occurrence of the FunctionType that specifies the occurrence of the FunctionPrototype has to be identified by the FunctionConnector as well.
 * The FunctionConnector is normally routed according to the hardware topology and the allocation of source and destination. If there are redundant paths, a FunctionAllocation may be used to prescribe allocation.
 * 
 * 
 * Constraints:
 * [1] Can connect two FunctionFlowPorts of different direction when this is an assembly FunctionConnector.
 * 
 * [2] Can connect two FunctionFlowPorts of the same direction when this is a delegation FunctionConnector.
 * 
 * [3] Can connect two ClientServerPorts of different kind when this is an assembly FunctionConnector.
 * 
 * [4] Can connect two ClientServerPorts of the same kind when this is a delegation FunctionConnector.
 * 
 * [5] Can connect two FunctionFlowPorts with direction inout.
 * 
 * Notation: FunctionConnector is shown as a solid line
 * 
 * Extension: UML Connector
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionConnector#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage#getFunctionConnector()
 * @model
 * @generated
 */
public interface FunctionConnector extends EAElement, EAConnector, AllocateableElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage#getFunctionConnector_Port()
	 * @model containment="true" lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<FunctionConnectorPortInstanceRef> getPort();

} // FunctionConnector
