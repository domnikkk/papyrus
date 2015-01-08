/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.MappingParameters;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping;
import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RSAToPapyrusParametersPackageImpl extends EPackageImpl implements RSAToPapyrusParametersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass configEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass mappingParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass uriMappingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RSAToPapyrusParametersPackageImpl() {
		super(eNS_URI, RSAToPapyrusParametersFactory.eINSTANCE);
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
	 * This method is used to initialize {@link RSAToPapyrusParametersPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RSAToPapyrusParametersPackage init() {
		if (isInited) {
			return (RSAToPapyrusParametersPackage) EPackage.Registry.INSTANCE.getEPackage(RSAToPapyrusParametersPackage.eNS_URI);
		}

		// Obtain or create and register package
		RSAToPapyrusParametersPackageImpl theRSAToPapyrusParametersPackage = (RSAToPapyrusParametersPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RSAToPapyrusParametersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new RSAToPapyrusParametersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRSAToPapyrusParametersPackage.createPackageContents();

		// Initialize created meta-data
		theRSAToPapyrusParametersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRSAToPapyrusParametersPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RSAToPapyrusParametersPackage.eNS_URI, theRSAToPapyrusParametersPackage);
		return theRSAToPapyrusParametersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getConfig() {
		return configEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfig_MappingParameters() {
		return (EReference) configEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getConfig_MaxThreads() {
		return (EAttribute) configEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getConfig_RemoveUnmappedDiagrams() {
		return (EAttribute) configEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getConfig_ConvertOpaqueExpressionToLiteralString() {
		return (EAttribute) configEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getConfig_RemoveUnmappedProfilesAndStereotypes() {
		return (EAttribute) configEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getConfig_RemoveUnmappedAnnotations() {
		return (EAttribute) configEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getConfig_AlwaysAcceptSuggestedMappings() {
		return (EAttribute) configEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getMappingParameters() {
		return mappingParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getMappingParameters_UriMappings() {
		return (EReference) mappingParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getMappingParameters_ProfileUriMappings() {
		return (EReference) mappingParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getURIMapping() {
		return uriMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getURIMapping_SourceURI() {
		return (EAttribute) uriMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getURIMapping_TargetURI() {
		return (EAttribute) uriMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public RSAToPapyrusParametersFactory getRSAToPapyrusParametersFactory() {
		return (RSAToPapyrusParametersFactory) getEFactoryInstance();
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
		configEClass = createEClass(CONFIG);
		createEReference(configEClass, CONFIG__MAPPING_PARAMETERS);
		createEAttribute(configEClass, CONFIG__MAX_THREADS);
		createEAttribute(configEClass, CONFIG__REMOVE_UNMAPPED_DIAGRAMS);
		createEAttribute(configEClass, CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING);
		createEAttribute(configEClass, CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES);
		createEAttribute(configEClass, CONFIG__REMOVE_UNMAPPED_ANNOTATIONS);
		createEAttribute(configEClass, CONFIG__ALWAYS_ACCEPT_SUGGESTED_MAPPINGS);

		mappingParametersEClass = createEClass(MAPPING_PARAMETERS);
		createEReference(mappingParametersEClass, MAPPING_PARAMETERS__URI_MAPPINGS);
		createEReference(mappingParametersEClass, MAPPING_PARAMETERS__PROFILE_URI_MAPPINGS);

		uriMappingEClass = createEClass(URI_MAPPING);
		createEAttribute(uriMappingEClass, URI_MAPPING__SOURCE_URI);
		createEAttribute(uriMappingEClass, URI_MAPPING__TARGET_URI);
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
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfig_MappingParameters(), this.getMappingParameters(), null, "mappingParameters", null, 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getConfig_MaxThreads(), theTypesPackage.getInteger(), "maxThreads", "2", 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfig_RemoveUnmappedDiagrams(), theTypesPackage.getBoolean(), "removeUnmappedDiagrams", "false", 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfig_ConvertOpaqueExpressionToLiteralString(), theTypesPackage.getBoolean(), "convertOpaqueExpressionToLiteralString", "true", 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfig_RemoveUnmappedProfilesAndStereotypes(), theTypesPackage.getBoolean(), "removeUnmappedProfilesAndStereotypes", "true", 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfig_RemoveUnmappedAnnotations(), theTypesPackage.getBoolean(), "removeUnmappedAnnotations", "false", 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfig_AlwaysAcceptSuggestedMappings(), theTypesPackage.getBoolean(), "alwaysAcceptSuggestedMappings", "false", 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(mappingParametersEClass, MappingParameters.class, "MappingParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingParameters_UriMappings(), this.getURIMapping(), null, "uriMappings", null, 0, -1, MappingParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getMappingParameters_ProfileUriMappings(), this.getURIMapping(), null, "profileUriMappings", null, 0, -1, MappingParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(uriMappingEClass, URIMapping.class, "URIMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURIMapping_SourceURI(), theTypesPackage.getString(), "sourceURI", null, 1, 1, URIMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getURIMapping_TargetURI(), theTypesPackage.getString(), "targetURI", null, 1, 1, URIMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // RSAToPapyrusParametersPackageImpl
