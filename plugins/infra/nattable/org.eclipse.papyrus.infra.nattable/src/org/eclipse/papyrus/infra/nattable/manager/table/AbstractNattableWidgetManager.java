/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 402525
 *  Christian W. Damus (CEA) - bug 430880
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.manager.table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.AbstractRegistryConfiguration;
import org.eclipse.nebula.widgets.nattable.config.ConfigRegistry;
import org.eclipse.nebula.widgets.nattable.config.EditableRule;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.coordinate.Range;
import org.eclipse.nebula.widgets.nattable.copy.command.CopyDataToClipboardCommand;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.edit.EditConfigAttributes;
import org.eclipse.nebula.widgets.nattable.export.command.ExportCommand;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.grid.data.DefaultCornerDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.layer.CornerLayer;
import org.eclipse.nebula.widgets.nattable.grid.layer.GridLayer;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayerListener;
import org.eclipse.nebula.widgets.nattable.layer.LabelStack;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.nebula.widgets.nattable.layer.event.ILayerEvent;
import org.eclipse.nebula.widgets.nattable.print.command.PrintCommand;
import org.eclipse.nebula.widgets.nattable.print.command.TurnViewportOffCommand;
import org.eclipse.nebula.widgets.nattable.print.command.TurnViewportOnCommand;
import org.eclipse.nebula.widgets.nattable.print.config.DefaultPrintBindings;
import org.eclipse.nebula.widgets.nattable.reorder.ColumnReorderLayer;
import org.eclipse.nebula.widgets.nattable.reorder.event.ColumnReorderEvent;
import org.eclipse.nebula.widgets.nattable.resize.event.ColumnResizeEvent;
import org.eclipse.nebula.widgets.nattable.resize.event.RowResizeEvent;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectAllCommand;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectColumnCommand;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectRowsCommand;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.nattable.Activator;
import org.eclipse.papyrus.infra.nattable.configuration.CornerConfiguration;
import org.eclipse.papyrus.infra.nattable.configuration.PapyrusClickSortConfiguration;
import org.eclipse.papyrus.infra.nattable.configuration.PapyrusHeaderMenuConfiguration;
import org.eclipse.papyrus.infra.nattable.dataprovider.AbstractCompositeDataProvider;
import org.eclipse.papyrus.infra.nattable.dataprovider.BodyDataProvider;
import org.eclipse.papyrus.infra.nattable.dataprovider.ColumnIndexHeaderDataProvider;
import org.eclipse.papyrus.infra.nattable.dataprovider.ColumnLabelHeaderDataProvider;
import org.eclipse.papyrus.infra.nattable.dataprovider.CompositeColumnHeaderDataProvider;
import org.eclipse.papyrus.infra.nattable.dataprovider.CompositeRowHeaderDataProvider;
import org.eclipse.papyrus.infra.nattable.layer.PapyrusGridLayer;
import org.eclipse.papyrus.infra.nattable.layerstack.BodyLayerStack;
import org.eclipse.papyrus.infra.nattable.layerstack.ColumnHeaderLayerStack;
import org.eclipse.papyrus.infra.nattable.layerstack.RowHeaderHierarchicalLayerStack;
import org.eclipse.papyrus.infra.nattable.layerstack.RowHeaderLayerStack;
import org.eclipse.papyrus.infra.nattable.listener.NatTableDropListener;
import org.eclipse.papyrus.infra.nattable.manager.cell.CellManagerFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AbstractHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.LocalTableHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TableHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestyleFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.provider.PapyrusNatTableToolTipProvider;
import org.eclipse.papyrus.infra.nattable.provider.TableSelectionProvider;
import org.eclipse.papyrus.infra.nattable.provider.TableStructuredSelection;
import org.eclipse.papyrus.infra.nattable.selection.ISelectionExtractor;
import org.eclipse.papyrus.infra.nattable.sort.ColumnSortModel;
import org.eclipse.papyrus.infra.nattable.sort.IPapyrusSortModel;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.infra.nattable.utils.DefaultSizeUtils;
import org.eclipse.papyrus.infra.nattable.utils.HeaderAxisConfigurationManagementUtils;
import org.eclipse.papyrus.infra.nattable.utils.LocationValue;
import org.eclipse.papyrus.infra.nattable.utils.NamedStyleConstants;
import org.eclipse.papyrus.infra.nattable.utils.NattableConfigAttributes;
import org.eclipse.papyrus.infra.nattable.utils.TableEditingDomainUtils;
import org.eclipse.papyrus.infra.nattable.utils.TableGridRegion;
import org.eclipse.papyrus.infra.nattable.utils.TableHelper;
import org.eclipse.papyrus.infra.nattable.utils.TableSelectionWrapper;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.widgets.util.NavigationTarget;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPartSite;

/**
 *
 * This class allows to create, configure and manipulate the NatTable Widget
 *
 */
public abstract class AbstractNattableWidgetManager implements INattableModelManager, NavigationTarget, IAdaptable {

	/**
	 * the managed table
	 */
	private Table table;

	/**
	 * we need to keep it, to be able to remove the listener on it, when the table is destroying
	 */
	private EObject tableContext;

	/**
	 * the nattable widget
	 */
	protected NatTable natTable;

	/**
	 * the grid layer
	 */
	private GridLayer gridLayer;

	/**
	 * the columnHeaderLayerStack
	 */
	private ColumnHeaderLayerStack columnHeaderLayerStack;

	/**
	 * the rowHeaderLayerStack
	 */
	private RowHeaderLayerStack rowHeaderLayerStack;

	/**
	 * @return the rowHeaderLayerStack
	 */
	public RowHeaderLayerStack getRowHeaderLayerStack() {
		return rowHeaderLayerStack;
	}

	/**
	 * the selection provider
	 */
	private TableSelectionProvider selectionProvider;

	/**
	 * the body layer stack
	 */
	private BodyLayerStack bodyLayerStack;

	private ILayerListener resizeAxisListener;

	private ILayerListener resizeRowHeaderListener;

	private ILayerListener resizeColumnHeaderListener;

	private AbstractCompositeDataProvider columnHeaderDataProvider;

	private AbstractCompositeDataProvider rowHeaderDataProvider;

	private BodyDataProvider bodyDataProvider;

	/**
	 * the sort model used for rows
	 */
	private IPapyrusSortModel rowSortModel;

	private ISelectionExtractor selectionExtractor;

	/**
	 *
	 * Constructor.
	 *
	 * @param table
	 *            the model of the table
	 */
	public AbstractNattableWidgetManager(final Table table, final ISelectionExtractor selectionExtractor) {
		this.table = table;
		this.tableContext = table.getContext();
		this.selectionExtractor = selectionExtractor;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#createNattable(org.eclipse.swt.widgets.Composite, int, org.eclipse.ui.IWorkbenchPartSite)
	 *
	 * @param parent
	 * @param style
	 * @param site
	 * @return
	 */
	@Override
	public NatTable createNattable(final Composite parent, final int style, final IWorkbenchPartSite site) {
		this.bodyDataProvider = new BodyDataProvider(this);


		this.bodyLayerStack = new BodyLayerStack(this.bodyDataProvider, this);

		columnHeaderDataProvider = new CompositeColumnHeaderDataProvider(this);
		final IDataProvider indexColumnProvider = new ColumnIndexHeaderDataProvider(this);
		final IDataProvider labelColumnProvider = new ColumnLabelHeaderDataProvider(this);
		columnHeaderDataProvider.addDataProvider(indexColumnProvider);
		columnHeaderDataProvider.addDataProvider(labelColumnProvider);

		// this.columnHeaderDataProvider = new ColumnHeaderDataProvider(this);
		// this.columnHeaderDataProvider = new ColumnHeaderDataProvider(this);
		// this.columnHeaderLayerStack = new ColumnHeaderLayerStack(this.columnHeaderDataProvider, this.bodyLayerStack, this.bodyDataProvider, getRowSortModel());
		this.columnHeaderLayerStack = new ColumnHeaderLayerStack(indexColumnProvider, labelColumnProvider, this.bodyLayerStack, getRowSortModel());

		final DisplayStyle displayStyle = TableHelper.getTableDisplayStyle(this);
		if (DisplayStyle.HIERARCHIC_MULTI_TREE_COLUMN.equals(displayStyle) || DisplayStyle.HIERARCHIC_SINGLE_TREE_COLUMN.equals(displayStyle)) {
			this.rowHeaderLayerStack = new RowHeaderHierarchicalLayerStack(bodyLayerStack, this);
		} else {
			this.rowHeaderLayerStack = new RowHeaderLayerStack(bodyLayerStack, this);
		}

		rowHeaderDataProvider = new CompositeRowHeaderDataProvider(this);
		rowHeaderDataProvider.addDataProvider(this.rowHeaderLayerStack.getIndexDataProvider());
		rowHeaderDataProvider.addDataProvider(this.rowHeaderLayerStack.getLabelDataProvider());



		// final IDataProvider cornerDataProvider = new DefaultCornerDataProvider(this.columnHeaderDataProvider, this.rowHeaderDataProvider);
		final IDataProvider cornerDataProvider = new DefaultCornerDataProvider(columnHeaderDataProvider, rowHeaderDataProvider);
		final CornerLayer cornerLayer = new CornerLayer(new DataLayer(cornerDataProvider), this.rowHeaderLayerStack, this.columnHeaderLayerStack);
		cornerLayer.addConfiguration(new CornerConfiguration(this));

		this.gridLayer = new PapyrusGridLayer(TransactionUtil.getEditingDomain(tableContext), this.bodyLayerStack, this.columnHeaderLayerStack, this.rowHeaderLayerStack, cornerLayer);
		this.gridLayer.addConfiguration(new DefaultPrintBindings());
		this.natTable = new NatTable(parent, this.gridLayer, false);



		this.natTable.addConfiguration(new PapyrusHeaderMenuConfiguration());

		this.natTable.addConfiguration(new CellEditionConfiguration());
		this.natTable.addConfiguration(new PapyrusClickSortConfiguration());


		configureNatTable();

		// initialize the table by checking all its applied styles
		initTableAxis();
		initTableHeaders();
		initTableMerge();

		addColumnReorderListener(this.bodyLayerStack.getColumnReorderLayer());
		addAxisResizeListener(this.bodyLayerStack);
		addColumnHeaderResizeListener(this.columnHeaderLayerStack);
		addRowHeaderResizeListener(this.rowHeaderLayerStack);
		addDragAndDropSupport(this.natTable);


		if (site != null) {
			final MenuManager menuMgr = createMenuManager(this.natTable);
			final Menu menu = menuMgr.createContextMenu(this.natTable);
			this.natTable.setMenu(menu);

			this.selectionProvider = new TableSelectionProvider(this, this.bodyLayerStack.getSelectionLayer());
			site.registerContextMenu(menuMgr, this.selectionProvider);
			site.setSelectionProvider(this.selectionProvider);
		}




		new PapyrusNatTableToolTipProvider(this.natTable, GridRegion.BODY, GridRegion.COLUMN_HEADER, GridRegion.ROW_HEADER);
		return this.natTable;
	}

	protected void configureNatTable() {
		if (this.natTable != null && !this.natTable.isDisposed()) {
			ConfigRegistry configRegistry = new ConfigRegistry();
			configRegistry.registerConfigAttribute(NattableConfigAttributes.NATTABLE_MODEL_MANAGER_CONFIG_ATTRIBUTE, AbstractNattableWidgetManager.this, DisplayMode.NORMAL, NattableConfigAttributes.NATTABLE_MODEL_MANAGER_ID);
			configRegistry.registerConfigAttribute(NattableConfigAttributes.LABEL_PROVIDER_SERVICE_CONFIG_ATTRIBUTE, getLabelProviderService(), DisplayMode.NORMAL, NattableConfigAttributes.LABEL_PROVIDER_SERVICE_ID);
			// commented because seems generate several bugs with edition
			// newRegistry.registerConfigAttribute( CellConfigAttributes.DISPLAY_CONVERTER, new GenericDisplayConverter(), DisplayMode.NORMAL, GridRegion.BODY);
			this.natTable.setConfigRegistry(configRegistry);
			this.natTable.setUiBindingRegistry(new UiBindingRegistry(this.natTable));
			this.natTable.configure();
		}
	}


	private LabelProviderService getLabelProviderService() {
		try {
			ServicesRegistry serviceRegistry = ServiceUtilsForEObject.getInstance().getServiceRegistry(this.table.getContext());// get context and NOT get table for the usecase where the table is not in a resource
			return serviceRegistry.getService(LabelProviderService.class);
		} catch (ServiceException e) {
			Activator.log.error(e);
		}
		return null;
	}

	/**
	 *
	 * @param natTable
	 * @return
	 */
	public MenuManager createMenuManager(final NatTable natTable) {
		final MenuManager menuManager = new MenuManager("#PopUp", "org.eclipse.papyrus.infra.nattable.widget.menu") { //$NON-NLS-1$ //$NON-NLS-2$

			@Override
			public void add(final IAction action) {
				super.add(action);
			}

			@Override
			public void add(final IContributionItem item) {
				super.add(item);
			}
		};
		menuManager.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));

		menuManager.setRemoveAllWhenShown(true);
		return menuManager;
	}

	/**
	 * Enable the table to receive dropped elements
	 *
	 * @param nattable
	 *            the nattable widget in which we add the drag&drop support
	 */
	protected void addDragAndDropSupport(final NatTable nattable) {
		final int operations = DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_DEFAULT;
		final DropTarget target = new DropTarget(nattable, operations);
		final LocalTransfer localTransfer = LocalTransfer.getInstance();
		final LocalSelectionTransfer localSelectionTransfer = LocalSelectionTransfer.getTransfer();
		final Transfer[] types = new Transfer[] { localSelectionTransfer, localTransfer };
		target.setTransfer(types);
		final NatTableDropListener dropListener = createDropListener();
		target.addDropListener(dropListener);
	}

	protected NatTableDropListener createDropListener() {
		return new NatTableDropListener(this, this.selectionExtractor);
	}

	/**
	 * Add a listener on the column reorder layer in order to update the model
	 *
	 * @param columnReorderLayer
	 *            the column reorder layer
	 */
	private void addColumnReorderListener(final ColumnReorderLayer columnReorderLayer) {
		columnReorderLayer.addLayerListener(new ILayerListener() {


			@Override
			public void handleLayerEvent(final ILayerEvent event) {
				if (event instanceof ColumnReorderEvent) {
					ColumnReorderEvent columnReorderEvent = (ColumnReorderEvent) event;
					int start = -1;
					int end = columnReorderEvent.getBeforeToColumnPosition();
					for (Range range : columnReorderEvent.getBeforeFromColumnPositionRanges()) {
						start = range.start;
						break;
					}

					if (start != -1) {
						final List<IAxis> allAxis = AbstractNattableWidgetManager.this.getColumnAxisManager().getRepresentedContentProvider().getAxis();

						// This solve an index difference between moving
						// a column from right to left and moving a
						// column from left to right
						if (start >= 0 && start < end && columnReorderEvent.isReorderToLeftEdge()) {
							end--;
						}

						final IAxis axisToMove = allAxis.get(start);
						if (axisToMove != null) {
							moveColumnElement(axisToMove, end);
						}
					}
				}
			}
		});
	}

	/**
	 * Add a listener on the body itself in order to update the model
	 *
	 * @param bodyLayerStack
	 *            the table's body layer
	 */
	private void addAxisResizeListener(final BodyLayerStack bodyLayerStack) {
		resizeAxisListener = new ILayerListener() {

			@Override
			public void handleLayerEvent(ILayerEvent event) {
				// both events are considered as a body change and therefore we need to check each possibility
				if (event instanceof ColumnResizeEvent || event instanceof RowResizeEvent) {
					final CompositeCommand resizeCommand = new CompositeCommand("resize IAxis' width or height"); //$NON-NLS-1$
					TransactionalEditingDomain tableDomain = TableEditingDomainUtils.getTableEditingDomain(table);

					if (event instanceof ColumnResizeEvent) {
						// get the index of the first column modified by the user
						// the assumption is that the user changes only one column at a time in order to resize to its liking
						int resizedColumnPosition = getRangeStart(event);
						// get the resized value from this column
						int newColumnSize = columnHeaderLayerStack.getColumnWidthByPosition(resizedColumnPosition);
						// get the associated object
						Object currentColumnObject = getColumnElement(resizedColumnPosition); // INattableModelManager -> ITableAxisElementProvider.getColumnElement
						if (currentColumnObject instanceof IAxis) {
							// the object is now the Axis in which the style will be applied
							IAxis currentColumnIAxis = (IAxis) currentColumnObject;
							if (currentColumnIAxis.eContainer() != null) {
								IntValueStyle value = (IntValueStyle) currentColumnIAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.AXIS_WIDTH);
								if (value != null && value.getIntValue() != newColumnSize) {
									// Constructs a new request to set the value of a structural feature in a model element
									SetRequest resizeColumnRequest = new SetRequest(tableDomain, value, NattablestylePackage.eINSTANCE.getIntValueStyle_IntValue(), newColumnSize);
									// initialize the feature value if none before and replace the value if another existed prior to the resize
									SetValueCommand resizeColumnCommand = new SetValueCommand(resizeColumnRequest);
									resizeCommand.add(resizeColumnCommand);

								} else if (value == null && newColumnSize != DefaultSizeUtils.getDefaultCellWidth()) {
									// the element does not have any predefined width value attached to its resource so we create it
									value = NattablestyleFactory.eINSTANCE.createIntValueStyle();
									value.setIntValue(newColumnSize);
									value.setName(NamedStyleConstants.AXIS_WIDTH);
									SetRequest initColumnSizeRequest = new SetRequest(tableDomain, currentColumnIAxis, NattablestylePackage.eINSTANCE.getStyledElement_Styles(), value);
									SetValueCommand resizeColumnCommand = new SetValueCommand(initColumnSizeRequest);
									resizeCommand.add(resizeColumnCommand);

								}
							}
						}

					}

					// the process is the same for this event
					else if (event instanceof RowResizeEvent) {
						int resizedRowPosition = getRangeStart(event);
						int newRowSize = rowHeaderLayerStack.getRowHeightByPosition(resizedRowPosition);
						Object currentRowObject = getRowElement(resizedRowPosition);
						if (currentRowObject instanceof IAxis) {
							IAxis currentRowIAxis = (IAxis) currentRowObject;
							if (currentRowIAxis.eContainer() != null) {
								IntValueStyle value = (IntValueStyle) currentRowIAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.AXIS_HEIGHT);
								if (value != null && value.getIntValue() != newRowSize) {
									SetRequest resizeRowRequest = new SetRequest(tableDomain, value, NattablestylePackage.eINSTANCE.getIntValueStyle_IntValue(), newRowSize);
									SetValueCommand resizeRowCommand = new SetValueCommand(resizeRowRequest);
									resizeCommand.add(resizeRowCommand);

								} else if (value == null && newRowSize != DefaultSizeUtils.getDefaultCellHeight()) {
									value = NattablestyleFactory.eINSTANCE.createIntValueStyle();
									value.setIntValue(newRowSize);
									value.setName(NamedStyleConstants.AXIS_HEIGHT);
									SetRequest initRowSizeRequest = new SetRequest(tableDomain, currentRowIAxis, NattablestylePackage.eINSTANCE.getStyledElement_Styles(), value);
									SetValueCommand resizeRowCommand = new SetValueCommand(initRowSizeRequest);
									resizeCommand.add(resizeRowCommand);

								}
							}
						}
					}
					if (!resizeCommand.isEmpty()) {
						tableDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(resizeCommand));
					}

				}
			}
		};

		bodyLayerStack.addLayerListener(resizeAxisListener);

	}


	/**
	 * This method is used to get the position of the row or column being modified
	 *
	 * @param event
	 * @return
	 */
	private int getRangeStart(ILayerEvent event) {
		int start = -1;
		if (event instanceof ColumnResizeEvent) {
			ColumnResizeEvent resizeEvent = (ColumnResizeEvent) event;
			// only one element is handled at a time so the start value won't be overwritten
			for (Range current : resizeEvent.getColumnPositionRanges()) {
				start = current.start;
			}
		}
		if (event instanceof RowResizeEvent) {
			RowResizeEvent resizeEvent = (RowResizeEvent) event;
			for (Range current : resizeEvent.getRowPositionRanges()) {
				start = current.start;
			}
		}
		return start;
	}


	/**
	 * Add a listener to the column's header layer in order to update the model
	 *
	 * @param columnHeaderLayerStack
	 */
	private void addColumnHeaderResizeListener(final ColumnHeaderLayerStack columnHeaderLayerStack) {
		resizeColumnHeaderListener = new ILayerListener() {

			@Override
			public void handleLayerEvent(ILayerEvent event) {
				if (event instanceof RowResizeEvent) {
					// get the new values from the index and label headers
					int newHeaderIndexHeight = columnHeaderLayerStack.getColumnIndexDataLayer().getRowHeightByPosition(0);
					int newHeaderLabelHeight = columnHeaderLayerStack.getColumnLabelDataLayer().getRowHeightByPosition(0);
					// get the position of the header being modified
					int resizedHeaderPosition = getRangeStart(event);

					// verify that the event is handled properly
					if (resizedHeaderPosition != -1) {
						final CompositeCommand resizeColumnHeaderCommand = new CompositeCommand("resize ColumnHeader's height"); //$NON-NLS-1$
						TransactionalEditingDomain tableDomain = TableEditingDomainUtils.getTableEditingDomain(table);
						// create a blank variable as its contents can change if the table is inverted or not
						LocalTableHeaderAxisConfiguration localColumnHeaderAxis = null;

						if (!getTable().isInvertAxis()) {
							if (getTable().getLocalColumnHeaderAxisConfiguration() != null) {
								localColumnHeaderAxis = getTable().getLocalColumnHeaderAxisConfiguration();
							} else if (newHeaderIndexHeight != DefaultSizeUtils.getDefaultCellHeight() || newHeaderLabelHeight != DefaultSizeUtils.getDefaultCellHeight()) {
								TableHeaderAxisConfiguration columnHeaderAxis;
								// create the blank feature that will host the new local header
								EStructuralFeature localHeaderFeature = null;
								columnHeaderAxis = getTable().getTableConfiguration().getColumnHeaderAxisConfiguration();
								localColumnHeaderAxis = HeaderAxisConfigurationManagementUtils.transformToLocalHeaderConfiguration(columnHeaderAxis);
								localHeaderFeature = NattablePackage.eINSTANCE.getTable_LocalColumnHeaderAxisConfiguration();

								// commands used to modify the notation file and create the new local header
								IEditCommandRequest initLocalColumnHeaderAxis = new SetRequest(tableDomain, table, localHeaderFeature, localColumnHeaderAxis);
								IElementEditService localColumnHeaderAxisProvider = ElementEditServiceUtils.getCommandProvider(table);
								resizeColumnHeaderCommand.add(localColumnHeaderAxisProvider.getEditCommand(initLocalColumnHeaderAxis));
							}

						} else {
							if (getTable().getLocalRowHeaderAxisConfiguration() != null) {
								// as the axis are inverted the row headers are now the column headers
								localColumnHeaderAxis = getTable().getLocalRowHeaderAxisConfiguration();
							} else if (newHeaderIndexHeight != DefaultSizeUtils.getDefaultCellHeight() || newHeaderLabelHeight != DefaultSizeUtils.getDefaultCellHeight()) {
								// the behavior is now the same as usual
								TableHeaderAxisConfiguration columnHeaderAxis;
								EStructuralFeature localHeaderFeature = null;
								columnHeaderAxis = getTable().getTableConfiguration().getRowHeaderAxisConfiguration();
								localColumnHeaderAxis = HeaderAxisConfigurationManagementUtils.transformToLocalHeaderConfiguration(columnHeaderAxis);
								localHeaderFeature = NattablePackage.eINSTANCE.getTable_LocalRowHeaderAxisConfiguration();

								IEditCommandRequest initLocalColumnHeaderAxis = new SetRequest(tableDomain, table, localHeaderFeature, localColumnHeaderAxis);
								IElementEditService localColumnHeaderAxisProvider = ElementEditServiceUtils.getCommandProvider(table);
								resizeColumnHeaderCommand.add(localColumnHeaderAxisProvider.getEditCommand(initLocalColumnHeaderAxis));
							}

						}


						// manipulate the index layer and as the variables are now fixed this part is common to both the inverted and not inverted case
						if (resizedHeaderPosition == 0 && localColumnHeaderAxis != null) {
							IntValueStyle valueIndex = (IntValueStyle) localColumnHeaderAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.COLUMN_INDEX_HEIGHT);
							if (valueIndex != null && valueIndex.getIntValue() != newHeaderIndexHeight) {
								// the variable to be edited already exists
								SetRequest resizeRowHeaderIndex = new SetRequest(tableDomain, valueIndex, NattablestylePackage.eINSTANCE.getIntValueStyle_IntValue(), newHeaderIndexHeight);
								SetValueCommand resizeColumnHeaderIndexCommand = new SetValueCommand(resizeRowHeaderIndex);
								resizeColumnHeaderCommand.add(resizeColumnHeaderIndexCommand);
							} else if (valueIndex == null && newHeaderIndexHeight != DefaultSizeUtils.getDefaultCellHeight()) {
								// if the variable does not exist, it is created
								valueIndex = NattablestyleFactory.eINSTANCE.createIntValueStyle();
								valueIndex.setIntValue(newHeaderIndexHeight);
								valueIndex.setName(NamedStyleConstants.COLUMN_INDEX_HEIGHT);

								SetRequest initRowHeaderIndexSizeRequest = new SetRequest(tableDomain, localColumnHeaderAxis, NattablestylePackage.eINSTANCE.getStyledElement_Styles(), valueIndex);
								SetValueCommand resizeColumnHeaderIndexCommand = new SetValueCommand(initRowHeaderIndexSizeRequest);
								resizeColumnHeaderCommand.add(resizeColumnHeaderIndexCommand);
							}
						}

						// manipulate the label layer and as the variables are now fixed this part is common to both the inverted and not inverted case
						if (resizedHeaderPosition == 1 && localColumnHeaderAxis != null) {
							IntValueStyle valueLabel = (IntValueStyle) localColumnHeaderAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.COLUMN_LABEL_HEIGHT);
							if (valueLabel != null && valueLabel.getIntValue() != newHeaderLabelHeight) {
								// the variable to be edited already exists
								SetRequest resizeRowHeaderLabel = new SetRequest(tableDomain, valueLabel, NattablestylePackage.eINSTANCE.getIntValueStyle_IntValue(), newHeaderLabelHeight);
								SetValueCommand resizeRowHeaderLabelCommand = new SetValueCommand(resizeRowHeaderLabel);
								resizeColumnHeaderCommand.add(resizeRowHeaderLabelCommand);
							} else if (valueLabel == null && newHeaderLabelHeight != DefaultSizeUtils.getDefaultCellHeight()) {
								// if the variable does not exist, it is created
								valueLabel = NattablestyleFactory.eINSTANCE.createIntValueStyle();
								valueLabel.setIntValue(newHeaderLabelHeight);
								valueLabel.setName(NamedStyleConstants.COLUMN_LABEL_HEIGHT);

								SetRequest initRowHeaderLabelSizeRequest = new SetRequest(tableDomain, localColumnHeaderAxis, NattablestylePackage.eINSTANCE.getStyledElement_Styles(), valueLabel);
								SetValueCommand resizeRowHeaderLabelCommand = new SetValueCommand(initRowHeaderLabelSizeRequest);
								resizeColumnHeaderCommand.add(resizeRowHeaderLabelCommand);
							}
						}

						// all the commands are executed and the variables and their local headers are created or updated
						if (resizeColumnHeaderCommand.canExecute() && !resizeColumnHeaderCommand.isEmpty()) {
							tableDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(resizeColumnHeaderCommand));
						}
					}
				}
			}
		};

		columnHeaderLayerStack.addLayerListener(resizeColumnHeaderListener);

	}


	/**
	 * Add a listener to the row's header layer in order to update the model
	 *
	 * @param rowHeaderLayerStack
	 */
	private void addRowHeaderResizeListener(final RowHeaderLayerStack rowHeaderLayerStack) {
		resizeRowHeaderListener = new ILayerListener() {

			// the behavior of this method is exactly the same as the one before
			@Override
			public void handleLayerEvent(ILayerEvent event) {
				if (event instanceof ColumnResizeEvent) {
					int newHeaderIndexWidth = rowHeaderLayerStack.getRowIndexDataLayer().getColumnWidthByPosition(0);
					int newHeaderLabelWidth = rowHeaderLayerStack.getRowLabelDataLayer().getColumnWidthByPosition(0);
					int resizedHeaderPosition = getRangeStart(event);

					if (resizedHeaderPosition != -1) {
						final CompositeCommand resizeRowHeaderCommand = new CompositeCommand("resize RowHeader's width"); //$NON-NLS-1$
						TransactionalEditingDomain tableDomain = TableEditingDomainUtils.getTableEditingDomain(table);
						LocalTableHeaderAxisConfiguration localRowHeaderAxis = null;


						if (!getTable().isInvertAxis()) {
							if (getTable().getLocalRowHeaderAxisConfiguration() != null) {
								localRowHeaderAxis = getTable().getLocalRowHeaderAxisConfiguration();
							} else if (newHeaderIndexWidth != DefaultSizeUtils.getDefaultRowHeaderWidth() || newHeaderLabelWidth != DefaultSizeUtils.getDefaultRowHeaderWidth()) {
								TableHeaderAxisConfiguration rowHeaderAxis;
								EStructuralFeature localHeaderFeature = null;
								rowHeaderAxis = getTable().getTableConfiguration().getRowHeaderAxisConfiguration();
								localRowHeaderAxis = HeaderAxisConfigurationManagementUtils.transformToLocalHeaderConfiguration(rowHeaderAxis);
								localHeaderFeature = NattablePackage.eINSTANCE.getTable_LocalRowHeaderAxisConfiguration();

								IEditCommandRequest initLocalRowHeaderAxis = new SetRequest(tableDomain, table, localHeaderFeature, localRowHeaderAxis);
								IElementEditService localRowHeaderAxisProvider = ElementEditServiceUtils.getCommandProvider(table);
								resizeRowHeaderCommand.add(localRowHeaderAxisProvider.getEditCommand(initLocalRowHeaderAxis));
							}

						} else {
							if (getTable().getLocalColumnHeaderAxisConfiguration() != null) {
								localRowHeaderAxis = getTable().getLocalColumnHeaderAxisConfiguration();
							} else if (newHeaderIndexWidth != DefaultSizeUtils.getDefaultRowHeaderWidth() || newHeaderLabelWidth != DefaultSizeUtils.getDefaultRowHeaderWidth()) {
								TableHeaderAxisConfiguration rowHeaderAxis;
								EStructuralFeature localHeaderFeature = null;
								rowHeaderAxis = getTable().getTableConfiguration().getColumnHeaderAxisConfiguration();
								localRowHeaderAxis = HeaderAxisConfigurationManagementUtils.transformToLocalHeaderConfiguration(rowHeaderAxis);
								localHeaderFeature = NattablePackage.eINSTANCE.getTable_LocalColumnHeaderAxisConfiguration();

								IEditCommandRequest initLocalRowHeaderAxis = new SetRequest(tableDomain, table, localHeaderFeature, localRowHeaderAxis);
								IElementEditService localRowHeaderAxisProvider = ElementEditServiceUtils.getCommandProvider(table);
								resizeRowHeaderCommand.add(localRowHeaderAxisProvider.getEditCommand(initLocalRowHeaderAxis));
							}

						}

						if (resizedHeaderPosition == 0 && localRowHeaderAxis != null) {
							IntValueStyle valueIndex = (IntValueStyle) localRowHeaderAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.ROW_INDEX_WIDTH);
							if (valueIndex != null && valueIndex.getIntValue() != newHeaderIndexWidth) {
								SetRequest resizeRowHeaderIndex = new SetRequest(tableDomain, valueIndex, NattablestylePackage.eINSTANCE.getIntValueStyle_IntValue(), newHeaderIndexWidth);
								SetValueCommand resizeRowHeaderIndexCommand = new SetValueCommand(resizeRowHeaderIndex);
								resizeRowHeaderCommand.add(resizeRowHeaderIndexCommand);
							} else if (valueIndex == null && newHeaderIndexWidth != DefaultSizeUtils.getDefaultRowHeaderWidth()) {
								valueIndex = NattablestyleFactory.eINSTANCE.createIntValueStyle();
								valueIndex.setIntValue(newHeaderIndexWidth);
								valueIndex.setName(NamedStyleConstants.ROW_INDEX_WIDTH);

								SetRequest initRowHeaderIndexSizeRequest = new SetRequest(tableDomain, localRowHeaderAxis, NattablestylePackage.eINSTANCE.getStyledElement_Styles(), valueIndex);
								SetValueCommand resizeRowHeaderIndexCommand = new SetValueCommand(initRowHeaderIndexSizeRequest);
								resizeRowHeaderCommand.add(resizeRowHeaderIndexCommand);
							}
						}

						if (resizedHeaderPosition == 1 && localRowHeaderAxis != null) {
							IntValueStyle valueLabel = (IntValueStyle) localRowHeaderAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.ROW_LABEL_WIDTH);
							if (valueLabel != null && valueLabel.getIntValue() != newHeaderLabelWidth) {
								SetRequest resizeRowHeaderLabel = new SetRequest(tableDomain, valueLabel, NattablestylePackage.eINSTANCE.getIntValueStyle_IntValue(), newHeaderLabelWidth);
								SetValueCommand resizeRowHeaderLabelCommand = new SetValueCommand(resizeRowHeaderLabel);
								resizeRowHeaderCommand.add(resizeRowHeaderLabelCommand);
							} else if (valueLabel == null && newHeaderLabelWidth != DefaultSizeUtils.getDefaultRowHeaderWidth()) {
								valueLabel = NattablestyleFactory.eINSTANCE.createIntValueStyle();
								valueLabel.setIntValue(newHeaderLabelWidth);
								valueLabel.setName(NamedStyleConstants.ROW_LABEL_WIDTH);

								SetRequest initRowHeaderLabelSizeRequest = new SetRequest(tableDomain, localRowHeaderAxis, NattablestylePackage.eINSTANCE.getStyledElement_Styles(), valueLabel);
								SetValueCommand resizeRowHeaderLabelCommand = new SetValueCommand(initRowHeaderLabelSizeRequest);
								resizeRowHeaderCommand.add(resizeRowHeaderLabelCommand);
							}
						}


						if (resizeRowHeaderCommand.canExecute() && !resizeRowHeaderCommand.isEmpty()) {
							tableDomain.getCommandStack().execute(new GMFtoEMFCommandWrapper(resizeRowHeaderCommand));
						}
					}
				}
			}
		};

		rowHeaderLayerStack.addLayerListener(resizeRowHeaderListener);

	}

	/**
	 *
	 * @param event
	 *            an event
	 * @return
	 *         a LocationValue for the point, which contains informations about this location (TableGridRegion, row and column index, row and column
	 *         elements, the cell, the point and its translation).
	 *         Some of these values can be <code>null</code> or not depending of the region of the table
	 */
	@Override
	public LocationValue getLocationInTheTable(final Point absolutePoint) {
		final Point widgetPoint = this.natTable.toControl(absolutePoint.x, absolutePoint.y);
		TableGridRegion kind = TableGridRegion.UNKNOWN;
		int columnPosition = this.natTable.getColumnPositionByX(widgetPoint.x);
		int columnIndex = this.natTable.getColumnIndexByPosition(columnPosition);
		int rowPosition = this.natTable.getRowPositionByY(widgetPoint.y);
		int rowIndex = this.natTable.getRowIndexByPosition(rowPosition);
		final ILayerCell cell = this.natTable.getCellByPosition(columnPosition, rowPosition);
		Object columnObject = null;
		Object rowObject = null;
		if (rowIndex == -1 && columnIndex == -1) {
			kind = TableGridRegion.UNKNOWN;
		} else if (rowIndex == -1) {
			kind = TableGridRegion.AFTER_ROW_HEADER;
		} else if (columnIndex == -1) {
			kind = TableGridRegion.AFTER_COLUMN_HEADER;
		} else {
			if (cell != null) {
				LabelStack label = cell.getConfigLabels();
				if (label.hasLabel(GridRegion.ROW_HEADER)) {
					kind = TableGridRegion.ROW_HEADER;

				} else if (label.hasLabel(GridRegion.COLUMN_HEADER)) {
					kind = TableGridRegion.COLUMN_HEADER;

				} else if (label.hasLabel(GridRegion.CORNER)) {
					kind = TableGridRegion.CORNER;
				} else if (label.hasLabel(GridRegion.BODY)) {
					kind = TableGridRegion.CELL;
					columnObject = getColumnElement(columnIndex);
					rowObject = getRowElement(rowIndex);
				}
			}
		}
		return new LocationValue(absolutePoint, widgetPoint, kind, cell, columnIndex, rowIndex, columnObject, rowObject);
	}


	public GridLayer getGridLayer() {
		return this.gridLayer;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#print()
	 *
	 */
	@Override
	public void print() {
		this.natTable.doCommand(new TurnViewportOffCommand());
		this.natTable.doCommand(new PrintCommand(this.natTable.getConfigRegistry(), this.natTable.getShell()));
		this.natTable.doCommand(new TurnViewportOnCommand());
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#selectAll()
	 *
	 */
	@Override
	public void selectAll() {
		this.natTable.doCommand(new SelectAllCommand());
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#exportToXLS()
	 *
	 */
	@Override
	public void exportToXLS() {
		this.natTable.doCommand(new ExportCommand(this.natTable.getConfigRegistry(), this.natTable.getShell()));
	}

	public void copyToClipboard() {
		this.natTable.doCommand(new CopyDataToClipboardCommand("\t", "\n", this.natTable.getConfigRegistry()));
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#getBodyLayerStack()
	 *
	 * @return
	 */
	@Override
	public BodyLayerStack getBodyLayerStack() {
		return this.bodyLayerStack;
	}

	@Override
	public void dispose() {
		if (this.bodyDataProvider != null) {
			this.bodyLayerStack.removeLayerListener(resizeAxisListener);
			this.bodyDataProvider.dispose();
		}
		if (this.rowHeaderDataProvider != null) {
			this.rowHeaderLayerStack.removeLayerListener(resizeRowHeaderListener);
			this.rowHeaderDataProvider.dispose();
		}
		if (this.columnHeaderDataProvider != null) {
			this.columnHeaderLayerStack.removeLayerListener(resizeColumnHeaderListener);
			this.columnHeaderDataProvider.dispose();
		}

		this.tableContext = null;
	}

	public EObject getTableContext() {
		return this.tableContext;
	}

	@Override
	public Table getTable() {
		return this.table;
	}

	/**
	 *
	 * @return
	 *         the created sort model to use for
	 */
	protected IPapyrusSortModel getRowSortModel() {
		if (this.rowSortModel == null) {
			this.rowSortModel = new ColumnSortModel(this);
		}
		return this.rowSortModel;
	}

	/**
	 *
	 *
	 * Configuration used for cell edition in the table
	 */
	private class CellEditionConfiguration extends AbstractRegistryConfiguration {

		/**
		 *
		 * @see org.eclipse.nebula.widgets.nattable.config.IConfiguration#configureRegistry(org.eclipse.nebula.widgets.nattable.config.IConfigRegistry)
		 *
		 * @param configRegistry
		 */
		@Override
		public void configureRegistry(IConfigRegistry configRegistry) {
			configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITABLE_RULE, new EditableRule() {

				@Override
				public boolean isEditable(final int columnIndex, final int rowIndex) {
					final Object rowElement = getRowElement(rowIndex);
					final Object columnElement = getColumnElement(columnIndex);
					return CellManagerFactory.INSTANCE.isCellEditable(columnElement, rowElement);
				}
			});

			configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITOR, null, DisplayMode.EDIT, ""); //$NON-NLS-1$
		}
	}

	/**
	 *
	 * Handles the selections from the model explorer to the table when the link is activated
	 *
	 * @see org.eclipse.papyrus.infra.nattable.utils.AxisUtils
	 * @see org.eclipse.nebula.widgets.nattable.selection.SelectionLayer
	 *
	 * @param elementList
	 */
	@Override
	public boolean revealElement(Object element) {

		return revealElement(Collections.singleton(element));
	}

	@Override
	public boolean revealElement(Collection<?> elements) {

		boolean selectObject = false;
		SelectionLayer selectionLayer = bodyLayerStack.getSelectionLayer();
		List<Object> rowObjects = getRowElementsList();
		List<Object> columnObjects = getColumnElementsList();

		// clear the selectionLayer to avoid the previous selections to mess with the current
		selectionLayer.clear();

		for (int rowIndex = 0; rowIndex < rowObjects.size(); rowIndex++) {
			List<?> toFind = new ArrayList<Object>(elements);
			Object currentAxisObject = rowObjects.get(rowIndex);
			Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
			if (toFind.contains(currentRealObject)) {
				selectionLayer.doCommand(new SelectRowsCommand(selectionLayer, 0, rowIndex, false, true));
				// we remove the found object from the cloned elementList as they are already selected
				toFind.remove(currentRealObject);
				selectObject = true;
			}
			if (toFind.isEmpty()) {
				// all objects are selected
				return selectObject;
			}
		}

		for (int columnIndex = 0; columnIndex < columnObjects.size(); columnIndex++) {
			List<?> toFind = new ArrayList<Object>(elements);
			Object currentAxisObject = columnObjects.get(columnIndex);
			Object currentRealObject = AxisUtils.getRepresentedElement(currentAxisObject);
			if (toFind.contains(currentRealObject)) {
				selectionLayer.doCommand(new SelectColumnCommand(selectionLayer, columnIndex, 0, false, true));
				// we remove the found object from the cloned elementList as they are already selected
				toFind.remove(currentRealObject);
				selectObject = true;
			}
			if (toFind.isEmpty()) {
				// all objects are selected
				return selectObject;
			}
		}

		return selectObject;
	}


	/**
	 *
	 * Handles the initialization of the table's body resize styles, on opening, based on the previous changes made by the user.
	 *
	 */
	protected void initTableAxis() {
		DataLayer tableBodyLayer = getBodyLayerStack().getBodyDataLayer();
		// notation lists represent the elements that are instantiated in their table instance inside the model.notation file
		List<IAxis> notationColumnsAxisList = getTable().getCurrentColumnAxisProvider().getAxis();
		List<IAxis> notationRowsAxisList = getTable().getCurrentRowAxisProvider().getAxis();
		// actual number of displayed elements when looking at the table editor
		int actualColumnAxisElements = getTableAxisElementProvider().getColumnElementsList().size();
		int actualRowAxisElements = getTableAxisElementProvider().getRowElementsList().size();
		// value, width or height, of the resized column or row
		IntValueStyle value = null;

		// we go through all the elements to find those which have been modified
		for (int index = 0; index < notationColumnsAxisList.size(); index++) {
			IAxis currentColumnAxis = notationColumnsAxisList.get(index);
			// we need both to detect and use the correct value, width or height, of the handled element as the user could have modified the table when the axis was inverted
			if (!getTable().isInvertAxis()) {
				int axisWidth = tableBodyLayer.getColumnWidthByPosition(index);
				value = (IntValueStyle) currentColumnAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.AXIS_WIDTH);
				if (value != null) {
					// we set the size of the axis in the graphical representation
					tableBodyLayer.setColumnWidthByPosition(index, value.getIntValue());
				} else if (axisWidth != DefaultSizeUtils.getDefaultCellWidth()) {
					// resets the size in case of an undo to the default table
					tableBodyLayer.setColumnWidthByPosition(index, DefaultSizeUtils.getDefaultCellWidth());
				}
			} else {
				int axisHeight = tableBodyLayer.getRowHeightByPosition(index);
				value = (IntValueStyle) currentColumnAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.AXIS_HEIGHT);
				if (value != null) {
					tableBodyLayer.setRowHeightByPosition(index, value.getIntValue());
				} else if (axisHeight != DefaultSizeUtils.getDefaultCellHeight()) {
					tableBodyLayer.setRowHeightByPosition(index, DefaultSizeUtils.getDefaultCellHeight());
				}
			}
		}

		for (int index = 0; index < notationRowsAxisList.size(); index++) {
			IAxis currentRowAxis = notationRowsAxisList.get(index);
			if (!getTable().isInvertAxis()) {
				int axisHeight = tableBodyLayer.getRowHeightByPosition(index);
				value = (IntValueStyle) currentRowAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.AXIS_HEIGHT);
				if (value != null) {
					tableBodyLayer.setRowHeightByPosition(index, value.getIntValue());
				} else if (axisHeight != DefaultSizeUtils.getDefaultCellHeight()) {
					tableBodyLayer.setRowHeightByPosition(index, DefaultSizeUtils.getDefaultCellHeight());
				}
			} else {
				int axisWidth = tableBodyLayer.getColumnWidthByPosition(index);
				value = (IntValueStyle) currentRowAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.AXIS_WIDTH);
				if (value != null) {
					tableBodyLayer.setColumnWidthByPosition(index, value.getIntValue());
				} else if (axisWidth != DefaultSizeUtils.getDefaultCellWidth()) {
					tableBodyLayer.setColumnWidthByPosition(index, DefaultSizeUtils.getDefaultCellWidth());
				}
			}
		}

		// this method is used to resize by default. In the actual state, only the rows, representing the table's core elements, are missing from the notation file
		if (notationRowsAxisList.size() == 0) {
			if (getTable().isInvertAxis()) {
				for (int index = 0; index < actualColumnAxisElements; index++) {
					tableBodyLayer.setColumnWidthByPosition(index, DefaultSizeUtils.getDefaultCellWidth());
				}

			} else if (!getTable().isInvertAxis()) {
				for (int index = 0; index < actualRowAxisElements; index++) {
					tableBodyLayer.setRowHeightByPosition(index, DefaultSizeUtils.getDefaultCellHeight());
				}

			}
		}

	}


	/**
	 *
	 * Handles the initialization of the table's headers resize styles, on opening, based on the previous changes made by the user.
	 *
	 */
	protected void initTableHeaders() {
		DataLayer tableRowIndexHeaderLayer = rowHeaderLayerStack.getRowIndexDataLayer();
		DataLayer tableRowLabelHeaderLayer = rowHeaderLayerStack.getRowLabelDataLayer();
		DataLayer tableColumnIndexHeaderLayer = columnHeaderLayerStack.getColumnIndexDataLayer();
		DataLayer tableColumnLabelHeaderLayer = columnHeaderLayerStack.getColumnLabelDataLayer();
		AbstractHeaderAxisConfiguration rowHeader = HeaderAxisConfigurationManagementUtils.getRowAbstractHeaderAxisConfigurationUsedInTable(getTable());
		AbstractHeaderAxisConfiguration columnHeader = HeaderAxisConfigurationManagementUtils.getColumnAbstractHeaderAxisConfigurationUsedInTable(getTable());

		// handles the initialization for the column headers,
		// check if the the user saved the table with an inverted axis or not as it would change the type of style required for resize,
		// it is important to note that AbstractHeaderAxisConfigurationUsedInTable already handles the invertAxis parameter to return the correct Axis (column/row)
		IntValueStyle valueColumnIndex = (IntValueStyle) columnHeader.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.COLUMN_INDEX_HEIGHT);
		// check if the user has previously entered a value for it, if not resets to the default
		if (valueColumnIndex != null) {
			tableColumnIndexHeaderLayer.setRowHeightByPosition(0, valueColumnIndex.getIntValue());
		} else {
			tableColumnIndexHeaderLayer.setRowHeightByPosition(0, DefaultSizeUtils.getDefaultCellHeight());
		}

		// same here
		IntValueStyle valueColumnLabel = (IntValueStyle) columnHeader.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.COLUMN_LABEL_HEIGHT);
		if (valueColumnLabel != null) {
			tableColumnLabelHeaderLayer.setRowHeightByPosition(0, valueColumnLabel.getIntValue());
		} else {
			tableColumnLabelHeaderLayer.setRowHeightByPosition(0, DefaultSizeUtils.getDefaultCellHeight());
		}

		// same behavior but with the row headers
		IntValueStyle valueRowIndex = (IntValueStyle) rowHeader.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.ROW_INDEX_WIDTH);
		if (valueRowIndex != null) {
			tableRowIndexHeaderLayer.setColumnWidthByPosition(0, valueRowIndex.getIntValue());
		} else {
			tableRowIndexHeaderLayer.setColumnWidthByPosition(0, DefaultSizeUtils.getDefaultRowHeaderWidth());
		}

		IntValueStyle valueRowLabel = (IntValueStyle) rowHeader.getNamedStyle(NattablestylePackage.eINSTANCE.getIntValueStyle(), NamedStyleConstants.ROW_LABEL_WIDTH);
		if (valueRowLabel != null) {
			tableRowLabelHeaderLayer.setColumnWidthByPosition(0, valueRowLabel.getIntValue());
		} else {
			tableRowLabelHeaderLayer.setColumnWidthByPosition(0, DefaultSizeUtils.getDefaultRowHeaderWidth());
		}

	}


	/**
	 *
	 * Handles the initialization of the table's cell merges, on opening, based on the previous changes made by the user.
	 *
	 */
	protected void initTableMerge() {
		// clears the previous spanning (== merge) behavior that would interfere with the new one
		clearTableSpan();

		// the four booleans that indicate the type of merge currently used in the table: all columns, all rows, selected rows, selected columns
		BooleanValueStyle valueRow = (BooleanValueStyle) HeaderAxisConfigurationManagementUtils.getRowAbstractHeaderAxisConfigurationUsedInTable(getTable())
				.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_ROWS);
		BooleanValueStyle valueColumn = (BooleanValueStyle) HeaderAxisConfigurationManagementUtils.getColumnAbstractHeaderAxisConfigurationUsedInTable(getTable())
				.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_COLUMNS);
		boolean mergeSelectedRows = getToMergeRowBoolean();
		boolean mergeSelectedColumns = getToMergeColumnBoolean();

		// notation lists represent the elements that are instantiated in their table instance inside the model.notation file
		List<IAxis> notationColumnsAxisList = getTable().getCurrentColumnAxisProvider().getAxis();
		List<IAxis> notationRowsAxisList = getTable().getCurrentRowAxisProvider().getAxis();
		// list of the selected Axis indexes
		List<Integer> selectedAxisIndex = new ArrayList<Integer>();

		// the two conditions below handle the merge of all the columns/rows
		if (valueRow != null && valueRow.isBooleanValue()) {
			// it is important to note that AbstractHeaderAxisConfigurationUsedInTable already handles the invertAxis parameter to return the correct Header (column/row)
			bodyLayerStack.getBodyLayerSpanProvider().setAutoColumnSpan(true);
		}
		if (valueColumn != null && valueColumn.isBooleanValue()) {
			bodyLayerStack.getBodyLayerSpanProvider().setAutoRowSpan(true);
		}

		// the two conditions below handle the merge of the selected columns/rows
		if (mergeSelectedRows) {
			// check the axis' boolean to know if it has to be merged or not in the selection
			if (!getTable().isInvertAxis()) {
				for (int index = 0; index < notationRowsAxisList.size(); index++) {
					IAxis currentAxis = notationRowsAxisList.get(index);
					BooleanValueStyle currentAxisMergeBoolean = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_ROWS);
					if (currentAxisMergeBoolean != null && currentAxisMergeBoolean.isBooleanValue()) {
						selectedAxisIndex.add(index);
					}
				}
			} else {
				// this behavior checks the merge boolean, if any, as the rows are now columns and vice versa
				for (int index = 0; index < notationColumnsAxisList.size(); index++) {
					IAxis currentAxis = notationColumnsAxisList.get(index);
					BooleanValueStyle currentAxisMergeBoolean = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_ROWS);
					if (currentAxisMergeBoolean != null && currentAxisMergeBoolean.isBooleanValue()) {
						selectedAxisIndex.add(index);
					}
				}
			}

			// the spanning can now be set correctly
			bodyLayerStack.getBodyLayerSpanProvider().setAutoColumnSpan(true);
			bodyLayerStack.getBodyLayerSpanProvider().addAutoSpanningRowPositions(selectedAxisIndex.toArray(new Integer[selectedAxisIndex.size()]));
		}
		// same behavior for the column axis
		if (mergeSelectedColumns) {
			if (!getTable().isInvertAxis()) {
				for (int index = 0; index < notationColumnsAxisList.size(); index++) {
					IAxis currentAxis = notationColumnsAxisList.get(index);
					BooleanValueStyle currentAxisMergeBoolean = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_COLUMNS);
					if (currentAxisMergeBoolean != null && currentAxisMergeBoolean.isBooleanValue()) {
						selectedAxisIndex.add(index);
					}
				}
			} else {
				for (int index = 0; index < notationRowsAxisList.size(); index++) {
					IAxis currentAxis = notationRowsAxisList.get(index);
					BooleanValueStyle currentAxisMergeBoolean = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_COLUMNS);
					if (currentAxisMergeBoolean != null && currentAxisMergeBoolean.isBooleanValue()) {
						selectedAxisIndex.add(index);
					}
				}
			}

			bodyLayerStack.getBodyLayerSpanProvider().setAutoRowSpan(true);
			bodyLayerStack.getBodyLayerSpanProvider().addAutoSpanningColumnPositions(selectedAxisIndex.toArray(new Integer[selectedAxisIndex.size()]));
		}
	}


	/**
	 * Clears the merge behavior currently used in the table
	 */
	protected void clearTableSpan() {
		bodyLayerStack.getBodyLayerSpanProvider().clearAutoSpanningColumnPositions();
		bodyLayerStack.getBodyLayerSpanProvider().clearAutoSpanningRowPositions();
		bodyLayerStack.getBodyLayerSpanProvider().setAutoColumnSpan(false);
		bodyLayerStack.getBodyLayerSpanProvider().setAutoRowSpan(false);
	}


	/**
	 *
	 * @return
	 *         The boolean indicating that some row axis are to be merged in the selection
	 */
	protected boolean getToMergeRowBoolean() {
		// for(IAxis currentAxis : getTable().getCurrentRowAxisProvider().getAxis()) {
		// the above test does not allow a quick switch between invertAxis and not as the provider will deliver the same list in both states
		for (Object currentObject : getRowElementsList()) {
			if (currentObject instanceof IAxis) {
				IAxis currentAxis = (IAxis) currentObject;
				BooleanValueStyle axisToMerge = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_ROWS);
				if (axisToMerge != null && axisToMerge.isBooleanValue()) {
					// one axis has a merge boolean to true hence the table was previously merged
					return true;
				}
			}
		}
		return false;
	}

	/**
	 *
	 * @return
	 *         The boolean indicating that some column axis are to be merged in the selection
	 */
	protected boolean getToMergeColumnBoolean() {
		// for(IAxis currentAxis : getTable().getCurrentColumnAxisProvider().getAxis()) {
		// the above test does not allow a quick switch between invertAxis and not as the provider will deliver the same list in both states
		for (Object currentObject : getColumnElementsList()) {
			if (currentObject instanceof IAxis) {
				IAxis currentAxis = (IAxis) currentObject;
				BooleanValueStyle axisToMerge = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_COLUMNS);
				if (axisToMerge != null && axisToMerge.isBooleanValue()) {
					// one axis has a merge boolean to true hence the table was previously merged
					return true;
				}
			}
		}
		return false;
	}

	/**
	 *
	 * @return
	 *         The boolean indicating if the toggle of the currently used menu is to be set to true or not.
	 *         i.e. if the current selection is the same that the previously merged selection
	 */
	protected boolean getToggleStateSelectedRows() {
		// the size of the selection used to see if an axis has been selected
		int selectionSize = bodyLayerStack.getSelectionLayer().getFullySelectedRowPositions().length;
		// fetch the merge booleans of the selected rows and return false if the selection does not match the previously merged rows
		for (int index : bodyLayerStack.getSelectionLayer().getFullySelectedRowPositions()) {
			Object currentObject = getRowElement(index);
			if (getRowElement(index) instanceof IAxis) {
				IAxis currentAxis = (IAxis) currentObject;
				BooleanValueStyle axisToMerge = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_ROWS);
				if ((axisToMerge != null && !axisToMerge.isBooleanValue()) || (axisToMerge == null)) {
					return false;
				}
			}
		}

		// as the user may have selected only a cell or a column, those cases must be taken into account
		if (selectionSize > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *
	 * @return
	 *         The boolean indicating if the toggle of the currently used menu is to be set to true or not.
	 *         i.e. if the current selection is the same that the previously merged selection
	 */
	protected boolean getToggleStateSelectedColumns() {
		// the size of the selection used to see if an axis has been selected
		int selectionSize = bodyLayerStack.getSelectionLayer().getFullySelectedColumnPositions().length;
		// fetch the merge booleans of the selected rows and return false if the selection does not match the previously merged columns
		for (int index : bodyLayerStack.getSelectionLayer().getFullySelectedColumnPositions()) {
			Object currentObject = getColumnElement(index);
			if (getColumnElement(index) instanceof IAxis) {
				IAxis currentAxis = (IAxis) currentObject;
				BooleanValueStyle axisToMerge = (BooleanValueStyle) currentAxis.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_IN_SELECTED_COLUMNS);
				if ((axisToMerge != null && !axisToMerge.isBooleanValue()) || (axisToMerge == null)) {
					return false;
				}
			}
		}

		// as the user may have selected only a cell or a column, those cases must be taken into account
		if (selectionSize > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *
	 * @return
	 *         The boolean indicating if the toggle of the currently used menu is to be set to true or not.
	 *         i.e. if the current selection is the same that the previously merged selection
	 */
	protected boolean getToggleStateAllRows() {
		BooleanValueStyle mergeRows = (BooleanValueStyle) HeaderAxisConfigurationManagementUtils.getRowAbstractHeaderAxisConfigurationUsedInTable(getTable())
				.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_ROWS);
		if (mergeRows != null && mergeRows.isBooleanValue()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *
	 * @return
	 *         The boolean indicating if the toggle of the currently used menu is to be set to true or not.
	 *         i.e. if the current selection is the same that the previously merged selection
	 */
	protected boolean getToggleStateAllColumns() {
		BooleanValueStyle mergeColumns = (BooleanValueStyle) HeaderAxisConfigurationManagementUtils.getColumnAbstractHeaderAxisConfigurationUsedInTable(getTable())
				.getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_COLUMNS);
		if (mergeColumns != null && mergeColumns.isBooleanValue()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 *
	 * @param adapter
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		if (adapter == TableSelectionProvider.class) {
			return this.selectionProvider;
		}
		if (adapter == TableSelectionWrapper.class) {
			ISelection selection = this.selectionProvider.getSelection();
			if (selection instanceof TableStructuredSelection) {
				return ((TableStructuredSelection) selection).getAdapter((TableSelectionWrapper.class));
			}
		}
		if (adapter == TableStructuredSelection.class) {
			ISelection selection = this.selectionProvider.getSelection();
			if (selection instanceof TableStructuredSelection) {
				return selection;
			}
		}
		return null;

	}

	/**
	 *
	 * @return
	 *         a {@link TableStructuredSelection} representing the current selection of the table or <code>null</code> when there is no selection
	 */
	protected final TableStructuredSelection getSelectionInTable() {
		ISelection selection = this.selectionProvider.getSelection();
		if (selection instanceof TableStructuredSelection) {
			return (TableStructuredSelection) selection;
		}
		return null;
	}

	/**
	 *
	 * @return
	 *         a map representing index of fully selected rows linked to the associated element
	 *
	 *         The returned value can't be <code>null</code>
	 */
	protected final Map<Integer, Object> getFullySelectedRows() {
		TableStructuredSelection selection = getSelectionInTable();
		if (selection != null) {
			TableSelectionWrapper selectionWrapper = (TableSelectionWrapper) selection.getAdapter(TableSelectionWrapper.class);
			if (selectionWrapper != null) {
				return selectionWrapper.getFullySelectedRows();
			}
		}
		return Collections.emptyMap();
	}

	/**
	 *
	 * @return
	 *         a map representing index of fully selected columns linked to the associated element
	 *
	 *         The returned value can't be <code>null</code>
	 */
	protected final Map<Integer, Object> getFullySelectedColumns() {
		TableStructuredSelection selection = getSelectionInTable();
		if (selection != null) {
			TableSelectionWrapper selectionWrapper = (TableSelectionWrapper) selection.getAdapter(TableSelectionWrapper.class);
			if (selectionWrapper != null) {
				return selectionWrapper.getFullySelectedColumns();
			}
		}
		return Collections.emptyMap();
	}
}
