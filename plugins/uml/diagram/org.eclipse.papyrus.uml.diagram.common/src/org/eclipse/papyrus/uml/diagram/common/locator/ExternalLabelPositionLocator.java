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
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
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
	private boolean constrained = false;

	/** The cached string. */
	private String cachedString;

	/** The text alignment. */
	private int textAlignment;

	/** The view. */
	private View view;

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
		// System.out.println("setposition: " + position);
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
		return constrained;
	}

	/**
	 * Sets the constrained.
	 *
	 * @param constrained
	 *            the constrained to set
	 */
	@Override
	public void setConstrained(boolean constrained) {
		this.constrained = constrained;
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
		// System.out.println("setConstraint(" + constraint + ")");
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



		if (constrained) {
			Point newconstraint;
			// Set the translation when alignment is auto
			switch (position) {
			case PositionConstants.WEST:
				// alignRight:
				newconstraint = new Point(-proposedBounds.width + offset.width, offset.height);
				break;
			case PositionConstants.EAST:
				// alignLeft
				newconstraint = new Point(parentFigure.getBounds().width + offset.width, offset.height);
				break;
			case PositionConstants.NORTH:
				// alignLeft center to the north
				newconstraint = new Point(-proposedBounds.width / 2 + offset.width, -parentFigure.getBounds().height + offset.height);
				break;
			case PositionConstants.SOUTH:
				// alignLeft center to the south
				newconstraint = new Point(-proposedBounds.width / 2 + offset.width, parentFigure.getBounds().height + offset.height);
				break;
			default:
				// the default is the like the EAST
				newconstraint = new Point(proposedBounds.width + offset.width, offset.height);
				break;
			}
			proposedBounds.setLocation(newconstraint.translate(parentFigure.getBounds().getTopLeft()));

		} else
		// If the label changed
		if (cachedString != null && !cachedString.equals(((WrappingLabel) target).getText())) {
			int x;
			int textWidth = ((IFigure) target.getChildren().get(0)).getBounds().width;

			// Set Location
			switch (textAlignment) {
			case PositionConstants.LEFT:
				x = 0;
				break;
			case PositionConstants.RIGHT:
				x = textWidth - proposedBounds.width;
				break;
			case PositionConstants.CENTER:
				x = (textWidth - proposedBounds.width) / 2;
				break;
			default:
				x = 0;
				break;
			}

			Point offsettmp = constraint.getLocation();
			offsettmp.translate(x, 0);
			final Point offset = offsettmp.getCopy();

			proposedBounds.translate(x, 0);
			if (view != null) {
				try {
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(view);
					org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.utils.TransactionHelper.run(domain, new Runnable() {

						@Override
						public void run() {
							// Set location to the resource without command
							ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_X(), Integer.valueOf(offset.x));
							ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_Y(), Integer.valueOf(offset.y));
						}
					});
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}
		}

		target.setBounds(proposedBounds);
		cachedString = ((WrappingLabel) target).getText();
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
}
