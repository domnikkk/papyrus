/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Juan Cadavid (CEA LIST) juan.cadavid@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.nattable.menu.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.papyrus.commands.wrappers.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.manager.table.ITreeNattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.provider.TableSelectionProvider;
import org.eclipse.papyrus.infra.nattable.provider.TableStructuredSelection;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.infra.nattable.utils.INattableModelManagerUtils;
import org.eclipse.papyrus.infra.nattable.utils.TableHelper;
import org.eclipse.papyrus.infra.nattable.utils.TableSelectionWrapper;
import org.eclipse.papyrus.uml.nattable.menu.messages.Messages;
import org.eclipse.papyrus.uml.service.types.utils.CommandContext;
import org.eclipse.papyrus.uml.service.types.utils.ICommandContext;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;

/**
 * Utilities for the creation of contextual menus from the Nattable editor
 */
public class TableMenuUtils {

	/**
	 * key registered in the parameter map of the CommandContext to know is we need to create a new IAxis for the created element.
	 * An IAxis will be created in all cases, excepted is the value associated to this key is <code>false</code>
	 */
	public static final String CREATE_NEW_AXIS_IN_TABLE_KEY = "CreateNewAxisInTable"; //$NON-NLS-1$

	/**
	 *
	 *
	 * @param tableManager
	 *            the table manager
	 * @return
	 *         the command context to use to create new elements in the table
	 * 
	 * @Deprecated : use {@link #getTableCreateElementCommandContext(INattableModelManager)} instead
	 */
	@Deprecated
	public static ICommandContext getTableCommandContext(final INattableModelManager tableManager) {
		// INattableModelManager manager = tableManager;
		// if (manager != null) {
		// final EObject container = manager.getTable().getContext();
		// ICommandContext context = null;
		// if (container != null) {
		// context = new CommandContext(container);
		// }
		// return context;
		// }
		return getTableCreateElementCommandContext(tableManager);
	}

	/**
	 *
	 *
	 * @param tableManager
	 *            the table manager
	 * @return
	 *         the command context to use to create new elements in the table
	 */
	public static ICommandContext getTableCreateElementCommandContext(final INattableModelManager tableManager) {
		INattableModelManager manager = tableManager;
		Map<Object, Object> parameters = new HashMap<Object, Object>();
		if (manager != null) {
			EObject container = manager.getTable().getContext();
			if (TableHelper.isTreeTable(tableManager) && tableManager instanceof ITreeNattableModelManager) {
				// TODO : table manager should provide its selection provider
				ISelectionService service = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
				ISelection selection = service.getSelection();
				if (selection instanceof TableStructuredSelection) {
					TableStructuredSelection selectionprovider = (TableStructuredSelection) selection;
					TableSelectionWrapper selectionWrapper = (TableSelectionWrapper) selectionprovider.getAdapter(TableSelectionWrapper.class);
					Map<Integer, Object> rows = selectionWrapper.getFullySelectedRows();
					if (rows.size() == 1) {
						Object fullySelectedRow = rows.values().iterator().next();
						if (fullySelectedRow instanceof EObjectTreeItemAxis && ((EObjectTreeItemAxis) fullySelectedRow).getElement() instanceof Element) {
							container = ((EObjectTreeItemAxis) fullySelectedRow).getElement();
							parameters.put(CREATE_NEW_AXIS_IN_TABLE_KEY, Boolean.FALSE);
							// we should verify the depth of the hierarchic table to forbid the creation when the element will not be displayed as new column

							// List<ITreeItemAxis> path = new ArrayList<ITreeItemAxis>();
							// ((ITreeNattableModelManager)tableManager).getTreeFormat().getPath(path, (ITreeItemAxis) fullySelectedRow);
							// int depth = path.size()-1;
							// container = ((EObjectTreeItemAxis) fullySelectedRow).getElement();
						}
					}
				}
			}
			ICommandContext context = null;
			if (container != null) {
				context = new CommandContext(container, null, parameters);
			}
			return context;
		}
		return null;
	}

	/**
	 *
	 * @param createCmd
	 *            the create command
	 * @param createElementRequest
	 *            the create element request
	 * @return
	 *         the command to use to create elements in the table editor
	 */
	public static Command buildNattableCreationCommand(Command createCmd, final CreateElementRequest createElementRequest) {
		final INattableModelManager nattableModelManager = INattableModelManagerUtils.getTableManagerFromWorkbenchPart(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart());
		if (nattableModelManager != null) {
			CompositeCommand cmd = new CompositeCommand(""); //$NON-NLS-1$
			cmd.add(new EMFtoGMFCommandWrapper(createCmd));

			Object value = createElementRequest.getParameters().get(CREATE_NEW_AXIS_IN_TABLE_KEY);
			// depends on the synchronization of the axis manager
			if (value == null || Boolean.TRUE.equals(value)) {
				cmd.add(new AbstractTransactionalCommand(createElementRequest.getEditingDomain(), Messages.AbstractNattableCreateCommandHandler_AddElementCommand, null) {

					@Override
					protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
						EObject newElement = createElementRequest.getNewElement();
						Collection<Object> toAdd = new ArrayList<Object>();
						toAdd.add(newElement);
						Command tmp = nattableModelManager.getAddRowElementCommand(toAdd);
						if (tmp != null) {
							tmp.execute();
						}
						return CommandResult.newOKCommandResult();
					}
				});
			}
			return new org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper(cmd);

		}
		return UnexecutableCommand.INSTANCE;
	}

}
