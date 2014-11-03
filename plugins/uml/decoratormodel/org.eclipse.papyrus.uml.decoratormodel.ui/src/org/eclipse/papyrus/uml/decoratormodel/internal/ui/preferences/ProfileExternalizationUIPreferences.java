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

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.Activator;

/**
 * Preferences for the behaviour of the profile externalization tooling UI.
 */
public class ProfileExternalizationUIPreferences extends AbstractPreferenceInitializer {
	static final String AUTO_PROMPT_TO_LOAD_PROFILE_APPLICATIONS = "autoPromptToLoadProfileApplications"; //$NON-NLS-1$

	static final String PROMPT_TO_UNLOAD_CONFLICTING_DECORATOR_MODELS = "promptToUnloadConflicts"; //$NON-NLS-1$

	static final String DELETE_EMPTY_DECORATOR_MODELS = "deleteEmptyDecoratorModels"; //$NON-NLS-1$


	public ProfileExternalizationUIPreferences() {
		super();
	}

	static IPreferenceStore getStore() {
		return Activator.getDefault().getPreferenceStore();
	}

	public static void setAutoPromptToLoadProfileApplications(boolean autoPrompt) {
		getStore().setValue(AUTO_PROMPT_TO_LOAD_PROFILE_APPLICATIONS, autoPrompt);
	}

	public static boolean getAutoPromptToLoadProfileApplications() {
		return getStore().getBoolean(AUTO_PROMPT_TO_LOAD_PROFILE_APPLICATIONS);
	}

	public static void setPromptToUnloadConflicts(boolean prompt) {
		getStore().setValue(PROMPT_TO_UNLOAD_CONFLICTING_DECORATOR_MODELS, prompt);
	}

	public static boolean getPromptToUnloadConflicts() {
		return getStore().getBoolean(PROMPT_TO_UNLOAD_CONFLICTING_DECORATOR_MODELS);
	}

	public static void setDeleteEmptyDecoratorModels(WhenKind when) {
		getStore().setValue(DELETE_EMPTY_DECORATOR_MODELS, when.name());
	}

	public static WhenKind getDeleteEmptyDecoratorModels() {
		return WhenKind.valueOf(getStore().getString(DELETE_EMPTY_DECORATOR_MODELS));
	}

	@Override
	public void initializeDefaultPreferences() {
		getStore().setDefault(AUTO_PROMPT_TO_LOAD_PROFILE_APPLICATIONS, true);
		getStore().setDefault(PROMPT_TO_UNLOAD_CONFLICTING_DECORATOR_MODELS, true);
		getStore().setDefault(DELETE_EMPTY_DECORATOR_MODELS, WhenKind.PROMPT.name());
	}
}
