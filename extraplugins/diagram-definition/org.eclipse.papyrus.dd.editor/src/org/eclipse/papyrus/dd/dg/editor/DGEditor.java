/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.dd.dg.editor;

import org.eclipse.papyrus.dd.editor.DDEditor;
import org.eclipse.papyrus.dd.editor.DDEditorPlugin;
import org.eclipse.papyrus.dd.editor.DDModelPage;
import org.eclipse.papyrus.dd.editor.DDSourcePage;
import org.eclipse.ui.PartInitException;

/**
 * This is the DG model multi-page editor
 */
public class DGEditor extends DDEditor {

	/**
	 * The editor id
	 */
	public static final String ID = DGEditor.class.getName();

	@Override
	protected void addPages() {
		try {
			addPage(new DDModelPage(this), getEditorInput());
			addPage(new DDSourcePage(this), getEditorInput());
			addPage(new DGSVGSourcePage(this), getEditorInput());
			addPage(new DGSVGCanvasPage(this), getEditorInput());
		} catch (PartInitException e) {
			DDEditorPlugin.INSTANCE.log(e);
		}
	}

}
