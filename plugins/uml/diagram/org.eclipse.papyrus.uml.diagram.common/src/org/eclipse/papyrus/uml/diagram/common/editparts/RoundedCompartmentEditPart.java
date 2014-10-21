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

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.notation.NamedStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.StringValueStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.ShapeDisplayCompartmentEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IRoundedRectangleFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.ShowHideCompartmentEditPolicy;

/**
 * The Class RoundedCompartmentEditPart.
 */
public abstract class RoundedCompartmentEditPart extends NamedElementEditPart {

	/** The Constant USE_ORIGINAL_COLORS. */
	private static final String USE_ORIGINAL_COLORS = "useOriginalColors";

	/** The Constant BORDER_STYLE. */
	protected static final String BORDER_STYLE = "borderStyle"; //$NON-NLS-N$

	/** The Constant DEFAULT_BORDER_STYLE. */
	private static final int DEFAULT_BORDER_STYLE = Graphics.LINE_SOLID;

	/** The Constant DEFAULT_CORNER_HEIGHT. */
	private static final int DEFAULT_CORNER_HEIGHT = 0;

	/** The Constant DEFAULT_CORNER_WIDTH. */
	private static final int DEFAULT_CORNER_WIDTH = 0;

	/** The Constant DEFAULT_FLOATING_LABEL_OFFSET_HEIGHT. */
	private static final int DEFAULT_FLOATING_LABEL_OFFSET_HEIGHT = 0;

	/** The Constant DEFAULT_FLOATING_LABEL_OFFSET_WIDTH. */
	private static final int DEFAULT_FLOATING_LABEL_OFFSET_WIDTH = 0;

	/** The Constant DEFAULT_IS_FLOATING_LABEL_CONSTRAINED. */
	private static final boolean DEFAULT_IS_FLOATING_LABEL_CONSTRAINED = false;

	/** The Constant DEFAULT_IS_OVAL. */
	private static final boolean DEFAULT_IS_OVAL = false;

	/** CSS boolean property controlling whether label should be constrained. */
	public static final String FLOATING_LABEL_CONSTRAINED = "isFloatingLabelConstrained";//$NON-NLS-N$

	/** The Constant FLOATING_NAME_OFFSET_HEIGHT. */
	public static final String FLOATING_LABEL_OFFSET_HEIGHT = "floatingLabelOffsetHeight";//$NON-NLS-N$

	/** The Constant FLOATING_NAME_OFFSET_WIDTH. */
	public static final String FLOATING_LABEL_OFFSET_WIDTH = "floatingLabelOffsetWidth";//$NON-NLS-N$

	/** CSS boolean property controlling whether. */
	public static final String IS_OVAL = "isOval";//$NON-NLS-N$

	/** CSS boolean property controlling whether. */
	public static final String RADIUS_HEIGHT = "radiusHeight";//$NON-NLS-N$

	/** CSS boolean property controlling whether. */
	public static final String RADIUS_WIDTH = "radiusWidth";//$NON-NLS-N$

	/** The Constant DEFAULT_USE_ORIGINAL_COLORS. */
	private static final boolean DEFAULT_USE_ORIGINAL_COLORS = true;

	/**
	 * Instantiates a new rounded compartment edit part.
	 *
	 * @param view
	 *            the view
	 */
	public RoundedCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * Creates the default edit policies.
	 *
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.NamedElementEditPart#createDefaultEditPolicies()
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Install Edit Policy to Hide/show compartment, in particular for the symbol compartment
		installEditPolicy(ShowHideCompartmentEditPolicy.SHOW_HIDE_COMPARTMENT_POLICY, new ShowHideCompartmentEditPolicy());
	}

	/**
	 * Gets the default border style.
	 *
	 * @return the default border style
	 */
	protected int getDefaultBorderStyle() {
		return DEFAULT_BORDER_STYLE;
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
	 * Gets the default floating name offset height.
	 *
	 * @return the default floating name offset height
	 */
	protected int getDefaultFloatingLabelOffsetHeight() {
		return DEFAULT_FLOATING_LABEL_OFFSET_HEIGHT;
	}

	/**
	 * Gets the default floating name offset width.
	 *
	 * @return the default floating name offset width
	 */
	protected int getDefaultFloatingLabelOffsetWidth() {
		return DEFAULT_FLOATING_LABEL_OFFSET_WIDTH;
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
	 * Gets the default is oval value.
	 *
	 * @return the default is oval value
	 */
	protected boolean getDefaultIsOvalValue() {
		return DEFAULT_IS_OVAL;
	}

	/**
	 * Refresh border style.
	 */
	private void refreshBorderStyle() {
		// get the Figure
		if (getPrimaryShape() instanceof IRoundedRectangleFigure) {
			IRoundedRectangleFigure roundedRectangleFigure = (IRoundedRectangleFigure) getPrimaryShape();

			EClass stringValueStyle = NotationPackage.eINSTANCE.getStringValueStyle();
			int borderStyle = getDefaultBorderStyle();

			if (stringValueStyle != null) {

				if (getModel() instanceof View) {
					NamedStyle borderValueStyle = ((View) getModel()).getNamedStyle(stringValueStyle, BORDER_STYLE);

					if (borderValueStyle instanceof StringValueStyle) {
						String value = ((StringValueStyle) borderValueStyle).getStringValue();

						if ("dash".equals(value)) {
							borderStyle = Graphics.LINE_DASH;
						}
						if ("dashDot".equals(value)) {
							borderStyle = Graphics.LINE_DASHDOT;
						}
						if ("dashDotDot".equals(value)) {
							borderStyle = Graphics.LINE_DASHDOTDOT;
						}
						if ("dot".equals(value)) {
							borderStyle = Graphics.LINE_DOT;
						}
						if ("solid".equals(value)) {
							borderStyle = Graphics.LINE_SOLID;
						}
					}
				}
			}

			// set the border style of the figure
			roundedRectangleFigure.setBorderStyle(borderStyle);
		}
	}

	/**
	 * Refresh floating name.
	 */
	protected void refreshFloatingName() {
		if (getPrimaryShape() instanceof IRoundedRectangleFigure) {
			// The figure
			IRoundedRectangleFigure roundedRectangleFigure = (IRoundedRectangleFigure) getPrimaryShape();

			if (getModel() instanceof View) {
				// Get CSS value for the name attached properties
				boolean isNameConstrained = NotationUtils.getBooleanValue((View) getModel(), FLOATING_LABEL_CONSTRAINED, getDefaultIsFloatingNameConstrained());

				// get CSS the value of offset width and height
				int width = NotationUtils.getIntValue((View) getModel(), FLOATING_LABEL_OFFSET_WIDTH, getDefaultFloatingLabelOffsetWidth());
				int height = NotationUtils.getIntValue((View) getModel(), FLOATING_LABEL_OFFSET_HEIGHT, getDefaultFloatingLabelOffsetHeight());

				// Set the name attached properties in figure
				roundedRectangleFigure.setFloatingNameConstrained(isNameConstrained);

				// Set the floating name offset
				roundedRectangleFigure.setFloatingNameOffset(new Dimension(width, height));
			}
		}
	}

	/**
	 * Refresh oval.
	 */
	protected void refreshOval() {
		if (getPrimaryShape() instanceof IRoundedRectangleFigure) {
			if (getModel() instanceof View) {
				// The figure
				IRoundedRectangleFigure roundedRectangleFigure = (IRoundedRectangleFigure) getPrimaryShape();

				// get the CSS value of isOval
				boolean isOval = NotationUtils.getBooleanValue((View) getModel(), IS_OVAL, getDefaultIsOvalValue());

				// Set isOval
				roundedRectangleFigure.setOval(isOval);
			}
		}
	}

	/**
	 * Refresh radius.
	 */
	protected void refreshRadius() {
		if (getPrimaryShape() instanceof IRoundedRectangleFigure) {
			// The figure
			IRoundedRectangleFigure roundedRectangleFigure = (IRoundedRectangleFigure) getPrimaryShape();

			if (getModel() instanceof View) {
				// get CSS the value of radius Width
				int width = NotationUtils.getIntValue((View) getModel(), RADIUS_WIDTH, getDefaultCornerWidth());

				// get CSS the value of radius Height
				int height = NotationUtils.getIntValue((View) getModel(), RADIUS_HEIGHT, getDefaultCornerHeight());

				// Set the corner dimension
				roundedRectangleFigure.setCornerDimensions(new Dimension(width, height));
			}
		}
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
		refreshBorderStyle();
		refreshSVGOriginalColors();
	}


	/**
	 * Refresh svg original colors.
	 */
	private void refreshSVGOriginalColors() {
		if (getPrimaryShape() instanceof IRoundedRectangleFigure) {
			if (getModel() instanceof View) {

				// get the CSS value if SVG use original colors
				boolean useOriginalColors = NotationUtils.getBooleanValue((View) getModel(), USE_ORIGINAL_COLORS, getDefaultUseOriginalColors());

				if (children != null) {
					for (Object object : children) {
						if (object instanceof ShapeDisplayCompartmentEditPart) {
							ShapeDisplayCompartmentEditPart shapeCompartment = (ShapeDisplayCompartmentEditPart) object;
							// Set useOriginalColors to the figure
							shapeCompartment.setUseOriginalColors(useOriginalColors);
						}
					}
				}
			}
		}

	}

	/**
	 * Gets the default setting of use original colors.
	 *
	 * @return the default use original colors
	 */
	protected boolean getDefaultUseOriginalColors() {
		return DEFAULT_USE_ORIGINAL_COLORS;
	}

}
