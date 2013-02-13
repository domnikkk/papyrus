/*****************************************************************************
 * Copyright (c) 2009 CEA LIST & LIFL
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *  Vincent Lorenzo (CEA-LIST) vincent.lorenzo@cea.fr
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.common.editor;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.AbstractUiBindingConfiguration;
import org.eclipse.nebula.widgets.nattable.config.EditableRule;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.config.IConfiguration;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.edit.EditConfigAttributes;
import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.grid.data.DefaultCornerDataProvider;
import org.eclipse.nebula.widgets.nattable.grid.layer.CornerLayer;
import org.eclipse.nebula.widgets.nattable.grid.layer.GridLayer;
import org.eclipse.nebula.widgets.nattable.layer.DataLayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.print.config.DefaultPrintBindings;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.nebula.widgets.nattable.ui.action.IMouseAction;
import org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry;
import org.eclipse.nebula.widgets.nattable.ui.matcher.MouseEventMatcher;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.nattable.common.Activator;
import org.eclipse.papyrus.infra.nattable.common.dataprovider.BodyDataProvider;
import org.eclipse.papyrus.infra.nattable.common.dataprovider.ColumnHeaderDataProvider;
import org.eclipse.papyrus.infra.nattable.common.dataprovider.RowHeaderDataProvider;
import org.eclipse.papyrus.infra.nattable.common.layerstack.BodyLayerStack;
import org.eclipse.papyrus.infra.nattable.common.layerstack.ColumnHeaderLayerStack;
import org.eclipse.papyrus.infra.nattable.common.layerstack.RowHeaderLayerStack;
import org.eclipse.papyrus.infra.nattable.common.listener.NatTableDropListener;
import org.eclipse.papyrus.infra.nattable.common.manager.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.common.manager.NattableModelManager;
import org.eclipse.papyrus.infra.nattable.common.provider.TableSelectionProvider;
import org.eclipse.papyrus.infra.nattable.common.solver.CellManagerFactory;
import org.eclipse.papyrus.infra.nattable.common.utils.TableEditorInput;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablecontentprovider.IAxisContentsProvider;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;


/**
 * Abstract class for TableEditor
 *
 *
 *
 */
public abstract class AbstractEMFNattableEditor extends EditorPart {

	/** the service registry */
	protected ServicesRegistry servicesRegistry;

	/** the table instance */
	protected Table rawModel;

	protected INattableModelManager tableManager;

	private NatTable natTable;

	private MenuManager menuMgr;

	private TableSelectionProvider selectionProvider;

	private PartNameSynchronizer synchronizer;

	/**
	 * @param servicesRegistry
	 * @param rawModel
	 *
	 */
	public AbstractEMFNattableEditor(final ServicesRegistry servicesRegistry, final Table rawModel) {
		this.servicesRegistry = servicesRegistry;
		this.rawModel = rawModel;
		this.synchronizer = new PartNameSynchronizer(rawModel);
	}

	/**
	 *
	 * @see org.eclipse.emf.facet.widgets.nattable.workbench.editor.NatTableEditor#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 *
	 * @param site
	 * @param input
	 * @throws PartInitException
	 */
	@Override
	public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
		final TableEditorInput tableEditorInput = new TableEditorInput(this.rawModel, getEditingDomain());

		setSite(site);
		setInput(tableEditorInput);
		setPartName(this.rawModel.getName());
		// addListeners();
		//FIXME : super is required?
		//		super.init(site, tableEditorInput);
	}


	@Override
	public void createPartControl(final Composite parent) {

		this.tableManager = new NattableModelManager(this.rawModel);

		final BodyDataProvider fBodyDataProvider = new BodyDataProvider(this.tableManager);
		final BodyLayerStack fBodyLayer = new BodyLayerStack(fBodyDataProvider);;

		final IDataProvider colHeaderDataProvider = new ColumnHeaderDataProvider(this.tableManager);
		final ColumnHeaderLayerStack columnHeaderLayer = new ColumnHeaderLayerStack(colHeaderDataProvider, fBodyLayer, fBodyDataProvider);

		final IDataProvider rowHeaderDataProvider = new RowHeaderDataProvider(this.tableManager);


		final RowHeaderLayerStack rowHeaderLayer = new RowHeaderLayerStack(rowHeaderDataProvider, fBodyLayer);


		final IDataProvider cornerDataProvider = new DefaultCornerDataProvider(colHeaderDataProvider, rowHeaderDataProvider) {

			@Override
			public Object getDataValue(final int columnIndex, final int rowIndex) {
				return "Invert Axis";
			}

			@Override
			public int getColumnCount() {
				return 1;
			}

			@Override
			public int getRowCount() {
				return 1;
			}
		};
		final CornerLayer cornerLayer = new CornerLayer(new DataLayer(cornerDataProvider), rowHeaderLayer, columnHeaderLayer);
		final GridLayer gridLayer = new GridLayer(fBodyLayer, columnHeaderLayer, rowHeaderLayer, cornerLayer);


		//add action on the left corner
		cornerLayer.addConfiguration(new AbstractUiBindingConfiguration() {

			@Override
			public void configureUiBindings(final UiBindingRegistry uiBindingRegistry) {
				uiBindingRegistry.registerSingleClickBinding(new MouseEventMatcher(GridRegion.CORNER), new IMouseAction() {

					@Override
					public void run(final NatTable natTable, final MouseEvent event) {
						final CompoundCommand cmd = new CompoundCommand("Switch Lines and Columns");
						final IAxisContentsProvider vertical = AbstractEMFNattableEditor.this.rawModel.getVerticalContentProvider();

						final IAxisContentsProvider horizontal = AbstractEMFNattableEditor.this.rawModel.getHorizontalContentProvider();
						final EditingDomain domain = getEditingDomain();
						//FIXME verify that we can exchanges the axis
						Command tmp = new SetCommand(domain, AbstractEMFNattableEditor.this.rawModel, NattablePackage.eINSTANCE.getTable_HorizontalContentProvider(), vertical);
						cmd.append(tmp);

						tmp = new SetCommand(domain, AbstractEMFNattableEditor.this.rawModel, NattablePackage.eINSTANCE.getTable_VerticalContentProvider(), horizontal);
						cmd.append(tmp);
						domain.getCommandStack().execute(cmd);
						//						natTable.refresh();



						// TODO Auto-generated method stub
						//FIXME : exchange lines and rows
						//						natTable.doCommand(new TurnViewportOffCommand());
						//
						//						natTable.doCommand(new PrintCommand(natTable.getConfigRegistry(), natTable.getShell()));
						//
						//						natTable.doCommand(new TurnViewportOnCommand());
						//						System.out.println("something to do");

					}
				});

			}
		});

		gridLayer.addConfiguration(new DefaultPrintBindings());
		//		gridLayer.addConfiguration(new StyleConfiguration());
		//		fBodyLayer.getBodyDataLayer().addConfiguration(new StyleConfiguration());
		//		fBodyLayer.addConfiguration(new StyleConfiguration());


		//for the edition
		//		final ColumnOverrideLabelAccumulator columnLabelAccumulator = new ColumnOverrideLabelAccumulator(fBodyLayer);
		//		fBodyLayer.setConfigLabelAccumulator(columnLabelAccumulator);

		this.natTable = new NatTable(parent, gridLayer, false);


		//for the edition
		//		this.natTable.addConfiguration(editableGridConfiguration(columnLabelAccumulator, fBodyLayer));
		this.natTable.addConfiguration(new IConfiguration() {

			@Override
			public void configureUiBindings(UiBindingRegistry uiBindingRegistry) {
				// TODO Auto-generated method stub

			}

			@Override
			public void configureRegistry(IConfigRegistry configRegistry) {
				configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITABLE_RULE, new EditableRule() {

					@Override
					public boolean isEditable(int columnIndex, int rowIndex) {

						final Object obj1 = rowHeaderDataProvider.getDataValue(1, rowIndex);
						final Object obj2 = colHeaderDataProvider.getDataValue(columnIndex, 1);
						return CellManagerFactory.INSTANCE.isCellEditable(obj1, obj2);
					}
				});

				configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITOR, null, DisplayMode.EDIT, "");

			}

			@Override
			public void configureLayer(ILayer layer) {
				// TODO Auto-generated method stub

			}
		});
		this.natTable.configure();




		addDragAndDropSupport(this.natTable, gridLayer, fBodyLayer);
		//we create a menu manager
		this.menuMgr = new MenuManager("#PopUp", "org.eclipse.papyrus.infra.nattable.common.editor") {

			@Override
			public void add(final IAction action) {
				//				System.out.println(action);
				super.add(action);
			}

			@Override
			public void add(final IContributionItem item) {
				// TODO Auto-generated method stub
				//				System.out.println(item);
				super.add(item);
			}
		}; //$NON-NLS-1$
		this.menuMgr.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		this.menuMgr.setRemoveAllWhenShown(true);

		final Menu menu = this.menuMgr.createContextMenu(this.natTable);
		this.natTable.setMenu(menu);

		this.selectionProvider = new TableSelectionProvider(fBodyLayer.getSelectionLayer());
		getSite().registerContextMenu(this.menuMgr, this.selectionProvider);
		getSite().setSelectionProvider(this.selectionProvider);

	}

	//	private IConfiguration editableGridConfiguration(final ColumnOverrideLabelAccumulator columnLabelAccumulator, BodyLayerStack fBodyLayer) {
	//		return new AbstractRegistryConfiguration() {
	//
	//			@Override
	//			public void configureRegistry(IConfigRegistry configRegistry) {
	//				//we fill the column label accumulator
	//				String CHECK_BOX_EDITOR_CONFIG_LABEL = "stringEditor";
	//				String CHECK_BOX_CONFIG_LABEL = "stringConfigLabel";
	//
	//				String TYPE_EDITOR_CONFIG_LABEL = "typeEditor";
	//				String TYPE_CONFIG_LABEL = "stringConfigLabel";
	//
	//				columnLabelAccumulator.registerColumnOverrides(0, CHECK_BOX_EDITOR_CONFIG_LABEL, CHECK_BOX_CONFIG_LABEL);
	//				columnLabelAccumulator.registerColumnOverrides(1, TYPE_EDITOR_CONFIG_LABEL, TYPE_CONFIG_LABEL);
	//
	//				TextCellEditor textEditor = new TextCellEditor();
	//				configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_PAINTER, new TextPainter(), DisplayMode.EDIT, CHECK_BOX_CONFIG_LABEL);
	//				configRegistry.registerConfigAttribute(CellConfigAttributes.DISPLAY_CONVERTER, new DefaultBooleanDisplayConverter() {
	//
	//					@Override
	//					public Object displayToCanonicalValue(Object displayValue) {
	//						return "";
	//					}
	//
	//					@Override
	//					public Object canonicalToDisplayValue(Object canonicalValue) {
	//						if(canonicalValue == null) {
	//							return null;
	//						} else {
	//							return canonicalValue.toString();
	//						}
	//					}
	//
	//				}, DisplayMode.EDIT, CHECK_BOX_CONFIG_LABEL);
	//
	//				configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITOR, textEditor, DisplayMode.EDIT, CHECK_BOX_EDITOR_CONFIG_LABEL);
	//
	//
	//				List<String> canonicalValues = new ArrayList<String>();
	//				canonicalValues.add("a");
	//				canonicalValues.add("b");
	//				canonicalValues.add("c");
	//				ComboBoxCellEditor comboEditor = new ComboBoxCellEditor(canonicalValues);
	//
	//				configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_PAINTER, new ComboBoxPainter(), DisplayMode.EDIT, TYPE_CONFIG_LABEL);
	//				configRegistry.registerConfigAttribute(CellConfigAttributes.DISPLAY_CONVERTER, new DefaultBooleanDisplayConverter() {
	//
	//					@Override
	//					public Object displayToCanonicalValue(Object displayValue) {
	//						return "";
	//					}
	//
	//					@Override
	//					public Object canonicalToDisplayValue(Object canonicalValue) {
	//						if(canonicalValue == null) {
	//							return null;
	//						} else {
	//							return canonicalValue.toString();
	//						}
	//					}
	//
	//				}, DisplayMode.EDIT, TYPE_CONFIG_LABEL);
	//
	//				configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITOR, comboEditor, DisplayMode.EDIT, TYPE_EDITOR_CONFIG_LABEL);
	//
	//				// TODO Auto-generated method stub
	//			}
	//		};
	//	}

	/**
	 * Enable the table to receive dropped elements
	 *
	 * @param fBodyLayer
	 * @param gridLayer
	 */
	private void addDragAndDropSupport(final NatTable nattable, GridLayer gridLayer, BodyLayerStack fBodyLayer) {
		final int operations = DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_DEFAULT;
		final DropTarget target = new DropTarget(nattable, operations);
		final LocalTransfer localTransfer = LocalTransfer.getInstance();
		final Transfer[] types = new Transfer[]{ localTransfer };
		target.setTransfer(types);
		final NatTableDropListener dropListener = new NatTableDropListener(nattable, this.tableManager, this.rawModel, gridLayer, fBodyLayer);
		target.addDropListener(dropListener);
	}

	/**
	 *
	 * @see org.eclipse.emf.facet.widgets.nattable.workbench.editor.NatTableEditor#getEditingDomain()
	 *
	 * @return
	 */
	public EditingDomain getEditingDomain() {
		try {
			return ServiceUtils.getInstance().getTransactionalEditingDomain(this.servicesRegistry);
		} catch (final ServiceException e) {
			Activator.log.error(e);
		}
		return null;
	}

	@Override
	public void doSave(final IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getAdapter(final Class adapter) {
		if(adapter == NatTable.class) {
			return this.natTable;
		}
		//		System.out.println(adapter);
		return super.getAdapter(adapter);
	}

	@Override
	public void dispose() {
		this.selectionProvider.dispose();
		this.tableManager.dispose();
		this.synchronizer.dispose();
		super.dispose();

	}

	/**
	 * A class taking in charge the synchronization of the partName and the table name.
	 * When table name change, the other is automatically updated.
	 *
	 *
	 */
	public class PartNameSynchronizer {

		/** the papyrus table */
		private Table papyrusTable;

		/**
		 * Listener on diagram name change.
		 */
		private final Adapter tableNameListener = new AdapterImpl() {

			/**
			 *
			 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 *
			 * @param notification
			 */
			@Override
			public void notifyChanged(final Notification notification) {
				if(notification.getFeature() == NattablePackage.eINSTANCE.getTable_Name()) {
					setPartName(PartNameSynchronizer.this.papyrusTable.getName());
				}
			}
		};

		/**
		 *
		 * Constructor.
		 *
		 * @param diagram
		 */
		public PartNameSynchronizer(final Table papyrusTable) {
			setTable(papyrusTable);
		}

		public void dispose() {
			this.papyrusTable.eAdapters().remove(this.tableNameListener);
			this.papyrusTable = null;
		}

		/**
		 * Change the associated diagram.
		 *
		 * @param papyrusTable
		 */
		public void setTable(final Table papyrusTable) {
			// Remove from old table, if any
			if(this.papyrusTable != null) {
				papyrusTable.eAdapters().remove(this.tableNameListener);
			}
			// Set new table
			this.papyrusTable = papyrusTable;
			// Set editor name
			setPartName(papyrusTable.getName());
			// Listen to name change
			papyrusTable.eAdapters().add(this.tableNameListener);
		}
	}
}
