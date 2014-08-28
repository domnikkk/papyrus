/**
 * Copyright (c) 2014 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RT State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#getBase_State <em>Base State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage#getRTState()
 * @model
 * @generated
 */
public interface RTState extends EObject {
	/**
	 * Returns the value of the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base State</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Base State</em>' reference.
	 * @see #setBase_State(State)
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage#getRTState_Base_State()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	State getBase_State();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#getBase_State <em>Base State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Base State</em>' reference.
	 * @see #getBase_State()
	 * @generated
	 */
	void setBase_State(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base_State.isComposite implies
	 * (base_State.region->size() = 1)
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information.
	 *            <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='A composte RT state has exactly one region'"
	 * @generated
	 */
	boolean AcomposteRTstatehasexactlyoneregion(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not base_State.isSubmachineState
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information.
	 *            <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RT does not support submachine states'"
	 * @generated
	 */
	boolean RTdoesnotsupportsubmachinestates(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base_State.doActivity->size() = 0
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information.
	 *            <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RT state machines do not support \"do\" activities'"
	 * @generated
	 */
	boolean RTstatemachinesdonotsupportdoactivities(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base_State.deferrableTrigger->size() = 0
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information.
	 *            <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RT state machines cannot have any deferred triggers '"
	 * @generated
	 */
	boolean RTstatemachinescannothaveanydeferredtriggers(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information.
	 *            <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Constraint5(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RTState
