/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.common.editparts;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @author Mickael ADAM
 *
 */
public abstract class AbstractInteractionEditPart extends RoundedCompartmentEditPart {

	/**
	 * Constructor.
	 *
	 * @param view
	 */
	public AbstractInteractionEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedCompartmentEditPart#getDefaultHasHeader()
	 *
	 * @return
	 */
	@Override
	protected boolean getDefaultHasHeader() {
		return true;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.NamedElementEditPart#getDefaultNamePosition()
	 *
	 * @return
	 */
	@Override
	protected int getDefaultNamePosition() {
		return PositionConstants.LEFT;
	}

}