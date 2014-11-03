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

package org.eclipse.papyrus.infra.tools.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * A convenient reference-counting utility with automatic disposal and asynchronous auto-disposal (intended
 * for use with the UI event-loop executor service). Sub-classes leveraging the self-disposing behaviour of
 * the self-owning instance must override the {@link #dispose()} method.
 */
public class ReferenceCounted<T> {
	private final T owner;
	private final AtomicInteger refCount = new AtomicInteger();
	private Runnable disposeAction;
	private final ExecutorService autoReleaseExecutor;

	/**
	 * Initializes me with my owner for which I count references.
	 * <p>
	 * I do not support {@link #autoRelease()}.
	 *
	 * @param owner
	 *            my owner
	 * @param disposeAction
	 *            action to run when the reference count reaches zero to dispose my {@code owner}
	 * 
	 * @throws IllegalArgumentException
	 *             if the {@code disposeAction} is {@code null} because, really,
	 *             why would you need reference counting for an object that doesn't need to be disposed?
	 */
	public ReferenceCounted(T owner, Runnable disposeAction) {
		this(owner, null, disposeAction);
	}

	/**
	 * Initializes me with my owner for which I count references.
	 * <p>
	 * I support {@link #autoRelease()} using the given executor.
	 *
	 * @param owner
	 *            my owner
	 * @param autoReleaseExecutor
	 *            the executor on which to schedule auto-release invocations
	 * @param disposeAction
	 *            action to run when the reference count reaches zero to dispose my {@code owner}
	 * 
	 * @throws IllegalArgumentException
	 *             if the {@code disposeAction} is {@code null} because, really,
	 *             why would you need reference counting for an object that doesn't need to be disposed?
	 */
	public ReferenceCounted(T owner, ExecutorService autoReleaseExecutor, Runnable disposeAction) {
		super();

		if (disposeAction == null) {
			throw new IllegalArgumentException("null disposeAction"); //$NON-NLS-1$
		}

		this.owner = owner;
		this.autoReleaseExecutor = autoReleaseExecutor;
		this.disposeAction = disposeAction;
	}

	/**
	 * Initializes me as a self-disposing reference-counted instance. This constructor is only suitable
	 * for chaining from subclasses.
	 * <p>
	 * I do not support {@link #autoRelease()}.
	 */
	protected ReferenceCounted() {
		this((ExecutorService) null);
	}

	/**
	 * Initializes me as a self-disposing reference-counted instance. This constructor is only suitable
	 * for chaining from subclasses.
	 * <p>
	 * I support {@link #autoRelease()} using the given executor.
	 *
	 * @param autoReleaseExecutor
	 *            the executor on which to schedule auto-release invocations
	 */
	@SuppressWarnings("unchecked")
	protected ReferenceCounted(ExecutorService autoReleaseExecutor) {
		super();

		this.owner = (T) this;
		this.disposeAction = new SelfDisposeAction();
		this.autoReleaseExecutor = autoReleaseExecutor;
	}

	/**
	 * Retains me, incrementing my retain count. The caller must eventually {@link #release()} me (even if via the {@link #autoRelease()} method)
	 * if I am to become disposable.
	 * 
	 * @return my owner, for convenience of call chaining
	 */
	public final T retain() {
		refCount.incrementAndGet();
		return owner;
	}

	/**
	 * Releases me, decrementing my retain count. When my retain count reaches zero, I dispose myself using the
	 * configured dispose-action runnable.
	 */
	public final void release() {
		if (refCount.decrementAndGet() <= 0) {
			if (disposeAction != null) {
				try {
					disposeAction.run();
				} finally {
					disposeAction = null;
				}
			}
		}
	}

	/**
	 * Automatically releases me some time in the future, as determined by the auto-release executor with which
	 * I was configured. A particularly convenient executor is one that posts an asynchronous execution on the
	 * display thread, to automatically dispose my owner (or me, as the case may be) when the display thread
	 * returns to the event loop.
	 * 
	 * @return my owner, for convenience of call chaining
	 * 
	 * @throws IllegalStateException
	 *             if I have no auto-release executor
	 */
	public final T autoRelease() {
		if (autoReleaseExecutor == null) {
			throw new IllegalStateException("no auto-release executor available"); //$NON-NLS-1$
		}

		// Don't submit the dispose action because we could still be retained!
		autoReleaseExecutor.execute(new Runnable() {

			public void run() {
				release();
			}
		});
		return owner;
	}

	/**
	 * For classes that extend the {@code ReferenceCount}, this must be overridden to implement disposal.
	 * The default implementation throws {@link UnsupportedOperationException} to ensure that subclasses
	 * override it.
	 */
	protected void dispose() {
		throw new UnsupportedOperationException("dispose is unimplemented"); //$NON-NLS-1$
	}

	//
	// Nested types
	//

	private class SelfDisposeAction implements Runnable {
		public void run() {
			dispose();
		}
	}
}
