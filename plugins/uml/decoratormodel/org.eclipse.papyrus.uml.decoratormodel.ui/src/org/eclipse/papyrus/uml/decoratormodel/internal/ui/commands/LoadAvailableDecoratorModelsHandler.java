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

import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards.LoadProfileApplicationsWizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Package;

/**
 * Command handler for the "Load Available Profile Applications&hellip;" command.
 */
public class LoadAvailableDecoratorModelsHandler extends AbstractHandler {

	public LoadAvailableDecoratorModelsHandler() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event).getWorkbench().getActiveWorkbenchWindow();
		ISelection selection = HandlerUtil.getActiveMenuSelectionChecked(event);

		if (selection instanceof IStructuredSelection) {
			Package package_ = (Package) EMFHelper.getEObject(((IStructuredSelection) selection).getFirstElement());
			promptToLoadAvailableProfileApplications(window.getShell(), package_, false);
		}

		return null;
	}

	public static void promptToLoadAvailableProfileApplications(Shell parentShell, Package package_, final boolean autoPrompt) {
		LoadProfileApplicationsWizard wizard = new LoadProfileApplicationsWizard(autoPrompt);
		wizard.init(package_, Collections.<URI> emptySet());

		WizardDialog dlg = new WizardDialog(parentShell, wizard);
		dlg.open();
	}
}
