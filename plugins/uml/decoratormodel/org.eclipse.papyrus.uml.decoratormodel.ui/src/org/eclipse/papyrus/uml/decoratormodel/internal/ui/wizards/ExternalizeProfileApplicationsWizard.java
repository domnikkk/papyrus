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

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertyShowInContext;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;

import com.google.common.collect.ImmutableList;

/**
 * @author damus
 *
 */
public class ExternalizeProfileApplicationsWizard extends Wizard implements IWorkbenchWizard {
	static final String PROPERTY_SHEET_VIEW_ID = "org.eclipse.ui.views.PropertySheet"; //$NON-NLS-1$

	private IWorkbenchWindow workbenchWindow;

	private Package package_;

	private ExternalizeProfileApplicationsPage mainPage;

	private List<ProfileApplication> initialSelections;

	public ExternalizeProfileApplicationsWizard() {
		super();

		setWindowTitle(Messages.ExternalizeProfileApplicationsWizard_0);
		setDialogSettings(DialogSettings.getOrCreateSection(Activator.getDefault().getDialogSettings(), getClass().getSimpleName()));
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		workbenchWindow = workbench.getActiveWorkbenchWindow();

		EObject eObject = EMFHelper.getEObject(selection.getFirstElement());
		if (eObject instanceof Package) {
			init((Package) eObject, Collections.<ProfileApplication> emptyList());
		}
	}

	public void init(Package package_, Iterable<ProfileApplication> initialSelections) {
		this.package_ = package_;
		this.initialSelections = ImmutableList.copyOf(initialSelections);

		if (mainPage != null) {
			mainPage.setInput(package_);
			mainPage.select(initialSelections);
		}

		if (workbenchWindow == null) {
			workbenchWindow = Activator.getActiveWorkbenchWindow();
		}
	}

	@Override
	public void addPages() {
		mainPage = new ExternalizeProfileApplicationsPage();
		addPage(mainPage);
		mainPage.setInput(package_);
		mainPage.select(initialSelections);
	}

	@Override
	public boolean performFinish() {
		boolean result = false;

		mainPage.saveSettings();

		List<ProfileApplication> profileApplications = mainPage.getSelectedProfileApplications();
		URI resourceURI = mainPage.getResourceURI();
		String modelName = mainPage.getModelName();

		if (!profileApplications.isEmpty() && (resourceURI != null)) {
			Command command = DecoratorModelUtils.createSeparateProfileApplicationsCommand(profileApplications, resourceURI, modelName);
			TransactionUtil.getEditingDomain(package_).getCommandStack().execute(command);

			result = true;

			refreshPropertySheet();
		}

		return result;
	}

	private void refreshPropertySheet() {
		if (workbenchWindow != null) {
			// Refresh the Properties view in case it wasn't showing the decorator models tab
			PropertySheet propertiesView = (PropertySheet) workbenchWindow.getActivePage().findView(PROPERTY_SHEET_VIEW_ID);
			if (propertiesView != null) {
				PropertyShowInContext context = (PropertyShowInContext) propertiesView.getShowInContext();
				if ((context != null) && (context.getSelection() instanceof IStructuredSelection) && (propertiesView.getCurrentPage() instanceof ISelectionListener)) {
					ISelectionListener page = (ISelectionListener) propertiesView.getCurrentPage();
					IStructuredSelection selection = (IStructuredSelection) context.getSelection();

					// The Tabbed Property Sheet page ignores the selection if it's the same as before
					page.selectionChanged(context.getPart(), StructuredSelection.EMPTY);

					// The XWT tab descriptor remembers the previous selection and just returns the cache
					// of tabs if it gets that same selection instance again, so create a new one for it
					page.selectionChanged(context.getPart(), new StructuredSelection(selection.toArray()));
				}
			}
		}
	}
}
