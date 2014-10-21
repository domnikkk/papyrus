/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.views.modelexplorer;

import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.papyrus.infra.core.operation.DelegatingUndoContext;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.operations.RedoActionHandler;
import org.eclipse.ui.operations.UndoActionHandler;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * Specific PropertySheetPage for Model Explorer view to contribute to Undo/Redo Edit menu.
 * 
 * @author Gabriel Pascual
 *
 */
class ModelExplorerPropertySheetPage extends TabbedPropertySheetPage {

	/** The undo. */
	private UndoActionHandler undo = null;

	/** The redo. */
	private RedoActionHandler redo = null;

	/** The undo context. */
	private DelegatingUndoContext undoContext = null;

	/**
	 * Constructor.
	 *
	 * @param tabbedPropertySheetPageContributor
	 *            the tabbed property sheet page contributor
	 */
	public ModelExplorerPropertySheetPage(ITabbedPropertySheetPageContributor tabbedPropertySheetPageContributor) {
		super(tabbedPropertySheetPageContributor);
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage#setActionBars(org.eclipse.ui.IActionBars)
	 *
	 * @param actionBars
	 */
	@Override
	public void setActionBars(IActionBars actionBars) {
		super.setActionBars(actionBars);

		undoContext = new DelegatingUndoContext();
		undoContext.setDelegate(AdapterUtils.adapt(getSite().getPage().getActivePart(), IUndoContext.class, null));

		undo = new UndoActionHandler(getSite().getPage().getActivePart().getSite(), undoContext);
		redo = new RedoActionHandler(getSite().getPage().getActivePart().getSite(), undoContext);

		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undo);
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redo);
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage#dispose()
	 *
	 */
	@Override
	public void dispose() {

		if (undo != null) {
			undo.dispose();
		}
		if (redo != null) {
			redo.dispose();
		}

		super.dispose();
	}





}
