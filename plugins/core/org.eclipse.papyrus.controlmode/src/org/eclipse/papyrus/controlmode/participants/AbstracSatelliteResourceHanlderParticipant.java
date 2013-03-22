/*******************************************************************************
 * Copyright (c) 2013 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Arthur Daussy <a href="mailto:arthur.daussy@atos.net"> - initial API and implementation
 ******************************************************************************/
package org.eclipse.papyrus.controlmode.participants;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.papyrus.controlmode.commands.CreateControlResource;
import org.eclipse.papyrus.controlmode.commands.RemoveControlResourceCommand;
import org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant;
import org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant;
import org.eclipse.papyrus.controlmode.request.ControlModeRequest;
import org.eclipse.papyrus.resource.ModelSet;

/**
 * Abstract implementation for {@link IControlCommandParticipant} and {@link IUncontrolCommandParticipant} for satelite resources such as notation,
 * di.
 * NOTE : This implementation is not used for now
 * @author adaussy
 * 
 */
/**
 * @author adaussy
 * 
 */
public abstract class AbstracSatelliteResourceHanlderParticipant implements IControlCommandParticipant, IUncontrolCommandParticipant {

	/**
	 * Get the satellite resource file extension
	 * 
	 * @return
	 */
	protected abstract String getResourceFileExtension();

	/**
	 * Get a correct label of the participant?
	 * Used for label of commands
	 * 
	 * @return
	 */
	protected abstract String getParticipantLabel();

	/**
	 * @return true if this participant should handle creation of the resource
	 */
	protected abstract boolean createNewResource();

	/**
	 * @return true if this participant should handle removal of the resource
	 */
	protected abstract boolean deleteOldResource();


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant#provideUnControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public boolean provideUnControlCommand(ControlModeRequest request) {
		return request.getTargetObject() != null;
	}

	/**
	 * Create a label for composite command
	 * 
	 * @param type
	 * @return
	 */
	protected String getCorrectCompositeLabel(String type) {
		return type + "Composite Command [" + getParticipantLabel() + "]";
	}

	/**
	 * Create a composite command
	 * 
	 * @param request
	 * @param type
	 * @return
	 */
	protected CompositeTransactionalCommand createCompositeTransactionalCommand(ControlModeRequest request, String type) {
		return new CompositeTransactionalCommand(request.getEditingDomain(), getCorrectCompositeLabel(type));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant#getPreUncontrolCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPreUncontrolCommand(ControlModeRequest request) {
		CompositeTransactionalCommand cc = createCompositeTransactionalCommand(request, "Pre Uncontrol");
		/*
		 * Fill the request with target resource. This is deduce from the request
		 */
		ICommand fillRequestFakeCommand = setSateliteTargetRequest(request);
		if(fillRequestFakeCommand != null) {
			cc.compose(fillRequestFakeCommand);
		}
		for(ICommand cmd : getPreUncontrolCommands(request)) {
			cc.compose(cmd);
		}
		if(cc != null && !cc.isEmpty()) {
			return cc;
		}
		return null;
	}

	/**
	 * Return the list of the {@link ICommand} for Pre Uncontrol command
	 * 
	 * @param request
	 * @return
	 */
	protected abstract List<ICommand> getPreUncontrolCommands(ControlModeRequest request);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant#getPostUncontrolCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPostUncontrolCommand(ControlModeRequest request) {
		CompositeTransactionalCommand cc = createCompositeTransactionalCommand(request, "Post Uncontrol");
		for(ICommand cmd : getPostUncontrolCommands(request)) {
			cc.compose(cmd);
		}
		if(deleteOldResource()) {
			cc.compose(new RemoveControlResourceCommand(request, getResourceFileExtension()));
		}
		if(cc != null && !cc.isEmpty()) {
			return cc;
		}
		return null;
	}

	/**
	 * Return the list of the {@link ICommand} for Post Uncontrol command
	 * 
	 * @param request
	 * @return
	 */
	protected abstract List<ICommand> getPostUncontrolCommands(ControlModeRequest request);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#provideControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public boolean provideControlCommand(ControlModeRequest request) {
		return request.getTargetObject() != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#getPreControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPreControlCommand(ControlModeRequest request) {
		CompositeTransactionalCommand cc = createCompositeTransactionalCommand(request, "Pre Control");
		for(ICommand cmd : getPreControlCommands(request)) {
			cc.compose(cmd);
		}
		if(cc != null && !cc.isEmpty()) {
			return cc;
		}
		return null;
	}

	/**
	 * Return the list of the {@link ICommand} for Pre Control command
	 * 
	 * @param request
	 * @return
	 */
	protected abstract List<ICommand> getPreControlCommands(ControlModeRequest request);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#getPostControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPostControlCommand(ControlModeRequest request) {
		CompositeTransactionalCommand cc = createCompositeTransactionalCommand(request, "Post Control");
		if(createNewResource()) {
			cc.compose(new CreateControlResource(request, getResourceFileExtension()));
		}
		for(ICommand cmd : getPostControlCommands(request)) {
			cc.compose(cmd);
		}
		if(cc != null && !cc.isEmpty()) {
			return cc;
		}
		return null;
	}

	/**
	 * Return the list of the {@link ICommand} for Post Control command
	 * 
	 * @param request
	 * @return
	 */
	protected abstract List<ICommand> getPostControlCommands(ControlModeRequest request);

	/**
	 * @param request
	 * @return null if everything is ok. return an unexecutable command is something went wrong
	 */
	private ICommand setSateliteTargetRequest(ControlModeRequest request) {
		URI sateliteResourceURI = request.getNewURI().trimFileExtension().appendFileExtension(getResourceFileExtension());
		ModelSet modelSet = request.getModelSet();
		if(modelSet != null) {
			Resource diResource = modelSet.getResource(sateliteResourceURI, false);
			if(diResource == null) {
				return UnexecutableCommand.INSTANCE;
			}
			request.setTargetResource(diResource, getResourceFileExtension());
			//Nothing to do but everything went fine
			return null;
		}
		return UnexecutableCommand.INSTANCE;
	}
}
