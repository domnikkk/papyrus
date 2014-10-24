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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Paint Server</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * PaintServer is the abstract super class of all paint servers, like gradients and patterns
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.PaintServer#getTransforms <em>Transform</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getPaintServer()
 * @model abstract="true"
 * @generated
 */
public interface PaintServer extends Definition {

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment
	 * reference list. The list contents are of type {@link org.eclipse.papyrus.dd.dg.Transform}. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> A set of transforms that apply
	 * to this paint server. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Transform</em>' containment reference list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getPaintServer_Transform()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transform> getTransforms();
} // PaintServer
