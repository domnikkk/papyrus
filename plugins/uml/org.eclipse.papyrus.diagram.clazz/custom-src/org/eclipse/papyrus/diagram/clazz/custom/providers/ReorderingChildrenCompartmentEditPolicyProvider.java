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
package org.eclipse.papyrus.diagram.clazz.custom.providers;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;
import org.eclipse.papyrus.diagram.clazz.custom.edit.policy.CompartmentEditPolicy;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassAttributeCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ClassOperationCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ComponentAttributeCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ComponentNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ComponentOperationCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.InterfaceAttributeCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.InterfaceNestedClassifierCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.InterfaceOperationCompartmentEditPart;
import org.eclipse.papyrus.diagram.clazz.edit.parts.ModelEditPart;
import org.eclipse.uml2.uml.UMLPackage;


/**
 * @author adaussy
 * Edit policy to enable ordering children label in Classifiers (Components, Interfaces and Class)
 */
public class ReorderingChildrenCompartmentEditPolicyProvider extends AbstractProvider implements IEditPolicyProvider {

	public boolean provides(IOperation operation) {
		CreateEditPoliciesOperation epOperation = (CreateEditPoliciesOperation)operation;
		if(!(epOperation.getEditPart() instanceof GraphicalEditPart)) {
			return false;
		}
		GraphicalEditPart gep = (GraphicalEditPart)epOperation.getEditPart();
		String diagramType = gep.getNotationView().getDiagram().getType();
		if(ModelEditPart.MODEL_ID.equals(diagramType)) {
			return true;
		}


		return false;
	}

	public void createEditPolicies(EditPart editPart) {
		/*
		 * Install policy to handle reordering operations
		 */
		if(editPart instanceof ComponentOperationCompartmentEditPart || editPart instanceof ClassOperationCompartmentEditPart) {
			editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE, new CompartmentEditPolicy(UMLPackage.Literals.CLASS__OWNED_OPERATION));
		} else if(editPart instanceof InterfaceOperationCompartmentEditPart) {
			editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE, new CompartmentEditPolicy(UMLPackage.Literals.INTERFACE__OWNED_OPERATION));
		}
		/*
		 * Install policy to handle reordering attributes
		 */
		else if(editPart instanceof ComponentAttributeCompartmentEditPart || editPart instanceof ClassAttributeCompartmentEditPart) {
			editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE, new CompartmentEditPolicy(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE));
		} else if(editPart instanceof InterfaceAttributeCompartmentEditPart) {
			editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE, new CompartmentEditPolicy(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE));
		}
		/*
		 * Install policy to handle reordering nested classifier
		 */
		else if(editPart instanceof ComponentNestedClassifierCompartmentEditPart || editPart instanceof ClassNestedClassifierCompartmentEditPart) {
			editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE, new CompartmentEditPolicy(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER));
		} else if(editPart instanceof InterfaceNestedClassifierCompartmentEditPart) {
			editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE, new CompartmentEditPolicy(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER));
		}
	}

}
