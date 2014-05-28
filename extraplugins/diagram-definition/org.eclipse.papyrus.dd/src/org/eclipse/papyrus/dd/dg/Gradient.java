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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Gradient</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> Gradient is a kind of paint server that serves a
 * continuously smooth color transition along the gradient range from one color
 * to the next. <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Gradient#getStop <em>Stop</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGradient()
 * @model abstract="true"
 * @generated
 */
public interface Gradient extends PaintServer {
	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.eclipse.papyrus.dd.dg.GradientStop}. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> a list of two or more
	 * gradient stops defining the color transitions of the gradient. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Stop</em>' containment reference list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGradient_Stop()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<GradientStop> getStop();

} // Gradient
