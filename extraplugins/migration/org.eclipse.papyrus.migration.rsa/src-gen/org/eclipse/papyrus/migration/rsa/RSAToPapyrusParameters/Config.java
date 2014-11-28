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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#getMappingParameters <em>Mapping Parameters</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#getMaxThreads <em>Max Threads</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isRemoveUnmappedDiagrams <em>Remove Unmapped Diagrams</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isConvertOpaqueExpressionToLiteralString <em>Convert Opaque Expression To Literal String</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isRemoveUnmappedProfilesAndStereotypes <em>Remove Unmapped Profiles And Stereotypes</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isRemoveUnmappedAnnotations <em>Remove Unmapped Annotations</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isAlwaysAcceptSuggestedMappings <em>Always Accept Suggested Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Parameters</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Mapping Parameters</em>' containment reference.
	 * @see #setMappingParameters(MappingParameters)
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage#getConfig_MappingParameters()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	MappingParameters getMappingParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#getMappingParameters <em>Mapping Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Mapping Parameters</em>' containment reference.
	 * @see #getMappingParameters()
	 * @generated
	 */
	void setMappingParameters(MappingParameters value);

	/**
	 * Returns the value of the '<em><b>Max Threads</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of threads to use during the migration.
	 * More threads will provide faster results, at the cost of memory consumption.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Max Threads</em>' attribute.
	 * @see #setMaxThreads(int)
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage#getConfig_MaxThreads()
	 * @model default="2" unique="false" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMaxThreads();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#getMaxThreads <em>Max Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Max Threads</em>' attribute.
	 * @see #getMaxThreads()
	 * @generated
	 */
	void setMaxThreads(int value);

	/**
	 * Returns the value of the '<em><b>Remove Unmapped Diagrams</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the diagrams which were not migrated will be removed. Otherwise, only the successfully imported diagrams will be removed
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Remove Unmapped Diagrams</em>' attribute.
	 * @see #setRemoveUnmappedDiagrams(boolean)
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage#getConfig_RemoveUnmappedDiagrams()
	 * @model default="false" unique="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRemoveUnmappedDiagrams();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isRemoveUnmappedDiagrams <em>Remove Unmapped Diagrams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Remove Unmapped Diagrams</em>' attribute.
	 * @see #isRemoveUnmappedDiagrams()
	 * @generated
	 */
	void setRemoveUnmappedDiagrams(boolean value);

	/**
	 * Returns the value of the '<em><b>Convert Opaque Expression To Literal String</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the Opaque Expressions with a single body and no language (or a single empty language) will be converted to LiteralString
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Convert Opaque Expression To Literal String</em>' attribute.
	 * @see #setConvertOpaqueExpressionToLiteralString(boolean)
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage#getConfig_ConvertOpaqueExpressionToLiteralString()
	 * @model default="true" unique="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isConvertOpaqueExpressionToLiteralString();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isConvertOpaqueExpressionToLiteralString <em>Convert Opaque Expression To Literal String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Convert Opaque Expression To Literal String</em>' attribute.
	 * @see #isConvertOpaqueExpressionToLiteralString()
	 * @generated
	 */
	void setConvertOpaqueExpressionToLiteralString(boolean value);

	/**
	 * Returns the value of the '<em><b>Remove Unmapped Profiles And Stereotypes</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the unsupported RSA profiles and stereotypes will be deleted. This includes the Deployment profile and a few stereotypes
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Remove Unmapped Profiles And Stereotypes</em>' attribute.
	 * @see #setRemoveUnmappedProfilesAndStereotypes(boolean)
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage#getConfig_RemoveUnmappedProfilesAndStereotypes()
	 * @model default="true" unique="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRemoveUnmappedProfilesAndStereotypes();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isRemoveUnmappedProfilesAndStereotypes <em>Remove Unmapped Profiles And Stereotypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Remove Unmapped Profiles And Stereotypes</em>' attribute.
	 * @see #isRemoveUnmappedProfilesAndStereotypes()
	 * @generated
	 */
	void setRemoveUnmappedProfilesAndStereotypes(boolean value);

	/**
	 * Returns the value of the '<em><b>Remove Unmapped Annotations</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the unmapped RSA EAnnotations will be deleted from the imported model
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Remove Unmapped Annotations</em>' attribute.
	 * @see #setRemoveUnmappedAnnotations(boolean)
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage#getConfig_RemoveUnmappedAnnotations()
	 * @model default="false" unique="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRemoveUnmappedAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isRemoveUnmappedAnnotations <em>Remove Unmapped Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Remove Unmapped Annotations</em>' attribute.
	 * @see #isRemoveUnmappedAnnotations()
	 * @generated
	 */
	void setRemoveUnmappedAnnotations(boolean value);

	/**
	 * Returns the value of the '<em><b>Always Accept Suggested Mappings</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the Transformation will not open a dialog to ask user-confirmation for the dependency mappings. The tool will automatically keep going by "guessing" the proper mapping
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Always Accept Suggested Mappings</em>' attribute.
	 * @see #setAlwaysAcceptSuggestedMappings(boolean)
	 * @see org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersPackage#getConfig_AlwaysAcceptSuggestedMappings()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAlwaysAcceptSuggestedMappings();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config#isAlwaysAcceptSuggestedMappings <em>Always Accept Suggested Mappings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Always Accept Suggested Mappings</em>' attribute.
	 * @see #isAlwaysAcceptSuggestedMappings()
	 * @generated
	 */
	void setAlwaysAcceptSuggestedMappings(boolean value);

} // Config
