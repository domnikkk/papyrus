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
package org.eclipse.papyrus.uml.diagram.statemachine.custom.policies;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;
import org.eclipse.papyrus.uml.diagram.statemachine.custom.commands.CustomConstraintCreateCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.policies.RegionCompartmentItemSemanticEditPolicy;
import org.eclipse.papyrus.uml.diagram.statemachine.providers.UMLElementTypes;

/**
 * Custom edit policy that handles the creation of constraints (within regions). The called custom command
 * places the constraint into the nearest package instead of using the ownedRules attribute. The latter affects
 * the context attribute of the constraint and prevents the use of the context link attribute.
 */
public class CustomRegionCompartmentItemSemanticEditPolicy extends RegionCompartmentItemSemanticEditPolicy {

	@Override
	public Command getCommand(Request request) {
		if (request instanceof EditCommandRequestWrapper) {
			IEditCommandRequest gmfRequest = ((EditCommandRequestWrapper) request).getEditCommandRequest();
			if (gmfRequest instanceof CreateElementRequest) {
				CreateElementRequest createRequest = (CreateElementRequest) gmfRequest;
				IElementType elementType = createRequest.getElementType();
				if (((IHintedType) elementType).getSemanticHint().equals(((IHintedType) UMLElementTypes.Constraint_668).getSemanticHint())) {
					ICommand cmd = new CustomConstraintCreateCommand(createRequest, DiagramUtils.getDiagramFrom(getHost()));
					return new ICommandProxy(cmd);
				}
			}
		}
		return super.getCommand(request);
	}
}
