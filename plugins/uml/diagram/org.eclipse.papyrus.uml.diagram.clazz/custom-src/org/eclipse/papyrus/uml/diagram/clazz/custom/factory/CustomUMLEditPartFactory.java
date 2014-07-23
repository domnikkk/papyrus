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
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CAssociationNodeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CContainmentCircleEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CDependencyBranchEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CDependencyNodeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CModelEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CModelEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CPackageEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CPackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomAssociationClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomClassEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomComponentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomDataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomDataTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomDurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomDurationObservationFloatingNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomEnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomEnumerationEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomInformationItemEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomInformationItemEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomInstanceSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomInstanceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomInterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomInterfaceEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomPrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomPrimitiveTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomSignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomSignalEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomTimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part.CustomTimeObservationFloatingNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationClassRoleSourceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationClassRoleTargetEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationNodeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationSourceNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationTargetNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ClassEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ComponentEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ContainmentCircleEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DataTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DependencyBranchEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DependencyNodeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.DurationObservationFloatingNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.EnumerationEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationItemEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InformationItemEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InstanceSpecificationEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.InterfaceEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ModelEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.ModelEditPartTN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PrimitiveTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.SignalEditPartCN;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.TimeObservationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.TimeObservationFloatingNameEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.UMLEditPartFactory;
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLVisualIDRegistry;

/**
 * this is custom editpart factory to create our own editpart
 */
public class CustomUMLEditPartFactory extends UMLEditPartFactory {

	public EditPart createEditPart(EditPart context, Object model) {
		if(model instanceof View) {
			View view = (View)model;
			switch(UMLVisualIDRegistry.getVisualID(view)) {
			// redefined classes to modify the method createNodePlate
			case PackageEditPart.VISUAL_ID:
				return new CPackageEditPart(view);
			case AssociationClassEditPart.VISUAL_ID:
				return new CustomAssociationClassEditPart(view);
			case InstanceSpecificationEditPart.VISUAL_ID:
				return new CustomInstanceSpecificationEditPart(view);
			case ComponentEditPart.VISUAL_ID:
				return new CustomComponentEditPart(view);
			case SignalEditPart.VISUAL_ID:
				return new CustomSignalEditPart(view);
			case InterfaceEditPart.VISUAL_ID:
				return new CustomInterfaceEditPart(view);
			case EnumerationEditPart.VISUAL_ID:
				return new CustomEnumerationEditPart(view);
			case InformationItemEditPart.VISUAL_ID:
				return new CustomInformationItemEditPart(view);
			case ClassEditPart.VISUAL_ID:
				return new CustomClassEditPart(view);
			case DataTypeEditPart.VISUAL_ID:
				return new CustomDataTypeEditPart(view);
			case PrimitiveTypeEditPart.VISUAL_ID:
				return new CustomPrimitiveTypeEditPart(view);
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
			case AssociationNodeEditPart.VISUAL_ID:
				return new CAssociationNodeEditPart(view);
			case DependencyNodeEditPart.VISUAL_ID:
				return new CDependencyNodeEditPart(view);
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
			case ClassEditPartCN.VISUAL_ID:
				return new CustomClassEditPartCN(view);
			case ComponentEditPartCN.VISUAL_ID:
				return new CustomComponentEditPartCN(view);
			case DataTypeEditPartCN.VISUAL_ID:
				return new CustomDataTypeEditPartCN(view);
			case EnumerationEditPartCN.VISUAL_ID:
				return new CustomEnumerationEditPartCN(view);
			case InformationItemEditPartCN.VISUAL_ID:
				return new CustomInformationItemEditPartCN(view);
			case InstanceSpecificationEditPartCN.VISUAL_ID:
				return new CustomInstanceSpecificationEditPartCN(view);
			case InterfaceEditPartCN.VISUAL_ID:
				return new CustomInterfaceEditPartCN(view);
			case PrimitiveTypeEditPartCN.VISUAL_ID:
				return new CustomPrimitiveTypeEditPartCN(view);
			case ConstraintEditPartCN.VISUAL_ID:
				return new CustomConstraintEditPartCN(view);
			case SignalEditPartCN.VISUAL_ID:
				return new CustomSignalEditPartCN(view);
			}
		}
		return super.createEditPart(context, model);
	}
}
