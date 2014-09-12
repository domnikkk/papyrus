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
package org.eclipse.papyrus.migration.rsa.profilebase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.papyrus.migration.rsa.default_.DefaultPackage;

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
 * @see org.eclipse.papyrus.migration.rsa.profilebase.ProfileBaseFactory
 * @model kind="package"
 * @generated
 */
public interface ProfileBasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "profilebase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/profile/profilebase";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "ProfileBase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	ProfileBasePackage eINSTANCE = org.eclipse.papyrus.migration.rsa.profilebase.impl.ProfileBasePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.profilebase.impl.ProfileConstraintImpl <em>Profile Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.profilebase.impl.ProfileConstraintImpl
	 * @see org.eclipse.papyrus.migration.rsa.profilebase.impl.ProfileBasePackageImpl#getProfileConstraint()
	 * @generated
	 */
	int PROFILE_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROFILE_CONSTRAINT__BASE_CONSTRAINT = DefaultPackage.ABSTRACT_CONSTRAINT__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Evaluation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROFILE_CONSTRAINT__EVALUATION_MODE = DefaultPackage.ABSTRACT_CONSTRAINT__EVALUATION_MODE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROFILE_CONSTRAINT__SEVERITY = DefaultPackage.ABSTRACT_CONSTRAINT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Message Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROFILE_CONSTRAINT__MESSAGE_KEY = DefaultPackage.ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Profile Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROFILE_CONSTRAINT_FEATURE_COUNT = DefaultPackage.ABSTRACT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Profile Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PROFILE_CONSTRAINT_OPERATION_COUNT = DefaultPackage.ABSTRACT_CONSTRAINT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.profilebase.ProfileConstraint <em>Profile Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Profile Constraint</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.profilebase.ProfileConstraint
	 * @generated
	 */
	EClass getProfileConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.profilebase.ProfileConstraint#getMessageKey <em>Message Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Message Key</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.profilebase.ProfileConstraint#getMessageKey()
	 * @see #getProfileConstraint()
	 * @generated
	 */
	EAttribute getProfileConstraint_MessageKey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProfileBaseFactory getProfileBaseFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.profilebase.impl.ProfileConstraintImpl <em>Profile Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.profilebase.impl.ProfileConstraintImpl
		 * @see org.eclipse.papyrus.migration.rsa.profilebase.impl.ProfileBasePackageImpl#getProfileConstraint()
		 * @generated
		 */
		EClass PROFILE_CONSTRAINT = eINSTANCE.getProfileConstraint();

		/**
		 * The meta object literal for the '<em><b>Message Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PROFILE_CONSTRAINT__MESSAGE_KEY = eINSTANCE.getProfileConstraint_MessageKey();

	}

} // ProfileBasePackage
