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
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassAttributeCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassAttributeCompartmentEditPartCN;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassEditPartCN;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassNestedClassifierCompartmentEditPartCN;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassOperationCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassOperationCompartmentEditPartCN;
import org.eclipse.papyrus.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;


/**
 * @author adaussy
 * Handle switching compartment when dropping element on a class
 */
public class ClassCompartmentEditPolicy extends AbstractCompartmentEditPolicy {

	public ClassCompartmentEditPolicy(EStructuralFeature feature) {
		super(feature);
	}

	@Override
	protected IGraphicalEditPart getCorrectCompartment(EObject toReparentObject) {
		IGraphicalEditPart newPartContianer = null;
		boolean isCN = getHost().getParent() instanceof ClassEditPartCN;
		if (toReparentObject instanceof Operation){
			newPartContianer = ((IGraphicalEditPart)getHost().getParent()).getChildBySemanticHint(UMLVisualIDRegistry.getType(isCN?ClassOperationCompartmentEditPartCN.VISUAL_ID:ClassOperationCompartmentEditPart.VISUAL_ID));
		} else if(toReparentObject instanceof Property){
			newPartContianer = ((IGraphicalEditPart)getHost().getParent()).getChildBySemanticHint(UMLVisualIDRegistry.getType(isCN?ClassAttributeCompartmentEditPartCN.VISUAL_ID:ClassAttributeCompartmentEditPart.VISUAL_ID));
		}else if(toReparentObject instanceof org.eclipse.uml2.uml.Classifier){
			newPartContianer = ((IGraphicalEditPart)getHost().getParent()).getChildBySemanticHint(UMLVisualIDRegistry.getType(isCN?ClassNestedClassifierCompartmentEditPartCN.VISUAL_ID:ClassNestedClassifierCompartmentEditPart.VISUAL_ID));
		}
		return newPartContianer;
	}

}
