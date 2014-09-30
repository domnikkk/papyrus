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
 * <!-- begin-model-doc -->
 * If true, the unsupported EAnnotation from RSA will be removed
 * <!-- end-model-doc -->
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
	 * The feature id for the '<em><b>Convert Opaque Expression To Literal String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG__CONVERT_OPAQUE_EXPRESSION_TO_LITERAL_STRING = 0;

	/**
	 * The feature id for the '<em><b>Remove Unmapped Profiles And Stereotypes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG__REMOVE_UNMAPPED_PROFILES_AND_STEREOTYPES = 1;

	/**
	 * The feature id for the '<em><b>Remove Unmapped Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG__REMOVE_UNMAPPED_ANNOTATIONS = 2;

	/**
	 * The feature id for the '<em><b>Remove Unmapped Diagrams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG__REMOVE_UNMAPPED_DIAGRAMS = 3;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 4;

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
		 * The meta object literal for the '<em><b>Remove Unmapped Diagrams</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute CONFIG__REMOVE_UNMAPPED_DIAGRAMS = eINSTANCE.getConfig_RemoveUnmappedDiagrams();

	}

} // RSAToPapyrusParametersPackage
