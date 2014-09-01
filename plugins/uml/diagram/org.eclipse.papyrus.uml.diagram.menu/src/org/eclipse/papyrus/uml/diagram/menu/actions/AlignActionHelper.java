package org.eclipse.papyrus.uml.diagram.menu.actions;
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
 *  Céline Janssens (ALL4TEC)  celine.janssens@all4tec.net 	- Code refractor and documentation
 *
 *****************************************************************************/
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.tools.ToolUtilities;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.papyrus.uml.diagram.common.layout.EditPartTree;
import org.eclipse.papyrus.uml.diagram.common.layout.LayoutUtils;


/**
 * Helper for the CustomAlignAction class.
 * It contains all the technical methods required for the Alignment.
 * Basically, it makes the CustomAlignAction class lighter.
 * 
 * @author Céline JANSSENS
 *
 */
public class AlignActionHelper {

	//private CustomAlignAction action;
	private CustomAlignAction action;

	/**
	 * Default Constructor
	 */
	public AlignActionHelper() {
		// Default constructor
	}

	/**
	 * Constructor
	 * @param customAlignAction
	 */
	public AlignActionHelper(CustomAlignAction customAlignAction){
		this.action = customAlignAction;

	}
	
	

	/**
	 * Create the new bounds of the unselected child of an EditPartTree compare to the RefEP.
	 * 
	 * @param ept EditPartTree where there is an Unselected Child
	 * @param refEP Reference EditPart
	 * @return Bounds Rectangle of the unselected Child
	 */
	protected PrecisionRectangle getUnselectedChildNewBounds(EditPartTree ept, EditPart refEP) {
		PrecisionRectangle boundsLimit = null;
		List<EditPart> parent = new ArrayList<EditPart>(1);
		parent.add(ept.getEditPart());
		int distance = ept.getDistanceWithTheFirstUnselectedChild();
		EditPartTree unselectedTree = ept.getFirstUnselectedChild();

		//we don't need to correct unselected element location when the reference is not inside them
		if(ToolUtilities.isAncestorContainedIn(parent, refEP)) {
			boundsLimit = new PrecisionRectangle(LayoutUtils.getAbsolutePosition(unselectedTree.getEditPart()));
			//we increase the size of the child, to avoid scrollbar in its parent
			boundsLimit.setPreciseX(boundsLimit.x - (distance * LayoutUtils.scrollBarSize));
			boundsLimit.setPreciseY(boundsLimit.y - (distance * LayoutUtils.scrollBarSize));
			boundsLimit.setPreciseWidth(boundsLimit.width + (2 * distance * LayoutUtils.scrollBarSize));
			boundsLimit.setPreciseHeight(boundsLimit.height + (2 * distance * LayoutUtils.scrollBarSize));
			if(action.getAlignment() == PositionConstants.TOP) {
				double dist = getLabelHeightToRemove(ept);
				boundsLimit.setPreciseY(boundsLimit.y() - dist);
			}
		}
		return boundsLimit;
	}


	/**
	 * Returns the height of the label for the current editpart contained in {@code ept}, more the height of the children's label
	 * 
	 * @param ept
	 *        The {@link EditPartTree} containing the {@link EditPart} used to calculate height
	 * @return
	 *         The height of the label for the current editpart, more the height of the children's label
	 * 
	 */
	protected double getLabelHeightToRemove(EditPartTree ept) {
		double dist = 0;
		List<?> children = ept.getEditPart().getChildren();
		//we search the correct compartment
		for(int iter = 0; iter < children.size(); iter++) {
			if(children.get(iter) instanceof CompartmentEditPart) {
				CompartmentEditPart child = (CompartmentEditPart)children.get(iter);
				EditPolicy policy = child.getEditPolicy(EditPolicy.LAYOUT_ROLE);
				if(policy != null) {
					PrecisionRectangle cptSize = LayoutUtils.getAbsolutePosition(child);
					dist += cptSize.y() - LayoutUtils.getAbsolutePosition(ept.getEditPart()).y();
					break;
				}
			}
		}
		Enumeration<?> eptChildren = ept.children();
		double max = 0;
		while(eptChildren.hasMoreElements()) {
			EditPartTree currentElement = (EditPartTree)eptChildren.nextElement();
			if(currentElement.isSelected() && (!currentElement.isReference())) {
				double tmp = getLabelHeightToRemove(currentElement);
				max = (tmp > max) ? tmp : max;
			}
		}
		dist += max;
		return dist;
	}


	/**
	 * Tests the selection (nodes and edges). If Selection contains nodes (or Labels) and edges the method returns true
	 * If it contains only nodes and labels, or only Edges 
	 * @param editparts
	 * 
	 * @return
	 *         <ul>
	 *         <li> {@code true}</li> if the selection contains links and nodes
	 *         <li> {@code false}</li> if not
	 *         </ul>
	 * 
	 */
	protected boolean isMixedSelection(List<?> editparts) {
		boolean node = false;
		boolean edge = false;
		boolean isMixed = ((node) && (edge));

		Iterator<?> iter = editparts.iterator();
		while(iter.hasNext() && !isMixed){
			if(iter.next() instanceof AbstractConnectionEditPart) {
				edge = true;
			} else {
				node = true;
			}
			isMixed = ((node) && (edge));
		}

		return isMixed;


	}

	/**
	 * Create a List of editPart from an EditPartTree from the root element to the passed element.
	 * @param ept The EditPartTree we want the Path from the root
	 * @return the List of EditPart with the Path from the root to the EditPartTree
	 */
	protected List<EditPart> getPathRootEditPartList(EditPartTree ept) {
		List<EditPart> nodeChild  = new ArrayList<EditPart>();

		//used to calculate the shift between each element!
		Enumeration<?> vectorisedChildren = ((EditPartTree)ept.getPath()[1]).breadthFirstEnumeration();
		while(vectorisedChildren.hasMoreElements()) {
			nodeChild.add(((EditPartTree)vectorisedChildren.nextElement()).getEditPart());
		}
		return nodeChild;
	}

	/**
	 * Add scrollbar width to the Rectangle bounds to avoid to show them
	 * @param containerBounds
	 */
	protected void addScrollBar(PrecisionRectangle containerBounds) {
		containerBounds.setPreciseX(containerBounds.x + LayoutUtils.scrollBarSize);
		containerBounds.setPreciseY(containerBounds.y + LayoutUtils.scrollBarSize);
		containerBounds.setPreciseWidth(containerBounds.width - 2 * LayoutUtils.scrollBarSize);
		containerBounds.setPreciseHeight(containerBounds.height - 2 * LayoutUtils.scrollBarSize);

	}

	/**
	 * Calculate the shift (level) between the EditPartTree and the Reference EP.
	 * 
	 * @param ept EditPartTree
	 * @param refEP Reference EditPart
	 * @return shift (number of level) between ept and refEP
	 */
	protected int getShift(EditPartTree ept, EditPart refEP) {
		/*
		 * calculus of the shift
		 * 
		 * the shift is the first selected element when the reference is not a child of the editpart
		 * the shift is the number of levels between the current editpart and the reference if this reference is a child
		 */
		int level;
		if(ToolUtilities.isAncestorContainedIn(getPathRootEditPartList(ept), refEP)) {
			level = action.getRootTree().getTree(refEP).getLevel();
			int currentLevel = ept.getLevel();
			level = level - currentLevel + 1;

		} else{
			level = ept.getLevelForFirstSelectedElement();
		}
		return level;
	}



	/**
	 * Tests if all the selected elements are instance of {@linkplain AbstractConnectionEditPart}
	 * 
	 * @param editparts
	 *        the editparts list to test
	 * @return
	 *         <ul>
	 *         <li> {@code true}</li> if all the editparts represents a link
	 *         <li>{@code false}</li> if not
	 *         </ul>
	 */
	protected boolean isLinkSelection(List<?> editparts) {
		if(editparts.size() == 0) {
			return false;
		}
		for(Object object : editparts) {
			if(!(object instanceof AbstractConnectionEditPart)) {
				return false;
			}
		}
		return true;
	}


	/**
	 * Define if Alignment is allowed.
	 * @param editparts 
	 * @return
	 */
	protected boolean isAlignAllowed(List<EditPart> editparts) {

		boolean alignAllowable = true;
		// Alignment is not allowed if selection is a mixed with edges and nodes (or labels)
		alignAllowable = alignAllowable && !isMixedSelection(editparts);

		return alignAllowable;
	}

	/**
	 * Return the list of Edit Parts based on the selected Elements.
	 * @return
	 * List of EditParts
	 */
	protected List<EditPart> getEditPartList() {
		List<EditPart> editparts = new ArrayList<EditPart>();
		for(IGraphicalEditPart current : action.getSelectedElements()) {
			editparts.add(current);
		}
		return editparts;
	}


	/**
	 * Adjust AlignBounds to take scrollBar size into account in order to avoid to show them.
	 * 
	 * @param alignRef The reference bounds to modify 
	 * @param boundsRef Absolute bounds of reference EP
	 * @param ept EditPartTree 
	 * @param refEP Reference EditPart
	 */
	protected void adjustAlignRefBounds(PrecisionRectangle alignRef,
			PrecisionRectangle boundsRef, EditPartTree ept, EditPart refEP) {

		// AlignRef Bounds should not be adjust in case of LabelEdit Part 
		if( !(ept.getEditPart() instanceof LabelEditPart) ){

			int level = getShift(ept, refEP);

			// depends on the alignment modify the reference rectangle
			switch(action.getAlignment()) {
			case PositionConstants.LEFT:
				alignRef.setPreciseX(boundsRef.x - ((level - 1) * LayoutUtils.scrollBarSize));
				alignRef.setPreciseWidth(boundsRef.width + 2 * ((level - 1) * LayoutUtils.scrollBarSize));
				break;
			case PositionConstants.CENTER:
				break;
			case PositionConstants.RIGHT:

				alignRef.setPreciseX(boundsRef.x + ((-level + 1) * LayoutUtils.scrollBarSize));
				alignRef.setPreciseWidth(boundsRef.preciseWidth() - 2 * ((-level + 1) * LayoutUtils.scrollBarSize));
				break;

			case PositionConstants.BOTTOM:
				alignRef.setPreciseY(boundsRef.y + ((-level + 1) * LayoutUtils.scrollBarSize));
				alignRef.setPreciseHeight(boundsRef.preciseHeight() - 2 * ((-level + 1) * LayoutUtils.scrollBarSize));
				break;
			case PositionConstants.MIDDLE:
				// get the size of the highest child
				double heightMax = 0;
				Enumeration<?> children = ept.children();
				while(children.hasMoreElements()) {
					EditPartTree currentChild = (EditPartTree)children.nextElement();
					double height = LayoutUtils.getAbsolutePosition(currentChild.getEditPart()).preciseHeight();
					heightMax = Math.max(height, heightMax);
				}


				// get the size of the compartment for this figure! 
				List<?> childrenEP = ept.getEditPart().getChildren();
				double compartmentHeight = 0;
				Iterator<?> iter = childrenEP.iterator();
				while(iter.hasNext() && compartmentHeight == 0){
					if(iter.next() instanceof CompartmentEditPart) {
						CompartmentEditPart child = (CompartmentEditPart)iter.next();
						EditPolicy policy = child.getEditPolicy(EditPolicy.LAYOUT_ROLE);
						if(policy != null) {
							compartmentHeight = LayoutUtils.getAbsolutePosition(child).preciseHeight();
						}
					}
				}

				double heightToRemove = getLabelHeightToRemove(ept);
				//test to know if the initial alignment is possible without seeing the scrollbar
				if(compartmentHeight < (heightMax + LayoutUtils.scrollBarSize + heightToRemove)) {
					alignRef.setPreciseY(alignRef.y - heightToRemove);
					alignRef.setPreciseHeight(alignRef.preciseHeight() + heightToRemove);
				}

				break;
			case PositionConstants.TOP: //here we can have a problem with the label for the element inheriting from Package
				alignRef.setPreciseY(boundsRef.y - ((level - 1) * LayoutUtils.scrollBarSize));
				alignRef.setPreciseHeight(boundsRef.preciseHeight() + 2 * ((level - 1) * LayoutUtils.scrollBarSize));

				// we don't want that the scrollbar appears, with the top alignment, we need to consider the label of the container element
				if(ept.children().hasMoreElements()) {
					double dist = getLabelHeightToRemove(ept);
					alignRef.setPreciseY(alignRef.y() - dist);
				}
				break;
			default:
				break;
			}
		}

	}


}
