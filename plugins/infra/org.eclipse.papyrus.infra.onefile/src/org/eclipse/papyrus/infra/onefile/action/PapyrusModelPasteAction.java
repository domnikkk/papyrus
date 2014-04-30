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

package org.eclipse.papyrus.infra.onefile.action;

import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.widgets.Shell;


/**
 * Action for pasting IPapyrusfiles
 *
 */
public class PapyrusModelPasteAction extends PasteAction {


	/**
	 * Action for pasting IPapyrusfiles
	 * 
	 * @param shell
	 * @param clipboard
	 */
	public PapyrusModelPasteAction(Shell shell, Clipboard clipboard) {
		super(shell, clipboard);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.onefile.action.PasteAction#createCopyFilesAndFolderOperation(org.eclipse.swt.widgets.Shell)
	 */
	@Override
	protected CopyFilesAndFoldersOperation createCopyFilesAndFolderOperation(Shell shell) {
		return new PapyrusCopyFilesAndFoldersOperation(shell);
	}


}
