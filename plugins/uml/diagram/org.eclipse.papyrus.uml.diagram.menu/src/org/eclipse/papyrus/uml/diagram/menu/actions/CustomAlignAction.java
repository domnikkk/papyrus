/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr 		- Initial API and implementation
 *  Céline Janssens (ALL4TEC)  celine.janssens@all4tec.net 	- Bug 442582 : Code refactor and documentation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.menu.actions;

import java.util.List;

import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.AlignmentRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.papyrus.uml.diagram.common.helper.AlignmentLinkHelper;
import org.eclipse.papyrus.uml.diagram.common.layout.LayoutUtils;



/**
 * The Class provides actions for the objects alignment.
 * These actions work correctly only if the figure to align is owned by :
 * <ul>
 * <li>the diagram</li>
 * <li>by a {@link CompartmentEditPart}. This {@link CompartmentEditPart} is owned by a figure composed by :
 * <ul>
 * <li>a compartment for the name (name + stereotype)</li>
 * <li>a compartment for object, located under the name's compartment, with {@link EditPolicy#LAYOUT_ROLE }</li>
 * </ul>
 * </li>
 * </ul>
 * If the containing figure is different, a correct alignment is not guaranteed.
 * 
 * With this class, we can align nodes, by selecting them, or by selecting the link between them, thanks to {@link AlignmentLinkHelper}
 */
public class CustomAlignAction {

	/** The alignment type. */
	private int alignment;
	
	/** the selected elements. */
	private List<IGraphicalEditPart> selectedElements;

	/** Reference Edit Part for the Alignment. */
	private EditPart refEditPart;

	/** Reference Rectangle on which the alignment is based. */
	private PrecisionRectangle refBounds;

	/** Helper for specific treatment*/
	private AlignActionHelper helper ;


	/**
	 * Constructor.
	 * 
	 * @param alignment Alignment Type
	 * @param selectedElements List of selected EditParts
	 */
	public CustomAlignAction(int alignment, List<IGraphicalEditPart> selectedElements) {
		this.alignment = alignment;
		this.selectedElements = selectedElements;
		helper = new AlignActionHelper(alignment, selectedElements);
	}

	/**
	 * Returns the command for this action
	 * 
	 * @return
	 *         the command for this action
	 */
	public Command getCommand() {

		CompoundCommand commands = new CompoundCommand("Alignment Commands");

		// In case of only Edges selected, a specific alignment is done
		if(helper.isLinkSelection(selectedElements)) {
			// Align Source and target Nodes of the edge depending on the alignment type
			AlignmentLinkHelper helper = new AlignmentLinkHelper(selectedElements, alignment);
			commands.add(helper.createCommand());

		} else if (helper.isAlignAllowed(selectedElements)){

			// Define the reference
			refEditPart = helper.getRefEditPart();
			// Get absolute bounds of the Reference Edit Part
			refBounds = LayoutUtils.getAbsolutePosition(refEditPart);

			for (EditPart currentEP: selectedElements){
				if (currentEP.getSelected() == EditPart.SELECTED){
					PrecisionRectangle currentEPBounds = LayoutUtils.getAbsolutePosition(currentEP);
					PrecisionRectangle newPosition = helper.getNewPosition(currentEPBounds , refBounds );

					if (helper.isPositionAllowed(currentEP, newPosition)){
						commands.add(getAlignmentCommand(currentEP, newPosition));
					}
				}
			}
		} else {
			commands = null;
		}

		return (Command)commands;
	}


	/**
	 * Get the Alignment Commands of selected editParts
	 * @param newPosition 
	 * @param currentEP 
	 * @return
	 * 			the Command related to the selected editParts and the Alignment Request
	 */
	private Command getAlignmentCommand(EditPart currentEP, PrecisionRectangle newPosition) {

		Command curCommand = null;
		if(currentEP != null) {
			// get the alignment request associated to the EditPartTree
			AlignmentRequest currentReq = (AlignmentRequest) getRequest(currentEP , newPosition);
			if(currentReq != null) {

				// if this request is not null, get the associated command for this editPart
				curCommand = currentEP.getCommand(currentReq);

			}
		}

		return curCommand;
	}

	/**
	 * Create the Alignment Request.
	 * @param newPosition The wished new position of the EditPart after Alignment
	 * @param currentEP 

	 */
	protected AlignmentRequest getRequest(EditPart currentEP, PrecisionRectangle newPosition) {

		AlignmentRequest alignReq = new AlignmentRequest(RequestConstants.REQ_ALIGN);

		alignReq.setAlignment(alignment);
		alignReq.setAlignmentRectangle(newPosition);
		alignReq.setEditParts(currentEP);

		return alignReq;

	}

}
