/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.umlnotation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl;
import org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationFactory;
import org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLClassifierShape;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLComponent;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLConnector;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLDiagram;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLFrame;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLShape;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLShapeCompartment;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PapyrusUMLNotationPackageImpl extends EPackageImpl implements PapyrusUMLNotationPackage {

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
	private EClass umlFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass umlShapeCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass umlShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass umlConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass umlViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass umlComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass umlClassifierShapeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PapyrusUMLNotationPackageImpl() {
		super(eNS_URI, PapyrusUMLNotationFactory.eINSTANCE);
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
	 * This method is used to initialize {@link PapyrusUMLNotationPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PapyrusUMLNotationPackage init() {
		if (isInited) {
			return (PapyrusUMLNotationPackage) EPackage.Registry.INSTANCE.getEPackage(PapyrusUMLNotationPackage.eNS_URI);
		}

		// Obtain or create and register package
		PapyrusUMLNotationPackageImpl thePapyrusUMLNotationPackage = (PapyrusUMLNotationPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PapyrusUMLNotationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new PapyrusUMLNotationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		NotationPackageImpl theNotationPackage = (NotationPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(NotationPackage.eNS_URI) instanceof NotationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NotationPackage.eNS_URI)
				: NotationPackage.eINSTANCE);

		// Create package meta-data objects
		thePapyrusUMLNotationPackage.createPackageContents();
		theNotationPackage.createPackageContents();

		// Initialize created meta-data
		thePapyrusUMLNotationPackage.initializePackageContents();
		theNotationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePapyrusUMLNotationPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PapyrusUMLNotationPackage.eNS_URI, thePapyrusUMLNotationPackage);
		return thePapyrusUMLNotationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getUMLDiagram() {
		return umlDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getUMLFrame() {
		return umlFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getUMLShapeCompartment() {
		return umlShapeCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getUMLShapeCompartment_VerticalAlignment() {
		return (EAttribute) umlShapeCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getUMLShape() {
		return umlShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getUMLConnector() {
		return umlConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getUMLView() {
		return umlViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getUMLView_ShowStereotype() {
		return (EAttribute) umlViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getUMLView_ShowListVisibility() {
		return (EAttribute) umlViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getUMLView_ShowListSignature() {
		return (EAttribute) umlViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getUMLView_Alignment() {
		return (EAttribute) umlViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getUMLView_ShowStereotypeAttributeCompartment() {
		return (EAttribute) umlViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getUMLComponent() {
		return umlComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getUMLComponent_ShowWhitebox() {
		return (EAttribute) umlComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getUMLClassifierShape() {
		return umlClassifierShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getUMLClassifierShape_UseClassifierShape() {
		return (EAttribute) umlClassifierShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PapyrusUMLNotationFactory getPapyrusUMLNotationFactory() {
		return (PapyrusUMLNotationFactory) getEFactoryInstance();
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
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		umlDiagramEClass = createEClass(UML_DIAGRAM);

		umlFrameEClass = createEClass(UML_FRAME);

		umlShapeCompartmentEClass = createEClass(UML_SHAPE_COMPARTMENT);
		createEAttribute(umlShapeCompartmentEClass, UML_SHAPE_COMPARTMENT__VERTICAL_ALIGNMENT);

		umlShapeEClass = createEClass(UML_SHAPE);

		umlConnectorEClass = createEClass(UML_CONNECTOR);

		umlViewEClass = createEClass(UML_VIEW);
		createEAttribute(umlViewEClass, UML_VIEW__SHOW_STEREOTYPE);
		createEAttribute(umlViewEClass, UML_VIEW__SHOW_LIST_VISIBILITY);
		createEAttribute(umlViewEClass, UML_VIEW__SHOW_LIST_SIGNATURE);
		createEAttribute(umlViewEClass, UML_VIEW__ALIGNMENT);
		createEAttribute(umlViewEClass, UML_VIEW__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT);

		umlComponentEClass = createEClass(UML_COMPONENT);
		createEAttribute(umlComponentEClass, UML_COMPONENT__SHOW_WHITEBOX);

		umlClassifierShapeEClass = createEClass(UML_CLASSIFIER_SHAPE);
		createEAttribute(umlClassifierShapeEClass, UML_CLASSIFIER_SHAPE__USE_CLASSIFIER_SHAPE);
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
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NotationPackage theNotationPackage = (NotationPackage) EPackage.Registry.INSTANCE.getEPackage(NotationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		umlDiagramEClass.getESuperTypes().add(theNotationPackage.getDiagram());
		umlDiagramEClass.getESuperTypes().add(this.getUMLView());
		umlFrameEClass.getESuperTypes().add(this.getUMLShape());
		umlShapeCompartmentEClass.getESuperTypes().add(theNotationPackage.getCompartment());
		umlShapeCompartmentEClass.getESuperTypes().add(this.getUMLView());
		umlShapeEClass.getESuperTypes().add(theNotationPackage.getShape());
		umlShapeEClass.getESuperTypes().add(this.getUMLView());
		umlConnectorEClass.getESuperTypes().add(theNotationPackage.getConnector());
		umlConnectorEClass.getESuperTypes().add(theNotationPackage.getFontStyle());
		umlConnectorEClass.getESuperTypes().add(this.getUMLView());
		umlViewEClass.getESuperTypes().add(theNotationPackage.getView());
		umlComponentEClass.getESuperTypes().add(this.getUMLShape());
		umlClassifierShapeEClass.getESuperTypes().add(this.getUMLShape());

		// Initialize classes, features, and operations; add parameters
		initEClass(umlDiagramEClass, UMLDiagram.class, "UMLDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlFrameEClass, UMLFrame.class, "UMLFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlShapeCompartmentEClass, UMLShapeCompartment.class, "UMLShapeCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLShapeCompartment_VerticalAlignment(), ecorePackage.getEBoolean(), "verticalAlignment", "true", 0, 1, UMLShapeCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlShapeEClass, UMLShape.class, "UMLShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlConnectorEClass, UMLConnector.class, "UMLConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlViewEClass, UMLView.class, "UMLView", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLView_ShowStereotype(), ecorePackage.getEString(), "showStereotype", null, 0, 1, UMLView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLView_ShowListVisibility(), ecorePackage.getEString(), "showListVisibility", "None", 0, 1, UMLView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLView_ShowListSignature(), ecorePackage.getEBoolean(), "showListSignature", "true", 0, 1, UMLView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLView_Alignment(), ecorePackage.getEString(), "alignment", null, 0, 1, UMLView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLView_ShowStereotypeAttributeCompartment(), ecorePackage.getEString(), "showStereotypeAttributeCompartment", null, 0, 1, UMLView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(umlComponentEClass, UMLComponent.class, "UMLComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLComponent_ShowWhitebox(), ecorePackage.getEBoolean(), "showWhitebox", null, 0, 1, UMLComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlClassifierShapeEClass, UMLClassifierShape.class, "UMLClassifierShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLClassifierShape_UseClassifierShape(), ecorePackage.getEBoolean(), "useClassifierShape", null, 0, 1, UMLClassifierShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // PapyrusUMLNotationPackageImpl
