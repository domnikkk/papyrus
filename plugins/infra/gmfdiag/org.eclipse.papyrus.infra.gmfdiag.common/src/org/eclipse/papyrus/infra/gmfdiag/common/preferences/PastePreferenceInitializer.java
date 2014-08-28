/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.infra.gmfdiag.common.Activator;


/**
 * This preference initializer initializes Papyrus paste preferences
 */
public class PastePreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * Initialize default preferences
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		store.setDefault(PastePreferencesPage.KEEP_EXTERNAL_REFERENCES, Boolean.TRUE);
	}

	/**
	 * Get the preference store
	 */
	protected IPreferenceStore getPreferenceStore() {
		return Activator.getInstance().getPreferenceStore();
	}
}
