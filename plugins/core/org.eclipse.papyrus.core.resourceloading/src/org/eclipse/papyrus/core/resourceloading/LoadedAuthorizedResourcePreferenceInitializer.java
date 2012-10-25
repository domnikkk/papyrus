/*****************************************************************************
 * Copyright (c) 2012 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Laurent Devernay (Atos) laurent.devernay@atos.net
 *
 *****************************************************************************/
package org.eclipse.papyrus.core.resourceloading;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.preferences.Activator;

public class LoadedAuthorizedResourcePreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
	}

	public void initializeDefaultPreferences(String loadedAuthorizedResource) {
		IPreferenceStore store = getPreferenceStore();
		store.setDefault(LoadedAuthorizedResourceManager.URI_PREF_PREFIX, loadedAuthorizedResource);
	}

	/**
	 * Get the preference store
	 */
	protected IPreferenceStore getPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}
}
