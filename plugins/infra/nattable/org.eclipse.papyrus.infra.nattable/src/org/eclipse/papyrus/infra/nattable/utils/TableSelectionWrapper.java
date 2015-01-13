/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.utils;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.nebula.widgets.nattable.coordinate.PositionCoordinate;

/**
 * Wrapper for the selection in the table
 *
 * @author VL222926
 *
 */
public class TableSelectionWrapper {

	/**
	 * the list of the coordinate of all selected cells
	 */
	final private Collection<PositionCoordinate> selectedCells;

	/**
	 * a map linking index of selected rows and the object in the selected row
	 */
	final private Map<Integer, Object> fullySelectedRowsObject;

	/**
	 * a map linking index of selected column and the object in the selected column
	 */
	final private Map<Integer, Object> fullySelectionColumnsObject;

	/**
	 *
	 * Constructor.
	 *
	 * @param selectionCells
	 */
	public TableSelectionWrapper(final Collection<PositionCoordinate> selectionCells) {
		this(selectionCells, Collections.<Integer, Object> emptyMap(), Collections.<Integer, Object> emptyMap());
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param selectionCells
	 */
	public TableSelectionWrapper(final Collection<PositionCoordinate> selectionCells, final Map<Integer, Object> fullySelectedRowObject, final Map<Integer, Object> fullySelectedColumnObject) {
		this.selectedCells = selectionCells;
		this.fullySelectedRowsObject = fullySelectedRowObject;
		this.fullySelectionColumnsObject = fullySelectedColumnObject;
	}

	/**
	 *
	 * @return
	 *         the list of the {@link PositionCoordinate} of all selected cells
	 */
	public Collection<PositionCoordinate> getSelectedCells() {
		return selectedCells;
	}

	/**
	 *
	 * @return
	 *         a map with the fully selected rows and their index
	 */
	public Map<Integer, Object> getFullySelectedRows() {
		return this.fullySelectedRowsObject;
	}

	/**
	 *
	 * @return
	 *         a map with the fully selected rows and their columns
	 */
	public Map<Integer, Object> getFullySelectedColumns() {
		return this.fullySelectionColumnsObject;
	}

}
