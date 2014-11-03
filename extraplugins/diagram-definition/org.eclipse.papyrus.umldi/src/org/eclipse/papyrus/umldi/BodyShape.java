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
 * A representation of the model object '<em><b>Body Shape</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.BodyShape#getBodyLabel <em>Body Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getBodyShape()
 * @model abstract="true"
 * @generated
 */
public interface BodyShape extends UmlShape {

	/**
	 * Returns the value of the '<em><b>Body Label</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.BodyLabel#getConstraintShape <em>Constraint Shape</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Label</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Body Label</em>' containment reference.
	 * @see #setBodyLabel(BodyLabel)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getBodyShape_BodyLabel()
	 * @see org.eclipse.papyrus.umldi.BodyLabel#getConstraintShape
	 * @model opposite="constraintShape" containment="true" ordered="false"
	 * @generated
	 */
	BodyLabel getBodyLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.BodyShape#getBodyLabel <em>Body Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Body Label</em>' containment reference.
	 * @see #getBodyLabel()
	 * @generated
	 */
	void setBodyLabel(BodyLabel value);
} // BodyShape
