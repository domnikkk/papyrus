/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Tessier (CEA LIST) - Initial API and implementation
 /*****************************************************************************/
package org.eclipse.papyrus.uml.diagram.tests.edition;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractPapyrusTestCase;


public abstract class EditableElementTest extends AbstractPapyrusTestCase{
	

	public abstract void testEdition(IElementType type);
	public abstract GraphicalEditPart getContainerEditPart();
	
	/**
	 * get the primary figure that correspond to the edipart
	 * @param createdEditpart
	 * @return a Ifigure
	 */
	protected IFigure getPrimaryFigure(GraphicalEditPart createdEditpart) {
		if(createdEditpart.getFigure() instanceof BorderedNodeFigure){
			IFigure nodePlate = (IFigure)((BorderedNodeFigure)createdEditpart.getFigure()).getChildren().get(0);
			// now verify position of each subfigure
			IFigure fig = ((IFigure)nodePlate.getChildren().get(0));
			return fig;
		}
		else{return createdEditpart.getFigure(); }
	}
}
