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

import java.util.Collections;
import java.util.List;

import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.command.ILayerCommand;
import org.eclipse.nebula.widgets.nattable.config.ConfigRegistry;
import org.eclipse.nebula.widgets.nattable.hideshow.RowHideShowLayer;
import org.eclipse.nebula.widgets.nattable.hideshow.command.MultiRowShowCommand;
import org.eclipse.nebula.widgets.nattable.hideshow.command.RowHideCommand;
import org.eclipse.nebula.widgets.nattable.layer.IUniqueIndexLayer;
import org.eclipse.nebula.widgets.nattable.layer.LabelStack;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.nebula.widgets.nattable.layer.event.RowDeleteEvent;
import org.eclipse.nebula.widgets.nattable.layer.event.RowInsertEvent;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.nebula.widgets.nattable.tree.ITreeRowModel;
import org.eclipse.nebula.widgets.nattable.tree.TreeLayer;
import org.eclipse.nebula.widgets.nattable.tree.config.DefaultTreeLayerConfiguration;
import org.eclipse.nebula.widgets.nattable.tree.painter.IndentedTreeImagePainter;
import org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry;
import org.eclipse.papyrus.infra.nattable.configuration.PapyrusTreeLayerConfiguration;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.manager.table.NattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.utils.NattableConfigAttributes;
import org.eclipse.papyrus.infra.nattable.utils.StyleUtils;

import ca.odell.glazedlists.TreeList;
import ca.odell.glazedlists.event.ListEvent;
import ca.odell.glazedlists.event.ListEventListener;

/**
 * @author VL222926
 *
 */
public class PapyrusTreeLayer extends TreeLayer {

	/**
	 * the table manager
	 */
	private INattableModelManager tableManager;

	/**
	 * the managed tree list
	 */
	private TreeList<?> treeList;

	/**
	 * the listener on the tree list
	 */
	private ListEventListener<Object> listener;

	/**
	 * Constructor.
	 *
	 * @param underlyingLayer
	 * @param treeRowModel
	 * @param useDefaultConfiguration
	 */
	public PapyrusTreeLayer(IUniqueIndexLayer underlyingLayer, ITreeRowModel<?> treeRowModel, boolean useDefaultConfiguration) {
		super(underlyingLayer, treeRowModel, useDefaultConfiguration);
		addConfiguration(new PapyrusTreeLayerConfiguration(this));
	}

	/**
	 * Constructor.
	 *
	 * @param underlyingLayer
	 * @param treeRowModel
	 * @param indentedTreeImagePainter
	 * @param useDefaultConfiguration
	 */
	public PapyrusTreeLayer(IUniqueIndexLayer underlyingLayer, ITreeRowModel<?> treeRowModel, IndentedTreeImagePainter indentedTreeImagePainter, boolean useDefaultConfiguration) {
		super(underlyingLayer, treeRowModel, indentedTreeImagePainter, useDefaultConfiguration);
		addConfiguration(new PapyrusTreeLayerConfiguration(this));
	}

	/**
	 * Constructor.
	 *
	 * @param underlyingLayer
	 * @param treeRowModel
	 * @param indentedTreeImagePainter
	 */
	public PapyrusTreeLayer(IUniqueIndexLayer underlyingLayer, ITreeRowModel<?> treeRowModel, IndentedTreeImagePainter indentedTreeImagePainter) {
		super(underlyingLayer, treeRowModel, indentedTreeImagePainter);
		addConfiguration(new PapyrusTreeLayerConfiguration(this));
	}

	/**
	 * Constructor.
	 *
	 * @param underlyingLayer
	 * @param treeRowModel
	 */
	public PapyrusTreeLayer(IUniqueIndexLayer underlyingLayer, ITreeRowModel<?> treeRowModel) {
		super(underlyingLayer, treeRowModel);
		addConfiguration(new PapyrusTreeLayerConfiguration(this));
	}

	/**
	 * @see org.eclipse.nebula.widgets.nattable.layer.AbstractLayerTransform#configure(org.eclipse.nebula.widgets.nattable.config.ConfigRegistry, org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry)
	 *
	 * @param configRegistry
	 * @param uiBindingRegistry
	 */
	@Override
	public void configure(ConfigRegistry configRegistry, UiBindingRegistry uiBindingRegistry) {
		super.configure(configRegistry, uiBindingRegistry);
		this.tableManager = configRegistry.getConfigAttribute(NattableConfigAttributes.NATTABLE_MODEL_MANAGER_CONFIG_ATTRIBUTE, DisplayMode.NORMAL, NattableConfigAttributes.NATTABLE_MODEL_MANAGER_ID);
		this.treeList = (TreeList<?>) this.tableManager.getRowElementsList();
		addListListener();
	}

	/**
	 * this method creates and adds a listener on the tree list
	 */
	protected void addListListener() {
		this.listener = new ListEventListener<Object>() {

			@Override
			public void listChanged(ListEvent<Object> listChanges) {
				manageListEvent(listChanges);

			}
		};
		this.treeList.addListEventListener(this.listener);
	}

	/**
	 *
	 * @return
	 *         the table manager
	 */
	private NattableModelManager getTableManager() {
		return (NattableModelManager) this.tableManager;
	}

	/**
	 *
	 * @return
	 *         the show hide layer
	 */
	protected RowHideShowLayer getRowHideShowLayer() {
		if (getTableManager() != null && getTableManager().getBodyLayerStack() != null) {
			return getTableManager().getBodyLayerStack().getRowHideShowLayer();
		}
		return null;
	}


	/**
	 * This method do the stuff for insert event
	 *
	 * @param index
	 *            the modified index
	 * @param natTable
	 *            the nattable widget
	 * @param hideShowLayer
	 *            the hide show row layer
	 */
	protected void manageInsertEvent(final int index, NatTable natTable, final RowHideShowLayer rowHideShowLayer) {
		if (index != -1) {
			// we notify the layer than a row has been added
			if (natTable != null) {
				// required to avoid bug during paste from Excel which is not executed in the UI Thread
				natTable.getDisplay().asyncExec(new Runnable() {

					@Override
					public void run() {
						RowInsertEvent event = new RowInsertEvent(PapyrusTreeLayer.this, index);
						rowHideShowLayer.handleLayerEvent(event);
					}
				});
			}
			Object element = getTableManager().getRowElement(index);
			if (!(element instanceof IAxis)) {
				return;
			}
			Object representedElement = ((IAxis) element).getElement();
			// we hide the concerned row if required
			if (representedElement instanceof TreeFillingConfiguration) {
				TreeFillingConfiguration conf = (TreeFillingConfiguration) representedElement;
				if (StyleUtils.getHiddenDepths(getTableManager()).contains(Integer.valueOf(conf.getDepth()))) {
					int realIndex = rowHideShowLayer.underlyingToLocalRowPosition(natTable, index);
					if (realIndex != -1) {
						natTable.doCommand(new RowHideCommand(rowHideShowLayer, realIndex));
					}
				}
			}
		}
	}

	/**
	 * This method do the stuff for update event
	 *
	 * @param index
	 *            the modified index
	 * @param natTable
	 *            the nattable widget
	 * @param hideShowLayer
	 *            the hide show row layer
	 */
	protected void manageUpdateEvent(int index, NatTable natTable, RowHideShowLayer hideShowLayer) {
		// nothing to do?
	}

	/**
	 * This method do the stuff for delete event
	 *
	 * @param index
	 *            the modified index
	 * @param natTable
	 *            the nattable widget
	 * @param hideShowLayer
	 *            the hide show row layer
	 */
	protected void manageDeleteEvent(int index, NatTable natTable, RowHideShowLayer rowHideShowLayer) {
		if (index != -1) {
			// we notify that a row has be deleted
			RowDeleteEvent event = new RowDeleteEvent(this, index);
			rowHideShowLayer.handleLayerEvent(event);

			Object element = getTableManager().getRowElement(index);
			if (!(element instanceof IAxis)) {
				return;
			}
			Object representedElement = ((IAxis) element).getElement();
			if (representedElement instanceof TreeFillingConfiguration) {
				TreeFillingConfiguration conf = (TreeFillingConfiguration) representedElement;
				if (StyleUtils.getHiddenDepths(getTableManager()).contains(Integer.valueOf(conf.getDepth()))) {
					int realIndex = rowHideShowLayer.underlyingToLocalRowPosition(natTable, index);
					if (realIndex != -1) {
						natTable.doCommand(new MultiRowShowCommand(Collections.singletonList(realIndex)));
					}
				}
			}
		}
	}

	/**
	 *
	 * @param listChanges
	 */
	protected void manageListEvent(ListEvent<Object> listChanges) {
		if (getTableManager() == null) {
			return;
		}
		RowHideShowLayer rowHideShowLayer = getRowHideShowLayer();
		NatTable natTable = (NatTable) getTableManager().getAdapter(NatTable.class);
		if (rowHideShowLayer == null || natTable == null) {
			return;
		}

		while (listChanges.hasNext()) {
			listChanges.next();
			int index = listChanges.getIndex();
			switch (listChanges.getType()) {
			case ListEvent.DELETE:
				manageDeleteEvent(index, natTable, rowHideShowLayer);
				break;
			case ListEvent.UPDATE:
				manageUpdateEvent(index, natTable, rowHideShowLayer);
				// nothing to do
				break;
			case ListEvent.INSERT:
				manageInsertEvent(index, natTable, rowHideShowLayer);
				break;
			default:
				break;
			}
		}
		getTableManager().refreshNatTable();
	}

	/**
	 * @see org.eclipse.nebula.widgets.nattable.tree.TreeLayer#getConfigLabelsByPosition(int, int)
	 *
	 * @param columnPosition
	 * @param rowPosition
	 * @return
	 */
	@Override
	public LabelStack getConfigLabelsByPosition(int columnPosition, int rowPosition) {
		LabelStack configLabels = super.getConfigLabelsByPosition(0, rowPosition);
		ILayerCell cell = getCellByPosition(columnPosition, rowPosition);
		if (cell != null) {
			Object value = cell.getDataValue();
			if (value == null || "".equals(value)) { //$NON-NLS-1$
				// we are in one of the column of the Tree, but without elements (cell is empty)
				configLabels.removeLabel(DefaultTreeLayerConfiguration.TREE_DEPTH_CONFIG_TYPE);
				configLabels.removeLabel(DefaultTreeLayerConfiguration.TREE_LEAF_CONFIG_TYPE);
				configLabels.removeLabel(DefaultTreeLayerConfiguration.TREE_COLLAPSED_CONFIG_TYPE);
				configLabels.removeLabel(DefaultTreeLayerConfiguration.TREE_EXPANDED_CONFIG_TYPE);
			}
		}
		return configLabels;
	}

	/**
	 *
	 * @see org.eclipse.nebula.widgets.nattable.tree.TreeLayer#doCommand(org.eclipse.nebula.widgets.nattable.command.ILayerCommand)
	 *
	 * @param command
	 * @return
	 */
	@Override
	public boolean doCommand(ILayerCommand command) {
		return super.doCommand(command);
	}


	/**
	 * @see org.eclipse.nebula.widgets.nattable.tree.TreeLayer#expandOrCollapseIndex(int)
	 *
	 * @param parentIndex
	 */
	@Override
	public void expandOrCollapseIndex(int parentIndex) {
		super.expandOrCollapseIndex(parentIndex);
	}

	/**
	 * @see org.eclipse.nebula.widgets.nattable.tree.TreeLayer#collapseTreeRow(int)
	 *
	 * @param parentIndex
	 */
	@Override
	public void collapseTreeRow(int parentIndex) {
		super.collapseTreeRow(parentIndex);
	}

	/**
	 * @see org.eclipse.nebula.widgets.nattable.tree.TreeLayer#expandTreeRow(int)
	 *
	 * @param parentIndex
	 */
	@Override
	public void expandTreeRow(int parentIndex) {
		if (this.tableManager == null) {
			return;
		}
		Object expandedEl = tableManager.getRowElementsList().get(parentIndex);
		super.expandTreeRow(parentIndex);
		if (expandedEl instanceof ITreeItemAxis) {
			ITreeItemAxis curr = (ITreeItemAxis) expandedEl;

			// if the expanded element is a semantic element, its children are filling configuration.
			// if categories are hidden for this depth, we need to hide them and to expand their children
			if (!(curr.getElement() instanceof TreeFillingConfiguration) && !curr.getChildren().isEmpty()) {
				List<Integer> hidden = StyleUtils.getHiddenDepths(tableManager);
				int deth = ((NattableModelManager) tableManager).getSemanticDepth(curr) + 1;
				if (hidden.contains(Integer.valueOf(deth))) {
					for (ITreeItemAxis child : curr.getChildren()) {
						int childIndex = tableManager.getRowElementsList().indexOf(child);
						expandTreeRow(childIndex);
					}
				}
			}
		}

	}

	/**
	 * @see org.eclipse.nebula.widgets.nattable.layer.AbstractLayerTransform#dispose()
	 *
	 */
	@Override
	public void dispose() {
		this.treeList.removeListEventListener(this.listener);
		this.treeList = null;
		this.tableManager = null;
		super.dispose();
	}


}
