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

package org.eclipse.papyrus.uml.diagram.statemachine.custom.edit.part;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateExitPointEditPart;

/**
 * @author Mickael ADAM
 *
 */
public class CustomPseudostateExitPointEditPart extends PseudostateExitPointEditPart {

	/**
	 * Constructor.
	 *
	 * @param view
	 */
	public CustomPseudostateExitPointEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.common.editparts.RoundedBorderNamedElementEditPart#getDefaultIsOvalValue()
	 *
	 * @return
	 */
	@Override
	protected boolean getDefaultIsOvalValue() {
		return true;
	}

}
