/*****************************************************************************
 * Copyright (c) 2009 Atos Origin and CEA LIST
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *   Patrick Tessier (CEA LIST ) - modification
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.viewpoints.policy.ModelAddData;
import org.eclipse.papyrus.infra.viewpoints.policy.PolicyChecker;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class InterruptibleActivityRegionCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private Diagram diagram = null;

	/**
	 * @generated
	 */
	private EObject eObject = null;

	/**
	 * @generated
	 */
	public InterruptibleActivityRegionCreateCommand(CreateElementRequest req, EObject eObject, Diagram diagram) {
		super(req.getLabel(), null, req);
		this.eObject = eObject;
		this.diagram = diagram;
	}

	/**
	 * @generated
	 */
	public static InterruptibleActivityRegionCreateCommand create(CreateElementRequest req, EObject eObject, Diagram diagram) {
		return new InterruptibleActivityRegionCreateCommand(req, eObject, diagram);
	}

	/**
	 * @generated
	 */
	public InterruptibleActivityRegionCreateCommand(CreateElementRequest req, Diagram diagram) {
		super(req.getLabel(), null, req);
		this.diagram = diagram;
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 *
	 * @generated
	 */
	@Override
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest()).getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		if (container != null) {
			return container;
		}
		return eObject;
	}

	/**
	 * @generated
	 */
	@Override
	public boolean canExecute() {
		EObject target = getElementToEdit();
		ModelAddData data = PolicyChecker.getCurrent().getChildAddData(diagram, target.eClass(), UMLPackage.eINSTANCE.getInterruptibleActivityRegion());
		return data.isPermitted();
	}

	/**
	 * @generated
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		InterruptibleActivityRegion newElement = UMLFactory.eINSTANCE.createInterruptibleActivityRegion();
		EObject target = getElementToEdit();
		ModelAddData data = PolicyChecker.getCurrent().getChildAddData(diagram, target, newElement);
		if (data.isPermitted()) {
			if (data.isPathDefined()) {
				if (!data.execute(target, newElement)) {
					return CommandResult.newErrorCommandResult("Failed to follow the policy-specified for the insertion of the new element");
				}
			} else {
				Activity qualifiedTarget = (Activity) target;
				qualifiedTarget.getOwnedGroups().add(newElement);
			}
		} else {
			return CommandResult.newErrorCommandResult("The active policy restricts the addition of this element");
		}
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(InterruptibleActivityRegion newElement, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}
}
