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
package org.eclipse.papyrus.eastadl.timing.timingconstraints.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.timing.TimingConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.InputSynchronizationConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.OrderConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.OutputSynchronizationConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.ReactionConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongDelayConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongSynchronizationConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.SynchronizationConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage
 * @generated
 */
public class TimingconstraintsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimingconstraintsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingconstraintsSwitch() {
		if (modelPackage == null) {
			modelPackage = TimingconstraintsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAElement(EAElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayConstraint(DelayConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Age Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Age Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgeConstraint(AgeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Synchronization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputSynchronizationConstraint(InputSynchronizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Synchronization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputSynchronizationConstraint(OutputSynchronizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaction Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactionConstraint(ReactionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSporadicConstraint(SporadicConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicConstraint(PeriodicConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternConstraint(PatternConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbitrary Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbitrary Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArbitraryConstraint(ArbitraryConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Time Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionTimeConstraint(ExecutionTimeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Burst Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Burst Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBurstConstraint(BurstConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonConstraint(ComparisonConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderConstraint(OrderConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repetition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repetition Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepetitionConstraint(RepetitionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Delay Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Delay Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongDelayConstraint(StrongDelayConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Synchronization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongSynchronizationConstraint(StrongSynchronizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationConstraint(SynchronizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingConstraint(TimingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
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
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TimingconstraintsPackage.DELAY_CONSTRAINT: {
				DelayConstraint delayConstraint = (DelayConstraint)theEObject;
				T result = caseDelayConstraint(delayConstraint);
				if (result == null) result = caseTimingConstraint(delayConstraint);
				if (result == null) result = caseEAElement(delayConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.AGE_CONSTRAINT: {
				AgeConstraint ageConstraint = (AgeConstraint)theEObject;
				T result = caseAgeConstraint(ageConstraint);
				if (result == null) result = caseTimingConstraint(ageConstraint);
				if (result == null) result = caseEAElement(ageConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT: {
				InputSynchronizationConstraint inputSynchronizationConstraint = (InputSynchronizationConstraint)theEObject;
				T result = caseInputSynchronizationConstraint(inputSynchronizationConstraint);
				if (result == null) result = caseTimingConstraint(inputSynchronizationConstraint);
				if (result == null) result = caseEAElement(inputSynchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.OUTPUT_SYNCHRONIZATION_CONSTRAINT: {
				OutputSynchronizationConstraint outputSynchronizationConstraint = (OutputSynchronizationConstraint)theEObject;
				T result = caseOutputSynchronizationConstraint(outputSynchronizationConstraint);
				if (result == null) result = caseTimingConstraint(outputSynchronizationConstraint);
				if (result == null) result = caseEAElement(outputSynchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.REACTION_CONSTRAINT: {
				ReactionConstraint reactionConstraint = (ReactionConstraint)theEObject;
				T result = caseReactionConstraint(reactionConstraint);
				if (result == null) result = caseTimingConstraint(reactionConstraint);
				if (result == null) result = caseEAElement(reactionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.SPORADIC_CONSTRAINT: {
				SporadicConstraint sporadicConstraint = (SporadicConstraint)theEObject;
				T result = caseSporadicConstraint(sporadicConstraint);
				if (result == null) result = caseTimingConstraint(sporadicConstraint);
				if (result == null) result = caseEAElement(sporadicConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.PERIODIC_CONSTRAINT: {
				PeriodicConstraint periodicConstraint = (PeriodicConstraint)theEObject;
				T result = casePeriodicConstraint(periodicConstraint);
				if (result == null) result = caseTimingConstraint(periodicConstraint);
				if (result == null) result = caseEAElement(periodicConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.PATTERN_CONSTRAINT: {
				PatternConstraint patternConstraint = (PatternConstraint)theEObject;
				T result = casePatternConstraint(patternConstraint);
				if (result == null) result = caseTimingConstraint(patternConstraint);
				if (result == null) result = caseEAElement(patternConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.ARBITRARY_CONSTRAINT: {
				ArbitraryConstraint arbitraryConstraint = (ArbitraryConstraint)theEObject;
				T result = caseArbitraryConstraint(arbitraryConstraint);
				if (result == null) result = caseTimingConstraint(arbitraryConstraint);
				if (result == null) result = caseEAElement(arbitraryConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT: {
				ExecutionTimeConstraint executionTimeConstraint = (ExecutionTimeConstraint)theEObject;
				T result = caseExecutionTimeConstraint(executionTimeConstraint);
				if (result == null) result = caseTimingConstraint(executionTimeConstraint);
				if (result == null) result = caseEAElement(executionTimeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.BURST_CONSTRAINT: {
				BurstConstraint burstConstraint = (BurstConstraint)theEObject;
				T result = caseBurstConstraint(burstConstraint);
				if (result == null) result = caseTimingConstraint(burstConstraint);
				if (result == null) result = caseEAElement(burstConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.COMPARISON_CONSTRAINT: {
				ComparisonConstraint comparisonConstraint = (ComparisonConstraint)theEObject;
				T result = caseComparisonConstraint(comparisonConstraint);
				if (result == null) result = caseTimingConstraint(comparisonConstraint);
				if (result == null) result = caseEAElement(comparisonConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.ORDER_CONSTRAINT: {
				OrderConstraint orderConstraint = (OrderConstraint)theEObject;
				T result = caseOrderConstraint(orderConstraint);
				if (result == null) result = caseTimingConstraint(orderConstraint);
				if (result == null) result = caseEAElement(orderConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.REPETITION_CONSTRAINT: {
				RepetitionConstraint repetitionConstraint = (RepetitionConstraint)theEObject;
				T result = caseRepetitionConstraint(repetitionConstraint);
				if (result == null) result = caseTimingConstraint(repetitionConstraint);
				if (result == null) result = caseEAElement(repetitionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.STRONG_DELAY_CONSTRAINT: {
				StrongDelayConstraint strongDelayConstraint = (StrongDelayConstraint)theEObject;
				T result = caseStrongDelayConstraint(strongDelayConstraint);
				if (result == null) result = caseTimingConstraint(strongDelayConstraint);
				if (result == null) result = caseEAElement(strongDelayConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.STRONG_SYNCHRONIZATION_CONSTRAINT: {
				StrongSynchronizationConstraint strongSynchronizationConstraint = (StrongSynchronizationConstraint)theEObject;
				T result = caseStrongSynchronizationConstraint(strongSynchronizationConstraint);
				if (result == null) result = caseTimingConstraint(strongSynchronizationConstraint);
				if (result == null) result = caseEAElement(strongSynchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingconstraintsPackage.SYNCHRONIZATION_CONSTRAINT: {
				SynchronizationConstraint synchronizationConstraint = (SynchronizationConstraint)theEObject;
				T result = caseSynchronizationConstraint(synchronizationConstraint);
				if (result == null) result = caseTimingConstraint(synchronizationConstraint);
				if (result == null) result = caseEAElement(synchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

} //TimingconstraintsSwitch
