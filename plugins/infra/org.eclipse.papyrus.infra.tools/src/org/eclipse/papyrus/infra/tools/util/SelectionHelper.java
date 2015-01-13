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

package org.eclipse.papyrus.infra.tools.util;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * @author VL222926
 *
 */
public class SelectionHelper {

	/**
	 * Constructor.
	 *
	 */
	private SelectionHelper() {
		// to avoid instanciation
	}

	/**
	 * 
	 * @return
	 *         the selection service or <code>null</code> if not found
	 * 
	 */
	public static final ISelectionService getSelectionService() {
		IWorkbench wb = PlatformUI.getWorkbench();
		if (wb != null) {
			// don't work
			// ISelectionService s1 = (ISelectionService) wb.getService(ISelectionService.class);
			IWorkbenchWindow ww = wb.getActiveWorkbenchWindow();
			if (ww != null) {
				return (ISelectionService) ww.getService(ISelectionService.class);
			}
		}
		return null;
	}

	/**
	 * 
	 * @return
	 *         the current selection or an empty selection. can't be <code>null</code>
	 */
	public static final ISelection getCurrentSelection() {
		ISelectionService selectionService = getSelectionService();
		if (selectionService != null) {
			ISelection currentSelection = selectionService.getSelection();
			if (currentSelection != null) {
				return currentSelection;
			}
		}
		return StructuredSelection.EMPTY;
	}

	/**
	 * 
	 * @param viewId
	 *            the id of the view for which we want the selection
	 * @return
	 *         the current selection for the view, the returned value can't be <code>null</code>
	 */
	public static final ISelection getCurrentSelection(String viewId) {
		ISelectionService selectionService = getSelectionService();
		if (selectionService != null) {
			ISelection currentSelection = selectionService.getSelection(viewId);
			if (currentSelection != null) {
				return currentSelection;
			}
		}
		return StructuredSelection.EMPTY;
	}

	/**
	 * 
	 * @return
	 *         a structured selection.
	 *         the returned value can't be <code>null</code>
	 */
	public static final IStructuredSelection getCurrentStructuredSelection() {
		ISelection selection = getCurrentSelection();
		if (selection instanceof IStructuredSelection) {
			return (IStructuredSelection) selection;
		}
		return StructuredSelection.EMPTY;
	}

	/**
	 * 
	 * @param viewId
	 *            the id of the view for which we want the selection
	 * @return
	 *         the current selection for the view, the returned value can't be <code>null</code>
	 */
	public static final IStructuredSelection getCurrentStructuredSelection(String viewId) {
		ISelection selection = getCurrentSelection(viewId);
		if (selection instanceof IStructuredSelection) {
			return (IStructuredSelection) selection;
		}
		return StructuredSelection.EMPTY;
	}
}
