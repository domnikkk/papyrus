/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.notation.export.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.notation.export.ExportAllDiagrams;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

public class ExportAllDiagramsWizard extends Wizard implements IExportWizard {

	private ExportAllDiagramsPage page;

	private IFile file;

	public ExportAllDiagramsWizard() {
		setNeedsProgressMonitor(true);
		setWindowTitle(Messages.ExportAllWizard_Title);
	}

	@Override
	public void addPages() {
		addPage(page = new ExportAllDiagramsPage(file));
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		if (selection instanceof IStructuredSelection) {
			Object first = ((IStructuredSelection) selection).getFirstElement();
			if (first instanceof IFile)
				file = (IFile) first;
		}
	}

	@Override
	public boolean performFinish() {
		IFile f = page.getFile();
		ExportAllDiagrams exporter = new ExportAllDiagrams(f);
		exporter.export();
		return true;
	}

}