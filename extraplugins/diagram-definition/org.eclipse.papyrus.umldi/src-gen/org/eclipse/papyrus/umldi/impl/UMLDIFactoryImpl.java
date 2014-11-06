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
package org.eclipse.papyrus.umldi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.umldi.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class UMLDIFactoryImpl extends EFactoryImpl implements UMLDIFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static UMLDIFactory init() {
		try {
			UMLDIFactory theUMLDIFactory = (UMLDIFactory)EPackage.Registry.INSTANCE.getEFactory(UMLDIPackage.eNS_URI);
			if(theUMLDIFactory != null) {
				return theUMLDIFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLDIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLDIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch(eClass.getClassifierID()) {
		case UMLDIPackage.UML_STYLE:
			return createUmlStyle();
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT:
			return createPackagedElementCompartment();
		case UMLDIPackage.PACKAGE_SHAPE:
			return createPackageShape();
		case UMLDIPackage.NAME_LABEL:
			return createNameLabel();
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT:
			return createTemplateParameterCompartment();
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL:
			return createTemplateParameterLabel();
		case UMLDIPackage.CLASS_DIAGRAM:
			return createClassDiagram();
		case UMLDIPackage.CONSTRAINT_SHAPE:
			return createConstraintShape();
		case UMLDIPackage.BODY_LABEL:
			return createBodyLabel();
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT:
			return createAttributeCompartment();
		case UMLDIPackage.PROPERTY_LABEL:
			return createPropertyLabel();
		case UMLDIPackage.OPERATION_COMPARTMENT:
			return createOperationCompartment();
		case UMLDIPackage.OPERATION_LABEL:
			return createOperationLabel();
		case UMLDIPackage.RECEPTION_COMPARTMENT:
			return createReceptionCompartment();
		case UMLDIPackage.RECEPTION_LABEL:
			return createReceptionLabel();
		case UMLDIPackage.LITERAL_COMPARTMENT:
			return createLiteralCompartment();
		case UMLDIPackage.ENUMERATION_SHAPE:
			return createEnumerationShape();
		case UMLDIPackage.LITERAL_LABEL:
			return createLiteralLabel();
		case UMLDIPackage.ROLE_LABEL:
			return createRoleLabel();
		case UMLDIPackage.ASSOCIATION_EDGE:
			return createAssociationEdge();
		case UMLDIPackage.MULTIPLICITY_LABEL:
			return createMultiplicityLabel();
		case UMLDIPackage.PROPERTY_EDGE:
			return createPropertyEdge();
		case UMLDIPackage.MODIFIER_LABEL:
			return createModifierLabel();
		case UMLDIPackage.GENERALIZATION_SET_EDGE:
			return createGeneralizationSetEdge();
		case UMLDIPackage.POWER_LABEL:
			return createPowerLabel();
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE:
			return createInstanceSpecificationEdge();
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE:
			return createInstanceSpecificationShape();
		case UMLDIPackage.SLOT_COMPARTMENT:
			return createSlotCompartment();
		case UMLDIPackage.SLOT_LABEL:
			return createSlotLabel();
		case UMLDIPackage.CLASS_SHAPE:
			return createClassShape();
		case UMLDIPackage.INTERFACE_SHAPE:
			return createInterfaceShape();
		case UMLDIPackage.DATA_TYPE_SHAPE:
			return createDataTypeShape();
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE:
			return createPrimitiveTypeShape();
		case UMLDIPackage.SIGNAL_SHAPE:
			return createSignalShape();
		case UMLDIPackage.MODEL_SHAPE:
			return createModelShape();
		case UMLDIPackage.CONTAINMENT_EDGE:
			return createContainmentEdge();
		case UMLDIPackage.GENERALIZATION_EDGE:
			return createGeneralizationEdge();
		case UMLDIPackage.REALIZATION_EDGE:
			return createRealizationEdge();
		case UMLDIPackage.ABSTRACTION_EDGE:
			return createAbstractionEdge();
		case UMLDIPackage.DEPENDENCY_EDGE:
			return createDependencyEdge();
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE:
			return createInterfaceRealizationEdge();
		case UMLDIPackage.USAGE_EDGE:
			return createUsageEdge();
		case UMLDIPackage.ELEMENT_IMPORT_EDGE:
			return createElementImportEdge();
		case UMLDIPackage.PACKAGE_IMPORT_EDGE:
			return createPackageImportEdge();
		case UMLDIPackage.PACKAGE_MERGE_EDGE:
			return createPackageMergeEdge();
		case UMLDIPackage.SUBSTITUTION_EDGE:
			return createSubstitutionEdge();
		case UMLDIPackage.INFORMATION_FLOW_EDGE:
			return createInformationFlowEdge();
		case UMLDIPackage.ITEM_LABEL:
			return createItemLabel();
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE:
			return createAssociationClassEdge();
		case UMLDIPackage.COMMENT_SHAPE:
			return createCommentShape();
		case UMLDIPackage.ATTACHMENT_EDGE:
			return createAttachmentEdge();
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE:
			return createAssociationClassShape();
		case UMLDIPackage.COMPONENT_SHAPE:
			return createComponentShape();
		case UMLDIPackage.INFORMATION_ITEM_SHAPE:
			return createInformationItemShape();
		case UMLDIPackage.REPRESENTATION_EDGE:
			return createRepresentationEdge();
		case UMLDIPackage.ASSOCIATION_SHAPE:
			return createAssociationShape();
		case UMLDIPackage.DEPENDENCY_SHAPE:
			return createDependencyShape();
		case UMLDIPackage.TIME_OBSERVATION_SHAPE:
			return createTimeObservationShape();
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE:
			return createDurationObservationShape();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UmlStyle createUmlStyle() {
		UmlStyleImpl umlStyle = new UmlStyleImpl();
		return umlStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassDiagram createClassDiagram() {
		ClassDiagramImpl classDiagram = new ClassDiagramImpl();
		return classDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PackageShape createPackageShape() {
		PackageShapeImpl packageShape = new PackageShapeImpl();
		return packageShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConstraintShape createConstraintShape() {
		ConstraintShapeImpl constraintShape = new ConstraintShapeImpl();
		return constraintShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeCompartment createAttributeCompartment() {
		AttributeCompartmentImpl attributeCompartment = new AttributeCompartmentImpl();
		return attributeCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertyLabel createPropertyLabel() {
		PropertyLabelImpl propertyLabel = new PropertyLabelImpl();
		return propertyLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationCompartment createOperationCompartment() {
		OperationCompartmentImpl operationCompartment = new OperationCompartmentImpl();
		return operationCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationLabel createOperationLabel() {
		OperationLabelImpl operationLabel = new OperationLabelImpl();
		return operationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReceptionCompartment createReceptionCompartment() {
		ReceptionCompartmentImpl receptionCompartment = new ReceptionCompartmentImpl();
		return receptionCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReceptionLabel createReceptionLabel() {
		ReceptionLabelImpl receptionLabel = new ReceptionLabelImpl();
		return receptionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LiteralCompartment createLiteralCompartment() {
		LiteralCompartmentImpl literalCompartment = new LiteralCompartmentImpl();
		return literalCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PackagedElementCompartment createPackagedElementCompartment() {
		PackagedElementCompartmentImpl packagedElementCompartment = new PackagedElementCompartmentImpl();
		return packagedElementCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NameLabel createNameLabel() {
		NameLabelImpl nameLabel = new NameLabelImpl();
		return nameLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertyEdge createPropertyEdge() {
		PropertyEdgeImpl propertyEdge = new PropertyEdgeImpl();
		return propertyEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModifierLabel createModifierLabel() {
		ModifierLabelImpl modifierLabel = new ModifierLabelImpl();
		return modifierLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InstanceSpecificationEdge createInstanceSpecificationEdge() {
		InstanceSpecificationEdgeImpl instanceSpecificationEdge = new InstanceSpecificationEdgeImpl();
		return instanceSpecificationEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BodyLabel createBodyLabel() {
		BodyLabelImpl bodyLabel = new BodyLabelImpl();
		return bodyLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InstanceSpecificationShape createInstanceSpecificationShape() {
		InstanceSpecificationShapeImpl instanceSpecificationShape = new InstanceSpecificationShapeImpl();
		return instanceSpecificationShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SlotCompartment createSlotCompartment() {
		SlotCompartmentImpl slotCompartment = new SlotCompartmentImpl();
		return slotCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SlotLabel createSlotLabel() {
		SlotLabelImpl slotLabel = new SlotLabelImpl();
		return slotLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassShape createClassShape() {
		ClassShapeImpl classShape = new ClassShapeImpl();
		return classShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InterfaceShape createInterfaceShape() {
		InterfaceShapeImpl interfaceShape = new InterfaceShapeImpl();
		return interfaceShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataTypeShape createDataTypeShape() {
		DataTypeShapeImpl dataTypeShape = new DataTypeShapeImpl();
		return dataTypeShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PrimitiveTypeShape createPrimitiveTypeShape() {
		PrimitiveTypeShapeImpl primitiveTypeShape = new PrimitiveTypeShapeImpl();
		return primitiveTypeShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumerationShape createEnumerationShape() {
		EnumerationShapeImpl enumerationShape = new EnumerationShapeImpl();
		return enumerationShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LiteralLabel createLiteralLabel() {
		LiteralLabelImpl literalLabel = new LiteralLabelImpl();
		return literalLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoleLabel createRoleLabel() {
		RoleLabelImpl roleLabel = new RoleLabelImpl();
		return roleLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SignalShape createSignalShape() {
		SignalShapeImpl signalShape = new SignalShapeImpl();
		return signalShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelShape createModelShape() {
		ModelShapeImpl modelShape = new ModelShapeImpl();
		return modelShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContainmentEdge createContainmentEdge() {
		ContainmentEdgeImpl containmentEdge = new ContainmentEdgeImpl();
		return containmentEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GeneralizationEdge createGeneralizationEdge() {
		GeneralizationEdgeImpl generalizationEdge = new GeneralizationEdgeImpl();
		return generalizationEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationEdge createAssociationEdge() {
		AssociationEdgeImpl associationEdge = new AssociationEdgeImpl();
		return associationEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MultiplicityLabel createMultiplicityLabel() {
		MultiplicityLabelImpl multiplicityLabel = new MultiplicityLabelImpl();
		return multiplicityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RealizationEdge createRealizationEdge() {
		RealizationEdgeImpl realizationEdge = new RealizationEdgeImpl();
		return realizationEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AbstractionEdge createAbstractionEdge() {
		AbstractionEdgeImpl abstractionEdge = new AbstractionEdgeImpl();
		return abstractionEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DependencyEdge createDependencyEdge() {
		DependencyEdgeImpl dependencyEdge = new DependencyEdgeImpl();
		return dependencyEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InterfaceRealizationEdge createInterfaceRealizationEdge() {
		InterfaceRealizationEdgeImpl interfaceRealizationEdge = new InterfaceRealizationEdgeImpl();
		return interfaceRealizationEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UsageEdge createUsageEdge() {
		UsageEdgeImpl usageEdge = new UsageEdgeImpl();
		return usageEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ElementImportEdge createElementImportEdge() {
		ElementImportEdgeImpl elementImportEdge = new ElementImportEdgeImpl();
		return elementImportEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PackageImportEdge createPackageImportEdge() {
		PackageImportEdgeImpl packageImportEdge = new PackageImportEdgeImpl();
		return packageImportEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PackageMergeEdge createPackageMergeEdge() {
		PackageMergeEdgeImpl packageMergeEdge = new PackageMergeEdgeImpl();
		return packageMergeEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SubstitutionEdge createSubstitutionEdge() {
		SubstitutionEdgeImpl substitutionEdge = new SubstitutionEdgeImpl();
		return substitutionEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InformationFlowEdge createInformationFlowEdge() {
		InformationFlowEdgeImpl informationFlowEdge = new InformationFlowEdgeImpl();
		return informationFlowEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ItemLabel createItemLabel() {
		ItemLabelImpl itemLabel = new ItemLabelImpl();
		return itemLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationClassEdge createAssociationClassEdge() {
		AssociationClassEdgeImpl associationClassEdge = new AssociationClassEdgeImpl();
		return associationClassEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GeneralizationSetEdge createGeneralizationSetEdge() {
		GeneralizationSetEdgeImpl generalizationSetEdge = new GeneralizationSetEdgeImpl();
		return generalizationSetEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PowerLabel createPowerLabel() {
		PowerLabelImpl powerLabel = new PowerLabelImpl();
		return powerLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CommentShape createCommentShape() {
		CommentShapeImpl commentShape = new CommentShapeImpl();
		return commentShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttachmentEdge createAttachmentEdge() {
		AttachmentEdgeImpl attachmentEdge = new AttachmentEdgeImpl();
		return attachmentEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationClassShape createAssociationClassShape() {
		AssociationClassShapeImpl associationClassShape = new AssociationClassShapeImpl();
		return associationClassShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentShape createComponentShape() {
		ComponentShapeImpl componentShape = new ComponentShapeImpl();
		return componentShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InformationItemShape createInformationItemShape() {
		InformationItemShapeImpl informationItemShape = new InformationItemShapeImpl();
		return informationItemShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RepresentationEdge createRepresentationEdge() {
		RepresentationEdgeImpl representationEdge = new RepresentationEdgeImpl();
		return representationEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationShape createAssociationShape() {
		AssociationShapeImpl associationShape = new AssociationShapeImpl();
		return associationShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DependencyShape createDependencyShape() {
		DependencyShapeImpl dependencyShape = new DependencyShapeImpl();
		return dependencyShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TimeObservationShape createTimeObservationShape() {
		TimeObservationShapeImpl timeObservationShape = new TimeObservationShapeImpl();
		return timeObservationShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DurationObservationShape createDurationObservationShape() {
		DurationObservationShapeImpl durationObservationShape = new DurationObservationShapeImpl();
		return durationObservationShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TemplateParameterCompartment createTemplateParameterCompartment() {
		TemplateParameterCompartmentImpl templateParameterCompartment = new TemplateParameterCompartmentImpl();
		return templateParameterCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TemplateParameterLabel createTemplateParameterLabel() {
		TemplateParameterLabelImpl templateParameterLabel = new TemplateParameterLabelImpl();
		return templateParameterLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLDIPackage getUMLDIPackage() {
		return (UMLDIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLDIPackage getPackage() {
		return UMLDIPackage.eINSTANCE;
	}
} //UMLDIFactoryImpl
