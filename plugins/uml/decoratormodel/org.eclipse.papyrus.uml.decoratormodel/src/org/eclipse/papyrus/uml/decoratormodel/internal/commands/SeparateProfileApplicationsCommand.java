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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.messages.Messages;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * A command that factors out one or more profile applications into a separate resource.
 * This command has a pre-requisite that the decorator model resource must already exist when it executes. This may be
 * satisfied either by the resource already existing in storage or being created by a previous command in a compound.
 */
public class SeparateProfileApplicationsCommand extends RecordingCommand {

	private final ResourceSet resourceSet;
	private final Iterable<? extends ProfileApplication> profileApplications;
	private final URI resourceURI;

	public SeparateProfileApplicationsCommand(TransactionalEditingDomain domain, Iterable<? extends ProfileApplication> profileApplications, URI resourceURI) {
		super(domain, Messages.SeparateProfileApplicationsCommand_0);

		this.resourceSet = domain.getResourceSet();
		this.profileApplications = profileApplications;
		this.resourceURI = resourceURI;
	}

	@Override
	protected void doExecute() {
		Resource decoratorModel = resourceSet.getResource(resourceURI, true);

		for (ProfileApplication profileApplication : profileApplications) {
			DecoratorModelUtils.externalizeProfileApplication(profileApplication, decoratorModel);
		}
	}

}
