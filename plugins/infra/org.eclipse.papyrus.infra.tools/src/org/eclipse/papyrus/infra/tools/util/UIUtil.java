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

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IMemento;


/**
 * Miscellaneous general-purpose UI utilities.
 */
public class UIUtil {

	/**
	 * Not instantiable by clients.
	 */
	private UIUtil() {
		super();
	}

	/**
	 * Create an executor that runs tasks asynchronously on the UI thread. If you need synchronous execution, schedule {@link Future}s and {@linkplain Future#get() wait} for them.
	 *
	 * @param display
	 *            the display on which thread to execute tasks
	 *
	 * @return the executor
	 */
	public static ExecutorService createUIExecutor(Display display) {
		return new UIExecutorService(display);
	}

	/**
	 * Creates a local memento that is not persistable and is not based on an XML document. This is useful for capturing the
	 * state of UI elements locally in cases where persistence of the memento is not required.
	 *
	 * @return the memento
	 */
	public static IMemento createLocalMemento() {
		return LocalMemento.createMemento("__anonymous__", null); //$NON-NLS-1$
	}

	/**
	 * Synchronously invokes a {@code callable} on the given {@code display}'s thread.
	 *
	 * @param display
	 *            a display
	 * @param callable
	 *            a callable to invoke
	 * @return the callable's result (which, because this method is synchronous, will be ready)
	 *
	 * @see #asyncCall(Display, Callable)
	 * @see #createUIExecutor(Display)
	 */
	public static <V> Future<V> syncCall(Display display, Callable<V> callable) {
		final FutureTask<V> result = new FutureTask<V>(callable);
		display.syncExec(result);
		return result;
	}

	/**
	 * Synchronously invokes a {@code callable} on the default display thread.
	 *
	 * @param callable
	 *            a callable to invoke
	 * @return the callable's result (which, because this method is synchronous, will be ready)
	 *
	 * @see #syncCall(Display, Callable)
	 * @see #asyncCall(Callable)
	 * @see #createUIExecutor(Display)
	 */
	public static <V> Future<V> syncCall(Callable<V> callable) {
		return syncCall(Display.getDefault(), callable);
	}

	/**
	 * Asynchronously invokes a {@code callable} on the given {@code display}'s thread.
	 *
	 * @param display
	 *            a display
	 * @param callable
	 *            a callable to invoke
	 * @return the callable's result
	 *
	 * @see #syncCall(Display, Callable)
	 * @see #createUIExecutor(Display)
	 */
	public static <V> Future<V> asyncCall(Display display, Callable<V> callable) {
		final FutureTask<V> result = new FutureTask<V>(callable);
		display.asyncExec(result);
		return result;
	}

	/**
	 * Asynchronously invokes a {@code callable} on the default display thread.
	 *
	 * @param callable
	 *            a callable to invoke
	 * @return the callable's result
	 *
	 * @see #asyncCall(Display, Callable)
	 * @see #syncCall(Callable)
	 * @see #createUIExecutor(Display)
	 */
	public static <V> Future<V> asyncCall(Callable<V> callable) {
		return asyncCall(Display.getDefault(), callable);
	}

	//
	// Nested types
	//

	private static class UIExecutorService extends AbstractExecutorService {

		private final Lock lock = new ReentrantLock();

		private final Condition emptyCond = lock.newCondition();

		private final Queue<RunnableWrapper> pending = new LinkedList<RunnableWrapper>();

		private final Display display;

		private volatile boolean shutdown;

		UIExecutorService(Display display) {
			this.display = display;
		}

		public void execute(Runnable command) {
			if (isShutdown()) {
				throw new RejectedExecutionException("Executor service is shut down"); //$NON-NLS-1$
			}

			display.asyncExec(enqueue(command));
		}

		public List<Runnable> shutdownNow() {
			List<Runnable> result = new ArrayList<Runnable>();

			shutdown();

			for (Runnable dequeued = dequeue(); dequeued != null; dequeued = dequeue()) {
				result.add(dequeued);
			}

			return result;
		}

		private RunnableWrapper enqueue(Runnable task) {
			RunnableWrapper result = new RunnableWrapper(task);

			lock.lock();
			try {
				boolean wasEmpty = pending.isEmpty();
				pending.offer(result);
				if (wasEmpty) {
					// Now not empty
					emptyCond.signalAll();
				}
			} finally {
				lock.unlock();
			}

			return result;
		}

		private RunnableWrapper dequeue() {
			RunnableWrapper result = null;

			lock.lock();
			try {
				result = pending.poll();
				if (result == null) {
					// Now empty
					emptyCond.signalAll();
				}
			} finally {
				lock.unlock();
			}

			return result;
		}

		boolean dequeue(RunnableWrapper task) {
			boolean result = false;

			lock.lock();
			try {
				result = pending.remove(task);
				if (result && pending.isEmpty()) {
					// Now empty
					emptyCond.signalAll();
				}
			} finally {
				lock.unlock();
			}

			return result;
		}

		public void shutdown() {
			shutdown = true;
		}

		public boolean isTerminated() {
			lock.lock();
			try {
				return isShutdown() && pending.isEmpty();
			} finally {
				lock.unlock();
			}
		}

		public boolean isShutdown() {
			return shutdown;
		}

		public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
			if (timeout < 0L) {
				throw new IllegalArgumentException("negative timeout"); //$NON-NLS-1$
			}

			final Date deadline = (timeout == 0L) ? null : new Date(System.currentTimeMillis() + unit.toMillis(timeout));
			boolean result = false;

			lock.lock();
			try {
				boolean stillWaiting = true;
				for (result = isTerminated(); !result && stillWaiting; result = isTerminated()) {
					if (deadline == null) {
						emptyCond.await();
					} else {
						stillWaiting = emptyCond.awaitUntil(deadline);
					}
				}
			} finally {
				lock.unlock();
			}

			return result;
		}

		//
		// Nested types
		//

		private class RunnableWrapper implements Runnable {

			private final Runnable delegate;

			RunnableWrapper(Runnable delegate) {
				this.delegate = delegate;
			}

			public void run() {
				// Don't run if I was cancelled by shutdown
				if (dequeue(this)) {
					delegate.run();
				}
			}
		}
	};
}
