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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.ActorAsRectangleCreateCommandTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.ActorCreateCommandTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.CommentCreateCommandTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.ConstraintCreateCommandTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.DefaultNamedElementCreateCommandTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.PackageCreateCommandTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.ShortCutDiagramCreateCommand;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.SubjectClassifierCreateCommandTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.UseCaseAsRectangleCreateCommandTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.commands.UseCaseCreateCommandTN;
import org.eclipse.papyrus.uml.diagram.usecase.providers.UMLElementTypes;

/**
 * @generated
 */
public class UseCaseDiagramItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UseCaseDiagramItemSemanticEditPolicy() {
		super(UMLElementTypes.Package_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		IElementType requestElementType = req.getElementType();
		if(requestElementType == null) {
			return super.getCreateCommand(req);
		}
		if(UMLElementTypes.Actor_2011 == requestElementType) {
			return getGEFWrapper(new ActorCreateCommandTN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if(UMLElementTypes.Actor_2012 == requestElementType) {
			return getGEFWrapper(new ActorAsRectangleCreateCommandTN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if(UMLElementTypes.UseCase_2013 == requestElementType) {
			return getGEFWrapper(new UseCaseCreateCommandTN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if(UMLElementTypes.UseCase_2014 == requestElementType) {
			return getGEFWrapper(new UseCaseAsRectangleCreateCommandTN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if(UMLElementTypes.Classifier_2015 == requestElementType) {
			return getGEFWrapper(new SubjectClassifierCreateCommandTN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if(UMLElementTypes.Package_2016 == requestElementType) {
			return getGEFWrapper(new PackageCreateCommandTN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if(UMLElementTypes.Constraint_2017 == requestElementType) {
			return getGEFWrapper(new ConstraintCreateCommandTN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if(UMLElementTypes.Comment_2018 == requestElementType) {
			return getGEFWrapper(new CommentCreateCommandTN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if(UMLElementTypes.NamedElement_2022 == requestElementType) {
			return getGEFWrapper(new DefaultNamedElementCreateCommandTN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if(UMLElementTypes.Diagram_2019 == requestElementType) {
			return getGEFWrapper(new ShortCutDiagramCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}
	}
}
