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
package org.eclipse.papyrus.infra.tools.databinding;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.core.databinding.observable.AbstractObservable;
import org.eclipse.core.databinding.observable.DisposeEvent;
import org.eclipse.core.databinding.observable.IDisposeListener;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.AbstractObservableValue;

import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;



/**
 * A mix-in interface for {@link IObservable}s that support reference counting as a means to automatically dispose of them while ensuring that
 * they may be freely shared without any client finding itself interacting with a disposed observable.
 */
public interface ReferenceCountedObservable extends IObservable {

	/**
	 * Retains me for use by the caller, which should be sure to {@linkplain #release() release me} when I am no longer needed.
	 * As long as I have been retained by at least one client, I shall not {@linkplain IObservable#dispose() dispose} myself.
	 *
	 * @see #release()
	 */
	void retain();

	/**
	 * Releases me, indicating that I am no longer being used by the caller. When my {@linkplain #retain() retain count} reaches zero,
	 * I automatically {@linkplain IObservable#dispose() dispose} myself, because no client needs me.
	 *
	 * @see #retain()
	 * @see #autorelease()
	 * @see IObservable#dispose()
	 */
	void release();

	/**
	 * Automatically releases me some time after the current iteration of the UI event loop. This is useful when it is
	 * expected that the UI will still need to be able to access the observable for refreshes while processing the
	 * current event.
	 *
	 * @see #release()
	 */
	void autorelease();

	/**
	 * A composable assistant to implement the {@link ReferenceCountedObservable} protocol by delegating of its API.
	 */
	class Support {

		private final IObservable observable;

		private final AtomicInteger refCount = new AtomicInteger();

		/**
		 * Creates a new instance to support reference counting on behalf of an {@code observable}.
		 *
		 * @param observable
		 *            the observable for which to provide reference counting
		 */
		public Support(IObservable observable) {
			this.observable = observable;
		}

		public void retain() {
			refCount.incrementAndGet();
		}

		public void release() {
			if ((refCount.decrementAndGet() <= 0) && !observable.isDisposed()) {
				observable.dispose();
			}
		}

		public void autorelease() {
			AutoReleasePool.get(observable.getRealm()).add(observable);
		}
	}

	/**
	 * A convenient superclass for reference-counted observables that don't need any other more specific superclass.
	 */
	abstract class Abstract extends AbstractObservable implements ReferenceCountedObservable {

		private final Support refCount = new Support(this);

		public Abstract(Realm realm) {
			super(realm);
		}

		public void retain() {
			refCount.retain();
		}

		public void release() {
			refCount.release();
		}

		public void autorelease() {
			refCount.autorelease();
		}
	}

	/**
	 * A convenient superclass for reference-counted observable values that don't need any other more specific superclass.
	 */
	abstract class Value extends AbstractObservableValue implements ReferenceCountedObservable {

		private final Support refCount = new Support(this);

		public Value() {
			super();
		}

		public Value(Realm realm) {
			super(realm);
		}

		public void retain() {
			refCount.retain();
		}

		public void release() {
			refCount.release();
		}

		public void autorelease() {
			refCount.autorelease();
		}
	}

	/**
	 * A pool of {@link IObservable}s to be released automatically after the completion of the current iteration
	 * of the UI event loop (or whatever determines the asynchronous execution of tasks in a given {@link Realm}).
	 */
	final class AutoReleasePool {

		private static final ConcurrentMap<Realm, AutoReleasePool> pools = new MapMaker().concurrencyLevel(1).makeMap();

		private final Realm realm;

		private Collection<IObservable> pool = Lists.newArrayList();

		private AutoReleasePool(Realm realm) {
			this.realm = realm;

			realm.asyncExec(new ReleaseRunnable());
		}

		public static AutoReleasePool get(Realm realm) {
			AutoReleasePool result = pools.get(realm);
			if (result == null) {
				result = new AutoReleasePool(realm);

				// Double-check
				AutoReleasePool oops = pools.putIfAbsent(realm, result);
				if (oops != null) {
					result = oops;
				}
			}

			return result;
		}

		public synchronized void add(IObservable observable) {
			if (pool == null) {
				pool = Lists.newArrayList();
			}

			pool.add(observable);
		}

		public void release() {
			pools.remove(realm);

			for (;;) {
				Iterable<IObservable> toDrain;

				synchronized (this) {
					toDrain = pool;
					pool = null;
				}

				if (toDrain != null) {
					// Drain this pool
					for (IObservable next : toDrain) {
						Util.release(next);
					}
				} else {
					// Done. No more pools to drain
					break;
				}
			}
		}

		private final class ReleaseRunnable implements Runnable {

			public void run() {
				release();
			}
		}
	}

	/**
	 * Utility APIs for working with reference-counted observables. In particular, this provides external reference-counting
	 * for observables that don't implement it internally via the {@link ReferenceCountedObservable} protocol.
	 */
	final class Util {

		// Use the Guava weak map because that uses object identity for comparisons, which is critical
		// to avoid using equals() which will often fail on an assertion violation for accessing a
		// getter of a disposed observable
		private static final Map<IObservable, WeakRefCount> adapters = new MapMaker().concurrencyLevel(1).weakKeys().makeMap();

		private Util() {
			super();
		}

		/**
		 * Provides a unified interface to retaining observables, delegating to the {@link ReferenceCountedObservable} protocol
		 * for observables that implement it, otherwise providing an external reference-count (which is GC-safe).
		 *
		 * @param observable
		 *            an observable to retain
		 *
		 * @return the same {@code observable} (useful for call chaining)
		 *
		 * @see ReferenceCountedObservable#retain()
		 */
		public static <T extends IObservable> T retain(T observable) {
			if (observable instanceof ReferenceCountedObservable) {
				((ReferenceCountedObservable) observable).retain();
			} else if (!observable.isDisposed()) { // Don't bother counting if already disposed
				WeakRefCount adapter = adapt(observable, true);
				adapter.retain();
			}

			return observable;
		}

		/**
		 * Provides a unified interface to releasing observables, delegating to the {@link ReferenceCountedObservable} protocol
		 * for observables that implement it, otherwise providing an external reference-count (which is GC-safe). Note that
		 * for externally reference-counted observables, they are automatically disposed as usual when the retain count drops
		 * to zero, just as though they implemented reference counting internally.
		 *
		 * @param observable
		 *            an observable to release. If its retain count is zero as a result (whether intrinsic or extrinsic), it will be disposed
		 *
		 * @return the same {@code observable} (useful for call chaining)
		 *
		 * @see ReferenceCountedObservable#release()
		 */
		public static <T extends IObservable> T release(T observable) {
			if (observable instanceof ReferenceCountedObservable) {
				((ReferenceCountedObservable) observable).release();
			} else if (!observable.isDisposed()) { // Don't bother counting if already disposed
				WeakRefCount adapter = adapt(observable, false);

				// There won't be an adapter if there was no prior retain (of course) or if it was already disposed
				if (adapter != null) {
					adapter.release();
				}
			}

			return observable;
		}

		/**
		 * Provides a unified interface to auto-releasing observables, delegating to the {@link ReferenceCountedObservable} protocol
		 * for observables that implement it, otherwise providing an external reference-count (which is GC-safe). Note that
		 * for externally reference-counted observables, they are automatically disposed as usual when the retain count drops
		 * to zero, just as though they implemented reference counting internally.
		 *
		 * @param observable
		 *            an observable to release. If its retain count is zero as a result (whether intrinsic or extrinsic), it will be disposed
		 *
		 * @return the same {@code observable} (useful for call chaining)
		 *
		 * @see ReferenceCountedObservable#autorelease()
		 */
		public static <T extends IObservable> T autorelease(T observable) {
			if (observable instanceof ReferenceCountedObservable) {
				((ReferenceCountedObservable) observable).autorelease();
			} else if (!observable.isDisposed()) { // Don't bother counting if already disposed
				WeakRefCount adapter = adapt(observable, false);

				// There won't be an adapter if there was no prior retain (of course) or if it was already disposed
				if (adapter != null) {
					adapter.autorelease();
				}
			}

			return observable;
		}

		private static WeakRefCount adapt(IObservable observable, boolean create) {
			WeakRefCount result = adapters.get(observable);

			if ((result == null) && create) {
				result = new WeakRefCount(observable);
				adapters.put(observable, result);
			}

			return result;
		}

		private static final class WeakRefCount extends WeakReference<IObservable> implements IDisposeListener {

			private final AtomicInteger refCount = new AtomicInteger();

			WeakRefCount(IObservable observable) {
				super(observable);

				observable.addDisposeListener(this);
			}

			public void retain() {
				refCount.incrementAndGet();
			}

			public void release() {
				if (refCount.decrementAndGet() <= 0) {
					IObservable observable = get();

					if (observable != null) {
						if (!observable.isDisposed()) {
							observable.dispose();
						}

						clear();
					}
				}
			}

			public void autorelease() {
				IObservable observable = get();

				// If it's null, then it's already disposed, so auto-release is meaningless
				if (observable != null) {
					AutoReleasePool.get(observable.getRealm()).add(observable);
				}
			}

			public void handleDispose(DisposeEvent event) {
				if (event.getObservable() == get()) {
					clear();
				}
			}
		}
	}
}
