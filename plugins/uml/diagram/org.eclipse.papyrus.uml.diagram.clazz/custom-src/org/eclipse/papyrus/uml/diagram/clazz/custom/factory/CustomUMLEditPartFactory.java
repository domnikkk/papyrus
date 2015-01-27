/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.clazz.custom.factory;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.AssociationEndSourceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.AssociationEndTargetEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CAssociationClassEndSourceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CAssociationClassEndTargetEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CContainmentCircleEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CDependencyBranchEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CModelEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CModelEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CPackageEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CPackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CSourceISLinkLabelEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CTargetISLinkLabelEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomDurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomDurationObservationFloatingNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomTimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomTimeObservationFloatingNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationClassRoleSourceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationClassRoleTargetEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationSourceNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationTargetNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ContainmentCircleEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DependencyBranchEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DurationObservationFloatingNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ModelEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ModelEditPartTN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SourceISLinkLabelEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.TargetISLinkLabelEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.TimeObservationFloatingNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.UMLEditPartFactory;
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLVisualIDRegistry;

/**
 * this is custom editpart factory to create our own editpart
 */
public class CustomUMLEditPartFactory extends UMLEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UMLVisualIDRegistry.getVisualID(view)) {
			// redefined classes to modify the method createNodePlate
			case PackageEditPart.VISUAL_ID:
				return new CPackageEditPart(view);
			case DurationObservationEditPart.VISUAL_ID:
				return new CustomDurationObservationEditPart(view);
			case TimeObservationEditPart.VISUAL_ID:
				return new CustomTimeObservationEditPart(view);
			case DurationObservationFloatingNameEditPart.VISUAL_ID:
				return new CustomDurationObservationFloatingNameEditPart(view);
			case TimeObservationFloatingNameEditPart.VISUAL_ID:
				return new CustomTimeObservationFloatingNameEditPart(view);
			case PackageEditPartCN.VISUAL_ID:
				return new CPackageEditPartCN(view);
			case ModelEditPartTN.VISUAL_ID:
				return new CModelEditPart(view);
			case ContainmentCircleEditPart.VISUAL_ID:
				return new CContainmentCircleEditPart(view);
			case ModelEditPartCN.VISUAL_ID:
				return new CModelEditPartCN(view);
			case AssociationSourceNameEditPart.VISUAL_ID:
				return new AssociationEndSourceEditPart(view);
			case AssociationTargetNameEditPart.VISUAL_ID:
				return new AssociationEndTargetEditPart(view);
			case AssociationClassRoleSourceEditPart.VISUAL_ID:
				return new CAssociationClassEndSourceEditPart(view);
			case AssociationClassRoleTargetEditPart.VISUAL_ID:
				return new CAssociationClassEndTargetEditPart(view);
			case DependencyBranchEditPart.VISUAL_ID:
				return new CDependencyBranchEditPart(view);
			case ConstraintEditPart.VISUAL_ID:
				return new CustomConstraintEditPart(view);
			case SourceISLinkLabelEditPart.VISUAL_ID:
				return new CSourceISLinkLabelEditPart(view);
			case TargetISLinkLabelEditPart.VISUAL_ID:
				return new CTargetISLinkLabelEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}
}
