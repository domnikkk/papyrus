/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Preference page UI for decorator model behaviour of the tooling.
 */
public class DecoratorModelPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public DecoratorModelPreferencePage() {
		super(Messages.DecoratorModelPreferencePage_0, GRID);

		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription(Messages.DecoratorModelPreferencePage_1);
	}

	@Override
	public void init(IWorkbench workbench) {
		// Pass
	}

	@Override
	protected void createFieldEditors() {
		addField(new BooleanFieldEditor(ProfileExternalizationUIPreferences.AUTO_PROMPT_TO_LOAD_PROFILE_APPLICATIONS, Messages.DecoratorModelPreferencePage_2, getFieldEditorParent()));
		addField(new BooleanFieldEditor(ProfileExternalizationUIPreferences.PROMPT_TO_UNLOAD_CONFLICTING_DECORATOR_MODELS, Messages.DecoratorModelPreferencePage_3, getFieldEditorParent()));
		addField(WhenKind.createFieldEditor(ProfileExternalizationUIPreferences.DELETE_EMPTY_DECORATOR_MODELS, Messages.DecoratorModelPreferencePage_4, getFieldEditorParent()));
	}

}
