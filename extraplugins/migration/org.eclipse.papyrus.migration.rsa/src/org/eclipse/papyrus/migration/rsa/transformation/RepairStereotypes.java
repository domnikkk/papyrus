/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.transformation;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.services.labelprovider.service.impl.LabelProviderServiceImpl;
import org.eclipse.papyrus.migration.rsa.Activator;
import org.eclipse.papyrus.uml.modelrepair.internal.stereotypes.IRepairAction;
import org.eclipse.papyrus.uml.modelrepair.internal.stereotypes.ZombieStereotypesDescriptor;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * Repairs stereotype applications in the specified model set, using the default action for each
 *
 * The given URI Map is used when the proper profile can't be found automatically
 *
 * @author Camille Letavernier
 *
 */
public class RepairStereotypes {

	private final ModelSet modelSet;

	private final Collection<Resource> resourcesToRepair;

	private final Map<URI, URI> profileMappings;

	public RepairStereotypes(ModelSet modelSet, Collection<Resource> resourcesToRepair, Map<URI, URI> profileMappings) {
		this.modelSet = modelSet;
		this.resourcesToRepair = resourcesToRepair;
		this.profileMappings = profileMappings;
	}

	/**
	 * Finds all zombie stereotypes, and repair them with the default action.
	 *
	 * If the profile can't be found automatically, the profileMappings map is used
	 */
	public void execute() {
		ZombieStereotypesDescriptor result = null;

		LabelProviderService labelProvider = new LabelProviderServiceImpl();
		try {
			labelProvider.startService();
		} catch (Exception ex) {
			Activator.log.error(ex);
			return;
		}

		Function<? super EPackage, Profile> profileSupplier = getProfileSupplier();

		for (Resource resource : resourcesToRepair) {
			Element rootElement = (Element) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.ELEMENT);
			if (!(rootElement instanceof Package)) {
				continue;
			}

			Package rootPackage = (Package) rootElement;

			Collection<ProfileApplication> profileApplications = Lists.newArrayList();
			for (TreeIterator<EObject> iter = EcoreUtil.getAllProperContents(Collections.singleton(rootPackage), false); iter.hasNext();) {
				EObject next = iter.next();
				if (next instanceof ProfileApplication) {
					profileApplications.add((ProfileApplication) next);
					iter.prune();
				} else if (!(next instanceof Package) && !(next instanceof Component)) {
					// No sense looking for packages except in the things that can contain packages
					iter.prune();
				}
			}

			Set<EPackage> appliedDefinitions = getAppliedDefinitions(profileApplications);

			ZombieStereotypesDescriptor zombies = new ZombieStereotypesDescriptor(resource, rootPackage, appliedDefinitions, profileSupplier, labelProvider);

			for (EObject next : resource.getContents()) {
				if (!(next instanceof Element)) {
					zombies.analyze(next);
				}
			}

			if (zombies.hasZombies()) {
				result = zombies;
			}

			if (result == null) {
				continue;
			}

			final ZombieStereotypesDescriptor descriptor = result;

			final TransactionalEditingDomain domain = modelSet.getTransactionalEditingDomain();

			domain.getCommandStack().execute(new AbstractCommand("Repair profiles") {

				@Override
				public void execute() {

					final BasicDiagnostic diagnostics = new BasicDiagnostic(Activator.PLUGIN_ID, 0, "Problems in repairing stereotypes", null);

					for (EPackage packageToRepair : descriptor.getZombiePackages()) {
						IRepairAction action = descriptor.getRepairAction(packageToRepair, IRepairAction.Kind.APPLY_LATEST_PROFILE_DEFINITION);
						descriptor.repair(packageToRepair, action, diagnostics, new NullProgressMonitor());
					}

				}

				@Override
				public void redo() {
					// Nothing
				}

				@Override
				protected boolean prepare() {
					return true;
				}
			});
		}

		try {
			labelProvider.disposeService();
		} catch (ServiceException ex) {
			Activator.log.error(ex);
		}
	}

	/**
	 * Maps a zombie EPackage with an existing Profile. Called only if the Profile can't be resolved automatically
	 *
	 * @return
	 */
	protected Function<? super EPackage, Profile> getProfileSupplier() {
		return new Function<EPackage, Profile>() {

			// If we're here, we didn't find a perfect match for the profile. We need to make some guesses
			@Override
			public Profile apply(EPackage input) {
				if (input.eResource() == null || input.eResource().getURI() == null) {
					return null;
				}

				URI packageResourceURI = input.eResource().getURI();
				URI targetResourceURI = profileMappings.get(packageResourceURI);

				Profile result = null;
				URI selectedProfileURI = targetResourceURI;
				if (selectedProfileURI != null) {
					result = EMFHelper.load(modelSet, selectedProfileURI, Profile.class);

					// If there is a single Profile, there is no ambiguity. Just return it
					if ((result != null) && !hasNestedProfiles(result)) {
						return result;
					}

					// TODO: handle the case with nested profiles (We already opened a popup dialog earlier; wouldn't be a good idea to pop another dialog here)
				}

				return null;
			}

			boolean hasNestedProfiles(Profile profile) {
				return Iterators.any(profile.eAllContents(), Predicates.instanceOf(Profile.class));
			}
		};
	}

	protected Set<EPackage> getAppliedDefinitions(Iterable<? extends ProfileApplication> profileApplications) {
		Set<EPackage> result = Sets.newHashSet();

		for (ProfileApplication next : profileApplications) {
			EPackage definition = next.getAppliedDefinition();
			if ((definition != null) && !definition.eIsProxy()) {
				result.add(definition);
			}
		}

		return result;
	}
}
