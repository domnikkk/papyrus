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
 *
 *****************************************************************************/
package org.eclipse.papyrus.controlmode.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.papyrus.controlmode.request.ControlModeRequest;
import org.eclipse.papyrus.resource.ModelSet;

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
	 *        {@link CreateControlResource#request}
	 */
	public CreateControlResource(ControlModeRequest request) {
		super(request, "Create a control resource", null);
	}

	/**
	 * @param request
	 *        {@link CreateControlResource#request}
	 * @param newFileExtension
	 *        {@link CreateControlResource#newFileExtension}
	 */
	public CreateControlResource(ControlModeRequest request, String newFileExtension) {
		this(request);
		this.newFileExtension = newFileExtension;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor,
	 * org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		Resource resource = getResourceSet().getResource(getTargetUri(), false);
		boolean resourceInSet = resource != null;
		if(resourceInSet) {
			return CommandResult.newErrorCommandResult("The resource is aleady in the resource set");
		}
		Resource newResource = getResourceSet().createResource(getTargetUri());
		if(newResource == null) {
			return CommandResult.newErrorCommandResult("Unable to create new resource to control");
		}
		//Set the new created target to the request if other command need it
		getRequest().setTargetResource(newResource, getFileExtension());
		//Force modfied to true to force serialization
		newResource.setModified(true);
		//In case the resource has been uncontroled before the it's still the resource to delete on save of the model set. So it has to be removed
		getRequest().getModelSet().getResourcesToDeleteOnSave().remove(newResource.getURI());
		return CommandResult.newOKCommandResult(newResource);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doUndo(org.eclipse.core.runtime.IProgressMonitor,
	 * org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected IStatus doUndo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		IStatus superStatus = super.doUndo(monitor, info);
		//delete the related file
		Resource oldResource = getRequest().getTargetResource(getFileExtension());
		getResourceSet().getResources().remove(oldResource);
		ModelSet modelSet = getRequest().getModelSet();
		if(modelSet == null) {
			return CommandResult.newErrorCommandResult("Unable to get model set").getStatus();
		}
		modelSet.getResourcesToDeleteOnSave().add(oldResource.getURI());
		return superStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doRedo(org.eclipse.core.runtime.IProgressMonitor,
	 * org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected IStatus doRedo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		//Re add the resources to the resourceSet
		Resource oldResource = getRequest().getTargetResource(getFileExtension());
		getResourceSet().getResources().add(oldResource);
		ModelSet modelSet = getRequest().getModelSet();
		if(modelSet == null) {
			return CommandResult.newErrorCommandResult("Unable to get model set").getStatus();
		}
		modelSet.getResourcesToDeleteOnSave().remove(oldResource.getURI());
		oldResource.setModified(true);
		return super.doRedo(monitor, info);
	}
}
