package org.eclipse.papyrus.uml.diagram.component.custom.edit.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.RoundedRectangleNodePlateFigure;
import org.eclipse.papyrus.uml.diagram.common.editparts.FloatingLabelEditPart;
import org.eclipse.papyrus.uml.diagram.common.locator.RoundedRectangleLabelPositionLocator;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PortEditPart;



public class CustomPortEditPart extends PortEditPart {

	public CustomPortEditPart(View view) {
		super(view);
	}

	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new RoundedRectangleNodePlateFigure(20, 20);
		return result;
	}

	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		if(borderItemEditPart instanceof FloatingLabelEditPart) {
			//Create specific locator
			RoundedRectangleLabelPositionLocator locator = new RoundedRectangleLabelPositionLocator(getMainFigure(), PositionConstants.SOUTH);
			//Offset from the parent for the attached case
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}
}
