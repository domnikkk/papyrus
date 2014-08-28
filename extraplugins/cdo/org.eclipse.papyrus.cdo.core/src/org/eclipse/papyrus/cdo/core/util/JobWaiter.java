/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Christian W. Damus (CEA) - bug 439725
 *
 *****************************************************************************/
package org.eclipse.papyrus.cdo.core.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;


/**
 * An utility that provides interruptible wait for a {@code Job} or
 * job {@linkplain Job#belongsTo(Object) family} with a time-out.
 */
public class JobWaiter {

	private static final ScheduledExecutorService timeoutService = Executors.newSingleThreadScheduledExecutor();

	private final Object targetFamily;

	private final Job targetJob;

	final long start = System.currentTimeMillis();

	/**
	 * Not instantiable by clients.
	 */
	private JobWaiter(Job job, Object family) {
		super();

		this.targetJob = job;
		this.targetFamily = family;
	}

	/**
	 * Wait for all jobs (if any) in the given {@code family} to finish.
	 *
	 * @param family
	 *            a job family to wait for
	 * @param timeout
	 *            a positive timeout
	 * @param unit
	 *            the time unit for the {@code timeout}
	 *
	 * @return {@code true} on successful wait (if required); {@code false} on time-out
	 *
	 * @throws InterruptedException
	 *             if the wait is interrupted
	 */
	public static boolean waitFor(Object family, long timeout, TimeUnit unit) throws InterruptedException {
		return new JobWaiter(null, family).doWait(timeout, unit);
	}

	/**
	 * Wait for a specific {@code job} to finish.
	 *
	 * @param job
	 *            a job to wait for
	 * @param timeout
	 *            a positive timeout
	 * @param unit
	 *            the time unit for the {@code timeout}
	 *
	 * @return {@code true} on successful wait (if required); {@code false} on time-out
	 *
	 * @throws InterruptedException
	 *             if the wait is interrupted
	 */
	public static boolean waitFor(Job job, long timeout, TimeUnit unit) throws InterruptedException {
		return new JobWaiter(job, null).doWait(timeout, unit);
	}

	protected boolean doWait(long timeout, TimeUnit unit) throws InterruptedException {
		if (timeout <= 0) {
			throw new IllegalArgumentException("Non-positive timeout"); //$NON-NLS-1$
		}

		boolean result = false;

		// create and schedule a task that will time-out the join
		Timeout timeoutTask = new Timeout();

		timeoutService.schedule(timeoutTask, timeout, unit);

		try {
			if (targetJob != null) {
				// the Job::join() API documents that it is interruptible, but the
				// actual implementation in the JobManager is not
				new JobFinishListener(targetJob).await();
			} else {
				// On some platforms, cancellation of a family join is not reliable
				new FamilyFinishListener(targetFamily).await();
			}

			result = true;
			timeoutTask.cancel();

			if (Thread.interrupted()) {
				throw new InterruptedException();
			}
		} catch (InterruptedException e) {
			if (timeoutTask.timedOut()) {
				// normal condition: time-out task interrupted us
			} else {
				// "real" interruption
				throw e;
			}
		}

		return result;
	}

	//
	// Nested types
	//

	private static class Timeout implements Runnable {

		private final Thread toInterrupt = Thread.currentThread();

		private final AtomicBoolean cancelled = new AtomicBoolean();

		private final AtomicBoolean timedOut = new AtomicBoolean();

		@Override
		public void run() {
			if (!cancelled.get()) {
				timedOut.set(true);
				toInterrupt.interrupt();
			}
		}

		void cancel() {
			cancelled.set(true);
		}

		boolean timedOut() {
			return timedOut.get();
		}
	}

	private static abstract class FinishListener extends JobChangeAdapter {

		private boolean done;

		FinishListener() {
			super();

			Job.getJobManager().addJobChangeListener(this);
		}

		void dispose() {
			Job.getJobManager().removeJobChangeListener(this);
		}

		synchronized void await() throws InterruptedException {
			try {
				for (;;) {
					// Check done condition because our job/family may have finished already before we got here
					if (done || checkDone()) {
						break;
					}

					wait();
				}
			} finally {
				// Can only wait on me once
				dispose();
			}
		}

		@Override
		public synchronized void done(IJobChangeEvent event) {
			if (checkDone()) {
				try {
					done = true;
					dispose();
				} finally {
					notifyAll();
				}
			}
		}

		protected abstract boolean checkDone();
	}

	private static final class JobFinishListener extends FinishListener {

		private final Job job;

		JobFinishListener(Job job) {
			super();

			this.job = job;
		}

		@Override
		protected boolean checkDone() {
			return job.getState() != Job.RUNNING;
		}
	}

	private static final class FamilyFinishListener extends FinishListener {

		private final Object family;

		FamilyFinishListener(Object family) {
			super();

			this.family = family;
		}

		@Override
		protected boolean checkDone() {
			return Job.getJobManager().find(family).length == 0;
		}
	}
}
