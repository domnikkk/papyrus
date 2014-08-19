/*****************************************************************************
 * Copyright (c) 2009 CEA
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Alex Paperno - bug 395248
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.sequence.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.papyrus.commands.wrappers.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.commands.wrappers.GEFtoEMFCommandWrapper;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CombinedFragmentEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CustomCombinedFragmentEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.CustomInteractionOperandEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.parts.InteractionOperandEditPart;
import org.eclipse.papyrus.uml.diagram.sequence.edit.policies.InteractionCompartmentXYLayoutEditPolicy;

public class CombinedFragmentMoveHelper {
	
	protected final static int CF_PADDING = 10;
	
	/**
	 * Calculate combined rect
	 * 
	 */
	public static Rectangle calcCombinedRect(ChangeBoundsRequest request) {
        Rectangle rectangleDroppedCombined = new Rectangle();
		for (Object part : request.getEditParts()) {
			CombinedFragmentEditPart combinedFragmentEP = (CombinedFragmentEditPart)part;
			Rectangle rectangleDropped = combinedFragmentEP.getFigure().getBounds().getCopy();
			combinedFragmentEP.getFigure().translateToAbsolute(rectangleDropped);
	
			if (!rectangleDroppedCombined.isEmpty()) {
				rectangleDroppedCombined = new Rectangle(rectangleDropped.getUnion(rectangleDroppedCombined));
			}
			else {
				rectangleDroppedCombined = rectangleDropped;
			}
		}
		rectangleDroppedCombined.translate(request.getMoveDelta());
		rectangleDroppedCombined.expand(CF_PADDING, CF_PADDING);
		return rectangleDroppedCombined;
	}

	/**
	 * Find the EP that we're dropping to
	 * 
	 */
	public static GraphicalEditPart findNewParentEP(ChangeBoundsRequest request, EditPart hostEP) {
		GraphicalEditPart parentEP = (GraphicalEditPart)hostEP;
		if (hostEP.getParent() instanceof CustomCombinedFragmentEditPart) {
			// Select which InteractionOperand we're dropping to
			CustomCombinedFragmentEditPart hostCFEP =  (CustomCombinedFragmentEditPart)hostEP.getParent();
			List<CustomInteractionOperandEditPart> operands = hostCFEP.getOperandChildrenEditParts();
			if (!operands.isEmpty()) {
				Point location = request.getLocation();
				parentEP = operands.get(0);
				for (CustomInteractionOperandEditPart operand : operands) {
					Rectangle bounds = operand.getFigure().getBounds().getCopy();
					operand.getFigure().translateToAbsolute(bounds);
					if (bounds.contains(location)) {
						parentEP = operand;
					}
				}
			}
		}
		return parentEP;
	}
	
	/**
	 * Move new parent's operands
	 * 
	 */
	public static void adjustNewParentOperands(CompoundCommand cc, Rectangle newParentNewRect, Rectangle newParentOldRect, EditPart hostEP) {
		Set<Object> alreadyMovedBlocks = new HashSet<Object>();
		CustomCombinedFragmentEditPart hostCFEP =  (CustomCombinedFragmentEditPart)hostEP.getParent();
		List<CustomInteractionOperandEditPart> operands = hostCFEP.getOperandChildrenEditParts();
		int moveUpperYOffset = newParentNewRect.y - newParentOldRect.y;
		int moveLowerYOffset = newParentNewRect.height - newParentOldRect.height;
		for (CustomInteractionOperandEditPart operand : operands) {
			Rectangle rectangleOperand = operand.getFigure().getBounds().getCopy();
			operand.getFigure().translateToAbsolute(rectangleOperand);
			Bounds operandBounds = OperandBoundsComputeHelper.getEditPartBounds(operand);
			Rectangle operandRect = OperandBoundsComputeHelper.fillRectangle(operandBounds);
			operandRect.width = newParentNewRect.width;
			int moveItemsOffset = moveUpperYOffset;
			Point offsetInnerCFs = new Point(newParentOldRect.x - newParentNewRect.x, 0);
			if (rectangleOperand.y == newParentOldRect.y) {
				operandRect.height += moveLowerYOffset;
				moveItemsOffset = 0;
				offsetInnerCFs.y = -moveUpperYOffset;
			}
			else if (rectangleOperand.y > newParentOldRect.y) {
				operandRect.y += moveLowerYOffset;
				moveItemsOffset = moveLowerYOffset + moveUpperYOffset;
			}
			ICommand resizeOperandCommand = OperandBoundsComputeHelper.createUpdateEditPartBoundsCommand(operand, operandRect);
			cc.add(new ICommandProxy(resizeOperandCommand));
			Command adjustInnerCFsCommand = getShiftEnclosedCFsCommand(operand, offsetInnerCFs); 
			if (adjustInnerCFsCommand != null) {
				cc.add(adjustInnerCFsCommand);
			}
			Command shiftExecutions = OperandBoundsComputeHelper.getForcedShiftEnclosedFragmentsCommand(operand, moveItemsOffset, alreadyMovedBlocks);
			if(shiftExecutions != null) {
				cc.add(new ICommandProxy(new EMFtoGMFCommandWrapper(new GEFtoEMFCommandWrapper(shiftExecutions))));
			}
		}
	}
	
	/**
	 * Shift inner CFs so that they don't change absolute coords
	 * 
	 */
	public static Command getShiftEnclosedCFsCommand(InteractionOperandEditPart editPart, Point offset) {
		if(editPart == null || offset.x == 0 && offset.y == 0) {
			return null;
		}
		CompoundCommand cc = new CompoundCommand("shift inner CFs"); //$NON-NLS-1$
		List<?> children = editPart.getChildren();
		for (int i = 0; i < children.size(); i++) {
			if (false == children.get(i) instanceof CustomCombinedFragmentEditPart) {
				continue;
			}
			CustomCombinedFragmentEditPart childCF = (CustomCombinedFragmentEditPart)children.get(i);
			
			final ChangeBoundsRequest moveChildCFRequest = new ChangeBoundsRequest();
			moveChildCFRequest.setType(RequestConstants.REQ_MOVE);
			moveChildCFRequest.setMoveDelta(offset);
			moveChildCFRequest.setEditParts(childCF);
			moveChildCFRequest.setResizeDirection(PositionConstants.SOUTH_WEST);
			cc.add(childCF.getCommand(moveChildCFRequest));
			
		}
		if (cc.size() == 0)
			return null;
		return cc;
	}
	
	/**
	 * Move CombinedFragment EP
	 * 
	 */
	public static void moveCombinedFragmentEP(CompoundCommand cc, ChangeBoundsRequest request, CustomCombinedFragmentEditPart combinedFragmentEP, GraphicalEditPart newParentEP, Point newParentOffsetSW) {
		// Calc CF moveDelta
		final ChangeBoundsRequest forceLocationRequest = new ChangeBoundsRequest();
		forceLocationRequest.setType(RequestConstants.REQ_MOVE_CHILDREN);
		Point moveDelta = request.getMoveDelta().getCopy();

		// CFs children moveDelta need special processing (no need to translate coords)
		Point childrenMoveDelta = moveDelta.getCopy();
		HashMap<String,Object> extData = new HashMap<String,Object>();
		forceLocationRequest.setExtendedData(extData);
		extData.put(InteractionCompartmentXYLayoutEditPolicy.CHILDREN_MOVEDELTA, childrenMoveDelta);

		// Translate moveDelta into new parents coords
		Rectangle oldParentBounds = ((GraphicalEditPart)combinedFragmentEP.getParent()).getFigure().getBounds().getCopy();
		((GraphicalEditPart)combinedFragmentEP.getParent()).getFigure().translateToAbsolute(oldParentBounds);
		moveDelta.translate(oldParentBounds.x, oldParentBounds.y);
		Rectangle parentBounds = newParentEP.getFigure().getBounds().getCopy();
		newParentEP.getFigure().translateToAbsolute(parentBounds);
		moveDelta.translate(-parentBounds.x - newParentOffsetSW.x, -parentBounds.y - newParentOffsetSW.y);
		forceLocationRequest.setMoveDelta(moveDelta);
	
		Point moveLocation = request.getLocation();
		//newParentEP.getFigure().translateToRelative(moveLocation);
		forceLocationRequest.setLocation(moveLocation);
		forceLocationRequest.setEditParts(combinedFragmentEP);
		cc.add(combinedFragmentEP.getParentInteractionCompartmentEditPart().getCommand(forceLocationRequest));
	}
	
}
