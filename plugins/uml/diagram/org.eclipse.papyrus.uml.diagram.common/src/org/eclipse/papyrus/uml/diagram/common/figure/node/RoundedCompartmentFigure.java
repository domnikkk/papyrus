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
package org.eclipse.papyrus.uml.diagram.common.figure.node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.RoundedRectangleBorder;
import org.eclipse.gmf.runtime.draw2d.ui.graphics.ColorRegistry;
import org.eclipse.gmf.runtime.notation.GradientStyle;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IRoundedRectangleFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.RoundedRectangleShadowBorder;

/**
 * A rectangular figure that supports compartment.
 */
public class RoundedCompartmentFigure extends NodeNamedElementFigure implements IRoundedRectangleFigure {

	/** The container figures. */
	private Map<String, RectangleFigure> containerFigures;

	/** The corner dimension. */
	protected Dimension cornerDimension = new Dimension();

	/** True if the figure is oval. */
	protected boolean isOval = false;

	/** The is label constrained. */
	protected boolean isLabelConstrained = false;

	/** The floating name offset. */
	protected Dimension floatingNameOffset = new Dimension();

	/** The border style. */
	protected int borderStyle = Graphics.LINE_SOLID;

	/** True if the figure has header. */
	private boolean hasHeader = false;

	/**
	 * @param borderStyle
	 *            the borderStyle to set
	 */
	public void setBorderStyle(int borderStyle) {
		this.borderStyle = borderStyle;
		if (shadowborder != null) {
			shadowborder.setStyle(borderStyle);
		}
	}

	/**
	 * Instantiates a new rounded compartment figure.
	 */
	public RoundedCompartmentFigure() {
		this(null, null);
	}

	/**
	 * Constructor.
	 *
	 * @param compartmentFigure
	 *            the compartment figure
	 */
	public RoundedCompartmentFigure(List<String> compartmentFigure) {
		this(compartmentFigure, null);
	}

	/**
	 * Constructor with a tagged value.
	 * 
	 * @param compartmentFigure
	 *            a list of id for the compartment figure
	 * @param taggedLabelValue
	 *            the value to display as tagged value
	 */
	public RoundedCompartmentFigure(List<String> compartmentFigure, String taggedLabelValue) {
		super(taggedLabelValue);
		setOpaque(false);
		shadowborder = new RoundedRectangleShadowBorder(getForegroundColor(), cornerDimension);
		setLayoutManager(new AutomaticCompartmentLayoutManager());
		if (compartmentFigure != null) {
			createContentPane(compartmentFigure);
		}
	}

	/**
	 * Creates the content pane.
	 *
	 * @param compartmentFigure
	 *            the compartment figure
	 */
	protected void createContentPane(List<String> compartmentFigure) {
		containerFigures = new HashMap<String, RectangleFigure>();
		for (String id : compartmentFigure) {
			RectangleFigure newFigure = new RectangleFigure();
			newFigure.setLayoutManager(new SubCompartmentLayoutManager());
			// to debug graphically: newFigure.setFill(true);
			newFigure.setFill(false);
			newFigure.setBorder(null);
			newFigure.setOutline(false);
			newFigure.setOpaque(false);
			this.add(newFigure);
			containerFigures.put(id, newFigure);
		}
	}

	/**
	 * Get the RectangleFigure containing the wanted compartment.
	 * 
	 * @param id
	 *            the id to find the right compartment
	 * @return the RectangleFigure
	 */
	public RectangleFigure getCompartment(String id) {
		return containerFigures.get(id);
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IRoundedRectangleFigure#getCornerDimensions()
	 *
	 * @return
	 */
	@Override
	public Dimension getCornerDimensions() {
		return cornerDimension;
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IRoundedRectangleFigure#getRoundedRectangleBounds()
	 *
	 * @return
	 */
	@Override
	public Rectangle getRoundedRectangleBounds() {
		return getBounds();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void paintFigure(Graphics graphics) {

		shadowborder.setColor(getForegroundColor());
		graphics.pushState();
		Rectangle rectangle = getBounds().getCopy();

		refreshCornerSizeWhenOval();

		// paintBackground:
		applyTransparency(graphics);
		if (isUsingGradient()) {
			boolean isVertical = (getGradientStyle() == GradientStyle.VERTICAL) ? true : false;
			if (isVertical && rectangle.height > ((3 * cornerDimension.height) / 2)) {
				Rectangle upperBounds = getBounds().getCopy();
				upperBounds.height = cornerDimension.height - getLineWidth() / 2;
				upperBounds.y += getLineWidth() / 2;
				Rectangle upperClip = upperBounds.getCopy().shrink(new Insets(0, 0, cornerDimension.height / 2, 0));
				Rectangle lowerBounds = getBounds().getCopy();
				lowerBounds.y = lowerBounds.bottom() - cornerDimension.height;
				lowerBounds.height = cornerDimension.height - getLineWidth() / 2;
				Rectangle lowerClip = lowerBounds.getCopy().shrink(new Insets(cornerDimension.height / 2, 0, 0, 0));
				Rectangle innerBounds = getBounds().getCopy();
				innerBounds.y = upperClip.bottom();
				innerBounds.height = lowerClip.y - upperClip.bottom() + 1;
				// fill the upper part
				graphics.pushState();
				graphics.setBackgroundColor(ColorRegistry.getInstance().getColor(getGradientColor2()));
				graphics.clipRect(upperClip);
				graphics.fillRoundRectangle(upperBounds, cornerDimension.width, cornerDimension.height);
				graphics.popState();
				// fill the inner part
				graphics.pushState();
				graphics.setForegroundColor(ColorRegistry.getInstance().getColor(getGradientColor2()));
				graphics.setBackgroundColor(ColorRegistry.getInstance().getColor(getGradientColor1()));
				graphics.fillGradient(innerBounds, true);
				graphics.popState();
				// fill the lower part
				graphics.pushState();
				graphics.setBackgroundColor(ColorRegistry.getInstance().getColor(getGradientColor1()));
				graphics.clipRect(lowerClip);
				graphics.fillRoundRectangle(lowerBounds, cornerDimension.width, cornerDimension.height);
				graphics.popState();
			} else if (!isVertical && rectangle.width > ((3 * cornerDimension.width) / 2)) {
				Rectangle leftBounds = getBounds().getCopy();
				leftBounds.width = cornerDimension.width - getLineWidth() / 2;
				leftBounds.x += getLineWidth() / 2;
				Rectangle leftClip = leftBounds.getCopy().shrink(new Insets(0, 0, 0, cornerDimension.width / 2));
				Rectangle rightBounds = getBounds().getCopy();
				rightBounds.x = rightBounds.right() - cornerDimension.width;
				rightBounds.width = cornerDimension.width - getLineWidth() / 2;
				Rectangle rightClip = rightBounds.getCopy().shrink(new Insets(0, cornerDimension.width / 2, 0, 0));
				Rectangle innerBounds = getBounds().getCopy();
				innerBounds.x = leftClip.right();// - getLineWidth();
				innerBounds.width = rightClip.x - leftClip.right() + 1;// + 2 * getLineWidth();
				// fill the left part
				graphics.pushState();
				graphics.setBackgroundColor(ColorRegistry.getInstance().getColor(getGradientColor2()));
				graphics.clipRect(leftClip);
				graphics.fillRoundRectangle(leftBounds, cornerDimension.width, cornerDimension.height);
				graphics.popState();
				// fill the inner part
				graphics.pushState();
				graphics.setBackgroundColor(ColorRegistry.getInstance().getColor(getGradientColor1()));
				graphics.setForegroundColor(ColorRegistry.getInstance().getColor(getGradientColor2()));
				graphics.fillGradient(innerBounds, false);
				graphics.popState();
				// fill the right part
				graphics.pushState();
				graphics.setBackgroundColor(ColorRegistry.getInstance().getColor(getGradientColor1()));
				graphics.clipRect(rightClip);
				graphics.fillRoundRectangle(rightBounds, cornerDimension.width, cornerDimension.height);
				graphics.popState();
			} else {
				graphics.pushState();
				graphics.setBackgroundColor(ColorRegistry.getInstance().getColor(getGradientColor1()));
				graphics.setForegroundColor(ColorRegistry.getInstance().getColor(getGradientColor2()));
				graphics.fillRoundRectangle(rectangle, cornerDimension.width, cornerDimension.height);
				graphics.popState();
			}
		} else {
			graphics.pushState();
			graphics.setBackgroundColor(getBackgroundColor());
			graphics.setForegroundColor(getForegroundColor());
			graphics.fillRoundRectangle(rectangle, cornerDimension.width, cornerDimension.height);
			graphics.popState();
		}

		if (hasHeader) {
			graphics.drawPolyline(getHeader());
		}

		graphics.popState();
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.figure.node.PapyrusNodeFigure#setShadow(boolean)
	 *
	 * @param shadow
	 */
	@Override
	public void setShadow(boolean shadow) {
		super.setShadow(shadow);
		if (!shadow) {
			// If shadow is set to false we set the border
			if (getBorder() != null) {

				refreshCornerSizeWhenOval();

				RoundedRectangleBorder border = new RoundedRectangleBorder(cornerDimension.width, cornerDimension.height);
				border.setWidth(getLineWidth());
				border.setStyle(borderStyle);
				this.setBorder(border);
			}
		}
		setLineStyle(borderStyle);
	}

	/**
	 * 
	 */
	private void refreshCornerSizeWhenOval() {
		// Set the corner dimension if is oval in case of resizing
		if (isOval) {
			if (cornerDimension.width != getBounds().width || cornerDimension.height != getBounds().height) {
				cornerDimension.width = getBounds().width;
				cornerDimension.height = getBounds().height;
				// Force to repaint the border thought setShadow()
				setShadow(isShadow());
			}
		}
	}

	/**
	 * Sets the corner dimension.
	 *
	 * @param cornerDimension
	 *            the new corner dimension
	 */
	@Override
	public void setCornerDimensions(Dimension cornerDimension) {
		this.cornerDimension = cornerDimension;
	}

	@Override
	public void setOval(boolean booleanValue) {
		isOval = booleanValue;
		if (booleanValue) {
			refreshCornerSizeWhenOval();
		}
	}

	@Override
	public boolean isOval() {
		return isOval;
	}

	@Override
	public void setFloatingNameConstrained(boolean booleanValue) {
		isLabelConstrained = booleanValue;
	}

	@Override
	public boolean isFloatingNameConstrained() {
		return isLabelConstrained;
	}

	@Override
	public void setFloatingNameOffset(Dimension offset) {
		this.floatingNameOffset = offset;

	}

	@Override
	public Dimension getFloatingNameOffset() {
		return floatingNameOffset;
	}


	protected PointList getHeader() {

		Rectangle labelBounds = nameLabel.getBounds().getCopy();
		PointList points = new PointList();

		int labelWidth = -1;
		labelWidth = Math.max(labelWidth, nameLabel.getPreferredSize().width);

		// case the size of the label is 0 or -1 (no label)
		if (labelWidth <= 0) {
			labelWidth = getBounds().width / 4;
		}

		Point verticalStart = new Point();
		Point verticalEnd = new Point();
		Point diagonalStart = new Point();
		Point diagonalEnd = new Point();
		Point horizontalStart = new Point();
		Point horizontalEnd = new Point();

		verticalStart.x = labelBounds.x + labelWidth + 4;
		verticalStart.y = getBounds().y; // labelBounds.y;
		points.addPoint(verticalStart);

		verticalEnd.x = verticalStart.x;
		verticalEnd.y = verticalStart.y + labelBounds.height / 2 + 3;
		points.addPoint(verticalEnd);

		diagonalStart.x = verticalEnd.x;
		diagonalStart.y = verticalEnd.y;
		points.addPoint(diagonalStart);

		diagonalEnd.x = diagonalStart.x - labelBounds.height / 2 + 3;
		diagonalEnd.y = labelBounds.y + labelBounds.height - 1;
		points.addPoint(diagonalEnd);

		horizontalStart.x = diagonalEnd.x;
		horizontalStart.y = diagonalEnd.y;
		points.addPoint(horizontalStart);

		horizontalEnd.x = labelBounds.x;
		horizontalEnd.y = horizontalStart.y;
		points.addPoint(horizontalEnd);
		return points;
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IRoundedRectangleFigure#setHasHeader(boolean)
	 *
	 * @param hasHeader
	 */
	@Override
	public void setHasHeader(boolean hasHeader) {
		this.hasHeader = hasHeader;
	}

	/**
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IRoundedRectangleFigure#hasHeader()
	 *
	 * @return
	 */
	@Override
	public boolean hasHeader() {
		return hasHeader;
	}

}
