package org.eclipse.papyrus.uml.merger.provider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.compare.EMFComparePlugin;
import org.eclipse.emf.compare.FactoryException;
import org.eclipse.emf.compare.diff.internal.merge.impl.ModelElementChangeLeftTargetMerger;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceOrderChange;
import org.eclipse.emf.compare.util.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.uml.compare.merger.utils.MergerUtils;
import org.eclipse.papyrus.uml.compare.merger.utils.PapyrusEFactory;

//TODO : should be redone, to re-implements Efactory.eAdd, ...aso
public class CModelElementChangeLeftTargetMerger extends ModelElementChangeLeftTargetMerger {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.diff.merge.api.AbstractMerger#doApplyInOrigin()
	 */
	@Override
	protected void doApplyInOrigin() {

		if(MergerUtils.usePapyrusMerger()) {
			final ModelElementChangeLeftTarget theDiff = (ModelElementChangeLeftTarget)this.diff;
			final EObject element = theDiff.getLeftElement();
			TransactionalEditingDomain domain = MergerUtils.getEditingDomain();
			Command cmd = PapyrusMergeCommandProvider.INSTANCE.getDestroyCommand(domain, element);
			domain.getCommandStack().execute(cmd);
		} else {
			super.doApplyInOrigin();
		}
	}

	@Override
	protected void doUndoInTarget() {
		if(MergerUtils.usePapyrusMerger()) {
			TransactionalEditingDomain domain = MergerUtils.getEditingDomain();
			CompoundCommand cmd = new CompoundCommand("ModelElementChangeLeftTargetCommand#doUndoInTarget");
			final ModelElementChangeLeftTarget theDiff = (ModelElementChangeLeftTarget)this.diff;
			// we should copy the element to the Origin one.
			final EObject origin = theDiff.getRightParent();
			final EObject element = theDiff.getLeftElement();
			final EObject newOne = copy(element);
			final EReference ref = element.eContainmentFeature();
			if (ref != null) {
				try {
					int elementIndex = -1;
					if (ref.isMany()) {
						final Object containmentRefVal = element.eContainer().eGet(ref);
						if (containmentRefVal instanceof List<?>) {
							@SuppressWarnings("unchecked")
							final List<EObject> listVal = (List<EObject>)containmentRefVal;
							elementIndex = listVal.indexOf(element);
						}
					}
//					EFactory.eAdd(origin, ref.getName(), newOne, elementIndex, true);
//					setXMIID(newOne, getXMIID(element));
					cmd.append(PapyrusEFactory.getEAddCommand(origin, ref.getName(),newOne,elementIndex,true));
					cmd.append(PapyrusMergeCommandProvider.INSTANCE.getSetXMIIDCommand(domain, newOne, getXMIID(element)));
				} catch (final FactoryException e) {
					EMFComparePlugin.log(e, true);
				}
			} else if (origin == null && getDiffModel().getRightRoots().size() > 0) {
//				getDiffModel().getRightRoots().get(0).eResource().getContents().add(newOne);
				cmd.append(PapyrusMergeCommandProvider.INSTANCE.getAddToResourceCommand(domain, getDiffModel().getRightRoots().get(0).eResource(), newOne));
			} else if (origin != null) {
//				origin.eResource().getContents().add(newOne);
				cmd.append(PapyrusMergeCommandProvider.INSTANCE.getAddToResourceCommand(domain, origin.eResource(), newOne));
			} else {
				throw new UnsupportedOperationException(NLS.bind("We can't merge this diff : {0}", theDiff));
			}
			// we should now have a look for RemovedReferencesLinks needing elements to apply
			final Iterator<EObject> siblings = getDiffModel().eAllContents();
			while (siblings.hasNext()) {
				final Object op = siblings.next();
				if (op instanceof ReferenceChangeLeftTarget) {
					final ReferenceChangeLeftTarget link = (ReferenceChangeLeftTarget)op;
					// now if I'm in the target References I should put my copy in the origin
					if (link.getRightTarget() != null && link.getRightTarget() == element) {
						link.setLeftTarget(newOne);
					}
				} else if (op instanceof ReferenceOrderChange) {
					final ReferenceOrderChange link = (ReferenceOrderChange)op;
					if (link.getRightElement() == origin && link.getReference() == ref) {
						final ListIterator<EObject> targetIterator = link.getRightTarget().listIterator();
						boolean replaced = false;
						while (!replaced && targetIterator.hasNext()) {
							final EObject target = targetIterator.next();
							if (target.eIsProxy()
									&& equalProxyURIs(((InternalEObject)target).eProxyURI(),
											EcoreUtil.getURI(element))) {
								targetIterator.set(newOne);
								replaced = true;
							}
						}
					}
				}
			}
			domain.getCommandStack().execute(cmd);
		} else {
			super.doUndoInTarget();
		}
	}
}
