/*
 * Copyright (c) 2014 CEA, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *   Christian W. Damus - bug 399859
 *   Christian W. Damus - bug 451557
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - bug 454997
 *
 */
package org.eclipse.papyrus.uml.modelrepair.internal.stereotypes;

import java.util.Collection;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.uml.modelrepair.internal.participants.StereotypeApplicationRepairParticipant;
import org.eclipse.papyrus.uml.modelrepair.internal.stereotypes.IRepairAction.IApplyProfileAction;
import org.eclipse.papyrus.uml.tools.helper.IProfileApplicationDelegate;
import org.eclipse.papyrus.uml.tools.helper.ProfileApplicationDelegateRegistry;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;


/**
 * This is the ApplyProfileAction type. Enjoy.
 */
public class ApplyProfileAction extends AbstractRepairAction implements IApplyProfileAction {

	private final Resource resourceUnderRepair;
	private final Set<Package> packages;

	private Supplier<Profile> profileSupplier;

	private String label;

	private Profile appliedProfile;

	private Profile previousProfile;

	public ApplyProfileAction(Resource resourceUnderRepair, Iterable<? extends Package> packages, Profile profile, LabelProviderService labelProviderService) {
		this(resourceUnderRepair, packages, Suppliers.ofInstance(profile));

		// Don't have to worry about the profile not having any definition because if it didn't, we couldn't be
		// looking at a previous version that traced to it to let us know that we need to apply this profile
		this.label = NLS.bind("Migrate to {0}", labelProviderService.getLabelProvider().getText(profile.getDefinition()));
	}

	public ApplyProfileAction(Resource resourceUnderRepair, Iterable<? extends Package> packages, Supplier<Profile> profileSupplier) {
		super(Kind.APPLY_LATEST_PROFILE_DEFINITION);

		if (Iterables.isEmpty(packages)) {
			throw new IllegalArgumentException("no packages"); //$NON-NLS-1$
		}

		this.resourceUnderRepair = resourceUnderRepair;
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
		SubMonitor repairMonitor = SubMonitor.convert(monitor, 2);

		// First, try to apply previous profile
		if (previousProfile != null) {
			result = applySelectedProfile(resource, stereotypeApplications, diagnostics, repairMonitor.newChild(1, SubMonitor.SUPPRESS_NONE), previousProfile);
		}

		// Then, if no Profile could be already applied, ask to user where find the Profile
		if (!result) {
			appliedProfile = profileSupplier.get();
			if (appliedProfile != null) {
				result = applySelectedProfile(resource, stereotypeApplications, diagnostics, repairMonitor.newChild(1, SubMonitor.SUPPRESS_NONE), appliedProfile);

			}
		}
		repairMonitor.done();

		return result;
	}


	private boolean applySelectedProfile(Resource resource, Collection<? extends EObject> stereotypeApplications, DiagnosticChain diagnostics, IProgressMonitor monitor, Profile profile) {
		String taskName = NLS.bind("Migrating stereotypes to current version of profile \"{0}\"...", profile.getName());
		SubMonitor sub = SubMonitor.convert(monitor, taskName, stereotypeApplications.size() * 3 / 2);
		boolean result = false;

		// Apply the profile
		StereotypeApplicationRepairParticipant.createStereotypeApplicationMigrator(resource, profile, diagnostics).migrate(stereotypeApplications, sub.newChild(stereotypeApplications.size()));
		for (Package next : packages) {
			if (sub.isCanceled()) {
				throw new OperationCanceledException();
			}

			ProfileApplication profileApplication = applyProfile(next, profile, sub.newChild(stereotypeApplications.size() / 2));
			result = profileApplication != null;

			sub.done();
		}
		return result;
	}

	protected ProfileApplication applyProfile(Package package_, Profile profile, IProgressMonitor monitor) {
		monitor = SubMonitor.convert(monitor);

		ProfileApplication result;

		IProfileApplicationDelegate delegate = ProfileApplicationDelegateRegistry.INSTANCE.getDelegate(package_);

		// Is this a re-application?
		ProfileApplication existing = delegate.getProfileApplication(package_, profile);
		if (existing != null) {
			delegate = ProfileApplicationDelegateRegistry.INSTANCE.getDelegate(existing);
			delegate.reapplyProfile(package_, profile, monitor);
			result = existing;
		} else {
			// Try to get a delegate appropriate to the resource we're repairing (it could be a profile-application model)
			Package root = Iterables.getFirst(Iterables.filter(resourceUnderRepair.getContents(), Package.class), null);
			if (root != null) {
				delegate = ProfileApplicationDelegateRegistry.INSTANCE.getDelegate(root);
				delegate.applyProfile(package_, profile, root, monitor);
			} else {
				// Simple profile application scenario
				package_.applyProfile(profile);
			}
			result = delegate.getProfileApplication(package_, profile);
		}

		monitor.done();

		return result;
	}



	public Profile getAppliedProfile() {
		return appliedProfile;
	}


	public void setPreviousAppliedProfile(Profile previousProfile) {
		this.previousProfile = previousProfile;

	}
}
