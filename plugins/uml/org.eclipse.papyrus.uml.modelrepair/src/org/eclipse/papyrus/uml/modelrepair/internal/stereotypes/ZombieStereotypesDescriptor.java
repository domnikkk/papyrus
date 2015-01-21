/*
 * Copyright (c) 2014, 2015 CEA, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *   Christian W. Damus - bug 399859
 *  Christian W. Damus - bug 451338
 *   Christian W. Damus - bug 436666
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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.uml.modelrepair.internal.participants.StereotypesUtil;
import org.eclipse.papyrus.uml.tools.helper.IProfileApplicationDelegate;
import org.eclipse.papyrus.uml.tools.helper.ProfileApplicationDelegateRegistry;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLFactory;
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

	private final Profile nullProfile = UMLFactory.eINSTANCE.createProfile();

	private final Resource resource;

	private final Package root;

	private final LabelProviderService labelProviderService;

	private final Set<EPackage> appliedProfileDefinitions;

	private final Multimap<ProfileContext, EObject> zombies = ArrayListMultimap.create();

	private final Map<IAdaptable, IRepairAction> suggestedActions = Maps.newHashMap();

	private final Function<? super EPackage, Profile> dynamicProfileSupplier;

	private Map<IAdaptable, Map<IRepairAction.Kind, IRepairAction>> repairActions = Maps.newHashMap();

	private Map<EPackage, Profile> definitionToProfileMap = Maps.newHashMap();

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
		if ((schema == null)
				|| (!appliedProfileDefinitions.contains(schema) && couldBeProfileDefinition(schema, stereotypeApplication))
				|| (appliedProfileDefinitions.contains(schema) && (UMLUtil.getBaseElement(stereotypeApplication) == null))) {

			// It's a zombie. Determine the profile-application context that covers this stereotype instance
			ProfileContext context = getProfileContext(stereotypeApplication, schema);

			boolean newContext = !zombies.containsKey(context);
			zombies.put(context, stereotypeApplication);

			if (newContext && (schema != null)) {
				IAdaptable schemaAdaptable = context.getSchemaAdaptable();
				if (!suggestedActions.containsKey(schemaAdaptable)) {
					suggestedActions.put(schemaAdaptable, computeSuggestedAction(schemaAdaptable));
				} else {
					// Already computed the actions previously, but we need to add this new package to the apply-profile action
					ApplyProfileAction applyProfile = (ApplyProfileAction) getRepairAction(schemaAdaptable, IRepairAction.Kind.APPLY_LATEST_PROFILE_DEFINITION);
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

	/**
	 * Obtains a collection of zombie schemas detected by the stereotype repair analysis and for which {@link IRepairAction}s
	 * are available to remedy problems. Every resulting adaptable
	 * <ul>
	 * <li>adapts to {@link EPackage} to provide the EMF schema that is unresolved or otherwise broken</li>
	 * <li>may possibly adapt to {@link IStereotypeOrphanGroup} representing stereotype applications from a broken schema that are not repairable by profile migration and so are treated separately with a distinct set of available actions
	 * </ul>
	 * 
	 * @return the zombie schemas that are detected
	 */
	public Collection<? extends IAdaptable> getZombieSchemas() {
		return ImmutableSet.copyOf(Iterables.transform(zombies.keySet(), new Function<ProfileContext, IAdaptable>() {

			public IAdaptable apply(ProfileContext input) {
				return input.getSchemaAdaptable();
			}
		}));
	}

	public int getZombieCount(IAdaptable schema) {
		int result = 0;

		for (Map.Entry<ProfileContext, Collection<EObject>> next : Iterables.filter(zombies.asMap().entrySet(), matches(schema))) {
			result = result + next.getValue().size();
		}

		return result;
	}

	private Predicate<Map.Entry<ProfileContext, ?>> matches(IAdaptable schema) {
		IStereotypeOrphanGroup orphans = AdapterUtils.adapt(schema, IStereotypeOrphanGroup.class, null);
		final boolean isOrphanGroup = orphans != null;
		final EPackage targetSchema = isOrphanGroup ? orphans.getSchema() : AdapterUtils.adapt(schema, EPackage.class, null);

		return new Predicate<Map.Entry<ProfileContext, ?>>() {
			public boolean apply(Map.Entry<ProfileContext, ?> input) {
				ProfileContext context = input.getKey();
				return (context.isOrphanGroup() == isOrphanGroup) && equal(context.getSchema(), targetSchema, root);
			}
		};
	}

	public Collection<? extends EObject> getZombies(IAdaptable schema) {
		ImmutableList.Builder<EObject> result = ImmutableList.builder();

		for (Map.Entry<ProfileContext, Collection<EObject>> next : Iterables.filter(zombies.asMap().entrySet(), matches(schema))) {
			result.addAll(next.getValue());
		}

		return result.build();
	}

	public boolean repair(IAdaptable schema, IRepairAction repairAction, DiagnosticChain diagnostics, IProgressMonitor monitor) {
		EPackage ePackage = AdapterUtils.adapt(schema, EPackage.class).get(); // Fails if not present
		return !repairAction.isNull() && repairAction.repair(resource, ePackage, getZombies(schema), diagnostics, monitor);
	}

	protected EPackage getEPackage(EObject object) {
		EClass eclass = object.eClass();
		return (eclass == null) ? null : eclass.getEPackage();
	}

	protected IRepairAction computeSuggestedAction(IAdaptable schema) {
		// Try options in our preferred order
		IRepairAction result = getRepairAction(schema, IRepairAction.Kind.APPLY_LATEST_PROFILE_DEFINITION);

		if (result.isNull()) {
			IStereotypeOrphanGroup orphanGroup = AdapterUtils.adapt(schema, IStereotypeOrphanGroup.class, null);
			if (orphanGroup != null) {
				// Prefer to just delete orphans
				result = getRepairAction(schema, IRepairAction.Kind.DELETE);
			}

			if (result.isNull()) {
				// This one is always available
				result = getRepairAction(schema, IRepairAction.Kind.NO_OP);
			}
		}

		return result;
	}

	protected Map<IRepairAction.Kind, IRepairAction> computeFeasibleRepairActions(IAdaptable schema) {
		Map<IRepairAction.Kind, IRepairAction> result = Maps.newEnumMap(IRepairAction.Kind.class);

		// Always available
		result.put(IRepairAction.NO_OP.kind(), IRepairAction.NO_OP);
		result.put(DeleteAction.INSTANCE.kind(), DeleteAction.INSTANCE);
		result.put(CreateMarkersAction.INSTANCE.kind(), CreateMarkersAction.INSTANCE);

		IStereotypeOrphanGroup orphanGroup = AdapterUtils.adapt(schema, IStereotypeOrphanGroup.class, null);
		if (orphanGroup != null) {
			// Easy case. Nothing more to add!
		} else {
			EPackage ePackage = AdapterUtils.adapt(schema, EPackage.class, null);
			IRepairAction applyProfile;
			Collection<Package> packages = getContextPackages(ePackage);
			Profile profile = findProfile(ePackage);
			if (profile == null) {
				applyProfile = new ApplyProfileAction(resource, packages, curry(ePackage, dynamicProfileSupplier));
			} else {
				applyProfile = new ApplyProfileAction(resource, packages, profile, labelProviderService);
			}
			result.put(applyProfile.kind(), applyProfile);
		}

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

	public IRepairAction getSuggestedRepairAction(IAdaptable schema) {
		return suggestedActions.get(schema);
	}

	/**
	 * Obtains a repair action of the specified {@code kind} for a broken {@code schema}, if it is available.
	 * 
	 * @param schema
	 *            a schema to repair
	 * @param kind
	 *            the kind of repair action to obtain
	 * @return the requested {@code kind} of action, or {@link IRepairAction#NULL} if the requested {@code kind} is not available for this {@code schema}
	 */
	public IRepairAction getRepairAction(IAdaptable schema, IRepairAction.Kind kind) {
		Map<IRepairAction.Kind, IRepairAction> available = repairActions.get(schema);
		if (available == null) {
			available = computeFeasibleRepairActions(schema);
			repairActions.put(schema, available);
		}

		IRepairAction result = available.get(kind);
		if (result == null) {
			result = IRepairAction.NULL;
		}
		return result;
	}

	public List<IRepairAction> getAvailableRepairActions(IAdaptable schema) {
		Map<IRepairAction.Kind, IRepairAction> actions = repairActions.get(schema);
		return (actions == null) ? Collections.<IRepairAction> emptyList() : ImmutableList.copyOf(Iterables.filter(actions.values(), IRepairAction.NOT_NULL));
	}

	protected Profile findProfile(EPackage definition) {
		Profile result = definitionToProfileMap.get(definition);
		if (result == null) {
			result = UMLUtil.getProfile(definition, root);
			if (result == null) {
				result = nullProfile;
			}
			definitionToProfileMap.put(definition, result);
		}

		return (result == nullProfile) ? /* cache miss */null : /* cache hit */result;
	}

	protected ProfileContext getProfileContext(EObject stereotypeApplication, EPackage schema) {
		ProfileContext result;

		if (schema == null) {
			// No way to tell which package it was applied to (though this shouldn't happen, as EMF demand-creates a schema)
			result = new ProfileContext(root, schema);
		} else {
			Element base = getBaseElement(stereotypeApplication);
			if (base == null) {
				// These are orphans
				result = new ProfileContext(schema);
			} else {
				// Find the profile application
				result = null;
				Package pkg = null;
				out: for (Package successor = base.getNearestPackage(); successor != null; successor = (pkg.getOwner() == null) ? null : pkg.getOwner().getNearestPackage()) {
					pkg = successor;

					IProfileApplicationDelegate delegate = ProfileApplicationDelegateRegistry.INSTANCE.getDelegate(pkg);
					for (ProfileApplication next : delegate.getProfileApplications(pkg)) {
						if (equal(next.getAppliedDefinition(), schema, root)) {
							result = new ProfileContext(schema, next);
							break out;
						}
					}

					;
				}

				if (result == null) {
					// Couldn't infer the package context from a matching profile application. Oh, well. Take the root
					// package, then (which could be different from the 'root' we started with in the case that it's
					// a profile-application model: we need the root of the user model content)
					result = new ProfileContext((pkg == null) ? root : pkg, schema);
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
				FeatureMap.Internal fmap = (FeatureMap.Internal) stereotypeApplication.eGet(next);
				int entryIndex = -1;
				for (FeatureMap.Entry entry : fmap) {
					entryIndex++;
					EStructuralFeature feature = entry.getEStructuralFeature();
					if (feature.getName().startsWith(Extension.METACLASS_ROLE_PREFIX)) {
						// In case it's a reference, ensure that we try to resolve it
						Object value = fmap.get(feature, true);
						if (value instanceof EList<?>) {
							// As a member of the 'mixed' feature-map, it is assumed to have multiplicity
							value = ((EList<?>) value).get(0);

							// The feature-map list doesn't resolve proxies despite that we asked for resolving
							if (feature instanceof EReference) {
								value = fmap.resolveProxy(feature, entryIndex, 0, value);
							}
						}

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

				if (!result) {
					// One more try: If both URIs match the auto-generated dynamic Ecore definition pattern, then we
					// can try to normalize and compare them
					Matcher m = AUTO_NSURI_PATTERN.matcher(uri1.toString());
					if (m.matches()) {
						String normalized1 = uri1.toString().substring(0, m.start(1));
						m.reset(uri2.toString());
						if (m.matches()) {
							String normalized2 = uri2.toString().substring(0, m.start(1));
							result = normalized1.equals(normalized2);
						}
					}
				}
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

	static class ProfileContext implements IAdaptable {

		private final Package applyingPackage;

		private final EPackage schema;

		private int hash;

		ProfileContext(Package applyingPackage, EPackage schema) {
			this.applyingPackage = applyingPackage;
			this.schema = schema;
			init();
		}

		ProfileContext(EPackage schema, ProfileApplication profileApplication) {
			this(profileApplication.getApplyingPackage(), schema);
		}

		/**
		 * Creates a descriptor for a group of orphaned stereotype instances of the given {@code schema}.
		 * An orphan group is distinct from the stereotype instances of the same schema that are attached
		 * to base UML elements, because those can be properly managed by the UML2 API.
		 *
		 * @param schema
		 *            the XML/Ecore schema of the orphaned stereotype instances
		 */
		ProfileContext(EPackage schema) {
			this(null, schema);
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

		public IAdaptable getSchemaAdaptable() {
			return isOrphanGroup() ? this : new EPackageAdapter(getSchema());
		}

		/**
		 * Queries whether I represent a group of orphaned stereotype instances.
		 * An orphan group is distinct from the stereotype instances of the same schema that are attached
		 * to base UML elements, because those can be properly managed by the UML2 API.
		 *
		 * @return whether I represent orphaned stereotype instances of some schema
		 */
		public boolean isOrphanGroup() {
			return getApplyingPackage() == null;
		}

		public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
			Object result = null;

			if (adapter == EPackage.class) {
				result = getSchema();
			} else if ((adapter == IStereotypeOrphanGroup.class) && isOrphanGroup()) {
				result = new IStereotypeOrphanGroup() {
					public EPackage getSchema() {
						return ProfileContext.this.getSchema();
					}
				};
			}

			return result;
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

	private static final class EPackageAdapter implements IAdaptable {
		private final EPackage ePackage;

		EPackageAdapter(EPackage ePackage) {
			super();

			this.ePackage = ePackage;
		}

		public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
			return (adapter == EPackage.class) ? ePackage : null;
		}

		@Override
		public boolean equals(Object obj) {
			return (obj instanceof EPackageAdapter) && (((EPackageAdapter) obj).ePackage == ePackage);
		}

		@Override
		public int hashCode() {
			return ePackage.hashCode();
		}
	}
}
