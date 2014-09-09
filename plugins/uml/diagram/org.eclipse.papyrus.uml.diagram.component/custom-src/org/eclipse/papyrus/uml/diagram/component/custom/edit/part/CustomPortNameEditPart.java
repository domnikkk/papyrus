package org.eclipse.papyrus.uml.diagram.component.custom.edit.part;

/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Céline Janssens (ALL4TEC) celine.janssens@all4tec.net - Bug 440224 : Label Alignment
 *  Mickaël ADAM (ALL4TEC) mickael.adam@all4tec.net - Text alignment implementation
 *
 *****************************************************************************/

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.locator.IPapyrusBorderItemLocator;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PortNameEditPart;

/**
 * The Class CustomPortNameEditPart.
 */
public class CustomPortNameEditPart extends PortNameEditPart {

	/**
	 * Instantiates a new custom port name edit part.
	 *
	 * @param view
	 *            the view
	 */
	public CustomPortNameEditPart(View view) {
		super(view);
	}

	/**
	 * Gets the default text alignment.
	 *
	 * @return the default text alignment
	 */
	@Override
	protected int getDefaultTextAlignment() {
		return PositionConstants.LEFT;
	}

	/**
	 * Refresh Bounds of PortName EditPart
	 */
	@Override
	public void refreshBounds() {
		int dx = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int dy = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();

		Point offset = new Point(dx, dy);

		if (externalLabelLocator == null) {
			externalLabelLocator = (IPapyrusBorderItemLocator) getBorderItemLocator();
		}
		if (offset != null) {
			externalLabelLocator.setConstraint(new Rectangle(offset.x, offset.y, 0, 0));
		}
		externalLabelLocator.setView((View) getModel());
		externalLabelLocator.setTextAlignment(getTextAlignment());
		externalLabelLocator.setPosition(getPositionOnParent());
		getFigure().getParent().setConstraint(getFigure(), externalLabelLocator);
	}
}
