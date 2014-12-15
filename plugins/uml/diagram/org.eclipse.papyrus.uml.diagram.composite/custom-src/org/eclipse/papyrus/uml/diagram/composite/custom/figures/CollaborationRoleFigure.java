/*****************************************************************************
 * Copyright (c) 2009-2011 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.composite.custom.figures;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.OrderedLayout;
import org.eclipse.draw2d.Panel;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.papyrus.uml.diagram.common.figure.node.RoundedCompartmentFigure;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramEditorPlugin;
import org.eclipse.swt.graphics.Image;

/**
 * Figure for CollaborationRole (in Composite) representation of ConnectableElement.
 */
public class CollaborationRoleFigure extends RoundedCompartmentFigure {

	/**
	 * Path of the Arrow image used in the figure.
	 */
	private static final String SHORTCUT_IMG_PATH = "icons/obj16/Shortcut.gif"; //$NON-NLS-1$

	/**
	 * Creates a new CollaborationRoleFigure.
	 */
	public CollaborationRoleFigure() {
		super();

		// Set layout (Vertical ToolbarLayout)
		ToolbarLayout layout = new ToolbarLayout();
		layout.setHorizontal(false);
		layout.setStretchMinorAxis(true);
		setLayoutManager(layout);

		// Add an arrow on role figure to make a graphical distinction between Property owned by the
		// Collaboration and a ConnectableElement reference as role of the Collaboration.
		Panel panel = new Panel();
		Image image = org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImage(UMLDiagramEditorPlugin.ID, SHORTCUT_IMG_PATH);
		ImageFigure imgFig = new ImageFigure(image);
		panel.add(imgFig);
		FlowLayout panelLayout = new FlowLayout(true);
		panelLayout.setMajorAlignment(OrderedLayout.ALIGN_BOTTOMRIGHT);
		panel.setLayoutManager(panelLayout);
		add(panel);
	}
}
