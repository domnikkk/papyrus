/*****************************************************************************
 * Copyright (c) 2013 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Arthur Daussy (Atos) arthur.daussy@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.controlmode.umlprofiles.participants;

import java.util.Collections;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.papyrus.controlmode.commands.AskUserCommand;
import org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant;
import org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant;
import org.eclipse.papyrus.controlmode.request.ControlModeRequest;
import org.eclipse.papyrus.controlmode.umlprofiles.commands.CopyProfileApplicationCommand;
import org.eclipse.papyrus.controlmode.umlprofiles.commands.MoveProfileApplicationCommand;
import org.eclipse.papyrus.controlmode.umlprofiles.commands.MoveStereotypeApplicationToControlResource;
import org.eclipse.papyrus.controlmode.umlprofiles.commands.RemoveDuplicationProfileApplicationCommand;
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
public class UMLProfileParticipant implements IControlCommandParticipant, IUncontrolCommandParticipant {

	/**
	 * Return the command to copy profile application
	 * 
	 * @param request
	 * @return
	 */
	protected IUndoableOperation getCopyProfileApplication(final ControlModeRequest request) {
		return new CopyProfileApplicationCommand(request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlModeParticipant#getID()
	 */
	public String getID() {
		return "UMLProfileParticipant";
	}

	private String getPreControlCommandMessage(Element objectToControl) {
		return "This element is not a package. Dued to UML restrictions the newly created model fragment will not be able to be modified in standalone mode";////$NON-NLS-0$
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#getPostControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPostControlCommand(ControlModeRequest request) {
		CompositeCommand cc = new CompositeCommand("Composite command for control command [UML Part]");
		//Move stereotype application
		if(request.getTargetObject() instanceof Package) {
			cc.compose(getMoveProfileAppliationCommand(request));
		}
		//Move stereotype application
		cc.compose(getMoveStereotypeCommand(request));
		//Copy profile application
		if(request.getTargetObject() instanceof Package) {
			cc.compose(getCopyProfileApplication(request));
		}
		return cc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant#getPostUncontrolCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPostUncontrolCommand(ControlModeRequest request) {
		CompositeCommand cc = new CompositeCommand("Composite command for uncontrol command [UML Part]");

		if(cc.isEmpty()) {
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
	private ICommand getMoveProfileAppliationCommand(ControlModeRequest request) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#getPreControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPreControlCommand(ControlModeRequest request) {
		Element elem = (Element)request.getTargetObject();
		if(request.isUIAction() && !(elem instanceof org.eclipse.uml2.uml.Package)) {
			return new AskUserCommand(request.getEditingDomain(), getPreControlCommandMessage(elem), getPreControlCommandDialogTitle(elem), true, "org.eclipse.papyrus.controlmode.umlprofiles.participants.UMLProfileParticipant.openstandalonemodeldialog");
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant#getPreUncontrolCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPreUncontrolCommand(ControlModeRequest request) {
		CompositeCommand cc = new CompositeCommand("Composite command for pre uncontrol command [UML Part]");
		//Copy profile application
		if(request.getTargetObject() instanceof Package) {
			cc.compose(getRemoveProfileApplication(request));
		}
		cc.compose(getMoveStereotypeCommand(request));
		return cc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlModeParticipant#getPriority()
	 */
	public int getPriority() {
		return 100;
	}

	private String getPreControlCommandDialogTitle(Element elem) {
		return "Warning not a package element";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#provideControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public boolean provideControlCommand(ControlModeRequest request) {
		return request.getTargetObject() instanceof Element;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant#provideUnControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public boolean provideUnControlCommand(ControlModeRequest request) {
		return request.getTargetObject() instanceof Element;
	}
}
