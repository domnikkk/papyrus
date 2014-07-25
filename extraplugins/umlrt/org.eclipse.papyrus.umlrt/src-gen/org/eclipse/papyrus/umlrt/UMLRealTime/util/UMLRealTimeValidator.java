/**
 * Copyright (c) 2014 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.umlrt.UMLRealTime.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.papyrus.umlrt.UMLRealTime.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage
 * @generated
 */
public class UMLRealTimeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UMLRealTimeValidator INSTANCE = new UMLRealTimeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.umlrt.UMLRealTime"; //$NON-NLS-1$

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Capsulesarealwaysactive' of 'Capsule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAPSULE__CAPSULESAREALWAYSACTIVE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Acapsulecannothave Receptionfeatures' of 'Capsule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAPSULE__ACAPSULECANNOTHAVE_RECEPTIONFEATURES = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Acapsuleclasscanalwaysbesubclassed' of 'Capsule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAPSULE__ACAPSULECLASSCANALWAYSBESUBCLASSED = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Acapsulecanhaveatmostonesuperclass' of 'Capsule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAPSULE__ACAPSULECANHAVEATMOSTONESUPERCLASS = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Capsuleclassesarealwayssubstitutable' of 'Capsule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAPSULE__CAPSULECLASSESAREALWAYSSUBSTITUTABLE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allattributesofacapsuleclasshaveexactlyonetype' of 'Capsule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAPSULE__ALLATTRIBUTESOFACAPSULECLASSHAVEEXACTLYONETYPE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Privatevisibilityisnotsupportedoncapsulefeatures' of 'Capsule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAPSULE__PRIVATEVISIBILITYISNOTSUPPORTEDONCAPSULEFEATURES = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Acapsuleclasscannothavenestedclassifiers' of 'Capsule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAPSULE__ACAPSULECLASSCANNOTHAVENESTEDCLASSIFIERS = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alloperationsofacapsulearesequential' of 'Capsule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAPSULE__ALLOPERATIONSOFACAPSULEARESEQUENTIAL = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Protocolscanhaveatmostonegeneralization' of 'Protocol'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTOCOL__PROTOCOLSCANHAVEATMOSTONEGENERALIZATION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Awiredportcannotpublishitsname' of 'RT Port'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_PORT__AWIREDPORTCANNOTPUBLISHITSNAME = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Apublicportmustbedefinedasaserviceport' of 'RT Port'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_PORT__APUBLICPORTMUSTBEDEFINEDASASERVICEPORT = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'ASA Punwiredunpublishedmusthaveprotectedvisibility' of 'RT Port'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_PORT__ASA_PUNWIREDUNPUBLISHEDMUSTHAVEPROTECTEDVISIBILITY = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'An SP Punwiredandpublishedmusthavepublicvisibility' of 'RT Port'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_PORT__AN_SP_PUNWIREDANDPUBLISHEDMUSTHAVEPUBLICVISIBILITY = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Onlybinaryconnectorsareallowed' of 'RT Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RT_CONNECTOR__ONLYBINARYCONNECTORSAREALLOWED = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exclusioncanonlybeappliedtosome UMLR Tmodelelements' of 'RTR Excluded Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RTR_EXCLUDED_ELEMENT__EXCLUSIONCANONLYBEAPPLIEDTOSOME_UMLR_TMODELELEMENTS = 16;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 16;

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
	public UMLRealTimeValidator() {
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
	  return UMLRealTimePackage.eINSTANCE;
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
			case UMLRealTimePackage.CAPSULE:
				return validateCapsule((Capsule)value, diagnostics, context);
			case UMLRealTimePackage.CAPSULE_PART:
				return validateCapsulePart((CapsulePart)value, diagnostics, context);
			case UMLRealTimePackage.PROTOCOL:
				return validateProtocol((Protocol)value, diagnostics, context);
			case UMLRealTimePackage.RT_PORT:
				return validateRTPort((RTPort)value, diagnostics, context);
			case UMLRealTimePackage.RT_CONNECTOR:
				return validateRTConnector((RTConnector)value, diagnostics, context);
			case UMLRealTimePackage.PROTOCOL_CONTAINER:
				return validateProtocolContainer((ProtocolContainer)value, diagnostics, context);
			case UMLRealTimePackage.RTR_EXCLUDED_ELEMENT:
				return validateRTRExcludedElement((RTRExcludedElement)value, diagnostics, context);
			case UMLRealTimePackage.RT_MESSAGE_SET:
				return validateRTMessageSet((RTMessageSet)value, diagnostics, context);
			case UMLRealTimePackage.PORT_REGISTRATION_TYPE:
				return validatePortRegistrationType((PortRegistrationType)value, diagnostics, context);
			case UMLRealTimePackage.RT_MESSAGE_KIND:
				return validateRTMessageKind((RTMessageKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapsule(Capsule capsule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(capsule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validateCapsule_Capsulesarealwaysactive(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validateCapsule_AcapsulecannothaveReceptionfeatures(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validateCapsule_Acapsuleclasscanalwaysbesubclassed(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validateCapsule_Acapsulecanhaveatmostonesuperclass(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validateCapsule_Capsuleclassesarealwayssubstitutable(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validateCapsule_Allattributesofacapsuleclasshaveexactlyonetype(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validateCapsule_Privatevisibilityisnotsupportedoncapsulefeatures(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validateCapsule_Acapsuleclasscannothavenestedclassifiers(capsule, diagnostics, context);
		if (result || diagnostics != null) result &= validateCapsule_Alloperationsofacapsulearesequential(capsule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Capsulesarealwaysactive constraint of '<em>Capsule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapsule_Capsulesarealwaysactive(Capsule capsule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return capsule.Capsulesarealwaysactive(diagnostics, context);
	}

	/**
	 * Validates the AcapsulecannothaveReceptionfeatures constraint of '<em>Capsule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapsule_AcapsulecannothaveReceptionfeatures(Capsule capsule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return capsule.AcapsulecannothaveReceptionfeatures(diagnostics, context);
	}

	/**
	 * Validates the Acapsuleclasscanalwaysbesubclassed constraint of '<em>Capsule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapsule_Acapsuleclasscanalwaysbesubclassed(Capsule capsule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return capsule.Acapsuleclasscanalwaysbesubclassed(diagnostics, context);
	}

	/**
	 * Validates the Acapsulecanhaveatmostonesuperclass constraint of '<em>Capsule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapsule_Acapsulecanhaveatmostonesuperclass(Capsule capsule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return capsule.Acapsulecanhaveatmostonesuperclass(diagnostics, context);
	}

	/**
	 * Validates the Capsuleclassesarealwayssubstitutable constraint of '<em>Capsule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapsule_Capsuleclassesarealwayssubstitutable(Capsule capsule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return capsule.Capsuleclassesarealwayssubstitutable(diagnostics, context);
	}

	/**
	 * Validates the Allattributesofacapsuleclasshaveexactlyonetype constraint of '<em>Capsule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapsule_Allattributesofacapsuleclasshaveexactlyonetype(Capsule capsule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return capsule.Allattributesofacapsuleclasshaveexactlyonetype(diagnostics, context);
	}

	/**
	 * Validates the Privatevisibilityisnotsupportedoncapsulefeatures constraint of '<em>Capsule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapsule_Privatevisibilityisnotsupportedoncapsulefeatures(Capsule capsule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return capsule.Privatevisibilityisnotsupportedoncapsulefeatures(diagnostics, context);
	}

	/**
	 * Validates the Acapsuleclasscannothavenestedclassifiers constraint of '<em>Capsule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapsule_Acapsuleclasscannothavenestedclassifiers(Capsule capsule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return capsule.Acapsuleclasscannothavenestedclassifiers(diagnostics, context);
	}

	/**
	 * Validates the Alloperationsofacapsulearesequential constraint of '<em>Capsule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapsule_Alloperationsofacapsulearesequential(Capsule capsule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return capsule.Alloperationsofacapsulearesequential(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapsulePart(CapsulePart capsulePart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capsulePart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocol(Protocol protocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protocol, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocol_Protocolscanhaveatmostonegeneralization(protocol, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Protocolscanhaveatmostonegeneralization constraint of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocol_Protocolscanhaveatmostonegeneralization(Protocol protocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protocol.Protocolscanhaveatmostonegeneralization(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTPort(RTPort rtPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rtPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rtPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rtPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rtPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rtPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rtPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rtPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rtPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rtPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTPort_Awiredportcannotpublishitsname(rtPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTPort_Apublicportmustbedefinedasaserviceport(rtPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTPort_ASAPunwiredunpublishedmusthaveprotectedvisibility(rtPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTPort_AnSPPunwiredandpublishedmusthavepublicvisibility(rtPort, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Awiredportcannotpublishitsname constraint of '<em>RT Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTPort_Awiredportcannotpublishitsname(RTPort rtPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtPort.Awiredportcannotpublishitsname(diagnostics, context);
	}

	/**
	 * Validates the Apublicportmustbedefinedasaserviceport constraint of '<em>RT Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTPort_Apublicportmustbedefinedasaserviceport(RTPort rtPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtPort.Apublicportmustbedefinedasaserviceport(diagnostics, context);
	}

	/**
	 * Validates the ASAPunwiredunpublishedmusthaveprotectedvisibility constraint of '<em>RT Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTPort_ASAPunwiredunpublishedmusthaveprotectedvisibility(RTPort rtPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtPort.ASAPunwiredunpublishedmusthaveprotectedvisibility(diagnostics, context);
	}

	/**
	 * Validates the AnSPPunwiredandpublishedmusthavepublicvisibility constraint of '<em>RT Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTPort_AnSPPunwiredandpublishedmusthavepublicvisibility(RTPort rtPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtPort.AnSPPunwiredandpublishedmusthavepublicvisibility(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTConnector(RTConnector rtConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rtConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rtConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rtConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rtConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rtConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rtConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rtConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rtConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rtConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTConnector_Onlybinaryconnectorsareallowed(rtConnector, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Onlybinaryconnectorsareallowed constraint of '<em>RT Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTConnector_Onlybinaryconnectorsareallowed(RTConnector rtConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtConnector.Onlybinaryconnectorsareallowed(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolContainer(ProtocolContainer protocolContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTRExcludedElement(RTRExcludedElement rtrExcludedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rtrExcludedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rtrExcludedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rtrExcludedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rtrExcludedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rtrExcludedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rtrExcludedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rtrExcludedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rtrExcludedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rtrExcludedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTRExcludedElement_ExclusioncanonlybeappliedtosomeUMLRTmodelelements(rtrExcludedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ExclusioncanonlybeappliedtosomeUMLRTmodelelements constraint of '<em>RTR Excluded Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTRExcludedElement_ExclusioncanonlybeappliedtosomeUMLRTmodelelements(RTRExcludedElement rtrExcludedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtrExcludedElement.ExclusioncanonlybeappliedtosomeUMLRTmodelelements(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTMessageSet(RTMessageSet rtMessageSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rtMessageSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortRegistrationType(PortRegistrationType portRegistrationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTMessageKind(RTMessageKind rtMessageKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //UMLRealTimeValidator
