/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Quentin Le Menez (CEA LIST) quentin.lemenez@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.wizard;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.messages.Messages;
import org.eclipse.papyrus.migration.rsa.transformation.ImportTransformationLauncher;
import org.eclipse.papyrus.migration.rsa.wizard.pages.TransformationConfigPage;
import org.eclipse.papyrus.migration.rsa.wizard.pages.TransformationSelectionPage;
import org.eclipse.papyrus.migration.rsa.wizard.pages.DialogData;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

/**
 * 
 * Wizard handling the selection and transformation of .emx/.epx files
 * 
 * @author Quentin Le Menez
 *
 */
public class TransformationWizard extends Wizard implements IImportWizard {

	protected IWizardPage currentPage;

	protected DialogData dialogData = new DialogData();

	protected TransformationSelectionPage selectionPage = new TransformationSelectionPage(dialogData);

	protected TransformationConfigPage configPage = new TransformationConfigPage(dialogData);


	public TransformationWizard() {
		setWindowTitle(Messages.TransformationWizard_Title);
	}

	@Override
	public void addPages() {
		this.addPage(selectionPage);
		this.addPage(configPage);

	}

	@Override
	public IWizardPage getNextPage(IWizardPage currentPage) {
		if (currentPage == selectionPage) {
			this.currentPage = configPage;
			// Reset the viewer input in order to show the newly selected elements from the selectionPage
			configPage.resetViewerInput();
			return configPage;
		}
		if (this.currentPage == configPage) {
			this.currentPage = selectionPage;
		}
		return null;
	}

	@Override
	public boolean canFinish() {
		if (currentPage == configPage) {
			return super.canFinish();
		}
		return false;
	}


	@Override
	public boolean performFinish() {
		// Set or update the unchecked elements for future executions of the plugin
		dialogData.setSelectionMap();
		importFiles();

		return true;
	}


	/**
	 *
	 * Launch the transformation with the previously selected files and configuration parameters
	 *
	 */
	protected void importFiles() {
		Config config = dialogData.getConfig();
		if (config == null) {
			return;
		}

		Set<IFile> selectedFiles = new HashSet<IFile>();
		for (Object file : dialogData.getTransformationFiles()) {
			if (file instanceof IFile) {
				selectedFiles.add((IFile) file);
			}
		}

		List<URI> urisToImport = new LinkedList<URI>();

		for (IFile selectedFile : selectedFiles) {
			URI uri = URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true);

			urisToImport.add(uri);
		}

		// The wizard's Shell will be disposed because the transformation is asynchronous. Use the Shell's parent instead
		ImportTransformationLauncher launcher = new ImportTransformationLauncher(config, this.getShell().getParent());
		launcher.run(urisToImport);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}


}
