/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) - Initial API and implementation
 /*****************************************************************************/
package org.eclipse.papyrus.infra.nattable.painter;

import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.nebula.widgets.nattable.painter.cell.ICellPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.TextPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.decorator.CellPainterDecorator;
import org.eclipse.nebula.widgets.nattable.sort.painter.SortableHeaderTextPainter;
import org.eclipse.nebula.widgets.nattable.style.CellStyleUtil;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.nebula.widgets.nattable.style.IStyle;
import org.eclipse.nebula.widgets.nattable.ui.util.CellEdgeEnum;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AbstractHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.utils.HeaderAxisConfigurationManagementUtils;
import org.eclipse.papyrus.infra.nattable.utils.NattableConfigAttributes;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;


public class PapyrusSortableHeaderTextPainter extends SortableHeaderTextPainter {

	/**
	 * Creates the default {@link SortableHeaderTextPainter} that uses a {@link TextPainter} as base {@link ICellPainter} and decorate it with the {@link SortIconPainter} on the right
	 * edge of the cell.
	 */
	public PapyrusSortableHeaderTextPainter() {
		this(new TextPainter());
	}

	/**
	 * Creates a {@link SortableHeaderTextPainter} that uses the given {@link ICellPainter} as base {@link ICellPainter} and decorate it with the {@link SortIconPainter} on the right
	 * edge of the cell.
	 *
	 * @param interiorPainter
	 *            the base {@link ICellPainter} to use
	 */
	public PapyrusSortableHeaderTextPainter(ICellPainter interiorPainter) {
		this(interiorPainter, CellEdgeEnum.RIGHT);
	}

	/**
	 * Creates a {@link SortableHeaderTextPainter} that uses the given {@link ICellPainter} as base {@link ICellPainter} and decorate it with the {@link SortIconPainter} on the specified
	 * edge of the cell.
	 *
	 * @param interiorPainter
	 *            the base {@link ICellPainter} to use
	 * @param cellEdge
	 *            the edge of the cell on which the sort indicator decoration should be applied
	 */
	public PapyrusSortableHeaderTextPainter(ICellPainter interiorPainter, CellEdgeEnum cellEdge) {
		this(interiorPainter, cellEdge, new SortIconPainter(true));
	}

	/**
	 * Creates a {@link SortableHeaderTextPainter} that uses the given {@link ICellPainter} as base {@link ICellPainter} and decorate it with the
	 * given {@link ICellPainter} to use for sort
	 * related decoration on the specified edge of the cell.
	 *
	 * @param interiorPainter
	 *            the base {@link ICellPainter} to use
	 * @param cellEdge
	 *            the edge of the cell on which the sort indicator decoration should be applied
	 * @param decoratorPainter
	 *            the {@link ICellPainter} that should be used to paint the sort related
	 *            decoration (by default the {@link SortIconPainter} will be used)
	 */
	public PapyrusSortableHeaderTextPainter(ICellPainter interiorPainter, CellEdgeEnum cellEdge, ICellPainter decoratorPainter) {
		setWrappedPainter(new CellPainterDecorator(interiorPainter, cellEdge, decoratorPainter));
	}

	/**
	 * Paints the triangular sort icon images.
	 * Adapted code from Nattable
	 */
	protected static class SortIconPainter extends org.eclipse.nebula.widgets.nattable.sort.painter.SortIconPainter {

		public SortIconPainter(boolean paintBg) {
			super(paintBg);
		}


		@Override
		public void paintCell(ILayerCell cell, GC gc, Rectangle bounds, IConfigRegistry configRegistry) {
			int position = cell.getRowPosition();
			if (position == 0) {
				INattableModelManager manager = configRegistry.getConfigAttribute(NattableConfigAttributes.NATTABLE_MODEL_MANAGER_CONFIG_ATTRIBUTE, DisplayMode.NORMAL, NattableConfigAttributes.NATTABLE_MODEL_MANAGER_ID);
				AbstractHeaderAxisConfiguration config = HeaderAxisConfigurationManagementUtils.getColumnAbstractHeaderAxisConfigurationUsedInTable(manager.getTable());
				if (config != null && config.isDisplayIndex()) {
					return;
				}
			}

			Image image = getImage(cell, configRegistry);
			if (image != null) {
				Rectangle imageBounds = image.getBounds();
				imageBounds = new Rectangle(imageBounds.x, imageBounds.y, imageBounds.width, imageBounds.height);

				IStyle cellStyle = CellStyleUtil.getCellStyle(cell, configRegistry);
				int y = bounds.y + CellStyleUtil.getVerticalAlignmentPadding(cellStyle, bounds, imageBounds.height);

				gc.drawImage(image, bounds.x + CellStyleUtil.getHorizontalAlignmentPadding(cellStyle, bounds, imageBounds.width), y);

				// a try to add the order of the column into the sort at the top of the arrow
				// int x = bounds.x + CellStyleUtil.getHorizontalAlignmentPadding(cellStyle, bounds, imageBounds.width);
				//
				// System.out.println("before =" + y);
				// int yy = (y - imageBounds.height) - 2;//- 7;
				// float halfHeight = ((float)getPreferredHeight(cell, gc, configRegistry)) / ((float)2);
				// yy = (int)(y - (gc.getFont().getFontData()[0].height + 2));
				// System.out.println("after =" + yy);
				//
				//				gc.drawText(Integer.toString(getSortSequence(cell)), x, yy); //$NON-NLS-1$
			}
		}

		@Override
		public int getPreferredHeight(ILayerCell cell, GC gc, IConfigRegistry configRegistry) {
			int width = super.getPreferredHeight(cell, gc, configRegistry);
			width += gc.getFont().getFontData()[0].height + 2;
			return width;
		}

		@Override
		public int getPreferredWidth(ILayerCell cell, GC gc, IConfigRegistry configRegistry) {
			return super.getPreferredWidth(cell, gc, configRegistry);
		}

	}

}
