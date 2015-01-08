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
package org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters;

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
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory
 * @model kind="package"
 * @generated
 */
public interface RSAToPapyrusParametersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "RSAToPapyrusParameters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http:///RSAToPapyrusParameters.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "RSAToPapyrusParameters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	RSAToPapyrusParametersPackage eINSTANCE = org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.RSAToPapyrusParametersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.RSAToPapyrusParametersPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Mapping Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG__MAPPING_PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Max Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG__MAX_THREADS = 1;

	/**
	 * The feature id for the '<em><b>Remove Unmapped Diagrams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG__REMOVE_UNMAPPED_DIAGRAMS = 2;

	/**
	 * The feature id for the '<em><b>Convert Opaque Expression To Literal String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING = 3;

	/**
	 * The feature id for the '<em><b>Remove Unmapped Profiles And Stereotypes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES = 4;

	/**
	 * The feature id for the '<em><b>Remove Unmapped Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG__REMOVE_UNMAPPED_ANNOTATIONS = 5;

	/**
	 * The feature id for the '<em><b>Always Accept Suggested Mappings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG__ALWAYS_ACCEPT_SUGGESTED_MAPPINGS = 6;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.MappingParametersImpl <em>Mapping Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.MappingParametersImpl
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.RSAToPapyrusParametersPackageImpl#getMappingParameters()
	 * @generated
	 */
	int MAPPING_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Uri Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETERS__URI_MAPPINGS = 0;

	/**
	 * The feature id for the '<em><b>Profile Uri Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETERS__PROFILE_URI_MAPPINGS = 1;

	/**
	 * The number of structural features of the '<em>Mapping Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MAPPING_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.URIMappingImpl <em>URI Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.URIMappingImpl
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.RSAToPapyrusParametersPackageImpl#getURIMapping()
	 * @generated
	 */
	int URI_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Source URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int URI_MAPPING__SOURCE_URI = 0;

	/**
	 * The feature id for the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int URI_MAPPING__TARGET_URI = 1;

	/**
	 * The number of structural features of the '<em>URI Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int URI_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>URI Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int URI_MAPPING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#getMappingParameters <em>Mapping Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Mapping Parameters</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#getMappingParameters()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_MappingParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#getMaxThreads <em>Max Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Max Threads</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#getMaxThreads()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_MaxThreads();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isRemoveUnmappedDiagrams <em>Remove Unmapped Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Remove Unmapped Diagrams</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isRemoveUnmappedDiagrams()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_RemoveUnmappedDiagrams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isConvertOpaqueExpressionToLiteralString <em>Convert Opaque Expression To Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Convert Opaque Expression To Literal String</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isConvertOpaqueExpressionToLiteralString()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_ConvertOpaqueExpressionToLiteralString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isRemoveUnmappedProfilesAndStereotypes <em>Remove Unmapped Profiles And Stereotypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Remove Unmapped Profiles And Stereotypes</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isRemoveUnmappedProfilesAndStereotypes()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_RemoveUnmappedProfilesAndStereotypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isRemoveUnmappedAnnotations <em>Remove Unmapped Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Remove Unmapped Annotations</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isRemoveUnmappedAnnotations()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_RemoveUnmappedAnnotations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isAlwaysAcceptSuggestedMappings <em>Always Accept Suggested Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Always Accept Suggested Mappings</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isAlwaysAcceptSuggestedMappings()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_AlwaysAcceptSuggestedMappings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.MappingParameters <em>Mapping Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Mapping Parameters</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.MappingParameters
	 * @generated
	 */
	EClass getMappingParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.MappingParameters#getUriMappings <em>Uri Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Uri Mappings</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.MappingParameters#getUriMappings()
	 * @see #getMappingParameters()
	 * @generated
	 */
	EReference getMappingParameters_UriMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.MappingParameters#getProfileUriMappings <em>Profile Uri Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Profile Uri Mappings</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.MappingParameters#getProfileUriMappings()
	 * @see #getMappingParameters()
	 * @generated
	 */
	EReference getMappingParameters_ProfileUriMappings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping <em>URI Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>URI Mapping</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping
	 * @generated
	 */
	EClass getURIMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping#getSourceURI <em>Source URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Source URI</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping#getSourceURI()
	 * @see #getURIMapping()
	 * @generated
	 */
	EAttribute getURIMapping_SourceURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping#getTargetURI <em>Target URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Target URI</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping#getTargetURI()
	 * @see #getURIMapping()
	 * @generated
	 */
	EAttribute getURIMapping_TargetURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RSAToPapyrusParametersFactory getRSAToPapyrusParametersFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.ConfigImpl
		 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.RSAToPapyrusParametersPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Mapping Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference CONFIG__MAPPING_PARAMETERS = eINSTANCE.getConfig_MappingParameters();

		/**
		 * The meta object literal for the '<em><b>Max Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CONFIG__MAX_THREADS = eINSTANCE.getConfig_MaxThreads();

		/**
		 * The meta object literal for the '<em><b>Remove Unmapped Diagrams</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CONFIG__REMOVE_UNMAPPED_DIAGRAMS = eINSTANCE.getConfig_RemoveUnmappedDiagrams();

		/**
		 * The meta object literal for the '<em><b>Convert Opaque Expression To Literal String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING = eINSTANCE.getConfig_ConvertOpaqueExpressionToLiteralString();

		/**
		 * The meta object literal for the '<em><b>Remove Unmapped Profiles And Stereotypes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES = eINSTANCE.getConfig_RemoveUnmappedProfilesAndStereotypes();

		/**
		 * The meta object literal for the '<em><b>Remove Unmapped Annotations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CONFIG__REMOVE_UNMAPPED_ANNOTATIONS = eINSTANCE.getConfig_RemoveUnmappedAnnotations();

		/**
		 * The meta object literal for the '<em><b>Always Accept Suggested Mappings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CONFIG__ALWAYS_ACCEPT_SUGGESTED_MAPPINGS = eINSTANCE.getConfig_AlwaysAcceptSuggestedMappings();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.MappingParametersImpl <em>Mapping Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.MappingParametersImpl
		 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.RSAToPapyrusParametersPackageImpl#getMappingParameters()
		 * @generated
		 */
		EClass MAPPING_PARAMETERS = eINSTANCE.getMappingParameters();

		/**
		 * The meta object literal for the '<em><b>Uri Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference MAPPING_PARAMETERS__URI_MAPPINGS = eINSTANCE.getMappingParameters_UriMappings();

		/**
		 * The meta object literal for the '<em><b>Profile Uri Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference MAPPING_PARAMETERS__PROFILE_URI_MAPPINGS = eINSTANCE.getMappingParameters_ProfileUriMappings();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.URIMappingImpl <em>URI Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.URIMappingImpl
		 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.impl.RSAToPapyrusParametersPackageImpl#getURIMapping()
		 * @generated
		 */
		EClass URI_MAPPING = eINSTANCE.getURIMapping();

		/**
		 * The meta object literal for the '<em><b>Source URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute URI_MAPPING__SOURCE_URI = eINSTANCE.getURIMapping_SourceURI();

		/**
		 * The meta object literal for the '<em><b>Target URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute URI_MAPPING__TARGET_URI = eINSTANCE.getURIMapping_TargetURI();

	}

} // RSAToPapyrusParametersPackage
