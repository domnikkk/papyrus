/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.requirements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.sysml14.requirements.RequirementsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Requirements'"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirements"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/1.4/SysML/Requirements"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Requirements"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsPackage eINSTANCE = org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.TraceImpl
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 1;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__BASE_DIRECTED_RELATIONSHIP = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCE_PROPERTY_PATH = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGET_PROPERTY_PATH = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCE_CONTEXT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGET_CONTEXT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__BASE_ABSTRACTION = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Traced From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE___GET_TRACED_FROM__NAMEDELEMENT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.DeriveReqtImpl <em>Derive Reqt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.DeriveReqtImpl
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getDeriveReqt()
	 * @generated
	 */
	int DERIVE_REQT = 0;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT__BASE_DIRECTED_RELATIONSHIP = TRACE__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT__SOURCE_PROPERTY_PATH = TRACE__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT__TARGET_PROPERTY_PATH = TRACE__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT__SOURCE_CONTEXT = TRACE__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT__TARGET_CONTEXT = TRACE__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT__BASE_ABSTRACTION = TRACE__BASE_ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Derive Reqt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT_FEATURE_COUNT = TRACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Traced From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT___GET_TRACED_FROM__NAMEDELEMENT = TRACE___GET_TRACED_FROM__NAMEDELEMENT;

	/**
	 * The number of operations of the '<em>Derive Reqt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQT_OPERATION_COUNT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED = 3;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED_FROM = 4;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFIED_BY = 5;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFINED_BY = 6;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TRACED_TO = 7;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFIED_BY = 8;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MASTER = 9;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.CopyImpl <em>Copy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.CopyImpl
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getCopy()
	 * @generated
	 */
	int COPY = 3;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__BASE_DIRECTED_RELATIONSHIP = TRACE__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__SOURCE_PROPERTY_PATH = TRACE__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__TARGET_PROPERTY_PATH = TRACE__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__SOURCE_CONTEXT = TRACE__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__TARGET_CONTEXT = TRACE__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__BASE_ABSTRACTION = TRACE__BASE_ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_FEATURE_COUNT = TRACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Traced From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY___GET_TRACED_FROM__NAMEDELEMENT = TRACE___GET_TRACED_FROM__NAMEDELEMENT;

	/**
	 * The number of operations of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPERATION_COUNT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.SatisfyImpl <em>Satisfy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.SatisfyImpl
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getSatisfy()
	 * @generated
	 */
	int SATISFY = 4;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__BASE_DIRECTED_RELATIONSHIP = TRACE__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__SOURCE_PROPERTY_PATH = TRACE__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__TARGET_PROPERTY_PATH = TRACE__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__SOURCE_CONTEXT = TRACE__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__TARGET_CONTEXT = TRACE__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__BASE_ABSTRACTION = TRACE__BASE_ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_FEATURE_COUNT = TRACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Traced From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY___GET_TRACED_FROM__NAMEDELEMENT = TRACE___GET_TRACED_FROM__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Satisfies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY___GET_SATISFIES__NAMEDELEMENT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_OPERATION_COUNT = TRACE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.TestCaseImpl
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 5;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__BASE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__BASE_BEHAVIOR = 1;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.VerifyImpl <em>Verify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.VerifyImpl
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getVerify()
	 * @generated
	 */
	int VERIFY = 6;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__BASE_DIRECTED_RELATIONSHIP = TRACE__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__SOURCE_PROPERTY_PATH = TRACE__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__TARGET_PROPERTY_PATH = TRACE__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__SOURCE_CONTEXT = TRACE__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__TARGET_CONTEXT = TRACE__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__BASE_ABSTRACTION = TRACE__BASE_ABSTRACTION;

	/**
	 * The number of structural features of the '<em>Verify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY_FEATURE_COUNT = TRACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Traced From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY___GET_TRACED_FROM__NAMEDELEMENT = TRACE___GET_TRACED_FROM__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Verifies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY___GET_VERIFIES__NAMEDELEMENT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Verify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY_OPERATION_COUNT = TRACE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RefineImpl <em>Refine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RefineImpl
	 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getRefine()
	 * @generated
	 */
	int REFINE = 7;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__BASE_DIRECTED_RELATIONSHIP = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__SOURCE_PROPERTY_PATH = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__TARGET_PROPERTY_PATH = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH;

	/**
	 * The feature id for the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__SOURCE_CONTEXT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__TARGET_CONTEXT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__BASE_ABSTRACTION = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_FEATURE_COUNT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Refines</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE___GET_REFINES__NAMEDELEMENT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_OPERATION_COUNT = BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.requirements.DeriveReqt <em>Derive Reqt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derive Reqt</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.DeriveReqt
	 * @generated
	 */
	EClass getDeriveReqt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.requirements.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml14.requirements.Trace#getTracedFrom(org.eclipse.uml2.uml.NamedElement) <em>Get Traced From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Traced From</em>' operation.
	 * @see org.eclipse.papyrus.sysml14.requirements.Trace#getTracedFrom(org.eclipse.uml2.uml.NamedElement)
	 * @generated
	 */
	EOperation getTrace__GetTracedFrom__NamedElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.requirements.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.requirements.Requirement#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Requirement#getBase_Class()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml14.requirements.Requirement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Requirement#getText()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.sysml14.requirements.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.requirements.Requirement#getDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Requirement#getDerived()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Derived();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.requirements.Requirement#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived From</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Requirement#getDerivedFrom()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_DerivedFrom();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.requirements.Requirement#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfied By</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Requirement#getSatisfiedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_SatisfiedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.requirements.Requirement#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined By</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Requirement#getRefinedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RefinedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.requirements.Requirement#getTracedTo <em>Traced To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traced To</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Requirement#getTracedTo()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_TracedTo();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.sysml14.requirements.Requirement#getVerifiedBy <em>Verified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verified By</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Requirement#getVerifiedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_VerifiedBy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.requirements.Requirement#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Requirement#getMaster()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Master();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.requirements.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Copy
	 * @generated
	 */
	EClass getCopy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.requirements.Satisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfy</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Satisfy
	 * @generated
	 */
	EClass getSatisfy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml14.requirements.Satisfy#getSatisfies(org.eclipse.uml2.uml.NamedElement) <em>Get Satisfies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Satisfies</em>' operation.
	 * @see org.eclipse.papyrus.sysml14.requirements.Satisfy#getSatisfies(org.eclipse.uml2.uml.NamedElement)
	 * @generated
	 */
	EOperation getSatisfy__GetSatisfies__NamedElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.requirements.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.requirements.TestCase#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.TestCase#getBase_Operation()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Base_Operation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.sysml14.requirements.TestCase#getBase_Behavior <em>Base Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Behavior</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.TestCase#getBase_Behavior()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Base_Behavior();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.requirements.Verify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verify</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Verify
	 * @generated
	 */
	EClass getVerify();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml14.requirements.Verify#getVerifies(org.eclipse.uml2.uml.NamedElement) <em>Get Verifies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Verifies</em>' operation.
	 * @see org.eclipse.papyrus.sysml14.requirements.Verify#getVerifies(org.eclipse.uml2.uml.NamedElement)
	 * @generated
	 */
	EOperation getVerify__GetVerifies__NamedElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.sysml14.requirements.Refine <em>Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refine</em>'.
	 * @see org.eclipse.papyrus.sysml14.requirements.Refine
	 * @generated
	 */
	EClass getRefine();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.sysml14.requirements.Refine#getRefines(org.eclipse.uml2.uml.NamedElement) <em>Get Refines</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Refines</em>' operation.
	 * @see org.eclipse.papyrus.sysml14.requirements.Refine#getRefines(org.eclipse.uml2.uml.NamedElement)
	 * @generated
	 */
	EOperation getRefine__GetRefines__NamedElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.DeriveReqtImpl <em>Derive Reqt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.DeriveReqtImpl
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getDeriveReqt()
		 * @generated
		 */
		EClass DERIVE_REQT = eINSTANCE.getDeriveReqt();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.TraceImpl
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Get Traced From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE___GET_TRACED_FROM__NAMEDELEMENT = eINSTANCE.getTrace__GetTracedFrom__NamedElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementImpl
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__BASE_CLASS = eINSTANCE.getRequirement_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TEXT = eINSTANCE.getRequirement_Text();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DERIVED = eINSTANCE.getRequirement_Derived();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DERIVED_FROM = eINSTANCE.getRequirement_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Satisfied By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SATISFIED_BY = eINSTANCE.getRequirement_SatisfiedBy();

		/**
		 * The meta object literal for the '<em><b>Refined By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REFINED_BY = eINSTANCE.getRequirement_RefinedBy();

		/**
		 * The meta object literal for the '<em><b>Traced To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__TRACED_TO = eINSTANCE.getRequirement_TracedTo();

		/**
		 * The meta object literal for the '<em><b>Verified By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__VERIFIED_BY = eINSTANCE.getRequirement_VerifiedBy();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__MASTER = eINSTANCE.getRequirement_Master();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.CopyImpl <em>Copy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.CopyImpl
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getCopy()
		 * @generated
		 */
		EClass COPY = eINSTANCE.getCopy();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.SatisfyImpl <em>Satisfy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.SatisfyImpl
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getSatisfy()
		 * @generated
		 */
		EClass SATISFY = eINSTANCE.getSatisfy();

		/**
		 * The meta object literal for the '<em><b>Get Satisfies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SATISFY___GET_SATISFIES__NAMEDELEMENT = eINSTANCE.getSatisfy__GetSatisfies__NamedElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.TestCaseImpl
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__BASE_OPERATION = eINSTANCE.getTestCase_Base_Operation();

		/**
		 * The meta object literal for the '<em><b>Base Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__BASE_BEHAVIOR = eINSTANCE.getTestCase_Base_Behavior();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.VerifyImpl <em>Verify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.VerifyImpl
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getVerify()
		 * @generated
		 */
		EClass VERIFY = eINSTANCE.getVerify();

		/**
		 * The meta object literal for the '<em><b>Get Verifies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERIFY___GET_VERIFIES__NAMEDELEMENT = eINSTANCE.getVerify__GetVerifies__NamedElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.sysml14.requirements.internal.impl.RefineImpl <em>Refine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RefineImpl
		 * @see org.eclipse.papyrus.sysml14.requirements.internal.impl.RequirementsPackageImpl#getRefine()
		 * @generated
		 */
		EClass REFINE = eINSTANCE.getRefine();

		/**
		 * The meta object literal for the '<em><b>Get Refines</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFINE___GET_REFINES__NAMEDELEMENT = eINSTANCE.getRefine__GetRefines__NamedElement();

	}

} //RequirementsPackage
