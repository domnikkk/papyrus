/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.controlmode;

import static org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.PackageRefactoringContext.getPackagesBeingControlled;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeRequest;
import org.eclipse.papyrus.infra.services.controlmode.participants.IControlCommandParticipant;
import org.eclipse.papyrus.infra.services.controlmode.participants.IUncontrolCommandParticipant;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.commands.ConfirmSaveCommand;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.commands.DecoratorModelRefactoringCommandFactory;
import org.eclipse.uml2.uml.Package;

/**
 * Control-mode participant for handling dependent decorator models that apply profiles to the
 * package(s) being controlled in new resource(s).
 */
public class DecoratorModelControlModeParticipant implements IControlCommandParticipant, IUncontrolCommandParticipant {
	static final String PARTICIPANT_ID = Activator.PLUGIN_ID + ".participant"; //$NON-NLS-1$

	public DecoratorModelControlModeParticipant() {
		super();
	}

	@Override
	public String getID() {
		return PARTICIPANT_ID;
	}

	@Override
	public int getPriority() {
		// We really want this to be the last participant to run, both in control and uncontrol cases
		return -100;
	}

	@Override
	public boolean provideControlCommand(ControlModeRequest request) {
		return hasExternalProfileApplications(request, true);
	}

	@Override
	public ICommand getPreControlCommand(ControlModeRequest request) {
		// Refactoring is done as a post-process
		ICommand result = null;

		if (request.isUIAction() && hasExternalProfileApplications(request, false)) {
			// Refactoring will require save, so prompt the user
			result = new ConfirmSaveCommand(Activator.getActiveWorkbenchWindow().getShell());
		}

		try {
			result = CompositeCommand.compose(result, DecoratorModelRefactoringCommandFactory.createPreCommand(request));
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
			result = new UnexecutableCommand(e.getStatus());
		}

		return result;
	}

	@Override
	public ICommand getPostControlCommand(ControlModeRequest request) {
		try {
			return DecoratorModelRefactoringCommandFactory.createPostCommand(request);
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
			return new UnexecutableCommand(e.getStatus());
		}
	}

	@Override
	public boolean provideUnControlCommand(ControlModeRequest request) {
		return hasExternalProfileApplications(request, true);
	}

	@Override
	public ICommand getPreUncontrolCommand(ControlModeRequest request) {
		// Refactoring is done as a post-process
		ICommand result = null;

		if (request.isUIAction() && hasExternalProfileApplications(request, false)) {
			// Refactoring will require save, so prompt the user
			result = new ConfirmSaveCommand(Activator.getActiveWorkbenchWindow().getShell());
		}

		try {
			result = CompositeCommand.compose(result, DecoratorModelRefactoringCommandFactory.createPreCommand(request));
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
			result = new UnexecutableCommand(e.getStatus());
		}

		return result;
	}

	@Override
	public ICommand getPostUncontrolCommand(ControlModeRequest request) {
		try {
			return DecoratorModelRefactoringCommandFactory.createPostCommand(request);
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
			return new UnexecutableCommand(e.getStatus());
		}
	}

	protected boolean hasExternalProfileApplications(ControlModeRequest request, boolean includeLoaded) {
		boolean result = false;

		for (Package next : getPackagesBeingControlled(request.getTargetObject())) {
			try {
				result = !DecoratorModelUtils.getAllDecoratorModelAppliedProfileDefinitions(next, includeLoaded, true).isEmpty();
			} catch (CoreException e) {
				// Assume that some refactoring is needed (the commands may later fail or, hopefully,
				// find nothing to do)
				result = true;
				Activator.getDefault().getLog().log(e.getStatus());
			}

			if (result) {
				break;
			}
		}

		return result;
	}
}
