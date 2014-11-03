/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST, Christian W. Damus, and others.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) - Initial API and implementation
 *  Christian W. Damus - bug 399859
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.controlmode;

import java.util.concurrent.ExecutorService;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.papyrus.infra.core.log.LogHelper;
import org.eclipse.papyrus.infra.tools.util.UIUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.papyrus.uml.decoratormodel.controlmode"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/** logger helper */
	public static LogHelper log;

	private ExecutorService executorService;

	public Activator() {
		super();
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);

		executorService = UIUtil.createUIExecutor(Display.getDefault());

		plugin = this;
		log = new LogHelper(this);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		executorService.shutdown();
		executorService = null;

		plugin = null;
		log = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public static IWorkbenchWindow getActiveWorkbenchWindow() {
		IWorkbenchWindow result = null;

		IWorkbench bench = PlatformUI.getWorkbench();
		if (bench != null) {
			result = bench.getActiveWorkbenchWindow();
			if (result == null) {
				IWorkbenchWindow[] allWindows = bench.getWorkbenchWindows();
				if (allWindows.length > 0) {
					result = allWindows[0];
				}
			}
		}

		return result;
	}

	public ExecutorService getExecutorService() {
		return executorService;
	}

	/**
	 * Changes my executor service for asynchronous processing in control-mode refactorings.
	 * 
	 * @param executorService
	 *            the new executor service. Must not be {@code null}
	 * 
	 * @return the formerly installed executor service (please restore it when you have finished with yours)
	 * 
	 * @throws IllegalArgumentException
	 *             if {@code executorService} is {@code null}
	 */
	public ExecutorService setExecutorService(ExecutorService executorService) {
		if (executorService == null) {
			throw new IllegalArgumentException("null executorService"); //$NON-NLS-1$
		}

		ExecutorService result = this.executorService;
		this.executorService = executorService;
		return result;
	}
}
