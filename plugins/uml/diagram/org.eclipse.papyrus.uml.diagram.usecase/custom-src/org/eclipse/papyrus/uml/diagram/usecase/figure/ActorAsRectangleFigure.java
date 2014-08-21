package org.eclipse.papyrus.uml.diagram.usecase.figure;

import org.eclipse.draw2d.OrderedLayout;
import org.eclipse.papyrus.uml.diagram.common.figure.node.NodeNamedElementFigure;

public class ActorAsRectangleFigure extends NodeNamedElementFigure {

	private org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel fActorAsRectangleFigure_name;

	public ActorAsRectangleFigure() {
		org.eclipse.draw2d.ToolbarLayout layoutThis = new org.eclipse.draw2d.ToolbarLayout();
		layoutThis.setStretchMinorAxis(true);
		layoutThis.setMinorAlignment(OrderedLayout.ALIGN_CENTER);
		layoutThis.setSpacing(0);
		layoutThis.setHorizontal(false);
		this.setLayoutManager(layoutThis);
		this.setLineWidth(1);
		createContents();
	}

	private void createContents() {
		org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel actorAsRectangleFigure_fixed_actor0 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel();
		actorAsRectangleFigure_fixed_actor0.setText("\u00ABactor\u00BB");
		this.add(actorAsRectangleFigure_fixed_actor0);
		org.eclipse.draw2d.RectangleFigure actorAsRectangleFigure_NameContainer0 = new org.eclipse.draw2d.RectangleFigure();
		actorAsRectangleFigure_NameContainer0.setFill(false);
		actorAsRectangleFigure_NameContainer0.setOutline(false);
		actorAsRectangleFigure_NameContainer0.setLineWidth(1);
		this.add(actorAsRectangleFigure_NameContainer0);
		org.eclipse.papyrus.uml.diagram.common.draw2d.CenterLayout layoutActorAsRectangleFigure_NameContainer0 = new org.eclipse.papyrus.uml.diagram.common.draw2d.CenterLayout();
		actorAsRectangleFigure_NameContainer0.setLayoutManager(layoutActorAsRectangleFigure_NameContainer0);
		fActorAsRectangleFigure_name = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel();
		fActorAsRectangleFigure_name.setText("");
		actorAsRectangleFigure_NameContainer0.add(fActorAsRectangleFigure_name);
	}

	private boolean myUseLocalCoordinates = false;

	@Override
	protected boolean useLocalCoordinates() {
		return myUseLocalCoordinates;
	}

	protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
		myUseLocalCoordinates = useLocalCoordinates;
	}

	public org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel getActorAsRectangleFigure_name() {
		return fActorAsRectangleFigure_name;
	}
}
