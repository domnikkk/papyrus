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
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.nebula.widgets.nattable.painter.cell.ICellPainter;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.nebula.widgets.nattable.tree.config.DefaultTreeLayerConfiguration;
import org.eclipse.nebula.widgets.nattable.tree.painter.IndentedTreeImagePainter;
import org.eclipse.nebula.widgets.nattable.tree.painter.TreeImagePainter;
import org.eclipse.nebula.widgets.nattable.ui.util.CellEdgeEnum;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.utils.NattableConfigAttributes;
import org.eclipse.papyrus.infra.nattable.utils.TableHelper;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;

/**
 * This intended tree painter allows us to ignore indentation when the table displays the hierarchy as multi column
 *
 * @author VL222926
 *
 */
public class PapyrusIndentedTreeImagePainter extends IndentedTreeImagePainter {

	/**
	 * Constructor.
	 *
	 */
	public PapyrusIndentedTreeImagePainter() {
		super();
	}

	/**
	 * Constructor.
	 *
	 * @param treeIndent
	 * @param cellEdge
	 * @param treeImagePainter
	 */
	public PapyrusIndentedTreeImagePainter(int treeIndent, CellEdgeEnum cellEdge, TreeImagePainter treeImagePainter) {
		super(treeIndent, cellEdge, treeImagePainter);
	}

	/**
	 * Constructor.
	 *
	 * @param treeIndent
	 * @param interiorPainter
	 * @param paintBg
	 * @param interiorPainterToSpanFullWidth
	 */
	public PapyrusIndentedTreeImagePainter(int treeIndent, ICellPainter interiorPainter, boolean paintBg, boolean interiorPainterToSpanFullWidth) {
		super(treeIndent, interiorPainter, paintBg, interiorPainterToSpanFullWidth);
	}

	/**
	 * Constructor.
	 *
	 * @param treeIndent
	 * @param interiorPainter
	 * @param cellEdge
	 * @param paintBg
	 * @param spacing
	 * @param paintDecorationDependent
	 */
	public PapyrusIndentedTreeImagePainter(int treeIndent, ICellPainter interiorPainter, CellEdgeEnum cellEdge, boolean paintBg, int spacing, boolean paintDecorationDependent) {
		super(treeIndent, interiorPainter, cellEdge, paintBg, spacing, paintDecorationDependent);
	}

	/**
	 * Constructor.
	 *
	 * @param treeIndent
	 * @param interiorPainter
	 * @param cellEdge
	 * @param decoratorPainter
	 * @param paintBg
	 * @param spacing
	 * @param paintDecorationDependent
	 */
	public PapyrusIndentedTreeImagePainter(int treeIndent, ICellPainter interiorPainter, CellEdgeEnum cellEdge, ICellPainter decoratorPainter, boolean paintBg, int spacing, boolean paintDecorationDependent) {
		super(treeIndent, interiorPainter, cellEdge, decoratorPainter, paintBg, spacing, paintDecorationDependent);
	}

	/**
	 * Constructor.
	 *
	 * @param treeIndent
	 * @param treeImagePainter
	 */
	public PapyrusIndentedTreeImagePainter(int treeIndent, TreeImagePainter treeImagePainter) {
		super(treeIndent, treeImagePainter);
	}

	/**
	 * Constructor.
	 *
	 * @param treeIndent
	 */
	public PapyrusIndentedTreeImagePainter(int treeIndent) {
		super(treeIndent);
	}

	/**
	 *
	 * @see org.eclipse.nebula.widgets.nattable.tree.painter.IndentedTreeImagePainter#getWrappedPainterBounds(org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell, org.eclipse.swt.graphics.GC, org.eclipse.swt.graphics.Rectangle,
	 *      org.eclipse.nebula.widgets.nattable.config.IConfigRegistry)
	 *
	 * @param cell
	 * @param gc
	 * @param bounds
	 * @param configRegistry
	 * @return
	 */
	@Override
	public Rectangle getWrappedPainterBounds(ILayerCell cell, GC gc, Rectangle bounds, IConfigRegistry configRegistry) {
		INattableModelManager tableManager = getTableManager(configRegistry);
		int depth = getDepth(cell);
		if (TableHelper.isMultiColumnTreeTable(tableManager)) {
			depth = 1;
		}
		int indent = getIndent(depth);
		return new Rectangle(bounds.x + indent, bounds.y, bounds.width - indent, bounds.height);
	}

	/**
	 *
	 * @see org.eclipse.nebula.widgets.nattable.tree.painter.IndentedTreeImagePainter#getPreferredWidth(org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell, org.eclipse.swt.graphics.GC, org.eclipse.nebula.widgets.nattable.config.IConfigRegistry)
	 *
	 * @param cell
	 * @param gc
	 * @param configRegistry
	 * @return
	 */
	@Override
	public int getPreferredWidth(ILayerCell cell, GC gc, IConfigRegistry configRegistry) {
		INattableModelManager tableManager = getTableManager(configRegistry);
		int depth = getDepth(cell);
		if (TableHelper.isMultiColumnTreeTable(tableManager)) {
			depth = 1;
		}
		int indent = getIndent(depth);
		return indent + super.getPreferredWidth(cell, gc, configRegistry);
	}


	/**
	 * @param cell
	 *            The cell for which the depth/level in the tree structure is requested.
	 * @return The depth/level in the tree structure the given cell is located.
	 */
	// TODO : ask to nattable to open there api to use this method from the super class
	protected int getDepth(ILayerCell cell) {
		int depth = 0;

		for (String configLabel : cell.getConfigLabels().getLabels()) {
			if (configLabel.startsWith(DefaultTreeLayerConfiguration.TREE_DEPTH_CONFIG_TYPE)) {
				String[] tokens = configLabel.split("_"); //$NON-NLS-1$
				depth = Integer.valueOf(tokens[tokens.length - 1]).intValue();
			}
		}

		return depth;
	}

	/**
	 *
	 * @param configRegistry
	 *            the config registry
	 * @return
	 *         the INattable manager from the config registry
	 */
	private INattableModelManager getTableManager(final IConfigRegistry configRegistry) {
		return configRegistry.getConfigAttribute(NattableConfigAttributes.NATTABLE_MODEL_MANAGER_CONFIG_ATTRIBUTE, DisplayMode.NORMAL, NattableConfigAttributes.NATTABLE_MODEL_MANAGER_ID);
	}
}
