/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
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
package org.eclipse.papyrus.infra.nattable.layerstack;

import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.edit.action.MouseEditAction;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.grid.layer.RowHeaderLayer;
import org.eclipse.nebula.widgets.nattable.layer.AbstractLayer;
import org.eclipse.nebula.widgets.nattable.layer.AbstractLayerTransform;
import org.eclipse.nebula.widgets.nattable.layer.CompositeLayer;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.selection.config.DefaultSelectionBindings;
import org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry;
import org.eclipse.nebula.widgets.nattable.ui.matcher.MouseEventMatcher;
import org.eclipse.papyrus.infra.nattable.configuration.PapyrusRowHeaderStyleConfiguration;
import org.eclipse.papyrus.infra.nattable.configuration.PapyrusRowResizeBindingsConfiguration;
import org.eclipse.papyrus.infra.nattable.dataprovider.RowIndexHeaderDataProvider;
import org.eclipse.papyrus.infra.nattable.dataprovider.RowLabelHeaderDataProvider;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.utils.DefaultSizeUtils;
import org.eclipse.swt.SWT;

/**
 *
 * @author VL222926
 *         Layer stack used for row header
 */
public class RowHeaderLayerStack extends AbstractLayerTransform {

	/**
	 * Default columns width
	 */
	public static final int DEFAULT_COLUMN_WIDTH = 150;

	/**
	 * default rows height
	 */
	public static final int DEFAULT_ROW_HEIGHT = DefaultSizeUtils.getDefaultCellWidth();

	/**
	 * the table manager
	 */
	protected final INattableModelManager tableManager;
	/**
	 * the composite layer
	 */
	protected final CompositeLayer compositeLayer;

	/**
	 * the index data layer
	 */
	protected final DataLayer indexDataLayer;

	/**
	 * the label data layer
	 */
	protected final DataLayer labelDataLayer;

	/**
	 * the row header layer index
	 */
	private final AbstractLayer indexRowHeaderLayer;

	/**
	 * the row header layer label
	 */
	protected final AbstractLayer labelRowHeaderLayer;
	/**
	 * the label data provider
	 */
	protected final IDataProvider indexDataProvider;

	/**
	 * the index data provider
	 */
	protected final IDataProvider labelDataProvider;


	/**
	 *
	 * Constructor.
	 *
	 * @param dataProvider
	 * @param bodyLayer
	 * @deprecated use the other constructor
	 */
	@Deprecated
	public RowHeaderLayerStack(final IDataProvider dataProvider, final BodyLayerStack bodyLayer) {
		final DataLayer dataLayer = new DataLayer(dataProvider, RowHeaderLayerStack.DEFAULT_COLUMN_WIDTH, RowHeaderLayerStack.DEFAULT_ROW_HEIGHT);
		// I know that selection layer is probably false
		final RowHeaderLayer rowHeaderLayer = new RowHeaderLayer(dataLayer, bodyLayer, /* bodyLayer.getSelectionLayer() */new SelectionLayer(dataLayer), false);
		rowHeaderLayer.addConfiguration(new PapyrusRowResizeBindingsConfiguration());
		// ne marche pas! but : avoir le même type de cellule dans les headers des lignes et des colonnes
		rowHeaderLayer.addConfiguration(new PapyrusRowHeaderStyleConfiguration());
		// final IConfiguration configuration = new CustomConfig();
		// setUnderlyingLayer(sortHeaderLayer);
		// rowHeaderLayer.addConfiguration(configuration);
		// rowHeaderLayer.addConfiguration(new RowOnlySelectionBindings());
		setUnderlyingLayer(rowHeaderLayer);
		setRegionName(GridRegion.ROW_HEADER);
		this.labelRowHeaderLayer = null;
		this.indexRowHeaderLayer = null;
		this.tableManager = null;
		this.labelDataProvider = null;
		this.indexDataProvider = null;
		this.indexDataLayer = null;
		this.labelDataLayer = null;
		this.compositeLayer = null;
	}


	/**
	 *
	 * Constructor.
	 *
	 * @param bodyLayerStack
	 *            the body layer
	 */
	public RowHeaderLayerStack(final BodyLayerStack bodyLayerStack, final INattableModelManager tableManager) {
		this.tableManager = tableManager;
		// 1. create the data provider
		this.indexDataProvider = createIndexDataProvider();
		this.labelDataProvider = createLabelDataProvider();

		// 2. create the data layer
		this.indexDataLayer = createIndexDataLayer();
		this.labelDataLayer = createLabelDataLayer();

		// 3. create the row header layer
		this.indexRowHeaderLayer = createIndexRowHeaderLayer(bodyLayerStack, tableManager);
		this.labelRowHeaderLayer = createLabelRowHeaderLayer(bodyLayerStack, tableManager);

		// 3.1 configure layer
		this.indexRowHeaderLayer.addConfiguration(new PapyrusRowHeaderStyleConfiguration());
		this.indexRowHeaderLayer.setRegionName(GridRegion.ROW_HEADER);
		this.labelRowHeaderLayer.setRegionName(GridRegion.ROW_HEADER);

		// 4. create the composite layer
		this.compositeLayer = new CompositeLayer(2, 1);
		this.compositeLayer.setChildLayer(GridRegion.ROW_HEADER, indexRowHeaderLayer, 0, 0);
		this.compositeLayer.setChildLayer(GridRegion.ROW_HEADER, labelRowHeaderLayer, 1, 0);

		// 3. configure the layer
		this.indexRowHeaderLayer.addConfiguration(new PapyrusRowResizeBindingsConfiguration());
		this.compositeLayer.addConfiguration(new PapyrusRowResizeBindingsConfiguration());
		this.compositeLayer.setRegionName(GridRegion.ROW_HEADER);
		setUnderlyingLayer(compositeLayer);
		setRegionName(GridRegion.ROW_HEADER);
	}

	/**
	 *
	 * @return
	 *         the label data provider to use
	 */
	protected IDataProvider createLabelDataProvider() {
		return new RowLabelHeaderDataProvider(this.tableManager);
	}

	/**
	 *
	 * @return
	 *         the index data provider to use
	 */
	protected IDataProvider createIndexDataProvider() {
		return new RowIndexHeaderDataProvider(this.tableManager);
	}

	/**
	 *
	 * @return
	 *         the label data provider to use
	 */
	public IDataProvider getLabelDataProvider() {
		return this.labelDataProvider;
	}

	/**
	 *
	 * @return
	 *         the index data provider to use
	 */
	public IDataProvider getIndexDataProvider() {
		return this.indexDataProvider;
	}

	/**
	 *
	 * @param bodyLayerStack
	 * @param tableManager
	 * @return
	 */
	protected AbstractLayer createIndexRowHeaderLayer(final BodyLayerStack bodyLayerStack, final INattableModelManager tableManager) {
		RowHeaderLayer layer = new RowHeaderLayer(getIndexDataLayer(), bodyLayerStack, bodyLayerStack.getSelectionLayer(), false);
		return layer;
	}

	/**
	 *
	 * @param bodyLayerStack
	 * @param tableManager
	 * @return
	 */
	protected AbstractLayer createLabelRowHeaderLayer(final BodyLayerStack bodyLayerStack, final INattableModelManager tableManager) {
		return new RowHeaderLayer(getLabelDataLayer(), bodyLayerStack.getViewportLayer(), bodyLayerStack.getSelectionLayer(), false);
	}

	/**
	 *
	 * @return
	 *         the index row layer to use
	 */
	public final AbstractLayer getIndexRowHeaderLayer() {
		return this.indexRowHeaderLayer;
	}

	/**
	 *
	 * @return
	 *         the label row layer to use
	 */
	public final AbstractLayer getLabelRowHeaderLayer() {
		return this.labelRowHeaderLayer;
	}

	/**
	 * @param createLabelDataProvider
	 * @return
	 */
	protected DataLayer createLabelDataLayer() {
		return new DataLayer(getLabelDataProvider(), RowHeaderLayerStack.DEFAULT_COLUMN_WIDTH, RowHeaderLayerStack.DEFAULT_ROW_HEIGHT);
	}

	/**
	 * @param createLabelDataProvider
	 * @return
	 */
	public final DataLayer getLabelDataLayer() {
		return this.labelDataLayer;
	}


	/**
	 * @param createIndexDataProvider
	 * @return
	 */
	protected DataLayer createIndexDataLayer() {
		return new DataLayer(getIndexDataProvider(), RowHeaderLayerStack.DEFAULT_COLUMN_WIDTH, RowHeaderLayerStack.DEFAULT_ROW_HEIGHT);
	}

	/**
	 * @param createIndexDataProvider
	 * @return
	 */
	public final DataLayer getIndexDataLayer() {
		return this.indexDataLayer;
	}


	/**
	 *
	 * @author VL222926
	 *         Configuration providing the selection binding
	 */
	public static class CustomConfig extends DefaultSelectionBindings {


		/**
		 *
		 * @see org.eclipse.nebula.widgets.nattable.selection.config.DefaultSelectionBindings#configureRowHeaderMouseClickBindings(org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry)
		 *
		 * @param uiBindingRegistry
		 */
		@Override
		protected void configureRowHeaderMouseClickBindings(final UiBindingRegistry uiBindingRegistry) {
			uiBindingRegistry.registerDoubleClickBinding(MouseEventMatcher.columnHeaderLeftClick(SWT.NONE), new MouseEditAction());
		}
	}


	// public static class ReoderRowConfid extends AbstractUiBindingConfiguration {// This configuration should be added by the same kind of layer that DefaultColumnReorderLayerConfiguration but for row!
	//
	// @Override
	// public void configureUiBindings(final UiBindingRegistry uiBindingRegistry) {
	// uiBindingRegistry.registerMouseDragMode(MouseEventMatcher.rowHeaderLeftClick(SWT.NONE), new AggregateDragMode(new CellDragMode(), new RowReorderDragMode()));
	// }
	// }

	/**
	 *
	 * @return
	 *         the index data layer
	 */
	public DataLayer getRowIndexDataLayer() {
		return indexDataLayer;
	}

	/**
	 *
	 * @return
	 *         the label data layer
	 */
	public DataLayer getRowLabelDataLayer() {
		return labelDataLayer;
	}

	/**
	 *
	 * @return
	 *         the row header layer index
	 */
	public AbstractLayer getRowHeaderLayerIndex() {
		return this.indexRowHeaderLayer;
	}

	/**
	 *
	 * @return
	 *         the row header layer label
	 */
	public AbstractLayer getRowHeaderLayerLabel() {
		return this.labelRowHeaderLayer;
	}

	/**
	 *
	 * @return
	 *         the composite layer
	 */
	public CompositeLayer getCompositeLayer() {
		return this.compositeLayer;
	}
}
