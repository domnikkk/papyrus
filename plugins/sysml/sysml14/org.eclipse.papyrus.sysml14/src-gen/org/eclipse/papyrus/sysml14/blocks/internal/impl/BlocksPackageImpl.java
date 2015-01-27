/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.blocks.internal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml14.activities.ActivitiesPackage;

import org.eclipse.papyrus.sysml14.activities.internal.impl.ActivitiesPackageImpl;

import org.eclipse.papyrus.sysml14.allocations.AllocationsPackage;

import org.eclipse.papyrus.sysml14.allocations.internal.impl.AllocationsPackageImpl;

import org.eclipse.papyrus.sysml14.blocks.AdjunctProperty;
import org.eclipse.papyrus.sysml14.blocks.BindingConnector;
import org.eclipse.papyrus.sysml14.blocks.Block;
import org.eclipse.papyrus.sysml14.blocks.BlocksFactory;
import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml14.blocks.BoundReference;
import org.eclipse.papyrus.sysml14.blocks.ClassifierBehaviorProperty;
import org.eclipse.papyrus.sysml14.blocks.ConnectorProperty;
import org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath;
import org.eclipse.papyrus.sysml14.blocks.DistributedProperty;
import org.eclipse.papyrus.sysml14.blocks.ElementPropertyPath;
import org.eclipse.papyrus.sysml14.blocks.EndPathMultiplicity;
import org.eclipse.papyrus.sysml14.blocks.NestedConnectorEnd;
import org.eclipse.papyrus.sysml14.blocks.ParticipantProperty;
import org.eclipse.papyrus.sysml14.blocks.PropertySpecificType;
import org.eclipse.papyrus.sysml14.blocks.ValueType;

import org.eclipse.papyrus.sysml14.constraintblocks.ConstraintblocksPackage;

import org.eclipse.papyrus.sysml14.constraintblocks.internal.impl.ConstraintblocksPackageImpl;

import org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage;

import org.eclipse.papyrus.sysml14.deprecatedelements.internal.impl.DeprecatedelementsPackageImpl;

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
public class BlocksPackageImpl extends EPackageImpl implements BlocksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertySpecificTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedConnectorEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementPropertyPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedRelationshipPropertyPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endPathMultiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjunctPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierBehaviorPropertyEClass = null;

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
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BlocksPackageImpl() {
		super(eNS_URI, BlocksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BlocksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BlocksPackage init() {
		if (isInited) return (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);

		// Obtain or create and register package
		BlocksPackageImpl theBlocksPackage = (BlocksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BlocksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BlocksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StandardPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PortandflowsPackageImpl thePortandflowsPackage = (PortandflowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortandflowsPackage.eNS_URI) instanceof PortandflowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortandflowsPackage.eNS_URI) : PortandflowsPackage.eINSTANCE);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		ModelelementsPackageImpl theModelelementsPackage = (ModelelementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelelementsPackage.eNS_URI) instanceof ModelelementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelelementsPackage.eNS_URI) : ModelelementsPackage.eINSTANCE);
		ConstraintblocksPackageImpl theConstraintblocksPackage = (ConstraintblocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintblocksPackage.eNS_URI) instanceof ConstraintblocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintblocksPackage.eNS_URI) : ConstraintblocksPackage.eINSTANCE);
		AllocationsPackageImpl theAllocationsPackage = (AllocationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI) instanceof AllocationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI) : AllocationsPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		DeprecatedelementsPackageImpl theDeprecatedelementsPackage = (DeprecatedelementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeprecatedelementsPackage.eNS_URI) instanceof DeprecatedelementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeprecatedelementsPackage.eNS_URI) : DeprecatedelementsPackage.eINSTANCE);

		// Create package meta-data objects
		theBlocksPackage.createPackageContents();
		thePortandflowsPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theModelelementsPackage.createPackageContents();
		theConstraintblocksPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theDeprecatedelementsPackage.createPackageContents();

		// Initialize created meta-data
		theBlocksPackage.initializePackageContents();
		thePortandflowsPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theModelelementsPackage.initializePackageContents();
		theConstraintblocksPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theDeprecatedelementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBlocksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BlocksPackage.eNS_URI, theBlocksPackage);
		return theBlocksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_Base_DataType() {
		return (EReference)valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_Unit() {
		return (EReference)valueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_QuantityKind() {
		return (EReference)valueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistributedProperty() {
		return distributedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistributedProperty_Base_Property() {
		return (EReference)distributedPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorProperty() {
		return connectorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorProperty_Base_Property() {
		return (EReference)connectorPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorProperty_Connector() {
		return (EReference)connectorPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantProperty() {
		return participantPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipantProperty_Base_Property() {
		return (EReference)participantPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipantProperty_End() {
		return (EReference)participantPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingConnector() {
		return bindingConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingConnector_Base_Connector() {
		return (EReference)bindingConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Base_Class() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_IsEncapsulated() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertySpecificType() {
		return propertySpecificTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertySpecificType_Base_Classifier() {
		return (EReference)propertySpecificTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedConnectorEnd() {
		return nestedConnectorEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedConnectorEnd_Base_ConnectorEnd() {
		return (EReference)nestedConnectorEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementPropertyPath() {
		return elementPropertyPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementPropertyPath_Base_Element() {
		return (EReference)elementPropertyPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementPropertyPath_PropertyPath() {
		return (EReference)elementPropertyPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedRelationshipPropertyPath() {
		return directedRelationshipPropertyPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationshipPropertyPath_Base_DirectedRelationship() {
		return (EReference)directedRelationshipPropertyPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationshipPropertyPath_SourcePropertyPath() {
		return (EReference)directedRelationshipPropertyPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationshipPropertyPath_TargetPropertyPath() {
		return (EReference)directedRelationshipPropertyPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationshipPropertyPath_SourceContext() {
		return (EReference)directedRelationshipPropertyPathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationshipPropertyPath_TargetContext() {
		return (EReference)directedRelationshipPropertyPathEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndPathMultiplicity() {
		return endPathMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndPathMultiplicity_Base_Property() {
		return (EReference)endPathMultiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndPathMultiplicity_Lower() {
		return (EAttribute)endPathMultiplicityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndPathMultiplicity_Upper() {
		return (EAttribute)endPathMultiplicityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundReference() {
		return boundReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundReference_BoundEnd() {
		return (EReference)boundReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundReference_BindingPath() {
		return (EReference)boundReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjunctProperty() {
		return adjunctPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjunctProperty_Base_Property() {
		return (EReference)adjunctPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdjunctProperty_Principal() {
		return (EReference)adjunctPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierBehaviorProperty() {
		return classifierBehaviorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierBehaviorProperty_Base_Property() {
		return (EReference)classifierBehaviorPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlocksFactory getBlocksFactory() {
		return (BlocksFactory)getEFactoryInstance();
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
		valueTypeEClass = createEClass(VALUE_TYPE);
		createEReference(valueTypeEClass, VALUE_TYPE__BASE_DATA_TYPE);
		createEReference(valueTypeEClass, VALUE_TYPE__UNIT);
		createEReference(valueTypeEClass, VALUE_TYPE__QUANTITY_KIND);

		distributedPropertyEClass = createEClass(DISTRIBUTED_PROPERTY);
		createEReference(distributedPropertyEClass, DISTRIBUTED_PROPERTY__BASE_PROPERTY);

		connectorPropertyEClass = createEClass(CONNECTOR_PROPERTY);
		createEReference(connectorPropertyEClass, CONNECTOR_PROPERTY__BASE_PROPERTY);
		createEReference(connectorPropertyEClass, CONNECTOR_PROPERTY__CONNECTOR);

		participantPropertyEClass = createEClass(PARTICIPANT_PROPERTY);
		createEReference(participantPropertyEClass, PARTICIPANT_PROPERTY__BASE_PROPERTY);
		createEReference(participantPropertyEClass, PARTICIPANT_PROPERTY__END);

		bindingConnectorEClass = createEClass(BINDING_CONNECTOR);
		createEReference(bindingConnectorEClass, BINDING_CONNECTOR__BASE_CONNECTOR);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__BASE_CLASS);
		createEAttribute(blockEClass, BLOCK__IS_ENCAPSULATED);

		propertySpecificTypeEClass = createEClass(PROPERTY_SPECIFIC_TYPE);
		createEReference(propertySpecificTypeEClass, PROPERTY_SPECIFIC_TYPE__BASE_CLASSIFIER);

		nestedConnectorEndEClass = createEClass(NESTED_CONNECTOR_END);
		createEReference(nestedConnectorEndEClass, NESTED_CONNECTOR_END__BASE_CONNECTOR_END);

		elementPropertyPathEClass = createEClass(ELEMENT_PROPERTY_PATH);
		createEReference(elementPropertyPathEClass, ELEMENT_PROPERTY_PATH__BASE_ELEMENT);
		createEReference(elementPropertyPathEClass, ELEMENT_PROPERTY_PATH__PROPERTY_PATH);

		directedRelationshipPropertyPathEClass = createEClass(DIRECTED_RELATIONSHIP_PROPERTY_PATH);
		createEReference(directedRelationshipPropertyPathEClass, DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP);
		createEReference(directedRelationshipPropertyPathEClass, DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH);
		createEReference(directedRelationshipPropertyPathEClass, DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH);
		createEReference(directedRelationshipPropertyPathEClass, DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT);
		createEReference(directedRelationshipPropertyPathEClass, DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT);

		endPathMultiplicityEClass = createEClass(END_PATH_MULTIPLICITY);
		createEReference(endPathMultiplicityEClass, END_PATH_MULTIPLICITY__BASE_PROPERTY);
		createEAttribute(endPathMultiplicityEClass, END_PATH_MULTIPLICITY__LOWER);
		createEAttribute(endPathMultiplicityEClass, END_PATH_MULTIPLICITY__UPPER);

		boundReferenceEClass = createEClass(BOUND_REFERENCE);
		createEReference(boundReferenceEClass, BOUND_REFERENCE__BOUND_END);
		createEReference(boundReferenceEClass, BOUND_REFERENCE__BINDING_PATH);

		adjunctPropertyEClass = createEClass(ADJUNCT_PROPERTY);
		createEReference(adjunctPropertyEClass, ADJUNCT_PROPERTY__BASE_PROPERTY);
		createEReference(adjunctPropertyEClass, ADJUNCT_PROPERTY__PRINCIPAL);

		classifierBehaviorPropertyEClass = createEClass(CLASSIFIER_BEHAVIOR_PROPERTY);
		createEReference(classifierBehaviorPropertyEClass, CLASSIFIER_BEHAVIOR_PROPERTY__BASE_PROPERTY);
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
		nestedConnectorEndEClass.getESuperTypes().add(this.getElementPropertyPath());
		boundReferenceEClass.getESuperTypes().add(this.getEndPathMultiplicity());

		// Initialize classes, features, and operations; add parameters
		initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getValueType_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 0, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getValueType_Unit(), theUMLPackage.getInstanceSpecification(), null, "unit", null, 0, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getValueType_QuantityKind(), theUMLPackage.getInstanceSpecification(), null, "quantityKind", null, 0, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(distributedPropertyEClass, DistributedProperty.class, "DistributedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDistributedProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, DistributedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(connectorPropertyEClass, ConnectorProperty.class, "ConnectorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConnectorProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, ConnectorProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConnectorProperty_Connector(), theUMLPackage.getConnector(), null, "connector", null, 1, 1, ConnectorProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(participantPropertyEClass, ParticipantProperty.class, "ParticipantProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getParticipantProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, ParticipantProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getParticipantProperty_End(), theUMLPackage.getProperty(), null, "end", null, 1, 1, ParticipantProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(bindingConnectorEClass, BindingConnector.class, "BindingConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBindingConnector_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 0, 1, BindingConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBlock_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getBlock_IsEncapsulated(), theTypesPackage.getBoolean(), "isEncapsulated", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(propertySpecificTypeEClass, PropertySpecificType.class, "PropertySpecificType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPropertySpecificType_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 0, 1, PropertySpecificType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(nestedConnectorEndEClass, NestedConnectorEnd.class, "NestedConnectorEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNestedConnectorEnd_Base_ConnectorEnd(), theUMLPackage.getConnectorEnd(), null, "base_ConnectorEnd", null, 0, 1, NestedConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(elementPropertyPathEClass, ElementPropertyPath.class, "ElementPropertyPath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getElementPropertyPath_Base_Element(), theUMLPackage.getElement(), null, "base_Element", null, 0, 1, ElementPropertyPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getElementPropertyPath_PropertyPath(), theUMLPackage.getProperty(), null, "propertyPath", null, 1, -1, ElementPropertyPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(directedRelationshipPropertyPathEClass, DirectedRelationshipPropertyPath.class, "DirectedRelationshipPropertyPath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDirectedRelationshipPropertyPath_Base_DirectedRelationship(), theUMLPackage.getDirectedRelationship(), null, "base_DirectedRelationship", null, 0, 1, DirectedRelationshipPropertyPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDirectedRelationshipPropertyPath_SourcePropertyPath(), theUMLPackage.getProperty(), null, "sourcePropertyPath", null, 0, -1, DirectedRelationshipPropertyPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDirectedRelationshipPropertyPath_TargetPropertyPath(), theUMLPackage.getProperty(), null, "targetPropertyPath", null, 0, -1, DirectedRelationshipPropertyPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDirectedRelationshipPropertyPath_SourceContext(), theUMLPackage.getClassifier(), null, "sourceContext", null, 0, 1, DirectedRelationshipPropertyPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDirectedRelationshipPropertyPath_TargetContext(), theUMLPackage.getClassifier(), null, "targetContext", null, 0, 1, DirectedRelationshipPropertyPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(endPathMultiplicityEClass, EndPathMultiplicity.class, "EndPathMultiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEndPathMultiplicity_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, EndPathMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEndPathMultiplicity_Lower(), theTypesPackage.getInteger(), "lower", "0", 0, 1, EndPathMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getEndPathMultiplicity_Upper(), theTypesPackage.getUnlimitedNatural(), "upper", "-1", 0, 1, EndPathMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(boundReferenceEClass, BoundReference.class, "BoundReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBoundReference_BoundEnd(), theUMLPackage.getConnectorEnd(), null, "boundEnd", null, 1, 1, BoundReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBoundReference_BindingPath(), theUMLPackage.getProperty(), null, "bindingPath", null, 1, -1, BoundReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(adjunctPropertyEClass, AdjunctProperty.class, "AdjunctProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAdjunctProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, AdjunctProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAdjunctProperty_Principal(), theUMLPackage.getElement(), null, "principal", null, 1, 1, AdjunctProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(classifierBehaviorPropertyEClass, ClassifierBehaviorProperty.class, "ClassifierBehaviorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getClassifierBehaviorProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, ClassifierBehaviorProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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
			 "originalName", "Blocks" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //BlocksPackageImpl
