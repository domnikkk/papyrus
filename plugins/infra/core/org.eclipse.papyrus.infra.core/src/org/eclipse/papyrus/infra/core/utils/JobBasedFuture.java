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

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.ProgressMonitorWrapper;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.ILock;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.papyrus.infra.core.Activator;

import com.google.common.util.concurrent.ExecutionList;
import com.google.common.util.concurrent.ListenableFuture;

/**
 * A Guava {@link ListenableFuture} implemented as an Eclipse {@link Job} to ensure that, in case the UI thread ever has to wait
 * for the future result, the blockage is reported to the user with opportunity to cancel.
 * <p>
 * <b>Note</b> that no scheduling rule must be {@linkplain Job#setRule(ISchedulingRule) set} on instances of this class. Nor must the implementation of the {@link #compute(IProgressMonitor)} method attempt to
 * {@linkplain IJobManager#beginRule(ISchedulingRule, IProgressMonitor) begin} an ad hoc rule. Doing either will almost certainly cause deadlock or worse.
 */
public abstract class JobBasedFuture<V> extends Job implements ListenableFuture<V> {
	private static final ScheduledThreadPoolExecutor TIMEOUT_EXECUTOR = new ScheduledThreadPoolExecutor(1);

	private final CountDownLatch started = new CountDownLatch(1);
	private final ILock runningLock = Job.getJobManager().newLock();
	private final ISchedulingRule rule = new ISchedulingRule() {

		@Override
		public boolean isConflicting(ISchedulingRule rule) {
			return rule == this;
		}

		@Override
		public boolean contains(ISchedulingRule rule) {
			return rule == this;
		}
	};

	private final AtomicReference<State> state = new AtomicReference<State>(State.RUNNING);

	private volatile Throwable exception;
	private final ExecutionList executions = new ExecutionList();

	private volatile V value;

	static {
		TIMEOUT_EXECUTOR.setKeepAliveTime(10, TimeUnit.SECONDS);
		TIMEOUT_EXECUTOR.allowCoreThreadTimeOut(true);
	}

	public JobBasedFuture(String name) {
		super(name);

		setSystem(true);
		setRule(rule);
	}

	final boolean transition(State from, State to) {
		return state.compareAndSet(from, to);
	}

	final State state() {
		return state.get();
	}

	final boolean isInState(State state) {
		return this.state.get() == state;
	}

	@Override
	protected final IStatus run(IProgressMonitor monitor) {
		IStatus result = Status.OK_STATUS;

		runningLock.acquire();
		started.countDown();

		try {
			setValue(compute(monitor));
		} catch (CoreException e) {
			result = e.getStatus();
			fail(e);
		} catch (ThreadDeath d) {
			throw d;
		} catch (Throwable t) {
			result = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Uncaught exception in future job", t); //$NON-NLS-1$
			fail(t);
		} finally {
			runningLock.release();
		}

		return result;
	}

	protected abstract V compute(IProgressMonitor monitor) throws Exception;

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		boolean result = transition(State.RUNNING, State.CANCELLED);

		if (result) {
			try {
				cancel();
			} finally {
				executions.execute();
			}
		}

		return result;
	}

	boolean fail(Throwable t) {
		boolean result = transition(State.RUNNING, State.FAILED);

		if (result) {
			exception = t;
			executions.execute();
		}

		return result;
	}

	@Override
	public boolean isCancelled() {
		return isInState(State.CANCELLED);
	}

	@Override
	public boolean isDone() {
		return !isInState(State.RUNNING);
	}

	@Override
	public V get() throws InterruptedException, ExecutionException {
		awaitDone(0L);

		return getValue();
	}

	@Override
	public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		if (!awaitDone(unit.toMillis(timeout))) {
			throw new TimeoutException();
		}

		return getValue();
	}

	final boolean awaitDone(long timeoutMillis) throws InterruptedException {
		// Check for short-circuit in case of running a listener on completion that
		// then (obviously) tries to get our value
		boolean result = isDone();

		if (!result) {
			Job current = Job.getJobManager().currentJob();
			if ((current == null) || (current.getRule() == null)) {
				result = uiSafeAwaitDone(timeoutMillis);
			} else {
				result = lockBasedAwaitDone(timeoutMillis);
			}
		}

		return result;
	}

	private boolean lockBasedAwaitDone(long timeoutMillis) throws InterruptedException {
		boolean result = false;

		// Synchronize first on the start of execution of the job. This should never block for very long because the job
		// will not have a scheduling rule that anyone else can begin

		if (timeoutMillis <= 0L) {
			started.await();
			runningLock.acquire();

			try {
				result = isDone();
			} finally {
				runningLock.release();
			}
		} else {
			final long startedWaiting = System.currentTimeMillis();
			if (started.await(timeoutMillis, TimeUnit.MILLISECONDS)) {
				long remaining = timeoutMillis - (System.currentTimeMillis() - startedWaiting);
				if (remaining > 0L) {
					if (runningLock.acquire(remaining)) {
						try {
							result = isDone();
						} finally {
							runningLock.release();
						}
					}
				}
			}
		}

		return result;
	}

	private boolean uiSafeAwaitDone(long timeoutMillis) throws InterruptedException {
		boolean result = false;

		// Synchronize first on the start of execution of the job. This should never block for very long because the job
		// will not have a scheduling rule that anyone else can begin

		if (timeoutMillis <= 0L) {
			started.await();

			try {
				Job.getJobManager().beginRule(rule, null);
				result = isDone();
			} finally {
				Job.getJobManager().endRule(rule);
			}
		} else {
			final long startedWaiting = System.currentTimeMillis();
			if (started.await(timeoutMillis, TimeUnit.MILLISECONDS)) {
				long remaining = timeoutMillis - (System.currentTimeMillis() - startedWaiting);
				final IProgressMonitor monitor = new TimeoutMonitor();

				ScheduledFuture<?> timeout = TIMEOUT_EXECUTOR.schedule(new Runnable() {

					@Override
					public void run() {
						monitor.setCanceled(true);
					}
				}, remaining, TimeUnit.MILLISECONDS);

				try {
					try {
						Job.getJobManager().beginRule(rule, monitor);
						timeout.cancel(false);
						result = isDone();
					} finally {
						Job.getJobManager().endRule(rule);
						Thread.interrupted(); // clear interrupt state, just in case
					}
				} catch (OperationCanceledException e) {
					// timed out
				}
			}
		}

		return result;
	}

	final boolean setValue(V value) {
		boolean result = transition(State.RUNNING, State.DONE);

		if (result) {
			this.value = value;
			executions.execute();
		}

		return result;
	}

	final V getValue() throws ExecutionException {
		V result = null;

		final State state = state();
		switch (state) {
		case CANCELLED:
			throw new CancellationException(String.format("Job \"%s\" was cancelled", getName()));
		case FAILED:
			throw new ExecutionException(exception);
		case DONE:
			result = this.value;
			break;
		default:
			throw new IllegalStateException(state.name());
		}

		return result;
	}

	@Override
	public void addListener(Runnable listener, Executor executor) {
		executions.add(listener, executor);
	}

	//
	// Nested types
	//

	private enum State {
		RUNNING, CANCELLED, FAILED, DONE;
	}

	private static class TimeoutMonitor extends ProgressMonitorWrapper {
		private Thread thread;

		TimeoutMonitor() {
			super(new NullProgressMonitor());

			thread = Thread.currentThread();
		}

		@Override
		public void setCanceled(boolean b) {
			boolean wasCanceled = isCanceled();
			super.setCanceled(b);
			if (!wasCanceled && b) {
				thread.interrupt();
			}
		}
	}
}
