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

package org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.updaters;

import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.PackageRefactoringContext;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.messages.Messages;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;

import com.google.common.collect.Sets;

/**
 * A post-control updater of the profile applications that are stored in a decorator model.
 *
 */
public class PostControlDecoratorModelUpdater extends AbstractDecoratorModelUpdater {

	// Mapping of profile URI to applied definition EPackage URI
	private final Map<URI, URI> profilesToAdd;
	private Set<URI> profilesAdded;

	public PostControlDecoratorModelUpdater(IDecoratorModelUpdaterDelegate delegate, PackageRefactoringContext context, URI decoratorModelURI) {
		super(delegate);

		this.profilesToAdd = context.getAllExternalProfileApplicationsFor(decoratorModelURI);
	}

	@Override
	public boolean refactor(Resource resource, IProgressMonitor monitor) throws ExecutionException {
		boolean result = false;

		monitor.beginTask(NLS.bind(Messages.PostControlDecoratorModelUpdater_0, resource.getURI().lastSegment()), IProgressMonitor.UNKNOWN);
		if (!profilesToAdd.isEmpty()) {
			Package evilTwin = getDecoratorPackage(resource);
			if (evilTwin == null) {
				evilTwin = createDecoratorPackage(resource);
				result = true;
			}

			for (Map.Entry<URI, URI> next : profilesToAdd.entrySet()) {
				URI profileURI = next.getKey();
				if (!hasProfileApplication(evilTwin, profileURI)) {
					addProfileApplication(evilTwin, profileURI, next.getValue());
					result = true;

					if (profilesAdded == null) {
						profilesAdded = Sets.newHashSet();
					}
					profilesAdded.add(profileURI);
				}
			}
		}

		return result;
	}

	@Override
	public boolean unrefactor(Resource resource, IProgressMonitor monitor) throws ExecutionException {
		boolean result = false;

		monitor.beginTask(NLS.bind(Messages.PostControlDecoratorModelUpdater_1, resource.getURI().lastSegment()), IProgressMonitor.UNKNOWN);
		if (profilesAdded != null) {
			Package evilTwin = getDecoratorPackage(resource);
			if (evilTwin != null) {
				for (URI next : profilesAdded) {
					ProfileApplication application = getProfileApplication(evilTwin, next);
					if (application != null) {
						application.destroy();
						result = true;
					}
				}

				if (evilTwin.getProfileApplications().isEmpty()) {
					evilTwin.destroy();
					result = true;
				}
			}

			profilesAdded = null;
		}

		return result;
	}

}
