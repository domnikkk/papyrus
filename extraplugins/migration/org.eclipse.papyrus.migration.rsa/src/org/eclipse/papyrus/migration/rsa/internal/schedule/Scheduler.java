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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.papyrus.migration.rsa.Activator;

/**
 * Executes a number of parallel tasks on the specified (maximum) amount of threads
 *
 * @author Camille Letavernier
 *
 */
public class Scheduler {

	protected int maxThreads;

	public Scheduler(int maxThreads) {
		this.maxThreads = Math.max(1, maxThreads);
	}

	public void schedule(IProgressMonitor monitor, List<? extends Schedulable> tasks) {

		List<Schedulable> remainingTasks = new LinkedList<Schedulable>(tasks);
		List<Schedulable> runningTasks = new LinkedList<Schedulable>();

		while (!remainingTasks.isEmpty()) {
			if (monitor.isCanceled()) {
				monitor.subTask("Canceling remaining jobs...");
				for (Schedulable task : runningTasks) {
					task.cancel();
				}
				remainingTasks.clear(); // Don't start these transformations at all
				// Keep waiting: the cancel operation is asynchronous, we still need to wait for the jobs to complete
			}

			// Schedule transformations if we have enough threads and they have not all been scheduled
			while (runningTasks.size() < maxThreads && !remainingTasks.isEmpty()) {
				final Schedulable task = remainingTasks.remove(0); // Get and remove
				task.start();
				runningTasks.add(task);
			}

			if (!runningTasks.isEmpty()) {
				String waitFor = runningTasks.get(0).getName();
				monitor.subTask("Waiting for Import " + waitFor + " to complete...");
			}

			// We can continue if at least one transformation is complete (Leaving a free Thread)
			boolean canContinue = false;

			Iterator<Schedulable> iterator = runningTasks.iterator();
			while (iterator.hasNext()) {
				Schedulable runningTask = iterator.next();
				if (runningTask.isComplete()) {
					canContinue = true;
					iterator.remove();
					monitor.worked(1);
				}
			}

			if (!canContinue) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException ex) {
					Activator.log.error(ex);
				}
			}
		}

		// All transformations have been scheduled (But not necessarily completed): wait for all of them to complete
		wait(runningTasks, monitor);
	}


	// Wait for all (remaining) import transformations to complete
	protected void wait(List<Schedulable> tasks, IProgressMonitor monitor) {

		// Transformations still running
		List<Schedulable> runningTasks = new LinkedList<Schedulable>(tasks);

		while (!runningTasks.isEmpty()) {
			if (monitor.isCanceled()) {
				monitor.subTask("Canceling remaining jobs...");
				for (Schedulable task : runningTasks) {
					task.cancel();
				}
				// Keep waiting: the cancel operation is asynchronous, we still need to wait for the jobs to complete
			}

			Iterator<Schedulable> iterator = runningTasks.iterator();
			while (iterator.hasNext()) {
				Schedulable task = iterator.next();
				if (task.isComplete()) {
					iterator.remove();
					monitor.worked(1);
				}
			}

			if (!runningTasks.isEmpty()) {
				String waitFor = runningTasks.get(0).getName();
				monitor.subTask("Waiting for " + waitFor + " to complete...");

				try {
					Thread.sleep(100);
				} catch (InterruptedException ex) {
					Activator.log.error(ex);
					return;
				}
			}
		}
	}
}
