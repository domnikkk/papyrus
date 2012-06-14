/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos - Initial API and implementation
 *   Arthur Daussy  -382605: [ClassDiagram] NPE when DND of Property , NestedClass and Operation  with owner in a package
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.editpolicies;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;


/**
 * @author adaussy
 * Avoid NPE when trying to get constraint for a child
 */
public class PapyrusXYLayoutEditPolicy extends XYLayoutEditPolicy {
	
	@Override
	protected Rectangle getCurrentConstraintFor(GraphicalEditPart child) {
		Rectangle constraint = super.getCurrentConstraintFor(child);
		if (constraint == null){
			constraint =  new Rectangle(0, 0, 0, 0);
		}
		return constraint;
	}
}
