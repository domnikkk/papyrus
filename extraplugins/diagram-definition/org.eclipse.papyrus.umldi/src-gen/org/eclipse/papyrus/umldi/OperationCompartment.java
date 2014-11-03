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
 * A representation of the model object '<em><b>Operation Compartment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.OperationCompartment#getClassifierWithOperationsShape <em>Classifier With Operations Shape</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.OperationCompartment#getOperationLabel <em>Operation Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getOperationCompartment()
 * @model
 * @generated
 */
public interface OperationCompartment extends UmlCompartment {

	/**
	 * Returns the value of the '<em><b>Classifier With Operations Shape</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.ClassifierWithOperationsShape#getOperationCompartment
	 * <em>Operation Compartment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier With Operations Shape</em>' container reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Classifier With Operations Shape</em>' container reference.
	 * @see #setClassifierWithOperationsShape(ClassifierWithOperationsShape)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getOperationCompartment_ClassifierWithOperationsShape()
	 * @see org.eclipse.papyrus.umldi.ClassifierWithOperationsShape#getOperationCompartment
	 * @model opposite="operationCompartment" transient="false" ordered="false"
	 * @generated
	 */
	ClassifierWithOperationsShape getClassifierWithOperationsShape();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.OperationCompartment#getClassifierWithOperationsShape
	 * <em>Classifier With Operations Shape</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Classifier With Operations Shape</em>' container reference.
	 * @see #getClassifierWithOperationsShape()
	 * @generated
	 */
	void setClassifierWithOperationsShape(ClassifierWithOperationsShape value);

	/**
	 * Returns the value of the '<em><b>Operation Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.OperationLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.OperationLabel#getOperationCompartment
	 * <em>Operation Compartment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Label</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Operation Label</em>' containment reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getOperationCompartment_OperationLabel()
	 * @see org.eclipse.papyrus.umldi.OperationLabel#getOperationCompartment
	 * @model opposite="operationCompartment" containment="true"
	 * @generated
	 */
	EList<OperationLabel> getOperationLabel();
} // OperationCompartment
