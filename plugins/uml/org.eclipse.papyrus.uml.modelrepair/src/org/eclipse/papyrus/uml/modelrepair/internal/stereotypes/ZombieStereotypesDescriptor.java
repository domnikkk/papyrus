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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.uml.modelrepair.internal.participants.StereotypesUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.util.UMLUtil;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;


/**
 * This is the ZombieStereotypesDescriptor type. Enjoy.
 */
public class ZombieStereotypesDescriptor {

	private static final Pattern AUTO_NSURI_PATTERN = Pattern.compile("^http://.*/([^/]+)/\\d+$");

	private final Resource resource;

	private final Package root;

	private final LabelProviderService labelProviderService;

	private final Set<EPackage> appliedProfileDefinitions;

	private final Multimap<ProfileContext, EObject> zombies = ArrayListMultimap.create();

	private final Map<EPackage, IRepairAction> suggestedActions = Maps.newHashMap();

	private final Function<? super EPackage, Profile> dynamicProfileSupplier;

	private Map<EPackage, Map<IRepairAction.Kind, IRepairAction>> repairActions = Maps.newHashMap();

	public ZombieStereotypesDescriptor(Resource resource, Package root, Set<EPackage> appliedProfileDefinitions, Function<? super EPackage, Profile> dynamicProfileSupplier, LabelProviderService labelProviderService) {
		this.resource = resource;
		this.root = root;
		this.appliedProfileDefinitions = includingSubpackages(appliedProfileDefinitions);
		this.dynamicProfileSupplier = dynamicProfileSupplier;
		this.labelProviderService = labelProviderService;
	}

	/**
	 * Stereotypes may be defined in regular packages within a profile. To that end, collect all
	 * nested packages of the applied profile-definition packages as being implicitly "applied".
	 */
	private static Set<EPackage> includingSubpackages(Collection<? extends EPackage> profileDefinitions) {
		final Set<EPackage> result = Sets.newHashSet();

		for (EPackage next : profileDefinitions) {
			collectPackages(next, result);
		}

		return result;
	}

	private static void collectPackages(EPackage ePackage, Collection<? super EPackage> result) {
		if (result.add(ePackage)) { // Not exactly likely to have cycles
			if (!ePackage.getESubpackages().isEmpty()) {
				for (EPackage next : ePackage.getESubpackages()) {
					collectPackages(next, result);
				}
			}
		}
	}

	public void analyze(EObject stereotypeApplication) {
		EPackage schema = getEPackage(stereotypeApplication);
		if ((schema == null) || (!appliedProfileDefinitions.contains(schema) && couldBeProfileDefinition(schema, stereotypeApplication))) {
			// It's a zombie. Determine the profile-application context that covers this stereotype instance
			ProfileContext context = getProfileContext(stereotypeApplication, schema);

			boolean newContext = !zombies.containsKey(context);
			zombies.put(context, stereotypeApplication);

			if (newContext && (schema != null)) {
				if (!suggestedActions.containsKey(schema)) {
					suggestedActions.put(schema, computeSuggestedAction(schema));
				} else {
					// Already computed the actions previously, but we need to add this new package to the apply-profile action
					ApplyProfileAction applyProfile = (ApplyProfileAction) getRepairAction(schema, IRepairAction.Kind.APPLY_LATEST_PROFILE_DEFINITION);
					if (applyProfile != null) {
						applyProfile.addPackage(context.getApplyingPackage());
					}
				}
			}
		}
	}

	protected boolean couldBeProfileDefinition(EPackage schema, EObject stereotypeApplication) {
		// an EPackage could be a profile definition if either actually is one or
		// it is a package demand-created by EMF for unrecognized content
		boolean result = findProfile(schema) != null;

		if (!result) {
			result = StereotypesUtil.isUnrecognizedSchema(schema, stereotypeApplication);
		}

		return result;
	}

	public boolean hasZombies() {
		return !zombies.isEmpty();
	}

	public Resource getResource() {
		return resource;
	}

	public Collection<? extends EPackage> getZombiePackages() {
		return ImmutableSet.copyOf(Iterables.transform(zombies.keySet(), new Function<ProfileContext, EPackage>() {

			public EPackage apply(ProfileContext input) {
				return input.getSchema();
			}
		}));
	}

	public int getZombieCount(EPackage schema) {
		int result = 0;
		for (Map.Entry<ProfileContext, Collection<EObject>> next : zombies.asMap().entrySet()) {
			if (equal(next.getKey().getSchema(), schema, root)) {
				result = result + next.getValue().size();
			}
		}

		return result;
	}

	public Collection<? extends EObject> getZombies(EPackage schema) {
		ImmutableList.Builder<EObject> result = ImmutableList.builder();

		for (Map.Entry<ProfileContext, Collection<EObject>> next : zombies.asMap().entrySet()) {
			if (equal(next.getKey().getSchema(), schema, root)) {
				result.addAll(next.getValue());
			}
		}

		return result.build();
	}

	public boolean repair(EPackage schema, IRepairAction repairAction, DiagnosticChain diagnostics, IProgressMonitor monitor) {
		return repairAction.repair(resource, schema, getZombies(schema), diagnostics, monitor);
	}

	protected EPackage getEPackage(EObject object) {
		EClass eclass = object.eClass();
		return (eclass == null) ? null : eclass.getEPackage();
	}

	protected IRepairAction computeSuggestedAction(EPackage schema) {
		// Try options in our preferred order
		IRepairAction result = getRepairAction(schema, IRepairAction.Kind.APPLY_LATEST_PROFILE_DEFINITION);
		if (result.isNull()) {
			// This one is always available
			result = getRepairAction(schema, IRepairAction.Kind.NO_OP);
		}

		return result;
	}

	protected Map<IRepairAction.Kind, IRepairAction> computeFeasibleRepairActions(EPackage schema) {
		Map<IRepairAction.Kind, IRepairAction> result = Maps.newEnumMap(IRepairAction.Kind.class);

		// Always available
		result.put(IRepairAction.NO_OP.kind(), IRepairAction.NO_OP);
		result.put(DeleteAction.INSTANCE.kind(), DeleteAction.INSTANCE);
		result.put(CreateMarkersAction.INSTANCE.kind(), CreateMarkersAction.INSTANCE);

		IRepairAction applyProfile;
		Collection<Package> packages = getContextPackages(schema);
		Profile profile = findProfile(schema);
		if (profile == null) {
			applyProfile = new ApplyProfileAction(packages, curry(schema, dynamicProfileSupplier));
		} else {
			applyProfile = new ApplyProfileAction(packages, profile, labelProviderService);
		}
		result.put(applyProfile.kind(), applyProfile);

		return result;
	}

	List<ProfileContext> getProfileContexts(final EPackage schema) {
		return ImmutableList.copyOf(Iterables.filter(zombies.keySet(), new Predicate<ProfileContext>() {

			public boolean apply(ProfileContext input) {
				return equal(input.schema, schema, root);
			}
		}));
	}

	Set<Package> getContextPackages(EPackage schema) {
		return ImmutableSet.copyOf(Iterables.transform(getProfileContexts(schema), new Function<ProfileContext, Package>() {

			public Package apply(ProfileContext input) {
				return input.getApplyingPackage();
			}
		}));
	}

	static <F, T> Supplier<T> curry(F input, Function<? super F, T> function) {
		return Suppliers.compose(function, Suppliers.ofInstance(input));
	}

	public IRepairAction getSuggestedRepairAction(EPackage schema) {
		return suggestedActions.get(schema);
	}

	public IRepairAction getRepairAction(EPackage schema, IRepairAction.Kind kind) {
		Map<IRepairAction.Kind, IRepairAction> available = repairActions.get(schema);
		if (available == null) {
			available = computeFeasibleRepairActions(schema);
			repairActions.put(schema, available);
		}

		return available.get(kind);
	}

	public List<IRepairAction> getAvailableRepairActions(EPackage schema) {
		Map<IRepairAction.Kind, IRepairAction> actions = repairActions.get(schema);
		return (actions == null) ? Collections.<IRepairAction> emptyList() : ImmutableList.copyOf(Iterables.filter(actions.values(), IRepairAction.NOT_NULL));
	}

	protected Profile findProfile(EPackage definition) {
		return UMLUtil.getProfile(definition, root);
	}

	protected ProfileContext getProfileContext(EObject stereotypeApplication, EPackage schema) {
		ProfileContext result;

		if (schema == null) {
			// No way to tell which package it was applied to (though this shouldn't happen, as EMF demand-creates a schema)
			result = new ProfileContext(root, schema);
		} else {
			Element base = getBaseElement(stereotypeApplication);
			if (base == null) {
				// Can't make any inference about package context
				result = new ProfileContext(root, schema);
			} else {
				// Find the profile application
				result = null;
				for (Package pkg = base.getNearestPackage(); pkg != null; pkg = (pkg.getOwner() == null) ? null : pkg.getOwner().getNearestPackage()) {
					for (ProfileApplication next : pkg.getProfileApplications()) {
						if (equal(next.getAppliedDefinition(), schema, root)) {
							result = new ProfileContext(schema, next);
							break;
						}
					}
				}

				if (result == null) {
					// Couldn't infer the package context from a matching profile application. Oh, well
					result = new ProfileContext(root, schema);
				}
			}
		}

		return result;
	}

	static Element getBaseElement(EObject stereotypeApplication) {
		Element result = null;

		out: for (EStructuralFeature next : stereotypeApplication.eClass().getEAllStructuralFeatures()) {
			if ((next instanceof EReference) && next.getName().startsWith(Extension.METACLASS_ROLE_PREFIX)) {
				Object value = stereotypeApplication.eGet(next);

				if (value instanceof Element) {
					result = (Element) value;
					break out;
				}
			} else if (FeatureMapUtil.isFeatureMap(next)) {
				// Handle unknown schema
				for (FeatureMap.Entry entry : (FeatureMap) stereotypeApplication.eGet(next)) {
					if (entry.getEStructuralFeature().getName().startsWith(Extension.METACLASS_ROLE_PREFIX)) {
						Object value = entry.getValue();

						if (value instanceof String) {
							// Try it as an IDREF
							value = stereotypeApplication.eResource().getEObject((String) value);
						}

						if (value instanceof Element) {
							result = (Element) value;
							break out;
						}
					}
				}
			}
		}

		return result;
	}

	/**
	 * Two references to a profile definition equal if they are the same object, or if they are both resolved and have the same namespace URI,
	 * or if they are both proxies and have the same proxy URI.
	 *
	 * @param schema1
	 *            a schema for stereotype definitions
	 * @param schema2
	 *            another schema for stereotype definitions
	 * @param context
	 *            a context in which the comparison is being made, which provides (for example) a {@link Resource} or even a {@link ResourceSet}
	 *
	 * @return whether they appear to be the "same" schema
	 */
	static boolean equal(EPackage schema1, EPackage schema2, EObject context) {
		boolean result = false;

		result = schema1 == schema2;
		if (!result && (schema1 != null)) { // Implies that schema2 != null, also
			result = Objects.equal(schema1.getNsURI(), schema2.getNsURI());
			if (!result) {
				// Maybe one is a proxy whose URI is the schema-location of the other (being a demand-created package)
				URI uri1 = guessURI(schema1);
				URI uri2 = guessURI(schema2);
				result = Objects.equal(uri1, uri2);
			}
		}

		return result;
	}

	static URI guessURI(EPackage schema) {
		URI result;

		if (schema.eIsProxy()) {
			// Easy. We know the URI because it's an unresolved reference from a profile application annotation
			result = EcoreUtil.getURI(schema);
		} else if (schema.eResource() != null) {
			// Handle the common case of a dynamic profile definition that didn't have a custom namespace URI
			Matcher m = AUTO_NSURI_PATTERN.matcher(schema.getNsURI());
			if (m.matches()) {
				// The demand-created package was looked up from a location URI that turned out unresolved
				result = schema.eResource().getURI().appendFragment(m.group(1));
			} else {
				// Oh, well. This shouldn't be expected to match anything usefully
				result = EcoreUtil.getURI(schema);
			}
		} else {
			// Have only the namespace URI to go by
			result = URI.createURI(schema.getNsURI());
		}

		return result;
	}

	//
	// Nested types
	//

	static class ProfileContext {

		private final Package applyingPackage;

		private final EPackage schema;

		private int hash;

		ProfileContext(Package applyingPackage, EPackage schema) {
			this.applyingPackage = applyingPackage;
			this.schema = schema;
			init();
		}

		ProfileContext(EPackage schema, ProfileApplication profileApplication) {
			this.applyingPackage = profileApplication.getApplyingPackage();
			this.schema = schema;
			init();
		}

		private void init() {
			String schemaHash = (schema == null) ? null : schema.getNsURI();
			hash = Objects.hashCode(applyingPackage, schemaHash);
		}

		public Package getApplyingPackage() {
			return applyingPackage;
		}

		public EPackage getSchema() {
			return schema;
		}

		@Override
		public boolean equals(Object obj) {
			boolean result = false;

			if (obj instanceof ProfileContext) {
				ProfileContext other = (ProfileContext) obj;

				result = other.applyingPackage == this.applyingPackage;
				if (result) {
					result = equal(other.schema, this.schema, applyingPackage);
				}
			}

			return result;
		}

		@Override
		public int hashCode() {
			return hash;
		}
	}
}
