/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.umldi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage
 * @generated
 */
public interface UMLDIFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	UMLDIFactory eINSTANCE = org.eclipse.papyrus.umldi.impl.UMLDIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Uml Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Uml Style</em>'.
	 * @generated
	 */
	UmlStyle createUmlStyle();

	/**
	 * Returns a new object of class '<em>Class Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Class Diagram</em>'.
	 * @generated
	 */
	ClassDiagram createClassDiagram();

	/**
	 * Returns a new object of class '<em>Package Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Package Shape</em>'.
	 * @generated
	 */
	PackageShape createPackageShape();

	/**
	 * Returns a new object of class '<em>Constraint Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Constraint Shape</em>'.
	 * @generated
	 */
	ConstraintShape createConstraintShape();

	/**
	 * Returns a new object of class '<em>Attribute Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Attribute Compartment</em>'.
	 * @generated
	 */
	AttributeCompartment createAttributeCompartment();

	/**
	 * Returns a new object of class '<em>Property Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Property Label</em>'.
	 * @generated
	 */
	PropertyLabel createPropertyLabel();

	/**
	 * Returns a new object of class '<em>Operation Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Operation Compartment</em>'.
	 * @generated
	 */
	OperationCompartment createOperationCompartment();

	/**
	 * Returns a new object of class '<em>Operation Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Operation Label</em>'.
	 * @generated
	 */
	OperationLabel createOperationLabel();

	/**
	 * Returns a new object of class '<em>Reception Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Reception Compartment</em>'.
	 * @generated
	 */
	ReceptionCompartment createReceptionCompartment();

	/**
	 * Returns a new object of class '<em>Reception Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Reception Label</em>'.
	 * @generated
	 */
	ReceptionLabel createReceptionLabel();

	/**
	 * Returns a new object of class '<em>Literal Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Literal Compartment</em>'.
	 * @generated
	 */
	LiteralCompartment createLiteralCompartment();

	/**
	 * Returns a new object of class '<em>Packaged Element Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Packaged Element Compartment</em>'.
	 * @generated
	 */
	PackagedElementCompartment createPackagedElementCompartment();

	/**
	 * Returns a new object of class '<em>Name Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Name Label</em>'.
	 * @generated
	 */
	NameLabel createNameLabel();

	/**
	 * Returns a new object of class '<em>Property Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Property Edge</em>'.
	 * @generated
	 */
	PropertyEdge createPropertyEdge();

	/**
	 * Returns a new object of class '<em>Modifier Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Modifier Label</em>'.
	 * @generated
	 */
	ModifierLabel createModifierLabel();

	/**
	 * Returns a new object of class '<em>Instance Specification Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Instance Specification Edge</em>'.
	 * @generated
	 */
	InstanceSpecificationEdge createInstanceSpecificationEdge();

	/**
	 * Returns a new object of class '<em>Body Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Body Label</em>'.
	 * @generated
	 */
	BodyLabel createBodyLabel();

	/**
	 * Returns a new object of class '<em>Instance Specification Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Instance Specification Shape</em>'.
	 * @generated
	 */
	InstanceSpecificationShape createInstanceSpecificationShape();

	/**
	 * Returns a new object of class '<em>Slot Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Slot Compartment</em>'.
	 * @generated
	 */
	SlotCompartment createSlotCompartment();

	/**
	 * Returns a new object of class '<em>Slot Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Slot Label</em>'.
	 * @generated
	 */
	SlotLabel createSlotLabel();

	/**
	 * Returns a new object of class '<em>Class Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Class Shape</em>'.
	 * @generated
	 */
	ClassShape createClassShape();

	/**
	 * Returns a new object of class '<em>Interface Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Interface Shape</em>'.
	 * @generated
	 */
	InterfaceShape createInterfaceShape();

	/**
	 * Returns a new object of class '<em>Data Type Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Type Shape</em>'.
	 * @generated
	 */
	DataTypeShape createDataTypeShape();

	/**
	 * Returns a new object of class '<em>Primitive Type Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Primitive Type Shape</em>'.
	 * @generated
	 */
	PrimitiveTypeShape createPrimitiveTypeShape();

	/**
	 * Returns a new object of class '<em>Enumeration Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Enumeration Shape</em>'.
	 * @generated
	 */
	EnumerationShape createEnumerationShape();

	/**
	 * Returns a new object of class '<em>Literal Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Literal Label</em>'.
	 * @generated
	 */
	LiteralLabel createLiteralLabel();

	/**
	 * Returns a new object of class '<em>Role Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Role Label</em>'.
	 * @generated
	 */
	RoleLabel createRoleLabel();

	/**
	 * Returns a new object of class '<em>Signal Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Signal Shape</em>'.
	 * @generated
	 */
	SignalShape createSignalShape();

	/**
	 * Returns a new object of class '<em>Model Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Model Shape</em>'.
	 * @generated
	 */
	ModelShape createModelShape();

	/**
	 * Returns a new object of class '<em>Containment Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Containment Edge</em>'.
	 * @generated
	 */
	ContainmentEdge createContainmentEdge();

	/**
	 * Returns a new object of class '<em>Generalization Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Generalization Edge</em>'.
	 * @generated
	 */
	GeneralizationEdge createGeneralizationEdge();

	/**
	 * Returns a new object of class '<em>Association Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Association Edge</em>'.
	 * @generated
	 */
	AssociationEdge createAssociationEdge();

	/**
	 * Returns a new object of class '<em>Multiplicity Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Multiplicity Label</em>'.
	 * @generated
	 */
	MultiplicityLabel createMultiplicityLabel();

	/**
	 * Returns a new object of class '<em>Realization Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Realization Edge</em>'.
	 * @generated
	 */
	RealizationEdge createRealizationEdge();

	/**
	 * Returns a new object of class '<em>Abstraction Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Abstraction Edge</em>'.
	 * @generated
	 */
	AbstractionEdge createAbstractionEdge();

	/**
	 * Returns a new object of class '<em>Dependency Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Dependency Edge</em>'.
	 * @generated
	 */
	DependencyEdge createDependencyEdge();

	/**
	 * Returns a new object of class '<em>Interface Realization Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Interface Realization Edge</em>'.
	 * @generated
	 */
	InterfaceRealizationEdge createInterfaceRealizationEdge();

	/**
	 * Returns a new object of class '<em>Usage Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Usage Edge</em>'.
	 * @generated
	 */
	UsageEdge createUsageEdge();

	/**
	 * Returns a new object of class '<em>Element Import Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Element Import Edge</em>'.
	 * @generated
	 */
	ElementImportEdge createElementImportEdge();

	/**
	 * Returns a new object of class '<em>Package Import Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Package Import Edge</em>'.
	 * @generated
	 */
	PackageImportEdge createPackageImportEdge();

	/**
	 * Returns a new object of class '<em>Package Merge Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Package Merge Edge</em>'.
	 * @generated
	 */
	PackageMergeEdge createPackageMergeEdge();

	/**
	 * Returns a new object of class '<em>Substitution Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Substitution Edge</em>'.
	 * @generated
	 */
	SubstitutionEdge createSubstitutionEdge();

	/**
	 * Returns a new object of class '<em>Information Flow Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Information Flow Edge</em>'.
	 * @generated
	 */
	InformationFlowEdge createInformationFlowEdge();

	/**
	 * Returns a new object of class '<em>Item Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Item Label</em>'.
	 * @generated
	 */
	ItemLabel createItemLabel();

	/**
	 * Returns a new object of class '<em>Association Class Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Association Class Edge</em>'.
	 * @generated
	 */
	AssociationClassEdge createAssociationClassEdge();

	/**
	 * Returns a new object of class '<em>Generalization Set Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Generalization Set Edge</em>'.
	 * @generated
	 */
	GeneralizationSetEdge createGeneralizationSetEdge();

	/**
	 * Returns a new object of class '<em>Power Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Power Label</em>'.
	 * @generated
	 */
	PowerLabel createPowerLabel();

	/**
	 * Returns a new object of class '<em>Comment Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Comment Shape</em>'.
	 * @generated
	 */
	CommentShape createCommentShape();

	/**
	 * Returns a new object of class '<em>Attachment Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Attachment Edge</em>'.
	 * @generated
	 */
	AttachmentEdge createAttachmentEdge();

	/**
	 * Returns a new object of class '<em>Association Class Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Association Class Shape</em>'.
	 * @generated
	 */
	AssociationClassShape createAssociationClassShape();

	/**
	 * Returns a new object of class '<em>Component Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Component Shape</em>'.
	 * @generated
	 */
	ComponentShape createComponentShape();

	/**
	 * Returns a new object of class '<em>Information Item Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Information Item Shape</em>'.
	 * @generated
	 */
	InformationItemShape createInformationItemShape();

	/**
	 * Returns a new object of class '<em>Representation Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Representation Edge</em>'.
	 * @generated
	 */
	RepresentationEdge createRepresentationEdge();

	/**
	 * Returns a new object of class '<em>Association Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Association Shape</em>'.
	 * @generated
	 */
	AssociationShape createAssociationShape();

	/**
	 * Returns a new object of class '<em>Dependency Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Dependency Shape</em>'.
	 * @generated
	 */
	DependencyShape createDependencyShape();

	/**
	 * Returns a new object of class '<em>Time Observation Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Time Observation Shape</em>'.
	 * @generated
	 */
	TimeObservationShape createTimeObservationShape();

	/**
	 * Returns a new object of class '<em>Duration Observation Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Duration Observation Shape</em>'.
	 * @generated
	 */
	DurationObservationShape createDurationObservationShape();

	/**
	 * Returns a new object of class '<em>Template Parameter Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Template Parameter Compartment</em>'.
	 * @generated
	 */
	TemplateParameterCompartment createTemplateParameterCompartment();

	/**
	 * Returns a new object of class '<em>Template Parameter Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Template Parameter Label</em>'.
	 * @generated
	 */
	TemplateParameterLabel createTemplateParameterLabel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	UMLDIPackage getUMLDIPackage();
} //UMLDIFactory
