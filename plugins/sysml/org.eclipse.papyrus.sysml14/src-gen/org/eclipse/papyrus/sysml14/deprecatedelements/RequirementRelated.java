/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.deprecatedelements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.sysml14.requirements.Requirement;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Related</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This stereotype is used to add properties to those elements that are related to requirements via the various dependencies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getTracedFrom <em>Traced From</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getSatisfies <em>Satisfies</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getRefines <em>Refines</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getVerifies <em>Verifies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#getRequirementRelated()
 * @model
 * @generated
 */
public interface RequirementRelated extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Named Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Named Element</em>' reference.
	 * @see #setBase_NamedElement(NamedElement)
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#getRequirementRelated_Base_NamedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.RequirementRelated#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Traced From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.sysml14.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived from all requirements that are the supplier of a «trace» relationship for which this element is a client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traced From</em>' reference list.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#getRequirementRelated_TracedFrom()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getTracedFrom();

	/**
	 * Returns the value of the '<em><b>Satisfies</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.sysml14.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived from all requirements that are the supplier of a «satisfy» relationship for which this element is a client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfies</em>' reference list.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#getRequirementRelated_Satisfies()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getSatisfies();

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.sysml14.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived from all requirements that are the supplier of a «refine» relationship for which this element is a client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refines</em>' reference list.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#getRequirementRelated_Refines()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getRefines();

	/**
	 * Returns the value of the '<em><b>Verifies</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.sysml14.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived from all requirements that are the supplier of a «verify» relationship for which this element is a client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verifies</em>' reference list.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#getRequirementRelated_Verifies()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getVerifies();

} // RequirementRelated
