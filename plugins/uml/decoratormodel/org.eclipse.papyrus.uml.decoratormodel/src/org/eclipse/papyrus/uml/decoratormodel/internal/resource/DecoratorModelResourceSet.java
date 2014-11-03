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

package org.eclipse.papyrus.uml.decoratormodel.internal.resource;

import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ProfileExternalizationPackage;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.collect.ImmutableSet;

/**
 * A minimalist resource set that does not resolve proxies except in some given scope of target resource URIs.
 */
public class DecoratorModelResourceSet extends ResourceSetImpl {
	private final Set<URI> resolutionScope;

	public DecoratorModelResourceSet() {
		this(null);
	}

	public DecoratorModelResourceSet(Set<URI> resolutionScope) {
		super();

		this.resolutionScope = resolutionScope;

		EPackage.Registry registry = new DecoratorModelPackageRegistry();
		ExtendedMetaData metadata = new BasicExtendedMetaData(registry);

		setPackageRegistry(registry);
		getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, metadata);

		getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
		getLoadOptions().put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, true);
		getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, true);
		getLoadOptions().put(XMLResource.OPTION_USE_PACKAGE_NS_URI_AS_LOCATION, false);
	}

	@Override
	public EObject getEObject(URI uri, boolean loadOnDemand) {
		EObject result = null;

		// Don't resolve any proxies except to metamodels and registered profiles and resources in our scope
		if (!loadOnDemand || !uri.isPlatformResource() || ((resolutionScope != null) && resolutionScope.contains(uri.trimFragment()))) {
			result = super.getEObject(uri, loadOnDemand);
		} else {
			result = super.getEObject(uri, false);
		}

		return result;
	}

	//
	// Nested types
	//


	private static class DecoratorModelPackageRegistry extends EPackageRegistryImpl {
		private static final long serialVersionUID = 1L;

		private final Set<EPackage> acceptedPackages = ImmutableSet.of(UMLPackage.eINSTANCE, EcorePackage.eINSTANCE, ProfileExternalizationPackage.eINSTANCE);
		private final Set<EFactory> acceptedFactories;

		{
			ImmutableSet.Builder<EFactory> factories = ImmutableSet.builder();
			for (EPackage next : acceptedPackages) {
				factories.add(next.getEFactoryInstance());
			}
			acceptedFactories = factories.build();
		}

		DecoratorModelPackageRegistry() {
			super(EPackage.Registry.INSTANCE);
		}

		// Don't resolve anything but the UML metamodel and the externalization profile
		@Override
		protected EPackage delegatedGetEPackage(String nsURI) {
			EPackage result = super.delegatedGetEPackage(nsURI);
			if (!acceptedPackages.contains(result)) {
				result = null;
			}
			return result;
		}

		@Override
		protected EFactory delegatedGetEFactory(String nsURI) {
			EFactory result = super.delegatedGetEFactory(nsURI);
			if (!acceptedFactories.contains(result)) {
				result = null;
			}
			return result;
		}
	}
}
