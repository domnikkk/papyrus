/**
 * Copyright (c) 2014 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTPseudostate;
import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTRegion;
import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState;
import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine;
import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTTrigger;
import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachFactory;
import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage;

import org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.util.UMLRealTimeStateMachValidator;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLRealTimeStateMachPackageImpl extends EPackageImpl implements UMLRealTimeStateMachPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtPseudostateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtTriggerEClass = null;

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
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UMLRealTimeStateMachPackageImpl() {
		super(eNS_URI, UMLRealTimeStateMachFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UMLRealTimeStateMachPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UMLRealTimeStateMachPackage init() {
		if (isInited) return (UMLRealTimeStateMachPackage)EPackage.Registry.INSTANCE.getEPackage(UMLRealTimeStateMachPackage.eNS_URI);

		// Obtain or create and register package
		UMLRealTimeStateMachPackageImpl theUMLRealTimeStateMachPackage = (UMLRealTimeStateMachPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UMLRealTimeStateMachPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UMLRealTimeStateMachPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUMLRealTimeStateMachPackage.createPackageContents();

		// Initialize created meta-data
		theUMLRealTimeStateMachPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theUMLRealTimeStateMachPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return UMLRealTimeStateMachValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theUMLRealTimeStateMachPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UMLRealTimeStateMachPackage.eNS_URI, theUMLRealTimeStateMachPackage);
		return theUMLRealTimeStateMachPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTStateMachine() {
		return rtStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTStateMachine_Base_StateMachine() {
		return (EReference)rtStateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTStateMachine_IsPassive() {
		return (EAttribute)rtStateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTStateMachine__AnRTstatemachinehasexactlyoneregion__DiagnosticChain_Map() {
		return rtStateMachineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTStateMachine__AnRTstatemachineisneverreentrant__DiagnosticChain_Map() {
		return rtStateMachineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTStateMachine__RTstatemachinesdonothaveparametersorparametersets__DiagnosticChain_Map() {
		return rtStateMachineEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTStateMachine__RTstatemachinesmusthaveacontextanditmustbeaClass__DiagnosticChain_Map() {
		return rtStateMachineEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTStateMachine__Passivestatemachineareonlyallowedonpassivedataclasses__DiagnosticChain_Map() {
		return rtStateMachineEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTRegion() {
		return rtRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTRegion_Base_Region() {
		return (EReference)rtRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTRegion__RegionsinRTstatemachinescannothaveafinalstate__DiagnosticChain_Map() {
		return rtRegionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTState() {
		return rtStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTState_Base_State() {
		return (EReference)rtStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTState__AcomposteRTstatehasexactlyoneregion__DiagnosticChain_Map() {
		return rtStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTState__RTdoesnotsupportsubmachinestates__DiagnosticChain_Map() {
		return rtStateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTState__RTstatemachinesdonotsupportdoactivities__DiagnosticChain_Map() {
		return rtStateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTState__RTstatemachinescannothaveanydeferredtriggers__DiagnosticChain_Map() {
		return rtStateEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTState__Constraint5__DiagnosticChain_Map() {
		return rtStateEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTPseudostate() {
		return rtPseudostateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTPseudostate_Base_Pseudostate() {
		return (EReference)rtPseudostateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRTPseudostate__RTstatemachinesdonotsupportconcurrencyorshallowhistory__DiagnosticChain_Map() {
		return rtPseudostateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTTrigger() {
		return rtTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTTrigger_Base_Operation() {
		return (EReference)rtTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealTimeStateMachFactory getUMLRealTimeStateMachFactory() {
		return (UMLRealTimeStateMachFactory)getEFactoryInstance();
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
		rtStateMachineEClass = createEClass(RT_STATE_MACHINE);
		createEReference(rtStateMachineEClass, RT_STATE_MACHINE__BASE_STATE_MACHINE);
		createEAttribute(rtStateMachineEClass, RT_STATE_MACHINE__IS_PASSIVE);
		createEOperation(rtStateMachineEClass, RT_STATE_MACHINE___AN_RTSTATEMACHINEHASEXACTLYONEREGION__DIAGNOSTICCHAIN_MAP);
		createEOperation(rtStateMachineEClass, RT_STATE_MACHINE___AN_RTSTATEMACHINEISNEVERREENTRANT__DIAGNOSTICCHAIN_MAP);
		createEOperation(rtStateMachineEClass, RT_STATE_MACHINE___RTSTATEMACHINESDONOTHAVEPARAMETERSORPARAMETERSETS__DIAGNOSTICCHAIN_MAP);
		createEOperation(rtStateMachineEClass, RT_STATE_MACHINE___RTSTATEMACHINESMUSTHAVEACONTEXTANDITMUSTBEA_CLASS__DIAGNOSTICCHAIN_MAP);
		createEOperation(rtStateMachineEClass, RT_STATE_MACHINE___PASSIVESTATEMACHINEAREONLYALLOWEDONPASSIVEDATACLASSES__DIAGNOSTICCHAIN_MAP);

		rtRegionEClass = createEClass(RT_REGION);
		createEReference(rtRegionEClass, RT_REGION__BASE_REGION);
		createEOperation(rtRegionEClass, RT_REGION___REGIONSIN_RTSTATEMACHINESCANNOTHAVEAFINALSTATE__DIAGNOSTICCHAIN_MAP);

		rtStateEClass = createEClass(RT_STATE);
		createEReference(rtStateEClass, RT_STATE__BASE_STATE);
		createEOperation(rtStateEClass, RT_STATE___ACOMPOSTE_RTSTATEHASEXACTLYONEREGION__DIAGNOSTICCHAIN_MAP);
		createEOperation(rtStateEClass, RT_STATE___RTDOESNOTSUPPORTSUBMACHINESTATES__DIAGNOSTICCHAIN_MAP);
		createEOperation(rtStateEClass, RT_STATE___RTSTATEMACHINESDONOTSUPPORTDOACTIVITIES__DIAGNOSTICCHAIN_MAP);
		createEOperation(rtStateEClass, RT_STATE___RTSTATEMACHINESCANNOTHAVEANYDEFERREDTRIGGERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(rtStateEClass, RT_STATE___CONSTRAINT5__DIAGNOSTICCHAIN_MAP);

		rtPseudostateEClass = createEClass(RT_PSEUDOSTATE);
		createEReference(rtPseudostateEClass, RT_PSEUDOSTATE__BASE_PSEUDOSTATE);
		createEOperation(rtPseudostateEClass, RT_PSEUDOSTATE___RTSTATEMACHINESDONOTSUPPORTCONCURRENCYORSHALLOWHISTORY__DIAGNOSTICCHAIN_MAP);

		rtTriggerEClass = createEClass(RT_TRIGGER);
		createEReference(rtTriggerEClass, RT_TRIGGER__BASE_OPERATION);
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
		initEClass(rtStateMachineEClass, RTStateMachine.class, "RTStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRTStateMachine_Base_StateMachine(), theUMLPackage.getStateMachine(), null, "base_StateMachine", null, 1, 1, RTStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRTStateMachine_IsPassive(), theTypesPackage.getBoolean(), "isPassive", "false", 1, 1, RTStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		EOperation op = initEOperation(getRTStateMachine__AnRTstatemachinehasexactlyoneregion__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "AnRTstatemachinehasexactlyoneregion", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTStateMachine__AnRTstatemachineisneverreentrant__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "AnRTstatemachineisneverreentrant", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTStateMachine__RTstatemachinesdonothaveparametersorparametersets__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RTstatemachinesdonothaveparametersorparametersets", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTStateMachine__RTstatemachinesmusthaveacontextanditmustbeaClass__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RTstatemachinesmusthaveacontextanditmustbeaClass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTStateMachine__Passivestatemachineareonlyallowedonpassivedataclasses__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Passivestatemachineareonlyallowedonpassivedataclasses", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(rtRegionEClass, RTRegion.class, "RTRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRTRegion_Base_Region(), theUMLPackage.getRegion(), null, "base_Region", null, 1, 1, RTRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTRegion__RegionsinRTstatemachinescannothaveafinalstate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RegionsinRTstatemachinescannothaveafinalstate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(rtStateEClass, RTState.class, "RTState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRTState_Base_State(), theUMLPackage.getState(), null, "base_State", null, 1, 1, RTState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTState__AcomposteRTstatehasexactlyoneregion__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "AcomposteRTstatehasexactlyoneregion", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTState__RTdoesnotsupportsubmachinestates__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RTdoesnotsupportsubmachinestates", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTState__RTstatemachinesdonotsupportdoactivities__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RTstatemachinesdonotsupportdoactivities", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTState__RTstatemachinescannothaveanydeferredtriggers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RTstatemachinescannothaveanydeferredtriggers", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTState__Constraint5__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint5", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(rtPseudostateEClass, RTPseudostate.class, "RTPseudostate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRTPseudostate_Base_Pseudostate(), theUMLPackage.getPseudostate(), null, "base_Pseudostate", null, 1, 1, RTPseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getRTPseudostate__RTstatemachinesdonotsupportconcurrencyorshallowhistory__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RTstatemachinesdonotsupportconcurrencyorshallowhistory", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(rtTriggerEClass, RTTrigger.class, "RTTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRTTrigger_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 1, 1, RTTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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
		  (getRTStateMachine__AnRTstatemachinehasexactlyoneregion__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "An RT state machine has exactly one region" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTStateMachine__AnRTstatemachineisneverreentrant__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "An RT state machine is never re-entrant" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTStateMachine__RTstatemachinesdonothaveparametersorparametersets__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "RT state machines do not have parameters or parameter sets" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTStateMachine__RTstatemachinesmusthaveacontextanditmustbeaClass__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "RT state machines must have a context and it must be a Class" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTStateMachine__Passivestatemachineareonlyallowedonpassivedataclasses__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "Passive state machine are only allowed on passive data classes" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTRegion__RegionsinRTstatemachinescannothaveafinalstate__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "Regions in RT state machines cannot have a final state" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTState__AcomposteRTstatehasexactlyoneregion__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "A composte RT state has exactly one region" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTState__RTdoesnotsupportsubmachinestates__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "RT does not support submachine states" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTState__RTstatemachinesdonotsupportdoactivities__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "RT state machines do not support \"do\" activities" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		   });	
		addAnnotation
		  (getRTState__RTstatemachinescannothaveanydeferredtriggers__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "RT state machines cannot have any deferred triggers " //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getRTPseudostate__RTstatemachinesdonotsupportconcurrencyorshallowhistory__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "RT state machines do not support concurrency or shallow history" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //UMLRealTimeStateMachPackageImpl
