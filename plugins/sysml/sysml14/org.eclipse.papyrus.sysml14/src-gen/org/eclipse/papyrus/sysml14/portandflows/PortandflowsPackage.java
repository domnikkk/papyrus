/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.portandflows;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;

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
 * @see org.eclipse.papyrus.sysml14.portandflows.PortandflowsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PortsandFlows'"
 * @generated
 */
public interface PortandflowsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "portandflows"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/1.4/SysML/PortAndFlows"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PortAndFlows"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PortandflowsPackage eINSTANCE = org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.ItemFlowImpl <em>Item Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.ItemFlowImpl
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getItemFlow()
	 * @generated
	 */
	int ITEM_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Base Information Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__BASE_INFORMATION_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Item Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__ITEM_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Item Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.FlowPropertyImpl <em>Flow Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.FlowPropertyImpl
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getFlowProperty()
	 * @generated
	 */
	int FLOW_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PROPERTY__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PROPERTY__DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>Flow Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flow Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.FullPortImpl <em>Full Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.FullPortImpl
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getFullPort()
	 * @generated
	 */
	int FULL_PORT = 2;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PORT__BASE_PORT = 0;

	/**
	 * The number of structural features of the '<em>Full Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Full Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.InterfaceBlockImpl <em>Interface Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.InterfaceBlockImpl
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getInterfaceBlock()
	 * @generated
	 */
	int INTERFACE_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BLOCK__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BLOCK__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Interface Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BLOCK_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_BLOCK_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.ProxyPortImpl <em>Proxy Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.ProxyPortImpl
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getProxyPort()
	 * @generated
	 */
	int PROXY_PORT = 4;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_PORT__BASE_PORT = 0;

	/**
	 * The number of structural features of the '<em>Proxy Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Proxy Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.AcceptChangeStructuralFeatureEventActionImpl <em>Accept Change Structural Feature Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.AcceptChangeStructuralFeatureEventActionImpl
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getAcceptChangeStructuralFeatureEventAction()
	 * @generated
	 */
	int ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Base Accept Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION__BASE_ACCEPT_EVENT_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Accept Change Structural Feature Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Accept Change Structural Feature Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.ChangeStructuralFeatureEventImpl <em>Change Structural Feature Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.ChangeStructuralFeatureEventImpl
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getChangeStructuralFeatureEvent()
	 * @generated
	 */
	int CHANGE_STRUCTURAL_FEATURE_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Base Change Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_STRUCTURAL_FEATURE_EVENT__BASE_CHANGE_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_STRUCTURAL_FEATURE_EVENT__STRUCTURAL_FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Change Structural Feature Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_STRUCTURAL_FEATURE_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Change Structural Feature Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_STRUCTURAL_FEATURE_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.DirectedFeatureImpl <em>Directed Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.DirectedFeatureImpl
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getDirectedFeature()
	 * @generated
	 */
	int DIRECTED_FEATURE = 7;

	/**
	 * The feature id for the '<em><b>Base Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__BASE_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Feature Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__FEATURE_DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>Directed Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Directed Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.InvocationOnNestedPortActionImpl <em>Invocation On Nested Port Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.InvocationOnNestedPortActionImpl
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getInvocationOnNestedPortAction()
	 * @generated
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION__BASE_ELEMENT = BlocksPackage.ELEMENT_PROPERTY_PATH__BASE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION__PROPERTY_PATH = BlocksPackage.ELEMENT_PROPERTY_PATH__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Invocation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION__BASE_INVOCATION_ACTION = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Nested Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION__ON_NESTED_PORT = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Invocation On Nested Port Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION_FEATURE_COUNT = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Invocation On Nested Port Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ON_NESTED_PORT_ACTION_OPERATION_COUNT = BlocksPackage.ELEMENT_PROPERTY_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.TriggerOnNestedPortImpl <em>Trigger On Nested Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.TriggerOnNestedPortImpl
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getTriggerOnNestedPort()
	 * @generated
	 */
	int TRIGGER_ON_NESTED_PORT = 9;

	/**
	 * The feature id for the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ON_NESTED_PORT__BASE_ELEMENT = BlocksPackage.ELEMENT_PROPERTY_PATH__BASE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ON_NESTED_PORT__PROPERTY_PATH = BlocksPackage.ELEMENT_PROPERTY_PATH__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ON_NESTED_PORT__BASE_TRIGGER = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Nested Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ON_NESTED_PORT__ON_NESTED_PORT = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trigger On Nested Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ON_NESTED_PORT_FEATURE_COUNT = BlocksPackage.ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trigger On Nested Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_ON_NESTED_PORT_OPERATION_COUNT = BlocksPackage.ELEMENT_PROPERTY_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.portandflows.FlowDirection <em>Flow Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.portandflows.FlowDirection
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getFlowDirection()
	 * @generated
	 */
	int FLOW_DIRECTION = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.portandflows.FeatureDirection <em>Feature Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.portandflows.FeatureDirection
	 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getFeatureDirection()
	 * @generated
	 */
	int FEATURE_DIRECTION = 11;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.portandflows.ItemFlow <em>Item Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Flow</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.ItemFlow
	 * @generated
	 */
	EClass getItemFlow();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.portandflows.ItemFlow#getBase_InformationFlow <em>Base Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Information Flow</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.ItemFlow#getBase_InformationFlow()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_Base_InformationFlow();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.portandflows.ItemFlow#getItemProperty <em>Item Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.ItemFlow#getItemProperty()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_ItemProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.portandflows.FlowProperty <em>Flow Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.FlowProperty
	 * @generated
	 */
	EClass getFlowProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.portandflows.FlowProperty#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.FlowProperty#getBase_Property()
	 * @see #getFlowProperty()
	 * @generated
	 */
	EReference getFlowProperty_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml14.portandflows.FlowProperty#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.FlowProperty#getDirection()
	 * @see #getFlowProperty()
	 * @generated
	 */
	EAttribute getFlowProperty_Direction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.portandflows.FullPort <em>Full Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Port</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.FullPort
	 * @generated
	 */
	EClass getFullPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.portandflows.FullPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.FullPort#getBase_Port()
	 * @see #getFullPort()
	 * @generated
	 */
	EReference getFullPort_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.portandflows.InterfaceBlock <em>Interface Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Block</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.InterfaceBlock
	 * @generated
	 */
	EClass getInterfaceBlock();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.portandflows.ProxyPort <em>Proxy Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Port</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.ProxyPort
	 * @generated
	 */
	EClass getProxyPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.portandflows.ProxyPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.ProxyPort#getBase_Port()
	 * @see #getProxyPort()
	 * @generated
	 */
	EReference getProxyPort_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.portandflows.AcceptChangeStructuralFeatureEventAction <em>Accept Change Structural Feature Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Change Structural Feature Event Action</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.AcceptChangeStructuralFeatureEventAction
	 * @generated
	 */
	EClass getAcceptChangeStructuralFeatureEventAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.portandflows.AcceptChangeStructuralFeatureEventAction#getBase_AcceptEventAction <em>Base Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Accept Event Action</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.AcceptChangeStructuralFeatureEventAction#getBase_AcceptEventAction()
	 * @see #getAcceptChangeStructuralFeatureEventAction()
	 * @generated
	 */
	EReference getAcceptChangeStructuralFeatureEventAction_Base_AcceptEventAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.portandflows.ChangeStructuralFeatureEvent <em>Change Structural Feature Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Structural Feature Event</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.ChangeStructuralFeatureEvent
	 * @generated
	 */
	EClass getChangeStructuralFeatureEvent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.portandflows.ChangeStructuralFeatureEvent#getBase_ChangeEvent <em>Base Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Change Event</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.ChangeStructuralFeatureEvent#getBase_ChangeEvent()
	 * @see #getChangeStructuralFeatureEvent()
	 * @generated
	 */
	EReference getChangeStructuralFeatureEvent_Base_ChangeEvent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.portandflows.ChangeStructuralFeatureEvent#getStructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structural Feature</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.ChangeStructuralFeatureEvent#getStructuralFeature()
	 * @see #getChangeStructuralFeatureEvent()
	 * @generated
	 */
	EReference getChangeStructuralFeatureEvent_StructuralFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.portandflows.DirectedFeature <em>Directed Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Feature</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.DirectedFeature
	 * @generated
	 */
	EClass getDirectedFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.portandflows.DirectedFeature#getBase_Feature <em>Base Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Feature</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.DirectedFeature#getBase_Feature()
	 * @see #getDirectedFeature()
	 * @generated
	 */
	EReference getDirectedFeature_Base_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml14.portandflows.DirectedFeature#getFeatureDirection <em>Feature Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Direction</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.DirectedFeature#getFeatureDirection()
	 * @see #getDirectedFeature()
	 * @generated
	 */
	EAttribute getDirectedFeature_FeatureDirection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.portandflows.InvocationOnNestedPortAction <em>Invocation On Nested Port Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation On Nested Port Action</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.InvocationOnNestedPortAction
	 * @generated
	 */
	EClass getInvocationOnNestedPortAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.portandflows.InvocationOnNestedPortAction#getBase_InvocationAction <em>Base Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Invocation Action</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.InvocationOnNestedPortAction#getBase_InvocationAction()
	 * @see #getInvocationOnNestedPortAction()
	 * @generated
	 */
	EReference getInvocationOnNestedPortAction_Base_InvocationAction();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.portandflows.InvocationOnNestedPortAction#getOnNestedPort <em>On Nested Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Nested Port</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.InvocationOnNestedPortAction#getOnNestedPort()
	 * @see #getInvocationOnNestedPortAction()
	 * @generated
	 */
	EReference getInvocationOnNestedPortAction_OnNestedPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.portandflows.TriggerOnNestedPort <em>Trigger On Nested Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger On Nested Port</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.TriggerOnNestedPort
	 * @generated
	 */
	EClass getTriggerOnNestedPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.portandflows.TriggerOnNestedPort#getBase_Trigger <em>Base Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Trigger</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.TriggerOnNestedPort#getBase_Trigger()
	 * @see #getTriggerOnNestedPort()
	 * @generated
	 */
	EReference getTriggerOnNestedPort_Base_Trigger();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.portandflows.TriggerOnNestedPort#getOnNestedPort <em>On Nested Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Nested Port</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.TriggerOnNestedPort#getOnNestedPort()
	 * @see #getTriggerOnNestedPort()
	 * @generated
	 */
	EReference getTriggerOnNestedPort_OnNestedPort();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.sysml14.portandflows.FlowDirection <em>Flow Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flow Direction</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.FlowDirection
	 * @generated
	 */
	EEnum getFlowDirection();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.sysml14.portandflows.FeatureDirection <em>Feature Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Direction</em>'.
	 * @see org.eclipse.papyrus.sysml14.portandflows.FeatureDirection
	 * @generated
	 */
	EEnum getFeatureDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PortandflowsFactory getPortandflowsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.ItemFlowImpl <em>Item Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.ItemFlowImpl
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getItemFlow()
		 * @generated
		 */
		EClass ITEM_FLOW = eINSTANCE.getItemFlow();

		/**
		 * The meta object literal for the '<em><b>Base Information Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_FLOW__BASE_INFORMATION_FLOW = eINSTANCE.getItemFlow_Base_InformationFlow();

		/**
		 * The meta object literal for the '<em><b>Item Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_FLOW__ITEM_PROPERTY = eINSTANCE.getItemFlow_ItemProperty();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.FlowPropertyImpl <em>Flow Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.FlowPropertyImpl
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getFlowProperty()
		 * @generated
		 */
		EClass FLOW_PROPERTY = eINSTANCE.getFlowProperty();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_PROPERTY__BASE_PROPERTY = eINSTANCE.getFlowProperty_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_PROPERTY__DIRECTION = eINSTANCE.getFlowProperty_Direction();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.FullPortImpl <em>Full Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.FullPortImpl
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getFullPort()
		 * @generated
		 */
		EClass FULL_PORT = eINSTANCE.getFullPort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULL_PORT__BASE_PORT = eINSTANCE.getFullPort_Base_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.InterfaceBlockImpl <em>Interface Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.InterfaceBlockImpl
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getInterfaceBlock()
		 * @generated
		 */
		EClass INTERFACE_BLOCK = eINSTANCE.getInterfaceBlock();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.ProxyPortImpl <em>Proxy Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.ProxyPortImpl
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getProxyPort()
		 * @generated
		 */
		EClass PROXY_PORT = eINSTANCE.getProxyPort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_PORT__BASE_PORT = eINSTANCE.getProxyPort_Base_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.AcceptChangeStructuralFeatureEventActionImpl <em>Accept Change Structural Feature Event Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.AcceptChangeStructuralFeatureEventActionImpl
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getAcceptChangeStructuralFeatureEventAction()
		 * @generated
		 */
		EClass ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION = eINSTANCE.getAcceptChangeStructuralFeatureEventAction();

		/**
		 * The meta object literal for the '<em><b>Base Accept Event Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION__BASE_ACCEPT_EVENT_ACTION = eINSTANCE.getAcceptChangeStructuralFeatureEventAction_Base_AcceptEventAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.ChangeStructuralFeatureEventImpl <em>Change Structural Feature Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.ChangeStructuralFeatureEventImpl
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getChangeStructuralFeatureEvent()
		 * @generated
		 */
		EClass CHANGE_STRUCTURAL_FEATURE_EVENT = eINSTANCE.getChangeStructuralFeatureEvent();

		/**
		 * The meta object literal for the '<em><b>Base Change Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_STRUCTURAL_FEATURE_EVENT__BASE_CHANGE_EVENT = eINSTANCE.getChangeStructuralFeatureEvent_Base_ChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_STRUCTURAL_FEATURE_EVENT__STRUCTURAL_FEATURE = eINSTANCE.getChangeStructuralFeatureEvent_StructuralFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.DirectedFeatureImpl <em>Directed Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.DirectedFeatureImpl
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getDirectedFeature()
		 * @generated
		 */
		EClass DIRECTED_FEATURE = eINSTANCE.getDirectedFeature();

		/**
		 * The meta object literal for the '<em><b>Base Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_FEATURE__BASE_FEATURE = eINSTANCE.getDirectedFeature_Base_Feature();

		/**
		 * The meta object literal for the '<em><b>Feature Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_FEATURE__FEATURE_DIRECTION = eINSTANCE.getDirectedFeature_FeatureDirection();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.InvocationOnNestedPortActionImpl <em>Invocation On Nested Port Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.InvocationOnNestedPortActionImpl
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getInvocationOnNestedPortAction()
		 * @generated
		 */
		EClass INVOCATION_ON_NESTED_PORT_ACTION = eINSTANCE.getInvocationOnNestedPortAction();

		/**
		 * The meta object literal for the '<em><b>Base Invocation Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_ON_NESTED_PORT_ACTION__BASE_INVOCATION_ACTION = eINSTANCE.getInvocationOnNestedPortAction_Base_InvocationAction();

		/**
		 * The meta object literal for the '<em><b>On Nested Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_ON_NESTED_PORT_ACTION__ON_NESTED_PORT = eINSTANCE.getInvocationOnNestedPortAction_OnNestedPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.portandflows.internal.impl.TriggerOnNestedPortImpl <em>Trigger On Nested Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.TriggerOnNestedPortImpl
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getTriggerOnNestedPort()
		 * @generated
		 */
		EClass TRIGGER_ON_NESTED_PORT = eINSTANCE.getTriggerOnNestedPort();

		/**
		 * The meta object literal for the '<em><b>Base Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_ON_NESTED_PORT__BASE_TRIGGER = eINSTANCE.getTriggerOnNestedPort_Base_Trigger();

		/**
		 * The meta object literal for the '<em><b>On Nested Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_ON_NESTED_PORT__ON_NESTED_PORT = eINSTANCE.getTriggerOnNestedPort_OnNestedPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.portandflows.FlowDirection <em>Flow Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.portandflows.FlowDirection
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getFlowDirection()
		 * @generated
		 */
		EEnum FLOW_DIRECTION = eINSTANCE.getFlowDirection();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.portandflows.FeatureDirection <em>Feature Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.portandflows.FeatureDirection
		 * @see org.eclipse.papyrus.sysml14.portandflows.internal.impl.PortandflowsPackageImpl#getFeatureDirection()
		 * @generated
		 */
		EEnum FEATURE_DIRECTION = eINSTANCE.getFeatureDirection();

	}

} //PortandflowsPackage
