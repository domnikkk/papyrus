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
package org.eclipse.papyrus.migration.rsa.profilebase.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.papyrus.migration.rsa.default_.DefaultPackage;
import org.eclipse.papyrus.migration.rsa.profilebase.ProfileBaseFactory;
import org.eclipse.papyrus.migration.rsa.profilebase.ProfileBasePackage;
import org.eclipse.papyrus.migration.rsa.profilebase.ProfileConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProfileBasePackageImpl extends EPackageImpl implements ProfileBasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass profileConstraintEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.migration.rsa.profilebase.ProfileBasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProfileBasePackageImpl() {
		super(eNS_URI, ProfileBaseFactory.eINSTANCE);
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
	 * This method is used to initialize {@link ProfileBasePackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProfileBasePackage init() {
		if (isInited) {
			return (ProfileBasePackage) EPackage.Registry.INSTANCE.getEPackage(ProfileBasePackage.eNS_URI);
		}

		// Obtain or create and register package
		ProfileBasePackageImpl theProfileBasePackage = (ProfileBasePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProfileBasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProfileBasePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DefaultPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProfileBasePackage.createPackageContents();

		// Initialize created meta-data
		theProfileBasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProfileBasePackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProfileBasePackage.eNS_URI, theProfileBasePackage);
		return theProfileBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getProfileConstraint() {
		return profileConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getProfileConstraint_MessageKey() {
		return (EAttribute) profileConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ProfileBaseFactory getProfileBaseFactory() {
		return (ProfileBaseFactory) getEFactoryInstance();
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
		profileConstraintEClass = createEClass(PROFILE_CONSTRAINT);
		createEAttribute(profileConstraintEClass, PROFILE_CONSTRAINT__MESSAGE_KEY);
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
		DefaultPackage theDefaultPackage = (DefaultPackage) EPackage.Registry.INSTANCE.getEPackage(DefaultPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		profileConstraintEClass.getESuperTypes().add(theDefaultPackage.getAbstractConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(profileConstraintEClass, ProfileConstraint.class, "ProfileConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfileConstraint_MessageKey(), ecorePackage.getEString(), "messageKey", null, 1, 1, ProfileConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // ProfileBasePackageImpl
