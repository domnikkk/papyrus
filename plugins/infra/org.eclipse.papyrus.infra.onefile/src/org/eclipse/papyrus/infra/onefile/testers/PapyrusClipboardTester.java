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

package org.eclipse.papyrus.infra.onefile.testers;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IResource;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ResourceTransfer;

/**
 * Papyrus tester on clipboard contents
 * containsPapyrusModel : test if there is a papyrus model
 */
public class PapyrusClipboardTester extends PropertyTester {

	public static final String CLIPBOARD_CONTAINS_PAPYRUS_MODEL = "containsPapyrusModel"; //$NON-NLS-1$

	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof org.eclipse.swt.widgets.Shell) {
			Clipboard clipboard = new Clipboard(Display.getDefault());
			if (CLIPBOARD_CONTAINS_PAPYRUS_MODEL.equals(property)) {
				boolean answer = containsPapyrusModel(clipboard);
				return new Boolean(answer).equals(expectedValue);
			}
		}
		return false;
	}


	/**
	 * Test if the clipboard contains some Papyrus model (that is with a di extension)
	 * 
	 * @param clipboard
	 * @return
	 */
	protected boolean containsPapyrusModel(Clipboard clipboard) {
		if (clipboard != null) {
			String[] filePaths = (String[]) clipboard.getContents(FileTransfer.getInstance());
			if (filePaths != null) {
				if (filePaths.length > 0) {
					for (int i = 0; i < filePaths.length; i++) {
						if (filePaths[i].endsWith("." + DiModel.MODEL_FILE_EXTENSION)) { //$NON-NLS-1$
							return true;
						}
					}
				}
			} else {
				IResource[] resources = (IResource[]) clipboard.getContents(ResourceTransfer.getInstance());
				if (resources != null) {
					if (resources.length > 0) {
						for (int i = 0; i < resources.length; i++) {
							if (DiModel.MODEL_FILE_EXTENSION.equals(resources[i].getFileExtension())) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

}
