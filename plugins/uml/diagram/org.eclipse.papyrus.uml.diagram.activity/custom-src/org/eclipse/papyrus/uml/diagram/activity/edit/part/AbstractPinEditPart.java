package org.eclipse.papyrus.uml.diagram.activity.edit.part;

import java.util.List;

import org.eclipse.draw2d.AbstractPointListShape;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.BorderedBorderItemEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.papyrus.uml.diagram.activity.figures.PinFigure;
import org.eclipse.papyrus.uml.diagram.activity.helper.ActivityFigureDrawer;


public abstract class AbstractPinEditPart extends BorderedBorderItemEditPart {

	public AbstractPinEditPart(View view) {
		super(view);
	}

	/**
	 * Notifies listeners that a target connection has been added.
	 *
	 * @param connection
	 *            <code>ConnectionEditPart</code> being added as child.
	 * @param index
	 *            Position child is being added into.
	 */
	@Override
	protected void fireTargetConnectionAdded(ConnectionEditPart connection, int index) {
		super.fireTargetConnectionAdded(connection, index);
		undrawPinArrow(connection);
	}

	/**
	 * Notifies listeners that a source connection has been added.
	 *
	 * @param connection
	 *            <code>ConnectionEditPart</code> being added as child.
	 * @param index
	 *            Position child is being added into.
	 */
	@Override
	protected void fireSourceConnectionAdded(ConnectionEditPart connection, int index) {
		super.fireSourceConnectionAdded(connection, index);
		undrawPinArrow(connection);
	}

	/**
	 * undraw the pin arrow
	 *
	 * @param connection
	 *            <code>ConnectionEditPart</code> being added as child.
	 */
	private void undrawPinArrow(ConnectionEditPart connection) {
		if (isConnectionSupported(connection)) {
			PinFigure pinFigure = getPrimaryShape();
			AbstractPointListShape arrow = pinFigure.getOptionalArrowFigure();
			ActivityFigureDrawer.undrawFigure(arrow);
		}
	}

	/**
	 * redraw the pin arrow if current connection doesnt set
	 *
	 * @param connection
	 *            <code>ConnectionEditPart</code> being added as child.
	 */
	private void redrawPinArrow(List connections) {
		this.redrawPinArrow(null, connections);
	}

	/**
	 * redraw the pin arrow if no other target connection left
	 *
	 * @param connection
	 *            <code>ConnectionEditPart</code> being added as child.
	 */
	private void redrawPinArrow(ConnectionEditPart connection, List connections) {
		boolean hasActivityEdge = false;
		for (Object connect : connections) {
			if (!connection.equals(connect) && isConnectionSupported((ConnectionEditPart) connect)) {
				hasActivityEdge = true;
				break;
			}
		}
		if (!hasActivityEdge) {
			PinFigure pinFigure = getPrimaryShape();
			AbstractPointListShape arrow = pinFigure.getOptionalArrowFigure();
			int side = getBorderItemLocator().getCurrentSideOfParent();
			int direction = ActivityFigureDrawer.getOppositeDirection(side);
			ActivityFigureDrawer.redrawPinArrow(arrow, getMapMode(), getSize(), direction);
		}
	}

	/**
	 * is connection supported for the pin arrow redraw
	 *
	 * @param connection
	 *            <code>ConnectionEditPart</code> being added as child.
	 */
	private boolean isConnectionSupported(ConnectionEditPart connection) {
		return (connection instanceof ObjectFlowEditPart || connection instanceof ControlFlowEditPart);
	}

	/**
	 * Notifies listeners that a target connection has been removed.
	 *
	 * @param connection
	 *            <code>ConnectionEditPart</code> being added as child.
	 * @param index
	 *            Position child is being added into.
	 */
	@Override
	protected void fireRemovingTargetConnection(ConnectionEditPart connection, int index) {
		super.fireRemovingTargetConnection(connection, index);
		redrawPinArrow(connection, getTargetConnections());
	}

	/**
	 * Notifies listeners that a source connection has been removed.
	 *
	 * @param connection
	 *            <code>ConnectionEditPart</code> being added as child.
	 * @param index
	 *            Position child is being added into.
	 */
	@Override
	protected void fireRemovingSourceConnection(ConnectionEditPart connection, int index) {
		super.fireRemovingTargetConnection(connection, index);
		redrawPinArrow(connection, getSourceConnections());
	}

	public abstract PinFigure getPrimaryShape();

	/**
	 * Registers this editpart to recieve notation and semantic events.
	 *
	 */
	@Override
	public void activate() {
		super.activate();
		// redraw the pin arrow if no connection
		redrawPinArrow(getTargetConnections());
		redrawPinArrow(getSourceConnections());
	}
}
