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

import java.awt.Color;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Paint</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Paint#getColor <em>Color</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Paint#getPaintServer <em>Paint Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getPaint()
 * @model
 * @generated
 */
public interface Paint extends EObject {

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A solid
	 * color to use in painting. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Color)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getPaint_Color()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Color" ordered="false"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Paint#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Paint Server</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A paint
	 * server that is used in painting. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Paint Server</em>' reference.
	 * @see #setPaintServer(PaintServer)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getPaint_PaintServer()
	 * @model ordered="false"
	 * @generated
	 */
	PaintServer getPaintServer();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Paint#getPaintServer <em>Paint Server</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Paint Server</em>' reference.
	 * @see #getPaintServer()
	 * @generated
	 */
	void setPaintServer(PaintServer value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='paintServer->notEmpty() implies paintServer.id->notEmpty()'"
	 * @generated
	 */
	boolean referencedPaintServerHasId(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Paint
