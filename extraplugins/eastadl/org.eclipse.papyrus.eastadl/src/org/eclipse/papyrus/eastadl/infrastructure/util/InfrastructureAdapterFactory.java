/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage
 * @generated
 */
public class InfrastructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static InfrastructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public InfrastructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InfrastructurePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 *
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected InfrastructureSwitch<Adapter> modelSwitch =
			new InfrastructureSwitch<Adapter>() {
				@Override
				public Adapter caseInstanceRef(InstanceRef object) {
					return createInstanceRefAdapter();
				}

				@Override
				public Adapter caseTargetInstanceRef(TargetInstanceRef object) {
					return createTargetInstanceRefAdapter();
				}

				@Override
				public Adapter caseFunctionConnectorPortInstanceRef(FunctionConnectorPortInstanceRef object) {
					return createFunctionConnectorPortInstanceRefAdapter();
				}

				@Override
				public Adapter caseHardwareConnectorInstanceRef(HardwareConnectorInstanceRef object) {
					return createHardwareConnectorInstanceRefAdapter();
				}

				@Override
				public Adapter caseHardwarePortConnectorInstanceRef(HardwarePortConnectorInstanceRef object) {
					return createHardwarePortConnectorInstanceRefAdapter();
				}

				@Override
				public Adapter caseAllocatedElementInstanceRef(AllocatedElementInstanceRef object) {
					return createAllocatedElementInstanceRefAdapter();
				}

				@Override
				public Adapter caseClampConnectorInstanceRef(ClampConnectorInstanceRef object) {
					return createClampConnectorInstanceRefAdapter();
				}

				@Override
				public Adapter caseRefineInstanceRef(RefineInstanceRef object) {
					return createRefineInstanceRefAdapter();
				}

				@Override
				public Adapter caseSatisfyInstanceRef(SatisfyInstanceRef object) {
					return createSatisfyInstanceRefAdapter();
				}

				@Override
				public Adapter caseVVCaseInstanceRef(VVCaseInstanceRef object) {
					return createVVCaseInstanceRefAdapter();
				}

				@Override
				public Adapter caseVVTargetInstanceRef(VVTargetInstanceRef object) {
					return createVVTargetInstanceRefAdapter();
				}

				@Override
				public Adapter caseRealization_realizedInstanceRef(Realization_realizedInstanceRef object) {
					return createRealization_realizedInstanceRefAdapter();
				}

				@Override
				public Adapter caseRealization_realizedByInstanceRef(Realization_realizedByInstanceRef object) {
					return createRealization_realizedByInstanceRefAdapter();
				}

				@Override
				public Adapter caseEventFunctionInstanceRef(EventFunctionInstanceRef object) {
					return createEventFunctionInstanceRefAdapter();
				}

				@Override
				public Adapter caseEventFunctionClientServerPortInstanceRef(EventFunctionClientServerPortInstanceRef object) {
					return createEventFunctionClientServerPortInstanceRefAdapter();
				}

				@Override
				public Adapter caseEventFunctionFlowPortInstanceRef(EventFunctionFlowPortInstanceRef object) {
					return createEventFunctionFlowPortInstanceRefAdapter();
				}

				@Override
				public Adapter casePrecedenceConstraint_precedingInstanceRef(PrecedenceConstraint_precedingInstanceRef object) {
					return createPrecedenceConstraint_precedingInstanceRefAdapter();
				}

				@Override
				public Adapter casePrecedenceConstraint_successiveInstanceRef(PrecedenceConstraint_successiveInstanceRef object) {
					return createPrecedenceConstraint_successiveInstanceRefAdapter();
				}

				@Override
				public Adapter caseErrorModelPrototype_functionTargetInstanceRef(ErrorModelPrototype_functionTargetInstanceRef object) {
					return createErrorModelPrototype_functionTargetInstanceRefAdapter();
				}

				@Override
				public Adapter caseErrorModelPrototype_hwTargetInstanceRef(ErrorModelPrototype_hwTargetInstanceRef object) {
					return createErrorModelPrototype_hwTargetInstanceRefAdapter();
				}

				@Override
				public Adapter caseFaultFailurePort_hwTargetInstanceRef(FaultFailurePort_hwTargetInstanceRef object) {
					return createFaultFailurePort_hwTargetInstanceRefAdapter();
				}

				@Override
				public Adapter caseFaultFailurePort_functionTargetInstanceRef(FaultFailurePort_functionTargetInstanceRef object) {
					return createFaultFailurePort_functionTargetInstanceRefAdapter();
				}

				@Override
				public Adapter caseFaultFailurePropagationLink_fromPortInstanceRef(FaultFailurePropagationLink_fromPortInstanceRef object) {
					return createFaultFailurePropagationLink_fromPortInstanceRefAdapter();
				}

				@Override
				public Adapter caseFaultFailure_anomalyInstanceRef(FaultFailure_anomalyInstanceRef object) {
					return createFaultFailure_anomalyInstanceRefAdapter();
				}

				@Override
				public Adapter caseFaultFailurePropagationLink_toPortInstanceRef(FaultFailurePropagationLink_toPortInstanceRef object) {
					return createFaultFailurePropagationLink_toPortInstanceRefAdapter();
				}

				@Override
				public Adapter caseBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef(BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef object) {
					return createBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefAdapter();
				}

				@Override
				public Adapter caseBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef(BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef object) {
					return createBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefAdapter();
				}

				@Override
				public Adapter caseBehaviorConstraintPrototype_functionTargetInstanceRef(BehaviorConstraintPrototype_functionTargetInstanceRef object) {
					return createBehaviorConstraintPrototype_functionTargetInstanceRefAdapter();
				}

				@Override
				public Adapter caseBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef(BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef object) {
					return createBehaviorConstraintPrototype_hardwareComponentTargetInstanceRefAdapter();
				}

				@Override
				public Adapter caseBehaviorConstraintPrototype_errorModelTargetInstanceRef(BehaviorConstraintPrototype_errorModelTargetInstanceRef object) {
					return createBehaviorConstraintPrototype_errorModelTargetInstanceRefAdapter();
				}

				@Override
				public Adapter defaultCase(EObject object) {
					return createEObjectAdapter();
				}
			};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.InstanceRef <em>Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InstanceRef
	 * @generated
	 */
	public Adapter createInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef <em>Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef
	 * @generated
	 */
	public Adapter createTargetInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef <em>Function Connector Port Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef
	 * @generated
	 */
	public Adapter createFunctionConnectorPortInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef <em>Hardware Connector Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef
	 * @generated
	 */
	public Adapter createHardwareConnectorInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef <em>Hardware Port Connector Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef
	 * @generated
	 */
	public Adapter createHardwarePortConnectorInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef <em>Allocated Element Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef
	 * @generated
	 */
	public Adapter createAllocatedElementInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.ClampConnectorInstanceRef <em>Clamp Connector Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.ClampConnectorInstanceRef
	 * @generated
	 */
	public Adapter createClampConnectorInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef <em>Refine Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef
	 * @generated
	 */
	public Adapter createRefineInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.SatisfyInstanceRef <em>Satisfy Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.SatisfyInstanceRef
	 * @generated
	 */
	public Adapter createSatisfyInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.VVCaseInstanceRef <em>VV Case Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.VVCaseInstanceRef
	 * @generated
	 */
	public Adapter createVVCaseInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.VVTargetInstanceRef <em>VV Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.VVTargetInstanceRef
	 * @generated
	 */
	public Adapter createVVTargetInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedInstanceRef <em>Realization realized Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedInstanceRef
	 * @generated
	 */
	public Adapter createRealization_realizedInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef <em>Realization realized By Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef
	 * @generated
	 */
	public Adapter createRealization_realizedByInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionInstanceRef <em>Event Function Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.EventFunctionInstanceRef
	 * @generated
	 */
	public Adapter createEventFunctionInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef <em>Event Function Client Server Port Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef
	 * @generated
	 */
	public Adapter createEventFunctionClientServerPortInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef <em>Event Function Flow Port Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef
	 * @generated
	 */
	public Adapter createEventFunctionFlowPortInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef <em>Precedence Constraint preceding Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef
	 * @generated
	 */
	public Adapter createPrecedenceConstraint_precedingInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef <em>Precedence Constraint successive Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef
	 * @generated
	 */
	public Adapter createPrecedenceConstraint_successiveInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef <em>Error Model Prototype function Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef
	 * @generated
	 */
	public Adapter createErrorModelPrototype_functionTargetInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef <em>Error Model Prototype hw Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef
	 * @generated
	 */
	public Adapter createErrorModelPrototype_hwTargetInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef <em>Fault Failure Port hw Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef
	 * @generated
	 */
	public Adapter createFaultFailurePort_hwTargetInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef <em>Fault Failure Port function Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef
	 * @generated
	 */
	public Adapter createFaultFailurePort_functionTargetInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_fromPortInstanceRef <em>Fault Failure Propagation Link from Port Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_fromPortInstanceRef
	 * @generated
	 */
	public Adapter createFaultFailurePropagationLink_fromPortInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef <em>Fault Failure anomaly Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef
	 * @generated
	 */
	public Adapter createFaultFailure_anomalyInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef <em>Fault Failure Propagation Link to Port Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef
	 * @generated
	 */
	public Adapter createFaultFailurePropagationLink_toPortInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef <em>Behavior Constraint Internal Binding through Function Connector Instance Ref</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef
	 * @generated
	 */
	public Adapter createBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef <em>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef
	 * @generated
	 */
	public Adapter createBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef <em>Behavior Constraint Prototype function Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef
	 * @generated
	 */
	public Adapter createBehaviorConstraintPrototype_functionTargetInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef <em>Behavior Constraint Prototype hardware Component Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef
	 * @generated
	 */
	public Adapter createBehaviorConstraintPrototype_hardwareComponentTargetInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef <em>Behavior Constraint Prototype error Model Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef
	 * @generated
	 */
	public Adapter createBehaviorConstraintPrototype_errorModelTargetInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // InfrastructureAdapterFactory
