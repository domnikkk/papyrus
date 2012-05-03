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
 *  Vincent Lorenzo (CEA LIST) Vincent.Lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.compare.merger.internal.merger;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.compare.FactoryException;
import org.eclipse.emf.compare.diff.internal.merge.impl.ReferenceChangeLeftTargetMerger;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceOrderChange;
import org.eclipse.emf.compare.diff.metamodel.ResourceDependencyChange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.uml.compare.merger.Activator;
import org.eclipse.papyrus.uml.compare.merger.internal.utils.MergerUtils;
import org.eclipse.papyrus.uml.compare.merger.internal.utils.PapyrusCompareEObjectCopier;
import org.eclipse.papyrus.uml.compare.merger.internal.utils.PapyrusEFactory;
import org.eclipse.papyrus.uml.compare.merger.utils.ITransactionalMerger;


public class CReferenceChangeLeftTargetMerger extends ReferenceChangeLeftTargetMerger implements ITransactionalMerger {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.diff.merge.IMerger#applyInOrigin()
	 */
	@Override
	public void applyInOrigin() {
		if(MergerUtils.usePapyrusMerger()) {
			final TransactionalEditingDomain domain = MergerUtils.getEditingDomain();
			final Command cmd = getApplyInOriginCommand(domain);
			if(cmd.canExecute()) {
				domain.getCommandStack().execute(cmd);
			}
		} else {
			super.applyInOrigin();
		}
	}

	/**
	 * 
	 * @see org.eclipse.emf.compare.diff.merge.DefaultMerger#undoInTarget()
	 * 
	 */
	@Override
	public void undoInTarget() {
		if(MergerUtils.usePapyrusMerger()) {
			final TransactionalEditingDomain domain = MergerUtils.getEditingDomain();
			final Command cmd = getUndoInTargetCommand(domain);
			if(cmd.canExecute()) {
				domain.getCommandStack().execute(cmd);
			}
		} else {
			super.undoInTarget();
		}
	}

	public Command getApplyInOriginCommand(final TransactionalEditingDomain domain) {
		//		mergeRequiredDifferences(true);
		//		doApplyInOrigin();
		//		postProcess();
		CompoundCommand cmd = new CompoundCommand("Apply in Origin Command for CReferenceChangeLeftTargetMerger");
		cmd.append(getMergeRequiredDifferencesCommand(domain, true));
		cmd.append(getDoApplyInOriginCommand(domain));
		cmd.append(getPostProcessCommand(domain));
		return cmd;
	}

	public Command getUndoInTargetCommand(final TransactionalEditingDomain domain) {
		//		mergeRequiredDifferences(false);
		//		doUndoInTarget();
		//		postProcess();

		CompoundCommand cmd = new CompoundCommand("Undo In Target Command for CReferenceChangeLeftTargetMerger");
		cmd.append(getMergeRequiredDifferencesCommand(domain, false));
		cmd.append(getDoUndoInTargetCommand(domain));
		cmd.append(getPostProcessCommand(domain));
		return cmd;
	}


	public Command getDoApplyInOriginCommand(final TransactionalEditingDomain domain) {
		final CompoundCommand cmd = new CompoundCommand("CReferenceChangeLeftTargetMerger#getDoApplyInOriginCommand");
		final ReferenceChangeLeftTarget theDiff = (ReferenceChangeLeftTarget)this.diff;
		final EObject element = theDiff.getLeftElement();
		final EObject leftTarget = theDiff.getLeftTarget();
		try {
			cmd.append(PapyrusEFactory.getERemoveCommand(domain, element, theDiff.getReference().getName(), leftTarget));
		} catch (final FactoryException e) {
			Activator.log.error(e);
		}
		cmd.append(new GMFtoEMFCommandWrapper(new AbstractTransactionalCommand(domain, null, null) {

			@Override
			protected CommandResult doExecuteWithResult(final IProgressMonitor monitor, final IAdaptable info) throws ExecutionException {
				// we should now have a look for AddReferencesLinks needing this object
				final Iterator<EObject> siblings = getDiffModel().eAllContents();
				while(siblings.hasNext()) {
					final DiffElement op = (DiffElement)siblings.next();
					if(op instanceof ReferenceChangeLeftTarget) {
						final ReferenceChangeLeftTarget link = (ReferenceChangeLeftTarget)op;
						// now if I'm in the target References I should put my copy in the origin
						if(link.getReference().equals(theDiff.getReference().getEOpposite()) && link.getLeftTarget().equals(element)) {
							removeFromContainer(link);
						}
					} else if(op instanceof ResourceDependencyChange) {
						final ResourceDependencyChange link = (ResourceDependencyChange)op;
						final Resource res = link.getRoots().get(0).eResource();
						if(res == leftTarget.eResource()) {
							EcoreUtil.remove(link);
							res.unload();
						}
					}
				}
				return CommandResult.newOKCommandResult();
			}
		}));
		return cmd;
	}

	public Command getDoUndoInTargetCommand(final TransactionalEditingDomain domain) {
		final CompoundCommand cmd = new CompoundCommand();
		final ReferenceChangeLeftTarget theDiff = (ReferenceChangeLeftTarget)this.diff;
		final EReference reference = theDiff.getReference();
		final EObject element = theDiff.getRightElement();
		final EObject leftTarget = theDiff.getLeftTarget();
		final EObject rightTarget = theDiff.getRightTarget();

		int index = -1;
		if(reference.isMany()) {
			final EObject leftElement = theDiff.getLeftElement();
			final Object leftRefValue = leftElement.eGet(reference);
			if(leftRefValue instanceof List) {
				final List<?> refLeftValueList = (List<?>)leftRefValue;
				index = refLeftValueList.indexOf(leftTarget);
			}
		}
		final PapyrusCompareEObjectCopier copier = new PapyrusCompareEObjectCopier(diff);
		Command copierCommand = copier.getCopyReferenceValueCommand(domain, reference, element, leftTarget, rightTarget, index);
		cmd.append(copierCommand);
		final AbstractTransactionalCommand updateDiffModelCommand = new AbstractTransactionalCommand(domain, "Update Diff Model", null) {

			@Override
			protected CommandResult doExecuteWithResult(final IProgressMonitor monitor, final IAdaptable info) throws ExecutionException {
				final EObject copiedValue = copier.getCopiedValue(leftTarget);
				final Iterator<EObject> siblings = getDiffModel().eAllContents();
				while(siblings.hasNext()) {
					final DiffElement op = (DiffElement)siblings.next();
					if(op instanceof ReferenceChangeLeftTarget) {
						final ReferenceChangeLeftTarget link = (ReferenceChangeLeftTarget)op;
						// now if I'm in the target References I should put my copy in the origin
						if(link.getReference().equals(reference.getEOpposite()) && link.getLeftTarget().equals(element)) {
							removeFromContainer(link);
						}
					} else if(op instanceof ReferenceOrderChange) {
						final ReferenceOrderChange link = (ReferenceOrderChange)op;
						if(link.getLeftElement() == element && link.getReference() == reference) {
							final ListIterator<EObject> targetIterator = link.getLeftTarget().listIterator();
							boolean replaced = false;
							while(!replaced && targetIterator.hasNext()) {
								final EObject target = targetIterator.next();
								if(target.eIsProxy() && equalProxyURIs(((InternalEObject)target).eProxyURI(), EcoreUtil.getURI(leftTarget))) {
									targetIterator.set(copiedValue);
									replaced = true;
								}
							}
						}
					}
				}
				return CommandResult.newOKCommandResult();
			}
		};
		cmd.append(new GMFtoEMFCommandWrapper(updateDiffModelCommand));
		return cmd;
	}

	public Command getMergeRequiredDifferencesCommand(final TransactionalEditingDomain domain, final boolean applyInOrigin) {
		return new GMFtoEMFCommandWrapper(new AbstractTransactionalCommand(domain, "Merge Required Differences", null) {

			@Override
			protected CommandResult doExecuteWithResult(final IProgressMonitor monitor, final IAdaptable info) throws ExecutionException {
				CReferenceChangeLeftTargetMerger.this.mergeRequiredDifferences(applyInOrigin);
				return null;
			}
		});
	}

	public Command getPostProcessCommand(final TransactionalEditingDomain domain) {
		return new GMFtoEMFCommandWrapper(new AbstractTransactionalCommand(domain, "Merge Required Differences", null) {

			@Override
			protected CommandResult doExecuteWithResult(final IProgressMonitor monitor, final IAdaptable info) throws ExecutionException {
				CReferenceChangeLeftTargetMerger.this.postProcess();
				return null;
			}
		});
	}


}
