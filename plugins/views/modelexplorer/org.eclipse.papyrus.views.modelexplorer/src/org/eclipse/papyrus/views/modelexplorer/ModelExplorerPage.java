/*****************************************************************************
 * Copyright (c) 2010, 2014 LIFL, CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin (LIFL) cedric.dumoulin@lifl.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 434635
 *  Christian W. Damus - bug 450536
 *  Christian W. Damus - bug 454536
 *
 *****************************************************************************/

package org.eclipse.papyrus.views.modelexplorer;

import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.views.modelexplorer.core.ui.pagebookview.ViewPartPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;


/**
 * Page handling the {@link ModelExplorerView} for the {@link ModelExplorerPageBookView}
 *
 * @author cedric dumoulin
 *
 */
public class ModelExplorerPage extends ViewPartPage {

	private SharedModelExplorerState state;

	public ModelExplorerPage() {
		super();
	}

	/**
	 * Create the Viewer for the requested part
	 *
	 * @param part
	 *            The part to associate to the Viewer.
	 * @return
	 */
	@Override
	protected IViewPart createViewer(IWorkbenchPart part) {
		// Part is of the right type because of call to isImportant()
		ModelExplorerView result = new ModelExplorerView((IMultiDiagramEditor) part);
		result.setSharedState(state);
		return result;
	}

	/**
	 * Create control of the inner view
	 *
	 * @see org.eclipse.ui.part.Page#createControl(org.eclipse.swt.widgets.Composite)
	 *
	 * @param parent
	 */
	@Override
	public void createControl(Composite parent) {
		getViewer().createPartControl(parent);
	}

	/**
	 * Return the control
	 *
	 * @see org.eclipse.papyrus.views.modelexplorer.core.ui.pagebookview.ViewPartPage#getControl()
	 *
	 * @return
	 */
	@Override
	public Control getControl() {
		return ((ModelExplorerView) getViewer()).getControl();
	}

	void setSharedState(SharedModelExplorerState state) {
		this.state = state;
	}
}
