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
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards.UnloadProfileApplicationsWizard;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Package;

import com.google.common.collect.Sets;

/**
 * Command handler for the "Unload Decorator Models&hellip;" command.
 */
public class UnloadLoadedDecoratorModelsHandler extends AbstractHandler {

	public UnloadLoadedDecoratorModelsHandler() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event).getWorkbench().getActiveWorkbenchWindow();
		ISelection selection = HandlerUtil.getActiveMenuSelectionChecked(event);

		if (selection instanceof IStructuredSelection) {
			Package package_ = (Package) EMFHelper.getEObject(((IStructuredSelection) selection).getFirstElement());
			Set<URI> loaded = Sets.newHashSet();

			// Collect all loaded profile application resources for loaded sub-units
			loaded.addAll(DecoratorModelUtils.getLoadedDecoratorModels(package_.eResource()));
			for (Package subUnit : DecoratorModelUtils.getLoadedSubUnitPackages(package_)) {
				loaded.addAll(DecoratorModelUtils.getLoadedDecoratorModels(subUnit.eResource()));
			}

			if (loaded.isEmpty()) {
				MessageDialog.openWarning(window.getShell(), Messages.UnloadLoadedDecoratorModelsHandler_0, Messages.UnloadLoadedDecoratorModelsHandler_1);
			} else {
				UnloadProfileApplicationsWizard wizard = new UnloadProfileApplicationsWizard();
				wizard.init(package_, Collections.<URI> emptySet());

				WizardDialog dlg = new WizardDialog(window.getShell(), wizard);
				dlg.open();
			}
		}

		return null;
	}
}
