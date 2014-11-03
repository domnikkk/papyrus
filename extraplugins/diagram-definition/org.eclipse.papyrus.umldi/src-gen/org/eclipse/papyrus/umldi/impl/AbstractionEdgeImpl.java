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
package org.eclipse.papyrus.umldi.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.papyrus.umldi.AbstractionEdge;
import org.eclipse.papyrus.umldi.UMLDIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstraction Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class AbstractionEdgeImpl extends DependencyEdgeImpl implements AbstractionEdge {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AbstractionEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLDIPackage.Literals.ABSTRACTION_EDGE;
	}
} //AbstractionEdgeImpl
