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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Path Command</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> PathCommand is the abstract super type of all
 * commands that participate in specifying a path element. <!-- end-model-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.PathCommand#isRelative <em>Is Relative
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getPathCommand()
 * @model abstract="true"
 * @generated
 */
public interface PathCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Relative</b></em>' attribute. The
	 * default value is <code>"false"</code>. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> whether the coordinates
	 * specified by the command are relative to the current point (when true) or
	 * to the origin point of the coordinate system (when false). <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Is Relative</em>' attribute.
	 * @see #setIsRelative(boolean)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getPathCommand_IsRelative()
	 * @model default="false" dataType="org.eclipse.papyrus.dd.dc.Boolean"
	 *        required="true" ordered="false"
	 * @generated
	 */
	boolean isRelative();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.PathCommand#isRelative
	 * <em>Is Relative</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Is Relative</em>' attribute.
	 * @see #isRelative()
	 * @generated
	 */
	void setIsRelative(boolean value);

} // PathCommand
