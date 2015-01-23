/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - bug 455305
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.menu.handlers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISources;

/**
 * Handler for the Cut Action in Diagram : it's a copy followed by a delete
 */
public class CutInDiagramHandler extends AbstractGraphicalCommandHandler {

	/** The Constant DELETE_COMMAND_LABEL. */
	private static final String DELETE_COMMAND_LABEL = "Delete From Model";

	/** The Constant CUT_COMMAND_LABEL. */
	private static final String CUT_COMMAND_LABEL = "Cut In Diagram Command";

	/** The active focus control. */
	private Object activeFocusControl;

	/** The active shell. */
	private Object activeShell;

	@Override
	protected Command getCommand() {
		CompoundCommand cutInDiagramCommand = new CompoundCommand(CUT_COMMAND_LABEL);
		Command buildCopy = CopyInDiagramHandler.buildCopyCommand(getEditingDomain(), getSelectedElements());
		cutInDiagramCommand.add(buildCopy);
		Command buildDelete = buildDeleteCommand();
		cutInDiagramCommand.add(buildDelete);
		return cutInDiagramCommand;
	}

	/**
	 * Construct a delete command with the cut selection
	 *
	 * @return the delete command
	 */
	protected Command buildDeleteCommand() {

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
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(editingDomain, DELETE_COMMAND_LABEL);

		Iterator<IGraphicalEditPart> it = editParts.iterator();
		while (it.hasNext()) {
			IGraphicalEditPart editPart = it.next();

			if (!(editPart instanceof DiagramEditPart)) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.menu.handlers.
	 * AbstractGraphicalCommandHandler#setEnabled(java.lang.Object)
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		if (evaluationContext instanceof IEvaluationContext) {
			IEvaluationContext iEvaluationContext = (IEvaluationContext) evaluationContext;
			activeFocusControl = iEvaluationContext.getVariable(ISources.ACTIVE_FOCUS_CONTROL_NAME);
			activeShell = iEvaluationContext.getVariable(ISources.ACTIVE_SHELL_NAME);

		}

		super.setEnabled(evaluationContext);
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.menu.handlers.AbstractGraphicalCommandHandler#computeEnabled()
	 *
	 * @return
	 */
	@Override
	protected boolean computeEnabled() {
		boolean isEnabled = false;
		Control focusControl = null;
		if (activeShell instanceof Shell) {
			Shell shell = (Shell) activeShell;
			Display display = shell.getDisplay();
			if (display != null) {
				focusControl = display.getFocusControl();
			}
		}
		if (!(activeFocusControl instanceof StyledText) && !(focusControl instanceof Text)) { // false if the focus is on an internal xtext editor or a text edit
			PapyrusClipboard<Object> instance = PapyrusClipboard.getInstance();
			PapyrusClipboard.setInstance(instance);
			isEnabled = true;
		}

		return isEnabled;
	}

}
