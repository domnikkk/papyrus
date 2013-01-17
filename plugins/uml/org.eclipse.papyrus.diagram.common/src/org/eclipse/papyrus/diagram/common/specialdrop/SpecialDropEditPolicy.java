/*****************************************************************************
 * Copyright (c) 2013 Atos
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.specialdrop;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.papyrus.diagram.common.commands.DeferredCreateCommand;
import org.eclipse.papyrus.diagram.common.commands.SelectAndExecuteCommand;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Stereotype;

import com.google.common.collect.Lists;


public class SpecialDropEditPolicy extends org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy {

	@Override
	public Command getCommand(Request request) {
		// ignore this policy if this request is already correctly handled
		// by a classic DND policy or if it is a deferred drop request
		if (Boolean.TRUE.equals(request.getExtendedData().get(DeferredCreateCommand.IS_DEFERRED_DROP_REQUEST))) {
			return null;
		}
		EditPolicy dndEditPolicy = getHost().getEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
		if (dndEditPolicy != null) {
			Command c = dndEditPolicy.getCommand(request);
			if (c != null && c.canExecute()) {
				return null;
			}
		}

		return super.getCommand(request);
	}

	@Override
	protected Command getDropObjectsCommand(DropObjectsRequest request) {

		List<EObject> droppedEObjs = Lists.newArrayList();

		for (Object o : request.getObjects()) {
			if (o instanceof EObject) {
				droppedEObjs.add((EObject)o);
			}
		}

		EObject dropOnEObj = getHostObject();
		List<Command> possibleSetCommands = Lists.newArrayList();
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();

		if (!droppedEObjs.isEmpty()) {
			for (EStructuralFeature f : dropOnEObj.eClass().getEAllStructuralFeatures()) {
				for (ISpecialDropProvider specialDrop : SpecialDropRegistry.getInstance().getSpecialDrops()) {
					List<ICommand> cmds = specialDrop.getSetFeatureCommands(editingDomain, dropOnEObj, f, droppedEObjs, f.getName());
					if (cmds != null) {
						for (ICommand cmd : cmds) {
							if (cmd != null && cmd.canExecute()) {
								possibleSetCommands.add(new ICommandProxy(cmd));
							}
						}
					}
				}
			}

			// handle features of stereotypes
			if (dropOnEObj instanceof Element) {
				Element dropOnElement = (Element)dropOnEObj;
				for (Stereotype st : dropOnElement.getAppliedStereotypes()) {
					EObject application = dropOnElement.getStereotypeApplication(st);
					for (EStructuralFeature f : application.eClass().getEAllStructuralFeatures()) {
						if (!f.getName().startsWith(Extension.METACLASS_ROLE_PREFIX)) {
							for (ISpecialDropProvider specialDrop : SpecialDropRegistry.getInstance().getSpecialDrops()) {
								List<ICommand> cmds = specialDrop.getSetFeatureCommands(editingDomain, application, f, droppedEObjs, st.getQualifiedName() + "::" + f.getName());
								if (cmds != null) {
									for (ICommand cmd : cmds) {
										if (cmd != null && cmd.canExecute()) {
											possibleSetCommands.add(new ICommandProxy(cmd));
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (!request.getObjects().isEmpty()) {
			for (ISpecialDropProvider specialDrop : SpecialDropRegistry.getInstance().getSpecialDrops()) {
				List<ICommand> cmds = specialDrop.getDropObjectsCommands(editingDomain, dropOnEObj, request.getObjects());
				if (cmds != null) {
					for (ICommand cmd : cmds) {
						if (cmd != null && cmd.canExecute()) {
							possibleSetCommands.add(new ICommandProxy(cmd));
						}
					}
				}
			}
		}

		if (!possibleSetCommands.isEmpty()) {
			return new ICommandProxy(new SelectAndExecuteCommand("", PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), possibleSetCommands, false));
		}
		return null;
	}

}
