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
package org.eclipse.papyrus.uml.diagram.common.editparts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.notation.BooleanValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * The Class FloatingNameEditPart.
 */
public class FloatingLabelEditPart extends LabelEditPart {

	/** The Constant DISPLAY_FLOATING_NAME. */
	private static final String DISPLAY_FLOATING_LABEL = "displayFloatingLabel";


	/** The Constant DEFAULT_LABEL_DISPLAYED. */
	private static final boolean DEFAULT_LABEL_DISPLAYED = false;

	/**
	 * Instantiates a new floating name edit part.
	 *
	 * @param view
	 *        the view
	 */
	public FloatingLabelEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart#refreshVisibility()
	 *
	 */
	@Override
	protected void refreshVisibility() {
		super.refreshVisibility();
		//get the value of the CSS property
		BooleanValueStyle isLabelDisplayedValue = (BooleanValueStyle)((View)((View)getModel()).eContainer()).getNamedStyle(NotationPackage.eINSTANCE.getBooleanValueStyle(), getDisplayFloatingLabel());

		//if the property exist set the visibility of the floating name
		boolean isLabelDisplayed;
		if(isLabelDisplayedValue == null) {
			isLabelDisplayed = getDefaultLabelDisplayedValue();
		} else {
			isLabelDisplayed = isLabelDisplayedValue.isBooleanValue();
		}
		getFigure().setVisible(isLabelDisplayed);
	}

	/**
	 * Gets the default label displayed value.
	 *
	 * @return the default label displayed value
	 */
	protected boolean getDefaultLabelDisplayedValue() {
		return DEFAULT_LABEL_DISPLAYED;
	}

	/**
	 * Gets the display floating label.
	 *
	 * @return the display floating label
	 */
	public static String getDisplayFloatingLabel() {
		return DISPLAY_FLOATING_LABEL;
	}

}
