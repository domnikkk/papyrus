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

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.DisposeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.IDisposeListener;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.IObserving;
import org.eclipse.core.databinding.observable.IStaleListener;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.StaleEvent;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.papyrus.junit.utils.Duck;
import org.eclipse.papyrus.junit.utils.rules.Condition;
import org.eclipse.papyrus.junit.utils.rules.Conditional;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


/**
 * Abstract test framework for {@link DelegatingObservable}s of various kinds.
 */
public abstract class DelegatingObservableTest<T extends IObservable> extends AbstractPapyrusTest {

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	protected static Realm realm;

	@ObservableFixture
	public T fixture;

	protected T delegate;

	@Test
	public void testWrap() {
		assertThat(fixture, instanceOf(getFixtureType()));
	}

	@Test
	public void testCreate() {
		IObservable observable = houseKeeper.cleanUpLater(DelegatingObservable.create(realm, getInterface(getDelegateType())));
		assertThat(observable, instanceOf(getFixtureType()));
	}

	@Test
	public void testCreate_withObserving() {
		IObservable observable = houseKeeper.cleanUpLater(DelegatingObservable.create(realm, getInterface(getDelegateType())));
		assertThat(observable, instanceOf(getFixtureType()));

		observable = houseKeeper.cleanUpLater(DelegatingObservable.create(realm, getInterface(getDelegateType()), loader(), IObserving.class));
		assertThat(observable, instanceOf(getFixtureType()));
		assertThat(observable, instanceOf(IObserving.class));
	}

	@Test
	public void testSetDelegate() {
		ChangeCounter counter = new ChangeCounter(fixture);

		delegator().setDelegate(createObservable());

		assertThat(counter.count(), is(1));
	}

	@Conditional(key = "isObserving")
	@Test
	public void testGetObserved() {
		IObserving observing = (IObserving)fixture;
		assertThat(observing.getObserved(), notNullValue());
		assertThat(observing.getObserved(), is(((IObserving)delegate).getObserved()));
	}

	@Test
	public void testAddRemoveChangeListener() {
		ChangeCounter counter = new ChangeCounter(fixture);

		doChange();

		assertThat(counter.count(), is(1));

		fixture.removeChangeListener(counter);

		doChange();

		assertThat(counter.count(), is(1)); // Wasn't listening for second change
	}

	@Conditional(key = "supportsStale")
	@TrackedGetterTest
	@Test
	public void testIsStale() {
		assertThat(fixture.isStale(), is(false));

		new Duck(delegate).quack("setStale", true);

		assertThat(fixture.isStale(), is(true));
	}

	@Conditional(key = "supportsStale")
	@Test
	public void testAddRemoveStaleListener() {
		class StaleListener implements IStaleListener {

			int count;

			@Override
			public void handleStale(StaleEvent staleEvent) {
				count++;
				assertThat(staleEvent.getObservable(), sameInstance((IObservable)fixture));
			}
		}

		StaleListener l = new StaleListener();

		fixture.addStaleListener(l);
		new Duck(delegate).quack("setStale", true);

		assertThat(l.count, is(1));
	}

	@Test
	public void testAddDisposeListener() {
		DisposeCounter counter = new DisposeCounter(fixture);

		fixture.dispose();
		fixture.dispose(); // Repeat

		assertThat(counter.count, is(1)); // Dispose is idempotent
	}

	@Test
	public void testDispose() {
		fixture.dispose();

		assertThat(delegator().getDelegate(), nullValue());

		// Disposing the delegator does not dispose the delegate
		assertThat(delegate.isDisposed(), is(false));
	}

	@Test
	public void testAutoreleaseDelegate() {
		DisposeCounter counter = new DisposeCounter(delegator().getDelegate());

		delegator().setDelegate(null);

		// Forcible drain the realm's auto-release pool. If this results in the
		// delegate being disposed, then we'll know that it's because the delegator
		// auto-released it and we just kicked its retain count to zero
		ReferenceCountedObservable.AutoReleasePool.get(realm).release();

		// The delegate's retain count should go to zero, resulting in disposal
		assertThat(counter.count(), is(1));
	}

	@Test
	public void testIsDisposed() {
		assertThat(fixture.isDisposed(), is(false));

		fixture.dispose();

		assertThat(fixture.isDisposed(), is(true));
	}

	@Test
	public void testGetRealm() {
		assertThat(fixture.getRealm(), is(realm));
	}

	@Test
	public void testEquals() {
		assertThat(fixture, equalTo(delegate));
	}

	@Test
	public void testHashCode() {
		assertThat(fixture.hashCode(), is(delegate.hashCode()));
	}

	/**
	 * Tests the case where we create an observable that delegates to an observable that is, itself, a delegating observable.
	 */
	@Test
	public void testDelegatingToDelegator() {
		IObservable redelegator = DelegatingObservable.wrap(fixture);
		assertThat(redelegator, notNullValue());

		// The wrapping delegator trivially is of the same class as its delegate
		assertThat((Object)redelegator.getClass(), sameInstance((Object)fixture.getClass()));

		// But, of course, it is a different instance
		assertThat(redelegator, not(sameInstance((IObservable)fixture)));

		// And it properly delegates
		assertThat(((IDelegatingObservable)redelegator).getDelegate(), sameInstance((IObservable)fixture));
	}

	//
	// Test framework
	//

	@Before
	public void createFixture() {
		preCreateFixture();

		houseKeeper.setField("delegate", createDelegate());
		houseKeeper.setField("fixture", DelegatingObservable.wrap(delegate));
	}

	protected void preCreateFixture() {
		// Pass
	}

	protected abstract Class<? extends T> getDelegateType();

	protected abstract void doChange();

	ClassLoader loader() {
		return getClass().getClassLoader();
	}

	protected IDelegatingObservable delegator() {
		return (IDelegatingObservable)fixture;
	}

	protected T createObservable() {
		return houseKeeper.cleanUpLater(createDelegate());
	}

	protected T createDelegate() {
		try {
			return getDelegateType().getConstructor(Realm.class).newInstance(realm);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to create test delegate: " + e.getLocalizedMessage());
			return null; // Unreachable
		}
	}

	protected T createNonObservingDelegate() {
		return createDelegate();
	}

	@Condition
	public boolean isObserving() {
		return IObserving.class.isAssignableFrom(getDelegateType());
	}

	@Condition
	public boolean supportsStale() {
		try {
			return getDelegateType().getMethod("setStale", boolean.class) != null;
		} catch (Exception e) {
			// Clearly not supported
			return false;
		}
	}

	protected final Class<? extends IObservable> getFixtureType() {
		Class<?> delegateType = getDelegateType();

		if(IObservableSet.class.isAssignableFrom(delegateType)) {
			return IObservableSet.class;
		} else if(IObservableList.class.isAssignableFrom(delegateType)) {
			return IObservableList.class;
		} else if(IObservableValue.class.isAssignableFrom(delegateType)) {
			return IObservableValue.class;
		} else {
			fail("Invalid delegate type: " + delegateType);
			return null; // Unreachable
		}
	}

	private static Class<? extends IObservable> getInterface(Class<? extends IObservable> instanceClass) {
		Class<? extends IObservable> result = IObservable.class;

		if(IObservableSet.class.isAssignableFrom(instanceClass)) {
			result = IObservableSet.class;
		} else if(IObservableList.class.isAssignableFrom(instanceClass)) {
			result = IObservableList.class;
		} else if(IObservableValue.class.isAssignableFrom(instanceClass)) {
			result = IObservableValue.class;
		}

		return result;
	}

	protected class ChangeCounter implements IChangeListener {

		private final IObservable expectedSource;

		protected ChangeCounter(IObservable observable) {
			expectedSource = observable;
			observable.addChangeListener(this);
		}

		private int count;

		int count() {
			return count;
		}

		@Override
		public void handleChange(ChangeEvent event) {
			count++;
			assertThat(event.getObservable(), sameInstance(expectedSource));
		}
	}

	protected class DisposeCounter implements IDisposeListener {

		private final IObservable expectedSource;

		protected DisposeCounter(IObservable observable) {
			expectedSource = observable;
			observable.addDisposeListener(this);
		}

		private int count;

		int count() {
			return count;
		}

		@Override
		public void handleDispose(DisposeEvent event) {
			count++;
			assertThat(event.getObservable(), sameInstance(expectedSource));
		}
	}
}
