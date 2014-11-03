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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.dd.di.Diagram;
import org.eclipse.papyrus.dd.di.DiagramElement;
import org.eclipse.papyrus.dd.di.Edge;
import org.eclipse.papyrus.dd.di.Shape;
import org.eclipse.papyrus.dd.di.Style;

import org.eclipse.papyrus.umldi.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage
 * @generated
 */
public class UMLDIAdapterFactory extends AdapterFactoryImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static UMLDIPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLDIAdapterFactory() {
		if(modelPackage == null) {
			modelPackage = UMLDIPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if(object == modelPackage) {
			return true;
		}
		if(object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UMLDISwitch<Adapter> modelSwitch = new UMLDISwitch<Adapter>() {

		@Override
		public Adapter caseUmlDiagram(UmlDiagram object) {
			return createUmlDiagramAdapter();
		}

		@Override
		public Adapter caseUmlDiagramElement(UmlDiagramElement object) {
			return createUmlDiagramElementAdapter();
		}

		@Override
		public Adapter caseUmlStyle(UmlStyle object) {
			return createUmlStyleAdapter();
		}

		@Override
		public Adapter caseUmlEdge(UmlEdge object) {
			return createUmlEdgeAdapter();
		}

		@Override
		public Adapter caseTopUmlDiagramElement(TopUmlDiagramElement object) {
			return createTopUmlDiagramElementAdapter();
		}

		@Override
		public Adapter casePackagedElementCompartment(PackagedElementCompartment object) {
			return createPackagedElementCompartmentAdapter();
		}

		@Override
		public Adapter caseUmlCompartment(UmlCompartment object) {
			return createUmlCompartmentAdapter();
		}

		@Override
		public Adapter casePackageShape(PackageShape object) {
			return createPackageShapeAdapter();
		}

		@Override
		public Adapter caseTemplateableElementShape(TemplateableElementShape object) {
			return createTemplateableElementShapeAdapter();
		}

		@Override
		public Adapter caseNamedShape(NamedShape object) {
			return createNamedShapeAdapter();
		}

		@Override
		public Adapter caseUmlShape(UmlShape object) {
			return createUmlShapeAdapter();
		}

		@Override
		public Adapter caseNameLabel(NameLabel object) {
			return createNameLabelAdapter();
		}

		@Override
		public Adapter caseUmlLabel(UmlLabel object) {
			return createUmlLabelAdapter();
		}

		@Override
		public Adapter caseNamedEdge(NamedEdge object) {
			return createNamedEdgeAdapter();
		}

		@Override
		public Adapter caseTemplateParameterCompartment(TemplateParameterCompartment object) {
			return createTemplateParameterCompartmentAdapter();
		}

		@Override
		public Adapter caseTemplateParameterLabel(TemplateParameterLabel object) {
			return createTemplateParameterLabelAdapter();
		}

		@Override
		public Adapter caseClassDiagram(ClassDiagram object) {
			return createClassDiagramAdapter();
		}

		@Override
		public Adapter caseStructureDiagram(StructureDiagram object) {
			return createStructureDiagramAdapter();
		}

		@Override
		public Adapter caseClassifierShape(ClassifierShape object) {
			return createClassifierShapeAdapter();
		}

		@Override
		public Adapter caseConstraintShape(ConstraintShape object) {
			return createConstraintShapeAdapter();
		}

		@Override
		public Adapter caseBodyShape(BodyShape object) {
			return createBodyShapeAdapter();
		}

		@Override
		public Adapter caseBodyLabel(BodyLabel object) {
			return createBodyLabelAdapter();
		}

		@Override
		public Adapter caseAttributeCompartment(AttributeCompartment object) {
			return createAttributeCompartmentAdapter();
		}

		@Override
		public Adapter caseClassifierWithAttributesShape(ClassifierWithAttributesShape object) {
			return createClassifierWithAttributesShapeAdapter();
		}

		@Override
		public Adapter casePropertyLabel(PropertyLabel object) {
			return createPropertyLabelAdapter();
		}

		@Override
		public Adapter caseOperationCompartment(OperationCompartment object) {
			return createOperationCompartmentAdapter();
		}

		@Override
		public Adapter caseClassifierWithOperationsShape(ClassifierWithOperationsShape object) {
			return createClassifierWithOperationsShapeAdapter();
		}

		@Override
		public Adapter caseOperationLabel(OperationLabel object) {
			return createOperationLabelAdapter();
		}

		@Override
		public Adapter caseReceptionCompartment(ReceptionCompartment object) {
			return createReceptionCompartmentAdapter();
		}

		@Override
		public Adapter caseClassifierWithReceptionsShape(ClassifierWithReceptionsShape object) {
			return createClassifierWithReceptionsShapeAdapter();
		}

		@Override
		public Adapter caseReceptionLabel(ReceptionLabel object) {
			return createReceptionLabelAdapter();
		}

		@Override
		public Adapter caseLiteralCompartment(LiteralCompartment object) {
			return createLiteralCompartmentAdapter();
		}

		@Override
		public Adapter caseEnumerationShape(EnumerationShape object) {
			return createEnumerationShapeAdapter();
		}

		@Override
		public Adapter caseLiteralLabel(LiteralLabel object) {
			return createLiteralLabelAdapter();
		}

		@Override
		public Adapter caseRoleLabel(RoleLabel object) {
			return createRoleLabelAdapter();
		}

		@Override
		public Adapter caseAssociationEdge(AssociationEdge object) {
			return createAssociationEdgeAdapter();
		}

		@Override
		public Adapter caseMultiplicityLabel(MultiplicityLabel object) {
			return createMultiplicityLabelAdapter();
		}

		@Override
		public Adapter casePropertyEdge(PropertyEdge object) {
			return createPropertyEdgeAdapter();
		}

		@Override
		public Adapter caseModifierLabel(ModifierLabel object) {
			return createModifierLabelAdapter();
		}

		@Override
		public Adapter caseGeneralizationSetEdge(GeneralizationSetEdge object) {
			return createGeneralizationSetEdgeAdapter();
		}

		@Override
		public Adapter casePowerLabel(PowerLabel object) {
			return createPowerLabelAdapter();
		}

		@Override
		public Adapter caseInstanceSpecificationEdge(InstanceSpecificationEdge object) {
			return createInstanceSpecificationEdgeAdapter();
		}

		@Override
		public Adapter caseInstanceSpecificationShape(InstanceSpecificationShape object) {
			return createInstanceSpecificationShapeAdapter();
		}

		@Override
		public Adapter caseSlotCompartment(SlotCompartment object) {
			return createSlotCompartmentAdapter();
		}

		@Override
		public Adapter caseSlotLabel(SlotLabel object) {
			return createSlotLabelAdapter();
		}

		@Override
		public Adapter caseClassShape(ClassShape object) {
			return createClassShapeAdapter();
		}

		@Override
		public Adapter caseInterfaceShape(InterfaceShape object) {
			return createInterfaceShapeAdapter();
		}

		@Override
		public Adapter caseDataTypeShape(DataTypeShape object) {
			return createDataTypeShapeAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeShape(PrimitiveTypeShape object) {
			return createPrimitiveTypeShapeAdapter();
		}

		@Override
		public Adapter caseSignalShape(SignalShape object) {
			return createSignalShapeAdapter();
		}

		@Override
		public Adapter caseModelShape(ModelShape object) {
			return createModelShapeAdapter();
		}

		@Override
		public Adapter caseContainmentEdge(ContainmentEdge object) {
			return createContainmentEdgeAdapter();
		}

		@Override
		public Adapter caseGeneralizationEdge(GeneralizationEdge object) {
			return createGeneralizationEdgeAdapter();
		}

		@Override
		public Adapter caseRealizationEdge(RealizationEdge object) {
			return createRealizationEdgeAdapter();
		}

		@Override
		public Adapter caseAbstractionEdge(AbstractionEdge object) {
			return createAbstractionEdgeAdapter();
		}

		@Override
		public Adapter caseDependencyEdge(DependencyEdge object) {
			return createDependencyEdgeAdapter();
		}

		@Override
		public Adapter caseInterfaceRealizationEdge(InterfaceRealizationEdge object) {
			return createInterfaceRealizationEdgeAdapter();
		}

		@Override
		public Adapter caseUsageEdge(UsageEdge object) {
			return createUsageEdgeAdapter();
		}

		@Override
		public Adapter caseElementImportEdge(ElementImportEdge object) {
			return createElementImportEdgeAdapter();
		}

		@Override
		public Adapter casePackageImportEdge(PackageImportEdge object) {
			return createPackageImportEdgeAdapter();
		}

		@Override
		public Adapter casePackageMergeEdge(PackageMergeEdge object) {
			return createPackageMergeEdgeAdapter();
		}

		@Override
		public Adapter caseSubstitutionEdge(SubstitutionEdge object) {
			return createSubstitutionEdgeAdapter();
		}

		@Override
		public Adapter caseInformationFlowEdge(InformationFlowEdge object) {
			return createInformationFlowEdgeAdapter();
		}

		@Override
		public Adapter caseItemLabel(ItemLabel object) {
			return createItemLabelAdapter();
		}

		@Override
		public Adapter caseAssociationClassEdge(AssociationClassEdge object) {
			return createAssociationClassEdgeAdapter();
		}

		@Override
		public Adapter caseCommentShape(CommentShape object) {
			return createCommentShapeAdapter();
		}

		@Override
		public Adapter caseAttachmentEdge(AttachmentEdge object) {
			return createAttachmentEdgeAdapter();
		}

		@Override
		public Adapter caseAssociationClassShape(AssociationClassShape object) {
			return createAssociationClassShapeAdapter();
		}

		@Override
		public Adapter caseComponentShape(ComponentShape object) {
			return createComponentShapeAdapter();
		}

		@Override
		public Adapter caseInformationItemShape(InformationItemShape object) {
			return createInformationItemShapeAdapter();
		}

		@Override
		public Adapter caseRepresentationEdge(RepresentationEdge object) {
			return createRepresentationEdgeAdapter();
		}

		@Override
		public Adapter caseAssociationShape(AssociationShape object) {
			return createAssociationShapeAdapter();
		}

		@Override
		public Adapter caseDependencyShape(DependencyShape object) {
			return createDependencyShapeAdapter();
		}

		@Override
		public Adapter caseTimeObservationShape(TimeObservationShape object) {
			return createTimeObservationShapeAdapter();
		}

		@Override
		public Adapter caseDurationObservationShape(DurationObservationShape object) {
			return createDurationObservationShapeAdapter();
		}

		@Override
		public Adapter caseDiagramElement(DiagramElement object) {
			return createDiagramElementAdapter();
		}

		@Override
		public Adapter caseShape(Shape object) {
			return createShapeAdapter();
		}

		@Override
		public Adapter caseDiagram(Diagram object) {
			return createDiagramAdapter();
		}

		@Override
		public Adapter caseStyle(Style object) {
			return createStyleAdapter();
		}

		@Override
		public Adapter caseEdge(Edge object) {
			return createEdgeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *        the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.UmlDiagram <em>Uml Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.UmlDiagram
	 * @generated
	 */
	public Adapter createUmlDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.UmlDiagramElement <em>Uml Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement
	 * @generated
	 */
	public Adapter createUmlDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.UmlStyle <em>Uml Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.UmlStyle
	 * @generated
	 */
	public Adapter createUmlStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.UmlEdge <em>Uml Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.UmlEdge
	 * @generated
	 */
	public Adapter createUmlEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.TopUmlDiagramElement <em>Top Uml Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.TopUmlDiagramElement
	 * @generated
	 */
	public Adapter createTopUmlDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.UmlCompartment <em>Uml Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.UmlCompartment
	 * @generated
	 */
	public Adapter createUmlCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.UmlLabel <em>Uml Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.UmlLabel
	 * @generated
	 */
	public Adapter createUmlLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ClassDiagram <em>Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ClassDiagram
	 * @generated
	 */
	public Adapter createClassDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.StructureDiagram <em>Structure Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.StructureDiagram
	 * @generated
	 */
	public Adapter createStructureDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ClassifierShape <em>Classifier Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ClassifierShape
	 * @generated
	 */
	public Adapter createClassifierShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.PackageShape <em>Package Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.PackageShape
	 * @generated
	 */
	public Adapter createPackageShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.TemplateableElementShape <em>Templateable Element Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.TemplateableElementShape
	 * @generated
	 */
	public Adapter createTemplateableElementShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.NamedShape <em>Named Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.NamedShape
	 * @generated
	 */
	public Adapter createNamedShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ConstraintShape <em>Constraint Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ConstraintShape
	 * @generated
	 */
	public Adapter createConstraintShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.BodyShape <em>Body Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.BodyShape
	 * @generated
	 */
	public Adapter createBodyShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.AttributeCompartment <em>Attribute Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.AttributeCompartment
	 * @generated
	 */
	public Adapter createAttributeCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.OperationCompartment <em>Operation Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.OperationCompartment
	 * @generated
	 */
	public Adapter createOperationCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ReceptionCompartment <em>Reception Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ReceptionCompartment
	 * @generated
	 */
	public Adapter createReceptionCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.LiteralCompartment <em>Literal Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.LiteralCompartment
	 * @generated
	 */
	public Adapter createLiteralCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.PackagedElementCompartment
	 * <em>Packaged Element Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.PackagedElementCompartment
	 * @generated
	 */
	public Adapter createPackagedElementCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.NameLabel <em>Name Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.NameLabel
	 * @generated
	 */
	public Adapter createNameLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.NamedEdge <em>Named Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.NamedEdge
	 * @generated
	 */
	public Adapter createNamedEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.PropertyEdge <em>Property Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.PropertyEdge
	 * @generated
	 */
	public Adapter createPropertyEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ModifierLabel <em>Modifier Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ModifierLabel
	 * @generated
	 */
	public Adapter createModifierLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.InstanceSpecificationEdge <em>Instance Specification Edge</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.InstanceSpecificationEdge
	 * @generated
	 */
	public Adapter createInstanceSpecificationEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.BodyLabel <em>Body Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.BodyLabel
	 * @generated
	 */
	public Adapter createBodyLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.InstanceSpecificationShape
	 * <em>Instance Specification Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.InstanceSpecificationShape
	 * @generated
	 */
	public Adapter createInstanceSpecificationShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.SlotCompartment <em>Slot Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.SlotCompartment
	 * @generated
	 */
	public Adapter createSlotCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.SlotLabel <em>Slot Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.SlotLabel
	 * @generated
	 */
	public Adapter createSlotLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ClassShape <em>Class Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ClassShape
	 * @generated
	 */
	public Adapter createClassShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ClassifierWithReceptionsShape
	 * <em>Classifier With Receptions Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ClassifierWithReceptionsShape
	 * @generated
	 */
	public Adapter createClassifierWithReceptionsShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ReceptionLabel <em>Reception Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ReceptionLabel
	 * @generated
	 */
	public Adapter createReceptionLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ClassifierWithAttributesShape
	 * <em>Classifier With Attributes Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ClassifierWithAttributesShape
	 * @generated
	 */
	public Adapter createClassifierWithAttributesShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.PropertyLabel <em>Property Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.PropertyLabel
	 * @generated
	 */
	public Adapter createPropertyLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ClassifierWithOperationsShape
	 * <em>Classifier With Operations Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ClassifierWithOperationsShape
	 * @generated
	 */
	public Adapter createClassifierWithOperationsShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.OperationLabel <em>Operation Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.OperationLabel
	 * @generated
	 */
	public Adapter createOperationLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.InterfaceShape <em>Interface Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.InterfaceShape
	 * @generated
	 */
	public Adapter createInterfaceShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.DataTypeShape <em>Data Type Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.DataTypeShape
	 * @generated
	 */
	public Adapter createDataTypeShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.PrimitiveTypeShape <em>Primitive Type Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.PrimitiveTypeShape
	 * @generated
	 */
	public Adapter createPrimitiveTypeShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.EnumerationShape <em>Enumeration Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.EnumerationShape
	 * @generated
	 */
	public Adapter createEnumerationShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.LiteralLabel <em>Literal Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.LiteralLabel
	 * @generated
	 */
	public Adapter createLiteralLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.RoleLabel <em>Role Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.RoleLabel
	 * @generated
	 */
	public Adapter createRoleLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.SignalShape <em>Signal Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.SignalShape
	 * @generated
	 */
	public Adapter createSignalShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ModelShape <em>Model Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ModelShape
	 * @generated
	 */
	public Adapter createModelShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ContainmentEdge <em>Containment Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ContainmentEdge
	 * @generated
	 */
	public Adapter createContainmentEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.GeneralizationEdge <em>Generalization Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.GeneralizationEdge
	 * @generated
	 */
	public Adapter createGeneralizationEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.AssociationEdge <em>Association Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.AssociationEdge
	 * @generated
	 */
	public Adapter createAssociationEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.MultiplicityLabel <em>Multiplicity Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.MultiplicityLabel
	 * @generated
	 */
	public Adapter createMultiplicityLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.RealizationEdge <em>Realization Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.RealizationEdge
	 * @generated
	 */
	public Adapter createRealizationEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.AbstractionEdge <em>Abstraction Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.AbstractionEdge
	 * @generated
	 */
	public Adapter createAbstractionEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.DependencyEdge <em>Dependency Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.DependencyEdge
	 * @generated
	 */
	public Adapter createDependencyEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.InterfaceRealizationEdge <em>Interface Realization Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.InterfaceRealizationEdge
	 * @generated
	 */
	public Adapter createInterfaceRealizationEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.UsageEdge <em>Usage Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.UsageEdge
	 * @generated
	 */
	public Adapter createUsageEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ElementImportEdge <em>Element Import Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ElementImportEdge
	 * @generated
	 */
	public Adapter createElementImportEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.PackageImportEdge <em>Package Import Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.PackageImportEdge
	 * @generated
	 */
	public Adapter createPackageImportEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.PackageMergeEdge <em>Package Merge Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.PackageMergeEdge
	 * @generated
	 */
	public Adapter createPackageMergeEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.SubstitutionEdge <em>Substitution Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.SubstitutionEdge
	 * @generated
	 */
	public Adapter createSubstitutionEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.InformationFlowEdge <em>Information Flow Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.InformationFlowEdge
	 * @generated
	 */
	public Adapter createInformationFlowEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ItemLabel <em>Item Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ItemLabel
	 * @generated
	 */
	public Adapter createItemLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.AssociationClassEdge <em>Association Class Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.AssociationClassEdge
	 * @generated
	 */
	public Adapter createAssociationClassEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.GeneralizationSetEdge <em>Generalization Set Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.GeneralizationSetEdge
	 * @generated
	 */
	public Adapter createGeneralizationSetEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.PowerLabel <em>Power Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.PowerLabel
	 * @generated
	 */
	public Adapter createPowerLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.CommentShape <em>Comment Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.CommentShape
	 * @generated
	 */
	public Adapter createCommentShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.AttachmentEdge <em>Attachment Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.AttachmentEdge
	 * @generated
	 */
	public Adapter createAttachmentEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.AssociationClassShape <em>Association Class Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.AssociationClassShape
	 * @generated
	 */
	public Adapter createAssociationClassShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.ComponentShape <em>Component Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.ComponentShape
	 * @generated
	 */
	public Adapter createComponentShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.InformationItemShape <em>Information Item Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.InformationItemShape
	 * @generated
	 */
	public Adapter createInformationItemShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.RepresentationEdge <em>Representation Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.RepresentationEdge
	 * @generated
	 */
	public Adapter createRepresentationEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.AssociationShape <em>Association Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.AssociationShape
	 * @generated
	 */
	public Adapter createAssociationShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.DependencyShape <em>Dependency Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.DependencyShape
	 * @generated
	 */
	public Adapter createDependencyShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.TimeObservationShape <em>Time Observation Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.TimeObservationShape
	 * @generated
	 */
	public Adapter createTimeObservationShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.DurationObservationShape <em>Duration Observation Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.DurationObservationShape
	 * @generated
	 */
	public Adapter createDurationObservationShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.TemplateParameterCompartment
	 * <em>Template Parameter Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.TemplateParameterCompartment
	 * @generated
	 */
	public Adapter createTemplateParameterCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.TemplateParameterLabel <em>Template Parameter Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.TemplateParameterLabel
	 * @generated
	 */
	public Adapter createTemplateParameterLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.umldi.UmlShape <em>Uml Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.umldi.UmlShape
	 * @generated
	 */
	public Adapter createUmlShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.dd.di.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.dd.di.DiagramElement
	 * @generated
	 */
	public Adapter createDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.dd.di.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.dd.di.Shape
	 * @generated
	 */
	public Adapter createShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.dd.di.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.dd.di.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.dd.di.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.dd.di.Style
	 * @generated
	 */
	public Adapter createStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.dd.di.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.dd.di.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}
} //UMLDIAdapterFactory
