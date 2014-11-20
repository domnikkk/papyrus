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
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SourceISLinkLabelEditPart;

/**
 * Custom Edit Part for {@link SourceISLinkLabelEditPart}.
 * 
 * @author Gabriel Pascual
 *
 */
public class CSourceISLinkLabelEditPart extends SourceISLinkLabelEditPart {

	/**
	 * Constructor.
	 *
	 * @param view
	 *            the view
	 */
	public CSourceISLinkLabelEditPart(View view) {
		super(view);
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SourceISLinkLabelEditPart#getParserElement()
	 *
	 * @return
	 */
	@Override
	protected EObject getParserElement() {

		// Resolve the semantic source
		return ((GraphicalEditPart) ((ConnectionEditPart) getParent()).getTarget()).resolveSemanticElement();
	}

}
