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
 * A representation of the model object '<em><b>Name Label</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.NameLabel#getNamedElementEdge <em>Named Element Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.NameLabel#getNamedElementShape <em>Named Element Shape</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getNameLabel()
 * @model
 * @generated
 */
public interface NameLabel extends UmlLabel {

	/**
	 * Returns the value of the '<em><b>Named Element Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.NamedEdge#getNameLabel <em>Name Label</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Element Edge</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Named Element Edge</em>' container reference.
	 * @see #setNamedElementEdge(NamedEdge)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getNameLabel_NamedElementEdge()
	 * @see org.eclipse.papyrus.umldi.NamedEdge#getNameLabel
	 * @model opposite="nameLabel" transient="false" ordered="false"
	 * @generated
	 */
	NamedEdge getNamedElementEdge();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.NameLabel#getNamedElementEdge <em>Named Element Edge</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Named Element Edge</em>' container reference.
	 * @see #getNamedElementEdge()
	 * @generated
	 */
	void setNamedElementEdge(NamedEdge value);

	/**
	 * Returns the value of the '<em><b>Named Element Shape</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.NamedShape#getNameLabel <em>Name Label</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Element Shape</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Named Element Shape</em>' container reference.
	 * @see #setNamedElementShape(NamedShape)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getNameLabel_NamedElementShape()
	 * @see org.eclipse.papyrus.umldi.NamedShape#getNameLabel
	 * @model opposite="nameLabel" transient="false" ordered="false"
	 * @generated
	 */
	NamedShape getNamedElementShape();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.NameLabel#getNamedElementShape <em>Named Element Shape</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Named Element Shape</em>' container reference.
	 * @see #getNamedElementShape()
	 * @generated
	 */
	void setNamedElementShape(NamedShape value);
} // NameLabel
