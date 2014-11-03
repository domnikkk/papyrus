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
 * A representation of the model object '<em><b>Named Shape</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.NamedShape#getNameLabel <em>Name Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getNamedShape()
 * @model abstract="true"
 * @generated
 */
public interface NamedShape extends UmlShape {

	/**
	 * Returns the value of the '<em><b>Name Label</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.NameLabel#getNamedElementShape <em>Named Element Shape</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Label</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name Label</em>' containment reference.
	 * @see #setNameLabel(NameLabel)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getNamedShape_NameLabel()
	 * @see org.eclipse.papyrus.umldi.NameLabel#getNamedElementShape
	 * @model opposite="namedElementShape" containment="true" ordered="false"
	 * @generated
	 */
	NameLabel getNameLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.NamedShape#getNameLabel <em>Name Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Name Label</em>' containment reference.
	 * @see #getNameLabel()
	 * @generated
	 */
	void setNameLabel(NameLabel value);
} // NamedShape
