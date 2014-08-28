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

import java.util.Collections;
import java.util.Set;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.set.SetChangeEvent;
import org.eclipse.core.databinding.observable.set.SetDiff;


/**
 * This is the DelegatingObservableSet type. Enjoy.
 */
public class DelegatingObservableSet extends DelegatingObservableCollection<IObservableSet> implements IObservableSet {

	private static final Object SET_EVENT_TYPE = new Object();

	private ISetChangeListener forwardingSetChangeListener;

	DelegatingObservableSet(IObservableSet delegate) {
		super(delegate, IObservableSet.class);
	}

	DelegatingObservableSet(Realm realm) {
		super(realm, IObservableSet.class);
	}

	public static IObservableSet wrap(IObservableSet observable) {
		IObservableSet result;

		if (observable instanceof IDelegatingObservable) {
			// Already have a delegator. Just create another like it
			try {
				result = observable.getClass().getDeclaredConstructor(IObservableSet.class).newInstance(observable);
			} catch (Exception e) {
				// Seems unlikely as I must have created the observable in the first place
				throw new IllegalArgumentException("observable is an invalid implementation of IDelegatingObservable", e); //$NON-NLS-1$
			}
		} else {
			result = DelegatingInvocationHandler.wrap(new DelegatingObservableSet(observable), IObservableSet.class);
		}

		return result;
	}

	public static IObservableSet create(Realm realm, ClassLoader loader, Class<?>... mixins) {
		return DelegatingInvocationHandler.wrap(new DelegatingObservableSet(realm), IObservableSet.class, loader, mixins);
	}

	public void addSetChangeListener(ISetChangeListener listener) {
		addListener(SET_EVENT_TYPE, listener);
	}

	public void removeSetChangeListener(ISetChangeListener listener) {
		removeListener(SET_EVENT_TYPE, listener);
	}

	@Override
	protected void hookDelegate(IObservableSet delegate) {
		super.hookDelegate(delegate);
		delegate.addSetChangeListener(getForwardingSetChangeListener());
	}

	@Override
	protected void unhookDelegate(IObservableSet delegate) {
		delegate.removeSetChangeListener(getForwardingSetChangeListener());
		super.unhookDelegate(delegate);
	}

	@Override
	protected void delegateChanged(IObservableSet oldDelegate, IObservableSet newDelegate) {
		super.delegateChanged(oldDelegate, newDelegate);

		Set<?> oldSet = ((oldDelegate == null) || oldDelegate.isDisposed()) ? Collections.EMPTY_SET : oldDelegate;
		Set<?> newSet = (newDelegate == null) ? Collections.EMPTY_SET : newDelegate;

		fireEvent(new MySetChangeEvent(Diffs.computeSetDiff(oldSet, newSet)));
	}

	private ISetChangeListener getForwardingSetChangeListener() {
		if (forwardingSetChangeListener == null) {
			forwardingSetChangeListener = new ISetChangeListener() {

				public void handleSetChange(SetChangeEvent event) {
					SetChangeEvent myEvent = new MySetChangeEvent(event.diff);
					fireEvent(myEvent);
				}
			};
		}

		return forwardingSetChangeListener;
	}

	//
	// Nested types
	//

	class MySetChangeEvent extends SetChangeEvent {

		private static final long serialVersionUID = 1L;

		MySetChangeEvent(SetDiff diff) {
			super(getRealObservable(), diff);
		}

		@Override
		protected Object getListenerType() {
			// We implement our own listener type because the type from the core framework is not accessible
			return SET_EVENT_TYPE;
		}
	}

}
