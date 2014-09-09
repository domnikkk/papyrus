/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mickaël ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and Implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.common.locator;

import org.eclipse.draw2d.AbstractLocator;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.internal.util.LabelViewConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.LineSeg;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.helper.PapyrusLabelHelper;

/**
 * Label locator that supports locating labels whose parent is either a Node or
 * and Edge.
 *
 */
public class PapyrusLabelLocator extends AbstractLocator {


	/** the parent figure of this locator. */
	protected IFigure parent;

	/** The alignment. */
	private int alignment;

	/** The offset. */
	private Point offset;

	/** The extent. */
	private Dimension extent;

	/** The cached string. */
	private String cachedString;

	/** The text alignment. */
	private int textAlignment = PositionConstants.MIDDLE;

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
	public void setTextAlignment(int textAlignment) {
		this.textAlignment = textAlignment;
	}

	/** The cached bounds. */
	private Rectangle cachedBounds = new Rectangle();
	// private int dx;
	/** The cached offset. */
	private Point cachedOffset;

	/** The view. */
	private View view;

	/** The cached segment. */
	private LineSeg cachedSegment;

	/**
	 * Constructor to create a an instance of <code>LabelLocator</code> which locates an IFigure offset relative to a calculated reference point.
	 *
	 * @param parent
	 *            the parent figure
	 * @param offSet
	 *            the relative location of the label
	 * @param alignment
	 *            the alignment hint in the case the parent is a <code>Connection</code>
	 */

	public PapyrusLabelLocator(IFigure parent, Point offSet, int alignment) {
		this.parent = parent;
		this.offset = offSet;
		this.alignment = alignment;
	}

	/**
	 * Constructor for figure who are located and sized.
	 *
	 * @param parent
	 *            the parent
	 * @param bounds
	 *            the bounds
	 * @param alignment
	 *            the alignment
	 */
	public PapyrusLabelLocator(IFigure parent, Rectangle bounds, int alignment) {
		this(parent, bounds.getLocation(), alignment);
		this.extent = bounds.getSize();
	}

	/**
	 * getter for the offset point.
	 *
	 * @return point
	 */
	public Point getOffset() {
		return this.offset;
	}

	/**
	 * setter for the offset point.
	 *
	 * @param offset
	 *            the new offset
	 */
	public void setOffset(Point offset) {
		this.offset = offset;
	}

	/**
	 * Positions the lable relative to the reference point with the
	 * given offsets.
	 *
	 * @param target
	 *            the target
	 */
	@Override
	public void relocate(IFigure target) {

		// The calculation of the location depends on the size of the shape so
		// the size must be set first.
		Dimension size = new Dimension();

		if (extent != null) {
			PapyrusLabelLocator currentConstraint = (PapyrusLabelLocator) target.getParent().getLayoutManager().getConstraint(target);
			Dimension currentExtent = currentConstraint.getSize();
			size = new Dimension(currentExtent);
			if (currentExtent.width == -1) {
				size.width = target.getPreferredSize().width;
			}
			if (currentExtent.height == -1) {
				size.height = target.getPreferredSize().height;
			}
			target.setSize(size);
		} else {
			target.setSize(new Dimension(target.getPreferredSize().width, target.getPreferredSize().height));
		}

		// Get the segment
		PointList ptLst = PapyrusLabelHelper.getParentPointList(target);
		int index = PointListUtilities.findNearestLineSegIndexOfPoint(ptLst, getReferencePoint());
		LineSeg segment = (LineSeg) PointListUtilities.getLineSegments(ptLst).get(index - 1);

		Point location = null;
		// If it's a rename
		if (cachedString != null && !cachedString.equals(((WrappingLabel) target).getText())) {
			// System.out.println("Rename");
			// location = PapyrusLabelHelper.relativeCoordinateFromOffset(target, getReferencePoint(), offSet, textAlignment);
			location = cachedBounds.getLocation();

			int x;
			int textWidth = ((IFigure) target.getChildren().get(0)).getBounds().width;

			// Set Location
			switch (textAlignment) {
			case PositionConstants.LEFT:
				x = 0;
				break;
			case PositionConstants.RIGHT:
				x = textWidth - cachedBounds.width;
				break;
			case PositionConstants.CENTER:
				x = (textWidth - cachedBounds.width) / 2;
				break;
			default:
				x = 0;
				break;
			}

			location.translate(x, 0);
			IFigure tmpTarget = target;
			tmpTarget.translate(x, 0);
			final Point viewLocation = PapyrusLabelHelper.offsetFromRelativeCoordinate(tmpTarget, cachedBounds, getReferencePoint());

			try {
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(view);
				org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.utils.TransactionHelper.run(domain, new Runnable() {

					@Override
					public void run() {
						// Add modelStylesheet to the resource without command
						ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_X(), Integer.valueOf(viewLocation.x));
						ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_Y(), Integer.valueOf(viewLocation.y));
					}
				});
			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} else
		// At the creation or It's a d&d move or // If it a move the connnection
		if (cachedBounds.height == 0 || !offset.equals(cachedOffset) || !segment.equals(cachedSegment)) {
			// System.out.println("Creation/open: " + ((WrappingLabel) target).getText() + " offSet: " + offset + " textAlign:  " + textAlignment);
			location = PapyrusLabelHelper.relativeCoordinateFromOffset(target, getReferencePoint(), offset);
		} else {
			// nothing change, in refresh case
			location = cachedBounds.getLocation();
		}

		// Set the location
		target.setLocation(location);

		cachedString = ((WrappingLabel) target).getText();
		cachedBounds = target.getBounds();
		cachedOffset = offset;
		cachedSegment = segment;
	}

	/**
	 * Returns the reference point for the locator.
	 *
	 * @return the reference point
	 */
	@Override
	protected Point getReferencePoint() {
		if (parent instanceof Connection) {
			PointList ptList = ((Connection) parent).getPoints();
			return PointListUtilities.calculatePointRelativeToLine(ptList, 0, getLocation(), true);
		} else {
			return parent.getBounds().getLocation();
		}
	}


	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	private int getLocation() {
		switch (getAlignment()) {
		case ConnectionLocator.SOURCE:
			return LabelViewConstants.TARGET_LOCATION;
		case ConnectionLocator.TARGET:
			return LabelViewConstants.SOURCE_LOCATION;
		case ConnectionLocator.MIDDLE:
			return LabelViewConstants.MIDDLE_LOCATION;
		default:
			return LabelViewConstants.MIDDLE_LOCATION;
		}
	}

	/**
	 * Returns the alignment of ConnectionLocator.
	 *
	 * @return The alignment
	 *
	 */
	public int getAlignment() {
		return alignment;
	}

	/**
	 * Sets the alignment.
	 *
	 * @param alignment
	 *            the alignment to set
	 */
	public void setAlignment(int alignment) {
		this.alignment = alignment;
	}


	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public Dimension getSize() {
		return extent.getCopy();
	}

	/**
	 * Returns the <code>PointList</code> describing the label's parent.
	 *
	 * @return pointList
	 */
	protected PointList getPointList() {
		if (parent instanceof Connection) {
			return ((Connection) parent).getPoints();
		} else {
			PointList ptList = new PointList();
			ptList.addPoint(parent.getBounds().getLocation());
			return ptList;
		}
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *            the new view
	 */
	public void setView(View view) {
		this.view = view;
	}


}