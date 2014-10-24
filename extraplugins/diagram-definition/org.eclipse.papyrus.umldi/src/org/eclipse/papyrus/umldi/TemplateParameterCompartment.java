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
 * A representation of the model object '<em><b>Template Parameter Compartment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.TemplateParameterCompartment#getTemplateParameterLabel <em>Template Parameter Label</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.TemplateParameterCompartment#getTemplateableElementShape <em>Templateable Element Shape</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getTemplateParameterCompartment()
 * @model
 * @generated
 */
public interface TemplateParameterCompartment extends UmlCompartment {

	/**
	 * Returns the value of the '<em><b>Template Parameter Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.TemplateParameterLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.TemplateParameterLabel#getTemplateParameterCompartment
	 * <em>Template Parameter Compartment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameter Label</em>' containment reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Template Parameter Label</em>' containment reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getTemplateParameterCompartment_TemplateParameterLabel()
	 * @see org.eclipse.papyrus.umldi.TemplateParameterLabel#getTemplateParameterCompartment
	 * @model opposite="templateParameterCompartment" containment="true" ordered="false"
	 * @generated
	 */
	EList<TemplateParameterLabel> getTemplateParameterLabel();

	/**
	 * Returns the value of the '<em><b>Templateable Element Shape</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.TemplateableElementShape#getTemplateParameterCompartment
	 * <em>Template Parameter Compartment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templateable Element Shape</em>' container reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Templateable Element Shape</em>' container reference.
	 * @see #setTemplateableElementShape(TemplateableElementShape)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getTemplateParameterCompartment_TemplateableElementShape()
	 * @see org.eclipse.papyrus.umldi.TemplateableElementShape#getTemplateParameterCompartment
	 * @model opposite="templateParameterCompartment" transient="false" ordered="false"
	 * @generated
	 */
	TemplateableElementShape getTemplateableElementShape();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.TemplateParameterCompartment#getTemplateableElementShape
	 * <em>Templateable Element Shape</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Templateable Element Shape</em>' container reference.
	 * @see #getTemplateableElementShape()
	 * @generated
	 */
	void setTemplateableElementShape(TemplateableElementShape value);
} // TemplateParameterCompartment
