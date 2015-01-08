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

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.migration.rsa.messages.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * 
 * Page displaying the selected elements and the migration's configuration options
 * 
 * @author Quentin Le Menez
 *
 */
public class TransformationConfigPage extends WizardPage {

	protected ConfigurationComposite configComposite;

	protected DialogData dialogData;


	/**
	 *
	 * Constructor.
	 * 
	 * @param dialogData
	 *            The instance used to get the previously selected files from both the settings file and the previous page selection,
	 *            as well as the configuration used to display the transformation options
	 */
	public TransformationConfigPage(DialogData dialogData) {
		super(Messages.TransformationConfigPage_Name);
		setTitle(Messages.TransformationConfigPage_Title);
		setDescription(Messages.TransformationConfigPage_Description);
		// String iconPath = "icons/import_wiz_75x66.png"; //$NON-NLS-1$
		// ImageDescriptor imgDescriptior = Activator.getDefault().getImageDescriptor(iconPath);
		// setImageDescriptor(imgDescriptior);

		this.dialogData = dialogData;
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		Composite pageComposite = new Composite(parent, SWT.NONE);
		pageComposite.setLayout(new GridLayout());

		configComposite = new ConfigurationComposite(pageComposite, SWT.NONE, dialogData);

		setControl(pageComposite);
	}

	/**
	 * 
	 * Used to update the input of the nested composite's viewer
	 * 
	 */
	public void resetViewerInput() {
		configComposite.setViewerInput(dialogData.getSelectedFiles());
	}

}
