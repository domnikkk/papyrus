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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards;

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.ui.providers.DeleteEmptyDecoratorModelsPolicy;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * @author damus
 *
 */
public class InternalizeProfileApplicationsWizard extends Wizard implements IWorkbenchWizard {

	private Package package_;

	private InternalizeProfileApplicationsPage mainPage;

	public InternalizeProfileApplicationsWizard() {
		super();

		setWindowTitle(Messages.InternalizeProfileApplicationsWizard_0);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		EObject eObject = EMFHelper.getEObject(selection.getFirstElement());
		if (eObject instanceof Package) {
			package_ = (Package) eObject;

			if (mainPage != null) {
				mainPage.setInput(package_);
			}
		}
	}

	@Override
	public void addPages() {
		mainPage = new InternalizeProfileApplicationsPage();
		addPage(mainPage);
		mainPage.setInput(package_);
	}

	@Override
	public boolean performFinish() {
		boolean result = false;

		List<ProfileApplication> profileApplications = mainPage.getSelectedProfileApplications();

		if (!profileApplications.isEmpty()) {
			Command command = DecoratorModelUtils.createReclaimProfileApplicationsCommand(profileApplications, new DeleteEmptyDecoratorModelsPolicy(getShell()));
			TransactionUtil.getEditingDomain(package_).getCommandStack().execute(command);

			result = true;
		}

		return result;
	}

}
