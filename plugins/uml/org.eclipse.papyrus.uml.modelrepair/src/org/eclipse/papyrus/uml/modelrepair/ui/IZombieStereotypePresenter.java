/*****************************************************************************
 * Copyright (c) 2015 Christian W. Damus and others.
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

package org.eclipse.papyrus.uml.modelrepair.ui;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.papyrus.uml.modelrepair.internal.stereotypes.ZombieStereotypesDescriptor;
import org.eclipse.uml2.uml.Profile;

import com.google.common.base.Function;



/**
 * A protocol for presentation of zombie (broken) stereotypes for interactive repair.
 */
public interface IZombieStereotypePresenter {

	/**
	 * Disposes any resources I may be retaining.
	 */
	void dispose();

	/**
	 * Obtains a function that provides a suggested profile to apply to resolve a broken package schema. This should usually
	 * provide some kind of interaction with the user to select a profile if it cannot be determined automatically.
	 * 
	 * @return the dynamic profile supplier function
	 */
	Function<? super EPackage, Profile> getDynamicProfileSupplier();

	/**
	 * Adds zombies to be presented for interactive repair. This should generally engage the {@link #isPending() pending} state
	 * if it isn't already engaged.
	 * 
	 * @param zombies
	 *            the zombies to add
	 * 
	 * @see #isPending()
	 */
	void addZombies(ZombieStereotypesDescriptor zombies);

	/**
	 * Posts a block of code that will be executed asynchronously to add zombies. This engages the {@link #isPending() pending} state
	 * and the actual presentation of zombies will not be performed until all of these asynchronous blocks have run.
	 * 
	 * @param runnable
	 *            an asynchronous addition of zombies
	 * 
	 * @see #isPending()
	 */
	void asyncAddZombies(Runnable runnable);

	/**
	 * Queries whether an interactive repair session is currently pending.
	 * 
	 * @return whether interactive repair is pending
	 * 
	 * @see #awaitPending(boolean)
	 * @see #onPendingDone(Runnable)
	 */
	boolean isPending();

	/**
	 * Synchronously waits for a pending interactive repair session to finish or start, according to the {@code expected} state.
	 * If the session is already in the expected pending state, then this method returns immediately.
	 * 
	 * @param expected
	 *            whether to wait for interactive repair to become pending ({@code true}) or to cease pending ({@code false})
	 * 
	 * @throws InterruptedException
	 *             if the calling thread is interrupted while waiting for the pending state change
	 */
	void awaitPending(boolean expected) throws InterruptedException;

	/**
	 * Posts a {@code runnable} to be executed when the pending interactive repair session is completed.
	 * The runnable is executed immediately if interactive repair is not pending. Any number of runnables may be posted.
	 * 
	 * @param runnable
	 *            some code to run when interactive repair has finished
	 * 
	 * @see #isPending()
	 * @see #awaitPending(boolean)
	 */
	void onPendingDone(Runnable runnable);

}
