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

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.transformation.ImportTransformationLauncher;
import org.eclipse.papyrus.migration.rsa.wizard.pages.TransformationConfigPage;

public class TransformationConfigWizard extends Wizard {

	Collection<Object> selectedFiles;

	TransformationConfigPage transformationConfigPage;

	public TransformationConfigWizard(Collection<Object> selectedFiles) {
		setWindowTitle("RSA transformation wizard");
		this.selectedFiles = selectedFiles;
	}

	@Override
	public void addPages() {
		transformationConfigPage = new TransformationConfigPage(selectedFiles);
		addPage(transformationConfigPage);
	}

	@Override
	public boolean performFinish() {
		importFiles();
		return true;
	}


	/**
	 *
	 * Launches the transformation with the previously selected files and configuration parameters
	 *
	 */
	public void importFiles() {
		Config config = transformationConfigPage.getConfig();
		if (config == null) {
			return;
		}

		Set<IFile> selectedFiles = new HashSet<IFile>();
		for (Object file : transformationConfigPage.getTransformationFiles()) {
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

}
