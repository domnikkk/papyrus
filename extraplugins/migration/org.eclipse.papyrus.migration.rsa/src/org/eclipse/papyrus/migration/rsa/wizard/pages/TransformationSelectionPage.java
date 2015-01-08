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

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class TransformationSelectionPage extends WizardPage {

	SelectionTreeComposite treeComposite;

	Collection<Object> selectedFiles;

	String[] extensions = { "*", "*.emx", "*.epx", "*.epx;*.emx" }; //$NON-NLS-1$  //$NON-NLS-2$  //$NON-NLS-3$
	String[] extensionsNames = { "All", "*.emx", "*.epx", "*.epx and *.emx" }; //$NON-NLS-1$  //$NON-NLS-2$  //$NON-NLS-3$

	public TransformationSelectionPage() {
		super("Workspace selection");
		setTitle("Select a scope for the transformation");
		setDescription("Select the folders or files for the transformation");
		// String iconPath = "icons/import_wiz_75x66.png"; //$NON-NLS-1$
		// ImageDescriptor imgDescriptior = Activator.getDefault().getImageDescriptor(iconPath);
		// setImageDescriptor(imgDescriptior);

		selectedFiles = new LinkedList<Object>();
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		Composite pageComposite = new Composite(parent, SWT.NONE);
		pageComposite.setLayout(new GridLayout());

		treeComposite = new SelectionTreeComposite(pageComposite, SWT.NONE, extensions, extensionsNames);

		setControl(pageComposite);
	}

	public TreeViewer getTreeViewer() {
		return treeComposite.getTreeViewer();
	}

	public Collection<Object> getSelectedFiles() {
		return treeComposite.getSelectedFiles();
	}

}
