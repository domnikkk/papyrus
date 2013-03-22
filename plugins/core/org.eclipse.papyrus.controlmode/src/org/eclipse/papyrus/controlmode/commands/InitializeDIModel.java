/*****************************************************************************
 * Copyright (c) 2012 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Tristan FAURE (Atos) tristan.faure@atos.net- Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.controlmode.commands;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.controlmode.interfaces.ControlModeRequestParameters;
import org.eclipse.papyrus.controlmode.request.ControlModeRequest;
import org.eclipse.papyrus.resource.sasheditor.DiModel;
import org.eclipse.papyrus.resource.sasheditor.SashModel;
import org.eclipse.papyrus.resource.sasheditor.SashModelUtils;
import org.eclipse.papyrus.sashwindows.di.PageRef;
import org.eclipse.papyrus.sashwindows.di.SashWindowsMngr;
import org.eclipse.papyrus.sashwindows.di.exception.SashEditorException;
import org.eclipse.papyrus.sashwindows.di.util.DiUtils;

import com.google.common.collect.Iterables;

/**
 * Initialize the di resource with all necessary informations
 * ex : Page Ref
 * 
 * @author adaussy
 * 
 */
public class InitializeDIModel extends AbstractControlCommandRequest {


	/**
	 * @param request
	 */
	public InitializeDIModel(ControlModeRequest request) {
		super("Initialize di", null, request);
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
		/*
		 * Get from the request tab and diagrams being moved
		 */
		Collection<Diagram> diags = getMovedDiagramToRequest();
		Collection<EObject> tabs = getMovedTabToRequest();
		if(diags.isEmpty() && tabs.isEmpty()) {
			return CommandResult.newOKCommandResult();
		}
		try {
			Iterables.addAll(tabs, diags);
			SashWindowsMngr sashMng = createSashWindowsMngr(tabs);
			Resource diResource = getDiResource();
			if(diResource == null) {
				return CommandResult.newErrorCommandResult("Unable to find DI resource");
			}
			diResource.getContents().add(sashMng);
		} catch (SashEditorException e) {
			e.printStackTrace();
			return CommandResult.newErrorCommandResult(e);
		}
		return  CommandResult.newOKCommandResult();
	}

	/**
	 * @return the diagram being moved from the request
	 */
	@SuppressWarnings("unchecked")
	protected Collection<Diagram> getMovedDiagramToRequest() {
		Collection<Diagram> diagrams = (Collection<Diagram>)getRequest().getParameter(ControlModeRequestParameters.MOVED_DIAGRAM);
		if(diagrams == null) {
			return Collections.emptyList();
		}
		return diagrams;
	}

	/**
	 * @return tables being moved from the request
	 */
	@SuppressWarnings("unchecked")
	protected Collection<EObject> getMovedTabToRequest() {
		Collection<EObject> tabs = (Collection<EObject>)getRequest().getParameter(ControlModeRequestParameters.MOVED_TAB);
		if(tabs == null) {
			return Collections.emptyList();
		}
		return tabs;
	}

	/**
	 * @return retreive the di resource from the request
	 */
	protected Resource getDiResource() {
		return getRequest().getTargetResource(DiModel.MODEL_FILE_EXTENSION);
	}

	/**
	 * Create a new {@link SashModel} and add page ref for each diagrams and tables being controled
	 * 
	 * @param openables
	 * @return
	 * @throws SashEditorException
	 */
	protected SashWindowsMngr createSashWindowsMngr(Collection<EObject> openables) throws SashEditorException {
		// Create a new SashWindowManager
		SashWindowsMngr windowsMngr = DiUtils.createDefaultSashWindowsMngr();
		Resource diResource = SashModelUtils.getSashModel(getRequest().getModelSet()).getResource();
		// add pages to the page list
		for(EObject openable : openables) {
			PageRef pageRef = DiUtils.getPageRef(diResource, openable);
			/*
			 * TODO Investigate why the di resource is not track for modification
			 * Hack to force old di be serialized
			 */
			pageRef.eResource().setModified(true);
			if(pageRef != null) {
				windowsMngr.getPageList().addPage(pageRef.getPageIdentifier());
				DiUtils.addPageToTabFolder(windowsMngr, pageRef);
			}
		}
		return windowsMngr;
	}

}