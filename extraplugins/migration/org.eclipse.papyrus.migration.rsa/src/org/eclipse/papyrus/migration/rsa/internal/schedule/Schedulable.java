/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.internal.schedule;

/**
 * Minimal API for schedulable tasks
 *
 * @author Camille Letavernier
 *
 */
public interface Schedulable {
	/**
	 *
	 * @return true if the task is complete
	 */
	public boolean isComplete();

	/**
	 *
	 * @return the label of the tasks
	 */
	public String getName();

	/**
	 * Starts the task. The implementation should start in a separate thread (e.g. via a Job)
	 */
	public void start();

	/**
	 * Requests the task to cancel. The task may not be canceled immediately; invoker should wait
	 * for isComplete() to return true after invoking this method
	 */
	public void cancel();

}
