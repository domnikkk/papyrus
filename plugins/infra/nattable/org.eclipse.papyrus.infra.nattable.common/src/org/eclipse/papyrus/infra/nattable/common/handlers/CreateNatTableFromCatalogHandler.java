/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Juan Cadavid (CEA LIST) juan.cadavid@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.common.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForHandlers;
import org.eclipse.papyrus.infra.nattable.common.Activator;
import org.eclipse.papyrus.infra.nattable.common.wizards.CreateNattableFromCatalogWizard;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.TableConfiguration;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusSyncTable;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusTable;
import org.eclipse.papyrus.infra.viewpoints.policy.PolicyChecker;
import org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Handler to display the wizard to display the catalog of existing Nattable
 * configurations.
 */
public class CreateNatTableFromCatalogHandler extends AbstractHandler {



	// OLD code before ViewPrototype

	// /**
	// * We open the dialog, request the user for the desired configuration
	// *
	// * @see org.eclipse.papyrus.infra.nattable.common.handlers.AbstractCreateNattableEditorHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	// *
	// * @param event
	// * @return
	// * @throws ExecutionException
	// */
	// @Override
	// public Object execute(ExecutionEvent event) throws ExecutionException {
	// final EObject context = getSelection().get(0);
	// CreateNattableFromCatalogWizard wizard = new CreateNattableFromCatalogWizard(context);
	// WizardDialog dialog = new WizardDialog(Display.getCurrent().getActiveShell(), wizard);
	// ServicesRegistry serviceRegistry = null;
	// TransactionalEditingDomain domain = null;
	// try {
	// serviceRegistry = ServiceUtilsForHandlers.getInstance().getServiceRegistry(event);
	// domain = ServiceUtils.getInstance().getTransactionalEditingDomain(serviceRegistry);
	// } catch (ServiceException e) {
	// Activator.log.error(e);
	// return null;
	// }
	//
	// if (dialog.open() == Window.OK) {
	//			CompoundCommand compoundCommand = new CompoundCommand("Create tables from Catalog"); //$NON-NLS-1$
	//
	// for (TableConfiguration tableConfiguration : wizard.getSelectedConfig().keySet()) {
	// CreateNatTableEditorHandler handler = new CreateNatTableEditorHandler();
	// handler.setType(tableConfiguration.getType());
	//
	// // See how many tables were required for this type
	// Integer tablesQuantity = wizard.getSelectedConfig().get(tableConfiguration);
	//
	// // Get the chosen name for the tables under this configuration
	// final String tableConfigName = wizard.getTableNames().get(tableConfiguration);
	// for (int i = 0; i < tablesQuantity; i++) {
	// try {
	//						Command cmd = handler.getCreateNattableEditorCommandWithNameInitialization(domain, serviceRegistry, event, tableConfigName + "_" + i);//$NON-NLS-1$
	// compoundCommand.append(cmd);
	// } catch (ServiceException e) {
	// Activator.log.error(e);
	// }
	// }
	// }
	// if (!compoundCommand.isEmpty()) {
	// domain.getCommandStack().execute(compoundCommand);
	// }
	//
	// }
	// return null;
	// }



	// NEW CODE using ViewPrototype
	/**
	 * We open the dialog, request the user for the desired configuration
	 *
	 * @see org.eclipse.papyrus.infra.nattable.common.handlers.AbstractCreateNattableEditorHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final EObject context = getSelection().get(0);
		final CreateNattableFromCatalogWizard wizard = new CreateNattableFromCatalogWizard(context);
		WizardDialog dialog = new WizardDialog(Display.getCurrent().getActiveShell(), wizard);
		ServicesRegistry serviceRegistry = null;
		TransactionalEditingDomain domain = null;
		try {
			serviceRegistry = ServiceUtilsForHandlers.getInstance().getServiceRegistry(event);
			domain = ServiceUtils.getInstance().getTransactionalEditingDomain(serviceRegistry);
		} catch (ServiceException e) {
			Activator.log.error(e);
			return null;
		}

		if (dialog.open() == Window.OK) {

			// we get the prototype available for the current selection
			final List<ViewPrototype> data = new ArrayList<ViewPrototype>();
			for (final ViewPrototype proto : PolicyChecker.getCurrent().getPrototypesFor(context)) {
				if (!(proto.getConfiguration() instanceof PapyrusTable || proto.getConfiguration() instanceof PapyrusSyncTable)) {
					continue;
				}
				data.add(proto);
			}

			final RecordingCommand rc = new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					for (final TableConfiguration tableConfiguration : wizard.getSelectedConfig().keySet()) {


						ViewPrototype protoToUse = null;
						int j = 0;
						while (j < data.size() && protoToUse == null) {
							ViewPrototype current = data.get(j);
							j++;
							if (current.getImplementation().equals(tableConfiguration.getType())) {
								protoToUse = current;
							}
						}
						if (protoToUse == null) {
							continue; // we do nothing in this case to avoid to create a new table which won't be displayed in the ModelExplorer
						}
						// See how many tables were required for this type
						Integer tablesQuantity = wizard.getSelectedConfig().get(tableConfiguration);

						// Get the chosen name for the tables under this configuration
						final String tableConfigName = wizard.getTableNames().get(tableConfiguration);
						for (int i = 0; i < tablesQuantity; i++) {
							PolicyDefinedTableHandler handler2 = new PolicyDefinedTableHandler(tableConfiguration.eResource().getURI(), context, tableConfigName + "_" + i);
							handler2.execute(protoToUse);
						}

					}
				}
			};
			domain.getCommandStack().execute(rc);
		}
		return null;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.common.handlers.CreateNatTableEditorHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		setBaseEnabled(getSelection().size() == 1);
	}

	/**
	 *
	 * @return
	 */
	protected List<EObject> getSelection() {
		final List<EObject> selectedElements = new ArrayList<EObject>();
		final IWorkbenchWindow ww = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (ww != null) {
			final ISelection selection = ww.getSelectionService().getSelection();
			if (selection instanceof IStructuredSelection) {
				final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				final Iterator<?> it = structuredSelection.iterator();
				while (it.hasNext()) {
					final Object object = it.next();
					final EObject currentEObject = EMFHelper.getEObject(object);
					if (currentEObject != null) {
						selectedElements.add(currentEObject);
					}
				}
			}
		}
		return selectedElements;
	}

}
