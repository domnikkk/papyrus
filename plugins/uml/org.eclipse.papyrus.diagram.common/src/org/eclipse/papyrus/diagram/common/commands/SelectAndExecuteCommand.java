/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *		CEA LIST - Initial API and implementation
 *		Mathieu Velten (Atos) mathieu.velten@atos.net - approve the command using the CheckedOperationHistory before executing/undoing/redoing it
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.commands;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.dialogs.PopupDialog;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandUtilities;
import org.eclipse.gmf.runtime.diagram.ui.commands.PopupMenuCommand;
import org.eclipse.gmf.runtime.diagram.ui.menus.PopupMenu;
import org.eclipse.papyrus.commands.CheckedOperationHistory;
import org.eclipse.swt.widgets.Shell;

/**
 * This class opens a dialog to select and execute a command in a given list.
 */
public class SelectAndExecuteCommand extends PopupMenuCommand {

	/** Selected command kept here for undo / re-do purpose */
	private Command _selectedCmd;

	/**
	 * The default label provider for the the menu items (Commands) used in this command.
	 */
	static public class CommandLabelProvider extends org.eclipse.jface.viewers.LabelProvider {

		/**
		 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
		 */
		public String getText(Object object) {
			String text = super.getText(object);
			if(object instanceof Command) {
				text = ((Command)object).getLabel();
			}
			return text;
		}
	}

	/**
	 * 
	 * Constructor.
	 * 
	 * @param label
	 *        the command label
	 * @param parentShell
	 *        the parent shell
	 * @param content
	 *        the list of available commands proposed for user selection
	 *        (List<org.eclipse.gef.commands.Command> expected here)
	 */
	public SelectAndExecuteCommand(String label, Shell parentShell, List<Command> content, boolean useDialog) {
		super(label, parentShell);

		if (useDialog) {
			PopupDialog popupDialog = new PopupDialog(parentShell, content, new CommandLabelProvider());
			setPopupDialog(popupDialog);
		} else {
			PopupMenu popupMenu = new PopupMenu(content, new CommandLabelProvider());
			setPopupMenu(popupMenu);
		}
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, org.eclipse.core.runtime.IAdaptable info) throws ExecutionException {

		CommandResult cmdResult = super.doExecuteWithResult(progressMonitor, info);
		if(!cmdResult.getStatus().isOK()) {
			return cmdResult;
		}

		_selectedCmd = (Command)cmdResult.getReturnValue();
		if (_selectedCmd != null && _selectedCmd.canExecute() && CheckedOperationHistory.getInstance().getExecuteApproval(new CommandProxy(_selectedCmd), null).isOK()) {
			_selectedCmd.execute();
			return CommandResult.newOKCommandResult();
		}
		return CommandResult.newErrorCommandResult("The selected command is not executable or modify a read-only object");
	}

	@Override
	protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {

		if(_selectedCmd != null && _selectedCmd.canUndo() && CheckedOperationHistory.getInstance().getUndoApproval(new CommandProxy(_selectedCmd), null).isOK()) {
			_selectedCmd.undo();
		}
		return super.doUndoWithResult(progressMonitor, info);
	}

	@Override
	protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {

		if(_selectedCmd != null && CommandUtilities.canRedo(_selectedCmd) && CheckedOperationHistory.getInstance().getRedoApproval(new CommandProxy(_selectedCmd), null).isOK()) {
			_selectedCmd.redo();
		}
		return super.doRedoWithResult(progressMonitor, info);
	}

}

