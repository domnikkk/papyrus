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
package org.eclipse.papyrus.revision.tool.dialogs;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.papyrus.revision.tool.Activator;
import org.eclipse.papyrus.revision.tool.preference.RevisionPreferenceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.FormDialog;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
/**
 * This dialog is used to create an author that will add review or make revision.
 *
 */
public class CreateAuthorDialog  extends FormDialog {

	protected Text acronymText;
	protected Text languageText;
	protected Text chooseColor;
	protected IPreferenceStore store;
	protected String defaultValue="                                     ";
	/***
	 * constructor
	 * @param shell  ashell to launch the dialog
	 */
	public CreateAuthorDialog(Shell shell) {
		super(shell);
		store = Activator.getDefault().getPreferenceStore();

	}
	@Override
	protected void createFormContent(IManagedForm pForm) {
		pForm.getForm().setText("Set author information");
		ScrolledForm scrolledForm = pForm.getForm();
		FormToolkit toolkit = pForm.getToolkit();
		Composite parent = scrolledForm.getBody();
		GridLayout lLayout = new GridLayout();
		lLayout.numColumns = 2;
		parent.setLayout(lLayout);
		toolkit.createLabel(parent, "Acronym:");
		acronymText = toolkit.createText(parent,defaultValue );
		toolkit.createLabel(parent, "Language:");
		languageText = toolkit.createText(parent,defaultValue);
		toolkit.createLabel(parent, "Color:");
		chooseColor = toolkit.createText(parent, defaultValue, SWT.BUTTON1);
		RGB rgb=PreferenceConverter.getColor(store, RevisionPreferenceConstants.AUTHOR_COLOR);
		Device device = Display.getCurrent ();
		chooseColor.setBackground(new Color(device,rgb));

		addListeners();

		scrolledForm.reflow(true);
		languageText.setText(store.getString(RevisionPreferenceConstants.AUTHOR_LANGUAGE));

	}
	protected void addListeners(){
		chooseColor.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {

			}

			@Override
			public void mouseDown(MouseEvent e) {
				if( e.getSource().equals(chooseColor)){
					ColorDialog cd = new ColorDialog(new Shell());
					cd.setText("Choose color");
					cd.setRGB(new RGB(255, 255, 255));
					RGB newColor = cd.open();
					if (newColor == null) {
						return;
					}
					Device device = Display.getCurrent ();
					chooseColor.setBackground(new Color(device, newColor));
				}

			}


			@Override
			public void mouseDoubleClick(MouseEvent e) {

			}
		});

	}
	@Override
	protected void okPressed() {
		if( acronymText.getText().trim()!=""&&languageText.getText().trim()!=""){
		store.setValue(RevisionPreferenceConstants.AUTHOR_NAME, acronymText.getText());
		store.setValue(RevisionPreferenceConstants.AUTHOR_LANGUAGE, languageText.getText());
		PreferenceConverter.setDefault(store, RevisionPreferenceConstants.AUTHOR_COLOR, chooseColor.getBackground().getRGB());
		}
		super.okPressed();
	}
}
