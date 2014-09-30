/*****************************************************************************
 * Copyright (c) 2014 Cedric Dumoulin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.profile.drafter.commands;

import java.util.ArrayList;
import java.util.List;


/**
 * A Command composed of sub-command.
 * 
 * @author cedric dumoulin
 *
 */
public class CompoundCommand implements ICommand {

	protected List<ICommand> subcommands = new ArrayList<ICommand>();
	
	/**
	 * Execute all sub-commands in order.
	 * 
	 * @see org.eclipse.papyrus.uml.profile.drafter.commands.ICommand#execute()
	 *
	 */
	public void execute() throws CommandExecutionException {
		
		for( ICommand cmd : subcommands) {
			cmd.execute();
		}

	}
	
	/**
	 * Add the specified {@link ICommand} as a sub-command.
	 * 
	 * @param command {@link ICommand} to add as sub-command.
	 */
	public void addCommand(ICommand command) {
		subcommands.add(command);
	}

}
