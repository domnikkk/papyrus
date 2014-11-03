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

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.PackageRefactoringContext;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.messages.Messages;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

/**
 * A post-uncontrol updater of the profile applications that are stored in a decorator model.
 */
public class PostUncontrolDecoratorModelUpdater extends AbstractDecoratorModelUpdater {

	// Mapping of profile URI to applied definition EPackage URI
	private final Map<URI, URI> profilesToRemove;
	private Map<URI, URI> profilesRemoved;

	public PostUncontrolDecoratorModelUpdater(IDecoratorModelUpdaterDelegate delegate, PackageRefactoringContext context, URI decoratorModelURI) {
		super(delegate);

		// Compute the profile applications that we no longer need because they are the same definition that is
		// inherited from the parent package
		ImmutableMap.Builder<URI, URI> extraneousProfiles = ImmutableMap.builder();
		Map<URI, URI> inherited = context.getInheritedExternalProfileApplicationsFor(decoratorModelURI);
		for (Map.Entry<URI, URI> all : context.getAllExternalProfileApplicationsFor(decoratorModelURI).entrySet()) {
			if (all.getValue().equals(inherited.get(all.getKey()))) {
				extraneousProfiles.put(all.getKey(), all.getValue());
			}
		}
		this.profilesToRemove = extraneousProfiles.build();
	}

	@Override
	public boolean refactor(Resource resource, IProgressMonitor monitor) throws ExecutionException {
		boolean result = false;

		monitor.beginTask(NLS.bind(Messages.PostUncontrolDecoratorModelUpdater_0, resource.getURI().lastSegment()), IProgressMonitor.UNKNOWN);
		if (!profilesToRemove.isEmpty()) {
			Package evilTwin = getDecoratorPackage(resource);
			if (evilTwin != null) {
				for (Map.Entry<URI, URI> next : profilesToRemove.entrySet()) {
					ProfileApplication application = getProfileApplication(evilTwin, next.getKey());
					EPackage definition = (application == null) ? null : application.getAppliedDefinition();
					if ((definition != null) && next.getValue().equals(EcoreUtil.getURI(definition))) {
						application.destroy();
						result = true;

						if (profilesRemoved == null) {
							profilesRemoved = Maps.newHashMap();
						}
						profilesRemoved.put(next.getKey(), next.getValue());
					}
				}

				if (evilTwin.getProfileApplications().isEmpty()) {
					// Remove it, too
					evilTwin.destroy();
					result = true;
				}
			}
		}

		return result;
	}

	@Override
	public boolean unrefactor(Resource resource, IProgressMonitor monitor) throws ExecutionException {
		boolean result = false;

		monitor.beginTask(NLS.bind(Messages.PostUncontrolDecoratorModelUpdater_1, resource.getURI().lastSegment()), IProgressMonitor.UNKNOWN);
		if (profilesRemoved != null) {
			Package evilTwin = getDecoratorPackage(resource);
			if (evilTwin == null) {
				evilTwin = createDecoratorPackage(resource);
				result = true;
			}

			for (Map.Entry<URI, URI> next : profilesRemoved.entrySet()) {
				if (!hasProfileApplication(evilTwin, next.getKey())) {
					addProfileApplication(evilTwin, next.getKey(), next.getValue());
					result = true;
				}
			}

			profilesRemoved = null;
		}

		return result;
	}

}
