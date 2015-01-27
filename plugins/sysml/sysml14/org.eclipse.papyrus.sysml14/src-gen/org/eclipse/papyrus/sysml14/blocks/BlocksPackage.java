/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.blocks;

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
 * @see org.eclipse.papyrus.sysml14.blocks.BlocksFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Blocks'"
 * @generated
 */
public interface BlocksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "blocks"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/1.4/SysML/Blocks"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Blocks"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlocksPackage eINSTANCE = org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.ValueTypeImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__BASE_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Quantity Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__QUANTITY_KIND = 2;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.DistributedPropertyImpl <em>Distributed Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.DistributedPropertyImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getDistributedProperty()
	 * @generated
	 */
	int DISTRIBUTED_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_PROPERTY__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Distributed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Distributed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTED_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.ConnectorPropertyImpl <em>Connector Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.ConnectorPropertyImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getConnectorProperty()
	 * @generated
	 */
	int CONNECTOR_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_PROPERTY__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_PROPERTY__CONNECTOR = 1;

	/**
	 * The number of structural features of the '<em>Connector Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connector Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.ParticipantPropertyImpl <em>Participant Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.ParticipantPropertyImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getParticipantProperty()
	 * @generated
	 */
	int PARTICIPANT_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PROPERTY__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PROPERTY__END = 1;

	/**
	 * The number of structural features of the '<em>Participant Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Participant Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.BindingConnectorImpl <em>Binding Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BindingConnectorImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getBindingConnector()
	 * @generated
	 */
	int BINDING_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__BASE_CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>Binding Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binding Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlockImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IS_ENCAPSULATED = 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.PropertySpecificTypeImpl <em>Property Specific Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.PropertySpecificTypeImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getPropertySpecificType()
	 * @generated
	 */
	int PROPERTY_SPECIFIC_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFIC_TYPE__BASE_CLASSIFIER = 0;

	/**
	 * The number of structural features of the '<em>Property Specific Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFIC_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Specific Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.ElementPropertyPathImpl <em>Element Property Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.ElementPropertyPathImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getElementPropertyPath()
	 * @generated
	 */
	int ELEMENT_PROPERTY_PATH = 8;

	/**
	 * The feature id for the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROPERTY_PATH__BASE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROPERTY_PATH__PROPERTY_PATH = 1;

	/**
	 * The number of structural features of the '<em>Element Property Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROPERTY_PATH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element Property Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROPERTY_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.NestedConnectorEndImpl <em>Nested Connector End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.NestedConnectorEndImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getNestedConnectorEnd()
	 * @generated
	 */
	int NESTED_CONNECTOR_END = 7;

	/**
	 * The feature id for the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CONNECTOR_END__BASE_ELEMENT = ELEMENT_PROPERTY_PATH__BASE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CONNECTOR_END__PROPERTY_PATH = ELEMENT_PROPERTY_PATH__PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Base Connector End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CONNECTOR_END__BASE_CONNECTOR_END = ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nested Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CONNECTOR_END_FEATURE_COUNT = ELEMENT_PROPERTY_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nested Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CONNECTOR_END_OPERATION_COUNT = ELEMENT_PROPERTY_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.DirectedRelationshipPropertyPathImpl <em>Directed Relationship Property Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.DirectedRelationshipPropertyPathImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getDirectedRelationshipPropertyPath()
	 * @generated
	 */
	int DIRECTED_RELATIONSHIP_PROPERTY_PATH = 9;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH = 1;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH = 2;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT = 4;

	/**
	 * The number of structural features of the '<em>Directed Relationship Property Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_PROPERTY_PATH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Directed Relationship Property Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_PROPERTY_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.EndPathMultiplicityImpl <em>End Path Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.EndPathMultiplicityImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getEndPathMultiplicity()
	 * @generated
	 */
	int END_PATH_MULTIPLICITY = 10;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_MULTIPLICITY__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_MULTIPLICITY__LOWER = 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_MULTIPLICITY__UPPER = 2;

	/**
	 * The number of structural features of the '<em>End Path Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_MULTIPLICITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>End Path Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_MULTIPLICITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.BoundReferenceImpl <em>Bound Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BoundReferenceImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getBoundReference()
	 * @generated
	 */
	int BOUND_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_REFERENCE__BASE_PROPERTY = END_PATH_MULTIPLICITY__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_REFERENCE__LOWER = END_PATH_MULTIPLICITY__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_REFERENCE__UPPER = END_PATH_MULTIPLICITY__UPPER;

	/**
	 * The feature id for the '<em><b>Bound End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_REFERENCE__BOUND_END = END_PATH_MULTIPLICITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_REFERENCE__BINDING_PATH = END_PATH_MULTIPLICITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bound Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_REFERENCE_FEATURE_COUNT = END_PATH_MULTIPLICITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bound Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_REFERENCE_OPERATION_COUNT = END_PATH_MULTIPLICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.AdjunctPropertyImpl <em>Adjunct Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.AdjunctPropertyImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getAdjunctProperty()
	 * @generated
	 */
	int ADJUNCT_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUNCT_PROPERTY__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Principal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUNCT_PROPERTY__PRINCIPAL = 1;

	/**
	 * The number of structural features of the '<em>Adjunct Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUNCT_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Adjunct Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUNCT_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.ClassifierBehaviorPropertyImpl <em>Classifier Behavior Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.ClassifierBehaviorPropertyImpl
	 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getClassifierBehaviorProperty()
	 * @generated
	 */
	int CLASSIFIER_BEHAVIOR_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_BEHAVIOR_PROPERTY__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Classifier Behavior Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_BEHAVIOR_PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Classifier Behavior Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_BEHAVIOR_PROPERTY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.ValueType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ValueType#getBase_DataType()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_Base_DataType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.ValueType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ValueType#getUnit()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_Unit();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.ValueType#getQuantityKind <em>Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Kind</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ValueType#getQuantityKind()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_QuantityKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.DistributedProperty <em>Distributed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distributed Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.DistributedProperty
	 * @generated
	 */
	EClass getDistributedProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.DistributedProperty#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.DistributedProperty#getBase_Property()
	 * @see #getDistributedProperty()
	 * @generated
	 */
	EReference getDistributedProperty_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.ConnectorProperty <em>Connector Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ConnectorProperty
	 * @generated
	 */
	EClass getConnectorProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.ConnectorProperty#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ConnectorProperty#getBase_Property()
	 * @see #getConnectorProperty()
	 * @generated
	 */
	EReference getConnectorProperty_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.ConnectorProperty#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ConnectorProperty#getConnector()
	 * @see #getConnectorProperty()
	 * @generated
	 */
	EReference getConnectorProperty_Connector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.ParticipantProperty <em>Participant Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ParticipantProperty
	 * @generated
	 */
	EClass getParticipantProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.ParticipantProperty#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ParticipantProperty#getBase_Property()
	 * @see #getParticipantProperty()
	 * @generated
	 */
	EReference getParticipantProperty_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.ParticipantProperty#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ParticipantProperty#getEnd()
	 * @see #getParticipantProperty()
	 * @generated
	 */
	EReference getParticipantProperty_End();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.BindingConnector <em>Binding Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Connector</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.BindingConnector
	 * @generated
	 */
	EClass getBindingConnector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.BindingConnector#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.BindingConnector#getBase_Connector()
	 * @see #getBindingConnector()
	 * @generated
	 */
	EReference getBindingConnector_Base_Connector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.Block#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.Block#getBase_Class()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml14.blocks.Block#isEncapsulated <em>Is Encapsulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Encapsulated</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.Block#isEncapsulated()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_IsEncapsulated();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.PropertySpecificType <em>Property Specific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Specific Type</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.PropertySpecificType
	 * @generated
	 */
	EClass getPropertySpecificType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.PropertySpecificType#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.PropertySpecificType#getBase_Classifier()
	 * @see #getPropertySpecificType()
	 * @generated
	 */
	EReference getPropertySpecificType_Base_Classifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.NestedConnectorEnd <em>Nested Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Connector End</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.NestedConnectorEnd
	 * @generated
	 */
	EClass getNestedConnectorEnd();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.NestedConnectorEnd#getBase_ConnectorEnd <em>Base Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector End</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.NestedConnectorEnd#getBase_ConnectorEnd()
	 * @see #getNestedConnectorEnd()
	 * @generated
	 */
	EReference getNestedConnectorEnd_Base_ConnectorEnd();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.ElementPropertyPath <em>Element Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Property Path</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ElementPropertyPath
	 * @generated
	 */
	EClass getElementPropertyPath();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.ElementPropertyPath#getBase_Element <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Element</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ElementPropertyPath#getBase_Element()
	 * @see #getElementPropertyPath()
	 * @generated
	 */
	EReference getElementPropertyPath_Base_Element();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.blocks.ElementPropertyPath#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property Path</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ElementPropertyPath#getPropertyPath()
	 * @see #getElementPropertyPath()
	 * @generated
	 */
	EReference getElementPropertyPath_PropertyPath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath <em>Directed Relationship Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Relationship Property Path</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath
	 * @generated
	 */
	EClass getDirectedRelationshipPropertyPath();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getBase_DirectedRelationship <em>Base Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Directed Relationship</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getBase_DirectedRelationship()
	 * @see #getDirectedRelationshipPropertyPath()
	 * @generated
	 */
	EReference getDirectedRelationshipPropertyPath_Base_DirectedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getSourcePropertyPath <em>Source Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Property Path</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getSourcePropertyPath()
	 * @see #getDirectedRelationshipPropertyPath()
	 * @generated
	 */
	EReference getDirectedRelationshipPropertyPath_SourcePropertyPath();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getTargetPropertyPath <em>Target Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Property Path</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getTargetPropertyPath()
	 * @see #getDirectedRelationshipPropertyPath()
	 * @generated
	 */
	EReference getDirectedRelationshipPropertyPath_TargetPropertyPath();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getSourceContext <em>Source Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Context</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getSourceContext()
	 * @see #getDirectedRelationshipPropertyPath()
	 * @generated
	 */
	EReference getDirectedRelationshipPropertyPath_SourceContext();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getTargetContext <em>Target Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Context</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getTargetContext()
	 * @see #getDirectedRelationshipPropertyPath()
	 * @generated
	 */
	EReference getDirectedRelationshipPropertyPath_TargetContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity <em>End Path Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Path Multiplicity</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity
	 * @generated
	 */
	EClass getEndPathMultiplicity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity#getBase_Property()
	 * @see #getEndPathMultiplicity()
	 * @generated
	 */
	EReference getEndPathMultiplicity_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity#getLower()
	 * @see #getEndPathMultiplicity()
	 * @generated
	 */
	EAttribute getEndPathMultiplicity_Lower();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity#getUpper()
	 * @see #getEndPathMultiplicity()
	 * @generated
	 */
	EAttribute getEndPathMultiplicity_Upper();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.BoundReference <em>Bound Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound Reference</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.BoundReference
	 * @generated
	 */
	EClass getBoundReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.BoundReference#getBoundEnd <em>Bound End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound End</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.BoundReference#getBoundEnd()
	 * @see #getBoundReference()
	 * @generated
	 */
	EReference getBoundReference_BoundEnd();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.blocks.BoundReference#getBindingPath <em>Binding Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binding Path</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.BoundReference#getBindingPath()
	 * @see #getBoundReference()
	 * @generated
	 */
	EReference getBoundReference_BindingPath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.AdjunctProperty <em>Adjunct Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjunct Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.AdjunctProperty
	 * @generated
	 */
	EClass getAdjunctProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.AdjunctProperty#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.AdjunctProperty#getBase_Property()
	 * @see #getAdjunctProperty()
	 * @generated
	 */
	EReference getAdjunctProperty_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.AdjunctProperty#getPrincipal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Principal</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.AdjunctProperty#getPrincipal()
	 * @see #getAdjunctProperty()
	 * @generated
	 */
	EReference getAdjunctProperty_Principal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.blocks.ClassifierBehaviorProperty <em>Classifier Behavior Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Behavior Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ClassifierBehaviorProperty
	 * @generated
	 */
	EClass getClassifierBehaviorProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.blocks.ClassifierBehaviorProperty#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.sysml14.blocks.ClassifierBehaviorProperty#getBase_Property()
	 * @see #getClassifierBehaviorProperty()
	 * @generated
	 */
	EReference getClassifierBehaviorProperty_Base_Property();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BlocksFactory getBlocksFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.ValueTypeImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE__BASE_DATA_TYPE = eINSTANCE.getValueType_Base_DataType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE__UNIT = eINSTANCE.getValueType_Unit();

		/**
		 * The meta object literal for the '<em><b>Quantity Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE__QUANTITY_KIND = eINSTANCE.getValueType_QuantityKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.DistributedPropertyImpl <em>Distributed Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.DistributedPropertyImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getDistributedProperty()
		 * @generated
		 */
		EClass DISTRIBUTED_PROPERTY = eINSTANCE.getDistributedProperty();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTED_PROPERTY__BASE_PROPERTY = eINSTANCE.getDistributedProperty_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.ConnectorPropertyImpl <em>Connector Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.ConnectorPropertyImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getConnectorProperty()
		 * @generated
		 */
		EClass CONNECTOR_PROPERTY = eINSTANCE.getConnectorProperty();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_PROPERTY__BASE_PROPERTY = eINSTANCE.getConnectorProperty_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_PROPERTY__CONNECTOR = eINSTANCE.getConnectorProperty_Connector();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.ParticipantPropertyImpl <em>Participant Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.ParticipantPropertyImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getParticipantProperty()
		 * @generated
		 */
		EClass PARTICIPANT_PROPERTY = eINSTANCE.getParticipantProperty();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_PROPERTY__BASE_PROPERTY = eINSTANCE.getParticipantProperty_Base_Property();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_PROPERTY__END = eINSTANCE.getParticipantProperty_End();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.BindingConnectorImpl <em>Binding Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BindingConnectorImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getBindingConnector()
		 * @generated
		 */
		EClass BINDING_CONNECTOR = eINSTANCE.getBindingConnector();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_CONNECTOR__BASE_CONNECTOR = eINSTANCE.getBindingConnector_Base_Connector();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlockImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__BASE_CLASS = eINSTANCE.getBlock_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Is Encapsulated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__IS_ENCAPSULATED = eINSTANCE.getBlock_IsEncapsulated();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.PropertySpecificTypeImpl <em>Property Specific Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.PropertySpecificTypeImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getPropertySpecificType()
		 * @generated
		 */
		EClass PROPERTY_SPECIFIC_TYPE = eINSTANCE.getPropertySpecificType();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_SPECIFIC_TYPE__BASE_CLASSIFIER = eINSTANCE.getPropertySpecificType_Base_Classifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.NestedConnectorEndImpl <em>Nested Connector End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.NestedConnectorEndImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getNestedConnectorEnd()
		 * @generated
		 */
		EClass NESTED_CONNECTOR_END = eINSTANCE.getNestedConnectorEnd();

		/**
		 * The meta object literal for the '<em><b>Base Connector End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_CONNECTOR_END__BASE_CONNECTOR_END = eINSTANCE.getNestedConnectorEnd_Base_ConnectorEnd();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.ElementPropertyPathImpl <em>Element Property Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.ElementPropertyPathImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getElementPropertyPath()
		 * @generated
		 */
		EClass ELEMENT_PROPERTY_PATH = eINSTANCE.getElementPropertyPath();

		/**
		 * The meta object literal for the '<em><b>Base Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PROPERTY_PATH__BASE_ELEMENT = eINSTANCE.getElementPropertyPath_Base_Element();

		/**
		 * The meta object literal for the '<em><b>Property Path</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PROPERTY_PATH__PROPERTY_PATH = eINSTANCE.getElementPropertyPath_PropertyPath();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.DirectedRelationshipPropertyPathImpl <em>Directed Relationship Property Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.DirectedRelationshipPropertyPathImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getDirectedRelationshipPropertyPath()
		 * @generated
		 */
		EClass DIRECTED_RELATIONSHIP_PROPERTY_PATH = eINSTANCE.getDirectedRelationshipPropertyPath();

		/**
		 * The meta object literal for the '<em><b>Base Directed Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP = eINSTANCE.getDirectedRelationshipPropertyPath_Base_DirectedRelationship();

		/**
		 * The meta object literal for the '<em><b>Source Property Path</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH = eINSTANCE.getDirectedRelationshipPropertyPath_SourcePropertyPath();

		/**
		 * The meta object literal for the '<em><b>Target Property Path</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH = eINSTANCE.getDirectedRelationshipPropertyPath_TargetPropertyPath();

		/**
		 * The meta object literal for the '<em><b>Source Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT = eINSTANCE.getDirectedRelationshipPropertyPath_SourceContext();

		/**
		 * The meta object literal for the '<em><b>Target Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT = eINSTANCE.getDirectedRelationshipPropertyPath_TargetContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.EndPathMultiplicityImpl <em>End Path Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.EndPathMultiplicityImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getEndPathMultiplicity()
		 * @generated
		 */
		EClass END_PATH_MULTIPLICITY = eINSTANCE.getEndPathMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_PATH_MULTIPLICITY__BASE_PROPERTY = eINSTANCE.getEndPathMultiplicity_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_PATH_MULTIPLICITY__LOWER = eINSTANCE.getEndPathMultiplicity_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_PATH_MULTIPLICITY__UPPER = eINSTANCE.getEndPathMultiplicity_Upper();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.BoundReferenceImpl <em>Bound Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BoundReferenceImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getBoundReference()
		 * @generated
		 */
		EClass BOUND_REFERENCE = eINSTANCE.getBoundReference();

		/**
		 * The meta object literal for the '<em><b>Bound End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_REFERENCE__BOUND_END = eINSTANCE.getBoundReference_BoundEnd();

		/**
		 * The meta object literal for the '<em><b>Binding Path</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_REFERENCE__BINDING_PATH = eINSTANCE.getBoundReference_BindingPath();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.AdjunctPropertyImpl <em>Adjunct Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.AdjunctPropertyImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getAdjunctProperty()
		 * @generated
		 */
		EClass ADJUNCT_PROPERTY = eINSTANCE.getAdjunctProperty();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADJUNCT_PROPERTY__BASE_PROPERTY = eINSTANCE.getAdjunctProperty_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Principal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADJUNCT_PROPERTY__PRINCIPAL = eINSTANCE.getAdjunctProperty_Principal();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.ClassifierBehaviorPropertyImpl <em>Classifier Behavior Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.ClassifierBehaviorPropertyImpl
		 * @see org.eclipse.papyrus.sysml14.blocks.internal.impl.BlocksPackageImpl#getClassifierBehaviorProperty()
		 * @generated
		 */
		EClass CLASSIFIER_BEHAVIOR_PROPERTY = eINSTANCE.getClassifierBehaviorProperty();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_BEHAVIOR_PROPERTY__BASE_PROPERTY = eINSTANCE.getClassifierBehaviorProperty_Base_Property();

	}

} //BlocksPackage
