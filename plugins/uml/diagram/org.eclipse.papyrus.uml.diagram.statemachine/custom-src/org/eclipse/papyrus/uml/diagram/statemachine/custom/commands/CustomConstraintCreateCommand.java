/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.statemachine.custom.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.infra.viewpoints.policy.ModelAddData;
import org.eclipse.papyrus.infra.viewpoints.policy.PolicyChecker;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.commands.ConstraintCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.providers.ElementInitializers;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * Create a constraint command. Unlike the original command, the constraint is created in the nearest
 * package. This is more consistent with the behavior in the class diagram and does not set the context attribute.
 * (if already set, the user cannot set the context link via the context-link tool).
 */
public class CustomConstraintCreateCommand extends ConstraintCreateCommand {

	private Diagram diagram = null;

	public CustomConstraintCreateCommand(CreateElementRequest req, Diagram diagram) {
		super(req, diagram);
		this.diagram = diagram;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		Constraint newElement = UMLFactory.eINSTANCE.createConstraint();
		EObject target = getElementToEdit();
		ModelAddData data = PolicyChecker.getCurrent().getChildAddData(diagram, target, newElement);
		if(data.isPermitted()) {
			if(data.isPathDefined()) {
				if(!data.execute(target, newElement))
				 {
					return CommandResult.newErrorCommandResult("Failed to follow the policy-specified for the insertion of the new element"); //$NON-NLS-1$
				}
			} else {
				Package qualifiedTarget = ((Element)target).getNearestPackage();
				qualifiedTarget.getPackagedElements().add(newElement);
			}
		} else {
			return CommandResult.newErrorCommandResult("The active policy restricts the addition of this element"); //$NON-NLS-1$
		}
		ElementInitializers.getInstance().init_Constraint_668(newElement);
		doConfigure(newElement, monitor, info);
		((CreateElementRequest)getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}
}
