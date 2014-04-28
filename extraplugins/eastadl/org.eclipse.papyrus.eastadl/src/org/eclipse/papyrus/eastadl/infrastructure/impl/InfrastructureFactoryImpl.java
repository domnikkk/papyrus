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
package org.eclipse.papyrus.eastadl.infrastructure.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.eastadl.infrastructure.*;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureFactoryImpl extends EFactoryImpl implements InfrastructureFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfrastructurePackage getPackage() {
		return InfrastructurePackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfrastructureFactory init() {
		try {
			InfrastructureFactory theInfrastructureFactory = (InfrastructureFactory)EPackage.Registry.INSTANCE.getEFactory(InfrastructurePackage.eNS_URI);
			if (theInfrastructureFactory != null) {
				return theInfrastructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfrastructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDummyToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InfrastructurePackage.DUMMY:
				return convertDummyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceRef createInstanceRef() {
		InstanceRefImpl instanceRef = new InstanceRefImpl();
		return instanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetInstanceRef createTargetInstanceRef() {
		TargetInstanceRefImpl targetInstanceRef = new TargetInstanceRefImpl();
		return targetInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionConnectorPortInstanceRef createFunctionConnectorPortInstanceRef() {
		FunctionConnectorPortInstanceRefImpl functionConnectorPortInstanceRef = new FunctionConnectorPortInstanceRefImpl();
		return functionConnectorPortInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareConnectorInstanceRef createHardwareConnectorInstanceRef() {
		HardwareConnectorInstanceRefImpl hardwareConnectorInstanceRef = new HardwareConnectorInstanceRefImpl();
		return hardwareConnectorInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePortConnectorInstanceRef createHardwarePortConnectorInstanceRef() {
		HardwarePortConnectorInstanceRefImpl hardwarePortConnectorInstanceRef = new HardwarePortConnectorInstanceRefImpl();
		return hardwarePortConnectorInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocatedElementInstanceRef createAllocatedElementInstanceRef() {
		AllocatedElementInstanceRefImpl allocatedElementInstanceRef = new AllocatedElementInstanceRefImpl();
		return allocatedElementInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClampConnectorInstanceRef createClampConnectorInstanceRef() {
		ClampConnectorInstanceRefImpl clampConnectorInstanceRef = new ClampConnectorInstanceRefImpl();
		return clampConnectorInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefineInstanceRef createRefineInstanceRef() {
		RefineInstanceRefImpl refineInstanceRef = new RefineInstanceRefImpl();
		return refineInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatisfyInstanceRef createSatisfyInstanceRef() {
		SatisfyInstanceRefImpl satisfyInstanceRef = new SatisfyInstanceRefImpl();
		return satisfyInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCaseInstanceRef createVVCaseInstanceRef() {
		VVCaseInstanceRefImpl vvCaseInstanceRef = new VVCaseInstanceRefImpl();
		return vvCaseInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVTargetInstanceRef createVVTargetInstanceRef() {
		VVTargetInstanceRefImpl vvTargetInstanceRef = new VVTargetInstanceRefImpl();
		return vvTargetInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization_realizedInstanceRef createRealization_realizedInstanceRef() {
		Realization_realizedInstanceRefImpl realization_realizedInstanceRef = new Realization_realizedInstanceRefImpl();
		return realization_realizedInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization_realizedByInstanceRef createRealization_realizedByInstanceRef() {
		Realization_realizedByInstanceRefImpl realization_realizedByInstanceRef = new Realization_realizedByInstanceRefImpl();
		return realization_realizedByInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFunctionInstanceRef createEventFunctionInstanceRef() {
		EventFunctionInstanceRefImpl eventFunctionInstanceRef = new EventFunctionInstanceRefImpl();
		return eventFunctionInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFunctionClientServerPortInstanceRef createEventFunctionClientServerPortInstanceRef() {
		EventFunctionClientServerPortInstanceRefImpl eventFunctionClientServerPortInstanceRef = new EventFunctionClientServerPortInstanceRefImpl();
		return eventFunctionClientServerPortInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFunctionFlowPortInstanceRef createEventFunctionFlowPortInstanceRef() {
		EventFunctionFlowPortInstanceRefImpl eventFunctionFlowPortInstanceRef = new EventFunctionFlowPortInstanceRefImpl();
		return eventFunctionFlowPortInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceConstraint_precedingInstanceRef createPrecedenceConstraint_precedingInstanceRef() {
		PrecedenceConstraint_precedingInstanceRefImpl precedenceConstraint_precedingInstanceRef = new PrecedenceConstraint_precedingInstanceRefImpl();
		return precedenceConstraint_precedingInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceConstraint_successiveInstanceRef createPrecedenceConstraint_successiveInstanceRef() {
		PrecedenceConstraint_successiveInstanceRefImpl precedenceConstraint_successiveInstanceRef = new PrecedenceConstraint_successiveInstanceRefImpl();
		return precedenceConstraint_successiveInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelPrototype_functionTargetInstanceRef createErrorModelPrototype_functionTargetInstanceRef() {
		ErrorModelPrototype_functionTargetInstanceRefImpl errorModelPrototype_functionTargetInstanceRef = new ErrorModelPrototype_functionTargetInstanceRefImpl();
		return errorModelPrototype_functionTargetInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelPrototype_hwTargetInstanceRef createErrorModelPrototype_hwTargetInstanceRef() {
		ErrorModelPrototype_hwTargetInstanceRefImpl errorModelPrototype_hwTargetInstanceRef = new ErrorModelPrototype_hwTargetInstanceRefImpl();
		return errorModelPrototype_hwTargetInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePort_hwTargetInstanceRef createFaultFailurePort_hwTargetInstanceRef() {
		FaultFailurePort_hwTargetInstanceRefImpl faultFailurePort_hwTargetInstanceRef = new FaultFailurePort_hwTargetInstanceRefImpl();
		return faultFailurePort_hwTargetInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePort_functionTargetInstanceRef createFaultFailurePort_functionTargetInstanceRef() {
		FaultFailurePort_functionTargetInstanceRefImpl faultFailurePort_functionTargetInstanceRef = new FaultFailurePort_functionTargetInstanceRefImpl();
		return faultFailurePort_functionTargetInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePropagationLink_fromPortInstanceRef createFaultFailurePropagationLink_fromPortInstanceRef() {
		FaultFailurePropagationLink_fromPortInstanceRefImpl faultFailurePropagationLink_fromPortInstanceRef = new FaultFailurePropagationLink_fromPortInstanceRefImpl();
		return faultFailurePropagationLink_fromPortInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailure_anomalyInstanceRef createFaultFailure_anomalyInstanceRef() {
		FaultFailure_anomalyInstanceRefImpl faultFailure_anomalyInstanceRef = new FaultFailure_anomalyInstanceRefImpl();
		return faultFailure_anomalyInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePropagationLink_toPortInstanceRef createFaultFailurePropagationLink_toPortInstanceRef() {
		FaultFailurePropagationLink_toPortInstanceRefImpl faultFailurePropagationLink_toPortInstanceRef = new FaultFailurePropagationLink_toPortInstanceRefImpl();
		return faultFailurePropagationLink_toPortInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef createBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef() {
		BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefImpl behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef = new BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefImpl();
		return behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef createBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef() {
		BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefImpl behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef = new BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefImpl();
		return behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConstraintPrototype_functionTargetInstanceRef createBehaviorConstraintPrototype_functionTargetInstanceRef() {
		BehaviorConstraintPrototype_functionTargetInstanceRefImpl behaviorConstraintPrototype_functionTargetInstanceRef = new BehaviorConstraintPrototype_functionTargetInstanceRefImpl();
		return behaviorConstraintPrototype_functionTargetInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef createBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef() {
		BehaviorConstraintPrototype_hardwareComponentTargetInstanceRefImpl behaviorConstraintPrototype_hardwareComponentTargetInstanceRef = new BehaviorConstraintPrototype_hardwareComponentTargetInstanceRefImpl();
		return behaviorConstraintPrototype_hardwareComponentTargetInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConstraintPrototype_errorModelTargetInstanceRef createBehaviorConstraintPrototype_errorModelTargetInstanceRef() {
		BehaviorConstraintPrototype_errorModelTargetInstanceRefImpl behaviorConstraintPrototype_errorModelTargetInstanceRef = new BehaviorConstraintPrototype_errorModelTargetInstanceRefImpl();
		return behaviorConstraintPrototype_errorModelTargetInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InfrastructurePackage.INSTANCE_REF: return createInstanceRef();
			case InfrastructurePackage.TARGET_INSTANCE_REF: return createTargetInstanceRef();
			case InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF: return createFunctionConnectorPortInstanceRef();
			case InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF: return createHardwareConnectorInstanceRef();
			case InfrastructurePackage.HARDWARE_PORT_CONNECTOR_INSTANCE_REF: return createHardwarePortConnectorInstanceRef();
			case InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF: return createAllocatedElementInstanceRef();
			case InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF: return createClampConnectorInstanceRef();
			case InfrastructurePackage.REFINE_INSTANCE_REF: return createRefineInstanceRef();
			case InfrastructurePackage.SATISFY_INSTANCE_REF: return createSatisfyInstanceRef();
			case InfrastructurePackage.VV_CASE_INSTANCE_REF: return createVVCaseInstanceRef();
			case InfrastructurePackage.VV_TARGET_INSTANCE_REF: return createVVTargetInstanceRef();
			case InfrastructurePackage.REALIZATION_REALIZED_INSTANCE_REF: return createRealization_realizedInstanceRef();
			case InfrastructurePackage.REALIZATION_REALIZED_BY_INSTANCE_REF: return createRealization_realizedByInstanceRef();
			case InfrastructurePackage.EVENT_FUNCTION_INSTANCE_REF: return createEventFunctionInstanceRef();
			case InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF: return createEventFunctionClientServerPortInstanceRef();
			case InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF: return createEventFunctionFlowPortInstanceRef();
			case InfrastructurePackage.PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF: return createPrecedenceConstraint_precedingInstanceRef();
			case InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF: return createPrecedenceConstraint_successiveInstanceRef();
			case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF: return createErrorModelPrototype_functionTargetInstanceRef();
			case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF: return createErrorModelPrototype_hwTargetInstanceRef();
			case InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF: return createFaultFailurePort_hwTargetInstanceRef();
			case InfrastructurePackage.FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF: return createFaultFailurePort_functionTargetInstanceRef();
			case InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF: return createFaultFailurePropagationLink_fromPortInstanceRef();
			case InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF: return createFaultFailure_anomalyInstanceRef();
			case InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF: return createFaultFailurePropagationLink_toPortInstanceRef();
			case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF: return createBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef();
			case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF: return createBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef();
			case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF: return createBehaviorConstraintPrototype_functionTargetInstanceRef();
			case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF: return createBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef();
			case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF: return createBehaviorConstraintPrototype_errorModelTargetInstanceRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDummyFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InfrastructurePackage.DUMMY:
				return createDummyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructurePackage getInfrastructurePackage() {
		return (InfrastructurePackage)getEPackage();
	}

} //InfrastructureFactoryImpl
