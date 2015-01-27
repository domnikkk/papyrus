/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.portandflows.internal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml14.activities.ActivitiesPackage;

import org.eclipse.papyrus.sysml14.activities.internal.impl.ActivitiesPackageImpl;

import org.eclipse.papyrus.sysml14.allocations.AllocationsPackage;

import org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocationsPackageImpl;

import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl;

import org.eclipse.papyrus.sysml14.constraintblocks.ConstraintblocksPackage;

import org.eclipse.papyrus.sysml14.constraintblocks.internal.impl.ConstraintblocksPackageImpl;

import org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage;

import org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl;

import org.eclipse.papyrus.sysml14.modelelements.ModelelementsPackage;

import org.eclipse.papyrus.sysml14.modelelements.internal.impl.ModelelementsPackageImpl;

import org.eclipse.papyrus.sysml14.portandflows.AcceptChangeStructuralFeatureEventAction;
import org.eclipse.papyrus.sysml14.portandflows.ChangeStructuralFeatureEvent;
import org.eclipse.papyrus.sysml14.portandflows.DirectedFeature;
import org.eclipse.papyrus.sysml14.portandflows.FeatureDirection;
import org.eclipse.papyrus.sysml14.portandflows.FlowDirection;
import org.eclipse.papyrus.sysml14.portandflows.FlowProperty;
import org.eclipse.papyrus.sysml14.portandflows.FullPort;
import org.eclipse.papyrus.sysml14.portandflows.InterfaceBlock;
import org.eclipse.papyrus.sysml14.portandflows.InvocationOnNestedPortAction;
import org.eclipse.papyrus.sysml14.portandflows.ItemFlow;
import org.eclipse.papyrus.sysml14.portandflows.PortandflowsFactory;
import org.eclipse.papyrus.sysml14.portandflows.PortandflowsPackage;
import org.eclipse.papyrus.sysml14.portandflows.ProxyPort;
import org.eclipse.papyrus.sysml14.portandflows.TriggerOnNestedPort;

import org.eclipse.papyrus.sysml14.requirements.RequirementsPackage;

import org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.profile.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortandflowsPackageImpl extends EPackageImpl implements PortandflowsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptChangeStructuralFeatureEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeStructuralFeatureEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationOnNestedPortActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerOnNestedPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureDirectionEEnum = null;

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
	 * @see org.eclipse.papyrus.sysml14.portandflows.PortandflowsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PortandflowsPackageImpl() {
		super(eNS_URI, PortandflowsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PortandflowsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PortandflowsPackage init() {
		if (isInited) return (PortandflowsPackage)EPackage.Registry.INSTANCE.getEPackage(PortandflowsPackage.eNS_URI);

		// Obtain or create and register package
		PortandflowsPackageImpl thePortandflowsPackage = (PortandflowsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PortandflowsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PortandflowsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StandardPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BlocksPackageImpl theBlocksPackage = (BlocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI) instanceof BlocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI) : BlocksPackage.eINSTANCE);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		ModelelementsPackageImpl theModelelementsPackage = (ModelelementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelelementsPackage.eNS_URI) instanceof ModelelementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelelementsPackage.eNS_URI) : ModelelementsPackage.eINSTANCE);
		ConstraintblocksPackageImpl theConstraintblocksPackage = (ConstraintblocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintblocksPackage.eNS_URI) instanceof ConstraintblocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintblocksPackage.eNS_URI) : ConstraintblocksPackage.eINSTANCE);
		AllocationsPackageImpl theAllocationsPackage = (AllocationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI) instanceof AllocationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI) : AllocationsPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		DeprecatedelementsPackageImpl theDeprecatedelementsPackage = (DeprecatedelementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeprecatedelementsPackage.eNS_URI) instanceof DeprecatedelementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeprecatedelementsPackage.eNS_URI) : DeprecatedelementsPackage.eINSTANCE);

		// Create package meta-data objects
		thePortandflowsPackage.createPackageContents();
		theBlocksPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theModelelementsPackage.createPackageContents();
		theConstraintblocksPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theDeprecatedelementsPackage.createPackageContents();

		// Initialize created meta-data
		thePortandflowsPackage.initializePackageContents();
		theBlocksPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theModelelementsPackage.initializePackageContents();
		theConstraintblocksPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theDeprecatedelementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePortandflowsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PortandflowsPackage.eNS_URI, thePortandflowsPackage);
		return thePortandflowsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemFlow() {
		return itemFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemFlow_Base_InformationFlow() {
		return (EReference)itemFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemFlow_ItemProperty() {
		return (EReference)itemFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowProperty() {
		return flowPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowProperty_Base_Property() {
		return (EReference)flowPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowProperty_Direction() {
		return (EAttribute)flowPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFullPort() {
		return fullPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFullPort_Base_Port() {
		return (EReference)fullPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceBlock() {
		return interfaceBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProxyPort() {
		return proxyPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxyPort_Base_Port() {
		return (EReference)proxyPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptChangeStructuralFeatureEventAction() {
		return acceptChangeStructuralFeatureEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptChangeStructuralFeatureEventAction_Base_AcceptEventAction() {
		return (EReference)acceptChangeStructuralFeatureEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeStructuralFeatureEvent() {
		return changeStructuralFeatureEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeStructuralFeatureEvent_Base_ChangeEvent() {
		return (EReference)changeStructuralFeatureEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeStructuralFeatureEvent_StructuralFeature() {
		return (EReference)changeStructuralFeatureEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedFeature() {
		return directedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedFeature_Base_Feature() {
		return (EReference)directedFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFeature_FeatureDirection() {
		return (EAttribute)directedFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationOnNestedPortAction() {
		return invocationOnNestedPortActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationOnNestedPortAction_Base_InvocationAction() {
		return (EReference)invocationOnNestedPortActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationOnNestedPortAction_OnNestedPort() {
		return (EReference)invocationOnNestedPortActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerOnNestedPort() {
		return triggerOnNestedPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerOnNestedPort_Base_Trigger() {
		return (EReference)triggerOnNestedPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerOnNestedPort_OnNestedPort() {
		return (EReference)triggerOnNestedPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlowDirection() {
		return flowDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeatureDirection() {
		return featureDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortandflowsFactory getPortandflowsFactory() {
		return (PortandflowsFactory)getEFactoryInstance();
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
		itemFlowEClass = createEClass(ITEM_FLOW);
		createEReference(itemFlowEClass, ITEM_FLOW__BASE_INFORMATION_FLOW);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_PROPERTY);

		flowPropertyEClass = createEClass(FLOW_PROPERTY);
		createEReference(flowPropertyEClass, FLOW_PROPERTY__BASE_PROPERTY);
		createEAttribute(flowPropertyEClass, FLOW_PROPERTY__DIRECTION);

		fullPortEClass = createEClass(FULL_PORT);
		createEReference(fullPortEClass, FULL_PORT__BASE_PORT);

		interfaceBlockEClass = createEClass(INTERFACE_BLOCK);

		proxyPortEClass = createEClass(PROXY_PORT);
		createEReference(proxyPortEClass, PROXY_PORT__BASE_PORT);

		acceptChangeStructuralFeatureEventActionEClass = createEClass(ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION);
		createEReference(acceptChangeStructuralFeatureEventActionEClass, ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION__BASE_ACCEPT_EVENT_ACTION);

		changeStructuralFeatureEventEClass = createEClass(CHANGE_STRUCTURAL_FEATURE_EVENT);
		createEReference(changeStructuralFeatureEventEClass, CHANGE_STRUCTURAL_FEATURE_EVENT__BASE_CHANGE_EVENT);
		createEReference(changeStructuralFeatureEventEClass, CHANGE_STRUCTURAL_FEATURE_EVENT__STRUCTURAL_FEATURE);

		directedFeatureEClass = createEClass(DIRECTED_FEATURE);
		createEReference(directedFeatureEClass, DIRECTED_FEATURE__BASE_FEATURE);
		createEAttribute(directedFeatureEClass, DIRECTED_FEATURE__FEATURE_DIRECTION);

		invocationOnNestedPortActionEClass = createEClass(INVOCATION_ON_NESTED_PORT_ACTION);
		createEReference(invocationOnNestedPortActionEClass, INVOCATION_ON_NESTED_PORT_ACTION__BASE_INVOCATION_ACTION);
		createEReference(invocationOnNestedPortActionEClass, INVOCATION_ON_NESTED_PORT_ACTION__ON_NESTED_PORT);

		triggerOnNestedPortEClass = createEClass(TRIGGER_ON_NESTED_PORT);
		createEReference(triggerOnNestedPortEClass, TRIGGER_ON_NESTED_PORT__BASE_TRIGGER);
		createEReference(triggerOnNestedPortEClass, TRIGGER_ON_NESTED_PORT__ON_NESTED_PORT);

		// Create enums
		flowDirectionEEnum = createEEnum(FLOW_DIRECTION);
		featureDirectionEEnum = createEEnum(FEATURE_DIRECTION);
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
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interfaceBlockEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		invocationOnNestedPortActionEClass.getESuperTypes().add(theBlocksPackage.getElementPropertyPath());
		triggerOnNestedPortEClass.getESuperTypes().add(theBlocksPackage.getElementPropertyPath());

		// Initialize classes, features, and operations; add parameters
		initEClass(itemFlowEClass, ItemFlow.class, "ItemFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getItemFlow_Base_InformationFlow(), theUMLPackage.getInformationFlow(), null, "base_InformationFlow", null, 0, 1, ItemFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getItemFlow_ItemProperty(), theUMLPackage.getProperty(), null, "itemProperty", null, 0, 1, ItemFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(flowPropertyEClass, FlowProperty.class, "FlowProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFlowProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, FlowProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFlowProperty_Direction(), this.getFlowDirection(), "direction", "inout", 1, 1, FlowProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(fullPortEClass, FullPort.class, "FullPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFullPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, FullPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(interfaceBlockEClass, InterfaceBlock.class, "InterfaceBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(proxyPortEClass, ProxyPort.class, "ProxyPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProxyPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, ProxyPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(acceptChangeStructuralFeatureEventActionEClass, AcceptChangeStructuralFeatureEventAction.class, "AcceptChangeStructuralFeatureEventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAcceptChangeStructuralFeatureEventAction_Base_AcceptEventAction(), theUMLPackage.getAcceptEventAction(), null, "base_AcceptEventAction", null, 0, 1, AcceptChangeStructuralFeatureEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(changeStructuralFeatureEventEClass, ChangeStructuralFeatureEvent.class, "ChangeStructuralFeatureEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getChangeStructuralFeatureEvent_Base_ChangeEvent(), theUMLPackage.getChangeEvent(), null, "base_ChangeEvent", null, 0, 1, ChangeStructuralFeatureEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getChangeStructuralFeatureEvent_StructuralFeature(), theUMLPackage.getStructuralFeature(), null, "structuralFeature", null, 1, 1, ChangeStructuralFeatureEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(directedFeatureEClass, DirectedFeature.class, "DirectedFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDirectedFeature_Base_Feature(), theUMLPackage.getFeature(), null, "base_Feature", null, 0, 1, DirectedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDirectedFeature_FeatureDirection(), this.getFeatureDirection(), "featureDirection", null, 1, 1, DirectedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(invocationOnNestedPortActionEClass, InvocationOnNestedPortAction.class, "InvocationOnNestedPortAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInvocationOnNestedPortAction_Base_InvocationAction(), theUMLPackage.getInvocationAction(), null, "base_InvocationAction", null, 0, 1, InvocationOnNestedPortAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInvocationOnNestedPortAction_OnNestedPort(), theUMLPackage.getPort(), null, "onNestedPort", null, 1, -1, InvocationOnNestedPortAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(triggerOnNestedPortEClass, TriggerOnNestedPort.class, "TriggerOnNestedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTriggerOnNestedPort_Base_Trigger(), theUMLPackage.getTrigger(), null, "base_Trigger", null, 1, 1, TriggerOnNestedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTriggerOnNestedPort_OnNestedPort(), theUMLPackage.getPort(), null, "onNestedPort", null, 1, -1, TriggerOnNestedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(flowDirectionEEnum, FlowDirection.class, "FlowDirection"); //$NON-NLS-1$
		addEEnumLiteral(flowDirectionEEnum, FlowDirection.IN);
		addEEnumLiteral(flowDirectionEEnum, FlowDirection.OUT);
		addEEnumLiteral(flowDirectionEEnum, FlowDirection.INOUT);

		initEEnum(featureDirectionEEnum, FeatureDirection.class, "FeatureDirection"); //$NON-NLS-1$
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.PROVIDED);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.REQUIRED);
		addEEnumLiteral(featureDirectionEEnum, FeatureDirection.PROVIDED_REQUIRED);

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
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "PortsandFlows" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //PortandflowsPackageImpl
