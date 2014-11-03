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

package org.eclipse.papyrus.junit.utils;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

import com.google.common.collect.ImmutableList;

/**
 * A convenient {@link ExecutorService} implementation for test cases where we want to control
 * when asynchronous tasks run.
 */
public class SynchronousExecutorService extends AbstractExecutorService {

	/**
	 * A runnable to post to me to cause me to run all pending tasks. This lets the caller
	 * synchronize with me, to run and/or wait for all tasks up to that point.
	 * 
	 * @see #flush()
	 */
	public static final Runnable FLUSH = new Runnable() {
		public void run() {
			// Pass
		}
	};

	private final AtomicBoolean isShutdown = new AtomicBoolean();
	private final ConcurrentLinkedQueue<Runnable> queue = new ConcurrentLinkedQueue<Runnable>();

	private final Lock lock = new ReentrantLock();
	private final Condition done = lock.newCondition();

	/**
	 * Constructor.
	 */
	public SynchronousExecutorService() {
		super();
	}

	public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
		lock.lockInterruptibly();
		try {
			long now = System.currentTimeMillis();
			long deadline = now + unit.toMillis(timeout);
			while (!isTerminated()) {
				if (done.await(deadline - now, TimeUnit.MILLISECONDS)) {
					break;
				}
				now = System.currentTimeMillis();
				if (now >= deadline) {
					break;
				}
			}
		} finally {
			lock.unlock();
		}

		return isTerminated();
	}

	public boolean isShutdown() {
		return isShutdown.get();
	}

	public boolean isTerminated() {
		return isShutdown() && queue.isEmpty();
	}

	public void shutdown() {
		if (isShutdown.compareAndSet(false, true)) {
			queue.clear();
		}
	}

	public List<Runnable> shutdownNow() {
		List<Runnable> result;

		lock.lock();
		try {
			if (isShutdown.compareAndSet(false, true)) {
				result = ImmutableList.copyOf(queue);
				queue.clear();
				done.signalAll();
			} else {
				result = Collections.emptyList();
			}
		} finally {
			lock.unlock();
		}

		return result;
	}

	public void execute(Runnable command) {
		final boolean flush = isFlush(command);

		lock.lock();
		try {
			if (isShutdown()) {
				throw new RejectedExecutionException("executor is shut down");
			}

			// Even if it's FLUSH, enqueue it because somebody may be synchronizing on a Future wrapping it
			queue.add(command);
		} finally {
			lock.unlock();
		}

		if (flush) {
			flush();
		}
	}

	public void flush() {
		lock.lock();
		try {
			for (Runnable next = queue.poll(); next != null; next = queue.poll()) {
				lock.unlock();

				try {
					next.run();
				} catch (Exception e) {
					final String bsn = "org.eclipse.papyrus.junit.utils";
					IStatus status = new Status(IStatus.ERROR, bsn, "Uncaught exception in async runnable.", e);
					Platform.getLog(Platform.getBundle(bsn)).log(status);
				} finally {
					lock.lock();
				}
			}

			if (isShutdown()) {
				done.signalAll();
			}
		} finally {
			lock.unlock();
		}
	}

	@Override
	protected <T> RunnableFuture<T> newTaskFor(Runnable task, T value) {
		return new MyFutureTask<T>(task, value);
	}

	boolean isFlush(Runnable task) {
		return (task == FLUSH) || ((task instanceof MyFutureTask<?>) && ((MyFutureTask<?>) task).task == FLUSH);
	}

	//
	// Nested types
	//

	private static class MyFutureTask<V> extends FutureTask<V> {
		final Runnable task;

		MyFutureTask(Runnable task, V value) {
			super(task, value);

			this.task = task;
		}
	}
}
