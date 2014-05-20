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
package org.eclipse.papyrus.uml.diagram.usecase.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.ActorInComponentCreateCommand;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.CommentCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.ComponentInComponentCreateCommand;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.ConstraintInComponentCreateCommand;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.UseCaseInComponentCreateCommand;
import org.eclipse.papyrus.uml.diagram.usecase.providers.UMLElementTypes;

/**
 * @generated
 */
public class ComponentUsecases3ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentUsecases3ItemSemanticEditPolicy() {
		super(UMLElementTypes.Component_3013);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		IElementType requestElementType = req.getElementType();
		if(requestElementType == null) {
			return super.getCreateCommand(req);
		}


		if(UMLElementTypes.UseCase_3009 == requestElementType) {

			return getGEFWrapper(new UseCaseInComponentCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if(UMLElementTypes.Component_3016 == requestElementType) {

			return getGEFWrapper(new ComponentInComponentCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if(UMLElementTypes.Comment_3015 == requestElementType) {

			return getGEFWrapper(new CommentCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if(UMLElementTypes.Constraint_3017 == requestElementType) {

			return getGEFWrapper(new ConstraintInComponentCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		if(UMLElementTypes.Actor_3018 == requestElementType) {

			return getGEFWrapper(new ActorInComponentCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));

		}
		return super.getCreateCommand(req);
	}
}
