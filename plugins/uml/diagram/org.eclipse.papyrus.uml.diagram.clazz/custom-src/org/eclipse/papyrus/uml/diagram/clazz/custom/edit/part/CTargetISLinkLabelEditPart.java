/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.TargetISLinkLabelEditPart;

/**
 * Custom Edit Part for {@link TargetISLinkLabelEditPart}.
 * 
 * @author Gabriel Pascual
 *
 */
public class CTargetISLinkLabelEditPart extends TargetISLinkLabelEditPart {

	/**
	 * Constructor.
	 *
	 * @param view
	 */
	public CTargetISLinkLabelEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.clazz.edit.parts.TargetISLinkLabelEditPart#getParserElement()
	 *
	 * @return
	 */
	@Override
	protected EObject getParserElement() {

		// Resolve semantic target
		return ((GraphicalEditPart) ((ConnectionEditPart) getParent()).getSource()).resolveSemanticElement();
	}

}
