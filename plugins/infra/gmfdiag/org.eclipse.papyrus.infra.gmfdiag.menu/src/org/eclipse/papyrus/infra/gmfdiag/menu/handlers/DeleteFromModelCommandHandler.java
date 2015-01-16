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
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 429826
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 436952
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 411570
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 454891
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.menu.handlers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.papyrus.infra.gmfdiag.menu.utils.DeleteActionUtil;

/**
 * Command handler for delete from diagram.
 */
public class DeleteFromModelCommandHandler extends AbstractGraphicalCommandHandler implements IHandler {

	/** Command label. */
	private static final String COMMAND_LABEL = "Delete From Model";

	@Override
	protected Command getCommand() {

		TransactionalEditingDomain editingDomain = getEditingDomain();

		if (editingDomain == null) {
			return UnexecutableCommand.INSTANCE;
		}

		// Retrieve currently selected IGraphicalEditPart(s)
		List<IGraphicalEditPart> editParts = getSelectedElements();
		if (editParts.isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		}

		// Iterate over selection and retrieve the deletion command from each
		// edit part
		// Add each returned command to the composite command
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(editingDomain, COMMAND_LABEL);

		Iterator<IGraphicalEditPart> it = editParts.iterator();
		while (it.hasNext()) {
			IGraphicalEditPart editPart = it.next();

			Command curCommand = DeleteActionUtil.getDeleteFromModelCommand(editPart, editingDomain);
			if (curCommand != null && curCommand.canExecute()) {
				command.compose(new CommandProxy(curCommand));
			}
		}

		if (command.isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		}



		return new ICommandProxy(command);
	}


	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.menu.handlers.AbstractGraphicalCommandHandler#computeEnabled()
	 *
	 * @return
	 */
	@Override
	protected boolean computeEnabled() {
		boolean enable = true;
		List<IGraphicalEditPart> selectedElement = getSelectedElements();

		Iterator<IGraphicalEditPart> iteratorSelection = selectedElement.iterator();
		while (iteratorSelection.hasNext() && enable) {
			IGraphicalEditPart editPart = iteratorSelection.next();

			// Check if the selected edit part is not a Diagram and it is not Root Element
			enable = enable && !(editPart instanceof DiagramEditPart) && DeleteActionUtil.isSemanticDeletion(editPart);

		}
		return enable;
	}
}
