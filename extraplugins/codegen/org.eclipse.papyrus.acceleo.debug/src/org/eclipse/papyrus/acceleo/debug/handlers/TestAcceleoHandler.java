/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Ansgar Radermacher (CEA LIST) ansgar.radermacher@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.acceleo.debug.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.papyrus.acceleo.debug.dialogs.TestAcceleoDialog;
import org.eclipse.papyrus.uml.diagram.common.handlers.CmdHandler;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Test the Acceleo handler: call a dialog that opens the
 *
 * @author ansgar
 *
 */
public class TestAcceleoHandler extends CmdHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		if (selectedEObject instanceof NamedElement) {
			return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (selectedEObject instanceof NamedElement) {
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					new TestAcceleoDialog(Display.getCurrent().getActiveShell(), (NamedElement) selectedEObject).open();
				}
			});
		}
		return null;
	}
}
