/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Ansgar Radermacher  ansgar.radermacher@cea.fr
 *
 *****************************************************************************/


package org.eclipse.papyrus.uml.diagram.wizards;

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;

/**
 * An abstract wizard that can be used for copying model pages. Concrete examples need to
 * inherit from this class and specify model name and location.
 *
 */
abstract public class ModelCopyWizard extends Wizard implements INewWizard {

	private static final String EXT_DI = ".di"; //$NON-NLS-1$

	private static final String EXT_NOTATION = ".notation"; //$NON-NLS-1$

	private static final String EXT_UML = ".uml"; //$NON-NLS-1$

	private IStructuredSelection selection;

	/**
	 * The model name (without extension)
	 */
	protected String modelName;

	/**
	 * The model location
	 */
	protected String modelLocation;

	/**
	 * Constructor taking modelName as parameter. Default location in
	 * models/examples is used
	 * 
	 * @param modelName
	 *            the name of the example (without extension)
	 */
	protected ModelCopyWizard(String modelName) {
		this.modelName = modelName;
		this.modelLocation = "/models/examples/"; //$NON-NLS-1$
	}

	/**
	 * Constructor taking modelName (without extension) and location as parameters
	 * 
	 * @param modelName
	 *            the name of the example (without extension)
	 * @param modelLocation
	 *            location of the model relative to the plug-in in which it is contained
	 */
	protected ModelCopyWizard(String modelName, String modelLocation) {
		this.modelName = modelName;
		this.modelLocation = modelLocation;
	}

	protected WizardNewFileCreationPage selectionPage;

	@Override
	public boolean performFinish() {
		// String fileName = diagramModelFilePage.getFileName();
		IFile model = copyModel(modelName);

		if (model == null) {
			return false;
		}

		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchPage page = wb.getActiveWorkbenchWindow().getActivePage();
		try {
			IEditorDescriptor desc = wb.getEditorRegistry().getDefaultEditor(modelName + EXT_DI);
			IEditorInput input = new FileEditorInput(model);
			page.openEditor(input, desc.getId(), false);
		} catch (PartInitException e) {
			// log.error(e);
			return false;
		}
		return true;
	}

	/**
	 * Copy a model (.di/.notation/.uml) into the selected destination folder
	 *
	 * @param sourceModelName
	 */
	public IFile copyModel(String sourceModelName) {
		try {
			IFile model = copyFile(sourceModelName + EXT_DI);
			copyFile(sourceModelName + EXT_NOTATION);
			copyFile(sourceModelName + EXT_UML);
			return model;
		} catch (CoreException e) {
			Shell shell = new Shell();
			String reason = e.getMessage();
			if (reason.endsWith(Messages.ModelCopyWizard_AlreadyyExists)) {
				reason += "\n" + //$NON-NLS-1$
						Messages.ModelCopyWizard_ChooseOtherParentFolder;
			}
			MessageDialog.openError(shell, Messages.ModelCopyWizard_CannotCreateCopy, reason);
			return null;
		}
	}

	/**
	 * copy a source file into the selected destination folder
	 *
	 * @param sourceFileName
	 */
	public IFile copyFile(String sourceFileName) throws CoreException {
		IPath destPath = selectionPage.getContainerFullPath();
		InputStream is = getClass().getResourceAsStream(modelLocation + sourceFileName);
		if (is != null) {
			destPath = destPath.append(sourceFileName);
			IFile destFile = ResourcesPlugin.getWorkspace().getRoot().getFile(destPath);
			destFile.create(is, false, null);
			return destFile;
		}
		else {
			throw new CoreException(new Status(0, Activator.PLUGIN_ID,
					String.format(Messages.ModelCopyWizard_CannotOpenFIle, modelLocation + sourceFileName)));
		}
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.ModelCopyWizard_CreatePapyrusExample);
		setNeedsProgressMonitor(true);
	}


	/**
	 * @generated
	 */
	@Override
	public void addPages() {
		selectionPage = new WizardNewFileCreationPage(Messages.ModelCopyWizard_CopyModel, selection);
		selectionPage.setTitle(String.format(Messages.ModelCopyWizard_SelectParentFolder, modelName));
		selectionPage.setDescription(Messages.ModelCopyWizard_DoNotChangeFileName);
		selectionPage.setFileName(modelName);
		addPage(selectionPage);
	}
}
