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
package org.eclipse.papyrus.revision.tool.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.papyrus.revision.tool.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

/**
 * Initialize preference constants about revision mode.
 *
 */

public class ReviewPreferenceInitializer extends AbstractPreferenceInitializer {


	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(RevisionPreferenceConstants.AUTHOR_NAME, RevisionPreferenceConstants.ANONYMOUS_AUTHOR);
		store.setDefault(RevisionPreferenceConstants.AUTHOR_LANGUAGE, "Eng");

		Color color = Display.getDefault().getSystemColor(SWT.COLOR_YELLOW);
		PreferenceConverter.setDefault(store,RevisionPreferenceConstants.AUTHOR_COLOR,
				color.getRGB());


	}

}
