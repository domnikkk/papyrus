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

package org.eclipse.papyrus.uml.decoratormodel.internal.commands;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.helper.IDeleteEmptyDecoratorModelsPolicy;
import org.eclipse.papyrus.uml.decoratormodel.internal.messages.Messages;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * A command that brings one or more profile applications back from a separate resource into the UML model.
 */
public class ReclaimProfileApplicationsCommand extends RecordingCommand {

	private final IDeleteEmptyDecoratorModelsPolicy deletePolicy;

	private final Iterable<? extends ProfileApplication> profileApplications;

	public ReclaimProfileApplicationsCommand(TransactionalEditingDomain domain, Iterable<? extends ProfileApplication> profileApplications, IDeleteEmptyDecoratorModelsPolicy deletePolicy) {
		super(domain, Messages.ReclaimProfileApplicationsCommand_0);

		this.profileApplications = profileApplications;
		this.deletePolicy = deletePolicy;
	}

	@Override
	protected void doExecute() {
		DecoratorModelUtils.internalizeProfileApplications(profileApplications, deletePolicy);
	}

}
