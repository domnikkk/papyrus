/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.service.types.helper;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.MoveElementsCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.uml.service.types.command.NotContainmentMoveCommand;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * this is an helper that redirect destroy request to get destroy command from uml plugin
 *
 */

public class ActivityNodeHelper extends ElementEditHelper {

	/** 
	 * Parameter name for {@link ConfigureRequest}
	 * Used to pass the actual partition instance to set {@link ActivityNode#getInPartition()}
	 */
	public static final String IN_PARTITION = "IN_PARTITION";
	
	public static final String IN_INTERRUPTIBLE_ACTIVITY_REGION = "IN_INTERRUPTIBLE_ACTIVITY_REGION";
	
	@Override
	protected ICommand getBasicDestroyElementCommand(DestroyElementRequest req) {
		ICommand result =  new DestroyActivityNode(req);

		return result;
	}

	@Override
	protected ICommand getMoveCommand(MoveRequest req) {
		if (req != null) {
			if (req.getTargetContainer() instanceof ActivityPartition) {
				ActivityPartition partition = (ActivityPartition)req.getTargetContainer();
				CompositeCommand result = new CompositeCommand("Move elements in Partition");
				MoveElementsCommand moveCommand = new NotContainmentMoveCommand(createMoveToPartitionRequest(req));
				result.add(moveCommand);
				for (Object o: req.getElementsToMove().keySet()) {
					result.add(new SetValueCommand(new SetRequest(partition, UMLPackage.eINSTANCE.getActivityPartition_Node(), o)));
				}
				return result;
			}
		}
		return super.getMoveCommand(req);
	}
	
	/**
	 * @param base move request in which target container is ActivityPartition
	 * @return MoveRequest in which replaced Partition container on Activity and replaced containment features for it.
	 */
	private MoveRequest createMoveToPartitionRequest(MoveRequest baseReq) {
		if (baseReq == null) {
			return null;
		}
		MoveRequest result = new MoveRequest(baseReq.getEditingDomain(), findActivity(baseReq.getTargetContainer()), baseReq.getElementsToMove());
		for (Object o : baseReq.getElementsToMove().keySet()) {
			if (o instanceof ActivityNode) {
				ActivityNode node = (ActivityNode)o;
				result.setTargetFeature(node ,findActivityFeature(node.eClass()));
			}
		}
		return result;
	}

	/**
	 * Find parent Activity.
	 * 
	 * @param editElement ActivitiyPartition element
	 * @return null if Activity not found.
	 */
	protected Activity findActivity(EObject editElement) {
		if (editElement instanceof ActivityPartition) {
			ActivityPartition partition = (ActivityPartition) editElement;
			if (partition.eContainer() instanceof Activity) {
				return (Activity)partition.eContainer();
			} else {
				return findActivity(partition.eContainer());
			}
		}
		return null;
	}
	
	/**
	 * Find Activity feature appropriate to ActivityPartition feature.
	 * 
	 * @return Appropriate feature. If feature not found return partitionFeature param
	 */
	protected EReference findActivityFeature(EClass eClass) {
		if (UMLPackage.eINSTANCE.getActivityPartition().isSuperTypeOf(eClass)) {
			return UMLPackage.eINSTANCE.getActivity_StructuredNode();
		}	
		if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(eClass)) {
			return UMLPackage.eINSTANCE.getActivity_StructuredNode();
		}
		return UMLPackage.eINSTANCE.getActivity_OwnedNode();
	}
	
	@Override
	protected ICommand getConfigureCommand(ConfigureRequest req) {
		if (req.getParameter(IN_INTERRUPTIBLE_ACTIVITY_REGION) != null) {
			return new SetValueCommand(new SetRequest((EObject)req.getParameter(IN_INTERRUPTIBLE_ACTIVITY_REGION),UMLPackage.eINSTANCE.getInterruptibleActivityRegion_Node(), req.getElementToConfigure()));
		}
		return super.getConfigureCommand(req);
	}
	
	/**
	 * inner class for the destruction of element
	 *
	 */
	private class DestroyActivityNode extends DestroyElementCommand{


		private Command emfcmd=null;
		public DestroyActivityNode(DestroyElementRequest request) {
			super(request);
		}
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
			//this code comes from super class and we replace explicitly by a call of the command of UML
			// for node specific commands have been done
			EObject destructee = getElementToDestroy();

			// only destroy attached elements
			if ((destructee != null) && (destructee.eResource() != null)) {
				
				// here has been commented because uml commands take all in charge
				// tear down incoming references
				//tearDownIncomingReferences(destructee);

				// also tear down outgoing references, because we don't want
				//    reverse-reference lookups to find destroyed objects
				//tearDownOutgoingReferences(destructee);

				// remove the object from its container
				emfcmd=DeleteCommand.create(getRequest().getEditingDomain(),getElementToDestroy());
				if (emfcmd != null && emfcmd.canExecute()) {
					emfcmd.execute();
				}

			// here has been commented because uml commands take all in charge	
			// in case it was cross-resource-contained
			//	Resource res = destructee.eResource();
			//	if (res != null) {
			//res.getContents().remove(destructee);
			//	}
			}

			return CommandResult.newOKCommandResult();
		}


		@Override
		protected IStatus doUndo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			// The undo has to be explicitly called 
			emfcmd.canUndo();	
			emfcmd.undo();

			return Status.OK_STATUS;
		}

		@Override
		protected IStatus doRedo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			// The redo has to be explicitly called 
			//IStatus status =super.doRedo(monitor, info);
			// IStatus status =super.doRedo(monitor, info);
			// emfcmd.canExecute();
			emfcmd.redo();
			
			return Status.OK_STATUS;
		}
	}
}
