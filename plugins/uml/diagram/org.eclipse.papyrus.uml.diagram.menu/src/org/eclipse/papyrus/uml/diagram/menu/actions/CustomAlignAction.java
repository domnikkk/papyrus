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
 *  C�line Janssens (ALL4TEC)  celine.janssens@all4tec.net 	- Code refractor and documentation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.menu.actions;

import java.util.Enumeration;
import java.util.List;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.AlignmentRequest;
import org.eclipse.gef.tools.ToolUtilities;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.papyrus.uml.diagram.common.helper.AlignmentLinkHelper;
import org.eclipse.papyrus.uml.diagram.common.layout.AlignmentTree;
import org.eclipse.papyrus.uml.diagram.common.layout.EditPartTree;
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

	/**
	 * the Tree used to sort editparts
	 * It contains all the selected editpart AND the intermediate editparts which can exist between two selected editparts
	 *
	 */
	private AlignmentTree rootTree;


	/** The alignment. */
	private int alignment;
	/** the selected elements */
	private List<IGraphicalEditPart> selectedElements;
	/** List of selected edit Parts*/
	private List<EditPart> editparts;
	
	/** Helper for specific treatment*/
	private AlignActionHelper helper = new AlignActionHelper(this);

	/**
	 * 
	 * Constructor.
	 * 
	 * @param alignment
	 * @param selectedElements
	 */
	public CustomAlignAction(int alignment, List<IGraphicalEditPart> selectedElements) {
		this.alignment = alignment;
		this.selectedElements = selectedElements;
	}

	/**
	 * Returns the command for this action
	 *
	 * @return
	 *         the command for this action
	 */
	public Command getCommand() {
		
		editparts = helper.getEditPartList();
		Command cmd = null;
		
		// In case of alignment not allowed no command is returned.
		if (!helper.isAlignAllowed(editparts)){
			cmd =  UnexecutableCommand.INSTANCE;
		}

		// In case of only Edges selected, a specific alignment is done
		if(helper.isLinkSelection(editparts)) {
			// Align Source and target Nodes of the edge depending on the alignment type
			AlignmentLinkHelper helper = new AlignmentLinkHelper(editparts, alignment);
			cmd =  helper.createCommand();
		}
		
 	// If only 1 Nodes is selected no Alignment is possible
		if(editparts.size() < 2) {
			cmd =  UnexecutableCommand.INSTANCE;

		}else{

			rootTree = new AlignmentTree(editparts);
			// create the alignment requests
			createRequests();
			// return the associated command
			cmd =  getAlignmentCommand();
		}
	
		return cmd;
	}

	/**
	 * Get the Alignment Commands of selected editParts
	 * @return
	 * 			the Command related to the selected editParts and the Alignment Request
	 */
	private Command getAlignmentCommand() {

		CompoundCommand commands = new CompoundCommand("Alignment Commands"); //$NON-NLS-1$
		// Create a enumeration with the sub tree element ordered by breadth
		Enumeration<?> eptEnum = rootTree.breadthFirstEnumeration();
		while(eptEnum.hasMoreElements()) {//for each selected element
			// Create an EditPartTree - hierarchy between selected editparts
			EditPartTree ept = (EditPartTree)eptEnum.nextElement();

			if(ept.getEditPart() != null) {
				// get the alignment request associated to the EditPartTree
				AlignmentRequest currentReq = (AlignmentRequest)ept.getRequest();
				if(currentReq != null) {
					Command curCommand = null;
					// if this request is not null, get the associated command for this editPart
					curCommand = ept.getEditPart().getCommand(currentReq);
					if(curCommand != null) {
						// Add it to the compound command
						commands.add(curCommand);
					}
				}
			}
		}
			return commands.isEmpty() ? UnexecutableCommand.INSTANCE : (Command)commands;
	}

	/**
	 * <ul>
	 * <li>Calculates the initial conditions to align each nodes owned by {@link #rootTree}</li>
	 * <li>Call {@link #createConstrainedRequest(PrecisionRectangle, PrecisionRectangle, PrecisionRectangle, EditPartTree)} for each node to create the request</li>
	 * </ul>
	 *
	 * @param editparts
	 *            the editparts to align (the last editpart is the reference for the alignment)
	 * @param request
	 *            the initial request
	 */
	protected void createRequests() {

		// The reference EP is the last selected
		EditPart refEP = (EditPart)editparts.get(editparts.size() - 1);
		// Get absolute bounds of the Ref EP
		PrecisionRectangle boundsRef = LayoutUtils.getAbsolutePosition(refEP);

		// Get the depth of the Align Tree
		int depth = this.rootTree.getDepth();
		for(int i = 1; i <= depth; i++) {//we iterate by level in the rootTree
			List<EditPartTree> epTrees = rootTree.getChildLevel(i);
			for(EditPartTree ept : epTrees) {
				List<EditPart> nodeChild = helper.getPathRootEditPartList(ept);
				
				if (ept.isSelected()) {// the edit part is selected
					if (ept.getEditPart() != refEP && (!ept.existsUnselectedChild())) {
						

						// the reference used for the alignment
						PrecisionRectangle alignRef = new PrecisionRectangle(boundsRef);
					    PrecisionRectangle containerBounds = ((AlignmentTree)ept).getNewContainerBounds();

						// if container bounds is not the same as diagram then take the scrollbar width into account
						if(!containerBounds.equals(LayoutUtils.getAbsolutePosition(ept.getEditPart().getRoot()))) {
							helper.addScrollBar(containerBounds);
						}

						// Adjust Ref Bounds with scrollbar, labels and compartment height
						helper.adjustAlignRefBounds(alignRef, boundsRef, ept , refEP );

						// create the request
						createConstrainedRequest(alignRef, containerBounds, null, (AlignmentTree) ept);

						//The current editPart has not selected child
					} else if(ept.getEditPart() != refEP && (ept.existsUnselectedChild())) {

						

						PrecisionRectangle boundsLimit = helper.getUnselectedChildNewBounds(ept , refEP);
						PrecisionRectangle containerBounds = ((AlignmentTree) ept).getNewContainerBounds();

						if(!containerBounds.equals(LayoutUtils.getAbsolutePosition(ept.getEditPart().getRoot()))) {
							//we reduce the container bounds used to avoid scrollbar
							helper.addScrollBar(containerBounds);
						}

						createConstrainedRequest(boundsRef, containerBounds, boundsLimit, (AlignmentTree) ept);

				
					} else if(ept.getEditPart() == refEP && ToolUtilities.isAncestorContainedIn(nodeChild, refEP)) {

						if(((EditPartTree)ept.getParent()).isSelected()) {
						
							/*
							 * we need to create a command for the reference, only if
							 * its direct parent is selected.
							 * If the reference has ancestor in the selection and if this ancestor is not selected, itn's not necessary to move the
							 * reference, because it's the ancestor which must move.
							 */
							PrecisionRectangle containerBounds = ((AlignmentTree)ept).getNewContainerBounds();
							containerBounds.setPreciseX(containerBounds.x + LayoutUtils.scrollBarSize);
							containerBounds.setPreciseY(containerBounds.y + LayoutUtils.scrollBarSize);
							containerBounds.setPreciseWidth(containerBounds.width - 2 * LayoutUtils.scrollBarSize);
							containerBounds.setPreciseHeight(containerBounds.height - 2 * LayoutUtils.scrollBarSize);
							createConstrainedRequest(LayoutUtils.getAbsolutePosition(refEP), containerBounds, null, (AlignmentTree)ept);
						}
				
					} 
					
				} else {//the Edit Part is not selected! We need to maintain its location 

					PrecisionRectangle containerBounds = ((AlignmentTree)ept).getNewContainerBounds();
					containerBounds.setPreciseX(containerBounds.x + LayoutUtils.scrollBarSize);
					containerBounds.setPreciseY(containerBounds.y + LayoutUtils.scrollBarSize);
					containerBounds.setPreciseWidth(containerBounds.width - 2 * LayoutUtils.scrollBarSize);
					containerBounds.setPreciseHeight(containerBounds.height - 2 * LayoutUtils.scrollBarSize);

					createConstrainedRequest(LayoutUtils.getAbsolutePosition(ept.getEditPart()), containerBounds, null, (AlignmentTree)ept);

				}
			}
		}
		
	}


	/**
	 * <ul>
	 * <li>Completes the {@link EditPartTree} with the correct new position for the object</li>
	 * <li>Adds the created request to the {@link EditPartTree}</li>
	 * </ul>
	 *
	 * @param ref
	 *            the reference used for the alignment
	 * @param containerBounds
	 *            the size of the editpart container
	 * @param dontCross
	 *            the shift must be done, without the figure bounds are drawn in this rectangle
	 * @param tree
	 *            the tree for which we create the request
	 */

	protected void createConstrainedRequest(PrecisionRectangle ref, PrecisionRectangle containerBounds, PrecisionRectangle dontCross, AlignmentTree tree) {

		PrecisionRectangle editpartBounds = LayoutUtils.getAbsolutePosition(tree.getEditPart());
	PrecisionRectangle newPosition = new PrecisionRectangle(editpartBounds);	
	
		//Nominal Case
		if(dontCross == null && containerBounds.equals(LayoutUtils.getAbsolutePosition(tree.getEditPart().getRoot()))) {
	
			AlignmentRequest newRequest = new AlignmentRequest(RequestConstants.REQ_ALIGN);
			PrecisionRectangle newPrecisionRectangle = new PrecisionRectangle(ref);
			newRequest.setAlignment(this.alignment);
			newRequest.setAlignmentRectangle(newPrecisionRectangle);
			double pos = 0;
			switch(this.alignment) {
			case PositionConstants.LEFT:
				newPosition.setPreciseX(ref.x());
				break;
			case PositionConstants.CENTER:
				pos = ref.getTop().x() - (editpartBounds.preciseWidth() / 2.0);
				newPosition.setPreciseX(pos);
				break;
			case PositionConstants.RIGHT:
				pos = ref.getRight().x() - editpartBounds.preciseWidth();
				newPosition.setPreciseX(pos);
				break;
			case PositionConstants.TOP:
				pos = ref.getTop().y();
				newPosition.setPreciseY(pos);
				break;
			case PositionConstants.MIDDLE:
				pos = ref.getLeft().y() - (editpartBounds.preciseHeight() / 2.0);
				newPosition.setPreciseY(pos);
				break;
			case PositionConstants.BOTTOM:
				pos = ref.getBottom().y() - editpartBounds.preciseHeight();
				newPosition.setPreciseY(pos);
				break;
			default:
				break;
			}
			tree.setNewPosition(newPosition);
			tree.setRequest(newRequest);
			return;
		

		//Not nominal Cases
		} else {

			//variables used to write the request
			PrecisionPoint minPoint = new PrecisionPoint();
			PrecisionPoint maxPoint = new PrecisionPoint();
			
			// Container bigger than Editor
			if(dontCross == null && (!containerBounds.equals(LayoutUtils.getAbsolutePosition(tree.getEditPart().getRoot())))) {

				minPoint.setPreciseX(containerBounds.x);
				maxPoint.setPreciseX(containerBounds.getRight().x() - editpartBounds.preciseWidth());
				minPoint.setPreciseY(containerBounds.y);
				maxPoint.setPreciseY(containerBounds.getBottom().y() - editpartBounds.preciseHeight());

			// Bounds limits in case of unselected child
			} else if(dontCross != null) {

	
				minPoint.setPreciseX(dontCross.getRight().x() - editpartBounds.preciseWidth());
				maxPoint.setPreciseX(dontCross.x);
				minPoint.setPreciseY(dontCross.getBottom().y() - editpartBounds.preciseHeight());
				maxPoint.setPreciseY(dontCross.y);

			if(!containerBounds.equals(LayoutUtils.getAbsolutePosition(tree.getEditPart().getRoot()))) {
					//container's limits
					double xMinContainerLimit = containerBounds.x;
					double xMaxContainerLimit = containerBounds.getRight().x() - editpartBounds.preciseWidth();
					double yMinContainerLimit = containerBounds.y;
					double yMaxContainerLimit = containerBounds.getBottom().y() - editpartBounds.preciseHeight();


					minPoint.setPreciseX(Math.max(minPoint.x() , xMinContainerLimit));
					maxPoint.setPreciseX(Math.min(maxPoint.x() , xMaxContainerLimit));
					minPoint.setPreciseY(Math.max(minPoint.y() , yMinContainerLimit));
					maxPoint.setPreciseY(Math.min(maxPoint.y() , yMaxContainerLimit));
				}
			}


			/* rectangle used to do the alignment */
			PrecisionRectangle myAlignRectangle = new PrecisionRectangle(editpartBounds);

			/* the distance between the editpart in the new container position and its alignment reference */
			PrecisionPoint offset = getOffset(minPoint, maxPoint, ref, editpartBounds, tree);
			

			myAlignRectangle.setPreciseX(LayoutUtils.getAbsolutePosition(tree.getEditPart()).x + offset.x());
			myAlignRectangle.setPreciseY(LayoutUtils.getAbsolutePosition(tree.getEditPart()).y + offset.y());

			/* the point use to translate the editpart */
			Point translationPoint = new PrecisionPoint(0.0,0.0);

			/* the new request */
			AlignmentRequest newRequest = new AlignmentRequest(RequestConstants.REQ_ALIGN);
			newRequest.setAlignment(this.alignment);

			

			newRequest.setAlignmentRectangle(myAlignRectangle);
			newPosition = (PrecisionRectangle)tree.getAbsolutePositionInTheNewContainerPosition().translate(translationPoint);
			tree.setNewPosition(newPosition);
			tree.setRequest(newRequest);
			return;
		}

	}

	/**
	 * Get the offset distance between the editpart and the alignement position.
	 * 
	 * If the alignment Position is out of the calculated Bounds (min and max Points), 
	 * the offset is the distance between the EditPart and the nearest allowed bounds.
	 * 
	 * @param minPoint Minimum allowed position for the editpart
	 * @param maxPoint Maximum allowed position for the editpart
	 * @param ref Reference rectangle of the alignment request
	 * @param editpartBounds edit Part Bounds rectangle
	 * @param tree current Alignment Tree
	 * @return
	 */
	private PrecisionPoint getOffset(PrecisionPoint minPoint,
			PrecisionPoint maxPoint, PrecisionRectangle ref,
			PrecisionRectangle editpartBounds, AlignmentTree tree) {
		
		PrecisionPoint distance = new PrecisionPoint (0.0,0.0);
		/* the editpart's position in its container, after the shift of the container */
		PrecisionRectangle newTmpPosition = tree.getAbsolutePositionInTheNewContainerPosition();
		
		switch (alignment) {
		case PositionConstants.LEFT:

		
			if((ref.x >= minPoint.x()) && (ref.x <= maxPoint.x())) {
				distance.setPreciseX(ref.x - newTmpPosition.x);
			} else if(ref.x < minPoint.x()) {
				distance.setPreciseX(minPoint.x() - newTmpPosition.x);
			} else if(ref.x > maxPoint.x()) {
				distance.setPreciseX(maxPoint.x() - newTmpPosition.x);
			} 

			break;
			
		case PositionConstants.CENTER:// un alignement central  fait de cette facon : tous les packages alignes sur un element exterieur ne marche pas du tout!

		
			double minCenter = minPoint.x() + (editpartBounds.preciseWidth() / 2.0);
			double maxCenter = maxPoint.x() + (editpartBounds.preciseWidth() / 2.0);
			if((ref.getTop().x() >= minCenter) && (ref.getTop().x() <= maxCenter)) {
				distance.setPreciseX(ref.x + (ref.preciseWidth() / 2.0) - (newTmpPosition.x + (newTmpPosition.preciseWidth() / 2.0)));
			} else if(ref.getTop().x() < minCenter) {
				distance.setPreciseX(minCenter - (newTmpPosition.x + (newTmpPosition.preciseWidth() / 2.0)));
			} else if(ref.getTop().x() > maxCenter) {

				distance.setPreciseX(maxCenter - (newTmpPosition.x + ((newTmpPosition.preciseWidth()) / 2.0)));
			} 
			
			break;
			
		case PositionConstants.RIGHT:
	
			double minRight = minPoint.x() + editpartBounds.preciseWidth();
			double maxRight = maxPoint.x() + editpartBounds.preciseWidth();
			if((ref.getRight().x() >= minRight) && (ref.getRight().x() <= maxRight)) {
				distance.setPreciseX((ref.x + ref.preciseWidth()) - (newTmpPosition.x + newTmpPosition.preciseWidth()));
			} else if(ref.getRight().x() < minRight) {
				distance.setPreciseX( minRight - (newTmpPosition.x + newTmpPosition.preciseWidth()));
			} else if(ref.getRight().x() > maxRight) {
				distance.setPreciseX( maxRight - (newTmpPosition.x + newTmpPosition.preciseWidth()));
			} 

			break;
			
			
		case PositionConstants.BOTTOM:
			
			double minBottom = minPoint.y() + editpartBounds.preciseHeight();
			double maxBottom = maxPoint.y() + editpartBounds.preciseHeight();
			if(((ref.getBottom().y()) >= minBottom) && ((ref.getBottom().y()) <= maxBottom)) {
				distance.setPreciseY( (ref.y + ref.preciseHeight()) - (newTmpPosition.y + newTmpPosition.preciseHeight()));
			} else if((ref.getBottom().y()) < minBottom) {
				distance.setPreciseY(  minBottom - (newTmpPosition.y + newTmpPosition.preciseHeight()));
			} else if((ref.getBottom().y()) > maxBottom) {
				distance.setPreciseY(  maxBottom - (newTmpPosition.y + newTmpPosition.preciseHeight()));
			} 
			break;

		case PositionConstants.MIDDLE:
			
			double minMiddle = minPoint.y() + (editpartBounds.preciseHeight() / 2.0);
			double maxMiddle = maxPoint.y() + (editpartBounds.preciseHeight() / 2.0);
			if(((ref.y + (ref.preciseHeight() / 2.0)) >= minMiddle) && ((ref.y + (ref.preciseHeight() / 2.0)) <= maxMiddle)) {
				distance .setPreciseY(  (ref.y + (ref.preciseHeight() / 2.0) - (newTmpPosition.y + (newTmpPosition.preciseHeight() / 2.0))));
			} else if((ref.y + (ref.height / 2.0)) < minMiddle) {
				distance .setPreciseY(  minMiddle - (newTmpPosition.y + (newTmpPosition.preciseHeight() / 2.0)));
			} else if((ref.y + (ref.height / 2.0)) > maxMiddle) {
				distance .setPreciseY(  maxMiddle - (newTmpPosition.y + (newTmpPosition.preciseHeight() / 2.0)));
			} 
			break;
			
		case PositionConstants.TOP:
		
			if((ref.y >= minPoint.y()) && (ref.y <= maxPoint.y())) {
				distance .setPreciseY(  ref.y - newTmpPosition.y);
			} else if(ref.y < minPoint.y()) {
				distance .setPreciseY(  minPoint.y() - newTmpPosition.y);
			} else if(ref.y > maxPoint.y()) {
				distance.setPreciseY(  maxPoint.y() - newTmpPosition.y);
			} 
			break;
		default:
			break;
		}
		
		return distance;
	}

	/** Get current root Tree. */
	public AlignmentTree getRootTree() {
		return rootTree;
	}

	/** Get list of Edit Parts. */
	public List<EditPart> getEditparts() {
		return editparts;
	}
	/** Get the Alignment type. */
	public int getAlignment() {
		return alignment;
	}

	/** Get list of selected Elements */
	public List<IGraphicalEditPart> getSelectedElements() {
		return selectedElements;
	}

}
