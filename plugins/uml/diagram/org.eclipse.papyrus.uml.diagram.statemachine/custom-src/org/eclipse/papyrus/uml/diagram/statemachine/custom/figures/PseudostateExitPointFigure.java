/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.statemachine.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.papyrus.uml.diagram.common.figure.node.AffixedNamedElementFigure;

/**
 * PseudostateExitPointFigure.
 *
 */
public class PseudostateExitPointFigure extends AffixedNamedElementFigure {
	/**
	 * Default Constructor.
	 */
	public PseudostateExitPointFigure() {
		super();
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.pushState();
		// Draw the cross.
		int x = (int) (bounds.width / (2 * Math.sqrt(2)));
		int y = (int) (bounds.height / (2 * Math.sqrt(2)));
		graphics.drawLine(bounds.getCenter().translate(x, -y), bounds.getCenter().translate(-x, y));
		graphics.drawLine(bounds.getCenter().translate(-x, -y), bounds.getCenter().translate(x, y));
		graphics.popState();
	}
}
