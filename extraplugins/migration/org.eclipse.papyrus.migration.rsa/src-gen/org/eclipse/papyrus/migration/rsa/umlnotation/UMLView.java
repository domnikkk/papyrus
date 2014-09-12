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
package org.eclipse.papyrus.migration.rsa.umlnotation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getShowStereotype <em>Show Stereotype</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getShowListVisibility <em>Show List Visibility</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#isShowListSignature <em>Show List Signature</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getAlignment <em>Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage#getUMLView()
 * @model abstract="true"
 * @generated
 */
public interface UMLView extends EObject, View {
	/**
	 * Returns the value of the '<em><b>Show Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Stereotype</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Show Stereotype</em>' attribute.
	 * @see #setShowStereotype(String)
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage#getUMLView_ShowStereotype()
	 * @model
	 * @generated
	 */
	String getShowStereotype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getShowStereotype <em>Show Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Show Stereotype</em>' attribute.
	 * @see #getShowStereotype()
	 * @generated
	 */
	void setShowStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Show List Visibility</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show List Visibility</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Show List Visibility</em>' attribute.
	 * @see #setShowListVisibility(String)
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage#getUMLView_ShowListVisibility()
	 * @model default="None"
	 * @generated
	 */
	String getShowListVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getShowListVisibility <em>Show List Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Show List Visibility</em>' attribute.
	 * @see #getShowListVisibility()
	 * @generated
	 */
	void setShowListVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Show List Signature</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show List Signature</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Show List Signature</em>' attribute.
	 * @see #setShowListSignature(boolean)
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage#getUMLView_ShowListSignature()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowListSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#isShowListSignature <em>Show List Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Show List Signature</em>' attribute.
	 * @see #isShowListSignature()
	 * @generated
	 */
	void setShowListSignature(boolean value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see #setAlignment(String)
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage#getUMLView_Alignment()
	 * @model
	 * @generated
	 */
	String getAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Alignment</em>' attribute.
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(String value);

} // UMLView
