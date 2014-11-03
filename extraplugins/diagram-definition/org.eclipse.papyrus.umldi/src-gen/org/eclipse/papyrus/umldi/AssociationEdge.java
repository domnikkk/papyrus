/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.umldi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Edge</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.AssociationEdge#getEndMultiplicityLabel <em>End Multiplicity Label</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.AssociationEdge#getEndModifierLabel <em>End Modifier Label</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.AssociationEdge#getEndRoleLabel <em>End Role Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getAssociationEdge()
 * @model
 * @generated
 */
public interface AssociationEdge extends NamedEdge {

	/**
	 * Returns the value of the '<em><b>End Multiplicity Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.MultiplicityLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.MultiplicityLabel#getAssociationEdge <em>Association Edge</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Multiplicity Label</em>' containment reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End Multiplicity Label</em>' containment reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getAssociationEdge_EndMultiplicityLabel()
	 * @see org.eclipse.papyrus.umldi.MultiplicityLabel#getAssociationEdge
	 * @model opposite="associationEdge" containment="true" upper="2" ordered="false"
	 * @generated
	 */
	EList<MultiplicityLabel> getEndMultiplicityLabel();

	/**
	 * Returns the value of the '<em><b>End Modifier Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.ModifierLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.ModifierLabel#getAssociationEdge <em>Association Edge</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Modifier Label</em>' containment reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End Modifier Label</em>' containment reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getAssociationEdge_EndModifierLabel()
	 * @see org.eclipse.papyrus.umldi.ModifierLabel#getAssociationEdge
	 * @model opposite="associationEdge" containment="true" upper="2" ordered="false"
	 * @generated
	 */
	EList<ModifierLabel> getEndModifierLabel();

	/**
	 * Returns the value of the '<em><b>End Role Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.RoleLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.RoleLabel#getAssociationEdge <em>Association Edge</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Role Label</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End Role Label</em>' containment reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getAssociationEdge_EndRoleLabel()
	 * @see org.eclipse.papyrus.umldi.RoleLabel#getAssociationEdge
	 * @model opposite="associationEdge" containment="true" upper="2" ordered="false"
	 * @generated
	 */
	EList<RoleLabel> getEndRoleLabel();
} // AssociationEdge
