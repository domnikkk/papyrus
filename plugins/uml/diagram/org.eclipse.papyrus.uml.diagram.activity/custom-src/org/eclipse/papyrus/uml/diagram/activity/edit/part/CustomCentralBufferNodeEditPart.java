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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.GetChildLayoutEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.RoundedRectangleNodePlateFigure;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.CentralBufferNodeSelectionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.locator.LinkedBehaviorLocator;
import org.eclipse.papyrus.uml.diagram.common.editparts.FloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.common.locator.RoundedRectangleLabelPositionLocator;

public class CustomCentralBufferNodeEditPart extends CentralBufferNodeEditPart {

	/**
	 * Constructor.
	 *
	 * @param view
	 *            the view
	 */
	public CustomCentralBufferNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.parts.BroadcastSignalActionEditPart#createDefaultEditPolicies()
	 *
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new GetChildLayoutEditPolicy());
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.NamedElementEditPart#refreshLabelDisplay()
	 *
	 */
	@Override
	protected void refreshLabelDisplay() {
		// TODO Auto-generated method stub
		super.refreshLabelDisplay();
		// Allow multiline
		getPrimaryShape().getNameLabel().setTextWrap(true);
		// Center text
		getPrimaryShape().getNameLabel().setTextJustification(PositionConstants.CENTER);
		getPrimaryShape().getNameLabel().setAlignment(PositionConstants.CENTER);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.parts.BroadcastSignalActionEditPart#createNodePlate()
	 *
	 * @return
	 */
	@Override
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new RoundedRectangleNodePlateFigure(40, 40);
		return result;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.parts.BroadcastSignalActionEditPart#addBorderItem(org.eclipse.draw2d.IFigure, org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart)
	 *
	 * @param borderItemContainer
	 * @param borderItemEditPart
	 */
	@Override
	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof CentralBufferNodeSelectionEditPart) {
			// use custom locator
			BorderItemLocator locator = new LinkedBehaviorLocator(getMainFigure(), PositionConstants.NORTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else if (borderItemEditPart instanceof FloatingLabelEditPart) {
			// Create specific locator
			RoundedRectangleLabelPositionLocator locator = new RoundedRectangleLabelPositionLocator(getMainFigure(), PositionConstants.SOUTH);
			// Offset from the parent for the attached case
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}
}
