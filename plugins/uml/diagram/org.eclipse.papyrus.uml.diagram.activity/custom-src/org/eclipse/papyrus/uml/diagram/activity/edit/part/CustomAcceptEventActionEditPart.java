/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.edit.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.GetChildLayoutEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.RoundedRectangleNodePlateFigure;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.helper.AcceptEventActionSwitchHelper;
import org.eclipse.papyrus.uml.diagram.common.editparts.FloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.common.locator.RoundedRectangleLabelPositionLocator;
import org.eclipse.uml2.uml.AcceptEventAction;


/**
 * This editpart extends the generated controller in order to add specific behavior
 *
 */
public class CustomAcceptEventActionEditPart extends AcceptEventActionEditPart {

	public CustomAcceptEventActionEditPart(View view) {
		super(view);
	}

	/**
	 * Notifier for listening and stop listening model element.
	 *
	 */
	private AcceptEventActionSwitchHelper notifier = new AcceptEventActionSwitchHelper(this);


	/**
	 * Deactivate listeners to handle notification in the message occurence
	 * specification
	 *
	 */
	@Override
	public void deactivate() {
		notifier.unlistenAll();
		super.deactivate();
	}

	/**
	 * Remove listeners to handle notification in the message occurence specification
	 *
	 */
	@Override
	public void removeNotify() {
		notifier.unlistenAll();
		super.removeNotify();
	}



	/**
	 * Activate a listener for to Handle notification for new owned YYY
	 *
	 */
	@Override
	public void activate() {
		super.activate();
		EObject action = resolveSemanticElement();
		if (action instanceof AcceptEventAction) {
			notifier.listenObject(action);
			// ensure representation is correctly initialized.
			// boolean useHourglassFigure = org.eclipse.papyrus.uml.diagram.activity.helper.CustomAcceptEventActionEditHelper.isAcceptTimeEventAction((AcceptEventAction) action);
			// getPrimaryShape().useTemplateForAcceptTimeEventAction(useHourglassFigure);
		}
	}

	/** The Constant USE_ORIGINAL_COLORS_VALUE. */
	private static final boolean USE_ORIGINAL_COLORS_VALUE = false;

	/** The Constant FLOATING_LABEL_OFFSET_WIDTH_VALUE. */
	private static final int FLOATING_LABEL_OFFSET_WIDTH_VALUE = 10;

	/** The Constant FLOATING_LABEL_OFFSET_HEIGHT_VALUE. */
	private static final int FLOATING_LABEL_OFFSET_HEIGHT_VALUE = 10;

	/**
	 * Creates the default edit policies.
	 *
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.parts.BroadcastSignalActionEditPart#createDefaultEditPolicies()
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new GetChildLayoutEditPolicy());
	}

	/**
	 * Creates the node plate.
	 *
	 * @return the node figure
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.parts.BroadcastSignalActionEditPart#createNodePlate()
	 */
	@Override
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new RoundedRectangleNodePlateFigure(125, 45);
		return result;
	}

	/**
	 * Adds the border item.
	 *
	 * @param borderItemContainer
	 *            the border item container
	 * @param borderItemEditPart
	 *            the border item edit part
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.parts.BroadcastSignalActionEditPart#addBorderItem(org.eclipse.draw2d.IFigure, org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart)
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
	 * Gets the default floating label offset height.
	 *
	 * @return the default floating label offset height
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart#getDefaultFloatingLabelOffsetHeight()
	 */
	@Override
	protected int getDefaultFloatingLabelOffsetHeight() {
		return FLOATING_LABEL_OFFSET_HEIGHT_VALUE;
	}

	/**
	 * Gets the default floating label offset width.
	 *
	 * @return the default floating label offset width
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart#getDefaultFloatingLabelOffsetWidth()
	 */
	@Override
	protected int getDefaultFloatingLabelOffsetWidth() {
		return FLOATING_LABEL_OFFSET_WIDTH_VALUE;
	}

	/**
	 * Gets the default use original colors.
	 *
	 * @return the default use original colors
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart#getDefaultUseOriginalColors()
	 */
	@Override
	protected boolean getDefaultUseOriginalColors() {
		return USE_ORIGINAL_COLORS_VALUE;
	}
}