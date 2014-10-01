package org.eclipse.papyrus.uml.diagram.common.editparts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.notation.BooleanValueStyle;
import org.eclipse.gmf.runtime.notation.IntValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.StringValueStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IRoundedRectangleFigure;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.ShowHideCompartmentEditPolicy;


public abstract class RoundedBorderNamedElementEditPart extends BorderNamedElementEditPart {

	/**
	 * Constructor.
	 *
	 * @param view
	 */
	public RoundedBorderNamedElementEditPart(View view) {
		super(view);
	}

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


	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.NamedElementEditPart#createDefaultEditPolicies()
	 *
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

			// get CSS the value of radius Width
			StringValueStyle borderValueStyle = (StringValueStyle) ((View) getModel()).getNamedStyle(NotationPackage.eINSTANCE.getStringValueStyle(), BORDER_STYLE);

			// change style to int from string
			int borderStyle = getDefaultBorderStyle();
			;
			if (borderValueStyle != null) {
				if ("dash".equals(borderValueStyle.getStringValue())) {
					borderStyle = Graphics.LINE_DASH;
				}
				if ("dashDot".equals(borderValueStyle.getStringValue())) {
					borderStyle = Graphics.LINE_DASHDOT;
				}
				if ("dashDotDot".equals(borderValueStyle.getStringValue())) {
					borderStyle = Graphics.LINE_DASHDOTDOT;
				}
				if ("dot".equals(borderValueStyle.getStringValue())) {
					borderStyle = Graphics.LINE_DOT;
				}
				if ("solid".equals(borderValueStyle.getStringValue())) {
					borderStyle = Graphics.LINE_SOLID;
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
	}
}
