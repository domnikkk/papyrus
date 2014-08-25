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
 *  Benoit Maggi  benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.onefile.providers;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.CopyResourceAction;
import org.eclipse.ui.part.ResourceTransfer;

/**
 * Copy to the clipboard the payrus model as 3 IResource
 *
 */
public class CopyToClipboardAction extends CopyResourceAction {

	protected Clipboard fClipboard;

	public CopyToClipboardAction(IShellProvider shellProvider) {
		super(shellProvider);
	}

	@Override
	public void run() {
		Display display = shellProvider.getShell().getDisplay();
		fClipboard = new Clipboard(display);
		IStructuredSelection structuredSelection = getStructuredSelection();
		try {
			copytoClipboardStructuredSelection(structuredSelection);
		} finally {
			fClipboard.dispose();
		}
	}


	/**
	 * Copy in the clipboard the selection
	 *
	 * @param selection
	 */
	public void copytoClipboardStructuredSelection(IStructuredSelection selection) {
		Display display = Display.getCurrent();
		Clipboard clipboard = new Clipboard(display);
		Object[] array = selection.toArray();
		IResource[] associatedResources = new IResource[array.length];
		for (int i = 0; i < associatedResources.length; i++) {
			Object object = array[i];
			if (object instanceof IResource) {
				associatedResources[i] = (IResource) object;
			}
		}
		clipboard.setContents(new Object[] { associatedResources },
				new Transfer[] { ResourceTransfer.getInstance() });
		clipboard.dispose();
	}
}
