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
package org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part;


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
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationItemEditPartCN;
import org.eclipse.papyrus.uml.diagram.common.editparts.FloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.common.locator.RoundedRectangleLabelPositionLocator;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomInformationItemEditPart.
 */
public class CustomInformationItemEditPartCN extends InformationItemEditPartCN {

	/**
	 * Instantiates a new custom information item edit part.
	 *
	 * @param view
	 *        the view
	 */
	public CustomInformationItemEditPartCN(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new GetChildLayoutEditPolicy());
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationItemEditPart#createNodePlate()
	 *
	 * @return
	 */

	protected NodeFigure createNodePlate() {
		//Use custom node plate
		DefaultSizeNodeFigure result = new RoundedRectangleNodePlateFigure(40, 40);
		return result;
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart#addBorderItem(org.eclipse.draw2d.IFigure,
	 *      org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart)
	 *
	 * @param borderItemContainer
	 * @param borderItemEditPart
	 */

	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		//if it's a floating name
		if(borderItemEditPart instanceof FloatingLabelEditPart) {
			//Create specific locator
			RoundedRectangleLabelPositionLocator locator = new RoundedRectangleLabelPositionLocator(getMainFigure(), PositionConstants.SOUTH);
			//Offset from the parent for the constraint case
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}
}
