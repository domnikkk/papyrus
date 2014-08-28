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
import org.eclipse.papyrus.dd.dc.Bounds;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Image</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Image is a graphical element that defines a shape that paints an image with a given URL within given bounds.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Image#getSource <em>Source</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Image#getBounds <em>Bounds</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Image#isAspectRatioPreserved <em>Is Aspect Ratio Preserved</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends GraphicalElement {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the URL
	 * of a referenced image file. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getImage_Source()
	 * @model dataType="org.eclipse.papyrus.dd.dc.String" required="true"
	 *        ordered="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Image#getSource
	 * <em>Source</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the bounds within which the image is rendered. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(Bounds)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getImage_Bounds()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Image#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

	/**
	 * Returns the value of the '<em><b>Is Aspect Ratio Preserved</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> wether to preserve the aspect ratio of the image upon
	 * scaling, i.e. the same scale factor for width and height. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Is Aspect Ratio Preserved</em>' attribute.
	 * @see #setIsAspectRatioPreserved(boolean)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getImage_IsAspectRatioPreserved()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Boolean" required="true"
	 *        ordered="false"
	 * @generated
	 */
	boolean isAspectRatioPreserved();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Image#isAspectRatioPreserved <em>Is Aspect Ratio Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Is Aspect Ratio Preserved</em>' attribute.
	 * @see #isAspectRatioPreserved()
	 * @generated
	 */
	void setIsAspectRatioPreserved(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='source->notEmpty() implies source.size() > 0'"
	 * @generated
	 */
	boolean sourceCannotBeEmpty(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Image
