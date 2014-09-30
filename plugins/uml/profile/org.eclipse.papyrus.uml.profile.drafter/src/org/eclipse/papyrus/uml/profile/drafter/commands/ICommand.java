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


/**
 * Commmand interface to implement the Command pattern.
 * 
 * @author cedric dumoulin
 *
 */
public interface ICommand {

	/***
	 * Execute the coommand.
	 */
	public void execute() throws CommandExecutionException;
}
