/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
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
package org.eclipse.papyrus.views.modelexplorer.handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard;
import org.eclipse.papyrus.infra.gmfdiag.common.commands.DefaultCopyCommand;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.IStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.PasteStrategyManager;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;

/**
 * Handler for the Cut Action in Model Explorer : it's a copy followed by a delete
 * 
 */
public class CutHandler extends AbstractCommandHandler {

	/**
	 * 
	 * @see org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler#getCommand()
	 * 
	 * @return
	 */
	@Override
	protected Command getCommand() {
		CompoundCommand cutInModelExplorerCommand = new CompoundCommand("Cut in Model Explorer Command"); //$NON-NLS-1$
		DefaultCopyCommand copyCommand = buildCopyCommand();
		cutInModelExplorerCommand.append(copyCommand);
		Command create = buildDeleteCommand();
		cutInModelExplorerCommand.append(create);
		return cutInModelExplorerCommand;
	}


	/**
	 * Construct a copy command with the cut selection
	 * @return the copy command
	 */
	protected DefaultCopyCommand buildCopyCommand() {
		List<EObject> selection = getSelectedElements();
		TransactionalEditingDomain editingDomain = getEditingDomain();
		PapyrusClipboard<Object> papyrusClipboard = PapyrusClipboard.getNewInstance();
		DefaultCopyCommand defaultCopyCommand = new DefaultCopyCommand(editingDomain, papyrusClipboard, selection);
		List<IStrategy> allStrategies = PasteStrategyManager.getInstance().getAllStrategies();
		for(IStrategy iStrategy : allStrategies) {
			IPasteStrategy iPasteStrategy = (IPasteStrategy)iStrategy;
			iPasteStrategy.prepare(papyrusClipboard);
		}
		return defaultCopyCommand;
	}


	/**
	 * Construct a delete command with the cut selection
	 * @return the delete command
	 */
	protected Command buildDeleteCommand() {

		ICommand gmfCommand = null;

		// Parameters store the Request parameters of the previous request
		// if multiple elements are selected for deletion.
		Map parameters = new HashMap();

		for(EObject selectedEObject : getSelectedElements()) {

			if(selectedEObject == null) {
				continue;
			}

			IElementEditService provider = ElementEditServiceUtils.getCommandProvider(selectedEObject);
			if(provider == null) {
				continue;
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

		if(gmfCommand == null) {
			return UnexecutableCommand.INSTANCE;
		}

		Command emfCommand = new org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper(gmfCommand.reduce());
		return emfCommand;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler#computeEnabled()
	 */
	@Override
	protected boolean computeEnabled() { // copy is enable as long as there is an EObject to put in the Clipboard
		return !getSelectedElements().isEmpty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler#setEnabled(java.lang.Object)
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		PapyrusClipboard<Object> instance = PapyrusClipboard.getInstance();
		super.setEnabled(evaluationContext); // setEnabled should'nt clear/modify the clipboard
		PapyrusClipboard.setInstance(instance);
	}

}
