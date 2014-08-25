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
package org.eclipse.papyrus.eastadl.timing.timingconstraints.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.AgeConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.ArbitraryConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.BurstConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.ComparisonKind;
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
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsFactory;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TimingconstraintsFactoryImpl extends EFactoryImpl implements TimingconstraintsFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimingconstraintsPackage getPackage() {
		return TimingconstraintsPackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static TimingconstraintsFactory init() {
		try {
			TimingconstraintsFactory theTimingconstraintsFactory = (TimingconstraintsFactory) EPackage.Registry.INSTANCE.getEFactory(TimingconstraintsPackage.eNS_URI);
			if (theTimingconstraintsFactory != null) {
				return theTimingconstraintsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimingconstraintsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TimingconstraintsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TimingconstraintsPackage.DELAY_CONSTRAINT:
			return createDelayConstraint();
		case TimingconstraintsPackage.AGE_CONSTRAINT:
			return createAgeConstraint();
		case TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT:
			return createInputSynchronizationConstraint();
		case TimingconstraintsPackage.OUTPUT_SYNCHRONIZATION_CONSTRAINT:
			return createOutputSynchronizationConstraint();
		case TimingconstraintsPackage.REACTION_CONSTRAINT:
			return createReactionConstraint();
		case TimingconstraintsPackage.SPORADIC_CONSTRAINT:
			return createSporadicConstraint();
		case TimingconstraintsPackage.PERIODIC_CONSTRAINT:
			return createPeriodicConstraint();
		case TimingconstraintsPackage.PATTERN_CONSTRAINT:
			return createPatternConstraint();
		case TimingconstraintsPackage.ARBITRARY_CONSTRAINT:
			return createArbitraryConstraint();
		case TimingconstraintsPackage.EXECUTION_TIME_CONSTRAINT:
			return createExecutionTimeConstraint();
		case TimingconstraintsPackage.BURST_CONSTRAINT:
			return createBurstConstraint();
		case TimingconstraintsPackage.COMPARISON_CONSTRAINT:
			return createComparisonConstraint();
		case TimingconstraintsPackage.ORDER_CONSTRAINT:
			return createOrderConstraint();
		case TimingconstraintsPackage.REPETITION_CONSTRAINT:
			return createRepetitionConstraint();
		case TimingconstraintsPackage.STRONG_DELAY_CONSTRAINT:
			return createStrongDelayConstraint();
		case TimingconstraintsPackage.STRONG_SYNCHRONIZATION_CONSTRAINT:
			return createStrongSynchronizationConstraint();
		case TimingconstraintsPackage.SYNCHRONIZATION_CONSTRAINT:
			return createSynchronizationConstraint();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TimingconstraintsPackage.COMPARISON_KIND:
			return createComparisonKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TimingconstraintsPackage.COMPARISON_KIND:
			return convertComparisonKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DelayConstraint createDelayConstraint() {
		DelayConstraintImpl delayConstraint = new DelayConstraintImpl();
		return delayConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AgeConstraint createAgeConstraint() {
		AgeConstraintImpl ageConstraint = new AgeConstraintImpl();
		return ageConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public InputSynchronizationConstraint createInputSynchronizationConstraint() {
		InputSynchronizationConstraintImpl inputSynchronizationConstraint = new InputSynchronizationConstraintImpl();
		return inputSynchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public OutputSynchronizationConstraint createOutputSynchronizationConstraint() {
		OutputSynchronizationConstraintImpl outputSynchronizationConstraint = new OutputSynchronizationConstraintImpl();
		return outputSynchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ReactionConstraint createReactionConstraint() {
		ReactionConstraintImpl reactionConstraint = new ReactionConstraintImpl();
		return reactionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public SporadicConstraint createSporadicConstraint() {
		SporadicConstraintImpl sporadicConstraint = new SporadicConstraintImpl();
		return sporadicConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PeriodicConstraint createPeriodicConstraint() {
		PeriodicConstraintImpl periodicConstraint = new PeriodicConstraintImpl();
		return periodicConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PatternConstraint createPatternConstraint() {
		PatternConstraintImpl patternConstraint = new PatternConstraintImpl();
		return patternConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ArbitraryConstraint createArbitraryConstraint() {
		ArbitraryConstraintImpl arbitraryConstraint = new ArbitraryConstraintImpl();
		return arbitraryConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ExecutionTimeConstraint createExecutionTimeConstraint() {
		ExecutionTimeConstraintImpl executionTimeConstraint = new ExecutionTimeConstraintImpl();
		return executionTimeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BurstConstraint createBurstConstraint() {
		BurstConstraintImpl burstConstraint = new BurstConstraintImpl();
		return burstConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ComparisonConstraint createComparisonConstraint() {
		ComparisonConstraintImpl comparisonConstraint = new ComparisonConstraintImpl();
		return comparisonConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public OrderConstraint createOrderConstraint() {
		OrderConstraintImpl orderConstraint = new OrderConstraintImpl();
		return orderConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public RepetitionConstraint createRepetitionConstraint() {
		RepetitionConstraintImpl repetitionConstraint = new RepetitionConstraintImpl();
		return repetitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public StrongDelayConstraint createStrongDelayConstraint() {
		StrongDelayConstraintImpl strongDelayConstraint = new StrongDelayConstraintImpl();
		return strongDelayConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public StrongSynchronizationConstraint createStrongSynchronizationConstraint() {
		StrongSynchronizationConstraintImpl strongSynchronizationConstraint = new StrongSynchronizationConstraintImpl();
		return strongSynchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public SynchronizationConstraint createSynchronizationConstraint() {
		SynchronizationConstraintImpl synchronizationConstraint = new SynchronizationConstraintImpl();
		return synchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ComparisonKind createComparisonKindFromString(EDataType eDataType, String initialValue) {
		ComparisonKind result = ComparisonKind.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertComparisonKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TimingconstraintsPackage getTimingconstraintsPackage() {
		return (TimingconstraintsPackage) getEPackage();
	}

} // TimingconstraintsFactoryImpl
