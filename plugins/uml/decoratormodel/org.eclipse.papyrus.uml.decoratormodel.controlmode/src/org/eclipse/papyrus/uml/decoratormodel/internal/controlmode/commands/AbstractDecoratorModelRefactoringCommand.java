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

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.PackageRefactoringContext;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.updaters.IRefactoringStep;

import com.google.common.collect.Lists;

/**
 * Common implementation of the commands that refactor loaded and unloaded dependent decorator models for the changes
 * in the URIs of the base elements of stereotype applications and adding/removing profile applications for
 * stand-along usage of the user-model controlled units.
 */
abstract class AbstractDecoratorModelRefactoringCommand extends AbstractCommand {

	private final List<IRefactoringStep> steps = Lists.newArrayListWithExpectedSize(2);

	private final DirectionConstraint direction;

	private final URI decoratorModelURI;

	protected AbstractDecoratorModelRefactoringCommand(PackageRefactoringContext context, URI decoratorModelURI) {
		this(context, decoratorModelURI, DirectionConstraint.ALL);
	}

	protected AbstractDecoratorModelRefactoringCommand(PackageRefactoringContext context, URI decoratorModelURI, DirectionConstraint direction) {
		super(NLS.bind(Messages.AbstractDecoratorModelRefactoringCommand_0, decoratorModelURI), getIFiles(decoratorModelURI));

		this.direction = direction;
		this.decoratorModelURI = decoratorModelURI;
	}

	public AbstractDecoratorModelRefactoringCommand addStep(IRefactoringStep step) {
		steps.add(step);
		return this;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		SubMonitor sub = SubMonitor.convert(monitor, steps.size());

		if (!direction.canRefactor()) {
			sub.done();
		} else {
			ResourceSet rset = getResourceSet();
			try {
				Resource resource = getResource(rset, decoratorModelURI);
				if ((resource != null) && resource.isLoaded()) {
					boolean changed = false;

					// If the resource is not loaded, something didn't go right in the basic control step
					for (ListIterator<IRefactoringStep> iter = steps.listIterator(); iter.hasNext();) {
						changed = iter.next().refactor(resource, sub.newChild(1)) || changed;
					}

					resourceRefactored(resource, changed);
				}
			} finally {
				disposeResourceSet(rset);
				sub.done();
			}
		}

		return CommandResult.newOKCommandResult();
	}

	protected abstract ResourceSet getResourceSet();

	protected abstract Resource getResource(ResourceSet resourceSet, URI decoratorModelURI);

	protected abstract void resourceRefactored(Resource resource, boolean changed) throws ExecutionException;

	protected abstract void disposeResourceSet(ResourceSet resourceSet);

	@Override
	protected CommandResult doUndoWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		SubMonitor sub = SubMonitor.convert(monitor, steps.size());

		if (!direction.canUnrefactor()) {
			sub.done();
		} else {
			ResourceSet rset = getResourceSet();
			try {
				Resource resource = getResource(rset, decoratorModelURI);
				if ((resource != null) && resource.isLoaded()) {
					boolean changed = false;

					// If the resource is not loaded, something didn't go right in the basic control step
					for (ListIterator<IRefactoringStep> iter = steps.listIterator(steps.size()); iter.hasPrevious();) {
						changed = iter.previous().unrefactor(resource, sub.newChild(1)) || changed;
					}

					resourceRefactored(resource, changed);
				}
			} finally {
				disposeResourceSet(rset);
				sub.done();
			}
		}

		return CommandResult.newOKCommandResult();
	}

	@Override
	protected CommandResult doRedoWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		return doExecuteWithResult(monitor, info);
	}

	private static List<IFile> getIFiles(URI decoratorModel) {
		return Collections.singletonList(ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(decoratorModel.toPlatformString(true))));
	}

}
