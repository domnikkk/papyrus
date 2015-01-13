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

package org.eclipse.papyrus.infra.nattable.layer;

import java.util.List;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.nebula.widgets.nattable.coordinate.Range;
import org.eclipse.nebula.widgets.nattable.data.ISpanningDataProvider;
import org.eclipse.nebula.widgets.nattable.layer.SpanningDataLayer;
import org.eclipse.nebula.widgets.nattable.util.ArrayUtil;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;

/**
 *
 * @author QL238289
 * @see org.eclipse.nebula.widgets.nattable.layer.SpanningDataLayer
 *
 *
 */
public class PapyrusSpanningDataLayer extends SpanningDataLayer {

	private TransactionalEditingDomain tableDomain;

	private INattableModelManager manager;

	/**
	 * Constructor.
	 *
	 * @param dataProvider
	 * @param defaultColumnWidth
	 * @param defaultRowHeight
	 */
	public PapyrusSpanningDataLayer(final TransactionalEditingDomain tableDomain, ISpanningDataProvider dataProvider, int defaultColumnWidth, int defaultRowHeight) {
		super(dataProvider, defaultColumnWidth, defaultRowHeight);
		this.tableDomain = tableDomain;

	}

	/**
	 * Constructor.
	 *
	 * @param dataProvider
	 */
	public PapyrusSpanningDataLayer(final TransactionalEditingDomain tableDomain, ISpanningDataProvider dataProvider) {
		super(dataProvider);
		this.tableDomain = tableDomain;
	}


	/**
	 * Constructor.
	 *
	 * @param tableEditingDomain
	 * @param manager
	 * @param spanProvider
	 * @param defaultCellWidth
	 * @param defaultCellHeight
	 */
	public PapyrusSpanningDataLayer(TransactionalEditingDomain tableEditingDomain, INattableModelManager manager,
			ISpanningDataProvider spanProvider, int defaultCellWidth, int defaultCellHeight) {
		super(spanProvider, defaultCellWidth, defaultCellHeight);
		this.tableDomain = tableEditingDomain;
		this.manager = manager;
	}

	/**
	 * @see org.eclipse.nebula.widgets.nattable.layer.SpanningDataLayer#setDataValue(int, int, java.lang.Object)
	 *
	 * @param columnIndex
	 * @param rowIndex
	 * @param newValue
	 */
	@Override
	public void setDataValue(final int columnIndex, final int rowIndex, final Object newValue) {

		List<Object> rowSpan = ArrayUtil.asList(manager.getBodyLayerStack().getSelectionLayer().getSelectedRowPositions().toArray());
		final List<Integer> columnSpan = ArrayUtil.asIntegerList(manager.getBodyLayerStack().getSelectionLayer().getSelectedColumnPositions());
		final List<Integer> rowSpanRange = ArrayUtil.asList(((Range) rowSpan.get(0)).getMembers().toArray(new Integer[0]));

		RecordingCommand recordUpdate = new RecordingCommand(this.tableDomain) {

			@Override
			protected void doExecute() {

				for (Integer indexY : rowSpanRange) {
					for (Integer indexX : columnSpan) {
						// AbstractCellManager's setValue() takes care of the compatibility between the cell and the edit types
						PapyrusSpanningDataLayer.super.setDataValue(indexX, indexY, newValue);
					}
				}
			}
		};
		this.tableDomain.getCommandStack().execute(recordUpdate);
	}
}
