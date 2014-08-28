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

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.IObserving;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;


/**
 * Test suite for both the simple and the detail variants of the {@link DelegatingObservableValue} class.
 */
@RunWith(Enclosed.class)
public abstract class DelegatingObservableValueTest extends DelegatingObservableTest<IObservableValue> {

	Bean bean;

	Object expectedValue;

	Object valueToSet;

	@Test
	public void testAddRemoveValueChangeListener() {
		class TestListener implements IValueChangeListener {

			int count;

			@Override
			public void handleValueChange(ValueChangeEvent event) {
				assertThat(event.getObservable(), sameInstance((IObservable) fixture));

				count++;
			}
		}
		;

		final TestListener l = new TestListener();

		fixture.addValueChangeListener(l);
		doChange();
		assertThat(l.count, is(1));
		fixture.removeValueChangeListener(l);
		doChange();
		assertThat(l.count, is(1)); // Not notified this time
	}

	@Test
	public void testGetValueType() {
		assertThat(fixture.getValueType(), is((Object) expectedValue.getClass()));
	}

	@Test
	public void testGetValue() {
		assertExpectedValue();
	}

	@Test
	public void testSetValue() {
		doChange();
		assertExpectedValue();
	}

	//
	// Test framework
	//

	@Override
	protected void doChange() {
		fixture.setValue(valueToSet);

		Object swap = valueToSet;
		valueToSet = expectedValue;
		expectedValue = swap;
	}

	void assertExpectedValue() {
		assertThat(fixture.getValue(), is(expectedValue));
	}

	//
	// Test suites
	//

	@RunWith(RealmRunner.class)
	public static class ValueTest extends DelegatingObservableValueTest {

		//
		// Test framework
		//

		@Override
		protected Class<? extends IObservableValue> getDelegateType() {
			return WritableValue.class;
		}

		@Override
		protected void preCreateFixture() {
			houseKeeper.setField("bean", new Bean("Alice"));

			houseKeeper.setField("expectedValue", bean);
			houseKeeper.setField("valueToSet", new Bean("Bert"));
		}

		@Override
		protected IObservableValue createDelegate() {
			return new WritableValue(realm, bean, Bean.class);
		}
	}

	@RunWith(RealmRunner.class)
	public static class ObservingTest extends DelegatingObservableValueTest {

		private IObservableValue master;

		@Override
		@Test
		public void testGetObserved() {
			assertThat(((IObserving) fixture).getObserved(), is((Object) bean));
		}

		//
		// Test framework
		//

		@SuppressWarnings("restriction")
		@Override
		protected Class<? extends IObservableValue> getDelegateType() {
			return org.eclipse.core.internal.databinding.beans.BeanObservableValueDecorator.class;
		}

		@Override
		protected void preCreateFixture() {
			houseKeeper.setField("bean", new Bean("Alice"));
			houseKeeper.setField("master", houseKeeper.cleanUpLater(new WritableValue(realm, bean, Bean.class)));

			houseKeeper.setField("expectedValue", "Alice");
			houseKeeper.setField("valueToSet", "Bert");
		}

		@Override
		protected IObservableValue createDelegate() {
			return BeansObservables.observeDetailValue(master, "name", String.class);
		}

		@Override
		protected IObservableValue createNonObservingDelegate() {
			return new WritableValue(realm, bean, Bean.class);
		}
	}
}


class Bean {

	private final PropertyChangeSupport bean = new PropertyChangeSupport(this);

	private String name;

	Bean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		final String oldName = getName();
		this.name = name;
		bean.firePropertyChange("name", oldName, getName());
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
