/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.wizard;

import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdTreeItemAxis;
import org.eclipse.papyrus.infra.tools.util.TypeUtils;

/**
 * @author VL222926
 *
 *         This class is not in the API
 */
public class CategoriesWizardUtils {

	/**
	 * Constructor.
	 *
	 */
	private CategoriesWizardUtils() {
		// to prevent instanciation
	}

	/**
	 *
	 * @param axis
	 *            an axis
	 * @return
	 *         <code>true</code> if the axis represents a root element
	 */
	public static final boolean isRootItem(ITreeItemAxis axis) {
		return axis.getParent() == null;
	}

	/**
	 *
	 * @param axis
	 *            an axis
	 * @return
	 *         <code>true</code> if the axis represents a depth
	 */
	public static final boolean isDepthItem(ITreeItemAxis axis) {
		if (axis instanceof IdTreeItemAxis) {
			String element = ((IdTreeItemAxis) axis).getElement();
			return TypeUtils.isIntegerValue(element);
		}
		return false;
	}

	/**
	 * @param axis
	 * @returnplugins/infra/nattable/org.eclipse.papyrus.infra.nattable/src/org/eclipse/papyrus/infra/nattable/wizard/CategoriesWizardUtils.java
	 *                                                                                                                                           <code>true</code> if the axis represents a category item
	 */
	public static boolean isCategoryItem(ITreeItemAxis axis) {
		return !(isDepthItem(axis) || isRootItem(axis));
	}

}
