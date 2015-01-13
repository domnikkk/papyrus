/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.papyrus.infra.nattable.dialog.PasteImportStatusDialog;
import org.eclipse.papyrus.infra.nattable.manager.PasteAxisInNattableManager;
import org.eclipse.papyrus.infra.nattable.utils.CSVPasteHelper;
import org.eclipse.papyrus.infra.nattable.utils.TableClipboardUtils;
import org.eclipse.swt.widgets.Display;

/**
 * Paste Handler
 *
 * @author VL222926
 *
 */
public class PasteInTableHandler extends AbstractTableHandler {

	public static final String OPEN_DIALOG_ON_FAIL_BOOLEAN_PARAMETER = "openDialogOnFail"; //$NON-NLS-1$

	public static final String OPEN__PROGRESS_MONITOR_DIALOG = "openProgressMonitorDialog"; //$NON-NLS-1$
	/**
	 * this field is used to determine if we want open a dialog to prevent the user that the command creation and the command execution can take a
	 * long time
	 */
	private boolean useProgressMonitorDialog = true;


	/**
	 *
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		CSVPasteHelper pasteHelper = new CSVPasteHelper();

		boolean openProgressMonitor = useProgressMonitorDialog;
		Object value = event.getParameters().get(OPEN__PROGRESS_MONITOR_DIALOG);
		if (value instanceof Boolean) {
			openProgressMonitor = ((Boolean) value).booleanValue();
		}
		PasteAxisInNattableManager pasteManager = new PasteAxisInNattableManager(getCurrentNattableModelManager(), pasteHelper, openProgressMonitor, TableClipboardUtils.getClipboardContentsAsString());
		IStatus result = pasteManager.doPaste();
		displayDialog(event, result);
		// used in JUnit test for paste
		return result;
	}

	private void displayDialog(ExecutionEvent event, IStatus result) {
		if (!result.isOK()) {
			Object res = event.getParameters().get(OPEN_DIALOG_ON_FAIL_BOOLEAN_PARAMETER);
			if (res == null || Boolean.TRUE.equals(res)) {
				new PasteImportStatusDialog(Display.getDefault().getActiveShell(), result).open();
			}
		}
	}

	/**
	 * @Override
	 * @see org.eclipse.papyrus.infra.nattable.handler.AbstractTableHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		setBaseEnabled(getCurrentNattableModelManager() != null);
	}


}
