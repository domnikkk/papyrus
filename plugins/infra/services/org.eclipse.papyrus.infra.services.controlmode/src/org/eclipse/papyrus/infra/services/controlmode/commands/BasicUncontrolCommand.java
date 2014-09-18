/*****************************************************************************
 * Copyright (c) 2013 Atos.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Arthur Daussy (Atos) arthur.daussy@atos.net - Initial API and implementation
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.ent - Bug 436998
 *****************************************************************************/
package org.eclipse.papyrus.infra.services.controlmode.commands;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResource;
import org.eclipse.papyrus.infra.services.controlmode.ControlModePlugin;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeRequest;
import org.eclipse.papyrus.infra.services.controlmode.service.IUncontrolledObjectsProvider;

/**
 * Basic action to uncontrol an element
 *
 * @author adaussy
 *
 */
public class BasicUncontrolCommand extends AbstractControlCommand {


	/**
	 * @param request
	 */
	public BasicUncontrolCommand(ControlModeRequest request) {
		super("Basic uncontrol files", Collections.singletonList(WorkspaceSynchronizer.getFile(request.getTargetObject().eResource())), request);
	}

	/**
	 * @see org.eclipse.core.commands.operations.AbstractOperation#canExecute()
	 *
	 * @return
	 */
	@Override
	public boolean canExecute() {
		return getRequest().getTargetObject().eResource() != null;
	}

	/**
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 *
	 * @param monitor
	 * @param info
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		EObject uncontrolledObject = getRequest().getTargetObject();
		ModelSet modelSet = getRequest().getModelSet();
		Resource resource = modelSet.getResource(getRequest().getSourceURI(), true);

		if (resource != null) {

			// Register uncontrolled object to service
			try {
				IUncontrolledObjectsProvider service = ServiceUtilsForResource.getInstance().getService(IUncontrolledObjectsProvider.class, resource);
				service.addUncontrolledObject(resource, uncontrolledObject);
			} catch (ServiceException e) {
				ControlModePlugin.log.error("Impossible to retrieve the service for uncontrolling objects", e);
			}

			// Remove uncontrolled object to its resource
			resource.getContents().remove(uncontrolledObject);
			resource.setModified(true);


			return CommandResult.newOKCommandResult();
		}

		return CommandResult.newErrorCommandResult("The object is not contained in a resource");
	}
}
