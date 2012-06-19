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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableEditPolicyEx;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.commands.RepositionEObjectCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.EMFtoGEFCommandWrapper;
import org.eclipse.papyrus.diagram.clazz.custom.edit.commands.CompartmentRepositionEObjectCommand;
import org.eclipse.papyrus.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.diagram.clazz.providers.UMLElementTypes;


/**
 * @author adaussy
 *         Edit policy which allow to reorder children of a compartment graphically (depending of the EStructuralFeature containing the child)
 */
public abstract class AbstractCompartmentEditPolicy extends FlowLayoutEditPolicy {

	private EStructuralFeature feature = null;

	protected Command createAddCommand(EditPart child, EditPart after) {

		/*
		 * This edit policy only handle intra child movement
		 */
		

		boolean isCorrectCompartment = isCorrectCompartment(((IGraphicalEditPart)child).getNotationView());
		if (!isCorrectCompartment){
			return org.eclipse.gef.commands.UnexecutableCommand.INSTANCE;
		}
		
		if (child != null &&  after != null && child.getParent().equals(after.getParent())){
			
			int index = getHost().getChildren().indexOf(after);
			TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();
			
			
			
			EObject toReparentObject = ((IGraphicalEditPart)child).resolveSemanticElement();
			
			IGraphicalEditPart newPartContianer = getCorrectCompartment(toReparentObject);
			
			if(newPartContianer == null) {
				return org.eclipse.gef.commands.UnexecutableCommand.INSTANCE;
			}
			View container = newPartContianer.getNotationView();
			View childView = (View)child.getModel();
			
			MoveCommand command = new MoveCommand(editingDomain, container, NotationPackage.Literals.VIEW__PERSISTED_CHILDREN, childView, index);
			return new EMFtoGEFCommandWrapper(command);
		}
		return null;
	}

	private boolean isCorrectCompartment(View viewReparentObject) {
		
		EditPolicy policy = getHost().getEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
		
		CreateElementRequest createRequest = new CreateElementRequest(UMLElementTypes.getElementType(UMLVisualIDRegistry.getVisualID(viewReparentObject.getType())));
		if (policy != null){
			Command cmd = policy.getCommand(new EditCommandRequestWrapper(createRequest));
			return cmd != null && cmd.canExecute();
		}
		return false;
	}

	protected abstract IGraphicalEditPart getCorrectCompartment(EObject toReparentObject);

	protected EditPolicy createChildEditPolicy(EditPart child) {
		ResizableEditPolicyEx policy = new ResizableEditPolicyEx();
		policy.setResizeDirections(0);
		return policy;
	}
	
	@Override
	protected Command getMoveChildrenCommand(Request request) {
		
		Command cmd = super.getMoveChildrenCommand(request);
		if (cmd != null && cmd.canExecute()){
			return cmd;
		}
		return null;
	}
	
	@Override
	protected Command getAddCommand(Request req) {

		Command cmd =super.getAddCommand(req);
		if (cmd != null && cmd.canExecute()){
			return cmd;
		}
		return null;
	}

	protected Command createMoveChildCommand(EditPart child, EditPart after) {
		
		/*
		 * This edit policy only handle intra child movement
		 */
		
		if (child != null && after != null && child.getParent().equals(after.getParent())){
			
			int newIndex;
			int displacement;
			
			int childIndex = getHost().getChildren().indexOf(child);
			int afterIndex = getHost().getChildren().indexOf(after);
			
			if(afterIndex == -1) {
				newIndex = getHost().getChildren().size() - 1;
				displacement = newIndex - childIndex;
			} else {
				newIndex = afterIndex;
				displacement = afterIndex - childIndex;
				if(childIndex <= afterIndex) {
					newIndex--;
					displacement--;
				}
			}
			
			
			TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();
			
			RepositionEObjectCommand command = new CompartmentRepositionEObjectCommand(child, editingDomain, "", (EList)((View)child.getParent().getModel()).getElement().eGet(feature), ((View)child.getModel()).getElement(), displacement, newIndex);
			
			eraseLayoutTargetFeedback(null);
			
			return new ICommandProxy(command);
		}
		return null;
	}

	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}

	protected Command getDeleteDependantCommand(Request request) {
		return null;
	}

	protected Command getOrphanChildrenCommand(Request request) {
		return null;
	}

	/**
	 * @param feature
	 *        has to be an EList
	 */
	public AbstractCompartmentEditPolicy(EStructuralFeature feature) {
		super();
		this.feature = feature;
	}

}
