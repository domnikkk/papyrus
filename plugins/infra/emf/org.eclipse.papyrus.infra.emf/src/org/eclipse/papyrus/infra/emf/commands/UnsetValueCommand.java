/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.emf.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.papyrus.infra.emf.requests.UnsetRequest;


/**
 * A command that unsets the value of a feature. Especially useful for explicitly {@link EStructuralFeature#isUnsettable() unsettable} features.
 */
public class UnsetValueCommand extends EditElementCommand {

	private final EStructuralFeature feature;

	/**
	 * Constructs a new command to set the value of a feature of a model
	 * element.
	 *
	 * @param request
	 *            the set value request
	 */
	public UnsetValueCommand(UnsetRequest request) {
		super(request.getLabel(), request.getElementToEdit(), request);

		this.feature = request.getFeature();
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		EObject elementToEdit = getElementToEdit();
		if (elementToEdit == null) {
			throw new ExecutionException("No element to edit"); //$NON-NLS-1$
		}

		elementToEdit.eUnset(feature);

		return CommandResult.newOKCommandResult();
	}

	@Override
	public boolean canExecute() {
		EObject elementToEdit = getElementToEdit();
		return (elementToEdit != null) && super.canExecute();
	}

}
