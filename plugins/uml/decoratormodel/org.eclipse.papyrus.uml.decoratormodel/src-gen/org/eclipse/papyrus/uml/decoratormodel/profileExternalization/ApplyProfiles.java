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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Profile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Profiles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * base_Dependency.supplier->forAll(oclIsKindOf(uml::Package))
 * base_Dependency.client->forAll(oclIsKindOf(uml::Package))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles#getBase_Dependency <em>Base Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ProfileExternalizationPackage#getApplyProfiles()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='suppliers_are_packages clients_are_packages'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL suppliers_are_packages='base_Dependency.supplier->forAll(oclIsKindOf(uml::Package))' clients_are_packages='base_Dependency.client->forAll(oclIsKindOf(uml::Package))'"
 * @generated
 */
public interface ApplyProfiles extends EObject
{
	/**
	 * Returns the value of the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Dependency</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Dependency</em>' reference.
	 * @see #setBase_Dependency(Dependency)
	 * @see org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ProfileExternalizationPackage#getApplyProfiles_Base_Dependency()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='extension_ApplyProfiles'"
	 * @generated
	 */
	Dependency getBase_Dependency();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles#getBase_Dependency <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Dependency</em>' reference.
	 * @see #getBase_Dependency()
	 * @generated
	 */
	void setBase_Dependency(Dependency value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Profile> getAppliedProfiles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Package> getExternalizedAppliedProfilePackages();

} // ApplyProfiles
