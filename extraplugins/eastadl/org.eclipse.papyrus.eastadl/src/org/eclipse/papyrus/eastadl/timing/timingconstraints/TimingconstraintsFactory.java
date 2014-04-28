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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage
 * @generated
 */
public interface TimingconstraintsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimingconstraintsFactory eINSTANCE = org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Delay Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Constraint</em>'.
	 * @generated
	 */
	DelayConstraint createDelayConstraint();

	/**
	 * Returns a new object of class '<em>Age Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Age Constraint</em>'.
	 * @generated
	 */
	AgeConstraint createAgeConstraint();

	/**
	 * Returns a new object of class '<em>Input Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Synchronization Constraint</em>'.
	 * @generated
	 */
	InputSynchronizationConstraint createInputSynchronizationConstraint();

	/**
	 * Returns a new object of class '<em>Output Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Synchronization Constraint</em>'.
	 * @generated
	 */
	OutputSynchronizationConstraint createOutputSynchronizationConstraint();

	/**
	 * Returns a new object of class '<em>Reaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Constraint</em>'.
	 * @generated
	 */
	ReactionConstraint createReactionConstraint();

	/**
	 * Returns a new object of class '<em>Sporadic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sporadic Constraint</em>'.
	 * @generated
	 */
	SporadicConstraint createSporadicConstraint();

	/**
	 * Returns a new object of class '<em>Periodic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Constraint</em>'.
	 * @generated
	 */
	PeriodicConstraint createPeriodicConstraint();

	/**
	 * Returns a new object of class '<em>Pattern Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Constraint</em>'.
	 * @generated
	 */
	PatternConstraint createPatternConstraint();

	/**
	 * Returns a new object of class '<em>Arbitrary Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arbitrary Constraint</em>'.
	 * @generated
	 */
	ArbitraryConstraint createArbitraryConstraint();

	/**
	 * Returns a new object of class '<em>Execution Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Time Constraint</em>'.
	 * @generated
	 */
	ExecutionTimeConstraint createExecutionTimeConstraint();

	/**
	 * Returns a new object of class '<em>Burst Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Burst Constraint</em>'.
	 * @generated
	 */
	BurstConstraint createBurstConstraint();

	/**
	 * Returns a new object of class '<em>Comparison Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Constraint</em>'.
	 * @generated
	 */
	ComparisonConstraint createComparisonConstraint();

	/**
	 * Returns a new object of class '<em>Order Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Constraint</em>'.
	 * @generated
	 */
	OrderConstraint createOrderConstraint();

	/**
	 * Returns a new object of class '<em>Repetition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repetition Constraint</em>'.
	 * @generated
	 */
	RepetitionConstraint createRepetitionConstraint();

	/**
	 * Returns a new object of class '<em>Strong Delay Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strong Delay Constraint</em>'.
	 * @generated
	 */
	StrongDelayConstraint createStrongDelayConstraint();

	/**
	 * Returns a new object of class '<em>Strong Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strong Synchronization Constraint</em>'.
	 * @generated
	 */
	StrongSynchronizationConstraint createStrongSynchronizationConstraint();

	/**
	 * Returns a new object of class '<em>Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization Constraint</em>'.
	 * @generated
	 */
	SynchronizationConstraint createSynchronizationConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimingconstraintsPackage getTimingconstraintsPackage();

} //TimingconstraintsFactory
