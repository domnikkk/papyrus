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
package org.eclipse.papyrus.uml.diagram.composite.custom.edit.parts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.locator.IPapyrusBorderItemLocator;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.PortNameEditPart;

public class CustomPortNameEditPart extends PortNameEditPart {

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
		int x = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int y = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();

		Point offset = new Point(x, y);

		if (borderLabelLocator == null) {
			borderLabelLocator = (IPapyrusBorderItemLocator) getBorderItemLocator();
		}
		if (offset != null) {
			borderLabelLocator.setConstraint(new Rectangle(offset.x, offset.y, 0, 0));
		}
		borderLabelLocator.setView((View) getModel());
		borderLabelLocator.setTextAlignment(getTextAlignment());
		borderLabelLocator.setEditpart(this);
		getFigure().getParent().setConstraint(getFigure(), borderLabelLocator);
	}

}