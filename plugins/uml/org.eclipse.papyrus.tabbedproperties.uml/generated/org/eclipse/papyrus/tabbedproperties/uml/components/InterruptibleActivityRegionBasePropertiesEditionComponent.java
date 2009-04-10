/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.tabbedproperties.uml.components;

// Start of user code for imports

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PathedPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement;
import org.eclipse.papyrus.tabbedproperties.uml.parts.InterruptibleActivityRegionPropertiesEditionPart;
import org.eclipse.papyrus.tabbedproperties.uml.parts.UMLViewsRepository;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.UMLPackage;

// End of user code
/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class InterruptibleActivityRegionBasePropertiesEditionComponent extends StandardPropertiesEditionComponent {

	public static String BASE_PART = "Base"; //$NON-NLS-1$
	
	private String[] parts = {BASE_PART};
	
	/**
	 * The EObject to edit
	 */
	private InterruptibleActivityRegion interruptibleActivityRegion;
	
	/**
	 * The Base part
	 */
	private InterruptibleActivityRegionPropertiesEditionPart basePart;
	
	/**
	 * Default constructor
	 */
	public InterruptibleActivityRegionBasePropertiesEditionComponent(EObject interruptibleActivityRegion, String mode) {
		if (interruptibleActivityRegion instanceof InterruptibleActivityRegion) {
			this.interruptibleActivityRegion = (InterruptibleActivityRegion)interruptibleActivityRegion;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.interruptibleActivityRegion.eAdapters().add(semanticAdapter);
			}
		}
		listeners = new ArrayList();
		this.mode = mode;
	}
	
	/**
	 * Initialize the semantic model listener for live editing mode
	 * @return the semantic model listener
	 */
	private AdapterImpl initializeSemanticAdapter() {
		return new EContentAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 */
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getElement_OwnedComment()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getComment())) {
					basePart.updateOwnedComment(interruptibleActivityRegion);
				}
				if (UMLPackage.eINSTANCE.getInterruptibleActivityRegion_Node().equals(msg.getFeature())) {
					basePart.updateNode(interruptibleActivityRegion);
				}
				if (UMLPackage.eINSTANCE.getInterruptibleActivityRegion_InterruptingEdge().equals(msg.getFeature())) {
					basePart.updateInterruptingEdge(interruptibleActivityRegion);
				}


			}

		};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return UMLViewsRepository.InterruptibleActivityRegion.class;
		return super.translatePart(key);
	}
	

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#partsList()
	 */
	public String[] partsList() {
		return parts;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionPart
	 * (java.lang.String, java.lang.String)
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (interruptibleActivityRegion != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(UMLViewsRepository.class);
				if (provider != null) {
					basePart = (InterruptibleActivityRegionPropertiesEditionPart)provider.getPropertiesEditionPart(UMLViewsRepository.InterruptibleActivityRegion.class, kind, this);
					listeners.add(basePart);
				}
			}
			return (IPropertiesEditionPart)basePart;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent
	 * 		#initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject, 
	 * 						org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		if (basePart != null && key == UMLViewsRepository.InterruptibleActivityRegion.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			InterruptibleActivityRegion interruptibleActivityRegion = (InterruptibleActivityRegion)elt;
			basePart.initOwnedComment(interruptibleActivityRegion, null, UMLPackage.eINSTANCE.getElement_OwnedComment());				
			basePart.initNode(interruptibleActivityRegion, null, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_Node());				
			basePart.initInterruptingEdge(interruptibleActivityRegion, null, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_InterruptingEdge());				
		}

	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionCommand
	 * (org.eclipse.emf.edit.domain.EditingDomain)
	 */
	public CompoundCommand getPropertiesEditionCommand(EditingDomain editingDomain) {
		CompoundCommand cc = new CompoundCommand();
		if (interruptibleActivityRegion != null) {
			List ownedCommentToAdd = basePart.getOwnedCommentToAdd();
			for (Iterator iter = ownedCommentToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getElement_OwnedComment(), iter.next()));
			Map ownedCommentToRefresh = basePart.getOwnedCommentToEdit();
			for (Iterator iter = ownedCommentToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for ownedComment reference refreshment
				
				Comment nextElement = (Comment) iter.next();
				Comment ownedComment = (Comment) ownedCommentToRefresh.get(nextElement);
				
				// End of user code			
			}
			List ownedCommentToRemove = basePart.getOwnedCommentToRemove();
			for (Iterator iter = ownedCommentToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedCommentToMove = basePart.getOwnedCommentToMove();
			for (Iterator iter = ownedCommentToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getComment(), moveElement.getElement(), moveElement.getIndex()));
			}
			List nodeToAdd = basePart.getNodeToAdd();
			for (Iterator iter = nodeToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_Node(), iter.next()));
			List nodeToRemove = basePart.getNodeToRemove();
			for (Iterator iter = nodeToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_Node(), iter.next()));
			//List nodeToMove = basePart.getNodeToMove();
			//for (Iterator iter = nodeToMove.iterator(); iter.hasNext();){
			//	MoveElement moveElement = (MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getActivityNode(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List interruptingEdgeToAdd = basePart.getInterruptingEdgeToAdd();
			for (Iterator iter = interruptingEdgeToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_InterruptingEdge(), iter.next()));
			List interruptingEdgeToRemove = basePart.getInterruptingEdgeToRemove();
			for (Iterator iter = interruptingEdgeToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_InterruptingEdge(), iter.next()));
			//List interruptingEdgeToMove = basePart.getInterruptingEdgeToMove();
			//for (Iterator iter = interruptingEdgeToMove.iterator(); iter.hasNext();){
			//	MoveElement moveElement = (MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getActivityEdge(), moveElement.getElement(), moveElement.getIndex()));
			//}


		}
		if (!cc.isEmpty())
			return cc;
		cc.append(UnexecutableCommand.INSTANCE);
		return cc;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionObject
	 * ()
	 */
	public EObject getPropertiesEditionObject(EObject source) {
		if (source instanceof InterruptibleActivityRegion) {
			InterruptibleActivityRegion interruptibleActivityRegionToUpdate = (InterruptibleActivityRegion)source;
			interruptibleActivityRegionToUpdate.getOwnedComments().addAll(basePart.getOwnedCommentToAdd());
			interruptibleActivityRegionToUpdate.getNodes().addAll(basePart.getNodeToAdd());
			interruptibleActivityRegionToUpdate.getInterruptingEdges().addAll(basePart.getInterruptingEdgeToAdd());


			return interruptibleActivityRegionToUpdate;
		}
		else
			return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void firePropertiesChanged(PathedPropertiesEditionEvent event) {
		super.firePropertiesChanged(event);
		if (PathedPropertiesEditionEvent.COMMIT == event.getState() && IPropertiesEditionComponent.LIVE_MODE.equals(mode)) {
			CompoundCommand command = new CompoundCommand();
			if (UMLViewsRepository.InterruptibleActivityRegion.ownedComment == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Comment oldValue = (Comment)event.getOldValue();
					Comment newValue = (Comment)event.getNewValue();
					// Start of user code for ownedComment live update command
					// TODO: Complete the interruptibleActivityRegion update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getElement_OwnedComment(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getComment(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.InterruptibleActivityRegion.node == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_Node(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_Node(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_Node(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.InterruptibleActivityRegion.interruptingEdge == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_InterruptingEdge(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_InterruptingEdge(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interruptibleActivityRegion, UMLPackage.eINSTANCE.getInterruptibleActivityRegion_InterruptingEdge(), event.getNewValue(), event.getNewIndex()));
			}


			if (command != null)
				liveEditingDomain.getCommandStack().execute(command);
		} else if (PathedPropertiesEditionEvent.CHANGE == event.getState()) {
			Diagnostic diag = this.validateValue(event);
			if (diag != null && diag.getSeverity() != Diagnostic.OK) {
				
				
				


			} else {
				
				
				


			}
		}
	}	

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.String, int)
	 */
	public String getHelpContent(String key, int kind) {
			if (key == UMLViewsRepository.InterruptibleActivityRegion.ownedComment)
				return "The Comments owned by this element."; //$NON-NLS-1$
			if (key == UMLViewsRepository.InterruptibleActivityRegion.node)
				return "Nodes immediately contained in the group."; //$NON-NLS-1$
			if (key == UMLViewsRepository.InterruptibleActivityRegion.interruptingEdge)
				return "The edges leaving the region that will abort other tokens flowing in the region."; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.common.notify.Notification)
	 */
	public Diagnostic validateValue(PathedPropertiesEditionEvent event) {
		String newStringValue = event.getNewValue().toString();
		Diagnostic ret = null;
		try {

		} catch (IllegalArgumentException iae) {
			ret = BasicDiagnostic.toDiagnostic(iae);
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validate()
	 */
	public Diagnostic validate() {
		if (IPropertiesEditionComponent.BATCH_MODE.equals(mode)) {
			EObject copy = EcoreUtil.copy(PropertiesContextService.getInstance().entryPointElement());
			copy = PropertiesContextService.getInstance().entryPointComponent().getPropertiesEditionObject(copy);
			return Diagnostician.INSTANCE.validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(mode))
			return Diagnostician.INSTANCE.validate(interruptibleActivityRegion);
		else
			return null;
	}
	

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#dispose()
	 */
	public void dispose() {
		if (semanticAdapter != null)
			interruptibleActivityRegion.eAdapters().remove(semanticAdapter);
	}

}

