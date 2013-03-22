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
package org.eclipse.papyrus.controlmode.table.participants;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant;
import org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant;
import org.eclipse.papyrus.controlmode.request.ControlModeRequest;
import org.eclipse.papyrus.controlmode.table.commands.ControlTableCommand;
import org.eclipse.papyrus.uml.service.types.utils.ElementUtil;


/**
 * Participant used to move tab in correct resources
 * 
 * @author adaussy
 * 
 */
public class TableParticipant implements IControlCommandParticipant, IUncontrolCommandParticipant {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlModeParticipant#getID()
	 */
	public String getID() {
		return "org.eclipse.papyrus.controlmode.table.participants.TableParticipant";////$NON-NLS-0$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlModeParticipant#getPriority()
	 */
	public int getPriority() {
		return 40;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#provideControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public boolean provideControlCommand(ControlModeRequest request) {
		EObject objectToControl = request.getTargetObject();
		//If the element is a package then it should be openable in stand alone
		if(objectToControl == null) {
			return false;
		}
		//Only do something if there is some table inside
		Iterable<EObject> ite = ElementUtil.createDescendantTablesIterable(objectToControl);
		return ite.iterator().hasNext();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#getPreControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPreControlCommand(ControlModeRequest request) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#getPostControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPostControlCommand(ControlModeRequest request) {
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(request.getEditingDomain(), "Control command for di elements [Post Command]");
		cc.compose(new ControlTableCommand(request));
		return cc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant#provideUnControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public boolean provideUnControlCommand(ControlModeRequest request) {
		return provideControlCommand(request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant#getPreUncontrolCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPreUncontrolCommand(ControlModeRequest request) {
		return new ControlTableCommand(request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant#getPostUncontrolCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPostUncontrolCommand(ControlModeRequest request) {
		return null;
	}
}
