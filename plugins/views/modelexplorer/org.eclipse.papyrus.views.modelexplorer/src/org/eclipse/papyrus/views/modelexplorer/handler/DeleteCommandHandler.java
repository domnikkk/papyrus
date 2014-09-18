/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 * 		Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec - Bug 436952
 *
 *****************************************************************************/
package org.eclipse.papyrus.views.modelexplorer.handler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeManager;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeRequest;
import org.eclipse.papyrus.infra.services.controlmode.IControlModeManager;
import org.eclipse.papyrus.infra.services.controlmode.util.ControlHelper;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.views.modelexplorer.Activator;

/**
 * Default handler for Delete command used in the ModelExplorer contextual menu.
 *
 */
public class DeleteCommandHandler extends AbstractCommandHandler implements IHandler {


	/**
	 * Check if the selection allow delete
	 *
	 * @param selectedElements
	 * @return
	 */
	public static boolean isDeleteEnabled(Collection<EObject> selectedElements) {
		if (selectedElements.size() == 0) {
			return false;
		}

		for (EObject current : selectedElements) {
			if (EMFHelper.isReadOnly(current)) {
				return false;
			}
			// the root of the model can't be deleted!
			if (current.eContainer() == null) {
				try {
					// Pages can be deleted even when they are root elements
					IPageManager pageManager = ServiceUtilsForEObject.getInstance().getIPageManager(current);
					if (pageManager.allPages().contains(current)) {
						return true;
					}
				} catch (ServiceException ex) {
					// Cannot retrieve the ServicesRegistry: ignore
				}
				return false;
			}
		}

		// Don't compute the delete command to know if it is enabled,
		// it can be WAY too slow...
		return true;
	}

	/**
	 * <pre>
	 *
	 * Build the delete command for a set of EObject selected in the ModelExplorer.
	 * The delete command is given by the {@link IElementEditService} of selected
	 * elements.
	 * @param selectedElements elements to delete
	 * @return the composite deletion command for current selection
	 *
	 * @TODO : Manage possible Diagrams listed in the selection
	 *
	 * </pre>
	 */
	public static Command buildDeleteCommand(Collection<EObject> selectedElements) {

		ICommand gmfCommand = null;

		// Parameters store the Request parameters of the previous request
		// if multiple elements are selected for deletion.
		Map parameters = new HashMap();

		for (EObject selectedEObject : selectedElements) {

			if (selectedEObject == null) {
				continue;
			}

			IElementEditService provider = ElementEditServiceUtils.getCommandProvider(selectedEObject);
			if (provider == null) {
				continue;
			}
			
			// Look for uncontrol mode command
			TransactionalEditingDomain editingDomain = null;
			try {
				editingDomain = ServiceUtilsForEObject.getInstance().getTransactionalEditingDomain(selectedEObject);
			} catch (ServiceException e) {
				Activator.log.error(e);
			}
			if (editingDomain !=null && ControlHelper.isRootControlledObject(selectedEObject)) {
				ControlModeRequest controlRequest = ControlModeRequest.createUIUncontrolModelRequest(editingDomain, selectedEObject);
				IControlModeManager controlMng = ControlModeManager.getInstance();
				ICommand controlCommand = controlMng.getUncontrolCommand(controlRequest);

				gmfCommand =  CompositeCommand.compose(gmfCommand, controlCommand);
			}

			// Retrieve delete command from the Element Edit service
			DestroyElementRequest request = new DestroyElementRequest(selectedEObject, false);
			// Add parameters (contains the list of previously dependents to be deleted
			// by previous commands.
			request.getParameters().putAll(parameters);

			ICommand deleteCommand = provider.getEditCommand(request);

			// Add current EObject destroy command to the global command
			gmfCommand = CompositeCommand.compose(gmfCommand, deleteCommand);

			// Store the new parameters for next delete command.
			parameters.clear();
			parameters.putAll(request.getParameters());
		}

		if (gmfCommand == null) {
			return UnexecutableCommand.INSTANCE;
		}

		return GMFtoEMFCommandWrapper.wrap(gmfCommand.reduce());
	}


	/**
	 *
	 * @see org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler#getCommand()
	 *
	 * @return current command (only built here when the stored command is null)
	 */
	@Override
	protected Command getCommand() {
		// Don't cache the command, as it is no more refreshed by isEnabled().
		return buildDeleteCommand(getSelectedElements());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected boolean computeEnabled() {
		return isDeleteEnabled(getSelectedElements());
	}

}
