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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.uml.modelrepair.internal.participants.StereotypeApplicationRepairParticipant;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;

import com.google.common.base.Supplier;


/**
 * This is the ApplyProfileAction type. Enjoy.
 */
public class ApplyProfileAction extends AbstractRepairAction {

	private final Element root;

	private Supplier<Profile> profileSupplier;

	public ApplyProfileAction(Element root, Supplier<Profile> profileSupplier) {
		super(Kind.APPLY_LATEST_PROFILE_DEFINITION);

		this.root = root;
		this.profileSupplier = profileSupplier;
	}

	public boolean repair(Resource resource, EPackage profileDefinition, Collection<? extends EObject> stereotypeApplications, DiagnosticChain diagnostics, IProgressMonitor monitor) {
		Profile profile = profileSupplier.get();
		if(profile == null) {
			return false;
		}

		// Get the topmost package
		Package topPackage = root.getNearestPackage();
		for(Element higher = topPackage; higher != null; higher = higher.getOwner()) {
			Package next = higher.getNearestPackage();
			if(next != null) {
				topPackage = next;
			}
			higher = next;
		}

		// Apply the profile
		if(topPackage != null) {
			StereotypeApplicationRepairParticipant.createStereotypeApplicationMigrator(profile, diagnostics).migrate(stereotypeApplications);
			topPackage.applyProfile(profile);
		}

		return true;
	}
}
