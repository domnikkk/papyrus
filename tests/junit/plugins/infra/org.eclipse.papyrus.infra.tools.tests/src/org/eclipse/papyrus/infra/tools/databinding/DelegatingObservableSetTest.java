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
import java.util.Collections;
import java.util.Set;

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.IObserving;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.set.SetChangeEvent;
import org.eclipse.core.databinding.observable.set.SetDiff;
import org.eclipse.core.databinding.observable.set.WritableSet;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;


/**
 * Test suite for both the simple and the detail variants of the {@link DelegatingObservableSet} class.
 */
@RunWith(Enclosed.class)
public abstract class DelegatingObservableSetTest extends DelegatingObservableCollectionTest<IObservableSet> {

	@Test
	public void testAddRemoveSetChangeListener() {
		class SetListener implements ISetChangeListener {

			SetDiff diff;

			@SuppressWarnings("unchecked")
			Set<Object> additions() {
				return diff.getAdditions();
			}

			@Override
			public void handleSetChange(SetChangeEvent event) {
				assertThat(event.getObservable(), sameInstance((IObservable) fixture));

				diff = event.diff;
			}
		}

		SetListener l = new SetListener();

		fixture.addSetChangeListener(l);

		doChange();

		assertThat(l.diff, notNullValue());
		assertThat(l.additions(), hasItems(valuesToAdd.toArray()));

		l.diff = null;

		fixture.removeSetChangeListener(l);

		delegate.clear();

		assertThat(l.diff, nullValue()); // We weren't listening
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

	//
	// Test suites
	//

	@RunWith(RealmRunner.class)
	public static class SetTest extends DelegatingObservableSetTest {

		//
		// Test framework
		//

		@Override
		protected Class<? extends IObservableSet> getDelegateType() {
			return WritableSet.class;
		}

		@Override
		protected void preCreateFixture() {
			houseKeeper.setField("valuesToAdd", ImmutableList.of("Alice", "Bert", "Cathy", "Dave"));
			houseKeeper.setField("valuesToRemove", ImmutableList.of("Bert", "Cathy"));
		}

		@Override
		protected IObservableSet createDelegate() {
			return new WritableSet(realm, Collections.EMPTY_SET, String.class);
		}
	}

	@RunWith(RealmRunner.class)
	public static class ObservingTest extends DelegatingObservableSetTest {

		private SetOfStrings set;

		private IObservableValue master;

		@Override
		@Test
		public void testGetObserved() {
			assertThat(((IObserving) fixture).getObserved(), is((Object) set));
		}

		//
		// Test framework
		//

		@SuppressWarnings("restriction")
		@Override
		protected Class<? extends IObservableSet> getDelegateType() {
			return org.eclipse.core.internal.databinding.beans.BeanObservableSetDecorator.class;
		}

		@Override
		protected void preCreateFixture() {
			houseKeeper.setField("set", new SetOfStrings());
			houseKeeper.setField("master", houseKeeper.cleanUpLater(new WritableValue(realm, set, SetOfStrings.class)));

			houseKeeper.setField("valuesToAdd", ImmutableList.of("Alice", "Bert", "Cathy", "Dave"));
			houseKeeper.setField("valuesToRemove", ImmutableList.of("Bert", "Cathy"));
		}

		@Override
		protected IObservableSet createDelegate() {
			return BeansObservables.observeDetailSet(master, "strings", String.class);
		}

		@Override
		protected IObservableSet createNonObservingDelegate() {
			return new WritableSet(realm, Collections.EMPTY_SET, String.class);
		}

		public static class SetOfStrings {

			private final PropertyChangeSupport bean = new PropertyChangeSupport(this);

			private Set<String> strings;

			SetOfStrings(String... initial) {
				strings = Sets.newHashSet(initial);
			}

			public Set<String> getStrings() {
				return strings;
			}

			public void setStrings(Set<String> strings) {
				// Don't have to copy the set because we replace it
				final Set<String> oldStrings = Collections.unmodifiableSet(getStrings());
				this.strings = strings;
				bean.firePropertyChange("strings", oldStrings, Collections.unmodifiableSet(getStrings()));
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
