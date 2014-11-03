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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.PackageRefactoringContext;

/**
 * Implementation of the commands that refactor <em>unloaded</em> dependent decorator models for the changes
 * in the URIs of the base elements of stereotype applications.
 */
class LoadedDecoratorModelRefactoringCommand extends AbstractDecoratorModelRefactoringCommand {

	private final TransactionalEditingDomain domain;

	protected LoadedDecoratorModelRefactoringCommand(PackageRefactoringContext context, URI decoratorModelURI) {
		super(context, decoratorModelURI);

		this.domain = context.getEditingDomain();
	}

	@Override
	protected ResourceSet getResourceSet() {
		return domain.getResourceSet();
	}

	@Override
	protected Resource getResource(ResourceSet resourceSet, URI decoratorModelURI) {
		// The resource is expected to be loaded
		return resourceSet.getResource(decoratorModelURI, false);
	}

	@Override
	protected void disposeResourceSet(ResourceSet resourceSet) {
		// The resource set is shared with the editor, so leave it alone
	}

	@Override
	protected void resourceRefactored(Resource resource, boolean changed) {
		// Don't save a loaded resource; the editor will do that if necessary
	}
}
