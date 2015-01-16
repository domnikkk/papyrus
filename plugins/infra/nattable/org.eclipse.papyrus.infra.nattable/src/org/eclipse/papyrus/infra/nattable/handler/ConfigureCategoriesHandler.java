/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.papyrus.infra.nattable.wizard.ConfigureTableCategoriesWizard;
import org.eclipse.swt.widgets.Display;

/**
 * @author VL222926
 *
 */
public class ConfigureCategoriesHandler extends AbstractTableHandler {

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param arg0
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		ConfigureTableCategoriesWizard wizard = new ConfigureTableCategoriesWizard(getCurrentNattableModelManager());
		WizardDialog dialog = new WizardDialog(Display.getDefault().getActiveShell(), wizard);
		dialog.open();
		return null;
	}

}
