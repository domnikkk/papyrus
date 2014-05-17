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
package org.eclipse.papyrus.uml.modelrepair.internal.stereotypes;

import java.util.Collection;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.uml.modelrepair.internal.participants.StereotypeApplicationRepairParticipant;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;


/**
 * This is the ApplyProfileAction type. Enjoy.
 */
public class ApplyProfileAction extends AbstractRepairAction {

	private final Set<Package> packages;

	private Supplier<Profile> profileSupplier;

	private String label;

	public ApplyProfileAction(Iterable<? extends Package> packages, Profile profile, LabelProviderService labelProviderService) {
		this(packages, Suppliers.ofInstance(profile));

		// Don't have to worry about the profile not having any definition because if it didn't, we couldn't be
		// looking at a previous version that traced to it to let us know that we need to apply this profile
		this.label = NLS.bind("Migrate to {0}", labelProviderService.getLabelProvider().getText(profile.getDefinition()));
	}

	public ApplyProfileAction(Iterable<? extends Package> packages, Supplier<Profile> profileSupplier) {
		super(Kind.APPLY_LATEST_PROFILE_DEFINITION);

		if(Iterables.isEmpty(packages)) {
			throw new IllegalArgumentException("no packages"); //$NON-NLS-1$
		}

		this.packages = Sets.newLinkedHashSet(packages);
		this.profileSupplier = profileSupplier;
	}

	@Override
	public String getLabel() {
		return (label != null) ? label : super.getLabel();
	}

	public void addPackage(Package package_) {
		this.packages.add(package_);
	}

	public boolean repair(Resource resource, EPackage profileDefinition, Collection<? extends EObject> stereotypeApplications, DiagnosticChain diagnostics, IProgressMonitor monitor) {
		// We can be assured that there is at least one stereotype application, otherwise we wouldn't be here
		boolean result = false;

		Profile profile = profileSupplier.get();
		if(profile != null) {
			String taskName = NLS.bind("Migrating stereotypes to current version of profile \"{0}\"...", profile.getName());
			SubMonitor sub = SubMonitor.convert(monitor, taskName, stereotypeApplications.size() * 3 / 2);

			// Apply the profile
			StereotypeApplicationRepairParticipant.createStereotypeApplicationMigrator(profile, diagnostics).migrate(stereotypeApplications, sub.newChild(stereotypeApplications.size()));
			for(Package next : packages) {
				next.applyProfile(profile);
			}

			result = true;

			sub.done();
		}

		return result;
	}
}
