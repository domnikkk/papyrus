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
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *  Mickaël ADAM (ALL4TEC) mickael.adam@all4tec.net - Text alignment implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.locator;



import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.GEFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.IPapyrusEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.locator.IPapyrusBorderItemLocator;

/**
 * This class is used to constrain the position of ExternalNodeLabel. The
 * locator let the external node label be freely located by used anywhere around
 * the parent figure.
 */
public class ExternalLabelPositionLocator implements IPapyrusBorderItemLocator {

	/** the figure around which this label appears. */
	protected IFigure parentFigure = null;

	/** the position constraint. */
	protected Rectangle constraint = new Rectangle(0, 0, 0, 0);

	/** The position. */
	int position = PositionConstants.EAST;

	/** The offset. */
	private Dimension offset = new Dimension();

	/** The constrained. */
	private boolean isConstrained = false;

	/** The text alignment. */
	private int textAlignment;

	/** The view. */
	private View view;

	/** The Edit Part. */
	private EditPart editPart;

	/**
	 * @param editpart
	 *            the edit part to set
	 */
	@Override
	public void setEditpart(EditPart editPart) {
		this.editPart = editPart;
	}

	private boolean cachedIsConstrained = false;

	private Point margin;

	/**
	 * Sets the view.
	 *
	 * @param view
	 *            the view to set
	 */
	@Override
	public void setView(View view) {
		this.view = view;
	}

	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	@Override
	public int getPosition() {
		return position;
	}

	/**
	 * Sets the position.
	 *
	 * @param position
	 *            the position to set
	 */
	@Override
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * Gets the offset.
	 *
	 * @return the offset
	 */
	@Override
	public Dimension getOffset() {
		return offset;
	}

	/**
	 * Sets the offset.
	 *
	 * @param offset
	 *            the offset to set
	 */
	@Override
	public void setOffset(Dimension offset) {
		this.offset = offset;
	}

	/**
	 * Checks if is constrained.
	 *
	 * @return the constrained
	 */
	@Override
	public boolean isConstrained() {
		return isConstrained;
	}

	/**
	 * Sets the constrained.
	 *
	 * @param constrained
	 *            the constrained to set
	 */
	@Override
	public void setConstrained(boolean constrained) {
		this.isConstrained = constrained;
	}

	/**
	 * get the location constraint.
	 *
	 * @return the constraint
	 */
	public Rectangle getConstraint() {
		return constraint;
	}

	/**
	 * Constructor *.
	 *
	 * @param parentFigure
	 *            the parent figure
	 */
	public ExternalLabelPositionLocator(IFigure parentFigure) {
		this.parentFigure = parentFigure;
	}

	/**
	 * Gets the valid location.
	 *
	 * @param proposedLocation
	 *            the proposed location
	 * @param borderItem
	 *            the border item
	 * @return the valid location
	 * @see org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator#getValidLocation(org.eclipse.draw2d.geometry.Rectangle, org.eclipse.draw2d.IFigure)
	 */
	@Override
	public Rectangle getValidLocation(Rectangle proposedLocation, IFigure borderItem) {
		return new Rectangle(proposedLocation);
	}

	/**
	 * Sets the constraint.
	 *
	 * @param constraint
	 *            the new constraint
	 * @see org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator#setConstraint(org.eclipse.draw2d.geometry.Rectangle)
	 */
	@Override
	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
	}

	/**
	 * Gets the current side of parent.
	 *
	 * @return current side of parent
	 * @see org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator#getCurrentSideOfParent()
	 */
	@Override
	public int getCurrentSideOfParent() {
		return position;
	}

	/**
	 * Relocate.
	 *
	 * @param target
	 *            the target
	 * @see org.eclipse.draw2d.Locator#relocate(org.eclipse.draw2d.IFigure)
	 */
	@Override
	public void relocate(IFigure target) {
		Rectangle proposedBounds = constraint.getCopy();

		proposedBounds.setLocation(constraint.getLocation().translate(parentFigure.getBounds().getTopLeft()));
		proposedBounds.setSize(target.getPreferredSize());

		if (isConstrained) { // TO_FIX if there is more than one label
			Point newconstraint;
			Point newOffset;
			// Set the translation when alignment is auto
			switch (getPositionOnParent()) {
			case PositionConstants.WEST:
				// alignRight:
				newconstraint = new Point(-proposedBounds.width - offset.width, offset.height);
				newOffset = new Point(newconstraint.x + proposedBounds.width, newconstraint.y);
				break;
			case PositionConstants.EAST:
				// alignLeft
				newconstraint = new Point(parentFigure.getBounds().width + offset.width, offset.height);
				newOffset = new Point(newconstraint.x, newconstraint.y);
				break;
			case PositionConstants.NORTH:
				// alignLeft center to the north
				newconstraint = new Point(-proposedBounds.width / 2 + offset.width, -parentFigure.getBounds().height - offset.height);
				newOffset = new Point(newconstraint.x, newconstraint.y);
				break;
			case PositionConstants.SOUTH:
				// alignLeft center to the south
				newconstraint = new Point(-proposedBounds.width / 2 + offset.width, parentFigure.getBounds().height + offset.height);
				newOffset = new Point(newconstraint.x, newconstraint.y);
				break;
			default:
				// the default is like the EAST
				newconstraint = new Point(proposedBounds.width + offset.width, offset.height);
				newOffset = new Point(newconstraint.x, newconstraint.y);
				break;
			}
			proposedBounds.setLocation(newconstraint.translate(parentFigure.getBounds().getTopLeft()));

			// Save new location only on change
			final Point offset = newOffset;
			ChangeBoundsRequest req = new ChangeBoundsRequest(RequestConstants.REQ_MOVE);
			req.setEditParts(editPart);
			req.setLocation(offset);
			Command command = editPart.getCommand(req);
			if (command != null && command.canExecute()) {
				TransactionUtil.getEditingDomain(view).getCommandStack().execute(GEFtoEMFCommandWrapper.wrap(command));
			}

		} else {
			int x;
			// Set Location
			switch (textAlignment) {
			case PositionConstants.LEFT:
				x = 0;
				break;
			case PositionConstants.RIGHT:
				x = -proposedBounds.width;
				break;
			case PositionConstants.CENTER:
				x = -proposedBounds.width / 2;
				break;
			default:
				x = 0;
				break;
			}
			proposedBounds.translate(x, 0);
		}

		target.setBounds(proposedBounds);
		cachedIsConstrained = isConstrained;
	}

	/**
	 * Gets the position on parent.
	 *
	 * @return the position on parent
	 */
	public int getPositionOnParent() {
		Rectangle portBounds = null;
		Rectangle parentBounds = null;
		int position = this.position;

		// Get the port figure
		if (editPart != null) {
			EditPart parent = editPart.getParent();
			if (parent instanceof IPapyrusEditPart) {
				IFigure portPrimaryShape = ((IPapyrusEditPart) parent).getPrimaryShape();
				portBounds = portPrimaryShape.getBounds();

				// Get the port's parent figure
				// if it's a papyrus edit part and the figure is paint(width !=0)
				if (parent.getParent() instanceof IPapyrusEditPart && portBounds.width != 0) {
					IFigure parentPrimaryShape = ((IPapyrusEditPart) parent.getParent()).getPrimaryShape();
					parentBounds = parentPrimaryShape.getBounds();

					if (portBounds.x + portBounds.width / 2 == parentBounds.x) {
						// West position
						position = PositionConstants.WEST;
					} else if (portBounds.x + portBounds.width / 2 == parentBounds.getBottomRight().x) {
						// East Position
						position = PositionConstants.EAST;
					} else if (portBounds.y + portBounds.height / 2 == parentBounds.y) {
						position = PositionConstants.NORTH;
					} else if (portBounds.y + portBounds.height / 2 == parentBounds.getBottomRight().y) {
						position = PositionConstants.SOUTH;
					}
				}
			}
		}

		return position;
	}


	/**
	 * Gets the text alignment.
	 *
	 * @return the textAlignment
	 */
	public int getTextAlignment() {
		return textAlignment;
	}

	/**
	 * Sets the text alignment.
	 *
	 * @param textAlignment
	 *            the textAlignment to set
	 */
	@Override
	public void setTextAlignment(int textAlignment) {
		this.textAlignment = textAlignment;
	}

	/**
	 * Checks if is initialize.
	 *
	 * @return true, if is initialize
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.locator.IPapyrusBorderItemLocator#isInitialize()
	 */
	@Override
	public boolean isInitialize() {
		return view != null;
	}

	/**
	 * Sets the margin.
	 *
	 * @param margin
	 *            the margin to set
	 */
	@Override
	public void setMargin(Point margin) {
		this.margin = margin;
	}
}
