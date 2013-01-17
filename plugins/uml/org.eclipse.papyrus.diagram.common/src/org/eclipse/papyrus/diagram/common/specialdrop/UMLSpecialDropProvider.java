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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.dialogs.PopupDialog;
import org.eclipse.gmf.runtime.diagram.ui.commands.PopupMenuCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.papyrus.diagram.common.commands.SetOrAddValueCommand;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.collect.Lists;


public class UMLSpecialDropProvider implements ISpecialDropProvider {

	public List<ICommand> getSetFeatureCommands(TransactionalEditingDomain editingDomain, EObject obj, EStructuralFeature f, List<EObject> values, String featureLabel) {
		if (UMLPackage.Literals.LIFELINE__REPRESENTS.equals(f) && obj instanceof Lifeline && values.size() == 1 && values.get(0) instanceof Type) {
			Lifeline lifeline = (Lifeline)obj;
			Type type = (Type)values.get(0);
			CompositeTransactionalCommand composite = new CompositeTransactionalCommand(editingDomain, "Set this type as represents");

			ConnectableElement p = lifeline.getRepresents();
			if (p == null) {
				p = UMLFactory.eINSTANCE.createProperty();
				p.setType(type);

				SetRequest addToContainerReq = new SetRequest(editingDomain, lifeline.getInteraction(), UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE, p);
				composite.add(new SetOrAddValueCommand(addToContainerReq, true));

				SetRequest setRepresentsReq = new SetRequest(editingDomain, lifeline, f, p);
				composite.add(new SetOrAddValueCommand(setRepresentsReq, true));

				return new ArrayList<ICommand>(Collections.singletonList(composite));
			} else {
				SetRequest setTypeReq = new SetRequest(editingDomain, p, UMLPackage.Literals.TYPED_ELEMENT__TYPE, type);
				setTypeReq.setLabel("Set this type as represents");
				return new ArrayList<ICommand>(Collections.singletonList(new SetOrAddValueCommand(setTypeReq, true)));
			}
		}

		if (UMLPackage.Literals.BEHAVIORAL_FEATURE__OWNED_PARAMETER.equals(f) && obj instanceof BehavioralFeature && values.size() == 1 && values.get(0) instanceof Type) {
			Type type = (Type)values.get(0);

			final Parameter p = UMLFactory.eINSTANCE.createParameter();
			p.setType(type);

			CompositeTransactionalCommand composite = new CompositeTransactionalCommand(editingDomain, "Add a parameter with this type");

			SetRequest addToContainerReq = new SetRequest(editingDomain, obj, UMLPackage.Literals.BEHAVIORAL_FEATURE__OWNED_PARAMETER, p);
			composite.add(new SetOrAddValueCommand(addToContainerReq, true));

			PopupDialog popupDialog = new PopupDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), Lists.newArrayList(ParameterDirectionKind.values()), new LabelProvider() {

				public String getText(Object element) {
					ParameterDirectionKind kind = (ParameterDirectionKind)element;
					return kind.getName();
				}
			});
			popupDialog.setTitle("Choose the direction of the parameter");
			popupDialog.setMessage("Choose the direction of the parameter");

			PopupMenuCommand popupCommand = new PopupMenuCommand("", PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()) {

				@Override
				protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
					CommandResult res = super.doExecuteWithResult(progressMonitor, info);
					ParameterDirectionKind direction = (ParameterDirectionKind)res.getReturnValue();
					if (!ParameterDirectionKind.RETURN_LITERAL.equals(direction)) {
						p.setName("p" + p.getType().getName());
					}
					p.setDirection(direction);
					return res;
				}

				@Override
				public List getAffectedFiles() {
					Resource resource = p.eResource();
					if (resource != null) {
						IFile file = WorkspaceSynchronizer.getFile(resource);
						if (file != null) {
							return Collections.singletonList(file);
						}
					}
					return Collections.EMPTY_LIST;
				}
			};
			popupCommand.setPopupDialog(popupDialog);
			composite.add(popupCommand);

			return new ArrayList<ICommand>(Collections.singletonList(composite));
		}
		return null;
	}

	public List<ICommand> getDropObjectsCommands(TransactionalEditingDomain editingDomain, EObject obj, List<Object> droppedObjs) {
		return null;
	}
}
