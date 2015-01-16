/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

import org.eclipse.papyrus.sysml14.deprecatedelements.Allocated;
import org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsFactory;
import org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage;
import org.eclipse.papyrus.sysml14.deprecatedelements.FlowPort;
import org.eclipse.papyrus.sysml14.deprecatedelements.FlowSpecification;
import org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated;

import org.eclipse.papyrus.sysml14.modelelements.ModelelementsPackage;

import org.eclipse.papyrus.sysml14.modelelements.internal.impl.ModelelementsPackageImpl;

import org.eclipse.papyrus.sysml14.portandflows.PortandflowsPackage;

import org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl;

import org.eclipse.papyrus.sysml14.requirements.RequirementsPackage;

import org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.profile.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeprecatedelementsPackageImpl extends EPackageImpl implements DeprecatedelementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deprecatedEClass = null;

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
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeprecatedelementsPackageImpl() {
		super(eNS_URI, DeprecatedelementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DeprecatedelementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeprecatedelementsPackage init() {
		if (isInited) return (DeprecatedelementsPackage)EPackage.Registry.INSTANCE.getEPackage(DeprecatedelementsPackage.eNS_URI);

		// Obtain or create and register package
		DeprecatedelementsPackageImpl theDeprecatedelementsPackage = (DeprecatedelementsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DeprecatedelementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DeprecatedelementsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StandardPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BlocksPackageImpl theBlocksPackage = (BlocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI) instanceof BlocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI) : BlocksPackage.eINSTANCE);
		PortandflowsPackageImpl thePortandflowsPackage = (PortandflowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortandflowsPackage.eNS_URI) instanceof PortandflowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortandflowsPackage.eNS_URI) : PortandflowsPackage.eINSTANCE);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		ModelelementsPackageImpl theModelelementsPackage = (ModelelementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelelementsPackage.eNS_URI) instanceof ModelelementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelelementsPackage.eNS_URI) : ModelelementsPackage.eINSTANCE);
		ConstraintblocksPackageImpl theConstraintblocksPackage = (ConstraintblocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintblocksPackage.eNS_URI) instanceof ConstraintblocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintblocksPackage.eNS_URI) : ConstraintblocksPackage.eINSTANCE);
		AllocationsPackageImpl theAllocationsPackage = (AllocationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI) instanceof AllocationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI) : AllocationsPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);

		// Create package meta-data objects
		theDeprecatedelementsPackage.createPackageContents();
		theBlocksPackage.createPackageContents();
		thePortandflowsPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theModelelementsPackage.createPackageContents();
		theConstraintblocksPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		theDeprecatedelementsPackage.initializePackageContents();
		theBlocksPackage.initializePackageContents();
		thePortandflowsPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theModelelementsPackage.initializePackageContents();
		theConstraintblocksPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeprecatedelementsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeprecatedelementsPackage.eNS_URI, theDeprecatedelementsPackage);
		return theDeprecatedelementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowPort() {
		return flowPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowPort_Base_Port() {
		return (EReference)flowPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowPort_Direction() {
		return (EAttribute)flowPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowPort_IsAtomic() {
		return (EAttribute)flowPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowSpecification() {
		return flowSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowSpecification_Base_Interface() {
		return (EReference)flowSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocated() {
		return allocatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocated_Base_NamedElement() {
		return (EReference)allocatedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocated_AllocatedFrom() {
		return (EReference)allocatedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocated_AllocatedTo() {
		return (EReference)allocatedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementRelated() {
		return requirementRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementRelated_Base_NamedElement() {
		return (EReference)requirementRelatedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementRelated_TracedFrom() {
		return (EReference)requirementRelatedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementRelated_Satisfies() {
		return (EReference)requirementRelatedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementRelated_Refines() {
		return (EReference)requirementRelatedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementRelated_Verifies() {
		return (EReference)requirementRelatedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeprecated() {
		return deprecatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeprecated_Base_ValueSpecification() {
		return (EReference)deprecatedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeprecated_Base_Property() {
		return (EReference)deprecatedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeprecated_Base_InstanceSpecification() {
		return (EReference)deprecatedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeprecated_Base_Class() {
		return (EReference)deprecatedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeprecated_Base_Association() {
		return (EReference)deprecatedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeprecated_DeprecatedReason() {
		return (EAttribute)deprecatedEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeprecated_Base_Generalization() {
		return (EReference)deprecatedEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeprecated_Base_DataType() {
		return (EReference)deprecatedEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeprecatedelementsFactory getDeprecatedelementsFactory() {
		return (DeprecatedelementsFactory)getEFactoryInstance();
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
		flowPortEClass = createEClass(FLOW_PORT);
		createEReference(flowPortEClass, FLOW_PORT__BASE_PORT);
		createEAttribute(flowPortEClass, FLOW_PORT__DIRECTION);
		createEAttribute(flowPortEClass, FLOW_PORT__IS_ATOMIC);

		flowSpecificationEClass = createEClass(FLOW_SPECIFICATION);
		createEReference(flowSpecificationEClass, FLOW_SPECIFICATION__BASE_INTERFACE);

		allocatedEClass = createEClass(ALLOCATED);
		createEReference(allocatedEClass, ALLOCATED__BASE_NAMED_ELEMENT);
		createEReference(allocatedEClass, ALLOCATED__ALLOCATED_FROM);
		createEReference(allocatedEClass, ALLOCATED__ALLOCATED_TO);

		requirementRelatedEClass = createEClass(REQUIREMENT_RELATED);
		createEReference(requirementRelatedEClass, REQUIREMENT_RELATED__BASE_NAMED_ELEMENT);
		createEReference(requirementRelatedEClass, REQUIREMENT_RELATED__TRACED_FROM);
		createEReference(requirementRelatedEClass, REQUIREMENT_RELATED__SATISFIES);
		createEReference(requirementRelatedEClass, REQUIREMENT_RELATED__REFINES);
		createEReference(requirementRelatedEClass, REQUIREMENT_RELATED__VERIFIES);

		deprecatedEClass = createEClass(DEPRECATED);
		createEReference(deprecatedEClass, DEPRECATED__BASE_VALUE_SPECIFICATION);
		createEReference(deprecatedEClass, DEPRECATED__BASE_PROPERTY);
		createEReference(deprecatedEClass, DEPRECATED__BASE_INSTANCE_SPECIFICATION);
		createEReference(deprecatedEClass, DEPRECATED__BASE_CLASS);
		createEReference(deprecatedEClass, DEPRECATED__BASE_ASSOCIATION);
		createEAttribute(deprecatedEClass, DEPRECATED__DEPRECATED_REASON);
		createEReference(deprecatedEClass, DEPRECATED__BASE_GENERALIZATION);
		createEReference(deprecatedEClass, DEPRECATED__BASE_DATA_TYPE);
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
		PortandflowsPackage thePortandflowsPackage = (PortandflowsPackage)EPackage.Registry.INSTANCE.getEPackage(PortandflowsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(flowPortEClass, FlowPort.class, "FlowPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFlowPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, FlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFlowPort_Direction(), thePortandflowsPackage.getFlowDirection(), "direction", "inout", 1, 1, FlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFlowPort_IsAtomic(), theTypesPackage.getBoolean(), "isAtomic", null, 1, 1, FlowPort.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(flowSpecificationEClass, FlowSpecification.class, "FlowSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFlowSpecification_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 1, 1, FlowSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(allocatedEClass, Allocated.class, "Allocated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAllocated_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 1, 1, Allocated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAllocated_AllocatedFrom(), theUMLPackage.getNamedElement(), null, "allocatedFrom", null, 1, -1, Allocated.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAllocated_AllocatedTo(), theUMLPackage.getNamedElement(), null, "allocatedTo", null, 1, -1, Allocated.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(requirementRelatedEClass, RequirementRelated.class, "RequirementRelated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRequirementRelated_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 1, 1, RequirementRelated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRequirementRelated_TracedFrom(), theRequirementsPackage.getRequirement(), null, "TracedFrom", null, 1, -1, RequirementRelated.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRequirementRelated_Satisfies(), theRequirementsPackage.getRequirement(), null, "Satisfies", null, 1, -1, RequirementRelated.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRequirementRelated_Refines(), theRequirementsPackage.getRequirement(), null, "Refines", null, 1, -1, RequirementRelated.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRequirementRelated_Verifies(), theRequirementsPackage.getRequirement(), null, "Verifies", null, 1, -1, RequirementRelated.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(deprecatedEClass, org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated.class, "Deprecated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDeprecated_Base_ValueSpecification(), theUMLPackage.getValueSpecification(), null, "base_ValueSpecification", null, 1, 1, org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDeprecated_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDeprecated_Base_InstanceSpecification(), theUMLPackage.getInstanceSpecification(), null, "base_InstanceSpecification", null, 1, 1, org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDeprecated_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDeprecated_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDeprecated_DeprecatedReason(), theTypesPackage.getString(), "deprecatedReason", null, 1, 1, org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDeprecated_Base_Generalization(), theUMLPackage.getGeneralization(), null, "base_Generalization", null, 1, 1, org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDeprecated_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 1, 1, org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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
			 "originalName", "DeprecatedElements" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //DeprecatedelementsPackageImpl
