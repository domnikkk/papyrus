/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.uml.service.types.helper.advice;

import java.util.Collection;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;

/**
 * An advisor of element destruction that works around a problem in the redo of removal of elements from
 * containment references that are subsets. The change-description that is applied by the nesting
 * transactional command doesn't account for the subset-superset relationship, so we inject a command
 * that makes sure to clean up supersets on redo (undo is not a problem because the addition of an
 * element to the subset always internally updates the supersets).
 */
public class ContainmentSubsetRemovalAdvice extends AbstractEditHelperAdvice {

	// This parameter is set by generated semantic edit policies when delegating to "visual element types" to
	// decorate the semantic element command with advice targeting the visual element type, which is a hinted
	// element type specializing the semantic element type to suggest the way in which it should be presented
	// in the diagram.  Because our advice is already included in the semantic command, it isn't needed in
	// this additional decoration and, therefore, it won't cause problems when the visual element type is
	// a specialization (dubiously) of the null element type
	// (see https://www.eclipse.org/forums/index.php/t/781825/ for discussion of that problem)
	private static final String EDIT_POLICY_COMMAND = "edit policy command"; //$NON-NLS-1$

	public ContainmentSubsetRemovalAdvice() {
		super();
	}

	@Override
	protected ICommand getAfterDestroyElementCommand(DestroyElementRequest request) {
		ICommand result = super.getAfterDestroyElementCommand(request);

		if(request.getParameter(EDIT_POLICY_COMMAND) != null) {
			return result;
		}

		final EObject destructee = request.getElementToDestroy();

		EReference containment = destructee.eContainmentFeature();
		final Collection<EReference> supersets = !UmlUtils.isSubset(containment) ? null : UmlUtils.getAllChangeableSupersets(containment);

		if(supersets != null) {
			// Add a command that ensures removal from the supersets on redo, if necessary
			final EObject container = destructee.eContainer();

			ICommand advice = new AbstractCommand("Ensure supersets") {

				@Override
				protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
					// Ensure sanity of the supersets, which redoing the recorded ChangeDescription does not
					for(EReference superset : supersets) {
						remove(container, superset, destructee);
					}

					return CommandResult.newOKCommandResult();
				}

				private void remove(EObject owner, EReference reference, EObject object) {
					if(reference.isMany()) {
						((Collection<?>)owner.eGet(reference)).remove(object);
					} else if(owner.eGet(reference) == object) {
						owner.eUnset(reference);
					}
				}

				@Override
				protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
					// Initial execution is never a problem
					return CommandResult.newOKCommandResult();
				}

				@Override
				protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
					// Undoing the deletion is never a problem
					return CommandResult.newOKCommandResult();
				}
			};

			result = (result == null) ? advice : result.compose(advice);
		}

		return result;
	}
}
