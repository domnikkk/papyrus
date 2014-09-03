package org.eclipse.papyrus.uml.diagram.composite.custom.edit.parts;
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
 *
 *****************************************************************************/
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.PortNameEditPart;

public class CustomPortNameEditPart extends PortNameEditPart {

	public CustomPortNameEditPart(View view) {
		super(view);

	}


	/**
	 *Refresh Bounds of PortName EditPart in case of Move
	 */
	@Override
	public void refreshBounds() {
		int x = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int y = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		int width = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int height = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();

		// Update locator constraint
		IBorderItemLocator locator = getBorderItemLocator();
		locator.setConstraint(new Rectangle(x, y, width, height));

		// Set new constraint on parent figure
		getFigure().getParent().setConstraint(getFigure(), locator);

	}


}