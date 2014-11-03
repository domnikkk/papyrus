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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards.ExternalizeProfileApplicationsWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Command handler for the "Externalize Profile Applications&hellip;" command.
 */
public class ExternalizeProfilesHandler extends AbstractHandler {

	public ExternalizeProfilesHandler() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbench bench = HandlerUtil.getActiveWorkbenchWindowChecked(event).getWorkbench();
		ISelection selection = HandlerUtil.getActiveMenuSelectionChecked(event);

		if (selection instanceof IStructuredSelection) {
			ExternalizeProfileApplicationsWizard wizard = new ExternalizeProfileApplicationsWizard();
			wizard.init(bench, (IStructuredSelection) selection);

			WizardDialog dlg = new WizardDialog(bench.getActiveWorkbenchWindow().getShell(), wizard);
			dlg.open();
		}

		return null;
	}

}
