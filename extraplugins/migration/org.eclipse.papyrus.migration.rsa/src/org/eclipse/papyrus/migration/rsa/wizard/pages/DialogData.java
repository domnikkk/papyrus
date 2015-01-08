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
package org.eclipse.papyrus.migration.rsa.wizard.pages;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.papyrus.infra.widgets.util.FileUtil;
import org.eclipse.papyrus.migration.rsa.Activator;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.Config;
import org.eclipse.papyrus.migration.rsa.RSAToPapyrusParameters.RSAToPapyrusParametersFactory;
import org.eclipse.papyrus.migration.rsa.constants.TransformationWizardConstants;

/**
 * 
 * Class containing the bulk of the wizard's data for an easy access throughout the wizard
 * 
 * @author Quentin Le Menez
 *
 */
public class DialogData {

	protected Collection<Object> selectedFiles;

	protected Collection<Object> transformationFiles;

	protected Config config = RSAToPapyrusParametersFactory.eINSTANCE.createConfig();

	protected Collection<String> unselectedFiles;

	protected IDialogSettings dialogSection;

	protected Collection<Object> uncheckedFiles;

	/**
	 * 
	 * Constructor, instantiate the configuration file to store the user's selections, if none exist, or retrieve it
	 *
	 */
	public DialogData() {
		// Necessary for storing and recalling the previous selections
		dialogSection = Activator.getDefault().getDialogSettings().getSection(TransformationWizardConstants.TRANSFORMATION_WIZARD_SETTINGS);
		if (dialogSection == null) {
			dialogSection = Activator.getDefault().getDialogSettings().addNewSection(TransformationWizardConstants.TRANSFORMATION_WIZARD_SETTINGS);
		}
	}

	/**
	 * 
	 * @param selectedFiles
	 *            The selected files from the workspace to be displayed in the transformation page
	 */
	public void setSelectedFiles(Collection<Object> selectedFiles) {
		this.selectedFiles = selectedFiles;
	}

	/**
	 * 
	 * @param transformationFiles
	 *            The selected files in the configuration page to be transformed
	 */
	public void setTransformationFiles(Collection<Object> transformationFiles) {
		this.transformationFiles = transformationFiles;
	}

	/**
	 * 
	 * @return
	 *         The default extensions used to filter the workspace
	 */
	public String[] getExtensions() {
		return TransformationWizardConstants.EXTENSIONS;
	}

	/**
	 * 
	 * @return
	 *         The default extensions' name used to filter the workspace
	 */
	public String[] getExtensionsNames() {
		return TransformationWizardConstants.EXTENSIONS_NAMES;
	}

	/**
	 * 
	 * @return
	 *         The selected files from the workspace
	 */
	public Collection<Object> getSelectedFiles() {
		return selectedFiles;
	}

	/**
	 * 
	 * @return
	 *         The parameters used for the transformation
	 */
	public Config getConfig() {
		return config;
	}

	/**
	 * 
	 * @return
	 *         The selected files to be transformed
	 */
	public Collection<Object> getTransformationFiles() {
		return transformationFiles;
	}

	/**
	 * 
	 * @param uncheckedFiles
	 *            The selected files to be ignored during the transformation
	 */
	public void setUncheckedFiles(Collection<Object> uncheckedFiles) {
		this.uncheckedFiles = uncheckedFiles;
	}

	/**
	 * 
	 * Update or create the selection map stored inside the configuration file in order to remember the previous selection choices
	 * 
	 */
	public void setSelectionMap() {
		// Retrieve or create the list of unselected elements
		if (getUnSelectionArray() != null) {
			unselectedFiles = new LinkedList<String>(Arrays.asList(getUnSelectionArray()));
		}
		else {
			unselectedFiles = new LinkedList<String>();
		}
		// Updates the unselected files for future references
		for (Object object : uncheckedFiles) {
			if (object instanceof IFile) {
				IFile file = (IFile) object;
				String filePath = FileUtil.getPath(file, true);
				if (!unselectedFiles.contains(filePath)) {
					unselectedFiles.add(filePath);
				}
			}
		}
		// Remove any newly selected files from the unselected files pool
		for (Object object : transformationFiles) {
			if (object instanceof IFile) {
				IFile file = (IFile) object;
				String filePath = FileUtil.getPath(file, true);
				if (unselectedFiles.contains(filePath)) {
					unselectedFiles.remove(filePath);
				}
			}
		}

		// Update the map
		dialogSection.put(TransformationWizardConstants.SELECTION_KEY, unselectedFiles.toArray(new String[unselectedFiles.size()]));
	}

	/**
	 * 
	 * Used to set the checked state of the selected files inside the viewer
	 * 
	 * @return
	 *         The user's previously unchecked files in the configPage
	 */
	public String[] getUnSelectionArray() {
		return dialogSection.getArray(TransformationWizardConstants.SELECTION_KEY);
	}

}
