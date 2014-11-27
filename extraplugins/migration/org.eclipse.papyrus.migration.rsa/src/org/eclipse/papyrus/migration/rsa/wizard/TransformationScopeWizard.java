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

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.migration.rsa.wizard.pages.TransformationScopePage;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

public class TransformationScopeWizard extends Wizard implements IImportWizard {

	private TransformationScopePage selectionPage;

	public TransformationScopeWizard() {
		setWindowTitle("RSA transformation wizard"); //$NON-NLS-1$ 
	}

	@Override
	public void addPages() {
		selectionPage = new TransformationScopePage();
		this.addPage(selectionPage);
		this.setForcePreviousAndNextButtons(true);

	}

	@Override
	public boolean performFinish() {

		return false;
	}


	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// nothing
	}

}
