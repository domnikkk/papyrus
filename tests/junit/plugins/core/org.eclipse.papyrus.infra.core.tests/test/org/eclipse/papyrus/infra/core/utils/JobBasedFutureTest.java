/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.core.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.papyrus.junit.matchers.MoreMatchers;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.base.Supplier;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;

/**
 * JUnit tests for the {@link JobBasedFuture} class.
 */
public class JobBasedFutureTest {
	private static final long FUTURE_DURATION = 3L;

	private static final TimeUnit FUTURE_DURATION_UNIT = TimeUnit.SECONDS;

	private static final int CONCURRENT_THREAD_COUNT = 3;

	private static ExecutorService exec;

	private long startedWhen;

	public JobBasedFutureTest() {
		super();
	}

	@Test
	public void normalCompletion() {
		runGetterThreads(Fixture.returning(true));
		assertRunningTimeAtLeast(2L, TimeUnit.SECONDS);
	}

	@Test
	public void normalCompletionWithSchedulingRule() {
		runGetterThreads(Fixture.returning(true), new RuleSupplier());
		assertRunningTimeAtLeast(2L, TimeUnit.SECONDS);
	}

	@Test
	public void timeOut() {
		runGetterThreads(Fixture.returning(true, 5L, TimeUnit.SECONDS), 2L, TimeUnit.SECONDS);
	}

	@Test
	public void timeOutWithSchedulingRule() {
		runGetterThreads(Fixture.returning(true, 5L, TimeUnit.SECONDS), 2L, TimeUnit.SECONDS, new RuleSupplier());
	}

	@Test
	public void computeFails() {
		runGetterThreads(Fixture.throwing(TestException.class), TestException.class);
		assertRunningTimeAtLeast(2L, TimeUnit.SECONDS);
	}

	@Test
	public void cancel() {
		runGetterThreads(Fixture.returning(true), true);
	}

	@Test
	public void listen_success() {
		addListeners(Fixture.returning(true));
	}

	@Test
	public void listen_failure() {
		addListeners(Fixture.throwing(TestException.class), TestException.class);
	}

	//
	// Test framework
	//

	@BeforeClass
	public static void createExecutor() {
		exec = Executors.newCachedThreadPool();
	}

	@AfterClass
	public static void shutDownExecutor() {
		exec.shutdown();
		exec = null;
	}

	@Before
	public void starting() {
		startedWhen = System.currentTimeMillis();
	}

	void assertRunningTimeAtLeast(long time, TimeUnit unit) {
		assertThat("Test running time too short", System.currentTimeMillis() - startedWhen, MoreMatchers.greaterThan(unit.toMillis(time)));
	}

	void runGetterThreads(final Fixture fixture) {
		runGetterThreads(fixture, 0L, null, null, false, true, null);
	}

	void runGetterThreads(final Fixture fixture, Supplier<? extends ISchedulingRule> rule) {
		runGetterThreads(fixture, 0L, null, rule, false, true, null);
	}

	void runGetterThreads(final Fixture fixture, long timeout, TimeUnit unit) {
		runGetterThreads(fixture, timeout, unit, null, false, null, TimeoutException.class);
	}

	void runGetterThreads(final Fixture fixture, long timeout, TimeUnit unit, Supplier<? extends ISchedulingRule> rule) {
		runGetterThreads(fixture, timeout, unit, rule, false, null, null);
	}

	void runGetterThreads(final Fixture fixture, Boolean expected) {
		runGetterThreads(fixture, 0L, null, null, false, expected, null);
	}

	void runGetterThreads(final Fixture fixture, boolean cancel) {
		runGetterThreads(fixture, 0L, null, null, true, null, null);
	}

	void runGetterThreads(final Fixture fixture, Class<? extends Throwable> expectedException) {
		runGetterThreads(fixture, 0L, null, null, false, null, expectedException);
	}

	private void runGetterThreads(final Fixture fixture, final long timeout, final TimeUnit unit, final Supplier<? extends ISchedulingRule> rule, final boolean cancel, Boolean expected, Class<? extends Throwable> expectedException) {
		final List<Boolean> results = Lists.newCopyOnWriteArrayList();
		final List<Throwable> thrown = Lists.newCopyOnWriteArrayList();
		final CountDownLatch latch = new CountDownLatch(CONCURRENT_THREAD_COUNT);

		Runnable reader = new Runnable() {

			public void run() {
				ISchedulingRule rule_ = (rule == null) ? null : rule.get();

				try {
					if (rule_ != null) {
						Job.getJobManager().beginRule(rule_, null);
					}

					if (cancel) {
						fixture.cancel(true);
					} else if (timeout <= 0L) {
						results.add(fixture.get());
					} else {
						results.add(fixture.get(timeout, unit));
					}
				} catch (InterruptedException e) {
					thrown.add(e);
				} catch (TimeoutException e) {
					thrown.add(e);
				} catch (ExecutionException e) {
					thrown.add(e.getCause());
				} finally {
					latch.countDown();

					if (rule_ != null) {
						Job.getJobManager().endRule(rule_);
					}
				}
			}
		};

		for (int i = 0; i < CONCURRENT_THREAD_COUNT; i++) {
			exec.submit(reader);
		}

		try {
			assertThat("Test timed out", latch.await(10L, TimeUnit.MINUTES), is(true));
		} catch (InterruptedException e) {
			e.printStackTrace();
			fail("Interrupted waiting for test threads");
		}

		assertThat(results, is((expected == null) ? Collections.<Boolean> emptyList() : Collections.nCopies(CONCURRENT_THREAD_COUNT, expected)));

		if (expectedException != null) {
			assertThat(Iterables.size(Iterables.filter(thrown, expectedException)), is(CONCURRENT_THREAD_COUNT));
		}
	}

	void addListeners(final Fixture fixture) {
		addListeners(fixture, true, null);
	}

	void addListeners(final Fixture fixture, Class<? extends Throwable> expectedException) {
		addListeners(fixture, null, expectedException);
	}

	private void addListeners(final Fixture fixture, Boolean expected, Class<? extends Throwable> expectedException) {
		final List<Boolean> results = Lists.newCopyOnWriteArrayList();
		final List<Throwable> thrown = Lists.newCopyOnWriteArrayList();
		final CountDownLatch latch = new CountDownLatch(CONCURRENT_THREAD_COUNT);

		for (int i = 0; i < CONCURRENT_THREAD_COUNT; i++) {
			Futures.addCallback(fixture, new FutureCallback<Boolean>() {
				public void onSuccess(Boolean result) {
					results.add(result);
					latch.countDown();
				}

				public void onFailure(Throwable t) {
					thrown.add(t);
					latch.countDown();
				}
			});
		}

		try {
			assertThat("Test timed out", latch.await(1L, TimeUnit.MINUTES), is(true));
		} catch (InterruptedException e) {
			e.printStackTrace();
			fail("Interrupted waiting for test listeners");
		}

		assertThat(results, is((expected == null) ? Collections.<Boolean> emptyList() : Collections.nCopies(CONCURRENT_THREAD_COUNT, expected)));

		if (expectedException != null) {
			assertThat(Iterables.size(Iterables.filter(thrown, expectedException)), is(CONCURRENT_THREAD_COUNT));
		}

	}

	private static class Fixture extends JobBasedFuture<Boolean> {
		private final long delay;
		private final TimeUnit delayUnit;

		private boolean value = true;
		private Class<? extends Throwable> exception;

		Fixture(long delay, TimeUnit delayUnit) {
			super("Test fixture");

			this.delay = delay;
			this.delayUnit = delayUnit;
		}

		@Override
		protected Boolean compute(IProgressMonitor monitor) throws Exception {
			if (delay > 0L) {
				delayUnit.sleep(delay);
			}

			if (exception != null) {
				if (Exception.class.isAssignableFrom(exception)) {
					throw (Exception) exception.newInstance();
				} else if (Error.class.isAssignableFrom(exception)) {
					throw (Error) exception.newInstance();
				}
			}

			return value;
		}

		static Fixture returning(boolean value) {
			return returning(value, FUTURE_DURATION, FUTURE_DURATION_UNIT);
		}

		static Fixture returning(boolean value, long delay, TimeUnit unit) {
			Fixture result = new Fixture(delay, unit);
			result.value = value;
			result.schedule();
			return result;
		}

		static Fixture throwing(Class<? extends Throwable> exception) {
			return throwing(exception, FUTURE_DURATION, FUTURE_DURATION_UNIT);
		}

		static Fixture throwing(Class<? extends Throwable> exception, long delay, TimeUnit unit) {
			Fixture result = new Fixture(delay, unit);
			result.exception = exception;
			result.schedule();
			return result;
		}
	}

	static class TestException extends Exception {
		private static final long serialVersionUID = 1L;

		public TestException() {
			super();
		}
	}

	static class RuleSupplier implements Supplier<ISchedulingRule> {
		public ISchedulingRule get() {
			return new ISchedulingRule() {
				public boolean isConflicting(ISchedulingRule rule) {
					return rule == this;
				}

				public boolean contains(ISchedulingRule rule) {
					return rule == this;
				}
			};
		}
	}
}
