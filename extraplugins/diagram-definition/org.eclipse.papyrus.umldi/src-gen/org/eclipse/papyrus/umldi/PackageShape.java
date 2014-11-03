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
 * A representation of the model object '<em><b>Package Shape</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.PackageShape#getPackagedElementCompartment <em>Packaged Element Compartment</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getPackageShape()
 * @model
 * @generated
 */
public interface PackageShape extends TemplateableElementShape {

	/**
	 * Returns the value of the '<em><b>Packaged Element Compartment</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.PackagedElementCompartment#getPackageShape <em>Package Shape</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaged Element Compartment</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Packaged Element Compartment</em>' containment reference.
	 * @see #setPackagedElementCompartment(PackagedElementCompartment)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getPackageShape_PackagedElementCompartment()
	 * @see org.eclipse.papyrus.umldi.PackagedElementCompartment#getPackageShape
	 * @model opposite="packageShape" containment="true" ordered="false"
	 * @generated
	 */
	PackagedElementCompartment getPackagedElementCompartment();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.PackageShape#getPackagedElementCompartment <em>Packaged Element Compartment</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Packaged Element Compartment</em>' containment reference.
	 * @see #getPackagedElementCompartment()
	 * @generated
	 */
	void setPackagedElementCompartment(PackagedElementCompartment value);
} // PackageShape
