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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.papyrus.dd.di.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Style</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The most general class for Styles in UML.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.UmlStyle#getFontName <em>Font Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.UmlStyle#getFontSize <em>Font Size</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlStyle()
 * @model
 * @generated
 */
public interface UmlStyle extends Style {

	/**
	 * Returns the value of the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of a font used to render strings.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Font Name</em>' attribute.
	 * @see #setFontName(String)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlStyle_FontName()
	 * @model dataType="org.eclipse.papyrus.dd.dc.String" ordered="false"
	 * @generated
	 */
	String getFontName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.UmlStyle#getFontName <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Font Name</em>' attribute.
	 * @see #getFontName()
	 * @generated
	 */
	void setFontName(String value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size of a font for rendering strings, given in typographical points.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(double)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlStyle_FontSize()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" ordered="false"
	 * @generated
	 */
	double getFontSize();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.UmlStyle#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * fontSize must be greater than zero.
	 * 
	 * @param diagnostics
	 *        The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *        The cache of context-specific information.
	 *        <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='fontSize > 0'"
	 * @generated
	 */
	boolean fontsizePositive(DiagnosticChain diagnostics, Map<Object, Object> context);
} // UmlStyle
