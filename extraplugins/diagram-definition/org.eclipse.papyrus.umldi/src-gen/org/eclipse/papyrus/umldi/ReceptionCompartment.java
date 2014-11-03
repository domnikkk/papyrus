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
 * A representation of the model object '<em><b>Reception Compartment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.ReceptionCompartment#getSignalShape <em>Signal Shape</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.ReceptionCompartment#getReceptionLabel <em>Reception Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getReceptionCompartment()
 * @model
 * @generated
 */
public interface ReceptionCompartment extends UmlCompartment {

	/**
	 * Returns the value of the '<em><b>Signal Shape</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.ClassifierWithReceptionsShape#getReceptionCompartment
	 * <em>Reception Compartment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Shape</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signal Shape</em>' container reference.
	 * @see #setSignalShape(ClassifierWithReceptionsShape)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getReceptionCompartment_SignalShape()
	 * @see org.eclipse.papyrus.umldi.ClassifierWithReceptionsShape#getReceptionCompartment
	 * @model opposite="receptionCompartment" transient="false" ordered="false"
	 * @generated
	 */
	ClassifierWithReceptionsShape getSignalShape();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.ReceptionCompartment#getSignalShape <em>Signal Shape</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Signal Shape</em>' container reference.
	 * @see #getSignalShape()
	 * @generated
	 */
	void setSignalShape(ClassifierWithReceptionsShape value);

	/**
	 * Returns the value of the '<em><b>Reception Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.ReceptionLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.ReceptionLabel#getReceptionCompartment
	 * <em>Reception Compartment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reception Label</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reception Label</em>' containment reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getReceptionCompartment_ReceptionLabel()
	 * @see org.eclipse.papyrus.umldi.ReceptionLabel#getReceptionCompartment
	 * @model opposite="receptionCompartment" containment="true"
	 * @generated
	 */
	EList<ReceptionLabel> getReceptionLabel();
} // ReceptionCompartment
