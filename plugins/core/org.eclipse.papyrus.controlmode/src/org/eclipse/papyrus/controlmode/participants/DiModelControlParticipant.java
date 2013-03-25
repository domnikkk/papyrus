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

import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.papyrus.controlmode.commands.AbstractControlCommandRequest;
import org.eclipse.papyrus.controlmode.commands.CreateControlResource;
import org.eclipse.papyrus.controlmode.commands.InitializeDIModel;
import org.eclipse.papyrus.controlmode.commands.RemoveControlResourceCommand;
import org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant;
import org.eclipse.papyrus.controlmode.interfaces.IUncontrolCommandParticipant;
import org.eclipse.papyrus.controlmode.request.ControlModeRequest;
import org.eclipse.papyrus.resource.ModelSet;
import org.eclipse.papyrus.resource.sasheditor.DiModel;


/**
 * Control participant in charge of controling the di resources.
 * It move page ref to control resources
 * 
 * @author adaussy
 * 
 */
public class DiModelControlParticipant implements IControlCommandParticipant, IUncontrolCommandParticipant {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlModeParticipant#getID()
	 */
	public String getID() {
		return "org.eclipse.papyrus.controlmode.participants.DiModelControlParticipant";////$NON-NLS-0$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlModeParticipant#getPriority()
	 */
	public int getPriority() {
		return 80;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#provideControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public boolean provideControlCommand(ControlModeRequest request) {
		EObject objectBeingControl = request.getTargetObject();
		return objectBeingControl != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#getPreControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPreControlCommand(ControlModeRequest request) {
		return new CreateControlResource(request, DiModel.MODEL_FILE_EXTENSION);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.controlmode.interfaces.IControlCommandParticipant#getPostControlCommand(org.eclipse.papyrus.controlmode.request.
	 * ControlModeRequest)
	 */
	public ICommand getPostControlCommand(ControlModeRequest request) {
		return new InitializeDIModel(request);
	}

	public boolean provideUnControlCommand(ControlModeRequest request) {
		EObject objectBeingControl = request.getTargetObject();
		return objectBeingControl != null;
	}

	public ICommand getPreUncontrolCommand(ControlModeRequest request) {
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(request.getEditingDomain(), "Pre Uncontrol Command [ UML Participant]");
		ICommand cmd = setDiTargetRequest(request);
		if(cmd != null) {
			cc.compose(cmd);
		}
		cc.compose(getClearDiCommand(request));
		return cc;
	}

	private IUndoableOperation getClearDiCommand(final ControlModeRequest request) {
		ModelSet modelSet = request.getModelSet();
		IFile affectedFiles = WorkspaceSynchronizer.getFile(modelSet.getAssociatedResource(request.getTargetObject(), DiModel.DI_FILE_EXTENSION));
		return new ClearDiCommand(Collections.singletonList(affectedFiles), request);
	}

	public class ClearDiCommand extends AbstractControlCommandRequest {

		public ClearDiCommand(@SuppressWarnings("rawtypes") List affectedFiles, ControlModeRequest request) {
			super("Clear di command", affectedFiles, request);
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			ModelSet modelSet = getRequest().getModelSet();
			if (modelSet == null){
				return CommandResult.newErrorCommandResult("Unable to retreive resource set");
			}
			Resource oldDiresource = modelSet.getAssociatedResource(getRequest().getTargetObject(), DiModel.DI_FILE_EXTENSION);
			if (oldDiresource == null){
				return CommandResult.newErrorCommandResult("Unable to retreive old di resource");
			}
			oldDiresource.getContents().clear();
			return CommandResult.newOKCommandResult();
		}
	}


	/**
	 * Init target request to have the DIModel resource references
	 * 
	 * @param request
	 */
	private ICommand setDiTargetRequest(ControlModeRequest request) {
		URI diURI = request.getNewURI().trimFileExtension().appendFileExtension(DiModel.MODEL_FILE_EXTENSION);
		ModelSet modelSet = request.getModelSet();
		if(modelSet != null) {
			Resource diResource = modelSet.getResource(diURI, false);
			if(diResource == null) {
				return UnexecutableCommand.INSTANCE;
			}
			request.setTargetResource(diResource, DiModel.MODEL_FILE_EXTENSION);
			//Nothing to do but everithing is og
			return null;
		}
		return UnexecutableCommand.INSTANCE;
	}

	public ICommand getPostUncontrolCommand(ControlModeRequest request) {
		return new RemoveControlResourceCommand(request, DiModel.MODEL_FILE_EXTENSION);
	}
}
