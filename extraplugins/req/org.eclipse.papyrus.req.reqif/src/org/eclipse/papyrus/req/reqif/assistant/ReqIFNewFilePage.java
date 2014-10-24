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
package org.eclipse.papyrus.req.reqif.assistant;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.datatransfer.FileSystemExportWizard;
import org.eclipse.uml2.uml.Package;

/**
 * aGUI in order to select a set of bundle from a list 
 *
 */
public class ReqIFNewFilePage extends WizardPage {

	private Composite comp;
	protected Package UMLPackage;
	protected Text textField=null;
	protected IFile selectedReqIFFile=null;

	/**
	 * 
	 * @return the IFile that correspond the ReqIF file, may be null
	 */
	public IFile getSelectedReqIFFile() {
		return selectedReqIFFile;
	}

	/**
	 * 
	 * Constructor.
	 *
	 * @param UMLPackage the selected UML Package
	 */
	public ReqIFNewFilePage(Package UMLPackage) {
		super("Select RqIF file");
		setTitle("Select RqIF file");
		setDescription("Select RqIF file.");
		this.UMLPackage=UMLPackage;
	}

	public void createControl(Composite parent) {
		comp = new Composite(parent, SWT.NULL);
		FillLayout layout = new FillLayout();
		layout.type = SWT.VERTICAL;
		comp.setLayout(layout);
		Composite buttons = new Composite(comp, SWT.NONE);

		//label
		Label fileText=new Label(buttons, SWT.NONE);
		fileText.setText("ReqIF File:");
		fileText.setBounds(0, 23, 60, 20);

		//textField
		textField =new Text(buttons,  SWT.SINGLE | SWT.BORDER);
		textField.setEditable(false);
		textField.setBounds(70, 20, 300, 20);

		//button
		Button selectButton = new Button(buttons, SWT.PUSH);
		selectButton.setBounds(70, 45, 150, 25);
		selectButton.setText("Select ReqIF Model");
		selectButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileSystemExportWizard wizard = new FileSystemExportWizard();
				wizard.init(PlatformUI.getWorkbench(), new StructuredSelection());
				WizardDialog dialog = new WizardDialog(new Shell(), wizard);
				dialog.open();

			}
		});
		comp.pack();
		setControl(comp);
		setPageComplete(false);
	}

} 
