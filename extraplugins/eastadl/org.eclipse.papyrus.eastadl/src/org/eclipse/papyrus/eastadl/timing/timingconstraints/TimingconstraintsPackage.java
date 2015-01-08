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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.eastadl.timing.TimingPackage;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This section describes the timing constraints.
 * <!-- end-model-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TimingConstraints'"
 * @generated
 */
public interface TimingconstraintsPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.DelayConstraintImpl <em>Delay Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.DelayConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getDelayConstraint()
		 * @generated
		 */
		EClass DELAY_CONSTRAINT = eINSTANCE.getDelayConstraint();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DELAY_CONSTRAINT__TARGET = eINSTANCE.getDelayConstraint_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DELAY_CONSTRAINT__SOURCE = eINSTANCE.getDelayConstraint_Source();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DELAY_CONSTRAINT__LOWER = eINSTANCE.getDelayConstraint_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DELAY_CONSTRAINT__UPPER = eINSTANCE.getDelayConstraint_Upper();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.AgeConstraintImpl <em>Age Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.AgeConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getAgeConstraint()
		 * @generated
		 */
		EClass AGE_CONSTRAINT = eINSTANCE.getAgeConstraint();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference AGE_CONSTRAINT__MAXIMUM = eINSTANCE.getAgeConstraint_Maximum();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference AGE_CONSTRAINT__MINIMUM = eINSTANCE.getAgeConstraint_Minimum();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference AGE_CONSTRAINT__SCOPE = eINSTANCE.getAgeConstraint_Scope();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.InputSynchronizationConstraintImpl <em>Input Synchronization Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.InputSynchronizationConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getInputSynchronizationConstraint()
		 * @generated
		 */
		EClass INPUT_SYNCHRONIZATION_CONSTRAINT = eINSTANCE.getInputSynchronizationConstraint();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference INPUT_SYNCHRONIZATION_CONSTRAINT__TOLERANCE = eINSTANCE.getInputSynchronizationConstraint_Tolerance();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference INPUT_SYNCHRONIZATION_CONSTRAINT__SCOPE = eINSTANCE.getInputSynchronizationConstraint_Scope();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.OutputSynchronizationConstraintImpl <em>Output Synchronization Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.OutputSynchronizationConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getOutputSynchronizationConstraint()
		 * @generated
		 */
		EClass OUTPUT_SYNCHRONIZATION_CONSTRAINT = eINSTANCE.getOutputSynchronizationConstraint();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference OUTPUT_SYNCHRONIZATION_CONSTRAINT__SCOPE = eINSTANCE.getOutputSynchronizationConstraint_Scope();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference OUTPUT_SYNCHRONIZATION_CONSTRAINT__TOLERANCE = eINSTANCE.getOutputSynchronizationConstraint_Tolerance();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ReactionConstraintImpl <em>Reaction Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ReactionConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getReactionConstraint()
		 * @generated
		 */
		EClass REACTION_CONSTRAINT = eINSTANCE.getReactionConstraint();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REACTION_CONSTRAINT__SCOPE = eINSTANCE.getReactionConstraint_Scope();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REACTION_CONSTRAINT__MAXIMUM = eINSTANCE.getReactionConstraint_Maximum();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REACTION_CONSTRAINT__MINIMUM = eINSTANCE.getReactionConstraint_Minimum();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SporadicConstraintImpl <em>Sporadic Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SporadicConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getSporadicConstraint()
		 * @generated
		 */
		EClass SPORADIC_CONSTRAINT = eINSTANCE.getSporadicConstraint();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SPORADIC_CONSTRAINT__EVENT = eINSTANCE.getSporadicConstraint_Event();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SPORADIC_CONSTRAINT__LOWER = eINSTANCE.getSporadicConstraint_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SPORADIC_CONSTRAINT__UPPER = eINSTANCE.getSporadicConstraint_Upper();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SPORADIC_CONSTRAINT__JITTER = eINSTANCE.getSporadicConstraint_Jitter();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SPORADIC_CONSTRAINT__MINIMUM = eINSTANCE.getSporadicConstraint_Minimum();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PeriodicConstraintImpl <em>Periodic Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PeriodicConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getPeriodicConstraint()
		 * @generated
		 */
		EClass PERIODIC_CONSTRAINT = eINSTANCE.getPeriodicConstraint();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PERIODIC_CONSTRAINT__JITTER = eINSTANCE.getPeriodicConstraint_Jitter();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PERIODIC_CONSTRAINT__PERIOD = eINSTANCE.getPeriodicConstraint_Period();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PERIODIC_CONSTRAINT__MINIMUM = eINSTANCE.getPeriodicConstraint_Minimum();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PERIODIC_CONSTRAINT__EVENT = eINSTANCE.getPeriodicConstraint_Event();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PatternConstraintImpl <em>Pattern Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PatternConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getPatternConstraint()
		 * @generated
		 */
		EClass PATTERN_CONSTRAINT = eINSTANCE.getPatternConstraint();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PATTERN_CONSTRAINT__PERIOD = eINSTANCE.getPatternConstraint_Period();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PATTERN_CONSTRAINT__MINIMUM = eINSTANCE.getPatternConstraint_Minimum();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PATTERN_CONSTRAINT__OFFSET = eINSTANCE.getPatternConstraint_Offset();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PATTERN_CONSTRAINT__JITTER = eINSTANCE.getPatternConstraint_Jitter();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PATTERN_CONSTRAINT__EVENT = eINSTANCE.getPatternConstraint_Event();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ArbitraryConstraintImpl <em>Arbitrary Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ArbitraryConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getArbitraryConstraint()
		 * @generated
		 */
		EClass ARBITRARY_CONSTRAINT = eINSTANCE.getArbitraryConstraint();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ARBITRARY_CONSTRAINT__MINIMUM = eINSTANCE.getArbitraryConstraint_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ARBITRARY_CONSTRAINT__MAXIMUM = eINSTANCE.getArbitraryConstraint_Maximum();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ARBITRARY_CONSTRAINT__EVENT = eINSTANCE.getArbitraryConstraint_Event();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ExecutionTimeConstraintImpl <em>Execution Time Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ExecutionTimeConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getExecutionTimeConstraint()
		 * @generated
		 */
		EClass EXECUTION_TIME_CONSTRAINT = eINSTANCE.getExecutionTimeConstraint();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EXECUTION_TIME_CONSTRAINT__START = eINSTANCE.getExecutionTimeConstraint_Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EXECUTION_TIME_CONSTRAINT__STOP = eINSTANCE.getExecutionTimeConstraint_Stop();

		/**
		 * The meta object literal for the '<em><b>Preemption</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EXECUTION_TIME_CONSTRAINT__PREEMPTION = eINSTANCE.getExecutionTimeConstraint_Preemption();

		/**
		 * The meta object literal for the '<em><b>Resume</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EXECUTION_TIME_CONSTRAINT__RESUME = eINSTANCE.getExecutionTimeConstraint_Resume();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EXECUTION_TIME_CONSTRAINT__UPPER = eINSTANCE.getExecutionTimeConstraint_Upper();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EXECUTION_TIME_CONSTRAINT__LOWER = eINSTANCE.getExecutionTimeConstraint_Lower();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.BurstConstraintImpl <em>Burst Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.BurstConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getBurstConstraint()
		 * @generated
		 */
		EClass BURST_CONSTRAINT = eINSTANCE.getBurstConstraint();

		/**
		 * The meta object literal for the '<em><b>Max Occurrences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute BURST_CONSTRAINT__MAX_OCCURRENCES = eINSTANCE.getBurstConstraint_MaxOccurrences();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BURST_CONSTRAINT__EVENT = eINSTANCE.getBurstConstraint_Event();

		/**
		 * The meta object literal for the '<em><b>Lenght</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BURST_CONSTRAINT__LENGHT = eINSTANCE.getBurstConstraint_Lenght();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BURST_CONSTRAINT__MINIMUM = eINSTANCE.getBurstConstraint_Minimum();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ComparisonConstraintImpl <em>Comparison Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ComparisonConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getComparisonConstraint()
		 * @generated
		 */
		EClass COMPARISON_CONSTRAINT = eINSTANCE.getComparisonConstraint();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference COMPARISON_CONSTRAINT__RIGHT_OPERAND = eINSTANCE.getComparisonConstraint_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference COMPARISON_CONSTRAINT__LEFT_OPERAND = eINSTANCE.getComparisonConstraint_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute COMPARISON_CONSTRAINT__OPERATOR = eINSTANCE.getComparisonConstraint_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.OrderConstraintImpl <em>Order Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.OrderConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getOrderConstraint()
		 * @generated
		 */
		EClass ORDER_CONSTRAINT = eINSTANCE.getOrderConstraint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ORDER_CONSTRAINT__SOURCE = eINSTANCE.getOrderConstraint_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ORDER_CONSTRAINT__TARGET = eINSTANCE.getOrderConstraint_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.RepetitionConstraintImpl <em>Repetition Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.RepetitionConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getRepetitionConstraint()
		 * @generated
		 */
		EClass REPETITION_CONSTRAINT = eINSTANCE.getRepetitionConstraint();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute REPETITION_CONSTRAINT__SPAN = eINSTANCE.getRepetitionConstraint_Span();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REPETITION_CONSTRAINT__LOWER = eINSTANCE.getRepetitionConstraint_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REPETITION_CONSTRAINT__UPPER = eINSTANCE.getRepetitionConstraint_Upper();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REPETITION_CONSTRAINT__JITTER = eINSTANCE.getRepetitionConstraint_Jitter();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REPETITION_CONSTRAINT__EVENT = eINSTANCE.getRepetitionConstraint_Event();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.StrongDelayConstraintImpl <em>Strong Delay Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.StrongDelayConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getStrongDelayConstraint()
		 * @generated
		 */
		EClass STRONG_DELAY_CONSTRAINT = eINSTANCE.getStrongDelayConstraint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference STRONG_DELAY_CONSTRAINT__SOURCE = eINSTANCE.getStrongDelayConstraint_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference STRONG_DELAY_CONSTRAINT__TARGET = eINSTANCE.getStrongDelayConstraint_Target();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference STRONG_DELAY_CONSTRAINT__LOWER = eINSTANCE.getStrongDelayConstraint_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference STRONG_DELAY_CONSTRAINT__UPPER = eINSTANCE.getStrongDelayConstraint_Upper();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.StrongSynchronizationConstraintImpl <em>Strong Synchronization Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.StrongSynchronizationConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getStrongSynchronizationConstraint()
		 * @generated
		 */
		EClass STRONG_SYNCHRONIZATION_CONSTRAINT = eINSTANCE.getStrongSynchronizationConstraint();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference STRONG_SYNCHRONIZATION_CONSTRAINT__EVENT = eINSTANCE.getStrongSynchronizationConstraint_Event();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference STRONG_SYNCHRONIZATION_CONSTRAINT__TOLERANCE = eINSTANCE.getStrongSynchronizationConstraint_Tolerance();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SynchronizationConstraintImpl <em>Synchronization Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SynchronizationConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getSynchronizationConstraint()
		 * @generated
		 */
		EClass SYNCHRONIZATION_CONSTRAINT = eINSTANCE.getSynchronizationConstraint();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SYNCHRONIZATION_CONSTRAINT__EVENT = eINSTANCE.getSynchronizationConstraint_Event();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SYNCHRONIZATION_CONSTRAINT__TOLERANCE = eINSTANCE.getSynchronizationConstraint_Tolerance();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonKind <em>Comparison Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonKind
		 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getComparisonKind()
		 * @generated
		 */
		EEnum COMPARISON_KIND = eINSTANCE.getComparisonKind();

	}

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "timingconstraints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Timing/TimingConstraints/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "TimingConstraints";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	TimingconstraintsPackage eINSTANCE = org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.DelayConstraintImpl <em>Delay Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.DelayConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getDelayConstraint()
	 * @generated
	 */
	int DELAY_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__TARGET = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__SOURCE = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__LOWER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__UPPER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Delay Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Delay Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.AgeConstraintImpl <em>Age Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.AgeConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getAgeConstraint()
	 * @generated
	 */
	int AGE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__MAXIMUM = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__MINIMUM = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__SCOPE = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Age Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Age Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.InputSynchronizationConstraintImpl <em>Input Synchronization Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.InputSynchronizationConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getInputSynchronizationConstraint()
	 * @generated
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__TOLERANCE = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__SCOPE = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ReactionConstraintImpl <em>Reaction Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ReactionConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getReactionConstraint()
	 * @generated
	 */
	int REACTION_CONSTRAINT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SporadicConstraintImpl <em>Sporadic Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SporadicConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getSporadicConstraint()
	 * @generated
	 */
	int SPORADIC_CONSTRAINT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PeriodicConstraintImpl <em>Periodic Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PeriodicConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getPeriodicConstraint()
	 * @generated
	 */
	int PERIODIC_CONSTRAINT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PatternConstraintImpl <em>Pattern Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.PatternConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getPatternConstraint()
	 * @generated
	 */
	int PATTERN_CONSTRAINT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ArbitraryConstraintImpl <em>Arbitrary Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ArbitraryConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getArbitraryConstraint()
	 * @generated
	 */
	int ARBITRARY_CONSTRAINT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ExecutionTimeConstraintImpl <em>Execution Time Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ExecutionTimeConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getExecutionTimeConstraint()
	 * @generated
	 */
	int EXECUTION_TIME_CONSTRAINT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.BurstConstraintImpl <em>Burst Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.BurstConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getBurstConstraint()
	 * @generated
	 */
	int BURST_CONSTRAINT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ComparisonConstraintImpl <em>Comparison Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.ComparisonConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getComparisonConstraint()
	 * @generated
	 */
	int COMPARISON_CONSTRAINT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.OrderConstraintImpl <em>Order Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.OrderConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getOrderConstraint()
	 * @generated
	 */
	int ORDER_CONSTRAINT = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.RepetitionConstraintImpl <em>Repetition Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.RepetitionConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getRepetitionConstraint()
	 * @generated
	 */
	int REPETITION_CONSTRAINT = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.StrongDelayConstraintImpl <em>Strong Delay Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.StrongDelayConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getStrongDelayConstraint()
	 * @generated
	 */
	int STRONG_DELAY_CONSTRAINT = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.StrongSynchronizationConstraintImpl <em>Strong Synchronization Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.StrongSynchronizationConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getStrongSynchronizationConstraint()
	 * @generated
	 */
	int STRONG_SYNCHRONIZATION_CONSTRAINT = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SynchronizationConstraintImpl <em>Synchronization Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SynchronizationConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getSynchronizationConstraint()
	 * @generated
	 */
	int SYNCHRONIZATION_CONSTRAINT = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonKind <em>Comparison Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonKind
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getComparisonKind()
	 * @generated
	 */
	int COMPARISON_KIND = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.OutputSynchronizationConstraintImpl <em>Output Synchronization Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.OutputSynchronizationConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl#getOutputSynchronizationConstraint()
	 * @generated
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__SCOPE = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__TOLERANCE = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Output Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__SCOPE = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__MAXIMUM = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__MINIMUM = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__EVENT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__LOWER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__UPPER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__JITTER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT__MINIMUM = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sporadic Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sporadic Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPORADIC_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__JITTER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__PERIOD = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__MINIMUM = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT__EVENT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Periodic Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Periodic Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__PERIOD = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__MINIMUM = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__OFFSET = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__JITTER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT__EVENT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pattern Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Pattern Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PATTERN_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__MINIMUM = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__MAXIMUM = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT__EVENT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arbitrary Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arbitrary Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__START = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__STOP = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Preemption</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__PREEMPTION = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resume</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__RESUME = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__UPPER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__LOWER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Execution Time Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Execution Time Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Max Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__MAX_OCCURRENCES = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__EVENT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lenght</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__LENGHT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT__MINIMUM = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Burst Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Burst Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BURST_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONSTRAINT__RIGHT_OPERAND = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONSTRAINT__LEFT_OPERAND = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONSTRAINT__OPERATOR = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comparison Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__SOURCE = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__TARGET = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Order Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Order Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__SPAN = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__LOWER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__UPPER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__JITTER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__EVENT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Repetition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Repetition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_DELAY_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_DELAY_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_DELAY_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_DELAY_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_DELAY_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_DELAY_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_DELAY_CONSTRAINT__SOURCE = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_DELAY_CONSTRAINT__TARGET = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_DELAY_CONSTRAINT__LOWER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_DELAY_CONSTRAINT__UPPER = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Strong Delay Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_DELAY_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Strong Delay Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_DELAY_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_SYNCHRONIZATION_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_SYNCHRONIZATION_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_SYNCHRONIZATION_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_SYNCHRONIZATION_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_SYNCHRONIZATION_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_SYNCHRONIZATION_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_SYNCHRONIZATION_CONSTRAINT__EVENT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_SYNCHRONIZATION_CONSTRAINT__TOLERANCE = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Strong Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_SYNCHRONIZATION_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Strong Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRONG_SYNCHRONIZATION_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT__BASE_NAMED_ELEMENT = TimingPackage.TIMING_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT__NAME = TimingPackage.TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT__OWNED_COMMENT = TimingPackage.TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT__MODE = TimingPackage.TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT__BASE_CLASS = TimingPackage.TIMING_CONSTRAINT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT__BASE_CONSTRAINT = TimingPackage.TIMING_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT__EVENT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT__TOLERANCE = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT_FEATURE_COUNT = TimingPackage.TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_CONSTRAINT_OPERATION_COUNT = TimingPackage.TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint <em>Delay Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Delay Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint
	 * @generated
	 */
	EClass getDelayConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getTarget()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Target();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getSource()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Lower</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getLower()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Lower();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Upper</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.DelayConstraint#getUpper()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Upper();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint <em>Age Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Age Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint
	 * @generated
	 */
	EClass getAgeConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Maximum</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint#getMaximum()
	 * @see #getAgeConstraint()
	 * @generated
	 */
	EReference getAgeConstraint_Maximum();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Minimum</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint#getMinimum()
	 * @see #getAgeConstraint()
	 * @generated
	 */
	EReference getAgeConstraint_Minimum();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint#getScope()
	 * @see #getAgeConstraint()
	 * @generated
	 */
	EReference getAgeConstraint_Scope();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.InputSynchronizationConstraint <em>Input Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Input Synchronization Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.InputSynchronizationConstraint
	 * @generated
	 */
	EClass getInputSynchronizationConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.InputSynchronizationConstraint#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Tolerance</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.InputSynchronizationConstraint#getTolerance()
	 * @see #getInputSynchronizationConstraint()
	 * @generated
	 */
	EReference getInputSynchronizationConstraint_Tolerance();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.InputSynchronizationConstraint#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Scope</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.InputSynchronizationConstraint#getScope()
	 * @see #getInputSynchronizationConstraint()
	 * @generated
	 */
	EReference getInputSynchronizationConstraint_Scope();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.OutputSynchronizationConstraint <em>Output Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Output Synchronization Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.OutputSynchronizationConstraint
	 * @generated
	 */
	EClass getOutputSynchronizationConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.OutputSynchronizationConstraint#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Scope</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.OutputSynchronizationConstraint#getScope()
	 * @see #getOutputSynchronizationConstraint()
	 * @generated
	 */
	EReference getOutputSynchronizationConstraint_Scope();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.OutputSynchronizationConstraint#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Tolerance</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.OutputSynchronizationConstraint#getTolerance()
	 * @see #getOutputSynchronizationConstraint()
	 * @generated
	 */
	EReference getOutputSynchronizationConstraint_Tolerance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ReactionConstraint <em>Reaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Reaction Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ReactionConstraint
	 * @generated
	 */
	EClass getReactionConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ReactionConstraint#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ReactionConstraint#getScope()
	 * @see #getReactionConstraint()
	 * @generated
	 */
	EReference getReactionConstraint_Scope();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ReactionConstraint#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Maximum</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ReactionConstraint#getMaximum()
	 * @see #getReactionConstraint()
	 * @generated
	 */
	EReference getReactionConstraint_Maximum();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ReactionConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Minimum</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ReactionConstraint#getMinimum()
	 * @see #getReactionConstraint()
	 * @generated
	 */
	EReference getReactionConstraint_Minimum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint <em>Sporadic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Sporadic Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint
	 * @generated
	 */
	EClass getSporadicConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint#getEvent()
	 * @see #getSporadicConstraint()
	 * @generated
	 */
	EReference getSporadicConstraint_Event();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Lower</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint#getLower()
	 * @see #getSporadicConstraint()
	 * @generated
	 */
	EReference getSporadicConstraint_Lower();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Upper</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint#getUpper()
	 * @see #getSporadicConstraint()
	 * @generated
	 */
	EReference getSporadicConstraint_Upper();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Jitter</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint#getJitter()
	 * @see #getSporadicConstraint()
	 * @generated
	 */
	EReference getSporadicConstraint_Jitter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Minimum</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.SporadicConstraint#getMinimum()
	 * @see #getSporadicConstraint()
	 * @generated
	 */
	EReference getSporadicConstraint_Minimum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint <em>Periodic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Periodic Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint
	 * @generated
	 */
	EClass getPeriodicConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Jitter</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getJitter()
	 * @see #getPeriodicConstraint()
	 * @generated
	 */
	EReference getPeriodicConstraint_Jitter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getPeriod()
	 * @see #getPeriodicConstraint()
	 * @generated
	 */
	EReference getPeriodicConstraint_Period();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Minimum</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getMinimum()
	 * @see #getPeriodicConstraint()
	 * @generated
	 */
	EReference getPeriodicConstraint_Minimum();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.PeriodicConstraint#getEvent()
	 * @see #getPeriodicConstraint()
	 * @generated
	 */
	EReference getPeriodicConstraint_Event();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint <em>Pattern Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Pattern Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint
	 * @generated
	 */
	EClass getPatternConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getPeriod()
	 * @see #getPatternConstraint()
	 * @generated
	 */
	EReference getPatternConstraint_Period();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Minimum</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getMinimum()
	 * @see #getPatternConstraint()
	 * @generated
	 */
	EReference getPatternConstraint_Minimum();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Offset</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getOffset()
	 * @see #getPatternConstraint()
	 * @generated
	 */
	EReference getPatternConstraint_Offset();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Jitter</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getJitter()
	 * @see #getPatternConstraint()
	 * @generated
	 */
	EReference getPatternConstraint_Jitter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.PatternConstraint#getEvent()
	 * @see #getPatternConstraint()
	 * @generated
	 */
	EReference getPatternConstraint_Event();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint <em>Arbitrary Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Arbitrary Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint
	 * @generated
	 */
	EClass getArbitraryConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Minimum</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint#getMinimum()
	 * @see #getArbitraryConstraint()
	 * @generated
	 */
	EReference getArbitraryConstraint_Minimum();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Maximum</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint#getMaximum()
	 * @see #getArbitraryConstraint()
	 * @generated
	 */
	EReference getArbitraryConstraint_Maximum();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint#getEvent()
	 * @see #getArbitraryConstraint()
	 * @generated
	 */
	EReference getArbitraryConstraint_Event();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint <em>Execution Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Execution Time Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint
	 * @generated
	 */
	EClass getExecutionTimeConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getStart()
	 * @see #getExecutionTimeConstraint()
	 * @generated
	 */
	EReference getExecutionTimeConstraint_Start();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Stop</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getStop()
	 * @see #getExecutionTimeConstraint()
	 * @generated
	 */
	EReference getExecutionTimeConstraint_Stop();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getPreemption <em>Preemption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Preemption</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getPreemption()
	 * @see #getExecutionTimeConstraint()
	 * @generated
	 */
	EReference getExecutionTimeConstraint_Preemption();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getResume <em>Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Resume</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getResume()
	 * @see #getExecutionTimeConstraint()
	 * @generated
	 */
	EReference getExecutionTimeConstraint_Resume();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Upper</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getUpper()
	 * @see #getExecutionTimeConstraint()
	 * @generated
	 */
	EReference getExecutionTimeConstraint_Upper();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Lower</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ExecutionTimeConstraint#getLower()
	 * @see #getExecutionTimeConstraint()
	 * @generated
	 */
	EReference getExecutionTimeConstraint_Lower();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint <em>Burst Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Burst Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint
	 * @generated
	 */
	EClass getBurstConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getMaxOccurrences <em>Max Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Max Occurrences</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getMaxOccurrences()
	 * @see #getBurstConstraint()
	 * @generated
	 */
	EAttribute getBurstConstraint_MaxOccurrences();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getEvent()
	 * @see #getBurstConstraint()
	 * @generated
	 */
	EReference getBurstConstraint_Event();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getLenght <em>Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Lenght</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getLenght()
	 * @see #getBurstConstraint()
	 * @generated
	 */
	EReference getBurstConstraint_Lenght();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Minimum</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint#getMinimum()
	 * @see #getBurstConstraint()
	 * @generated
	 */
	EReference getBurstConstraint_Minimum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint <em>Comparison Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Comparison Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint
	 * @generated
	 */
	EClass getComparisonConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Right Operand</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint#getRightOperand()
	 * @see #getComparisonConstraint()
	 * @generated
	 */
	EReference getComparisonConstraint_RightOperand();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Left Operand</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint#getLeftOperand()
	 * @see #getComparisonConstraint()
	 * @generated
	 */
	EReference getComparisonConstraint_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint#getOperator()
	 * @see #getComparisonConstraint()
	 * @generated
	 */
	EAttribute getComparisonConstraint_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.OrderConstraint <em>Order Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Order Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.OrderConstraint
	 * @generated
	 */
	EClass getOrderConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.OrderConstraint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.OrderConstraint#getSource()
	 * @see #getOrderConstraint()
	 * @generated
	 */
	EReference getOrderConstraint_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.OrderConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.OrderConstraint#getTarget()
	 * @see #getOrderConstraint()
	 * @generated
	 */
	EReference getOrderConstraint_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint <em>Repetition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Repetition Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint
	 * @generated
	 */
	EClass getRepetitionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint#getSpan()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EAttribute getRepetitionConstraint_Span();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Lower</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint#getLower()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EReference getRepetitionConstraint_Lower();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Upper</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint#getUpper()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EReference getRepetitionConstraint_Upper();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Jitter</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint#getJitter()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EReference getRepetitionConstraint_Jitter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.RepetitionConstraint#getEvent()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EReference getRepetitionConstraint_Event();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongDelayConstraint <em>Strong Delay Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Strong Delay Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongDelayConstraint
	 * @generated
	 */
	EClass getStrongDelayConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongDelayConstraint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongDelayConstraint#getSource()
	 * @see #getStrongDelayConstraint()
	 * @generated
	 */
	EReference getStrongDelayConstraint_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongDelayConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongDelayConstraint#getTarget()
	 * @see #getStrongDelayConstraint()
	 * @generated
	 */
	EReference getStrongDelayConstraint_Target();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongDelayConstraint#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Lower</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongDelayConstraint#getLower()
	 * @see #getStrongDelayConstraint()
	 * @generated
	 */
	EReference getStrongDelayConstraint_Lower();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongDelayConstraint#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Upper</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongDelayConstraint#getUpper()
	 * @see #getStrongDelayConstraint()
	 * @generated
	 */
	EReference getStrongDelayConstraint_Upper();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongSynchronizationConstraint <em>Strong Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Strong Synchronization Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongSynchronizationConstraint
	 * @generated
	 */
	EClass getStrongSynchronizationConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongSynchronizationConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongSynchronizationConstraint#getEvent()
	 * @see #getStrongSynchronizationConstraint()
	 * @generated
	 */
	EReference getStrongSynchronizationConstraint_Event();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongSynchronizationConstraint#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Tolerance</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.StrongSynchronizationConstraint#getTolerance()
	 * @see #getStrongSynchronizationConstraint()
	 * @generated
	 */
	EReference getStrongSynchronizationConstraint_Tolerance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.SynchronizationConstraint <em>Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Synchronization Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.SynchronizationConstraint
	 * @generated
	 */
	EClass getSynchronizationConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.SynchronizationConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.SynchronizationConstraint#getEvent()
	 * @see #getSynchronizationConstraint()
	 * @generated
	 */
	EReference getSynchronizationConstraint_Event();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.SynchronizationConstraint#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Tolerance</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.SynchronizationConstraint#getTolerance()
	 * @see #getSynchronizationConstraint()
	 * @generated
	 */
	EReference getSynchronizationConstraint_Tolerance();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonKind <em>Comparison Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Comparison Kind</em>'.
	 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonKind
	 * @generated
	 */
	EEnum getComparisonKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimingconstraintsFactory getTimingconstraintsFactory();

} // TimingconstraintsPackage
