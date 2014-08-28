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
package org.eclipse.papyrus.uml.modelrepair.service;

import java.util.concurrent.ExecutorService;


/**
 * A Papyrus service that provides for interaction with the Stereotype Repair functions.
 */
public interface IStereotypeRepairService {

	/**
	 * Queries whether a repair operation is currently in progress.
	 *
	 * @return whether the model repair function is currently engaged (interactive with the user or otherwise)
	 */
	boolean isRepairing();

	/**
	 * Obtains an executor service that may be used to schedule operations to run after the completion
	 * of the currently-in-progress repair session. If no repair is currently under way, the executor
	 * schedules operations immediately. It is not necessary, therefore, to check whether {@linkplain #isRepairing() we are repairing} before using
	 * the executor.
	 *
	 * @return an executor service to execute stuff after the current repair operation (if any) is complete
	 *
	 * @see #isRepairing()
	 */
	ExecutorService getPostRepairExecutor();
}
