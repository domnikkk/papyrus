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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui;

import java.util.concurrent.ExecutorService;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.papyrus.infra.core.log.LogHelper;
import org.eclipse.papyrus.infra.tools.util.UIUtil;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.papyrus.uml.decoratormodel.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private ExecutorService executorService;

	/**
	 * Logging utility.
	 */
	public static LogHelper log;

	public Activator() {
		super();
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);

		executorService = UIUtil.createUIExecutor(Display.getDefault());

		plugin = this;
		log = new LogHelper(this);

		// Kick the index
		DecoratorModelIndex.getInstance();
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
	 * Obtains the static instance.
	 *
	 * @return the static instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public ImageDescriptor getIcon(String path) {
		if (!path.startsWith("icons/")) { //$NON-NLS-1$
			path = "icons/" + path; //$NON-NLS-1$
		}
		return AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public ExecutorService getExecutorService() {
		return executorService;
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
}
