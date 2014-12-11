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
 *  Emilien Perico (Atos Origin) emilien.perico@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.usecase.custom.edit.parts;

import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.figure.UseCaseNodeFigure;

@Deprecated
// unused
public class CustomUseCaseEditPartTN extends UseCaseEditPartTN {

	public CustomUseCaseEditPartTN(View view) {
		super(view);
	}

	/**
	 * Use custom figure to return EllipseAnchors
	 *
	 */
	@Override
	protected NodeFigure createNodePlate() {
		UseCaseNodeFigure ucFigure = new UseCaseNodeFigure(getMapMode().DPtoLP(140), getMapMode().DPtoLP(60));
		return ucFigure;
	}
}
