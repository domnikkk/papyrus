package org.eclipse.papyrus.uml.diagram.activity.edit.part;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.GetChildLayoutEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.RoundedRectangleNodePlateFigure;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityPartitionEditPart;

public class CustomActivityPartitionEditPart extends ActivityPartitionEditPart {

	public CustomActivityPartitionEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new GetChildLayoutEditPolicy());
	}

	@Override
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new RoundedRectangleNodePlateFigure(-20, -20);
		return result;
	}

	// @Override
	// protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
	// if (borderItemEditPart instanceof FloatingLabelEditPart) {
	// // Create specific locator
	// RoundedRectangleLabelPositionLocator locator = new RoundedRectangleLabelPositionLocator(getMainFigure(), PositionConstants.SOUTH);
	// // Offset from the parent for the attached case
	// locator.setBorderItemOffset(new Dimension(-20, -20));
	// borderItemContainer.add(borderItemEditPart.getFigure(), locator);
	// } else {
	// super.addBorderItem(borderItemContainer, borderItemEditPart);
	// }
	// }
}
