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
package org.eclipse.papyrus.eastadl.dependability.errormodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPort;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Failure Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.FaultFailurePort#getFunctionTarget <em>Function Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.dependability.errormodel.FaultFailurePort#getHwTarget <em>Hw Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.dependability.errormodel.ErrormodelPackage#getFaultFailurePort()
 * @model abstract="true"
 * @generated
 */
public interface FaultFailurePort extends Anomaly, EAPort {
	/**
	 * Returns the value of the '<em><b>Function Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Target</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Function Target</em>' containment reference list.
	 * @see org.eclipse.papyrus.eastadl.dependability.errormodel.ErrormodelPackage#getFaultFailurePort_FunctionTarget()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FaultFailurePort_functionTargetInstanceRef> getFunctionTarget();

	/**
	 * Returns the value of the '<em><b>Hw Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw Target</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Hw Target</em>' containment reference list.
	 * @see org.eclipse.papyrus.eastadl.dependability.errormodel.ErrormodelPackage#getFaultFailurePort_HwTarget()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FaultFailurePort_hwTargetInstanceRef> getHwTarget();

} // FaultFailurePort
