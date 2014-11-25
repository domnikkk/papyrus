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

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.BooleanValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.StringValueStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.emf.appearance.helper.AppearanceHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.IPapyrusEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.FollowSVGSymbolEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.NameDisplayEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.IPapyrusWrappingLabel;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.SelectableBorderedNodeFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.FigureUtils;
import org.eclipse.papyrus.uml.diagram.common.figure.node.IPapyrusNodeNamedElementFigure;
import org.eclipse.papyrus.uml.diagram.common.figure.node.NodeNamedElementFigure;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.uml2.uml.NamedElement;

/**
 * this editpart manage the font and icon of the name label and qualified name
 * label.
 *
 */
public abstract class NamedElementEditPart extends UMLNodeEditPart implements IUMLNamedElementEditPart {

	/** The Constant NAME_POSITION. */
	public static final String NAME_POSITION = "namePosition";

	/** CSS boolean property controlling whether stereotypes should be displayed. */
	public static final String DISPLAY_STEREOTYPES = "displayStereotypes"; // $NON-NLS$

	/** CSS boolean property controlling whether tags should be displayed. */
	public static final String DISPLAY_TAGS = "displayTags"; // $NON-NLS$

	/** Default Margin when not present in CSS. */
	public static final int DEFAULT_MARGIN = 0;

	/** CSS Integer property to define the horizontal Label Margin. */
	public static final String TOP_MARGIN_PROPERTY = "topMarginLabel"; // $NON-NLS$

	/** CSS Integer property to define the vertical Label Margin. */
	public static final String LEFT_MARGIN_PROPERTY = "leftMarginLabel"; // $NON-NLS$

	/** CSS Integer property to define the horizontal Label Margin. */
	public static final String BOTTOM_MARGIN_PROPERTY = "bottomMarginLabel"; // $NON-NLS$

	/** CSS Integer property to define the vertical Label Margin. */
	public static final String RIGHT_MARGIN_PROPERTY = "rightMarginLabel"; // $NON-NLS$



	/**
	 * {@inheritDoc}
	 */
	public NamedElementEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.IUMLNamedElementEditPart#getNamedElement()
	 *
	 * @return
	 */
	@Override
	public NamedElement getNamedElement() {
		return (NamedElement) getUMLElement();
	}

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);

		// set the figure active when the feature of the of a class is true
		if (resolveSemanticElement() != null) {
			refreshIconNamedLabel();
			refreshFontColor();
		}
	}

	/**
	 * Refresh icon named label.
	 */
	private void refreshIconNamedLabel() {
		getNodeNamedElementFigure().setNameLabelIcon(AppearanceHelper.showElementIcon((View) getModel()));
	}


	/**
	 * Refresh.
	 *
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.UMLNodeEditPart#refresh()
	 */
	@Override
	public void refresh() {
		refreshNamePosition();
		super.refresh();
	}

	/**
	 * Refresh visuals.
	 *
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.UMLNodeEditPart#refreshVisuals()
	 */
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		if (getNodeNamedElementFigure() != null && resolveSemanticElement() != null) {
			refreshIconNamedLabel();
			refreshFontColor();
			refreshLabelDisplay();
			refreshLabelMargin();
		}
	}


	/**
	 * Refresh name position.
	 */
	private void refreshNamePosition() {
		if (getPrimaryShape() instanceof NodeNamedElementFigure) {
			((NodeNamedElementFigure) getPrimaryShape()).setNamePosition(getNamePosition());
		}
	}


	/**
	 * Gets the name position.
	 *
	 * @return the name position
	 */
	public int getNamePosition() {
		// get the value of the CSS property
		View model = (View) getModel();
		StringValueStyle labelAlignment = (StringValueStyle) model.getNamedStyle(NotationPackage.eINSTANCE.getStringValueStyle(), NAME_POSITION);

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
			textAlignment = getDefaultNamePosition();
		}
		return textAlignment;
	}


	/**
	 * Gets the default name position.
	 *
	 * @return the default name position
	 */
	protected int getDefaultNamePosition() {
		return PositionConstants.CENTER;
	}

	/**
	 * Refresh margin of named element children labels
	 * <ul>
	 * <li>Get Css values</li>
	 * <li>Get all the children figure</li>
	 * <li>If the child is a label then apply the margin</li>
	 * </ul>
	 * .
	 */
	private void refreshLabelMargin() {
		IFigure figure = null;

		int leftMargin = DEFAULT_MARGIN;
		int rightMargin = DEFAULT_MARGIN;
		int topMargin = DEFAULT_MARGIN;
		int bottomMargin = DEFAULT_MARGIN;

		Object model = this.getModel();



		if (model instanceof View) {
			leftMargin = NotationUtils.getIntValue((View) model, LEFT_MARGIN_PROPERTY, DEFAULT_MARGIN);
			rightMargin = NotationUtils.getIntValue((View) model, RIGHT_MARGIN_PROPERTY, DEFAULT_MARGIN);
			topMargin = NotationUtils.getIntValue((View) model, TOP_MARGIN_PROPERTY, DEFAULT_MARGIN);
			bottomMargin = NotationUtils.getIntValue((View) model, BOTTOM_MARGIN_PROPERTY, DEFAULT_MARGIN);
		}

		// Get all children figures of the Edit Part and set margin according to the retrieve values
		if (this instanceof IPapyrusEditPart) {
			figure = ((IPapyrusEditPart) this).getPrimaryShape();
			List<IPapyrusWrappingLabel> labelChildFigureList = FigureUtils.findChildFigureInstances(figure, IPapyrusWrappingLabel.class);

			for (IPapyrusWrappingLabel label : labelChildFigureList) {
				if (label != null) {
					label.setMarginLabel(leftMargin, topMargin, rightMargin, bottomMargin);
				}
			}
		}


	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart#activate()
	 *
	 */
	@Override
	public void activate() {
		super.activate();
	}

	/**
	 * Refresh label display.
	 */
	protected void refreshLabelDisplay() {
		View view = getNotationView();
		// SVGNodePlate can be null!
		if (svgNodePlate != null) {
			if (svgNodePlate.hasLabelBounds()) {
				getNodeNamedElementFigure().getNameLabel().setTextWrap(true);
			}
			else {
				getNodeNamedElementFigure().getNameLabel().setTextWrap(false);
			}
		}
		BooleanValueStyle displayNameStyle = (BooleanValueStyle) view.getNamedStyle(NotationPackage.eINSTANCE.getBooleanValueStyle(), NameDisplayEditPolicy.DISPLAY_NAME);
		BooleanValueStyle displayStereotypes = (BooleanValueStyle) view.getNamedStyle(NotationPackage.eINSTANCE.getBooleanValueStyle(), DISPLAY_STEREOTYPES);
		BooleanValueStyle displayTags = (BooleanValueStyle) view.getNamedStyle(NotationPackage.eINSTANCE.getBooleanValueStyle(), DISPLAY_TAGS);
		if (displayNameStyle != null && !displayNameStyle.isBooleanValue()) {
			getNodeNamedElementFigure().removeNameLabel();
			getNodeNamedElementFigure().removeStereotypeLabel();
			getNodeNamedElementFigure().removeTaggedLabel();
		} else {
			getNodeNamedElementFigure().restoreNameLabel();
			if (displayStereotypes != null && !displayStereotypes.isBooleanValue()) {
				getNodeNamedElementFigure().removeStereotypeLabel();
			} else {
				getNodeNamedElementFigure().restoreStereotypeLabel();
			}
			if (displayTags != null && !displayTags.isBooleanValue()) {
				getNodeNamedElementFigure().removeTaggedLabel();
			} else {
				getNodeNamedElementFigure().restoreTaggedLabel();
			}
		}
	}

	/**
	 * A method to specify the labels to be update when the font is refreshed.
	 * Subclasses should call super.refreshLabelsFont(font)
	 *
	 * @param font
	 *            the font to use
	 */
	@Override
	protected void refreshLabelsFont(Font font) {
		super.refreshLabelsFont(font);
		// Apply the font to the Name Label
		getNodeNamedElementFigure().getNameLabel().setFont(font);
		// Apply the font to the Qualified Name
		if (getNodeNamedElementFigure().getQualifiedNameLabel() != null) {
			getNodeNamedElementFigure().getQualifiedNameLabel().setFont(font);
		}
		// Apply the font to the tagged Label
		if (getNodeNamedElementFigure().getTaggedLabel() != null) {
			getNodeNamedElementFigure().getTaggedLabel().setFont(font);
		}
	}

	/**
	 * Gets the node named element figure.
	 *
	 * @return the node named element figure
	 */
	private IPapyrusNodeNamedElementFigure getNodeNamedElementFigure() {
		return (IPapyrusNodeNamedElementFigure) getPrimaryShape();
	}

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	protected void setFontColor(Color color) {
		super.setFontColor(color);
		// Qualified Name
		if (getNodeNamedElementFigure().getQualifiedNameLabel() != null) {
			getNodeNamedElementFigure().getQualifiedNameLabel().setForegroundColor(color);
		}
		// TaggedLabel
		if (getNodeNamedElementFigure().getTaggedLabel() != null) {
			getNodeNamedElementFigure().getTaggedLabel().setForegroundColor(color);
		}
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.UMLNodeEditPart#createDefaultEditPolicies()
	 *
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(NameDisplayEditPolicy.NAME_DISPLAY_EDITPOLICY, new NameDisplayEditPolicy());
		installEditPolicy(FollowSVGSymbolEditPolicy.FOLLOW_SVG_SYMBOL_EDITPOLICY, new FollowSVGSymbolEditPolicy());
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart#createNodeFigure()
	 *
	 * @return
	 */
	@Override
	protected NodeFigure createNodeFigure() {
		return new SelectableBorderedNodeFigure(createMainFigureWithSVG());
	}

}
