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

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.ListDiff;


/**
 * This is the DelegatingObservableList type. Enjoy.
 */
public class DelegatingObservableList extends DelegatingObservableCollection<IObservableList> implements IObservableList {

	private static final Object LIST_EVENT_TYPE = new Object();

	private IListChangeListener forwardingListChangeListener;

	DelegatingObservableList(IObservableList delegate) {
		super(delegate, IObservableList.class);
	}

	DelegatingObservableList(Realm realm) {
		super(realm, IObservableList.class);
	}

	public static IObservableList wrap(IObservableList observable) {
		IObservableList result;

		if (observable instanceof IDelegatingObservable) {
			// Already have a delegator. Just create another like it
			try {
				result = observable.getClass().getDeclaredConstructor(IObservableList.class).newInstance(observable);
			} catch (Exception e) {
				// Seems unlikely as I must have created the observable in the first place
				throw new IllegalArgumentException("observable is an invalid implementation of IDelegatingObservable", e); //$NON-NLS-1$
			}
		} else {
			result = DelegatingInvocationHandler.wrap(new DelegatingObservableList(observable), IObservableList.class);
		}

		return result;
	}

	public static IObservableList create(Realm realm, ClassLoader loader, Class<?>... mixins) {
		return DelegatingInvocationHandler.wrap(new DelegatingObservableList(realm), IObservableList.class, loader, mixins);
	}

	public void addListChangeListener(IListChangeListener listener) {
		addListener(LIST_EVENT_TYPE, listener);
	}

	public void removeListChangeListener(IListChangeListener listener) {
		removeListener(LIST_EVENT_TYPE, listener);
	}

	@Override
	protected void hookDelegate(IObservableList delegate) {
		super.hookDelegate(delegate);
		delegate.addListChangeListener(getForwardingListChangeListener());
	}

	@Override
	protected void unhookDelegate(IObservableList delegate) {
		delegate.removeListChangeListener(getForwardingListChangeListener());
		super.unhookDelegate(delegate);
	}

	@Override
	protected void delegateChanged(IObservableList oldDelegate, IObservableList newDelegate) {
		super.delegateChanged(oldDelegate, newDelegate);

		List<?> oldList = ((oldDelegate == null) || oldDelegate.isDisposed()) ? Collections.EMPTY_LIST : oldDelegate;
		List<?> newList = (newDelegate == null) ? Collections.EMPTY_LIST : newDelegate;

		fireEvent(new MyListChangeEvent(Diffs.computeListDiff(oldList, newList)));
	}

	@SuppressWarnings("unchecked")
	public void add(int index, Object element) {
		if (getDelegate() == null) {
			throw new IndexOutOfBoundsException();
		}
		getDelegate().add(index, element);
	}

	@SuppressWarnings("rawtypes")
	public boolean addAll(int index, Collection c) {
		if (getDelegate() == null) {
			throw new IndexOutOfBoundsException();
		}
		return getDelegate().addAll(index, c);
	}

	public Object get(int index) {
		getterCalled();

		if (getDelegate() == null) {
			throw new IndexOutOfBoundsException();
		}
		return getDelegate().get(index);
	}

	public Object set(int index, Object element) {
		if (getDelegate() == null) {
			throw new IndexOutOfBoundsException();
		}
		return getDelegate().set(index, element);
	}

	public Object move(int oldIndex, int newIndex) {
		if (getDelegate() == null) {
			throw new IndexOutOfBoundsException();
		}
		return getDelegate().move(oldIndex, newIndex);
	}

	public Object remove(int index) {
		return (getDelegate() == null) ? Collections.EMPTY_LIST.remove(index) : getDelegate().remove(index);
	}

	public int indexOf(Object o) {
		getterCalled();

		return (getDelegate() == null) ? -1 : getDelegate().indexOf(o);
	}

	public int lastIndexOf(Object o) {
		getterCalled();

		return (getDelegate() == null) ? -1 : getDelegate().lastIndexOf(o);
	}

	@SuppressWarnings("rawtypes")
	public ListIterator listIterator() {
		getterCalled();

		return (getDelegate() == null) ? Collections.EMPTY_LIST.listIterator() : getDelegate().listIterator();
	}

	@SuppressWarnings("rawtypes")
	public ListIterator listIterator(int index) {
		getterCalled();

		return (getDelegate() == null) ? Collections.EMPTY_LIST.listIterator(index) : getDelegate().listIterator(index);
	}

	@SuppressWarnings("rawtypes")
	public List subList(int fromIndex, int toIndex) {
		getterCalled();

		return (getDelegate() == null) ? Collections.EMPTY_LIST.subList(fromIndex, toIndex) : getDelegate().subList(fromIndex, toIndex);
	}

	private IListChangeListener getForwardingListChangeListener() {
		if (forwardingListChangeListener == null) {
			forwardingListChangeListener = new IListChangeListener() {

				public void handleListChange(ListChangeEvent event) {
					ListChangeEvent myEvent = new MyListChangeEvent(event.diff);
					fireEvent(myEvent);
				}
			};
		}

		return forwardingListChangeListener;
	}

	//
	// Nested types
	//

	class MyListChangeEvent extends ListChangeEvent {

		private static final long serialVersionUID = 1L;

		MyListChangeEvent(ListDiff diff) {
			super(getRealObservable(), diff);
		}

		@Override
		protected Object getListenerType() {
			// We implement our own listener type because the type from the core framework is not accessible
			return LIST_EVENT_TYPE;
		}
	}
}
