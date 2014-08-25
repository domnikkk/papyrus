/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.ClampConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.EventFunctionInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_fromPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.infrastructure.InstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.SatisfyInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.VVCaseInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.VVTargetInstanceRef;

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
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage
 * @generated
 */
public class InfrastructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static InfrastructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public InfrastructureSwitch() {
		if (modelPackage == null) {
			modelPackage = InfrastructurePackage.eINSTANCE;
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
		case InfrastructurePackage.INSTANCE_REF: {
			InstanceRef instanceRef = (InstanceRef) theEObject;
			T result = caseInstanceRef(instanceRef);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.TARGET_INSTANCE_REF: {
			TargetInstanceRef targetInstanceRef = (TargetInstanceRef) theEObject;
			T result = caseTargetInstanceRef(targetInstanceRef);
			if (result == null) {
				result = caseInstanceRef(targetInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.FUNCTION_CONNECTOR_PORT_INSTANCE_REF: {
			FunctionConnectorPortInstanceRef functionConnectorPortInstanceRef = (FunctionConnectorPortInstanceRef) theEObject;
			T result = caseFunctionConnectorPortInstanceRef(functionConnectorPortInstanceRef);
			if (result == null) {
				result = caseInstanceRef(functionConnectorPortInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.HARDWARE_CONNECTOR_INSTANCE_REF: {
			HardwareConnectorInstanceRef hardwareConnectorInstanceRef = (HardwareConnectorInstanceRef) theEObject;
			T result = caseHardwareConnectorInstanceRef(hardwareConnectorInstanceRef);
			if (result == null) {
				result = caseInstanceRef(hardwareConnectorInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.HARDWARE_PORT_CONNECTOR_INSTANCE_REF: {
			HardwarePortConnectorInstanceRef hardwarePortConnectorInstanceRef = (HardwarePortConnectorInstanceRef) theEObject;
			T result = caseHardwarePortConnectorInstanceRef(hardwarePortConnectorInstanceRef);
			if (result == null) {
				result = caseInstanceRef(hardwarePortConnectorInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.ALLOCATED_ELEMENT_INSTANCE_REF: {
			AllocatedElementInstanceRef allocatedElementInstanceRef = (AllocatedElementInstanceRef) theEObject;
			T result = caseAllocatedElementInstanceRef(allocatedElementInstanceRef);
			if (result == null) {
				result = caseInstanceRef(allocatedElementInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.CLAMP_CONNECTOR_INSTANCE_REF: {
			ClampConnectorInstanceRef clampConnectorInstanceRef = (ClampConnectorInstanceRef) theEObject;
			T result = caseClampConnectorInstanceRef(clampConnectorInstanceRef);
			if (result == null) {
				result = caseInstanceRef(clampConnectorInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.REFINE_INSTANCE_REF: {
			RefineInstanceRef refineInstanceRef = (RefineInstanceRef) theEObject;
			T result = caseRefineInstanceRef(refineInstanceRef);
			if (result == null) {
				result = caseInstanceRef(refineInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.SATISFY_INSTANCE_REF: {
			SatisfyInstanceRef satisfyInstanceRef = (SatisfyInstanceRef) theEObject;
			T result = caseSatisfyInstanceRef(satisfyInstanceRef);
			if (result == null) {
				result = caseInstanceRef(satisfyInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.VV_CASE_INSTANCE_REF: {
			VVCaseInstanceRef vvCaseInstanceRef = (VVCaseInstanceRef) theEObject;
			T result = caseVVCaseInstanceRef(vvCaseInstanceRef);
			if (result == null) {
				result = caseInstanceRef(vvCaseInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.VV_TARGET_INSTANCE_REF: {
			VVTargetInstanceRef vvTargetInstanceRef = (VVTargetInstanceRef) theEObject;
			T result = caseVVTargetInstanceRef(vvTargetInstanceRef);
			if (result == null) {
				result = caseInstanceRef(vvTargetInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.REALIZATION_REALIZED_INSTANCE_REF: {
			Realization_realizedInstanceRef realization_realizedInstanceRef = (Realization_realizedInstanceRef) theEObject;
			T result = caseRealization_realizedInstanceRef(realization_realizedInstanceRef);
			if (result == null) {
				result = caseInstanceRef(realization_realizedInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.REALIZATION_REALIZED_BY_INSTANCE_REF: {
			Realization_realizedByInstanceRef realization_realizedByInstanceRef = (Realization_realizedByInstanceRef) theEObject;
			T result = caseRealization_realizedByInstanceRef(realization_realizedByInstanceRef);
			if (result == null) {
				result = caseInstanceRef(realization_realizedByInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.EVENT_FUNCTION_INSTANCE_REF: {
			EventFunctionInstanceRef eventFunctionInstanceRef = (EventFunctionInstanceRef) theEObject;
			T result = caseEventFunctionInstanceRef(eventFunctionInstanceRef);
			if (result == null) {
				result = caseInstanceRef(eventFunctionInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF: {
			EventFunctionClientServerPortInstanceRef eventFunctionClientServerPortInstanceRef = (EventFunctionClientServerPortInstanceRef) theEObject;
			T result = caseEventFunctionClientServerPortInstanceRef(eventFunctionClientServerPortInstanceRef);
			if (result == null) {
				result = caseInstanceRef(eventFunctionClientServerPortInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF: {
			EventFunctionFlowPortInstanceRef eventFunctionFlowPortInstanceRef = (EventFunctionFlowPortInstanceRef) theEObject;
			T result = caseEventFunctionFlowPortInstanceRef(eventFunctionFlowPortInstanceRef);
			if (result == null) {
				result = caseInstanceRef(eventFunctionFlowPortInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF: {
			PrecedenceConstraint_precedingInstanceRef precedenceConstraint_precedingInstanceRef = (PrecedenceConstraint_precedingInstanceRef) theEObject;
			T result = casePrecedenceConstraint_precedingInstanceRef(precedenceConstraint_precedingInstanceRef);
			if (result == null) {
				result = caseInstanceRef(precedenceConstraint_precedingInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF: {
			PrecedenceConstraint_successiveInstanceRef precedenceConstraint_successiveInstanceRef = (PrecedenceConstraint_successiveInstanceRef) theEObject;
			T result = casePrecedenceConstraint_successiveInstanceRef(precedenceConstraint_successiveInstanceRef);
			if (result == null) {
				result = caseInstanceRef(precedenceConstraint_successiveInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF: {
			ErrorModelPrototype_functionTargetInstanceRef errorModelPrototype_functionTargetInstanceRef = (ErrorModelPrototype_functionTargetInstanceRef) theEObject;
			T result = caseErrorModelPrototype_functionTargetInstanceRef(errorModelPrototype_functionTargetInstanceRef);
			if (result == null) {
				result = caseInstanceRef(errorModelPrototype_functionTargetInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF: {
			ErrorModelPrototype_hwTargetInstanceRef errorModelPrototype_hwTargetInstanceRef = (ErrorModelPrototype_hwTargetInstanceRef) theEObject;
			T result = caseErrorModelPrototype_hwTargetInstanceRef(errorModelPrototype_hwTargetInstanceRef);
			if (result == null) {
				result = caseInstanceRef(errorModelPrototype_hwTargetInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF: {
			FaultFailurePort_hwTargetInstanceRef faultFailurePort_hwTargetInstanceRef = (FaultFailurePort_hwTargetInstanceRef) theEObject;
			T result = caseFaultFailurePort_hwTargetInstanceRef(faultFailurePort_hwTargetInstanceRef);
			if (result == null) {
				result = caseInstanceRef(faultFailurePort_hwTargetInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF: {
			FaultFailurePort_functionTargetInstanceRef faultFailurePort_functionTargetInstanceRef = (FaultFailurePort_functionTargetInstanceRef) theEObject;
			T result = caseFaultFailurePort_functionTargetInstanceRef(faultFailurePort_functionTargetInstanceRef);
			if (result == null) {
				result = caseInstanceRef(faultFailurePort_functionTargetInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF: {
			FaultFailurePropagationLink_fromPortInstanceRef faultFailurePropagationLink_fromPortInstanceRef = (FaultFailurePropagationLink_fromPortInstanceRef) theEObject;
			T result = caseFaultFailurePropagationLink_fromPortInstanceRef(faultFailurePropagationLink_fromPortInstanceRef);
			if (result == null) {
				result = caseInstanceRef(faultFailurePropagationLink_fromPortInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.FAULT_FAILURE_ANOMALY_INSTANCE_REF: {
			FaultFailure_anomalyInstanceRef faultFailure_anomalyInstanceRef = (FaultFailure_anomalyInstanceRef) theEObject;
			T result = caseFaultFailure_anomalyInstanceRef(faultFailure_anomalyInstanceRef);
			if (result == null) {
				result = caseInstanceRef(faultFailure_anomalyInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF: {
			FaultFailurePropagationLink_toPortInstanceRef faultFailurePropagationLink_toPortInstanceRef = (FaultFailurePropagationLink_toPortInstanceRef) theEObject;
			T result = caseFaultFailurePropagationLink_toPortInstanceRef(faultFailurePropagationLink_toPortInstanceRef);
			if (result == null) {
				result = caseInstanceRef(faultFailurePropagationLink_toPortInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF: {
			BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef = (BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef) theEObject;
			T result = caseBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef(behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef);
			if (result == null) {
				result = caseInstanceRef(behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF: {
			BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef = (BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef) theEObject;
			T result = caseBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef(behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef);
			if (result == null) {
				result = caseInstanceRef(behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF: {
			BehaviorConstraintPrototype_functionTargetInstanceRef behaviorConstraintPrototype_functionTargetInstanceRef = (BehaviorConstraintPrototype_functionTargetInstanceRef) theEObject;
			T result = caseBehaviorConstraintPrototype_functionTargetInstanceRef(behaviorConstraintPrototype_functionTargetInstanceRef);
			if (result == null) {
				result = caseInstanceRef(behaviorConstraintPrototype_functionTargetInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF: {
			BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef behaviorConstraintPrototype_hardwareComponentTargetInstanceRef = (BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef) theEObject;
			T result = caseBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef(behaviorConstraintPrototype_hardwareComponentTargetInstanceRef);
			if (result == null) {
				result = caseInstanceRef(behaviorConstraintPrototype_hardwareComponentTargetInstanceRef);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case InfrastructurePackage.BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF: {
			BehaviorConstraintPrototype_errorModelTargetInstanceRef behaviorConstraintPrototype_errorModelTargetInstanceRef = (BehaviorConstraintPrototype_errorModelTargetInstanceRef) theEObject;
			T result = caseBehaviorConstraintPrototype_errorModelTargetInstanceRef(behaviorConstraintPrototype_errorModelTargetInstanceRef);
			if (result == null) {
				result = caseInstanceRef(behaviorConstraintPrototype_errorModelTargetInstanceRef);
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

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceRef(InstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetInstanceRef(TargetInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Connector Port Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Connector Port Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionConnectorPortInstanceRef(FunctionConnectorPortInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Connector Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Connector Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareConnectorInstanceRef(HardwareConnectorInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Port Connector Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Port Connector Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwarePortConnectorInstanceRef(HardwarePortConnectorInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocated Element Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocated Element Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocatedElementInstanceRef(AllocatedElementInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clamp Connector Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clamp Connector Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClampConnectorInstanceRef(ClampConnectorInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refine Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refine Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefineInstanceRef(RefineInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfy Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfy Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfyInstanceRef(SatisfyInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VV Case Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VV Case Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVCaseInstanceRef(VVCaseInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VV Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VV Target Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVTargetInstanceRef(VVTargetInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization realized Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization realized Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization_realizedInstanceRef(Realization_realizedInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization realized By Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization realized By Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization_realizedByInstanceRef(Realization_realizedByInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Function Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Function Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFunctionInstanceRef(EventFunctionInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Function Client Server Port Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Function Client Server Port Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFunctionClientServerPortInstanceRef(EventFunctionClientServerPortInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Function Flow Port Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Function Flow Port Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFunctionFlowPortInstanceRef(EventFunctionFlowPortInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Constraint preceding Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Constraint preceding Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceConstraint_precedingInstanceRef(PrecedenceConstraint_precedingInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Constraint successive Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Constraint successive Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceConstraint_successiveInstanceRef(PrecedenceConstraint_successiveInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Prototype function Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Prototype function Target Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorModelPrototype_functionTargetInstanceRef(ErrorModelPrototype_functionTargetInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Prototype hw Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Prototype hw Target Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorModelPrototype_hwTargetInstanceRef(ErrorModelPrototype_hwTargetInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Failure Port hw Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Failure Port hw Target Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultFailurePort_hwTargetInstanceRef(FaultFailurePort_hwTargetInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Failure Port function Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Failure Port function Target Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultFailurePort_functionTargetInstanceRef(FaultFailurePort_functionTargetInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Failure Propagation Link from Port Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Failure Propagation Link from Port Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultFailurePropagationLink_fromPortInstanceRef(FaultFailurePropagationLink_fromPortInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Failure anomaly Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Failure anomaly Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultFailure_anomalyInstanceRef(FaultFailure_anomalyInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Failure Propagation Link to Port Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Failure Propagation Link to Port Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultFailurePropagationLink_toPortInstanceRef(FaultFailurePropagationLink_toPortInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Constraint Internal Binding through Function Connector Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Constraint Internal Binding through Function Connector Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef(BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef(BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Constraint Prototype function Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Constraint Prototype function Target Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConstraintPrototype_functionTargetInstanceRef(BehaviorConstraintPrototype_functionTargetInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Constraint Prototype hardware Component Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Constraint Prototype hardware Component Target Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef(BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Constraint Prototype error Model Target Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Constraint Prototype error Model Target Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConstraintPrototype_errorModelTargetInstanceRef(BehaviorConstraintPrototype_errorModelTargetInstanceRef object) {
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

} // InfrastructureSwitch
