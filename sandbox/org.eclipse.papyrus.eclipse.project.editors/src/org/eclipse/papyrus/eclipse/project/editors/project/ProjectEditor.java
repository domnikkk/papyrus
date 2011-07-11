/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.eclipse.project.editors.project;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.papyrus.eclipse.project.editors.Activator;
import org.eclipse.papyrus.eclipse.project.editors.interfaces.IProjectEditor;

/**
 * 
 * This class allows to manage the eclipse project
 * 
 */
public class ProjectEditor extends AbstractProjectEditor implements IProjectEditor {


	/**
	 * 
	 * Constructor.
	 * 
	 * @param project
	 *        the eclipse project
	 * @throws CoreException
	 */
	public ProjectEditor(final IProject project) throws CoreException {
		super(project);
	}

	/**
	 * 
	 * Constructor.
	 * 
	 * @param folder
	 *        a folder
	 * @throws CoreException
	 */
	public ProjectEditor(final IFolder folder) throws CoreException {
		super(null);
		//TODO : create an action to import a folder as a project!
		//this will allow to test the create method
		throw new UnsupportedOperationException();
	}



	/**
	 * Create the project file
	 * TODO NOT TESTED
	 * 
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IProjectEditor#createFiles(Set)
	 * 
	 *      {@inheritDoc}
	 */
	public void createFiles(final Set<String> files) {
		if(files.contains(PROJECT_FILE)) {
			IFile file = getProject().getFile(PROJECT_FILE);
			if(!file.exists()) {
				String input = ""; //$NON-NLS-1$
				input += AbstractProjectEditor.XML_HEADER;
				input += "<" + NAME + ">"; //$NON-NLS-1$ //$NON-NLS-2$
				input += getProject().getName();
				input += "</" + NAME + ">"; //$NON-NLS-1$ //$NON-NLS-2$
				input += "<" + COMMENT + ">"; //$NON-NLS-1$ //$NON-NLS-2$
				input += "</" + COMMENT + ">"; //$NON-NLS-1$ //$NON-NLS-2$
				input += "<" + BUILD_SPEC + ">"; //$NON-NLS-1$ //$NON-NLS-2$
				input += "</" + BUILD_SPEC + ">"; //$NON-NLS-1$ //$NON-NLS-2$
				input += "<" + NATURE + ">"; //$NON-NLS-1$ //$NON-NLS-2$
				input += "</" + NATURE + ">"; //$NON-NLS-1$ //$NON-NLS-2$

				try {
					file.create(getInputStream(input), true, null);
				} catch (CoreException e) {
					Activator.log.error(e);
				}
			}
		}
	}


	/**
	 * 
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IProjectEditor#getMissingFiles()
	 * 
	 *      {@inheritDoc}
	 */
	@Override
	public Set<String> getMissingFiles() {
		Set<String> missingFile = super.getMissingFiles();
		IFile projectFile = getProject().getFile(PROJECT_FILE);
		if(!projectFile.exists()) {
			missingFile.add(IProjectEditor.PROJECT_FILE);
		}
		return missingFile;
	}
}
