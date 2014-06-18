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
package org.eclipse.papyrus.infra.nattable.common.editor;

import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectColumnCommand;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectRowsCommand;
import org.eclipse.papyrus.infra.core.editor.reload.EMFSelectionContext;
import org.eclipse.papyrus.infra.core.editor.reload.IReloadContextProvider;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;


/**
 * A {@linkplain IReloadContextProvider reload context provider} for {@link NatTable} selection state.
 */
class NattableReloadContextProvider implements IReloadContextProvider {

	private final AbstractEMFNattableEditor editor;

	NattableReloadContextProvider(AbstractEMFNattableEditor editor) {
		super();

		this.editor = editor;
	}

	@Override
	public Object createReloadContext() {
		return new NatTableSelectionContext(getSelectionProvider(), getSelectionLayer());
	}

	@Override
	public void restore(Object reloadContext) {
		((NatTableSelectionContext)reloadContext).restore(getSelectionProvider(), getSelectionLayer());
	}

	private ISelectionProvider getSelectionProvider() {
		// The table editor registers its table-selection provider in its site
		return editor.getSite().getSelectionProvider();
	}

	private SelectionLayer getSelectionLayer() {
		INattableModelManager mgr = AdapterUtils.adapt(editor, INattableModelManager.class, null);
		return mgr.getBodyLayerStack().getSelectionLayer();
	}

	//
	// Nested types
	//

	private static class NatTableSelectionContext extends EMFSelectionContext {

		private final int[] selectedRows;

		private final int[] selectedColumns;

		NatTableSelectionContext(ISelectionProvider structuredSelectionProvider, SelectionLayer selectionLayer) {
			super(structuredSelectionProvider);

			selectedRows = selectionLayer.getFullySelectedRowPositions();
			selectedColumns = selectionLayer.getFullySelectedColumnPositions();
		}

		void restore(ISelectionProvider structuredSelectionProvider, SelectionLayer selectionLayer) {
			selectionLayer.clear();
			if(selectedColumns.length > 0) {
				for(int i = 0; i < selectedColumns.length; i++) {
					selectionLayer.doCommand(new SelectColumnCommand(selectionLayer, selectedColumns[i], Integer.MAX_VALUE, false, true));
				}
			}
			if(selectedRows.length > 0) {
				selectionLayer.doCommand(new SelectRowsCommand(selectionLayer, Integer.MAX_VALUE, selectedRows, false, true, selectedRows[selectedRows.length - 1]));
			}

			restore(structuredSelectionProvider);
		}
	}
}
