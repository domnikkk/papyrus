/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 411570
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 454891
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.menu.handlers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.papyrus.infra.gmfdiag.menu.utils.DeleteActionUtil;

/**
 * Command handler for delete from diagram.
 */
public class DeleteFromDiagramCommandHandler extends AbstractGraphicalCommandHandler implements IHandler {

	/** Label for command handler. */
	private static final String COMMAND_LABEL = "Delete From Diagram";

	/**
	 *
	 * @see org.eclipse.papyrus.uml.diagram.common.handlers.GraphicalCommandHandler#getCommand()
	 *
	 * @return the deletion command
	 * @throws ExecutionException
	 */
	@Override
	protected Command getCommand() {

		// Retrieve currently selected IGraphicalEditPart(s)
		List<IGraphicalEditPart> editParts = getSelectedElements();
		if (editParts.isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		}

		if (!DeleteActionUtil.isSupportView(editParts) || DeleteActionUtil.isCanonical(editParts)) {
			return UnexecutableCommand.INSTANCE;
		}

		CompoundCommand command = new CompoundCommand(COMMAND_LABEL);
		for (Iterator<IGraphicalEditPart> iter = editParts.iterator(); iter.hasNext();) {
			IGraphicalEditPart editPart = iter.next();
			/* Send the request to the edit part */
			command.add(DeleteActionUtil.getDeleteFromDiagramCommand(editPart));
		}
		return command;
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

			// Check if the selected edit part is not a Diagram and it is not a canonical edit Part
			enable = enable && !(editPart instanceof DiagramEditPart) && DeleteActionUtil.isSupportView(editPart) && !(DeleteActionUtil.isCanonicalView(editPart) && DeleteActionUtil.isCanonicalEditPart(editPart));

		}
		return enable;
	}

}
