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

package org.eclipse.papyrus.infra.nattable.tree;


import java.util.List;

import org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;

import ca.odell.glazedlists.TreeList;

/**
 * @author VL222926
 *
 */
public class DatumExpansionModel implements TreeList.ExpansionModel<ITreeItemAxis> {

	/**
	 * the editing domain used in the table
	 */
	private ITreeItemAxisManagerForEventList axisManager;

	/**
	 *
	 * @see ca.odell.glazedlists.TreeList.ExpansionModel#isExpanded(java.lang.Object, java.util.List)
	 *
	 * @param element
	 * @param path
	 * @return
	 */
	@Override
	public boolean isExpanded(ITreeItemAxis element, List<ITreeItemAxis> path) {
		return element.isExpanded();
	}

	/**
	 *
	 * @param axisManager
	 *            the axis manager
	 */
	public void setAxisManager(ITreeItemAxisManagerForEventList axisManager) {
		this.axisManager = axisManager;
	}

	/**
	 *
	 * @see ca.odell.glazedlists.TreeList.ExpansionModel#setExpanded(java.lang.Object, java.util.List, boolean)
	 *
	 * @param element
	 * @param path
	 * @param expanded
	 */
	@Override
	public void setExpanded(ITreeItemAxis element, List<ITreeItemAxis> path, boolean expanded) {
		if (this.axisManager != null) {
			this.axisManager.setExpanded(element, path, expanded);
		}
	}
}
