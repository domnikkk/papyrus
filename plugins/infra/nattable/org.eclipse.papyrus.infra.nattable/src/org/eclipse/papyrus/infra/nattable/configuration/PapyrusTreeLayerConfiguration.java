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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.configuration;

import org.eclipse.nebula.widgets.nattable.grid.GridRegion;
import org.eclipse.nebula.widgets.nattable.tree.TreeLayer;
import org.eclipse.nebula.widgets.nattable.tree.action.TreeExpandCollapseAction;
import org.eclipse.nebula.widgets.nattable.tree.config.DefaultTreeLayerConfiguration;
import org.eclipse.nebula.widgets.nattable.tree.painter.TreeImagePainter;
import org.eclipse.nebula.widgets.nattable.ui.action.NoOpMouseAction;
import org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry;
import org.eclipse.nebula.widgets.nattable.ui.matcher.CellPainterMouseEventMatcher;
import org.eclipse.nebula.widgets.nattable.ui.matcher.MouseEventMatcher;

/**
 *
 * @author VL222926
 *
 */
public class PapyrusTreeLayerConfiguration extends DefaultTreeLayerConfiguration {

	/**
	 *
	 * Constructor.
	 *
	 * @param treeLayer
	 */
	public PapyrusTreeLayerConfiguration(TreeLayer treeLayer) {
		super(treeLayer);
	}

	/**
	 *
	 * @see org.eclipse.nebula.widgets.nattable.tree.config.DefaultTreeLayerConfiguration#configureUiBindings(org.eclipse.nebula.widgets.nattable.ui.binding.UiBindingRegistry)
	 *
	 * @param uiBindingRegistry
	 */
	@Override
	public void configureUiBindings(UiBindingRegistry uiBindingRegistry) {
		TreeExpandCollapseAction treeExpandCollapseAction = new TreeExpandCollapseAction();
		// override GridRegion.BODY by GridRegion.ROW_HEADER
		CellPainterMouseEventMatcher treeImagePainterMouseEventMatcher = new CellPainterMouseEventMatcher(GridRegion.ROW_HEADER, MouseEventMatcher.LEFT_BUTTON, TreeImagePainter.class);

		uiBindingRegistry.registerFirstSingleClickBinding(treeImagePainterMouseEventMatcher, treeExpandCollapseAction);

		// Obscure any mouse down bindings for this image painter
		uiBindingRegistry.registerFirstMouseDownBinding(treeImagePainterMouseEventMatcher, new NoOpMouseAction());
	}
}
