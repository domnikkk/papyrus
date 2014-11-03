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
 * A representation of the model object '<em><b>Instance Specification Edge</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.InstanceSpecificationEdge#getEndRoleLabel <em>End Role Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getInstanceSpecificationEdge()
 * @model
 * @generated
 */
public interface InstanceSpecificationEdge extends NamedEdge {

	/**
	 * Returns the value of the '<em><b>End Role Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.RoleLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.RoleLabel#getInstanceSpecificationEdge
	 * <em>Instance Specification Edge</em>}'.
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
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getInstanceSpecificationEdge_EndRoleLabel()
	 * @see org.eclipse.papyrus.umldi.RoleLabel#getInstanceSpecificationEdge
	 * @model opposite="instanceSpecificationEdge" containment="true" upper="2"
	 * @generated
	 */
	EList<RoleLabel> getEndRoleLabel();
} // InstanceSpecificationEdge
