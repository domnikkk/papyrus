/*****************************************************************************
 * Copyright (c) 2013, 2014 Atos, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Arthur Daussy (Atos) arthur.daussy@atos.net - Initial API and implementation
 *  Christian W. Damus - bug 399859
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 436952
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.services.controlmode.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeRequest;

/**
 * Command used to create new controlled resource.
 * This command will create the new resources. It will also handle correctly undo and redo
 *
 * @author adaussy
 *
 */
public class CreateControlResource extends AbstractControlResourceCommand {

	/**
	 * @param request
	 *            {@link CreateControlResource#request}
	 */
	public CreateControlResource(ControlModeRequest request) {
		super(request, "Create a control resource", null);
	}

	/**
	 * @param request
	 *            {@link CreateControlResource#request}
	 * @param newFileExtension
	 *            {@link CreateControlResource#newFileExtension}
	 */
	public CreateControlResource(ControlModeRequest request, String newFileExtension) {
		this(request);
		this.newFileExtension = newFileExtension;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		Resource resource = getResourceSet().getResource(getTargetUri(), false);
		boolean resourceInSet = resource != null;
		if (resourceInSet) {
			if (failedToLoadBecauseNonExistent(resource) || isNotYetDeteted(resource)) {
				/*
				 * It doesn't exist or it will be deleted during the save, so by re-creating it we may actually help to fix unresolved proxies
				 * (such as from an out-of-date sash model)
				 */
				resource.getResourceSet().getResources().remove(resource);
				resource = null;
				resourceInSet = false;
			} else {
				return CommandResult.newErrorCommandResult("The resource is already in the resource set");
			}
		}
		Resource newResource = getResourceSet().createResource(getTargetUri());
		if (newResource == null) {
			return CommandResult.newErrorCommandResult("Unable to create new resource to control");
		}
		// Set the new created target to the request if other command need it
		getRequest().setTargetResource(newResource, getFileExtension());
		// Force modified to true to force serialization
		newResource.setModified(true);
		// In case the resource has been uncontrolled before the it's still the resource to delete on save of the model set. So it has to be removed
		getRequest().getModelSet().getResourcesToDeleteOnSave().remove(newResource.getURI());
		return CommandResult.newOKCommandResult(newResource);
	}

	/**
	 * Checks if the resource is not yet detete.
	 *
	 * @param resource
	 *            the resource
	 * @return true, if is not yet detete
	 */
	protected boolean isNotYetDeteted(Resource resource) {
		boolean result = false;
		ResourceSet resourceSet = getResourceSet();
		if (resourceSet instanceof ModelSet) {
			result = ((ModelSet) resourceSet).getResourcesToDeleteOnSave().contains(resource.getURI());
		}
		return result;
	}

	/**
	 * Failed to load because non existent.
	 *
	 * @param resource
	 *            the resource
	 * @return true, if successful
	 */
	protected boolean failedToLoadBecauseNonExistent(Resource resource) {
		boolean result = false;

		if (resource.getContents().isEmpty() && !resource.getErrors().isEmpty()) {
			// Does it exist to load it?
			result = !resource.getResourceSet().getURIConverter().exists(resource.getURI(), null);
		}

		return result;
	}

	@Override
	protected IStatus doUndo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		IStatus superStatus = super.doUndo(monitor, info);
		// delete the related file
		Resource oldResource = getRequest().getTargetResource(getFileExtension());
		getResourceSet().getResources().remove(oldResource);
		ModelSet modelSet = getRequest().getModelSet();
		if (modelSet == null) {
			return CommandResult.newErrorCommandResult("Unable to get model set").getStatus();
		}
		modelSet.getResourcesToDeleteOnSave().add(oldResource.getURI());
		return superStatus;
	}

	@Override
	protected IStatus doRedo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		// Re add the resources to the resourceSet
		Resource oldResource = getRequest().getTargetResource(getFileExtension());
		getResourceSet().getResources().add(oldResource);
		ModelSet modelSet = getRequest().getModelSet();
		if (modelSet == null) {
			return CommandResult.newErrorCommandResult("Unable to get model set").getStatus();
		}
		modelSet.getResourcesToDeleteOnSave().remove(oldResource.getURI());
		oldResource.setModified(true);
		return super.doRedo(monitor, info);
	}
}
