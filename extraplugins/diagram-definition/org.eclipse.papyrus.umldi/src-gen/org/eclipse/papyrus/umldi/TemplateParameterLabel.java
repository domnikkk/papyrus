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
 * A representation of the model object '<em><b>Template Parameter Label</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.TemplateParameterLabel#getTemplateParameterCompartment <em>Template Parameter Compartment</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getTemplateParameterLabel()
 * @model
 * @generated
 */
public interface TemplateParameterLabel extends NameLabel {

	/**
	 * Returns the value of the '<em><b>Template Parameter Compartment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.TemplateParameterCompartment#getTemplateParameterLabel
	 * <em>Template Parameter Label</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameter Compartment</em>' container reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Template Parameter Compartment</em>' container reference.
	 * @see #setTemplateParameterCompartment(TemplateParameterCompartment)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getTemplateParameterLabel_TemplateParameterCompartment()
	 * @see org.eclipse.papyrus.umldi.TemplateParameterCompartment#getTemplateParameterLabel
	 * @model opposite="templateParameterLabel" transient="false" ordered="false"
	 * @generated
	 */
	TemplateParameterCompartment getTemplateParameterCompartment();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.TemplateParameterLabel#getTemplateParameterCompartment
	 * <em>Template Parameter Compartment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Template Parameter Compartment</em>' container reference.
	 * @see #getTemplateParameterCompartment()
	 * @generated
	 */
	void setTemplateParameterCompartment(TemplateParameterCompartment value);
} // TemplateParameterLabel
