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
 * A representation of the model object '<em><b>Literal Compartment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.LiteralCompartment#getEnumerationShape <em>Enumeration Shape</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.LiteralCompartment#getLiteralLabel <em>Literal Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getLiteralCompartment()
 * @model
 * @generated
 */
public interface LiteralCompartment extends UmlCompartment {

	/**
	 * Returns the value of the '<em><b>Enumeration Shape</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.EnumerationShape#getLiteralCompartment <em>Literal Compartment</em>}
	 * '.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Shape</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Enumeration Shape</em>' container reference.
	 * @see #setEnumerationShape(EnumerationShape)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getLiteralCompartment_EnumerationShape()
	 * @see org.eclipse.papyrus.umldi.EnumerationShape#getLiteralCompartment
	 * @model opposite="literalCompartment" transient="false" ordered="false"
	 * @generated
	 */
	EnumerationShape getEnumerationShape();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.LiteralCompartment#getEnumerationShape <em>Enumeration Shape</em>}' container
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Enumeration Shape</em>' container reference.
	 * @see #getEnumerationShape()
	 * @generated
	 */
	void setEnumerationShape(EnumerationShape value);

	/**
	 * Returns the value of the '<em><b>Literal Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.LiteralLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.LiteralLabel#getLiteralCompartment <em>Literal Compartment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Label</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Literal Label</em>' containment reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getLiteralCompartment_LiteralLabel()
	 * @see org.eclipse.papyrus.umldi.LiteralLabel#getLiteralCompartment
	 * @model opposite="literalCompartment" containment="true"
	 * @generated
	 */
	EList<LiteralLabel> getLiteralLabel();
} // LiteralCompartment
