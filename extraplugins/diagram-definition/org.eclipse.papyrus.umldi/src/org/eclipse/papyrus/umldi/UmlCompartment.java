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

import org.eclipse.papyrus.dd.di.Shape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.UmlCompartment#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlCompartment()
 * @model
 * @generated
 */
public interface UmlCompartment extends UmlDiagramElement, Shape {

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.umldi.UmlCompartmentKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.papyrus.umldi.UmlCompartmentKind
	 * @see #setKind(UmlCompartmentKind)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlCompartment_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UmlCompartmentKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.UmlCompartment#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *        the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.papyrus.umldi.UmlCompartmentKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(UmlCompartmentKind value);
} // UmlCompartment
