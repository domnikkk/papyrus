/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.modelelements.internal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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

import org.eclipse.papyrus.sysml14.modelelements.Conform;
import org.eclipse.papyrus.sysml14.modelelements.ElementGroup;
import org.eclipse.papyrus.sysml14.modelelements.Expose;
import org.eclipse.papyrus.sysml14.modelelements.ModelelementsFactory;
import org.eclipse.papyrus.sysml14.modelelements.ModelelementsPackage;
import org.eclipse.papyrus.sysml14.modelelements.Problem;
import org.eclipse.papyrus.sysml14.modelelements.Rationale;
import org.eclipse.papyrus.sysml14.modelelements.Stakeholder;
import org.eclipse.papyrus.sysml14.modelelements.View;
import org.eclipse.papyrus.sysml14.modelelements.ViewPoint;

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
public class ModelelementsPackageImpl extends EPackageImpl implements ModelelementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeholderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementGroupEClass = null;

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
	 * @see org.eclipse.papyrus.sysml14.modelelements.ModelelementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelelementsPackageImpl() {
		super(eNS_URI, ModelelementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelelementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelelementsPackage init() {
		if (isInited) return (ModelelementsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelelementsPackage.eNS_URI);

		// Obtain or create and register package
		ModelelementsPackageImpl theModelelementsPackage = (ModelelementsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelelementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelelementsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StandardPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BlocksPackageImpl theBlocksPackage = (BlocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI) instanceof BlocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI) : BlocksPackage.eINSTANCE);
		PortandflowsPackageImpl thePortandflowsPackage = (PortandflowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortandflowsPackage.eNS_URI) instanceof PortandflowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortandflowsPackage.eNS_URI) : PortandflowsPackage.eINSTANCE);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		ConstraintblocksPackageImpl theConstraintblocksPackage = (ConstraintblocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintblocksPackage.eNS_URI) instanceof ConstraintblocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintblocksPackage.eNS_URI) : ConstraintblocksPackage.eINSTANCE);
		AllocationsPackageImpl theAllocationsPackage = (AllocationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI) instanceof AllocationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI) : AllocationsPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		DeprecatedelementsPackageImpl theDeprecatedelementsPackage = (DeprecatedelementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeprecatedelementsPackage.eNS_URI) instanceof DeprecatedelementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeprecatedelementsPackage.eNS_URI) : DeprecatedelementsPackage.eINSTANCE);

		// Create package meta-data objects
		theModelelementsPackage.createPackageContents();
		theBlocksPackage.createPackageContents();
		thePortandflowsPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theConstraintblocksPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theDeprecatedelementsPackage.createPackageContents();

		// Initialize created meta-data
		theModelelementsPackage.initializePackageContents();
		theBlocksPackage.initializePackageContents();
		thePortandflowsPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theConstraintblocksPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theDeprecatedelementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelelementsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelelementsPackage.eNS_URI, theModelelementsPackage);
		return theModelelementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationale() {
		return rationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRationale_Base_Comment() {
		return (EReference)rationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Base_Package() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_ViewPoint() {
		return (EReference)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Stakeholder() {
		return (EReference)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Base_Class() {
		return (EReference)viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewPoint() {
		return viewPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewPoint_Base_Class() {
		return (EReference)viewPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewPoint_Stakeholder() {
		return (EReference)viewPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewPoint_Purpose() {
		return (EAttribute)viewPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewPoint_ConcernList() {
		return (EReference)viewPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewPoint_Language() {
		return (EAttribute)viewPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewPoint_Method() {
		return (EReference)viewPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewPoint_Presentation() {
		return (EAttribute)viewPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewPoint_Concern() {
		return (EAttribute)viewPointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStakeholder() {
		return stakeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeholder_Base_Classifier() {
		return (EReference)stakeholderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeholder_Concern() {
		return (EReference)stakeholderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeholder_ConcernList() {
		return (EReference)stakeholderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConform() {
		return conformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConform_Base_Dependency() {
		return (EReference)conformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConform_Base_Generalization() {
		return (EReference)conformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblem() {
		return problemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblem_Base_Comment() {
		return (EReference)problemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpose() {
		return exposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpose_Base_Dependency() {
		return (EReference)exposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementGroup() {
		return elementGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroup_Base_Comment() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementGroup_Name() {
		return (EAttribute)elementGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementGroup_Criterion() {
		return (EAttribute)elementGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementGroup_Size() {
		return (EAttribute)elementGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroup_Member() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroup_OrderedMember() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementGroup__Criterion() {
		return elementGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementGroup__Size() {
		return elementGroupEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementGroup__Member() {
		return elementGroupEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementGroup__AllGroups__Element() {
		return elementGroupEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelelementsFactory getModelelementsFactory() {
		return (ModelelementsFactory)getEFactoryInstance();
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
		rationaleEClass = createEClass(RATIONALE);
		createEReference(rationaleEClass, RATIONALE__BASE_COMMENT);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__BASE_PACKAGE);
		createEReference(viewEClass, VIEW__VIEW_POINT);
		createEReference(viewEClass, VIEW__STAKEHOLDER);
		createEReference(viewEClass, VIEW__BASE_CLASS);

		viewPointEClass = createEClass(VIEW_POINT);
		createEReference(viewPointEClass, VIEW_POINT__BASE_CLASS);
		createEReference(viewPointEClass, VIEW_POINT__STAKEHOLDER);
		createEAttribute(viewPointEClass, VIEW_POINT__PURPOSE);
		createEReference(viewPointEClass, VIEW_POINT__CONCERN_LIST);
		createEAttribute(viewPointEClass, VIEW_POINT__LANGUAGE);
		createEReference(viewPointEClass, VIEW_POINT__METHOD);
		createEAttribute(viewPointEClass, VIEW_POINT__PRESENTATION);
		createEAttribute(viewPointEClass, VIEW_POINT__CONCERN);

		stakeholderEClass = createEClass(STAKEHOLDER);
		createEReference(stakeholderEClass, STAKEHOLDER__BASE_CLASSIFIER);
		createEReference(stakeholderEClass, STAKEHOLDER__CONCERN);
		createEReference(stakeholderEClass, STAKEHOLDER__CONCERN_LIST);

		conformEClass = createEClass(CONFORM);
		createEReference(conformEClass, CONFORM__BASE_DEPENDENCY);
		createEReference(conformEClass, CONFORM__BASE_GENERALIZATION);

		problemEClass = createEClass(PROBLEM);
		createEReference(problemEClass, PROBLEM__BASE_COMMENT);

		exposeEClass = createEClass(EXPOSE);
		createEReference(exposeEClass, EXPOSE__BASE_DEPENDENCY);

		elementGroupEClass = createEClass(ELEMENT_GROUP);
		createEReference(elementGroupEClass, ELEMENT_GROUP__BASE_COMMENT);
		createEAttribute(elementGroupEClass, ELEMENT_GROUP__NAME);
		createEAttribute(elementGroupEClass, ELEMENT_GROUP__CRITERION);
		createEAttribute(elementGroupEClass, ELEMENT_GROUP__SIZE);
		createEReference(elementGroupEClass, ELEMENT_GROUP__MEMBER);
		createEReference(elementGroupEClass, ELEMENT_GROUP__ORDERED_MEMBER);
		createEOperation(elementGroupEClass, ELEMENT_GROUP___CRITERION);
		createEOperation(elementGroupEClass, ELEMENT_GROUP___SIZE);
		createEOperation(elementGroupEClass, ELEMENT_GROUP___MEMBER);
		createEOperation(elementGroupEClass, ELEMENT_GROUP___ALL_GROUPS__ELEMENT);
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
		initEClass(rationaleEClass, Rationale.class, "Rationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRationale_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 0, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getView_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getView_ViewPoint(), this.getViewPoint(), null, "viewPoint", null, 1, 1, View.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getView_Stakeholder(), this.getStakeholder(), null, "stakeholder", null, 1, -1, View.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getView_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(viewPointEClass, ViewPoint.class, "ViewPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getViewPoint_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, ViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getViewPoint_Stakeholder(), this.getStakeholder(), null, "stakeholder", null, 1, -1, ViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getViewPoint_Purpose(), theTypesPackage.getString(), "purpose", null, 1, 1, ViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getViewPoint_ConcernList(), theUMLPackage.getComment(), null, "concernList", null, 1, -1, ViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getViewPoint_Language(), theTypesPackage.getString(), "language", null, 1, -1, ViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getViewPoint_Method(), theUMLPackage.getBehavior(), null, "method", null, 1, -1, ViewPoint.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getViewPoint_Presentation(), theTypesPackage.getString(), "presentation", null, 1, -1, ViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getViewPoint_Concern(), theTypesPackage.getString(), "concern", null, 1, -1, ViewPoint.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStakeholder_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStakeholder_Concern(), theUMLPackage.getComment(), null, "concern", null, 1, -1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getStakeholder_ConcernList(), theUMLPackage.getComment(), null, "concernList", null, 1, 1, Stakeholder.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(conformEClass, Conform.class, "Conform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConform_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 0, 1, Conform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConform_Base_Generalization(), theUMLPackage.getGeneralization(), null, "base_Generalization", null, 0, 1, Conform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(problemEClass, Problem.class, "Problem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProblem_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 0, 1, Problem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(exposeEClass, Expose.class, "Expose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExpose_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 0, 1, Expose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(elementGroupEClass, ElementGroup.class, "ElementGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getElementGroup_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 0, 1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getElementGroup_Name(), theTypesPackage.getString(), "name", null, 1, 1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getElementGroup_Criterion(), theTypesPackage.getString(), "criterion", null, 1, 1, ElementGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getElementGroup_Size(), theTypesPackage.getInteger(), "size", null, 1, 1, ElementGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getElementGroup_Member(), theUMLPackage.getElement(), null, "member", null, 0, -1, ElementGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getElementGroup_OrderedMember(), theUMLPackage.getElement(), null, "orderedMember", null, 0, -1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getElementGroup__Criterion(), theTypesPackage.getString(), "criterion", 0, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getElementGroup__Size(), theTypesPackage.getInteger(), "size", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getElementGroup__Member(), theUMLPackage.getElement(), "member", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getElementGroup__AllGroups__Element(), this.getElementGroup(), "allGroups", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theUMLPackage.getElement(), "e", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

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
			 "originalName", "ModelElements" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //ModelelementsPackageImpl
