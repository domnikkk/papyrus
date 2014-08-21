/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.infrastructure.elements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This section contains the UML-profile specification, specifying stereotypes in the UML-profile, defined from the metaclasses in the Infrastructure::Elements subprofile. It includes specification details for each stereotype. If the stereotype has properties,
 * which may be referred to as tag definitions, or if the stereotype has constraints, this section also includes specification details for these properties and constraints.
 *
 * Overview:
 * The Infrastructure::Elements subprofile of EAST-ADL2 defines general-purpose relationship constructs that may be used to model dependencies between structural constructs.
 * The purpose of the stereotypes in this subprofile is to specify rigorously ("formally") the various relationships that may exist between basic constructs.
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsFactory
 * @model kind="package"
 * @generated
 */
public interface ElementsPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RelationshipImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EATypeImpl <em>EA Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EATypeImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAType()
		 * @generated
		 */
		EClass EA_TYPE = eINSTANCE.getEAType();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_TYPE__BASE_CLASS = eINSTANCE.getEAType_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPortImpl <em>EA Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPortImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAPort()
		 * @generated
		 */
		EClass EA_PORT = eINSTANCE.getEAPort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_PORT__BASE_PORT = eINSTANCE.getEAPort_Base_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAConnectorImpl <em>EA Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAConnectorImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAConnector()
		 * @generated
		 */
		EClass EA_CONNECTOR = eINSTANCE.getEAConnector();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_CONNECTOR__BASE_CONNECTOR = eINSTANCE.getEAConnector_Base_Connector();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPrototypeImpl <em>EA Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPrototypeImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAPrototype()
		 * @generated
		 */
		EClass EA_PROTOTYPE = eINSTANCE.getEAPrototype();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_PROTOTYPE__BASE_PROPERTY = eINSTANCE.getEAPrototype_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl <em>Traceable Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getTraceableSpecification()
		 * @generated
		 */
		EClass TRACEABLE_SPECIFICATION = eINSTANCE.getTraceableSpecification();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TRACEABLE_SPECIFICATION__NOTE = eINSTANCE.getTraceableSpecification_Note();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPackageableElementImpl <em>EA Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPackageableElementImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAPackageableElement()
		 * @generated
		 */
		EClass EA_PACKAGEABLE_ELEMENT = eINSTANCE.getEAPackageableElement();

		/**
		 * The meta object literal for the '<em><b>Base Packageable Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_PACKAGEABLE_ELEMENT__BASE_PACKAGEABLE_ELEMENT = eINSTANCE.getEAPackageableElement_Base_PackageableElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ContextImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Traceable Specification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONTEXT__TRACEABLE_SPECIFICATION = eINSTANCE.getContext_TraceableSpecification();

		/**
		 * The meta object literal for the '<em><b>Owned Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONTEXT__OWNED_RELATIONSHIP = eINSTANCE.getContext_OwnedRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RealizationImpl <em>Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RealizationImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getRealization()
		 * @generated
		 */
		EClass REALIZATION = eINSTANCE.getRealization();

		/**
		 * The meta object literal for the '<em><b>Realized</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REALIZATION__REALIZED = eINSTANCE.getRealization_Realized();

		/**
		 * The meta object literal for the '<em><b>Realized By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REALIZATION__REALIZED_BY = eINSTANCE.getRealization_RealizedBy();

		/**
		 * The meta object literal for the '<em><b>Base Realization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REALIZATION__BASE_REALIZATION = eINSTANCE.getRealization_Base_Realization();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RationaleImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getRationale()
		 * @generated
		 */
		EClass RATIONALE = eINSTANCE.getRationale();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RATIONALE__BASE_COMMENT = eINSTANCE.getRationale_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPackageImpl <em>EA Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPackageImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAPackage()
		 * @generated
		 */
		EClass EA_PACKAGE = eINSTANCE.getEAPackage();

		/**
		 * The meta object literal for the '<em><b>Sub Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_PACKAGE__SUB_PACKAGE = eINSTANCE.getEAPackage_SubPackage();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_PACKAGE__ELEMENT = eINSTANCE.getEAPackage_Element();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_PACKAGE__BASE_PACKAGE = eINSTANCE.getEAPackage_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAXMLImpl <em>EAXML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAXMLImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAXML()
		 * @generated
		 */
		EClass EAXML = eINSTANCE.getEAXML();

		/**
		 * The meta object literal for the '<em><b>Admindocument Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EAXML__ADMINDOCUMENT_VERSION = eINSTANCE.getEAXML_AdmindocumentVersion();

		/**
		 * The meta object literal for the '<em><b>Autosardocument Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EAXML__AUTOSARDOCUMENT_VERSION = eINSTANCE.getEAXML_AutosardocumentVersion();

		/**
		 * The meta object literal for the '<em><b>Xmlglobalelement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EAXML__XMLGLOBALELEMENT = eINSTANCE.getEAXML_Xmlglobalelement();

		/**
		 * The meta object literal for the '<em><b>Top Level Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EAXML__TOP_LEVEL_PACKAGE = eINSTANCE.getEAXML_TopLevelPackage();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl <em>EA Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl
		 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAElement()
		 * @generated
		 */
		EClass EA_ELEMENT = eINSTANCE.getEAElement();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_ELEMENT__BASE_NAMED_ELEMENT = eINSTANCE.getEAElement_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EA_ELEMENT__NAME = eINSTANCE.getEAElement_Name();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EA_ELEMENT__OWNED_COMMENT = eINSTANCE.getEAElement_OwnedComment();

	}

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "elements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Infrastructure/Elements/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "Elements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ElementsPackage eINSTANCE = org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl <em>EA Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAElement()
	 * @generated
	 */
	int EA_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__OWNED_COMMENT = 2;

	/**
	 * The number of structural features of the '<em>EA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPackageableElementImpl <em>EA Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPackageableElementImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAPackageableElement()
	 * @generated
	 */
	int EA_PACKAGEABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__BASE_NAMED_ELEMENT = EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__BASE_PACKAGEABLE_ELEMENT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EA Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT_OPERATION_COUNT = EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RelationshipImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl <em>Traceable Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getTraceableSpecification()
	 * @generated
	 */
	int TRACEABLE_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__BASE_NAMED_ELEMENT = EA_PACKAGEABLE_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__NAME = EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__OWNED_COMMENT = EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__BASE_PACKAGEABLE_ELEMENT = EA_PACKAGEABLE_ELEMENT__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__NOTE = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traceable Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION_FEATURE_COUNT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traceable Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION_OPERATION_COUNT = EA_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EATypeImpl <em>EA Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EATypeImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAType()
	 * @generated
	 */
	int EA_TYPE = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPortImpl <em>EA Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPortImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAPort()
	 * @generated
	 */
	int EA_PORT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAConnectorImpl <em>EA Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAConnectorImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAConnector()
	 * @generated
	 */
	int EA_CONNECTOR = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPrototypeImpl <em>EA Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPrototypeImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAPrototype()
	 * @generated
	 */
	int EA_PROTOTYPE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ContextImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RealizationImpl <em>Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RealizationImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getRealization()
	 * @generated
	 */
	int REALIZATION = 8;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT__BASE_NAMED_ELEMENT = EA_PACKAGEABLE_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT__OWNED_COMMENT = EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT__BASE_PACKAGEABLE_ELEMENT = EA_PACKAGEABLE_ELEMENT__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TRACEABLE_SPECIFICATION = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT__OWNED_RELATIONSHIP = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = EA_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__BASE_NAMED_ELEMENT = EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_TYPE__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>EA Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EA Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PORT__BASE_PORT = 0;

	/**
	 * The number of structural features of the '<em>EA Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EA Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PORT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__BASE_CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>EA Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EA Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PROTOTYPE__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>EA Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PROTOTYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EA Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PROTOTYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION__BASE_NAMED_ELEMENT = RELATIONSHIP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION__OWNED_COMMENT = RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Realization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION__BASE_REALIZATION = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION__REALIZED = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION__REALIZED_BY = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.RationaleImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getRationale()
	 * @generated
	 */
	int RATIONALE = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPackageImpl <em>EA Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAPackageImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAPackage()
	 * @generated
	 */
	int EA_PACKAGE = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAXMLImpl <em>EAXML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAXMLImpl
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl#getEAXML()
	 * @generated
	 */
	int EAXML = 11;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RATIONALE__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RATIONALE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RATIONALE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__BASE_NAMED_ELEMENT = EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Sub Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__SUB_PACKAGE = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__ELEMENT = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__BASE_PACKAGE = EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>EA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE_OPERATION_COUNT = EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Admindocument Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EAXML__ADMINDOCUMENT_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Autosardocument Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EAXML__AUTOSARDOCUMENT_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Xmlglobalelement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EAXML__XMLGLOBALELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Top Level Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EAXML__TOP_LEVEL_PACKAGE = 3;

	/**
	 * The number of structural features of the '<em>EAXML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EAXML_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>EAXML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EAXML_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.Context#getOwnedRelationship <em>Owned Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Relationship</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.Context#getOwnedRelationship()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_OwnedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.Context#getTraceableSpecification <em>Traceable Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Traceable Specification</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.Context#getTraceableSpecification()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_TraceableSpecification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ElementsFactory getElementsFactory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.Rationale#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.Rationale#getBase_Comment()
	 * @see #getRationale()
	 * @generated
	 */
	EReference getRationale_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackage <em>EA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Package</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackage
	 * @generated
	 */
	EClass getEAPackage();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackage#getSubPackage <em>Sub Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Sub Package</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackage#getSubPackage()
	 * @see #getEAPackage()
	 * @generated
	 */
	EReference getEAPackage_SubPackage();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackage#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Element</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackage#getElement()
	 * @see #getEAPackage()
	 * @generated
	 */
	EReference getEAPackage_Element();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackage#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackage#getBase_Package()
	 * @see #getEAPackage()
	 * @generated
	 */
	EReference getEAPackage_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML <em>EAXML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EAXML</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML
	 * @generated
	 */
	EClass getEAXML();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#getAdmindocumentVersion <em>Admindocument Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Admindocument Version</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#getAdmindocumentVersion()
	 * @see #getEAXML()
	 * @generated
	 */
	EAttribute getEAXML_AdmindocumentVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#getAutosardocumentVersion <em>Autosardocument Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Autosardocument Version</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#getAutosardocumentVersion()
	 * @see #getEAXML()
	 * @generated
	 */
	EAttribute getEAXML_AutosardocumentVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#isXmlglobalelement <em>Xmlglobalelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Xmlglobalelement</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#isXmlglobalelement()
	 * @see #getEAXML()
	 * @generated
	 */
	EAttribute getEAXML_Xmlglobalelement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#getTopLevelPackage <em>Top Level Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Top Level Package</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#getTopLevelPackage()
	 * @see #getEAXML()
	 * @generated
	 */
	EReference getEAXML_TopLevelPackage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement <em>EA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Element</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement
	 * @generated
	 */
	EClass getEAElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement#getBase_NamedElement()
	 * @see #getEAElement()
	 * @generated
	 */
	EReference getEAElement_Base_NamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement#getName()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Comment</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement#getOwnedComment()
	 * @see #getEAElement()
	 * @generated
	 */
	EReference getEAElement_OwnedComment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Realization</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.Realization
	 * @generated
	 */
	EClass getRealization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.Realization#getRealized <em>Realized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Realized</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.Realization#getRealized()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_Realized();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.Realization#getRealizedBy <em>Realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Realized By</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.Realization#getRealizedBy()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_RealizedBy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.Realization#getBase_Realization <em>Base Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Realization</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.Realization#getBase_Realization()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_Base_Realization();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAType <em>EA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAType
	 * @generated
	 */
	EClass getEAType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAType#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAType#getBase_Class()
	 * @see #getEAType()
	 * @generated
	 */
	EReference getEAType_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAPort <em>EA Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAPort
	 * @generated
	 */
	EClass getEAPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAPort#getBase_Port()
	 * @see #getEAPort()
	 * @generated
	 */
	EReference getEAPort_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAConnector <em>EA Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Connector</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAConnector
	 * @generated
	 */
	EClass getEAConnector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAConnector#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAConnector#getBase_Connector()
	 * @see #getEAConnector()
	 * @generated
	 */
	EReference getEAConnector_Base_Connector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAPrototype <em>EA Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Prototype</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAPrototype
	 * @generated
	 */
	EClass getEAPrototype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAPrototype#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAPrototype#getBase_Property()
	 * @see #getEAPrototype()
	 * @generated
	 */
	EReference getEAPrototype_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.TraceableSpecification <em>Traceable Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Traceable Specification</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.TraceableSpecification
	 * @generated
	 */
	EClass getTraceableSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.TraceableSpecification#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.TraceableSpecification#getNote()
	 * @see #getTraceableSpecification()
	 * @generated
	 */
	EAttribute getTraceableSpecification_Note();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackageableElement <em>EA Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EA Packageable Element</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackageableElement
	 * @generated
	 */
	EClass getEAPackageableElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackageableElement#getBase_PackageableElement <em>Base Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Packageable Element</em>'.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackageableElement#getBase_PackageableElement()
	 * @see #getEAPackageableElement()
	 * @generated
	 */
	EReference getEAPackageableElement_Base_PackageableElement();

} // ElementsPackage
