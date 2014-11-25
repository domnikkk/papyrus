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
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.usecase.custom.factory;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.usecase.custom.edit.parts.CustomAssociationEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.custom.edit.parts.CustomShortCutDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AssociationEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ShortCutDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UMLEditPartFactory;
import org.eclipse.papyrus.uml.diagram.usecase.part.UMLVisualIDRegistry;

/**
 * this is custom editpart factory to create our own editpart
 */
public class CustomUMLEditPartFactory extends UMLEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UMLVisualIDRegistry.getVisualID(view)) {
			case AssociationEditPart.VISUAL_ID:
				return new CustomAssociationEditPart(view);
			case ShortCutDiagramEditPart.VISUAL_ID:
				return new CustomShortCutDiagramEditPart(view);
				// case UseCaseEditPartTN.VISUAL_ID:
				// return new CustomUseCaseEditPartTN(view);
				// case UseCaseInComponentEditPart.VISUAL_ID:
				// return new CustomUseCaseInComponentEditPart(view);
				// case UseCaseInPackageEditPart.VISUAL_ID:
				// return new CustomUseCaseInPackageEditPart(view);
				// case UseCasePointsEditPartTN.VISUAL_ID:
				// return new CustomUseCasePointsEditPartTN(view);
			}
		}
		return super.createEditPart(context, model);
	}
}
