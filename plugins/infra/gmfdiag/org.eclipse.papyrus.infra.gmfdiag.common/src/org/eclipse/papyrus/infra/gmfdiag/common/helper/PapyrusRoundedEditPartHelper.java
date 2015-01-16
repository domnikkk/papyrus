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
package org.eclipse.papyrus.infra.gmfdiag.common.helper;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.NamedStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.StringValueStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.IPapyrusEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.ShapeDisplayCompartmentEditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.node.IRoundedRectangleFigure;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.NamedStyleProperties;

/**
 * The Class RoundedCompartmentEditPart provides refresh method to apply notation properties specific to roundedRectangleFigure
 */
public abstract class PapyrusRoundedEditPartHelper implements NamedStyleProperties {

	/**
	 * Refresh border style.
	 */
	public static void refreshBorderStyle(IPapyrusEditPart editpart, int defaultBorderStyle, int[] defaultLineCustomValue) {
		// get the Figure
		if (editpart.getPrimaryShape() instanceof IRoundedRectangleFigure) {
			IRoundedRectangleFigure roundedRectangleFigure = (IRoundedRectangleFigure) editpart.getPrimaryShape();

			EClass stringValueStyle = NotationPackage.eINSTANCE.getStringValueStyle();

			int borderStyle = defaultBorderStyle;

			if (stringValueStyle != null) {

				if (((GraphicalEditPart) editpart).getModel() instanceof View) {
					// Get the border style on notation
					NamedStyle borderValueStyle = ((View) ((GraphicalEditPart) editpart).getModel()).getNamedStyle(stringValueStyle, BORDER_STYLE);
					// convert the string style name in integer
					if (borderValueStyle instanceof StringValueStyle) {
						String value = ((StringValueStyle) borderValueStyle).getStringValue();

						if (NamedStyleProperties.BorderStyle.DASH.equals(value)) {
							borderStyle = Graphics.LINE_DASH;
						}
						if (NamedStyleProperties.BorderStyle.DASH_DOT.equals(value)) {
							borderStyle = Graphics.LINE_DASHDOT;
						}
						if (NamedStyleProperties.BorderStyle.DASH_DOT_DOT.equals(value)) {
							borderStyle = Graphics.LINE_DASHDOTDOT;
						}
						if (NamedStyleProperties.BorderStyle.DOT.equals(value)) {
							borderStyle = Graphics.LINE_DOT;
						}
						if (NamedStyleProperties.BorderStyle.SOLID.equals(value)) {
							borderStyle = Graphics.LINE_SOLID;
						}
						if (NamedStyleProperties.BorderStyle.CUSTOM.equals(value)) {
							borderStyle = Graphics.LINE_CUSTOM;
						}
					}
				}
			}
			// set the border style of the figure
			roundedRectangleFigure.setBorderStyle(borderStyle);

			// get/set the custom dash value
			int[] customDash = NotationUtils.getIntListValue((View) ((GraphicalEditPart) editpart).getModel(), LINE_CUSTOM_VALUE, defaultLineCustomValue);
			roundedRectangleFigure.setCustomDash(customDash);

		}
	}

	/**
	 * Refresh floating name.
	 */
	public static void refreshFloatingName(IPapyrusEditPart editpart, boolean defaultIsFloatingNameConstrained, int defaultFloatingLabelOffsetWidth, int defaultFloatingLabelOffsetHeight) {
		if (editpart.getPrimaryShape() instanceof IRoundedRectangleFigure) {
			// The figure
			IRoundedRectangleFigure roundedRectangleFigure = (IRoundedRectangleFigure) editpart.getPrimaryShape();

			if (((GraphicalEditPart) editpart).getModel() instanceof View) {
				// Get CSS value for the name attached properties
				boolean isNameConstrained = NotationUtils.getBooleanValue((View) ((GraphicalEditPart) editpart).getModel(), FLOATING_LABEL_CONSTRAINED, defaultIsFloatingNameConstrained);

				// get CSS the value of offset width and height
				int width = NotationUtils.getIntValue((View) ((GraphicalEditPart) editpart).getModel(), FLOATING_LABEL_OFFSET_WIDTH, defaultFloatingLabelOffsetWidth);
				int height = NotationUtils.getIntValue((View) ((GraphicalEditPart) editpart).getModel(), FLOATING_LABEL_OFFSET_HEIGHT, defaultFloatingLabelOffsetHeight);

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
	public static void refreshOval(IPapyrusEditPart editpart, boolean defaultIsOvalValue) {
		if (editpart.getPrimaryShape() instanceof IRoundedRectangleFigure) {
			if (((GraphicalEditPart) editpart).getModel() instanceof View) {
				// The figure
				IRoundedRectangleFigure roundedRectangleFigure = (IRoundedRectangleFigure) editpart.getPrimaryShape();

				// get the CSS value of isOval
				boolean isOval = NotationUtils.getBooleanValue((View) ((GraphicalEditPart) editpart).getModel(), IS_OVAL, defaultIsOvalValue);

				// Set isOval
				roundedRectangleFigure.setOval(isOval);
			}
		}
	}

	/**
	 * Refresh radius.
	 */
	public static void refreshRadius(IPapyrusEditPart editpart, int defaultCornerWidth, int defaultCornerHeight) {
		if (editpart.getPrimaryShape() instanceof IRoundedRectangleFigure) {
			// The figure
			IRoundedRectangleFigure roundedRectangleFigure = (IRoundedRectangleFigure) editpart.getPrimaryShape();

			if (((GraphicalEditPart) editpart).getModel() instanceof View) {
				// get CSS the value of radius Width
				int width = NotationUtils.getIntValue((View) ((GraphicalEditPart) editpart).getModel(), RADIUS_WIDTH, defaultCornerWidth);

				// get CSS the value of radius Height
				int height = NotationUtils.getIntValue((View) ((GraphicalEditPart) editpart).getModel(), RADIUS_HEIGHT, defaultCornerHeight);

				// Set the corner dimension
				roundedRectangleFigure.setCornerDimensions(new Dimension(width, height));
			}
		}
	}

	/**
	 * Refresh svg original colors.
	 */
	public static void refreshSVGOriginalColors(IPapyrusEditPart editpart, boolean defaultUseOriginalColors) {
		if (editpart.getPrimaryShape() instanceof IRoundedRectangleFigure) {
			if (((GraphicalEditPart) editpart).getModel() instanceof View) {

				// get the CSS value if SVG use original colors
				boolean useOriginalColors = NotationUtils.getBooleanValue((View) ((AbstractEditPart) editpart).getModel(), USE_ORIGINAL_COLORS, defaultUseOriginalColors);

				if (((AbstractEditPart) editpart).getChildren() != null) {
					for (Object object : ((AbstractEditPart) editpart).getChildren()) {
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
	 * Refresh has header.
	 *
	 * @param editpart
	 *            the editpart
	 * @param defaultHasHeader
	 *            the default has header
	 */
	public static void refreshHasHeader(IPapyrusEditPart editpart, boolean defaultHasHeader) {
		if (editpart.getPrimaryShape() instanceof IRoundedRectangleFigure) {
			if (((GraphicalEditPart) editpart).getModel() instanceof View) {
				// The figure
				IRoundedRectangleFigure roundedRectangleFigure = (IRoundedRectangleFigure) editpart.getPrimaryShape();

				// get the CSS value of hasHeader
				boolean hasHeader = NotationUtils.getBooleanValue((View) ((GraphicalEditPart) editpart).getModel(), DISPLAY_HEADER, defaultHasHeader);

				// Set hasHeader
				roundedRectangleFigure.setHasHeader(hasHeader);
			}
		}

	}

}
