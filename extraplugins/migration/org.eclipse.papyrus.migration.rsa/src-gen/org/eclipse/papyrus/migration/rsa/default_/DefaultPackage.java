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
package org.eclipse.papyrus.migration.rsa.default_;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.papyrus.migration.rsa.default_.DefaultFactory
 * @model kind="package"
 * @generated
 */
public interface DefaultPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "default";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/profile/default";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "default";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	DefaultPackage eINSTANCE = org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DocumentationImpl
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.URLImpl <em>URL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.URLImpl
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getURL()
	 * @generated
	 */
	int URL = 1;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int URL__BASE_COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int URL__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int URL__DISPLAY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int URL__ICON = 3;

	/**
	 * The number of structural features of the '<em>URL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>URL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int URL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.LinkImpl
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LINK__BASE_COMMENT = URL__BASE_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = URL__TYPE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LINK__DISPLAY_NAME = URL__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LINK__ICON = URL__ICON;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = URL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = URL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.AbstractConstraintImpl <em>Abstract Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.AbstractConstraintImpl
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getAbstractConstraint()
	 * @generated
	 */
	int ABSTRACT_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__BASE_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Evaluation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__EVALUATION_MODE = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__SEVERITY = 2;

	/**
	 * The number of structural features of the '<em>Abstract Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.MetaConstraintImpl <em>Meta Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.MetaConstraintImpl
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getMetaConstraint()
	 * @generated
	 */
	int META_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int META_CONSTRAINT__BASE_CONSTRAINT = ABSTRACT_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Evaluation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int META_CONSTRAINT__EVALUATION_MODE = ABSTRACT_CONSTRAINT__EVALUATION_MODE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int META_CONSTRAINT__SEVERITY = ABSTRACT_CONSTRAINT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int META_CONSTRAINT__MESSAGE = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meta Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int META_CONSTRAINT_FEATURE_COUNT = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meta Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int META_CONSTRAINT_OPERATION_COUNT = ABSTRACT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.MarkingModelImpl <em>Marking Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.MarkingModelImpl
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getMarkingModel()
	 * @generated
	 */
	int MARKING_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MARKING_MODEL__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Marking Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MARKING_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Marking Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MARKING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.MarkingImportImpl <em>Marking Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.MarkingImportImpl
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getMarkingImport()
	 * @generated
	 */
	int MARKING_IMPORT = 6;

	/**
	 * The feature id for the '<em><b>Base Element Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MARKING_IMPORT__BASE_ELEMENT_IMPORT = 0;

	/**
	 * The number of structural features of the '<em>Marking Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MARKING_IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Marking Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MARKING_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.default_.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.default_.Mode
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.default_.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.default_.Severity
	 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 8;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.default_.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.migration.rsa.default_.Documentation#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.Documentation#getBase_Comment()
	 * @see #getDocumentation()
	 * @generated
	 */
	EReference getDocumentation_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.default_.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>URL</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.URL
	 * @generated
	 */
	EClass getURL();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.migration.rsa.default_.URL#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.URL#getBase_Comment()
	 * @see #getURL()
	 * @generated
	 */
	EReference getURL_Base_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.default_.URL#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.URL#getType()
	 * @see #getURL()
	 * @generated
	 */
	EAttribute getURL_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.default_.URL#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.URL#getDisplayName()
	 * @see #getURL()
	 * @generated
	 */
	EAttribute getURL_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.default_.URL#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.URL#getIcon()
	 * @see #getURL()
	 * @generated
	 */
	EAttribute getURL_Icon();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.default_.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint <em>Abstract Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Abstract Constraint</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint
	 * @generated
	 */
	EClass getAbstractConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint#getBase_Constraint <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint#getBase_Constraint()
	 * @see #getAbstractConstraint()
	 * @generated
	 */
	EReference getAbstractConstraint_Base_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint#getEvaluationMode <em>Evaluation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Evaluation Mode</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint#getEvaluationMode()
	 * @see #getAbstractConstraint()
	 * @generated
	 */
	EAttribute getAbstractConstraint_EvaluationMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.AbstractConstraint#getSeverity()
	 * @see #getAbstractConstraint()
	 * @generated
	 */
	EAttribute getAbstractConstraint_Severity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.default_.MetaConstraint <em>Meta Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Meta Constraint</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.MetaConstraint
	 * @generated
	 */
	EClass getMetaConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.default_.MetaConstraint#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.MetaConstraint#getMessage()
	 * @see #getMetaConstraint()
	 * @generated
	 */
	EAttribute getMetaConstraint_Message();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.default_.MarkingModel <em>Marking Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Marking Model</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.MarkingModel
	 * @generated
	 */
	EClass getMarkingModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.migration.rsa.default_.MarkingModel#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.MarkingModel#getBase_Package()
	 * @see #getMarkingModel()
	 * @generated
	 */
	EReference getMarkingModel_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.default_.MarkingImport <em>Marking Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Marking Import</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.MarkingImport
	 * @generated
	 */
	EClass getMarkingImport();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.migration.rsa.default_.MarkingImport#getBase_ElementImport <em>Base Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Element Import</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.MarkingImport#getBase_ElementImport()
	 * @see #getMarkingImport()
	 * @generated
	 */
	EReference getMarkingImport_Base_ElementImport();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.migration.rsa.default_.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.migration.rsa.default_.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.default_.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DefaultFactory getDefaultFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DocumentationImpl
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference DOCUMENTATION__BASE_COMMENT = eINSTANCE.getDocumentation_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.URLImpl <em>URL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.URLImpl
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getURL()
		 * @generated
		 */
		EClass URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference URL__BASE_COMMENT = eINSTANCE.getURL_Base_Comment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute URL__TYPE = eINSTANCE.getURL_Type();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute URL__DISPLAY_NAME = eINSTANCE.getURL_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute URL__ICON = eINSTANCE.getURL_Icon();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.LinkImpl
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.AbstractConstraintImpl <em>Abstract Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.AbstractConstraintImpl
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getAbstractConstraint()
		 * @generated
		 */
		EClass ABSTRACT_CONSTRAINT = eINSTANCE.getAbstractConstraint();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ABSTRACT_CONSTRAINT__BASE_CONSTRAINT = eINSTANCE.getAbstractConstraint_Base_Constraint();

		/**
		 * The meta object literal for the '<em><b>Evaluation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTRAINT__EVALUATION_MODE = eINSTANCE.getAbstractConstraint_EvaluationMode();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTRAINT__SEVERITY = eINSTANCE.getAbstractConstraint_Severity();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.MetaConstraintImpl <em>Meta Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.MetaConstraintImpl
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getMetaConstraint()
		 * @generated
		 */
		EClass META_CONSTRAINT = eINSTANCE.getMetaConstraint();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute META_CONSTRAINT__MESSAGE = eINSTANCE.getMetaConstraint_Message();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.MarkingModelImpl <em>Marking Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.MarkingModelImpl
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getMarkingModel()
		 * @generated
		 */
		EClass MARKING_MODEL = eINSTANCE.getMarkingModel();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference MARKING_MODEL__BASE_PACKAGE = eINSTANCE.getMarkingModel_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.default_.impl.MarkingImportImpl <em>Marking Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.MarkingImportImpl
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getMarkingImport()
		 * @generated
		 */
		EClass MARKING_IMPORT = eINSTANCE.getMarkingImport();

		/**
		 * The meta object literal for the '<em><b>Base Element Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference MARKING_IMPORT__BASE_ELEMENT_IMPORT = eINSTANCE.getMarkingImport_Base_ElementImport();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.default_.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.default_.Mode
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.default_.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.default_.Severity
		 * @see org.eclipse.papyrus.migration.rsa.default_.impl.DefaultPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

	}

} // DefaultPackage
