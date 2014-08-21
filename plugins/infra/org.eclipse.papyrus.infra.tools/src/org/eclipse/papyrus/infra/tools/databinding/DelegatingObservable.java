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

import java.lang.reflect.Proxy;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.DisposeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.IDisposeListener;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.IObserving;
import org.eclipse.core.databinding.observable.IStaleListener;
import org.eclipse.core.databinding.observable.ObservableEvent;
import org.eclipse.core.databinding.observable.ObservableTracker;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.StaleEvent;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.value.IObservableValue;


/**
 * Abstract implementation of the {@link IDelegatingObservable} protocol with factory methods for creation of delegators.
 *
 * @see #wrap(IObservable)
 * @see #create(Realm, Class)
 * @see #create(Realm, Class, ClassLoader, Class...)
 */
public abstract class DelegatingObservable<T extends IObservable> extends ReferenceCountedObservable.Abstract implements IDelegatingObservable {

	private final Class<T> delegateType;

	private T delegate;

	@SuppressWarnings("unchecked")
	private T realObservable = (T) this;

	private IChangeListener forwardingChangeListener;

	private IStaleListener forwardingStaleListener;

	private IDisposeListener delegateDisposeListener;

	DelegatingObservable(T delegate, Class<T> delegateType) {
		super(delegate.getRealm());

		this.delegateType = delegateType;

		setDelegate(delegate);
	}

	DelegatingObservable(Realm realm, Class<T> delegateType) {
		super(realm);

		this.delegateType = delegateType;
	}

	/**
	 * Wraps an {@code observable} in a delegator, returning an {@link IDelegatingObservable} of the appropriate kind.
	 *
	 * @param observable
	 *            an observable to wrap in a delegator
	 * @return the delegator, which will be an instance of the {@link IDelegatingObservable} interface
	 *
	 * @throws IllegalArgumentException
	 *             if the {@code observable} is of a kind for which no delegator is currently implemented
	 */
	public static IObservable wrap(IObservable observable) {
		IObservable result;

		if (Proxy.isProxyClass(observable.getClass()) && (Proxy.getInvocationHandler(observable) instanceof DelegatingInvocationHandler)) {
			// Already have a delegator and it's a dynamic proxy. Just create another like it
			try {
				result = DelegatingInvocationHandler.wrapDynamicProxy(observable);
			} catch (Exception e) {
				// Seems unlikely as I must have created the observable in the first place
				throw new IllegalArgumentException("observable is an invalid implementation of IDelegatingObservable", e); //$NON-NLS-1$
			}
		} else if (observable instanceof IObservableList) {
			result = DelegatingObservableList.wrap((IObservableList) observable);
		} else if (observable instanceof IObservableSet) {
			result = DelegatingObservableSet.wrap((IObservableSet) observable);
		} else if (observable instanceof IObservableValue) {
			result = DelegatingObservableValue.wrap((IObservableValue) observable);
		} else {
			throw new IllegalArgumentException("no delegating wrapper implementation available for observable"); //$NON-NLS-1$
		}

		return result;
	}

	/**
	 * Creates a new empty delegator suitable for observables of the specified type without any other mix-in interfaces such as {@link IObserving}.
	 * Observable types must be specified by their abstract interface, and currently the following types are supported:
	 * <ul>
	 * <li>{@link IObservableValue}</li>
	 * <li>{@link IObservableList}</li>
	 * <li>{@link IObservableSet}</li>
	 * </ul>
	 *
	 * @param observableType
	 *            the kind of observable that will be the new delegator's delegate
	 * @return the delegator, which will be an instance of the {@link IDelegatingObservable} interface
	 *
	 * @throws IllegalArgumentException
	 *             if the {@code observable} is of a kind for which no delegator is currently implemented
	 *
	 * @see #create(Realm, Class, ClassLoader, Class...)
	 */
	public static <T extends IObservable> T create(Realm realm, Class<T> observableType) {
		return create(realm, observableType, null); // Class loader not needed without any mix-ins
	}

	/**
	 * Creates a new empty delegator suitable for observables of the specified type with optional mix-in interfaces such as {@link IObserving},
	 * which is implemented by detail observables in a master/detail relationship. Observable types must be specified
	 * by their abstract interface, and currently the following types are supported:
	 * <ul>
	 * <li>{@link IObservableValue}</li>
	 * <li>{@link IObservableList}</li>
	 * <li>{@link IObservableSet}</li>
	 * </ul>
	 *
	 * @param observableType
	 *            the kind of observable that will be the new delegator's delegate
	 * @param loader
	 *            a class loader that can see all of the {@code mixins}, if any
	 * @param mixins
	 *            optional mix-in interfaces that the resulting observable should refer to its delegate. These must all have {@linkplain #registerMixinHandler handlers already registered}
	 * @return the delegator, which will be an instance of the {@link IDelegatingObservable} interface
	 *
	 * @throws IllegalArgumentException
	 *             if the {@code observable} is of a kind for which no delegator is currently implemented
	 */
	@SuppressWarnings("unchecked")
	public static <T extends IObservable> T create(Realm realm, Class<T> observableType, ClassLoader loader, Class<?>... mixins) {
		if (observableType == IObservableList.class) {
			return (T) DelegatingObservableList.create(realm, loader, mixins);
		} else if (observableType == IObservableSet.class) {
			return (T) DelegatingObservableSet.create(realm, loader, mixins);
		} else if (observableType == IObservableValue.class) {
			return (T) DelegatingObservableValue.create(realm, loader, mixins);
		} else {
			throw new IllegalArgumentException("observableType"); //$NON-NLS-1$
		}
	}

	public final void setDelegate(final IObservable delegate) {
		if (isDisposed()) {
			throw new IllegalStateException("disposed"); //$NON-NLS-1$
		}

		final T oldDelegate = this.delegate;

		if (delegate != oldDelegate) {
			final T newDelegate = (delegate == null) ? null : delegateType.cast(delegate);

			if (oldDelegate != null) {
				unhookDelegate(oldDelegate);

				// Release it only after this iteration of the event loop so that UI refreshes can still access it for now
				// in case its retain count will go to zero and it will be disposed
				ReferenceCountedObservable.Util.autorelease(oldDelegate);
			}

			this.delegate = newDelegate;

			if (newDelegate != null) {
				ReferenceCountedObservable.Util.retain(newDelegate);
				hookDelegate(newDelegate);
			}

			delegateChanged(oldDelegate, newDelegate);
		}
	}

	final void clearDelegate() {
		// Can do this even if disposed

		if (delegate != null) {
			unhookDelegate(delegate);

			delegate = null;

			// Let listeners know that we've changed. We cannot fire an accurate value change event
			// because we can no longer access the old delegate's value, as it is now disposed
			fireChange();
		}
	}

	public final T getDelegate() {
		return delegate;
	}

	/**
	 * Notifies of a change from one delegate to another. Subclasses overriding this must call {@code super}.
	 *
	 * @param oldDelegate
	 *            the previous delegate, or {@code null} if there was none
	 * @param newDelegate
	 *            the new delegate, or {@code null} if now I have none
	 */
	protected void delegateChanged(T oldDelegate, T newDelegate) {
		fireChange();
	}

	protected void hookDelegate(T delegate) {
		delegate.addChangeListener(getForwardingChangeListener());
		delegate.addStaleListener(getForwardingStaleListener());

		// Don't forward dispose events because the delegate has its own lifecycle. However, when our delegate
		// is disposed, we forget about it
		delegate.addDisposeListener(getDelegateDisposeListener());
	}

	protected void unhookDelegate(T delegate) {
		delegate.removeChangeListener(getForwardingChangeListener());
		delegate.removeStaleListener(getForwardingStaleListener());
		delegate.removeDisposeListener(getDelegateDisposeListener());
	}

	public boolean isStale() {
		getterCalled();

		return (delegate != null) && delegate.isStale();
	}

	protected void getterCalled() {
		ObservableTracker.getterCalled(getRealObservable());
	}

	@Override
	public boolean equals(Object obj) {
		return (obj == this) || ((delegate == null) ? false : delegate.equals(obj));
	}

	@Override
	public int hashCode() {
		return (delegate == null) ? 0 : delegate.hashCode();
	}

	/**
	 * Sets the real observable (which may be a dynamic proxy) to report as the source of events and the target of getter calls in the {@link ObservableTracker}.
	 *
	 * @param realObservable
	 *            my event source
	 */
	final void setRealObservable(T realObservable) {
		this.realObservable = realObservable;
	}

	/**
	 * Gets the source to report for events (which may be a dynamic proxy).
	 *
	 * @return my event source
	 */
	final T getRealObservable() {
		return realObservable;
	}

	@Override
	protected final void fireChange() {
		fireEvent(new ChangeEvent(getRealObservable()));
	}

	@Override
	protected final void fireStale() {
		fireEvent(new StaleEvent(getRealObservable()));
	}

	@Override
	public void dispose() {
		if (!isDisposed()) {
			if (delegate != null) {
				unhookDelegate(delegate);

				// Release it only after this iteration of the event loop so that UI refreshes can still access it for now
				// in case its retain count will go to zero and it will be disposed
				ReferenceCountedObservable.Util.autorelease(delegate);
				delegate = null;
			}
			super.dispose();
		}
	}

	@Override
	protected void fireEvent(ObservableEvent event) {
		// ensure the correct source for events fired by the superclass
		if ((event instanceof DisposeEvent) && (event.getSource() != getRealObservable())) {
			event = new DisposeEvent(getRealObservable());
		}

		super.fireEvent(event);
	}

	private IChangeListener getForwardingChangeListener() {
		if (forwardingChangeListener == null) {
			forwardingChangeListener = new IChangeListener() {

				public void handleChange(ChangeEvent event) {
					DelegatingObservable.this.fireChange();
				}
			};
		}

		return forwardingChangeListener;
	}

	private IStaleListener getForwardingStaleListener() {
		if (forwardingStaleListener == null) {
			forwardingStaleListener = new IStaleListener() {

				public void handleStale(StaleEvent staleEvent) {
					DelegatingObservable.this.fireStale();
				}
			};
		}

		return forwardingStaleListener;
	}

	private IDisposeListener getDelegateDisposeListener() {
		if (delegateDisposeListener == null) {
			delegateDisposeListener = new IDisposeListener() {

				public void handleDispose(DisposeEvent event) {
					if (event.getObservable() == getDelegate()) {
						clearDelegate();
					}
				}
			};
		}

		return delegateDisposeListener;
	}
}
