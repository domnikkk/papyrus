/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Saadia Dhouib (CEA LIST) saadia.dhouib@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.bpmn.diagram.ui;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.bpmn.diagram.common.commands.CreateBpmnModelCommand;
import org.eclipse.papyrus.uml.diagram.wizards.NewPapyrusProjectWizard;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectDiagramCategoryPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class NewBpmnProjectWizard extends NewPapyrusProjectWizard {

	/**
	 * @see org.eclipse.papyrus.wizards.NewPapyrusProjectWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 *
	 * @param workbench
	 * @param selection
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle("New Bpmn Project");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected WizardNewProjectCreationPage createNewProjectCreationPage() {
		WizardNewProjectCreationPage newProjectPage = super.createNewProjectCreationPage();
		newProjectPage.setTitle("Papyrus Bpmn Project");
		newProjectPage.setDescription("Create a New Papyrus Bpmn Project");
		return newProjectPage;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SelectDiagramCategoryPage createSelectDiagramCategoryPage() {
		// here SysML is the only available category
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void saveDiagramCategorySettings() {
		// do nothing
		// here SysML is the only available category
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String[] getDiagramCategoryIds() {
		return new String[] { CreateBpmnModelCommand.COMMAND_ID };
	}


}
