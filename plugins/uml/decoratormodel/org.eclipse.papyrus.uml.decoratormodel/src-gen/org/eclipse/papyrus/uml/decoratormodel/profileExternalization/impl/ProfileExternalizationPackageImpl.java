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
package org.eclipse.papyrus.uml.decoratormodel.profileExternalization.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ProfileExternalizationFactory;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ProfileExternalizationPackage;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.util.ProfileExternalizationValidator;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProfileExternalizationPackageImpl extends EPackageImpl implements ProfileExternalizationPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass applyProfilesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ProfileExternalizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProfileExternalizationPackageImpl()
	{
		super(eNS_URI, ProfileExternalizationFactory.eINSTANCE);
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
	 * This method is used to initialize {@link ProfileExternalizationPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProfileExternalizationPackage init()
	{
		if (isInited) {
			return (ProfileExternalizationPackage) EPackage.Registry.INSTANCE.getEPackage(ProfileExternalizationPackage.eNS_URI);
		}

		// Obtain or create and register package
		ProfileExternalizationPackageImpl theProfileExternalizationPackage = (ProfileExternalizationPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProfileExternalizationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new ProfileExternalizationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProfileExternalizationPackage.createPackageContents();

		// Initialize created meta-data
		theProfileExternalizationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
				(theProfileExternalizationPackage,
						new EValidator.Descriptor()
						{
							@Override
							public EValidator getEValidator()
							{
								return ProfileExternalizationValidator.INSTANCE;
							}
						});

		// Mark meta-data to indicate it can't be changed
		theProfileExternalizationPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProfileExternalizationPackage.eNS_URI, theProfileExternalizationPackage);
		return theProfileExternalizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getApplyProfiles()
	{
		return applyProfilesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getApplyProfiles_Base_Dependency()
	{
		return (EReference) applyProfilesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getApplyProfiles__GetAppliedProfiles()
	{
		return applyProfilesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getApplyProfiles__GetExternalizedAppliedProfilePackages()
	{
		return applyProfilesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ProfileExternalizationFactory getProfileExternalizationFactory()
	{
		return (ProfileExternalizationFactory) getEFactoryInstance();
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
	public void createPackageContents()
	{
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		applyProfilesEClass = createEClass(APPLY_PROFILES);
		createEReference(applyProfilesEClass, APPLY_PROFILES__BASE_DEPENDENCY);
		createEOperation(applyProfilesEClass, APPLY_PROFILES___GET_APPLIED_PROFILES);
		createEOperation(applyProfilesEClass, APPLY_PROFILES___GET_EXTERNALIZED_APPLIED_PROFILE_PACKAGES);
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
	public void initializePackageContents()
	{
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(applyProfilesEClass, ApplyProfiles.class, "ApplyProfiles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getApplyProfiles_Base_Dependency(), theUMLPackage.getDependency(), null,
				"base_Dependency", null, 1, 1, ApplyProfiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getApplyProfiles__GetAppliedProfiles(), theUMLPackage.getProfile(), "getAppliedProfiles", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getApplyProfiles__GetExternalizedAppliedProfilePackages(), theUMLPackage.getPackage(), "getExternalizedAppliedProfilePackages", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createEcoreAnnotations()
	{
		String source = "http://www.eclipse.org/emf/2002/Ecore"; //$NON-NLS-1$
		addAnnotation(this,
				source,
				new String[]
				{		 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(applyProfilesEClass,
				source,
				new String[]
				{		 "constraints", "suppliers_are_packages clients_are_packages" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createUMLAnnotations()
	{
		String source = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$
		addAnnotation(this,
				source,
				new String[]
				{		 "originalName", "ProfileExternalization" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createOCLAnnotations()
	{
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL"; //$NON-NLS-1$
		addAnnotation(applyProfilesEClass,
				source,
				new String[]
				{		 "suppliers_are_packages", "base_Dependency.supplier->forAll(oclIsKindOf(uml::Package))", //$NON-NLS-1$ //$NON-NLS-2$
						"clients_are_packages", "base_Dependency.client->forAll(oclIsKindOf(uml::Package))" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createEmofAnnotations()
	{
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName"; //$NON-NLS-1$
		addAnnotation(getApplyProfiles_Base_Dependency(),
				source,
				new String[]
				{		 "body", "extension_ApplyProfiles" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} // ProfileExternalizationPackageImpl
