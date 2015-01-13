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
package org.eclipse.papyrus.infra.nattable.manager.table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.Window;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.command.VisualRefreshCommand;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.hideshow.ColumnHideShowLayer;
import org.eclipse.nebula.widgets.nattable.hideshow.command.MultiColumnHideCommand;
import org.eclipse.nebula.widgets.nattable.hideshow.command.MultiColumnShowCommand;
import org.eclipse.nebula.widgets.nattable.hideshow.command.ShowAllColumnsCommand;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.layer.ILayerListener;
import org.eclipse.nebula.widgets.nattable.layer.event.ILayerEvent;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.nebula.widgets.nattable.ui.NatEventData;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.nattable.Activator;
import org.eclipse.papyrus.infra.nattable.command.CommandIds;
import org.eclipse.papyrus.infra.nattable.dialog.DisplayedAxisSelectorDialog;
import org.eclipse.papyrus.infra.nattable.layerstack.RowHeaderHierarchicalLayerStack;
import org.eclipse.papyrus.infra.nattable.layerstack.RowHeaderLayerStack;
import org.eclipse.papyrus.infra.nattable.listener.HideShowCategoriesTableListener;
import org.eclipse.papyrus.infra.nattable.manager.axis.AxisManagerFactory;
import org.eclipse.papyrus.infra.nattable.manager.axis.CompositeAxisManager;
import org.eclipse.papyrus.infra.nattable.manager.axis.CompositeAxisManagerForEventList;
import org.eclipse.papyrus.infra.nattable.manager.axis.CompositeTreeAxisManagerForEventList;
import org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManager;
import org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManagerForEventList;
import org.eclipse.papyrus.infra.nattable.manager.axis.ICompositeAxisManager;
import org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList;
import org.eclipse.papyrus.infra.nattable.manager.cell.CellManagerFactory;
import org.eclipse.papyrus.infra.nattable.messages.Messages;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureIdAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AbstractHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.LocalTableHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.AbstractAxisProvider;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.IMasterAxisProvider;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.ISlaveAxisProvider;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.NattableaxisproviderPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablecell.Cell;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.CellEditorDeclaration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.NattableconfigurationPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablelabelprovider.FeatureLabelProviderConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablelabelprovider.ILabelProviderConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablelabelprovider.ObjectLabelProviderConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestyleFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle;
import org.eclipse.papyrus.infra.nattable.selection.ISelectionExtractor;
import org.eclipse.papyrus.infra.nattable.selection.ObjectsSelectionExtractor;
import org.eclipse.papyrus.infra.nattable.sort.ColumnSortModel;
import org.eclipse.papyrus.infra.nattable.tree.CollapseAndExpandActionsEnum;
import org.eclipse.papyrus.infra.nattable.tree.DatumExpansionModel;
import org.eclipse.papyrus.infra.nattable.tree.DatumTreeFormat;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.infra.nattable.utils.CellMapKey;
import org.eclipse.papyrus.infra.nattable.utils.CollapseExpandActionHelper;
import org.eclipse.papyrus.infra.nattable.utils.FillingConfigurationUtils;
import org.eclipse.papyrus.infra.nattable.utils.HeaderAxisConfigurationManagementUtils;
import org.eclipse.papyrus.infra.nattable.utils.NattableConfigAttributes;
import org.eclipse.papyrus.infra.nattable.utils.StringComparator;
import org.eclipse.papyrus.infra.nattable.utils.StyleUtils;
import org.eclipse.papyrus.infra.nattable.utils.TableEditingDomainUtils;
import org.eclipse.papyrus.infra.nattable.utils.TableHelper;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.tools.util.EclipseCommandUtils;
import org.eclipse.papyrus.infra.widgets.providers.FlattenableRestrictedFilteredContentProvider;
import org.eclipse.papyrus.infra.widgets.providers.IRestrictedContentProvider;
import org.eclipse.papyrus.infra.widgets.providers.IStaticContentProvider;
import org.eclipse.papyrus.infra.widgets.selectors.ReferenceSelector;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;

import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.TreeList;
import ca.odell.glazedlists.TreeList.Format;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class NattableModelManager extends AbstractNattableWidgetManager implements INattableModelManager, ITreeNattableModelManager {

	/**
	 * the column manager
	 */
	private ICompositeAxisManager columnManager;

	/**
	 * the line manager
	 */
	private ICompositeAxisManager rowManager;

	/**
	 * the model of the table on which we are working
	 */
	private List<Object> verticalElements;

	private List<Object> horizontalElements;

	private Adapter invertAxisListener;

	private AbstractAxisProvider rowProvider;

	private AbstractAxisProvider columnProvider;

	/**
	 * this listener listen the stack events and refresh nattable
	 */
	private CommandStackListener refreshListener;

	/**
	 * the focus listener
	 */
	private FocusListener focusListener;

	/**
	 * the resourceSet listener
	 */
	private ResourceSetListener resourceSetListener;

	/**
	 * layerListener to update the toggles
	 */
	private ILayerListener layerListener;

	/**
	 * we need to keep it to be able to remove listener (required when we destroy the context of the table)
	 */
	private TransactionalEditingDomain contextEditingDomain;

	private TransactionalEditingDomain tableEditingDomain;

	private Adapter changeAxisProvider;

	private AdapterImpl changeAxisProviderHistory;

	private ResourceSetListener hideShowCategoriesListener;
	/**
	 * the listener on the table cells
	 */
	private Adapter tableCellsListener;

	private BiMap<CellMapKey, Cell> cellsMap;

	/**
	 * the local preference store for the table
	 */
	private PreferenceStore localPreferenceStore;

	private TreeList treeList;

	private List<Object> eventList;

	private DatumTreeFormat treeFormat;

	private DatumExpansionModel expansionModel;

	// fields used for refresh
	private Runnable refreshRunnable;
	/** Flag to avoid reentrant call to refresh. */
	private AtomicBoolean isRefreshing = new AtomicBoolean(false);

	public NattableModelManager(final Table rawModel, final ISelectionExtractor selectionExtractor) {
		super(rawModel, selectionExtractor);

		this.tableEditingDomain = TableEditingDomainUtils.getTableEditingDomain(rawModel);
		this.contextEditingDomain = TableEditingDomainUtils.getTableContextEditingDomain(rawModel);

		this.rowProvider = rawModel.getCurrentRowAxisProvider();
		this.columnProvider = rawModel.getCurrentColumnAxisProvider();
		this.verticalElements = Collections.synchronizedList(new ArrayList<Object>());

		if (TableHelper.isTreeTable(rawModel)) {
			this.eventList = GlazedLists.eventList(new ArrayList<Object>());
			// eventList = GlazedLists.threadSafeList(eventList);
			treeFormat = new DatumTreeFormat(new ColumnSortModel(this));
			this.expansionModel = new DatumExpansionModel();
			this.treeList = new TreeList((EventList) eventList, treeFormat, expansionModel);
			this.horizontalElements = this.treeList;// Collections.synchronizedList(this.treeList);
		} else {
			this.horizontalElements = Collections.synchronizedList(new ArrayList<Object>());
		}
		this.cellsMap = HashBiMap.create();

		this.invertAxisListener = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getEventType() == Notification.SET) {
					final Object oldValue = msg.getOldValue();
					final Object newValue = msg.getNewValue();
					if (oldValue != null && newValue != null) {
						if (msg.getFeature() == NattablePackage.eINSTANCE.getTable_InvertAxis()) {
							invertJavaObject();

							// use the method to refresh/merge the table using the appointed values saved in the model.notation
							resizeAxis();
							resizeHeader();
							mergeTable();
							// for the fun of it!
							// in fact it is to fix the test org.eclipse.papyrus.sysml.nattable.requirement.tests.tests.RevealRequirementTableTest.test6SelectMultipleElementsInvertAxisAllColumns()
							// it is a work around and not really a nice fix, because I don't undestand the bug...
							getBodyLayerStack().getRowHideShowLayer().showAllRows();
							getBodyLayerStack().getColumnHideShowLayer().showAllColumns();

						}
					}
				}
			}
		};

		rawModel.eAdapters().add(this.invertAxisListener);
		init();
		// if(rawModel.isInvertAxis()) {
		// invertJavaObject();
		// }

		changeAxisProvider = new AdapterImpl() {

			@Override
			public void notifyChanged(final Notification msg) {
				if (msg.getFeature() == NattablePackage.eINSTANCE.getTable_CurrentColumnAxisProvider() || msg.getFeature() == NattablePackage.eINSTANCE.getTable_CurrentRowAxisProvider()) {
					if (msg.getNewValue() != null) {
						Display.getCurrent().asyncExec(new Runnable() {

							@Override
							public void run() {
								init();
								refreshNatTable();
							}
						});
					}
				}
			}
		};

		changeAxisProviderHistory = new AdapterImpl() {

			@Override
			public void notifyChanged(final Notification msg) {
				if (msg.getFeature() == NattablePackage.eINSTANCE.getTable_ColumnAxisProvidersHistory() || msg.getFeature() == NattablePackage.eINSTANCE.getTable_RowAxisProvidersHistory()) {
					if (msg.getNewValue() != null) {
						Display.getCurrent().asyncExec(new Runnable() {

							@Override
							public void run() {
								init();
							}
						});
					}
				}
			}

		};

		rawModel.eAdapters().add(changeAxisProvider);
		tableCellsListener = new AdapterImpl() {

			@Override
			public void notifyChanged(final Notification msg) {
				if (msg.getFeature() == NattablePackage.eINSTANCE.getTable_Cells()) {
					updateCellMap(msg);
				}
			}
		};
		rawModel.eAdapters().add(tableCellsListener);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param rawModel
	 *
	 *            the model of the managed table
	 */
	public NattableModelManager(final Table rawModel) {
		this(rawModel, new ObjectsSelectionExtractor());
	}

	@Override
	public NatTable createNattable(Composite parent, int style, IWorkbenchPartSite site) {
		updateCellMap(null);
		final NatTable nattable = super.createNattable(parent, style, site);
		this.refreshListener = new CommandStackListener() {

			/**
			 *
			 * @see org.eclipse.emf.common.command.CommandStackListener#commandStackChanged(java.util.EventObject)
			 *
			 * @param event
			 */
			@Override
			public void commandStackChanged(EventObject event) {
				// we refresh the table after each command, only when it is visible
				// its allows to refresh the text and the appearance of the table
				// this refresh doesn't manage the add/remove axis
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {
						if (nattable != null && !nattable.isDisposed() && nattable.isVisible()) {
							nattable.doCommand(new VisualRefreshCommand());
						}
					}
				});

			}
		};

		getContextEditingDomain().getCommandStack().addCommandStackListener(this.refreshListener);
		if (getTableEditingDomain() != getContextEditingDomain()) {
			getTableEditingDomain().getCommandStack().addCommandStackListener(this.refreshListener);
		}
		this.focusListener = new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// nothing to do
			}

			@Override
			public void focusGained(FocusEvent e) {
				updateToggleActionState();
			}
		};
		nattable.addFocusListener(this.focusListener);

		this.layerListener = new ILayerListener() {

			@Override
			public void handleLayerEvent(ILayerEvent event) {
				updateToggleActionState();
			}
		};
		nattable.addLayerListener(layerListener);

		updateToggleActionState();// required, because the focus listener is not notified just after the creation of the widget

		// update the hidden categories
		if (TableHelper.isTreeTable(this)) {
			List<Integer> hiddenDepth = StyleUtils.getHiddenDepths(this);
			if (hiddenDepth.size() > 0) {
				hideShowCategories(hiddenDepth, null);
			}
			this.hideShowCategoriesListener = new HideShowCategoriesTableListener(this);
			getTableEditingDomain().addResourceSetListener(this.hideShowCategoriesListener);
		}


		return nattable;
	}

	/**
	 * this command update the status of the toggle actions
	 */
	protected void updateToggleActionState() {
		final ICommandService commandService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(ICommandService.class);
		if (commandService != null) {

			final AbstractHeaderAxisConfiguration columnAxisConfiguration = HeaderAxisConfigurationManagementUtils.getColumnAbstractHeaderAxisConfigurationUsedInTable(getTable());
			final AbstractHeaderAxisConfiguration rowAxisConfiguration = HeaderAxisConfigurationManagementUtils.getRowAbstractHeaderAxisUsedInTable(getTable());
			// update the header configuration
			org.eclipse.core.commands.Command command = commandService.getCommand(CommandIds.COMMAND_COLUMN_DISPLAY_INDEX_ID);
			updateToggleCommandState(command, columnAxisConfiguration.isDisplayIndex());

			command = commandService.getCommand(CommandIds.COMMAND_COLUMN_DISPLAY_LABEL_ID);
			updateToggleCommandState(command, columnAxisConfiguration.isDisplayLabel());

			command = commandService.getCommand(CommandIds.COMMAND_COLUMN_DISPLAY_INDEX_STYLE_ID);
			updateRadioCommandState(command, columnAxisConfiguration.getIndexStyle().getLiteral());

			command = commandService.getCommand(CommandIds.COMMAND_ROW_DISPLAY_INDEX_ID);
			updateToggleCommandState(command, rowAxisConfiguration.isDisplayIndex());

			command = commandService.getCommand(CommandIds.COMMAND_ROW_DISPLAY_LABEL_ID);
			updateToggleCommandState(command, rowAxisConfiguration.isDisplayLabel());

			command = commandService.getCommand(CommandIds.COMMAND_ROW_DISPLAY_INDEX_STYLE_ID);
			updateRadioCommandState(command, rowAxisConfiguration.getIndexStyle().getLiteral());


			// update the label header configuration
			final List<ILabelProviderConfiguration> columnLabelConfigurations = columnAxisConfiguration.getOwnedLabelConfigurations();
			final List<ILabelProviderConfiguration> rowLabelConfigurations = rowAxisConfiguration.getOwnedLabelConfigurations();
			for (final ILabelProviderConfiguration current : columnLabelConfigurations) {
				if (current instanceof ObjectLabelProviderConfiguration) {
					final ObjectLabelProviderConfiguration labelConfig = (ObjectLabelProviderConfiguration) current;
					command = commandService.getCommand(CommandIds.COMMAND_COLUMN_LABEL_DISPLAY_ICON);
					updateToggleCommandState(command, labelConfig.isDisplayIcon());

					command = commandService.getCommand(CommandIds.COMMAND_COLUMN_LABEL_DISPLAY_LABEL);
					updateToggleCommandState(command, labelConfig.isDisplayLabel());

					if (labelConfig instanceof FeatureLabelProviderConfiguration) {
						final FeatureLabelProviderConfiguration labelFeatureConf = (FeatureLabelProviderConfiguration) labelConfig;
						command = commandService.getCommand(CommandIds.COMMAND_COLUMN_LABEL_FEATURE_DISPLAY_IS_DERIVED);
						updateToggleCommandState(command, labelFeatureConf.isDisplayIsDerived());

						command = commandService.getCommand(CommandIds.COMMAND_COLUMN_LABEL_FEATURE_DISPLAY_MULTIPLICITY);
						updateToggleCommandState(command, labelFeatureConf.isDisplayMultiplicity());

						command = commandService.getCommand(CommandIds.COMMAND_COLUMN_LABEL_FEATURE_DISPLAY_TYPE);
						updateToggleCommandState(command, labelFeatureConf.isDisplayType());


						command = commandService.getCommand(CommandIds.COMMAND_COLUMN_LABEL_FEATURE_DISPLAY_NAME);
						updateToggleCommandState(command, labelFeatureConf.isDisplayName());
					}
				}
			}

			for (final ILabelProviderConfiguration current : rowLabelConfigurations) {
				if (current instanceof ObjectLabelProviderConfiguration) {
					final ObjectLabelProviderConfiguration labelConfig = (ObjectLabelProviderConfiguration) current;

					command = commandService.getCommand(CommandIds.COMMAND_ROW_LABEL_DISPLAY_ICON);
					updateToggleCommandState(command, labelConfig.isDisplayIcon());

					command = commandService.getCommand(CommandIds.COMMAND_ROW_LABEL_DISPLAY_LABEL);
					updateToggleCommandState(command, labelConfig.isDisplayLabel());

					if (labelConfig instanceof FeatureLabelProviderConfiguration) {
						final FeatureLabelProviderConfiguration labelFeatureConf = (FeatureLabelProviderConfiguration) labelConfig;
						command = commandService.getCommand(CommandIds.COMMAND_ROW_LABEL_FEATURE_DISPLAY_IS_DERIVED);
						updateToggleCommandState(command, labelFeatureConf.isDisplayIsDerived());

						command = commandService.getCommand(CommandIds.COMMAND_ROW_LABEL_FEATURE_DISPLAY_MULTIPLICITY);
						updateToggleCommandState(command, labelFeatureConf.isDisplayMultiplicity());

						command = commandService.getCommand(CommandIds.COMMAND_ROW_LABEL_FEATURE_DISPLAY_TYPE);
						updateToggleCommandState(command, labelFeatureConf.isDisplayType());

						command = commandService.getCommand(CommandIds.COMMAND_ROW_LABEL_FEATURE_DISPLAY_NAME);
						updateToggleCommandState(command, labelFeatureConf.isDisplayName());
					}
				}
			}

			// update the property IMasterObjectAxisProvider#disconnectslave
			if (columnProvider instanceof ISlaveAxisProvider) {
				command = commandService.getCommand(CommandIds.COMMAND_ROW_DISCONNECT_SLAVE);
				updateToggleCommandState(command, ((IMasterAxisProvider) rowProvider).isDisconnectSlave());
			}

			if (rowProvider instanceof ISlaveAxisProvider) {
				command = commandService.getCommand(CommandIds.COMMAND_COLUMN_DISCONNECT_SLAVE);
				updateToggleCommandState(command, ((IMasterAxisProvider) columnProvider).isDisconnectSlave());
			}

			// we update the state for the invert axis command
			command = commandService.getCommand(CommandIds.COMMAND_INVERT_AXIS);
			updateToggleCommandState(command, getTable().isInvertAxis());

			// updates the state of each merge actions commands
			command = commandService.getCommand(CommandIds.COMMAND_MERGE_ROWS);
			updateToggleCommandState(command, getToggleStateAllRows());

			command = commandService.getCommand(CommandIds.COMMAND_MERGE_COLUMNS);
			updateToggleCommandState(command, getToggleStateAllColumns());

			command = commandService.getCommand(CommandIds.COMMAND_MERGE_SELECTED_ROWS);
			updateToggleCommandState(command, getToggleStateSelectedRows());

			command = commandService.getCommand(CommandIds.COMMAND_MERGE_SELECTED_COLUMNS);
			updateToggleCommandState(command, getToggleStateSelectedColumns());

			// the merge of all the elements in the table is not yet supported
			// command = commandService.getCommand(CommandIds.COMMAND_MERGE_TABLE);
			// BooleanValueStyle mergeTable = (BooleanValueStyle)getTable().getNamedStyle(NattablestylePackage.eINSTANCE.getBooleanValueStyle(), NamedStyleConstants.MERGE_TABLE);
			// if(mergeTable != null) {
			// updateToggleCommandState(command, mergeTable.isBooleanValue());
			// } else {
			// updateToggleCommandState(command, false);
			// }


			// update hierarchic table display style
			DisplayStyle style = TableHelper.getTableDisplayStyle(this);
			command = commandService.getCommand(CommandIds.COMMAND_HIERARCHIC_DISPLAY_STYLE);
			if (!DisplayStyle.NORMAL.equals(style)) {
				updateRadioCommandState(command, style.getLiteral());
			}

		} else {
			throw new RuntimeException(String.format("The Eclipse service %s has not been found", ICommandService.class)); //$NON-NLS-1$
		}

	}

	/**
	 *
	 * @param command
	 *            an eclipse command
	 * @param newValue
	 *            the new boolean value to set to the state of this command
	 */
	private void updateToggleCommandState(final org.eclipse.core.commands.Command command, final boolean newValue) {
		EclipseCommandUtils.updateToggleCommandState(command, newValue);
	}


	/**
	 *
	 * @param notification
	 * @return
	 *         The nearest table containing the style in order to verify the table's styled event's source
	 */
	private static Table findStyleTable(Notification notification) {
		if (notification.getNotifier() instanceof Table) {
			return (Table) notification.getNotifier();
		}
		else {
			Object notifier = notification.getNotifier();
			if (notifier instanceof EObject) {
				EObject mergeContainer = ((EObject) notifier).eContainer();
				while (!(mergeContainer instanceof Table) && mergeContainer != null) {
					mergeContainer = mergeContainer.eContainer();
				}
				return (Table) mergeContainer;
			}
			return null;
		}
	}

	/**
	 *
	 * @param command
	 *            an eclispe command
	 * @param newValue
	 *            the new value to set to the state of this command
	 */
	private void updateRadioCommandState(final org.eclipse.core.commands.Command command, final Object newValue) {
		EclipseCommandUtils.updateRadioCommandState(command, newValue);
	}

	public void invertJavaObject() {
		getRowSortModel().clear();// we clear the sort model
		AbstractAxisProvider newColumProvider = this.rowProvider;
		AbstractAxisProvider newRowProvider = this.columnProvider;
		List<Object> newVerticalElementList = this.horizontalElements;
		List<Object> newHorizontalElementList = this.verticalElements;
		ICompositeAxisManager newRowManager = this.columnManager;
		ICompositeAxisManager newColumnManager = this.rowManager;

		NattableModelManager.this.columnProvider = newColumProvider;
		NattableModelManager.this.rowProvider = newRowProvider;

		NattableModelManager.this.verticalElements = newVerticalElementList;
		NattableModelManager.this.horizontalElements = newHorizontalElementList;

		NattableModelManager.this.rowManager = newRowManager;
		NattableModelManager.this.columnManager = newColumnManager;
		this.rowManager.setAxisComparator(null);
		this.columnManager.setAxisComparator(null);

		updateToggleActionState();
		configureNatTable();
		refreshNatTable();
	}

	public void resizeAxis() {
		initTableAxis();
		refreshNatTable();
	}

	public void resizeHeader() {
		initTableHeaders();
		refreshNatTable();
	}

	public void mergeTable() {
		initTableMerge();
		refreshNatTable();
	}

	/**
	 * create the line and the columns managers
	 */
	protected void init() {
		if (this.columnManager != null) {
			this.columnManager.dispose();
		}
		if (this.rowManager != null) {
			this.rowManager.dispose();
		}
		this.columnProvider = getTable().getCurrentColumnAxisProvider();
		this.rowProvider = getTable().getCurrentRowAxisProvider();
		this.columnManager = createAxisManager(getTable().getTableConfiguration().getColumnHeaderAxisConfiguration().getAxisManagers(), getTable().getCurrentColumnAxisProvider(), true);
		this.rowManager = createAxisManager(getTable().getTableConfiguration().getRowHeaderAxisConfiguration().getAxisManagers(), getTable().getCurrentRowAxisProvider(), false);

		boolean allIsSlave = this.columnManager.isSlave() && this.rowManager.isSlave();
		Assert.isTrue(!allIsSlave, Messages.NattableModelManager_AtLeastOfOneTheAxisManagerMustBeAMaster);
	}

	/**
	 *
	 * @param ids
	 *            the ids of the axis manager to use
	 * @param contentProvider
	 *            the content provider in the model
	 * @return the created axis manager to use to manage the {@link IAxisContentsProvider}
	 */
	protected ICompositeAxisManager createAxisManager(final List<AxisManagerRepresentation> representations, final AbstractAxisProvider contentProvider, final boolean columnAxisManager) {
		TableDisplayStyle style = (TableDisplayStyle) getTable().getTableConfiguration().getStyle(NattablestylePackage.eINSTANCE.getTableDisplayStyle());
		if (style == null) {
			style = NattablestyleFactory.eINSTANCE.createTableDisplayStyle();
			style.setDisplayStyle(DisplayStyle.NORMAL);
		}
		final ICompositeAxisManager compositeAxisManager;
		if ((!columnAxisManager) && (DisplayStyle.HIERARCHIC_MULTI_TREE_COLUMN.equals(style.getDisplayStyle()) || DisplayStyle.HIERARCHIC_SINGLE_TREE_COLUMN.equals(style.getDisplayStyle()))) {
			compositeAxisManager = new CompositeTreeAxisManagerForEventList((EventList<Object>) this.eventList);
			final List<IAxisManagerForEventList> managers = new ArrayList<IAxisManagerForEventList>();
			for (AxisManagerRepresentation current : representations) {
				final IAxisManager manager = AxisManagerFactory.INSTANCE.getAxisManager(current);
				Assert.isTrue(manager instanceof IAxisManagerForEventList);
				manager.init(this, current, contentProvider);
				managers.add((IAxisManagerForEventList) manager);

			}
			compositeAxisManager.init(this, null, contentProvider);
			DatumTreeFormat treeFormat = getTreeFormat();
			treeFormat.setTreeComparatorProvider((CompositeTreeAxisManagerForEventList) compositeAxisManager);
			this.expansionModel.setAxisManager((CompositeTreeAxisManagerForEventList) compositeAxisManager);
			((CompositeAxisManagerForEventList) compositeAxisManager).setSubManagers(managers);
		} else {
			compositeAxisManager = new CompositeAxisManager();
			final List<IAxisManager> managers = new ArrayList<IAxisManager>();
			for (AxisManagerRepresentation current : representations) {
				final IAxisManager manager = AxisManagerFactory.INSTANCE.getAxisManager(current);
				assert manager != null;
				manager.init(this, current, contentProvider);
				managers.add(manager);
			}
			compositeAxisManager.init(this, null, contentProvider);
			compositeAxisManager.setSubAxisManager(managers);
		}
		return compositeAxisManager;
	}


	/**
	 *
	 * @see org.eclipse.ui.services.IDisposable#dispose()
	 *
	 */
	@Override
	public void dispose() {
		if (this.tableEditingDomain != null && this.contextEditingDomain != null) {
			if (this.hideShowCategoriesListener != null) {
				getTableEditingDomain().removeResourceSetListener(this.hideShowCategoriesListener);
			}
			if (this.tableEditingDomain.getCommandStack() != null) {
				this.tableEditingDomain.getCommandStack().removeCommandStackListener(this.refreshListener);
			}
			if (this.contextEditingDomain.getCommandStack() != null) {
				this.contextEditingDomain.getCommandStack().removeCommandStackListener(this.refreshListener);
			}
			this.columnManager.dispose();
			this.rowManager.dispose();
			Table table = getTable();
			if (table != null && this.tableCellsListener != null) {
				table.eAdapters().remove(this.tableCellsListener);
			}
			if (this.cellsMap != null) {
				this.cellsMap.clear();
			}
			if (this.natTable != null) {
				natTable.removeLayerListener(layerListener);
			}
			if (this.tableEditingDomain != null) {
				this.tableEditingDomain.removeResourceSetListener(resourceSetListener);
			}
			this.tableEditingDomain = null;
			if (this.contextEditingDomain != null) {
				this.contextEditingDomain.removeResourceSetListener(resourceSetListener);
			}
			this.contextEditingDomain = null;
			super.dispose();
		}
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#addRows(java.util.Collection)
	 *
	 * @param objectsToAdd
	 *            the list of the objects to add in rows
	 */
	@Override
	public void addRows(final Collection<Object> objectsToAdd) {
		final TransactionalEditingDomain domain = getContextEditingDomain();
		final Command cmd = getAddRowElementCommand(objectsToAdd);
		if (cmd != null && cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
		}
	}

	/**
	 * called when the manager is used vertically
	 */
	@Override
	public int getColumnCount() {
		return this.getColumnElementsList().size();
	}

	/**
	 * called when the manager is used horizontally
	 */

	@Override
	public int getRowCount() {
		return this.getRowElementsList().size();
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#addColumns(java.util.Collection)
	 *
	 * @param objectsToAdd
	 *            the list of the objects to add in columns
	 */
	@Override
	public void addColumns(final Collection<Object> objectsToAdd) {
		final TransactionalEditingDomain domain = getContextEditingDomain();
		final Command cmd = getAddColumnElementCommand(objectsToAdd);
		if (cmd != null && cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
		}
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#removeColumns(java.util.Collection)
	 *
	 * @param objetsToRemove
	 */
	@Override
	public void removeColumns(Collection<Object> objetsToRemove) {
		final TransactionalEditingDomain domain = getContextEditingDomain();
		final Command cmd = getDestroyColumnElementCommand(objetsToRemove);
		if (cmd != null && cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
		}
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#removeRows(java.util.Collection)
	 *
	 * @param objectsToRemove
	 */
	@Override
	public void removeRows(Collection<Object> objectsToRemove) {
		final TransactionalEditingDomain domain = getContextEditingDomain();
		final Command cmd = getDestroyRowElementCommand(objectsToRemove);
		if (cmd != null && cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
		}
	}



	/**
	 * Returns the EditingDomain associated to the table
	 *
	 * @return
	 */
	private TransactionalEditingDomain getTableEditingDomain() {
		return this.tableEditingDomain;
	}

	/**
	 * Returns the EditingDomain associated to the context
	 *
	 * @return
	 */
	private TransactionalEditingDomain getContextEditingDomain() {
		return this.contextEditingDomain;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#getBodyDataProvider()
	 *
	 * @return the data provider for the body of the table
	 */
	@Override
	public IDataProvider getBodyDataProvider() {
		return this;
	}

	/**
	 *
	 * @see org.eclipse.nebula.widgets.nattable.data.IDataProvider#getDataValue(int, int)
	 *
	 * @param columnIndex
	 *            the index of the column
	 * @param rowIndex
	 *            the index of the row
	 * @return the contents to display in the cell localted to columnIndex and
	 *         rowIndex
	 */
	@Override
	public Object getDataValue(final int columnIndex, final int rowIndex) {
		final Object row;
		final Object column;
		final Object obj1 = this.verticalElements.get(columnIndex);
		final Object obj2 = this.horizontalElements.get(rowIndex);
		if (getTable().isInvertAxis()) {
			column = obj2;
			row = obj1;
		} else {
			row = obj2;
			column = obj1;
		}
		return CellManagerFactory.INSTANCE.getCrossValue(column, row, this);
	}

	@Override
	public void setDataValue(final int columnIndex, final int rowIndex, final Object newValue) {
		final Object row;
		final Object column;
		final Object obj1 = this.verticalElements.get(columnIndex);
		final Object obj2 = this.horizontalElements.get(rowIndex);
		if (getTable().isInvertAxis()) {
			column = obj2;
			row = obj1;
		} else {
			row = obj2;
			column = obj1;
		}
		CellManagerFactory.INSTANCE.setCellValue(getContextEditingDomain(), column, row, newValue, this);
	}

	/**
	 * refresh NatTable (asyncExec)
	 */
	public void refreshNatTable() {
		// This refresh code has been duplicated from the refresh of the ModelExplorer (class ModelExplorerView)
		final Runnable schedule;
		if (this.natTable != null && !this.natTable.isDisposed()) {
			synchronized (this) {
				if (refreshRunnable == null) {
					// No refresh is yet pending. Schedule one
					schedule = createRefreshRunnable();
					refreshRunnable = schedule;
				} else {
					schedule = null;
				}
			}

			if (schedule != null) {
				Control control = this.natTable;
				Display display = ((control == null) || control.isDisposed()) ? null : control.getDisplay();

				if (display != null) {
					// Don't need to schedule a refresh if we have no control or it's disposed
					display.asyncExec(schedule);
				}
			}
		}
	}

	/**
	 *
	 * @return
	 *         a new runnable for the refreash action
	 */
	private Runnable createRefreshRunnable() {
		return new Runnable() {

			@Override
			public void run() {
				// Only run if I'm still pending
				synchronized (NattableModelManager.this) {
					if (refreshRunnable != this) {
						return;
					}

					refreshRunnable = null;
				}

				refreshInUIThread();
			}
		};
	}

	/**
	 * refresh the view.
	 */
	protected void refreshInUIThread() {
		// Need to refresh, even if (temporarily) invisible
		// (Better alternative?: store refresh event and execute once visible again)
		if (this.natTable != null && this.natTable.isDisposed()) {
			return;
		}

		// avoid reentrant call
		// Refresh only of we are not already refreshing.
		if (isRefreshing.compareAndSet(false, true)) {
			this.natTable.refresh();
			isRefreshing.set(false);
		}
	}

	/**
	 *
	 * @param axis
	 *            the axis for which must refresh the contents
	 */
	public void updateAxisContents(final AbstractAxisProvider axis) {

		try {
			getContextEditingDomain().runExclusive(new Runnable() {

				@Override
				public void run() {
					Display.getDefault().syncExec(new Runnable() {

						@Override
						public void run() {
							if (NattableModelManager.this.natTable != null && !NattableModelManager.this.natTable.isDisposed()) {
								if (NattableModelManager.this.getTable() != null && NattableModelManager.this.getTable().getTableConfiguration() != null) {
									if (axis == NattableModelManager.this.columnProvider) {
										updateColumnContents();
										NattableModelManager.this.getRowSortModel().updateSort();
									} else {
										updateRowContents();
									}
								}
							}
						}
					});

				}

			});
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	/**
	 * refresh the row contents
	 */
	private void updateRowContents() {
		NattableModelManager.this.rowManager.updateAxisContents();
		CellEditorDeclaration declaration = getCellEditorDeclarationToUse(getTable());
		if (declaration.equals(CellEditorDeclaration.ROW)) {
			configureNatTable();
			refreshNatTable();
		} else {
			refreshNatTable();
		}
	}



	/**
	 * refresh the column contents
	 */
	private void updateColumnContents() {
		NattableModelManager.this.columnManager.updateAxisContents();
		CellEditorDeclaration declaration = getCellEditorDeclarationToUse(getTable());
		if (declaration.equals(CellEditorDeclaration.COLUMN)) {
			configureNatTable();
			refreshNatTable();
		} else {
			refreshNatTable();
		}
	}

	/**
	 *
	 * @param table
	 *            the table
	 * @return
	 *         the celleditor declaration to use according to the table configuration and {@link Table#isInvertAxis()}
	 */
	private CellEditorDeclaration getCellEditorDeclarationToUse(final Table table) {
		CellEditorDeclaration declaration = table.getTableConfiguration().getCellEditorDeclaration();
		if (getTable().isInvertAxis()) {
			if (declaration.equals(CellEditorDeclaration.COLUMN)) {
				declaration = CellEditorDeclaration.ROW;
			} else if (declaration.equals(CellEditorDeclaration.ROW)) {
				declaration = CellEditorDeclaration.COLUMN;
			}
		}
		return declaration;
	}

	@Override
	public List<Object> getColumnElementsList() {
		return this.verticalElements;
	}

	@Override
	public List<Object> getRowElementsList() {
		// return this.eventList;
		return this.horizontalElements;
	}

	public List<Object> getEventList() {
		return this.eventList;
	}

	@Override
	public boolean canInsertRow(Collection<Object> objectsToAdd, int index) {
		return this.rowManager.canInsertAxis(objectsToAdd, index);
	}

	@Override
	public boolean canInsertColumns(Collection<Object> objectsToAdd, int index) {
		return this.columnManager.canInsertAxis(objectsToAdd, index);
	}

	@Override
	public boolean canDropColumnsElement(Collection<Object> objectsToAdd) {
		return this.columnManager.canDropAxisElement(objectsToAdd);
	}

	@Override
	public boolean canDropRowElement(Collection<Object> objectsToAdd) {
		return this.rowManager.canDropAxisElement(objectsToAdd);
	}

	@Override
	public void insertRows(Collection<Object> objectsToAdd, int index) {
		this.rowManager.getInsertAxisCommand(objectsToAdd, index);

	}

	@Override
	public void insertColumns(Collection<Object> objectsToAdd, int index) {
		this.columnManager.getInsertAxisCommand(objectsToAdd, index);
	}

	@Override
	public Object getColumnElement(int index) {
		if (index < 0 || index >= this.verticalElements.size()) {
			return null;
		}
		return this.verticalElements.get(index);
	}

	@Override
	public Object getRowElement(int index) {
		if (index < 0 || index >= this.horizontalElements.size()) {
			return null;
		}
		return this.horizontalElements.get(index);
	}

	public List<Object> getElementsList(AbstractAxisProvider axisProvider) {
		if (axisProvider == this.columnProvider) {
			return this.verticalElements;
		} else if (axisProvider == this.rowProvider) {
			return this.horizontalElements;
		}
		return null;
	}

	@Override
	public boolean canMoveRows() {
		return this.rowManager.canMoveAxis();
	}

	@Override
	public boolean canMoveColumns() {
		return this.columnManager.canMoveAxis();
	}

	@Override
	public void moveColumnElement(final Object axisToMove, final int newIndex) {
		this.columnManager.moveAxis(axisToMove, newIndex);
	}

	// not tested
	@Override
	public void moveRowElement(final Object axisToMove, final int newIndex) {
		this.rowManager.moveAxis(axisToMove, newIndex);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#invertAxis()
	 *
	 */
	@Override
	public void invertAxis() {
		final CompoundCommand cmd = new CompoundCommand(Messages.NattableModelManager_SwitchLinesAndColumns);
		final TransactionalEditingDomain domain = getContextEditingDomain();
		boolean oldValue = getTable().isInvertAxis();
		if (canInvertAxis()) {
			Command tmp = new SetCommand(domain, getTable(), NattablePackage.eINSTANCE.getTable_InvertAxis(), !oldValue);
			cmd.append(tmp);
			domain.getCommandStack().execute(cmd);
		}

		// use the method to refresh the table using the appointed values saved in the model.notation
		initTableAxis();
		initTableHeaders();
		initTableMerge();
	}

	@Override
	public boolean canInvertAxis() {
		return this.columnManager.canBeUsedAsRowManager() && this.rowManager.canBeUsedAsColumnManager();
	}

	@Override
	public boolean canCreateRowElement(String elementType) {
		return this.rowManager.canCreateAxisElement(elementType);
	}

	@Override
	public boolean canCreateColumnElement(String elementType) {
		return this.columnManager.canCreateAxisElement(elementType);
	}

	@Override
	public Command getAddRowElementCommand(Collection<Object> objectsToAdd) {
		final TransactionalEditingDomain domain = getContextEditingDomain();
		final CompoundCommand cmd = new CompoundCommand(Messages.NattableModelManager_AddRowCommand);
		Command tmp = this.rowManager.getAddAxisCommand(domain, objectsToAdd);
		if (tmp != null) {
			cmd.append(tmp);
		}
		final AbstractAxisProvider rowsProvider = AxisUtils.getAxisProviderUsedForRows(this);
		final AbstractAxisProvider columnsProvider = AxisUtils.getAxisProviderUsedForColumns(this);
		boolean addComplementaryAxis = rowsProvider instanceof IMasterAxisProvider && columnsProvider instanceof ISlaveAxisProvider && !((IMasterAxisProvider) rowsProvider).isDisconnectSlave();
		if (addComplementaryAxis) {
			tmp = this.columnManager.getComplementaryAddAxisCommand(domain, objectsToAdd);
			if (tmp != null) {
				cmd.append(tmp);
			}
		}
		return cmd;
	}

	@Override
	public Command getAddColumnElementCommand(Collection<Object> objectsToAdd) {
		final TransactionalEditingDomain domain = getContextEditingDomain();
		final CompoundCommand cmd = new CompoundCommand(Messages.NattableModelManager_AddColumnCommand);
		Command tmp = this.columnManager.getAddAxisCommand(domain, objectsToAdd);
		if (tmp != null) {
			cmd.append(tmp);
		}
		final AbstractAxisProvider rowsProvider = AxisUtils.getAxisProviderUsedForRows(this);
		final AbstractAxisProvider columnsProvider = AxisUtils.getAxisProviderUsedForColumns(this);
		boolean addComplementaryAxis = columnsProvider instanceof IMasterAxisProvider && rowsProvider instanceof ISlaveAxisProvider && !((IMasterAxisProvider) columnsProvider).isDisconnectSlave();
		if (addComplementaryAxis) {
			tmp = this.rowManager.getComplementaryAddAxisCommand(domain, objectsToAdd);
			if (tmp != null) {
				cmd.append(tmp);
			}
		}
		return cmd;
	}

	public Command getDestroyColumnElementCommand(Collection<Object> objectsToDestroy) {
		final TransactionalEditingDomain domain = getContextEditingDomain();
		final Command cmd = this.columnManager.getDestroyAxisCommand(domain, objectsToDestroy);
		return cmd;
	}

	public Command getDestroyRowElementCommand(Collection<Object> objectsToDestroy) {
		final TransactionalEditingDomain domain = getContextEditingDomain();
		final Command cmd = this.rowManager.getDestroyAxisCommand(domain, objectsToDestroy);
		return cmd;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#getTableAxisElementProvider()
	 *
	 * @return
	 */
	@Override
	public ITableAxisElementProvider getTableAxisElementProvider() {
		return this;
	}

	/**
	 * When the axis manager is dynamic, we can't destroy axis
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#canCreateDestroyColumnsAxis()
	 *
	 * @return
	 */
	@Override
	public boolean canCreateDestroyColumnsAxis() {
		return !this.columnManager.isDynamic() && this.columnManager.createPossibleAxisContentProvider(true) != null;
	}

	/**
	 * When the axis manager is dynamic, we can't destroy axis
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#canCreateDestroyRowsAxis()
	 *
	 * @return
	 */
	@Override
	public boolean canCreateDestroyRowsAxis() {
		return !this.rowManager.isDynamic() && this.rowManager.createPossibleAxisContentProvider(true) != null;
	}

	/**
	 *
	 * @param serv
	 *            the label provider service
	 * @param editedAxisManager
	 *            the manager used for the edited axis
	 * @param secondAxisManager
	 *            the manager used for the other axis
	 * @param isEditingColumns
	 *            boolean indicating if we are editing columns or rows
	 */
	private final void openCreateDestroyAxisManagerDialog(boolean isEditingColumns) {
		final String dialogTitle;
		final String dialogCheckBoxTootip;
		final String dialogQuestion;

		final IAxisManager editedAxisManager;
		final IAxisManager secondAxisManager;
		final String checkBoxMessage = Messages.NattableModelManager_DisconnectThisAxisManager;
		if (isEditingColumns) {
			dialogTitle = Messages.NattableModelManager_SelectColumns;
			dialogCheckBoxTootip = Messages.NattableModelManager_DisableTheAutomaticAdditionOfColumnsWhenARowIsAdded;
			dialogQuestion = String.format(Messages.NattableModelManager_TheCheckBoxHasNotBeenCheckedToAvoidAutomaticColumnAddition, checkBoxMessage);

			editedAxisManager = columnManager;
			secondAxisManager = rowManager;
		} else {
			dialogTitle = Messages.NattableModelManager_SelectRows;
			dialogCheckBoxTootip = Messages.NattableModelManager_DisableTheAutomaticAdditionOfRowsWhenAColumnIsAdded;
			dialogQuestion = String.format(Messages.NattableModelManager_TheCheckBoxHasNotBeenCheckedToAvoidAutomaticRowAddition, checkBoxMessage);

			editedAxisManager = rowManager;
			secondAxisManager = columnManager;
		}
		final LabelProviderService serv = this.natTable.getConfigRegistry().getConfigAttribute(NattableConfigAttributes.LABEL_PROVIDER_SERVICE_CONFIG_ATTRIBUTE, DisplayMode.NORMAL, NattableConfigAttributes.LABEL_PROVIDER_SERVICE_ID);
		final ILabelProvider labelProvider = serv.getLabelProvider();
		final AbstractAxisProvider editedAxisProvider = editedAxisManager.getRepresentedContentProvider();
		final AbstractAxisProvider secondAxisProvider = secondAxisManager.getRepresentedContentProvider();
		ReferenceSelector selector = new ReferenceSelector(true) {

			@Override
			public void createControls(Composite parent) {
				super.createControls(parent);
				this.treeViewer.setComparator(new ViewerComparator(new StringComparator()));// should always be string element
			}
		};
		selector.setLabelProvider(labelProvider);

		IStaticContentProvider provider = editedAxisManager.createPossibleAxisContentProvider(true);
		if (provider != null) {
			selector.setContentProvider(new FlattenableRestrictedFilteredContentProvider((IRestrictedContentProvider) provider, selector));
			boolean canBeReorder = (!editedAxisManager.isDynamic()) && editedAxisManager.canMoveAxis();
			final DisplayedAxisSelectorDialog dialog = new DisplayedAxisSelectorDialog(Display.getDefault().getActiveShell(), selector, dialogTitle, true, canBeReorder, -1);
			boolean displayCheckBox = editedAxisProvider instanceof ISlaveAxisProvider;
			dialog.setDisplayCheckBox(displayCheckBox);
			boolean checkboxValue = secondAxisProvider instanceof IMasterAxisProvider && ((IMasterAxisProvider) secondAxisProvider).isDisconnectSlave();
			if (displayCheckBox) {
				dialog.setCheckBoxValues(checkBoxMessage, dialogCheckBoxTootip, checkboxValue);
			}

			dialog.setInformationDialogValues(Messages.NattableModelManager_DisconnectAxisManagerInformationDialogTitle, dialogQuestion);
			dialog.setLabelProvider(labelProvider);
			final List<Object> initialSelection = ((CompositeAxisManager) editedAxisManager).getAllManagedAxis(true);
			dialog.setInitialElementSelections(new ArrayList<Object>(initialSelection));

			int open = dialog.open();
			if (open == Window.OK) {
				Collection<Object> existingColumns = initialSelection;
				ArrayList<Object> checkedColumns = new ArrayList<Object>();
				final List<Object> result = Arrays.asList(dialog.getResult());
				checkedColumns.addAll(result);

				ArrayList<Object> columnsToAdd = new ArrayList<Object>(checkedColumns);
				columnsToAdd.removeAll(existingColumns);
				CompoundCommand compoundCommand = new CompoundCommand("Update Existing Axis Command"); //$NON-NLS-1$
				if (columnsToAdd.size() > 0) {
					Command addAxisElementCommand = null;
					if (isEditingColumns) {
						addAxisElementCommand = getAddColumnElementCommand(columnsToAdd);
					} else {
						addAxisElementCommand = getAddRowElementCommand(columnsToAdd);
					}
					compoundCommand.append(addAxisElementCommand);
				}

				ArrayList<Object> axisToDestroy = new ArrayList<Object>(existingColumns);
				axisToDestroy.removeAll(checkedColumns);
				if (axisToDestroy.size() > 0) {
					Command destroyAxisElementCommand = null;
					if (isEditingColumns) {
						destroyAxisElementCommand = getDestroyColumnElementCommand(axisToDestroy);
					} else {
						destroyAxisElementCommand = getDestroyRowElementCommand(axisToDestroy);
					}
					compoundCommand.append(destroyAxisElementCommand);
				}

				final boolean newState = dialog.isChecked();
				if (displayCheckBox && checkboxValue != newState) {
					final TransactionalEditingDomain domain = getTableEditingDomain();
					final IEditCommandRequest request = new SetRequest(domain, secondAxisProvider, NattableaxisproviderPackage.eINSTANCE.getIMasterAxisProvider_DisconnectSlave(), newState);
					final IElementEditService commandProvider = ElementEditServiceUtils.getCommandProvider(secondAxisProvider);
					compoundCommand.append(new GMFtoEMFCommandWrapper(commandProvider.getEditCommand(request)));
				}

				if (canBeReorder) {
					final Command setOrderCommand = ((ICompositeAxisManager) editedAxisManager).getSetNewAxisOrderCommand(result);
					if (setOrderCommand != null) {
						compoundCommand.append(setOrderCommand);
					}
				}
				if (!compoundCommand.isEmpty()) {
					getContextEditingDomain().getCommandStack().execute(compoundCommand);
					updateToggleActionState();
				}
			}
		} else {
			MessageDialog.openInformation(Display.getDefault().getActiveShell(), Messages.NattableModelManager_CreateDestroyAxis, Messages.NattableModelManager_ActionNotYetSupported);
		}
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#openCreateDestroyRowsManagerDialog()
	 *
	 */
	@Override
	public void openCreateDestroyRowsManagerDialog() {
		openCreateDestroyAxisManagerDialog(false);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#openCreateDestroyColumnsManagerDialog()
	 *
	 */
	@Override
	public void openCreateDestroyColumnsManagerDialog() {
		openCreateDestroyAxisManagerDialog(true);
	}

	@Override
	public void sortColumnsByName(final boolean alphabeticOrder) {
		this.columnManager.sortAxisByName(alphabeticOrder, this.natTable.getConfigRegistry());
	}


	@Override
	public void sortRowsByName(final boolean alphabeticOrder) {
		this.rowManager.sortAxisByName(alphabeticOrder, this.natTable.getConfigRegistry());
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#getVerticalAxisProvider()
	 *
	 * @return
	 */
	@Override
	public AbstractAxisProvider getVerticalAxisProvider() {
		if (getTable().isInvertAxis()) {
			return getTable().getCurrentRowAxisProvider();
		} else {
			return getTable().getCurrentColumnAxisProvider();
		}
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#getHorizontalAxisProvider()
	 *
	 * @return
	 */
	@Override
	public AbstractAxisProvider getHorizontalAxisProvider() {
		if (getTable().isInvertAxis()) {
			return getTable().getCurrentColumnAxisProvider();
		} else {
			return getTable().getCurrentRowAxisProvider();
		}
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#canEditColumnHeader(int)
	 *
	 * @param evaluationContext
	 * @return
	 */
	@Override
	public boolean canEditColumnHeader(final NatEventData evaluationContext) {
		return this.columnManager.canEditAxisHeader(evaluationContext);
	}

	/***
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#canEditRowHeader(org.eclipse.nebula.widgets.nattable.ui.NatEventData)
	 *
	 * @param eventData
	 * @return
	 */
	@Override
	public boolean canEditRowHeader(NatEventData evaluationContext) {
		return this.rowManager.canEditAxisHeader(evaluationContext);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#openEditRowAliasDialog(org.eclipse.nebula.widgets.nattable.ui.NatEventData)
	 *
	 * @param event
	 */
	@Override
	public void openEditRowAliasDialog(NatEventData event) {
		this.rowManager.openEditAxisAliasDialog(event, event.getNatTable().getRowIndexByPosition(event.getRowPosition()));
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#openEditColumnAliasDialog(org.eclipse.nebula.widgets.nattable.ui.NatEventData)
	 *
	 * @param event
	 */
	@Override
	public void openEditColumnAliasDialog(NatEventData event) {
		this.columnManager.openEditAxisAliasDialog(event, event.getNatTable().getColumnIndexByPosition(event.getColumnPosition()));
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#getColumnAxisManager()
	 *
	 * @return
	 */
	@Override
	public IAxisManager getColumnAxisManager() {
		return this.columnManager;
	}


	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#getRowAxisManager()
	 *
	 * @return
	 */
	@Override
	public IAxisManager getRowAxisManager() {
		return this.rowManager;
	}


	@Override
	public void setTableName(String name) {
		SetRequest setNameRequest = new SetRequest(getTable(), NattableconfigurationPackage.eINSTANCE.getTableNamedElement_Name(), name);
		IElementEditService editService = ElementEditServiceUtils.getCommandProvider(getTable());
		ICommand setNameCommand = editService.getEditCommand(setNameRequest);
		getTableEditingDomain().getCommandStack().execute(new GMFtoEMFCommandWrapper(setNameCommand));
	}


	@Override
	public String getTableName() {
		return getTable().getName();
	}


	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter == NatTable.class) {
			return this.natTable;
		}
		return super.getAdapter(adapter);
	}

	private void updateCellMap(final Notification notification) {
		Job job = new Job("Update cells") { //$NON-NLS-1$

			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				if (notification == null) {
					cellsMap.clear();
					for (final Cell current : getTable().getCells()) {
						final CellMapKey key = createCellMapKeyWaitingCellAxis(current);
						cellsMap.put(key, current);
					}
				} else {
					int eventType = notification.getEventType();
					if (eventType == Notification.ADD) {
						final Object object = notification.getNewValue();
						if (object instanceof Cell) {
							final Cell cell = (Cell) object;
							final CellMapKey key = createCellMapKeyWaitingCellAxis(cell);
							cellsMap.put(key, cell);
						}
					} else if (eventType == Notification.ADD_MANY) {
						final Object coll = notification.getNewValue();

						if (coll instanceof Collection<?>) {
							final Iterator<?> iter = ((Collection<?>) coll).iterator();
							while (iter.hasNext()) {
								Object object = iter.next();
								if (object instanceof Cell) {
									final Cell cell = (Cell) object;
									final CellMapKey key = createCellMapKeyWaitingCellAxis(cell);
									cellsMap.put(key, cell);
								}
							}
						}
					} else if (eventType == Notification.REMOVE) {
						Object oldCell = notification.getOldValue();
						if (oldCell instanceof Cell) {
							CellMapKey key = cellsMap.inverse().get(oldCell);
							cellsMap.remove(key);
						}
					} else if (eventType == Notification.REMOVE_MANY) {
						final Object coll = notification.getOldValue();

						if (coll instanceof Collection<?>) {
							final Iterator<?> iter = ((Collection<?>) coll).iterator();
							while (iter.hasNext()) {
								Object object = iter.next();
								if (object instanceof Cell) {
									final CellMapKey key = cellsMap.inverse().get(object);
									cellsMap.remove(key);
								}
							}
						}
					}
				}

				return Status.OK_STATUS;
			}
		};
		job.setUser(false);
		job.setSystem(true);
		job.addJobChangeListener(new JobChangeAdapter() {

			@Override
			public void done(IJobChangeEvent event) {
				refreshNatTable();
			}

		});
		job.schedule();


		// resourceSetListener used to capture the event pertaining to the merge and resize actions
		// these events can be used to undo/redo previous actions
		resourceSetListener = new ResourceSetListener() {

			@Override
			public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
				return null;
			}

			@Override
			public void resourceSetChanged(ResourceSetChangeEvent event) {

				for (final Notification notification : event.getNotifications()) {
					// filter the events to only let through the changes on the current table resource
					Table notifiedTable = findStyleTable(notification);
					if (getTable().equals(notifiedTable)) {

						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {
								// already created booleanValues and intValues
								if (notification.getNotifier() instanceof BooleanValueStyle) {
									// as the filter already prevented any nonBooleanValueStyle, and therefore any non EObject, it can be cast without verification
									EObject mergeContainer = ((EObject) notification.getNotifier()).eContainer();
									if (mergeContainer instanceof AbstractHeaderAxisConfiguration || mergeContainer instanceof IAxis) {
										mergeTable();
									}
								}
								if (notification.getNotifier() instanceof IntValueStyle) {
									EObject resizeContainer = ((EObject) notification.getNotifier()).eContainer();
									if (resizeContainer instanceof AbstractHeaderAxisConfiguration) {
										resizeHeader();
									}
									if (resizeContainer instanceof IAxis) {
										resizeAxis();
									}
								}
								// newly created booleanValues and intValues
								if (notification.getNewValue() instanceof BooleanValueStyle) {
									mergeTable();
								}
								if (notification.getNewValue() instanceof IntValueStyle) {
									if (notification.getNotifier() instanceof IAxis) {
										resizeAxis();
									}
									if (notification.getNotifier() instanceof AbstractHeaderAxisConfiguration) {
										resizeHeader();
									}
								}
								// reset to the default state using ctrl+z
								if (notification.getNewValue() == null && notification.getOldValue() != null) {
									mergeTable();
									resizeAxis();
									resizeHeader();
								}
							}
						});
					}
				}
			}

			@Override
			public boolean isPrecommitOnly() {
				return false;
			}

			@Override
			public boolean isPostcommitOnly() {
				return false;
			}

			@Override
			public boolean isAggregatePrecommitListener() {
				return false;
			}

			@Override
			public NotificationFilter getFilter() {
				// this filter only lets through the notifications pertaining to the table
				// the first three conditions handle the modification, the add and the remove of styles
				// the last seven handle the modified or created objects containing those styles
				return ((NotificationFilter.createEventTypeFilter(Notification.SET))
						.or(NotificationFilter.createEventTypeFilter(Notification.ADD))
						.or(NotificationFilter.createEventTypeFilter(Notification.REMOVE)))
						.and((NotificationFilter.createNotifierTypeFilter(BooleanValueStyle.class))
								.or(NotificationFilter.createNotifierTypeFilter(IntValueStyle.class))
								.or(NotificationFilter.createNotifierTypeFilter(EObjectAxis.class))
								.or(NotificationFilter.createNotifierTypeFilter(FeatureIdAxis.class))
								.or(NotificationFilter.createNotifierTypeFilter(EStructuralFeatureAxis.class))
								.or(NotificationFilter.createNotifierTypeFilter(LocalTableHeaderAxisConfiguration.class))
								.or(NotificationFilter.createNotifierTypeFilter(Table.class)));
				// return NotificationFilter.createNotifierTypeFilter(EObject.class);
			}
		};

		getContextEditingDomain().addResourceSetListener(resourceSetListener);
		getTableEditingDomain().addResourceSetListener(resourceSetListener);

	}


	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#getCell(java.lang.Object, java.lang.Object)
	 *
	 * @param columnElement
	 * @param rowElement
	 * @return
	 */
	@Override
	public Cell getCell(final Object columnElement, final Object rowElement) {
		final CellMapKey key = new CellMapKey(columnElement, rowElement);
		return this.cellsMap.get(key);
	}

	/**
	 * This method allows to create a CellMapKey object waiting that required fields in the cell have been initialized
	 *
	 * @param cell
	 *            a cell
	 */
	private CellMapKey createCellMapKeyWaitingCellAxis(final Cell cell) {
		while (cell.getColumnWrapper() == null || cell.getRowWrapper() == null) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				Activator.log.error(e);
			}
		}
		while (cell.getColumnWrapper().getElement() == null || cell.getRowWrapper().getElement() == null) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				Activator.log.error(e);
			}
		}
		return new CellMapKey(cell.getColumnWrapper().getElement(), cell.getRowWrapper().getElement());
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#getTablePreferenceStore()
	 *
	 * @return
	 */
	@Override
	public PreferenceStore getTablePreferenceStore() {
		return this.localPreferenceStore;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager#setWorkspacePreferenceStore(org.eclipse.jface.preference.PreferenceStore)
	 *
	 * @param store
	 */
	@Override
	public void setWorkspacePreferenceStore(final PreferenceStore store) {
		this.localPreferenceStore = store;
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.ITreeNattableModelManager#getTreeFormat()
	 *
	 * @return
	 */
	@Override
	public DatumTreeFormat getTreeFormat() {
		return this.treeFormat;
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.ITreeNattableModelManager#getDepth()
	 *
	 * @return
	 */
	@Override
	public int getTreeItemDepth(final ITreeItemAxis axis) {
		Format<ITreeItemAxis> format = getTreeFormat();
		if (format != null) {
			List<ITreeItemAxis> path = new ArrayList<ITreeItemAxis>();
			format.getPath(path, axis);
			return path.size() - 1;
		}
		return 0;
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.ITreeNattableModelManager#getSemanticDepth(org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis)
	 *
	 * @param axis
	 * @return
	 */
	@Override
	public int getSemanticDepth(ITreeItemAxis axis) {
		Object representedObject = axis.getElement();
		if (representedObject instanceof TreeFillingConfiguration) {
			return ((TreeFillingConfiguration) representedObject).getDepth();
		} else {
			ITreeItemAxis parent = axis.getParent();
			if (parent == null) {
				return 0;
			}
			representedObject = parent.getElement();
			Assert.isTrue(representedObject instanceof TreeFillingConfiguration);
			return ((TreeFillingConfiguration) representedObject).getDepth();
		}
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.ITreeNattableModelManager#hideShowCategories(java.util.List, java.util.List)
	 *
	 * @param depthToHide
	 * @param depthToShow
	 */
	@Override
	public void hideShowCategories(List<Integer> depthToHide, List<Integer> depthToShow) {
		hideShowRowCategories(depthToHide, depthToShow);
		hideShowColumnCategoriesInRowHeader(depthToHide, depthToShow);
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.ITreeNattableModelManager#hideShowRowCategories(java.util.List, java.util.List)
	 *
	 * @param depthToHide
	 * @param depthToShow
	 */
	@Override
	public void hideShowRowCategories(List<Integer> depthToHide, List<Integer> depthToShow) {
		// we hide the rows representing the categories
		((ITreeItemAxisManagerForEventList) getRowAxisManager()).managedHideShowCategoriesForDepth(depthToHide, depthToShow);
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.ITreeNattableModelManager#hideShowColumnCategoriesInRowHeader(java.util.List, java.util.List)
	 *
	 * @param depthToHide
	 * @param depthToShow
	 */
	@Override
	public void hideShowColumnCategoriesInRowHeader(List<Integer> depthToHide, List<Integer> depthToShow) {
		this.natTable.refresh();
		RowHeaderLayerStack rowHeaderLayerStack = getRowHeaderLayerStack();
		if (rowHeaderLayerStack instanceof RowHeaderHierarchicalLayerStack) {
			ColumnHideShowLayer layer = ((RowHeaderHierarchicalLayerStack) rowHeaderLayerStack).getRowHeaderColumnHideShowLayer();
			ILayer subLayer = layer.getUnderlyingLayerByPosition(0, 0);
			// we hide the columns representing the categories
			if (TableHelper.isMultiColumnTreeTable(this)) {
				boolean hasRootConfif = FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(getTable(), 0);

				if (depthToHide != null && depthToHide.size() > 0) {
					int[] indexToHide = new int[depthToHide.size()];
					for (int i = 0; i < depthToHide.size(); i++) {
						Integer curr = depthToHide.get(i);
						int tmp = -1;
						if (hasRootConfif) {
							tmp = curr * 2;
						} else {
							// TODO not yet tested
							tmp = curr * 2 - 1;
						}

						// we need to convert the position
						tmp = layer.underlyingToLocalColumnPosition(subLayer, tmp);
						indexToHide[i] = tmp;
					}
					layer.doCommand(new MultiColumnHideCommand(layer, indexToHide));
				}

				if (depthToShow != null && depthToShow.size() > 0) {

					List<Integer> indexToShow = new ArrayList<Integer>();
					for (int i = 0; i < depthToShow.size(); i++) {
						Integer curr = depthToShow.get(i);
						int tmp = -1;
						if (hasRootConfif) {
							tmp = curr * 2;
						} else {
							// TODO not yet tested
							tmp = curr * 2 - 1;
						}
						indexToShow.add(tmp);
					}
					layer.doCommand(new MultiColumnShowCommand(indexToShow));
				}
			} else {
				layer.doCommand(new ShowAllColumnsCommand());
			}
		}

	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.table.ITreeNattableModelManager#doCollapseExpandAction(org.eclipse.papyrus.infra.nattable.tree.CollapseAndExpandActionsEnum, java.util.List)
	 *
	 * @param actionId
	 * @param selectedAxis
	 */
	@Override
	public void doCollapseExpandAction(CollapseAndExpandActionsEnum actionId, List<ITreeItemAxis> selectedAxis) {
		CollapseExpandActionHelper.doCollapseExpandAction(actionId, selectedAxis, getTableAxisElementProvider(), this.natTable);
	}
}
