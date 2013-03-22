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
package org.eclipse.papyrus.controlmode.umlprofiles.commands;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.papyrus.controlmode.commands.AbstractControlCommandRequest;
import org.eclipse.papyrus.controlmode.request.ControlModeRequest;
import org.eclipse.papyrus.controlmode.umlprofiles.helpers.ProfileApplicationHelper;
import org.eclipse.uml2.uml.Package;

/**
 * Command used to move Profile application to new resource
 * 
 * @author adaussy
 * 
 */
public class MoveProfileApplicationCommand extends AbstractControlCommandRequest {


	public MoveProfileApplicationCommand(ControlModeRequest request) {
		super("Move stereotype applicaiton to new resource", Collections.singletonList(WorkspaceSynchronizer.getFile(request.getTargetObject().eContainer().eResource())), request);
		Assert.isLegal(request.getTargetObject() instanceof Package);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor,
	 * org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		Package packageUncontroled = (Package)getRequest().getTargetObject();
		Resource targetResource = getRequest().getTargetResource(getRequest().getNewURI().fileExtension());
		if(targetResource == null) {
			return CommandResult.newErrorCommandResult("Unable to retreive target resource");
		}
		ProfileApplicationHelper.nestedRelocateStereotypeApplications(packageUncontroled, targetResource);
		return CommandResult.newOKCommandResult();
	}
}