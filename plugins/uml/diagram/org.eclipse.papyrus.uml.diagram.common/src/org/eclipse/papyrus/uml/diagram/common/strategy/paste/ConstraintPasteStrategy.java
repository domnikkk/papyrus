/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.strategy.paste;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.EMFtoGEFCommandWrapper;
import org.eclipse.papyrus.commands.wrappers.GMFtoGEFCommandWrapper;
import org.eclipse.papyrus.infra.core.clipboard.IClipboardAdditionalData;
import org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.AbstractPasteStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.DefaultPasteStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy;
import org.eclipse.papyrus.uml.diagram.common.Activator;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;

/**
 * Offer a strategy for copying stereotypes.
 */
public class ConstraintPasteStrategy extends AbstractPasteStrategy implements IPasteStrategy {

	/** The instance. */
	private static IPasteStrategy instance = new ConstraintPasteStrategy();

	/**
	 * Gets the single instance of StereotypePasteStrategy.
	 *
	 * @return single instance of StereotypePasteStrategy
	 */
	public static IPasteStrategy getInstance() {
		return instance;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#getLabel()
	 */
	@Override
	public String getLabel() {
		return "ConstraintStrategy"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#getID()
	 */
	@Override
	public String getID() {
		return Activator.ID + ".ConstraintStrategy"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#getDescription()
	 */
	@Override
	public String getDescription() {
		return "Paste constraint elements and context links"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#dependsOn()
	 */
	@Override
	public IPasteStrategy dependsOn() {
		return DefaultPasteStrategy.getInstance();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#getSemanticCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 * org.eclipse.emf.ecore.EObject, org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard)
	 */
	@Override
	public org.eclipse.emf.common.command.Command getSemanticCommand(EditingDomain domain, EObject targetOwner, PapyrusClipboard<Object> papyrusClipboard) {
		if (targetOwner instanceof Element) {
			CompoundCommand compoundCommand = new CompoundCommand("Reassociate constraint context");
			Map<Object, ?> additionalDataMap = papyrusClipboard.getAdditionalDataForStrategy(getID());
			for (Iterator<Object> iterator = papyrusClipboard.iterator(); iterator.hasNext();) {
				Object object = iterator.next();
				// get target Element
				EObject target = papyrusClipboard.getTragetCopyFromInternalClipboardCopy(object);
				if (target != null && target instanceof Constraint) {
					ConstraintClipboard constraintClipboard = (ConstraintClipboard) additionalDataMap.get(object);
					Namespace context = constraintClipboard.getConstraint().getContext();
					if (checkContext(targetOwner, context)) {
						RecordingCommand buildSemanticCommand = buildSemanticCommand(domain, (Constraint) target, context);
						compoundCommand.append(buildSemanticCommand);
					}

				}
			}

			// An empty can't be executed
			if (compoundCommand.getCommandList().isEmpty()) {
				return null;
			}
			return compoundCommand;
		}
		return UnexecutableCommand.INSTANCE;

	}

	@Override
	public Command getGraphicalCommand(EditingDomain domain, GraphicalEditPart targetEditPart, PapyrusClipboard<Object> papyrusClipboard) {
		Set<Constraint> alreadyprocesed = new HashSet<Constraint>();
		View targetView = (View) targetEditPart.getModel();
		EObject targetOwner = targetView.getElement();
		org.eclipse.gef.commands.CompoundCommand compoundCommand = new org.eclipse.gef.commands.CompoundCommand("Reassociate constraint context");
		Map<Object, ?> additionalDataMap = papyrusClipboard.getAdditionalDataForStrategy(getID());

		for (Iterator<Object> iterator = papyrusClipboard.iterator(); iterator.hasNext();) {
			Object object = iterator.next();
			// get target Element
			EObject target = papyrusClipboard.getTragetCopyFromInternalClipboardCopy(object);

			if (target instanceof View && ((View) target).getElement() instanceof Constraint) {
				Constraint targetConstraint = (Constraint) ((View) target).getElement();
				if (!alreadyprocesed.contains(targetConstraint)) {
					Object internalFromTarget = getInternalFromTarget(papyrusClipboard, targetConstraint);
					ConstraintClipboard constraintClipboard = (ConstraintClipboard) additionalDataMap.get(internalFromTarget);
					Namespace context = constraintClipboard.getConstraint().getContext();
					if (checkContext(targetOwner, context)) {
						RecordingCommand semanticCommand = buildSemanticCommand(domain, targetConstraint, context);
						if (semanticCommand != null) {
							compoundCommand.add(EMFtoGEFCommandWrapper.wrap(semanticCommand));
							ShowConstraintContextLink command = new ShowConstraintContextLink((TransactionalEditingDomain) domain, targetEditPart, (View) target);
							compoundCommand.add(GMFtoGEFCommandWrapper.wrap(command));
							alreadyprocesed.add(targetConstraint);
						}
					}

				}
			}
		}
		// An empty can't be executed
		if (compoundCommand.getChildren().length == 0) {
			return null;
		}
		return compoundCommand;
	}

	protected RecordingCommand buildSemanticCommand(EditingDomain domain, final Constraint targetConstraint, final Namespace context) {
		RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) domain, "Set Context for constraint") {
			@Override
			protected void doExecute() {
				targetConstraint.setContext(context);
			}
		};
		return command;
	}

	/**
	 * Check if the target contains the context
	 * 
	 * @param targetOwner
	 * @param context
	 * @return
	 */
	protected boolean checkContext(EObject targetOwner, Namespace context) {
		boolean contains = false;
		if (targetOwner instanceof Namespace) {
			Namespace targetNamespace = (Namespace) targetOwner;
			contains = targetNamespace.getMembers().contains(context);
		}
		return contains;
	}



	/**
	 * Get the internal clipboard value from the target value
	 * 
	 * @param papyrusClipboard
	 * @param target
	 * @return
	 */
	protected Object getInternalFromTarget(PapyrusClipboard<Object> papyrusClipboard, EObject target) {
		Map<Object, EObject> internalClipboardToTargetCopy = papyrusClipboard.getInternalClipboardToTargetCopy();
		Set<Entry<Object, EObject>> entrySet = internalClipboardToTargetCopy.entrySet();
		for (Entry<Object, EObject> entry : entrySet) {
			if (entry.getValue().equals(target)) {
				return entry.getKey();
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#prepare(org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard)
	 */
	@Override
	public void prepare(PapyrusClipboard<Object> papyrusClipboard, Collection<EObject> selection) {
		Map<Object, IClipboardAdditionalData> mapCopyToConstraintData = new HashMap<Object, IClipboardAdditionalData>();
		for (Iterator<EObject> iterator = papyrusClipboard.iterateOnSource(); iterator.hasNext();) {
			EObject eObjectSource = iterator.next();
			if (eObjectSource instanceof Constraint) {
				Constraint constraint = (Constraint) eObjectSource;
				ConstraintClipboard constraintClipboard = new ConstraintClipboard(constraint);
				Object copy = papyrusClipboard.getCopyFromSource(eObjectSource);
				mapCopyToConstraintData.put(copy, constraintClipboard);
			}
		}
		papyrusClipboard.pushAdditionalData(getID(), mapCopyToConstraintData);
	}

	/**
	 * This Class store the constraint with the context
	 */
	protected class ConstraintClipboard implements IClipboardAdditionalData {

		/** The stereotype. */
		protected Constraint constraint;

		/**
		 * @param stereotypes
		 */
		public ConstraintClipboard(Constraint constraint) {
			this.constraint = constraint;
		}

		/**
		 * @return
		 */
		public Constraint getConstraint() {
			return constraint;
		}

	}
}
