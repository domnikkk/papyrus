/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - moved class behavior from classiferEditPart
 * 
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.common.editparts;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.figure.node.ClassFigure;
import org.eclipse.papyrus.uml.diagram.common.figure.node.ClassifierFigure;

/**
 * Class edit part.
 * 
 */
public abstract class ClassEditPart extends ClassifierEditPart {

	/**
	 * Instantiates a new class edit part.
	 *
	 * @param view
	 *        the view
	 */
	public ClassEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.ClassifierEditPart#refreshVisuals()
	 *
	 */
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		if(getPrimaryShape() != null && resolveSemanticElement() != null) {
			refreshIsActive();
		}
	}

	/**
	 * Refresh is active.
	 *
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.ClassifierEditPart#refreshIsActive()
	 */
	protected void refreshIsActive() {
		if(getUMLElement() instanceof org.eclipse.uml2.uml.Class) {
			if(getPrimaryShape() instanceof ClassifierFigure) {
				((ClassFigure)getPrimaryShape()).setActive(((org.eclipse.uml2.uml.Class)getUMLElement()).isActive());
			}
		}
	}

}
