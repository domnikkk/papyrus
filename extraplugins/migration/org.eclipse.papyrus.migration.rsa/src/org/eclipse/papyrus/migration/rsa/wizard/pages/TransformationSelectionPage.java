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
 * Page displaying the workspace and its elements
 * 
 * @author Quentin Le Menez
 *
 */
public class TransformationSelectionPage extends WizardPage {

	protected DialogData dialogData;

	/**
	 *
	 * Constructor.
	 * 
	 * @param dialogData
	 *            The instance used to get the selection from the workspace and the filters
	 */
	public TransformationSelectionPage(DialogData dialogData) {
		super(Messages.TransformationSelectionPage_Name);
		setTitle(Messages.TransformationSelectionPage_Title);
		setDescription(Messages.TransformationSelectionPage_Description);
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

		new SelectionTreeComposite(pageComposite, SWT.NONE, dialogData);

		setControl(pageComposite);
	}

}
