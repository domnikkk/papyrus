/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and Implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part;


import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.TimeObservationFloatingNameEditPart;

/**
 * The Class CDataTypeEditPart.
 */
public class CustomTimeObservationFloatingNameEditPart extends TimeObservationFloatingNameEditPart {

	private static final boolean LABEL_DISPLAYED_VALUE = true;

	/**
	 * Instantiates a new edit part.
	 *
	 * @param view
	 *            the view
	 */
	public CustomTimeObservationFloatingNameEditPart(View view) {
		super(view);
	}

	@Override
	protected boolean getDefaultLabelVisibility() {
		return LABEL_DISPLAYED_VALUE;
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
}
