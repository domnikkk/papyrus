/*****************************************************************************
 * Copyright (c) 2008 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.editor;

import org.eclipse.papyrus.infra.core.editor.CoreMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer;

/**
 * Papyrus main MultiEditor. This class add GMF adaptation dedicated to Papyrus.
 * <p/>
 * TODO : move GMF dependencies into this plugin.
 * 
 * @author dumoulin
 */
public class PapyrusMultiDiagramEditor extends CoreMultiDiagramEditor {

	/**
	 * The Papyrus Editor ID
	 */
	public static final String EDITOR_ID = "org.eclipse.papyrus.infra.core.papyrusEditor"; //$NON-NLS-1$

	private PapyrusPaletteSynchronizer myPaletteViewSynchronizer;

	@Override
	protected void activate() {
		super.activate();
		myPaletteViewSynchronizer = new PapyrusPaletteSynchronizer(this);
		getISashWindowsContainer().addPageChangedListener(myPaletteViewSynchronizer);
	}

	@Override
	protected void deactivate() {
		if (myPaletteViewSynchronizer != null) {
			ISashWindowsContainer sashContainer = getISashWindowsContainer();
			if (sashContainer != null && !sashContainer.isDisposed()) {
				sashContainer.removePageChangedListener(myPaletteViewSynchronizer);
			}
			myPaletteViewSynchronizer.dispose();
			myPaletteViewSynchronizer = null;
		}
		super.deactivate();
	}

}
