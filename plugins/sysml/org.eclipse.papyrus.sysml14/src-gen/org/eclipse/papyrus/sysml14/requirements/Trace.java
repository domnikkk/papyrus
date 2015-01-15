/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.requirements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.papyrus.sysml14.requirements.RequirementsPackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends DirectedRelationshipPropertyPath, org.eclipse.uml2.uml.profile.standard.Trace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" refRequired="true" refOrdered="false"
	 * @generated
	 */
	EList<Requirement> getTracedFrom(NamedElement ref);

} // Trace
