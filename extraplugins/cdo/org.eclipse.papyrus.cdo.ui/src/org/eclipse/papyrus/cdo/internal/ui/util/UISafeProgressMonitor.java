/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.cdo.internal.ui.util;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Display;

/**
 * A progress monitor that synchronizes updates with the UI thread.
 */
public class UISafeProgressMonitor implements IProgressMonitor {

	private final Display display;

	private final IProgressMonitor delegate;

	public UISafeProgressMonitor(IProgressMonitor delegate, Display display) {
		this.delegate = delegate;
		this.display = display;
	}

	private void exec(Runnable runnable) {
		if (Display.getCurrent() == display) {
			runnable.run();
		} else {
			display.syncExec(runnable);
		}
	}

	@Override
	public void beginTask(final String name, final int totalWork) {
		exec(new Runnable() {

			@Override
			public void run() {
				delegate.beginTask(name, totalWork);
			}
		});
	}

	@Override
	public void internalWorked(final double work) {
		exec(new Runnable() {

			@Override
			public void run() {
				delegate.internalWorked(work);
			}
		});
	}

	@Override
	public boolean isCanceled() {
		final boolean[] result = { false };

		exec(new Runnable() {

			@Override
			public void run() {
				result[0] = delegate.isCanceled();
			}
		});

		return result[0];
	}

	@Override
	public void setCanceled(final boolean value) {
		exec(new Runnable() {

			@Override
			public void run() {
				delegate.setCanceled(value);
			}
		});
	}

	@Override
	public void setTaskName(final String name) {
		exec(new Runnable() {

			@Override
			public void run() {
				delegate.setTaskName(name);
			}
		});
	}

	@Override
	public void subTask(final String name) {
		exec(new Runnable() {

			@Override
			public void run() {
				delegate.subTask(name);
			}
		});
	}

	@Override
	public void worked(final int work) {
		exec(new Runnable() {

			@Override
			public void run() {
				delegate.worked(work);
			}
		});
	}

	@Override
	public void done() {
		exec(new Runnable() {

			@Override
			public void run() {
				done();
			}
		});
	}
}
