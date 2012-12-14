/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.figures.NestedResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.NotationPackage;

@SuppressWarnings("restriction")
public abstract class ResizeableListCompartmentEditPart extends ListCompartmentEditPart {

	public ResizeableListCompartmentEditPart(EObject model) {
		super(model);
	}

	protected static int getMinClientSize() {
		return 2;
	}

	public IFigure createFigure() {
		ResizableCompartmentFigure rcf;
		if(getParent() == getTopGraphicEditPart()) {
			rcf = new ResizableCompartmentFigure(getCompartmentName(), getMapMode()) {

				public Dimension getMinClientDimension() {
					return new Dimension(ResizeableListCompartmentEditPart.getMinClientSize(), ResizeableListCompartmentEditPart.getMinClientSize());
				}
			};
		} else {
			rcf = new NestedResizableCompartmentFigure(getMapMode()) {

				public Dimension getMinClientDimension() {
					return new Dimension(ResizeableListCompartmentEditPart.getMinClientSize(), ResizeableListCompartmentEditPart.getMinClientSize());
				}
			};
		}

		ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
		layout.setStretchMajorAxis(false);
		layout.setStretchMinorAxis(false);
		layout.setMinorAlignment(ConstrainedToolbarLayout.ALIGN_TOPLEFT);
		rcf.getContentPane().setLayoutManager(layout);


		return rcf;
	}

	/**
	 * refresh the bounds
	 */
	protected void refreshBounds() {
		int width = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int height = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();
		Dimension size = new Dimension(width, height);
		int x = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int y = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		Point loc = new Point(x, y);
		((GraphicalEditPart)getParent()).setLayoutConstraint(this, getFigure(), new Rectangle(loc, size));
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshBounds();
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if(NotationPackage.eINSTANCE.getSize_Width().equals(feature) || NotationPackage.eINSTANCE.getSize_Height().equals(feature) || NotationPackage.eINSTANCE.getLocation_X().equals(feature) || NotationPackage.eINSTANCE.getLocation_Y().equals(feature)) {
			refreshBounds();
		}
		super.handleNotificationEvent(notification);
	}

}
