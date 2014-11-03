/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.messages.Messages;
import org.eclipse.swt.widgets.Shell;

/**
 * A command that prompts the user to confirm the need to save and fails with cancel status if the user elects not to proceed.
 */
public class ConfirmSaveCommand extends AbstractCommand {
	private Shell parentShell;

	public ConfirmSaveCommand(Shell parentShell) {
		super(Messages.ConfirmSaveCommand_0);

		this.parentShell = parentShell;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		if (MessageDialog.openQuestion(parentShell, Messages.ConfirmSaveCommand_1, Messages.ConfirmSaveCommand_2)) {
			return CommandResult.newOKCommandResult();
		} else {
			return CommandResult.newCancelledCommandResult();
		}
	}

	@Override
	protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		// User already confirmed execution; that is sufficient
		return CommandResult.newOKCommandResult();
	}

	@Override
	protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		// User already confirmed execution; that is sufficient
		return CommandResult.newOKCommandResult();
	}

}
