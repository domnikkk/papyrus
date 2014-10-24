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
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class ExportAllDiagramsPage extends WizardPage {

	private Text filePath;

	private IFile file;

	/**
	 * Create the wizard.
	 */
	public ExportAllDiagramsPage(IFile file) {
		super(Messages.ExportDiagramsPage_Title);
		setTitle(Messages.ExportDiagramsPage_Title);
		setDescription(Messages.ExportDiagramsPage_Desc);
		this.file = file;
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout(3, false);
		layout.horizontalSpacing = 0;
		container.setLayout(layout);
		setControl(container);

		Label label = new Label(container, SWT.NULL);
		label.setText(Messages.ExportDiagramsPage_InputModelFile);

		filePath = new Text(container, SWT.BORDER | SWT.SINGLE);
		filePath.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		filePath.setEditable(false);
		filePath.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		if (file != null)
			filePath.setText(file.getFullPath().toString());
		else
			dialogChanged();

		Button loadButton = new Button(container, SWT.PUSH);
		loadButton.setText("Browse...");
		loadButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				WorkspaceResourceDialog dialog = new WorkspaceResourceDialog(getShell(), new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
				dialog.setTitle("Tree Selection");
				dialog.setMessage("Select the elements from the tree:");
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				dialog.setAllowMultiple(false);
				if (dialog.open() == Dialog.OK) {
					IFile[] f = dialog.getSelectedFiles();
					if (f.length > 0) {
						file = f[0];
						filePath.setText(file.getFullPath().toString());
					}
				}
			}
		});
	}

	/**
	 * Ensures that both text fields are set.
	 */
	private void dialogChanged() {
		String f = filePath.getText();

		if (f.length() == 0 || !f.endsWith("di")) {
			updateStatus(Messages.ExportDiagramsPage_InvalidFile);
			return;
		}
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public IFile getFile() {
		return file;
	}
}
