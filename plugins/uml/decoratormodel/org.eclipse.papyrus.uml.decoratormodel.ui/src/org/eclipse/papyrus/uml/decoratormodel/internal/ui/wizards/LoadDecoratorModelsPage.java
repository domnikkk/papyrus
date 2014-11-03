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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards;

import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.uml2.uml.Package;

import com.google.common.collect.Maps;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import com.google.common.eventbus.EventBus;

/**
 * @author damus
 *
 */
public class LoadDecoratorModelsPage extends DecoratorModelSelectionPage {

	/*
	 * Map of (decorator model -> package -> profiles).
	 */
	private Map<IFile, SetMultimap<URI, URI>> externalApplications;

	public LoadDecoratorModelsPage(EventBus bus) {
		super(bus);
	}

	@Override
	public void setInput(Package package_, Set<URI> input) {
		super.setInput(package_, input);

		// Compute the external profile applications available
		externalApplications = Maps.newHashMap();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (URI profileApplicationResource : input) {
			IFile file = root.getFile(new Path(profileApplicationResource.toPlatformString(true)));

			try {
				SetMultimap<URI, URI> profileApplications = DecoratorModelIndex.getInstance().getAppliedProfilesByPackage(profileApplicationResource);
				externalApplications.put(file, profileApplications);
			} catch (CoreException e) {
				Activator.getDefault().getLog().log(e.getStatus());
				StatusManager.getManager().handle(e.getStatus(), StatusManager.SHOW);
			}
		}
	}

	protected String computeConflict() {
		String result = null;

		IFile[] selected = getCheckedFiles();
		if (selected.length > 1) {
			out: for (int i = 0; i < selected.length; i++) {
				IFile a = selected[i];
				SetMultimap<URI, URI> applicationsFromA = externalApplications.get(a);
				for (int j = i + 1; j < selected.length; j++) {
					IFile b = selected[j];
					SetMultimap<URI, URI> applicationsFromB = externalApplications.get(b);
					if (intersect(applicationsFromA, applicationsFromB)) {
						result = NLS.bind(Messages.LoadDecoratorModelsPage_0, a.getName(), b.getName());
						break out;
					}
				}
			}
		}

		return result;
	}

	static <K, V> boolean intersect(SetMultimap<K, V> a, SetMultimap<K, V> b) {
		boolean result = false;

		for (K next : a.keySet()) {
			if (!Sets.intersection(a.get(next), b.get(next)).isEmpty()) {
				result = true;
				break;
			}
		}

		return result;
	}

	@Override
	void validatePage() {
		setErrorMessage(null);

		String conflict = computeConflict();
		if (conflict != null) {
			setErrorMessage(conflict);
			setPageComplete(false);
		} else {
			super.validatePage();
		}
	}

}
