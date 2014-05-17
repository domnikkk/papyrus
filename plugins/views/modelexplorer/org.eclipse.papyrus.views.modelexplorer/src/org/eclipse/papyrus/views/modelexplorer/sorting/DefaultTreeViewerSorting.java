/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.views.modelexplorer.sorting;

import org.eclipse.ui.IWorkbenchPart;



/**
 * A default implementation (as a no-op) of the tree-viewer sorting adapter.
 */
public class DefaultTreeViewerSorting implements ITreeViewerSorting {

	public DefaultTreeViewerSorting() {
		super();
	}

	/**
	 * Obtains the tree-viewer sorting adapter for a workbench part, or a no-op default if the part provides none.
	 * 
	 * @param part
	 *        a workbench part (may be {@code null}
	 * 
	 * @return the sorting adapter (never {@code null})
	 */
	public static ITreeViewerSorting getSorting(IWorkbenchPart part) {
		ITreeViewerSorting result = null;

		if(part != null) {
			result = (ITreeViewerSorting)part.getAdapter(ITreeViewerSorting.class);
		}

		if(result == null) {
			result = new DefaultTreeViewerSorting();
		}

		return result;
	}

	public void setSorted(boolean sorted) {
		// Pass
	}

	public boolean isSorted() {
		return false;
	}
}
