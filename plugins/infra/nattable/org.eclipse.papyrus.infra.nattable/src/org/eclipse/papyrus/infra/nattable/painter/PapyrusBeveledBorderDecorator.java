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

package org.eclipse.papyrus.infra.nattable.painter;

import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.layer.LabelStack;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.nebula.widgets.nattable.layer.cell.TranslatedLayerCell;
import org.eclipse.nebula.widgets.nattable.painter.cell.ICellPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.decorator.BeveledBorderDecorator;
import org.eclipse.nebula.widgets.nattable.tree.TreeLayer;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;

/**
 * @author VL222926
 *
 */
public class PapyrusBeveledBorderDecorator extends BeveledBorderDecorator {

	/**
	 * Constructor.
	 *
	 * @param interiorPainter
	 */
	public PapyrusBeveledBorderDecorator(ICellPainter interiorPainter) {
		super(interiorPainter);
	}

	/**
	 * Constructor.
	 *
	 * @param interiorPainter
	 * @param uplift
	 */
	public PapyrusBeveledBorderDecorator(ICellPainter interiorPainter, boolean uplift) {
		super(interiorPainter, uplift);
	}

	/**
	 *
	 * @see org.eclipse.nebula.widgets.nattable.painter.cell.decorator.BeveledBorderDecorator#paintCell(org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell, org.eclipse.swt.graphics.GC, org.eclipse.swt.graphics.Rectangle,
	 *      org.eclipse.nebula.widgets.nattable.config.IConfigRegistry)
	 *
	 * @param cell
	 * @param gc
	 * @param adjustedCellBounds
	 * @param configRegistry
	 */
	@Override
	public void paintCell(ILayerCell cell, GC gc, Rectangle adjustedCellBounds, IConfigRegistry configRegistry) {
		LabelStack labels = null;
		if (cell instanceof TranslatedLayerCell) {
			labels = cell.getConfigLabels();
		}
		if (!labels.hasLabel(TreeLayer.TREE_COLUMN_CELL)) {
			super.paintCell(cell, gc, adjustedCellBounds, configRegistry);
			return;
		} else {
			if (getWrappedPainter() != null) {
				getWrappedPainter().paintCell(cell, gc, adjustedCellBounds, configRegistry);
			}
		}
	}
}
