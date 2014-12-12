/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Ernest Wozniak (CEA LIST) ernest.wozniak@cea.fr - Initial API and implementation
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr modification
 *****************************************************************************/
package org.eclipse.papyrus.dsml.validation.generation.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.dsml.validation.model.elements.impl.ConstraintManagerImpl;
import org.eclipse.papyrus.dsml.validation.model.elements.interfaces.IConstraintProvider;
import org.eclipse.papyrus.dsml.validation.model.elements.interfaces.IConstraintsCategory;
import org.eclipse.papyrus.dsml.validation.model.elements.interfaces.IConstraintsManager;
import org.eclipse.papyrus.dsml.validation.model.elements.interfaces.IValidationRule;
import org.eclipse.papyrus.dsml.validation.model.profilenames.Utils;
import org.eclipse.papyrus.dsml.validation.wizard.CreateEMFValidationProject;
import org.eclipse.papyrus.dsml.validation.wizard.JavaContentGenerator;
import org.eclipse.papyrus.dsml.validation.wizard.ValidationPluginGenerator;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.builders.NotificationBuilder;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.uml2.uml.Profile;


/**
 * this handler launch the creation of the plugin to validate contraints of the profile
 *
 */
public class CreateJavaValidationPluginHandler extends AbstractHandler {

	private IConstraintsManager constraintsManager;


	/**
	 * <pre>
	 * Get the selected element, the first selected element if several are selected or null
	 * if no selection or the selection is not an {@link EObject}.
	 * 
	 * @return selected {@link EObject} or null
	 * </pre>
	 *
	 */
	protected EObject getSelectedElement() {
		EObject eObject = null;
		Object selection = null;

		// Get current selection
		selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();

		// Get first element if the selection is an IStructuredSelection
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			selection = structuredSelection.getFirstElement();
		}

		// Treat non-null selected object (try to adapt and return EObject)
		if (selection != null) {

			eObject = EMFHelper.getEObject(selection);
		}
		return eObject;
	}


	/**
	 *
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return null
	 * @throws ExecutionException
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		EObject selection = getSelectedElement();

		if (selection instanceof Profile) {
			Profile profileSelection = (Profile) selection;

			constraintsManager = new ConstraintManagerImpl(profileSelection);
			boolean isOCLConstraint = false;
			for (IConstraintProvider constraintProvider : constraintsManager.getConstraintsProviders()) {
				for (IConstraintsCategory constraintCategory : constraintProvider.getConstraintsCategories()) {
					for (IValidationRule constraint : constraintCategory.getConstraints()) {
						// this is an OCL constraint?
						if (Utils.hasSpecificationForOCL(constraint.getConstraint())) {
							isOCLConstraint = true;
						}
					}
				}
			}
			EPackage definition = null;
			if (isOCLConstraint) {
				definition = profileSelection.getDefinition();
				if (definition == null) {
					NotificationBuilder errorDialog = NotificationBuilder.createErrorPopup(Messages.CreateJavaValidationPluginHandler_ProfileMustBeDefined);
					errorDialog.run();
					// finish by displaying a message for the user to inform that it need to define it before to launch it.
					return null;
				}
			}
			IProject existingProject = null;
			URI uri = profileSelection.eResource().getURI();

			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			if (uri.segmentCount() >= 2) {
				existingProject = root.getProject(uri.segment(1));
			}
			int question = 0;
			Shell shell = Display.getDefault().getActiveShell();
			if ((existingProject != null) && existingProject.exists()) {
				MessageDialog dialog = new MessageDialog(shell,
						Messages.CreateJavaValidationPluginHandler_ChoosePluginGeneration, null,
						Messages.CreateJavaValidationPluginHandler_HowtoGeneratePlugin, MessageDialog.QUESTION,
						new String[] { Messages.CreateJavaValidationPluginHandler_CreateNewPlugin, Messages.CreateJavaValidationPluginHandler_SelectExisting, Messages.CreateJavaValidationPluginHandler_HostCurrent }, 2);
				question = dialog.open();
			}
			else if (root.getProjects().length > 0) {
				MessageDialog dialog = new MessageDialog(shell,
						Messages.CreateJavaValidationPluginHandler_ChoosePluginGeneration, null,
						Messages.CreateJavaValidationPluginHandler_HowtoGeneratePlugin, MessageDialog.QUESTION,
						new String[] { Messages.CreateJavaValidationPluginHandler_CreateNewPlugin, Messages.CreateJavaValidationPluginHandler_SelectExisting }, 1);
				question = dialog.open();
			}

			if ((question == 1) || (question == 2)) {
				if (question == 1) {
					// get object which represents the workspace

					ResourceListSelectionDialog dialog =
						    new ResourceListSelectionDialog(shell, root, IResource.PROJECT);
					dialog.setTitle(Messages.CreateJavaValidationPluginHandler_SelectExisting);
				
					if (dialog.open() == Window.OK) {
						existingProject = (IProject) dialog.getResult()[0];
					}
					else {
						existingProject = null;
					}
				}

				if (existingProject != null) {
					// generate java code
					JavaContentGenerator generateAllJava = new JavaContentGenerator(existingProject, profileSelection);
					generateAllJava.run();
					// generate plugin + extension point
					try {
						ValidationPluginGenerator.instance.generate(existingProject, constraintsManager, definition);
					} catch (Exception e) {
						Activator.log.error(e);
						MessageDialog.openInformation(shell, Messages.CreateJavaValidationPluginHandler_ExceptionDuringPluginGeneration, Messages.CreateJavaValidationPluginHandler_CheckErrorLog);
					}
				}
			}
			else if (question == 0) {

				CreateEMFValidationProject wizard = new CreateEMFValidationProject(profileSelection, constraintsManager, definition);
				wizard.openDialog();
			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		EObject eObject = getSelectedElement();
		if (eObject instanceof Profile) {
			return true;
		}
		return false;
	}

}
