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
package org.eclipse.papyrus.infra.nattable.provider;

/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
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
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.EMFCommandOperation;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.commands.CheckedOperationHistory;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.nattable.Activator;
import org.eclipse.papyrus.infra.nattable.manager.cell.CellManagerFactory;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.messages.Messages;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AbstractHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.IAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.IPasteConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.NattableaxisconfigurationPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.PasteEObjectConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablecell.Cell;
import org.eclipse.papyrus.infra.nattable.parsers.CSVParser;
import org.eclipse.papyrus.infra.nattable.parsers.CellIterator;
import org.eclipse.papyrus.infra.nattable.parsers.RowIterator;
import org.eclipse.papyrus.infra.nattable.paste.IValueSetter;
import org.eclipse.papyrus.infra.nattable.paste.PastePostActionRegistry;
import org.eclipse.papyrus.infra.nattable.utils.AxisConfigurationUtils;
import org.eclipse.papyrus.infra.nattable.utils.CSVPasteHelper;
import org.eclipse.papyrus.infra.nattable.utils.Constants;
import org.eclipse.papyrus.infra.nattable.utils.FillingConfigurationUtils;
import org.eclipse.papyrus.infra.nattable.utils.PasteSeverityCode;
import org.eclipse.papyrus.infra.nattable.utils.PasteTreeUtils;
import org.eclipse.papyrus.infra.nattable.utils.StyleUtils;
import org.eclipse.papyrus.infra.nattable.utils.TableEditingDomainUtils;
import org.eclipse.papyrus.infra.nattable.utils.TableHelper;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.infra.tools.converter.AbstractStringValueConverter;

/**
 * Paste command manager for the paste in the table
 *
 * @author VL222926
 *
 */
// TODO : refactor me to create common ancestor with normal paste
// TODO : refactor me : This class should be in oep.infra.emf.nattable
public class PasteEObjectTreeAxisInNattableCommandProvider {

	private static final int MIN_AXIS_FOR_PROGRESS_MONITOR = 5;

	/**
	 * the containment feature to use
	 */
	private EStructuralFeature containmentFeature;

	/**
	 * the type to create
	 */
	private IElementType typeToCreate;

	/**
	 * the table manager
	 */
	private INattableModelManager tableManager;

	/**
	 * the paste mode
	 */
	// private PasteEnablementStatus pasteMode;

	/**
	 * if true, we are pasting in detached mode
	 */
	private boolean detachedMode;

	/**
	 * the list of the post actions do do
	 */
	private List<String> postActions;

	/**
	 * the list of the axis to paste
	 */
	// private final String[] axisToPaste;

	/**
	 * the paste helper
	 */
	private final CSVPasteHelper pasteHelper;

	/**
	 * the converter map
	 */
	private Map<Class<? extends AbstractStringValueConverter>, AbstractStringValueConverter> existingConverters;

	private static final String PASTE_ACTION_TASK_NAME = Messages.PasteEObjectAxisInTableCommandProvider_PasteAction;

	private static final String PASTE_ROWS_JOB_NAME = Messages.PasteEObjectAxisInTableCommandProvider_PasteRows;

	private static final String PASTE_COLUMNS_JOB_NAME = Messages.PasteEObjectAxisInTableCommandProvider_PasteColumns;

	private static final String PASTE_COMMAND_HAS_BEEN_CANCELLED = Messages.PasteEObjectAxisInTableCommandProvider_CommandCreationHasBeenCancelled;

	private static final String PASTE_COMMAND_CANT_BE_EXECUTED = "The Paste command can't be executed"; //$NON-NLS-1$

	private static final String PASTE_COMMAND_NAME = Messages.PasteEObjectAxisInTableCommandProvider_PasteFromStringCommand;

	private static final String CREATING_ELEMENT_A_NUMBER_X_Y = Messages.PasteEObjectAxisInTableCommandProvider_CreatingAnumberXonY;

	protected final boolean pasteColumn;

	private final int nbOperationsToDo;


	// we refresh the dialog each X read char
	private int refreshEachReadChar = 1000;

	/**
	 * if <code>true</code> the command can't be created and executed
	 */
	private boolean isDisposed = false;

	/**
	 * the reader to parse
	 */
	private final Reader reader;

	/**
	 * the parser to use
	 */
	private CSVParser parser;

	int factor;

	private Table table;

	final TransactionalEditingDomain tableEditingDomain;

	final TransactionalEditingDomain contextEditingDomain;

	final EObject tableContext;

	List<Object> secondAxis;

	public PasteEObjectTreeAxisInNattableCommandProvider(INattableModelManager tableManager, boolean pasteColumn, Reader reader, CSVPasteHelper pasteHelper2, long totalSize) {
		this.tableManager = tableManager;
		// this.pasteMode = status;
		this.existingConverters = new HashMap<Class<? extends AbstractStringValueConverter>, AbstractStringValueConverter>();
		this.pasteHelper = pasteHelper2;
		this.reader = reader;
		this.pasteColumn = pasteColumn;
		this.table = tableManager.getTable();
		this.tableContext = table.getContext();
		tableEditingDomain = TableEditingDomainUtils.getTableEditingDomain(table);
		contextEditingDomain = TableEditingDomainUtils.getTableContextEditingDomain(table);
		// TODO improve refresh and progress monitor...
		long div = -1;
		if (totalSize > Integer.MAX_VALUE) {
			div = totalSize / Integer.MAX_VALUE;
			if (div > Integer.MAX_VALUE) {
				div = 2 * div;
			}
			this.factor = (int) div;
			this.nbOperationsToDo = (int) (totalSize / div);
		} else {
			this.factor = 1;
			this.nbOperationsToDo = (int) totalSize;
		}
		parser = this.pasteHelper.createParser(reader);
		init();
	}

	protected List<IPasteConfiguration> getPasteConfigurationFor(int depth) {
		List<IPasteConfiguration> pasteConfs = new ArrayList<IPasteConfiguration>();
		for (TreeFillingConfiguration current : FillingConfigurationUtils.getAllTreeFillingConfiguration(table)) {
			if (current.getDepth() == depth) {
				IPasteConfiguration pasteConf = current.getPasteConfiguration();
				Assert.isNotNull(pasteConf);// must not be null here! (so must be verified before
				pasteConfs.add(pasteConf);
			}
		}
		if (depth == 0 && pasteConfs.size() == 0 && FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(table, depth)) {
			final IPasteConfiguration conf = (IPasteConfiguration) AxisConfigurationUtils.getIAxisConfigurationUsedInTable(tableManager.getTable(), NattableaxisconfigurationPackage.eINSTANCE.getPasteEObjectConfiguration(), false);
			pasteConfs.add(conf);
		}
		return pasteConfs;
	}


	protected IPasteConfiguration getPasteConfigurationsFor(int depth, String categoryName) {
		if (depth == 0 && !FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(table, 0)) {
			AbstractHeaderAxisConfiguration conf = table.getLocalRowHeaderAxisConfiguration();
			if (conf != null) {
				conf = table.getTableConfiguration().getRowHeaderAxisConfiguration();
			}
			List<TreeFillingConfiguration> filling = FillingConfigurationUtils.getAllTreeFillingConfigurationForDepth(table, depth);
			List<IAxisConfiguration> referencedPasteConf = new ArrayList<IAxisConfiguration>();
			for (TreeFillingConfiguration tmp : filling) {
				if (tmp.getPasteConfiguration() != null) {
					referencedPasteConf.add(tmp.getPasteConfiguration());
				}
			}
			for (IAxisConfiguration axisConf : conf.getOwnedAxisConfigurations()) {
				if (axisConf instanceof IPasteConfiguration && !referencedPasteConf.contains(axisConf)) {
					return (IPasteConfiguration) axisConf;
				}
			}
		}
		for (TreeFillingConfiguration curr : FillingConfigurationUtils.getAllTreeFillingConfiguration(table)) {
			if (curr.getDepth() == depth) {
				if (categoryName == null || categoryName.isEmpty()) {
					return curr.getPasteConfiguration();
				} else {
					String featureName = curr.getAxisUsedAsAxisProvider().getAlias();
					if (featureName == null || "".equals(featureName)) {
						Object element = curr.getAxisUsedAsAxisProvider().getElement();
						// TODO : doesn't work for stereotype propertyes
						// TODO : use label provider
						if (element instanceof EStructuralFeature) {
							featureName = ((EStructuralFeature) element).getName();
						}
					}
					if (categoryName.equals(featureName)) {
						return curr.getPasteConfiguration();
					}

				}
			}
		}
		// TODO : verify category name
		return null;
	}

	protected boolean pasteInDetachedMode(Table table) {
		List<IPasteConfiguration> confs = getPasteConfigurationFor(0);
		for (IPasteConfiguration current : confs) {
			if (current.isDetachedMode()) {
				return true;
			}
		}
		return false;
	}


	/**
	 * inits the field of this class
	 */
	private void init() {
		this.detachedMode = pasteInDetachedMode(table);
		// PasteEObjectConfiguration configuration = null;
		// if (this.pasteColumn) {
		// configuration = (PasteEObjectConfiguration) AxisConfigurationUtils.getIAxisConfigurationUsedInTable(this.table, NattableaxisconfigurationPackage.eINSTANCE.getPasteEObjectConfiguration(), true);
		// this.secondAxis = tableManager.getRowElementsList();
		// } else {
		//
		// configuration = (PasteEObjectConfiguration) AxisConfigurationUtils.getIAxisConfigurationUsedInTable(this.table, NattableaxisconfigurationPackage.eINSTANCE.getPasteEObjectConfiguration(), false);
		this.secondAxis = tableManager.getColumnElementsList();
		// }
		// if (configuration != null) {
		// this.containmentFeature = configuration.getPasteElementContainementFeature();
		// this.typeToCreate = ElementTypeRegistry.getInstance().getType(configuration.getPastedElementId());
		// this.postActions = configuration.getPostActions();
		// this.detachedMode = configuration.isDetachedMode();
		// }
	}

	/**
	 *
	 * @param useProgressMonitor
	 *            boolean indicating that we must do the paste with a progress monitor
	 *            TODO : post actions are not yet supported in the in the detached mode
	 */
	public void executePasteFromStringCommand(final boolean useProgressMonitor) {
		// if (this.pasteColumn) {// not yet supported
		// return;
		// }
		if (this.isDisposed) {
			throw new RuntimeException("The command provider is disposed"); //$NON-NLS-1$
		}
		final String pasteJobName;
		// if (this.pasteColumn) {
		// pasteJobName = PASTE_COLUMNS_JOB_NAME;
		// } else {
		pasteJobName = PASTE_ROWS_JOB_NAME;
		// }
		// if (this.detachedMode) {
		// executePasteFromStringCommandInDetachedMode(useProgressMonitor, pasteJobName);
		// } else {
		executePasteFromStringCommandInAttachedMode(useProgressMonitor, pasteJobName);
		// }
	}


	/**
	 *
	 * @param useProgressMonitor
	 *            boolean indicating that we must do the paste with a progress monitor
	 */
	private void executePasteFromStringCommandInDetachedMode(final boolean useProgressMonitor, final String pasteJobName) {
		// the map used to share objects between the paste action and the cell value managers
		final Map<Object, Object> sharedMap = new HashMap<Object, Object>();
		// the map used to store useful information for the paste
		sharedMap.put(Constants.PASTED_ELEMENT_CONTAINER_KEY, tableContext);
		sharedMap.put(Constants.REFERENCES_TO_SET_KEY, new ArrayList<IValueSetter>());
		sharedMap.put(Constants.CELLS_TO_ADD_KEY, new ArrayList<Cell>());

		// used to be able to apply stereotypes required by columns properties, in detached mode even if there is no post actions defined in the table configuration
		// see bug 431691: [Table 2] Paste from Spreadsheet must be able to apply required stereotypes for column properties in all usecases
		// https://bugs.eclipse.org/bugs/show_bug.cgi?id=431691
		sharedMap.put(Constants.ADDITIONAL_POST_ACTIONS_TO_CONCLUDE_PASTE_KEY, new ArrayList<String>());

		if (!useProgressMonitor) {
			final ICommand pasteCommand = getPasteFromStringCommandInDetachedMode(contextEditingDomain, tableEditingDomain, new NullProgressMonitor(), sharedMap);
			try {
				CheckedOperationHistory.getInstance().execute(pasteCommand, new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				Activator.log.error(e);
			}
			sharedMap.clear();
		} else {
			// we create a job in order to don't freeze the UI
			final Job job = new Job(pasteJobName) {

				@Override
				protected IStatus run(IProgressMonitor monitor) {

					final ICommand pasteCommand = getPasteFromStringCommandInDetachedMode(contextEditingDomain, tableEditingDomain, monitor, sharedMap);
					if (pasteCommand == null) {
						return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, PASTE_COMMAND_HAS_BEEN_CANCELLED);
					}
					// we execute the paste command
					if (pasteCommand.canExecute()) {
						try {
							CheckedOperationHistory.getInstance().execute(pasteCommand, monitor, null);
						} catch (ExecutionException e) {
							return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "An exception occured during the paste", e); //$NON-NLS-1$
						} finally {
							sharedMap.clear();
						}
						monitor.done();
						return Status.OK_STATUS;
					} else {
						sharedMap.clear();
						return new Status(IStatus.ERROR, Activator.PLUGIN_ID, PASTE_COMMAND_CANT_BE_EXECUTED);
					}
				}
			};
			job.setUser(true);
			job.schedule();
		}
	}

	/**
	 *
	 * @param useProgressMonitor
	 *            boolean indicating that we must do the paste with a progress monitor
	 */
	private void executePasteFromStringCommandInAttachedMode(final boolean useProgressMonitor, final String pasteJobName) {
		if (!useProgressMonitor) {
			final ICommand pasteCommand = getPasteFromStringCommandInAttachedMode(contextEditingDomain, tableEditingDomain, new NullProgressMonitor());
			try {
				CheckedOperationHistory.getInstance().execute(pasteCommand, new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				Activator.log.error(e);
			}
		} else {
			// we create a job in order to don't freeze the UI
			final Job job = new Job(pasteJobName) {

				@Override
				protected IStatus run(IProgressMonitor monitor) {

					final ICommand pasteCommand = getPasteFromStringCommandInAttachedMode(contextEditingDomain, tableEditingDomain, monitor);
					if (pasteCommand == null) {
						return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, PASTE_COMMAND_HAS_BEEN_CANCELLED);
					}
					// we execute the paste command
					if (pasteCommand.canExecute()) {
						try {


							EMFCommandOperation op = new EMFCommandOperation(contextEditingDomain, new GMFtoEMFCommandWrapper(pasteCommand));
							// EMFOperationCommand c = new EMFOperationCommand(contextEditingDomain, pasteCommand);
							CheckedOperationHistory.getInstance().execute(op, monitor, null);
						} catch (Exception e) {
							return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "An exception occured during the paste", e); //$NON-NLS-1$
						}
						monitor.done();
						return Status.OK_STATUS;
					} else {
						return new Status(IStatus.ERROR, Activator.PLUGIN_ID, PASTE_COMMAND_CANT_BE_EXECUTED);
					}
				}
			};
			job.setUser(true);
			job.schedule();
		}
	}

	private ICommand getPasteRowFromStringCommandInDetachedMode(final TransactionalEditingDomain contextEditingDomain, final TransactionalEditingDomain tableEditingDomain, final IProgressMonitor progressMonitor, final Map<Object, Object> sharedMap) {
		if (progressMonitor != null) {
			progressMonitor.beginTask(PASTE_ACTION_TASK_NAME, this.nbOperationsToDo);// +1 to add the created elements to the table
		}
		// the list of the created elements
		final List<Object> createdElements = new ArrayList<Object>();

		// 2.2 create the creation request and find the command provider
		final EClass eClassToCreate = this.typeToCreate.getEClass();
		final EFactory eFactory = eClassToCreate.getEPackage().getEFactoryInstance();

		// 2.3 create the axis
		int nbCreatedElements = 0;

		// we refresh the dialog each X read char
		long readChar = 0;
		long previousreadChar = 0;
		final RowIterator rowIter = this.parser.parse();
		while (rowIter.hasNext()) {
			final CellIterator cellIter = rowIter.next();
			if (!cellIter.hasNext()) {
				continue;// to avoid blank line
			}
			if ((progressMonitor != null) && progressMonitor.isCanceled()) {
				// the user click on the cancel button
				return null;
			}

			readChar = readChar + (parser.getReadCharacters() - previousreadChar);
			previousreadChar = parser.getReadCharacters();


			if (progressMonitor != null && readChar > refreshEachReadChar) {
				readChar = 0;
				progressMonitor.subTask(NLS.bind("{0} {1} have been created.", new Object[] { nbCreatedElements, typeToCreate.getEClass().getName() })); //$NON-NLS-1$
				progressMonitor.worked(refreshEachReadChar);
			}
			nbCreatedElements++;

			// 2.3.3 we create the element itself
			final EObject createdElement = eFactory.create(eClassToCreate);

			createdElements.add(createdElement);
			nbCreatedElements++;
			for (final String currentPostActions : this.postActions) {
				PastePostActionRegistry.INSTANCE.doPostAction(this.tableManager, currentPostActions, tableContext, createdElement, sharedMap, null);// TODO : remove this parameter
			}

			// 2.3.4 we set these properties values
			final Iterator<Object> secondAxisIterator = secondAxis.iterator();
			while (secondAxisIterator.hasNext() && cellIter.hasNext()) {
				final Object currentAxis = secondAxisIterator.next();
				final String valueAsString = cellIter.next();
				final Object columnObject;
				final Object rowObject;
				if (this.pasteColumn) {
					columnObject = createdElement;
					rowObject = currentAxis;
				} else {
					columnObject = currentAxis;
					rowObject = createdElement;
				}


				boolean isEditable = CellManagerFactory.INSTANCE.isCellEditable(columnObject, rowObject, sharedMap);
				if (isEditable) {
					final AbstractStringValueConverter converter = CellManagerFactory.INSTANCE.getOrCreateStringValueConverterClass(columnObject, rowObject, tableManager, existingConverters, this.pasteHelper.getMultiValueSeparator());
					CellManagerFactory.INSTANCE.setStringValue(columnObject, rowObject, valueAsString, converter, tableManager, sharedMap);
				}
			}

			// TODO : do something to say that the number of cell is not correct!
			while (cellIter.hasNext()) {
				cellIter.next();// required!
			}
		}

		// 2.4 we add the created elements to the table
		final AbstractTransactionalCommand pasteCommand = new AbstractTransactionalCommand(tableEditingDomain, PASTE_COMMAND_NAME, null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				// initialize lists
				final Collection<String> postActions = getPostActions();

				// we add the post actions added by cell manager
				// see bug 431691: [Table 2] Paste from Spreadsheet must be able to apply required stereotypes for column properties in all usecases
				// https://bugs.eclipse.org/bugs/show_bug.cgi?id=431691
				@SuppressWarnings("unchecked")
				final Collection<String> postActionsAddedByCellManagers = (Collection<String>) sharedMap.get(Constants.ADDITIONAL_POST_ACTIONS_TO_CONCLUDE_PASTE_KEY);
				postActions.addAll(postActionsAddedByCellManagers);

				@SuppressWarnings("unchecked")
				final List<Cell> cells = (List<Cell>) sharedMap.get(Constants.CELLS_TO_ADD_KEY);
				@SuppressWarnings("unchecked")
				final List<IValueSetter> valueToSet = (List<IValueSetter>) sharedMap.get(Constants.REFERENCES_TO_SET_KEY);

				int nbTasks = 1; // to add created elements to the model
				nbTasks = nbTasks + 1; // to add createds elements to the table
				nbTasks = nbTasks + postActions.size();// to do post actions after the attachment to the model
				nbTasks = nbTasks + 1; // to attach the cells to the model
				nbTasks = nbTasks + valueToSet.size(); // to set the references values

				if (progressMonitor != null) {
					if (progressMonitor.isCanceled()) {
						localDispose();
						return CommandResult.newCancelledCommandResult();
					}
					progressMonitor.beginTask(Messages.PasteEObjectAxisInTableCommandProvider_FinishingThePaste, nbTasks);
				}

				// 1. Add the elements to the context
				AddCommand.create(contextEditingDomain, tableContext, containmentFeature, createdElements).execute();

				if (progressMonitor != null) {
					if (progressMonitor.isCanceled()) {
						return CommandResult.newCancelledCommandResult();
					}
					progressMonitor.worked(1);
					progressMonitor.subTask(Messages.PasteEObjectAxisInTableCommandProvider_AddingElementToTheTable);
				}

				Command cmd = null;
				if (pasteColumn) {
					cmd = tableManager.getAddColumnElementCommand(createdElements); // TODO remove one of these 2 lines
				} else {
					cmd = tableManager.getAddRowElementCommand(createdElements);
				}
				if (cmd != null) {// could be null
					cmd.execute();
				}

				if (progressMonitor != null) {
					if (progressMonitor.isCanceled()) {
						return CommandResult.newCancelledCommandResult();
					}
					progressMonitor.worked(1);
					progressMonitor.subTask(Messages.PasteEObjectAxisInTableCommandProvider_DoingAdditionalActions);
				}


				for (final String currentPostActions : postActions) {
					PastePostActionRegistry.INSTANCE.concludePostAction(tableManager, currentPostActions, sharedMap);
					progressMonitor.worked(1);
				}


				if (progressMonitor != null) {
					if (progressMonitor.isCanceled()) {
						return CommandResult.newCancelledCommandResult();
					}
					progressMonitor.worked(1);
					progressMonitor.subTask(Messages.PasteEObjectAxisInTableCommandProvider_LinkingReferencesToTheModel);
				}

				// we set the references

				if (valueToSet.size() > 0) {
					for (final IValueSetter current : valueToSet) {
						current.doSetValue(contextEditingDomain);
						if (progressMonitor != null) {
							if (progressMonitor.isCanceled()) {
								return CommandResult.newCancelledCommandResult();
							}
							progressMonitor.worked(1);
						}
					}
				}

				// the cells must be attached at the end (in order to update properly the cell map in the table manager
				if (progressMonitor != null) {
					if (progressMonitor.isCanceled()) {
						return CommandResult.newCancelledCommandResult();
					}
					progressMonitor.worked(1);
				}

				// add the created cells to the table
				AddCommand.create(tableEditingDomain, table, NattablePackage.eINSTANCE.getTable_Cells(), cells).execute();

				if (progressMonitor != null) {
					progressMonitor.done();
				}
				localDispose();
				return CommandResult.newOKCommandResult();
			}
		};

		return pasteCommand;
	}


	/**
	 *
	 *
	 * @param sharedMap
	 *            a map used to share objects and informations during the paste between this class and the cell value manager
	 * @param commandCreationCancelProvider
	 *            the creation command progress monitor
	 * @param commandExecutionProgressMonitor
	 *            the command execution progress monitor
	 * @return
	 *         the command to use to finish the paste (the main part of the paste is directly done here)
	 */
	private ICommand getPasteFromStringCommandInDetachedMode(final TransactionalEditingDomain contextEditingDomain, final TransactionalEditingDomain tableEditingDomain, final IProgressMonitor progressMonitor, final Map<Object, Object> sharedMap) {
		if (!this.pasteColumn) {
			return getPasteRowFromStringCommandInDetachedMode(contextEditingDomain, tableEditingDomain, progressMonitor, sharedMap);
		} else {
			// return getPasteColumnFromStringCommandInDetachedMode(contextEditingDomain, tableEditingDomain, progressMonitor, sharedMap);
		}
		return null;
	}


	//
	// /**
	// *
	// * @param commandCreationCancelProvider
	// * the creation command progress monitor
	// * @param commandExecutionProgressMonitor
	// * the command execution progress monitor
	// * @return
	// */
	// private ICommand getPasteColumnFromStringInAttachedModeCommand(final TransactionalEditingDomain contextEditingDomain, final TransactionalEditingDomain tableEditingDomain, final IProgressMonitor progressMonitor) {
	// // initialize the progress monitor
	// if (progressMonitor != null) {
	// progressMonitor.beginTask(PASTE_ACTION_TASK_NAME, this.nbOperationsToDo);
	// }
	//
	// // 2.2 create the creation request and find the command provider
	// final CreateElementRequest createRequest = new CreateElementRequest(contextEditingDomain, this.tableContext, this.typeToCreate, (EReference) this.containmentFeature);
	// final IElementEditService tableContextCommandProvider = ElementEditServiceUtils.getCommandProvider(tableContext);
	//
	// final ICommand pasteAllCommand = new AbstractTransactionalCommand(contextEditingDomain, PASTE_COMMAND_NAME, null) {
	//
	//
	// /**
	// *
	// * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	// *
	// * @param monitor
	// * @param info
	// * @return
	// * @throws ExecutionException
	// */
	// @Override
	// protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
	// long readChar = 0;
	// long previousreadChar = 0;
	//
	// final RowIterator rowIter = parser.parse();
	// int nbCreatedElements = 0;
	// while (rowIter.hasNext()) {
	// final CellIterator cellIter = rowIter.next();
	// if (!cellIter.hasNext()) {
	// continue;// to avoid blank line
	// }
	// if (progressMonitor != null && progressMonitor.isCanceled()) {
	// progressMonitor.done();
	// localDispose();
	// return CommandResult.newCancelledCommandResult();
	// }
	// readChar = readChar + (parser.getReadCharacters() - previousreadChar);
	// previousreadChar = parser.getReadCharacters();
	// if (progressMonitor != null && readChar > refreshEachReadChar) {
	// readChar = 0;
	//						progressMonitor.subTask(NLS.bind("{0} {1} have been created.", new Object[] { typeToCreate.getEClass().getName(), nbCreatedElements })); //$NON-NLS-1$
	// progressMonitor.worked(refreshEachReadChar);
	// }
	// nbCreatedElements++;
	// final ICommand commandCreation = tableContextCommandProvider.getEditCommand(createRequest);
	// if (commandCreation.canExecute()) {
	// // 1. we create the element
	// commandCreation.execute(monitor, info);
	// // we execute the creation command
	//
	// // 2. we add it to the table
	// final CommandResult res = commandCreation.getCommandResult();
	// commandCreation.dispose();
	//
	// final Object createdElement = res.getReturnValue();
	// final Command addCommand;
	// if (pasteColumn) {
	// addCommand = tableManager.getAddColumnElementCommand(Collections.singleton(createdElement));
	// } else {
	// addCommand = tableManager.getAddRowElementCommand(Collections.singleton(createdElement));
	// }
	// if (addCommand != null) {// can be null
	// addCommand.execute();
	// addCommand.dispose();
	// }
	//
	// // 3. we set the values
	// final Iterator<?> secondAxisIterator = secondAxis.iterator();
	// while (secondAxisIterator.hasNext() && cellIter.hasNext()) {
	// final Object currentAxis = secondAxisIterator.next();
	// final String valueAsString = cellIter.next();
	// final Object columnObject;
	// final Object rowObject;
	// if (pasteColumn) {
	// columnObject = createdElement;
	// rowObject = currentAxis;
	// } else {
	// columnObject = currentAxis;
	// rowObject = createdElement;
	// }
	//
	//
	// boolean isEditable = CellManagerFactory.INSTANCE.isCellEditable(columnObject, rowObject);
	//
	// if (isEditable) {
	// final AbstractStringValueConverter converter = CellManagerFactory.INSTANCE.getOrCreateStringValueConverterClass(columnObject, rowObject, tableManager, existingConverters, pasteHelper.getMultiValueSeparator());
	// final Command setValueCommand = CellManagerFactory.INSTANCE.getSetStringValueCommand(contextEditingDomain, columnObject, rowObject, valueAsString, converter, tableManager);
	// if (setValueCommand != null && setValueCommand.canExecute()) {
	// setValueCommand.execute();
	// setValueCommand.dispose();
	// }
	// }
	// }
	// // TODO inform the user
	// while (cellIter.hasNext()) {
	// cellIter.next();// required
	// }
	// }
	// }
	// progressMonitor.done();
	// localDispose();
	// return CommandResult.newOKCommandResult();
	// }
	// };
	// return pasteAllCommand;
	// }





	private boolean isCategory(int nbReadCell) {
		return PasteTreeUtils.isCategory(nbReadCell, FillingConfigurationUtils.getMaxDepthForTree(table), StyleUtils.getHiddenDepths(table), FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(table, 0));
	}


	private int getDepth(int nbReadCell) {
		return PasteTreeUtils.getDepth(nbReadCell, FillingConfigurationUtils.getMaxDepthForTree(table), StyleUtils.getHiddenDepths(table), FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(table, 0));
	}

	/**
	 *
	 * @param iterator
	 *            the cellIterator
	 * @param nbReadCell
	 *
	 */
	protected void crossCellIteratorToFirstBodyCell(CellIterator cellIter, int nbReadCell) {
		if (TableHelper.isSingleColumnTreeTable(table)) {
			// TODO
		} else {
			int nbColumns = (FillingConfigurationUtils.getMaxDepthForTree(table) + 1) * 2;
			if (!FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(table, 0)) {
				nbColumns--;
			}

			// exit of the header part
			List<Integer> hiddenDepth = StyleUtils.getHiddenDepths(table);
			int nbVisibleColumns = nbColumns - hiddenDepth.size();

			while (nbReadCell < nbVisibleColumns) {
				cellIter.next();
				nbReadCell++;
			}
		}

	}

	/**
	 *
	 * @param commandCreationCancelProvider
	 *            the creation command progress monitor
	 * @param commandExecutionProgressMonitor
	 *            the command execution progress monitor
	 * @return
	 */
	private ICommand getPasteRowFromStringInAttachedModeCommand(final TransactionalEditingDomain contextEditingDomain, final TransactionalEditingDomain tableEditingDomain, final IProgressMonitor progressMonitor) {
		// initialize the progress monitor
		if (progressMonitor != null) {
			progressMonitor.beginTask(PASTE_ACTION_TASK_NAME, this.nbOperationsToDo);
		}

		// 2.2 create the creation request and find the command provider
		final ICommand pasteAllCommand = new AbstractTransactionalCommand(contextEditingDomain, PASTE_COMMAND_NAME, null) {


			/**
			 *
			 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
			 *
			 * @param monitor
			 * @param info
			 * @return
			 * @throws ExecutionException
			 */
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				List<IStatus> resultStatus = new ArrayList<IStatus>();

				long readChar = 0;
				long previousreadChar = 0;

				// this map stores the last created object to a depth.
				// its allows us to find easily the context to use for each created element
				Map<Integer, EObject> contextMap = new HashMap<Integer, EObject>();
				contextMap.put(Integer.valueOf(-1), table.getContext());

				// 2. create a map with the last paste configuration used by depth
				Map<Integer, PasteEObjectConfiguration> confMap = new HashMap<Integer, PasteEObjectConfiguration>();

				final RowIterator rowIter = parser.parse();
				int nbCreatedElements = 0;
				int nbReadLine = 0;
				while (rowIter.hasNext()) {
					final CellIterator cellIter = rowIter.next();
					nbReadLine++;
					if (!cellIter.hasNext()) {
						continue;// to avoid blank line
					}
					if (progressMonitor != null && progressMonitor.isCanceled()) {
						progressMonitor.done();
						localDispose();
						return CommandResult.newCancelledCommandResult();
					}
					readChar = readChar + (parser.getReadCharacters() - previousreadChar);
					previousreadChar = parser.getReadCharacters();

					if (progressMonitor != null && readChar > refreshEachReadChar) {
						readChar = 0;
						// TODO : uncomment me, and move me, NPE on typeToCreate
						//						progressMonitor.subTask(NLS.bind("{0} {1} have been created.", new Object[] { typeToCreate.getEClass().getName(), nbCreatedElements })); //$NON-NLS-1$
						progressMonitor.worked(refreshEachReadChar);
					}

					// the iterator on columns
					final Iterator<?> secondAxisIterator = secondAxis.iterator();


					while (cellIter.hasNext()) {
						String valueAsString = cellIter.next();
						int nbReadCell = 1;

						// test if the value is empty (we are in the tree header)
						while (cellIter.hasNext() && valueAsString.isEmpty()) {
							valueAsString = cellIter.next();
							nbReadCell++;
						}

						int depth = getDepth(nbReadCell);
						boolean isCategory = isCategory(nbReadCell);

						if (isCategory) {
							confMap.put(Integer.valueOf(depth), (PasteEObjectConfiguration) getPasteConfigurationsFor(depth, valueAsString));
							// lastConfiguration = (PasteEObjectConfiguration) getPasteConfigurationsFor(depth, valueAsString);
							while (cellIter.hasNext()) {
								cellIter.next();
							}
							break;
						}

						// we get the paste configuration to use
						PasteEObjectConfiguration pasteConfToUse = confMap.get(Integer.valueOf(depth));
						if (pasteConfToUse == null) {
							pasteConfToUse = (PasteEObjectConfiguration) getPasteConfigurationsFor(depth, null);
							if (pasteConfToUse != null) {
								confMap.put(Integer.valueOf(depth), pasteConfToUse);
							} else {
								IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, PasteSeverityCode.PASTE_ERROR__NO_PASTE_CONFIGURATION, NLS.bind("No paste configuration found for the depth {0}", depth), null);
								return new CommandResult(status);
							}
						}
						// get the paste configuration to use

						// get the element type to use to create the element
						IElementType typeToCreate = ElementTypeRegistry.getInstance().getType(pasteConfToUse.getPastedElementId());

						EStructuralFeature containmentFeature = pasteConfToUse.getPasteElementContainementFeature();

						// get the context to use
						EObject context = contextMap.get(depth - 1);
						final CreateElementRequest createRequest1 = new CreateElementRequest(contextEditingDomain, context, typeToCreate, (EReference) containmentFeature);
						final IElementEditService creationContextCommandProvider = ElementEditServiceUtils.getCommandProvider(context);

						final ICommand commandCreation = creationContextCommandProvider.getEditCommand(createRequest1);
						if (commandCreation.canExecute()) {

							// 1. we create the element
							commandCreation.execute(monitor, info);
							nbCreatedElements++;

							// 2. we get the result of the command
							final CommandResult res = commandCreation.getCommandResult();
							commandCreation.dispose();

							// 3 we update the map
							final Object createdElement = res.getReturnValue();
							contextMap.put(Integer.valueOf(depth), (EObject) createdElement);

							// 4. we use the label to do a set name command on the created element

							// TODO : this class should be in oep.infra.emf.nattable
							if (createdElement instanceof EObject) {
								// TODO : this past must be specific for EMF AND for UML
								EObject eobject = (EObject) createdElement;
								// get the feature used as ID for the element
								EStructuralFeature nameFeature = ((EObject) createdElement).eClass().getEStructuralFeature("name"); //$NON-NLS-1$
								if (nameFeature != null) {
									SetRequest setNameRequest = new SetRequest(contextEditingDomain, (EObject) createdElement, nameFeature, valueAsString);
									final IElementEditService createdElementCommandProvider = ElementEditServiceUtils.getCommandProvider(createdElement);
									if (createdElementCommandProvider != null) {
										ICommand setName = createdElementCommandProvider.getEditCommand(setNameRequest);
										if (setName != null && setName.canExecute()) {
											setName.execute(monitor, info);
										}
									}
								}
								// we add the created element to the table, only if its parent is the context of the table and if the table is filled by DnD
								if (!FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(table, 0) && ((EObject) createdElement).eContainer() == tableContext) {
									final Command addCommand = tableManager.getAddRowElementCommand(Collections.singleton(createdElement));

									if (addCommand != null) {// can be null
										addCommand.execute();
										addCommand.dispose();
									}
								}
							}


							crossCellIteratorToFirstBodyCell(cellIter, nbReadCell);

							while (secondAxisIterator.hasNext() && cellIter.hasNext()) {
								// we must exit of the header part!
								valueAsString = cellIter.next();

								final Object currentAxis = secondAxisIterator.next();
								// valueAsString = cellIter.next();
								final Object columnObject;
								final Object rowObject;
								// if (pasteColumn) {
								// columnObject = createdElement;
								// rowObject = currentAxis;
								// } else {
								columnObject = currentAxis;
								rowObject = createdElement;
								// }


								boolean isEditable = CellManagerFactory.INSTANCE.isCellEditable(columnObject, rowObject);

								if (isEditable) {
									final AbstractStringValueConverter converter = CellManagerFactory.INSTANCE.getOrCreateStringValueConverterClass(columnObject, rowObject, tableManager, existingConverters, pasteHelper.getMultiValueSeparator());
									final Command setValueCommand = CellManagerFactory.INSTANCE.getSetStringValueCommand(contextEditingDomain, columnObject, rowObject, valueAsString, converter, tableManager);
									if (setValueCommand != null && setValueCommand.canExecute()) {
										try {
											setValueCommand.execute();
										} catch (Exception e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										setValueCommand.dispose();
									}
								}
							}

							int tooManyCellOnRow = 0;
							while (cellIter.hasNext()) {
								cellIter.next();// required
								tooManyCellOnRow++;
							}

							if (tooManyCellOnRow != 0) {
								String message = NLS.bind("There are too many cells on the rows number {0}", nbReadLine);
								IStatus status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, PasteSeverityCode.PASTE_WARNING__TOO_MANY_CELLS_ON_ROWS, message, null);
								resultStatus.add(status);
							}
						}
					}
				}
				progressMonitor.done();
				localDispose();
				if (resultStatus.isEmpty()) {
					return CommandResult.newOKCommandResult();
				} else {
					// TODO : use me
					IStatus resultingStatus = new MultiStatus(Activator.PLUGIN_ID, IStatus.OK, resultStatus.toArray(new IStatus[resultStatus.size()]), "The paste has been done, but we found some problems", null);
					return new CommandResult(resultingStatus);
				}
			}
		};
		return pasteAllCommand;
	}

	protected boolean useDetachedMode() {
		// TODO
		return false;
	}

	protected Command getSetNameCommandusingLabel(Object createdElement, String label) {

		return null;
	}

	/**
	 *
	 * @param commandCreationCancelProvider
	 *            the creation command progress monitor
	 * @param commandExecutionProgressMonitor
	 *            the command execution progress monitor
	 * @return
	 */
	private ICommand getPasteFromStringCommandInAttachedMode(final TransactionalEditingDomain contextEditingDomain, final TransactionalEditingDomain tableEditingDomain, final IProgressMonitor progressMonitor) {
		if (this.pasteColumn) {
			return new UnexecutableCommand(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "We can't paste columns in a tree table"));
		} else {
			return getPasteRowFromStringInAttachedModeCommand(contextEditingDomain, tableEditingDomain, progressMonitor);
		}
	}

	/**
	 *
	 * @return
	 *         the list of the post actions to do
	 */
	private Collection<String> getPostActions() {
		return this.postActions;
	}

	/**
	 * dispose fields of the class
	 */
	private void localDispose() {
		this.isDisposed = true;
		this.tableManager = null;
		this.typeToCreate = null;
		this.containmentFeature = null;
		for (final AbstractStringValueConverter current : existingConverters.values()) {
			current.dispose();
		}
		this.existingConverters.clear();
		try {
			this.reader.close();
		} catch (IOException e) {
			Activator.log.error(e);
		}
	}

}
