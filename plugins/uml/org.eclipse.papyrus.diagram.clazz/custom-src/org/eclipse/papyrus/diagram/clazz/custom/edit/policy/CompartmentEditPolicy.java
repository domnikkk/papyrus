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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.commands.AddCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableEditPolicyEx;
import org.eclipse.gmf.runtime.emf.commands.core.commands.RepositionEObjectCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.clazz.custom.edit.commands.CompartmentRepositionEObjectCommand;


/**
 * @author adaussy
 * Edit policy which allow to reorder children of a compartment graphically (depending of the EStructuralFeature containing the child)
 */
public class CompartmentEditPolicy extends FlowLayoutEditPolicy {

	private EStructuralFeature feature = null;

	protected Command createAddCommand(EditPart child, EditPart after) {
		int index = getHost().getChildren().indexOf(after);
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		AddCommand command = new AddCommand(editingDomain, new EObjectAdapter((View)getHost().getModel()),
				new EObjectAdapter((View)child.getModel()), index);
		return new ICommandProxy(command);
	}

	protected EditPolicy createChildEditPolicy(EditPart child) {
		ResizableEditPolicyEx policy = new ResizableEditPolicyEx();
		policy.setResizeDirections(0);
		return policy;
	}

	protected Command createMoveChildCommand(EditPart child, EditPart after) {	

		int newIndex;
		int displacement;

		int childIndex = getHost().getChildren().indexOf(child);
		int afterIndex = getHost().getChildren().indexOf(after);	

		if(afterIndex == -1) {
			newIndex = getHost().getChildren().size()-1;			
			displacement = newIndex - childIndex;
		} else {		
			newIndex = afterIndex;
			displacement = afterIndex - childIndex;
			if (childIndex <= afterIndex) {
				newIndex--;
				displacement--;			
			}
		}


		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();

		RepositionEObjectCommand command = new CompartmentRepositionEObjectCommand(child, editingDomain, "", 
				(EList)((View)child.getParent().getModel()).getElement().eGet(feature), 
				((View)child.getModel()).getElement(), 
				displacement, newIndex);	

		//TODO ev. reintroduce target feedback (actual problem: line is not deleted after dropping)
		eraseLayoutTargetFeedback(null);

		return new ICommandProxy(command);
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
	 * @param feature has to be an EList
	 */
	public CompartmentEditPolicy(EStructuralFeature feature) {
		super();
		this.feature = feature;
	}

}
