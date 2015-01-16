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



import java.util.List;

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
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.GEFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.IPapyrusEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.PapyrusLabelEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.locator.IPapyrusBorderItemLocator;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.NamedStyleProperties;
import org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart;

/**
 * This class is used to constrain the position of ExternalNodeLabel. The
 * locator let the external node label be freely located by used anywhere around
 * the parent figure.
 */
public class ExternalLabelPositionLocator implements IPapyrusBorderItemLocator {

	/** the position constraint. */
	protected Rectangle constraint = new Rectangle(0, 0, 0, 0);

	/** The Edit Part. */
	private EditPart editPart;

	/** The constrained. */
	private boolean isConstrained = false;

	/** The margin. */
	private Point margin = new Point();

	/** The offset. */
	private Dimension offset = new Dimension();

	/** the figure around which this label appears. */
	protected IFigure parentFigure = null;

	/** The position. */
	int position = PositionConstants.EAST;

	/** The text alignment. */
	private int textAlignment;

	/** The view. */
	private View view;

	private int numLabel;

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
	 * get the location constraint.
	 *
	 * @return the constraint
	 */
	public Rectangle getConstraint() {
		return constraint;
	}

	/**
	 * Gets the current side of parent.
	 *
	 * @return current side of parent
	 * @see org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator#getCurrentSideOfParent()
	 */
	@Override
	public int getCurrentSideOfParent() {
		return getPosition();
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
	 * Gets the position.
	 *
	 * @return the position
	 */
	@Override
	public int getPosition() {
		// Get the forced value(CSS, Notation)
		String ForcedPosition = NotationUtils.getStringValue(view, NamedStyleProperties.POSITION, NamedStyleProperties.PositionAsString.AUTO);
		// if there is a forced position
		if (!NamedStyleProperties.PositionAsString.AUTO.equals(ForcedPosition)) {
			if (NamedStyleProperties.PositionAsString.EAST.equals(ForcedPosition)) {
				position = PositionConstants.EAST;
			}
			if (NamedStyleProperties.PositionAsString.WEST.equals(ForcedPosition)) {
				position = PositionConstants.WEST;
			}
			if (NamedStyleProperties.PositionAsString.NORTH.equals(ForcedPosition)) {
				position = PositionConstants.NORTH;
			}
			if (NamedStyleProperties.PositionAsString.SOUTH.equals(ForcedPosition)) {
				position = PositionConstants.SOUTH;
			}
		} else {
			// Return the position on parent
			position = getPositionOnParent();
		}

		return position;
	}

	/**
	 * Gets the position on parent.
	 *
	 * @return the position on parent
	 */
	public int getPositionOnParent() {
		Rectangle bounds = null;
		Rectangle parentBounds = null;
		int position = this.position;

		// Get the port figure
		if (editPart != null) {
			EditPart parent = editPart.getParent();
			if (parent instanceof IPapyrusEditPart) {
				IFigure portPrimaryShape = ((IPapyrusEditPart) parent).getPrimaryShape();
				bounds = portPrimaryShape.getBounds();

				// Get the port's parent figure
				// if it's a papyrus edit part and the figure is paint(width !=0)
				if (parent.getParent() instanceof IPapyrusEditPart && bounds.width != 0) {
					IFigure parentPrimaryShape = ((IPapyrusEditPart) parent.getParent()).getPrimaryShape();
					parentBounds = parentPrimaryShape.getBounds();

					if (bounds.x + bounds.width / 2 == parentBounds.x) {
						// West position
						position = PositionConstants.WEST;
					} else if (bounds.x + bounds.width / 2 == parentBounds.getBottomRight().x) {
						// East Position
						position = PositionConstants.EAST;
					} else if (bounds.y + bounds.height / 2 == parentBounds.y) {
						// North Position
						position = PositionConstants.NORTH;
					} else if (bounds.y + bounds.height / 2 == parentBounds.getBottomRight().y) {
						// South Position
						position = PositionConstants.SOUTH;
					} else

					// Take into account of rounded corner
					if (parent.getParent() instanceof RoundedCompartmentEditPart && bounds.width != 0) {
						// West position
						if (bounds.x + bounds.width / 2 < parentBounds.x + parentBounds.width / 4) {
							position = PositionConstants.WEST;
							// East Position
						} else if (bounds.x + bounds.width / 2 > parentBounds.x + parentBounds.width / 4 * 3) {
							position = PositionConstants.EAST;
							// North Position
						} else if (bounds.y + bounds.height / 2 < parentBounds.y + parentBounds.height / 2) {
							position = PositionConstants.NORTH;
							// South Position
						} else if (bounds.y + bounds.height / 2 > parentBounds.y + parentBounds.height / 2) {
							position = PositionConstants.SOUTH;
						}
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
	 * Checks if is constrained.
	 *
	 * @return the constrained
	 */
	@Override
	public boolean isConstrained() {
		return isConstrained;
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

		if (isConstrained) {
			// the new constraint to position
			Point newConstraint;
			// The new Offset to be saved one the resource
			Point newOffset;
			// get the number of labels and set the number of this label
			int numberOfLabel = getNumberOfVisibleLabels();
			// Set the translation when alignment is auto
			switch (getPosition()) {
			case PositionConstants.WEST:
				// alignRight:
				newConstraint = new Point(-proposedBounds.width - offset.width, offset.height);
				newOffset = new Point(newConstraint.x + proposedBounds.width, newConstraint.y);
				break;
			case PositionConstants.EAST:
				// alignLeft
				newConstraint = new Point(parentFigure.getBounds().width + offset.width, offset.height);
				newOffset = new Point(newConstraint.x, newConstraint.y);
				break;
			case PositionConstants.NORTH:
				// alignLeft center to the north
				newConstraint = new Point(-proposedBounds.width / 2 + parentFigure.getBounds().width / 2 + offset.width, -parentFigure.getBounds().height - offset.height);
				newOffset = new Point(newConstraint.x, newConstraint.y);
				break;
			case PositionConstants.SOUTH:
				// alignLeft center to the south
				newConstraint = new Point(-proposedBounds.width / 2 + offset.width + parentFigure.getBounds().width / 2, parentFigure.getBounds().height + offset.height);
				newOffset = new Point(newConstraint.x, newConstraint.y);
				break;
			default:
				// the default is like the EAST
				newConstraint = new Point(proposedBounds.width + offset.width, offset.height);
				newOffset = new Point(newConstraint.x, newConstraint.y);
				break;
			}

			proposedBounds.setLocation(newConstraint.translate(parentFigure.getBounds().getTopLeft()));

			// translate the label in case of multiple label
			switch (getPosition()) {
			case PositionConstants.WEST:
				proposedBounds.translate(0, (numLabel - 1) * proposedBounds.height + margin.y - (numberOfLabel - 1) * (proposedBounds.height + margin.y) / 2);
				break;
			case PositionConstants.EAST:
				proposedBounds.translate(0, (numLabel - 1) * proposedBounds.height + margin.y - (numberOfLabel - 1) * (proposedBounds.height + margin.y) / 2);
				break;
			case PositionConstants.NORTH:
				proposedBounds.translate(0, (numLabel - 1) * proposedBounds.height + margin.y - (numberOfLabel - 1) * (proposedBounds.height + margin.y));
				break;
			case PositionConstants.SOUTH:
				proposedBounds.translate(0, (numLabel - 1) * proposedBounds.height + margin.y);
				break;
			default:
				break;
			}

			// Save new location on resource
			// TOFIX: undo no atomic
			int x = ((Integer) ((GraphicalEditPart) editPart).getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
			int y = ((Integer) ((GraphicalEditPart) editPart).getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();

			final Point offset = newOffset;
			if (offset.x != x && offset.y != y) {
				ChangeBoundsRequest req = new ChangeBoundsRequest(RequestConstants.REQ_MOVE);
				req.setEditParts(editPart);
				req.setLocation(offset);
				Command command = editPart.getCommand(req);
				if (command != null && command.canExecute()) {
					command.setLabel(RequestConstants.REQ_MOVE + ": " + offset.toString()); //$NON-NLS-1$
					TransactionUtil.getEditingDomain(view).getCommandStack().execute(GEFtoEMFCommandWrapper.wrap(command));
				}
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
	}

	/**
	 * Gets the number of visible labels. Also set the number of the label owner of the locator.
	 *
	 * @return the number of visible labels
	 */
	private int getNumberOfVisibleLabels() {
		int numberOfLabel = 0;
		if (editPart != null) {
			EditPart parent = editPart.getParent();
			if (parent instanceof IPapyrusEditPart) {
				final List<EditPart> childrens = parent.getChildren();
				// Count all papyrus label edit part of the parent
				for (EditPart children : childrens) {
					if (children instanceof PapyrusLabelEditPart) {
						if (!((PapyrusLabelEditPart) children).getFigure().getBounds().isEmpty()) {
							numberOfLabel += 1;
							// We are one the owner edit part of the locator
							if (children == editPart) {
								numLabel = numberOfLabel;
							}
						}
					}
				}
			}
		}
		return numberOfLabel;
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
	 * @param editpart
	 *            the edit part to set
	 */
	@Override
	public void setEditpart(EditPart editPart) {
		this.editPart = editPart;
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
	 * Sets the view.
	 *
	 * @param view
	 *            the view to set
	 */
	@Override
	public void setView(View view) {
		this.view = view;
	}
}
