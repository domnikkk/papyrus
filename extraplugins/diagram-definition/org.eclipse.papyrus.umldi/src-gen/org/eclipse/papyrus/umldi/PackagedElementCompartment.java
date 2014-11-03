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
 * A representation of the model object '<em><b>Packaged Element Compartment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.PackagedElementCompartment#getPackageShape <em>Package Shape</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.PackagedElementCompartment#getTopUmlDiagramElement <em>Top Uml Diagram Element</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getPackagedElementCompartment()
 * @model
 * @generated
 */
public interface PackagedElementCompartment extends UmlCompartment {

	/**
	 * Returns the value of the '<em><b>Package Shape</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.PackageShape#getPackagedElementCompartment
	 * <em>Packaged Element Compartment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Shape</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Package Shape</em>' container reference.
	 * @see #setPackageShape(PackageShape)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getPackagedElementCompartment_PackageShape()
	 * @see org.eclipse.papyrus.umldi.PackageShape#getPackagedElementCompartment
	 * @model opposite="packagedElementCompartment" transient="false" ordered="false"
	 * @generated
	 */
	PackageShape getPackageShape();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.PackagedElementCompartment#getPackageShape <em>Package Shape</em>}' container
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Package Shape</em>' container reference.
	 * @see #getPackageShape()
	 * @generated
	 */
	void setPackageShape(PackageShape value);

	/**
	 * Returns the value of the '<em><b>Top Uml Diagram Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.TopUmlDiagramElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.TopUmlDiagramElement#getPackageCompartment
	 * <em>Package Compartment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Uml Diagram Element</em>' containment reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Top Uml Diagram Element</em>' containment reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getPackagedElementCompartment_TopUmlDiagramElement()
	 * @see org.eclipse.papyrus.umldi.TopUmlDiagramElement#getPackageCompartment
	 * @model opposite="packageCompartment" containment="true"
	 * @generated
	 */
	EList<TopUmlDiagramElement> getTopUmlDiagramElement();
} // PackagedElementCompartment
