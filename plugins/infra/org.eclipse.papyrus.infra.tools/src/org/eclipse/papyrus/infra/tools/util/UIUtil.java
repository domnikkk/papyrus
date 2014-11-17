/*
 * Copyright (c) 2014 CEA, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *   Christian W. Damus - bug 399859
 *   Christian W. Damus - bug 451557
 *
 */
package org.eclipse.papyrus.infra.tools.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IMemento;

import com.google.common.collect.Iterators;


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
		return new DisplayExecutorService(display);
	}

	/**
	 * Create an executor that runs tasks asynchronously on an observable {@link Realm}. If you need synchronous execution, schedule {@link Future}s and {@linkplain Future#get() wait} for them.
	 *
	 * @param realm
	 *            the observable realm on which thread to execute tasks
	 *
	 * @return the executor
	 */
	public static ExecutorService createObservableExecutor(Realm realm) {
		return new RealmExecutorService(realm);
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

	/**
	 * Calls a {@code callable} in the given {@code context}.
	 *
	 * @param fork
	 *            {@code true} if the runnable should be run in a separate thread,
	 *            and {@code false} to run in the same thread
	 * @param cancelable
	 *            {@code true} to enable the cancellation, and {@code false} to make the operation uncancellable
	 * @param runnable
	 *            the runnable to run
	 *
	 * @exception InvocationTargetException
	 *                wraps any exception or error which occurs
	 *                while running the runnable
	 * @exception InterruptedException
	 *                propagated by the context if the runnable
	 *                acknowledges cancellation by throwing this exception. This should not be thrown
	 *                if {@code cancelable} is {@code false}.
	 */
	public static <V> V call(IRunnableContext context, boolean fork, boolean cancelable, ICallableWithProgress<V> callable) throws InvocationTargetException, InterruptedException {
		class RunnableWrapper implements IRunnableWithProgress {
			final ICallableWithProgress<V> delegate;

			V result;

			RunnableWrapper(ICallableWithProgress<V> delegate) {
				this.delegate = delegate;
			}

			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				result = delegate.call(monitor);
			}
		}

		RunnableWrapper wrapper = new RunnableWrapper(callable);
		context.run(fork, cancelable, wrapper);
		return wrapper.result;
	}

	/**
	 * Obtains a simple executor that asynchronously executes at most one task on the default
	 * display thread. While any task is still pending execution on this executor,
	 * all others are silently discarded. This is useful for cases where, for example, UI
	 * refreshes are posted repeatedly from independent events that aren't aware of each other
	 * but where each refresh task would repeat the same work.
	 * 
	 * @param display
	 *            a display on which thread to execute tasks
	 * 
	 * @return the executor
	 * 
	 * @see #createAsyncOnceExecutor(Display)
	 */
	public static Executor createAsyncOnceExecutor() {
		return createAsyncOnceExecutor(Display.getDefault());
	}

	/**
	 * Obtains a simple executor that asynchronously executes at most one task on the given {@code display}'s thread. While any task is still pending execution on this executor,
	 * all others are silently discarded. This is useful for cases where, for example, UI
	 * refreshes are posted repeatedly from independent events that aren't aware of each other
	 * but where each refresh task would repeat the same work.
	 * 
	 * @param display
	 *            a display on which thread to execute tasks
	 * 
	 * @return the executor
	 */
	public static Executor createAsyncOnceExecutor(final Display display) {
		return new Executor() {
			private final AtomicBoolean pending = new AtomicBoolean();

			public void execute(final Runnable task) {
				if (pending.compareAndSet(false, true)) {
					display.asyncExec(new Runnable() {

						public void run() {
							pending.set(false);
							task.run();
						}
					});
				}
			}
		};
	}

	/**
	 * Obtains a tree iterator over all of the controls contained within a given {@code root} control, not including that {@code root}.
	 * 
	 * @param root
	 *            a control to iterate
	 * @return an unmodifiable iterator over all of its nested controls, which naturally will be empty if the {@code root} is not a {@link Composite}
	 */
	public static TreeIterator<Control> allChildren(Control root) {
		return new AbstractTreeIterator<Control>(root, false) {
			private static final long serialVersionUID = 1L;

			@Override
			protected Iterator<? extends Control> getChildren(Object object) {
				return (object instanceof Composite) ? Iterators.forArray(((Composite) object).getChildren()) : Iterators.<Control> emptyIterator();
			}
		};
	}

	/**
	 * Obtains a tree iterator over all of the controls of a particular type contained within a given {@code root} control, not including that {@code root}.
	 * 
	 * @param root
	 *            a control to iterate
	 * @param type
	 *            the type of children to include in the iteration
	 * 
	 * @return an unmodifiable iterator over all of its nested controls, which naturally will be empty if the {@code root} is not a {@link Composite}
	 */
	public static <C extends Control> TreeIterator<C> allChildren(Control root, final Class<C> type) {
		return Iterators2.filter(allChildren(root), type);
	}

	//
	// Nested types
	//

	private static abstract class UIExecutorService extends AbstractExecutorService {

		private final Lock lock = new ReentrantLock();

		private final Condition emptyCond = lock.newCondition();

		private final Queue<RunnableWrapper> pending = new LinkedList<RunnableWrapper>();

		private volatile boolean shutdown;

		UIExecutorService() {
			super();
		}

		public void execute(Runnable command) {
			if (isShutdown()) {
				throw new RejectedExecutionException("Executor service is shut down"); //$NON-NLS-1$
			}

			asyncExec(enqueue(command));
		}

		abstract void asyncExec(Runnable runnable);

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

	private static class DisplayExecutorService extends UIExecutorService {
		private final Display display;

		DisplayExecutorService(Display display) {
			super();

			this.display = display;
		}

		@Override
		void asyncExec(Runnable runnable) {
			display.asyncExec(runnable);
		}
	}

	private static class RealmExecutorService extends UIExecutorService {
		private final Realm realm;

		RealmExecutorService(Realm realm) {
			super();

			this.realm = realm;
		}

		@Override
		void asyncExec(Runnable runnable) {
			realm.asyncExec(runnable);
		}
	}
}
