/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.deprecatedelements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeprecatedElements'"
 * @generated
 */
public interface DeprecatedelementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deprecatedelements"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/1.4/SysML/DeprecatedElements"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DeprecatedElements"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeprecatedelementsPackage eINSTANCE = org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.FlowPortImpl <em>Flow Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.FlowPortImpl
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl#getFlowPort()
	 * @generated
	 */
	int FLOW_PORT = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__BASE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__IS_ATOMIC = 2;

	/**
	 * The number of structural features of the '<em>Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.FlowSpecificationImpl <em>Flow Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.FlowSpecificationImpl
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl#getFlowSpecification()
	 * @generated
	 */
	int FLOW_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION__BASE_INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Flow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Flow Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.AllocatedImpl <em>Allocated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.AllocatedImpl
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl#getAllocated()
	 * @generated
	 */
	int ALLOCATED = 2;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Allocated From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED__ALLOCATED_FROM = 1;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED__ALLOCATED_TO = 2;

	/**
	 * The number of structural features of the '<em>Allocated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Allocated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.RequirementRelatedImpl <em>Requirement Related</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.RequirementRelatedImpl
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl#getRequirementRelated()
	 * @generated
	 */
	int REQUIREMENT_RELATED = 3;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATED__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Traced From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATED__TRACED_FROM = 1;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATED__SATISFIES = 2;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATED__REFINES = 3;

	/**
	 * The feature id for the '<em><b>Verifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATED__VERIFIES = 4;

	/**
	 * The number of structural features of the '<em>Requirement Related</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATED_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Requirement Related</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedImpl <em>Deprecated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedImpl
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl#getDeprecated()
	 * @generated
	 */
	int DEPRECATED = 4;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED__BASE_VALUE_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED__BASE_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED__BASE_INSTANCE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED__BASE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED__BASE_ASSOCIATION = 4;

	/**
	 * The feature id for the '<em><b>Deprecated Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED__DEPRECATED_REASON = 5;

	/**
	 * The feature id for the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED__BASE_GENERALIZATION = 6;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED__BASE_DATA_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Deprecated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Deprecated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.deprecatedelements.FlowPort <em>Flow Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Port</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.FlowPort
	 * @generated
	 */
	EClass getFlowPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.deprecatedelements.FlowPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.FlowPort#getBase_Port()
	 * @see #getFlowPort()
	 * @generated
	 */
	EReference getFlowPort_Base_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml14.deprecatedelements.FlowPort#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.FlowPort#getDirection()
	 * @see #getFlowPort()
	 * @generated
	 */
	EAttribute getFlowPort_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml14.deprecatedelements.FlowPort#isAtomic <em>Is Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Atomic</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.FlowPort#isAtomic()
	 * @see #getFlowPort()
	 * @generated
	 */
	EAttribute getFlowPort_IsAtomic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.deprecatedelements.FlowSpecification <em>Flow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Specification</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.FlowSpecification
	 * @generated
	 */
	EClass getFlowSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.deprecatedelements.FlowSpecification#getBase_Interface <em>Base Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interface</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.FlowSpecification#getBase_Interface()
	 * @see #getFlowSpecification()
	 * @generated
	 */
	EReference getFlowSpecification_Base_Interface();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Allocated <em>Allocated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocated</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Allocated
	 * @generated
	 */
	EClass getAllocated();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Allocated#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Allocated#getBase_NamedElement()
	 * @see #getAllocated()
	 * @generated
	 */
	EReference getAllocated_Base_NamedElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Allocated#getAllocatedFrom <em>Allocated From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated From</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Allocated#getAllocatedFrom()
	 * @see #getAllocated()
	 * @generated
	 */
	EReference getAllocated_AllocatedFrom();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Allocated#getAllocatedTo <em>Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated To</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Allocated#getAllocatedTo()
	 * @see #getAllocated()
	 * @generated
	 */
	EReference getAllocated_AllocatedTo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated <em>Requirement Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Related</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated
	 * @generated
	 */
	EClass getRequirementRelated();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getBase_NamedElement()
	 * @see #getRequirementRelated()
	 * @generated
	 */
	EReference getRequirementRelated_Base_NamedElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getTracedFrom <em>Traced From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traced From</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getTracedFrom()
	 * @see #getRequirementRelated()
	 * @generated
	 */
	EReference getRequirementRelated_TracedFrom();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfies</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getSatisfies()
	 * @see #getRequirementRelated()
	 * @generated
	 */
	EReference getRequirementRelated_Satisfies();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refines</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getRefines()
	 * @see #getRequirementRelated()
	 * @generated
	 */
	EReference getRequirementRelated_Refines();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getVerifies <em>Verifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verifies</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getVerifies()
	 * @see #getRequirementRelated()
	 * @generated
	 */
	EReference getRequirementRelated_Verifies();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deprecated</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated
	 * @generated
	 */
	EClass getDeprecated();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_ValueSpecification <em>Base Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Value Specification</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_ValueSpecification()
	 * @see #getDeprecated()
	 * @generated
	 */
	EReference getDeprecated_Base_ValueSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_Property()
	 * @see #getDeprecated()
	 * @generated
	 */
	EReference getDeprecated_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_InstanceSpecification <em>Base Instance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Instance Specification</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_InstanceSpecification()
	 * @see #getDeprecated()
	 * @generated
	 */
	EReference getDeprecated_Base_InstanceSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_Class()
	 * @see #getDeprecated()
	 * @generated
	 */
	EReference getDeprecated_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_Association()
	 * @see #getDeprecated()
	 * @generated
	 */
	EReference getDeprecated_Base_Association();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getDeprecatedReason <em>Deprecated Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deprecated Reason</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getDeprecatedReason()
	 * @see #getDeprecated()
	 * @generated
	 */
	EAttribute getDeprecated_DeprecatedReason();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_Generalization <em>Base Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Generalization</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_Generalization()
	 * @see #getDeprecated()
	 * @generated
	 */
	EReference getDeprecated_Base_Generalization();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.Deprecated#getBase_DataType()
	 * @see #getDeprecated()
	 * @generated
	 */
	EReference getDeprecated_Base_DataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeprecatedelementsFactory getDeprecatedelementsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.FlowPortImpl <em>Flow Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.FlowPortImpl
		 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl#getFlowPort()
		 * @generated
		 */
		EClass FLOW_PORT = eINSTANCE.getFlowPort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_PORT__BASE_PORT = eINSTANCE.getFlowPort_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_PORT__DIRECTION = eINSTANCE.getFlowPort_Direction();

		/**
		 * The meta object literal for the '<em><b>Is Atomic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_PORT__IS_ATOMIC = eINSTANCE.getFlowPort_IsAtomic();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.FlowSpecificationImpl <em>Flow Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.FlowSpecificationImpl
		 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl#getFlowSpecification()
		 * @generated
		 */
		EClass FLOW_SPECIFICATION = eINSTANCE.getFlowSpecification();

		/**
		 * The meta object literal for the '<em><b>Base Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SPECIFICATION__BASE_INTERFACE = eINSTANCE.getFlowSpecification_Base_Interface();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.AllocatedImpl <em>Allocated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.AllocatedImpl
		 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl#getAllocated()
		 * @generated
		 */
		EClass ALLOCATED = eINSTANCE.getAllocated();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATED__BASE_NAMED_ELEMENT = eINSTANCE.getAllocated_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Allocated From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATED__ALLOCATED_FROM = eINSTANCE.getAllocated_AllocatedFrom();

		/**
		 * The meta object literal for the '<em><b>Allocated To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATED__ALLOCATED_TO = eINSTANCE.getAllocated_AllocatedTo();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.RequirementRelatedImpl <em>Requirement Related</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.RequirementRelatedImpl
		 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl#getRequirementRelated()
		 * @generated
		 */
		EClass REQUIREMENT_RELATED = eINSTANCE.getRequirementRelated();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_RELATED__BASE_NAMED_ELEMENT = eINSTANCE.getRequirementRelated_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Traced From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_RELATED__TRACED_FROM = eINSTANCE.getRequirementRelated_TracedFrom();

		/**
		 * The meta object literal for the '<em><b>Satisfies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_RELATED__SATISFIES = eINSTANCE.getRequirementRelated_Satisfies();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_RELATED__REFINES = eINSTANCE.getRequirementRelated_Refines();

		/**
		 * The meta object literal for the '<em><b>Verifies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_RELATED__VERIFIES = eINSTANCE.getRequirementRelated_Verifies();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedImpl <em>Deprecated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedImpl
		 * @see org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl#getDeprecated()
		 * @generated
		 */
		EClass DEPRECATED = eINSTANCE.getDeprecated();

		/**
		 * The meta object literal for the '<em><b>Base Value Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPRECATED__BASE_VALUE_SPECIFICATION = eINSTANCE.getDeprecated_Base_ValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPRECATED__BASE_PROPERTY = eINSTANCE.getDeprecated_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Base Instance Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPRECATED__BASE_INSTANCE_SPECIFICATION = eINSTANCE.getDeprecated_Base_InstanceSpecification();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPRECATED__BASE_CLASS = eINSTANCE.getDeprecated_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPRECATED__BASE_ASSOCIATION = eINSTANCE.getDeprecated_Base_Association();

		/**
		 * The meta object literal for the '<em><b>Deprecated Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPRECATED__DEPRECATED_REASON = eINSTANCE.getDeprecated_DeprecatedReason();

		/**
		 * The meta object literal for the '<em><b>Base Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPRECATED__BASE_GENERALIZATION = eINSTANCE.getDeprecated_Base_Generalization();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPRECATED__BASE_DATA_TYPE = eINSTANCE.getDeprecated_Base_DataType();

	}

} //DeprecatedelementsPackage
