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
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.req.reqif.integration.assistant;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.req.reqif.transformation.ReqIFExporter;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.uml2.uml.Package;

/**
 * this is the wizard dependent of eclipse inorder to realize the export from UML to reqIF files
 *
 */
public class ReqIFExportWizard extends AbstractWizardForPapyrus implements IExportWizard {

	private WizardNewFileCreationPage reqifFileCreationPage;

	@Override
	public void addPages() {

		reqifFileCreationPage = new WizardNewFileCreationPage("Create new ReqIF file", new StructuredSelection());
		reqifFileCreationPage.setFileExtension("reqif");
		reqifFileCreationPage.setTitle("Create new ReqIF file");
		reqifFileCreationPage.setDescription(" Choose the ReqIF file path");
		this.addPage(reqifFileCreationPage);
	}

	@Override
	public boolean performFinish() {
		// get the domain in order to launch the command
		final TransactionalEditingDomain domain = modelSet.getTransactionalEditingDomain();
		RecordingCommand cmd= new RecordingCommand(domain, "exportReqIF") {

			@Override
			protected void doExecute() {
				ReqIFExporter reqIFExporter= new ReqIFExporter(domain, (Package)getSelectionSet().get(0));
				reqIFExporter.exportReqIFModel(true, reqifFileCreationPage.getContainerFullPath()+"/"+reqifFileCreationPage.getFileName());
			}
		};
		domain.getCommandStack().execute(cmd);

		return true;
	}
}
