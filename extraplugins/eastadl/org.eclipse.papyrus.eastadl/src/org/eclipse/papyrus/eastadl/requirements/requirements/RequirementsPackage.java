/**
 */
package org.eclipse.papyrus.eastadl.requirements.requirements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Requirements'"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "requirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Requirements/Requirements/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "Requirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	RequirementsPackage eINSTANCE = org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsRelationshipImpl
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRequirementsRelationship()
	 * @generated
	 */
	int REQUIREMENTS_RELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP__BASE_NAMED_ELEMENT = ElementsPackage.RELATIONSHIP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP__NAME = ElementsPackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP__OWNED_COMMENT = ElementsPackage.RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP__BASE_CLASS = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_OPERATION_COUNT = ElementsPackage.RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementImpl
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TEXT = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED_FROM = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFIED_BY = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFINED_BY = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TRACED_TO = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFIED_BY = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MASTER = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__BASE_CLASS = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__BASE_NAMED_ELEMENT = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNED_COMMENT = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__BASE_PACKAGEABLE_ELEMENT = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NOTE = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Formalism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__FORMALISM = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__URL = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MODE = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	// int REQUIREMENT_OPERATION_COUNT = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	// int REQUIREMENT_OPERATION_COUNT = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	// int REQUIREMENT_OPERATION_COUNT = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	// int REQUIREMENT_OPERATION_COUNT = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	// int REQUIREMENT_OPERATION_COUNT = org.eclipse.papyrus.sysml.requirements.RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.OperationalSituationImpl <em>Operational Situation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.OperationalSituationImpl
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getOperationalSituation()
	 * @generated
	 */
	int OPERATIONAL_SITUATION = 2;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__BASE_NAMED_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__BASE_PACKAGEABLE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__NOTE = ElementsPackage.TRACEABLE_SPECIFICATION__NOTE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__BASE_CLASS = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operational Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operational Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION_OPERATION_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsLinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsLinkImpl
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRequirementsLink()
	 * @generated
	 */
	int REQUIREMENTS_LINK = 3;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__BASE_NAMED_ELEMENT = REQUIREMENTS_RELATIONSHIP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__NAME = REQUIREMENTS_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__OWNED_COMMENT = REQUIREMENTS_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__BASE_CLASS = REQUIREMENTS_RELATIONSHIP__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__IS_BIDIRECTIONAL = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__SOURCE = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__TARGET = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__BASE_DEPENDENCY = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK_FEATURE_COUNT = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK_OPERATION_COUNT = REQUIREMENTS_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsModelImpl
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRequirementsModel()
	 * @generated
	 */
	int REQUIREMENTS_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__BASE_NAMED_ELEMENT = ElementsPackage.CONTEXT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__BASE_PACKAGEABLE_ELEMENT = ElementsPackage.CONTEXT__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__USE_CASE = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements Hierachy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__REQUIREMENTS_HIERACHY = ElementsPackage.CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operational Situation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__OPERATIONAL_SITUATION = ElementsPackage.CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__BASE_PACKAGE = ElementsPackage.CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requirements Relationship Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__REQUIREMENTS_RELATIONSHIP_GROUP = ElementsPackage.CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__REQUIREMENT = ElementsPackage.CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL_OPERATION_COUNT = ElementsPackage.CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsRelationshipGroupImpl <em>Relationship Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsRelationshipGroupImpl
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRequirementsRelationshipGroup()
	 * @generated
	 */
	int REQUIREMENTS_RELATIONSHIP_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_GROUP__BASE_NAMED_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_GROUP__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_GROUP__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_GROUP__BASE_PACKAGEABLE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_GROUP__NOTE = ElementsPackage.TRACEABLE_SPECIFICATION__NOTE;

	/**
	 * The feature id for the '<em><b>Requirements Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_GROUP__REQUIREMENTS_RELATIONSHIP = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_GROUP__BASE_CLASS = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_GROUP__BASE_PACKAGE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_GROUP_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relationship Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_GROUP_OPERATION_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.SatisfyImpl <em>Satisfy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.SatisfyImpl
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getSatisfy()
	 * @generated
	 */
	int SATISFY = 6;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY__BASE_NAMED_ELEMENT = REQUIREMENTS_RELATIONSHIP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY__NAME = REQUIREMENTS_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY__OWNED_COMMENT = REQUIREMENTS_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY__BASE_CLASS = REQUIREMENTS_RELATIONSHIP__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY__BASE_ABSTRACTION = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satisfied Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY__SATISFIED_REQUIREMENT = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Satisfied Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY__SATISFIED_USE_CASE = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY__SATISFIED_BY = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY_FEATURE_COUNT = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SATISFY_OPERATION_COUNT = REQUIREMENTS_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RefineImpl <em>Refine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RefineImpl
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRefine()
	 * @generated
	 */
	int REFINE = 7;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE__BASE_NAMED_ELEMENT = REQUIREMENTS_RELATIONSHIP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE__NAME = REQUIREMENTS_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE__OWNED_COMMENT = REQUIREMENTS_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE__BASE_CLASS = REQUIREMENTS_RELATIONSHIP__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE__BASE_ABSTRACTION = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refined Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE__REFINED_REQUIREMENT = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE__BASE_DEPENDENCY = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE__REFINED_BY = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE_FEATURE_COUNT = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REFINE_OPERATION_COUNT = REQUIREMENTS_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.DeriveRequirementImpl <em>Derive Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.DeriveRequirementImpl
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getDeriveRequirement()
	 * @generated
	 */
	int DERIVE_REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__BASE_NAMED_ELEMENT = REQUIREMENTS_RELATIONSHIP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__NAME = REQUIREMENTS_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__OWNED_COMMENT = REQUIREMENTS_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__BASE_CLASS = REQUIREMENTS_RELATIONSHIP__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__BASE_ABSTRACTION = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__DERIVED = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__DERIVED_FROM = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Derive Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT_FEATURE_COUNT = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Derive Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT_OPERATION_COUNT = REQUIREMENTS_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.QualityRequirementImpl
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getQualityRequirement()
	 * @generated
	 */
	int QUALITY_REQUIREMENT = 9;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__TEXT = REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__DERIVED = REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__DERIVED_FROM = REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__SATISFIED_BY = REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__REFINED_BY = REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__TRACED_TO = REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__VERIFIED_BY = REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__MASTER = REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__BASE_CLASS = REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__BASE_NAMED_ELEMENT = REQUIREMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__OWNED_COMMENT = REQUIREMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__BASE_PACKAGEABLE_ELEMENT = REQUIREMENT__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__NOTE = REQUIREMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Formalism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__FORMALISM = REQUIREMENT__FORMALISM;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__URL = REQUIREMENT__URL;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__MODE = REQUIREMENT__MODE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__KIND = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;



	/**
	 * The number of operations of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	// int QUALITY_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	// int QUALITY_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	// int QUALITY_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	// int QUALITY_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	// int QUALITY_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsHierarchyImpl <em>Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsHierarchyImpl
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRequirementsHierarchy()
	 * @generated
	 */
	int REQUIREMENTS_HIERARCHY = 10;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_HIERARCHY__BASE_NAMED_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_HIERARCHY__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_HIERARCHY__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_HIERARCHY__BASE_PACKAGEABLE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__BASE_PACKAGEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_HIERARCHY__NOTE = ElementsPackage.TRACEABLE_SPECIFICATION__NOTE;

	/**
	 * The feature id for the '<em><b>Child Hierarchy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_HIERARCHY__CHILD_HIERARCHY = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_HIERARCHY__BASE_CLASS = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_HIERARCHY__BASE_PACKAGE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contained Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_HIERARCHY__CONTAINED_REQUIREMENT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_HIERARCHY_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_HIERARCHY_OPERATION_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirementKind <em>Quality Requirement Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirementKind
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getQualityRequirementKind()
	 * @generated
	 */
	int QUALITY_REQUIREMENT_KIND = 11;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationship
	 * @generated
	 */
	EClass getRequirementsRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationship#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationship#getBase_Class()
	 * @see #getRequirementsRelationship()
	 * @generated
	 */
	EReference getRequirementsRelationship_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Requirement#getFormalism <em>Formalism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Formalism</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.Requirement#getFormalism()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Formalism();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Requirement#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.Requirement#getUrl()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Url();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Requirement#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Mode</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.Requirement#getMode()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Mode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.requirements.requirements.OperationalSituation <em>Operational Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Operational Situation</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.OperationalSituation
	 * @generated
	 */
	EClass getOperationalSituation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.requirements.requirements.OperationalSituation#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.OperationalSituation#getBase_Class()
	 * @see #getOperationalSituation()
	 * @generated
	 */
	EReference getOperationalSituation_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsLink
	 * @generated
	 */
	EClass getRequirementsLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsLink#isIsBidirectional <em>Is Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Is Bidirectional</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsLink#isIsBidirectional()
	 * @see #getRequirementsLink()
	 * @generated
	 */
	EAttribute getRequirementsLink_IsBidirectional();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsLink#getSource()
	 * @see #getRequirementsLink()
	 * @generated
	 */
	EReference getRequirementsLink_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsLink#getTarget()
	 * @see #getRequirementsLink()
	 * @generated
	 */
	EReference getRequirementsLink_Target();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsLink#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsLink#getBase_Dependency()
	 * @see #getRequirementsLink()
	 * @generated
	 */
	EReference getRequirementsLink_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel
	 * @generated
	 */
	EClass getRequirementsModel();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Use Case</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getUseCase()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_UseCase();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getRequirementsHierachy <em>Requirements Hierachy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Requirements Hierachy</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getRequirementsHierachy()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_RequirementsHierachy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getOperationalSituation <em>Operational Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Operational Situation</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getOperationalSituation()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_OperationalSituation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getBase_Package()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_Base_Package();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getRequirementsRelationshipGroup <em>Requirements Relationship Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Requirements Relationship Group</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getRequirementsRelationshipGroup()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_RequirementsRelationshipGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Requirement</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel#getRequirement()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_Requirement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup <em>Relationship Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Relationship Group</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup
	 * @generated
	 */
	EClass getRequirementsRelationshipGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup#getRequirementsRelationship <em>Requirements Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Requirements Relationship</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup#getRequirementsRelationship()
	 * @see #getRequirementsRelationshipGroup()
	 * @generated
	 */
	EReference getRequirementsRelationshipGroup_RequirementsRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup#getBase_Class()
	 * @see #getRequirementsRelationshipGroup()
	 * @generated
	 */
	EReference getRequirementsRelationshipGroup_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup#getBase_Package()
	 * @see #getRequirementsRelationshipGroup()
	 * @generated
	 */
	EReference getRequirementsRelationshipGroup_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Satisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Satisfy</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.Satisfy
	 * @generated
	 */
	EClass getSatisfy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Satisfy#getSatisfiedRequirement <em>Satisfied Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Satisfied Requirement</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.Satisfy#getSatisfiedRequirement()
	 * @see #getSatisfy()
	 * @generated
	 */
	EReference getSatisfy_SatisfiedRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Satisfy#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Satisfied By</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.Satisfy#getSatisfiedBy()
	 * @see #getSatisfy()
	 * @generated
	 */
	EReference getSatisfy_SatisfiedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Satisfy#getSatisfiedUseCase <em>Satisfied Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Satisfied Use Case</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.Satisfy#getSatisfiedUseCase()
	 * @see #getSatisfy()
	 * @generated
	 */
	EReference getSatisfy_SatisfiedUseCase();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Refine <em>Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Refine</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.Refine
	 * @generated
	 */
	EClass getRefine();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Refine#getRefinedRequirement <em>Refined Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Refined Requirement</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.Refine#getRefinedRequirement()
	 * @see #getRefine()
	 * @generated
	 */
	EReference getRefine_RefinedRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Refine#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Refined By</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.Refine#getRefinedBy()
	 * @see #getRefine()
	 * @generated
	 */
	EReference getRefine_RefinedBy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.requirements.requirements.Refine#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.Refine#getBase_Dependency()
	 * @see #getRefine()
	 * @generated
	 */
	EReference getRefine_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.requirements.requirements.DeriveRequirement <em>Derive Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Derive Requirement</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.DeriveRequirement
	 * @generated
	 */
	EClass getDeriveRequirement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.DeriveRequirement#getDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Derived</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.DeriveRequirement#getDerived()
	 * @see #getDeriveRequirement()
	 * @generated
	 */
	EReference getDeriveRequirement_Derived();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.DeriveRequirement#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Derived From</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.DeriveRequirement#getDerivedFrom()
	 * @see #getDeriveRequirement()
	 * @generated
	 */
	EReference getDeriveRequirement_DerivedFrom();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirement <em>Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Quality Requirement</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirement
	 * @generated
	 */
	EClass getQualityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirement#getKind()
	 * @see #getQualityRequirement()
	 * @generated
	 */
	EAttribute getQualityRequirement_Kind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Hierarchy</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy
	 * @generated
	 */
	EClass getRequirementsHierarchy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getChildHierarchy <em>Child Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Child Hierarchy</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getChildHierarchy()
	 * @see #getRequirementsHierarchy()
	 * @generated
	 */
	EReference getRequirementsHierarchy_ChildHierarchy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getBase_Class()
	 * @see #getRequirementsHierarchy()
	 * @generated
	 */
	EReference getRequirementsHierarchy_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getBase_Package()
	 * @see #getRequirementsHierarchy()
	 * @generated
	 */
	EReference getRequirementsHierarchy_Base_Package();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getContainedRequirement <em>Contained Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Contained Requirement</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy#getContainedRequirement()
	 * @see #getRequirementsHierarchy()
	 * @generated
	 */
	EReference getRequirementsHierarchy_ContainedRequirement();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirementKind <em>Quality Requirement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Quality Requirement Kind</em>'.
	 * @see org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirementKind
	 * @generated
	 */
	EEnum getQualityRequirementKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsRelationshipImpl
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRequirementsRelationship()
		 * @generated
		 */
		EClass REQUIREMENTS_RELATIONSHIP = eINSTANCE.getRequirementsRelationship();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_RELATIONSHIP__BASE_CLASS = eINSTANCE.getRequirementsRelationship_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementImpl
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Formalism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute REQUIREMENT__FORMALISM = eINSTANCE.getRequirement_Formalism();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute REQUIREMENT__URL = eINSTANCE.getRequirement_Url();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENT__MODE = eINSTANCE.getRequirement_Mode();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.OperationalSituationImpl <em>Operational Situation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.OperationalSituationImpl
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getOperationalSituation()
		 * @generated
		 */
		EClass OPERATIONAL_SITUATION = eINSTANCE.getOperationalSituation();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference OPERATIONAL_SITUATION__BASE_CLASS = eINSTANCE.getOperationalSituation_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsLinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsLinkImpl
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRequirementsLink()
		 * @generated
		 */
		EClass REQUIREMENTS_LINK = eINSTANCE.getRequirementsLink();

		/**
		 * The meta object literal for the '<em><b>Is Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute REQUIREMENTS_LINK__IS_BIDIRECTIONAL = eINSTANCE.getRequirementsLink_IsBidirectional();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_LINK__SOURCE = eINSTANCE.getRequirementsLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_LINK__TARGET = eINSTANCE.getRequirementsLink_Target();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_LINK__BASE_DEPENDENCY = eINSTANCE.getRequirementsLink_Base_Dependency();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsModelImpl
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRequirementsModel()
		 * @generated
		 */
		EClass REQUIREMENTS_MODEL = eINSTANCE.getRequirementsModel();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__USE_CASE = eINSTANCE.getRequirementsModel_UseCase();

		/**
		 * The meta object literal for the '<em><b>Requirements Hierachy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__REQUIREMENTS_HIERACHY = eINSTANCE.getRequirementsModel_RequirementsHierachy();

		/**
		 * The meta object literal for the '<em><b>Operational Situation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__OPERATIONAL_SITUATION = eINSTANCE.getRequirementsModel_OperationalSituation();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__BASE_PACKAGE = eINSTANCE.getRequirementsModel_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Requirements Relationship Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__REQUIREMENTS_RELATIONSHIP_GROUP = eINSTANCE.getRequirementsModel_RequirementsRelationshipGroup();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__REQUIREMENT = eINSTANCE.getRequirementsModel_Requirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsRelationshipGroupImpl <em>Relationship Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsRelationshipGroupImpl
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRequirementsRelationshipGroup()
		 * @generated
		 */
		EClass REQUIREMENTS_RELATIONSHIP_GROUP = eINSTANCE.getRequirementsRelationshipGroup();

		/**
		 * The meta object literal for the '<em><b>Requirements Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_RELATIONSHIP_GROUP__REQUIREMENTS_RELATIONSHIP = eINSTANCE.getRequirementsRelationshipGroup_RequirementsRelationship();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_RELATIONSHIP_GROUP__BASE_CLASS = eINSTANCE.getRequirementsRelationshipGroup_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_RELATIONSHIP_GROUP__BASE_PACKAGE = eINSTANCE.getRequirementsRelationshipGroup_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.SatisfyImpl <em>Satisfy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.SatisfyImpl
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getSatisfy()
		 * @generated
		 */
		EClass SATISFY = eINSTANCE.getSatisfy();

		/**
		 * The meta object literal for the '<em><b>Satisfied Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SATISFY__SATISFIED_REQUIREMENT = eINSTANCE.getSatisfy_SatisfiedRequirement();

		/**
		 * The meta object literal for the '<em><b>Satisfied By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SATISFY__SATISFIED_BY = eINSTANCE.getSatisfy_SatisfiedBy();

		/**
		 * The meta object literal for the '<em><b>Satisfied Use Case</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SATISFY__SATISFIED_USE_CASE = eINSTANCE.getSatisfy_SatisfiedUseCase();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RefineImpl <em>Refine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RefineImpl
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRefine()
		 * @generated
		 */
		EClass REFINE = eINSTANCE.getRefine();

		/**
		 * The meta object literal for the '<em><b>Refined Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REFINE__REFINED_REQUIREMENT = eINSTANCE.getRefine_RefinedRequirement();

		/**
		 * The meta object literal for the '<em><b>Refined By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REFINE__REFINED_BY = eINSTANCE.getRefine_RefinedBy();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REFINE__BASE_DEPENDENCY = eINSTANCE.getRefine_Base_Dependency();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.DeriveRequirementImpl <em>Derive Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.DeriveRequirementImpl
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getDeriveRequirement()
		 * @generated
		 */
		EClass DERIVE_REQUIREMENT = eINSTANCE.getDeriveRequirement();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DERIVE_REQUIREMENT__DERIVED = eINSTANCE.getDeriveRequirement_Derived();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DERIVE_REQUIREMENT__DERIVED_FROM = eINSTANCE.getDeriveRequirement_DerivedFrom();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.QualityRequirementImpl
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getQualityRequirement()
		 * @generated
		 */
		EClass QUALITY_REQUIREMENT = eINSTANCE.getQualityRequirement();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute QUALITY_REQUIREMENT__KIND = eINSTANCE.getQualityRequirement_Kind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsHierarchyImpl <em>Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsHierarchyImpl
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getRequirementsHierarchy()
		 * @generated
		 */
		EClass REQUIREMENTS_HIERARCHY = eINSTANCE.getRequirementsHierarchy();

		/**
		 * The meta object literal for the '<em><b>Child Hierarchy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_HIERARCHY__CHILD_HIERARCHY = eINSTANCE.getRequirementsHierarchy_ChildHierarchy();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_HIERARCHY__BASE_CLASS = eINSTANCE.getRequirementsHierarchy_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_HIERARCHY__BASE_PACKAGE = eINSTANCE.getRequirementsHierarchy_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Contained Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference REQUIREMENTS_HIERARCHY__CONTAINED_REQUIREMENT = eINSTANCE.getRequirementsHierarchy_ContainedRequirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirementKind <em>Quality Requirement Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.QualityRequirementKind
		 * @see org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl#getQualityRequirementKind()
		 * @generated
		 */
		EEnum QUALITY_REQUIREMENT_KIND = eINSTANCE.getQualityRequirementKind();

	}

} // RequirementsPackage
