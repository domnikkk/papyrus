/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.commands;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.ICompositeOperation;
import org.eclipse.core.commands.operations.IOperationApprover;
import org.eclipse.core.commands.operations.IOperationApprover2;
import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IOperationHistoryListener;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.workspace.EMFCommandOperation;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.papyrus.commands.wrappers.EMFtoGEFCommandWrapper;
import org.eclipse.papyrus.commands.wrappers.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.commands.wrappers.GEFtoEMFCommandWrapper;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;

public class CheckedOperationHistory implements IOperationHistory {

	private static class CheckedOperationHistoryHolder {

		public static final CheckedOperationHistory instance = new CheckedOperationHistory();
	}

	public static CheckedOperationHistory getInstance() {
		return CheckedOperationHistoryHolder.instance;
	}

	protected static final IOperationApprover2[] approversArray;

	protected IOperationHistory history;

	private static class ApproverPriorityPair implements Comparable<ApproverPriorityPair> {

		public IOperationApprover2 approver;

		public int priority;

		public int compareTo(ApproverPriorityPair o) {
			if(o.priority > priority) {
				return 1;
			} else if(o.priority < priority) {
				return -1;
			} else {
				return 0;
			}
		}

	}

	static {
		IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.papyrus.commands", "operationApprover");

		List<ApproverPriorityPair> approverPriorityPairs = new LinkedList<ApproverPriorityPair>();
		for(IConfigurationElement elem : configElements) {
			if("operationApprover".equals(elem.getName())) {
				try {
					ApproverPriorityPair approverPriorityPair = new ApproverPriorityPair();
					approverPriorityPair.approver = (IOperationApprover2)elem.createExecutableExtension("class");
					approverPriorityPair.priority = Integer.parseInt(elem.getAttribute("priority"));

					approverPriorityPairs.add(approverPriorityPair);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		Collections.sort(approverPriorityPairs);

		approversArray = new IOperationApprover2[approverPriorityPairs.size()];

		for(int i = 0; i < approversArray.length; i++) {
			approversArray[i] = approverPriorityPairs.get(i).approver;
		}
	}

	private CheckedOperationHistory() {
		history = OperationHistoryFactory.getOperationHistory();
	}

	/*
	 * Consult the IOperationApprovers to see if the proposed redo should be
	 * allowed.
	 */
	public IStatus getRedoApproval(IUndoableOperation operation, IAdaptable info) {
		operation = unwrapOperation(operation);
		for(int i = 0; i < approversArray.length; i++) {
			IStatus approval = approversArray[i].proceedRedoing(operation, this, info);
			if(!approval.isOK()) {
				return approval;
			}
		}
		return Status.OK_STATUS;
	}

	/*
	 * Consult the IOperationApprovers to see if the proposed undo should be
	 * allowed.
	 */
	public IStatus getUndoApproval(IUndoableOperation operation, IAdaptable info) {
		operation = unwrapOperation(operation);
		for(int i = 0; i < approversArray.length; i++) {
			IStatus approval = approversArray[i].proceedUndoing(operation, this, info);
			if(!approval.isOK()) {
				return approval;
			}
		}
		return Status.OK_STATUS;
	}

	/*
	 * Consult the IOperationApprovers to see if the proposed execution should
	 * be allowed.
	 * 
	 * @since 3.2
	 */
	public IStatus getExecuteApproval(IUndoableOperation operation, IAdaptable info) {
		operation = unwrapOperation(operation);
		for(int i = 0; i < approversArray.length; i++) {
			IStatus approval = approversArray[i].proceedExecuting(operation, this, info);
			if(!approval.isOK()) {
				return approval;
			}
		}
		return Status.OK_STATUS;
	}

	protected ICommand convertEMFCC(CompoundCommand compoundCommand) {
		CompositeCommand cc = new CompositeCommand(compoundCommand.getLabel());
		for (Command c : compoundCommand.getCommandList()) {
			cc.add(convertFromEMF(c));
		}
		return cc.reduce();
	}

	/**
	 * the unified command stack wraps ICommand GMFtoEMFCommandWrapper
	 * which are wrapped in EMFCommandOperation,
	 * unwrap it before validation
	 * 
	 * @param operation
	 * @return
	 */
	protected IUndoableOperation unwrapOperation(IUndoableOperation operation) {
		if(operation instanceof EMFCommandOperation) {
			Command emfCommand = ((EMFCommandOperation)operation).getCommand();
			return convertFromEMF(emfCommand);
		} else if (operation instanceof CommandProxy) {
			org.eclipse.gef.commands.Command gefCommand = ((CommandProxy) operation).getCommand();
			return convertFromGEF(gefCommand);
		} else if (operation instanceof EMFtoGMFCommandWrapper) {
			Command emfCommand = ((EMFtoGMFCommandWrapper) operation).getEMFCommand();
			return convertFromEMF(emfCommand);
		} else if (operation instanceof CompositeTransactionalCommand) {
			return unwrapInsideCC((CompositeTransactionalCommand)operation);
		} else if (operation instanceof CompositeCommand) {
			return unwrapInsideCC((CompositeCommand)operation);
		}

		return operation;
	}

	protected IUndoableOperation unwrapInsideCC(CompositeTransactionalCommand cc) {
		if (cc.size() == 1) {
			return unwrapOperation((IUndoableOperation) cc.iterator().next());
		}
		CompositeTransactionalCommand ccRes = new CompositeTransactionalCommand(cc.getEditingDomain(), cc.getLabel(), cc.getOptions());
		Iterator<IUndoableOperation> it = cc.iterator();
		while (it.hasNext()) {
			IUndoableOperation next = it.next();
			ccRes.add(unwrapOperation(next));
		}
		return ccRes;
	}

	protected IUndoableOperation unwrapInsideCC(CompositeCommand cc) {
		if (cc.size() == 1) {
			return unwrapOperation((IUndoableOperation) cc.iterator().next());
		}
		CompositeCommand ccRes = new CompositeCommand(cc.getLabel());
		Iterator<IUndoableOperation> it = cc.iterator();
		while (it.hasNext()) {
			IUndoableOperation next = it.next();
			ccRes.add(unwrapOperation(next));
		}
		return ccRes;
	}

	protected IUndoableOperation convertFromEMF(Command emfCommand) {
		if (emfCommand instanceof CompoundCommand) {
			return convertEMFCC((CompoundCommand)emfCommand);
		}
		if(emfCommand instanceof GMFtoEMFCommandWrapper) {
			ICommand gmfCommand = ((GMFtoEMFCommandWrapper)emfCommand).getGMFCommand();
			return unwrapOperation(gmfCommand);
		}
		if(emfCommand instanceof GEFtoEMFCommandWrapper) {
			org.eclipse.gef.commands.Command gefCommand = ((GEFtoEMFCommandWrapper)emfCommand).getGEFCommand();
			return convertFromGEF(gefCommand);
		}
		return new EMFtoGMFCommandWrapper(emfCommand);
	}

	protected IUndoableOperation convertFromGEF(org.eclipse.gef.commands.Command gefCommand) {
		if (gefCommand instanceof ICommandProxy) {
			return unwrapOperation(((ICommandProxy) gefCommand).getICommand());
		}
		if (gefCommand instanceof EMFtoGEFCommandWrapper) {
			return convertFromEMF(((EMFtoGEFCommandWrapper) gefCommand).getEMFCommand());
		}
		if (gefCommand instanceof org.eclipse.gef.commands.CompoundCommand) {
			return convertGEFCC((org.eclipse.gef.commands.CompoundCommand)gefCommand);
		}
		return new CommandProxy(gefCommand);
	}

	protected IUndoableOperation convertGEFCC(org.eclipse.gef.commands.CompoundCommand gefCompoundCommand) {
		if (gefCompoundCommand.size() <= 1) {
			return convertFromGEF(gefCompoundCommand.unwrap());
		}
		CompositeCommand cc = new CompositeCommand(gefCompoundCommand.getLabel());
		for (Object gefCommand : gefCompoundCommand.getCommands()) {
			cc.add(convertFromGEF((org.eclipse.gef.commands.Command)gefCommand));
		}
		return cc;
	}

	public IStatus execute(IUndoableOperation operation, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		// check with the operation approvers
		IStatus status = getExecuteApproval(operation, info);
		if(!status.isOK()) {
			// not approved. No notifications are sent, just return the status.
			return status;
		}
		return history.execute(operation, monitor, info);
	}

	public IStatus undo(IUndoContext context, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		Assert.isNotNull(context);
		IUndoableOperation operation = getUndoOperation(context);

		// info if there is no operation
		if(operation == null) {
			return IOperationHistory.NOTHING_TO_UNDO_STATUS;
		}

		// check with the operation approvers
		IStatus status = getUndoApproval(operation, info);
		if(!status.isOK()) {
			// not approved. No notifications are sent, just return the status.
			return status;
		}
		return history.undo(context, monitor, info);
	}

	public IStatus redo(IUndoContext context, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		Assert.isNotNull(context);
		IUndoableOperation operation = getRedoOperation(context);

		// info if there is no operation
		if(operation == null) {
			return IOperationHistory.NOTHING_TO_REDO_STATUS;
		}

		// check with the operation approvers
		IStatus status = getRedoApproval(operation, info);
		if(!status.isOK()) {
			// not approved. No notifications are sent, just return the status.
			return status;
		}
		return history.redo(context, monitor, info);
	}

	// all the following methods are pure delegation

	public IStatus undoOperation(IUndoableOperation operation, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		return history.undoOperation(operation, monitor, info);
	}

	public void setLimit(IUndoContext context, int limit) {
		history.setLimit(context, limit);
	}

	public void replaceOperation(IUndoableOperation operation, IUndoableOperation[] replacements) {
		history.replaceOperation(operation, replacements);
	}

	public void removeOperationHistoryListener(IOperationHistoryListener listener) {
		history.removeOperationHistoryListener(listener);
	}

	public void removeOperationApprover(IOperationApprover approver) {
		history.removeOperationApprover(approver);
	}

	public IStatus redoOperation(IUndoableOperation operation, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		return redoOperation(operation, monitor, info);
	}

	public void operationChanged(IUndoableOperation operation) {
		history.operationChanged(operation);
	}

	public void openOperation(ICompositeOperation operation, int mode) {
		history.openOperation(operation, mode);
	}

	public IUndoableOperation getUndoOperation(IUndoContext context) {
		return history.getUndoOperation(context);
	}

	public IUndoableOperation[] getUndoHistory(IUndoContext context) {
		return history.getUndoHistory(context);
	}

	public IUndoableOperation getRedoOperation(IUndoContext context) {
		return history.getRedoOperation(context);
	}

	public IUndoableOperation[] getRedoHistory(IUndoContext context) {
		return history.getRedoHistory(context);
	}

	public int getLimit(IUndoContext context) {
		return history.getLimit(context);
	}

	public void dispose(IUndoContext context, boolean flushUndo, boolean flushRedo, boolean flushContext) {
		history.dispose(context, flushUndo, flushRedo, flushContext);
	}

	public void closeOperation(boolean operationOK, boolean addToHistory, int mode) {
		history.closeOperation(operationOK, addToHistory, mode);
	}

	public boolean canUndo(IUndoContext context) {
		return history.canUndo(context);
	}

	public boolean canRedo(IUndoContext context) {
		return history.canRedo(context);
	}

	public void addOperationHistoryListener(IOperationHistoryListener listener) {
		history.addOperationHistoryListener(listener);
	}

	public void addOperationApprover(IOperationApprover approver) {
		history.addOperationApprover(approver);
	}

	public void add(IUndoableOperation operation) {
		history.add(operation);
	}
}
