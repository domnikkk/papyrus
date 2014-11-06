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
package org.eclipse.papyrus.umldi.util;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.papyrus.umldi.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage
 * @generated
 */
public class UMLDIValidator extends EObjectValidator {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final UMLDIValidator INSTANCE = new UMLDIValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic
	 * {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.umldi";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Fontsize Positive' of 'Uml Style'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int UML_STYLE__FONTSIZE_POSITIVE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Delegates evaluation of the given invariant expression against the object in the given context.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context, String validationDelegate, EOperation invariant, String expression, int severity, String source, int code) {
		return EObjectValidator.validate(eClass, eObject, diagnostics, context, validationDelegate, invariant, expression, severity, source, code);
	}

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLDIValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return UMLDIPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch(classifierID) {
		case UMLDIPackage.UML_DIAGRAM:
			return validateUmlDiagram((UmlDiagram)value, diagnostics, context);
		case UMLDIPackage.UML_DIAGRAM_ELEMENT:
			return validateUmlDiagramElement((UmlDiagramElement)value, diagnostics, context);
		case UMLDIPackage.UML_STYLE:
			return validateUmlStyle((UmlStyle)value, diagnostics, context);
		case UMLDIPackage.UML_EDGE:
			return validateUmlEdge((UmlEdge)value, diagnostics, context);
		case UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT:
			return validateTopUmlDiagramElement((TopUmlDiagramElement)value, diagnostics, context);
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT:
			return validatePackagedElementCompartment((PackagedElementCompartment)value, diagnostics, context);
		case UMLDIPackage.UML_COMPARTMENT:
			return validateUmlCompartment((UmlCompartment)value, diagnostics, context);
		case UMLDIPackage.PACKAGE_SHAPE:
			return validatePackageShape((PackageShape)value, diagnostics, context);
		case UMLDIPackage.TEMPLATEABLE_ELEMENT_SHAPE:
			return validateTemplateableElementShape((TemplateableElementShape)value, diagnostics, context);
		case UMLDIPackage.NAMED_SHAPE:
			return validateNamedShape((NamedShape)value, diagnostics, context);
		case UMLDIPackage.UML_SHAPE:
			return validateUmlShape((UmlShape)value, diagnostics, context);
		case UMLDIPackage.NAME_LABEL:
			return validateNameLabel((NameLabel)value, diagnostics, context);
		case UMLDIPackage.UML_LABEL:
			return validateUmlLabel((UmlLabel)value, diagnostics, context);
		case UMLDIPackage.NAMED_EDGE:
			return validateNamedEdge((NamedEdge)value, diagnostics, context);
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT:
			return validateTemplateParameterCompartment((TemplateParameterCompartment)value, diagnostics, context);
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL:
			return validateTemplateParameterLabel((TemplateParameterLabel)value, diagnostics, context);
		case UMLDIPackage.CLASS_DIAGRAM:
			return validateClassDiagram((ClassDiagram)value, diagnostics, context);
		case UMLDIPackage.STRUCTURE_DIAGRAM:
			return validateStructureDiagram((StructureDiagram)value, diagnostics, context);
		case UMLDIPackage.CLASSIFIER_SHAPE:
			return validateClassifierShape((ClassifierShape)value, diagnostics, context);
		case UMLDIPackage.CONSTRAINT_SHAPE:
			return validateConstraintShape((ConstraintShape)value, diagnostics, context);
		case UMLDIPackage.BODY_SHAPE:
			return validateBodyShape((BodyShape)value, diagnostics, context);
		case UMLDIPackage.BODY_LABEL:
			return validateBodyLabel((BodyLabel)value, diagnostics, context);
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT:
			return validateAttributeCompartment((AttributeCompartment)value, diagnostics, context);
		case UMLDIPackage.CLASSIFIER_WITH_ATTRIBUTES_SHAPE:
			return validateClassifierWithAttributesShape((ClassifierWithAttributesShape)value, diagnostics, context);
		case UMLDIPackage.PROPERTY_LABEL:
			return validatePropertyLabel((PropertyLabel)value, diagnostics, context);
		case UMLDIPackage.OPERATION_COMPARTMENT:
			return validateOperationCompartment((OperationCompartment)value, diagnostics, context);
		case UMLDIPackage.CLASSIFIER_WITH_OPERATIONS_SHAPE:
			return validateClassifierWithOperationsShape((ClassifierWithOperationsShape)value, diagnostics, context);
		case UMLDIPackage.OPERATION_LABEL:
			return validateOperationLabel((OperationLabel)value, diagnostics, context);
		case UMLDIPackage.RECEPTION_COMPARTMENT:
			return validateReceptionCompartment((ReceptionCompartment)value, diagnostics, context);
		case UMLDIPackage.CLASSIFIER_WITH_RECEPTIONS_SHAPE:
			return validateClassifierWithReceptionsShape((ClassifierWithReceptionsShape)value, diagnostics, context);
		case UMLDIPackage.RECEPTION_LABEL:
			return validateReceptionLabel((ReceptionLabel)value, diagnostics, context);
		case UMLDIPackage.LITERAL_COMPARTMENT:
			return validateLiteralCompartment((LiteralCompartment)value, diagnostics, context);
		case UMLDIPackage.ENUMERATION_SHAPE:
			return validateEnumerationShape((EnumerationShape)value, diagnostics, context);
		case UMLDIPackage.LITERAL_LABEL:
			return validateLiteralLabel((LiteralLabel)value, diagnostics, context);
		case UMLDIPackage.ROLE_LABEL:
			return validateRoleLabel((RoleLabel)value, diagnostics, context);
		case UMLDIPackage.ASSOCIATION_EDGE:
			return validateAssociationEdge((AssociationEdge)value, diagnostics, context);
		case UMLDIPackage.MULTIPLICITY_LABEL:
			return validateMultiplicityLabel((MultiplicityLabel)value, diagnostics, context);
		case UMLDIPackage.PROPERTY_EDGE:
			return validatePropertyEdge((PropertyEdge)value, diagnostics, context);
		case UMLDIPackage.MODIFIER_LABEL:
			return validateModifierLabel((ModifierLabel)value, diagnostics, context);
		case UMLDIPackage.GENERALIZATION_SET_EDGE:
			return validateGeneralizationSetEdge((GeneralizationSetEdge)value, diagnostics, context);
		case UMLDIPackage.POWER_LABEL:
			return validatePowerLabel((PowerLabel)value, diagnostics, context);
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE:
			return validateInstanceSpecificationEdge((InstanceSpecificationEdge)value, diagnostics, context);
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE:
			return validateInstanceSpecificationShape((InstanceSpecificationShape)value, diagnostics, context);
		case UMLDIPackage.SLOT_COMPARTMENT:
			return validateSlotCompartment((SlotCompartment)value, diagnostics, context);
		case UMLDIPackage.SLOT_LABEL:
			return validateSlotLabel((SlotLabel)value, diagnostics, context);
		case UMLDIPackage.CLASS_SHAPE:
			return validateClassShape((ClassShape)value, diagnostics, context);
		case UMLDIPackage.INTERFACE_SHAPE:
			return validateInterfaceShape((InterfaceShape)value, diagnostics, context);
		case UMLDIPackage.DATA_TYPE_SHAPE:
			return validateDataTypeShape((DataTypeShape)value, diagnostics, context);
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE:
			return validatePrimitiveTypeShape((PrimitiveTypeShape)value, diagnostics, context);
		case UMLDIPackage.SIGNAL_SHAPE:
			return validateSignalShape((SignalShape)value, diagnostics, context);
		case UMLDIPackage.MODEL_SHAPE:
			return validateModelShape((ModelShape)value, diagnostics, context);
		case UMLDIPackage.CONTAINMENT_EDGE:
			return validateContainmentEdge((ContainmentEdge)value, diagnostics, context);
		case UMLDIPackage.GENERALIZATION_EDGE:
			return validateGeneralizationEdge((GeneralizationEdge)value, diagnostics, context);
		case UMLDIPackage.REALIZATION_EDGE:
			return validateRealizationEdge((RealizationEdge)value, diagnostics, context);
		case UMLDIPackage.ABSTRACTION_EDGE:
			return validateAbstractionEdge((AbstractionEdge)value, diagnostics, context);
		case UMLDIPackage.DEPENDENCY_EDGE:
			return validateDependencyEdge((DependencyEdge)value, diagnostics, context);
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE:
			return validateInterfaceRealizationEdge((InterfaceRealizationEdge)value, diagnostics, context);
		case UMLDIPackage.USAGE_EDGE:
			return validateUsageEdge((UsageEdge)value, diagnostics, context);
		case UMLDIPackage.ELEMENT_IMPORT_EDGE:
			return validateElementImportEdge((ElementImportEdge)value, diagnostics, context);
		case UMLDIPackage.PACKAGE_IMPORT_EDGE:
			return validatePackageImportEdge((PackageImportEdge)value, diagnostics, context);
		case UMLDIPackage.PACKAGE_MERGE_EDGE:
			return validatePackageMergeEdge((PackageMergeEdge)value, diagnostics, context);
		case UMLDIPackage.SUBSTITUTION_EDGE:
			return validateSubstitutionEdge((SubstitutionEdge)value, diagnostics, context);
		case UMLDIPackage.INFORMATION_FLOW_EDGE:
			return validateInformationFlowEdge((InformationFlowEdge)value, diagnostics, context);
		case UMLDIPackage.ITEM_LABEL:
			return validateItemLabel((ItemLabel)value, diagnostics, context);
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE:
			return validateAssociationClassEdge((AssociationClassEdge)value, diagnostics, context);
		case UMLDIPackage.COMMENT_SHAPE:
			return validateCommentShape((CommentShape)value, diagnostics, context);
		case UMLDIPackage.ATTACHMENT_EDGE:
			return validateAttachmentEdge((AttachmentEdge)value, diagnostics, context);
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE:
			return validateAssociationClassShape((AssociationClassShape)value, diagnostics, context);
		case UMLDIPackage.COMPONENT_SHAPE:
			return validateComponentShape((ComponentShape)value, diagnostics, context);
		case UMLDIPackage.INFORMATION_ITEM_SHAPE:
			return validateInformationItemShape((InformationItemShape)value, diagnostics, context);
		case UMLDIPackage.REPRESENTATION_EDGE:
			return validateRepresentationEdge((RepresentationEdge)value, diagnostics, context);
		case UMLDIPackage.ASSOCIATION_SHAPE:
			return validateAssociationShape((AssociationShape)value, diagnostics, context);
		case UMLDIPackage.DEPENDENCY_SHAPE:
			return validateDependencyShape((DependencyShape)value, diagnostics, context);
		case UMLDIPackage.TIME_OBSERVATION_SHAPE:
			return validateTimeObservationShape((TimeObservationShape)value, diagnostics, context);
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE:
			return validateDurationObservationShape((DurationObservationShape)value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUmlDiagram(UmlDiagram umlDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlDiagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUmlDiagramElement(UmlDiagramElement umlDiagramElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlDiagramElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUmlStyle(UmlStyle umlStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(umlStyle, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(umlStyle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(umlStyle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(umlStyle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(umlStyle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(umlStyle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(umlStyle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(umlStyle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(umlStyle, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateUmlStyle_fontsizePositive(umlStyle, diagnostics, context);
		return result;
	}

	/**
	 * Validates the fontsizePositive constraint of '<em>Uml Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUmlStyle_fontsizePositive(UmlStyle umlStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return umlStyle.fontsizePositive(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUmlEdge(UmlEdge umlEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTopUmlDiagramElement(TopUmlDiagramElement topUmlDiagramElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topUmlDiagramElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUmlCompartment(UmlCompartment umlCompartment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlCompartment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUmlLabel(UmlLabel umlLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClassDiagram(ClassDiagram classDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classDiagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStructureDiagram(StructureDiagram structureDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDiagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClassifierShape(ClassifierShape classifierShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifierShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePackageShape(PackageShape packageShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTemplateableElementShape(TemplateableElementShape templateableElementShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(templateableElementShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNamedShape(NamedShape namedShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateConstraintShape(ConstraintShape constraintShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBodyShape(BodyShape bodyShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bodyShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAttributeCompartment(AttributeCompartment attributeCompartment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeCompartment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOperationCompartment(OperationCompartment operationCompartment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationCompartment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateReceptionCompartment(ReceptionCompartment receptionCompartment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(receptionCompartment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLiteralCompartment(LiteralCompartment literalCompartment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalCompartment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePackagedElementCompartment(PackagedElementCompartment packagedElementCompartment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packagedElementCompartment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNameLabel(NameLabel nameLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNamedEdge(NamedEdge namedEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePropertyEdge(PropertyEdge propertyEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateModifierLabel(ModifierLabel modifierLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modifierLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInstanceSpecificationEdge(InstanceSpecificationEdge instanceSpecificationEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceSpecificationEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBodyLabel(BodyLabel bodyLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bodyLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInstanceSpecificationShape(InstanceSpecificationShape instanceSpecificationShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceSpecificationShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSlotCompartment(SlotCompartment slotCompartment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slotCompartment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSlotLabel(SlotLabel slotLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slotLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClassShape(ClassShape classShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClassifierWithReceptionsShape(ClassifierWithReceptionsShape classifierWithReceptionsShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifierWithReceptionsShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateReceptionLabel(ReceptionLabel receptionLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(receptionLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClassifierWithAttributesShape(ClassifierWithAttributesShape classifierWithAttributesShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifierWithAttributesShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePropertyLabel(PropertyLabel propertyLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateClassifierWithOperationsShape(ClassifierWithOperationsShape classifierWithOperationsShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifierWithOperationsShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOperationLabel(OperationLabel operationLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInterfaceShape(InterfaceShape interfaceShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfaceShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDataTypeShape(DataTypeShape dataTypeShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypeShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePrimitiveTypeShape(PrimitiveTypeShape primitiveTypeShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveTypeShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEnumerationShape(EnumerationShape enumerationShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLiteralLabel(LiteralLabel literalLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRoleLabel(RoleLabel roleLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSignalShape(SignalShape signalShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateModelShape(ModelShape modelShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateContainmentEdge(ContainmentEdge containmentEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containmentEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralizationEdge(GeneralizationEdge generalizationEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalizationEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssociationEdge(AssociationEdge associationEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMultiplicityLabel(MultiplicityLabel multiplicityLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiplicityLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRealizationEdge(RealizationEdge realizationEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realizationEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAbstractionEdge(AbstractionEdge abstractionEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractionEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDependencyEdge(DependencyEdge dependencyEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependencyEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInterfaceRealizationEdge(InterfaceRealizationEdge interfaceRealizationEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfaceRealizationEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUsageEdge(UsageEdge usageEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usageEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateElementImportEdge(ElementImportEdge elementImportEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementImportEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePackageImportEdge(PackageImportEdge packageImportEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageImportEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePackageMergeEdge(PackageMergeEdge packageMergeEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageMergeEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSubstitutionEdge(SubstitutionEdge substitutionEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substitutionEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInformationFlowEdge(InformationFlowEdge informationFlowEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informationFlowEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateItemLabel(ItemLabel itemLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssociationClassEdge(AssociationClassEdge associationClassEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationClassEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralizationSetEdge(GeneralizationSetEdge generalizationSetEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalizationSetEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePowerLabel(PowerLabel powerLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(powerLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCommentShape(CommentShape commentShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commentShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAttachmentEdge(AttachmentEdge attachmentEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attachmentEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssociationClassShape(AssociationClassShape associationClassShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationClassShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateComponentShape(ComponentShape componentShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInformationItemShape(InformationItemShape informationItemShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informationItemShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRepresentationEdge(RepresentationEdge representationEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(representationEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssociationShape(AssociationShape associationShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDependencyShape(DependencyShape dependencyShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependencyShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTimeObservationShape(TimeObservationShape timeObservationShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeObservationShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDurationObservationShape(DurationObservationShape durationObservationShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(durationObservationShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTemplateParameterCompartment(TemplateParameterCompartment templateParameterCompartment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(templateParameterCompartment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTemplateParameterLabel(TemplateParameterLabel templateParameterLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(templateParameterLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUmlShape(UmlShape umlShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlShape, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}
} //UMLDIValidator
