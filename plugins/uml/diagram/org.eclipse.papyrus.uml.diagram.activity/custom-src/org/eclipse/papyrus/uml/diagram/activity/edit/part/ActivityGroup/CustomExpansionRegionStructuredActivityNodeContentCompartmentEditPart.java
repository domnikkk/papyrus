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
 *   Arthur Daussy - arthur.daussy@atos.net - Bug 368932 - [ActivitiyDiagram] Prevent Compartment of Activity group to be selected
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.edit.part.ActivityGroup;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionRegionStructuredActivityNodeContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.common.service.AspectUnspecifiedTypeCreationTool;

/**
 * Set in order to have Generation Gap Pattern.
 *
 * @author arthur daussy
 *
 */
public class CustomExpansionRegionStructuredActivityNodeContentCompartmentEditPart extends ExpansionRegionStructuredActivityNodeContentCompartmentEditPart implements IGroupCompartmentEditPart {

	public CustomExpansionRegionStructuredActivityNodeContentCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * Remove top border
	 */
	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		// remove the top border
		result.setBorder(null);
		return result;
	}

	/**
	 * Unselectable EditPart
	 */
	@Override
	public boolean isSelectable() {
		return false;
	}

	@Override
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof AspectUnspecifiedTypeCreationTool.CreateAspectUnspecifiedTypeRequest) {
			List<?> createElementsTypes = ((AspectUnspecifiedTypeCreationTool.CreateAspectUnspecifiedTypeRequest) request).getElementTypes();
			if (areAllNodesAffixed(createElementsTypes)) {
				return getParent();
			}
		}
		return super.getTargetEditPart(request);
	}

	private boolean areAllNodesAffixed(List<?> types) {
		for (Object type : types) {
			if (!isAffixedNodeType(type)) {
				return false;
			}
		}
		return true;
	}

	private boolean isAffixedNodeType(Object type) {
		return UMLElementTypes.ExpansionNode_3074.equals(type) || UMLElementTypes.ExpansionNode_3075.equals(type);
	}
}
