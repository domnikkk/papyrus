/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.default_;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.ElementImport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.default_.MarkingImport#getBase_ElementImport <em>Base Element Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.migration.rsa.default_.DefaultPackage#getMarkingImport()
 * @model
 * @generated
 */
public interface MarkingImport extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Element Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Element Import</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Element Import</em>' reference.
	 * @see #setBase_ElementImport(ElementImport)
	 * @see org.eclipse.papyrus.migration.rsa.default_.DefaultPackage#getMarkingImport_Base_ElementImport()
	 * @model required="true"
	 * @generated
	 */
	ElementImport getBase_ElementImport();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.default_.MarkingImport#getBase_ElementImport <em>Base Element Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Element Import</em>' reference.
	 * @see #getBase_ElementImport()
	 * @generated
	 */
	void setBase_ElementImport(ElementImport value);

} // MarkingImport
