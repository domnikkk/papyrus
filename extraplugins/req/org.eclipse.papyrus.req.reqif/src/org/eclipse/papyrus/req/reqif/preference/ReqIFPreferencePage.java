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
package org.eclipse.papyrus.req.reqif.preference;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.papyrus.req.reqif.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * 
 * This class is the preference page the revision tool.
 *
 */
public class ReqIFPreferencePage  extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public static String[][]  values= new String[][]{{"User",ReqIFPreferenceConstants.SIMPLE_USER},{"Advancer User",ReqIFPreferenceConstants.ADVANCED_USER}};
	/**
	 * Constructor
	 */
	public ReqIFPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}


	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	@Override
	public void createFieldEditors() {
		
		Group dmGroup = createGroup("Import ReqIF");
		addField(new ComboFieldEditor(ReqIFPreferenceConstants.USER_KIND,"User Kind",values,dmGroup));
				
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	private Group createGroup(String text) {
		Group group = new Group(getFieldEditorParent(), SWT.NONE);
		//group.setLayout(new GridLayout(1, false));

		GridLayout gridLayout = new GridLayout(2, false);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 2;

		group.setLayoutData(gridData);
		group.setLayout(gridLayout);

		group.setText(text);

		return group;
	}

}
