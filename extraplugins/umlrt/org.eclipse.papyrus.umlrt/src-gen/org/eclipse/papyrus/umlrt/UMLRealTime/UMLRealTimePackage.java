/**
 * Copyright (c) 2014 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.umlrt.UMLRealTime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimeFactory
 * @model kind="package"
 * @generated
 */
public interface UMLRealTimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UMLRealTime"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///UMLRealTime.ecore"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UMLRealTime"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UMLRealTimePackage eINSTANCE = org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.CapsuleImpl <em>Capsule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.CapsuleImpl
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getCapsule()
	 * @generated
	 */
	int CAPSULE = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Capsule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Capsulesarealwaysactive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE___CAPSULESAREALWAYSACTIVE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Acapsulecannothave Receptionfeatures</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE___ACAPSULECANNOTHAVE_RECEPTIONFEATURES__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Acapsuleclasscanalwaysbesubclassed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE___ACAPSULECLASSCANALWAYSBESUBCLASSED__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Acapsulecanhaveatmostonesuperclass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE___ACAPSULECANHAVEATMOSTONESUPERCLASS__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Capsuleclassesarealwayssubstitutable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE___CAPSULECLASSESAREALWAYSSUBSTITUTABLE__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Allattributesofacapsuleclasshaveexactlyonetype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE___ALLATTRIBUTESOFACAPSULECLASSHAVEEXACTLYONETYPE__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>Privatevisibilityisnotsupportedoncapsulefeatures</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE___PRIVATEVISIBILITYISNOTSUPPORTEDONCAPSULEFEATURES__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The operation id for the '<em>Acapsuleclasscannothavenestedclassifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE___ACAPSULECLASSCANNOTHAVENESTEDCLASSIFIERS__DIAGNOSTICCHAIN_MAP = 7;

	/**
	 * The operation id for the '<em>Alloperationsofacapsulearesequential</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE___ALLOPERATIONSOFACAPSULEARESEQUENTIAL__DIAGNOSTICCHAIN_MAP = 8;

	/**
	 * The number of operations of the '<em>Capsule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.CapsulePartImpl <em>Capsule Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.CapsulePartImpl
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getCapsulePart()
	 * @generated
	 */
	int CAPSULE_PART = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE_PART__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Capsule Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE_PART_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capsule Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.ProtocolImpl
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 2;

	/**
	 * The feature id for the '<em><b>Base Collaboration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__BASE_COLLABORATION = 0;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Protocolscanhaveatmostonegeneralization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL___PROTOCOLSCANHAVEATMOSTONEGENERALIZATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTPortImpl <em>RT Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTPortImpl
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getRTPort()
	 * @generated
	 */
	int RT_PORT = 3;

	/**
	 * The feature id for the '<em><b>Is Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PORT__IS_NOTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Is Publish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PORT__IS_PUBLISH = 1;

	/**
	 * The feature id for the '<em><b>Is Wired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PORT__IS_WIRED = 2;

	/**
	 * The feature id for the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PORT__REGISTRATION = 3;

	/**
	 * The feature id for the '<em><b>Registration Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PORT__REGISTRATION_OVERRIDE = 4;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PORT__BASE_PORT = 5;

	/**
	 * The number of structural features of the '<em>RT Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PORT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Awiredportcannotpublishitsname</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PORT___AWIREDPORTCANNOTPUBLISHITSNAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Apublicportmustbedefinedasaserviceport</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PORT___APUBLICPORTMUSTBEDEFINEDASASERVICEPORT__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>ASA Punwiredunpublishedmusthaveprotectedvisibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PORT___ASA_PUNWIREDUNPUBLISHEDMUSTHAVEPROTECTEDVISIBILITY__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>An SP Punwiredandpublishedmusthavepublicvisibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PORT___AN_SP_PUNWIREDANDPUBLISHEDMUSTHAVEPUBLICVISIBILITY__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>RT Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PORT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTConnectorImpl <em>RT Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTConnectorImpl
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getRTConnector()
	 * @generated
	 */
	int RT_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_CONNECTOR__BASE_CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>RT Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Onlybinaryconnectorsareallowed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_CONNECTOR___ONLYBINARYCONNECTORSAREALLOWED__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>RT Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_CONNECTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.ProtocolContainerImpl <em>Protocol Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.ProtocolContainerImpl
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getProtocolContainer()
	 * @generated
	 */
	int PROTOCOL_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONTAINER__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Protocol Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Protocol Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTRExcludedElementImpl <em>RTR Excluded Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTRExcludedElementImpl
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getRTRExcludedElement()
	 * @generated
	 */
	int RTR_EXCLUDED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Base Redefinable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTR_EXCLUDED_ELEMENT__BASE_REDEFINABLE_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>RTR Excluded Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTR_EXCLUDED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Exclusioncanonlybeappliedtosome UMLR Tmodelelements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTR_EXCLUDED_ELEMENT___EXCLUSIONCANONLYBEAPPLIEDTOSOME_UMLR_TMODELELEMENTS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>RTR Excluded Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTR_EXCLUDED_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTMessageSetImpl <em>RT Message Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTMessageSetImpl
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getRTMessageSet()
	 * @generated
	 */
	int RT_MESSAGE_SET = 7;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_MESSAGE_SET__BASE_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Rt Msg Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_MESSAGE_SET__RT_MSG_KIND = 1;

	/**
	 * The number of structural features of the '<em>RT Message Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_MESSAGE_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RT Message Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_MESSAGE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.PortRegistrationType <em>Port Registration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.PortRegistrationType
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getPortRegistrationType()
	 * @generated
	 */
	int PORT_REGISTRATION_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageKind <em>RT Message Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageKind
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getRTMessageKind()
	 * @generated
	 */
	int RT_MESSAGE_KIND = 9;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Capsule <em>Capsule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capsule</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Capsule
	 * @generated
	 */
	EClass getCapsule();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#getBase_Class()
	 * @see #getCapsule()
	 * @generated
	 */
	EReference getCapsule_Base_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Capsulesarealwaysactive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Capsulesarealwaysactive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Capsulesarealwaysactive</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Capsulesarealwaysactive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCapsule__Capsulesarealwaysactive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#AcapsulecannothaveReceptionfeatures(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Acapsulecannothave Receptionfeatures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acapsulecannothave Receptionfeatures</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#AcapsulecannothaveReceptionfeatures(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCapsule__AcapsulecannothaveReceptionfeatures__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Acapsuleclasscanalwaysbesubclassed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Acapsuleclasscanalwaysbesubclassed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acapsuleclasscanalwaysbesubclassed</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Acapsuleclasscanalwaysbesubclassed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCapsule__Acapsuleclasscanalwaysbesubclassed__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Acapsulecanhaveatmostonesuperclass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Acapsulecanhaveatmostonesuperclass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acapsulecanhaveatmostonesuperclass</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Acapsulecanhaveatmostonesuperclass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCapsule__Acapsulecanhaveatmostonesuperclass__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Capsuleclassesarealwayssubstitutable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Capsuleclassesarealwayssubstitutable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Capsuleclassesarealwayssubstitutable</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Capsuleclassesarealwayssubstitutable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCapsule__Capsuleclassesarealwayssubstitutable__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Allattributesofacapsuleclasshaveexactlyonetype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Allattributesofacapsuleclasshaveexactlyonetype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Allattributesofacapsuleclasshaveexactlyonetype</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Allattributesofacapsuleclasshaveexactlyonetype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCapsule__Allattributesofacapsuleclasshaveexactlyonetype__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Privatevisibilityisnotsupportedoncapsulefeatures(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Privatevisibilityisnotsupportedoncapsulefeatures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Privatevisibilityisnotsupportedoncapsulefeatures</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Privatevisibilityisnotsupportedoncapsulefeatures(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCapsule__Privatevisibilityisnotsupportedoncapsulefeatures__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Acapsuleclasscannothavenestedclassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Acapsuleclasscannothavenestedclassifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acapsuleclasscannothavenestedclassifiers</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Acapsuleclasscannothavenestedclassifiers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCapsule__Acapsuleclasscannothavenestedclassifiers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Alloperationsofacapsulearesequential(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Alloperationsofacapsulearesequential</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Alloperationsofacapsulearesequential</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Capsule#Alloperationsofacapsulearesequential(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCapsule__Alloperationsofacapsulearesequential__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.UMLRealTime.CapsulePart <em>Capsule Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capsule Part</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.CapsulePart
	 * @generated
	 */
	EClass getCapsulePart();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.UMLRealTime.CapsulePart#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.CapsulePart#getBase_Property()
	 * @see #getCapsulePart()
	 * @generated
	 */
	EReference getCapsulePart_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Protocol#getBase_Collaboration <em>Base Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Collaboration</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Protocol#getBase_Collaboration()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Base_Collaboration();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.Protocol#Protocolscanhaveatmostonegeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Protocolscanhaveatmostonegeneralization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Protocolscanhaveatmostonegeneralization</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.Protocol#Protocolscanhaveatmostonegeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProtocol__Protocolscanhaveatmostonegeneralization__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort <em>RT Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Port</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTPort
	 * @generated
	 */
	EClass getRTPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#isNotification <em>Is Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Notification</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#isNotification()
	 * @see #getRTPort()
	 * @generated
	 */
	EAttribute getRTPort_IsNotification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#isPublish <em>Is Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Publish</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#isPublish()
	 * @see #getRTPort()
	 * @generated
	 */
	EAttribute getRTPort_IsPublish();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#isWired <em>Is Wired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Wired</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#isWired()
	 * @see #getRTPort()
	 * @generated
	 */
	EAttribute getRTPort_IsWired();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#getRegistration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#getRegistration()
	 * @see #getRTPort()
	 * @generated
	 */
	EAttribute getRTPort_Registration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#getRegistrationOverride <em>Registration Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Override</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#getRegistrationOverride()
	 * @see #getRTPort()
	 * @generated
	 */
	EAttribute getRTPort_RegistrationOverride();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#getBase_Port()
	 * @see #getRTPort()
	 * @generated
	 */
	EReference getRTPort_Base_Port();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#Awiredportcannotpublishitsname(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Awiredportcannotpublishitsname</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Awiredportcannotpublishitsname</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#Awiredportcannotpublishitsname(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTPort__Awiredportcannotpublishitsname__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#Apublicportmustbedefinedasaserviceport(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Apublicportmustbedefinedasaserviceport</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apublicportmustbedefinedasaserviceport</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#Apublicportmustbedefinedasaserviceport(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTPort__Apublicportmustbedefinedasaserviceport__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#ASAPunwiredunpublishedmusthaveprotectedvisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>ASA Punwiredunpublishedmusthaveprotectedvisibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>ASA Punwiredunpublishedmusthaveprotectedvisibility</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#ASAPunwiredunpublishedmusthaveprotectedvisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTPort__ASAPunwiredunpublishedmusthaveprotectedvisibility__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#AnSPPunwiredandpublishedmusthavepublicvisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>An SP Punwiredandpublishedmusthavepublicvisibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>An SP Punwiredandpublishedmusthavepublicvisibility</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#AnSPPunwiredandpublishedmusthavepublicvisibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTPort__AnSPPunwiredandpublishedmusthavepublicvisibility__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTConnector <em>RT Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Connector</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTConnector
	 * @generated
	 */
	EClass getRTConnector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTConnector#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTConnector#getBase_Connector()
	 * @see #getRTConnector()
	 * @generated
	 */
	EReference getRTConnector_Base_Connector();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTConnector#Onlybinaryconnectorsareallowed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Onlybinaryconnectorsareallowed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Onlybinaryconnectorsareallowed</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTConnector#Onlybinaryconnectorsareallowed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTConnector__Onlybinaryconnectorsareallowed__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.UMLRealTime.ProtocolContainer <em>Protocol Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Container</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.ProtocolContainer
	 * @generated
	 */
	EClass getProtocolContainer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.UMLRealTime.ProtocolContainer#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.ProtocolContainer#getBase_Package()
	 * @see #getProtocolContainer()
	 * @generated
	 */
	EReference getProtocolContainer_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTRExcludedElement <em>RTR Excluded Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTR Excluded Element</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTRExcludedElement
	 * @generated
	 */
	EClass getRTRExcludedElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTRExcludedElement#getBase_RedefinableElement <em>Base Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Redefinable Element</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTRExcludedElement#getBase_RedefinableElement()
	 * @see #getRTRExcludedElement()
	 * @generated
	 */
	EReference getRTRExcludedElement_Base_RedefinableElement();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTRExcludedElement#ExclusioncanonlybeappliedtosomeUMLRTmodelelements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exclusioncanonlybeappliedtosome UMLR Tmodelelements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exclusioncanonlybeappliedtosome UMLR Tmodelelements</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTRExcludedElement#ExclusioncanonlybeappliedtosomeUMLRTmodelelements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTRExcludedElement__ExclusioncanonlybeappliedtosomeUMLRTmodelelements__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageSet <em>RT Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Message Set</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageSet
	 * @generated
	 */
	EClass getRTMessageSet();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageSet#getBase_Interface <em>Base Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interface</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageSet#getBase_Interface()
	 * @see #getRTMessageSet()
	 * @generated
	 */
	EReference getRTMessageSet_Base_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageSet#getRtMsgKind <em>Rt Msg Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rt Msg Kind</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageSet#getRtMsgKind()
	 * @see #getRTMessageSet()
	 * @generated
	 */
	EAttribute getRTMessageSet_RtMsgKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.umlrt.UMLRealTime.PortRegistrationType <em>Port Registration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Registration Type</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.PortRegistrationType
	 * @generated
	 */
	EEnum getPortRegistrationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageKind <em>RT Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RT Message Kind</em>'.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageKind
	 * @generated
	 */
	EEnum getRTMessageKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UMLRealTimeFactory getUMLRealTimeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.CapsuleImpl <em>Capsule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.CapsuleImpl
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getCapsule()
		 * @generated
		 */
		EClass CAPSULE = eINSTANCE.getCapsule();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPSULE__BASE_CLASS = eINSTANCE.getCapsule_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Capsulesarealwaysactive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPSULE___CAPSULESAREALWAYSACTIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCapsule__Capsulesarealwaysactive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Acapsulecannothave Receptionfeatures</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPSULE___ACAPSULECANNOTHAVE_RECEPTIONFEATURES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCapsule__AcapsulecannothaveReceptionfeatures__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Acapsuleclasscanalwaysbesubclassed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPSULE___ACAPSULECLASSCANALWAYSBESUBCLASSED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCapsule__Acapsuleclasscanalwaysbesubclassed__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Acapsulecanhaveatmostonesuperclass</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPSULE___ACAPSULECANHAVEATMOSTONESUPERCLASS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCapsule__Acapsulecanhaveatmostonesuperclass__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Capsuleclassesarealwayssubstitutable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPSULE___CAPSULECLASSESAREALWAYSSUBSTITUTABLE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCapsule__Capsuleclassesarealwayssubstitutable__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Allattributesofacapsuleclasshaveexactlyonetype</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPSULE___ALLATTRIBUTESOFACAPSULECLASSHAVEEXACTLYONETYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCapsule__Allattributesofacapsuleclasshaveexactlyonetype__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Privatevisibilityisnotsupportedoncapsulefeatures</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPSULE___PRIVATEVISIBILITYISNOTSUPPORTEDONCAPSULEFEATURES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCapsule__Privatevisibilityisnotsupportedoncapsulefeatures__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Acapsuleclasscannothavenestedclassifiers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPSULE___ACAPSULECLASSCANNOTHAVENESTEDCLASSIFIERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCapsule__Acapsuleclasscannothavenestedclassifiers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Alloperationsofacapsulearesequential</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPSULE___ALLOPERATIONSOFACAPSULEARESEQUENTIAL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCapsule__Alloperationsofacapsulearesequential__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.CapsulePartImpl <em>Capsule Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.CapsulePartImpl
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getCapsulePart()
		 * @generated
		 */
		EClass CAPSULE_PART = eINSTANCE.getCapsulePart();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPSULE_PART__BASE_PROPERTY = eINSTANCE.getCapsulePart_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.ProtocolImpl
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Base Collaboration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__BASE_COLLABORATION = eINSTANCE.getProtocol_Base_Collaboration();

		/**
		 * The meta object literal for the '<em><b>Protocolscanhaveatmostonegeneralization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROTOCOL___PROTOCOLSCANHAVEATMOSTONEGENERALIZATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProtocol__Protocolscanhaveatmostonegeneralization__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTPortImpl <em>RT Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTPortImpl
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getRTPort()
		 * @generated
		 */
		EClass RT_PORT = eINSTANCE.getRTPort();

		/**
		 * The meta object literal for the '<em><b>Is Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_PORT__IS_NOTIFICATION = eINSTANCE.getRTPort_IsNotification();

		/**
		 * The meta object literal for the '<em><b>Is Publish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_PORT__IS_PUBLISH = eINSTANCE.getRTPort_IsPublish();

		/**
		 * The meta object literal for the '<em><b>Is Wired</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_PORT__IS_WIRED = eINSTANCE.getRTPort_IsWired();

		/**
		 * The meta object literal for the '<em><b>Registration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_PORT__REGISTRATION = eINSTANCE.getRTPort_Registration();

		/**
		 * The meta object literal for the '<em><b>Registration Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_PORT__REGISTRATION_OVERRIDE = eINSTANCE.getRTPort_RegistrationOverride();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_PORT__BASE_PORT = eINSTANCE.getRTPort_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Awiredportcannotpublishitsname</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_PORT___AWIREDPORTCANNOTPUBLISHITSNAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTPort__Awiredportcannotpublishitsname__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Apublicportmustbedefinedasaserviceport</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_PORT___APUBLICPORTMUSTBEDEFINEDASASERVICEPORT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTPort__Apublicportmustbedefinedasaserviceport__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>ASA Punwiredunpublishedmusthaveprotectedvisibility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_PORT___ASA_PUNWIREDUNPUBLISHEDMUSTHAVEPROTECTEDVISIBILITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTPort__ASAPunwiredunpublishedmusthaveprotectedvisibility__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>An SP Punwiredandpublishedmusthavepublicvisibility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_PORT___AN_SP_PUNWIREDANDPUBLISHEDMUSTHAVEPUBLICVISIBILITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTPort__AnSPPunwiredandpublishedmusthavepublicvisibility__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTConnectorImpl <em>RT Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTConnectorImpl
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getRTConnector()
		 * @generated
		 */
		EClass RT_CONNECTOR = eINSTANCE.getRTConnector();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_CONNECTOR__BASE_CONNECTOR = eINSTANCE.getRTConnector_Base_Connector();

		/**
		 * The meta object literal for the '<em><b>Onlybinaryconnectorsareallowed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_CONNECTOR___ONLYBINARYCONNECTORSAREALLOWED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTConnector__Onlybinaryconnectorsareallowed__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.ProtocolContainerImpl <em>Protocol Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.ProtocolContainerImpl
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getProtocolContainer()
		 * @generated
		 */
		EClass PROTOCOL_CONTAINER = eINSTANCE.getProtocolContainer();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_CONTAINER__BASE_PACKAGE = eINSTANCE.getProtocolContainer_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTRExcludedElementImpl <em>RTR Excluded Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTRExcludedElementImpl
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getRTRExcludedElement()
		 * @generated
		 */
		EClass RTR_EXCLUDED_ELEMENT = eINSTANCE.getRTRExcludedElement();

		/**
		 * The meta object literal for the '<em><b>Base Redefinable Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTR_EXCLUDED_ELEMENT__BASE_REDEFINABLE_ELEMENT = eINSTANCE.getRTRExcludedElement_Base_RedefinableElement();

		/**
		 * The meta object literal for the '<em><b>Exclusioncanonlybeappliedtosome UMLR Tmodelelements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTR_EXCLUDED_ELEMENT___EXCLUSIONCANONLYBEAPPLIEDTOSOME_UMLR_TMODELELEMENTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTRExcludedElement__ExclusioncanonlybeappliedtosomeUMLRTmodelelements__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTMessageSetImpl <em>RT Message Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.RTMessageSetImpl
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getRTMessageSet()
		 * @generated
		 */
		EClass RT_MESSAGE_SET = eINSTANCE.getRTMessageSet();

		/**
		 * The meta object literal for the '<em><b>Base Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_MESSAGE_SET__BASE_INTERFACE = eINSTANCE.getRTMessageSet_Base_Interface();

		/**
		 * The meta object literal for the '<em><b>Rt Msg Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_MESSAGE_SET__RT_MSG_KIND = eINSTANCE.getRTMessageSet_RtMsgKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.PortRegistrationType <em>Port Registration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.PortRegistrationType
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getPortRegistrationType()
		 * @generated
		 */
		EEnum PORT_REGISTRATION_TYPE = eINSTANCE.getPortRegistrationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageKind <em>RT Message Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageKind
		 * @see org.eclipse.papyrus.umlrt.UMLRealTime.impl.UMLRealTimePackageImpl#getRTMessageKind()
		 * @generated
		 */
		EEnum RT_MESSAGE_KIND = eINSTANCE.getRTMessageKind();

	}

} //UMLRealTimePackage
