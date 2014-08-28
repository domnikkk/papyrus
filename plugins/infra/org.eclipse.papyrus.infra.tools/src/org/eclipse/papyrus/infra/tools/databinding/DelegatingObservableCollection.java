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
import java.util.Iterator;

import org.eclipse.core.databinding.observable.IObservableCollection;
import org.eclipse.core.databinding.observable.Realm;


/**
 * This is the DelegatingObservableCollection type. Enjoy.
 */
public abstract class DelegatingObservableCollection<T extends IObservableCollection> extends DelegatingObservable<T> implements IObservableCollection {

	private static final Object[] EMPTY_ARRAY = {};

	DelegatingObservableCollection(T delegate, Class<T> delegateType) {
		super(delegate, delegateType);
	}

	DelegatingObservableCollection(Realm realm, Class<T> delegateType) {
		super(realm, delegateType);
	}

	@Override
	public boolean equals(Object obj) {
		getterCalled();

		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		getterCalled();

		return super.hashCode();
	}

	public int size() {
		getterCalled();

		return (getDelegate() == null) ? 0 : getDelegate().size();
	}

	public boolean isEmpty() {
		getterCalled();

		return (getDelegate() == null) ? true : getDelegate().isEmpty();
	}

	public boolean contains(Object o) {
		getterCalled();

		return (getDelegate() == null) ? false : getDelegate().contains(o);
	}

	@SuppressWarnings("rawtypes")
	public Iterator iterator() {
		getterCalled();

		return (getDelegate() == null) ? Collections.EMPTY_LIST.iterator() : getDelegate().iterator();
	}

	public Object[] toArray() {
		getterCalled();

		return (getDelegate() == null) ? EMPTY_ARRAY : getDelegate().toArray();
	}

	@SuppressWarnings("unchecked")
	public Object[] toArray(Object[] a) {
		getterCalled();

		return (getDelegate() == null) ? Collections.EMPTY_LIST.toArray(a) : getDelegate().toArray(a);
	}

	@SuppressWarnings("unchecked")
	public boolean add(Object e) {
		return (getDelegate() == null) ? false : getDelegate().add(e);
	}

	public boolean remove(Object o) {
		return (getDelegate() == null) ? false : getDelegate().remove(o);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean containsAll(Collection c) {
		getterCalled();

		return (getDelegate() == null) ? false : getDelegate().containsAll(c);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean addAll(Collection c) {
		return (getDelegate() == null) ? false : getDelegate().addAll(c);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean removeAll(Collection c) {
		return (getDelegate() == null) ? false : getDelegate().removeAll(c);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean retainAll(Collection c) {
		return (getDelegate() == null) ? false : getDelegate().retainAll(c);
	}

	public void clear() {
		if (getDelegate() != null) {
			getDelegate().clear();
		}
	}

	public Object getElementType() {
		return (getDelegate() == null) ? null : getDelegate().getElementType();
	}

}
