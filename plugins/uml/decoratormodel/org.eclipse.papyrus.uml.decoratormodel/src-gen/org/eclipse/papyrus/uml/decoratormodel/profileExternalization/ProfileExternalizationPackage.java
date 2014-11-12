/**
 * Copyright (c) 2014 Christian W. Damus and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 */
package org.eclipse.papyrus.uml.decoratormodel.profileExternalization;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ProfileExternalizationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ProfileExternalization'"
 * @generated
 */
public interface ProfileExternalizationPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "profileExternalization"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/Papyrus/2014/profile/profileExternalization"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "profileext"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	ProfileExternalizationPackage eINSTANCE = org.eclipse.papyrus.uml.decoratormodel.profileExternalization.impl.ProfileExternalizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.uml.decoratormodel.profileExternalization.impl.ApplyProfilesImpl <em>Apply Profiles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.impl.ApplyProfilesImpl
	 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.impl.ProfileExternalizationPackageImpl#getApplyProfiles()
	 * @generated
	 */
	int APPLY_PROFILES = 0;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int APPLY_PROFILES__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Apply Profiles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int APPLY_PROFILES_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Applied Profiles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int APPLY_PROFILES___GET_APPLIED_PROFILES = 0;

	/**
	 * The operation id for the '<em>Get Externalized Applied Profile Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int APPLY_PROFILES___GET_EXTERNALIZED_APPLIED_PROFILE_PACKAGES = 1;

	/**
	 * The number of operations of the '<em>Apply Profiles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int APPLY_PROFILES_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles <em>Apply Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Apply Profiles</em>'.
	 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles
	 * @generated
	 */
	EClass getApplyProfiles();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles#getBase_Dependency()
	 * @see #getApplyProfiles()
	 * @generated
	 */
	EReference getApplyProfiles_Base_Dependency();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles#getAppliedProfiles() <em>Get Applied Profiles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Applied Profiles</em>' operation.
	 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles#getAppliedProfiles()
	 * @generated
	 */
	EOperation getApplyProfiles__GetAppliedProfiles();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles#getExternalizedAppliedProfilePackages() <em>Get Externalized Applied Profile Packages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Externalized Applied Profile Packages</em>' operation.
	 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles#getExternalizedAppliedProfilePackages()
	 * @generated
	 */
	EOperation getApplyProfiles__GetExternalizedAppliedProfilePackages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProfileExternalizationFactory getProfileExternalizationFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.uml.decoratormodel.profileExternalization.impl.ApplyProfilesImpl <em>Apply Profiles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.impl.ApplyProfilesImpl
		 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.impl.ProfileExternalizationPackageImpl#getApplyProfiles()
		 * @generated
		 */
		EClass APPLY_PROFILES = eINSTANCE.getApplyProfiles();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference APPLY_PROFILES__BASE_DEPENDENCY = eINSTANCE.getApplyProfiles_Base_Dependency();

		/**
		 * The meta object literal for the '<em><b>Get Applied Profiles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation APPLY_PROFILES___GET_APPLIED_PROFILES = eINSTANCE.getApplyProfiles__GetAppliedProfiles();

		/**
		 * The meta object literal for the '<em><b>Get Externalized Applied Profile Packages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation APPLY_PROFILES___GET_EXTERNALIZED_APPLIED_PROFILE_PACKAGES = eINSTANCE.getApplyProfiles__GetExternalizedAppliedProfilePackages();

	}

} // ProfileExternalizationPackage
