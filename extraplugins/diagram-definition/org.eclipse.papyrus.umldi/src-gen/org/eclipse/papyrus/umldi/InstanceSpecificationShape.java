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
 * A representation of the model object '<em><b>Instance Specification Shape</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.InstanceSpecificationShape#getSlotCompartment <em>Slot Compartment</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getInstanceSpecificationShape()
 * @model
 * @generated
 */
public interface InstanceSpecificationShape extends NamedShape {

	/**
	 * Returns the value of the '<em><b>Slot Compartment</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.SlotCompartment#getInstanceSpecificationShape
	 * <em>Instance Specification Shape</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Compartment</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Slot Compartment</em>' containment reference.
	 * @see #setSlotCompartment(SlotCompartment)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getInstanceSpecificationShape_SlotCompartment()
	 * @see org.eclipse.papyrus.umldi.SlotCompartment#getInstanceSpecificationShape
	 * @model opposite="instanceSpecificationShape" containment="true" ordered="false"
	 * @generated
	 */
	SlotCompartment getSlotCompartment();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.InstanceSpecificationShape#getSlotCompartment <em>Slot Compartment</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Slot Compartment</em>' containment reference.
	 * @see #getSlotCompartment()
	 * @generated
	 */
	void setSlotCompartment(SlotCompartment value);
} // InstanceSpecificationShape
