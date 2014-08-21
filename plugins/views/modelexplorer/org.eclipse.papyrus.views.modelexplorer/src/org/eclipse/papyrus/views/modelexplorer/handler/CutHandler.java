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

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard;

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
		Command copyCommand = CopyHandler.buildCopyCommand(getEditingDomain(), getSelectedElements());
		cutInModelExplorerCommand.append(copyCommand);
		Command deleteCommand = DeleteCommandHandler.buildDeleteCommand(getSelectedElements());
		cutInModelExplorerCommand.append(deleteCommand);
		return cutInModelExplorerCommand;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected boolean computeEnabled() {
		List<EObject> selectedElements = getSelectedElements();
		return CopyHandler.isCopyEnabled(selectedElements) && DeleteCommandHandler.isDeleteEnabled(selectedElements);
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
