package org.eclipse.papyrus.uml.diagram.common.editparts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IRoundedRectangleFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.helper.PapyrusRoundedEditPartHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.ShowHideCompartmentEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.locator.PortPositionLocator;


public abstract class RoundedBorderNamedElementEditPart extends BorderNamedElementEditPart {

	/** The port position namedStyle property */
	private static final String PORT_POSITION = "portPosition";

	/** The Constant DEFAULT_BORDER_STYLE. */
	private static final int DEFAULT_BORDER_STYLE = Graphics.LINE_SOLID;

	/** The Constant DEFAULT_CORNER_HEIGHT. */
	private static final int DEFAULT_CORNER_HEIGHT = 0;

	/** The Constant DEFAULT_CORNER_WIDTH. */
	private static final int DEFAULT_CORNER_WIDTH = 0;

	private static final int[] DEFAULT_CUTOM_DASH = new int[] { 5, 5 };

	/** The Constant DEFAULT_FLOATING_LABEL_OFFSET_HEIGHT. */
	private static final int DEFAULT_FLOATING_LABEL_OFFSET_HEIGHT = 0;

	/** The Constant DEFAULT_FLOATING_LABEL_OFFSET_WIDTH. */
	private static final int DEFAULT_FLOATING_LABEL_OFFSET_WIDTH = 0;

	/** The Constant DEFAULT_IS_FLOATING_LABEL_CONSTRAINED. */
	private static final boolean DEFAULT_IS_FLOATING_LABEL_CONSTRAINED = false;

	/** The Constant DEFAULT_IS_OVAL. */
	private static final boolean DEFAULT_IS_OVAL = false;

	private static final boolean DEFAULT_USE_ORIGINAL_COLORS = true;

	private static final boolean DEFAULT_HAS_HEADER = false;

	private static final String DEFAULT_PORT_POSITION_VALUE = "onLine";

	/**
	 * Constructor.
	 *
	 * @param view
	 */
	public RoundedBorderNamedElementEditPart(View view) {
		super(view);
	}


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

	private int[] getDefaultCutomDash() {
		return DEFAULT_CUTOM_DASH;
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
	 * @return
	 */
	private boolean getDefaultUseOriginalColors() {
		return DEFAULT_USE_ORIGINAL_COLORS;
	}

	/**
	 * Refresh visuals.
	 *
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.NamedElementEditPart#refreshVisuals()
	 */
	@Override
	protected void refreshVisuals() {
		PapyrusRoundedEditPartHelper.refreshRadius(this, getDefaultCornerWidth(), getDefaultCornerHeight());
		PapyrusRoundedEditPartHelper.refreshOval(this, getDefaultIsOvalValue());
		PapyrusRoundedEditPartHelper.refreshFloatingName(this, getDefaultIsFloatingNameConstrained(), getDefaultFloatingLabelOffsetWidth(), getDefaultFloatingLabelOffsetHeight());
		PapyrusRoundedEditPartHelper.refreshBorderStyle(this, getDefaultBorderStyle(), getDefaultCutomDash());
		PapyrusRoundedEditPartHelper.refreshSVGOriginalColors(this, getDefaultUseOriginalColors());
		PapyrusRoundedEditPartHelper.refreshHasHeader(this, getDefaultHasHeader());
		refreshPortPosition();
		super.refreshVisuals();
	}

	/**
	 * Refresh the port position
	 */
	private void refreshPortPosition() {
		if (getPrimaryShape() instanceof IRoundedRectangleFigure) {
			if (getModel() instanceof View) {
				Object constraint = ((AbstractBorderedShapeEditPart) getParent()).getBorderedFigure().getBorderItemContainer().getLayoutManager().getConstraint(getFigure());
				if (constraint instanceof PortPositionLocator) {
					PortPositionLocator portLocator = (PortPositionLocator) constraint;
					String position = NotationUtils.getStringValue((View) getModel(), PORT_POSITION, "onLine");
					portLocator.setPortPosition(position);
				}
			}
		}
	}

	/**
	 * get the default Port Position(can be inside, outside or onLine).
	 */
	protected String getDefaultPortPosition() {
		return DEFAULT_PORT_POSITION_VALUE;
	}

	/**
	 * @return
	 */
	protected boolean getDefaultHasHeader() {
		return DEFAULT_HAS_HEADER;
	}
}
