/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Tatiana Fesenko (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.papyrus.core.utils.DiResourceSet;
import org.eclipse.papyrus.wizards.pages.SelectDiagramCategoryPage;

/**
 * The Wizard creates a new Project and a several Papyrus Models of different type inside it
 */
public class NewPapyrusProjectWithMultiModelsWizard extends NewPapyrusProjectWizard {

	/** The Constant WIZARD_ID. */
	public static final String WIZARD_ID = "org.eclipse.papyrus.wizards.1createproject.several";

	@Override
	protected SelectDiagramCategoryPage createSelectDiagramCategoryPage() {
		return new SelectDiagramCategoryPage(true);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean performFinish() {
		IProject newProjectHandle;
		try {
			newProjectHandle = createNewProject();
		} catch (CoreException e) {
			Activator.log.error("Problems during opening of the project", e);
			return false;
		}
		if (newProjectHandle == null) {
			return false;
		}
		for (String category: getDiagramCategoryIds()) {
			final IFile newFile = createNewModelFile(category);
			DiResourceSet diResourceSet = new DiResourceSet();
			createAndOpenPapyrusModel(diResourceSet, newFile, category);
		}

		saveDiagramCategorySettings();
		saveDiagramKindSettings();
		return true;
	}

}
