/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.menu.handlers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.papyrus.infra.gmfdiag.menu.utils.DeleteActionUtil;

/**
 * The Class HeterogeneousDeleteCommandHandler.
 *
 * @author gpascual
 */
public class HeterogeneousDeleteCommandHandler extends AbstractGraphicalCommandHandler implements IHandler {

	/** Label of Handler command. */
	private static final String COMMAND_LABEL = "Heterogeneous Delete From Model";

	/**
	 * Constructor.
	 *
	 */
	public HeterogeneousDeleteCommandHandler() {
		super();
	}

	/**
	 * Gets the command.
	 *
	 * @return the command
	 * @see org.eclipse.papyrus.infra.gmfdiag.menu.handlers.AbstractGraphicalCommandHandler#getCommand()
	 */
	@Override
	protected Command getCommand() {


		// Retrieve currently selected IGraphicalEditPart(s)
		List<IGraphicalEditPart> editParts = getSelectedElements();
		if (editParts.isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		}

		TransactionalEditingDomain editingDomain = getEditingDomain();

		CompoundCommand command = new CompoundCommand(COMMAND_LABEL);
		for (Iterator<IGraphicalEditPart> iter = editParts.iterator(); iter.hasNext();) {
			IGraphicalEditPart editPart = iter.next();

			Command deleteCommand = null;

			if (DeleteActionUtil.isSemanticDeletion(editPart)) {

				// Get delete command
				deleteCommand = DeleteActionUtil.getDeleteFromModelCommand(editPart, editingDomain);

			} else {
				if (DeleteActionUtil.isSupportView(editPart) || !(DeleteActionUtil.isCanonicalView(editPart) || DeleteActionUtil.isCanonical(editPart))) {
					deleteCommand = DeleteActionUtil.getDeleteFromDiagramCommand(editPart);
				}
			}

			if (deleteCommand != null) {
				command.add(deleteCommand);
			}

		}
		return command;
	}
}
