/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.timing;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.PrecedenceConstraint#getPreceding <em>Preceding</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.PrecedenceConstraint#getSuccessive <em>Successive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.timing.TimingPackage#getPrecedenceConstraint()
 * @model
 * @generated
 */
public interface PrecedenceConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Preceding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preceding</em>' containment reference.
	 * @see #setPreceding(PrecedenceConstraint_precedingInstanceRef)
	 * @see org.eclipse.papyrus.eastadl.timing.TimingPackage#getPrecedenceConstraint_Preceding()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PrecedenceConstraint_precedingInstanceRef getPreceding();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.timing.PrecedenceConstraint#getPreceding <em>Preceding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preceding</em>' containment reference.
	 * @see #getPreceding()
	 * @generated
	 */
	void setPreceding(PrecedenceConstraint_precedingInstanceRef value);

	/**
	 * Returns the value of the '<em><b>Successive</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successive</em>' containment reference list.
	 * @see org.eclipse.papyrus.eastadl.timing.TimingPackage#getPrecedenceConstraint_Successive()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<PrecedenceConstraint_successiveInstanceRef> getSuccessive();

} // PrecedenceConstraint
