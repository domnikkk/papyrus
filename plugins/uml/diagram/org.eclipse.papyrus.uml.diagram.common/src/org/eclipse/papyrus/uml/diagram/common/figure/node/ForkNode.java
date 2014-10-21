/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 392301
 */
package org.eclipse.papyrus.uml.diagram.common.figure.node;

import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Image;

/**
 * this figure is small rectangle
 *
 */
// Unused: to delete
public class ForkNode extends RoundedCompartmentFigure implements IPapyrusNodeUMLElementFigure {

	// /**
	// * {@inheritDoc}
	// */
	// @Override
	// protected Border getDefaultBorder(Color borderColor) {
	// return null;
	// }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		return new Dimension(10, 10);
	}

	// /**
	// * {@inheritDoc}
	// */
	// @Override
	// public void paintFigure(Graphics graphics) {
	// Rectangle r = getBounds().getCopy().crop(new Insets(0, 0, 1, 1));
	// if (isUsingGradient()) {
	// graphics.setBackgroundColor(ColorRegistry.getInstance().getColor(getGradientColor2()));
	// // graphics.setForegroundColor(ColorRegistry.getInstance().getColor(getGradientColor2()));
	// } else {
	// graphics.setBackgroundColor(getBackgroundColor());
	// // graphics.setForegroundColor(getForegroundColor());
	// }
	// graphics.fillRectangle(r);
	// graphics.setLineWidth(1);
	// graphics.drawRectangle(r);
	// }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setStereotypeDisplay(String stereotypes, Image image) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setStereotypePropertiesInBrace(String stereotypeProperties) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setStereotypePropertiesInCompartment(String stereotypeProperties) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Label getStereotypesLabel() {
		return new Label();
	}
}
