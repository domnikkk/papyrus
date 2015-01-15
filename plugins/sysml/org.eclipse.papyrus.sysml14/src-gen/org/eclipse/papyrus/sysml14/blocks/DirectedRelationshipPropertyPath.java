/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.blocks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Relationship Property Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getBase_DirectedRelationship <em>Base Directed Relationship</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getSourcePropertyPath <em>Source Property Path</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getTargetPropertyPath <em>Target Property Path</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getSourceContext <em>Source Context</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getTargetContext <em>Target Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getDirectedRelationshipPropertyPath()
 * @model abstract="true"
 * @generated
 */
public interface DirectedRelationshipPropertyPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Directed Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Directed Relationship</em>' reference.
	 * @see #setBase_DirectedRelationship(DirectedRelationship)
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getDirectedRelationshipPropertyPath_Base_DirectedRelationship()
	 * @model ordered="false"
	 * @generated
	 */
	DirectedRelationship getBase_DirectedRelationship();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getBase_DirectedRelationship <em>Base Directed Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Directed Relationship</em>' reference.
	 * @see #getBase_DirectedRelationship()
	 * @generated
	 */
	void setBase_DirectedRelationship(DirectedRelationship value);

	/**
	 * Returns the value of the '<em><b>Source Property Path</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Property Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Property Path</em>' reference list.
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getDirectedRelationshipPropertyPath_SourcePropertyPath()
	 * @model
	 * @generated
	 */
	EList<Property> getSourcePropertyPath();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getSourcePropertyPath()
	 * @generated
	 */
	Property getSourcePropertyPath(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Source Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getSourcePropertyPath()
	 * @generated
	 */
	Property getSourcePropertyPath(String name, Type type, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Target Property Path</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Property Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property Path</em>' reference list.
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getDirectedRelationshipPropertyPath_TargetPropertyPath()
	 * @model
	 * @generated
	 */
	EList<Property> getTargetPropertyPath();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getTargetPropertyPath()
	 * @generated
	 */
	Property getTargetPropertyPath(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Target Property Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getTargetPropertyPath()
	 * @generated
	 */
	Property getTargetPropertyPath(String name, Type type, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Source Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Context</em>' reference.
	 * @see #setSourceContext(Classifier)
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getDirectedRelationshipPropertyPath_SourceContext()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getSourceContext();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getSourceContext <em>Source Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Context</em>' reference.
	 * @see #getSourceContext()
	 * @generated
	 */
	void setSourceContext(Classifier value);

	/**
	 * Returns the value of the '<em><b>Target Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Context</em>' reference.
	 * @see #setTargetContext(Classifier)
	 * @see org.eclipse.papyrus.sysml14.blocks.BlocksPackage#getDirectedRelationshipPropertyPath_TargetContext()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getTargetContext();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath#getTargetContext <em>Target Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Context</em>' reference.
	 * @see #getTargetContext()
	 * @generated
	 */
	void setTargetContext(Classifier value);

} // DirectedRelationshipPropertyPath
