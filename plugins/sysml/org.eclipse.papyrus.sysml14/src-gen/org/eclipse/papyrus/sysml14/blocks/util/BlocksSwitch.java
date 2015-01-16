/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.blocks.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.sysml14.blocks.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage
 * @generated
 */
public class BlocksSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BlocksPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlocksSwitch() {
		if (modelPackage == null) {
			modelPackage = BlocksPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BlocksPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.DISTRIBUTED_PROPERTY: {
				DistributedProperty distributedProperty = (DistributedProperty)theEObject;
				T result = caseDistributedProperty(distributedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.CONNECTOR_PROPERTY: {
				ConnectorProperty connectorProperty = (ConnectorProperty)theEObject;
				T result = caseConnectorProperty(connectorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.PARTICIPANT_PROPERTY: {
				ParticipantProperty participantProperty = (ParticipantProperty)theEObject;
				T result = caseParticipantProperty(participantProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.BINDING_CONNECTOR: {
				BindingConnector bindingConnector = (BindingConnector)theEObject;
				T result = caseBindingConnector(bindingConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.PROPERTY_SPECIFIC_TYPE: {
				PropertySpecificType propertySpecificType = (PropertySpecificType)theEObject;
				T result = casePropertySpecificType(propertySpecificType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.NESTED_CONNECTOR_END: {
				NestedConnectorEnd nestedConnectorEnd = (NestedConnectorEnd)theEObject;
				T result = caseNestedConnectorEnd(nestedConnectorEnd);
				if (result == null) result = caseElementPropertyPath(nestedConnectorEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.ELEMENT_PROPERTY_PATH: {
				ElementPropertyPath elementPropertyPath = (ElementPropertyPath)theEObject;
				T result = caseElementPropertyPath(elementPropertyPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH: {
				DirectedRelationshipPropertyPath directedRelationshipPropertyPath = (DirectedRelationshipPropertyPath)theEObject;
				T result = caseDirectedRelationshipPropertyPath(directedRelationshipPropertyPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.END_PATH_MULTIPLICITY: {
				EndPathMultiplicity endPathMultiplicity = (EndPathMultiplicity)theEObject;
				T result = caseEndPathMultiplicity(endPathMultiplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.BOUND_REFERENCE: {
				BoundReference boundReference = (BoundReference)theEObject;
				T result = caseBoundReference(boundReference);
				if (result == null) result = caseEndPathMultiplicity(boundReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.ADJUNCT_PROPERTY: {
				AdjunctProperty adjunctProperty = (AdjunctProperty)theEObject;
				T result = caseAdjunctProperty(adjunctProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlocksPackage.CLASSIFIER_BEHAVIOR_PROPERTY: {
				ClassifierBehaviorProperty classifierBehaviorProperty = (ClassifierBehaviorProperty)theEObject;
				T result = caseClassifierBehaviorProperty(classifierBehaviorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distributed Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distributed Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributedProperty(DistributedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorProperty(ConnectorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantProperty(ParticipantProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingConnector(BindingConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Specific Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Specific Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertySpecificType(PropertySpecificType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Connector End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedConnectorEnd(NestedConnectorEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Property Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Property Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementPropertyPath(ElementPropertyPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Relationship Property Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Relationship Property Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedRelationshipPropertyPath(DirectedRelationshipPropertyPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Path Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Path Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPathMultiplicity(EndPathMultiplicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundReference(BoundReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adjunct Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adjunct Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjunctProperty(AdjunctProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Behavior Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Behavior Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierBehaviorProperty(ClassifierBehaviorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BlocksSwitch
