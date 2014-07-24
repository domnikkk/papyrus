/**
 * Copyright (c) 2014 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage
 * @generated
 */
public class UMLRealTimeStateMachValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UMLRealTimeStateMachValidator INSTANCE = new UMLRealTimeStateMachValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach"; //$NON-NLS-1$

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'An RTstatemachinehasexactlyoneregion' of 'RT State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_STATE_MACHINE__AN_RTSTATEMACHINEHASEXACTLYONEREGION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'An RTstatemachineisneverreentrant' of 'RT State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_STATE_MACHINE__AN_RTSTATEMACHINEISNEVERREENTRANT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'RTstatemachinesdonothaveparametersorparametersets' of 'RT State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_STATE_MACHINE__RTSTATEMACHINESDONOTHAVEPARAMETERSORPARAMETERSETS = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'RTstatemachinesmusthaveacontextanditmustbea Class' of 'RT State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_STATE_MACHINE__RTSTATEMACHINESMUSTHAVEACONTEXTANDITMUSTBEA_CLASS = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Passivestatemachineareonlyallowedonpassivedataclasses' of 'RT State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_STATE_MACHINE__PASSIVESTATEMACHINEAREONLYALLOWEDONPASSIVEDATACLASSES = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Regionsin RTstatemachinescannothaveafinalstate' of 'RT Region'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_REGION__REGIONSIN_RTSTATEMACHINESCANNOTHAVEAFINALSTATE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Acomposte RTstatehasexactlyoneregion' of 'RT State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_STATE__ACOMPOSTE_RTSTATEHASEXACTLYONEREGION = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'RTdoesnotsupportsubmachinestates' of 'RT State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_STATE__RTDOESNOTSUPPORTSUBMACHINESTATES = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'RTstatemachinesdonotsupportdoactivities' of 'RT State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_STATE__RTSTATEMACHINESDONOTSUPPORTDOACTIVITIES = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'RTstatemachinescannothaveanydeferredtriggers' of 'RT State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_STATE__RTSTATEMACHINESCANNOTHAVEANYDEFERREDTRIGGERS = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint5' of 'RT State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_STATE__CONSTRAINT5 = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'RTstatemachinesdonotsupportconcurrencyorshallowhistory' of 'RT Pseudostate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_PSEUDOSTATE__RTSTATEMACHINESDONOTSUPPORTCONCURRENCYORSHALLOWHISTORY = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealTimeStateMachValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return UMLRealTimeStateMachPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case UMLRealTimeStateMachPackage.RT_STATE_MACHINE:
				return validateRTStateMachine((RTStateMachine)value, diagnostics, context);
			case UMLRealTimeStateMachPackage.RT_REGION:
				return validateRTRegion((RTRegion)value, diagnostics, context);
			case UMLRealTimeStateMachPackage.RT_STATE:
				return validateRTState((RTState)value, diagnostics, context);
			case UMLRealTimeStateMachPackage.RT_PSEUDOSTATE:
				return validateRTPseudostate((RTPseudostate)value, diagnostics, context);
			case UMLRealTimeStateMachPackage.RT_TRIGGER:
				return validateRTTrigger((RTTrigger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTStateMachine(RTStateMachine rtStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rtStateMachine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rtStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rtStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rtStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rtStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rtStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rtStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rtStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rtStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTStateMachine_AnRTstatemachinehasexactlyoneregion(rtStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTStateMachine_AnRTstatemachineisneverreentrant(rtStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTStateMachine_RTstatemachinesdonothaveparametersorparametersets(rtStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTStateMachine_RTstatemachinesmusthaveacontextanditmustbeaClass(rtStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTStateMachine_Passivestatemachineareonlyallowedonpassivedataclasses(rtStateMachine, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AnRTstatemachinehasexactlyoneregion constraint of '<em>RT State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTStateMachine_AnRTstatemachinehasexactlyoneregion(RTStateMachine rtStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtStateMachine.AnRTstatemachinehasexactlyoneregion(diagnostics, context);
	}

	/**
	 * Validates the AnRTstatemachineisneverreentrant constraint of '<em>RT State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTStateMachine_AnRTstatemachineisneverreentrant(RTStateMachine rtStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtStateMachine.AnRTstatemachineisneverreentrant(diagnostics, context);
	}

	/**
	 * Validates the RTstatemachinesdonothaveparametersorparametersets constraint of '<em>RT State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTStateMachine_RTstatemachinesdonothaveparametersorparametersets(RTStateMachine rtStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtStateMachine.RTstatemachinesdonothaveparametersorparametersets(diagnostics, context);
	}

	/**
	 * Validates the RTstatemachinesmusthaveacontextanditmustbeaClass constraint of '<em>RT State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTStateMachine_RTstatemachinesmusthaveacontextanditmustbeaClass(RTStateMachine rtStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtStateMachine.RTstatemachinesmusthaveacontextanditmustbeaClass(diagnostics, context);
	}

	/**
	 * Validates the Passivestatemachineareonlyallowedonpassivedataclasses constraint of '<em>RT State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTStateMachine_Passivestatemachineareonlyallowedonpassivedataclasses(RTStateMachine rtStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtStateMachine.Passivestatemachineareonlyallowedonpassivedataclasses(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTRegion(RTRegion rtRegion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rtRegion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rtRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rtRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rtRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rtRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rtRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rtRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rtRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rtRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTRegion_RegionsinRTstatemachinescannothaveafinalstate(rtRegion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RegionsinRTstatemachinescannothaveafinalstate constraint of '<em>RT Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTRegion_RegionsinRTstatemachinescannothaveafinalstate(RTRegion rtRegion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtRegion.RegionsinRTstatemachinescannothaveafinalstate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTState(RTState rtState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rtState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rtState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rtState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rtState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rtState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rtState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rtState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rtState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rtState, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTState_AcomposteRTstatehasexactlyoneregion(rtState, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTState_RTdoesnotsupportsubmachinestates(rtState, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTState_RTstatemachinesdonotsupportdoactivities(rtState, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTState_RTstatemachinescannothaveanydeferredtriggers(rtState, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTState_Constraint5(rtState, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AcomposteRTstatehasexactlyoneregion constraint of '<em>RT State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTState_AcomposteRTstatehasexactlyoneregion(RTState rtState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtState.AcomposteRTstatehasexactlyoneregion(diagnostics, context);
	}

	/**
	 * Validates the RTdoesnotsupportsubmachinestates constraint of '<em>RT State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTState_RTdoesnotsupportsubmachinestates(RTState rtState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtState.RTdoesnotsupportsubmachinestates(diagnostics, context);
	}

	/**
	 * Validates the RTstatemachinesdonotsupportdoactivities constraint of '<em>RT State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTState_RTstatemachinesdonotsupportdoactivities(RTState rtState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtState.RTstatemachinesdonotsupportdoactivities(diagnostics, context);
	}

	/**
	 * Validates the RTstatemachinescannothaveanydeferredtriggers constraint of '<em>RT State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTState_RTstatemachinescannothaveanydeferredtriggers(RTState rtState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtState.RTstatemachinescannothaveanydeferredtriggers(diagnostics, context);
	}

	/**
	 * Validates the Constraint5 constraint of '<em>RT State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTState_Constraint5(RTState rtState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtState.Constraint5(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTPseudostate(RTPseudostate rtPseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rtPseudostate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rtPseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rtPseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rtPseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rtPseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rtPseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rtPseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rtPseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rtPseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTPseudostate_RTstatemachinesdonotsupportconcurrencyorshallowhistory(rtPseudostate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RTstatemachinesdonotsupportconcurrencyorshallowhistory constraint of '<em>RT Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTPseudostate_RTstatemachinesdonotsupportconcurrencyorshallowhistory(RTPseudostate rtPseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtPseudostate.RTstatemachinesdonotsupportconcurrencyorshallowhistory(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTTrigger(RTTrigger rtTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rtTrigger, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //UMLRealTimeStateMachValidator
