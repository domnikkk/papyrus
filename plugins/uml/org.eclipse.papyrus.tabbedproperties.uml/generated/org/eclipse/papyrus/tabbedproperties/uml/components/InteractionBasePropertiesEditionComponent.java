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
import org.eclipse.papyrus.tabbedproperties.uml.parts.InteractionPropertiesEditionPart;
import org.eclipse.papyrus.tabbedproperties.uml.parts.UMLViewsRepository;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

// End of user code
/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class InteractionBasePropertiesEditionComponent extends StandardPropertiesEditionComponent {

	public static String BASE_PART = "Base"; //$NON-NLS-1$
	
	private String[] parts = {BASE_PART};
	
	/**
	 * The EObject to edit
	 */
	private Interaction interaction;
	
	/**
	 * The Base part
	 */
	private InteractionPropertiesEditionPart basePart;
	
	/**
	 * Default constructor
	 */
	public InteractionBasePropertiesEditionComponent(EObject interaction, String mode) {
		if (interaction instanceof Interaction) {
			this.interaction = (Interaction)interaction;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.interaction.eAdapters().add(semanticAdapter);
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
					basePart.updateOwnedComment(interaction);
				}
				if (UMLPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null)
					basePart.setName((String)msg.getNewValue());
				if (UMLPackage.eINSTANCE.getNamedElement_Visibility().equals(msg.getFeature()) && basePart != null)
					basePart.setVisibility((Enumerator)msg.getNewValue());
				if (UMLPackage.eINSTANCE.getNamedElement_ClientDependency().equals(msg.getFeature())) {
					basePart.updateClientDependency(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getNamespace_ElementImport()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getElementImport())) {
					basePart.updateElementImport(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getNamespace_PackageImport()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getPackageImport())) {
					basePart.updatePackageImport(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getNamespace_OwnedRule()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getConstraint())) {
					basePart.updateOwnedRule(interaction);
				}
				if (UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf().equals(msg.getFeature()) && basePart != null)
					basePart.setIsLeaf((Boolean)msg.getNewValue());
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getTemplateableElement_TemplateBinding()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getTemplateBinding())) {
					basePart.updateTemplateBinding(interaction);
				}
				if (UMLPackage.eINSTANCE.getClassifier_IsAbstract().equals(msg.getFeature()) && basePart != null)
					basePart.setIsAbstract((Boolean)msg.getNewValue());
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getClassifier_Generalization()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getGeneralization())) {
					basePart.updateGeneralization(interaction);
				}
				if (UMLPackage.eINSTANCE.getClassifier_PowertypeExtent().equals(msg.getFeature())) {
					basePart.updatePowertypeExtent(interaction);
				}
				if (UMLPackage.eINSTANCE.getClassifier_RedefinedClassifier().equals(msg.getFeature())) {
					basePart.updateRedefinedClassifier(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getClassifier_Substitution()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getSubstitution())) {
					basePart.updateSubstitution(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getClassifier_CollaborationUse()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getCollaborationUse())) {
					basePart.updateCollaborationUse(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getClassifier_OwnedUseCase()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getUseCase())) {
					basePart.updateOwnedUseCase(interaction);
				}
				if (UMLPackage.eINSTANCE.getClassifier_UseCase().equals(msg.getFeature())) {
					basePart.updateUseCase(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getProperty())) {
					basePart.updateOwnedAttribute(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getStructuredClassifier_OwnedConnector()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getConnector())) {
					basePart.updateOwnedConnector(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getBehavior())) {
					basePart.updateOwnedBehavior(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getBehavioredClassifier_InterfaceRealization()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getInterfaceRealization())) {
					basePart.updateInterfaceRealization(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getBehavioredClassifier_OwnedTrigger()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getTrigger())) {
					basePart.updateOwnedTrigger(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getClass_NestedClassifier()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getClassifier())) {
					basePart.updateNestedClassifier(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getClass_OwnedOperation()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getOperation())) {
					basePart.updateOwnedOperation(interaction);
				}
				if (UMLPackage.eINSTANCE.getClass_IsActive().equals(msg.getFeature()) && basePart != null)
					basePart.setIsActive((Boolean)msg.getNewValue());
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getClass_OwnedReception()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getReception())) {
					basePart.updateOwnedReception(interaction);
				}
				if (UMLPackage.eINSTANCE.getBehavior_IsReentrant().equals(msg.getFeature()) && basePart != null)
					basePart.setIsReentrant((Boolean)msg.getNewValue());
				if (UMLPackage.eINSTANCE.getBehavior_RedefinedBehavior().equals(msg.getFeature())) {
					basePart.updateRedefinedBehavior(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getBehavior_OwnedParameter()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getParameter())) {
					basePart.updateOwnedParameter(interaction);
				}
				if (UMLPackage.eINSTANCE.getBehavior_Precondition().equals(msg.getFeature())) {
					basePart.updatePrecondition(interaction);
				}
				if (UMLPackage.eINSTANCE.getBehavior_Postcondition().equals(msg.getFeature())) {
					basePart.updatePostcondition(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getBehavior_OwnedParameterSet()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getParameterSet())) {
					basePart.updateOwnedParameterSet(interaction);
				}
				if (UMLPackage.eINSTANCE.getInteractionFragment_Covered().equals(msg.getFeature())) {
					basePart.updateCovered(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getInteractionFragment_GeneralOrdering()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getGeneralOrdering())) {
					basePart.updateGeneralOrdering(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getInteraction_Lifeline()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getLifeline())) {
					basePart.updateLifeline(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getInteraction_Fragment()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getInteractionFragment())) {
					basePart.updateFragment(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getInteraction_Action()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getAction())) {
					basePart.updateAction(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getInteraction_FormalGate()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getGate())) {
					basePart.updateFormalGate(interaction);
				}
				if (msg.getFeature() != null && 
						(((EStructuralFeature)msg.getFeature()) == UMLPackage.eINSTANCE.getInteraction_Message()
						|| ((EStructuralFeature)msg.getFeature()).getEContainingClass() == UMLPackage.eINSTANCE.getMessage())) {
					basePart.updateMessage(interaction);
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
			return UMLViewsRepository.Interaction.class;
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
		if (interaction != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(UMLViewsRepository.class);
				if (provider != null) {
					basePart = (InteractionPropertiesEditionPart)provider.getPropertiesEditionPart(UMLViewsRepository.Interaction.class, kind, this);
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
		if (basePart != null && key == UMLViewsRepository.Interaction.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			Interaction interaction = (Interaction)elt;
			basePart.initOwnedComment(interaction, null, UMLPackage.eINSTANCE.getElement_OwnedComment());				
			if (interaction.getName() != null)
				basePart.setName(interaction.getName());
				
			basePart.initVisibility((EEnum) UMLPackage.eINSTANCE.getNamedElement_Visibility().getEType(), interaction.getVisibility());				
			basePart.initClientDependency(interaction, null, UMLPackage.eINSTANCE.getNamedElement_ClientDependency());				
			basePart.initElementImport(interaction, null, UMLPackage.eINSTANCE.getNamespace_ElementImport());				
			basePart.initPackageImport(interaction, null, UMLPackage.eINSTANCE.getNamespace_PackageImport());				
			basePart.initOwnedRule(interaction, null, UMLPackage.eINSTANCE.getNamespace_OwnedRule());				
			basePart.setIsLeaf(interaction.isLeaf());				
			basePart.initTemplateBinding(interaction, null, UMLPackage.eINSTANCE.getTemplateableElement_TemplateBinding());				
			basePart.setIsAbstract(interaction.isAbstract());				
			basePart.initGeneralization(interaction, null, UMLPackage.eINSTANCE.getClassifier_Generalization());				
			basePart.initPowertypeExtent(interaction, null, UMLPackage.eINSTANCE.getClassifier_PowertypeExtent());				
			basePart.initRedefinedClassifier(interaction, null, UMLPackage.eINSTANCE.getClassifier_RedefinedClassifier());				
			basePart.initSubstitution(interaction, null, UMLPackage.eINSTANCE.getClassifier_Substitution());				
			basePart.initCollaborationUse(interaction, null, UMLPackage.eINSTANCE.getClassifier_CollaborationUse());				
			basePart.initOwnedUseCase(interaction, null, UMLPackage.eINSTANCE.getClassifier_OwnedUseCase());				
			basePart.initUseCase(interaction, null, UMLPackage.eINSTANCE.getClassifier_UseCase());				
			basePart.initOwnedAttribute(interaction, null, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());				
			basePart.initOwnedConnector(interaction, null, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedConnector());				
			basePart.initOwnedBehavior(interaction, null, UMLPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior());				
			basePart.initInterfaceRealization(interaction, null, UMLPackage.eINSTANCE.getBehavioredClassifier_InterfaceRealization());				
			basePart.initOwnedTrigger(interaction, null, UMLPackage.eINSTANCE.getBehavioredClassifier_OwnedTrigger());				
			basePart.initNestedClassifier(interaction, null, UMLPackage.eINSTANCE.getClass_NestedClassifier());				
			basePart.initOwnedOperation(interaction, null, UMLPackage.eINSTANCE.getClass_OwnedOperation());				
			basePart.setIsActive(interaction.isActive());				
			basePart.initOwnedReception(interaction, null, UMLPackage.eINSTANCE.getClass_OwnedReception());				
			basePart.setIsReentrant(interaction.isReentrant());				
			basePart.initRedefinedBehavior(interaction, null, UMLPackage.eINSTANCE.getBehavior_RedefinedBehavior());				
			basePart.initOwnedParameter(interaction, null, UMLPackage.eINSTANCE.getBehavior_OwnedParameter());				
			basePart.initPrecondition(interaction, null, UMLPackage.eINSTANCE.getBehavior_Precondition());				
			basePart.initPostcondition(interaction, null, UMLPackage.eINSTANCE.getBehavior_Postcondition());				
			basePart.initOwnedParameterSet(interaction, null, UMLPackage.eINSTANCE.getBehavior_OwnedParameterSet());				
			basePart.initCovered(interaction, null, UMLPackage.eINSTANCE.getInteractionFragment_Covered());				
			basePart.initGeneralOrdering(interaction, null, UMLPackage.eINSTANCE.getInteractionFragment_GeneralOrdering());				
			basePart.initLifeline(interaction, null, UMLPackage.eINSTANCE.getInteraction_Lifeline());				
			basePart.initFragment(interaction, null, UMLPackage.eINSTANCE.getInteraction_Fragment());				
			basePart.initAction(interaction, null, UMLPackage.eINSTANCE.getInteraction_Action());				
			basePart.initFormalGate(interaction, null, UMLPackage.eINSTANCE.getInteraction_FormalGate());				
			basePart.initMessage(interaction, null, UMLPackage.eINSTANCE.getInteraction_Message());				
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
		if (interaction != null) {
			List ownedCommentToAdd = basePart.getOwnedCommentToAdd();
			for (Iterator iter = ownedCommentToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getElement_OwnedComment(), iter.next()));
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
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getComment(), moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getNamedElement_Name(), basePart.getName()));
			cc.append(SetCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getNamedElement_Visibility(), basePart.getVisibility()));
			List clientDependencyToAdd = basePart.getClientDependencyToAdd();
			for (Iterator iter = clientDependencyToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getNamedElement_ClientDependency(), iter.next()));
			List clientDependencyToRemove = basePart.getClientDependencyToRemove();
			for (Iterator iter = clientDependencyToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getNamedElement_ClientDependency(), iter.next()));
			//List clientDependencyToMove = basePart.getClientDependencyToMove();
			//for (Iterator iter = clientDependencyToMove.iterator(); iter.hasNext();){
			//	MoveElement moveElement = (MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getDependency(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List elementImportToAdd = basePart.getElementImportToAdd();
			for (Iterator iter = elementImportToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getNamespace_ElementImport(), iter.next()));
			Map elementImportToRefresh = basePart.getElementImportToEdit();
			for (Iterator iter = elementImportToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for elementImport reference refreshment
				
				ElementImport nextElement = (ElementImport) iter.next();
				ElementImport elementImport = (ElementImport) elementImportToRefresh.get(nextElement);
				
				// End of user code			
			}
			List elementImportToRemove = basePart.getElementImportToRemove();
			for (Iterator iter = elementImportToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List elementImportToMove = basePart.getElementImportToMove();
			for (Iterator iter = elementImportToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getElementImport(), moveElement.getElement(), moveElement.getIndex()));
			}
			List packageImportToAdd = basePart.getPackageImportToAdd();
			for (Iterator iter = packageImportToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getNamespace_PackageImport(), iter.next()));
			Map packageImportToRefresh = basePart.getPackageImportToEdit();
			for (Iterator iter = packageImportToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for packageImport reference refreshment
				
				PackageImport nextElement = (PackageImport) iter.next();
				PackageImport packageImport = (PackageImport) packageImportToRefresh.get(nextElement);
				
				// End of user code			
			}
			List packageImportToRemove = basePart.getPackageImportToRemove();
			for (Iterator iter = packageImportToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List packageImportToMove = basePart.getPackageImportToMove();
			for (Iterator iter = packageImportToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getPackageImport(), moveElement.getElement(), moveElement.getIndex()));
			}
			List ownedRuleToAdd = basePart.getOwnedRuleToAdd();
			for (Iterator iter = ownedRuleToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getNamespace_OwnedRule(), iter.next()));
			Map ownedRuleToRefresh = basePart.getOwnedRuleToEdit();
			for (Iterator iter = ownedRuleToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for ownedRule reference refreshment
				
				Constraint nextElement = (Constraint) iter.next();
				Constraint ownedRule = (Constraint) ownedRuleToRefresh.get(nextElement);
				
				// End of user code			
			}
			List ownedRuleToRemove = basePart.getOwnedRuleToRemove();
			for (Iterator iter = ownedRuleToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedRuleToMove = basePart.getOwnedRuleToMove();
			for (Iterator iter = ownedRuleToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getConstraint(), moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf(), basePart.getIsLeaf()));
			List templateBindingToAdd = basePart.getTemplateBindingToAdd();
			for (Iterator iter = templateBindingToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getTemplateableElement_TemplateBinding(), iter.next()));
			Map templateBindingToRefresh = basePart.getTemplateBindingToEdit();
			for (Iterator iter = templateBindingToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for templateBinding reference refreshment
				
				TemplateBinding nextElement = (TemplateBinding) iter.next();
				TemplateBinding templateBinding = (TemplateBinding) templateBindingToRefresh.get(nextElement);
				
				// End of user code			
			}
			List templateBindingToRemove = basePart.getTemplateBindingToRemove();
			for (Iterator iter = templateBindingToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List templateBindingToMove = basePart.getTemplateBindingToMove();
			for (Iterator iter = templateBindingToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getTemplateBinding(), moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_IsAbstract(), basePart.getIsAbstract()));
			List generalizationToAdd = basePart.getGeneralizationToAdd();
			for (Iterator iter = generalizationToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_Generalization(), iter.next()));
			Map generalizationToRefresh = basePart.getGeneralizationToEdit();
			for (Iterator iter = generalizationToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for generalization reference refreshment
				
				Generalization nextElement = (Generalization) iter.next();
				Generalization generalization = (Generalization) generalizationToRefresh.get(nextElement);
				
				// End of user code			
			}
			List generalizationToRemove = basePart.getGeneralizationToRemove();
			for (Iterator iter = generalizationToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List generalizationToMove = basePart.getGeneralizationToMove();
			for (Iterator iter = generalizationToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getGeneralization(), moveElement.getElement(), moveElement.getIndex()));
			}
			List powertypeExtentToAdd = basePart.getPowertypeExtentToAdd();
			for (Iterator iter = powertypeExtentToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_PowertypeExtent(), iter.next()));
			List powertypeExtentToRemove = basePart.getPowertypeExtentToRemove();
			for (Iterator iter = powertypeExtentToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_PowertypeExtent(), iter.next()));
			//List powertypeExtentToMove = basePart.getPowertypeExtentToMove();
			//for (Iterator iter = powertypeExtentToMove.iterator(); iter.hasNext();){
			//	MoveElement moveElement = (MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getGeneralizationSet(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List redefinedClassifierToAdd = basePart.getRedefinedClassifierToAdd();
			for (Iterator iter = redefinedClassifierToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_RedefinedClassifier(), iter.next()));
			List redefinedClassifierToRemove = basePart.getRedefinedClassifierToRemove();
			for (Iterator iter = redefinedClassifierToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_RedefinedClassifier(), iter.next()));
			//List redefinedClassifierToMove = basePart.getRedefinedClassifierToMove();
			//for (Iterator iter = redefinedClassifierToMove.iterator(); iter.hasNext();){
			//	MoveElement moveElement = (MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List substitutionToAdd = basePart.getSubstitutionToAdd();
			for (Iterator iter = substitutionToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_Substitution(), iter.next()));
			Map substitutionToRefresh = basePart.getSubstitutionToEdit();
			for (Iterator iter = substitutionToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for substitution reference refreshment
				
				Substitution nextElement = (Substitution) iter.next();
				Substitution substitution = (Substitution) substitutionToRefresh.get(nextElement);
				
				// End of user code			
			}
			List substitutionToRemove = basePart.getSubstitutionToRemove();
			for (Iterator iter = substitutionToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List substitutionToMove = basePart.getSubstitutionToMove();
			for (Iterator iter = substitutionToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getSubstitution(), moveElement.getElement(), moveElement.getIndex()));
			}
			List collaborationUseToAdd = basePart.getCollaborationUseToAdd();
			for (Iterator iter = collaborationUseToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_CollaborationUse(), iter.next()));
			Map collaborationUseToRefresh = basePart.getCollaborationUseToEdit();
			for (Iterator iter = collaborationUseToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for collaborationUse reference refreshment
				
				CollaborationUse nextElement = (CollaborationUse) iter.next();
				CollaborationUse collaborationUse = (CollaborationUse) collaborationUseToRefresh.get(nextElement);
				
				// End of user code			
			}
			List collaborationUseToRemove = basePart.getCollaborationUseToRemove();
			for (Iterator iter = collaborationUseToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List collaborationUseToMove = basePart.getCollaborationUseToMove();
			for (Iterator iter = collaborationUseToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getCollaborationUse(), moveElement.getElement(), moveElement.getIndex()));
			}
			List ownedUseCaseToAdd = basePart.getOwnedUseCaseToAdd();
			for (Iterator iter = ownedUseCaseToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_OwnedUseCase(), iter.next()));
			Map ownedUseCaseToRefresh = basePart.getOwnedUseCaseToEdit();
			for (Iterator iter = ownedUseCaseToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for ownedUseCase reference refreshment
				
				UseCase nextElement = (UseCase) iter.next();
				UseCase ownedUseCase = (UseCase) ownedUseCaseToRefresh.get(nextElement);
				
				// End of user code			
			}
			List ownedUseCaseToRemove = basePart.getOwnedUseCaseToRemove();
			for (Iterator iter = ownedUseCaseToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedUseCaseToMove = basePart.getOwnedUseCaseToMove();
			for (Iterator iter = ownedUseCaseToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getUseCase(), moveElement.getElement(), moveElement.getIndex()));
			}
			List useCaseToAdd = basePart.getUseCaseToAdd();
			for (Iterator iter = useCaseToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_UseCase(), iter.next()));
			List useCaseToRemove = basePart.getUseCaseToRemove();
			for (Iterator iter = useCaseToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_UseCase(), iter.next()));
			//List useCaseToMove = basePart.getUseCaseToMove();
			//for (Iterator iter = useCaseToMove.iterator(); iter.hasNext();){
			//	MoveElement moveElement = (MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getUseCase(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List ownedAttributeToAdd = basePart.getOwnedAttributeToAdd();
			for (Iterator iter = ownedAttributeToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute(), iter.next()));
			Map ownedAttributeToRefresh = basePart.getOwnedAttributeToEdit();
			for (Iterator iter = ownedAttributeToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for ownedAttribute reference refreshment
				
				Property nextElement = (Property) iter.next();
				Property ownedAttribute = (Property) ownedAttributeToRefresh.get(nextElement);
				
				// End of user code			
			}
			List ownedAttributeToRemove = basePart.getOwnedAttributeToRemove();
			for (Iterator iter = ownedAttributeToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedAttributeToMove = basePart.getOwnedAttributeToMove();
			for (Iterator iter = ownedAttributeToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getProperty(), moveElement.getElement(), moveElement.getIndex()));
			}
			List ownedConnectorToAdd = basePart.getOwnedConnectorToAdd();
			for (Iterator iter = ownedConnectorToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedConnector(), iter.next()));
			Map ownedConnectorToRefresh = basePart.getOwnedConnectorToEdit();
			for (Iterator iter = ownedConnectorToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for ownedConnector reference refreshment
				
				Connector nextElement = (Connector) iter.next();
				Connector ownedConnector = (Connector) ownedConnectorToRefresh.get(nextElement);
				
				// End of user code			
			}
			List ownedConnectorToRemove = basePart.getOwnedConnectorToRemove();
			for (Iterator iter = ownedConnectorToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedConnectorToMove = basePart.getOwnedConnectorToMove();
			for (Iterator iter = ownedConnectorToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getConnector(), moveElement.getElement(), moveElement.getIndex()));
			}
			List ownedBehaviorToAdd = basePart.getOwnedBehaviorToAdd();
			for (Iterator iter = ownedBehaviorToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior(), iter.next()));
			Map ownedBehaviorToRefresh = basePart.getOwnedBehaviorToEdit();
			for (Iterator iter = ownedBehaviorToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for ownedBehavior reference refreshment
				
				Behavior nextElement = (Behavior) iter.next();
				Behavior ownedBehavior = (Behavior) ownedBehaviorToRefresh.get(nextElement);
				
				// End of user code			
			}
			List ownedBehaviorToRemove = basePart.getOwnedBehaviorToRemove();
			for (Iterator iter = ownedBehaviorToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedBehaviorToMove = basePart.getOwnedBehaviorToMove();
			for (Iterator iter = ownedBehaviorToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavior(), moveElement.getElement(), moveElement.getIndex()));
			}
			List interfaceRealizationToAdd = basePart.getInterfaceRealizationToAdd();
			for (Iterator iter = interfaceRealizationToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavioredClassifier_InterfaceRealization(), iter.next()));
			Map interfaceRealizationToRefresh = basePart.getInterfaceRealizationToEdit();
			for (Iterator iter = interfaceRealizationToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for interfaceRealization reference refreshment
				
				InterfaceRealization nextElement = (InterfaceRealization) iter.next();
				InterfaceRealization interfaceRealization = (InterfaceRealization) interfaceRealizationToRefresh.get(nextElement);
				
				// End of user code			
			}
			List interfaceRealizationToRemove = basePart.getInterfaceRealizationToRemove();
			for (Iterator iter = interfaceRealizationToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List interfaceRealizationToMove = basePart.getInterfaceRealizationToMove();
			for (Iterator iter = interfaceRealizationToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getInterfaceRealization(), moveElement.getElement(), moveElement.getIndex()));
			}
			List ownedTriggerToAdd = basePart.getOwnedTriggerToAdd();
			for (Iterator iter = ownedTriggerToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavioredClassifier_OwnedTrigger(), iter.next()));
			Map ownedTriggerToRefresh = basePart.getOwnedTriggerToEdit();
			for (Iterator iter = ownedTriggerToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for ownedTrigger reference refreshment
				
				Trigger nextElement = (Trigger) iter.next();
				Trigger ownedTrigger = (Trigger) ownedTriggerToRefresh.get(nextElement);
				
				// End of user code			
			}
			List ownedTriggerToRemove = basePart.getOwnedTriggerToRemove();
			for (Iterator iter = ownedTriggerToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedTriggerToMove = basePart.getOwnedTriggerToMove();
			for (Iterator iter = ownedTriggerToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getTrigger(), moveElement.getElement(), moveElement.getIndex()));
			}
			List nestedClassifierToAdd = basePart.getNestedClassifierToAdd();
			for (Iterator iter = nestedClassifierToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClass_NestedClassifier(), iter.next()));
			Map nestedClassifierToRefresh = basePart.getNestedClassifierToEdit();
			for (Iterator iter = nestedClassifierToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for nestedClassifier reference refreshment
				
				Classifier nextElement = (Classifier) iter.next();
				Classifier nestedClassifier = (Classifier) nestedClassifierToRefresh.get(nextElement);
				
				// End of user code			
			}
			List nestedClassifierToRemove = basePart.getNestedClassifierToRemove();
			for (Iterator iter = nestedClassifierToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List nestedClassifierToMove = basePart.getNestedClassifierToMove();
			for (Iterator iter = nestedClassifierToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClassifier(), moveElement.getElement(), moveElement.getIndex()));
			}
			List ownedOperationToAdd = basePart.getOwnedOperationToAdd();
			for (Iterator iter = ownedOperationToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClass_OwnedOperation(), iter.next()));
			Map ownedOperationToRefresh = basePart.getOwnedOperationToEdit();
			for (Iterator iter = ownedOperationToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for ownedOperation reference refreshment
				
				Operation nextElement = (Operation) iter.next();
				Operation ownedOperation = (Operation) ownedOperationToRefresh.get(nextElement);
				
				// End of user code			
			}
			List ownedOperationToRemove = basePart.getOwnedOperationToRemove();
			for (Iterator iter = ownedOperationToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedOperationToMove = basePart.getOwnedOperationToMove();
			for (Iterator iter = ownedOperationToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getOperation(), moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClass_IsActive(), basePart.getIsActive()));
			List ownedReceptionToAdd = basePart.getOwnedReceptionToAdd();
			for (Iterator iter = ownedReceptionToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getClass_OwnedReception(), iter.next()));
			Map ownedReceptionToRefresh = basePart.getOwnedReceptionToEdit();
			for (Iterator iter = ownedReceptionToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for ownedReception reference refreshment
				
				Reception nextElement = (Reception) iter.next();
				Reception ownedReception = (Reception) ownedReceptionToRefresh.get(nextElement);
				
				// End of user code			
			}
			List ownedReceptionToRemove = basePart.getOwnedReceptionToRemove();
			for (Iterator iter = ownedReceptionToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedReceptionToMove = basePart.getOwnedReceptionToMove();
			for (Iterator iter = ownedReceptionToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getReception(), moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_IsReentrant(), basePart.getIsReentrant()));
			List redefinedBehaviorToAdd = basePart.getRedefinedBehaviorToAdd();
			for (Iterator iter = redefinedBehaviorToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_RedefinedBehavior(), iter.next()));
			List redefinedBehaviorToRemove = basePart.getRedefinedBehaviorToRemove();
			for (Iterator iter = redefinedBehaviorToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_RedefinedBehavior(), iter.next()));
			//List redefinedBehaviorToMove = basePart.getRedefinedBehaviorToMove();
			//for (Iterator iter = redefinedBehaviorToMove.iterator(); iter.hasNext();){
			//	MoveElement moveElement = (MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavior(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List ownedParameterToAdd = basePart.getOwnedParameterToAdd();
			for (Iterator iter = ownedParameterToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_OwnedParameter(), iter.next()));
			Map ownedParameterToRefresh = basePart.getOwnedParameterToEdit();
			for (Iterator iter = ownedParameterToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for ownedParameter reference refreshment
				
				Parameter nextElement = (Parameter) iter.next();
				Parameter ownedParameter = (Parameter) ownedParameterToRefresh.get(nextElement);
				
				// End of user code			
			}
			List ownedParameterToRemove = basePart.getOwnedParameterToRemove();
			for (Iterator iter = ownedParameterToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedParameterToMove = basePart.getOwnedParameterToMove();
			for (Iterator iter = ownedParameterToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getParameter(), moveElement.getElement(), moveElement.getIndex()));
			}
			List preconditionToAdd = basePart.getPreconditionToAdd();
			for (Iterator iter = preconditionToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_Precondition(), iter.next()));
			List preconditionToRemove = basePart.getPreconditionToRemove();
			for (Iterator iter = preconditionToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_Precondition(), iter.next()));
			//List preconditionToMove = basePart.getPreconditionToMove();
			//for (Iterator iter = preconditionToMove.iterator(); iter.hasNext();){
			//	MoveElement moveElement = (MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getConstraint(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List postconditionToAdd = basePart.getPostconditionToAdd();
			for (Iterator iter = postconditionToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_Postcondition(), iter.next()));
			List postconditionToRemove = basePart.getPostconditionToRemove();
			for (Iterator iter = postconditionToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_Postcondition(), iter.next()));
			//List postconditionToMove = basePart.getPostconditionToMove();
			//for (Iterator iter = postconditionToMove.iterator(); iter.hasNext();){
			//	MoveElement moveElement = (MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getConstraint(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List ownedParameterSetToAdd = basePart.getOwnedParameterSetToAdd();
			for (Iterator iter = ownedParameterSetToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_OwnedParameterSet(), iter.next()));
			Map ownedParameterSetToRefresh = basePart.getOwnedParameterSetToEdit();
			for (Iterator iter = ownedParameterSetToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for ownedParameterSet reference refreshment
				
				ParameterSet nextElement = (ParameterSet) iter.next();
				ParameterSet ownedParameterSet = (ParameterSet) ownedParameterSetToRefresh.get(nextElement);
				
				// End of user code			
			}
			List ownedParameterSetToRemove = basePart.getOwnedParameterSetToRemove();
			for (Iterator iter = ownedParameterSetToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List ownedParameterSetToMove = basePart.getOwnedParameterSetToMove();
			for (Iterator iter = ownedParameterSetToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getParameterSet(), moveElement.getElement(), moveElement.getIndex()));
			}
			List coveredToAdd = basePart.getCoveredToAdd();
			for (Iterator iter = coveredToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getInteractionFragment_Covered(), iter.next()));
			List coveredToRemove = basePart.getCoveredToRemove();
			for (Iterator iter = coveredToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getInteractionFragment_Covered(), iter.next()));
			//List coveredToMove = basePart.getCoveredToMove();
			//for (Iterator iter = coveredToMove.iterator(); iter.hasNext();){
			//	MoveElement moveElement = (MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getLifeline(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List generalOrderingToAdd = basePart.getGeneralOrderingToAdd();
			for (Iterator iter = generalOrderingToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getInteractionFragment_GeneralOrdering(), iter.next()));
			Map generalOrderingToRefresh = basePart.getGeneralOrderingToEdit();
			for (Iterator iter = generalOrderingToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for generalOrdering reference refreshment
				
				GeneralOrdering nextElement = (GeneralOrdering) iter.next();
				GeneralOrdering generalOrdering = (GeneralOrdering) generalOrderingToRefresh.get(nextElement);
				
				// End of user code			
			}
			List generalOrderingToRemove = basePart.getGeneralOrderingToRemove();
			for (Iterator iter = generalOrderingToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List generalOrderingToMove = basePart.getGeneralOrderingToMove();
			for (Iterator iter = generalOrderingToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getGeneralOrdering(), moveElement.getElement(), moveElement.getIndex()));
			}
			List lifelineToAdd = basePart.getLifelineToAdd();
			for (Iterator iter = lifelineToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getInteraction_Lifeline(), iter.next()));
			Map lifelineToRefresh = basePart.getLifelineToEdit();
			for (Iterator iter = lifelineToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for lifeline reference refreshment
				
				Lifeline nextElement = (Lifeline) iter.next();
				Lifeline lifeline = (Lifeline) lifelineToRefresh.get(nextElement);
				
				// End of user code			
			}
			List lifelineToRemove = basePart.getLifelineToRemove();
			for (Iterator iter = lifelineToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List lifelineToMove = basePart.getLifelineToMove();
			for (Iterator iter = lifelineToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getLifeline(), moveElement.getElement(), moveElement.getIndex()));
			}
			List fragmentToAdd = basePart.getFragmentToAdd();
			for (Iterator iter = fragmentToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getInteraction_Fragment(), iter.next()));
			Map fragmentToRefresh = basePart.getFragmentToEdit();
			for (Iterator iter = fragmentToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for fragment reference refreshment
				
				InteractionFragment nextElement = (InteractionFragment) iter.next();
				InteractionFragment fragment = (InteractionFragment) fragmentToRefresh.get(nextElement);
				
				// End of user code			
			}
			List fragmentToRemove = basePart.getFragmentToRemove();
			for (Iterator iter = fragmentToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List fragmentToMove = basePart.getFragmentToMove();
			for (Iterator iter = fragmentToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getInteractionFragment(), moveElement.getElement(), moveElement.getIndex()));
			}
			List actionToAdd = basePart.getActionToAdd();
			for (Iterator iter = actionToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getInteraction_Action(), iter.next()));
			Map actionToRefresh = basePart.getActionToEdit();
			for (Iterator iter = actionToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for action reference refreshment
				
				Action nextElement = (Action) iter.next();
				Action action = (Action) actionToRefresh.get(nextElement);
				
				// End of user code			
			}
			List actionToRemove = basePart.getActionToRemove();
			for (Iterator iter = actionToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List actionToMove = basePart.getActionToMove();
			for (Iterator iter = actionToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getAction(), moveElement.getElement(), moveElement.getIndex()));
			}
			List formalGateToAdd = basePart.getFormalGateToAdd();
			for (Iterator iter = formalGateToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getInteraction_FormalGate(), iter.next()));
			Map formalGateToRefresh = basePart.getFormalGateToEdit();
			for (Iterator iter = formalGateToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for formalGate reference refreshment
				
				Gate nextElement = (Gate) iter.next();
				Gate formalGate = (Gate) formalGateToRefresh.get(nextElement);
				
				// End of user code			
			}
			List formalGateToRemove = basePart.getFormalGateToRemove();
			for (Iterator iter = formalGateToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List formalGateToMove = basePart.getFormalGateToMove();
			for (Iterator iter = formalGateToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getGate(), moveElement.getElement(), moveElement.getIndex()));
			}
			List messageToAdd = basePart.getMessageToAdd();
			for (Iterator iter = messageToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getInteraction_Message(), iter.next()));
			Map messageToRefresh = basePart.getMessageToEdit();
			for (Iterator iter = messageToRefresh.keySet().iterator(); iter.hasNext();) {
			
				// Start of user code for message reference refreshment
				
				Message nextElement = (Message) iter.next();
				Message message = (Message) messageToRefresh.get(nextElement);
				
				// End of user code			
			}
			List messageToRemove = basePart.getMessageToRemove();
			for (Iterator iter = messageToRemove.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List messageToMove = basePart.getMessageToMove();
			for (Iterator iter = messageToMove.iterator(); iter.hasNext();){
				MoveElement moveElement = (MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, interaction, UMLPackage.eINSTANCE.getMessage(), moveElement.getElement(), moveElement.getIndex()));
			}


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
		if (source instanceof Interaction) {
			Interaction interactionToUpdate = (Interaction)source;
			interactionToUpdate.getOwnedComments().addAll(basePart.getOwnedCommentToAdd());
			interactionToUpdate.setName(basePart.getName());
			interactionToUpdate.setVisibility((VisibilityKind)basePart.getVisibility());
			interactionToUpdate.getClientDependencies().addAll(basePart.getClientDependencyToAdd());
			interactionToUpdate.getElementImports().addAll(basePart.getElementImportToAdd());
			interactionToUpdate.getPackageImports().addAll(basePart.getPackageImportToAdd());
			interactionToUpdate.getOwnedRules().addAll(basePart.getOwnedRuleToAdd());
			interactionToUpdate.setIsLeaf(new Boolean(basePart.getIsLeaf()).booleanValue());
			interactionToUpdate.getTemplateBindings().addAll(basePart.getTemplateBindingToAdd());
			interactionToUpdate.setIsAbstract(new Boolean(basePart.getIsAbstract()).booleanValue());
			interactionToUpdate.getGeneralizations().addAll(basePart.getGeneralizationToAdd());
			interactionToUpdate.getPowertypeExtents().addAll(basePart.getPowertypeExtentToAdd());
			interactionToUpdate.getRedefinedClassifiers().addAll(basePart.getRedefinedClassifierToAdd());
			interactionToUpdate.getSubstitutions().addAll(basePart.getSubstitutionToAdd());
			interactionToUpdate.getCollaborationUses().addAll(basePart.getCollaborationUseToAdd());
			interactionToUpdate.getOwnedUseCases().addAll(basePart.getOwnedUseCaseToAdd());
			interactionToUpdate.getUseCases().addAll(basePart.getUseCaseToAdd());
			interactionToUpdate.getOwnedAttributes().addAll(basePart.getOwnedAttributeToAdd());
			interactionToUpdate.getOwnedConnectors().addAll(basePart.getOwnedConnectorToAdd());
			interactionToUpdate.getOwnedBehaviors().addAll(basePart.getOwnedBehaviorToAdd());
			interactionToUpdate.getInterfaceRealizations().addAll(basePart.getInterfaceRealizationToAdd());
			interactionToUpdate.getOwnedTriggers().addAll(basePart.getOwnedTriggerToAdd());
			interactionToUpdate.getNestedClassifiers().addAll(basePart.getNestedClassifierToAdd());
			interactionToUpdate.getOwnedOperations().addAll(basePart.getOwnedOperationToAdd());
			interactionToUpdate.setIsActive(new Boolean(basePart.getIsActive()).booleanValue());
			interactionToUpdate.getOwnedReceptions().addAll(basePart.getOwnedReceptionToAdd());
			interactionToUpdate.setIsReentrant(new Boolean(basePart.getIsReentrant()).booleanValue());
			interactionToUpdate.getRedefinedBehaviors().addAll(basePart.getRedefinedBehaviorToAdd());
			interactionToUpdate.getOwnedParameters().addAll(basePart.getOwnedParameterToAdd());
			interactionToUpdate.getPreconditions().addAll(basePart.getPreconditionToAdd());
			interactionToUpdate.getPostconditions().addAll(basePart.getPostconditionToAdd());
			interactionToUpdate.getOwnedParameterSets().addAll(basePart.getOwnedParameterSetToAdd());
			interactionToUpdate.getCovereds().addAll(basePart.getCoveredToAdd());
			interactionToUpdate.getGeneralOrderings().addAll(basePart.getGeneralOrderingToAdd());
			interactionToUpdate.getLifelines().addAll(basePart.getLifelineToAdd());
			interactionToUpdate.getFragments().addAll(basePart.getFragmentToAdd());
			interactionToUpdate.getActions().addAll(basePart.getActionToAdd());
			interactionToUpdate.getFormalGates().addAll(basePart.getFormalGateToAdd());
			interactionToUpdate.getMessages().addAll(basePart.getMessageToAdd());


			return interactionToUpdate;
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
			if (UMLViewsRepository.Interaction.ownedComment == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Comment oldValue = (Comment)event.getOldValue();
					Comment newValue = (Comment)event.getNewValue();
					// Start of user code for ownedComment live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getElement_OwnedComment(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getComment(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.name == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getNamedElement_Name(), event.getNewValue()));	

			if (UMLViewsRepository.Interaction.visibility == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getNamedElement_Visibility(), event.getNewValue()));

			if (UMLViewsRepository.Interaction.clientDependency == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getNamedElement_ClientDependency(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getNamedElement_ClientDependency(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getNamedElement_ClientDependency(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.elementImport == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					ElementImport oldValue = (ElementImport)event.getOldValue();
					ElementImport newValue = (ElementImport)event.getNewValue();
					// Start of user code for elementImport live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getNamespace_ElementImport(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getElementImport(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.packageImport == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					PackageImport oldValue = (PackageImport)event.getOldValue();
					PackageImport newValue = (PackageImport)event.getNewValue();
					// Start of user code for packageImport live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getNamespace_PackageImport(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getPackageImport(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.ownedRule == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Constraint oldValue = (Constraint)event.getOldValue();
					Constraint newValue = (Constraint)event.getNewValue();
					// Start of user code for ownedRule live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getNamespace_OwnedRule(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getConstraint(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.isLeaf == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf(), event.getNewValue()));

			if (UMLViewsRepository.Interaction.templateBinding == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					TemplateBinding oldValue = (TemplateBinding)event.getOldValue();
					TemplateBinding newValue = (TemplateBinding)event.getNewValue();
					// Start of user code for templateBinding live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getTemplateableElement_TemplateBinding(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getTemplateBinding(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.isAbstract == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_IsAbstract(), event.getNewValue()));

			if (UMLViewsRepository.Interaction.generalization == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Generalization oldValue = (Generalization)event.getOldValue();
					Generalization newValue = (Generalization)event.getNewValue();
					// Start of user code for generalization live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_Generalization(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getGeneralization(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.powertypeExtent == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_PowertypeExtent(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_PowertypeExtent(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_PowertypeExtent(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.redefinedClassifier == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_RedefinedClassifier(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_RedefinedClassifier(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_RedefinedClassifier(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.substitution == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Substitution oldValue = (Substitution)event.getOldValue();
					Substitution newValue = (Substitution)event.getNewValue();
					// Start of user code for substitution live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_Substitution(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getSubstitution(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.collaborationUse == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					CollaborationUse oldValue = (CollaborationUse)event.getOldValue();
					CollaborationUse newValue = (CollaborationUse)event.getNewValue();
					// Start of user code for collaborationUse live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_CollaborationUse(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getCollaborationUse(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.ownedUseCase == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					UseCase oldValue = (UseCase)event.getOldValue();
					UseCase newValue = (UseCase)event.getNewValue();
					// Start of user code for ownedUseCase live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_OwnedUseCase(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getUseCase(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.useCase == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_UseCase(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_UseCase(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier_UseCase(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.ownedAttribute == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Property oldValue = (Property)event.getOldValue();
					Property newValue = (Property)event.getNewValue();
					// Start of user code for ownedAttribute live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getProperty(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.ownedConnector == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Connector oldValue = (Connector)event.getOldValue();
					Connector newValue = (Connector)event.getNewValue();
					// Start of user code for ownedConnector live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedConnector(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getConnector(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.ownedBehavior == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Behavior oldValue = (Behavior)event.getOldValue();
					Behavior newValue = (Behavior)event.getNewValue();
					// Start of user code for ownedBehavior live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.interfaceRealization == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					InterfaceRealization oldValue = (InterfaceRealization)event.getOldValue();
					InterfaceRealization newValue = (InterfaceRealization)event.getNewValue();
					// Start of user code for interfaceRealization live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavioredClassifier_InterfaceRealization(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getInterfaceRealization(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.ownedTrigger == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Trigger oldValue = (Trigger)event.getOldValue();
					Trigger newValue = (Trigger)event.getNewValue();
					// Start of user code for ownedTrigger live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavioredClassifier_OwnedTrigger(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getTrigger(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.nestedClassifier == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Classifier oldValue = (Classifier)event.getOldValue();
					Classifier newValue = (Classifier)event.getNewValue();
					// Start of user code for nestedClassifier live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClass_NestedClassifier(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClassifier(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.ownedOperation == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Operation oldValue = (Operation)event.getOldValue();
					Operation newValue = (Operation)event.getNewValue();
					// Start of user code for ownedOperation live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClass_OwnedOperation(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getOperation(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.isActive == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClass_IsActive(), event.getNewValue()));

			if (UMLViewsRepository.Interaction.ownedReception == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Reception oldValue = (Reception)event.getOldValue();
					Reception newValue = (Reception)event.getNewValue();
					// Start of user code for ownedReception live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getClass_OwnedReception(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getReception(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.isReentrant == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_IsReentrant(), event.getNewValue()));

			if (UMLViewsRepository.Interaction.redefinedBehavior == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_RedefinedBehavior(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_RedefinedBehavior(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_RedefinedBehavior(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.ownedParameter == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Parameter oldValue = (Parameter)event.getOldValue();
					Parameter newValue = (Parameter)event.getNewValue();
					// Start of user code for ownedParameter live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_OwnedParameter(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getParameter(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.precondition == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_Precondition(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_Precondition(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_Precondition(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.postcondition == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_Postcondition(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_Postcondition(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_Postcondition(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.ownedParameterSet == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					ParameterSet oldValue = (ParameterSet)event.getOldValue();
					ParameterSet newValue = (ParameterSet)event.getNewValue();
					// Start of user code for ownedParameterSet live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getBehavior_OwnedParameterSet(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getParameterSet(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.covered == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getInteractionFragment_Covered(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getInteractionFragment_Covered(), event.getNewValue()));
				if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getInteractionFragment_Covered(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.generalOrdering == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					GeneralOrdering oldValue = (GeneralOrdering)event.getOldValue();
					GeneralOrdering newValue = (GeneralOrdering)event.getNewValue();
					// Start of user code for generalOrdering live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getInteractionFragment_GeneralOrdering(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getGeneralOrdering(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.lifeline == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Lifeline oldValue = (Lifeline)event.getOldValue();
					Lifeline newValue = (Lifeline)event.getNewValue();
					// Start of user code for lifeline live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getInteraction_Lifeline(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getLifeline(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.fragment == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					InteractionFragment oldValue = (InteractionFragment)event.getOldValue();
					InteractionFragment newValue = (InteractionFragment)event.getNewValue();
					// Start of user code for fragment live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getInteraction_Fragment(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getInteractionFragment(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.action == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Action oldValue = (Action)event.getOldValue();
					Action newValue = (Action)event.getNewValue();
					// Start of user code for action live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getInteraction_Action(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getAction(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.formalGate == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Gate oldValue = (Gate)event.getOldValue();
					Gate newValue = (Gate)event.getNewValue();
					// Start of user code for formalGate live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getInteraction_FormalGate(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getGate(), event.getNewValue(), event.getNewIndex()));
			}
			if (UMLViewsRepository.Interaction.message == event.getAffectedEditor()) {
				if (PathedPropertiesEditionEvent.SET == event.getKind()) {
					Message oldValue = (Message)event.getOldValue();
					Message newValue = (Message)event.getNewValue();
					// Start of user code for message live update command
					// TODO: Complete the interaction update command
					// End of user code					
				}
				else if (PathedPropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getInteraction_Message(), event.getNewValue()));
				else if (PathedPropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PathedPropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, interaction, UMLPackage.eINSTANCE.getMessage(), event.getNewValue(), event.getNewIndex()));
			}


			if (command != null)
				liveEditingDomain.getCommandStack().execute(command);
		} else if (PathedPropertiesEditionEvent.CHANGE == event.getState()) {
			Diagnostic diag = this.validateValue(event);
			if (diag != null && diag.getSeverity() != Diagnostic.OK) {
				
				if (UMLViewsRepository.Interaction.name == event.getAffectedEditor())
					basePart.setMessageForName(diag.getMessage(), IMessageProvider.ERROR);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				


			} else {
				
				if (UMLViewsRepository.Interaction.name == event.getAffectedEditor())
					basePart.unsetMessageForName();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				


			}
		}
	}	

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.String, int)
	 */
	public boolean isRequired(String key, int kind) {
		return key == UMLViewsRepository.Interaction.isLeaf || key == UMLViewsRepository.Interaction.isAbstract || key == UMLViewsRepository.Interaction.isActive || key == UMLViewsRepository.Interaction.isReentrant;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.String, int)
	 */
	public String getHelpContent(String key, int kind) {
			if (key == UMLViewsRepository.Interaction.ownedComment)
				return "The Comments owned by this element."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.name)
				return "The name of the NamedElement."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.visibility)
				return "Determines where the NamedElement appears within different Namespaces within the overall model, and its accessibility."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.clientDependency)
				return "Indicates the dependencies that reference the client."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.elementImport)
				return "References the ElementImports owned by the Namespace."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.packageImport)
				return "References the PackageImports owned by the Namespace."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.ownedRule)
				return "Specifies a set of Constraints owned by this Namespace."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.isLeaf)
				return "Indicates whether it is possible to further specialize a RedefinableElement. If the value is true, then it is not possible to further specialize the RedefinableElement."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.templateBinding)
				return "The optional bindings from this element to templates."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.isAbstract)
				return "If true, the Classifier does not provide a complete declaration and can typically not be instantiated. An abstract classifier is intended to be used by other classifiers e.g. as the target of general metarelationships or generalization relationships."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.generalization)
				return "Specifies the Generalization relationships for this Classifier. These Generalizations navigaten to more general classifiers in the generalization hierarchy."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.powertypeExtent)
				return "Designates the GeneralizationSet of which the associated Classifier is a power type."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.redefinedClassifier)
				return "References the Classifiers that are redefined by this Classifier."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.substitution)
				return "References the substitutions that are owned by this Classifier."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.collaborationUse)
				return "References the collaboration uses owned by the classifier."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.ownedUseCase)
				return "References the use cases owned by this classifier."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.useCase)
				return "The set of use cases for which this Classifier is the subject."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.ownedAttribute)
				return "References the properties owned by the classifier."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.ownedConnector)
				return "References the connectors owned by the classifier."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.ownedBehavior)
				return "References behavior specifications owned by a classifier."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.interfaceRealization)
				return "The set of InterfaceRealizations owned by the BehavioredClassifier. Interface realizations reference the Interfaces of which the BehavioredClassifier is an implementation."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.ownedTrigger)
				return "References Trigger descriptions owned by a Classifier."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.nestedClassifier)
				return "References all the Classifiers that are defined (nested) within the Class."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.ownedOperation)
				return "The operations owned by the class."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.isActive)
				return "Determines whether an object specified by this class is active or not. If true, then the owning class is referred to as an active class. If false, then such a class is referred to as a passive class."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.ownedReception)
				return "Receptions that objects of this class are willing to accept."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.isReentrant)
				return "Tells whether the behavior can be invoked while it is still executing from a previous invocation."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.redefinedBehavior)
				return "References a behavior that this behavior redefines. A subtype of Behavior may redefine any other subtype of Behavior. If the behavior implements a behavioral feature, it replaces the redefined behavior. If the behavior is a classifier behavior, it extends the redefined behavior."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.ownedParameter)
				return "References a list of parameters to the behavior which describes the order and type of arguments that can be given when the behavior is invoked and of the values which will be returned when the behavior completes its execution."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.precondition)
				return "An optional set of Constraints specifying what must be fulfilled when the behavior is invoked."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.postcondition)
				return "An optional set of Constraints specifying what is fulfilled after the execution of the behavior is completed, if its precondition was fulfilled before its invocation."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.ownedParameterSet)
				return "The ParameterSets owned by this Behavior."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.covered)
				return "References the Lifelines that the InteractionFragment involves."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.generalOrdering)
				return "The general ordering relationships contained in this fragment."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.lifeline)
				return "Specifies the participants in this Interaction."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.fragment)
				return "The ordered set of fragments in the Interaction."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.action)
				return "Actions owned by the Interaction."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.formalGate)
				return "Specifies the gates that form the message interface between this Interaction and any InteractionUses which reference it."; //$NON-NLS-1$
			if (key == UMLViewsRepository.Interaction.message)
				return "The Messages contained in this Interaction."; //$NON-NLS-1$
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
			if (UMLViewsRepository.Interaction.name == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
			}
			if (UMLViewsRepository.Interaction.visibility == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getNamedElement_Visibility().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getNamedElement_Visibility().getEAttributeType(), newValue);
			}
			if (UMLViewsRepository.Interaction.isLeaf == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getRedefinableElement_IsLeaf().getEAttributeType(), newValue);
			}
			if (UMLViewsRepository.Interaction.isAbstract == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getClassifier_IsAbstract().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getClassifier_IsAbstract().getEAttributeType(), newValue);
			}
			if (UMLViewsRepository.Interaction.isActive == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getClass_IsActive().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getClass_IsActive().getEAttributeType(), newValue);
			}
			if (UMLViewsRepository.Interaction.isReentrant == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(UMLPackage.eINSTANCE.getBehavior_IsReentrant().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(UMLPackage.eINSTANCE.getBehavior_IsReentrant().getEAttributeType(), newValue);
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
			return Diagnostician.INSTANCE.validate(interaction);
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
			interaction.eAdapters().remove(semanticAdapter);
	}

}

