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
package org.eclipse.papyrus.eastadl.infrastructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This section contains the UML-profile specification, specifying stereotypes in the UML-profile, defined from the metaclasses in the ADLCoreConstructs package. It includes specification details for each stereotype. If the stereotype has properties, which may
 * be referred to as tag definitions, or if the stereotype has constraints, this section also includes specification details for these properties and constraints.
 *
 * Overview:
 * This subprofile defines a set of abstract stereotypes which provide basic constructs to the other subprofiles. Two subprofiles are also defined, ADLTypes and ADLRelationshipModeling which are described in the following sections.
 * <!-- end-model-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructureFactory
 * @model kind="package"
 * @generated
 */
public interface InfrastructurePackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.InstanceRefImpl <em>Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getInstanceRef()
		 * @generated
		 */
		EClass INSTANCE_REF = eINSTANCE.getInstanceRef();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.TargetInstanceRefImpl <em>Target Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.TargetInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getTargetInstanceRef()
		 * @generated
		 */
		EClass TARGET_INSTANCE_REF = eINSTANCE.getTargetInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Allocation Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TARGET_INSTANCE_REF__ALLOCATION_TARGET = eINSTANCE.getTargetInstanceRef_AllocationTarget();
		/**
		 * The meta object literal for the '<em><b>Allocation Target context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TARGET_INSTANCE_REF__ALLOCATION_TARGET_CONTEXT = eINSTANCE.getTargetInstanceRef_AllocationTarget_context();
		/**
		 * The meta object literal for the '<em><b>Int Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TARGET_INSTANCE_REF__INT_ATTRIBUTE = eINSTANCE.getTargetInstanceRef_IntAttribute();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FunctionConnectorPortInstanceRefImpl <em>Function Connector Port Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.FunctionConnectorPortInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getFunctionConnectorPortInstanceRef()
		 * @generated
		 */
		EClass FUNCTION_CONNECTOR_PORT_INSTANCE_REF = eINSTANCE.getFunctionConnectorPortInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Function Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PORT = eINSTANCE.getFunctionConnectorPortInstanceRef_FunctionPort();
		/**
		 * The meta object literal for the '<em><b>Function Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE = eINSTANCE.getFunctionConnectorPortInstanceRef_FunctionPrototype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.HardwareConnectorInstanceRefImpl <em>Hardware Connector Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.HardwareConnectorInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getHardwareConnectorInstanceRef()
		 * @generated
		 */
		EClass HARDWARE_CONNECTOR_INSTANCE_REF = eINSTANCE.getHardwareConnectorInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Hardware Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_PIN = eINSTANCE.getHardwareConnectorInstanceRef_HardwarePin();
		/**
		 * The meta object literal for the '<em><b>Hardware Component Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE = eINSTANCE.getHardwareConnectorInstanceRef_HardwareComponentPrototype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.HardwarePortConnectorInstanceRefImpl <em>Hardware Port Connector Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.HardwarePortConnectorInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getHardwarePortConnectorInstanceRef()
		 * @generated
		 */
		EClass HARDWARE_PORT_CONNECTOR_INSTANCE_REF = eINSTANCE.getHardwarePortConnectorInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Hardware Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference HARDWARE_PORT_CONNECTOR_INSTANCE_REF__HARDWARE_PORT = eINSTANCE.getHardwarePortConnectorInstanceRef_HardwarePort();
		/**
		 * The meta object literal for the '<em><b>Hardware Component Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference HARDWARE_PORT_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE = eINSTANCE.getHardwarePortConnectorInstanceRef_HardwareComponentPrototype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.AllocatedElementInstanceRefImpl <em>Allocated Element Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.AllocatedElementInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getAllocatedElementInstanceRef()
		 * @generated
		 */
		EClass ALLOCATED_ELEMENT_INSTANCE_REF = eINSTANCE.getAllocatedElementInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Allocateable Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT = eINSTANCE.getAllocatedElementInstanceRef_AllocateableElement();
		/**
		 * The meta object literal for the '<em><b>Allocateable Element context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT_CONTEXT = eINSTANCE.getAllocatedElementInstanceRef_AllocateableElement_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.ClampConnectorInstanceRefImpl <em>Clamp Connector Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.ClampConnectorInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getClampConnectorInstanceRef()
		 * @generated
		 */
		EClass CLAMP_CONNECTOR_INSTANCE_REF = eINSTANCE.getClampConnectorInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Function Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PORT = eINSTANCE.getClampConnectorInstanceRef_FunctionPort();
		/**
		 * The meta object literal for the '<em><b>Function Prototype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE = eINSTANCE.getClampConnectorInstanceRef_FunctionPrototype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.RefineInstanceRefImpl <em>Refine Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.RefineInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getRefineInstanceRef()
		 * @generated
		 */
		EClass REFINE_INSTANCE_REF = eINSTANCE.getRefineInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Identifiable target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REFINE_INSTANCE_REF__IDENTIFIABLE_TARGET = eINSTANCE.getRefineInstanceRef_Identifiable_target();
		/**
		 * The meta object literal for the '<em><b>Identifiable context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REFINE_INSTANCE_REF__IDENTIFIABLE_CONTEXT = eINSTANCE.getRefineInstanceRef_Identifiable_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.SatisfyInstanceRefImpl <em>Satisfy Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.SatisfyInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getSatisfyInstanceRef()
		 * @generated
		 */
		EClass SATISFY_INSTANCE_REF = eINSTANCE.getSatisfyInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Identifiable target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SATISFY_INSTANCE_REF__IDENTIFIABLE_TARGET = eINSTANCE.getSatisfyInstanceRef_Identifiable_target();
		/**
		 * The meta object literal for the '<em><b>Identifiable context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SATISFY_INSTANCE_REF__IDENTIFIABLE_CONTEXT = eINSTANCE.getSatisfyInstanceRef_Identifiable_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.VVCaseInstanceRefImpl <em>VV Case Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.VVCaseInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getVVCaseInstanceRef()
		 * @generated
		 */
		EClass VV_CASE_INSTANCE_REF = eINSTANCE.getVVCaseInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Identifiable target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference VV_CASE_INSTANCE_REF__IDENTIFIABLE_TARGET = eINSTANCE.getVVCaseInstanceRef_Identifiable_target();
		/**
		 * The meta object literal for the '<em><b>Identifiable context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference VV_CASE_INSTANCE_REF__IDENTIFIABLE_CONTEXT = eINSTANCE.getVVCaseInstanceRef_Identifiable_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.VVTargetInstanceRefImpl <em>VV Target Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.VVTargetInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getVVTargetInstanceRef()
		 * @generated
		 */
		EClass VV_TARGET_INSTANCE_REF = eINSTANCE.getVVTargetInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Identifiable target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference VV_TARGET_INSTANCE_REF__IDENTIFIABLE_TARGET = eINSTANCE.getVVTargetInstanceRef_Identifiable_target();
		/**
		 * The meta object literal for the '<em><b>Identifiable context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference VV_TARGET_INSTANCE_REF__IDENTIFIABLE_CONTEXT = eINSTANCE.getVVTargetInstanceRef_Identifiable_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.Realization_realizedInstanceRefImpl <em>Realization realized Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.Realization_realizedInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getRealization_realizedInstanceRef()
		 * @generated
		 */
		EClass REALIZATION_REALIZED_INSTANCE_REF = eINSTANCE.getRealization_realizedInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Identifiable target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REALIZATION_REALIZED_INSTANCE_REF__IDENTIFIABLE_TARGET = eINSTANCE.getRealization_realizedInstanceRef_Identifiable_target();
		/**
		 * The meta object literal for the '<em><b>Identifiable context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REALIZATION_REALIZED_INSTANCE_REF__IDENTIFIABLE_CONTEXT = eINSTANCE.getRealization_realizedInstanceRef_Identifiable_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.Realization_realizedByInstanceRefImpl <em>Realization realized By Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.Realization_realizedByInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getRealization_realizedByInstanceRef()
		 * @generated
		 */
		EClass REALIZATION_REALIZED_BY_INSTANCE_REF = eINSTANCE.getRealization_realizedByInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Identifiable target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REALIZATION_REALIZED_BY_INSTANCE_REF__IDENTIFIABLE_TARGET = eINSTANCE.getRealization_realizedByInstanceRef_Identifiable_target();
		/**
		 * The meta object literal for the '<em><b>Identifiable context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REALIZATION_REALIZED_BY_INSTANCE_REF__IDENTIFIABLE_CONTEXT = eINSTANCE.getRealization_realizedByInstanceRef_Identifiable_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionInstanceRefImpl <em>Event Function Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getEventFunctionInstanceRef()
		 * @generated
		 */
		EClass EVENT_FUNCTION_INSTANCE_REF = eINSTANCE.getEventFunctionInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Function Prototype target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EVENT_FUNCTION_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET = eINSTANCE.getEventFunctionInstanceRef_FunctionPrototype_target();
		/**
		 * The meta object literal for the '<em><b>Function Prototype context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EVENT_FUNCTION_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT = eINSTANCE.getEventFunctionInstanceRef_FunctionPrototype_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionClientServerPortInstanceRefImpl <em>Event Function Client Server Port Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionClientServerPortInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getEventFunctionClientServerPortInstanceRef()
		 * @generated
		 */
		EClass EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF = eINSTANCE.getEventFunctionClientServerPortInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Function Client Server Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_CLIENT_SERVER_PORT = eINSTANCE.getEventFunctionClientServerPortInstanceRef_FunctionClientServerPort();
		/**
		 * The meta object literal for the '<em><b>Function Prototype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE = eINSTANCE.getEventFunctionClientServerPortInstanceRef_FunctionPrototype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionFlowPortInstanceRefImpl <em>Event Function Flow Port Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionFlowPortInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getEventFunctionFlowPortInstanceRef()
		 * @generated
		 */
		EClass EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF = eINSTANCE.getEventFunctionFlowPortInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Function Flow Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_FLOW_PORT = eINSTANCE.getEventFunctionFlowPortInstanceRef_FunctionFlowPort();
		/**
		 * The meta object literal for the '<em><b>Function Prototype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE = eINSTANCE.getEventFunctionFlowPortInstanceRef_FunctionPrototype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.PrecedenceConstraint_precedingInstanceRefImpl <em>Precedence Constraint preceding Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.PrecedenceConstraint_precedingInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getPrecedenceConstraint_precedingInstanceRef()
		 * @generated
		 */
		EClass PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF = eINSTANCE.getPrecedenceConstraint_precedingInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Function Prototype target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET = eINSTANCE.getPrecedenceConstraint_precedingInstanceRef_FunctionPrototype_target();
		/**
		 * The meta object literal for the '<em><b>Function Prototype context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT = eINSTANCE.getPrecedenceConstraint_precedingInstanceRef_FunctionPrototype_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.PrecedenceConstraint_successiveInstanceRefImpl <em>Precedence Constraint successive Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.PrecedenceConstraint_successiveInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getPrecedenceConstraint_successiveInstanceRef()
		 * @generated
		 */
		EClass PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF = eINSTANCE.getPrecedenceConstraint_successiveInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Function Prototype target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET = eINSTANCE.getPrecedenceConstraint_successiveInstanceRef_FunctionPrototype_target();
		/**
		 * The meta object literal for the '<em><b>Function Prototype context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT = eINSTANCE.getPrecedenceConstraint_successiveInstanceRef_FunctionPrototype_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.ErrorModelPrototype_functionTargetInstanceRefImpl <em>Error Model Prototype function Target Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.ErrorModelPrototype_functionTargetInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getErrorModelPrototype_functionTargetInstanceRef()
		 * @generated
		 */
		EClass ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF = eINSTANCE.getErrorModelPrototype_functionTargetInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Function Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE = eINSTANCE.getErrorModelPrototype_functionTargetInstanceRef_FunctionPrototype();
		/**
		 * The meta object literal for the '<em><b>Function Prototype context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT = eINSTANCE.getErrorModelPrototype_functionTargetInstanceRef_FunctionPrototype_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.ErrorModelPrototype_hwTargetInstanceRefImpl <em>Error Model Prototype hw Target Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.ErrorModelPrototype_hwTargetInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getErrorModelPrototype_hwTargetInstanceRef()
		 * @generated
		 */
		EClass ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF = eINSTANCE.getErrorModelPrototype_hwTargetInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Hardware Component Protype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE = eINSTANCE.getErrorModelPrototype_hwTargetInstanceRef_HardwareComponentProtype();
		/**
		 * The meta object literal for the '<em><b>Hardware Component Protype context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_CONTEXT = eINSTANCE.getErrorModelPrototype_hwTargetInstanceRef_HardwareComponentProtype_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePort_hwTargetInstanceRefImpl <em>Fault Failure Port hw Target Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePort_hwTargetInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getFaultFailurePort_hwTargetInstanceRef()
		 * @generated
		 */
		EClass FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF = eINSTANCE.getFaultFailurePort_hwTargetInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Hardware Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_PORT = eINSTANCE.getFaultFailurePort_hwTargetInstanceRef_HardwarePort();
		/**
		 * The meta object literal for the '<em><b>Hardware Component Protype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE = eINSTANCE.getFaultFailurePort_hwTargetInstanceRef_HardwareComponentProtype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePort_functionTargetInstanceRefImpl <em>Fault Failure Port function Target Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePort_functionTargetInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getFaultFailurePort_functionTargetInstanceRef()
		 * @generated
		 */
		EClass FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF = eINSTANCE.getFaultFailurePort_functionTargetInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Function Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PORT = eINSTANCE.getFaultFailurePort_functionTargetInstanceRef_FunctionPort();
		/**
		 * The meta object literal for the '<em><b>Function Prototype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE = eINSTANCE.getFaultFailurePort_functionTargetInstanceRef_FunctionPrototype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePropagationLink_fromPortInstanceRefImpl <em>Fault Failure Propagation Link from Port Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePropagationLink_fromPortInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getFaultFailurePropagationLink_fromPortInstanceRef()
		 * @generated
		 */
		EClass FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF = eINSTANCE.getFaultFailurePropagationLink_fromPortInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Fault Fairelure Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__FAULT_FAIRELURE_PORT = eINSTANCE.getFaultFailurePropagationLink_fromPortInstanceRef_FaultFairelurePort();
		/**
		 * The meta object literal for the '<em><b>Error Model Prototype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__ERROR_MODEL_PROTOTYPE = eINSTANCE.getFaultFailurePropagationLink_fromPortInstanceRef_ErrorModelPrototype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailure_anomalyInstanceRefImpl <em>Fault Failure anomaly Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailure_anomalyInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getFaultFailure_anomalyInstanceRef()
		 * @generated
		 */
		EClass FAULT_FAILURE_ANOMALY_INSTANCE_REF = eINSTANCE.getFaultFailure_anomalyInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Anomaly</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FAULT_FAILURE_ANOMALY_INSTANCE_REF__ANOMALY = eINSTANCE.getFaultFailure_anomalyInstanceRef_Anomaly();
		/**
		 * The meta object literal for the '<em><b>Error Model Prototype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FAULT_FAILURE_ANOMALY_INSTANCE_REF__ERROR_MODEL_PROTOTYPE = eINSTANCE.getFaultFailure_anomalyInstanceRef_ErrorModelPrototype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePropagationLink_toPortInstanceRefImpl <em>Fault Failure Propagation Link to Port Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePropagationLink_toPortInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getFaultFailurePropagationLink_toPortInstanceRef()
		 * @generated
		 */
		EClass FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF = eINSTANCE.getFaultFailurePropagationLink_toPortInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Fault Fairelure Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF__FAULT_FAIRELURE_PORT = eINSTANCE.getFaultFailurePropagationLink_toPortInstanceRef_FaultFairelurePort();
		/**
		 * The meta object literal for the '<em><b>Error Model Prototype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF__ERROR_MODEL_PROTOTYPE = eINSTANCE.getFaultFailurePropagationLink_toPortInstanceRef_ErrorModelPrototype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefImpl <em>Behavior Constraint Internal Binding through Function Connector Instance Ref</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef()
		 * @generated
		 */
		EClass BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF = eINSTANCE.getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Function Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_CONNECTOR = eINSTANCE.getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef_FunctionConnector();
		/**
		 * The meta object literal for the '<em><b>Function Prototype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE = eINSTANCE.getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef_FunctionPrototype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefImpl <em>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef()
		 * @generated
		 */
		EClass BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF = eINSTANCE.getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Hardware Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_CONNECTOR = eINSTANCE.getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef_HardwareConnector();
		/**
		 * The meta object literal for the '<em><b>Hardware Component Prototype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE = eINSTANCE.getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef_HardwareComponentPrototype();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_functionTargetInstanceRefImpl <em>Behavior Constraint Prototype function Target Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_functionTargetInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getBehaviorConstraintPrototype_functionTargetInstanceRef()
		 * @generated
		 */
		EClass BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF = eINSTANCE.getBehaviorConstraintPrototype_functionTargetInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Function Prototype target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET = eINSTANCE.getBehaviorConstraintPrototype_functionTargetInstanceRef_FunctionPrototype_target();
		/**
		 * The meta object literal for the '<em><b>Function Prototype context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT = eINSTANCE.getBehaviorConstraintPrototype_functionTargetInstanceRef_FunctionPrototype_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRefImpl <em>Behavior Constraint Prototype hardware Component Target Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef()
		 * @generated
		 */
		EClass BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF = eINSTANCE.getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Hardware Component Protype target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_TARGET = eINSTANCE.getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef_HardwareComponentProtype_target();
		/**
		 * The meta object literal for the '<em><b>Hardware Component Prototype context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT = eINSTANCE.getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef_HardwareComponentPrototype_context();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_errorModelTargetInstanceRefImpl <em>Behavior Constraint Prototype error Model Target Instance Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_errorModelTargetInstanceRefImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getBehaviorConstraintPrototype_errorModelTargetInstanceRef()
		 * @generated
		 */
		EClass BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF = eINSTANCE.getBehaviorConstraintPrototype_errorModelTargetInstanceRef();
		/**
		 * The meta object literal for the '<em><b>Error Model Prototype target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_TARGET = eINSTANCE.getBehaviorConstraintPrototype_errorModelTargetInstanceRef_ErrorModelPrototype_target();
		/**
		 * The meta object literal for the '<em><b>Error Model Prototype context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_CONTEXT = eINSTANCE.getBehaviorConstraintPrototype_errorModelTargetInstanceRef_ErrorModelPrototype_context();
		/**
		 * The meta object literal for the '<em>Dummy</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see java.lang.String
		 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getDummy()
		 * @generated
		 */
		EDataType DUMMY = eINSTANCE.getDummy();

	}

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "infrastructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Infrastructure/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "Infrastructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	InfrastructurePackage eINSTANCE = org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.InstanceRefImpl <em>Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getInstanceRef()
	 * @generated
	 */
	int INSTANCE_REF = 0;

	/**
	 * The number of structural features of the '<em>Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSTANCE_REF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INSTANCE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.TargetInstanceRefImpl <em>Target Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.TargetInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getTargetInstanceRef()
	 * @generated
	 */
	int TARGET_INSTANCE_REF = 1;

	/**
	 * The feature id for the '<em><b>Allocation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TARGET_INSTANCE_REF__ALLOCATION_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocation Target context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TARGET_INSTANCE_REF__ALLOCATION_TARGET_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Int Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TARGET_INSTANCE_REF__INT_ATTRIBUTE = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TARGET_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TARGET_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FunctionConnectorPortInstanceRefImpl <em>Function Connector Port Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.FunctionConnectorPortInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getFunctionConnectorPortInstanceRef()
	 * @generated
	 */
	int FUNCTION_CONNECTOR_PORT_INSTANCE_REF = 2;

	/**
	 * The feature id for the '<em><b>Function Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PORT = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Connector Port Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR_PORT_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Connector Port Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR_PORT_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.HardwareConnectorInstanceRefImpl <em>Hardware Connector Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.HardwareConnectorInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getHardwareConnectorInstanceRef()
	 * @generated
	 */
	int HARDWARE_CONNECTOR_INSTANCE_REF = 3;

	/**
	 * The feature id for the '<em><b>Hardware Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_PIN = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hardware Component Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hardware Connector Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hardware Connector Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.HardwarePortConnectorInstanceRefImpl <em>Hardware Port Connector Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.HardwarePortConnectorInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getHardwarePortConnectorInstanceRef()
	 * @generated
	 */
	int HARDWARE_PORT_CONNECTOR_INSTANCE_REF = 4;

	/**
	 * The feature id for the '<em><b>Hardware Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR_INSTANCE_REF__HARDWARE_PORT = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hardware Component Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hardware Port Connector Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hardware Port Connector Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.AllocatedElementInstanceRefImpl <em>Allocated Element Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.AllocatedElementInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getAllocatedElementInstanceRef()
	 * @generated
	 */
	int ALLOCATED_ELEMENT_INSTANCE_REF = 5;

	/**
	 * The feature id for the '<em><b>Allocateable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocateable Element context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allocated Element Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_ELEMENT_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Allocated Element Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_ELEMENT_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.ClampConnectorInstanceRefImpl <em>Clamp Connector Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.ClampConnectorInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getClampConnectorInstanceRef()
	 * @generated
	 */
	int CLAMP_CONNECTOR_INSTANCE_REF = 6;

	/**
	 * The feature id for the '<em><b>Function Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PORT = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Prototype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clamp Connector Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CLAMP_CONNECTOR_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clamp Connector Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CLAMP_CONNECTOR_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.RefineInstanceRefImpl <em>Refine Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.RefineInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getRefineInstanceRef()
	 * @generated
	 */
	int REFINE_INSTANCE_REF = 7;

	/**
	 * The feature id for the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE_INSTANCE_REF__IDENTIFIABLE_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifiable context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE_INSTANCE_REF__IDENTIFIABLE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refine Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Refine Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.SatisfyInstanceRefImpl <em>Satisfy Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.SatisfyInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getSatisfyInstanceRef()
	 * @generated
	 */
	int SATISFY_INSTANCE_REF = 8;

	/**
	 * The feature id for the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY_INSTANCE_REF__IDENTIFIABLE_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifiable context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY_INSTANCE_REF__IDENTIFIABLE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Satisfy Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Satisfy Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.VVCaseInstanceRefImpl <em>VV Case Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.VVCaseInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getVVCaseInstanceRef()
	 * @generated
	 */
	int VV_CASE_INSTANCE_REF = 9;

	/**
	 * The feature id for the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int VV_CASE_INSTANCE_REF__IDENTIFIABLE_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifiable context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int VV_CASE_INSTANCE_REF__IDENTIFIABLE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VV Case Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int VV_CASE_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VV Case Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int VV_CASE_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.VVTargetInstanceRefImpl <em>VV Target Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.VVTargetInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getVVTargetInstanceRef()
	 * @generated
	 */
	int VV_TARGET_INSTANCE_REF = 10;

	/**
	 * The feature id for the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int VV_TARGET_INSTANCE_REF__IDENTIFIABLE_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifiable context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int VV_TARGET_INSTANCE_REF__IDENTIFIABLE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VV Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int VV_TARGET_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VV Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int VV_TARGET_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.Realization_realizedInstanceRefImpl <em>Realization realized Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.Realization_realizedInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getRealization_realizedInstanceRef()
	 * @generated
	 */
	int REALIZATION_REALIZED_INSTANCE_REF = 11;

	/**
	 * The feature id for the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_INSTANCE_REF__IDENTIFIABLE_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifiable context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_INSTANCE_REF__IDENTIFIABLE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Realization realized Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Realization realized Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.Realization_realizedByInstanceRefImpl <em>Realization realized By Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.Realization_realizedByInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getRealization_realizedByInstanceRef()
	 * @generated
	 */
	int REALIZATION_REALIZED_BY_INSTANCE_REF = 12;

	/**
	 * The feature id for the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_BY_INSTANCE_REF__IDENTIFIABLE_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifiable context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_BY_INSTANCE_REF__IDENTIFIABLE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Realization realized By Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_BY_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Realization realized By Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_BY_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionInstanceRefImpl <em>Event Function Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getEventFunctionInstanceRef()
	 * @generated
	 */
	int EVENT_FUNCTION_INSTANCE_REF = 13;

	/**
	 * The feature id for the '<em><b>Function Prototype target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Prototype context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Function Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Function Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionClientServerPortInstanceRefImpl <em>Event Function Client Server Port Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionClientServerPortInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getEventFunctionClientServerPortInstanceRef()
	 * @generated
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF = 14;

	/**
	 * The feature id for the '<em><b>Function Client Server Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_CLIENT_SERVER_PORT = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Prototype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Function Client Server Port Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Function Client Server Port Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionFlowPortInstanceRefImpl <em>Event Function Flow Port Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.EventFunctionFlowPortInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getEventFunctionFlowPortInstanceRef()
	 * @generated
	 */
	int EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF = 15;

	/**
	 * The feature id for the '<em><b>Function Flow Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_FLOW_PORT = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Prototype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Function Flow Port Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Function Flow Port Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.PrecedenceConstraint_precedingInstanceRefImpl <em>Precedence Constraint preceding Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.PrecedenceConstraint_precedingInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getPrecedenceConstraint_precedingInstanceRef()
	 * @generated
	 */
	int PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF = 16;

	/**
	 * The feature id for the '<em><b>Function Prototype target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Prototype context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Precedence Constraint preceding Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Precedence Constraint preceding Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.PrecedenceConstraint_successiveInstanceRefImpl <em>Precedence Constraint successive Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.PrecedenceConstraint_successiveInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getPrecedenceConstraint_successiveInstanceRef()
	 * @generated
	 */
	int PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF = 17;

	/**
	 * The feature id for the '<em><b>Function Prototype target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Prototype context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Precedence Constraint successive Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Precedence Constraint successive Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.ErrorModelPrototype_functionTargetInstanceRefImpl <em>Error Model Prototype function Target Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.ErrorModelPrototype_functionTargetInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getErrorModelPrototype_functionTargetInstanceRef()
	 * @generated
	 */
	int ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF = 18;

	/**
	 * The feature id for the '<em><b>Function Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Prototype context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Model Prototype function Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Error Model Prototype function Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.ErrorModelPrototype_hwTargetInstanceRefImpl <em>Error Model Prototype hw Target Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.ErrorModelPrototype_hwTargetInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getErrorModelPrototype_hwTargetInstanceRef()
	 * @generated
	 */
	int ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF = 19;

	/**
	 * The feature id for the '<em><b>Hardware Component Protype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hardware Component Protype context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Model Prototype hw Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Error Model Prototype hw Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePort_hwTargetInstanceRefImpl <em>Fault Failure Port hw Target Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePort_hwTargetInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getFaultFailurePort_hwTargetInstanceRef()
	 * @generated
	 */
	int FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF = 20;

	/**
	 * The feature id for the '<em><b>Hardware Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_PORT = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hardware Component Protype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fault Failure Port hw Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fault Failure Port hw Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePort_functionTargetInstanceRefImpl <em>Fault Failure Port function Target Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePort_functionTargetInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getFaultFailurePort_functionTargetInstanceRef()
	 * @generated
	 */
	int FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF = 21;

	/**
	 * The feature id for the '<em><b>Function Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PORT = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Prototype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fault Failure Port function Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fault Failure Port function Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePropagationLink_fromPortInstanceRefImpl <em>Fault Failure Propagation Link from Port Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePropagationLink_fromPortInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getFaultFailurePropagationLink_fromPortInstanceRef()
	 * @generated
	 */
	int FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF = 22;

	/**
	 * The feature id for the '<em><b>Fault Fairelure Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__FAULT_FAIRELURE_PORT = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Model Prototype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__ERROR_MODEL_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fault Failure Propagation Link from Port Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fault Failure Propagation Link from Port Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailure_anomalyInstanceRefImpl <em>Fault Failure anomaly Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailure_anomalyInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getFaultFailure_anomalyInstanceRef()
	 * @generated
	 */
	int FAULT_FAILURE_ANOMALY_INSTANCE_REF = 23;

	/**
	 * The feature id for the '<em><b>Anomaly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_ANOMALY_INSTANCE_REF__ANOMALY = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Model Prototype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_ANOMALY_INSTANCE_REF__ERROR_MODEL_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fault Failure anomaly Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_ANOMALY_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fault Failure anomaly Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_ANOMALY_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePropagationLink_toPortInstanceRefImpl <em>Fault Failure Propagation Link to Port Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.FaultFailurePropagationLink_toPortInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getFaultFailurePropagationLink_toPortInstanceRef()
	 * @generated
	 */
	int FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF = 24;

	/**
	 * The feature id for the '<em><b>Fault Fairelure Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF__FAULT_FAIRELURE_PORT = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Model Prototype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF__ERROR_MODEL_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fault Failure Propagation Link to Port Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fault Failure Propagation Link to Port Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefImpl <em>Behavior Constraint Internal Binding through Function Connector Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef()
	 * @generated
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF = 25;

	/**
	 * The feature id for the '<em><b>Function Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_CONNECTOR = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Prototype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavior Constraint Internal Binding through Function Connector Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Behavior Constraint Internal Binding through Function Connector Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefImpl <em>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef()
	 * @generated
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF = 26;

	/**
	 * The feature id for the '<em><b>Hardware Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_CONNECTOR = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hardware Component Prototype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_functionTargetInstanceRefImpl <em>Behavior Constraint Prototype function Target Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_functionTargetInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getBehaviorConstraintPrototype_functionTargetInstanceRef()
	 * @generated
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF = 27;

	/**
	 * The feature id for the '<em><b>Function Prototype target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Prototype context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavior Constraint Prototype function Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Behavior Constraint Prototype function Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRefImpl <em>Behavior Constraint Prototype hardware Component Target Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef()
	 * @generated
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF = 28;

	/**
	 * The feature id for the '<em><b>Hardware Component Protype target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hardware Component Prototype context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavior Constraint Prototype hardware Component Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Behavior Constraint Prototype hardware Component Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_errorModelTargetInstanceRefImpl <em>Behavior Constraint Prototype error Model Target Instance Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.BehaviorConstraintPrototype_errorModelTargetInstanceRefImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getBehaviorConstraintPrototype_errorModelTargetInstanceRef()
	 * @generated
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF = 29;

	/**
	 * The feature id for the '<em><b>Error Model Prototype target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_TARGET = INSTANCE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Model Prototype context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_CONTEXT = INSTANCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavior Constraint Prototype error Model Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF_FEATURE_COUNT = INSTANCE_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Behavior Constraint Prototype error Model Target Instance Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF_OPERATION_COUNT = INSTANCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Dummy</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see java.lang.String
	 * @see org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl#getDummy()
	 * @generated
	 */
	int DUMMY = 30;

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.InstanceRef <em>Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InstanceRef
	 * @generated
	 */
	EClass getInstanceRef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef <em>Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Target Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef
	 * @generated
	 */
	EClass getTargetInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef#getAllocationTarget <em>Allocation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Allocation Target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef#getAllocationTarget()
	 * @see #getTargetInstanceRef()
	 * @generated
	 */
	EReference getTargetInstanceRef_AllocationTarget();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef#getAllocationTarget_context <em>Allocation Target context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Allocation Target context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef#getAllocationTarget_context()
	 * @see #getTargetInstanceRef()
	 * @generated
	 */
	EReference getTargetInstanceRef_AllocationTarget_context();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef#getIntAttribute <em>Int Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Int Attribute</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef#getIntAttribute()
	 * @see #getTargetInstanceRef()
	 * @generated
	 */
	EAttribute getTargetInstanceRef_IntAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef <em>Function Connector Port Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Function Connector Port Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef
	 * @generated
	 */
	EClass getFunctionConnectorPortInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef#getFunctionPort <em>Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Function Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef#getFunctionPort()
	 * @see #getFunctionConnectorPortInstanceRef()
	 * @generated
	 */
	EReference getFunctionConnectorPortInstanceRef_FunctionPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef#getFunctionPrototype <em>Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Function Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef#getFunctionPrototype()
	 * @see #getFunctionConnectorPortInstanceRef()
	 * @generated
	 */
	EReference getFunctionConnectorPortInstanceRef_FunctionPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef <em>Hardware Connector Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Hardware Connector Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef
	 * @generated
	 */
	EClass getHardwareConnectorInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef#getHardwarePin <em>Hardware Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Hardware Pin</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef#getHardwarePin()
	 * @see #getHardwareConnectorInstanceRef()
	 * @generated
	 */
	EReference getHardwareConnectorInstanceRef_HardwarePin();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Hardware Component Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef#getHardwareComponentPrototype()
	 * @see #getHardwareConnectorInstanceRef()
	 * @generated
	 */
	EReference getHardwareConnectorInstanceRef_HardwareComponentPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef <em>Hardware Port Connector Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Hardware Port Connector Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef
	 * @generated
	 */
	EClass getHardwarePortConnectorInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef#getHardwarePort <em>Hardware Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Hardware Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef#getHardwarePort()
	 * @see #getHardwarePortConnectorInstanceRef()
	 * @generated
	 */
	EReference getHardwarePortConnectorInstanceRef_HardwarePort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Hardware Component Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef#getHardwareComponentPrototype()
	 * @see #getHardwarePortConnectorInstanceRef()
	 * @generated
	 */
	EReference getHardwarePortConnectorInstanceRef_HardwareComponentPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef <em>Allocated Element Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Allocated Element Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef
	 * @generated
	 */
	EClass getAllocatedElementInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef#getAllocateableElement <em>Allocateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Allocateable Element</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef#getAllocateableElement()
	 * @see #getAllocatedElementInstanceRef()
	 * @generated
	 */
	EReference getAllocatedElementInstanceRef_AllocateableElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef#getAllocateableElement_context <em>Allocateable Element context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Allocateable Element context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef#getAllocateableElement_context()
	 * @see #getAllocatedElementInstanceRef()
	 * @generated
	 */
	EReference getAllocatedElementInstanceRef_AllocateableElement_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.ClampConnectorInstanceRef <em>Clamp Connector Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Clamp Connector Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.ClampConnectorInstanceRef
	 * @generated
	 */
	EClass getClampConnectorInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.ClampConnectorInstanceRef#getFunctionPort <em>Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Function Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.ClampConnectorInstanceRef#getFunctionPort()
	 * @see #getClampConnectorInstanceRef()
	 * @generated
	 */
	EReference getClampConnectorInstanceRef_FunctionPort();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.ClampConnectorInstanceRef#getFunctionPrototype <em>Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Function Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.ClampConnectorInstanceRef#getFunctionPrototype()
	 * @see #getClampConnectorInstanceRef()
	 * @generated
	 */
	EReference getClampConnectorInstanceRef_FunctionPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef <em>Refine Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Refine Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef
	 * @generated
	 */
	EClass getRefineInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef#getIdentifiable_target <em>Identifiable target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Identifiable target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef#getIdentifiable_target()
	 * @see #getRefineInstanceRef()
	 * @generated
	 */
	EReference getRefineInstanceRef_Identifiable_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef#getIdentifiable_context <em>Identifiable context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Identifiable context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef#getIdentifiable_context()
	 * @see #getRefineInstanceRef()
	 * @generated
	 */
	EReference getRefineInstanceRef_Identifiable_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.SatisfyInstanceRef <em>Satisfy Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Satisfy Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.SatisfyInstanceRef
	 * @generated
	 */
	EClass getSatisfyInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.SatisfyInstanceRef#getIdentifiable_target <em>Identifiable target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Identifiable target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.SatisfyInstanceRef#getIdentifiable_target()
	 * @see #getSatisfyInstanceRef()
	 * @generated
	 */
	EReference getSatisfyInstanceRef_Identifiable_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.SatisfyInstanceRef#getIdentifiable_context <em>Identifiable context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Identifiable context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.SatisfyInstanceRef#getIdentifiable_context()
	 * @see #getSatisfyInstanceRef()
	 * @generated
	 */
	EReference getSatisfyInstanceRef_Identifiable_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.VVCaseInstanceRef <em>VV Case Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>VV Case Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.VVCaseInstanceRef
	 * @generated
	 */
	EClass getVVCaseInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.VVCaseInstanceRef#getIdentifiable_target <em>Identifiable target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Identifiable target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.VVCaseInstanceRef#getIdentifiable_target()
	 * @see #getVVCaseInstanceRef()
	 * @generated
	 */
	EReference getVVCaseInstanceRef_Identifiable_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.VVCaseInstanceRef#getIdentifiable_context <em>Identifiable context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Identifiable context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.VVCaseInstanceRef#getIdentifiable_context()
	 * @see #getVVCaseInstanceRef()
	 * @generated
	 */
	EReference getVVCaseInstanceRef_Identifiable_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.VVTargetInstanceRef <em>VV Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>VV Target Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.VVTargetInstanceRef
	 * @generated
	 */
	EClass getVVTargetInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.VVTargetInstanceRef#getIdentifiable_target <em>Identifiable target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Identifiable target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.VVTargetInstanceRef#getIdentifiable_target()
	 * @see #getVVTargetInstanceRef()
	 * @generated
	 */
	EReference getVVTargetInstanceRef_Identifiable_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.VVTargetInstanceRef#getIdentifiable_context <em>Identifiable context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Identifiable context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.VVTargetInstanceRef#getIdentifiable_context()
	 * @see #getVVTargetInstanceRef()
	 * @generated
	 */
	EReference getVVTargetInstanceRef_Identifiable_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedInstanceRef <em>Realization realized Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Realization realized Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedInstanceRef
	 * @generated
	 */
	EClass getRealization_realizedInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedInstanceRef#getIdentifiable_target <em>Identifiable target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Identifiable target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedInstanceRef#getIdentifiable_target()
	 * @see #getRealization_realizedInstanceRef()
	 * @generated
	 */
	EReference getRealization_realizedInstanceRef_Identifiable_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedInstanceRef#getIdentifiable_context <em>Identifiable context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Identifiable context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedInstanceRef#getIdentifiable_context()
	 * @see #getRealization_realizedInstanceRef()
	 * @generated
	 */
	EReference getRealization_realizedInstanceRef_Identifiable_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef <em>Realization realized By Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Realization realized By Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef
	 * @generated
	 */
	EClass getRealization_realizedByInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef#getIdentifiable_target <em>Identifiable target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Identifiable target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef#getIdentifiable_target()
	 * @see #getRealization_realizedByInstanceRef()
	 * @generated
	 */
	EReference getRealization_realizedByInstanceRef_Identifiable_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef#getIdentifiable_context <em>Identifiable context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Identifiable context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef#getIdentifiable_context()
	 * @see #getRealization_realizedByInstanceRef()
	 * @generated
	 */
	EReference getRealization_realizedByInstanceRef_Identifiable_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionInstanceRef <em>Event Function Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Event Function Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.EventFunctionInstanceRef
	 * @generated
	 */
	EClass getEventFunctionInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionInstanceRef#getFunctionPrototype_target <em>Function Prototype target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Function Prototype target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.EventFunctionInstanceRef#getFunctionPrototype_target()
	 * @see #getEventFunctionInstanceRef()
	 * @generated
	 */
	EReference getEventFunctionInstanceRef_FunctionPrototype_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionInstanceRef#getFunctionPrototype_context <em>Function Prototype context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Function Prototype context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.EventFunctionInstanceRef#getFunctionPrototype_context()
	 * @see #getEventFunctionInstanceRef()
	 * @generated
	 */
	EReference getEventFunctionInstanceRef_FunctionPrototype_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef <em>Event Function Client Server Port Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Event Function Client Server Port Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef
	 * @generated
	 */
	EClass getEventFunctionClientServerPortInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef#getFunctionClientServerPort <em>Function Client Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Function Client Server Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef#getFunctionClientServerPort()
	 * @see #getEventFunctionClientServerPortInstanceRef()
	 * @generated
	 */
	EReference getEventFunctionClientServerPortInstanceRef_FunctionClientServerPort();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef#getFunctionPrototype <em>Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Function Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef#getFunctionPrototype()
	 * @see #getEventFunctionClientServerPortInstanceRef()
	 * @generated
	 */
	EReference getEventFunctionClientServerPortInstanceRef_FunctionPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef <em>Event Function Flow Port Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Event Function Flow Port Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef
	 * @generated
	 */
	EClass getEventFunctionFlowPortInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef#getFunctionFlowPort <em>Function Flow Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Function Flow Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef#getFunctionFlowPort()
	 * @see #getEventFunctionFlowPortInstanceRef()
	 * @generated
	 */
	EReference getEventFunctionFlowPortInstanceRef_FunctionFlowPort();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef#getFunctionPrototype <em>Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Function Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef#getFunctionPrototype()
	 * @see #getEventFunctionFlowPortInstanceRef()
	 * @generated
	 */
	EReference getEventFunctionFlowPortInstanceRef_FunctionPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef <em>Precedence Constraint preceding Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Precedence Constraint preceding Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef
	 * @generated
	 */
	EClass getPrecedenceConstraint_precedingInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef#getFunctionPrototype_target <em>Function Prototype target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Function Prototype target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef#getFunctionPrototype_target()
	 * @see #getPrecedenceConstraint_precedingInstanceRef()
	 * @generated
	 */
	EReference getPrecedenceConstraint_precedingInstanceRef_FunctionPrototype_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef#getFunctionPrototype_context <em>Function Prototype context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Function Prototype context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef#getFunctionPrototype_context()
	 * @see #getPrecedenceConstraint_precedingInstanceRef()
	 * @generated
	 */
	EReference getPrecedenceConstraint_precedingInstanceRef_FunctionPrototype_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef <em>Precedence Constraint successive Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Precedence Constraint successive Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef
	 * @generated
	 */
	EClass getPrecedenceConstraint_successiveInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef#getFunctionPrototype_target <em>Function Prototype target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Function Prototype target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef#getFunctionPrototype_target()
	 * @see #getPrecedenceConstraint_successiveInstanceRef()
	 * @generated
	 */
	EReference getPrecedenceConstraint_successiveInstanceRef_FunctionPrototype_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef#getFunctionPrototype_context <em>Function Prototype context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Function Prototype context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef#getFunctionPrototype_context()
	 * @see #getPrecedenceConstraint_successiveInstanceRef()
	 * @generated
	 */
	EReference getPrecedenceConstraint_successiveInstanceRef_FunctionPrototype_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef <em>Error Model Prototype function Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Error Model Prototype function Target Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef
	 * @generated
	 */
	EClass getErrorModelPrototype_functionTargetInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef#getFunctionPrototype <em>Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Function Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef#getFunctionPrototype()
	 * @see #getErrorModelPrototype_functionTargetInstanceRef()
	 * @generated
	 */
	EReference getErrorModelPrototype_functionTargetInstanceRef_FunctionPrototype();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef#getFunctionPrototype_context <em>Function Prototype context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Function Prototype context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef#getFunctionPrototype_context()
	 * @see #getErrorModelPrototype_functionTargetInstanceRef()
	 * @generated
	 */
	EReference getErrorModelPrototype_functionTargetInstanceRef_FunctionPrototype_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef <em>Error Model Prototype hw Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Error Model Prototype hw Target Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef
	 * @generated
	 */
	EClass getErrorModelPrototype_hwTargetInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef#getHardwareComponentProtype <em>Hardware Component Protype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Hardware Component Protype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef#getHardwareComponentProtype()
	 * @see #getErrorModelPrototype_hwTargetInstanceRef()
	 * @generated
	 */
	EReference getErrorModelPrototype_hwTargetInstanceRef_HardwareComponentProtype();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef#getHardwareComponentProtype_context <em>Hardware Component Protype context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Hardware Component Protype context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef#getHardwareComponentProtype_context()
	 * @see #getErrorModelPrototype_hwTargetInstanceRef()
	 * @generated
	 */
	EReference getErrorModelPrototype_hwTargetInstanceRef_HardwareComponentProtype_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef <em>Fault Failure Port hw Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Fault Failure Port hw Target Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef
	 * @generated
	 */
	EClass getFaultFailurePort_hwTargetInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef#getHardwarePort <em>Hardware Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Hardware Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef#getHardwarePort()
	 * @see #getFaultFailurePort_hwTargetInstanceRef()
	 * @generated
	 */
	EReference getFaultFailurePort_hwTargetInstanceRef_HardwarePort();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef#getHardwareComponentProtype <em>Hardware Component Protype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Hardware Component Protype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef#getHardwareComponentProtype()
	 * @see #getFaultFailurePort_hwTargetInstanceRef()
	 * @generated
	 */
	EReference getFaultFailurePort_hwTargetInstanceRef_HardwareComponentProtype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef <em>Fault Failure Port function Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Fault Failure Port function Target Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef
	 * @generated
	 */
	EClass getFaultFailurePort_functionTargetInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef#getFunctionPort <em>Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Function Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef#getFunctionPort()
	 * @see #getFaultFailurePort_functionTargetInstanceRef()
	 * @generated
	 */
	EReference getFaultFailurePort_functionTargetInstanceRef_FunctionPort();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef#getFunctionPrototype <em>Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Function Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef#getFunctionPrototype()
	 * @see #getFaultFailurePort_functionTargetInstanceRef()
	 * @generated
	 */
	EReference getFaultFailurePort_functionTargetInstanceRef_FunctionPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_fromPortInstanceRef <em>Fault Failure Propagation Link from Port Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Fault Failure Propagation Link from Port Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_fromPortInstanceRef
	 * @generated
	 */
	EClass getFaultFailurePropagationLink_fromPortInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_fromPortInstanceRef#getFaultFairelurePort <em>Fault Fairelure Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Fault Fairelure Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_fromPortInstanceRef#getFaultFairelurePort()
	 * @see #getFaultFailurePropagationLink_fromPortInstanceRef()
	 * @generated
	 */
	EReference getFaultFailurePropagationLink_fromPortInstanceRef_FaultFairelurePort();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_fromPortInstanceRef#getErrorModelPrototype <em>Error Model Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Error Model Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_fromPortInstanceRef#getErrorModelPrototype()
	 * @see #getFaultFailurePropagationLink_fromPortInstanceRef()
	 * @generated
	 */
	EReference getFaultFailurePropagationLink_fromPortInstanceRef_ErrorModelPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef <em>Fault Failure anomaly Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Fault Failure anomaly Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef
	 * @generated
	 */
	EClass getFaultFailure_anomalyInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef#getAnomaly <em>Anomaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Anomaly</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef#getAnomaly()
	 * @see #getFaultFailure_anomalyInstanceRef()
	 * @generated
	 */
	EReference getFaultFailure_anomalyInstanceRef_Anomaly();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef#getErrorModelPrototype <em>Error Model Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Error Model Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef#getErrorModelPrototype()
	 * @see #getFaultFailure_anomalyInstanceRef()
	 * @generated
	 */
	EReference getFaultFailure_anomalyInstanceRef_ErrorModelPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef <em>Fault Failure Propagation Link to Port Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Fault Failure Propagation Link to Port Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef
	 * @generated
	 */
	EClass getFaultFailurePropagationLink_toPortInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef#getFaultFairelurePort <em>Fault Fairelure Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Fault Fairelure Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef#getFaultFairelurePort()
	 * @see #getFaultFailurePropagationLink_toPortInstanceRef()
	 * @generated
	 */
	EReference getFaultFailurePropagationLink_toPortInstanceRef_FaultFairelurePort();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef#getErrorModelPrototype <em>Error Model Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Error Model Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef#getErrorModelPrototype()
	 * @see #getFaultFailurePropagationLink_toPortInstanceRef()
	 * @generated
	 */
	EReference getFaultFailurePropagationLink_toPortInstanceRef_ErrorModelPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef <em>Behavior Constraint Internal Binding through Function Connector Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Behavior Constraint Internal Binding through Function Connector Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef
	 * @generated
	 */
	EClass getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef#getFunctionConnector <em>Function Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Function Connector</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef#getFunctionConnector()
	 * @see #getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef()
	 * @generated
	 */
	EReference getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef_FunctionConnector();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef#getFunctionPrototype <em>Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Function Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef#getFunctionPrototype()
	 * @see #getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef()
	 * @generated
	 */
	EReference getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef_FunctionPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef <em>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Behavior Constraint Internal Binding through Hardware Connector Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef
	 * @generated
	 */
	EClass getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef#getHardwareConnector <em>Hardware Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Hardware Connector</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef#getHardwareConnector()
	 * @see #getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef()
	 * @generated
	 */
	EReference getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef_HardwareConnector();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Hardware Component Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef#getHardwareComponentPrototype()
	 * @see #getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef()
	 * @generated
	 */
	EReference getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef_HardwareComponentPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef <em>Behavior Constraint Prototype function Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Behavior Constraint Prototype function Target Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef
	 * @generated
	 */
	EClass getBehaviorConstraintPrototype_functionTargetInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef#getFunctionPrototype_target <em>Function Prototype target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Function Prototype target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef#getFunctionPrototype_target()
	 * @see #getBehaviorConstraintPrototype_functionTargetInstanceRef()
	 * @generated
	 */
	EReference getBehaviorConstraintPrototype_functionTargetInstanceRef_FunctionPrototype_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef#getFunctionPrototype_context <em>Function Prototype context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Function Prototype context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef#getFunctionPrototype_context()
	 * @see #getBehaviorConstraintPrototype_functionTargetInstanceRef()
	 * @generated
	 */
	EReference getBehaviorConstraintPrototype_functionTargetInstanceRef_FunctionPrototype_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef <em>Behavior Constraint Prototype hardware Component Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Behavior Constraint Prototype hardware Component Target Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef
	 * @generated
	 */
	EClass getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef#getHardwareComponentProtype_target <em>Hardware Component Protype target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Hardware Component Protype target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef#getHardwareComponentProtype_target()
	 * @see #getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef()
	 * @generated
	 */
	EReference getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef_HardwareComponentProtype_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef#getHardwareComponentPrototype_context <em>Hardware Component Prototype context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Hardware Component Prototype context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef#getHardwareComponentPrototype_context()
	 * @see #getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef()
	 * @generated
	 */
	EReference getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef_HardwareComponentPrototype_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef <em>Behavior Constraint Prototype error Model Target Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Behavior Constraint Prototype error Model Target Instance Ref</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef
	 * @generated
	 */
	EClass getBehaviorConstraintPrototype_errorModelTargetInstanceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef#getErrorModelPrototype_target <em>Error Model Prototype target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Error Model Prototype target</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef#getErrorModelPrototype_target()
	 * @see #getBehaviorConstraintPrototype_errorModelTargetInstanceRef()
	 * @generated
	 */
	EReference getBehaviorConstraintPrototype_errorModelTargetInstanceRef_ErrorModelPrototype_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef#getErrorModelPrototype_context <em>Error Model Prototype context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Error Model Prototype context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef#getErrorModelPrototype_context()
	 * @see #getBehaviorConstraintPrototype_errorModelTargetInstanceRef()
	 * @generated
	 */
	EReference getBehaviorConstraintPrototype_errorModelTargetInstanceRef_ErrorModelPrototype_context();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for data type '<em>Dummy</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getDummy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfrastructureFactory getInfrastructureFactory();

} // InfrastructurePackage
