/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.blocks.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.sysml14.blocks.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlocksFactoryImpl extends EFactoryImpl implements BlocksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlocksFactory init() {
		try {
			BlocksFactory theBlocksFactory = (BlocksFactory)EPackage.Registry.INSTANCE.getEFactory(BlocksPackage.eNS_URI);
			if (theBlocksFactory != null) {
				return theBlocksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlocksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlocksFactoryImpl() {
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
			case BlocksPackage.VALUE_TYPE: return createValueType();
			case BlocksPackage.DISTRIBUTED_PROPERTY: return createDistributedProperty();
			case BlocksPackage.CONNECTOR_PROPERTY: return createConnectorProperty();
			case BlocksPackage.PARTICIPANT_PROPERTY: return createParticipantProperty();
			case BlocksPackage.BINDING_CONNECTOR: return createBindingConnector();
			case BlocksPackage.BLOCK: return createBlock();
			case BlocksPackage.PROPERTY_SPECIFIC_TYPE: return createPropertySpecificType();
			case BlocksPackage.NESTED_CONNECTOR_END: return createNestedConnectorEnd();
			case BlocksPackage.END_PATH_MULTIPLICITY: return createEndPathMultiplicity();
			case BlocksPackage.BOUND_REFERENCE: return createBoundReference();
			case BlocksPackage.ADJUNCT_PROPERTY: return createAdjunctProperty();
			case BlocksPackage.CLASSIFIER_BEHAVIOR_PROPERTY: return createClassifierBehaviorProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributedProperty createDistributedProperty() {
		DistributedPropertyImpl distributedProperty = new DistributedPropertyImpl();
		return distributedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorProperty createConnectorProperty() {
		ConnectorPropertyImpl connectorProperty = new ConnectorPropertyImpl();
		return connectorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantProperty createParticipantProperty() {
		ParticipantPropertyImpl participantProperty = new ParticipantPropertyImpl();
		return participantProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingConnector createBindingConnector() {
		BindingConnectorImpl bindingConnector = new BindingConnectorImpl();
		return bindingConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertySpecificType createPropertySpecificType() {
		PropertySpecificTypeImpl propertySpecificType = new PropertySpecificTypeImpl();
		return propertySpecificType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedConnectorEnd createNestedConnectorEnd() {
		NestedConnectorEndImpl nestedConnectorEnd = new NestedConnectorEndImpl();
		return nestedConnectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPathMultiplicity createEndPathMultiplicity() {
		EndPathMultiplicityImpl endPathMultiplicity = new EndPathMultiplicityImpl();
		return endPathMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundReference createBoundReference() {
		BoundReferenceImpl boundReference = new BoundReferenceImpl();
		return boundReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjunctProperty createAdjunctProperty() {
		AdjunctPropertyImpl adjunctProperty = new AdjunctPropertyImpl();
		return adjunctProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierBehaviorProperty createClassifierBehaviorProperty() {
		ClassifierBehaviorPropertyImpl classifierBehaviorProperty = new ClassifierBehaviorPropertyImpl();
		return classifierBehaviorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlocksPackage getBlocksPackage() {
		return (BlocksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BlocksPackage getPackage() {
		return BlocksPackage.eINSTANCE;
	}

} //BlocksFactoryImpl
