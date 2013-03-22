/*******************************************************************************
 * Copyright (c) 2013 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Arthur Daussy <a href="mailto:arthur.daussy@atos.net"> - initial API and implementation
 ******************************************************************************/
package org.eclipse.papyrus.controlmode.table.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.papyrus.controlmode.interfaces.ControlModeRequestParameters;
import org.eclipse.papyrus.controlmode.request.ControlModeRequest;
import org.eclipse.papyrus.core.utils.PapyrusEcoreUtils;
import org.eclipse.papyrus.resource.sasheditor.DiModel;
import org.eclipse.papyrus.table.instance.papyrustableinstance.PapyrusTableInstance;
import org.eclipse.papyrus.uml.service.types.utils.ElementUtil;

import com.google.common.collect.Lists;

/**
 * Command to control tab in correct resources
 * 
 * @author adaussy
 * 
 */
public class ControlTableCommand extends AbstractTransactionalCommand {

	/**
	 * Control request used to control tabs
	 */
	private ControlModeRequest request;

	/**
	 * @param request
	 *        {@link ControlTableCommand#request}
	 */
	@SuppressWarnings("unchecked")
	public ControlTableCommand(ControlModeRequest request) {
		super(request.getEditingDomain(), "Move table to new resource", null);
		this.request = request;

		try {
			getAffectedFiles().addAll(getWorkspaceFiles(getTables()));
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

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
		EObject objectTOControl = request.getTargetObject();
		PapyrusEcoreUtils.getUsages(objectTOControl);
		//Retrieve new di resource created previously
		Resource newDiResource = getTargetDiResource();
		if(newDiResource == null) {
			return CommandResult.newErrorCommandResult("The di model has not been created");
		}
		List<EObject> tables = getTables();
		if(!tables.isEmpty()) {
			for(EObject tab : tables) {
				if(tab instanceof PapyrusTableInstance) {
					newDiResource.getContents().add(tab);
					newDiResource.getContents().add(((PapyrusTableInstance)tab).getTable());
				}
			}
			addMovedTabToRequest(tables);
		}
		return CommandResult.newOKCommandResult(newDiResource);
	}

	/**
	 * Retrieve the DI target resource from the request
	 * 
	 * @return
	 */
	private Resource getTargetDiResource() {
		return request.getTargetResource(DiModel.DI_FILE_EXTENSION);
	}

	/**
	 * Register the tab being moved to the request in ordert to be used by other participants
	 * 
	 * @param tables
	 */
	public void addMovedTabToRequest(List<EObject> tables) {
		@SuppressWarnings("unchecked")
		Collection<EObject> tabs = (Collection<EObject>)request.getParameter(ControlModeRequestParameters.MOVED_TAB);
		if(tabs == null) {
			tabs = new ArrayList<EObject>(tables);
		} else {
			tabs.addAll(tables);
		}
		request.addParameters(Collections.singletonMap(ControlModeRequestParameters.MOVED_TAB, tabs));
	}

	/**
	 * Get all the tab that need to be moved
	 * 
	 * @return
	 * @throws ExecutionException
	 */
	protected List<EObject> getTables() throws ExecutionException {
		return Lists.newArrayList(ElementUtil.createDescendantTablesIterable(request.getTargetObject()));
	}

	/**
	 * Retreive the URI of the old di resource
	 * 
	 * @return
	 * @throws ExecutionException
	 */
	public URI getOldNotationURI() throws ExecutionException {
		URI uri = request.getSourceURI();
		if(uri != null) {
			return uri.trimFileExtension().appendFileExtension(DiModel.DI_FILE_EXTENSION);
		}
		throw new ExecutionException("Unable to retreive URI of the old di model");
	}

}