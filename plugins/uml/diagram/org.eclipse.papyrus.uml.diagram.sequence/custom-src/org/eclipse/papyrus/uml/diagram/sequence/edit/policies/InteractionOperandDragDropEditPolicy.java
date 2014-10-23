/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.sequence.edit.policies;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CombinedFragmentCombinedFragmentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.InteractionOperandEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.util.OperandBoundsComputeHelper;

/**
 * The customn DragDropEditPolicy for InteractionOperandEditPart.
 */
public class InteractionOperandDragDropEditPolicy extends ResizableEditPolicy {

	/**
	 * Disable drag and allow only south resize. {@inheritDoc}
	 */
	public InteractionOperandDragDropEditPolicy() {
		super();
		setDragAllowed(false);
	}

	/**
	 * Handle resize InteractionOperand {@inheritDoc}
	 */
	@Override
	protected Command getResizeCommand(ChangeBoundsRequest request) {
		boolean isVertResize = (request.getResizeDirection() & PositionConstants.NORTH_SOUTH) != 0;
		boolean isHorResize = (request.getResizeDirection() & PositionConstants.EAST_WEST) != 0;
		boolean isNorthResize = (request.getResizeDirection() & PositionConstants.NORTH) != 0;
		boolean isSouthResize = (request.getResizeDirection() & PositionConstants.SOUTH) != 0;
		if (isHorResize && !isVertResize) {
			EditPart parent = getHost().getParent().getParent();
			return parent.getCommand(request);
		} else if (isVertResize) {
			if (this.getHost() instanceof InteractionOperandEditPart && this.getHost().getParent() instanceof CombinedFragmentCombinedFragmentCompartmentEditPart) {
				InteractionOperandEditPart currentIOEP = (InteractionOperandEditPart) this.getHost();
				CombinedFragmentCombinedFragmentCompartmentEditPart compartEP = (CombinedFragmentCombinedFragmentCompartmentEditPart) this.getHost().getParent();
				// if the OP's border same as/linked to the CF's border 
				if (this.getHost() == OperandBoundsComputeHelper.findFirstIOEP(compartEP) && isNorthResize
						|| this.getHost() == OperandBoundsComputeHelper.findLastIOEP(compartEP) && isSouthResize) {
					return getHost().getParent().getParent().getCommand(request);
				} else {
					return OperandBoundsComputeHelper.createIOEPResizeCommand(currentIOEP, request, compartEP);
				}
			}
		}
		return null;
	}
}
