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

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.databinding.observable.IObservableCollection;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;


/**
 * Abstract test framework for {@link DelegatingObservableCollection}s of various kinds.
 */
public abstract class DelegatingObservableCollectionTest<T extends IObservableCollection> extends DelegatingObservableTest<T> {

	Collection<?> valuesToAdd;

	Collection<?> valuesToRemove;

	@TrackedGetterTest
	@Test
	public void testSize() {
		assertThat(fixture.size(), is(delegate.size()));
		addToDelegate();
		assertThat(fixture.size(), is(delegate.size()));
		removeFromDelegate();
		assertThat(fixture.size(), is(delegate.size()));
		delegate.clear();
		assertThat(fixture.size(), is(0));

		// Edge case
		delegator().setDelegate(null);
		assertThat(fixture.size(), is(0));
	}

	@TrackedGetterTest
	@Test
	public void testIsEmpty() {
		assertThat(fixture.isEmpty(), is(true));
		addToDelegate();
		assertThat(fixture.isEmpty(), is(false));

		// Edge case
		delegator().setDelegate(null);
		assertThat(fixture.isEmpty(), is(true));
	}

	@TrackedGetterTest
	@Test
	public void testContains() {
		final Object o = aValueToAdd();

		assertThat(fixture.contains(o), is(false));
		addToDelegate();
		assertThat(fixture.contains(o), is(true));

		// Edge case
		delegator().setDelegate(null);
		assertThat(fixture.contains(o), is(false));
	}

	@TrackedGetterTest
	@Test
	public void testIterator() {
		assertThat(fixture.iterator().hasNext(), is(false));
		addToDelegate();
		assertThat(ImmutableList.copyOf(iterator(fixture)), is(ImmutableList.copyOf(iterator(delegate))));

		// Edge case
		delegator().setDelegate(null);
		assertThat(fixture.iterator().hasNext(), is(false));
	}

	@TrackedGetterTest
	@Test
	public void testToArray() {
		assertThat(fixture.toArray().length, is(0));
		addToDelegate();
		assertThat(fixture.toArray(), isArray(delegate.toArray()));

		// Edge case
		delegator().setDelegate(null);
		assertThat(fixture.toArray().length, is(0));
	}

	@TrackedGetterTest
	@SuppressWarnings("unchecked")
	@Test
	public void testToArray_Array() {
		assertThat(fixture.toArray(newArray()).length, is(0));

		addToDelegate();
		Object[] actual = fixture.toArray(newArray());
		assertThat(actual.length, is(valuesToAdd.size()));
		assertThat(actual, isArray(delegate.toArray(newArray())));

		// Edge case
		delegator().setDelegate(null);
		assertThat(fixture.toArray(newArray()).length, is(0));
	}

	@Test
	public void testAdd() {
		final Object o = aValueToAdd();

		add(o);
		assertThat(delegateCollection(), hasItem(o));
	}

	@Test
	public void testRemove() {
		final Object o = aValueToAdd();

		addToDelegate();

		remove(o);
		assertThat(delegateCollection(), not(hasItem(o)));
	}

	@SuppressWarnings("unchecked")
	@TrackedGetterTest
	@Test
	public void testContainsAll() {
		addToDelegate();

		assertThat(fixture.containsAll(valuesToAdd), is(true));
	}

	@Test
	public void testAddAll() {
		addAll();

		assertThat(delegateCollection(), hasItems(valuesToAdd.toArray()));
	}

	@Test
	public void testRemoveAll() {
		addToDelegate();

		assertThat(delegateCollection(), hasItems(valuesToRemove.toArray()));

		removeAll();
		assertThat(delegateCollection(), not(hasItem(in(valuesToRemove))));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testRetainAll() {
		addToDelegate();

		fixture.retainAll(valuesToRemove);

		assertThat(delegateCollection(), hasItems(valuesToRemove.toArray()));
		assertThat(delegate.size(), is(valuesToRemove.size())); // Nothing else
	}

	@Test
	public void testClear() {
		addAll();

		assertThat(delegate.isEmpty(), is(false));

		fixture.clear();

		assertThat(delegate.isEmpty(), is(true));
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.infra.tools.databinding.DelegatingObservableCollection#getElementType()}.
	 */
	@Test
	public void testGetElementType() {
		assertThat(fixture.getElementType(), is((Object) getDelegateElementType()));

		// Edge case
		delegator().setDelegate(null);
		assertThat(fixture.getElementType(), nullValue());
	}

	// This is a tracked getter for collections
	@Override
	@TrackedGetterTest
	@Test
	public void testEquals() {
		super.testEquals();
	}

	// This is a tracked getter for collections
	@Override
	@TrackedGetterTest
	@Test
	public void testHashCode() {
		super.testHashCode();
	}

	//
	// Test framework
	//

	protected abstract Class<?> getDelegateElementType();

	Object[] newArray() {
		return (Object[]) Array.newInstance(getDelegateElementType(), 0);
	}

	Object aValueToAdd() {
		// Don't just get the first one, because that's an edge
		return Iterables.get(valuesToAdd, 1, null);
	}

	@SuppressWarnings("unchecked")
	void addToDelegate() {
		delegate.addAll(valuesToAdd);
	}

	@SuppressWarnings("unchecked")
	void add(Object o) {
		fixture.add(o);
	}

	@SuppressWarnings("unchecked")
	void addAll() {
		fixture.addAll(valuesToAdd);
	}

	@SuppressWarnings("unchecked")
	void removeFromDelegate() {
		delegate.removeAll(valuesToRemove);
	}

	void remove(Object o) {
		fixture.remove(o);
	}

	@SuppressWarnings("unchecked")
	void removeAll() {
		fixture.removeAll(valuesToRemove);
	}

	@SuppressWarnings("unchecked")
	<E> Collection<E> delegateCollection() {
		return delegate;
	}

	Iterator<?> iterator(IObservableCollection c) {
		return c.iterator();
	}

	Matcher<Object[]> isArray(final Object[] array) {
		return new BaseMatcher<Object[]>() {

			@Override
			public void describeTo(Description description) {
				description.appendText("equal to array ").appendValueList("[", ",  ", "]", array);
			}

			@Override
			public boolean matches(Object item) {
				return (item instanceof Object[]) && Arrays.equals((Object[]) item, array);
			}
		};
	}

	Matcher<Object> in(final Collection<?> extent) {
		return new BaseMatcher<Object>() {

			@Override
			public void describeTo(Description description) {
				description.appendText("contained in ").appendValueList("[", ",  ", "]", extent);
			}

			@Override
			public boolean matches(Object item) {
				return extent.contains(item);
			}
		};
	}
}
