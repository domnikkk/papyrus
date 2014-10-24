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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.dd.di.DIPackage;
import org.eclipse.papyrus.umldi.AbstractionEdge;
import org.eclipse.papyrus.umldi.AssociationClassEdge;
import org.eclipse.papyrus.umldi.AssociationClassShape;
import org.eclipse.papyrus.umldi.AssociationEdge;
import org.eclipse.papyrus.umldi.AssociationShape;
import org.eclipse.papyrus.umldi.AttachmentEdge;
import org.eclipse.papyrus.umldi.AttributeCompartment;
import org.eclipse.papyrus.umldi.BodyLabel;
import org.eclipse.papyrus.umldi.ClassDiagram;
import org.eclipse.papyrus.umldi.ClassShape;
import org.eclipse.papyrus.umldi.CommentShape;
import org.eclipse.papyrus.umldi.ComponentShape;
import org.eclipse.papyrus.umldi.ConstraintShape;
import org.eclipse.papyrus.umldi.ContainmentEdge;
import org.eclipse.papyrus.umldi.DataTypeShape;
import org.eclipse.papyrus.umldi.DependencyEdge;
import org.eclipse.papyrus.umldi.DependencyShape;
import org.eclipse.papyrus.umldi.DurationObservationShape;
import org.eclipse.papyrus.umldi.ElementImportEdge;
import org.eclipse.papyrus.umldi.EnumerationShape;
import org.eclipse.papyrus.umldi.GeneralizationEdge;
import org.eclipse.papyrus.umldi.GeneralizationSetEdge;
import org.eclipse.papyrus.umldi.InformationFlowEdge;
import org.eclipse.papyrus.umldi.InformationItemShape;
import org.eclipse.papyrus.umldi.InstanceSpecificationEdge;
import org.eclipse.papyrus.umldi.InstanceSpecificationShape;
import org.eclipse.papyrus.umldi.InterfaceRealizationEdge;
import org.eclipse.papyrus.umldi.InterfaceShape;
import org.eclipse.papyrus.umldi.ItemLabel;
import org.eclipse.papyrus.umldi.LiteralCompartment;
import org.eclipse.papyrus.umldi.LiteralLabel;
import org.eclipse.papyrus.umldi.ModelShape;
import org.eclipse.papyrus.umldi.ModifierLabel;
import org.eclipse.papyrus.umldi.MultiplicityLabel;
import org.eclipse.papyrus.umldi.NameLabel;
import org.eclipse.papyrus.umldi.OperationCompartment;
import org.eclipse.papyrus.umldi.OperationLabel;
import org.eclipse.papyrus.umldi.PackageImportEdge;
import org.eclipse.papyrus.umldi.PackageMergeEdge;
import org.eclipse.papyrus.umldi.PackageShape;
import org.eclipse.papyrus.umldi.PackagedElementCompartment;
import org.eclipse.papyrus.umldi.PowerLabel;
import org.eclipse.papyrus.umldi.PrimitiveTypeShape;
import org.eclipse.papyrus.umldi.PropertyEdge;
import org.eclipse.papyrus.umldi.PropertyLabel;
import org.eclipse.papyrus.umldi.RealizationEdge;
import org.eclipse.papyrus.umldi.ReceptionCompartment;
import org.eclipse.papyrus.umldi.ReceptionLabel;
import org.eclipse.papyrus.umldi.RepresentationEdge;
import org.eclipse.papyrus.umldi.RoleLabel;
import org.eclipse.papyrus.umldi.SignalShape;
import org.eclipse.papyrus.umldi.SlotCompartment;
import org.eclipse.papyrus.umldi.SlotLabel;
import org.eclipse.papyrus.umldi.SubstitutionEdge;
import org.eclipse.papyrus.umldi.TemplateParameterCompartment;
import org.eclipse.papyrus.umldi.TemplateParameterLabel;
import org.eclipse.papyrus.umldi.TimeObservationShape;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UsageEdge;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage
 * @generated
 */
public class UMLDIDerivedUnionAdapter extends AdapterImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static UMLDIPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLDIDerivedUnionAdapter() {
		if(modelPackage == null) {
			modelPackage = UMLDIPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> with the appropriate model class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if(notifier instanceof EObject) {
			EClass eClass = ((EObject)notifier).eClass();
			if(eClass.eContainer() == modelPackage) {
				notifyChanged(notification, eClass);
			}
		}
	}

	/**
	 * Calls <code>notifyXXXChanged</code> for the corresponding class of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyChanged(Notification notification, EClass eClass) {
		switch(eClass.getClassifierID()) {
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT:
			notifyPackagedElementCompartmentChanged(notification, eClass);
			break;
		case UMLDIPackage.PACKAGE_SHAPE:
			notifyPackageShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.NAME_LABEL:
			notifyNameLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT:
			notifyTemplateParameterCompartmentChanged(notification, eClass);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL:
			notifyTemplateParameterLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.CLASS_DIAGRAM:
			notifyClassDiagramChanged(notification, eClass);
			break;
		case UMLDIPackage.CONSTRAINT_SHAPE:
			notifyConstraintShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.BODY_LABEL:
			notifyBodyLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT:
			notifyAttributeCompartmentChanged(notification, eClass);
			break;
		case UMLDIPackage.PROPERTY_LABEL:
			notifyPropertyLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.OPERATION_COMPARTMENT:
			notifyOperationCompartmentChanged(notification, eClass);
			break;
		case UMLDIPackage.OPERATION_LABEL:
			notifyOperationLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.RECEPTION_COMPARTMENT:
			notifyReceptionCompartmentChanged(notification, eClass);
			break;
		case UMLDIPackage.RECEPTION_LABEL:
			notifyReceptionLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.LITERAL_COMPARTMENT:
			notifyLiteralCompartmentChanged(notification, eClass);
			break;
		case UMLDIPackage.ENUMERATION_SHAPE:
			notifyEnumerationShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.LITERAL_LABEL:
			notifyLiteralLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.ROLE_LABEL:
			notifyRoleLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE:
			notifyAssociationEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.MULTIPLICITY_LABEL:
			notifyMultiplicityLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.PROPERTY_EDGE:
			notifyPropertyEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.MODIFIER_LABEL:
			notifyModifierLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE:
			notifyGeneralizationSetEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.POWER_LABEL:
			notifyPowerLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE:
			notifyInstanceSpecificationEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE:
			notifyInstanceSpecificationShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.SLOT_COMPARTMENT:
			notifySlotCompartmentChanged(notification, eClass);
			break;
		case UMLDIPackage.SLOT_LABEL:
			notifySlotLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.CLASS_SHAPE:
			notifyClassShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.INTERFACE_SHAPE:
			notifyInterfaceShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE:
			notifyDataTypeShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE:
			notifyPrimitiveTypeShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.SIGNAL_SHAPE:
			notifySignalShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.MODEL_SHAPE:
			notifyModelShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.CONTAINMENT_EDGE:
			notifyContainmentEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.GENERALIZATION_EDGE:
			notifyGeneralizationEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.REALIZATION_EDGE:
			notifyRealizationEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.ABSTRACTION_EDGE:
			notifyAbstractionEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.DEPENDENCY_EDGE:
			notifyDependencyEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE:
			notifyInterfaceRealizationEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.USAGE_EDGE:
			notifyUsageEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.ELEMENT_IMPORT_EDGE:
			notifyElementImportEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.PACKAGE_IMPORT_EDGE:
			notifyPackageImportEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.PACKAGE_MERGE_EDGE:
			notifyPackageMergeEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.SUBSTITUTION_EDGE:
			notifySubstitutionEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE:
			notifyInformationFlowEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.ITEM_LABEL:
			notifyItemLabelChanged(notification, eClass);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE:
			notifyAssociationClassEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.COMMENT_SHAPE:
			notifyCommentShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.ATTACHMENT_EDGE:
			notifyAttachmentEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE:
			notifyAssociationClassShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.COMPONENT_SHAPE:
			notifyComponentShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.INFORMATION_ITEM_SHAPE:
			notifyInformationItemShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.REPRESENTATION_EDGE:
			notifyRepresentationEdgeChanged(notification, eClass);
			break;
		case UMLDIPackage.ASSOCIATION_SHAPE:
			notifyAssociationShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.DEPENDENCY_SHAPE:
			notifyDependencyShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.TIME_OBSERVATION_SHAPE:
			notifyTimeObservationShapeChanged(notification, eClass);
			break;
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE:
			notifyDurationObservationShapeChanged(notification, eClass);
			break;
		}
	}

	/**
	 * Does nothing; clients may override so that it does something.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @param derivedUnion
	 *        the derived union affected by the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification, EClass eClass, EStructuralFeature derivedUnion) {
		// Do nothing.
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyClassDiagramChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(ClassDiagram.class)) {
		case UMLDIPackage.CLASS_DIAGRAM__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.CLASS_DIAGRAM__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.CLASS_DIAGRAM__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.CLASS_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CLASS_DIAGRAM__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CLASS_DIAGRAM__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.CLASS_DIAGRAM__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.CLASS_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPackageShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(PackageShape.class)) {
		case UMLDIPackage.PACKAGE_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.PACKAGE_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.PACKAGE_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.PACKAGE_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.PACKAGE_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyConstraintShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(ConstraintShape.class)) {
		case UMLDIPackage.CONSTRAINT_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.CONSTRAINT_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.CONSTRAINT_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.CONSTRAINT_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CONSTRAINT_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CONSTRAINT_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.CONSTRAINT_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.CONSTRAINT_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CONSTRAINT_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CONSTRAINT_SHAPE__BODY_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CONSTRAINT_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAttributeCompartmentChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(AttributeCompartment.class)) {
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPropertyLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(PropertyLabel.class)) {
		case UMLDIPackage.PROPERTY_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.PROPERTY_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.PROPERTY_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.PROPERTY_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.PROPERTY_LABEL__NAMED_ELEMENT_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_LABEL__NAMED_ELEMENT_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_LABEL__ATTRIBUTE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyOperationCompartmentChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(OperationCompartment.class)) {
		case UMLDIPackage.OPERATION_COMPARTMENT__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.OPERATION_COMPARTMENT__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.OPERATION_COMPARTMENT__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.OPERATION_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.OPERATION_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.OPERATION_COMPARTMENT__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.OPERATION_COMPARTMENT__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.OPERATION_COMPARTMENT__OPERATION_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyOperationLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(OperationLabel.class)) {
		case UMLDIPackage.OPERATION_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.OPERATION_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.OPERATION_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.OPERATION_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.OPERATION_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.OPERATION_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.OPERATION_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.OPERATION_LABEL__NAMED_ELEMENT_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.OPERATION_LABEL__NAMED_ELEMENT_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.OPERATION_LABEL__OPERATION_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReceptionCompartmentChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(ReceptionCompartment.class)) {
		case UMLDIPackage.RECEPTION_COMPARTMENT__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.RECEPTION_COMPARTMENT__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.RECEPTION_COMPARTMENT__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.RECEPTION_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.RECEPTION_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.RECEPTION_COMPARTMENT__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.RECEPTION_COMPARTMENT__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.RECEPTION_COMPARTMENT__SIGNAL_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.RECEPTION_COMPARTMENT__RECEPTION_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReceptionLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(ReceptionLabel.class)) {
		case UMLDIPackage.RECEPTION_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.RECEPTION_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.RECEPTION_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.RECEPTION_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.RECEPTION_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.RECEPTION_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.RECEPTION_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.RECEPTION_LABEL__NAMED_ELEMENT_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.RECEPTION_LABEL__NAMED_ELEMENT_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.RECEPTION_LABEL__RECEPTION_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralCompartmentChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(LiteralCompartment.class)) {
		case UMLDIPackage.LITERAL_COMPARTMENT__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.LITERAL_COMPARTMENT__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.LITERAL_COMPARTMENT__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.LITERAL_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.LITERAL_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.LITERAL_COMPARTMENT__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.LITERAL_COMPARTMENT__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.LITERAL_COMPARTMENT__ENUMERATION_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.LITERAL_COMPARTMENT__LITERAL_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPackagedElementCompartmentChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(PackagedElementCompartment.class)) {
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyNameLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(NameLabel.class)) {
		case UMLDIPackage.NAME_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.NAME_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.NAME_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.NAME_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.NAME_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.NAME_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.NAME_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.NAME_LABEL__NAMED_ELEMENT_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPropertyEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(PropertyEdge.class)) {
		case UMLDIPackage.PROPERTY_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.PROPERTY_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.PROPERTY_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.PROPERTY_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.PROPERTY_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_EDGE__MODIFIER_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PROPERTY_EDGE__MULTIPLICITY_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyModifierLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(ModifierLabel.class)) {
		case UMLDIPackage.MODIFIER_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.MODIFIER_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.MODIFIER_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.MODIFIER_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MODIFIER_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MODIFIER_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.MODIFIER_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.MODIFIER_LABEL__ASSOCIATION_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MODIFIER_LABEL__GENERALIZATION_SET_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MODIFIER_LABEL__PROPERTY_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInstanceSpecificationEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(InstanceSpecificationEdge.class)) {
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_EDGE__END_ROLE_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyBodyLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(BodyLabel.class)) {
		case UMLDIPackage.BODY_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.BODY_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.BODY_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.BODY_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.BODY_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.BODY_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.BODY_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.BODY_LABEL__CONSTRAINT_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInstanceSpecificationShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(InstanceSpecificationShape.class)) {
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySlotCompartmentChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(SlotCompartment.class)) {
		case UMLDIPackage.SLOT_COMPARTMENT__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.SLOT_COMPARTMENT__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.SLOT_COMPARTMENT__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.SLOT_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SLOT_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SLOT_COMPARTMENT__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.SLOT_COMPARTMENT__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.SLOT_COMPARTMENT__SLOT_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySlotLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(SlotLabel.class)) {
		case UMLDIPackage.SLOT_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.SLOT_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.SLOT_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.SLOT_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SLOT_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SLOT_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.SLOT_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.SLOT_LABEL__NAMED_ELEMENT_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SLOT_LABEL__NAMED_ELEMENT_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SLOT_LABEL__SLOT_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyClassShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(ClassShape.class)) {
		case UMLDIPackage.CLASS_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.CLASS_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.CLASS_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.CLASS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CLASS_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CLASS_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.CLASS_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.CLASS_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CLASS_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CLASS_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CLASS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CLASS_SHAPE__ATTRIBUTE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CLASS_SHAPE__OPERATION_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CLASS_SHAPE__RECEPTION_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInterfaceShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(InterfaceShape.class)) {
		case UMLDIPackage.INTERFACE_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__ATTRIBUTE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__OPERATION_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_SHAPE__RECEPTION_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDataTypeShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(DataTypeShape.class)) {
		case UMLDIPackage.DATA_TYPE_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE__ATTRIBUTE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DATA_TYPE_SHAPE__OPERATION_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPrimitiveTypeShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(PrimitiveTypeShape.class)) {
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__ATTRIBUTE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PRIMITIVE_TYPE_SHAPE__OPERATION_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyEnumerationShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(EnumerationShape.class)) {
		case UMLDIPackage.ENUMERATION_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.ENUMERATION_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.ENUMERATION_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.ENUMERATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ENUMERATION_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ENUMERATION_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.ENUMERATION_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.ENUMERATION_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ENUMERATION_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ENUMERATION_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ENUMERATION_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ENUMERATION_SHAPE__LITERAL_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(LiteralLabel.class)) {
		case UMLDIPackage.LITERAL_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.LITERAL_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.LITERAL_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.LITERAL_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.LITERAL_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.LITERAL_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.LITERAL_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.LITERAL_LABEL__NAMED_ELEMENT_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.LITERAL_LABEL__NAMED_ELEMENT_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.LITERAL_LABEL__LITERAL_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyRoleLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(RoleLabel.class)) {
		case UMLDIPackage.ROLE_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.ROLE_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.ROLE_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.ROLE_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ROLE_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ROLE_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.ROLE_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.ROLE_LABEL__NAMED_ELEMENT_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ROLE_LABEL__NAMED_ELEMENT_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySignalShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(SignalShape.class)) {
		case UMLDIPackage.SIGNAL_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.SIGNAL_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.SIGNAL_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.SIGNAL_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SIGNAL_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SIGNAL_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.SIGNAL_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.SIGNAL_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SIGNAL_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SIGNAL_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SIGNAL_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SIGNAL_SHAPE__ATTRIBUTE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyModelShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(ModelShape.class)) {
		case UMLDIPackage.MODEL_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.MODEL_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.MODEL_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.MODEL_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MODEL_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MODEL_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.MODEL_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.MODEL_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MODEL_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MODEL_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MODEL_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MODEL_SHAPE__PACKAGED_ELEMENT_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyContainmentEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(ContainmentEdge.class)) {
		case UMLDIPackage.CONTAINMENT_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.CONTAINMENT_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.CONTAINMENT_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.CONTAINMENT_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CONTAINMENT_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CONTAINMENT_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.CONTAINMENT_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.CONTAINMENT_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CONTAINMENT_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CONTAINMENT_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.CONTAINMENT_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyGeneralizationEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(GeneralizationEdge.class)) {
		case UMLDIPackage.GENERALIZATION_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.GENERALIZATION_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.GENERALIZATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.GENERALIZATION_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.GENERALIZATION_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAssociationEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(AssociationEdge.class)) {
		case UMLDIPackage.ASSOCIATION_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__END_MODIFIER_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_EDGE__END_ROLE_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyMultiplicityLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(MultiplicityLabel.class)) {
		case UMLDIPackage.MULTIPLICITY_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.MULTIPLICITY_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.MULTIPLICITY_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.MULTIPLICITY_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MULTIPLICITY_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MULTIPLICITY_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.MULTIPLICITY_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.MULTIPLICITY_LABEL__PROPERTY_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyRealizationEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(RealizationEdge.class)) {
		case UMLDIPackage.REALIZATION_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.REALIZATION_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.REALIZATION_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.REALIZATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.REALIZATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.REALIZATION_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.REALIZATION_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.REALIZATION_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.REALIZATION_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.REALIZATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.REALIZATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.REALIZATION_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAbstractionEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(AbstractionEdge.class)) {
		case UMLDIPackage.ABSTRACTION_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.ABSTRACTION_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.ABSTRACTION_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.ABSTRACTION_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ABSTRACTION_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ABSTRACTION_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.ABSTRACTION_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.ABSTRACTION_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ABSTRACTION_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ABSTRACTION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ABSTRACTION_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ABSTRACTION_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDependencyEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(DependencyEdge.class)) {
		case UMLDIPackage.DEPENDENCY_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.DEPENDENCY_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.DEPENDENCY_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.DEPENDENCY_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DEPENDENCY_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DEPENDENCY_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.DEPENDENCY_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.DEPENDENCY_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DEPENDENCY_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DEPENDENCY_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DEPENDENCY_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DEPENDENCY_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInterfaceRealizationEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(InterfaceRealizationEdge.class)) {
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INTERFACE_REALIZATION_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyUsageEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(UsageEdge.class)) {
		case UMLDIPackage.USAGE_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.USAGE_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.USAGE_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.USAGE_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.USAGE_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.USAGE_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.USAGE_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.USAGE_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.USAGE_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.USAGE_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.USAGE_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.USAGE_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyElementImportEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(ElementImportEdge.class)) {
		case UMLDIPackage.ELEMENT_IMPORT_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.ELEMENT_IMPORT_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.ELEMENT_IMPORT_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.ELEMENT_IMPORT_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ELEMENT_IMPORT_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ELEMENT_IMPORT_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.ELEMENT_IMPORT_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.ELEMENT_IMPORT_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ELEMENT_IMPORT_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ELEMENT_IMPORT_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ELEMENT_IMPORT_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ELEMENT_IMPORT_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPackageImportEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(PackageImportEdge.class)) {
		case UMLDIPackage.PACKAGE_IMPORT_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_IMPORT_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.PACKAGE_IMPORT_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.PACKAGE_IMPORT_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_IMPORT_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_IMPORT_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.PACKAGE_IMPORT_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.PACKAGE_IMPORT_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_IMPORT_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_IMPORT_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_IMPORT_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_IMPORT_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPackageMergeEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(PackageMergeEdge.class)) {
		case UMLDIPackage.PACKAGE_MERGE_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_MERGE_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.PACKAGE_MERGE_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.PACKAGE_MERGE_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_MERGE_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_MERGE_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.PACKAGE_MERGE_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.PACKAGE_MERGE_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_MERGE_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_MERGE_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_MERGE_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.PACKAGE_MERGE_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySubstitutionEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(SubstitutionEdge.class)) {
		case UMLDIPackage.SUBSTITUTION_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.SUBSTITUTION_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.SUBSTITUTION_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.SUBSTITUTION_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SUBSTITUTION_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SUBSTITUTION_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.SUBSTITUTION_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.SUBSTITUTION_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SUBSTITUTION_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SUBSTITUTION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SUBSTITUTION_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.SUBSTITUTION_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInformationFlowEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(InformationFlowEdge.class)) {
		case UMLDIPackage.INFORMATION_FLOW_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_FLOW_EDGE__ITEM_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyItemLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(ItemLabel.class)) {
		case UMLDIPackage.ITEM_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.ITEM_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.ITEM_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.ITEM_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ITEM_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ITEM_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.ITEM_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.ITEM_LABEL__INFORMATION_FLOW_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAssociationClassEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(AssociationClassEdge.class)) {
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__END_MULTIPLICITY_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__END_MODIFIER_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_EDGE__END_ROLE_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyGeneralizationSetEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(GeneralizationSetEdge.class)) {
		case UMLDIPackage.GENERALIZATION_SET_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__POWER_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__MODIFIER_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPowerLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(PowerLabel.class)) {
		case UMLDIPackage.POWER_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.POWER_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.POWER_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.POWER_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.POWER_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.POWER_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.POWER_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.POWER_LABEL__GENERALIZATION_SET_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyCommentShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(CommentShape.class)) {
		case UMLDIPackage.COMMENT_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.COMMENT_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.COMMENT_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.COMMENT_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.COMMENT_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.COMMENT_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.COMMENT_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.COMMENT_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.COMMENT_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.COMMENT_SHAPE__BODY_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAttachmentEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(AttachmentEdge.class)) {
		case UMLDIPackage.ATTACHMENT_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.ATTACHMENT_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.ATTACHMENT_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.ATTACHMENT_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ATTACHMENT_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ATTACHMENT_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.ATTACHMENT_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.ATTACHMENT_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ATTACHMENT_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ATTACHMENT_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ATTACHMENT_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAssociationClassShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(AssociationClassShape.class)) {
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__ATTRIBUTE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__OPERATION_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_CLASS_SHAPE__RECEPTION_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyComponentShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(ComponentShape.class)) {
		case UMLDIPackage.COMPONENT_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__ATTRIBUTE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__OPERATION_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.COMPONENT_SHAPE__RECEPTION_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInformationItemShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(InformationItemShape.class)) {
		case UMLDIPackage.INFORMATION_ITEM_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_ITEM_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.INFORMATION_ITEM_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.INFORMATION_ITEM_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_ITEM_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_ITEM_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.INFORMATION_ITEM_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.INFORMATION_ITEM_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_ITEM_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_ITEM_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.INFORMATION_ITEM_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyRepresentationEdgeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(RepresentationEdge.class)) {
		case UMLDIPackage.REPRESENTATION_EDGE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.REPRESENTATION_EDGE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.REPRESENTATION_EDGE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.REPRESENTATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.REPRESENTATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.REPRESENTATION_EDGE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.REPRESENTATION_EDGE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.REPRESENTATION_EDGE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.REPRESENTATION_EDGE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.REPRESENTATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__SOURCE_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.REPRESENTATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.EDGE__TARGET_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.REPRESENTATION_EDGE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAssociationShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(AssociationShape.class)) {
		case UMLDIPackage.ASSOCIATION_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.ASSOCIATION_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.ASSOCIATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.ASSOCIATION_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.ASSOCIATION_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.ASSOCIATION_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDependencyShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(DependencyShape.class)) {
		case UMLDIPackage.DEPENDENCY_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.DEPENDENCY_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.DEPENDENCY_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.DEPENDENCY_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DEPENDENCY_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DEPENDENCY_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.DEPENDENCY_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.DEPENDENCY_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DEPENDENCY_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DEPENDENCY_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTimeObservationShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(TimeObservationShape.class)) {
		case UMLDIPackage.TIME_OBSERVATION_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.TIME_OBSERVATION_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.TIME_OBSERVATION_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.TIME_OBSERVATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.TIME_OBSERVATION_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.TIME_OBSERVATION_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.TIME_OBSERVATION_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.TIME_OBSERVATION_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.TIME_OBSERVATION_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.TIME_OBSERVATION_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDurationObservationShapeChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(DurationObservationShape.class)) {
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE__PACKAGE_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE__UML_DIAGRAM:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.DURATION_OBSERVATION_SHAPE__NAME_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTemplateParameterCompartmentChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(TemplateParameterCompartment.class)) {
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__TEMPLATE_PARAMETER_LABEL:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_COMPARTMENT__TEMPLATEABLE_ELEMENT_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param notification
	 *        a description of the change.
	 * @param eClass
	 *        the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTemplateParameterLabelChanged(Notification notification, EClass eClass) {
		switch(notification.getFeatureID(TemplateParameterLabel.class)) {
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__UML_MODEL_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__MODEL_ELEMENT);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__SHARED_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SHARED_STYLE);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__LOCAL_UML_STYLE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__LOCAL_STYLE);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__OWNED_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__OWNING_UML_DIAGRAM_ELEMENT:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TARGET_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__TARGET_EDGE);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__SOURCE_UML_EDGE:
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__SOURCE_EDGE);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__NAMED_ELEMENT_EDGE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__NAMED_ELEMENT_SHAPE:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		case UMLDIPackage.TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT:
			notifyChanged(notification, eClass, UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
			notifyChanged(notification, eClass, DIPackage.Literals.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT);
			break;
		}
	}
} //UMLDIDerivedUnionAdapter
