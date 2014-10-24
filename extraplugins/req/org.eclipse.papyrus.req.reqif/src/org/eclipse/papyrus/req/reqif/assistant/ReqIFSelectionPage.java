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

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.uml2.uml.Package;

/**
 * the wizard dependent to eclipse framework in order to select a ReqIF file
 *
 */
public class ReqIFSelectionPage extends WizardPage {

	private Composite comp;
	protected Package UMLPackage;
	protected Text textField=null;
	protected IFile selectedReqIFFile=null;

	
	/**
	 * 
	 * @return the selected ReqFile, maybe null 
	 */
	public IFile getSelectedReqIFFile() {
		return selectedReqIFFile;
	}

	/**
	 * 
	 * Constructor.
	 *
	 * @param UMLPackage the selected UML package
	 */
	public ReqIFSelectionPage(Package UMLPackage) {
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

				ArrayList<EObject> selection= new  ArrayList<EObject>();
				selection.add(UMLPackage);

				ElementTreeSelectionDialog dialog= new ElementTreeSelectionDialog(Display.getDefault().getActiveShell(), new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				
				PatternFilter reqIFPattern= new PatternFilter(){@Override
					public boolean isElementVisible(Viewer viewer, Object element) {
					if(viewer!=null){
						return super.isElementVisible(viewer, element);
					}
					return true;
				}};
				reqIFPattern.setPattern("*.reqIf");
				dialog.setAllowMultiple(false);
				dialog.addFilter( reqIFPattern);
				dialog.open();
				
				if(dialog.getResult().length>0){
					Object object=dialog.getResult()[0];
					System.err.println(object);
					if(object instanceof IFile){
						textField.setText(((IFile)object).getFullPath().toOSString());
						selectedReqIFFile=((IFile)object);
						setPageComplete(true);
					}
				}

			}
		});


		comp.pack();
		setControl(comp);
		setPageComplete(false);


	}

} 
