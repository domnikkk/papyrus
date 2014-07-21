/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.junit.utils.resources;

import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.junit.utils.rules.AbstractHouseKeeperRule;
import org.hamcrest.CoreMatchers;

import com.google.common.collect.Sets;

/**
 * A simple fixture for making assertions on the workspace resource changes made (or not) by {@link ModelSet}s upon saving.
 */
public class WorkspaceModificationAssertion implements IResourceChangeListener {

	private final IWorkspace ws = ResourcesPlugin.getWorkspace();

	private final Set<URI> requireChange = Sets.newHashSet();

	private final Set<URI> requireNoChange = Sets.newHashSet();

	private final Set<URI> changed = Sets.newHashSet();

	private CoreException exception;

	public WorkspaceModificationAssertion(AbstractHouseKeeperRule houseKeeper) {
		ws.addResourceChangeListener(this);
		houseKeeper.cleanUpLater(this);
	}

	public void dispose() {
		ws.removeResourceChangeListener(this);
		reset();
	}

	public void requireChange(URI uri) {
		assertThat("conflicting change requirement for " + uri, requireNoChange, not(hasItem(uri)));
		requireChange.add(uri);
	}

	public void requireNoChange(URI uri) {
		assertThat("conflicting change requirement for " + uri, requireChange, not(hasItem(uri)));
		requireNoChange.add(uri);
	}

	public void resourceChanged(IResourceChangeEvent event) {
		try {
			event.getDelta().accept(new IResourceDeltaVisitor() {

				public boolean visit(IResourceDelta delta) throws CoreException {
					if(delta.getResource().getType() == IResource.FILE) {
						changed.add(URI.createPlatformResourceURI(delta.getFullPath().toString(), true));
					}
					return true;
				}
			});
		} catch (CoreException e) {
			e.printStackTrace();
			exception = e;
		}
	}

	public void reset() {
		requireChange.clear();
		requireNoChange.clear();
		changed.clear();
		exception = null;
	}

	public void save(final ModelSet modelSet) {
		try {
			try {
				ws.run(new IWorkspaceRunnable() {

					public void run(IProgressMonitor monitor) throws CoreException {
						try {
							modelSet.save(monitor);
						} catch (IOException e) {
							throw new CoreException(new Status(IStatus.ERROR, "org.eclipse.papyrus.junit.utils", "Save failed.", e));
						}
					}
				}, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
				exception = e;
			}

			assertThat("Resource(s) saved that should not have been", Sets.intersection(requireNoChange, changed), not(CoreMatchers.<URI> hasItem(anything())));
			assertThat("Resource(s) not saved that should have been", Sets.difference(requireChange, changed), not(CoreMatchers.<URI> hasItem(anything())));
			assertThat("Save assertion failed with an exception", exception, nullValue());
		} finally {
			reset();
		}
	}
}
