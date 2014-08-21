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
package org.eclipse.papyrus.uml.diagram.timing.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.DestructionOccurrenceSpecificationCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.DurationConstraintCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.DurationObservationCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.FullStateInvariantCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.GeneralOrderingCreateCommand;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.MessageOccurrenceSpecificationCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.OccurrenceSpecificationCreateCommandCN;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.TimeConstraintCreateCommand;
import org.eclipse.papyrus.uml.diagram.timing.edit.commands.TimeObservationCreateCommand;
import org.eclipse.papyrus.uml.diagram.timing.providers.UMLElementTypes;

/**
 * @generated
 */
public class FullLifelineTimelineCompartmentItemSemanticEditPolicyCN extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FullLifelineTimelineCompartmentItemSemanticEditPolicyCN() {
		super(UMLElementTypes.Lifeline_19);
	}

	/**
	 * @generated
	 */
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		IElementType requestElementType = req.getElementType();
		if (requestElementType == null) {
			return super.getCreateCommand(req);
		}
		if (UMLElementTypes.StateInvariant_11 == requestElementType) {
			return getGEFWrapper(new FullStateInvariantCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if (UMLElementTypes.OccurrenceSpecification_12 == requestElementType) {
			return getGEFWrapper(new OccurrenceSpecificationCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if (UMLElementTypes.MessageOccurrenceSpecification_13 == requestElementType) {
			return getGEFWrapper(new MessageOccurrenceSpecificationCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if (UMLElementTypes.DestructionOccurrenceSpecification_27 == requestElementType) {
			return getGEFWrapper(new DestructionOccurrenceSpecificationCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if (UMLElementTypes.DurationConstraint_18 == requestElementType) {
			return getGEFWrapper(new DurationConstraintCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if (UMLElementTypes.DurationObservation_17 == requestElementType) {
			return getGEFWrapper(new DurationObservationCreateCommandCN(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if (UMLElementTypes.TimeConstraint_15 == requestElementType) {
			return getGEFWrapper(new TimeConstraintCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if (UMLElementTypes.TimeObservation_16 == requestElementType) {
			return getGEFWrapper(new TimeObservationCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		if (UMLElementTypes.GeneralOrdering_67 == requestElementType) {
			return getGEFWrapper(new GeneralOrderingCreateCommand(req, DiagramUtils.getDiagramFrom(getHost())));
		}
		return super.getCreateCommand(req);
	}
}
