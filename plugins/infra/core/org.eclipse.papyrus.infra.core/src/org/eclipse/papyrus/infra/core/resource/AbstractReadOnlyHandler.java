/*****************************************************************************
 * Copyright (c) 2013, 2015 Atos Origin, CEA, Christian W. Damus, and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos Origin) mathieu.velten@atosorigin.com - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 323802
 *  Christian W. Damus (CEA) - bug 429826
 *  Christian W. Damus - bug 457560
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.resource;

import static org.eclipse.papyrus.infra.core.resource.ReadOnlyAxis.permissionAxes;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.infra.core.Activator;

import com.google.common.base.Optional;

public abstract class AbstractReadOnlyHandler implements IReadOnlyHandler2 {
	private static ResourceReadOnlyCache.Provider resourceCacheProvider;

	private final EditingDomain editingDomain;

	private final ResourceReadOnlyCache resourceCache;

	private CopyOnWriteArrayList<IReadOnlyListener> listeners = new CopyOnWriteArrayList<IReadOnlyListener>();

	public AbstractReadOnlyHandler(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
		this.resourceCache = (resourceCacheProvider == null) ? null : resourceCacheProvider.get(this);
	}

	public static IReadOnlyHandler2 adapt(IReadOnlyHandler handler, EditingDomain domain) {
		return new Adapter(handler, domain);
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	@Override
	@Deprecated
	public Optional<Boolean> anyReadOnly(URI[] uris) {
		return anyReadOnly(permissionAxes(), uris);
	}

	@Override
	@Deprecated
	public Optional<Boolean> isReadOnly(EObject eObject) {
		return isReadOnly(permissionAxes(), eObject);
	}

	@Override
	public Optional<Boolean> isReadOnly(Set<ReadOnlyAxis> axes, EObject eObject) {
		Optional<Boolean> result;

		Resource res = eObject.eResource();
		URI uri = (res == null) ? null : res.getURI();
		if (uri != null) {
			if (resourceCache != null) {
				result = resourceCache.get(axes, uri);
				if (result == null) {
					result = anyReadOnly(axes, new URI[] { uri });
					resourceCache.put(axes, uri, result);
				}
			} else {
				result = anyReadOnly(axes, new URI[] { uri });
			}
		} else {
			result = Optional.absent();
		}

		return result;
	}

	@Override
	@Deprecated
	public Optional<Boolean> makeWritable(URI[] uris) {
		return makeWritable(permissionAxes(), uris);
	}

	@Override
	@Deprecated
	public Optional<Boolean> makeWritable(EObject eObject) {
		return makeWritable(permissionAxes(), eObject);
	}

	@Override
	public Optional<Boolean> makeWritable(Set<ReadOnlyAxis> axes, EObject eObject) {
		Resource res = eObject.eResource();
		if (res != null && res.getURI() != null) {
			return makeWritable(axes, new URI[] { res.getURI() });
		}
		return Optional.absent();
	}

	/**
	 * By default, we do not handle writability of these resources.
	 */
	@Override
	public Optional<Boolean> canMakeWritable(Set<ReadOnlyAxis> axes, URI[] uris) {
		return Optional.absent();
	}

	@Override
	public Optional<Boolean> canMakeWritable(Set<ReadOnlyAxis> axes, EObject object) {
		Resource res = object.eResource();
		if ((res != null) && (res.getURI() != null)) {
			return canMakeWritable(axes, new URI[] { res.getURI() });
		}
		return Optional.absent();
	}

	@Override
	public void addReadOnlyListener(IReadOnlyListener listener) {
		listeners.addIfAbsent(listener);
	}

	@Override
	public void removeReadOnlyListener(IReadOnlyListener listener) {
		listeners.remove(listener);
	}

	protected void fireReadOnlyStateChanged(ReadOnlyAxis axis, URI resourceURI, boolean readOnly) {
		if (!listeners.isEmpty()) {
			ReadOnlyEvent event = new ReadOnlyEvent(this, axis, resourceURI, readOnly);
			for (IReadOnlyListener next : listeners) {
				try {
					next.readOnlyStateChanged(event);
				} catch (Exception e) {
					Activator.log.error("Uncaught exception in read-only state change listener.", e); //$NON-NLS-1$
				}
			}
		}
	}

	protected void fireReadOnlyStateChanged(ReadOnlyAxis axis, EObject object, boolean readOnly) {
		if (!listeners.isEmpty()) {
			ReadOnlyEvent event = new ReadOnlyEvent(this, axis, object, readOnly);
			for (IReadOnlyListener next : listeners) {
				try {
					next.readOnlyStateChanged(event);
				} catch (Exception e) {
					Activator.log.error("Uncaught exception in read-only state change listener.", e); //$NON-NLS-1$
				}
			}
		}
	}

	/**
	 * Installs the provider of resource read-only state caches to be used for caching the resource-based read-only state
	 * of objects. This helps to improve the performance of object read-only checks for handlers that don't implement
	 * object-level read-only state, especially for cases where checking the read-only state of a resource is expensive
	 * (such as reading file attributes from the filesystem).
	 * 
	 * @param provider
	 *            the provider to install. Subsequent invocations are ignored (the first provider installed wins out)
	 */
	public static void setResourceReadOnlyCacheProvider(ResourceReadOnlyCache.Provider provider) {
		if (resourceCacheProvider != null) {
			Activator.log.warn("Resource read-only cache provider already installed; ignoring " + provider);
		} else {
			resourceCacheProvider = provider;
		}
	}

	//
	// Nested types
	//

	private static class Adapter extends AbstractReadOnlyHandler {
		private final IReadOnlyHandler delegate;

		Adapter(IReadOnlyHandler handler, EditingDomain editingDomain) {
			super(editingDomain);

			this.delegate = handler;
		}

		@Override
		public Optional<Boolean> anyReadOnly(Set<ReadOnlyAxis> axes, URI[] uris) {
			// these handlers implicitly only deal with permission-based read-only-ness
			return !axes.contains(ReadOnlyAxis.PERMISSION) ? Optional.<Boolean> absent() : delegate.anyReadOnly(uris);
		}

		@Override
		public Optional<Boolean> isReadOnly(Set<ReadOnlyAxis> axes, EObject eObject) {
			return !axes.contains(ReadOnlyAxis.PERMISSION) ? Optional.<Boolean> absent() : delegate.isReadOnly(eObject);
		}

		@Override
		public Optional<Boolean> makeWritable(Set<ReadOnlyAxis> axes, URI[] uris) {
			// these handlers implicitly only deal with permission-based read-only-ness
			Optional<Boolean> result = !axes.contains(ReadOnlyAxis.PERMISSION) ? Optional.<Boolean> absent() : delegate.makeWritable(uris);

			if (result.or(false)) {
				for (URI next : uris) {
					fireReadOnlyStateChanged(ReadOnlyAxis.PERMISSION, next, true);
				}
			}

			return result;
		}

		@Override
		public Optional<Boolean> makeWritable(Set<ReadOnlyAxis> axes, EObject eObject) {
			Optional<Boolean> result = !axes.contains(ReadOnlyAxis.PERMISSION) ? Optional.<Boolean> absent() : delegate.makeWritable(eObject);

			if (result.or(false)) {
				fireReadOnlyStateChanged(ReadOnlyAxis.PERMISSION, eObject, true);
			}

			return result;
		}
	}

	/**
	 * A protocol for caching the read-only state of a resource by axis.
	 * 
	 * @see Provider
	 */
	public interface ResourceReadOnlyCache {
		/**
		 * Queries the cached read-only state of a resource for a specific set of axes.
		 * 
		 * @param axes
		 *            the read-only axes to query
		 * @param resourceURI
		 *            the resource to query
		 * 
		 * @return the previously cached read-only state, or {@code null} if it has not previously been cached
		 */
		Optional<Boolean> get(Set<ReadOnlyAxis> axes, URI resourceURI);

		/**
		 * Caches the read-only state of a resource for a specific set of axes.
		 * 
		 * @param axes
		 *            the read-only axes to cache
		 * @param resourceURI
		 *            the resource to cache
		 * @param readOnly
		 *            the read-only state to cache
		 */
		void put(Set<ReadOnlyAxis> axes, URI resourceURI, Optional<Boolean> readOnly);

		//
		// Nested types
		//

		/**
		 * A simple protocol for a provider of resource read-only state caches, per handler.
		 * 
		 * @see AbstractReadOnlyHandler#setResourceReadOnlyCacheProvider(Provider)
		 */
		interface Provider {
			ResourceReadOnlyCache get(AbstractReadOnlyHandler handler);
		}
	}
}
