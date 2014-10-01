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
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.PapyrusDiagramEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramEditPartsUtil;
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


	/** The alignment. */
	private int alignment;
	
	private EditPart refEditPart;
	
	private List<IGraphicalEditPart> selectedElements;


	/**
	 * Default Constructor
	 */
	public AlignActionHelper() {
		// Default constructor
	}

	
/** 
 * Constructor
 *
 * @param customAlignAction 
 * @param alignment
 * @param refEditPart
 *
 */
	public AlignActionHelper(int alignment, List<IGraphicalEditPart> selectedElements) {
		this.alignment = alignment;
		this.selectedElements = selectedElements;
		this.refEditPart = getRefEditPart();
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
	protected boolean isLinkSelection(List<IGraphicalEditPart> editparts) {
		boolean isEdgeOnly = true;
		// if no selection
		if(editparts.size() == 0) {
			isEdgeOnly = false;
		// at least one object is selected
		} else {

			for(Object object : editparts) {
				if(!(object instanceof AbstractConnectionEditPart)) {
					isEdgeOnly= false;
				}
			}
		}
		return isEdgeOnly;
	}


	/**
	 * Define if Alignment is allowed.
	 * @param selectedElements 
	 * @return
	 */
	protected boolean isAlignAllowed(List<IGraphicalEditPart> selectedElements) {

		boolean alignAllowable = true;
		// Alignment is not allowed if selection is a mixed with edges and nodes (or labels)
		alignAllowable = alignAllowable && !isMixedSelection(selectedElements);
		alignAllowable = alignAllowable && (selectedElements.size() >= 2);
		
		return alignAllowable;
	}

	/**
	 * Define if the New calculated position is allowed for the Alignment
	 * 
	 * @param currentEP current Edit Part to be aligned
	 * @param newPosition theoretical position after alignment
	 * @return true if the new Position fits to the alignment rules
	 */
	protected boolean isPositionAllowed(EditPart currentEP, PrecisionRectangle newPosition) {

		boolean isAllow = true;

		isAllow = isAllow && isContained(newPosition, currentEP);
		isAllow = isAllow && !isRefChild(refEditPart, currentEP);
		isAllow = isAllow && isPortPositionAllowed(newPosition, currentEP);
		isAllow = isAllow && !isDependent(refEditPart, currentEP);
		
		
		return isAllow;

	}

	/**
	 * Define if the EditPart position depends on the other EditPart position
	 * @param ref
	 * @param currentEP
	 * @return
	 */
	private boolean isDependent(EditPart ref, EditPart currentEP) {
		boolean isDependent = false;
		// If The reference is a Connection Label   
		if (ref instanceof LabelEditPart) {
			if (ref.getParent() instanceof AbstractConnectionEditPart){
				// Alignment is not allowed if it should moves at the same time as the connector
				// That means if the Extremities of the Edge have to be aligned.
				EditPart source = ((ConnectionEditPart)ref.getParent()).getSource();
				EditPart target = ((ConnectionEditPart)ref.getParent()).getTarget();
				//If extremities EditPart cannot be a child of the Current Edit part
				if (currentEP.equals(source) || currentEP.equals(target) ) {
					isDependent = true ;
				} else if (isRefChild(source, currentEP) || isRefChild(target, currentEP)) {
					isDependent = true ;
				}
			}
		}
		return isDependent;
	}


	/**
	 * Alignment Rule: In case of a Border Item, the Alignment is allowed only if the Port Position stay on his Parent Bounds.
	 * @param newPosition
	 * @param currentEP
	 * @return
	 */
	private boolean isPortPositionAllowed(PrecisionRectangle newPosition,
			EditPart currentEP) {
		boolean isPortAllow ;
	
		if (currentEP instanceof AbstractBorderItemEditPart){

			
			PrecisionPoint portCenter = (PrecisionPoint) newPosition.getCenter();
			PrecisionRectangle parentBounds = LayoutUtils.getAbsolutePosition(currentEP.getParent());

			boolean isOnVerticalBounds = (portCenter.preciseX() == parentBounds.preciseX()) || (portCenter.preciseX() == parentBounds.preciseX()+ parentBounds.preciseWidth() );
			boolean isOnHorizontalBounds = (portCenter.preciseY() == parentBounds.preciseY()) || (portCenter.preciseY() == parentBounds.preciseY()+ parentBounds.preciseHeight() );
			boolean isBetweenHorizontalBounds = (portCenter.preciseY() >= parentBounds.preciseY()) && (portCenter.preciseY() <= parentBounds.preciseY()+parentBounds.preciseHeight());
			boolean isBetweenVerticalBounds = (portCenter.preciseX() >= parentBounds.preciseX()) && (portCenter.preciseX() <= parentBounds.preciseX()+parentBounds.preciseWidth());

			if ((isOnHorizontalBounds) && (isBetweenVerticalBounds)) {
				isPortAllow = true;
			} else if ((isOnVerticalBounds) && (isBetweenHorizontalBounds)) {
				isPortAllow = true;
			} else {
				isPortAllow = false;
			}

		} else {
			
			isPortAllow = true;
		}

		return isPortAllow;
	}


	/**
	 * Alignment Rule: the EditPart should be still contained in its parent after the alignment
	 * @param newPosition
	 * @param currentEP
	 * @return
	 */
	protected boolean isContained(PrecisionRectangle newPosition, EditPart currentEP) {

		boolean isContained = true;

		EditPart container = DiagramEditPartsUtil.getContainerEditPart((GraphicalEditPart) currentEP);
		
		//in case the container is the Diagram Editor itself, the rule is not applicable (Bug 445666)
		if (!(container instanceof PapyrusDiagramEditPart) ){
			
		PrecisionRectangle containerBounds = LayoutUtils.getAbsolutePosition(container);
		//reduce the reference of 1 pixel in order to avoid the Scrollbar apparition when trying to Align on the parent.
		containerBounds.expand(new Insets(-1));
		isContained = containerBounds.contains(newPosition.getBottomLeft()) && containerBounds.contains(newPosition.getTopRight())  ;

		}
		
		return isContained;

	}

	/**
	 * Alignment Rule : The parent cannot be aligned on its children
	 * @param ref
	 * @param ep
	 * @return
	 */
	protected boolean isRefChild(EditPart ref, EditPart ep) {

		boolean refIsChild = false;
		List<?> children = ep.getChildren();
		Iterator<?> iter = children.iterator();
		while(iter.hasNext() && !refIsChild ){

			Object child =  iter.next();
			if (ref.equals(child)){
				refIsChild = true;

			} else if (child instanceof EditPart){
				refIsChild = isRefChild(ref, (EditPart) child);
			} 

		}
		return refIsChild;
	}

	/**
	 * Get the reference Edit part for the alignment.
	 * @return reference edit part for the alignment
	 */
	protected EditPart getRefEditPart() {
		Iterator<IGraphicalEditPart> iter = selectedElements.iterator();
		EditPart ref = null;

		while (iter.hasNext() && ref == null){
			EditPart ep = iter.next();
			if (ep.getSelected() == EditPart.SELECTED_PRIMARY){
				ref = ep;
			}
		}
		return ref;
	}
	
	/**
	 * 
	 * @param currentEPBounds
	 * @param refBounds
	 * @return
	 */
	protected PrecisionRectangle getNewPosition(
			PrecisionRectangle currentEPBounds, PrecisionRectangle refBounds) {

		// Initialise new Position with the current Position
		PrecisionRectangle newPosition = new PrecisionRectangle(currentEPBounds);
		PrecisionPoint distance = new PrecisionPoint (0.0,0.0);
		switch(this.alignment) {
		case PositionConstants.LEFT:
			newPosition.setPreciseX(refBounds.preciseX());
			break;
		case PositionConstants.CENTER:
			distance.setPreciseX(refBounds.getCenter().preciseX() - currentEPBounds.getCenter().preciseX());
			newPosition.translate(distance);
			break;
		case PositionConstants.RIGHT:
			distance.setPreciseX(refBounds.getTopRight().preciseX() - currentEPBounds.getTopRight().preciseX());
			newPosition.translate(distance);
			break;
		case PositionConstants.TOP:
			newPosition.setPreciseY(refBounds.preciseY());
			break;
		case PositionConstants.MIDDLE:
			distance.setPreciseY(refBounds.getCenter().preciseY() - currentEPBounds.getCenter().preciseY());
			newPosition.translate(distance);
			break;
		case PositionConstants.BOTTOM:
			distance.setPreciseY( refBounds.getBottomLeft().preciseY() - currentEPBounds.getBottomLeft().preciseY());
			newPosition.translate(distance);
			break;
		default:
			break;
		}

		return newPosition;
	}

}