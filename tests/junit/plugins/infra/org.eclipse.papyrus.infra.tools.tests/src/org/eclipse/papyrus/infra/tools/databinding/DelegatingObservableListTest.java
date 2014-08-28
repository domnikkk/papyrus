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

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.IObserving;
import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.ListDiff;
import org.eclipse.core.databinding.observable.list.ListDiffEntry;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;


/**
 * Test suite for both the simple and the detail variants of the {@link DelegatingObservableList} class.
 */
@RunWith(Enclosed.class)
public abstract class DelegatingObservableListTest extends DelegatingObservableCollectionTest<IObservableList> {

	@Test
	public void testAddListChangeListener() {
		class ListListener implements IListChangeListener {

			ListDiff diff;

			List<Object> additions() {
				List<Object> result = Lists.newArrayList();

				for (ListDiffEntry next : diff.getDifferences()) {
					if (next.isAddition()) {
						result.add(next.getElement());
					}
				}

				return result;
			}

			@Override
			public void handleListChange(ListChangeEvent event) {
				assertThat(event.getObservable(), sameInstance((IObservable) fixture));

				diff = event.diff;
			}
		}

		ListListener l = new ListListener();

		fixture.addListChangeListener(l);

		doChange();

		assertThat(l.diff, notNullValue());
		assertThat(l.additions(), hasItems(valuesToAdd.toArray()));

		l.diff = null;

		fixture.removeListChangeListener(l);

		delegate.clear();

		assertThat(l.diff, nullValue()); // We weren't listening
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testAdd_index() {
		addToDelegate();

		fixture.add(1, "Edith");

		List<Object> expected = Lists.newArrayList(valuesToAdd);
		expected.add(1, "Edith");

		assertThat(delegateList(), is(expected));
	}

	@Test
	public void testAddAll_index() {
		addToDelegate();

		List<String> newNames = ImmutableList.of("Edit", "Frank");
		fixture.addAll(1, newNames);

		List<Object> expected = Lists.newArrayList(valuesToAdd);
		expected.addAll(1, newNames);

		assertThat(delegateList(), is(expected));
	}

	@TrackedGetterTest
	@Test
	public void testGet_index() {
		addToDelegate();

		assertThat(fixture.get(2), is((Object) "Cathy"));
	}

	@Test
	public void testSet_index() {
		addToDelegate();

		assertThat(fixture.set(2, "Colleen"), is((Object) "Cathy"));
		assertThat(delegate.get(2), is((Object) "Colleen"));
	}

	@Test
	public void testMove() {
		addToDelegate();

		fixture.move(2, 1);
		assertThat(delegateList(), is((List<Object>) ImmutableList.<Object> of("Alice", "Cathy", "Bert", "Dave")));
	}

	@Test
	public void testRemove_int() {
		addToDelegate();

		fixture.remove(2);

		List<Object> expected = Lists.newArrayList(valuesToAdd);
		expected.remove(2);

		assertThat(delegateList(), is(expected));
	}

	@TrackedGetterTest
	@Test
	public void testIndexOf() {
		addToDelegate();

		assertThat(fixture.indexOf("Cathy"), is(2));
	}

	@SuppressWarnings("unchecked")
	@TrackedGetterTest
	@Test
	public void testLastIndexOf() {
		addToDelegate();

		delegate.add(3, "Bert"); // Already have a Bert at index 1

		assertThat(fixture.lastIndexOf("Bert"), is(3));
	}

	@TrackedGetterTest
	@Test
	public void testListIterator() {
		addToDelegate();

		@SuppressWarnings("unchecked")
		ListIterator<Object> iter = fixture.listIterator();
		assertThat(iter.hasNext(), is(true));
		assertThat(iter.next(), is((Object) "Alice"));
		assertThat(iter.hasNext(), is(true));
		assertThat(iter.next(), is((Object) "Bert"));
	}

	@TrackedGetterTest
	@Test
	public void testListIterator_index() {
		addToDelegate();

		@SuppressWarnings("unchecked")
		ListIterator<Object> iter = fixture.listIterator(delegate.size());
		assertThat(iter.hasPrevious(), is(true));
		assertThat(iter.previous(), is((Object) "Dave"));
		assertThat(iter.hasPrevious(), is(true));
		assertThat(iter.previous(), is((Object) "Cathy"));
	}

	@TrackedGetterTest
	@Test
	public void testSubList() {
		addToDelegate();

		@SuppressWarnings("unchecked")
		List<Object> subList = fixture.subList(1, 3);

		assertThat(subList, is((List<Object>) ImmutableList.<Object> of("Bert", "Cathy")));
	}

	//
	// Test framework
	//

	@Override
	protected Class<?> getDelegateElementType() {
		return String.class;
	}

	@Override
	protected void doChange() {
		addAll();
	}

	List<Object> delegateList() {
		return (List<Object>) delegateCollection();
	}

	//
	// Test suites
	//

	@RunWith(RealmRunner.class)
	public static class ListTest extends DelegatingObservableListTest {

		//
		// Test framework
		//

		@Override
		protected Class<? extends IObservableList> getDelegateType() {
			return WritableList.class;
		}

		@Override
		protected void preCreateFixture() {
			houseKeeper.setField("valuesToAdd", ImmutableList.of("Alice", "Bert", "Cathy", "Dave"));
			houseKeeper.setField("valuesToRemove", ImmutableList.of("Bert", "Cathy"));
		}

		@Override
		protected IObservableList createDelegate() {
			return new WritableList(realm, Lists.newArrayList(), String.class);
		}
	}

	@RunWith(RealmRunner.class)
	public static class ObservingTest extends DelegatingObservableListTest {

		private ListOfNames list;

		private IObservableValue master;

		@Override
		@Test
		public void testGetObserved() {
			assertThat(((IObserving) fixture).getObserved(), is((Object) list));
		}

		//
		// Test framework
		//

		@SuppressWarnings("restriction")
		@Override
		protected Class<? extends IObservableList> getDelegateType() {
			return org.eclipse.core.internal.databinding.beans.BeanObservableListDecorator.class;
		}

		@Override
		protected void preCreateFixture() {
			houseKeeper.setField("list", new ListOfNames());
			houseKeeper.setField("master", houseKeeper.cleanUpLater(new WritableValue(realm, list, ListOfNames.class)));

			houseKeeper.setField("valuesToAdd", ImmutableList.of("Alice", "Bert", "Cathy", "Dave"));
			houseKeeper.setField("valuesToRemove", ImmutableList.of("Bert", "Cathy"));
		}

		@Override
		protected IObservableList createDelegate() {
			return BeansObservables.observeDetailList(master, "names", String.class);
		}

		@Override
		protected IObservableList createNonObservingDelegate() {
			return new WritableList(realm, Lists.newArrayList(), String.class);
		}

		public static class ListOfNames {

			private final PropertyChangeSupport bean = new PropertyChangeSupport(this);

			private List<String> names;

			ListOfNames(String... initial) {
				names = Lists.newArrayList(initial);
			}

			public String[] getNames() {
				return names.toArray(new String[names.size()]);
			}

			public void setNames(String... name) {
				final String[] oldValue = getNames();
				this.names = Lists.newArrayList(name);
				bean.firePropertyChange("names", oldValue, getNames());
			}

			public String getName(int index) {
				return names.get(index);
			}

			public String setName(int index, String name) {
				final String oldName = getName(index);
				String result = names.set(index, name);
				bean.fireIndexedPropertyChange("names", index, oldName, name);
				return result;
			}

			public void addPropertyChangeListener(PropertyChangeListener listener) {
				bean.addPropertyChangeListener(listener);
			}

			public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
				bean.addPropertyChangeListener(propertyName, listener);
			}

			public void removePropertyChangeListener(PropertyChangeListener listener) {
				bean.removePropertyChangeListener(listener);
			}

			public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
				bean.removePropertyChangeListener(propertyName, listener);
			}
		}
	}

}
