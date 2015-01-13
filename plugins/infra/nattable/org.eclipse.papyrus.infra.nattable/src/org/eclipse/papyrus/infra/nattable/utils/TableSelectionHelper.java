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

package org.eclipse.papyrus.infra.nattable.utils;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.nebula.widgets.nattable.coordinate.PositionCoordinate;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.provider.TableStructuredSelection;
import org.eclipse.papyrus.infra.tools.util.SelectionHelper;

/**
 * this class provides methods to get the table selection using the Eclipse ISelectioService, so the editor must have the focus
 *
 */
public class TableSelectionHelper {

	/**
	 *
	 * @return
	 *         the current table selection
	 */
	public static final TableStructuredSelection getCurrentTableStructuredSelection() {
		IStructuredSelection selection = SelectionHelper.getCurrentStructuredSelection();
		if (selection instanceof TableStructuredSelection) {
			return (TableStructuredSelection) selection;
		}
		return null;
	}

	/**
	 *
	 * @return
	 *         a map with the index and the object of the fully selected rows
	 */
	public static final Map<Integer, Object> getFullySelectedRows() {
		TableStructuredSelection selection = getCurrentTableStructuredSelection();
		if (selection != null) {
			TableSelectionWrapper wrapper = (TableSelectionWrapper) selection.getAdapter(TableSelectionWrapper.class);
			if (wrapper != null) {
				return wrapper.getFullySelectedRows();
			}
		}
		return Collections.emptyMap();
	}

	/**
	 *
	 * @return
	 *         a map with the index and the object of the fully selected columns
	 */
	public static final Map<Integer, Object> getFullySelectedColumns() {
		TableStructuredSelection selection = getCurrentTableStructuredSelection();
		if (selection != null) {
			TableSelectionWrapper wrapper = (TableSelectionWrapper) selection.getAdapter(TableSelectionWrapper.class);
			if (wrapper != null) {
				return wrapper.getFullySelectedColumns();
			}
		}
		return Collections.emptyMap();
	}

	/**
	 *
	 * @return
	 *         the position coordinate of the selected cells, or <code>null</code>
	 */
	public static final Collection<PositionCoordinate> getSelectedCells() {
		TableStructuredSelection selection = getCurrentTableStructuredSelection();
		if (selection != null) {
			TableSelectionWrapper wrapper = (TableSelectionWrapper) selection.getAdapter(TableSelectionWrapper.class);
			if (wrapper != null) {
				return wrapper.getSelectedCells();
			}
		}
		return null;
	}

	/**
	 * @param tableManager
	 *            the tableManager for which we want the selected rows
	 * @return
	 *         a map with the index and the object of the fully selected rows
	 */
	public static final Map<Integer, Object> getFullySelectedRows(INattableModelManager tableManager) {
		TableSelectionWrapper wrapper = (TableSelectionWrapper) tableManager.getAdapter(TableSelectionWrapper.class);
		if (wrapper != null) {
			return wrapper.getFullySelectedRows();
		}
		return Collections.emptyMap();
	}

	/**
	 *
	 * @param tableManager
	 *            the tableManager for which we want the selected columns
	 *
	 * @return
	 *         a map with the index and the object of the fully selected columns
	 */
	public static final Map<Integer, Object> getFullySelectedColumns(INattableModelManager tableManager) {
		TableSelectionWrapper wrapper = (TableSelectionWrapper) tableManager.getAdapter(TableSelectionWrapper.class);
		if (wrapper != null) {
			return wrapper.getFullySelectedColumns();
		}
		return Collections.emptyMap();
	}

	/**
	 *
	 * @param tableManager
	 *            the tableManager for which we want the selected rows
	 * @return
	 *         the position coordinate of the selected cells, or <code>null</code>
	 */
	public static final Collection<PositionCoordinate> getSelectedCells(INattableModelManager tableManager) {
		TableSelectionWrapper wrapper = (TableSelectionWrapper) tableManager.getAdapter(TableSelectionWrapper.class);
		if (wrapper != null) {
			return wrapper.getSelectedCells();
		}
		return null;
	}


}
