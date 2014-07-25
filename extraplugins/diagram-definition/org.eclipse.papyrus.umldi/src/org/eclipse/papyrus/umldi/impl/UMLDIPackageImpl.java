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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.dd.dc.DCPackage;

import org.eclipse.papyrus.dd.di.DIPackage;

import org.eclipse.papyrus.umldi.UMLDIFactory;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlCompartment;
import org.eclipse.papyrus.umldi.UmlCompartmentKind;
import org.eclipse.papyrus.umldi.UmlDiagram;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.papyrus.umldi.UmlEdge;
import org.eclipse.papyrus.umldi.UmlLabel;
import org.eclipse.papyrus.umldi.UmlLabelKind;
import org.eclipse.papyrus.umldi.UmlShape;
import org.eclipse.papyrus.umldi.UmlStyle;

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
	private EEnum umlCompartmentKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum umlLabelKindEEnum = null;

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
		return (EReference)umlDiagramElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUmlDiagramElement_OwnedUmlDiagramElement() {
		return (EReference)umlDiagramElementEClass.getEStructuralFeatures().get(4);
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
	public EClass getUmlCompartment() {
		return umlCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUmlCompartment_Kind() {
		return (EAttribute)umlCompartmentEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getUmlLabel_Kind() {
		return (EAttribute)umlLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getUmlCompartmentKind() {
		return umlCompartmentKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getUmlLabelKind() {
		return umlLabelKindEEnum;
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
		umlShapeEClass = createEClass(UML_SHAPE);
		umlDiagramElementEClass = createEClass(UML_DIAGRAM_ELEMENT);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE);
		createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE);
		umlStyleEClass = createEClass(UML_STYLE);
		createEAttribute(umlStyleEClass, UML_STYLE__FONT_NAME);
		createEAttribute(umlStyleEClass, UML_STYLE__FONT_SIZE);
		createEOperation(umlStyleEClass, UML_STYLE___FONTSIZE_POSITIVE__DIAGNOSTICCHAIN_MAP);
		umlEdgeEClass = createEClass(UML_EDGE);
		createEReference(umlEdgeEClass, UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT);
		createEReference(umlEdgeEClass, UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT);
		umlCompartmentEClass = createEClass(UML_COMPARTMENT);
		createEAttribute(umlCompartmentEClass, UML_COMPARTMENT__KIND);
		umlLabelEClass = createEClass(UML_LABEL);
		createEAttribute(umlLabelEClass, UML_LABEL__KIND);
		// Create enums
		umlCompartmentKindEEnum = createEEnum(UML_COMPARTMENT_KIND);
		umlLabelKindEEnum = createEEnum(UML_LABEL_KIND);
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
		umlDiagramEClass.getESuperTypes().add(this.getUmlShape());
		umlDiagramEClass.getESuperTypes().add(theDIPackage.getDiagram());
		umlShapeEClass.getESuperTypes().add(this.getUmlDiagramElement());
		umlShapeEClass.getESuperTypes().add(theDIPackage.getShape());
		umlDiagramElementEClass.getESuperTypes().add(theDIPackage.getDiagramElement());
		umlStyleEClass.getESuperTypes().add(theDIPackage.getStyle());
		umlEdgeEClass.getESuperTypes().add(this.getUmlDiagramElement());
		umlEdgeEClass.getESuperTypes().add(theDIPackage.getEdge());
		umlCompartmentEClass.getESuperTypes().add(this.getUmlShape());
		umlLabelEClass.getESuperTypes().add(this.getUmlShape());
		// Initialize classes, features, and operations; add parameters
		initEClass(umlDiagramEClass, UmlDiagram.class, "UmlDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(umlShapeEClass, UmlShape.class, "UmlShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(umlDiagramElementEClass, UmlDiagramElement.class, "UmlDiagramElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlDiagramElement_UmlModelElement(), theUMLPackage.getElement(), null, "umlModelElement", null, 0, -1, UmlDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlDiagramElement_SharedUmlStyle(), this.getUmlStyle(), null, "sharedUmlStyle", null, 0, 1, UmlDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlDiagramElement_LocalUmlStyle(), this.getUmlStyle(), null, "localUmlStyle", null, 0, 1, UmlDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlDiagramElement_OwningUmlDiagramElement(), this.getUmlDiagramElement(), this.getUmlDiagramElement_OwnedUmlDiagramElement(), "owningUmlDiagramElement", null, 0, 1, UmlDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlDiagramElement_OwnedUmlDiagramElement(), this.getUmlDiagramElement(), this.getUmlDiagramElement_OwningUmlDiagramElement(), "ownedUmlDiagramElement", null, 0, -1, UmlDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEClass(umlEdgeEClass, UmlEdge.class, "UmlEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlEdge_SourceUmlDiagramElement(), this.getUmlDiagramElement(), this.getUmlDiagramElement_SourceUmlEdge(), "sourceUmlDiagramElement", null, 1, 1, UmlEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlEdge_TargetUmlDiagramElement(), this.getUmlDiagramElement(), this.getUmlDiagramElement_TargetUmlEdge(), "targetUmlDiagramElement", null, 1, 1, UmlEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(umlCompartmentEClass, UmlCompartment.class, "UmlCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUmlCompartment_Kind(), this.getUmlCompartmentKind(), "kind", null, 1, 1, UmlCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEClass(umlLabelEClass, UmlLabel.class, "UmlLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUmlLabel_Kind(), this.getUmlLabelKind(), "kind", null, 1, 1, UmlLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		// Initialize enums and add enum literals
		initEEnum(umlCompartmentKindEEnum, UmlCompartmentKind.class, "UmlCompartmentKind");
		addEEnumLiteral(umlCompartmentKindEEnum, UmlCompartmentKind.ATTRIBUTES);
		addEEnumLiteral(umlCompartmentKindEEnum, UmlCompartmentKind.OPERATIONS);
		initEEnum(umlLabelKindEEnum, UmlLabelKind.class, "UmlLabelKind");
		addEEnumLiteral(umlLabelKindEEnum, UmlLabelKind.NAME);
		// Create resource
		createResource(eNS_URI);
		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// subsets
		createSubsetsAnnotations();
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
		addAnnotation(getUmlDiagramElement_UmlModelElement(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/modelElement") });
		addAnnotation(getUmlDiagramElement_SharedUmlStyle(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/sharedStyle") });
		addAnnotation(getUmlDiagramElement_LocalUmlStyle(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/localStyle") });
		addAnnotation(getUmlDiagramElement_OwningUmlDiagramElement(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/owningDiagramElement") });
		addAnnotation(getUmlDiagramElement_OwnedUmlDiagramElement(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/ownedDiagramElement") });
		addAnnotation(getUmlDiagramElement_TargetUmlEdge(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/targetEdge") });
		addAnnotation(getUmlDiagramElement_SourceUmlEdge(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//DiagramElement/sourceEdge") });
		addAnnotation(getUmlEdge_SourceUmlDiagramElement(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//Edge/sourceDiagramElement") });
		addAnnotation(getUmlEdge_TargetUmlDiagramElement(), source, new String[]{}, new URI[]{ URI.createURI(DIPackage.eNS_URI).appendFragment("//Edge/targetDiagramElement") });
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
