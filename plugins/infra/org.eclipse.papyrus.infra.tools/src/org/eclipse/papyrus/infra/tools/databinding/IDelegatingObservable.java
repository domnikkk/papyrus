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

import org.eclipse.core.databinding.observable.IObservable;



/**
 * <p>
 * An {@linkplain IObservable observable} that delegates its function (including notification of state changes) to a wrapped instance. The delegate may be {@linkplain #setDelegate(IObservable) replaced} at any time. Thus, the lifecycle of a delegator is
 * independent of its delegate and {@link #dispose() disposing} a delegator only disposes it, not its delegate if it has one at the time.
 * </p>
 * <p>
 * Delegating observables may be created via factory methods provided by the {@link DelegatingObservable} class.
 * </p>
 *
 * @see DelegatingObservable
 */
public interface IDelegatingObservable extends IObservable, ReferenceCountedObservable {

	/**
	 * Assigns me a new delegate, or at least forgets my delegate if {@code null}.
	 *
	 * @param delegate
	 *            my delegate (may be {@code null})
	 */
	void setDelegate(IObservable delegate);

	/**
	 * Obtains my current delegate, if any.
	 *
	 * @return my delegate, or {@code null} if I have none
	 */
	IObservable getDelegate();

	/**
	 * Disposes of me and my own resources only. In particular, if I have a {@linkplain #getDelegate() delegate}, it is <em>not</em> disposed, but
	 * must be disposed independently.
	 */
	void dispose();
}
