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
package org.eclipse.papyrus.eastadl.annex.needs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.structure.systemmodeling.SystemModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architectural Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A view may consist of one or more architectural models. Each such architectural model is developed using the methods established by its associated architectural viewpoint. An architectural model may participate in more than one view. [IEEE 1471]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.needs.ArchitecturalModel#getIsConceptFor <em>Is Concept For</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.annex.needs.NeedsPackage#getArchitecturalModel()
 * @model
 * @generated
 */
public interface ArchitecturalModel extends Concept {

	/**
	 * Returns the value of the '<em><b>Is Concept For</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.structure.systemmodeling.SystemModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Concept For</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Is Concept For</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.annex.needs.NeedsPackage#getArchitecturalModel_IsConceptFor()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SystemModel> getIsConceptFor();
} // ArchitecturalModel
