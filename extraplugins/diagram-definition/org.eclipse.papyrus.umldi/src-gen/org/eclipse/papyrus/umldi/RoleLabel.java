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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Label</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.RoleLabel#getAssociationEdge <em>Association Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.RoleLabel#getInstanceSpecificationEdge <em>Instance Specification Edge</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getRoleLabel()
 * @model
 * @generated
 */
public interface RoleLabel extends NameLabel {

	/**
	 * Returns the value of the '<em><b>Association Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.AssociationEdge#getEndRoleLabel <em>End Role Label</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Edge</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Association Edge</em>' container reference.
	 * @see #setAssociationEdge(AssociationEdge)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getRoleLabel_AssociationEdge()
	 * @see org.eclipse.papyrus.umldi.AssociationEdge#getEndRoleLabel
	 * @model opposite="endRoleLabel" transient="false" ordered="false"
	 * @generated
	 */
	AssociationEdge getAssociationEdge();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.RoleLabel#getAssociationEdge <em>Association Edge</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Association Edge</em>' container reference.
	 * @see #getAssociationEdge()
	 * @generated
	 */
	void setAssociationEdge(AssociationEdge value);

	/**
	 * Returns the value of the '<em><b>Instance Specification Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.InstanceSpecificationEdge#getEndRoleLabel <em>End Role Label</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Specification Edge</em>' container reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instance Specification Edge</em>' container reference.
	 * @see #setInstanceSpecificationEdge(InstanceSpecificationEdge)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getRoleLabel_InstanceSpecificationEdge()
	 * @see org.eclipse.papyrus.umldi.InstanceSpecificationEdge#getEndRoleLabel
	 * @model opposite="endRoleLabel" transient="false" ordered="false"
	 * @generated
	 */
	InstanceSpecificationEdge getInstanceSpecificationEdge();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.RoleLabel#getInstanceSpecificationEdge <em>Instance Specification Edge</em>}' container
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Instance Specification Edge</em>' container reference.
	 * @see #getInstanceSpecificationEdge()
	 * @generated
	 */
	void setInstanceSpecificationEdge(InstanceSpecificationEdge value);
} // RoleLabel
