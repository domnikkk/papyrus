/*****************************************************************************
 * Copyright (c) 2014 CEA LIST
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.blockdefinition.migration;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.infra.gmfdiag.common.reconciler.DiagramReconciler;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;

/**
 * Block Definition Diagram Reconciler from 0.9.1 to 1.0.0
 */
public class BDDReconcilier extends DiagramReconciler {

	@Override
	public ICommand getReconcileCommand(Diagram diagram) {
		return new BDDReconcileCommand(diagram);
	}

	/**
	 * change the root to the parent (Package), because BBD root can't be a Block see
	 * #439094
	 */
	protected class BDDReconcileCommand extends AbstractCommand {

		protected final Diagram diagram;

		public BDDReconcileCommand(Diagram diagram) {
			super("Migrate BDD Diagram");
			this.diagram = diagram;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
			EObject element = diagram.getElement();
			if(element instanceof org.eclipse.uml2.uml.Class) { // Block
				org.eclipse.uml2.uml.Class clazz = (org.eclipse.uml2.uml.Class) element;
				diagram.setElement(clazz.getNearestPackage());
				DiagramUtils.setOwner(diagram, element);
			}
			return CommandResult.newOKCommandResult();
		}

		@Override
		public boolean canUndo() {
			return false;
		}

		@Override
		public boolean canRedo() {
			return false;
		}

		@Override
		protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
			throw new ExecutionException("Should not be called, canRedo false");
		}

		@Override
		protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
			throw new ExecutionException("Should not be called, canUndo false");
		}
	}
}
