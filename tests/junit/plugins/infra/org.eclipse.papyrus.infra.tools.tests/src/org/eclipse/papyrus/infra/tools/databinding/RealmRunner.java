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
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.ObservableTracker;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.papyrus.junit.framework.classification.ClassificationRunner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;


/**
 * A custom test runner that runs tests in the thread (which is not the SWT UI thread!) of a data-bindings realm specially
 * designed for the purpose of JUnit testing.
 */
public class RealmRunner extends ClassificationRunner {

	public RealmRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}

	@Override
	protected Statement classBlock(RunNotifier notifier) {
		final Statement base = super.classBlock(notifier);
		return new Statement() {

			@Override
			public void evaluate() throws Throwable {
				DelegatingObservableTest.realm = new TestRealm();
				try {
					base.evaluate();
				} finally {
					((TestRealm) DelegatingObservableTest.realm).dispose();
					DelegatingObservableTest.realm = null;
				}
			}
		};
	}

	void basicRunChild(FrameworkMethod method, RunNotifier notifier) {
		super.runChild(method, notifier);
	}

	/**
	 * Schedules a test to run asynchronously on the realm's thread, waiting for it to finish there.
	 */
	@Override
	protected void runChild(final FrameworkMethod method, final RunNotifier notifier) {
		AsyncRunnable run = new AsyncRunnable() {

			@Override
			protected void doRun() {
				basicRunChild(method, notifier);
			}
		};

		DelegatingObservableTest.realm.exec(run);
		run.await();
	}

	@Override
	protected Statement methodInvoker(FrameworkMethod method, final Object test) {
		final Statement base = super.methodInvoker(method, test);
		Statement result = base;

		if (method.getAnnotation(TrackedGetterTest.class) != null) {
			result = new Statement() {

				@Override
				public void evaluate() throws Throwable {
					AsyncRunnable run = new AsyncRunnable() {

						@Override
						protected void doRun() throws Throwable {
							base.evaluate();
						}
					};

					// Don't actually need to listen to the tracked observables, just to collect them
					IObservable[] tracked = ObservableTracker.runAndMonitor(run, null, null);

					// This was not actually run asynchronously
					run.throwCaughtThrowable();

					IObservable observable = getObservableFixture(test);

					boolean found = false;
					for (int i = 0; !found && (i < tracked.length); i++) {
						found = tracked[i] == observable;
					}
					assertThat("Observable fixture did not invoke ObservableTracker::getterCalled()", found, is(true));
				}
			};
		}

		return result;
	}

	IObservable getObservableFixture(Object test) {
		List<IObservable> list = getTestClass().getAnnotatedFieldValues(test, ObservableFixture.class, IObservable.class);

		assertThat("No @ObservableFixture field found in test class.", list.isEmpty(), is(false));

		return list.get(0);
	}

	//
	// Nested types
	//

	private static class TestRealm extends Realm {

		private ExecutorService executor = Executors.newSingleThreadExecutor(new ThreadFactory() {

			@Override
			public Thread newThread(Runnable r) {
				realmThread = new Thread(r, "Test Realm");
				return realmThread;
			}
		});

		private volatile Thread realmThread;

		@Override
		public boolean isCurrent() {
			return Thread.currentThread() == realmThread;
		}

		@Override
		public void asyncExec(Runnable runnable) {
			executor.execute(runnable);
		}

		void dispose() {
			if (executor != null) {
				executor.shutdown();
				executor = null;
				realmThread = null;
			}
		}
	}

	static abstract class AsyncRunnable implements Runnable {

		private final CountDownLatch latch = new CountDownLatch(1);

		private Throwable thrown;

		@Override
		public void run() {
			try {
				doRun();
			} catch (Throwable e) {
				thrown = e;
			} finally {
				latch.countDown();
			}
		}

		protected abstract void doRun() throws Throwable;

		public void await() {
			try {
				latch.await();
			} catch (Exception e) {
				fail(e.getLocalizedMessage());
			}

			if (thrown instanceof Error) {
				throw (Error) thrown;
			} else if (thrown instanceof RuntimeException) {
				throw (RuntimeException) thrown;
			} else if (thrown instanceof Exception) {
				throw new RuntimeException(thrown);
			}
		}

		void throwCaughtThrowable() throws Throwable {
			if (thrown != null) {
				throw thrown;
			}
		}
	};
}
