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


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.papyrus.controlmode.commands.ControlDiagramsCommand;
import org.eclipse.papyrus.controlmode.commands.CreateControlResource;
import org.eclipse.papyrus.controlmode.commands.RemoveControlResourceCommand;
import org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant;
import org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant;
import org.eclipse.papyrus.controlmode.request.ControlModeRequest;
import org.eclipse.papyrus.resource.ModelSet;
import org.eclipse.papyrus.resource.notation.NotationModel;

/**
 * Particiant that will and diagram control
 * @author adaussy
 *
 */
public class NotationControlModeParticipant implements IControlCommandParticipant, IUncontrolCommandParticipant {

	/**
	 * Init target request to have the DIModel resource references
	 * 
	 * @param request
	 */
	private ICommand setNotationTargetRequest(ControlModeRequest request) {
		URI notationURI = request.getNewURI().trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION);
		ModelSet modelSet = request.getModelSet();
		if(modelSet != null) {
			Resource diResource = modelSet.getResource(notationURI, false);
			if(diResource == null) {
				return UnexecutableCommand.INSTANCE;
			}
			request.setTargetResource(diResource, NotationModel.NOTATION_FILE_EXTENSION);
			//Nothing to do but everithing is og
			return null;
		}
		return UnexecutableCommand.INSTANCE;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlModeParticipant#getID()
	 */
	public String getID() {
		return "org.eclipse.papyrus.controlmode.participants.NotationControlModeParticipant";////$NON-NLS-0$
	}

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#getPostControlCommand(org.eclipse.papyrus.controlmode.request.ControlModeRequest)
	 */
	public ICommand getPostControlCommand(ControlModeRequest request) {
		return new ControlDiagramsCommand(request);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant#getPostUncontrolCommand(org.eclipse.papyrus.controlmode.request.ControlModeRequest)
	 */
	public ICommand getPostUncontrolCommand(ControlModeRequest request) {
		return new RemoveControlResourceCommand(request, NotationModel.NOTATION_FILE_EXTENSION);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#getPreControlCommand(org.eclipse.papyrus.controlmode.request.ControlModeRequest)
	 */
	public ICommand getPreControlCommand(ControlModeRequest request) {
		//Create notation resource
		return new CreateControlResource(request, NotationModel.NOTATION_FILE_EXTENSION);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant#getPreUncontrolCommand(org.eclipse.papyrus.controlmode.request.ControlModeRequest)
	 */
	public ICommand getPreUncontrolCommand(ControlModeRequest request) {
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(request.getEditingDomain(), "Pre uncontrol command [Notation participant]");
		ICommand cmd = setNotationTargetRequest(request);
		if (cmd != null){
			cc.compose(cmd);
		}
		cc.compose(new ControlDiagramsCommand(request));
		return cc ;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlModeParticipant#getPriority()
	 */
	public int getPriority() {
		return 60;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#provideControlCommand(org.eclipse.papyrus.controlmode.request.ControlModeRequest)
	 */
	public boolean provideControlCommand(ControlModeRequest request) {
		return request.getTargetObject() instanceof EObject;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant#provideUnControlCommand(org.eclipse.papyrus.controlmode.request.ControlModeRequest)
	 */
	public boolean provideUnControlCommand(ControlModeRequest request) {
		return request.getTargetObject() instanceof EObject;
	}
}
