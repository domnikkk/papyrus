/*****************************************************************************
 * Copyright (c) 2013, 2014 Atos, CEA LIST and etc..
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Arthur Daussy (Atos) arthur.daussy@atos.net - Initial API and implementation
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net -  Bug 436947
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.controlmode.profile;

import java.util.Collections;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeRequest;
import org.eclipse.papyrus.infra.services.controlmode.commands.AskUserCommand;
import org.eclipse.papyrus.infra.services.controlmode.participants.IControlCommandParticipant;
import org.eclipse.papyrus.infra.services.controlmode.participants.IUncontrolCommandParticipant;
import org.eclipse.papyrus.uml.controlmode.profile.commands.CopyProfileApplicationCommand;
import org.eclipse.papyrus.uml.controlmode.profile.commands.MoveProfileApplicationCommand;
import org.eclipse.papyrus.uml.controlmode.profile.commands.MoveStereotypeApplicationToControlResource;
import org.eclipse.papyrus.uml.controlmode.profile.commands.RemoveDuplicationProfileApplicationCommand;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

/**
 * Participant to control command handling Uml element.
 * Handle Profile applications on package
 * Handle Stereotype Application on Package
 *
 * @author adaussy
 *
 */
public class UMLProfileControlParticipant implements IControlCommandParticipant, IUncontrolCommandParticipant {


	/** The Constant PRE_UNCONTROL_COMMAND_LABEL. */
	private static final String PRE_UNCONTROL_COMMAND_LABEL = Messages.UMLProfileControlParticipant_Pre_Uncontrol_Command_Label;

	/** The Constant POST_UNCONTROL_COMMAND_LABEL. */
	private static final String POST_UNCONTROL_COMMAND_LABEL = Messages.UMLProfileControlParticipant_Post_Uncontrol_Command_Label;

	/** The Constant POST_CONTROL_COMMAND_LABEL. */
	private static final String POST_CONTROL_COMMAND_LABEL = Messages.UMLProfileControlParticipant_Post_Control_Command_Label;

	/**
	 * Return the command to copy profile application
	 *
	 * @param request
	 * @return
	 */
	protected IUndoableOperation getCopyProfileApplication(final ControlModeRequest request) {
		return new CopyProfileApplicationCommand(request);
	}

	public String getID() {
		return "org.eclipse.papyrus.uml.controlmode.profile.UMLProfileControlParticipant"; //$NON-NLS-1$
	}

	private String getPreControlCommandMessage(Element objectToControl) {
		return Messages.UMLProfileControlParticipant_controlmode_dialog_message;
	}

	/**
	 * Get the command to move stereotype application
	 *
	 * @param request
	 * @return
	 */
	protected IUndoableOperation getMoveStereotypeCommand(final ControlModeRequest request) {
		return new MoveStereotypeApplicationToControlResource(Collections.singletonList(WorkspaceSynchronizer.getFile(request.getTargetObject().eResource())), request);
	}

	public ICommand getPostControlCommand(ControlModeRequest request) {
		CompositeCommand cc = new CompositeCommand(POST_CONTROL_COMMAND_LABEL);
		// Move stereotype application
		if (request.getTargetObject() instanceof Package) {
			cc.compose(getMoveProfileAppliationCommand(request));
		}
		// Move stereotype application
		cc.compose(getMoveStereotypeCommand(request));
		// Copy profile application
		if (request.getTargetObject() instanceof Package) {
			cc.compose(getCopyProfileApplication(request));
		}
		return cc;
	}

	public ICommand getPostUncontrolCommand(ControlModeRequest request) {
		CompositeCommand cc = new CompositeCommand(POST_UNCONTROL_COMMAND_LABEL);

		if (cc.isEmpty()) {
			return null;
		}
		return cc;
	}

	/**
	 * Get the command to move profile applicaiton
	 *
	 * @param request
	 * @return
	 */
	protected ICommand getMoveProfileAppliationCommand(ControlModeRequest request) {
		return new MoveProfileApplicationCommand(request);
	}

	/**
	 * Get the command to remove profile application
	 *
	 * @param request
	 * @return
	 */
	protected ICommand getRemoveProfileApplication(final ControlModeRequest request) {
		return new RemoveDuplicationProfileApplicationCommand(request);
	}

	public ICommand getPreControlCommand(ControlModeRequest request) {
		Element elem = (Element) request.getTargetObject();
		if (request.isUIAction() && !(elem instanceof org.eclipse.uml2.uml.Package)) {
			return new AskUserCommand(request.getEditingDomain(), getPreControlCommandMessage(elem), getPreControlCommandDialogTitle(elem), true, "org.eclipse.papyrus.controlmode.umlprofiles.participants.UMLProfileParticipant.openstandalonemodeldialog"); //$NON-NLS-1$
		}
		return null;
	}

	public ICommand getPreUncontrolCommand(ControlModeRequest request) {
		CompositeCommand cc = new CompositeCommand(PRE_UNCONTROL_COMMAND_LABEL);
		// Copy profile application
		if (request.getTargetObject() instanceof Package) {
			cc.compose(getRemoveProfileApplication(request));
		}
		cc.compose(getMoveStereotypeCommand(request));
		return cc;
	}

	public int getPriority() {
		return 100;
	}

	protected String getPreControlCommandDialogTitle(Element elem) {
		return Messages.UMLProfileControlParticipant_controlmode_dialog_title;
	}

	public boolean provideControlCommand(ControlModeRequest request) {
		return request.getTargetObject() instanceof Element;
	}

	public boolean provideUnControlCommand(ControlModeRequest request) {
		return request.getTargetObject() instanceof Element;
	}
}
