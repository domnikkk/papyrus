/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.interactionoverview.edit.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.dnd.strategy.TransactionalDropStrategy;
import org.eclipse.papyrus.uml.diagram.common.service.AspectUnspecifiedTypeConnectionTool.CreateAspectUnspecifiedTypeConnectionRequest;
import org.eclipse.papyrus.uml.diagram.interactionoverview.Activator;
import org.eclipse.papyrus.uml.diagram.interactionoverview.provider.ElementTypes;
import org.eclipse.papyrus.uml.diagram.timing.custom.edit.commands.RefreshCommandForDo;
import org.eclipse.papyrus.uml.diagram.timing.custom.edit.commands.RefreshCommandForUndo;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.CallBehaviorAction;

public class CallBehaviorActionToInteractionDropStrategy extends TransactionalDropStrategy {

	@Override
	public String getLabel() {
		return "CallBehaviorAction drop into Interaction with snapshot";
	}

	@Override
	public String getDescription() {
		return "CallBehaviorAction drop into Interaction with snapshot";
	}

	@Override
	public Image getImage() {
		return null;
	}

	@Override
	public String getID() {
		return Activator.PLUGIN_ID + ".callBehaviorActionDrop";
	}

	@Override
	public int getPriority() {
		return 0;
	}

	@Override
	protected Command doGetCommand(Request request, EditPart targetEditPart) {
		if (request instanceof CreateAspectUnspecifiedTypeConnectionRequest) {
			return null;
		}
		View targetView = getTargetView(targetEditPart);
		String containingDiagramType = org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils.getContainingDiagramType(targetView);

		if (!ElementTypes.DIAGRAM_ID.equals(containingDiagramType)) {
			return null; // Strategy available only for Interaction Overview
		}
		EObject semanticElement = getTargetSemanticElement(targetEditPart);
		if (!(semanticElement instanceof Activity)) {
			return null;
		}
		CompositeCommand cc = new CompositeCommand(getLabel());
		List<EObject> sourceElements = getSourceEObjects(request);
		List<CallBehaviorAction> callBehaviorActionToDrop = new ArrayList<CallBehaviorAction>(sourceElements.size());
		for (EObject sourceElement : sourceElements) {
			if (!(sourceElement instanceof CallBehaviorAction)) {
				return null;
			}
			callBehaviorActionToDrop.add((CallBehaviorAction) sourceElement);
		}
		for (CallBehaviorAction callBehaviorAction : callBehaviorActionToDrop) {
			if (callBehaviorAction.getBehavior() != null) { // Strategy available only for Interaction Overview
				CompositeCommand callBehaviorActionToInteractionDropCommand = callBehaviorActionToInteractionDropCommand((GraphicalEditPart) targetEditPart, callBehaviorAction);
				cc.add(callBehaviorActionToInteractionDropCommand);
			}
		}
		return cc.canExecute() ? new ICommandProxy(cc.reduce()) : null;
	}

	protected CompositeCommand callBehaviorActionToInteractionDropCommand(GraphicalEditPart targetEditPart, CallBehaviorAction callBehaviorAction) {
		CompositeCommand cc = new CompositeCommand(getLabel() + " for " + callBehaviorAction.getName());
		cc.add(new CommandProxy(new RefreshCommandForUndo(targetEditPart)));
		ICommand dropCommand = new DropInteractionWithSnapshotCommand(getTransactionalEditingDomain(targetEditPart), targetEditPart, callBehaviorAction, "Drop CallBehaviorAction as Interaction");
		cc.add(dropCommand);
		CreateSnapshotForInteractionFromViewDescriptorCommand snapshotCommand = new CreateSnapshotForInteractionFromViewDescriptorCommand(getTransactionalEditingDomain(targetEditPart), dropCommand, targetEditPart);
		cc.add(snapshotCommand);
		cc.add(new AddHyperlinkDiagram(dropCommand, snapshotCommand));
		cc.add(new CommandProxy(new RefreshCommandForDo(targetEditPart)));
		return cc;
	}

	public static String getContainingDiagramType(final View view) {
		if (view instanceof Diagram) {
			final Diagram diagram = (Diagram) view;
			return diagram.getType();
		}
		final EObject eContainer = view.eContainer();
		if (eContainer instanceof View) {
			final View parentView = (View) eContainer;
			return getContainingDiagramType(parentView);
		}
		return null;
	}

}
