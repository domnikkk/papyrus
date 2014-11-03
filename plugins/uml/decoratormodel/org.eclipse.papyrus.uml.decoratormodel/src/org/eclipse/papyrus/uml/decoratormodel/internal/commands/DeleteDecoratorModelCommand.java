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

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.AbstractCommand.NonDirtying;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.uml.decoratormodel.internal.messages.Messages;

import com.google.common.collect.Lists;

/**
 * A command that ensures the next save of the {@link ModelSet} will delete the decorator model
 * emptied out by some previous {@link ReclaimProfileApplicationsCommand}.
 */
public class DeleteDecoratorModelCommand extends AbstractCommand implements NonDirtying {
	private final ModelSet modelSet;
	private final Resource resource;
	private Collection<Resource> deleted;

	public DeleteDecoratorModelCommand(ModelSet modelSet, Resource resource) {
		super(Messages.DeleteDecoratorModelCommand_0);

		this.modelSet = modelSet;
		this.resource = resource;
	}

	@Override
	protected boolean prepare() {
		return (resource != null) && resource.isLoaded();
	}

	@Override
	public void execute() {
		if (resource.getContents().isEmpty()) {
			// there are usually three resources to delete in any Papyrus model
			deleted = Lists.newArrayListWithExpectedSize(3);

			modelSet.getResourcesToDeleteOnSave().add(resource.getURI());
			resource.unload();
			modelSet.getResources().remove(resource);
			resource.eAdapters().clear();
			deleted.add(resource);

			// find its siblings
			URI withoutExtension = resource.getURI().trimFileExtension();
			for (Iterator<Resource> iter = modelSet.getResources().iterator(); iter.hasNext();) {
				Resource next = iter.next();
				if (next.getURI().trimFileExtension().equals(withoutExtension)) {
					modelSet.getResourcesToDeleteOnSave().add(next.getURI());
					next.unload();
					iter.remove();
					next.eAdapters().clear();
					deleted.add(next);
				}
			}
		}
	}

	/**
	 * Because this command only unloads the resource if it's empty, this is undoable simply by re-adding the resource to the resource set.
	 *
	 * @return {@code true}, always
	 */
	@Override
	public boolean canUndo() {
		return true;
	}

	@Override
	public void undo() {
		if (deleted != null) {
			for (Resource next : deleted) {
				modelSet.getResourcesToDeleteOnSave().remove(next.getURI());
				if (modelSet.getResource(next.getURI(), false) == null) {
					modelSet.getResources().add(next);

					// Don't attempt to load the resource because we'll be putting its contents back as part of the undo!
				}
			}
		}
	}

	@Override
	public void redo() {
		execute();
	}

}
