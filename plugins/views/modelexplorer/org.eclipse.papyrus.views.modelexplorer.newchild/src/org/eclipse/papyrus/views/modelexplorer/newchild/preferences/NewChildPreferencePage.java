/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.fr - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.views.modelexplorer.newchild.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.papyrus.views.modelexplorer.newchild.Activator;
import org.eclipse.papyrus.views.modelexplorer.newchild.messages.Messages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Preference page to define enable/disable default selection in Model Explorer.
 * 
 * @author Gabriel Pascual
 *
 */
public class NewChildPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	/** The Constant DEFAULT_SELECTION_LABEL. */
	private static final String DEFAULT_SELECTION_LABEL = Messages.getString("NewChildPreferencePage.selection.label"); //$NON-NLS-1$

	/** The Constant PAGE_DESCRIPTION. */
	private static final String PAGE_DESCRIPTION = Messages.getString("NewChildPreferencePage.desciption"); //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 */
	public NewChildPreferencePage() {
		super();
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 *
	 * @param workbench
	 */
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription(PAGE_DESCRIPTION);

	}

	/**
	 * Creates the field editors.
	 *
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		addField(new BooleanFieldEditor(NewChildPreferences.DEFAULT_SELECTION, DEFAULT_SELECTION_LABEL, getFieldEditorParent()));

	}




}
