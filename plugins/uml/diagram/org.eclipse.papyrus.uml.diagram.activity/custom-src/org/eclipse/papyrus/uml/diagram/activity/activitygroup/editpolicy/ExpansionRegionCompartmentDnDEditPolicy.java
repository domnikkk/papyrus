/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.activity.activitygroup.editpolicy;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionNodeAsInEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionNodeAsOutEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.ActivityGroupCustomDragAndDropEditPolicy;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ExpansionNode;


public class ExpansionRegionCompartmentDnDEditPolicy extends ActivityGroupCustomDragAndDropEditPolicy {

	@Override
	protected IUndoableOperation getDropObjectCommand(DropObjectsRequest dropRequest, EObject droppedObject) {
		if (isExpansionNode(droppedObject)) {
			return dropExpansionNode((ExpansionNode) droppedObject);
		}
		return super.getDropObjectCommand(dropRequest, droppedObject);
	}

	public IUndoableOperation dropExpansionNode(ExpansionNode expNode) {
		int visualID = 0;
		if (expNode.getRegionAsInput() != null) {
			visualID = ExpansionNodeAsInEditPart.VISUAL_ID;
		} else {
			visualID = ExpansionNodeAsOutEditPart.VISUAL_ID;
		}
		CompositeCommand wrapCommand = new CompositeCommand("Wrap drop command");
		IGraphicalEditPart graphicalParent;
		if (getHost() instanceof ShapeCompartmentEditPart) {
			graphicalParent = (IGraphicalEditPart) getHost().getParent();
		} else {
			graphicalParent = (IGraphicalEditPart) getHost();
		}
		wrapCommand.add(getCreateViewCommand(graphicalParent, expNode, visualID));
		return wrapCommand;
	}

	protected ICommand getCreateViewCommand(IGraphicalEditPart parent, Element droppedElement, int nodeVISUALID) {
		IAdaptable elementAdapter = new EObjectAdapter(droppedElement);
		ViewDescriptor descriptor = new ViewDescriptor(elementAdapter, Node.class, ((IHintedType) getUMLElementType(nodeVISUALID)).getSemanticHint(), ViewUtil.APPEND, true, getDiagramPreferencesHint());

		CreateCommand c = new CreateCommand(getEditingDomain(), descriptor, parent.getPrimaryView());

		return c.canExecute() ? c : org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand.INSTANCE;
	}

	private boolean isExpansionNode(EObject droppedElement) {
		return droppedElement instanceof ExpansionNode;
	}
}
