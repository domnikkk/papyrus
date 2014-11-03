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

package org.eclipse.papyrus.uml.decoratormodel.internal.controlmode;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.papyrus.infra.emf.utils.EMFFunctions;
import org.eclipse.papyrus.infra.emf.utils.EMFPredicates;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeRequest;
import org.eclipse.papyrus.infra.tools.util.ReferenceCounted;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.base.Functions;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * Contextual information about the control/uncontrol refactoring of a package
 * that informs the refactoring of dependent decorator models.
 */
public class PackageRefactoringContext extends ReferenceCounted<PackageRefactoringContext> {
	private static Map<Package, PackageRefactoringContext> contexts = new MapMaker().weakKeys().weakValues().makeMap();

	private final Package package_;
	private final URI oldUserModelURI;
	private final URI newUserModelURI;

	private final TransactionalEditingDomain domain;
	private final Set<Package> affectedPackages;
	private final Set<ProfileApplication> preRefactoringProfileApplications;

	// Map of profile URI to decorator-model URI to applied definition URI
	private final Map<URI, Map<URI, URI>> allExternalAppliedProfiles;
	// Just those that are inherited from the parent package
	private final Map<URI, Map<URI, URI>> inheritedExternalAppliedProfiles;

	private final Set<URI> affectedDecoratorModels;
	private final Set<URI> affectedLoadedDecoratorModels;
	private final Set<URI> affectedUnloadedDecoratorModels;

	private Map<Object, Object> data;

	private PackageRefactoringContext(Package package_, URI oldUserModelURI, URI newUserModelURI) {
		super(Activator.getDefault().getExecutorService());

		this.package_ = package_;
		this.oldUserModelURI = oldUserModelURI;
		this.newUserModelURI = newUserModelURI;

		this.domain = TransactionUtil.getEditingDomain(package_);
		this.affectedPackages = ImmutableSet.copyOf(getPackagesBeingControlled(package_));
		this.preRefactoringProfileApplications = ImmutableSet.copyOf(package_.getProfileApplications());

		// Find URIs of decorator models attached to these packages and all their ancestors because
		// all of those profiles are applied to these packages, except for any that are loaded
		// because their proxies will take care of themselves

		Set<Package> allPackages = Sets.newHashSet(affectedPackages);
		for (Package next : affectedPackages) {
			allPackages.addAll(next.allOwningPackages());
		}

		Set<URI> decorators = Sets.newHashSet();
		Map<URI, Map<URI, URI>> allExternal = null;
		Map<URI, Map<URI, URI>> inheritedExternal = null;
		try {
			allExternal = DecoratorModelUtils.getAllDecoratorModelAppliedProfileDefinitions(package_);
			if (package_.getNestingPackage() != null) {
				inheritedExternal = DecoratorModelUtils.getAllDecoratorModelAppliedProfileDefinitions(package_.getNestingPackage());
			}

			for (Package next : allPackages) {
				decorators.addAll(DecoratorModelIndex.getInstance().getDecoratorModelsForPackage(EcoreUtil.getURI(next)));
			}
		} catch (CoreException e) {
			// TODO
			Activator.getDefault().getLog().log(e.getStatus());
			allExternal = Collections.emptyMap();
		}

		this.allExternalAppliedProfiles = (allExternal != null) ? allExternal : Collections.<URI, Map<URI, URI>> emptyMap();
		this.inheritedExternalAppliedProfiles = (inheritedExternal != null) ? inheritedExternal : Collections.<URI, Map<URI, URI>> emptyMap();
		this.affectedDecoratorModels = ImmutableSet.copyOf(decorators);

		Set<URI> allLoaded = Sets.newHashSet(Iterables.transform(Iterables.filter(domain.getResourceSet().getResources(), EMFPredicates.isLoaded()), EMFFunctions.resourceURI()));
		this.affectedLoadedDecoratorModels = ImmutableSet.copyOf(Sets.intersection(decorators, allLoaded));
		decorators.removeAll(allLoaded);
		this.affectedUnloadedDecoratorModels = ImmutableSet.copyOf(decorators);
	}

	static PackageRefactoringContext get(Package package_, ControlModeRequest request) {
		PackageRefactoringContext result = contexts.get(package_);

		if (result == null) {
			result = new PackageRefactoringContext(package_, request.getSourceURI(), request.getNewURI());
			contexts.put(package_, result);
		}

		return result;
	}

	static void remove(PackageRefactoringContext context) {
		if (contexts.get(context.getPackage()) == context) {
			contexts.remove(context.getPackage());
		}
	}

	/**
	 * Obtains the current package refactoring context for the specified {@code request}, if any.
	 * <b>Note</b> that this method {@linkplain ReferenceCounted#retain() retains} the resulting context.
	 * 
	 * @param request
	 *            a request
	 * @return the retained context, or {@code null} if none
	 */
	public static PackageRefactoringContext getInstance(ControlModeRequest request) {
		return (request.getTargetObject() instanceof Package) ? get((Package) request.getTargetObject(), request).retain() : null;
	}

	@Override
	protected void dispose() {
		remove(this);
		data = null;
	}

	public TransactionalEditingDomain getEditingDomain() {
		return domain;
	}

	public Package getPackage() {
		return package_;
	}

	public URI getOldUserModelURI() {
		return oldUserModelURI;
	}

	public URI getNewUserModelURI() {
		return newUserModelURI;
	}

	public Set<ProfileApplication> getPreRefactoringProfileApplications() {
		return preRefactoringProfileApplications;
	}

	public Set<Profile> getPreRefactoringAppliedProfiles() {
		return ImmutableSet.copyOf(Collections2.transform(getPreRefactoringProfileApplications(), //
				EMFFunctions.getFeature(UMLPackage.Literals.PROFILE_APPLICATION__APPLIED_PROFILE, Profile.class)));
	}

	public Set<URI> getPreRefactoringAppliedProfileURIs() {
		return ImmutableSet.copyOf(Collections2.transform(getPreRefactoringProfileApplications(), //
				Functions.compose(EMFFunctions.objectURI(), EMFFunctions.getFeature(UMLPackage.Literals.PROFILE_APPLICATION__APPLIED_PROFILE, Profile.class))));
	}

	public Set<ProfileApplication> getPostRefactoringProfileApplications() {
		return Sets.difference(Sets.newHashSet(package_.getProfileApplications()), preRefactoringProfileApplications);
	}

	public Set<Profile> getPostRefactoringAppliedProfiles() {
		return ImmutableSet.copyOf(Collections2.transform(getPostRefactoringProfileApplications(), //
				EMFFunctions.getFeature(UMLPackage.Literals.PROFILE_APPLICATION__APPLIED_PROFILE, Profile.class)));
	}

	public Set<URI> getPostRefactoringAppliedProfileURIs() {
		return ImmutableSet.copyOf(Collections2.transform(getPostRefactoringProfileApplications(), //
				Functions.compose(EMFFunctions.objectURI(), EMFFunctions.getFeature(UMLPackage.Literals.PROFILE_APPLICATION__APPLIED_PROFILE, Profile.class))));
	}

	public Set<Package> getAffectedPackages() {
		return affectedPackages;
	}

	public Map<URI, Map<URI, URI>> getAllExternalProfileApplications() {
		return allExternalAppliedProfiles;
	}

	public Map<URI, Map<URI, URI>> getInheritedExternalProfileApplications() {
		return inheritedExternalAppliedProfiles;
	}

	public Set<URI> getAffectedDecoratorModels() {
		return affectedDecoratorModels;
	}

	public Set<URI> getAffectedLoadedDecoratorModels() {
		return affectedLoadedDecoratorModels;
	}

	public Set<URI> getAffectedUnloadedDecoratorModels() {
		return affectedUnloadedDecoratorModels;
	}

	public Map<URI, URI> getAllExternalProfileApplicationsFor(URI decoratorModelURI) {
		return getExternalProfileApplicationsFor(decoratorModelURI, getAllExternalProfileApplications());
	}

	public Map<URI, URI> getInheritedExternalProfileApplicationsFor(URI decoratorModelURI) {
		return getExternalProfileApplicationsFor(decoratorModelURI, getInheritedExternalProfileApplications());
	}

	private Map<URI, URI> getExternalProfileApplicationsFor(URI decoratorModelURI, Map<URI, Map<URI, URI>> source) {
		ImmutableMap.Builder<URI, URI> result = ImmutableMap.builder();

		for (Map.Entry<URI, Map<URI, URI>> next : source.entrySet()) {
			URI definition = next.getValue().get(decoratorModelURI);
			if (definition != null) {
				result.put(next.getKey(), definition);
			}
		}

		return result.build();
	}

	public static Iterable<Package> getPackagesBeingControlled(final EObject object) {
		return new Iterable<Package>() {

			@Override
			public Iterator<Package> iterator() {
				// The "proper contents" includes containment proxies until such time as they are resolved.
				// So, filter them out
				Iterator<EObject> properContents = EcoreUtil.getAllProperContents(Collections.singletonList(object), false);
				return Iterators.filter(Iterators.filter(properContents, Package.class), EMFPredicates.notProxy());
			}
		};
	}

	public Map<Object, Object> getContextData() {
		if (data == null) {
			data = Maps.newHashMap();
		}
		return data;
	}
}
