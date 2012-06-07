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
import org.eclipse.papyrus.diagram.clazz.edit.parts.InterfaceAttributeCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.InterfaceAttributeCompartmentEditPartCN;
import org.eclipse.papyrus.diagram.clazz.edit.parts.InterfaceEditPartCN;
import org.eclipse.papyrus.diagram.clazz.edit.parts.InterfaceNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.InterfaceNestedClassifierCompartmentEditPartCN;
import org.eclipse.papyrus.diagram.clazz.edit.parts.InterfaceOperationCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.InterfaceOperationCompartmentEditPartCN;
import org.eclipse.papyrus.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;


/**
 * @author adaussy
 *  Handle switching compartment when dropping element on a Component
 */
public class InterfaceCompartmentEditPolicy extends AbstractCompartmentEditPolicy {

	public InterfaceCompartmentEditPolicy(EStructuralFeature feature) {
		super(feature);
	}

	@Override
	protected IGraphicalEditPart getCorrectCompartment(EObject toReparentObject) {
		IGraphicalEditPart newPartContianer = null;
		boolean isCN = getHost().getParent() instanceof InterfaceEditPartCN;
		if (toReparentObject instanceof Operation){
			newPartContianer = ((IGraphicalEditPart)getHost().getParent()).getChildBySemanticHint(UMLVisualIDRegistry.getType(isCN?InterfaceOperationCompartmentEditPartCN.VISUAL_ID:InterfaceOperationCompartmentEditPart.VISUAL_ID));
		} else if(toReparentObject instanceof Property){
			newPartContianer = ((IGraphicalEditPart)getHost().getParent()).getChildBySemanticHint(UMLVisualIDRegistry.getType(isCN?InterfaceAttributeCompartmentEditPartCN.VISUAL_ID:InterfaceAttributeCompartmentEditPart.VISUAL_ID));
		}else if(toReparentObject instanceof org.eclipse.uml2.uml.Classifier){
			newPartContianer = ((IGraphicalEditPart)getHost().getParent()).getChildBySemanticHint(UMLVisualIDRegistry.getType(isCN?InterfaceNestedClassifierCompartmentEditPartCN.VISUAL_ID:InterfaceNestedClassifierCompartmentEditPart.VISUAL_ID));
		}
		return newPartContianer;
	}

}
