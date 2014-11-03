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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.papyrus.dd.dc.DCPackage;
import org.eclipse.papyrus.dd.di.DIPackage;
import org.eclipse.papyrus.umldi.AbstractionEdge;
import org.eclipse.papyrus.umldi.AssociationClassEdge;
import org.eclipse.papyrus.umldi.AssociationClassShape;
import org.eclipse.papyrus.umldi.AssociationEdge;
import org.eclipse.papyrus.umldi.AssociationShape;
import org.eclipse.papyrus.umldi.AttachmentEdge;
import org.eclipse.papyrus.umldi.AttributeCompartment;
import org.eclipse.papyrus.umldi.BodyLabel;
import org.eclipse.papyrus.umldi.BodyShape;
import org.eclipse.papyrus.umldi.ClassDiagram;
import org.eclipse.papyrus.umldi.ClassShape;
import org.eclipse.papyrus.umldi.ClassifierShape;
import org.eclipse.papyrus.umldi.ClassifierWithAttributesShape;
import org.eclipse.papyrus.umldi.ClassifierWithOperationsShape;
import org.eclipse.papyrus.umldi.ClassifierWithReceptionsShape;
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
import org.eclipse.papyrus.umldi.NamedEdge;
import org.eclipse.papyrus.umldi.NamedShape;
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
import org.eclipse.papyrus.umldi.StructureDiagram;
import org.eclipse.papyrus.umldi.SubstitutionEdge;
import org.eclipse.papyrus.umldi.TemplateParameterCompartment;
import org.eclipse.papyrus.umldi.TemplateParameterLabel;
import org.eclipse.papyrus.umldi.TemplateableElementShape;
import org.eclipse.papyrus.umldi.TimeObservationShape;
import org.eclipse.papyrus.umldi.TopUmlDiagramElement;
import org.eclipse.papyrus.umldi.UMLDIFactory;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlCompartment;
import org.eclipse.papyrus.umldi.UmlDiagram;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.papyrus.umldi.UmlEdge;
import org.eclipse.papyrus.umldi.UmlLabel;
import org.eclipse.papyrus.umldi.UmlShape;
import org.eclipse.papyrus.umldi.UmlStyle;
import org.eclipse.papyrus.umldi.UsageEdge;
import org.eclipse.papyrus.umldi.util.UMLDIValidator;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class UMLDIPackageImpl extends EPackageImpl implements UMLDIPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass umlDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass umlDiagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass umlStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass umlEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass topUmlDiagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass umlCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass umlLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass classDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass structureDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass classifierShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass packageShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass templateableElementShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass namedShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass constraintShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass bodyShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass operationCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass receptionCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass literalCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass packagedElementCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nameLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass namedEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass propertyEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass modifierLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass instanceSpecificationEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass bodyLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass instanceSpecificationShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass slotCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass slotLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass classShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass classifierWithReceptionsShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass receptionLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass classifierWithAttributesShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass propertyLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass classifierWithOperationsShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass operationLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass interfaceShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dataTypeShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass primitiveTypeShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass enumerationShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass literalLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass roleLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass signalShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass modelShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass containmentEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass generalizationEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass multiplicityLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass realizationEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass abstractionEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dependencyEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass interfaceRealizationEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass usageEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass elementImportEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass packageImportEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass packageMergeEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass substitutionEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass informationFlowEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass itemLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationClassEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass generalizationSetEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass powerLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass commentShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attachmentEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationClassShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass componentShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass informationItemShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass representationEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dependencyShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass timeObservationShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass durationObservationShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass templateParameterCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass templateParameterLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass umlShapeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UMLDIPackageImpl() {
		super(eNS_URI, UMLDIFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link UMLDIPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UMLDIPackage init() {
		if(isInited)
			return (UMLDIPackage)EPackage.Registry.INSTANCE.getEPackage(UMLDIPackage.eNS_URI);
		// Obtain or create and register package
		UMLDIPackageImpl theUMLDIPackage = (UMLDIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UMLDIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UMLDIPackageImpl());
		isInited = true;
		// Initialize simple dependencies
		DIPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		// Create package meta-data objects
		theUMLDIPackage.createPackageContents();
		// Initialize created meta-data
		theUMLDIPackage.initializePackageContents();
		// Register package validator
		EValidator.Registry.INSTANCE.put(theUMLDIPackage, new EValidator.Descriptor() {

			public EValidator getEValidator() {
				return UMLDIValidator.INSTANCE;
			}
		});
		// Mark meta-data to indicate it can't be changed
		theUMLDIPackage.freeze();
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UMLDIPackage.eNS_URI, theUMLDIPackage);
		return theUMLDIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUmlDiagram() {
		return umlDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUmlDiagram_TopUmlDiagramElement() {
		return (EReference)umlDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUmlDiagramElement() {
		return umlDiagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUmlDiagramElement_UmlModelElement() {
		return (EReference)umlDiagramElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUmlDiagramElement_SharedUmlStyle() {
		return (EReference)umlDiagramElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUmlDiagramElement_LocalUmlStyle() {
		return (EReference)umlDiagramElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUmlDiagramElement_OwningUmlDiagramElement() {
		return (EReference)umlDiagramElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUmlDiagramElement_OwnedUmlDiagramElement() {
		return (EReference)umlDiagramElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUmlDiagramElement_TargetUmlEdge() {
		return (EReference)umlDiagramElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUmlDiagramElement_SourceUmlEdge() {
		return (EReference)umlDiagramElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUmlStyle() {
		return umlStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUmlStyle_FontName() {
		return (EAttribute)umlStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUmlStyle_FontSize() {
		return (EAttribute)umlStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getUmlStyle__FontsizePositive__DiagnosticChain_Map() {
		return umlStyleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUmlEdge() {
		return umlEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUmlEdge_SourceUmlDiagramElement() {
		return (EReference)umlEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUmlEdge_TargetUmlDiagramElement() {
		return (EReference)umlEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTopUmlDiagramElement() {
		return topUmlDiagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTopUmlDiagramElement_PackageCompartment() {
		return (EReference)topUmlDiagramElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTopUmlDiagramElement_UmlDiagram() {
		return (EReference)topUmlDiagramElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUmlCompartment() {
		return umlCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUmlLabel() {
		return umlLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClassDiagram() {
		return classDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStructureDiagram() {
		return structureDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClassifierShape() {
		return classifierShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getClassifierShape_IsIcon() {
		return (EAttribute)classifierShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPackageShape() {
		return packageShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPackageShape_PackagedElementCompartment() {
		return (EReference)packageShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTemplateableElementShape() {
		return templateableElementShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTemplateableElementShape_TemplateParameterCompartment() {
		return (EReference)templateableElementShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNamedShape() {
		return namedShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNamedShape_NameLabel() {
		return (EReference)namedShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getConstraintShape() {
		return constraintShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBodyShape() {
		return bodyShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBodyShape_BodyLabel() {
		return (EReference)bodyShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeCompartment() {
		return attributeCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeCompartment_ClassifierWithAttributesShape() {
		return (EReference)attributeCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeCompartment_AttributeLabel() {
		return (EReference)attributeCompartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOperationCompartment() {
		return operationCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOperationCompartment_ClassifierWithOperationsShape() {
		return (EReference)operationCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOperationCompartment_OperationLabel() {
		return (EReference)operationCompartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getReceptionCompartment() {
		return receptionCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReceptionCompartment_SignalShape() {
		return (EReference)receptionCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReceptionCompartment_ReceptionLabel() {
		return (EReference)receptionCompartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLiteralCompartment() {
		return literalCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLiteralCompartment_EnumerationShape() {
		return (EReference)literalCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLiteralCompartment_LiteralLabel() {
		return (EReference)literalCompartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPackagedElementCompartment() {
		return packagedElementCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPackagedElementCompartment_PackageShape() {
		return (EReference)packagedElementCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPackagedElementCompartment_TopUmlDiagramElement() {
		return (EReference)packagedElementCompartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNameLabel() {
		return nameLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNameLabel_NamedElementEdge() {
		return (EReference)nameLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNameLabel_NamedElementShape() {
		return (EReference)nameLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNamedEdge() {
		return namedEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNamedEdge_NameLabel() {
		return (EReference)namedEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPropertyEdge() {
		return propertyEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPropertyEdge_ModifierLabel() {
		return (EReference)propertyEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPropertyEdge_MultiplicityLabel() {
		return (EReference)propertyEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getModifierLabel() {
		return modifierLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getModifierLabel_AssociationEdge() {
		return (EReference)modifierLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getModifierLabel_GeneralizationSetEdge() {
		return (EReference)modifierLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getModifierLabel_PropertyEdge() {
		return (EReference)modifierLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInstanceSpecificationEdge() {
		return instanceSpecificationEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getInstanceSpecificationEdge_EndRoleLabel() {
		return (EReference)instanceSpecificationEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBodyLabel() {
		return bodyLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBodyLabel_ConstraintShape() {
		return (EReference)bodyLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInstanceSpecificationShape() {
		return instanceSpecificationShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getInstanceSpecificationShape_SlotCompartment() {
		return (EReference)instanceSpecificationShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSlotCompartment() {
		return slotCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSlotCompartment_SlotLabel() {
		return (EReference)slotCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSlotCompartment_InstanceSpecificationShape() {
		return (EReference)slotCompartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSlotLabel() {
		return slotLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSlotLabel_SlotCompartment() {
		return (EReference)slotLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClassShape() {
		return classShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClassifierWithReceptionsShape() {
		return classifierWithReceptionsShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getClassifierWithReceptionsShape_ReceptionCompartment() {
		return (EReference)classifierWithReceptionsShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getReceptionLabel() {
		return receptionLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReceptionLabel_ReceptionCompartment() {
		return (EReference)receptionLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClassifierWithAttributesShape() {
		return classifierWithAttributesShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getClassifierWithAttributesShape_AttributeCompartment() {
		return (EReference)classifierWithAttributesShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPropertyLabel() {
		return propertyLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPropertyLabel_AttributeCompartment() {
		return (EReference)propertyLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClassifierWithOperationsShape() {
		return classifierWithOperationsShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getClassifierWithOperationsShape_OperationCompartment() {
		return (EReference)classifierWithOperationsShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOperationLabel() {
		return operationLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOperationLabel_OperationCompartment() {
		return (EReference)operationLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInterfaceShape() {
		return interfaceShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDataTypeShape() {
		return dataTypeShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPrimitiveTypeShape() {
		return primitiveTypeShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEnumerationShape() {
		return enumerationShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnumerationShape_LiteralCompartment() {
		return (EReference)enumerationShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLiteralLabel() {
		return literalLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLiteralLabel_LiteralCompartment() {
		return (EReference)literalLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRoleLabel() {
		return roleLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRoleLabel_AssociationEdge() {
		return (EReference)roleLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRoleLabel_InstanceSpecificationEdge() {
		return (EReference)roleLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSignalShape() {
		return signalShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getModelShape() {
		return modelShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getContainmentEdge() {
		return containmentEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGeneralizationEdge() {
		return generalizationEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationEdge() {
		return associationEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMultiplicityLabel() {
		return multiplicityLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMultiplicityLabel_PropertyEdge() {
		return (EReference)multiplicityLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMultiplicityLabel_AssociationEdge() {
		return (EReference)multiplicityLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationEdge_EndMultiplicityLabel() {
		return (EReference)associationEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationEdge_EndModifierLabel() {
		return (EReference)associationEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationEdge_EndRoleLabel() {
		return (EReference)associationEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRealizationEdge() {
		return realizationEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAbstractionEdge() {
		return abstractionEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDependencyEdge() {
		return dependencyEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInterfaceRealizationEdge() {
		return interfaceRealizationEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUsageEdge() {
		return usageEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getElementImportEdge() {
		return elementImportEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPackageImportEdge() {
		return packageImportEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPackageMergeEdge() {
		return packageMergeEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSubstitutionEdge() {
		return substitutionEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInformationFlowEdge() {
		return informationFlowEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getInformationFlowEdge_ItemLabel() {
		return (EReference)informationFlowEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getItemLabel() {
		return itemLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getItemLabel_InformationFlowEdge() {
		return (EReference)itemLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationClassEdge() {
		return associationClassEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGeneralizationSetEdge() {
		return generalizationSetEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGeneralizationSetEdge_PowerLabel() {
		return (EReference)generalizationSetEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGeneralizationSetEdge_ModifierLabel() {
		return (EReference)generalizationSetEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPowerLabel() {
		return powerLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPowerLabel_GeneralizationSetEdge() {
		return (EReference)powerLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCommentShape() {
		return commentShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttachmentEdge() {
		return attachmentEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationClassShape() {
		return associationClassShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getComponentShape() {
		return componentShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInformationItemShape() {
		return informationItemShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRepresentationEdge() {
		return representationEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationShape() {
		return associationShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDependencyShape() {
		return dependencyShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTimeObservationShape() {
		return timeObservationShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDurationObservationShape() {
		return durationObservationShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTemplateParameterCompartment() {
		return templateParameterCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTemplateParameterCompartment_TemplateParameterLabel() {
		return (EReference)templateParameterCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTemplateParameterCompartment_TemplateableElementShape() {
		return (EReference)templateParameterCompartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTemplateParameterLabel() {
		return templateParameterLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTemplateParameterLabel_TemplateParameterCompartment() {
		return (EReference)templateParameterLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUmlShape() {
		return umlShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLDIFactory getUMLDIFactory() {
		return (UMLDIFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if(isCreated)
			return;
		isCreated = true;
		// Create classes and their features
		umlDiagramEClass = createEClass(UML_DIAGRAM);
		createEReference(umlDiagramEClass, UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT);
		umlDiagramElementEClass = createEClass(UML_DIAGRAM_ELEMENT);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE);
		umlStyleEClass = createEClass(UML_STYLE);
		createEAttribute(umlStyleEClass, UML_STYLE__FONT_NAME);
		createEAttribute(umlStyleEClass, UML_STYLE__FONT_SIZE);
		createEOperation(umlStyleEClass, UML_STYLE___FONTSIZE_POSITIVE__DIAGNOSTICCHAIN_MAP);
		umlEdgeEClass = createEClass(UML_EDGE);
		createEReference(umlEdgeEClass, UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT);
		createEReference(umlEdgeEClass, UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT);
		topUmlDiagramElementEClass = createEClass(TOP_UML_DIAGRAM_ELEMENT);
		createEReference(topUmlDiagramElementEClass, TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT);
		createEReference(topUmlDiagramElementEClass, TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM);
		packagedElementCompartmentEClass = createEClass(PACKAGED_ELEMENT_COMPARTMENT);
		createEReference(packagedElementCompartmentEClass, PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE);
		createEReference(packagedElementCompartmentEClass, PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT);
		umlCompartmentEClass = createEClass(UML_COMPARTMENT);
		packageShapeEClass = createEClass(PACKAGE_SHAPE);
		createEReference(packageShapeEClass, PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT);
		templateableElementShapeEClass = createEClass(TEMPLATEABLE_ELEMENT_SHAPE);
		createEReference(templateableElementShapeEClass, TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT);
		namedShapeEClass = createEClass(NAMED_SHAPE);
		createEReference(namedShapeEClass, NAMED_SHAPE__NAME_LABEL);
		umlShapeEClass = createEClass(UML_SHAPE);
		nameLabelEClass = createEClass(NAME_LABEL);
		createEReference(nameLabelEClass, NAME_LABEL__NAMED_ELEMENT_EDGE);
		createEReference(nameLabelEClass, NAME_LABEL__NAMED_ELEMENT_SHAPE);
		umlLabelEClass = createEClass(UML_LABEL);
		namedEdgeEClass = createEClass(NAMED_EDGE);
		createEReference(namedEdgeEClass, NAMED_EDGE__NAME_LABEL);
		templateParameterCompartmentEClass = createEClass(TEMPLATE_PARAMETER_COMPARTMENT);
		createEReference(templateParameterCompartmentEClass, TEMPLATE_PARAMETER_COMPARTMENT__TEMPLATE_PARAMETER_LABEL);
		createEReference(templateParameterCompartmentEClass, TEMPLATE_PARAMETER_COMPARTMENT__TEMPLATEABLE_ELEMENT_SHAPE);
		templateParameterLabelEClass = createEClass(TEMPLATE_PARAMETER_LABEL);
		createEReference(templateParameterLabelEClass, TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT);
		classDiagramEClass = createEClass(CLASS_DIAGRAM);
		structureDiagramEClass = createEClass(STRUCTURE_DIAGRAM);
		classifierShapeEClass = createEClass(CLASSIFIER_SHAPE);
		createEAttribute(classifierShapeEClass, CLASSIFIER_SHAPE__IS_ICON);
		constraintShapeEClass = createEClass(CONSTRAINT_SHAPE);
		bodyShapeEClass = createEClass(BODY_SHAPE);
		createEReference(bodyShapeEClass, BODY_SHAPE__BODY_LABEL);
		bodyLabelEClass = createEClass(BODY_LABEL);
		createEReference(bodyLabelEClass, BODY_LABEL__CONSTRAINT_SHAPE);
		attributeCompartmentEClass = createEClass(ATTRIBUTE_COMPARTMENT);
		createEReference(attributeCompartmentEClass, ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE);
		createEReference(attributeCompartmentEClass, ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL);
		classifierWithAttributesShapeEClass = createEClass(CLASSIFIER_WITH_ATTRIBUTES_SHAPE);
		createEReference(classifierWithAttributesShapeEClass, CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT);
		propertyLabelEClass = createEClass(PROPERTY_LABEL);
		createEReference(propertyLabelEClass, PROPERTY_LABEL__ATTRIBUTE_COMPARTMENT);
		operationCompartmentEClass = createEClass(OPERATION_COMPARTMENT);
		createEReference(operationCompartmentEClass, OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE);
		createEReference(operationCompartmentEClass, OPERATION_COMPARTMENT__OPERATION_LABEL);
		classifierWithOperationsShapeEClass = createEClass(CLASSIFIER_WITH_OPERATIONS_SHAPE);
		createEReference(classifierWithOperationsShapeEClass, CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT);
		operationLabelEClass = createEClass(OPERATION_LABEL);
		createEReference(operationLabelEClass, OPERATION_LABEL__OPERATION_COMPARTMENT);
		receptionCompartmentEClass = createEClass(RECEPTION_COMPARTMENT);
		createEReference(receptionCompartmentEClass, RECEPTION_COMPARTMENT__SIGNAL_SHAPE);
		createEReference(receptionCompartmentEClass, RECEPTION_COMPARTMENT__RECEPTION_LABEL);
		classifierWithReceptionsShapeEClass = createEClass(CLASSIFIER_WITH_RECEPTIONS_SHAPE);
		createEReference(classifierWithReceptionsShapeEClass, CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT);
		receptionLabelEClass = createEClass(RECEPTION_LABEL);
		createEReference(receptionLabelEClass, RECEPTION_LABEL__RECEPTION_COMPARTMENT);
		literalCompartmentEClass = createEClass(LITERAL_COMPARTMENT);
		createEReference(literalCompartmentEClass, LITERAL_COMPARTMENT__ENUMERATION_SHAPE);
		createEReference(literalCompartmentEClass, LITERAL_COMPARTMENT__LITERAL_LABEL);
		enumerationShapeEClass = createEClass(ENUMERATION_SHAPE);
		createEReference(enumerationShapeEClass, ENUMERATION_SHAPE__LITERAL_COMPARTMENT);
		literalLabelEClass = createEClass(LITERAL_LABEL);
		createEReference(literalLabelEClass, LITERAL_LABEL__LITERAL_COMPARTMENT);
		roleLabelEClass = createEClass(ROLE_LABEL);
		createEReference(roleLabelEClass, ROLE_LABEL__ASSOCIATION_EDGE);
		createEReference(roleLabelEClass, ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE);
		associationEdgeEClass = createEClass(ASSOCIATION_EDGE);
		createEReference(associationEdgeEClass, ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL);
		createEReference(associationEdgeEClass, ASSOCIATION_EDGE__END_MODIFIER_LABEL);
		createEReference(associationEdgeEClass, ASSOCIATION_EDGE__END_ROLE_LABEL);
		multiplicityLabelEClass = createEClass(MULTIPLICITY_LABEL);
		createEReference(multiplicityLabelEClass, MULTIPLICITY_LABEL__PROPERTY_EDGE);
		createEReference(multiplicityLabelEClass, MULTIPLICITY_LABEL__ASSOCIATION_EDGE);
		propertyEdgeEClass = createEClass(PROPERTY_EDGE);
		createEReference(propertyEdgeEClass, PROPERTY_EDGE__MODIFIER_LABEL);
		createEReference(propertyEdgeEClass, PROPERTY_EDGE__MULTIPLICITY_LABEL);
		modifierLabelEClass = createEClass(MODIFIER_LABEL);
		createEReference(modifierLabelEClass, MODIFIER_LABEL__ASSOCIATION_EDGE);
		createEReference(modifierLabelEClass, MODIFIER_LABEL__GENERALIZATION_SET_EDGE);
		createEReference(modifierLabelEClass, MODIFIER_LABEL__PROPERTY_EDGE);
		generalizationSetEdgeEClass = createEClass(GENERALIZATION_SET_EDGE);
		createEReference(generalizationSetEdgeEClass, GENERALIZATION_SET_EDGE__POWER_LABEL);
		createEReference(generalizationSetEdgeEClass, GENERALIZATION_SET_EDGE__MODIFIER_LABEL);
		powerLabelEClass = createEClass(POWER_LABEL);
		createEReference(powerLabelEClass, POWER_LABEL__GENERALIZATION_SET_EDGE);
		instanceSpecificationEdgeEClass = createEClass(INSTANCE_SPECIFICATION_EDGE);
		createEReference(instanceSpecificationEdgeEClass, INSTANCE_SPECIFICATION_EDGE__END_ROLE_LABEL);
		instanceSpecificationShapeEClass = createEClass(INSTANCE_SPECIFICATION_SHAPE);
		createEReference(instanceSpecificationShapeEClass, INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT);
		slotCompartmentEClass = createEClass(SLOT_COMPARTMENT);
		createEReference(slotCompartmentEClass, SLOT_COMPARTMENT__SLOT_LABEL);
		createEReference(slotCompartmentEClass, SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE);
		slotLabelEClass = createEClass(SLOT_LABEL);
		createEReference(slotLabelEClass, SLOT_LABEL__SLOT_COMPARTMENT);
		classShapeEClass = createEClass(CLASS_SHAPE);
		interfaceShapeEClass = createEClass(INTERFACE_SHAPE);
		dataTypeShapeEClass = createEClass(DATA_TYPE_SHAPE);
		primitiveTypeShapeEClass = createEClass(PRIMITIVE_TYPE_SHAPE);
		signalShapeEClass = createEClass(SIGNAL_SHAPE);
		modelShapeEClass = createEClass(MODEL_SHAPE);
		containmentEdgeEClass = createEClass(CONTAINMENT_EDGE);
		generalizationEdgeEClass = createEClass(GENERALIZATION_EDGE);
		realizationEdgeEClass = createEClass(REALIZATION_EDGE);
		abstractionEdgeEClass = createEClass(ABSTRACTION_EDGE);
		dependencyEdgeEClass = createEClass(DEPENDENCY_EDGE);
		interfaceRealizationEdgeEClass = createEClass(INTERFACE_REALIZATION_EDGE);
		usageEdgeEClass = createEClass(USAGE_EDGE);
		elementImportEdgeEClass = createEClass(ELEMENT_IMPORT_EDGE);
		packageImportEdgeEClass = createEClass(PACKAGE_IMPORT_EDGE);
		packageMergeEdgeEClass = createEClass(PACKAGE_MERGE_EDGE);
		substitutionEdgeEClass = createEClass(SUBSTITUTION_EDGE);
		informationFlowEdgeEClass = createEClass(INFORMATION_FLOW_EDGE);
		createEReference(informationFlowEdgeEClass, INFORMATION_FLOW_EDGE__ITEM_LABEL);
		itemLabelEClass = createEClass(ITEM_LABEL);
		createEReference(itemLabelEClass, ITEM_LABEL__INFORMATION_FLOW_EDGE);
		associationClassEdgeEClass = createEClass(ASSOCIATION_CLASS_EDGE);
		commentShapeEClass = createEClass(COMMENT_SHAPE);
		attachmentEdgeEClass = createEClass(ATTACHMENT_EDGE);
		associationClassShapeEClass = createEClass(ASSOCIATION_CLASS_SHAPE);
		componentShapeEClass = createEClass(COMPONENT_SHAPE);
		informationItemShapeEClass = createEClass(INFORMATION_ITEM_SHAPE);
		representationEdgeEClass = createEClass(REPRESENTATION_EDGE);
		associationShapeEClass = createEClass(ASSOCIATION_SHAPE);
		dependencyShapeEClass = createEClass(DEPENDENCY_SHAPE);
		timeObservationShapeEClass = createEClass(TIME_OBSERVATION_SHAPE);
		durationObservationShapeEClass = createEClass(DURATION_OBSERVATION_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if(isInitialized)
			return;
		isInitialized = true;
		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);
		// Obtain other dependent packages
		DIPackage theDIPackage = (DIPackage)EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		DCPackage theDCPackage = (DCPackage)EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);
		// Create type parameters
		// Set bounds for type parameters
		// Add supertypes to classes
		umlDiagramEClass.getESuperTypes().add(this.getUmlDiagramElement());
		umlDiagramEClass.getESuperTypes().add(theDIPackage.getDiagram());
		umlDiagramElementEClass.getESuperTypes().add(theDIPackage.getDiagramElement());
		umlStyleEClass.getESuperTypes().add(theDIPackage.getStyle());
		umlEdgeEClass.getESuperTypes().add(this.getTopUmlDiagramElement());
		umlEdgeEClass.getESuperTypes().add(theDIPackage.getEdge());
		topUmlDiagramElementEClass.getESuperTypes().add(this.getUmlDiagramElement());
		packagedElementCompartmentEClass.getESuperTypes().add(this.getUmlCompartment());
		umlCompartmentEClass.getESuperTypes().add(this.getUmlDiagramElement());
		umlCompartmentEClass.getESuperTypes().add(theDIPackage.getShape());
		packageShapeEClass.getESuperTypes().add(this.getTemplateableElementShape());
		templateableElementShapeEClass.getESuperTypes().add(this.getNamedShape());
		namedShapeEClass.getESuperTypes().add(this.getUmlShape());
		umlShapeEClass.getESuperTypes().add(this.getTopUmlDiagramElement());
		umlShapeEClass.getESuperTypes().add(theDIPackage.getShape());
		nameLabelEClass.getESuperTypes().add(this.getUmlLabel());
		umlLabelEClass.getESuperTypes().add(this.getUmlDiagramElement());
		umlLabelEClass.getESuperTypes().add(theDIPackage.getShape());
		namedEdgeEClass.getESuperTypes().add(this.getUmlEdge());
		templateParameterCompartmentEClass.getESuperTypes().add(this.getUmlCompartment());
		templateParameterLabelEClass.getESuperTypes().add(this.getNameLabel());
		classDiagramEClass.getESuperTypes().add(this.getStructureDiagram());
		structureDiagramEClass.getESuperTypes().add(this.getUmlDiagram());
		classifierShapeEClass.getESuperTypes().add(this.getTemplateableElementShape());
		constraintShapeEClass.getESuperTypes().add(this.getBodyShape());
		constraintShapeEClass.getESuperTypes().add(this.getNamedShape());
		bodyShapeEClass.getESuperTypes().add(this.getUmlShape());
		bodyLabelEClass.getESuperTypes().add(this.getUmlLabel());
		attributeCompartmentEClass.getESuperTypes().add(this.getUmlCompartment());
		classifierWithAttributesShapeEClass.getESuperTypes().add(this.getClassifierShape());
		propertyLabelEClass.getESuperTypes().add(this.getNameLabel());
		operationCompartmentEClass.getESuperTypes().add(this.getUmlCompartment());
		classifierWithOperationsShapeEClass.getESuperTypes().add(this.getClassifierWithAttributesShape());
		operationLabelEClass.getESuperTypes().add(this.getNameLabel());
		receptionCompartmentEClass.getESuperTypes().add(this.getUmlCompartment());
		classifierWithReceptionsShapeEClass.getESuperTypes().add(this.getClassifierWithOperationsShape());
		receptionLabelEClass.getESuperTypes().add(this.getNameLabel());
		literalCompartmentEClass.getESuperTypes().add(this.getUmlCompartment());
		enumerationShapeEClass.getESuperTypes().add(this.getClassifierShape());
		literalLabelEClass.getESuperTypes().add(this.getNameLabel());
		roleLabelEClass.getESuperTypes().add(this.getNameLabel());
		associationEdgeEClass.getESuperTypes().add(this.getNamedEdge());
		multiplicityLabelEClass.getESuperTypes().add(this.getUmlLabel());
		propertyEdgeEClass.getESuperTypes().add(this.getNamedEdge());
		modifierLabelEClass.getESuperTypes().add(this.getUmlLabel());
		generalizationSetEdgeEClass.getESuperTypes().add(this.getNamedEdge());
		powerLabelEClass.getESuperTypes().add(this.getUmlLabel());
		instanceSpecificationEdgeEClass.getESuperTypes().add(this.getNamedEdge());
		instanceSpecificationShapeEClass.getESuperTypes().add(this.getNamedShape());
		slotCompartmentEClass.getESuperTypes().add(this.getUmlCompartment());
		slotLabelEClass.getESuperTypes().add(this.getNameLabel());
		classShapeEClass.getESuperTypes().add(this.getClassifierWithReceptionsShape());
		interfaceShapeEClass.getESuperTypes().add(this.getClassifierWithReceptionsShape());
		dataTypeShapeEClass.getESuperTypes().add(this.getClassifierWithOperationsShape());
		primitiveTypeShapeEClass.getESuperTypes().add(this.getDataTypeShape());
		signalShapeEClass.getESuperTypes().add(this.getClassifierWithAttributesShape());
		modelShapeEClass.getESuperTypes().add(this.getPackageShape());
		containmentEdgeEClass.getESuperTypes().add(this.getUmlEdge());
		generalizationEdgeEClass.getESuperTypes().add(this.getNamedEdge());
		realizationEdgeEClass.getESuperTypes().add(this.getAbstractionEdge());
		abstractionEdgeEClass.getESuperTypes().add(this.getDependencyEdge());
		dependencyEdgeEClass.getESuperTypes().add(this.getNamedEdge());
		interfaceRealizationEdgeEClass.getESuperTypes().add(this.getRealizationEdge());
		usageEdgeEClass.getESuperTypes().add(this.getDependencyEdge());
		elementImportEdgeEClass.getESuperTypes().add(this.getNamedEdge());
		packageImportEdgeEClass.getESuperTypes().add(this.getNamedEdge());
		packageMergeEdgeEClass.getESuperTypes().add(this.getNamedEdge());
		substitutionEdgeEClass.getESuperTypes().add(this.getRealizationEdge());
		informationFlowEdgeEClass.getESuperTypes().add(this.getNamedEdge());
		itemLabelEClass.getESuperTypes().add(this.getUmlLabel());
		associationClassEdgeEClass.getESuperTypes().add(this.getAssociationEdge());
		commentShapeEClass.getESuperTypes().add(this.getBodyShape());
		attachmentEdgeEClass.getESuperTypes().add(this.getUmlEdge());
		associationClassShapeEClass.getESuperTypes().add(this.getClassShape());
		componentShapeEClass.getESuperTypes().add(this.getClassShape());
		informationItemShapeEClass.getESuperTypes().add(this.getClassifierShape());
		representationEdgeEClass.getESuperTypes().add(this.getNamedEdge());
		associationShapeEClass.getESuperTypes().add(this.getClassifierShape());
		dependencyShapeEClass.getESuperTypes().add(this.getNamedShape());
		timeObservationShapeEClass.getESuperTypes().add(this.getNamedShape());
		durationObservationShapeEClass.getESuperTypes().add(this.getNamedShape());
		// Initialize classes, features, and operations; add parameters
		initEClass(umlDiagramEClass, UmlDiagram.class, "UmlDiagram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlDiagram_TopUmlDiagramElement(), this.getTopUmlDiagramElement(), this.getTopUmlDiagramElement_UmlDiagram(), "topUmlDiagramElement", null, 0, -1, UmlDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(umlDiagramElementEClass, UmlDiagramElement.class, "UmlDiagramElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlDiagramElement_UmlModelElement(), theUMLPackage.getElement(), null, "umlModelElement", null, 0, 1, UmlDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlDiagramElement_SharedUmlStyle(), this.getUmlStyle(), null, "sharedUmlStyle", null, 0, 1, UmlDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlDiagramElement_LocalUmlStyle(), this.getUmlStyle(), null, "localUmlStyle", null, 0, 1, UmlDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlDiagramElement_OwnedUmlDiagramElement(), this.getUmlDiagramElement(), this.getUmlDiagramElement_OwningUmlDiagramElement(), "ownedUmlDiagramElement", null, 0, -1, UmlDiagramElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUmlDiagramElement_OwningUmlDiagramElement(), this.getUmlDiagramElement(), this.getUmlDiagramElement_OwnedUmlDiagramElement(), "owningUmlDiagramElement", null, 0, 1, UmlDiagramElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlDiagramElement_TargetUmlEdge(), this.getUmlEdge(), this.getUmlEdge_TargetUmlDiagramElement(), "targetUmlEdge", null, 0, -1, UmlDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlDiagramElement_SourceUmlEdge(), this.getUmlEdge(), this.getUmlEdge_SourceUmlDiagramElement(), "sourceUmlEdge", null, 0, -1, UmlDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEClass(umlStyleEClass, UmlStyle.class, "UmlStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUmlStyle_FontName(), theDCPackage.getString(), "fontName", null, 0, 1, UmlStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUmlStyle_FontSize(), theDCPackage.getReal(), "fontSize", null, 0, 1, UmlStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		EOperation op = initEOperation(getUmlStyle__FontsizePositive__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "fontsizePositive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		initEClass(umlEdgeEClass, UmlEdge.class, "UmlEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlEdge_SourceUmlDiagramElement(), this.getUmlDiagramElement(), this.getUmlDiagramElement_SourceUmlEdge(), "sourceUmlDiagramElement", null, 1, 1, UmlEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlEdge_TargetUmlDiagramElement(), this.getUmlDiagramElement(), this.getUmlDiagramElement_TargetUmlEdge(), "targetUmlDiagramElement", null, 1, 1, UmlEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(topUmlDiagramElementEClass, TopUmlDiagramElement.class, "TopUmlDiagramElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopUmlDiagramElement_PackageCompartment(), this.getPackagedElementCompartment(), this.getPackagedElementCompartment_TopUmlDiagramElement(), "packageCompartment", null, 0, 1, TopUmlDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTopUmlDiagramElement_UmlDiagram(), this.getUmlDiagram(), this.getUmlDiagram_TopUmlDiagramElement(), "umlDiagram", null, 0, 1, TopUmlDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(packagedElementCompartmentEClass, PackagedElementCompartment.class, "PackagedElementCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackagedElementCompartment_PackageShape(), this.getPackageShape(), this.getPackageShape_PackagedElementCompartment(), "packageShape", null, 0, 1, PackagedElementCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackagedElementCompartment_TopUmlDiagramElement(), this.getTopUmlDiagramElement(), this.getTopUmlDiagramElement_PackageCompartment(), "topUmlDiagramElement", null, 0, -1, PackagedElementCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEClass(umlCompartmentEClass, UmlCompartment.class, "UmlCompartment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(packageShapeEClass, PackageShape.class, "PackageShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageShape_PackagedElementCompartment(), this.getPackagedElementCompartment(), this.getPackagedElementCompartment_PackageShape(), "packagedElementCompartment", null, 0, 1, PackageShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(templateableElementShapeEClass, TemplateableElementShape.class, "TemplateableElementShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateableElementShape_TemplateParameterCompartment(), this.getTemplateParameterCompartment(), this.getTemplateParameterCompartment_TemplateableElementShape(), "templateParameterCompartment", null, 0, 1, TemplateableElementShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(namedShapeEClass, NamedShape.class, "NamedShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedShape_NameLabel(), this.getNameLabel(), this.getNameLabel_NamedElementShape(), "nameLabel", null, 0, 1, NamedShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(umlShapeEClass, UmlShape.class, "UmlShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(nameLabelEClass, NameLabel.class, "NameLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameLabel_NamedElementEdge(), this.getNamedEdge(), this.getNamedEdge_NameLabel(), "namedElementEdge", null, 0, 1, NameLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNameLabel_NamedElementShape(), this.getNamedShape(), this.getNamedShape_NameLabel(), "namedElementShape", null, 0, 1, NameLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(umlLabelEClass, UmlLabel.class, "UmlLabel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(namedEdgeEClass, NamedEdge.class, "NamedEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedEdge_NameLabel(), this.getNameLabel(), this.getNameLabel_NamedElementEdge(), "nameLabel", null, 0, 1, NamedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(templateParameterCompartmentEClass, TemplateParameterCompartment.class, "TemplateParameterCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateParameterCompartment_TemplateParameterLabel(), this.getTemplateParameterLabel(), this.getTemplateParameterLabel_TemplateParameterCompartment(), "templateParameterLabel", null, 0, -1, TemplateParameterCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameterCompartment_TemplateableElementShape(), this.getTemplateableElementShape(), this.getTemplateableElementShape_TemplateParameterCompartment(), "templateableElementShape", null, 0, 1, TemplateParameterCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(templateParameterLabelEClass, TemplateParameterLabel.class, "TemplateParameterLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateParameterLabel_TemplateParameterCompartment(), this.getTemplateParameterCompartment(), this.getTemplateParameterCompartment_TemplateParameterLabel(), "templateParameterCompartment", null, 0, 1, TemplateParameterLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(classDiagramEClass, ClassDiagram.class, "ClassDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(structureDiagramEClass, StructureDiagram.class, "StructureDiagram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(classifierShapeEClass, ClassifierShape.class, "ClassifierShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifierShape_IsIcon(), theDCPackage.getBoolean(), "isIcon", null, 1, 1, ClassifierShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(constraintShapeEClass, ConstraintShape.class, "ConstraintShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(bodyShapeEClass, BodyShape.class, "BodyShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodyShape_BodyLabel(), this.getBodyLabel(), this.getBodyLabel_ConstraintShape(), "bodyLabel", null, 0, 1, BodyShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(bodyLabelEClass, BodyLabel.class, "BodyLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodyLabel_ConstraintShape(), this.getBodyShape(), this.getBodyShape_BodyLabel(), "constraintShape", null, 0, 1, BodyLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(attributeCompartmentEClass, AttributeCompartment.class, "AttributeCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeCompartment_ClassifierWithAttributesShape(), this.getClassifierWithAttributesShape(), this.getClassifierWithAttributesShape_AttributeCompartment(), "classifierWithAttributesShape", null, 0, 1, AttributeCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeCompartment_AttributeLabel(), this.getPropertyLabel(), this.getPropertyLabel_AttributeCompartment(), "attributeLabel", null, 0, -1, AttributeCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEClass(classifierWithAttributesShapeEClass, ClassifierWithAttributesShape.class, "ClassifierWithAttributesShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierWithAttributesShape_AttributeCompartment(), this.getAttributeCompartment(), this.getAttributeCompartment_ClassifierWithAttributesShape(), "attributeCompartment", null, 0, 1, ClassifierWithAttributesShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(propertyLabelEClass, PropertyLabel.class, "PropertyLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyLabel_AttributeCompartment(), this.getAttributeCompartment(), this.getAttributeCompartment_AttributeLabel(), "attributeCompartment", null, 0, 1, PropertyLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(operationCompartmentEClass, OperationCompartment.class, "OperationCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCompartment_ClassifierWithOperationsShape(), this.getClassifierWithOperationsShape(), this.getClassifierWithOperationsShape_OperationCompartment(), "classifierWithOperationsShape", null, 0, 1, OperationCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperationCompartment_OperationLabel(), this.getOperationLabel(), this.getOperationLabel_OperationCompartment(), "operationLabel", null, 0, -1, OperationCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEClass(classifierWithOperationsShapeEClass, ClassifierWithOperationsShape.class, "ClassifierWithOperationsShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierWithOperationsShape_OperationCompartment(), this.getOperationCompartment(), this.getOperationCompartment_ClassifierWithOperationsShape(), "operationCompartment", null, 0, 1, ClassifierWithOperationsShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(operationLabelEClass, OperationLabel.class, "OperationLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationLabel_OperationCompartment(), this.getOperationCompartment(), this.getOperationCompartment_OperationLabel(), "operationCompartment", null, 0, 1, OperationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(receptionCompartmentEClass, ReceptionCompartment.class, "ReceptionCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceptionCompartment_SignalShape(), this.getClassifierWithReceptionsShape(), this.getClassifierWithReceptionsShape_ReceptionCompartment(), "signalShape", null, 0, 1, ReceptionCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReceptionCompartment_ReceptionLabel(), this.getReceptionLabel(), this.getReceptionLabel_ReceptionCompartment(), "receptionLabel", null, 0, -1, ReceptionCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEClass(classifierWithReceptionsShapeEClass, ClassifierWithReceptionsShape.class, "ClassifierWithReceptionsShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierWithReceptionsShape_ReceptionCompartment(), this.getReceptionCompartment(), this.getReceptionCompartment_SignalShape(), "receptionCompartment", null, 0, 1, ClassifierWithReceptionsShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(receptionLabelEClass, ReceptionLabel.class, "ReceptionLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceptionLabel_ReceptionCompartment(), this.getReceptionCompartment(), this.getReceptionCompartment_ReceptionLabel(), "receptionCompartment", null, 0, 1, ReceptionLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(literalCompartmentEClass, LiteralCompartment.class, "LiteralCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralCompartment_EnumerationShape(), this.getEnumerationShape(), this.getEnumerationShape_LiteralCompartment(), "enumerationShape", null, 0, 1, LiteralCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLiteralCompartment_LiteralLabel(), this.getLiteralLabel(), this.getLiteralLabel_LiteralCompartment(), "literalLabel", null, 0, -1, LiteralCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEClass(enumerationShapeEClass, EnumerationShape.class, "EnumerationShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationShape_LiteralCompartment(), this.getLiteralCompartment(), this.getLiteralCompartment_EnumerationShape(), "literalCompartment", null, 0, 1, EnumerationShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(literalLabelEClass, LiteralLabel.class, "LiteralLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralLabel_LiteralCompartment(), this.getLiteralCompartment(), this.getLiteralCompartment_LiteralLabel(), "literalCompartment", null, 0, 1, LiteralLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(roleLabelEClass, RoleLabel.class, "RoleLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleLabel_AssociationEdge(), this.getAssociationEdge(), this.getAssociationEdge_EndRoleLabel(), "associationEdge", null, 0, 1, RoleLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoleLabel_InstanceSpecificationEdge(), this.getInstanceSpecificationEdge(), this.getInstanceSpecificationEdge_EndRoleLabel(), "instanceSpecificationEdge", null, 0, 1, RoleLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(associationEdgeEClass, AssociationEdge.class, "AssociationEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationEdge_EndMultiplicityLabel(), this.getMultiplicityLabel(), this.getMultiplicityLabel_AssociationEdge(), "endMultiplicityLabel", null, 0, 2, AssociationEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociationEdge_EndModifierLabel(), this.getModifierLabel(), this.getModifierLabel_AssociationEdge(), "endModifierLabel", null, 0, 2, AssociationEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociationEdge_EndRoleLabel(), this.getRoleLabel(), this.getRoleLabel_AssociationEdge(), "endRoleLabel", null, 0, 2, AssociationEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(multiplicityLabelEClass, MultiplicityLabel.class, "MultiplicityLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicityLabel_PropertyEdge(), this.getPropertyEdge(), this.getPropertyEdge_MultiplicityLabel(), "propertyEdge", null, 0, 1, MultiplicityLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicityLabel_AssociationEdge(), this.getAssociationEdge(), this.getAssociationEdge_EndMultiplicityLabel(), "associationEdge", null, 0, 1, MultiplicityLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(propertyEdgeEClass, PropertyEdge.class, "PropertyEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyEdge_ModifierLabel(), this.getModifierLabel(), this.getModifierLabel_PropertyEdge(), "modifierLabel", null, 0, 1, PropertyEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyEdge_MultiplicityLabel(), this.getMultiplicityLabel(), this.getMultiplicityLabel_PropertyEdge(), "multiplicityLabel", null, 0, 1, PropertyEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(modifierLabelEClass, ModifierLabel.class, "ModifierLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifierLabel_AssociationEdge(), this.getAssociationEdge(), this.getAssociationEdge_EndModifierLabel(), "associationEdge", null, 0, 1, ModifierLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModifierLabel_GeneralizationSetEdge(), this.getGeneralizationSetEdge(), this.getGeneralizationSetEdge_ModifierLabel(), "generalizationSetEdge", null, 0, 1, ModifierLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModifierLabel_PropertyEdge(), this.getPropertyEdge(), this.getPropertyEdge_ModifierLabel(), "propertyEdge", null, 0, 1, ModifierLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(generalizationSetEdgeEClass, GeneralizationSetEdge.class, "GeneralizationSetEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralizationSetEdge_PowerLabel(), this.getPowerLabel(), this.getPowerLabel_GeneralizationSetEdge(), "powerLabel", null, 0, 1, GeneralizationSetEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralizationSetEdge_ModifierLabel(), this.getModifierLabel(), this.getModifierLabel_GeneralizationSetEdge(), "modifierLabel", null, 0, 1, GeneralizationSetEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(powerLabelEClass, PowerLabel.class, "PowerLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerLabel_GeneralizationSetEdge(), this.getGeneralizationSetEdge(), this.getGeneralizationSetEdge_PowerLabel(), "generalizationSetEdge", null, 0, 1, PowerLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(instanceSpecificationEdgeEClass, InstanceSpecificationEdge.class, "InstanceSpecificationEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceSpecificationEdge_EndRoleLabel(), this.getRoleLabel(), this.getRoleLabel_InstanceSpecificationEdge(), "endRoleLabel", null, 0, 2, InstanceSpecificationEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEClass(instanceSpecificationShapeEClass, InstanceSpecificationShape.class, "InstanceSpecificationShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceSpecificationShape_SlotCompartment(), this.getSlotCompartment(), this.getSlotCompartment_InstanceSpecificationShape(), "slotCompartment", null, 0, 1, InstanceSpecificationShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(slotCompartmentEClass, SlotCompartment.class, "SlotCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlotCompartment_SlotLabel(), this.getSlotLabel(), this.getSlotLabel_SlotCompartment(), "slotLabel", null, 0, -1, SlotCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlotCompartment_InstanceSpecificationShape(), this.getInstanceSpecificationShape(), this.getInstanceSpecificationShape_SlotCompartment(), "instanceSpecificationShape", null, 0, 1, SlotCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(slotLabelEClass, SlotLabel.class, "SlotLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlotLabel_SlotCompartment(), this.getSlotCompartment(), this.getSlotCompartment_SlotLabel(), "slotCompartment", null, 0, 1, SlotLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(classShapeEClass, ClassShape.class, "ClassShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(interfaceShapeEClass, InterfaceShape.class, "InterfaceShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(dataTypeShapeEClass, DataTypeShape.class, "DataTypeShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(primitiveTypeShapeEClass, PrimitiveTypeShape.class, "PrimitiveTypeShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(signalShapeEClass, SignalShape.class, "SignalShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(modelShapeEClass, ModelShape.class, "ModelShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(containmentEdgeEClass, ContainmentEdge.class, "ContainmentEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(generalizationEdgeEClass, GeneralizationEdge.class, "GeneralizationEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(realizationEdgeEClass, RealizationEdge.class, "RealizationEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(abstractionEdgeEClass, AbstractionEdge.class, "AbstractionEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(dependencyEdgeEClass, DependencyEdge.class, "DependencyEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(interfaceRealizationEdgeEClass, InterfaceRealizationEdge.class, "InterfaceRealizationEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(usageEdgeEClass, UsageEdge.class, "UsageEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(elementImportEdgeEClass, ElementImportEdge.class, "ElementImportEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(packageImportEdgeEClass, PackageImportEdge.class, "PackageImportEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(packageMergeEdgeEClass, PackageMergeEdge.class, "PackageMergeEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(substitutionEdgeEClass, SubstitutionEdge.class, "SubstitutionEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(informationFlowEdgeEClass, InformationFlowEdge.class, "InformationFlowEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationFlowEdge_ItemLabel(), this.getItemLabel(), this.getItemLabel_InformationFlowEdge(), "itemLabel", null, 0, 1, InformationFlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(itemLabelEClass, ItemLabel.class, "ItemLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemLabel_InformationFlowEdge(), this.getInformationFlowEdge(), this.getInformationFlowEdge_ItemLabel(), "informationFlowEdge", null, 0, 1, ItemLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(associationClassEdgeEClass, AssociationClassEdge.class, "AssociationClassEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(commentShapeEClass, CommentShape.class, "CommentShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(attachmentEdgeEClass, AttachmentEdge.class, "AttachmentEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(associationClassShapeEClass, AssociationClassShape.class, "AssociationClassShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(componentShapeEClass, ComponentShape.class, "ComponentShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(informationItemShapeEClass, InformationItemShape.class, "InformationItemShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(representationEdgeEClass, RepresentationEdge.class, "RepresentationEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(associationShapeEClass, AssociationShape.class, "AssociationShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(dependencyShapeEClass, DependencyShape.class, "DependencyShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(timeObservationShapeEClass, TimeObservationShape.class, "TimeObservationShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(durationObservationShapeEClass, DurationObservationShape.class, "DurationObservationShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		// Create resource
		createResource(eNS_URI);
		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// subsets
		createSubsetsAnnotations();
		// union
		createUnionAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[]{ "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL" });
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";
		addAnnotation(getUmlDiagram_TopUmlDiagramElement(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getUmlDiagramElement_UmlModelElement(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/modelElement") });
		addAnnotation(getUmlDiagramElement_SharedUmlStyle(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/sharedStyle") });
		addAnnotation(getUmlDiagramElement_LocalUmlStyle(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/localStyle") });
		addAnnotation(getUmlDiagramElement_OwnedUmlDiagramElement(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/ownedDiagramElement") });
		addAnnotation(getUmlDiagramElement_OwningUmlDiagramElement(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/owningDiagramElement") });
		addAnnotation(getUmlDiagramElement_TargetUmlEdge(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/targetEdge") });
		addAnnotation(getUmlDiagramElement_SourceUmlEdge(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/sourceEdge") });
		addAnnotation(getUmlEdge_SourceUmlDiagramElement(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//Edge/sourceDiagramElement") });
		addAnnotation(getUmlEdge_TargetUmlDiagramElement(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//Edge/targetDiagramElement") });
		addAnnotation(getTopUmlDiagramElement_PackageCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getTopUmlDiagramElement_UmlDiagram(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getPackagedElementCompartment_PackageShape(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getPackagedElementCompartment_TopUmlDiagramElement(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getPackageShape_PackagedElementCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getTemplateableElementShape_TemplateParameterCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getNamedShape_NameLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getNameLabel_NamedElementEdge(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getNameLabel_NamedElementShape(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getNamedEdge_NameLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getTemplateParameterCompartment_TemplateParameterLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getTemplateParameterCompartment_TemplateableElementShape(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getTemplateParameterLabel_TemplateParameterCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getBodyShape_BodyLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getBodyLabel_ConstraintShape(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getAttributeCompartment_ClassifierWithAttributesShape(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getAttributeCompartment_AttributeLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getClassifierWithAttributesShape_AttributeCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getPropertyLabel_AttributeCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getOperationCompartment_ClassifierWithOperationsShape(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getOperationCompartment_OperationLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getClassifierWithOperationsShape_OperationCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getOperationLabel_OperationCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getReceptionCompartment_SignalShape(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getReceptionCompartment_ReceptionLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getClassifierWithReceptionsShape_ReceptionCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getReceptionLabel_ReceptionCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getLiteralCompartment_EnumerationShape(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getLiteralCompartment_LiteralLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getEnumerationShape_LiteralCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getLiteralLabel_LiteralCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getRoleLabel_AssociationEdge(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getRoleLabel_InstanceSpecificationEdge(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getAssociationEdge_EndMultiplicityLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getAssociationEdge_EndModifierLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getAssociationEdge_EndRoleLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getMultiplicityLabel_PropertyEdge(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getMultiplicityLabel_AssociationEdge(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getPropertyEdge_ModifierLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getPropertyEdge_MultiplicityLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getModifierLabel_AssociationEdge(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getModifierLabel_GeneralizationSetEdge(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getModifierLabel_PropertyEdge(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getGeneralizationSetEdge_PowerLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getGeneralizationSetEdge_ModifierLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getPowerLabel_GeneralizationSetEdge(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getInstanceSpecificationEdge_EndRoleLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getInstanceSpecificationShape_SlotCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getSlotCompartment_SlotLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getSlotCompartment_InstanceSpecificationShape(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getSlotLabel_SlotCompartment(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
		addAnnotation(getInformationFlowEdge_ItemLabel(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/ownedUmlDiagramElement") });
		addAnnotation(getItemLabel_InformationFlowEdge(), source, new String[]{}, new URI[]{ URI.createURI(eNS_URI).appendFragment("//UmlDiagramElement/owningUmlDiagramElement") });
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union";
		addAnnotation(getUmlDiagramElement_OwnedUmlDiagramElement(), source, new String[]{});
		addAnnotation(getUmlDiagramElement_OwningUmlDiagramElement(), source, new String[]{});
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation(getUmlStyle__FontsizePositive__DiagnosticChain_Map(), source, new String[]{ "body", "fontSize > 0" });
	}
} //UMLDIPackageImpl
