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
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.URIMapping;
import org.eclipse.papyrus.uml.extensionpoints.library.IRegisteredLibrary;
import org.eclipse.papyrus.uml.extensionpoints.library.RegisteredLibrary;

import com.google.common.collect.Sets;

/**
 * Helper class to instantiate and manipulate a Parameters Configuration
 *
 * @author Camille Letavernier
 *
 */
public class ConfigHelper {

	protected final Config config;

	protected final static Set<String> rsaExtensions = Sets.newHashSet("emx", "efx"); //$NON-NLS-1$ //$NON-NLS-2$

	protected final static String rsaProfileExtension = "epx"; //$NON-NLS-1$

	// ResourceSet used to load and explore Static Libraries
	protected final ResourceSet localResourceSet = new ResourceSetImpl();

	public ConfigHelper(Config config) {
		this.config = config;
		if (config.getMappingParameters() == null) {
			config.setMappingParameters(RSAToPapyrusParametersFactory.eINSTANCE.createMappingParameters());
		}

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

	public ConfigHelper() {
		this(RSAToPapyrusParametersFactory.eINSTANCE.createConfig());
	}

	public Config getConfig() {
		return config;
	}

	public void computeURIMappings(Collection<Resource> sourceModels) {
		for (Resource sourceModel : sourceModels) {
			doComputeURIMappings(sourceModel);
		}
		unloadResourceSet();
	}

	public void computeURIMappings(Resource sourceModel) {
		doComputeURIMappings(sourceModel);
		unloadResourceSet();
	}

	protected void doComputeURIMappings(Resource sourceModel) {
		try {
			TreeIterator<EObject> resourceContents = sourceModel.getAllContents();
			ResourceSet resourceSet = sourceModel.getResourceSet();

			while (resourceContents.hasNext()) {
				EObject next = resourceContents.next();
				for (EReference reference : next.eClass().getEAllReferences()) {
					if (reference.isContainer() || reference.isContainment() || reference.isDerived() || reference.isTransient()) {
						continue;
					}

					Object value = next.eGet(reference);
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
		} finally {
			unloadResourceSet();
		}
	}

	protected void handleURIMapping(EObject eObject, ResourceSet resourceSet) {

		Collection<URIMapping> mappings = config.getMappingParameters().getUriMappings();

		if (eObject.eIsProxy() || isRSAModelElement(eObject)) { // Not yet resolved, or still a reference to an RSA Model Element
			eObject = EcoreUtil.resolve(eObject, resourceSet);
			if (eObject.eIsProxy() || isRSAModelElement(eObject)) { // Can't be resolved

				URIMapping existingMapping = findExistingMapping(eObject, resourceSet);
				if (existingMapping == null) {
					URIMapping mapping = RSAToPapyrusParametersFactory.eINSTANCE.createURIMapping();
					URI sourceURI = EcoreUtil.getURI(eObject);

					mapping.setSourceURI(sourceURI.trimFragment().trimQuery().toString());
					mapping.setTargetURI(sourceURI.trimFragment().trimQuery().toString()); // By default, don't change anything

					mappings.add(mapping);
				} else {
					mappings.add(existingMapping);
				}
			}
		}
	}

	protected boolean isRSAModelElement(EObject eObject) {
		URI objectURI = EcoreUtil.getURI(eObject);
		String fileExtension = objectURI.fileExtension();
		return rsaExtensions.contains(fileExtension) || rsaProfileExtension.equals(fileExtension);
	}

	protected URIMapping findExistingMapping(EObject proxy, ResourceSet resourceSet) {
		URI proxyURI = EcoreUtil.getURI(proxy);
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


		if (!isRSAModelElement(proxy)) {
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

		return null;
	}

}
