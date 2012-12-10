/*****************************************************************************
 * Copyright (c) 2012 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos - Initial API and implementation
 *
 *****************************************************************************/
/*****************************************************************************
 * Copyright (c) 2012 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.activity.edit.part;

import org.eclipse.draw2d.AbstractPointListShape;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInRemoveStructuralFeatureValueActionAsValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.papyrus.diagram.activity.helper.ActivityFigureDrawer;

public class CustomInputPinInRemoveStructuralFeatureValueActionAsObjectEditPart extends InputPinInRemoveStructuralFeatureValueActionAsValueEditPart {

	public CustomInputPinInRemoveStructuralFeatureValueActionAsObjectEditPart(View view) {
		super(view);
	}

	/**
	 * Notifies listeners that a target connection has been added.
	 * 
	 * @param connection
	 *        <code>ConnectionEditPart</code> being added as child.
	 * @param index
	 *        Position child is being added into.
	 */
	@Override
	protected void fireSourceConnectionAdded(ConnectionEditPart connection, int index) {
		super.fireSourceConnectionAdded(connection, index);
		// undraw the pin arrow
		if(connection instanceof ObjectFlowEditPart || connection instanceof ControlFlowEditPart) {
			PinDescriptor pinFigure = getPrimaryShape();
			AbstractPointListShape arrow = ((PinDescriptor)pinFigure).getOptionalArrowFigure();
			ActivityFigureDrawer.undrawFigure(arrow);
		}
	}

	/**
	 * Notifies listeners that a source connection has been removed.
	 * 
	 * @param connection
	 *        <code>ConnectionEditPart</code> being added as child.
	 * @param index
	 *        Position child is being added into.
	 */
	@Override
	protected void fireRemovingSourceConnection(ConnectionEditPart connection, int index) {
		super.fireRemovingSourceConnection(connection, index);
		// redraw the pin arrow if no other target connection left
		boolean hasActivityEdge = false;
		for(Object connect : getSourceConnections()) {
			if(!connection.equals(connect) && (connect instanceof ObjectFlowEditPart || connect instanceof ControlFlowEditPart)) {
				hasActivityEdge = true;
				break;
			}
		}
		if(!hasActivityEdge) {
			PinDescriptor pinFigure = getPrimaryShape();
			AbstractPointListShape arrow = pinFigure.getOptionalArrowFigure();
			int side = getBorderItemLocator().getCurrentSideOfParent();
			int direction = ActivityFigureDrawer.getOppositeDirection(side);
			ActivityFigureDrawer.redrawPinArrow(arrow, getMapMode(), getSize(), direction);
		}
	}

	/**
	 * Registers this editpart to recieve notation and semantic events.
	 */
	@Override
	public void activate() {
		super.activate();
		// redraw the pin arrow if no connection
		boolean hasActivityEdge = false;
		for(Object connection : getSourceConnections()) {
			if(connection instanceof ObjectFlowEditPart || connection instanceof ControlFlowEditPart) {
				hasActivityEdge = true;
				break;
			}
		}
		if(!hasActivityEdge) {
			PinDescriptor pinFigure = getPrimaryShape();
			AbstractPointListShape arrow = pinFigure.getOptionalArrowFigure();
			int side = getBorderItemLocator().getCurrentSideOfParent();
			int direction = ActivityFigureDrawer.getOppositeDirection(side);
			ActivityFigureDrawer.redrawPinArrow(arrow, getMapMode(), getSize(), direction);
		}
	}
}
