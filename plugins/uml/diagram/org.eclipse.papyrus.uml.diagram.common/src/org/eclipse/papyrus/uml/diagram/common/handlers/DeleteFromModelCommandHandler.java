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
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.handlers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.menu.handlers.AbstractGraphicalCommandHandler;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeManager;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeRequest;
import org.eclipse.papyrus.infra.services.controlmode.IControlModeManager;
import org.eclipse.papyrus.infra.services.controlmode.util.ControlHelper;

/**
 * Command handler for delete from diagram
 */
public class DeleteFromModelCommandHandler extends AbstractGraphicalCommandHandler implements IHandler {

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
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(editingDomain, "Delete From Model");

		Iterator<IGraphicalEditPart> it = editParts.iterator();
		while (it.hasNext()) {
			IGraphicalEditPart editPart = it.next();

			if (!(editPart instanceof DiagramEditPart)) {

				// Look for uncontrol mode command
				EObject eObjectToControl = EMFHelper.getEObject(editPart);
				if (eObjectToControl != null && ControlHelper.isRootControlledObject(eObjectToControl)) {
					ControlModeRequest controlRequest = ControlModeRequest.createUIUncontrolModelRequest(getEditingDomain(), eObjectToControl);
					IControlModeManager controlMng = ControlModeManager.getInstance();
					ICommand controlCommand = controlMng.getUncontrolCommand(controlRequest);
					command.compose(controlCommand);
				}

				// Look for the GMF deletion command
				Command curCommand = editPart.getCommand(new EditCommandRequestWrapper(new DestroyElementRequest(false)));


				if (curCommand != null) {
					command.compose(new CommandProxy(curCommand));
				}




			}
		}

		if (command.isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		}



		return new ICommandProxy(command);
	}


}
