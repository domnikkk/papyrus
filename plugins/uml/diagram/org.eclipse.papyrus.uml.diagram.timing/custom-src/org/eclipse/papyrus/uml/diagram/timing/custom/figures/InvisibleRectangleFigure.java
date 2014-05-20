/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.timing.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IPapyrusNodeFigure;
import org.eclipse.swt.graphics.Color;

/** A rectangle that is not painted: useful for simplifying layouts */
public class InvisibleRectangleFigure extends RectangleFigure implements IPapyrusNodeFigure {

	/**
	 * Creates a RectangleFigure.
	 */
	public InvisibleRectangleFigure() {
	}

	/**
	 * @see Shape#fillShape(Graphics)
	 */
	@Override
	protected void fillShape(final Graphics graphics) {
		// don't fill
	}

	/**
	 * @see Shape#outlineShape(Graphics)
	 */
	@Override
	protected void outlineShape(final Graphics graphics) {
		// don't draw an outline
	}

	@Override
	public Color getBorderColor() {
		return null;
	}

	@Override
	public boolean isShadow() {
		return false;
	}

	@Override
	public void setBorderColor(Color borderColor) {
	}

	@Override
	public void setShadow(boolean shadow) {
	}

	@Override
	public void setTransparency(int transparency) {
	}

	@Override
	public void setGradientData(int gradientColor1, int gradientColor2, int gradientStyle) {
	}

	@Override
	public void setIsUsingGradient(boolean b) {
	}
}
