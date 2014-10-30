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

package org.eclipse.papyrus.views.modelexplorer.newchild.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.PreferencesUtil;

/**
 * Handler to open default selection preference page through a menu in Model Explorer.
 * 
 * @author Gabriel Pascual
 *
 */
public class DefaultSelectionHandler extends AbstractHandler {

	/** The Constant PREFERENCES_SELECTION_PAGE_ID. */
	private static final String PREFERENCES_SELECTION_PAGE_ID = "org.eclipse.papyrus.views.modelexplorer.preferences.selection"; //$NON-NLS-1$

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(Display.getDefault().getActiveShell(), PREFERENCES_SELECTION_PAGE_ID, null, null);
		if (dialog != null) {
			dialog.open();
		}

		return null;
	}
}
