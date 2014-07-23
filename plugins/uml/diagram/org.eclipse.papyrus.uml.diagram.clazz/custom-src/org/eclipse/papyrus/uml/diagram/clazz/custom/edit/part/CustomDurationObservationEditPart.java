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


import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.core.utils.TransactionHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.GetChildLayoutEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.RoundedRectangleNodePlateFigure;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.common.editparts.FloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.common.locator.RoundedRectangleLabelPositionLocator;
import org.eclipse.papyrus.uml.diagram.common.util.CompartmentUtils;

/**
 * The Class CustomDurationObservationEditPart.
 */
public class CustomDurationObservationEditPart extends DurationObservationEditPart {

	/** The Constant FLOATING_NAME_OFFSET_WIDTH. */
	private static final int FLOATING_NAME_OFFSET_WIDTH = 25;

	/** The Constant FLOATING_NAME_OFFSET_HEIGHT. */
	private static final int FLOATING_NAME_OFFSET_HEIGHT = 3;

	private boolean isSymbolCompartmentShowed = false;

	/**
	 * Instantiates a new edit part.
	 *
	 * @param view
	 *        the view
	 */
	public CustomDurationObservationEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new GetChildLayoutEditPolicy());
	}

	/**
	 * Creates the node plate.
	 *
	 * @return the node figure
	 * @see org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPart#createNodePlate()
	 */
	@Override
	protected NodeFigure createNodePlate() {
		//Use custom node plate
		DefaultSizeNodeFigure result = new RoundedRectangleNodePlateFigure(20, 20);
		return result;
	}

	/**
	 * Adds the border item.
	 *
	 * @param borderItemContainer
	 *        the border item container
	 * @param borderItemEditPart
	 *        the border item edit part
	 * @see org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPart#addBorderItem(org.eclipse.draw2d.IFigure,
	 *      org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart)
	 */
	@Override
	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		//if it's a floating name
		if(borderItemEditPart instanceof FloatingLabelEditPart) {
			//Create specific locator
			RoundedRectangleLabelPositionLocator locator = new RoundedRectangleLabelPositionLocator(getMainFigure(), PositionConstants.EAST);
			//Offset from the parent for the constraint case
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.NamedElementEditPart#activate()
	 *
	 */
	@Override
	public void refresh() {
		super.refresh();
		showSymbolCompartment();
	}

	/**
	 * Set the visibility of symbol compartment
	 */
	private void showSymbolCompartment() {
		//Get all compartments
		List<View> compartments = CompartmentUtils.getAllCompartments(this, false);
		for(final View compartment : compartments) {
			//for the symbol compartment
			if(compartment instanceof BasicCompartment && "compartment_shape_display".equals(compartment.getType())) {
				//Show the compartment only one time.
				if(!isSymbolCompartmentShowed) {
					try {
						TransactionHelper.run(getEditingDomain(), new Runnable() {

							@Override
							public void run() {
								compartment.setVisible(true);
							}
						});
					} catch (Exception e) {
						System.out.println(e.toString());
					}
					if(compartment.isVisible()) {
						isSymbolCompartmentShowed = true;
					}
				}
			}
		}
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart#getDefaultFloatingNameOffsetHeight()
	 *
	 * @return
	 */
	@Override
	protected int getDefaultFloatingNameOffsetHeight() {
		return FLOATING_NAME_OFFSET_HEIGHT;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart#getDefaultFloatingNameOffsetWidth()
	 *
	 * @return
	 */
	@Override
	protected int getDefaultFloatingNameOffsetWidth() {
		return FLOATING_NAME_OFFSET_WIDTH;
	}
}
