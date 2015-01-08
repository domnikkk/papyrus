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
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.statemachine.custom.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLDiagramEditorPlugin;

/**
 * Class used to initialize default preference values.
 */
public class CustomTransitionPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = UMLDiagramEditorPlugin.getInstance().getPreferenceStore();
		store.setDefault(PreferenceConstants.BODY_CUT_LENGTH, 1);
		store.setDefault(PreferenceConstants.INDICATE_PARAMETERS, true);
		store.setDefault(PreferenceConstants.LINEBREAK_BEFORE_EFFECT, true);
	}
}
