/**
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.AxisGroup#getGroupedAxis <em>Grouped Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage#getAxisGroup()
 * @model
 * @generated
 */
public interface AxisGroup extends IAxis {
	/**
	 * Returns the value of the '<em><b>Grouped Axis</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped Axis</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Grouped Axis</em>' reference list.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage#getAxisGroup_GroupedAxis()
	 * @model
	 * @generated
	 */
	EList<IAxis> getGroupedAxis();

} // AxisGroup
