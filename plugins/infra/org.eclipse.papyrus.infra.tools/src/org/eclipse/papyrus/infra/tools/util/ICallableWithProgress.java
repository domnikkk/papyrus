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

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;

/**
 * The {@link Callable} analogue of an {@link IRunnableWithProgress}.
 */
public interface ICallableWithProgress<V> {
	/**
	 * Invokes me in a runnable context with a progress monitor.
	 * 
	 * @param monitor
	 *            the progress monitor to use to display progress and receive
	 *            requests for cancellation
	 * @exception InvocationTargetException
	 *                if the run method must propagate a checked exception,
	 *                it should wrap it inside an <code>InvocationTargetException</code>; runtime exceptions are automatically
	 *                wrapped in an <code>InvocationTargetException</code> by the calling context
	 * @exception InterruptedException
	 *                if the operation detects a request to cancel,
	 *                using <code>IProgressMonitor.isCanceled()</code>, it should exit by throwing <code>InterruptedException</code>
	 *
	 * @see UIUtil#call(IRunnableContext, ICallableWithProgress)
	 * @see IRunnableContext#run
	 */
	V call(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException;
}
