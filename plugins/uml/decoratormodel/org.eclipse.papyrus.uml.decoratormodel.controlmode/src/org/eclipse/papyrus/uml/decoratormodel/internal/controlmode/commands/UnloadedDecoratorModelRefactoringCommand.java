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

import java.io.IOException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.PackageRefactoringContext;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelResourceSet;
import org.eclipse.papyrus.uml.decoratormodel.model.DecoratorModel;

/**
 * Implementation of the commands that refactor <em>unloaded</em> dependent decorator models for the changes
 * in the URIs of the base elements of stereotype applications.
 */
class UnloadedDecoratorModelRefactoringCommand extends AbstractDecoratorModelRefactoringCommand {
	protected UnloadedDecoratorModelRefactoringCommand(PackageRefactoringContext context, URI decoratorModelURI) {
		super(context, decoratorModelURI);
	}

	protected UnloadedDecoratorModelRefactoringCommand(PackageRefactoringContext context, URI decoratorModelURI, DirectionConstraint direction) {
		super(context, decoratorModelURI, direction);
	}

	@Override
	protected ResourceSet getResourceSet() {
		return new DecoratorModelResourceSet();
	}

	@Override
	protected Resource getResource(ResourceSet resourceSet, URI decoratorModelURI) {
		// Load the resource in our scratch resource set
		return resourceSet.getResource(decoratorModelURI, true);
	}

	@Override
	protected void disposeResourceSet(ResourceSet resourceSet) {
		EMFHelper.unload(resourceSet);
	}

	@Override
	protected void resourceRefactored(Resource resource, boolean changed) throws ExecutionException {
		if (changed) {
			try {
				resource.save(new DecoratorModel().getSaveOptions());
			} catch (IOException e) {
				throw new ExecutionException(Messages.UnloadedDecoratorModelRefactoringCommand_0, e);
			}
		}
	}

}
