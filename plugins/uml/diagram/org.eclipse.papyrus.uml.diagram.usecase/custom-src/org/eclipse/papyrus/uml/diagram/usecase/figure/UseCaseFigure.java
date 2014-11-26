/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Emilien Perico (Atos Origin) emilien.perico@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.usecase.figure;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.papyrus.uml.diagram.common.figure.node.IEllipseFigure;
import org.eclipse.papyrus.uml.diagram.common.figure.node.IPapyrusNodeUMLElementFigure;
import org.eclipse.papyrus.uml.diagram.common.figure.node.RoundedCompartmentFigure;

/**
 * The Class UseCaseFigure.
 * modified by Patrick Tessier inorder to extends nodeName
 */
public class UseCaseFigure extends RoundedCompartmentFigure implements IPapyrusNodeUMLElementFigure, IEllipseFigure {

	/** The Attribute Compartment */
	private final static String EXTENSION_POINT_COMPARTMENT = "extensionPointCompartment";


	/** The List of Compartment */
	private final static List<String> COMPARTMENT = new ArrayList<String>() {

		private static final long serialVersionUID = 1L;
		{
			add(EXTENSION_POINT_COMPARTMENT);
		}
	};

	/**
	 * Default Constructor
	 */
	public UseCaseFigure() {
		this(null);
	}

	/**
	 * Create a new Classifier figure with the given tag
	 *
	 * @param tagLabel
	 *            a String that will be displayed at the top of the figure
	 */
	public UseCaseFigure(String tagLabel) {
		super(COMPARTMENT, tagLabel);
	}

	/**
	 * Get the attribute's compartment figure
	 *
	 * @return
	 */
	public IFigure getAttributeCompartmentFigure() {
		return getCompartment(EXTENSION_POINT_COMPARTMENT);
	}

	/**
	 * get the gmf container figure of the package
	 *
	 * @return the gmf container
	 */
	public ShapeCompartmentFigure getGMFExtensionPointContainer() {
		if (getCompartment(EXTENSION_POINT_COMPARTMENT).getChildren().size() > 0) {
			return (ShapeCompartmentFigure) getCompartment(EXTENSION_POINT_COMPARTMENT).getChildren().get(0);
		}
		return null;
	}

	public RectangleFigure getExtensionPointContainerFigure() {
		return getCompartment(EXTENSION_POINT_COMPARTMENT);
	}

	// private final RectangleFigure shapeCompartment;

	/**
	 * Instantiates a new use case figure.
	 */
	// public UseCaseFigure() {
	// super();
	// SplitEllipseLayout layoutThis = new SplitEllipseLayout();
	// this.setLayoutManager(layoutThis);
	// shapeCompartment = new RectangleFigure();
	// add(shapeCompartment);
	// shapeCompartment.setBorder(null);
	// shapeCompartment.setLineWidth(10);
	// shapeCompartment.setOpaque(false);
	// shapeCompartment.setFill(false);
	// this.setBorder(null);
	// }

	// @Override
	// protected void setBorder(IFigure borderedFigure, Border border) {
	// }

	// @Override
	// public void paintFigure(Graphics graphics) {
	// shapeCompartment.setForegroundColor(getBackgroundColor());
	// graphics.fillOval(getBounds());
	// paintBackground(graphics, getBounds());
	// for (Object iterable_element : shapeCompartment.getChildren()) {
	// ((IFigure) iterable_element).setForegroundColor(ColorConstants.black);
	//
	// }
	// // shadowborder.setColor(getForegroundColor());
	// }

	// @Override
	// protected void paintBackground(Graphics graphics, Rectangle rectangle) {
	// graphics.setBackgroundColor(getBackgroundColor());
	// graphics.setForegroundColor(getForegroundColor());
	// graphics.fillOval(rectangle);
	// graphics.drawOval(rectangle);
	// }
}
