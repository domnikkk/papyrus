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
package org.eclipse.papyrus.infra.gmfdiag.common.figure;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.SVGNodePlateFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.SlidableRoundedRectangleAnchor;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.FigureUtils;
import org.eclipse.swt.graphics.Color;

/**
 * The Class OneLineResizableBorder.
 */
public class OneTopLineResizableBorder extends OneLineBorder {

	/** The forced length. */
	private int forcedLength = -1;

	private float lengthRatio = (float) 1.0;

	/**
	 * @param lengthRatio
	 *            the lengthRatio to set
	 */
	public void setLengthRatio(float lengthRatio) {
		this.lengthRatio = lengthRatio;
	}

	/**
	 * Constructor.
	 *
	 */
	public OneTopLineResizableBorder() {
		super();
	}

	/**
	 * Constructor.
	 *
	 * @param color
	 *            the color
	 */
	public OneTopLineResizableBorder(Color color) {
		super(color);
	}

	/**
	 * Constructor.
	 *
	 * @param width
	 *            the width
	 */
	public OneTopLineResizableBorder(int width) {
		super(width, PositionConstants.TOP);
	}

	/**
	 * Constructor.
	 *
	 * @param lenght
	 *            the length
	 * @param width
	 *            the width
	 */
	public OneTopLineResizableBorder(int length, int width) {
		super(width, PositionConstants.TOP);
		this.forcedLength = length;
	}

	/**
	 * Paints the border based on the inputs given.
	 *
	 * @param figure
	 *            <code>IFigure</code> for which this is the border.
	 * @param graphics
	 *            <code>Graphics</code> handle for drawing the border.
	 * @param insets
	 *            Space to be taken up by this border.
	 */
	@Override
	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		tempRect.setBounds(getPaintRectangle(figure, insets));

		int length;

		// get the length of the line
		length = getLineLength(figure);

		tempRect.x += (tempRect.width - length - 2) / 2;
		tempRect.width = (int) (length - 1);

		int one = MapModeUtil.getMapMode(figure).DPtoLP(1);
		int widthInDP = getWidth() / one;

		int halfWidthInLP = MapModeUtil.getMapMode(figure).DPtoLP(widthInDP / 2);

		graphics.setLineWidth(getWidth());
		graphics.setLineStyle(getStyle());

		if (getColor() != null) {
			graphics.setForegroundColor(getColor());
		}
		tempRect.y += halfWidthInLP;
		tempRect.height -= getWidth();
		graphics.drawLine(tempRect.getTopLeft(), tempRect.getTopRight());
	}

	/**
	 * @param figure
	 * @return
	 */
	private int getLineLength(IFigure figure) {
		int length = tempRect.width;
		// if the length is forced
		if (forcedLength != -1) {
			length = forcedLength;
		} else {
			SVGNodePlateFigure mainFigure = FigureUtils.findParentFigureInstance(figure, SVGNodePlateFigure.class);
			// Get the connection anchor
			ConnectionAnchor connectionAnchor = ((SVGNodePlateFigure) mainFigure).getConnectionAnchor("");
			if (connectionAnchor instanceof SlidableRoundedRectangleAnchor && !(mainFigure.getBounds().equals(new Rectangle()))) {
				// Calculate the length off the border thanks the SlidableRoundedRectangleAnchor
				Rectangle rect = figure.getBounds().getCopy();
				figure.translateToAbsolute(rect);

				Point locationLeft = ((SlidableRoundedRectangleAnchor) connectionAnchor).getLocation(rect.getTopLeft().translate(rect.width / 2, 0), rect.getTopLeft());
				Point locationRight = ((SlidableRoundedRectangleAnchor) connectionAnchor).getLocation(rect.getTopLeft().translate(rect.width / 2, 0), rect.getTopRight());

				if (locationLeft != null && locationRight != null) {
					rect.width = locationRight.x - locationLeft.x;
					// translate the length according to the zoom
					figure.translateToRelative(rect);
					length = rect.width;
				}
			}
		}

		return (int) (length * lengthRatio);
	}

	/**
	 * Sets the length.
	 *
	 * @param lenght
	 *            the new length
	 */
	public void setLength(int length) {
		this.forcedLength = length;
	}
}
