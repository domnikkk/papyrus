package org.eclipse.papyrus.uml.diagram.activity.edit.part;

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
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.papyrus.uml.diagram.common.editparts.FloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.common.locator.RoundedRectangleLabelPositionLocator;

public class CustomCallBehaviorActionEditPart extends CallBehaviorActionEditPart {

	/**
	 * 
	 */
	private static final int CORNER_HEIGHT = 15;

	/**
	 * 
	 */
	private static final int CORNER_WIDTH = 15;

	/**
	 * Constructor.
	 *
	 * @param view
	 */
	public CustomCallBehaviorActionEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new GetChildLayoutEditPolicy());
	}

	@Override
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new RoundedRectangleNodePlateFigure(-20, 40);
		return result;
	}

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
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart#getDefaultCornerHeight()
	 *
	 * @return
	 */
	@Override
	protected int getDefaultCornerHeight() {
		return CORNER_HEIGHT;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart#getDefaultCornerWidth()
	 *
	 * @return
	 */
	@Override
	protected int getDefaultCornerWidth() {
		return CORNER_WIDTH;
	}

}
