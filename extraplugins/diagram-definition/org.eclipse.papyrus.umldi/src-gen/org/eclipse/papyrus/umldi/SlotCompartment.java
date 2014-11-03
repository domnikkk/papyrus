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
 * A representation of the model object '<em><b>Slot Compartment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.SlotCompartment#getSlotLabel <em>Slot Label</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.SlotCompartment#getInstanceSpecificationShape <em>Instance Specification Shape</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getSlotCompartment()
 * @model
 * @generated
 */
public interface SlotCompartment extends UmlCompartment {

	/**
	 * Returns the value of the '<em><b>Slot Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.SlotLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.SlotLabel#getSlotCompartment <em>Slot Compartment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Label</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Slot Label</em>' containment reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getSlotCompartment_SlotLabel()
	 * @see org.eclipse.papyrus.umldi.SlotLabel#getSlotCompartment
	 * @model opposite="slotCompartment" containment="true"
	 * @generated
	 */
	EList<SlotLabel> getSlotLabel();

	/**
	 * Returns the value of the '<em><b>Instance Specification Shape</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.InstanceSpecificationShape#getSlotCompartment
	 * <em>Slot Compartment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Specification Shape</em>' container reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instance Specification Shape</em>' container reference.
	 * @see #setInstanceSpecificationShape(InstanceSpecificationShape)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getSlotCompartment_InstanceSpecificationShape()
	 * @see org.eclipse.papyrus.umldi.InstanceSpecificationShape#getSlotCompartment
	 * @model opposite="slotCompartment" transient="false" ordered="false"
	 * @generated
	 */
	InstanceSpecificationShape getInstanceSpecificationShape();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.SlotCompartment#getInstanceSpecificationShape <em>Instance Specification Shape</em>}'
	 * container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Instance Specification Shape</em>' container reference.
	 * @see #getInstanceSpecificationShape()
	 * @generated
	 */
	void setInstanceSpecificationShape(InstanceSpecificationShape value);
} // SlotCompartment
