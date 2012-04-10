/*****************************************************************************
 * Copyright (c) 2012 ATOS.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Olivier Mélois (ATOS) - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.papyrus.sysml.diagram.requirement.factory;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.clazz.custom.factory.CustomUMLeditPartFactory;
import org.eclipse.papyrus.sysml.diagram.common.utils.SysMLGraphicalTypes;
import org.eclipse.papyrus.sysml.diagram.requirement.edit.part.RequirementEditPart;
import org.eclipse.papyrus.sysml.diagram.requirement.edit.part.RequirementInformationCompartmentEditPart;
import org.eclipse.papyrus.sysml.diagram.requirement.edit.part.RequirementIdLabelEditPart;
import org.eclipse.papyrus.sysml.diagram.requirement.edit.part.RequirementTextLabelEditPart;

public class RequirementEditPartFactory extends CustomUMLeditPartFactory{

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if(model instanceof View) {
			View view = (View)model;
			if(view.getType().equals(SysMLGraphicalTypes.COMPARTMENT_SYSML_REQUIREMENT_IDINFO_AS_LIST_ID)){
				return new RequirementInformationCompartmentEditPart(view);
			}
			if(view.getType().equals(SysMLGraphicalTypes.SHAPE_SYSML_REQUIREMENT_AS_CLASSIFER_ID)){
				return new RequirementEditPart(view);
			}
			if(view.getType().equals(SysMLGraphicalTypes.LABEL_SYSML_REQUIREMENT_ID_ID)){
				return new RequirementIdLabelEditPart(view);
			}
			if(view.getType().equals(SysMLGraphicalTypes.LABEL_SYSML_REQUIREMENT_TEXT_ID)){
				return new RequirementTextLabelEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}
	
}
