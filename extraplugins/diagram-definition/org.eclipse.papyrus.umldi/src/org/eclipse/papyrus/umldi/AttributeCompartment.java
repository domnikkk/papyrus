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
 * A representation of the model object '<em><b>Attribute Compartment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.AttributeCompartment#getClassifierWithAttributesShape <em>Classifier With Attributes Shape</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.AttributeCompartment#getAttributeLabel <em>Attribute Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getAttributeCompartment()
 * @model
 * @generated
 */
public interface AttributeCompartment extends UmlCompartment {

	/**
	 * Returns the value of the '<em><b>Classifier With Attributes Shape</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.ClassifierWithAttributesShape#getAttributeCompartment
	 * <em>Attribute Compartment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier With Attributes Shape</em>' container reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Classifier With Attributes Shape</em>' container reference.
	 * @see #setClassifierWithAttributesShape(ClassifierWithAttributesShape)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getAttributeCompartment_ClassifierWithAttributesShape()
	 * @see org.eclipse.papyrus.umldi.ClassifierWithAttributesShape#getAttributeCompartment
	 * @model opposite="attributeCompartment" transient="false" ordered="false"
	 * @generated
	 */
	ClassifierWithAttributesShape getClassifierWithAttributesShape();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.AttributeCompartment#getClassifierWithAttributesShape
	 * <em>Classifier With Attributes Shape</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Classifier With Attributes Shape</em>' container reference.
	 * @see #getClassifierWithAttributesShape()
	 * @generated
	 */
	void setClassifierWithAttributesShape(ClassifierWithAttributesShape value);

	/**
	 * Returns the value of the '<em><b>Attribute Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.PropertyLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.PropertyLabel#getAttributeCompartment <em>Attribute Compartment</em>}
	 * '.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Label</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Attribute Label</em>' containment reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getAttributeCompartment_AttributeLabel()
	 * @see org.eclipse.papyrus.umldi.PropertyLabel#getAttributeCompartment
	 * @model opposite="attributeCompartment" containment="true"
	 * @generated
	 */
	EList<PropertyLabel> getAttributeLabel();
} // AttributeCompartment
