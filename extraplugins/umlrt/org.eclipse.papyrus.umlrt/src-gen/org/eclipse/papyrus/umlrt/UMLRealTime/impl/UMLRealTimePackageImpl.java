/**
 * Copyright (c) 2014 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.umlrt.UMLRealTime.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.umlrt.UMLRealTime.Capsule;
import org.eclipse.papyrus.umlrt.UMLRealTime.CapsulePart;
import org.eclipse.papyrus.umlrt.UMLRealTime.PortRegistrationType;
import org.eclipse.papyrus.umlrt.UMLRealTime.Protocol;
import org.eclipse.papyrus.umlrt.UMLRealTime.ProtocolContainer;
import org.eclipse.papyrus.umlrt.UMLRealTime.RTConnector;
import org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageKind;
import org.eclipse.papyrus.umlrt.UMLRealTime.RTMessageSet;
import org.eclipse.papyrus.umlrt.UMLRealTime.RTPort;
import org.eclipse.papyrus.umlrt.UMLRealTime.RTRExcludedElement;
import org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimeFactory;
import org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage;

import org.eclipse.papyrus.umlrt.UMLRealTime.util.UMLRealTimeValidator;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLRealTimePackageImpl extends EPackageImpl implements UMLRealTimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capsuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capsulePartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtrExcludedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtMessageSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portRegistrationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rtMessageKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UMLRealTimePackageImpl() {
		super(eNS_URI, UMLRealTimeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UMLRealTimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UMLRealTimePackage init() {
		if (isInited) return (UMLRealTimePackage)EPackage.Registry.INSTANCE.getEPackage(UMLRealTimePackage.eNS_URI);

		// Obtain or create and register package
		UMLRealTimePackageImpl theUMLRealTimePackage = (UMLRealTimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UMLRealTimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UMLRealTimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUMLRealTimePackage.createPackageContents();

		// Initialize created meta-data
		theUMLRealTimePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theUMLRealTimePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return UMLRealTimeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theUMLRealTimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UMLRealTimePackage.eNS_URI, theUMLRealTimePackage);
		return theUMLRealTimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapsule() {
		return capsuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapsule_Base_Class() {
		return (EReference)capsuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCapsule__Capsulesarealwaysactive__DiagnosticChain_Map() {
		return capsuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCapsule__AcapsulecannothaveReceptionfeatures__DiagnosticChain_Map() {
		return capsuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCapsule__Acapsuleclasscanalwaysbesubclassed__DiagnosticChain_Map() {
		return capsuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCapsule__Acapsulecanhaveatmostonesuperclass__DiagnosticChain_Map() {
		return capsuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCapsule__Capsuleclassesarealwayssubstitutable__DiagnosticChain_Map() {
		return capsuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCapsule__Allattributesofacapsuleclasshaveexactlyonetype__DiagnosticChain_Map() {
		return capsuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCapsule__Privatevisibilityisnotsupportedoncapsulefeatures__DiagnosticChain_Map() {
		return capsuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCapsule__Acapsuleclasscannothavenestedclassifiers__DiagnosticChain_Map() {
		return capsuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCapsule__Alloperationsofacapsulearesequential__DiagnosticChain_Map() {
		return capsuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapsulePart() {
		return capsulePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapsulePart_Base_Property() {
		return (EReference)capsulePartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocol() {
		return protocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocol_Base_Collaboration() {
		return (EReference)protocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProtocol__Protocolscanhaveatmostonegeneralization__DiagnosticChain_Map() {
		return protocolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTPort() {
		return rtPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTPort_IsNotification() {
		return (EAttribute)rtPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTPort_IsPublish() {
		return (EAttribute)rtPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTPort_IsWired() {
		return (EAttribute)rtPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTPort_Registration() {
		return (EAttribute)rtPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTPort_RegistrationOverride() {
		return (EAttribute)rtPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTPort_Base_Port() {
		return (EReference)rtPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTPort__Awiredportcannotpublishitsname__DiagnosticChain_Map() {
		return rtPortEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTPort__Apublicportmustbedefinedasaserviceport__DiagnosticChain_Map() {
		return rtPortEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTPort__ASAPunwiredunpublishedmusthaveprotectedvisibility__DiagnosticChain_Map() {
		return rtPortEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTPort__AnSPPunwiredandpublishedmusthavepublicvisibility__DiagnosticChain_Map() {
		return rtPortEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTConnector() {
		return rtConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTConnector_Base_Connector() {
		return (EReference)rtConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTConnector__Onlybinaryconnectorsareallowed__DiagnosticChain_Map() {
		return rtConnectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolContainer() {
		return protocolContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolContainer_Base_Package() {
		return (EReference)protocolContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTRExcludedElement() {
		return rtrExcludedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTRExcludedElement_Base_RedefinableElement() {
		return (EReference)rtrExcludedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTRExcludedElement__ExclusioncanonlybeappliedtosomeUMLRTmodelelements__DiagnosticChain_Map() {
		return rtrExcludedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTMessageSet() {
		return rtMessageSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTMessageSet_Base_Interface() {
		return (EReference)rtMessageSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTMessageSet_RtMsgKind() {
		return (EAttribute)rtMessageSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortRegistrationType() {
		return portRegistrationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRTMessageKind() {
		return rtMessageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealTimeFactory getUMLRealTimeFactory() {
		return (UMLRealTimeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		capsuleEClass = createEClass(CAPSULE);
		createEReference(capsuleEClass, CAPSULE__BASE_CLASS);
		createEOperation(capsuleEClass, CAPSULE___CAPSULESAREALWAYSACTIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(capsuleEClass, CAPSULE___ACAPSULECANNOTHAVE_RECEPTIONFEATURES__DIAGNOSTICCHAIN_MAP);
		createEOperation(capsuleEClass, CAPSULE___ACAPSULECLASSCANALWAYSBESUBCLASSED__DIAGNOSTICCHAIN_MAP);
		createEOperation(capsuleEClass, CAPSULE___ACAPSULECANHAVEATMOSTONESUPERCLASS__DIAGNOSTICCHAIN_MAP);
		createEOperation(capsuleEClass, CAPSULE___CAPSULECLASSESAREALWAYSSUBSTITUTABLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(capsuleEClass, CAPSULE___ALLATTRIBUTESOFACAPSULECLASSHAVEEXACTLYONETYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(capsuleEClass, CAPSULE___PRIVATEVISIBILITYISNOTSUPPORTEDONCAPSULEFEATURES__DIAGNOSTICCHAIN_MAP);
		createEOperation(capsuleEClass, CAPSULE___ACAPSULECLASSCANNOTHAVENESTEDCLASSIFIERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(capsuleEClass, CAPSULE___ALLOPERATIONSOFACAPSULEARESEQUENTIAL__DIAGNOSTICCHAIN_MAP);

		capsulePartEClass = createEClass(CAPSULE_PART);
		createEReference(capsulePartEClass, CAPSULE_PART__BASE_PROPERTY);

		protocolEClass = createEClass(PROTOCOL);
		createEReference(protocolEClass, PROTOCOL__BASE_COLLABORATION);
		createEOperation(protocolEClass, PROTOCOL___PROTOCOLSCANHAVEATMOSTONEGENERALIZATION__DIAGNOSTICCHAIN_MAP);

		rtPortEClass = createEClass(RT_PORT);
		createEAttribute(rtPortEClass, RT_PORT__IS_NOTIFICATION);
		createEAttribute(rtPortEClass, RT_PORT__IS_PUBLISH);
		createEAttribute(rtPortEClass, RT_PORT__IS_WIRED);
		createEAttribute(rtPortEClass, RT_PORT__REGISTRATION);
		createEAttribute(rtPortEClass, RT_PORT__REGISTRATION_OVERRIDE);
		createEReference(rtPortEClass, RT_PORT__BASE_PORT);
		createEOperation(rtPortEClass, RT_PORT___AWIREDPORTCANNOTPUBLISHITSNAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(rtPortEClass, RT_PORT___APUBLICPORTMUSTBEDEFINEDASASERVICEPORT__DIAGNOSTICCHAIN_MAP);
		createEOperation(rtPortEClass, RT_PORT___ASA_PUNWIREDUNPUBLISHEDMUSTHAVEPROTECTEDVISIBILITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(rtPortEClass, RT_PORT___AN_SP_PUNWIREDANDPUBLISHEDMUSTHAVEPUBLICVISIBILITY__DIAGNOSTICCHAIN_MAP);

		rtConnectorEClass = createEClass(RT_CONNECTOR);
		createEReference(rtConnectorEClass, RT_CONNECTOR__BASE_CONNECTOR);
		createEOperation(rtConnectorEClass, RT_CONNECTOR___ONLYBINARYCONNECTORSAREALLOWED__DIAGNOSTICCHAIN_MAP);

		protocolContainerEClass = createEClass(PROTOCOL_CONTAINER);
		createEReference(protocolContainerEClass, PROTOCOL_CONTAINER__BASE_PACKAGE);

		rtrExcludedElementEClass = createEClass(RTR_EXCLUDED_ELEMENT);
		createEReference(rtrExcludedElementEClass, RTR_EXCLUDED_ELEMENT__BASE_REDEFINABLE_ELEMENT);
		createEOperation(rtrExcludedElementEClass, RTR_EXCLUDED_ELEMENT___EXCLUSIONCANONLYBEAPPLIEDTOSOME_UMLR_TMODELELEMENTS__DIAGNOSTICCHAIN_MAP);

		rtMessageSetEClass = createEClass(RT_MESSAGE_SET);
		createEReference(rtMessageSetEClass, RT_MESSAGE_SET__BASE_INTERFACE);
		createEAttribute(rtMessageSetEClass, RT_MESSAGE_SET__RT_MSG_KIND);

		// Create enums
		portRegistrationTypeEEnum = createEEnum(PORT_REGISTRATION_TYPE);
		rtMessageKindEEnum = createEEnum(RT_MESSAGE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(capsuleEClass, Capsule.class, "Capsule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCapsule_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Capsule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getCapsule__Capsulesarealwaysactive__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Capsulesarealwaysactive", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getCapsule__AcapsulecannothaveReceptionfeatures__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "AcapsulecannothaveReceptionfeatures", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getCapsule__Acapsuleclasscanalwaysbesubclassed__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Acapsuleclasscanalwaysbesubclassed", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getCapsule__Acapsulecanhaveatmostonesuperclass__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Acapsulecanhaveatmostonesuperclass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getCapsule__Capsuleclassesarealwayssubstitutable__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Capsuleclassesarealwayssubstitutable", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getCapsule__Allattributesofacapsuleclasshaveexactlyonetype__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Allattributesofacapsuleclasshaveexactlyonetype", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getCapsule__Privatevisibilityisnotsupportedoncapsulefeatures__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Privatevisibilityisnotsupportedoncapsulefeatures", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getCapsule__Acapsuleclasscannothavenestedclassifiers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Acapsuleclasscannothavenestedclassifiers", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getCapsule__Alloperationsofacapsulearesequential__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Alloperationsofacapsulearesequential", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(capsulePartEClass, CapsulePart.class, "CapsulePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCapsulePart_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, CapsulePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProtocol_Base_Collaboration(), theUMLPackage.getCollaboration(), null, "base_Collaboration", null, 1, 1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getProtocol__Protocolscanhaveatmostonegeneralization__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Protocolscanhaveatmostonegeneralization", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(rtPortEClass, RTPort.class, "RTPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRTPort_IsNotification(), theTypesPackage.getBoolean(), "isNotification", "false", 1, 1, RTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRTPort_IsPublish(), theTypesPackage.getBoolean(), "isPublish", "false", 1, 1, RTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRTPort_IsWired(), theTypesPackage.getBoolean(), "isWired", "true", 1, 1, RTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRTPort_Registration(), this.getPortRegistrationType(), "registration", null, 0, 1, RTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRTPort_RegistrationOverride(), theTypesPackage.getString(), "registrationOverride", "", 1, 1, RTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getRTPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, RTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTPort__Awiredportcannotpublishitsname__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Awiredportcannotpublishitsname", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTPort__Apublicportmustbedefinedasaserviceport__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Apublicportmustbedefinedasaserviceport", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTPort__ASAPunwiredunpublishedmusthaveprotectedvisibility__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ASAPunwiredunpublishedmusthaveprotectedvisibility", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTPort__AnSPPunwiredandpublishedmusthavepublicvisibility__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "AnSPPunwiredandpublishedmusthavepublicvisibility", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(rtConnectorEClass, RTConnector.class, "RTConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRTConnector_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 1, 1, RTConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTConnector__Onlybinaryconnectorsareallowed__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Onlybinaryconnectorsareallowed", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(protocolContainerEClass, ProtocolContainer.class, "ProtocolContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProtocolContainer_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, ProtocolContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(rtrExcludedElementEClass, RTRExcludedElement.class, "RTRExcludedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRTRExcludedElement_Base_RedefinableElement(), theUMLPackage.getRedefinableElement(), null, "base_RedefinableElement", null, 1, 1, RTRExcludedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTRExcludedElement__ExclusioncanonlybeappliedtosomeUMLRTmodelelements__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ExclusioncanonlybeappliedtosomeUMLRTmodelelements", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(rtMessageSetEClass, RTMessageSet.class, "RTMessageSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRTMessageSet_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 1, 1, RTMessageSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRTMessageSet_RtMsgKind(), this.getRTMessageKind(), "rtMsgKind", "true", 1, 1, RTMessageSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		// Initialize enums and add enum literals
		initEEnum(portRegistrationTypeEEnum, PortRegistrationType.class, "PortRegistrationType"); //$NON-NLS-1$
		addEEnumLiteral(portRegistrationTypeEEnum, PortRegistrationType.AUTOMATIC);
		addEEnumLiteral(portRegistrationTypeEEnum, PortRegistrationType.APPLICATION);
		addEEnumLiteral(portRegistrationTypeEEnum, PortRegistrationType.APPLICATION_LOCKED);

		initEEnum(rtMessageKindEEnum, RTMessageKind.class, "RTMessageKind"); //$NON-NLS-1$
		addEEnumLiteral(rtMessageKindEEnum, RTMessageKind.IN);
		addEEnumLiteral(rtMessageKindEEnum, RTMessageKind.OUT);
		addEEnumLiteral(rtMessageKindEEnum, RTMessageKind.IN_OUT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$	
		addAnnotation
		  (getCapsule__Capsulesarealwaysactive__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "Capsules are always active" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getCapsule__AcapsulecannothaveReceptionfeatures__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "A capsule cannot have Reception features" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getCapsule__Acapsuleclasscanalwaysbesubclassed__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "A capsule class can always be subclassed" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getCapsule__Acapsulecanhaveatmostonesuperclass__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "A capsule can have at most one superclass" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getCapsule__Capsuleclassesarealwayssubstitutable__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "Capsule classes are always substitutable" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getCapsule__Allattributesofacapsuleclasshaveexactlyonetype__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "All attributes of a capsule class have exactly one type" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getCapsule__Privatevisibilityisnotsupportedoncapsulefeatures__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "Private visibility is not supported on capsule features" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getCapsule__Acapsuleclasscannothavenestedclassifiers__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "A capsule class cannot have nested classifiers" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getCapsule__Alloperationsofacapsulearesequential__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "All operations of a capsule are sequential" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getProtocol__Protocolscanhaveatmostonegeneralization__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "Protocols can have at most one generalization" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTPort__Awiredportcannotpublishitsname__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "A wired port cannot publish its name" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTPort__Apublicportmustbedefinedasaserviceport__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "A public port must be defined as a service port" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTPort__ASAPunwiredunpublishedmusthaveprotectedvisibility__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "A SAP (unwired & unpublished) must have protected visibility " //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTPort__AnSPPunwiredandpublishedmusthavepublicvisibility__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "An SPP (unwired and published) must have public visibility" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTConnector__Onlybinaryconnectorsareallowed__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "Only binary connectors are allowed" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTRExcludedElement__ExclusioncanonlybeappliedtosomeUMLRTmodelelements__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "Exclusion can only be applied to some UML-RT model elements" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //UMLRealTimePackageImpl
