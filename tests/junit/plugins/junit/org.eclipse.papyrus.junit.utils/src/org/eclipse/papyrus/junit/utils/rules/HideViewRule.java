/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.junit.utils.rules;

import static org.junit.Assert.fail;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


/**
 * A rule that hides a view for the duration of a test.
 */
public class HideViewRule extends TestWatcher {

	private final String viewID;

	private IWorkbenchPage page;

	public HideViewRule(String viewID) {
		super();

		this.viewID = viewID;
	}

	@Override
	protected void starting(Description description) {
		IWorkbench bench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = bench.getActiveWorkbenchWindow();
		if(window == null) {
			window = bench.getWorkbenchWindows()[0];
		}

		IWorkbenchPage page = window.getActivePage();
		IViewPart viewPart = page.findView(viewID);

		if(viewPart != null) {
			this.page = page;
			page.hideView(viewPart);
		}
	}

	@Override
	protected void finished(Description description) {
		if(page != null) {
			try {
				page.showView(viewID);
			} catch (PartInitException e) {
				fail(String.format("Failed to restore view %s: %s", viewID, e.getLocalizedMessage()));
			}
		}

		page = null;
	}
}
