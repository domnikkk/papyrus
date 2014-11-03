/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST, Christian W. Damus, and others.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) - Initial API and implementation
 *  Christian W. Damus - bug 399859
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.decoratormodel.helper;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.emf.resource.AnyRootNamespaceContentHandler;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.decoratormodel.Activator;
import org.eclipse.papyrus.uml.decoratormodel.internal.commands.CreateDecoratorModelCommand;
import org.eclipse.papyrus.uml.decoratormodel.internal.commands.DeleteDecoratorModelCommand;
import org.eclipse.papyrus.uml.decoratormodel.internal.commands.ReclaimProfileApplicationsCommand;
import org.eclipse.papyrus.uml.decoratormodel.internal.commands.SaveDecoratorModelCommand;
import org.eclipse.papyrus.uml.decoratormodel.internal.commands.SeparateProfileApplicationsCommand;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.papyrus.uml.decoratormodel.model.DecoratorModel;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ProfileExternalizationPackage;
import org.eclipse.papyrus.uml.tools.utils.CustomUMLUtil;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;

/**
 * Utility class for stereotype application management in external resources. Descriptions of individual
 * methods indicate whether they do or do not access the decorator model index, to assist in determining
 * appropriate code patterns to ensure liveness of threads etc.
 */
public class DecoratorModelUtils {

	public static final URI PROFILE_URI = URI.createURI("pathmap://PAPYRUS_PROFILEEXT/ProfileExternalization.profile.uml#_Mzzc0EWjEeSNXJj2G3jVCw", true); //$NON-NLS-1$

	public static final IContentType DECORATOR_MODEL_CONTENT_TYPE = Platform.getContentTypeManager().getContentType("org.eclipse.papyrus.uml.decoratormodel.decorator_model"); //$NON-NLS-1$

	private static final ContentHandler DECORATOR_MODEL_CONTENT_HANDLER = new AnyRootNamespaceContentHandler(DECORATOR_MODEL_CONTENT_TYPE.getId(), null, ProfileExternalizationPackage.eNS_URI);

	private static final String STEREOTYPE_PREFIX = "ProfileExternalization::"; //$NON-NLS-1$

	public static final String APPLY_PROFILES_QNAME = STEREOTYPE_PREFIX + "ApplyProfiles"; //$NON-NLS-1$

	private static final Object LOADED_RESOURCES_CACHE_KEY = new Object();

	private static final Object UNLOADED_RESOURCE_DECORATORS_CACHE_KEY = new Object();

	private static final Object UNLOADED_PACKAGE_DECORATORS_CACHE_KEY = new Object();

	private static final Object INTRINSIC_PROFILE_APPLICATIONS_CACHE_KEY = new Object();

	public static void externalizeProfileApplication(ProfileApplication profileApplication, Resource decoratorResource) {
		Resource sourceResource = profileApplication.eResource();
		ResourceSet resourceSet = (sourceResource == null) ? null : sourceResource.getResourceSet();

		// Ensure existence of the root package for external resource packages.
		// The Externalization Profile is applied here so that it is not inherited
		// by the packages in the user model
		Package decoratorModel = getDecoratorModel(decoratorResource);

		// Ensure existence of the externalizing package
		Package externalPackage = getDecoratorPackage(decoratorModel, profileApplication.getApplyingPackage(), true);

		// Move the profile application to the externalizing package
		externalPackage.getProfileApplications().add(profileApplication);

		// Find all of the profile's stereotype applications in the source resource
		List<EObject> stereotypeApplications = new ArrayList<EObject>();
		for (EObject next : sourceResource.getContents()) {
			if (!(next instanceof Element) && isDefinedBy(profileApplication, next)) {
				stereotypeApplications.add(next);
			}
		}

		// Move them
		StereotypeApplicationHelper stereotypeHelper = StereotypeApplicationHelper.getInstance(resourceSet);
		for (EObject next : stereotypeApplications) {
			stereotypeHelper.addToContainmentList(UMLUtil.getBaseElement(next), next);
		}
	}

	public static void internalizeProfileApplications(Iterable<? extends ProfileApplication> profileApplications, IDeleteEmptyDecoratorModelsPolicy deletePolicy) {
		List<Package> emptyDecoratorModels = Lists.newArrayList();

		for (ProfileApplication profileApplication : profileApplications) {
			Resource sourceResource = profileApplication.eResource();
			ResourceSet resourceSet = (sourceResource == null) ? null : sourceResource.getResourceSet();

			Package externalPackage = profileApplication.getApplyingPackage();
			Package applyingPackage = getUserPackage(externalPackage);

			// Find all of the profile's stereotype applications in the source resource
			List<EObject> stereotypeApplications = new ArrayList<EObject>();
			for (EObject next : sourceResource.getContents()) {
				if (!(next instanceof Element) && isDefinedBy(profileApplication, next)) {
					stereotypeApplications.add(next);
				}
			}

			// Move the profile application to the applying package
			applyingPackage.getProfileApplications().add(profileApplication);

			// Delete the external package if it's no longer needed
			Package root = externalPackage.getNestingPackage();
			List<ProfileApplication> remaining = externalPackage.getProfileApplications();
			if (remaining.isEmpty()) {
				externalPackage.destroy();

				// And the root, too
				if ((root != null) && root.getNestedPackages().isEmpty()) {
					emptyDecoratorModels.add(root);
				}
			}

			// Move the stereotype applications
			StereotypeApplicationHelper stereotypeHelper = StereotypeApplicationHelper.getInstance(resourceSet);
			for (EObject next : stereotypeApplications) {
				stereotypeHelper.addToContainmentList(UMLUtil.getBaseElement(next), next);
			}
		}

		if (!emptyDecoratorModels.isEmpty() && shouldDelete(emptyDecoratorModels, deletePolicy)) {
			CustomUMLUtil.destroyAll(emptyDecoratorModels);
		}
	}

	private static boolean shouldDelete(Collection<? extends Package> decoratorModels, IDeleteEmptyDecoratorModelsPolicy deletePolicy) {
		boolean result = (deletePolicy == null);

		if (!result) {
			// Consult the policy
			Set<Resource> decoratorModelResources = Sets.newLinkedHashSet();
			for (Package next : decoratorModels) {
				decoratorModelResources.add(next.eResource());
			}

			result = deletePolicy.shouldDeleteDecoratorModels(decoratorModelResources);
		}

		return result;
	}

	public static Profile getExternalizationProfile(ResourceSet resourceSet) {
		return (Profile) resourceSet.getEObject(PROFILE_URI, true);
	}

	public static Package getDecoratorModel(Resource resource) {
		Package result = null;

		Profile externalizationProfile = getExternalizationProfile(resource.getResourceSet());
		for (Package next : Iterables.filter(resource.getContents(), Package.class)) {
			if (next.isProfileApplied(externalizationProfile)) {
				result = next;
				break;
			}
		}

		return result;
	}

	private static boolean isDefinedBy(ProfileApplication profileApplication, EObject stereotypeApplication) {
		boolean result = false;

		Element baseElement = UMLUtil.getBaseElement(stereotypeApplication);
		if (baseElement != null) {
			Stereotype stereotype = UMLUtil.getStereotype(stereotypeApplication);
			if (stereotype != null) {
				result = profileApplication.getAppliedDefinition(stereotype) == stereotypeApplication.eClass();
			}
		}

		return result;
	}

	private static boolean isApplyProfiles(Dependency dependency) {
		boolean result = false;

		CacheAdapter cache = CacheAdapter.getCacheAdapter(dependency);
		if (cache != null) {
			for (EStructuralFeature.Setting setting : cache.getNonNavigableInverseReferences(dependency)) {
				if (setting.getEStructuralFeature() == ProfileExternalizationPackage.Literals.APPLY_PROFILES__BASE_DEPENDENCY) {
					result = true;
					break;
				}
			}
		}

		return result;
	}

	/**
	 * Queries the packages in currently loaded decorator models that provide profile applications to a given package.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param package_
	 *            a package
	 * @return its currently loaded decorator-model packages
	 */
	public static Iterable<Package> getDecoratorPackages(Package package_) {
		Set<Package> result = null;

		for (ApplyProfiles next : getDecoratorModelDependencies(package_)) {
			if (result == null) {
				result = new LinkedHashSet<Package>();
			}
			result.addAll(next.getExternalizedAppliedProfilePackages());
		}

		return (result == null) ? Collections.<Package> emptySet() : result;
	}

	/**
	 * Queries the currently loaded profile applications of a package that are provided by decorator models.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param package_
	 *            a package
	 * @return its currently loaded decorator-model profile applications
	 */
	public static Iterable<ProfileApplication> getDecoratorModelProfileApplications(Package package_) {
		Set<ProfileApplication> result = null;

		for (ApplyProfiles next : getDecoratorModelDependencies(package_)) {
			if (result == null) {
				result = new LinkedHashSet<ProfileApplication>();
			}
			for (Package externalPackage : next.getExternalizedAppliedProfilePackages()) {
				result.addAll(externalPackage.getProfileApplications());
			}
		}

		return (result == null) ? Collections.<ProfileApplication> emptySet() : result;
	}

	/**
	 * Queries the package in the user model to which an externalized profile application applies a profile.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param profileApplication
	 *            a profile application
	 * @return the user-model package to which it applies a profile
	 */
	public static Package getUserModelApplyingPackage(ProfileApplication profileApplication) {
		Package applying = profileApplication.getApplyingPackage();
		Package result = applying; // Maybe it's not actually an externalized profile application

		if (applying != null) {
			for (Dependency next : Iterables.filter(applying.getTargetDirectedRelationships(UMLPackage.Literals.DEPENDENCY), Dependency.class)) {
				if (isApplyProfiles(next)) {
					Package clientPackage = Iterables.getFirst(Iterables.filter(next.getClients(), Package.class), null);
					if (clientPackage != null) {
						result = clientPackage;
						break;
					}
				}
			}
		}

		return result;
	}

	/**
	 * Queries a mapping of the currently loaded profile applications in a decorator model resource.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param decoratorModel
	 *            a decorator model resource
	 * 
	 * @return a mapping of user-model package to applied profile as specified by the decorator model
	 */
	public static Map<Package, Profile> getDecoratorProfileApplications(Resource decoratorModel) {
		Map<Package, Profile> result = Maps.newHashMap();

		for (ApplyProfiles next : Iterables.filter(decoratorModel.getContents(), ApplyProfiles.class)) {
			Dependency base = next.getBase_Dependency();
			if (base != null) {
				for (Package applying : Iterables.filter(base.getClients(), Package.class)) {
					for (Profile profile : next.getAppliedProfiles()) {
						result.put(applying, profile);
					}
				}
			}
		}

		return result;
	}

	/**
	 * Queries the currently loaded applied profiles of a package from decorator models.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param package_
	 *            a user model package
	 * 
	 * @return its applied profiles from currently loaded decorator models
	 */
	public static Iterable<Profile> getDecoratorModelAppliedProfiles(Package package_) {
		Set<Profile> result = null;

		for (ApplyProfiles next : getDecoratorModelDependencies(package_)) {
			if (result == null) {
				result = new LinkedHashSet<Profile>();
			}
			result.addAll(next.getAppliedProfiles());
		}

		return (result == null) ? Collections.<Profile> emptySet() : result;
	}

	/**
	 * Queries the mapping of URIs of all applied profiles of a package from decorator models, including those inherited
	 * from ancestor packages, to mappings of URIs of decorator models to URIs of Ecore definitions applied by those decorators.
	 * The second-order map is necessary because multiple decorator models can apply different definitions of the same profile
	 * to the same package.
	 * <p>
	 * This method <em>accesses the decorator model index</em> and is therefore not suitable for use in time-sensitive code because an invocation may block the caller for an indeterminate interval. It is equivalent to invoking
	 * {@code getAllDecoratorModelAppliedProfileDefinitions(package_, true, true)}.
	 * 
	 * @param package_
	 *            a user model package
	 * 
	 * @return the mapping of URIs of all profiles that it applies, loaded and unloaded, to applied Ecore definitions by decorator model
	 * 
	 * @throws CoreException
	 *             on failure to access the decorator model index
	 * 
	 * @see #getAllDecoratorModelAppliedProfileDefinitions(Package, boolean, boolean)
	 */
	public static Map<URI, Map<URI, URI>> getAllDecoratorModelAppliedProfileDefinitions(Package package_) throws CoreException {
		return getAllDecoratorModelAppliedProfileDefinitions(package_, true, true);
	}

	/**
	 * Queries the mapping of URIs of all applied profiles of a package from decorator models, including those inherited
	 * from ancestor packages, to mappings of URIs of decorator models to URIs of Ecore definitions applied by those decorators.
	 * The second-order map is necessary because multiple decorator models can apply different definitions of the same profile
	 * to the same package.
	 * <p>
	 * This method <em>accesses the decorator model index</em> if {@code includeUnloaded} is {@code true} and is therefore not suitable for use in time-sensitive code in that case because an invocation may block the caller for an indeterminate interval.
	 * 
	 * @param package_
	 *            a user model package
	 * @param includeLoaded
	 *            whether to include profile definitions from decorator models that are currently loaded
	 * @param includeUnloaded
	 *            whether to include profile definitions from decorator models that are <em>not</em> currently loaded.
	 *            Obviously, it is not useful to exclude both loaded and unloaded decorator models, because that guarantees an empty result
	 * 
	 * @return the mapping of URIs of all profiles that it applies, loaded and unloaded, to applied Ecore definitions by decorator model
	 * 
	 * @throws CoreException
	 *             on failure to access the decorator model index in the {@code includeUnloaded} case
	 */
	public static Map<URI, Map<URI, URI>> getAllDecoratorModelAppliedProfileDefinitions(Package package_, boolean includeLoaded, boolean includeUnloaded) throws CoreException {
		Map<URI, Map<URI, URI>> result = Maps.newLinkedHashMap();

		for (Package each : Iterables.concat(Collections.singleton(package_), package_.allOwningPackages())) {
			if (includeLoaded) {
				Iterable<ProfileApplication> loaded = getDecoratorModelProfileApplications(each);
				if (!Iterables.isEmpty(loaded)) {
					for (ProfileApplication next : loaded) {
						Profile profile = next.getAppliedProfile();
						EPackage definition = next.getAppliedDefinition();
						if ((profile != null) && (definition != null)) {
							URI profileURI = EcoreUtil.getURI(profile);
							URI decoratorURI = next.eResource().getURI();
							URI definitionURI = EcoreUtil.getURI(definition);

							Map<URI, URI> definitions = result.get(profileURI);
							if (definitions == null) {
								definitions = Maps.newHashMap();
								result.put(profileURI, definitions);
							}

							// Only take the first package's loaded definition URI because that is the one
							// that is actually applied; any higher ones are occluded
							if (!definitions.containsKey(decoratorURI)) {
								definitions.put(decoratorURI, definitionURI);
							}
						}
					}
				}
			}

			if (includeUnloaded) {
				Map<URI, Map<URI, URI>> index = DecoratorModelIndex.getInstance().getAllAppliedProfileDefinitions(EcoreUtil.getURI(each));
				if (!index.isEmpty()) {
					// Only add profiles from decorator models that aren't currently loaded
					ResourceSet rset = EMFHelper.getResourceSet(each);
					if (rset != null) {
						for (URI profile : index.keySet()) {
							Map<URI, URI> profileResult = result.get(profile);
							if (profileResult == null) {
								profileResult = Maps.newHashMap();
								result.put(profile, profileResult);
							}
							for (Map.Entry<URI, URI> application : index.get(profile).entrySet()) {
								// Add profile definitions from (profile, decorator) pairs that we do not yet have
								// and that are not loaded
								URI decorator = application.getKey();
								if (!profileResult.containsKey(decorator)) {
									Resource resource = rset.getResource(decorator, false);
									if ((resource == null) || !resource.isLoaded()) {
										profileResult.put(decorator, application.getValue());
									}
								}
							}
						}
					}
				}
			}
		}

		return result;
	}

	static Iterable<ApplyProfiles> getDecoratorModelDependencies(Package package_) {
		List<ApplyProfiles> result = null;

		for (Dependency dependency : package_.getClientDependencies()) {
			for (EStructuralFeature.Setting setting : CacheAdapter.getCacheAdapter(dependency).getNonNavigableInverseReferences(dependency)) {
				if (setting.getEStructuralFeature() == ProfileExternalizationPackage.Literals.APPLY_PROFILES__BASE_DEPENDENCY) {
					if (result == null) {
						result = new ArrayList<ApplyProfiles>();
					}

					result.add((ApplyProfiles) setting.getEObject());
				}
			}
		}

		return (result == null) ? Collections.<ApplyProfiles> emptyList() : result;
	}

	public static Package getDecoratorPackage(Package externalizationModel, Package userPackage, boolean createIfNecessary) {
		Package result = null;
		for (Package next : externalizationModel.getNestedPackages()) {
			if (getUserPackage(next) == userPackage) {
				result = next;
				break;
			}
		}
		if (result == null) {
			result = externalizationModel.createNestedPackage(UML2Util.getValidJavaIdentifier(userPackage.getQualifiedName()));
			Dependency dependency = UMLFactory.eINSTANCE.createDependency();
			dependency.getClients().add(userPackage);
			dependency.getSuppliers().add(result);
			result.getPackagedElements().add(dependency);

			// This stereotype name is unambiguous at this point because the only available profile
			// is the externalization profile inherited from the root package
			dependency.applyStereotype(dependency.getApplicableStereotype(APPLY_PROFILES_QNAME));
		}

		return result;
	}

	static Package getUserPackage(Package externalPackage) {
		Package result = null;

		for (DirectedRelationship next : externalPackage.getTargetDirectedRelationships(UMLPackage.Literals.DEPENDENCY)) {
			for (EStructuralFeature.Setting setting : CacheAdapter.getCacheAdapter(next).getNonNavigableInverseReferences(next)) {
				if (setting.getEStructuralFeature() == ProfileExternalizationPackage.Literals.APPLY_PROFILES__BASE_DEPENDENCY) {
					result = Iterables.getFirst(Iterables.filter(next.getSources(), Package.class), null);
					if (result != null) {
						break;
					}
				}
			}
		}

		return result;
	}

	/**
	 * Queries whether a package has the externalization profile applied that is used by decorator models.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param package_
	 *            a package
	 * @return whether it has the externalization profile applied
	 */
	public static boolean hasExternalizationProfile(Package package_) {
		boolean result = false;

		for (Profile next : package_.getAppliedProfiles()) {
			if (PROFILE_URI.equals(EcoreUtil.getURI(next))) {
				result = true;
				break;
			}
		}

		return result;
	}

	public static Command createSeparateProfileApplicationsCommand(Iterable<? extends ProfileApplication> profileApplications, URI resourceURI, String modelName) {
		Command result;

		ProfileApplication any = Iterables.getFirst(profileApplications, null);

		if (any == null) {
			result = UnexecutableCommand.INSTANCE;
		} else {
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(any);
			if (domain == null) {
				result = UnexecutableCommand.INSTANCE;
			} else {
				// First, ensure the existence of the decorator model resource
				result = new CreateDecoratorModelCommand(domain, resourceURI, modelName);
				CompoundCommand compound = new CompoundCommand(1, result.getLabel(), result.getDescription());
				compound.append(result);
				result = compound;

				// Then put the profile applications in it
				compound.append(new SeparateProfileApplicationsCommand(domain, profileApplications, resourceURI));

				// And, finally, ensure that the model-set will save the decorator model when the editor is next saved
				if (domain.getResourceSet() instanceof ModelSet) {
					compound.append(new SaveDecoratorModelCommand((ModelSet) domain.getResourceSet(), resourceURI));
				}
			}
		}

		return result;
	}

	/**
	 * Creates a command that reintegrates the specified profile applications into the user model proper. Empty decorator models will always be deleted.
	 * 
	 * @param profileApplications
	 *            the externalized profile applications to reintegrate
	 * 
	 * @return the delete command, or an unexecutable command if the request is invalid for some reason
	 * 
	 * @see #createReclaimProfileApplicationsCommand(Iterable, IDeleteEmptyDecoratorModelsPolicy)
	 */
	public static Command createReclaimProfileApplicationsCommand(Iterable<? extends ProfileApplication> profileApplications) {
		return createReclaimProfileApplicationsCommand(profileApplications, null);
	}

	/**
	 * Creates a command that reintegrates the specified profile applications into the user model proper.
	 * 
	 * @param profileApplications
	 *            the externalized profile applications to reintegrate
	 * @param deletePolicy
	 *            an optional policy determining whether any decorator models that are left without profile applications should be deleted. May be {@code null}, in which case empty decorator models will be deleted
	 * 
	 * @return the delete command, or an unexecutable command if the request is invalid for some reason
	 */
	public static Command createReclaimProfileApplicationsCommand(Iterable<? extends ProfileApplication> profileApplications, IDeleteEmptyDecoratorModelsPolicy deletePolicy) {
		Command result;

		ProfileApplication any = Iterables.getFirst(profileApplications, null);

		if (any == null) {
			result = UnexecutableCommand.INSTANCE;
		} else {
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(any);
			if (domain == null) {
				result = UnexecutableCommand.INSTANCE;
			} else {
				result = new ReclaimProfileApplicationsCommand(domain, profileApplications, deletePolicy);
				CompoundCommand compound = new CompoundCommand(0, result.getLabel(), result.getDescription());
				compound.append(result);
				result = compound;

				// Managing the resources to delete on save only applies to model-sets
				if (domain.getResourceSet() instanceof ModelSet) {
					ModelSet modelSet = (ModelSet) domain.getResourceSet();
					Set<URI> resourcesToDelete = Sets.newHashSet();
					for (ProfileApplication next : profileApplications) {
						Resource toDelete = next.eResource();
						if (resourcesToDelete.add(toDelete.getURI())) {
							compound.append(new DeleteDecoratorModelCommand(modelSet, toDelete));
						}
					}
				}
			}
		}

		return result;
	}

	/**
	 * Queries whether a resource is a loaded decorator model resource.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param resource
	 *            a resource
	 * 
	 * @return whether it is a loaded decorator model resource
	 */
	public static boolean isDecoratorModel(Resource resource) {
		boolean result = false;

		ResourceSet rset = resource.getResourceSet();
		if (rset != null) {
			// There must be at least one <<applyProfiles>> dependency in a profile applications resource
			result = EcoreUtil.getObjectByType(resource.getContents(), ProfileExternalizationPackage.Literals.APPLY_PROFILES) != null;
		}

		return result;
	}

	/**
	 * Queries whether a resource is a loaded decorator model for the given user model resource.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param resource
	 *            a resource
	 * @param modelResource
	 *            a user model resource
	 * 
	 * @return whether the {@code resource} is a loaded decorator model for the user model resource
	 */
	public static boolean isDecoratorModelFor(Resource resource, Resource modelResource) {
		boolean result = false;

		ResourceSet rset = resource.getResourceSet();
		if (rset != null) {
			for (ApplyProfiles next : Iterables.filter(EcoreUtil.getObjectsByType(resource.getContents(), ProfileExternalizationPackage.Literals.APPLY_PROFILES), ApplyProfiles.class)) {
				Dependency baseDependency = next.getBase_Dependency();
				if (baseDependency != null) {
					for (Iterator<NamedElement> iter = ((InternalEList<NamedElement>) baseDependency.getClients()).basicIterator(); !result && iter.hasNext();) {
						NamedElement client = iter.next();
						if (client.eIsProxy()) {
							URI uri = EcoreUtil.getURI(client).trimFragment();
							result = uri.equals(modelResource.getURI());
						} else {
							result = client.eResource() == modelResource;
						}
					}
				}
			}
		}

		return result;
	}

	/**
	 * Queries the URIs of user model resources that contain packages for which a decorator model provides applied profiles.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param decoratorModelResource
	 *            a resource in a decorator model
	 * 
	 * @return the URIs of resources in user models containing packages to which the decorator model applies profiles
	 */
	public static Set<URI> getUserModelResources(Resource decoratorModelResource) {
		Set<URI> result = Sets.newHashSet();

		for (ApplyProfiles next : Iterables.filter(EcoreUtil.getObjectsByType(decoratorModelResource.getContents(), ProfileExternalizationPackage.Literals.APPLY_PROFILES), ApplyProfiles.class)) {
			Dependency baseDependency = next.getBase_Dependency();
			if (baseDependency != null) {
				for (Iterator<NamedElement> iter = ((InternalEList<NamedElement>) baseDependency.getClients()).basicIterator(); iter.hasNext();) {
					NamedElement client = iter.next();
					if (client.eIsProxy()) {
						result.add(EcoreUtil.getURI(client).trimFragment());
					} else {
						result.add(client.eResource().getURI());
					}
				}
			}
		}

		return result;
	}

	/**
	 * Whether the resource indicated by the given URI is a decorator model resource.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param uri
	 *            the URI of some resource, which may or may not exist
	 * 
	 * @return whether the resource at the URI exists and is a decorator model
	 */
	public static boolean isDecoratorModel(URI uri) {
		boolean result = false;

		if (uri.isPlatformResource()) {
			// Let the workspace's content-type manager handle it (which can cache the information)
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true)));

			try {
				IContentDescription desc = file.exists() ? file.getContentDescription() : null;
				result = (desc != null) && (desc.getContentType() != null) && desc.getContentType().isKindOf(DECORATOR_MODEL_CONTENT_TYPE);
			} catch (CoreException e) {
				// Couldn't determine content description? Then it cannot be our type
				Activator.getDefault().getLog().log(e.getStatus());
			}
		} else {
			// Work it out the hard way
			InputStream input = null;

			try {
				input = URIConverter.INSTANCE.createInputStream(uri);
				if (!input.markSupported()) {
					input = new BufferedInputStream(input);
				}
				input.mark(Integer.MAX_VALUE);

				Map<String, ?> desc = DECORATOR_MODEL_CONTENT_HANDLER.contentDescription(uri, input, Maps.newHashMap(), Maps.newHashMap());
				result = desc.get(ContentHandler.VALIDITY_PROPERTY) == ContentHandler.Validity.VALID;
			} catch (Exception e) {
				// Couldn't read the contents? Then it's not what we're looking for
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (Exception e) {
						Activator.log.error(e);
					}
				}
			}
		}

		return result;
	}

	/**
	 * Queries the URIs of decorator model resources currently loaded in a user model resource's resource-set that contain
	 * profile applications for packages in that user model resource.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param modelResource
	 *            a resource in an user model
	 * 
	 * @return the URIs of resources currently loaded in the same resource set that provide profile applications to packages
	 *         in the user model resource
	 */
	public static Set<URI> getLoadedDecoratorModels(Resource modelResource) {
		Element root = (Element) EcoreUtil.getObjectByType(modelResource.getContents(), UMLPackage.Literals.ELEMENT);
		if (root == null) {
			return Collections.emptySet();
		}

		CacheAdapter cache = CacheAdapter.getCacheAdapter(root);

		@SuppressWarnings("unchecked")
		Set<URI> result = (Set<URI>) cache.get(root, LOADED_RESOURCES_CACHE_KEY);
		if (result == null) {
			result = Sets.newHashSet();
			collectLoadedDecoratorModels(modelResource, result);
			cache.put(root, LOADED_RESOURCES_CACHE_KEY, result);
		}

		return result;
	}

	private static void collectLoadedDecoratorModels(Resource modelResource, Set<URI> result) {
		// We don't do externalization of profile applications in the resources that externalize profile applications
		if (!isDecoratorModel(modelResource)) {
			ResourceSet resourceSet = modelResource.getResourceSet();
			URI modelURI = modelResource.getURI();
			for (Resource next : resourceSet.getResources()) {
				URI uri = next.getURI();
				if (next.isLoaded() && !uri.equals(modelURI) && isDecoratorModelFor(next, modelResource)) {
					result.add(uri);
				}
			}
		}
	}

	/**
	 * Queries the URIs of decorator models in the workspace that are not yet loaded that provide profile applications for
	 * packages in the given user model resource. This set excludes and decorator models that have profile applications that
	 * would conflict with natively-applied profiles of packages in the user model resource, as it would not be permitted
	 * to load any of these.
	 * <p>
	 * This method <em>accesses the decorator model index</em> and is therefore not suitable for use in time-sensitive code because an invocation may block the caller for an indeterminate interval. In cases where responsiveness is essential, use the
	 * {@link #getUnloadedDecoratorModelsAsync(Resource)} API, instead.
	 * 
	 * @param modelResource
	 *            a user model resource
	 * @return the URIs of its currently available unloaded decorator models
	 * 
	 * @see #getUnloadedDecoratorModelsAsync(Resource)
	 */
	public static Set<URI> getUnloadedDecoratorModels(Resource modelResource) {
		Element root = (Element) EcoreUtil.getObjectByType(modelResource.getContents(), UMLPackage.Literals.ELEMENT);
		if (root == null) {
			return Collections.emptySet();
		}

		CacheAdapter cache = CacheAdapter.getCacheAdapter(root);

		@SuppressWarnings("unchecked")
		Set<URI> result = (Set<URI>) cache.get(root, UNLOADED_RESOURCE_DECORATORS_CACHE_KEY);
		if (result == null) {
			result = Sets.newHashSet();
			try {
				collectUnloadedDecoratorModels(DecoratorModelIndex.getInstance().getDecoratorModels(), modelResource, result);
			} catch (CoreException e) {
				Activator.log.error("Error in determining unloaded decorator models.", e); //$NON-NLS-1$
			}
			cache.put(root, UNLOADED_RESOURCE_DECORATORS_CACHE_KEY, result);
		}

		return result;
	}

	/**
	 * Asynchronously queries the URIs of decorator models in the workspace that are not yet loaded that provide profile applications for
	 * packages in the given user model resource. This set excludes and decorator models that have profile applications that
	 * would conflict with natively-applied profiles of packages in the user model resource, as it would not be permitted
	 * to load any of these.
	 * 
	 * @param modelResource
	 *            a user model resource
	 * @return the future result of the URIs of its currently available unloaded decorator models
	 * 
	 * @see #getUnloadedDecoratorModelsAsync(Iterable)
	 * @see #getUnloadedDecoratorModelsAsync(Package)
	 * @see #getUnloadedDecoratorModels(Resource)
	 */
	public static ListenableFuture<Set<URI>> getUnloadedDecoratorModelsAsync(final Resource modelResource) {
		return getUnloadedDecoratorModelsAsync(Collections.singleton(modelResource));
	}

	/**
	 * Asynchronously queries the URIs of decorator models in the workspace that are not yet loaded that provide profile applications for
	 * packages in the given user model resources. This set excludes and decorator models that have profile applications that
	 * would conflict with natively-applied profiles of packages in the user model resources, as it would not be permitted
	 * to load any of these.
	 * 
	 * @param modelResources
	 *            zero or more user model resources
	 * @return the future result of the URIs of their currently available unloaded decorator models
	 * 
	 * @see #getUnloadedDecoratorModelsAsync(Resource)
	 * @see #getUnloadedDecoratorModelsAsync(Package)
	 */
	public static ListenableFuture<Set<URI>> getUnloadedDecoratorModelsAsync(final Iterable<Resource> modelResources) {
		if (Iterables.isEmpty(modelResources)) {
			return Futures.immediateFuture(Collections.<URI> emptySet());
		}

		ListenableFuture<SetMultimap<URI, URI>> decoratorMap = DecoratorModelIndex.getInstance().getDecoratorModelsAsync();
		Function<SetMultimap<URI, URI>, Set<URI>> transform = new Function<SetMultimap<URI, URI>, Set<URI>>() {
			@Override
			public Set<URI> apply(SetMultimap<URI, URI> input) {
				Set<URI> result = Sets.newHashSet();

				for (Resource modelResource : modelResources) {
					Element root = Iterables.isEmpty(modelResources) ? null : (Element) EcoreUtil.getObjectByType(modelResource.getContents(), UMLPackage.Literals.ELEMENT);
					if (root != null) {
						CacheAdapter cache = CacheAdapter.getCacheAdapter(root);

						@SuppressWarnings("unchecked")
						Set<URI> local = (Set<URI>) cache.get(root, UNLOADED_RESOURCE_DECORATORS_CACHE_KEY);
						if (local == null) {
							local = Sets.newHashSet();
							collectUnloadedDecoratorModels(input, modelResource, local);
							cache.put(root, UNLOADED_RESOURCE_DECORATORS_CACHE_KEY, local);
						}
						result.addAll(local);
					}
				}

				return result;
			}
		};

		return Futures.transform(decoratorMap, transform);
	}

	/**
	 * Asynchronously queries the URIs of decorator models in the workspace that are not yet loaded that provide profile applications for
	 * the given user model package. This set excludes and decorator models that have profile applications that
	 * would conflict with natively-applied profiles of that package, as it would not be permitted
	 * to load any of these.
	 * 
	 * @param package_
	 *            a package in a user model
	 * @return the future result of the URIs of its currently available unloaded decorator models
	 * 
	 * @see #getUnloadedDecoratorModelsAsync(Resource)
	 * @see #getUnloadedDecoratorModelsAsync(Iterable)
	 */
	public static ListenableFuture<Set<URI>> getUnloadedDecoratorModelsAsync(final Package package_) {
		if (package_.eResource() == null) {
			return Futures.immediateFuture(Collections.<URI> emptySet());
		}

		CacheAdapter cache = CacheAdapter.getCacheAdapter(package_);
		@SuppressWarnings("unchecked")
		Set<URI> cached = (Set<URI>) cache.get(package_, UNLOADED_PACKAGE_DECORATORS_CACHE_KEY);
		if (cached != null) {
			return Futures.immediateFuture(cached);
		}

		ListenableFuture<Set<URI>> decoratorMap = DecoratorModelIndex.getInstance().getDecoratorModelsForPackageAsync(EcoreUtil.getURI(package_));
		Function<Set<URI>, Set<URI>> transform = new Function<Set<URI>, Set<URI>>() {
			@Override
			public Set<URI> apply(Set<URI> input) {
				Set<URI> result = Sets.newHashSet();

				Resource resource = package_.eResource();
				if (resource != null) {
					try {
						collectUnloadedDecoratorModels(DecoratorModelIndex.getInstance().getDecoratorModels(), resource, result);
					} catch (CoreException e) {
						throw new UncheckedExecutionException(e);
					}
				}

				// filter for only those unloaded resources that apply profiles to this package
				result.retainAll(input);

				CacheAdapter cache = CacheAdapter.getCacheAdapter(package_);
				cache.put(package_, UNLOADED_PACKAGE_DECORATORS_CACHE_KEY, result);

				return result;
			}
		};

		return Futures.transform(decoratorMap, transform);
	}

	/**
	 * Asynchronously queries whether the resource containing the given package (or, optionally, any of its currently loaded
	 * sub-units) has applicable decorator models that are not yet loaded.
	 * 
	 * @param package_
	 *            a package in a user model
	 * @param recursive
	 *            whether to check loaded sub-units recursively
	 * @return the future result of whether the package has available unloaded decorator models
	 * 
	 * @see #getUnloadedDecoratorModelsAsync(Resource)
	 */
	public static ListenableFuture<Boolean> hasUnloadedDecoratorModelsAsync(Package package_, boolean recursive) {
		Resource modelResource = package_.eResource();
		if ((modelResource == null) || isDecoratorModel(modelResource)) {
			return Futures.immediateFuture(Boolean.FALSE);
		}

		Iterable<Resource> resources = Collections.singleton(modelResource);
		if (recursive) {
			resources = Iterables.concat(resources, getLoadedSubUnitPackageResources(package_));
		}

		return Futures.transform(getUnloadedDecoratorModelsAsync(resources), new Function<Collection<?>, Boolean>() {
			@Override
			public Boolean apply(Collection<?> input) {
				return (input != null) && !input.isEmpty();
			}
		});
	}

	private static void collectUnloadedDecoratorModels(SetMultimap<URI, URI> userModelsToDecoratorModels, Resource modelResource, Set<URI> result) {
		URI uri = modelResource.getURI();
		ResourceSet resourceSet = modelResource.getResourceSet();

		// We don't do externalization of profile applications in the resources that externalize profile applications
		if (uri.isPlatformResource() && !isDecoratorModel(modelResource)) {
			// Managing the resources to delete on save only applies to model-sets
			Set<URI> pendingDeletion = (resourceSet instanceof ModelSet) ? ((ModelSet) resourceSet).getResourcesToDeleteOnSave() : Collections.<URI> emptySet();

			try {
				for (URI indexed : Sets.difference(userModelsToDecoratorModels.get(uri), pendingDeletion)) {
					Resource indexedResource = resourceSet.getResource(indexed, false);
					if ((indexedResource == null) || !indexedResource.isLoaded()) {
						// Don't include resources that have profile applications conflicting with profile applications
						// owned by the current model
						if (!hasConflictingProfileApplication(indexed, modelResource)) {
							result.add(indexed);
						}
					}
				}
			} catch (CoreException e) {
				Activator.log.error("Error in determining unloaded decorator models.", e); //$NON-NLS-1$
			}
		}
	}

	private static Collection<ProfileApplication> getIntrinsicProfileApplications(Resource modelResource) {
		Element root = (Element) EcoreUtil.getObjectByType(modelResource.getContents(), UMLPackage.Literals.ELEMENT);
		if (root == null) {
			return Collections.emptyList();
		}

		CacheAdapter cache = CacheAdapter.getCacheAdapter(root);

		@SuppressWarnings("unchecked")
		Collection<ProfileApplication> result = (Collection<ProfileApplication>) cache.get(root, INTRINSIC_PROFILE_APPLICATIONS_CACHE_KEY);
		if (result == null) {
			result = Lists.newArrayList();
			for (TreeIterator<EObject> iter = EcoreUtil.getAllProperContents(root, false); iter.hasNext();) {
				EObject next = iter.next();
				if (next instanceof ProfileApplication) {
					result.add((ProfileApplication) next);

					// No profile applications inside a profile application
					iter.prune();
				} else if (!((next instanceof Package) || (next instanceof Component))) {
					// Packages are only in packages or components, and that's where profile applications may be found
					iter.prune();
				}
			}
			cache.put(root, INTRINSIC_PROFILE_APPLICATIONS_CACHE_KEY, result);
		}

		return result;
	}

	private static boolean hasConflictingProfileApplication(URI profileApplicationResourceURI, Resource modelResource) throws CoreException {
		boolean result = false;

		SetMultimap<URI, URI> indexed = DecoratorModelIndex.getInstance().getAppliedProfilesByPackage(profileApplicationResourceURI);

		for (ProfileApplication profileApplication : getIntrinsicProfileApplications(modelResource)) {
			if (indexed.containsEntry(EcoreUtil.getURI(profileApplication.getApplyingPackage()), EcoreUtil.getURI(profileApplication.getAppliedProfile()))) {
				result = true;
				break;
			}
		}

		return result;
	}

	/**
	 * Obtains the currently loaded packages nested to any depth within the given package that are roots of sub-unit resources.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param package_
	 *            a package in an user model
	 * 
	 * @return nested packages that are roots of loaded sub-unit resources
	 */
	public static Iterable<Package> getLoadedSubUnitPackages(Package package_) {
		List<Package> result = Lists.newArrayListWithExpectedSize(0);

		final Resource topResource = package_.eResource();
		for (TreeIterator<EObject> iter = EcoreUtil.getAllContents(package_, false); iter.hasNext();) {
			EObject next = iter.next();
			if (next instanceof Package) {
				if (!next.eIsProxy() && (next.eResource() != topResource)) {
					// It's in a loaded sub-unit
					result.add((Package) next);
				}
			} else if (!(next instanceof Component)) {
				// No sense in looking into anything that can't contain packages
				iter.prune();
			}
		}

		return result;
	}

	static Iterable<Resource> getLoadedSubUnitPackageResources(Package package_) {
		return Iterables.transform(getLoadedSubUnitPackages(package_), getResourceFunction());
	}

	static Function<EObject, Resource> getResourceFunction() {
		return new Function<EObject, Resource>() {
			@Override
			public Resource apply(EObject input) {
				return input.eResource();
			}
		};
	}

	/**
	 * Loads the specified decorator models in a given resource set context.
	 * <p>
	 * This method does <em>not</em> access the decorator model index.
	 * 
	 * @param resourceSet
	 *            the context in which to load the decorator models
	 * @param resourceURIs
	 *            URIs of the decorator models to load
	 * 
	 * @return whether the decorator models were successfully loaded
	 */
	public static boolean loadDecoratorModels(final ResourceSet resourceSet, final Iterable<? extends URI> resourceURIs) {
		boolean result = false;

		Runnable operation = new Runnable() {
			@Override
			public void run() {
				if (resourceSet instanceof ModelSet) {
					DecoratorModel model = DecoratorModel.getInstance((ModelSet) resourceSet);
					for (URI next : resourceURIs) {
						model.loadDecoratorModel(next);
					}
				} else {
					for (URI next : resourceURIs) {
						resourceSet.getResource(next, true);
					}
				}
			}
		};

		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(resourceSet);
		if (domain != null) {
			try {
				domain.runExclusive(operation);
				result = true;
			} catch (InterruptedException e) {
				Activator.log.error(e);
			}
		} else {
			operation.run();
		}

		return result;
	}

	/**
	 * Configures a resource set to support profile applications externalized in decorator models.
	 * 
	 * @param resourceSet
	 *            the resource set to configure
	 */
	public static void configure(ResourceSet resourceSet) {
		if (resourceSet == null) {
			throw new IllegalArgumentException("null resourceSet"); //$NON-NLS-1$
		}

		UMLUtil.ProfileApplicationHelper.setInstance(resourceSet, new PapyrusProfileApplicationHelper());
		UMLUtil.StereotypeApplicationHelper.setInstance(resourceSet, new PapyrusStereotypeApplicationHelper());
	}
}
