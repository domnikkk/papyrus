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
package org.eclipse.papyrus.infra.tools.util;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.swt.widgets.Display;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;


/**
 * Test cases for the {@link UIUtil} class.
 */
@RunWith(Enclosed.class)
public class UIUtilTest {

	public UIUtilTest() {
		super();
	}

	//
	// Test suites
	//

	public static class ExecutorServiceTest extends AbstractPapyrusTest {

		private ExecutorService fixture;

		public ExecutorServiceTest() {
			super();
		}

		@Test
		public void testSubmit() {
			Future<Boolean> future = fixture.submit(new Task());
			assertThat(future.isCancelled(), is(false));
			assertThat(future.isDone(), is(false));

			flushDisplayEvents();

			assertThat(future.isDone(), is(true));
			assertResult(future, is(true));
		}

		@Test
		public void testShutdown() {
			Future<Boolean> future = fixture.submit(new Task());

			fixture.shutdown();

			assertThat(fixture.isShutdown(), is(true));
			assertThat(fixture.isTerminated(), is(false));

			flushDisplayEvents();

			assertThat(fixture.isTerminated(), is(true));

			// The task did execute
			assertResult(future, is(true));
		}

		@Test
		public void testShutdownNow() {
			Future<Boolean> future = fixture.submit(new Task());

			List<Runnable> cancelled = fixture.shutdownNow();

			assertThat(cancelled.size(), is(1));

			assertThat(fixture.isTerminated(), is(true));

			assertThat(future.isDone(), is(false));
		}

		@Test
		public void testAwaitTermination_finishes() {
			Future<Boolean> future = fixture.submit(new Task());

			fixture.shutdown();

			ExecutorService executor = Executors.newSingleThreadExecutor();
			Future<Boolean> waiter = executor.submit(new AwaitTermination(10));
			try {
				flushDisplayEvents();

				assertResult(waiter, is(true));

				// The task did execute
				assertResult(future, is(true));
			} finally {
				executor.shutdown();
			}
		}

		@Test
		public void testAwaitTermination_timesOut() {
			fixture.submit(new Task());

			fixture.shutdown();

			ExecutorService executor = Executors.newSingleThreadExecutor();
			Future<Boolean> waiter = executor.submit(new AwaitTermination(1));

			try {
				assertResult(waiter, is(false));
			} finally {
				executor.shutdown();
			}
		}

		//
		// Test framework
		//

		@Before
		public void createFixture() {
			fixture = UIUtil.createUIExecutor(Display.getCurrent());
		}

		@After
		public void disposeFixture() {
			fixture.shutdown();
			fixture = null;

			// Ensure that any remaining runnables are processed
			flushDisplayEvents();
		}

		<V> void assertResult(Future<? extends V> future, Matcher<? super V> assertion) {
			try {
				assertThat(future.get(), assertion);
			} catch (Exception e) {
				e.printStackTrace();
				fail("Failed to get future result: " + e.getLocalizedMessage());
			}
		}

		private static class Task implements Callable<Boolean> {

			@Override
			public Boolean call() {
				return true;
			}
		}

		private class AwaitTermination implements Callable<Boolean> {

			private final int timeoutSeconds;

			public AwaitTermination(int timeoutSeconds) {
				super();

				this.timeoutSeconds = timeoutSeconds;
			}

			@Override
			public Boolean call() throws Exception {
				return fixture.awaitTermination(timeoutSeconds, TimeUnit.SECONDS);
			}
		}
	}

	//
	// Shared test framework
	//


	static void flushDisplayEvents() {
		for (;;) {
			try {
				if (!Display.getCurrent().readAndDispatch()) {
					break;
				}
			} catch (Exception e) {
				Bundle testBundle = FrameworkUtil.getBundle(UIUtilTest.class);
				Platform.getLog(testBundle).log(new Status(IStatus.ERROR, testBundle.getSymbolicName(), "Uncaught exception in display runnable.", e));
			}
		}
	}

}
