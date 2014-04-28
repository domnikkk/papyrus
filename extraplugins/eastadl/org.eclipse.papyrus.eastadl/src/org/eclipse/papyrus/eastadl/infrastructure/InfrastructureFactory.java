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
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage
 * @generated
 */
public interface InfrastructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfrastructureFactory eINSTANCE = org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Ref</em>'.
	 * @generated
	 */
	InstanceRef createInstanceRef();

	/**
	 * Returns a new object of class '<em>Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Instance Ref</em>'.
	 * @generated
	 */
	TargetInstanceRef createTargetInstanceRef();

	/**
	 * Returns a new object of class '<em>Function Connector Port Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Connector Port Instance Ref</em>'.
	 * @generated
	 */
	FunctionConnectorPortInstanceRef createFunctionConnectorPortInstanceRef();

	/**
	 * Returns a new object of class '<em>Hardware Connector Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Connector Instance Ref</em>'.
	 * @generated
	 */
	HardwareConnectorInstanceRef createHardwareConnectorInstanceRef();

	/**
	 * Returns a new object of class '<em>Hardware Port Connector Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Port Connector Instance Ref</em>'.
	 * @generated
	 */
	HardwarePortConnectorInstanceRef createHardwarePortConnectorInstanceRef();

	/**
	 * Returns a new object of class '<em>Allocated Element Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocated Element Instance Ref</em>'.
	 * @generated
	 */
	AllocatedElementInstanceRef createAllocatedElementInstanceRef();

	/**
	 * Returns a new object of class '<em>Clamp Connector Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clamp Connector Instance Ref</em>'.
	 * @generated
	 */
	ClampConnectorInstanceRef createClampConnectorInstanceRef();

	/**
	 * Returns a new object of class '<em>Refine Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refine Instance Ref</em>'.
	 * @generated
	 */
	RefineInstanceRef createRefineInstanceRef();

	/**
	 * Returns a new object of class '<em>Satisfy Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satisfy Instance Ref</em>'.
	 * @generated
	 */
	SatisfyInstanceRef createSatisfyInstanceRef();

	/**
	 * Returns a new object of class '<em>VV Case Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VV Case Instance Ref</em>'.
	 * @generated
	 */
	VVCaseInstanceRef createVVCaseInstanceRef();

	/**
	 * Returns a new object of class '<em>VV Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VV Target Instance Ref</em>'.
	 * @generated
	 */
	VVTargetInstanceRef createVVTargetInstanceRef();

	/**
	 * Returns a new object of class '<em>Realization realized Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realization realized Instance Ref</em>'.
	 * @generated
	 */
	Realization_realizedInstanceRef createRealization_realizedInstanceRef();

	/**
	 * Returns a new object of class '<em>Realization realized By Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realization realized By Instance Ref</em>'.
	 * @generated
	 */
	Realization_realizedByInstanceRef createRealization_realizedByInstanceRef();

	/**
	 * Returns a new object of class '<em>Event Function Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Function Instance Ref</em>'.
	 * @generated
	 */
	EventFunctionInstanceRef createEventFunctionInstanceRef();

	/**
	 * Returns a new object of class '<em>Event Function Client Server Port Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Function Client Server Port Instance Ref</em>'.
	 * @generated
	 */
	EventFunctionClientServerPortInstanceRef createEventFunctionClientServerPortInstanceRef();

	/**
	 * Returns a new object of class '<em>Event Function Flow Port Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Function Flow Port Instance Ref</em>'.
	 * @generated
	 */
	EventFunctionFlowPortInstanceRef createEventFunctionFlowPortInstanceRef();

	/**
	 * Returns a new object of class '<em>Precedence Constraint preceding Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precedence Constraint preceding Instance Ref</em>'.
	 * @generated
	 */
	PrecedenceConstraint_precedingInstanceRef createPrecedenceConstraint_precedingInstanceRef();

	/**
	 * Returns a new object of class '<em>Precedence Constraint successive Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precedence Constraint successive Instance Ref</em>'.
	 * @generated
	 */
	PrecedenceConstraint_successiveInstanceRef createPrecedenceConstraint_successiveInstanceRef();

	/**
	 * Returns a new object of class '<em>Error Model Prototype function Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Model Prototype function Target Instance Ref</em>'.
	 * @generated
	 */
	ErrorModelPrototype_functionTargetInstanceRef createErrorModelPrototype_functionTargetInstanceRef();

	/**
	 * Returns a new object of class '<em>Error Model Prototype hw Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Model Prototype hw Target Instance Ref</em>'.
	 * @generated
	 */
	ErrorModelPrototype_hwTargetInstanceRef createErrorModelPrototype_hwTargetInstanceRef();

	/**
	 * Returns a new object of class '<em>Fault Failure Port hw Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Failure Port hw Target Instance Ref</em>'.
	 * @generated
	 */
	FaultFailurePort_hwTargetInstanceRef createFaultFailurePort_hwTargetInstanceRef();

	/**
	 * Returns a new object of class '<em>Fault Failure Port function Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Failure Port function Target Instance Ref</em>'.
	 * @generated
	 */
	FaultFailurePort_functionTargetInstanceRef createFaultFailurePort_functionTargetInstanceRef();

	/**
	 * Returns a new object of class '<em>Fault Failure Propagation Link from Port Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Failure Propagation Link from Port Instance Ref</em>'.
	 * @generated
	 */
	FaultFailurePropagationLink_fromPortInstanceRef createFaultFailurePropagationLink_fromPortInstanceRef();

	/**
	 * Returns a new object of class '<em>Fault Failure anomaly Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Failure anomaly Instance Ref</em>'.
	 * @generated
	 */
	FaultFailure_anomalyInstanceRef createFaultFailure_anomalyInstanceRef();

	/**
	 * Returns a new object of class '<em>Fault Failure Propagation Link to Port Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Failure Propagation Link to Port Instance Ref</em>'.
	 * @generated
	 */
	FaultFailurePropagationLink_toPortInstanceRef createFaultFailurePropagationLink_toPortInstanceRef();

	/**
	 * Returns a new object of class '<em>Behavior Constraint Internal Binding through Function Connector Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Constraint Internal Binding through Function Connector Instance Ref</em>'.
	 * @generated
	 */
	BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef createBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef();

	/**
	 * Returns a new object of class '<em>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</em>'.
	 * @generated
	 */
	BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef createBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef();

	/**
	 * Returns a new object of class '<em>Behavior Constraint Prototype function Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Constraint Prototype function Target Instance Ref</em>'.
	 * @generated
	 */
	BehaviorConstraintPrototype_functionTargetInstanceRef createBehaviorConstraintPrototype_functionTargetInstanceRef();

	/**
	 * Returns a new object of class '<em>Behavior Constraint Prototype hardware Component Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Constraint Prototype hardware Component Target Instance Ref</em>'.
	 * @generated
	 */
	BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef createBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef();

	/**
	 * Returns a new object of class '<em>Behavior Constraint Prototype error Model Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Constraint Prototype error Model Target Instance Ref</em>'.
	 * @generated
	 */
	BehaviorConstraintPrototype_errorModelTargetInstanceRef createBehaviorConstraintPrototype_errorModelTargetInstanceRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfrastructurePackage getInfrastructurePackage();

} //InfrastructureFactory
