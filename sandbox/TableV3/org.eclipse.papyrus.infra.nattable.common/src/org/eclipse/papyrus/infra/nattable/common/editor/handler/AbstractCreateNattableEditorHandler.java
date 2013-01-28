/*****************************************************************************
 * Copyright (c) 2011 LIFL & CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin (LIFL) cedric.dumoulin@lifl.fr - Initial API and implementation
 *  Vincent Lorenzo (CEA-LIST) vincent.lorenzo@cea.fr
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.common.editor.handler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.core.editor.BackboneException;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageMngr;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.EditorUtils;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForHandlers;
import org.eclipse.papyrus.infra.nattable.common.Activator;
import org.eclipse.papyrus.infra.nattable.common.modelresource.PapyrusNattableModel;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattableFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.LocalTableEditorConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.NattableconfigurationFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.TableEditorConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablecontentprovider.IAxisContentsProvider;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablecontentprovider.NattablecontentproviderFactory;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * @author dumoulin
 *
 */
public abstract class AbstractCreateNattableEditorHandler extends AbstractHandler {

	/** the default name for the table */
	private final String defaultName;

	/** the default description for the table */
	private final String defaultDescription = "Table Description"; //$NON-NLS-1$

	/** the description for the table */
	private String description;

	/** the name for the table */
	private String name;

	/** the editor type */
	private final String editorType;

	/**
	 *
	 * Constructor.
	 *
	 * @param editorType
	 *        the type of the editor
	 * @param defaultName
	 *        the default name for this editor
	 */
	public AbstractCreateNattableEditorHandler(final String editorType, final String defaultName) {
		Assert.isNotNull(editorType != null);
		this.editorType = editorType;
		this.defaultName = defaultName;
	}

	/**
	 * Should be overridden in order to restrict creation
	 *
	 * @see org.eclipse.core.commands.AbstractHandler#isEnabled()
	 *
	 * @return
	 */
	@Override
	public boolean isEnabled() {
		return true;
		//		EObject context = getTableContext();
		//		return context != null;
	}

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		try {
			runAsTransaction(event);
		} catch (final ServiceException e) {
			throw new ExecutionException("Can't create TableEditor", e); //$NON-NLS-1$
		}
		return null;
	}

	/**
	 * Run the command as a transaction. Create a Transaction and delegate the
	 * command to {@link #doExecute(ServicesRegistry)}.
	 *
	 * @throws ServiceException
	 *
	 */
	public void runAsTransaction(final ExecutionEvent event) throws ServiceException {
		// default Value
		this.name = this.defaultName;
		this.description = this.defaultDescription;
		final InputDialog dialog = new InputDialog(Display.getDefault().getActiveShell(), "Papyrus Table Creation", "Enter the name for the new table", this.defaultName, null);
		if(dialog.open() == Dialog.OK) {
			this.name = dialog.getValue();
			final ServicesRegistry serviceRegistry = ServiceUtilsForHandlers.getInstance().getServiceRegistry(event);
			final TransactionalEditingDomain domain = ServiceUtils.getInstance().getTransactionalEditingDomain(serviceRegistry);
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					try {
						AbstractCreateNattableEditorHandler.this.doExecute(serviceRegistry);
					} catch (final NotFoundException e) {
						Activator.log.error(e);
					} catch (final ServiceException e) {
						Activator.log.error(e);
					}

				}
			});
		}
		// FIXME
		// TwoInputDialog dialog = new TwoInputDialog(
		// Display.getCurrent().getActiveShell(),
		// Messages.AbstractCreateNattableEditorCommand_CreateNewTableDialogTitle,
		// Messages.AbstractCreateNattableEditorCommand_CreateNewTableDialog_TableNameMessage,
		// Messages.AbstractCreateNattableEditorCommand_CreateNewTableDialog_TableDescriptionMessage,
		// defaultName, defaultDescription, null);
		// if (dialog.open() == Dialog.OK) {
		// // get the name and the description for the table
		// name = dialog.getValue();
		// description = dialog.getValue_2();
		//
		// final ServicesRegistry serviceRegistry =
		// ServiceUtilsForActionHandlers
		// .getInstance().getServiceRegistry();
		// TransactionalEditingDomain domain = ServiceUtils.getInstance()
		// .getTransactionalEditingDomain(serviceRegistry);
		//
		// // Create the transactional command
		// AbstractEMFOperation command = new AbstractEMFOperation(domain,
		//					"Create Table Editor") { //$NON-NLS-1$
		//
		// @Override
		// protected IStatus doExecute(final IProgressMonitor monitor,
		// final IAdaptable info) throws ExecutionException {
		// try {
		// AbstractCreateNattableEditorCommand.this
		// .doExecute(serviceRegistry);
		// } catch (ServiceException e) {
		// e.printStackTrace();
		// return Status.CANCEL_STATUS;
		// } catch (NotFoundException e) {
		// e.printStackTrace();
		// return Status.CANCEL_STATUS;
		// }
		// return Status.OK_STATUS;
		// }
		// };

		// // Execute the command
		// try {
		// CheckedOperationHistory.getInstance().execute(command,
		// new NullProgressMonitor(), null);
		// } catch (ExecutionException e) {
		// Activator.getDefault().log
		//						.error("Can't create Table Editor", e); //$NON-NLS-1$
		// }
		//
		// }
	}

	/**
	 * Do the execution of the command.
	 *
	 * @param serviceRegistry
	 * @throws ServiceException
	 * @throws NotFoundException
	 */
	public void doExecute(final ServicesRegistry serviceRegistry) throws ServiceException, NotFoundException {

		final Object editorModel = createEditorModel(serviceRegistry);
		// Get the mngr allowing to add/open new editor.
		final IPageMngr pageMngr = ServiceUtils.getInstance().getIPageMngr(serviceRegistry);
		// add the new editor model to the sash.
		pageMngr.openPage(editorModel);

	}

	/**
	 * Create a model identifying the editor. This model will be saved with the
	 * sash
	 *
	 * @return
	 * @throws ServiceException
	 * @throws NotFoundException
	 *         The model where to save the TableInstance is not found.
	 */
	protected Object createEditorModel(final ServicesRegistry serviceRegistry) throws ServiceException, NotFoundException {

		final Table table = NattableFactory.eINSTANCE.createTable();
		final LocalTableEditorConfiguration localConfig = NattableconfigurationFactory.eINSTANCE.createLocalTableEditorConfiguration();
		localConfig.setType(this.editorType);
		final TableEditorConfiguration defaultConfig = getDefaultTableEditorConfiguration();
		assert defaultConfig != null;

		localConfig.setDefaultTableEditorConfiguration(defaultConfig);

		table.setEditorConfiguration(localConfig);
		table.setDescription(this.description);
		table.setName(this.name);
		table.setContext(getTableContext());


		IAxisContentsProvider rowProvider = defaultConfig.getDefaultHorizontalContentProvider();
		if(rowProvider == null) {
			rowProvider = NattablecontentproviderFactory.eINSTANCE.createDefaultContentProvider();
		} else {
			final IAxisContentsProvider copy = EcoreUtil.copy(rowProvider);
			//FIXME : shoulw we clean the axis for default config?
			int i = 0;
			i++;
			rowProvider = copy;
		}

		IAxisContentsProvider columnProvider = defaultConfig.getDefaultVerticalContentProvider();
		if(columnProvider == null) {
			columnProvider = NattablecontentproviderFactory.eINSTANCE.createDefaultContentProvider();
		} else {
			final IAxisContentsProvider copy = EcoreUtil.copy(columnProvider);
			//FIXME : shoulw we clean the axis for default config?
			int i = 0;
			i++;
			columnProvider = copy;
		}

		//		final IAxisContentsProvider columnProvider = NattablecontentproviderFactory.eINSTANCE.createDefaultContentProvider();

		table.setHorizontalContentProvider(rowProvider);
		table.setVerticalContentProvider(columnProvider);

		// Save the model in the associated resource
		final PapyrusNattableModel model = (PapyrusNattableModel)ServiceUtils.getInstance().getModelSet(serviceRegistry).getModelChecked(PapyrusNattableModel.MODEL_ID);
		model.addPapyrusTable(table);
		return table;
	}


	protected TableEditorConfiguration getDefaultTableEditorConfiguration() {
		final EObject current = getSelection().get(0);
		final ResourceSet resourceSet = current.eResource().getResourceSet();
		final Resource resource = resourceSet.getResource(getTableEditorConfigurationURI(), true);
		TableEditorConfiguration tableConfiguration = null;
		if(resource.getContents().get(0) instanceof TableEditorConfiguration) {
			tableConfiguration = (TableEditorConfiguration)resource.getContents().get(0);
		}
		return tableConfiguration;
	}


	protected abstract URI getTableEditorConfigurationURI();

	/**
	 * Get the current MultiDiagramEditor.
	 *
	 * @return
	 * @throws BackboneException
	 */
	protected IMultiDiagramEditor getMultiDiagramEditor() throws BackboneException {
		return EditorUtils.getMultiDiagramEditorChecked();
	}

	/**
	 * Returns the context used to create the table
	 *
	 * @return
	 *         the context used to create the table or <code>null</code> if not found
	 * @throws ServiceException
	 */
	//FIXME: This method introduces a dependency to UML. Use the semantic service instead.
	protected EObject getTableContext() {
		final List<EObject> selection = getSelection();

		if(!selection.isEmpty()) {
			return selection.get(0);
		}
		//FIXME
		//
		//		//we shouldn't try to find a valid context when the selection is not valid!
		//		ModelSet modelSet = null;
		//		ServicesRegistry serviceRegistry;
		//		try {
		//			serviceRegistry = ServiceUtilsForActionHandlers.getInstance().getServiceRegistry();
		//			modelSet = ServiceUtils.getInstance().getModelSet(serviceRegistry);
		//		} catch (NullPointerException npe) {
		//			//
		//		} catch (ServiceException exception) {
		//
		//		}
		//
		//
		//		if(modelSet != null) {
		//			IModel model = modelSet.getModel(org.eclipse.papyrus.uml.tools.model.UmlModel.MODEL_ID);
		//
		//			if(model instanceof AbstractBaseModel) {
		//				return getRootElement(((AbstractBaseModel)model).getResource());
		//			}
		//		}
		return null;
	}

	/**
	 *
	 * @return
	 */
	protected List<EObject> getSelection() {
		final List<EObject> selectedElements = new ArrayList<EObject>();
		final IWorkbenchWindow ww = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if(ww != null) {
			final ISelection selection = ww.getSelectionService().getSelection();
			if(selection instanceof IStructuredSelection) {

				final IStructuredSelection structuredSelection = (IStructuredSelection)selection;

				final Iterator<?> it = structuredSelection.iterator();
				while(it.hasNext()) {
					final Object object = it.next();
					if(object instanceof IAdaptable) {
						final EObject currentEObject = (EObject)((IAdaptable)object).getAdapter(EObject.class);

						if(currentEObject != null) {
							selectedElements.add(currentEObject);
						}
					}

				}
			}
		}
		return selectedElements;
	}

	/**
	 * Get the root element associated with canvas.
	 */
	protected EObject getRootElement(final Resource modelResource) {
		EObject rootElement = null;
		if(modelResource != null && modelResource.getContents() != null && modelResource.getContents().size() > 0) {
			final Object root = modelResource.getContents().get(0);
			if(root instanceof EObject) {
				rootElement = (EObject)root;
			}
		}
		return rootElement;
	}

}