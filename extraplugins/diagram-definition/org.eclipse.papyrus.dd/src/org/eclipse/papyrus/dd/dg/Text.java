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
package org.eclipse.papyrus.dd.dg;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.papyrus.dd.dc.Point;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Text</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Text is a graphical element that defines a shape that renders a character string at a given position.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Text#getData <em>Data</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Text#getPosition <em>Position</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Text#getAnchor <em>Anchor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getText()
 * @model
 * @generated
 */
public interface Text extends GraphicalElement {

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the
	 * text as a string of characters. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getText_Data()
	 * @model dataType="org.eclipse.papyrus.dd.dc.String" required="true"
	 *        ordered="false"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Text#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> the bounds inside which the text is rendered
	 * (possibly wrapped into multiple lines) <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getText_Position()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Text#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.dd.dg.TextAnchor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Anchor</em>' attribute.
	 * @see org.eclipse.papyrus.dd.dg.TextAnchor
	 * @see #setAnchor(TextAnchor)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getText_Anchor()
	 * @model ordered="false"
	 * @generated
	 */
	TextAnchor getAnchor();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Text#getAnchor <em>Anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Anchor</em>' attribute.
	 * @see org.eclipse.papyrus.dd.dg.TextAnchor
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(TextAnchor value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='data->notEmpty() implies data.size() > 0'"
	 * @generated
	 */
	boolean dataCannotBeEmpty(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Text
