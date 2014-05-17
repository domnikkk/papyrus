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
package org.eclipse.papyrus.uml.modelrepair.ui.providers;

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.resource.ResourceItemProvider;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.edit.providers.PackageItemProvider;
import org.eclipse.uml2.uml.edit.providers.ProfileItemProvider;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;

import com.google.common.collect.Lists;


/**
 * This is the NestedProfilesAdapterFactory type. Enjoy.
 */
public class NestedProfilesAdapterFactory implements AdapterFactory, IDisposable {

	private final ComposedAdapterFactory delegate;

	public NestedProfilesAdapterFactory() {
		super();

		delegate = new ComposedAdapterFactory(new AdapterFactory[]{ createUMLAdapterFactory(), createResourceAdapterFactory() });
	}

	public void dispose() {
		delegate.dispose();
	}

	public boolean isFactoryForType(Object type) {
		return delegate.isFactoryForType(type);
	}

	public Object adapt(Object object, Object type) {
		return delegate.adapt(object, type);
	}

	public Adapter adapt(Notifier target, Object type) {
		return delegate.adapt(target, type);
	}

	public Adapter adaptNew(Notifier target, Object type) {
		return delegate.adaptNew(target, type);
	}

	public void adaptAllNew(Notifier notifier) {
		delegate.adaptAllNew(notifier);
	}

	private static AdapterFactory createUMLAdapterFactory() {
		return new UMLItemProviderAdapterFactory() {

			@Override
			public Adapter createPackageAdapter() {
				if(packageItemProvider == null) {
					packageItemProvider = new PackageItemProvider(this) {

						@Override
						public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
							if(childrenFeatures == null) {
								childrenFeatures = Lists.<EStructuralFeature> newArrayList(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE);
							}
							return childrenFeatures;
						}
					};
				}

				return packageItemProvider;
			}

			@Override
			public Adapter createProfileAdapter() {
				if(profileItemProvider == null) {
					profileItemProvider = new ProfileItemProvider(this) {

						public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
							if(childrenFeatures == null) {
								childrenFeatures = Lists.<EStructuralFeature> newArrayList(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE);
							}
							return childrenFeatures;
						}

					};
				}

				return profileItemProvider;
			}
		};
	}

	private static AdapterFactory createResourceAdapterFactory() {
		return new ResourceItemProviderAdapterFactory() {

			@Override
			public Adapter createResourceAdapter() {
				return new ResourceItemProvider(this) {

					@Override
					public Collection<?> getElements(Object object) {
						return EcoreUtil.getObjectsByType(((Resource)object).getContents(), UMLPackage.Literals.PACKAGE);
					}
				};
			}
		};
	}
}
