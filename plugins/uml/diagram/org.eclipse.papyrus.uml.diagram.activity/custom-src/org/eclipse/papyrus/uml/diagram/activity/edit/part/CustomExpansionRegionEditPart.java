/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and Implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.edit.part;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.GetChildLayoutEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.RoundedRectangleNodePlateFigure;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionRegionEditPart;
import org.eclipse.papyrus.uml.diagram.common.editparts.FloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.common.locator.RoundedRectangleLabelPositionLocator;

/**
 * The Class CustomExpansionRegionEditPart.
 */
public class CustomExpansionRegionEditPart extends ExpansionRegionEditPart {

	/** The Constant CORNER_HEIGHT. */
	private static final int CORNER_HEIGHT = 8;

	/** The Constant CORNER_WIDTH. */
	private static final int CORNER_WIDTH = 8;

	/** The Constant DEFAULT_BORDER_STYLE. */
	private static final int DEFAULT_BORDER_STYLE = Graphics.LINE_DASH;

	/**
	 * Constructor.
	 *
	 * @param view
	 *            the view
	 */
	public CustomExpansionRegionEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionRegionEditPart#createDefaultEditPolicies()
	 *
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new GetChildLayoutEditPolicy());
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionRegionEditPart#createNodePlate()
	 *
	 * @return
	 */
	@Override
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new RoundedRectangleNodePlateFigure(-20, 40);
		return result;
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart#addBorderItem(org.eclipse.draw2d.IFigure, org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart)
	 *
	 * @param borderItemContainer
	 * @param borderItemEditPart
	 */
	@Override
	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof FloatingLabelEditPart) {
			// Create specific locator
			RoundedRectangleLabelPositionLocator locator = new RoundedRectangleLabelPositionLocator(getMainFigure(), PositionConstants.SOUTH);
			// Offset from the parent for the attached case
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * Gets the default corner height.
	 *
	 * @return the default corner height
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart#getDefaultCornerHeight()
	 */
	@Override
	protected int getDefaultCornerHeight() {
		return CORNER_HEIGHT;
	}

	/**
	 * Gets the default corner width.
	 *
	 * @return the default corner width
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart#getDefaultCornerWidth()
	 */
	@Override
	protected int getDefaultCornerWidth() {
		return CORNER_WIDTH;
	}

	/**
	 * Gets the default border style.
	 *
	 * @return the default border style
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart#getDefaultBorderStyle()
	 */
	@Override
	protected int getDefaultBorderStyle() {
		return DEFAULT_BORDER_STYLE;
	}

}
