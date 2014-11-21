/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.revision.tool.command;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.uml2.uml.Element;

/**
 * 
 * this command is used to attach a diff Element into the EMF compare model
 *
 */
public class CreateDifferenceCommand extends RecordingCommand {

	protected Match compareModel=null;
	protected Element container=null;
	protected String subject; 
	protected Diff difference=null;
	
	/**
	 * create a command to attach a diff to a compare model
	 * @param domain the transactional editing domain in order to lanch the command
	 * @param compareModel the given EMF compare model
	 * @param difference a diff to add
	 */
	public CreateDifferenceCommand(TransactionalEditingDomain domain, Match compareModel, Diff difference) {
		super(domain, "create diff");
		this.compareModel= compareModel;
		this.difference=difference;
	}

	@Override
	protected void doExecute() {
		compareModel.getDifferences().add(difference);
		

	}


}
