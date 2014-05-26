/*******************************************************************************
 * All rights reserved. This program and the accompanying materials
 * are property of the CEA, their use is subject to specific agreement 
 * with the CEA.
 * 
 * Contributors:
 *    CEA LIST - initial API and implementation
 *******************************************************************************/

package org.eclipse.papyrus.uml.diagram.example.programmaticcreation;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Implementation class for ClassAction action
 */
public class CreateCompositeDiagramElementsHandler extends CmdHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		if(selectedEObject instanceof Class) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if(!(selectedEObject instanceof NamedElement)) {
			return null;
		}

		final NamedElement element = (NamedElement)selectedEObject;

		// 1. select possible connectors according to port types
		// (only show compatible connectors check-box?)
		// 2. select implementation group according to connector type

		if(element instanceof Class) {
			// container dialog: either extension, rule or interceptor
			// how-to select? which? (and how-to add/remove?) - is standard dialog sufficient?
			IOperationHistory history = OperationHistoryFactory.getOperationHistory();
			try {
				AbstractEMFOperation command = new CreateCompositeDiagramElementsCommand(TransactionUtil.getEditingDomain(selectedEObject), event, (Class) element);
				history.execute(command, new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
