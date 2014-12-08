/*****************************************************************************
 * Copyright (c) 2010 CEA
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Soyatec - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.sequence.command;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.papyrus.uml.diagram.sequence.edit.commands.MessageReorientCommand;
import org.eclipse.papyrus.uml.diagram.sequence.util.MessageConnectionHelper;
import org.eclipse.papyrus.uml.diagram.sequence.util.OccurrenceSpecificationHelper;
import org.eclipse.papyrus.uml.diagram.sequence.util.ReconnectMessageHelper;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * @author Jin Liu (jin.liu@soyatec.com)
 */
public class CustomMessageReorientCommand extends MessageReorientCommand {

	/**
	 * Constructor.
	 *
	 * @param request
	 */
	public CustomMessageReorientCommand(ReorientRelationshipRequest request) {
		super(request);
	}

	/**
	 * @Override
	 */
	@Override
	protected boolean canReorientSource() {
		if (!(getOldSource() instanceof Element && getNewSource() instanceof Element)) {
			return false;
		}
		Element target = getLink().getReceiveEvent();
		if (!(getLink().eContainer() instanceof Interaction)) {
			return false;
		}
		boolean canExistMessage = MessageConnectionHelper.canExist(getLink(), MessageSort.SYNCH_CALL_LITERAL, getNewSource(), target);
		if (!canExistMessage) {
			return false;
		}
		return MessageConnectionHelper.canReorientSource(getLink(), getNewSource());
	}

	/**
	 * @Override
	 */
	@Override
	protected boolean canReorientTarget() {
		if (!(getOldTarget() instanceof Element && getNewTarget() instanceof Element)) {
			return false;
		}
		Element source = getLink().getSendEvent();
		if (!(getLink().eContainer() instanceof Interaction)) {
			return false;
		}
		if (!MessageConnectionHelper.canExist(getLink(), MessageSort.SYNCH_CALL_LITERAL, source, getNewTarget())) {
			return false;
		}
		return MessageConnectionHelper.canReorientTarget(getLink(), getNewTarget());
	}

	/**
	 * @Override
	 */
	@Override
	protected CommandResult reorientSource() throws ExecutionException {
		MessageEnd sendEvent = getLink().getSendEvent();
		ReconnectMessageHelper.updateMessageEnd(sendEvent, getOldSource(), getNewSource());
		// Update Execution Ends after message reconnecte, see https://bugs.eclipse.org/bugs/show_bug.cgi?id=402975
		if (getOldSource() instanceof ExecutionSpecification && sendEvent == (((ExecutionSpecification) getOldSource()).getStart())) {
			OccurrenceSpecificationHelper.resetExecutionStart((ExecutionSpecification) getOldSource(), UMLFactory.eINSTANCE.createExecutionOccurrenceSpecification());
		}
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @Override
	 */
	@Override
	protected CommandResult reorientTarget() throws ExecutionException {
		MessageEnd receiveEvent = getLink().getReceiveEvent();
		ReconnectMessageHelper.updateMessageEnd(receiveEvent, getOldTarget(), getNewTarget());
		ReconnectMessageHelper.updateMessage(getLink());
		// Update Execution Ends after message reconnecte, see https://bugs.eclipse.org/bugs/show_bug.cgi?id=402975
		if (getOldTarget() instanceof ExecutionSpecification && receiveEvent == (((ExecutionSpecification) getOldTarget()).getStart())) {
			OccurrenceSpecificationHelper.resetExecutionStart((ExecutionSpecification) getOldTarget(), UMLFactory.eINSTANCE.createExecutionOccurrenceSpecification());
		}
		if (getNewTarget() instanceof ExecutionSpecification && receiveEvent instanceof MessageOccurrenceSpecification) {
			OccurrenceSpecificationHelper.resetExecutionStart((ExecutionSpecification) getNewTarget(), receiveEvent);
		}
		return CommandResult.newOKCommandResult(getLink());
	}
}
