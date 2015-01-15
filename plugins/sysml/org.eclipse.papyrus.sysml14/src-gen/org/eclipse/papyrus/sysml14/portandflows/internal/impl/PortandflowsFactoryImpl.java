/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.portandflows.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.sysml14.portandflows.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortandflowsFactoryImpl extends EFactoryImpl implements PortandflowsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortandflowsFactory init() {
		try {
			PortandflowsFactory thePortandflowsFactory = (PortandflowsFactory)EPackage.Registry.INSTANCE.getEFactory(PortandflowsPackage.eNS_URI);
			if (thePortandflowsFactory != null) {
				return thePortandflowsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PortandflowsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortandflowsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PortandflowsPackage.ITEM_FLOW: return createItemFlow();
			case PortandflowsPackage.FLOW_PROPERTY: return createFlowProperty();
			case PortandflowsPackage.FULL_PORT: return createFullPort();
			case PortandflowsPackage.INTERFACE_BLOCK: return createInterfaceBlock();
			case PortandflowsPackage.PROXY_PORT: return createProxyPort();
			case PortandflowsPackage.ACCEPT_CHANGE_STRUCTURAL_FEATURE_EVENT_ACTION: return createAcceptChangeStructuralFeatureEventAction();
			case PortandflowsPackage.CHANGE_STRUCTURAL_FEATURE_EVENT: return createChangeStructuralFeatureEvent();
			case PortandflowsPackage.DIRECTED_FEATURE: return createDirectedFeature();
			case PortandflowsPackage.INVOCATION_ON_NESTED_PORT_ACTION: return createInvocationOnNestedPortAction();
			case PortandflowsPackage.TRIGGER_ON_NESTED_PORT: return createTriggerOnNestedPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PortandflowsPackage.FLOW_DIRECTION:
				return createFlowDirectionFromString(eDataType, initialValue);
			case PortandflowsPackage.FEATURE_DIRECTION:
				return createFeatureDirectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PortandflowsPackage.FLOW_DIRECTION:
				return convertFlowDirectionToString(eDataType, instanceValue);
			case PortandflowsPackage.FEATURE_DIRECTION:
				return convertFeatureDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemFlow createItemFlow() {
		ItemFlowImpl itemFlow = new ItemFlowImpl();
		return itemFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowProperty createFlowProperty() {
		FlowPropertyImpl flowProperty = new FlowPropertyImpl();
		return flowProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullPort createFullPort() {
		FullPortImpl fullPort = new FullPortImpl();
		return fullPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceBlock createInterfaceBlock() {
		InterfaceBlockImpl interfaceBlock = new InterfaceBlockImpl();
		return interfaceBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyPort createProxyPort() {
		ProxyPortImpl proxyPort = new ProxyPortImpl();
		return proxyPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptChangeStructuralFeatureEventAction createAcceptChangeStructuralFeatureEventAction() {
		AcceptChangeStructuralFeatureEventActionImpl acceptChangeStructuralFeatureEventAction = new AcceptChangeStructuralFeatureEventActionImpl();
		return acceptChangeStructuralFeatureEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeStructuralFeatureEvent createChangeStructuralFeatureEvent() {
		ChangeStructuralFeatureEventImpl changeStructuralFeatureEvent = new ChangeStructuralFeatureEventImpl();
		return changeStructuralFeatureEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedFeature createDirectedFeature() {
		DirectedFeatureImpl directedFeature = new DirectedFeatureImpl();
		return directedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationOnNestedPortAction createInvocationOnNestedPortAction() {
		InvocationOnNestedPortActionImpl invocationOnNestedPortAction = new InvocationOnNestedPortActionImpl();
		return invocationOnNestedPortAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerOnNestedPort createTriggerOnNestedPort() {
		TriggerOnNestedPortImpl triggerOnNestedPort = new TriggerOnNestedPortImpl();
		return triggerOnNestedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowDirection createFlowDirectionFromString(EDataType eDataType, String initialValue) {
		FlowDirection result = FlowDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDirection createFeatureDirectionFromString(EDataType eDataType, String initialValue) {
		FeatureDirection result = FeatureDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortandflowsPackage getPortandflowsPackage() {
		return (PortandflowsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PortandflowsPackage getPackage() {
		return PortandflowsPackage.eINSTANCE;
	}

} //PortandflowsFactoryImpl
