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
 * A representation of the model object '<em><b>Classifier Shape</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.ClassifierShape#isIcon <em>Is Icon</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getClassifierShape()
 * @model abstract="true"
 * @generated
 */
public interface ClassifierShape extends TemplateableElementShape {

	/**
	 * Returns the value of the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Icon</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Is Icon</em>' attribute.
	 * @see #setIsIcon(boolean)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getClassifierShape_IsIcon()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.ClassifierShape#isIcon <em>Is Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Is Icon</em>' attribute.
	 * @see #isIcon()
	 * @generated
	 */
	void setIsIcon(boolean value);
} // ClassifierShape
