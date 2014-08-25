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
package org.eclipse.papyrus.eastadl.timing.timingconstraints;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.timing.EventChain;
import org.eclipse.papyrus.eastadl.timing.TimingConstraint;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Synchronization Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OutputSynchronizationConstraint is a language entity that expresses a timing constraint on the output synchronization among the set of response events.
 *
 * Semantics:
 * The parameters of OutputSynchronizationConstraint, see TimingConstraints, constrain the time from the first response until last response (i.e., maximum skew between these responses). A fork point is identified by the stimulus event in the scope EventChain.
 *
 * Constraints:
 * [1] The set of FunctionFlowPorts referenced by the events should contain only OutFlowPorts. The rationale for this is that the events shall relate to data on FunctionFlowPorts which is considered (or shall be) temporally consistent.
 *
 * [2] The scope EventChain shall contain exactly one stimulus Event.
 *
 * [3] The semantics of this constraint require that there is more than one response Events in the scope EventChain.
 *
 *
 * Extension: Class
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.OutputSynchronizationConstraint#getScope <em>Scope</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.OutputSynchronizationConstraint#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getOutputSynchronizationConstraint()
 * @model
 * @generated
 */
public interface OutputSynchronizationConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.timing.EventChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Scope</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getOutputSynchronizationConstraint_Scope()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<EventChain> getScope();

	/**
	 * Returns the value of the '<em><b>Tolerance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerance</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Tolerance</em>' reference.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage#getOutputSynchronizationConstraint_Tolerance()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	TimingExpression getTolerance();

} // OutputSynchronizationConstraint
