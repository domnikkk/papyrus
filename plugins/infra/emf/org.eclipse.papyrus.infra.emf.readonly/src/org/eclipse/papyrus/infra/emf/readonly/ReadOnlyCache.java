/*****************************************************************************
 * Copyright (c) 2015 Christian W. Damus and others.
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

package org.eclipse.papyrus.infra.emf.readonly;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomainEvent;
import org.eclipse.emf.transaction.TransactionalEditingDomainListenerImpl;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.papyrus.infra.core.resource.AbstractReadOnlyHandler;
import org.eclipse.papyrus.infra.core.resource.AbstractReadOnlyHandler.ResourceReadOnlyCache;
import org.eclipse.papyrus.infra.core.resource.IReadOnlyHandler;
import org.eclipse.papyrus.infra.core.resource.ReadOnlyAxis;
import org.eclipse.papyrus.infra.core.utils.TransactionHelper;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;

/**
 * A transaction-scoped cache of read-only states of resources and objects.
 */
class ReadOnlyCache extends TransactionalEditingDomainListenerImpl {

	private static final ThreadLocal<ReadOnlyCache> context = new ThreadLocal<ReadOnlyCache>();

	private final TransactionalEditingDomain transactionalEditingDomain;

	private Transaction activeTransaction;
	private Map<Set<URI>, ReadOnlyState> resourceReadOnlyStates;
	private Map<EObject, ReadOnlyState> objectReadOnlyStates;
	private Map<AbstractReadOnlyHandler, Map<URI, ReadOnlyState>> handlerResourceReadOnlyCache;

	static {
		// Install the resource read-only cache provider
		AbstractReadOnlyHandler.setResourceReadOnlyCacheProvider(new ResourceReadOnlyCacheProvider());
	}

	ReadOnlyCache(TransactionalEditingDomain transactionalEditingDomain) {
		super();

		this.transactionalEditingDomain = transactionalEditingDomain;
	}

	/**
	 * Creates a read-only cache for the specified read-only {@code manager}.
	 * 
	 * @param manager
	 *            a read-only manager
	 * @param domain
	 *            its editing domain
	 * 
	 * @return an appropriate cache, which may be one that doesn't actually cache anything if the editing domain isn't a suitable {@link TransactionalEditingDomain}, but never {@code null}
	 */
	static ReadOnlyCache create(ReadOnlyManager manager, EditingDomain domain) {
		ReadOnlyCache result = null;

		if (domain instanceof TransactionalEditingDomain) {
			TransactionalEditingDomain ted = (TransactionalEditingDomain) domain;
			TransactionalEditingDomain.Lifecycle lifecycle = TransactionUtil.getAdapter(ted, TransactionalEditingDomain.Lifecycle.class);
			if (lifecycle != null) {
				result = new ReadOnlyCache(ted);
				lifecycle.addTransactionalEditingDomainListener(result);
				if (Platform.inDebugMode()) {
					Activator.log.info("Read-only cache activated for editing domain " + domain); //$NON-NLS-1$
				}
			}
		}

		if (result == null) {
			result = Dud.INSTANCE;
		}

		return result;
	}

	/**
	 * Forcibly disposes me.
	 */
	public void dispose() {
		if (transactionalEditingDomain != null) {
			// Pretend as though
			editingDomainDisposing(new TransactionalEditingDomainEvent(transactionalEditingDomain, TransactionalEditingDomainEvent.EDITING_DOMAIN_DISPOSING));

			// This would be done for us if it were actually disposing
			TransactionalEditingDomain.Lifecycle lifecycle = TransactionUtil.getAdapter(transactionalEditingDomain, TransactionalEditingDomain.Lifecycle.class);
			if (lifecycle != null) {
				lifecycle.removeTransactionalEditingDomainListener(this);
			}
		}
	}

	/**
	 * Queries the cached read-only state of some resources for a specific set of axes.
	 * 
	 * @param axes
	 *            the read-only axes to query
	 * @param uris
	 *            the resource URIs to query
	 * 
	 * @return the previously cached read-only state, or {@code null} if it has not previously been cached
	 */
	public Optional<Boolean> getResources(Set<ReadOnlyAxis> axes, Set<URI> uris) {
		ReadOnlyState state = (resourceReadOnlyStates == null) ? null : resourceReadOnlyStates.get(uris);
		return (state == null) ? null : state.get(axes);
	}

	/**
	 * Queries the cached read-only state of an object for a specific set of axes.
	 * 
	 * @param axes
	 *            the read-only axes to query
	 * @param object
	 *            the object to query
	 * 
	 * @return the previously cached read-only state, or {@code null} if it has not previously been cached
	 */
	public Optional<Boolean> getObject(Set<ReadOnlyAxis> axes, EObject object) {
		ReadOnlyState state = (objectReadOnlyStates == null) ? null : objectReadOnlyStates.get(object);
		return (state == null) ? null : state.get(axes);
	}

	/**
	 * Caches the read-only state of some resources for a specific set of axes.
	 * 
	 * @param axes
	 *            the read-only axes to cache
	 * @param uris
	 *            the resource URIS to cache
	 * @param readOnly
	 *            the read-only state to cache
	 */
	public void putResources(Set<ReadOnlyAxis> axes, Set<URI> uris, Optional<Boolean> readonly) {
		if (resourceReadOnlyStates != null) {
			ReadOnlyState state = resourceReadOnlyStates.get(uris);
			if (state == null) {
				state = new ReadOnlyState();
				resourceReadOnlyStates.put(uris, state);
			}
			state.put(axes, readonly);
		}
	}

	/**
	 * Caches the read-only state of an object for a specific set of axes.
	 * 
	 * @param axes
	 *            the read-only axes to cache
	 * @param object
	 *            the object to cache
	 * @param readOnly
	 *            the read-only state to cache
	 */
	public void putObject(Set<ReadOnlyAxis> axes, EObject object, Optional<Boolean> readonly) {
		if (objectReadOnlyStates != null) {
			ReadOnlyState state = objectReadOnlyStates.get(object);
			if (state == null) {
				state = new ReadOnlyState();
				objectReadOnlyStates.put(object, state);
			}
			state.put(axes, readonly);
		}
	}

	/**
	 * Clears the current cached read-only states so that they will be recomputed if needed again during the transaction.
	 * This is necessary, for example, after resources and/or objects have been made writable that were previously read-only.
	 */
	public void clear() {
		if (resourceReadOnlyStates != null) {
			resourceReadOnlyStates.clear();
		}
		if (objectReadOnlyStates != null) {
			objectReadOnlyStates.clear();
		}
		if (handlerResourceReadOnlyCache != null) {
			handlerResourceReadOnlyCache.clear();
		}
	}

	@Override
	public void transactionStarted(TransactionalEditingDomainEvent event) {
		if ((activeTransaction == null) && !TransactionHelper.isReadOnlyCacheDisabled(event.getTransaction())) {
			activeTransaction = event.getTransaction();
			resourceReadOnlyStates = Maps.newHashMap();
			objectReadOnlyStates = Maps.newHashMap();
			handlerResourceReadOnlyCache = Maps.newHashMap();
		}
	}

	@Override
	public void transactionClosed(TransactionalEditingDomainEvent event) {
		if (event.getTransaction() == activeTransaction) {
			activeTransaction = null;
			resourceReadOnlyStates = null;
			objectReadOnlyStates = null;
			handlerResourceReadOnlyCache = null;
		}
	}

	@Override
	public void editingDomainDisposing(TransactionalEditingDomainEvent event) {
		activeTransaction = null;
		resourceReadOnlyStates = null;
		objectReadOnlyStates = null;
		handlerResourceReadOnlyCache = null;

		if (Platform.inDebugMode()) {
			Activator.log.info("Read-only cache deactivated for editing domain " + event.getSource()); //$NON-NLS-1$
		}
	}

	/**
	 * Runs an operation in the context of my owning {@link ReadOnlyManager}. The construction of {@link IReadOnlyHandler}s
	 * should be performed in an operation via this method.
	 * 
	 * @param operation
	 *            a read-only manager operation
	 */
	void run(Runnable operation) {
		final ReadOnlyCache previous = context.get();
		context.set(this);
		try {
			operation.run();
		} finally {
			if (previous == null) {
				context.remove();
			} else {
				context.set(previous);
			}
		}
	}

	ResourceReadOnlyCache getResourceReadOnlyCache(final AbstractReadOnlyHandler handler) {
		return new ResourceReadOnlyCache() {
			public Optional<Boolean> get(Set<ReadOnlyAxis> axes, URI resourceURI) {
				Optional<Boolean> result;

				if (handlerResourceReadOnlyCache == null) {
					result = null;
				} else {
					Map<URI, ReadOnlyState> forHandler = handlerResourceReadOnlyCache.get(handler);
					if (forHandler == null) {
						result = null;
					} else {
						ReadOnlyState state = forHandler.get(resourceURI);
						result = (state == null) ? null : state.get(axes);
					}
				}

				return result;
			}

			public void put(Set<ReadOnlyAxis> axes, URI resourceURI, Optional<Boolean> readOnlyState) {
				if (handlerResourceReadOnlyCache != null) {
					Map<URI, ReadOnlyState> forHandler = handlerResourceReadOnlyCache.get(handler);
					if (forHandler == null) {
						forHandler = Maps.newHashMap();
						handlerResourceReadOnlyCache.put(handler, forHandler);
					}

					ReadOnlyState state = forHandler.get(resourceURI);
					if (state == null) {
						state = new ReadOnlyState();
						forHandler.put(resourceURI, state);
					}

					state.put(axes, readOnlyState);
				}
			}
		};
	}

	//
	// Nested types
	//

	/**
	 * A cache that overrides all caching behaviour with no-ops.
	 */
	private static final class Dud extends ReadOnlyCache {
		static final Dud INSTANCE = new Dud();

		private Dud() {
			super(null);
		}

		@Override
		public Optional<Boolean> getResources(Set<ReadOnlyAxis> axes, Set<URI> uris) {
			return null;
		}

		@Override
		public Optional<Boolean> getObject(Set<ReadOnlyAxis> axes, EObject object) {
			return null;
		}

		@Override
		public void putResources(Set<ReadOnlyAxis> axes, Set<URI> uris, Optional<Boolean> readonly) {
			// Pass
		}

		@Override
		public void putObject(Set<ReadOnlyAxis> axes, EObject object, Optional<Boolean> readonly) {
			// Pass
		}

		@Override
		ResourceReadOnlyCache getResourceReadOnlyCache(AbstractReadOnlyHandler handler) {
			return null;
		}
	}

	private static class ReadOnlyState extends HashMap<Set<ReadOnlyAxis>, Optional<Boolean>> {
		private static final long serialVersionUID = 1L;

	}

	private static class ResourceReadOnlyCacheProvider implements AbstractReadOnlyHandler.ResourceReadOnlyCache.Provider {
		private ResourceReadOnlyCacheProvider() {
			super();
		}

		public ResourceReadOnlyCache get(AbstractReadOnlyHandler handler) {
			ResourceReadOnlyCache result = null;

			// Can only cache resource read-only states if we have the context for it
			ReadOnlyCache cache = context.get();
			if (cache != null) {
				result = cache.getResourceReadOnlyCache(handler);
			}

			return result;
		}
	}
}
