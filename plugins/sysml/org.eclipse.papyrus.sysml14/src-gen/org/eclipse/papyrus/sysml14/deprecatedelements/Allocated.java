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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * «allocated» is a stereotype that applies to any NamedElement that has at least one allocation relationship with another NamedElement. «allocated» elements may be designated by either the /from or /to end of an «allocate» dependency. The «allocated» stereotype provides a mechanism for a particular model element to conveniently retain and display the element at the opposite end of any «allocate» dependency. This stereotype provides for the properties “allocatedFrom” and “allocatedTo,” which are derived from the «allocate» dependency.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.Allocated#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.Allocated#getAllocatedFrom <em>Allocated From</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.deprecatedelements.Allocated#getAllocatedTo <em>Allocated To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#getAllocated()
 * @model
 * @generated
 */
public interface Allocated extends EObject {
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
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#getAllocated_Base_NamedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.deprecatedelements.Allocated#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Allocated From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reverse of allocatedTo: the element types and names of the set of elements that are clients (from) of an «allocate» whose supplier is extended by this stereotype (instance). The same characteristics apply as to /allocatedTo. Each allocatedFrom property will be expressed as «elementType» ElementName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocated From</em>' reference list.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#getAllocated_AllocatedFrom()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getAllocatedFrom();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Allocated From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getAllocatedFrom()
	 * @generated
	 */
	NamedElement getAllocatedFrom(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Allocated From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getAllocatedFrom()
	 * @generated
	 */
	NamedElement getAllocatedFrom(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Allocated To</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element types and names of the set of elements that are suppliers (“to” end of the concrete syntax) of an «allocate» whose client is extended by this stereotype (instance). This property is the union of all suppliers to which this instance is the client, i.e., there may be more than one /allocatedTo property per allocated model element. Each allocatedTo property will be expressed as «elementType» ElementName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocated To</em>' reference list.
	 * @see org.eclipse.papyrus.sysml14.deprecatedelements.DeprecatedelementsPackage#getAllocated_AllocatedTo()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getAllocatedTo();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Allocated To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getAllocatedTo()
	 * @generated
	 */
	NamedElement getAllocatedTo(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Allocated To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getAllocatedTo()
	 * @generated
	 */
	NamedElement getAllocatedTo(String name, boolean ignoreCase, EClass eClass);

} // Allocated
