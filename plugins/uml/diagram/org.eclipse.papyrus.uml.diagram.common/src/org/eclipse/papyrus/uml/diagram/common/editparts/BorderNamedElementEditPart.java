/*****************************************************************************
 * Copyright (c) 2008-2009 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Céline Janssens (All4TEC) celine.janssens@all4tec.net - Bug 440230 : Margin Label
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.editparts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.BorderedBorderItemEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.emf.appearance.helper.NameLabelIconHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.IPapyrusEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.IPapyrusWrappingLabel;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.FigureUtils;
import org.eclipse.papyrus.uml.diagram.common.figure.node.IPapyrusNodeNamedElementFigure;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <pre>
 * Abstract EditPart supporting font and icon management of name and qualified name labels.
 * Similar implementation to {@link NamedElementEditPart} but indirectly inheriting from
 * {@link BorderedBorderItemEditPart} in order to provide support for Affixed Child nodes.
 * </pre>
 */
public abstract class BorderNamedElementEditPart extends BorderUMLNodeEditPart implements IUMLNamedElementEditPart {

	/**
	 * Default Margin when not present in CSS
	 */
	private static final int DEFAULT_MARGIN = NamedElementEditPart.DEFAULT_MARGIN;
	
		
	/**
	 *
	 * Constructor.
	 *
	 * @param view
	 */
	public BorderNamedElementEditPart(View view) {
		super(view);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NamedElement getNamedElement() {
		return (NamedElement) getUMLElement();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);

		if (resolveSemanticElement() != null) {
			refreshIconNamedLabel();
			refreshFontColor();
		}
	}

	/**
	 * Refresh the icon in name label
	 */
	private void refreshIconNamedLabel() {
		getNodeNamedElementFigure().setNameLabelIcon(NameLabelIconHelper.showLabelIcon((View) getModel()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();

		if ((getNodeNamedElementFigure() != null) && (resolveSemanticElement() != null)) {
			refreshIconNamedLabel();
			refreshFontColor();
		}
		refreshLabelMargin();
		refreshBounds();
	}
	


	/**
	 * Refresh margin of bordered named element children labels
	 * <ul>
	 * <li> Get Css values </li>
	 * <li> Get all the children figure </li>
	 * <li> If the child is a label then apply the margin </li>
	 * </ul>
	 */
	private void refreshLabelMargin() {
		IFigure figure = null;

		int horizontalMargin = DEFAULT_MARGIN;
		int verticalMargin= DEFAULT_MARGIN;

		Object model = this.getModel();


		// Get notation Margin values (from CSS)
		if (model instanceof View) {
			horizontalMargin = NotationUtils.getIntValue((View)model, NamedElementEditPart.Y_MARGIN_PROPERTY, DEFAULT_MARGIN);
			verticalMargin = NotationUtils.getIntValue((View)model, NamedElementEditPart.X_MARGIN_PROPERTY, DEFAULT_MARGIN);
		}

		// Get all children figures of the Edit Part and set margin according to the retrieve values
		if (this instanceof IPapyrusEditPart){
			figure = ((IPapyrusEditPart) this).getPrimaryShape();
			List<IPapyrusWrappingLabel> labelChildFigureList = FigureUtils.findChildFigureInstances(figure, IPapyrusWrappingLabel.class);

			for (IPapyrusWrappingLabel label : labelChildFigureList){
				if (label != null){
					label.setMarginLabel(verticalMargin, horizontalMargin);
					
				}
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
		Label qualifiedNameLabel = getNodeNamedElementFigure().getQualifiedNameLabel();
		if (qualifiedNameLabel != null) {
			qualifiedNameLabel.setFont(font);
		}

		// Apply the font to the tagged Label
		Label tagLabel = getNodeNamedElementFigure().getTaggedLabel();
		if (tagLabel != null) {
			tagLabel.setFont(font);
		}
	}

	/**
	 * Get EditPart figure.
	 *
	 * @return the EditPart figure
	 */
	private IPapyrusNodeNamedElementFigure getNodeNamedElementFigure() {
		return (IPapyrusNodeNamedElementFigure) getPrimaryShape();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void setFontColor(Color color) {
		super.setFontColor(color);

		// Qualified Name
		Label qualifiedNameLabel = getNodeNamedElementFigure().getQualifiedNameLabel();
		if (qualifiedNameLabel != null) {
			qualifiedNameLabel.setForegroundColor(color);
		}
		// Tagged Label
		Label tagLabel = getNodeNamedElementFigure().getTaggedLabel();
		if (tagLabel != null) {
			tagLabel.setForegroundColor(color);
		}
	}

}
