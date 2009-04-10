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
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
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
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PathedPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.papyrus.tabbedproperties.uml.parts.LiteralUnlimitedNaturalPropertiesEditionPart;
import org.eclipse.papyrus.tabbedproperties.uml.parts.UMLViewsRepository;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

// End of user code
/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class LiteralUnlimitedNaturalBasePropertiesEditionComponent extends StandardPropertiesEditionComponent {

	public static String BASE_PART = "Base"; //$NON-NLS-1$
	
	private String[] parts = {BASE_PART};
	
	/**
	 * The EObject to edit
	 */
	private LiteralUnlimitedNatural literalUnlimitedNatural;
	
	/**
	 * The Base part
	 */
	private LiteralUnlimitedNaturalPropertiesEditionPart basePart;
	
	/**
	 * Default constructor
	 */
	public LiteralUnlimitedNaturalBasePropertiesEditionComponent(EObject literalUnlimitedNatural, String mode) {
		if (literalUnlimitedNatural instanceof LiteralUnlimitedNatural) {
			this.literalUnlimitedNatural = (LiteralUnlimitedNatural)literalUnlimitedNatural;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.literalUnlimitedNatural.eAdapters().add(semanticAdapter);
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
					basePart.updateOwnedComment(literalUnlimitedNatural);
				}
				if (UMLPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null)
					basePart.setName((String)msg.getNewValue());
				if (UMLPackage.eINSTANCE.getNamedElement_Visibility().equals(msg.getFeature()) && basePart != null)
					basePart.setVisibility((Enumerator)msg.getNewValue());
				if (UMLPackage.eINSTANCE.getNamedElement_ClientDependency().equals(msg.getFeature())) {
					basePart.updateClientDependency(literalUnlimitedNatural);
				}
				if (UMLPackage.eINSTANCE.getLiteralUnlimitedNatural_Value().equals(msg.getFeature()) && basePart != null)
					basePart.setValue(((Integer)msg.getNewValue()).toString());


			}

		};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return UMLViewsRepository.LiteralUnlimitedNatural.class;
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
		if (literalUnlimitedNatural != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(UMLViewsRepository.class);
				if (provider != null) {
					basePart = (LiteralUnlimitedNaturalPropertiesEditionPart)provider.getPropertiesEditionPart(UMLViewsRepository.LiteralUnlimitedNatural.class, kind, this);
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
		if (basePart != null && key == UMLViewsRepository.LiteralUnlimitedNatural.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			LiteralUnlimitedNatural literalUnlimitedNatural = (LiteralUnlimitedNatural)elt;
			basePart.initOwnedComment(literalUnlimitedNatural, null, UMLPackage.eINSTANCE.getElement_OwnedComment());				
			if (literalUnlimitedNatural.getName() != null)
				basePart.setName(literalUnlimitedNatural.getName());
				
			basePart.initVisibility((EEnum) UMLPackage.eINSTANCE.getNamedElement_Visibility().getEType(), literalUnlimitedNatural.getVisibility());				
			basePart.initClientDependency(literalUnlimitedNatural, null, UMLPackage.eINSTANCE.getNamedElement_ClientDependency());				
			basePart.setValue(String.valueOf(literalUnlimitedNatural.getValue()));
				
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
		if (literalUnlimitedNatural != null) {
			List ownedCommentToAdd = basePart.getOwnedCommentToAdd();
			for (Iterator iter = ownedCommentToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getElement_OwnedComment(), iter.next()));
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
				cc.append(MoveCommand.create(editingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getComment(), moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getNamedElement_Name(), basePart.getName()));
			cc.append(SetCommand.create(editingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getNamedElement_Visibility(), basePart.getVisibility()));
			List clientDependencyToAdd = basePart.getClientDependencyToAdd();
			for (Iterator iter = clientDependencyToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getNamedElement_ClientDependency(), iter.next()));
			List clientDependencyToRemove = basePart.getClientDependencyToRemove();
			for (Iterator iter = clientDependencyToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getNamedElement_ClientDependency(), iter.next()));
			//List clientDependencyToMove = basePart.getClientDependencyToMove();
			//for (Iterator iter = clientDependencyToMove.iterator(); iter.hasNext();){
			//	MoveElement moveElement = (MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getDependency(), moveElement.getElement(), moveElement.getIndex()));
			//}
			cc.append(SetCommand.create(editingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getLiteralUnlimitedNatural_Value(), new Integer(basePart.getValue())));


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
		if (source instanceof LiteralUnlimitedNatural) {
			LiteralUnlimitedNatural literalUnlimitedNaturalToUpdate = (LiteralUnlimitedNatural)source;
			literalUnlimitedNaturalToUpdate.getOwnedComments().addAll(basePart.getOwnedCommentToAdd());
			literalUnlimitedNaturalToUpdate.setName(basePart.getName());
			literalUnlimitedNaturalToUpdate.setVisibility((VisibilityKind)basePart.getVisibility());
			literalUnlimitedNaturalToUpdate.getClientDependencies().addAll(basePart.getClientDependencyToAdd());
			literalUnlimitedNaturalToUpdate.setValue(new Integer(basePart.getValue()).intValue());


			return literalUnlimitedNaturalToUpdate;
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
			if (UMLViewsRepository.LiteralUnlimitedNatural.ownedComment == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Comment oldValue = (Comment)event.getOldValue();
					Comment newValue = (Comment)event.getNewValue();
					// Start of user code for ownedComment live update command
					// TODO: Complete the literalUnlimitedNatural update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getElement_OwnedComment(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getComment(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.LiteralUnlimitedNatural.name == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getNamedElement_Name(), event.getNewValue()));	

			if (UMLViewsRepository.LiteralUnlimitedNatural.visibility == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getNamedElement_Visibility(), event.getNewValue()));

			if (UMLViewsRepository.LiteralUnlimitedNatural.clientDependency == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getNamedElement_ClientDependency(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getNamedElement_ClientDependency(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getNamedElement_ClientDependency(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.LiteralUnlimitedNatural.value == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, literalUnlimitedNatural, UMLPackage.eINSTANCE.getLiteralUnlimitedNatural_Value(), new Integer((String)event.getNewValue())));	



			if (command != null)
				liveEditingDomain.getCommandStack().execute(command);
		} else if (PathedPropertiesEditionEvent.CHANGE == event.getState()) {
			Diagnostic diag = this.validateValue(event);
			if (diag != null && diag.getSeverity() != Diagnostic.OK) {
				
				if (UMLViewsRepository.LiteralUnlimitedNatural.name == event.getAffectedEditor())
					basePart.setMessageForName(diag.getMessage(), IMessageProvider.ERROR);
				
				
				if (UMLViewsRepository.LiteralUnlimitedNatural.value == event.getAffectedEditor())
					basePart.setMessageForValue(diag.getMessage(), IMessageProvider.ERROR);


			} else {
				
				if (UMLViewsRepository.LiteralUnlimitedNatural.name == event.getAffectedEditor())
					basePart.unsetMessageForName();
				
				
				if (UMLViewsRepository.LiteralUnlimitedNatural.value == event.getAffectedEditor())
					basePart.unsetMessageForValue();


			}
		}
	}	

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.String, int)
	 */
	public boolean isRequired(String key, int kind) {
		return key == UMLViewsRepository.LiteralUnlimitedNatural.value;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.String, int)
	 */
	public String getHelpContent(String key, int kind) {
			if (key == UMLViewsRepository.LiteralUnlimitedNatural.ownedComment)
				return "The Comments owned by this element."; //$NON-NLS-1$
			if (key == UMLViewsRepository.LiteralUnlimitedNatural.name)
				return "The name of the NamedElement."; //$NON-NLS-1$
			if (key == UMLViewsRepository.LiteralUnlimitedNatural.visibility)
				return "Determines where the NamedElement appears within different Namespaces within the overall model, and its accessibility."; //$NON-NLS-1$
			if (key == UMLViewsRepository.LiteralUnlimitedNatural.clientDependency)
				return "Indicates the dependencies that reference the client."; //$NON-NLS-1$
			if (key == UMLViewsRepository.LiteralUnlimitedNatural.value)
				return "The specified UnlimitedNatural value."; //$NON-NLS-1$
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
			if (UMLViewsRepository.LiteralUnlimitedNatural.name == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
			}
			if (UMLViewsRepository.LiteralUnlimitedNatural.visibility == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getNamedElement_Visibility().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getNamedElement_Visibility().getEAttributeType(), newValue);
			}
			if (UMLViewsRepository.LiteralUnlimitedNatural.value == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getLiteralUnlimitedNatural_Value().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getLiteralUnlimitedNatural_Value().getEAttributeType(), newValue);
			}

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
			return Diagnostician.INSTANCE.validate(literalUnlimitedNatural);
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
			literalUnlimitedNatural.eAdapters().remove(semanticAdapter);
	}

}

