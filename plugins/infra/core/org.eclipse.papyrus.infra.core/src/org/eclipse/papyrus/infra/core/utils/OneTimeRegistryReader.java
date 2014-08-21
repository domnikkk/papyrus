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
package org.eclipse.papyrus.infra.core.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Set;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.emf.ecore.plugin.RegistryReader;

import com.google.common.collect.ImmutableSet;


/**
 * A specialized {@link RegistryReader} that is intended to be instantiated repeatedly, to read the registry once each time.
 * As such, it does not attach itself as a listener to the {@link IExtensionRegistry} for updates.
 */
public class OneTimeRegistryReader extends RegistryReader {

	private static Class<?>[] REGISTRY_API = new Class<?>[] { IExtensionRegistry.class };

	private static Set<String> ADD_LISTENER_METHOD_NAMES = ImmutableSet.of("addListener", "addRegistryChangeListener"); //$NON-NLS-1$ //$NON-NLS-2$

	public OneTimeRegistryReader(IExtensionRegistry pluginRegistry, String pluginID, String extensionPointID) {
		super(wrap(pluginRegistry), pluginID, extensionPointID);
	}

	private static IExtensionRegistry wrap(final IExtensionRegistry pluginRegistry) {
		return (IExtensionRegistry) Proxy.newProxyInstance(OneTimeRegistryReader.class.getClassLoader(), REGISTRY_API, new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// Don't forward the add-listener methods, so that the registry reader cannot add any listeners
				if (!isAddListenerMethod(method)) {
					return method.invoke(pluginRegistry, args);
				}
				return null;
			}
		});
	}

	static boolean isAddListenerMethod(Method method) {
		return IExtensionRegistry.class.isAssignableFrom(method.getDeclaringClass()) && ADD_LISTENER_METHOD_NAMES.contains(method.getName());
	}
}
