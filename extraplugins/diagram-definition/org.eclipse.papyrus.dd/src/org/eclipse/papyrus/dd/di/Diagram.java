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
package org.eclipse.papyrus.dd.di;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Diagram</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Diagram is an abstract container of a graph of diagram elements. Diagrams are diagram elements with an origin point in the x-y coordinate system.
 * Their elements are laid out relative to their origin point.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.di.Diagram#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.Diagram#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.Diagram#getResolution <em>Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagram()
 * @model abstract="true"
 * @generated
 */
public interface Diagram extends Shape {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the name of the diagram.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagram_Name()
	 * @model default="" dataType="org.eclipse.papyrus.dd.dc.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.di.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *        the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute. The
	 * default value is <code>""</code>. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> the documentation of the
	 * diagram. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagram_Documentation()
	 * @model default="" dataType="org.eclipse.papyrus.dd.dc.String"
	 *        required="true" ordered="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.di.Diagram#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *        the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute. The
	 * default value is <code>"300"</code>. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> the resolution of the diagram
	 * expressed in user units per inch. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(double)
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagram_Resolution()
	 * @model default="300" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        required="true" ordered="false"
	 * @generated
	 */
	double getResolution();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.di.Diagram#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *        the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(double value);
} // Diagram
