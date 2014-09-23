/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Céline Janssens (ALL4TEC) celine.janssens@all4tec.net
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Bug 443235
 *  Mickaël ADAM (ALL4TEC) mickael.adam@all4tec.net - text alignment implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.editpart;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.figures.ResizableLabelLocator;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.StringValueStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.BorderDisplayEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.LabelAlignmentEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.LabelPrimarySelectionEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.RefreshTextAlignmentEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.IPapyrusWrappingLabel;
import org.eclipse.papyrus.infra.gmfdiag.common.locator.IPapyrusBorderItemLocator;
import org.eclipse.papyrus.infra.gmfdiag.common.locator.PapyrusLabelLocator;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;


public abstract class PapyrusLabelEditPart extends LabelEditPart {


	/**
	 * Default Margin when not present in CSS
	 */
	static final int DEFAULT_MARGIN = 0;

	/**
	 * CSS Integer property to define the horizontal Label Margin
	 */
	static final String X_MARGIN_PROPERTY = "xMarginLabel"; //$NON-NLS$

	/**
	 * CSS Integer property to define the vertical Label Margin
	 */
	static final String Y_MARGIN_PROPERTY = "yMarginLabel"; //$NON-NLS$

	/** The Constant TEXT_ALIGNMENT. */
	private static final String TEXT_ALIGNMENT = "textAlignment"; //$NON-NLS$

	/** The Constant LABEL_OFFSET_Y. */
	private static final String LABEL_OFFSET_Y = "labelOffsetY"; //$NON-NLS$

	/** The Constant LABEL_OFFSET_X. */
	private static final String LABEL_OFFSET_X = "labelOffsetX"; //$NON-NLS$

	/** The Constant LABEL_CONSTRAINED. */
	private static final String LABEL_CONSTRAINED = "labelConstrained"; //$NON-NLS$

	/** The label locator. */
	protected PapyrusLabelLocator labelLocator;

	/** The external label locator. */
	protected IPapyrusBorderItemLocator externalLabelLocator;


	public PapyrusLabelEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();

		installEditPolicy(BorderDisplayEditPolicy.BORDER_DISPLAY_EDITPOLICY, new BorderDisplayEditPolicy());
		installEditPolicy(LabelAlignmentEditPolicy.LABEL_ALIGNMENT_KEY, new LabelAlignmentEditPolicy());
		installEditPolicy(LabelPrimarySelectionEditPolicy.LABEL_PRIMARY_SELECTION_KEY, new LabelPrimarySelectionEditPolicy());
		installEditPolicy(RefreshTextAlignmentEditPolicy.REFRESH_TEXT_ALIGNMENT_EDITPOLICY, new RefreshTextAlignmentEditPolicy());
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart#refreshVisuals()
	 *
	 */
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshLabelMargin();
	}

	/**
	 * Refresh bounds.
	 *
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart#refreshBounds()
	 */
	@Override
	public void refreshBounds() {
		// try to handle both of resizable and nonresizable labels
		if (isResizable()) {
			handleResizableRefreshBounds();
		} else {
			handleNonResizableRefreshBoundS();
		}
	}

	/**
	 * Handle non resizable refresh bound s.
	 */
	private void handleNonResizableRefreshBoundS() {
		int dx = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int dy = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();

		Point offset = new Point(dx, dy);

		if (getParent() instanceof AbstractConnectionEditPart) {

			AbstractGraphicalEditPart parentEditPart = (AbstractGraphicalEditPart) getParent();

			Connection connectionFigure = ((AbstractConnectionEditPart) getParent()).getConnectionFigure();

			if (labelLocator != null) {
				labelLocator.setOffset(offset);
			} else {
				labelLocator = new PapyrusLabelLocator(connectionFigure, offset, getKeyPoint());
			}
			labelLocator.setTextAlignment(getTextAlignment());
			labelLocator.setView((View) getModel());
			parentEditPart.setLayoutConstraint(this, getFigure(), labelLocator);

		} else {
			setExternalLabelLocator(offset);
			getFigure().getParent().setConstraint(getFigure(), externalLabelLocator);
		}
	}

	/**
	 * Sets the external label locator.
	 *
	 * @param offset
	 *            the new external label locator
	 */
	private void setExternalLabelLocator(Point offset) {
		if (externalLabelLocator == null) {
			externalLabelLocator = (IPapyrusBorderItemLocator) getBorderItemLocator();
		}
		if (offset != null) {
			externalLabelLocator.setConstraint(new Rectangle(offset.x, offset.y, 0, 0));
		}
		externalLabelLocator.setView((View) getModel());
		externalLabelLocator.setTextAlignment(getTextAlignment());
		externalLabelLocator.setPosition(getPositionOnParent());
	}

	/**
	 * Gets the border item locator.
	 *
	 * @return the border item locator
	 */
	public Object getBorderItemLocator() {
		IFigure parentFigure = getFigure().getParent();
		if (parentFigure != null && parentFigure.getLayoutManager() != null) {
			Object constraint = parentFigure.getLayoutManager().getConstraint(getFigure());
			return constraint;
		}
		return null;
	}

	/**
	 * Gets the text alignment.
	 *
	 * @return the text alignment
	 */
	public int getTextAlignment() {
		// get the value of the CSS property
		View model = (View) getModel();
		// View eContainer = (View) model.eContainer();// Pas sur le eContainer
		StringValueStyle labelAlignment = (StringValueStyle) model.getNamedStyle(NotationPackage.eINSTANCE.getStringValueStyle(), TEXT_ALIGNMENT);

		int textAlignment = 0;
		if (labelAlignment != null) {
			if ("left".equals(labelAlignment.getStringValue())) {
				textAlignment = PositionConstants.LEFT;
			}
			if ("right".equals(labelAlignment.getStringValue())) {
				textAlignment = PositionConstants.RIGHT;
			}
			if ("center".equals(labelAlignment.getStringValue())) {
				textAlignment = PositionConstants.CENTER;
			}
		} else {
			textAlignment = getDefaultTextAlignment();
		}
		return textAlignment;
	}

	/**
	 * Handle resizable refresh bounds.
	 */
	private void handleResizableRefreshBounds() {
		int dx = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int dy = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		int width = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int height = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();

		Rectangle rectangle = new Rectangle(dx, dy, width, height);
		if (getParent() instanceof AbstractConnectionEditPart) {
			((AbstractGraphicalEditPart) getParent()).setLayoutConstraint(this,
					getFigure(), new ResizableLabelLocator(((AbstractConnectionEditPart) getParent()).getConnectionFigure(), rectangle, getKeyPoint()));
		} else {
			getFigure().getParent().setConstraint(getFigure(), new ResizableLabelLocator(getFigure().getParent(), rectangle, getKeyPoint()));
		}
	}

	/**
	 * Checks if is resizable.
	 *
	 * @return true, if is resizable
	 */
	private boolean isResizable() {
		EditPolicy editPolicy = getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		if (editPolicy instanceof ResizableEditPolicy) {
			return true;
		}
		return false;
	}

	/**
	 * Refresh label offset.
	 */
	private void refreshLabelOffset() {
		// get the value of the CSS property
		Object model = getModel();
		if (model instanceof View) {
			int labelOffsetX = NotationUtils.getIntValue((View) getModel(), LABEL_OFFSET_X, getDefaultLabelOffsetX());
			int labelOffsetY = NotationUtils.getIntValue((View) getModel(), LABEL_OFFSET_Y, getDefaultLabelOffsetY());

			// set the value on the locator
			((IPapyrusBorderItemLocator) getBorderItemLocator()).setOffset(new Dimension(labelOffsetX, labelOffsetY));
		}
	}

	/**
	 * Refresh label constrained.
	 */
	private void refreshLabelConstrained() {
		// get the value of the CSS property
		Object model = getModel();
		if (model instanceof View) {
			boolean labelConstrained = NotationUtils.getBooleanValue((View) getModel(), LABEL_CONSTRAINED, getDefaultLabelConstrained());
			// set the value on the locator
			((IPapyrusBorderItemLocator) getBorderItemLocator()).setConstrained(labelConstrained);
		}
		// Set the position from the parent position
		((IPapyrusBorderItemLocator) getBorderItemLocator()).setPosition(getPositionOnParent());
	}

	/**
	 * Refresh label text alignement.
	 */
	private void refreshLabelTextAlignement() {
		((IPapyrusBorderItemLocator) getBorderItemLocator()).setTextAlignment(getTextAlignment());
	}

	/**
	 * Gets the position on parent.
	 *
	 * @return the position on parent
	 */
	public int getPositionOnParent() {
		Rectangle portBounds = null;
		Rectangle parentBounds = null;
		int position = PositionConstants.EAST;

		// Get the port figure
		if (getParent() instanceof IPapyrusEditPart) {
			IFigure portPrimaryShape = ((IPapyrusEditPart) getParent()).getPrimaryShape();
			portBounds = portPrimaryShape.getBounds();

			// Get the port's parent figure
			// if it's a papyrus edit part and the figure is paint(width !=0)
			if (getParent().getParent() instanceof IPapyrusEditPart && portBounds.width != 0) {
				IFigure parentPrimaryShape = ((IPapyrusEditPart) getParent().getParent()).getPrimaryShape();
				parentBounds = parentPrimaryShape.getBounds();

				if (portBounds.x + portBounds.width / 2 == parentBounds.x) {
					// West position
					position = PositionConstants.WEST;
				} else if (portBounds.x + portBounds.width / 2 == parentBounds.getBottomRight().x) {
					// East Position
					position = PositionConstants.EAST;
				} else if (portBounds.y + portBounds.height / 2 == parentBounds.y) {
					position = PositionConstants.NORTH;
				} else if (portBounds.y + portBounds.height / 2 == parentBounds.getBottomRight().y) {
					position = PositionConstants.SOUTH;
				}
			}
		}

		return position;
	}

	/**
	 * Gets the default label offset y.
	 *
	 * @return the default label offset y
	 */
	protected int getDefaultLabelOffsetY() {
		return 0;
	}

	/**
	 * Gets the default label offset x.
	 *
	 * @return the default label offset x
	 */
	protected int getDefaultLabelOffsetX() {
		return 0;
	}

	/**
	 * Gets the default label constrained.
	 *
	 * @return the default label constrained
	 */
	protected boolean getDefaultLabelConstrained() {
		return false;
	}

	/**
	 * Gets the default text alignment.
	 *
	 * @return the default text alignment
	 */
	protected int getDefaultTextAlignment() {
		return PositionConstants.CENTER;
	}

	/**
	 * 
	 */
	public void refreshLabelMargin() {
		IFigure figure = null;

		int horizontalMargin = DEFAULT_MARGIN;
		int verticalMargin = DEFAULT_MARGIN;

		Object model = this.getModel();



		if (model instanceof View) {
			horizontalMargin = NotationUtils.getIntValue((View) model, Y_MARGIN_PROPERTY, DEFAULT_MARGIN);
			verticalMargin = NotationUtils.getIntValue((View) model, X_MARGIN_PROPERTY, DEFAULT_MARGIN);
		}

		figure = ((GraphicalEditPart) this).getFigure();

		if (figure instanceof IPapyrusWrappingLabel) {
			((IPapyrusWrappingLabel) figure).setMarginLabel(verticalMargin,horizontalMargin);
		}

	}

}