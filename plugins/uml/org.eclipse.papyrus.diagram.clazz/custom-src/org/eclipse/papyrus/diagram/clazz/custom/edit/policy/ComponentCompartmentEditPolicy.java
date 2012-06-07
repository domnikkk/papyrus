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
 *   Arthur Daussy Bug 381568 - [ClassDiagram] Enable reordering operation, attributes and operation on classifiers
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.clazz.custom.edit.policy;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ComponentAttributeCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ComponentAttributeCompartmentEditPartCN;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ComponentEditPartCN;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ComponentNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ComponentNestedClassifierCompartmentEditPartCN;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ComponentOperationCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ComponentOperationCompartmentEditPartCN;
import org.eclipse.papyrus.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;


/**
 * @author adaussy
 *  Handle switching compartment when dropping element on a Component
 */
public class ComponentCompartmentEditPolicy extends AbstractCompartmentEditPolicy {

	public ComponentCompartmentEditPolicy(EStructuralFeature feature) {
		super(feature);
	}

	@Override
	protected IGraphicalEditPart getCorrectCompartment(EObject toReparentObject) {
		IGraphicalEditPart newPartContianer = null;
		boolean isCN = getHost().getParent() instanceof ComponentEditPartCN;
		if (toReparentObject instanceof Operation){
			newPartContianer = ((IGraphicalEditPart)getHost().getParent()).getChildBySemanticHint(UMLVisualIDRegistry.getType(isCN?ComponentOperationCompartmentEditPartCN.VISUAL_ID:ComponentOperationCompartmentEditPart.VISUAL_ID));
		} else if(toReparentObject instanceof Property){
			newPartContianer = ((IGraphicalEditPart)getHost().getParent()).getChildBySemanticHint(UMLVisualIDRegistry.getType(isCN?ComponentAttributeCompartmentEditPartCN.VISUAL_ID:ComponentAttributeCompartmentEditPart.VISUAL_ID));
		}else if(toReparentObject instanceof org.eclipse.uml2.uml.Classifier){
			newPartContianer = ((IGraphicalEditPart)getHost().getParent()).getChildBySemanticHint(UMLVisualIDRegistry.getType(isCN?ComponentNestedClassifierCompartmentEditPartCN.VISUAL_ID:ComponentNestedClassifierCompartmentEditPart.VISUAL_ID));
		}
		return newPartContianer;
	}

}
