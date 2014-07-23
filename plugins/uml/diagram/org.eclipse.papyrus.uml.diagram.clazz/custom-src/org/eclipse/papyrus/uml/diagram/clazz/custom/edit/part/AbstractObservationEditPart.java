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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.editparts.IUMLNamedElementEditPart;
import org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart;

/**
 * 
 * 
 */
//TODO to delete
public abstract class AbstractObservationEditPart extends RoundedCompartmentEditPart implements IUMLNamedElementEditPart {

	public AbstractObservationEditPart(View view) {
		super(view);
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	protected void refreshBounds() {
		//used to forbid resize
		//		int width = 20;
		//		int height = 20;
		//		Dimension size = new Dimension(width, height);
		//		int x = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		//		int y = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		//		Point loc = new Point(x, y);
		//		((GraphicalEditPart)getParent()).setLayoutConstraint(this, getFigure(), new Rectangle(loc, size));
		super.refreshBounds();
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		// set the figure active when the feature of the of a class is true
		//		if(resolveSemanticElement() != null) {
		//			refreshFontColor();
		//			// To adapt the display of the container to the icon!
		//			refreshBounds();
		//		}
	}
}
