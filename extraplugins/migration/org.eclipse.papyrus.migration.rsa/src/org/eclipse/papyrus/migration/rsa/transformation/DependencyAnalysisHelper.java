/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping;
import org.eclipse.papyrus.uml.extensionpoints.library.IRegisteredLibrary;
import org.eclipse.papyrus.uml.extensionpoints.library.RegisteredLibrary;
import org.eclipse.papyrus.uml.extensionpoints.profile.IRegisteredProfile;
import org.eclipse.papyrus.uml.extensionpoints.profile.RegisteredProfile;
import org.eclipse.uml2.uml.Element;

import com.google.common.collect.Sets;

public class DependencyAnalysisHelper {

	protected final Config config;

	protected final static Set<String> rsaExtensions = Sets.newHashSet("emx", "efx"); //$NON-NLS-1$ //$NON-NLS-2$

	protected final static String rsaProfileExtension = "epx"; //$NON-NLS-1$

	// ResourceSet used to load and explore Static Libraries
	protected final ResourceSet localResourceSet = new ResourceSetImpl();

	// Store the broken URIs without trying to resolve them. We don't have enough information to resolve them during the first phase of the model import
	// The Key is the resource URI, the value is the Set of each individual EObject Fragment (We need the EObject fragments to find potential matches)
	protected final Map<URI, Set<String>> brokenUris = new HashMap<URI, Set<String>>();

	protected final Set<URI> brokenProfiles = new HashSet<URI>();

	public DependencyAnalysisHelper(Config config) {
		this.config = config;

		configureResourceSet();
	}

	protected void configureResourceSet() {
		localResourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, true);
		localResourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
		localResourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		localResourceSet.getLoadOptions().put(XMLResource.OPTION_USE_PACKAGE_NS_URI_AS_LOCATION, Boolean.FALSE);
	}

	protected void unloadResourceSet() {
		EMFHelper.unload(localResourceSet);
	}

	public void computeURIMappings(Collection<Resource> sourceModels) {
		for (Resource sourceModel : sourceModels) {
			doComputeURIMappings(sourceModel);
		}
	}

	public synchronized void resolveAllMappings(Map<URI, URI> urisToReplace, Map<URI, URI> profileUrisToReplace) {
		if (config.getMappingParameters() == null) {
			config.setMappingParameters(RSAToPapyrusParametersFactory.eINSTANCE.createMappingParameters());
		}

		try {
			for (Entry<URI, Set<String>> resourceToRepair : brokenUris.entrySet()) {

				// Already known mapping
				if (urisToReplace.containsKey(resourceToRepair.getKey())) {
					continue;
				}
				findMatch(resourceToRepair.getKey(), resourceToRepair.getValue());
			}

			for (URI profileDefinition : brokenProfiles) {

				// Already known mapping
				if (profileUrisToReplace.containsKey(profileDefinition.trimFragment().trimQuery())) {
					continue;
				}
				findMatch(profileDefinition);
			}
		} finally {
			unloadResourceSet();
			brokenUris.clear();
			brokenProfiles.clear();
		}
	}

	protected void findMatch(URI resourceURI, Set<String> fragments) {
		URIMapping mapping = null;

		for (String fragment : fragments) {
			URI eObjectURI = resourceURI.appendFragment(fragment);
			mapping = findExistingMapping(eObjectURI, localResourceSet);

			if (mapping != null) {
				break;
			}
		}

		if (mapping == null) {
			mapping = RSAToPapyrusParametersFactory.eINSTANCE.createURIMapping();
			mapping.setSourceURI(resourceURI.toString());
			mapping.setTargetURI(mapping.getSourceURI());
		}

		config.getMappingParameters().getUriMappings().add(mapping);
	}

	protected void findMatch(URI profileDefinitionURI) {
		URIMapping match = findExistingProfileMapping(profileDefinitionURI, localResourceSet);

		if (match == null) {
			match = RSAToPapyrusParametersFactory.eINSTANCE.createURIMapping();
			match.setSourceURI(profileDefinitionURI.trimFragment().trimQuery().toString());
			match.setTargetURI(match.getSourceURI());
		}

		config.getMappingParameters().getProfileUriMappings().add(match);
	}

	protected void doComputeURIMappings(Resource sourceModel) {
		doComputeProfileURIMappings(sourceModel);

		TreeIterator<EObject> resourceContents = sourceModel.getAllContents();
		ResourceSet resourceSet = sourceModel.getResourceSet();

		while (resourceContents.hasNext()) {
			EObject next = resourceContents.next();
			for (EReference reference : next.eClass().getEAllReferences()) {
				if (reference.isContainer() || reference.isContainment() || reference.isDerived() || reference.isTransient()) {
					continue;
				}

				Object value = next.eGet(reference, false);
				if (value instanceof EObject) {
					handleURIMapping((EObject) value, resourceSet);
				} else if (value instanceof Collection<?>) {
					for (Object element : (Collection<?>) value) {
						if (element instanceof EObject) {
							handleURIMapping((EObject) element, resourceSet);
						}
					}
				}
			}
		}
	}

	protected void doComputeProfileURIMappings(Resource sourceModel) {
		ResourceSet resourceSet = sourceModel.getResourceSet();

		for (EObject rootObject : sourceModel.getContents()) {
			if (isInvalidStereotypeApplication(rootObject)) {
				handleProfileURIMapping(rootObject, resourceSet);
			}
		}
	}

	protected boolean isInvalidStereotypeApplication(EObject eObject) {
		if (eObject instanceof Element) {
			return false;
		}

		// The package is not resolved: probably a missing profile
		if (eObject instanceof AnyType) {
			return true;
		}

		// If the package is resolved but is contained in an EPX resource, it needs to be mapped to the Papyrus equivalent
		EPackage ePackage = eObject.eClass().getEPackage();
		if ("epx".equals(ePackage.eResource().getURI().fileExtension())) {
			return true;
		}

		return false;
	}

	protected boolean isRSAModelElement(EObject eObject) {
		return isRSAModelElement(EcoreUtil.getURI(eObject));
	}

	protected boolean isRSAModelElement(URI objectURI) {
		String fileExtension = objectURI.fileExtension();
		return rsaExtensions.contains(fileExtension) || rsaProfileExtension.equals(fileExtension);
	}

	protected synchronized Set<String> getFragments(URI resourceURI) {
		if (!brokenUris.containsKey(resourceURI)) {
			brokenUris.put(resourceURI, new HashSet<String>());
		}

		return brokenUris.get(resourceURI);
	}

	protected synchronized void handleBrokenReference(EObject proxy) {
		URI proxyURI = EcoreUtil.getURI(proxy);
		URI resourceURI = proxyURI.trimFragment().trimQuery();

		String fragment = proxyURI.fragment();
		Set<String> fragments = getFragments(resourceURI);
		fragments.add(fragment);
	}

	protected synchronized void addBrokenProfileDefinition(URI packageURI) {
		brokenProfiles.add(packageURI);
	}


	protected void handleProfileURIMapping(EObject stereotypeApplication, ResourceSet resourceSet) {

		EPackage profileDefinition = stereotypeApplication.eClass().getEPackage();
		URI packageURI = EcoreUtil.getURI(profileDefinition);
		if (packageURI.trimFragment().isEmpty()) {
			packageURI = URI.createURI(profileDefinition.getNsURI());
		}
		addBrokenProfileDefinition(packageURI);

	}

	protected void handleURIMapping(EObject eObject, ResourceSet resourceSet) {

		if (isRSAModelElement(eObject)) {
			handleBrokenReference(eObject);
			return;
		}

		if (eObject.eIsProxy()) {
			eObject = EcoreUtil.resolve(eObject, resourceSet);
			if (eObject.eIsProxy()) {
				handleBrokenReference(eObject);
				return;
			}
		}

	}

	protected URIMapping findExistingProfileMapping(URI profileDefinitionURI, ResourceSet resourceSet) {

		String fileExtension = profileDefinitionURI.fileExtension();

		URIMapping mapping = RSAToPapyrusParametersFactory.eINSTANCE.createURIMapping();
		URI sourceURI = profileDefinitionURI.trimFragment().trimQuery();
		mapping.setSourceURI(sourceURI.toString());

		URI targetURI = null;

		if ("epx".equals(fileExtension)) {
			targetURI = sourceURI.trimFileExtension().appendFileExtension("profile").appendFileExtension("uml");
			try {
				Resource resource = resourceSet.getResource(targetURI, true);
				if (resource != null && !resource.getContents().isEmpty()) {
					mapping.setTargetURI(targetURI.toString());
					return mapping;
				}
			} catch (Exception ex) {
				// Ignore: we can't find the target resource
			}
		}

		return findExistingMapping(profileDefinitionURI, resourceSet);
	}

	protected URIMapping findExistingMapping(URI proxyURI, ResourceSet resourceSet) {
		String fileExtension = proxyURI.fileExtension();

		URIMapping mapping = RSAToPapyrusParametersFactory.eINSTANCE.createURIMapping();
		mapping.setSourceURI(proxyURI.trimFragment().trimQuery().toString());

		URI targetURI = null;
		// Maybe the element has been migrated locally
		if (rsaExtensions.contains(fileExtension)) {
			targetURI = proxyURI.trimFileExtension().appendFileExtension("uml");
		} else if (rsaProfileExtension.equals(fileExtension)) {
			targetURI = proxyURI.trimFileExtension().appendFileExtension("profile.uml");
		}

		if (targetURI != null) {
			try {
				EObject targetElement = resourceSet.getEObject(targetURI, true);
				if (targetElement != null) {

					targetURI = EcoreUtil.getURI(targetElement);

					mapping.setTargetURI(targetURI.trimFragment().trimQuery().toString());

					return mapping;
				}
			} catch (Exception ex) {
				// Ignore: we can't find a target element for the given proxy
			}
		}


		if (!isRSAModelElement(proxyURI)) {
			// Maybe the resource exists, but doesn't contain this specific element
			URI resourceURI = proxyURI.trimFragment().trimQuery();
			try {
				Resource resource = resourceSet.getResource(resourceURI, true);
				if (resource != null && !resource.getContents().isEmpty()) {

					mapping.setTargetURI(resourceURI.toString());

					return mapping;
				}
			} catch (Exception ex) {
				// Ignore: we can't find the target resource
			}
		}

		// If the URI fragment is a path, don't explore registered libraries/profiles: almost all libraries will
		// have a matching element, although there is no specific correspondence
		if (isPathFragment(proxyURI)) {
			return null;
		}

		// Otherwise, we have an ID fragment

		// Maybe the resource has already been migrated, then deployed as a static library. Browse all registered libraries and try to find a matching XMI ID
		for (IRegisteredLibrary library : RegisteredLibrary.getRegisteredLibraries()) {
			URI libraryURI = library.getUri();
			try {
				Resource libraryResource = localResourceSet.getResource(libraryURI, true);
				if (libraryResource != null) {
					EObject resolvedElement = libraryResource.getEObject(proxyURI.fragment());
					if (resolvedElement != null && !resolvedElement.eIsProxy()) {
						mapping.setTargetURI(libraryURI.toString());

						return mapping;
					}
				}
			} catch (Exception ex) {
				// Ignore
			}
		}

		// Maybe the object is a Profile, so let's browse registered profiles as well
		for (IRegisteredProfile profile : RegisteredProfile.getRegisteredProfiles()) {
			URI profileURI = profile.getUri();
			try {
				Resource profileResource = localResourceSet.getResource(profileURI, true);
				if (profileResource != null) {
					EObject resolvedElement = profileResource.getEObject(proxyURI.fragment());
					if (resolvedElement != null && !resolvedElement.eIsProxy()) {
						mapping.setTargetURI(profileURI.toString());

						return mapping;
					}
				}
			} catch (Exception ex) {
				// Ignore
			}
		}

		return null;
	}

	protected boolean isPathFragment(URI proxyURI) {
		String uriFragment = proxyURI.fragment();

		return uriFragment != null && uriFragment.charAt(0) == '/';
	}

	protected URIMapping findExistingMapping(EObject proxy, ResourceSet resourceSet) {
		URI proxyURI = EcoreUtil.getURI(proxy);
		return findExistingMapping(proxyURI, resourceSet);
	}
}
