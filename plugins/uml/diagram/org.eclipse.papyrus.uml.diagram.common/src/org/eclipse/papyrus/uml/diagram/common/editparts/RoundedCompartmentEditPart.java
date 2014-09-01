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

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.notation.BooleanValueStyle;
import org.eclipse.gmf.runtime.notation.IntValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IRoundedRectangleFigure;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.ShowHideCompartmentEditPolicy;

/**
 * The Class RoundedCompartmentEditPart.
 */
public abstract class RoundedCompartmentEditPart extends NamedElementEditPart {

	/** The Constant FLOATING_NAME_OFFSET_HEIGHT. */
	protected static final String FLOATING_LABEL_OFFSET_HEIGHT = "floatingLabelOffsetHeight";

	/** The Constant FLOATING_NAME_OFFSET_WIDTH. */
	protected static final String FLOATING_LABEL_OFFSET_WIDTH = "floatingLabelOffsetWidth";

	/** CSS boolean property controlling whether label should be constrained. */
	public static final String FLOATING_LABEL_CONSTRAINED = "isFloatingLabelConstrained";

	/** CSS boolean property controlling whether. */
	public static final String RADIUS_WIDTH = "radiusWidth";

	/** CSS boolean property controlling whether. */
	public static final String RADIUS_HEIGHT = "radiusHeight";

	/** CSS boolean property controlling whether. */
	public static final String IS_OVAL = "isOval";

	private static final boolean DEFAULT_IS_FLOATING_LABEL_CONSTRAINED = false;

	private static final int DEFAULT_FLOATING_LABEL_OFFSET_WIDTH = 0;

	private static final int DEFAULT_FLOATING_LABEL_OFFSET_HEIGHT = 0;

	private static final int DEFAULT_CORNER_WIDTH = 0;

	private static final int DEFAULT_CORNER_HEIGHT = 0;

	private static final boolean DEFAULT_IS_OVAL = false;

	/**
	 * Instantiates a new rounded compartment edit part.
	 *
	 * @param view
	 *            the view
	 */
	public RoundedCompartmentEditPart(View view) {
		super(view);
	}


	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Install Edit Policy to Hide/show compartment, in particular for the symbol compartment
		installEditPolicy(ShowHideCompartmentEditPolicy.SHOW_HIDE_COMPARTMENT_POLICY, new ShowHideCompartmentEditPolicy());
	}

	/**
	 * Refresh visuals.
	 *
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.NamedElementEditPart#refreshVisuals()
	 */
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshRadius();
		refreshOval();
		refreshFloatingName();
	}

	/**
	 * Refresh floating name.
	 */
	protected void refreshFloatingName() {
		if (getPrimaryShape() instanceof IRoundedRectangleFigure) {
			// The figure
			IRoundedRectangleFigure roundedRectangleFigure = (IRoundedRectangleFigure) getPrimaryShape();

			// Get CSS value for the name attached properties
			BooleanValueStyle isNameConstrainedValue = (BooleanValueStyle) ((View) getModel()).getNamedStyle(NotationPackage.eINSTANCE.getBooleanValueStyle(), FLOATING_LABEL_CONSTRAINED);
			boolean isNameConstrained;
			// if no css property set to default value
			if (isNameConstrainedValue == null) {
				isNameConstrained = getDefaultIsFloatingNameConstrained();
			} else {
				isNameConstrained = isNameConstrainedValue.isBooleanValue();
			}
			// Set the name attached properties in figure
			roundedRectangleFigure.setFloatingNameConstrained(isNameConstrained);

			// get Offset
			// get CSS the value of offset Width
			IntValueStyle offsetWidth = (IntValueStyle) ((View) getModel()).getNamedStyle(NotationPackage.eINSTANCE.getIntValueStyle(), FLOATING_LABEL_OFFSET_WIDTH);
			int width = offsetWidth != null ? offsetWidth.getIntValue() : getDefaultFloatingNameOffsetWidth();

			// get CSS the value of offset Height
			IntValueStyle offsetHeight = (IntValueStyle) ((View) getModel()).getNamedStyle(NotationPackage.eINSTANCE.getIntValueStyle(), FLOATING_LABEL_OFFSET_HEIGHT);
			int height = offsetHeight != null ? offsetHeight.getIntValue() : getDefaultFloatingNameOffsetHeight();

			// Set the floating name offset
			roundedRectangleFigure.setFloatingNameOffset(new Dimension(width, height));

		}

	}

	/**
	 * Gets the default is name constrained.
	 *
	 * @return the default is name constrained
	 */
	protected boolean getDefaultIsFloatingNameConstrained() {
		return DEFAULT_IS_FLOATING_LABEL_CONSTRAINED;
	}

	/**
	 * Gets the default floating name offset height.
	 *
	 * @return the default floating name offset height
	 */
	protected int getDefaultFloatingNameOffsetHeight() {
		return DEFAULT_FLOATING_LABEL_OFFSET_HEIGHT;
	}

	/**
	 * Gets the default floating name offset width.
	 *
	 * @return the default floating name offset width
	 */
	protected int getDefaultFloatingNameOffsetWidth() {
		return DEFAULT_FLOATING_LABEL_OFFSET_WIDTH;
	}

	/**
	 * Refresh radius.
	 */
	protected void refreshRadius() {
		if (getPrimaryShape() instanceof IRoundedRectangleFigure) {
			// The figure
			IRoundedRectangleFigure roundedRectangleFigure = (IRoundedRectangleFigure) getPrimaryShape();

			Dimension radiusDimension = new Dimension();

			// get CSS the value of radius Width
			IntValueStyle radiusWidth = (IntValueStyle) ((View) getModel()).getNamedStyle(NotationPackage.eINSTANCE.getIntValueStyle(), RADIUS_WIDTH);
			radiusDimension.width = radiusWidth != null ? radiusWidth.getIntValue() : getDefaultCornerWidth();

			// get CSS the value of radius Height
			IntValueStyle radiusHeight = (IntValueStyle) ((View) getModel()).getNamedStyle(NotationPackage.eINSTANCE.getIntValueStyle(), RADIUS_HEIGHT);
			radiusDimension.height = radiusHeight != null ? radiusHeight.getIntValue() : getDefaultCornerHeight();

			// Set the corner dimension
			roundedRectangleFigure.setCornerDimensions(radiusDimension);
		}
	}

	/**
	 * Gets the default corner height value.
	 *
	 * @return the default corner height value
	 */
	protected int getDefaultCornerHeight() {
		return DEFAULT_CORNER_HEIGHT;
	}

	/**
	 * Gets the default corner width value.
	 *
	 * @return the default corner width value
	 */
	protected int getDefaultCornerWidth() {
		return DEFAULT_CORNER_WIDTH;
	}

	/**
	 * Refresh oval.
	 */
	protected void refreshOval() {
		if (getPrimaryShape() instanceof IRoundedRectangleFigure) {
			// The figure
			IRoundedRectangleFigure roundedRectangleFigure = (IRoundedRectangleFigure) getPrimaryShape();
			// get the CSS value of isOval
			BooleanValueStyle isOvalValue = (BooleanValueStyle) ((View) getModel()).getNamedStyle(NotationPackage.eINSTANCE.getBooleanValueStyle(), IS_OVAL);
			boolean isOval;
			if (isOvalValue == null) {
				isOval = getDefaultIsOvalValue();
			} else {
				isOval = isOvalValue.isBooleanValue();
			}
			// Set isOval
			roundedRectangleFigure.setOval(isOval);
		}
	}

	/**
	 * Gets the default is oval value.
	 *
	 * @return the default is oval value
	 */
	protected boolean getDefaultIsOvalValue() {
		return DEFAULT_IS_OVAL;
	}
}
