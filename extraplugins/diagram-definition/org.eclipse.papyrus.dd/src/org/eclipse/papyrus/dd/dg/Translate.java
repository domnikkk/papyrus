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

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Translate</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Translate is a kind of transform that translates (moves) a graphical element by a given delta along the x-y coordinate system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Translate#getDeltaX <em>Delta X</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Translate#getDeltaY <em>Delta Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getTranslate()
 * @model
 * @generated
 */
public interface Translate extends Transform {

	/**
	 * Returns the value of the '<em><b>Delta X</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number representing a translate delta along the x-axis. Both positive and
	 * negative values are allowed. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Delta X</em>' attribute.
	 * @see #setDeltaX(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getTranslate_DeltaX()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getDeltaX();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Translate#getDeltaX <em>Delta X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Delta X</em>' attribute.
	 * @see #getDeltaX()
	 * @generated
	 */
	void setDeltaX(double value);

	/**
	 * Returns the value of the '<em><b>Delta Y</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a real
	 * number representing a translate delta along the y-axis. Both positive and
	 * negative values are allowed. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Delta Y</em>' attribute.
	 * @see #setDeltaY(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getTranslate_DeltaY()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getDeltaY();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Translate#getDeltaY <em>Delta Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Delta Y</em>' attribute.
	 * @see #getDeltaY()
	 * @generated
	 */
	void setDeltaY(double value);
} // Translate
