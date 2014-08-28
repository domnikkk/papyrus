/*****************************************************************************
 * Copyright (c) 2010 Atos Origin.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.edit.policies;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.CommentEditPartCN;

/**
 * This XY layout edit policy consults children parts for chosing a minimum
 * size.
 * <p/>
 * Special considerations made for reflowable edit parts, with minimum size depending on suggested width.
 */
public class CompartmentXYLayoutEditPolicy extends XYLayoutEditPolicy {

	/**
	 * Fix for #422827
	 * <p/>
	 * We would better override the Dimension.max() logic from the super class but it itself calls super.super so we can't easily do that.
	 * <p/>
	 * So we have to explicitly call {@link #getMinimumSizeForHint(GraphicalEditPart, Dimension)} and ensure that Dimension.max() logic in super-class does not affect results by returning something small from {@link #getMinimumSizeFor(GraphicalEditPart)}
	 */
	@Override
	protected Object getConstraintFor(Request request, GraphicalEditPart child, Rectangle rect) {
		if (isReflowable(child) && request instanceof ChangeBoundsRequest) {
			ChangeBoundsRequest reqImpl = (ChangeBoundsRequest) request;

			Dimension sizeDelta = reqImpl.getSizeDelta();
			if (sizeDelta.width != 0 || sizeDelta.height != 0) {
				Dimension correctedMinSize = getMinimumSizeForHint(child, rect.getSize());
				rect.setSize(Dimension.max(correctedMinSize, rect.getSize()));
			}
		}
		return super.getConstraintFor(request, child, rect);
	}

	/**
	 * Called for reflowable editpart and allows them to compute minimum height based on suggested width.
	 *
	 * @return minimum size computed by using the given width as a hint.
	 */
	protected Dimension getMinimumSizeForHint(GraphicalEditPart child, Dimension hint) {
		IFigure figure = child.getFigure();
		if (figure == null) {
			return super.getMinimumSizeFor(child);
		}
		return figure.getMinimumSize(hint.width, -1);
	}

	/**
	 * Return true if editpart can reflow, that is if it minimum size
	 * is not static but depends on the width.
	 */
	protected boolean isReflowable(GraphicalEditPart editPart) {
		// for now we can check it this way to fix #422827
		return editPart instanceof CommentEditPartCN;
		// more general check will be available after fixing #429197
	}

	/**
	 * Get the static minimum size from child edit part rather than imposing a constant one.
	 * <p/>
	 * Bug #422827 is about this method called for reflowable comments, so the new version of this class should call {@link #getMinimumSizeForHint(GraphicalEditPart, Dimension)} instead.
	 *
	 * @see org.eclipse.gef.editpolicies.XYLayoutEditPolicy#getMinimumSizeFor(org.eclipse.gef.GraphicalEditPart)
	 * @param child
	 *            the child
	 * @return the minumum size
	 */
	@Override
	protected Dimension getMinimumSizeFor(GraphicalEditPart child) {
		if (isReflowable(child)) {
			// call from super class, we need to return something very small
			// because this class will call getMinimumSizeForHint() anyway
			return new Dimension(5, 5);
		}
		if (child.getFigure() != null) {
			return child.getFigure().getMinimumSize();
		}
		return super.getMinimumSizeFor(child);
	}

}
