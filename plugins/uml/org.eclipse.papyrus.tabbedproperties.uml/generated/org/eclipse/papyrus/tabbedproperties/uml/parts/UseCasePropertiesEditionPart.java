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
package org.eclipse.papyrus.tabbedproperties.uml.parts;

// Start of user code for imports

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
 

// End of user code
/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public interface UseCasePropertiesEditionPart {

	/**
	 * @return the ownedComment to add
	 */
	public List getOwnedCommentToAdd();
	
	/**
	 * @return the ownedComment to remove
	 */
	public List getOwnedCommentToRemove();
	
	/**
	 * @return the ownedComment to move
	 */
	public List getOwnedCommentToMove();
	
	/**
	 * @return the ownedComment to edit
	 */
	public Map getOwnedCommentToEdit();
	
	/**
	 * @return the current ownedComment
	 */
	public List getOwnedCommentTable();
	
	/**
	 * Init the ownedComment
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedComment(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the ownedComment
	 * @param newValue the ownedComment to update
	 */
	public void updateOwnedComment(EObject newValue);
	
	
	
	
	
	/**
	 * @return the name
	 */
	public String getName();
	
	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 */
	public void setName(String newValue);
	
	public void setMessageForName (String msg, int msgLevel);	
	
	public void unsetMessageForName ();
	
	/**
	 * @return the visibility
	 */
	public Enumerator getVisibility();
	
	/**
	 * Init the visibility
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initVisibility(EEnum eenum, Enumerator current);

/**
	 * Defines a new visibility
	 * @param newValue the new visibility to set
	 */
	public void setVisibility(Enumerator newValue);
	
	
	
	
	
	/**
	 * @return the clientDependency to add
	 */
	public List getClientDependencyToAdd();
	
	/**
	 * @return the clientDependency to remove
	 */
	public List getClientDependencyToRemove();
	
	/**
	 * Init the clientDependency
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initClientDependency(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the clientDependency
	 * @param newValue the clientDependency to update
	 */
	public void updateClientDependency(EObject newValue);
	
	
	
	
	
	/**
	 * @return the elementImport to add
	 */
	public List getElementImportToAdd();
	
	/**
	 * @return the elementImport to remove
	 */
	public List getElementImportToRemove();
	
	/**
	 * @return the elementImport to move
	 */
	public List getElementImportToMove();
	
	/**
	 * @return the elementImport to edit
	 */
	public Map getElementImportToEdit();
	
	/**
	 * @return the current elementImport
	 */
	public List getElementImportTable();
	
	/**
	 * Init the elementImport
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initElementImport(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the elementImport
	 * @param newValue the elementImport to update
	 */
	public void updateElementImport(EObject newValue);
	
	
	
	
	
	/**
	 * @return the packageImport to add
	 */
	public List getPackageImportToAdd();
	
	/**
	 * @return the packageImport to remove
	 */
	public List getPackageImportToRemove();
	
	/**
	 * @return the packageImport to move
	 */
	public List getPackageImportToMove();
	
	/**
	 * @return the packageImport to edit
	 */
	public Map getPackageImportToEdit();
	
	/**
	 * @return the current packageImport
	 */
	public List getPackageImportTable();
	
	/**
	 * Init the packageImport
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initPackageImport(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the packageImport
	 * @param newValue the packageImport to update
	 */
	public void updatePackageImport(EObject newValue);
	
	
	
	
	
	/**
	 * @return the ownedRule to add
	 */
	public List getOwnedRuleToAdd();
	
	/**
	 * @return the ownedRule to remove
	 */
	public List getOwnedRuleToRemove();
	
	/**
	 * @return the ownedRule to move
	 */
	public List getOwnedRuleToMove();
	
	/**
	 * @return the ownedRule to edit
	 */
	public Map getOwnedRuleToEdit();
	
	/**
	 * @return the current ownedRule
	 */
	public List getOwnedRuleTable();
	
	/**
	 * Init the ownedRule
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedRule(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the ownedRule
	 * @param newValue the ownedRule to update
	 */
	public void updateOwnedRule(EObject newValue);
	
	
	
	
	
	/**
	 * @return the isLeaf
	 */
	public Boolean getIsLeaf();
	
	/**
	 * Defines a new isLeaf
	 * @param newValue the new isLeaf to set
	 */
	public void setIsLeaf(Boolean newValue);
	
	
	
	
	
	/**
	 * @return the templateBinding to add
	 */
	public List getTemplateBindingToAdd();
	
	/**
	 * @return the templateBinding to remove
	 */
	public List getTemplateBindingToRemove();
	
	/**
	 * @return the templateBinding to move
	 */
	public List getTemplateBindingToMove();
	
	/**
	 * @return the templateBinding to edit
	 */
	public Map getTemplateBindingToEdit();
	
	/**
	 * @return the current templateBinding
	 */
	public List getTemplateBindingTable();
	
	/**
	 * Init the templateBinding
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTemplateBinding(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the templateBinding
	 * @param newValue the templateBinding to update
	 */
	public void updateTemplateBinding(EObject newValue);
	
	
	
	
	
	/**
	 * @return the isAbstract
	 */
	public Boolean getIsAbstract();
	
	/**
	 * Defines a new isAbstract
	 * @param newValue the new isAbstract to set
	 */
	public void setIsAbstract(Boolean newValue);
	
	
	
	
	
	/**
	 * @return the generalization to add
	 */
	public List getGeneralizationToAdd();
	
	/**
	 * @return the generalization to remove
	 */
	public List getGeneralizationToRemove();
	
	/**
	 * @return the generalization to move
	 */
	public List getGeneralizationToMove();
	
	/**
	 * @return the generalization to edit
	 */
	public Map getGeneralizationToEdit();
	
	/**
	 * @return the current generalization
	 */
	public List getGeneralizationTable();
	
	/**
	 * Init the generalization
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initGeneralization(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the generalization
	 * @param newValue the generalization to update
	 */
	public void updateGeneralization(EObject newValue);
	
	
	
	
	
	/**
	 * @return the powertypeExtent to add
	 */
	public List getPowertypeExtentToAdd();
	
	/**
	 * @return the powertypeExtent to remove
	 */
	public List getPowertypeExtentToRemove();
	
	/**
	 * Init the powertypeExtent
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initPowertypeExtent(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the powertypeExtent
	 * @param newValue the powertypeExtent to update
	 */
	public void updatePowertypeExtent(EObject newValue);
	
	
	
	
	
	/**
	 * @return the redefinedClassifier to add
	 */
	public List getRedefinedClassifierToAdd();
	
	/**
	 * @return the redefinedClassifier to remove
	 */
	public List getRedefinedClassifierToRemove();
	
	/**
	 * Init the redefinedClassifier
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initRedefinedClassifier(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the redefinedClassifier
	 * @param newValue the redefinedClassifier to update
	 */
	public void updateRedefinedClassifier(EObject newValue);
	
	
	
	
	
	/**
	 * @return the substitution to add
	 */
	public List getSubstitutionToAdd();
	
	/**
	 * @return the substitution to remove
	 */
	public List getSubstitutionToRemove();
	
	/**
	 * @return the substitution to move
	 */
	public List getSubstitutionToMove();
	
	/**
	 * @return the substitution to edit
	 */
	public Map getSubstitutionToEdit();
	
	/**
	 * @return the current substitution
	 */
	public List getSubstitutionTable();
	
	/**
	 * Init the substitution
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSubstitution(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the substitution
	 * @param newValue the substitution to update
	 */
	public void updateSubstitution(EObject newValue);
	
	
	
	
	
	/**
	 * @return the collaborationUse to add
	 */
	public List getCollaborationUseToAdd();
	
	/**
	 * @return the collaborationUse to remove
	 */
	public List getCollaborationUseToRemove();
	
	/**
	 * @return the collaborationUse to move
	 */
	public List getCollaborationUseToMove();
	
	/**
	 * @return the collaborationUse to edit
	 */
	public Map getCollaborationUseToEdit();
	
	/**
	 * @return the current collaborationUse
	 */
	public List getCollaborationUseTable();
	
	/**
	 * Init the collaborationUse
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCollaborationUse(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the collaborationUse
	 * @param newValue the collaborationUse to update
	 */
	public void updateCollaborationUse(EObject newValue);
	
	
	
	
	
	/**
	 * @return the ownedUseCase to add
	 */
	public List getOwnedUseCaseToAdd();
	
	/**
	 * @return the ownedUseCase to remove
	 */
	public List getOwnedUseCaseToRemove();
	
	/**
	 * @return the ownedUseCase to move
	 */
	public List getOwnedUseCaseToMove();
	
	/**
	 * @return the ownedUseCase to edit
	 */
	public Map getOwnedUseCaseToEdit();
	
	/**
	 * @return the current ownedUseCase
	 */
	public List getOwnedUseCaseTable();
	
	/**
	 * Init the ownedUseCase
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedUseCase(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the ownedUseCase
	 * @param newValue the ownedUseCase to update
	 */
	public void updateOwnedUseCase(EObject newValue);
	
	
	
	
	
	/**
	 * @return the useCase to add
	 */
	public List getUseCaseToAdd();
	
	/**
	 * @return the useCase to remove
	 */
	public List getUseCaseToRemove();
	
	/**
	 * Init the useCase
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initUseCase(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the useCase
	 * @param newValue the useCase to update
	 */
	public void updateUseCase(EObject newValue);
	
	
	
	
	
	/**
	 * @return the ownedBehavior to add
	 */
	public List getOwnedBehaviorToAdd();
	
	/**
	 * @return the ownedBehavior to remove
	 */
	public List getOwnedBehaviorToRemove();
	
	/**
	 * @return the ownedBehavior to move
	 */
	public List getOwnedBehaviorToMove();
	
	/**
	 * @return the ownedBehavior to edit
	 */
	public Map getOwnedBehaviorToEdit();
	
	/**
	 * @return the current ownedBehavior
	 */
	public List getOwnedBehaviorTable();
	
	/**
	 * Init the ownedBehavior
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedBehavior(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the ownedBehavior
	 * @param newValue the ownedBehavior to update
	 */
	public void updateOwnedBehavior(EObject newValue);
	
	
	
	
	
	/**
	 * @return the interfaceRealization to add
	 */
	public List getInterfaceRealizationToAdd();
	
	/**
	 * @return the interfaceRealization to remove
	 */
	public List getInterfaceRealizationToRemove();
	
	/**
	 * @return the interfaceRealization to move
	 */
	public List getInterfaceRealizationToMove();
	
	/**
	 * @return the interfaceRealization to edit
	 */
	public Map getInterfaceRealizationToEdit();
	
	/**
	 * @return the current interfaceRealization
	 */
	public List getInterfaceRealizationTable();
	
	/**
	 * Init the interfaceRealization
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initInterfaceRealization(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the interfaceRealization
	 * @param newValue the interfaceRealization to update
	 */
	public void updateInterfaceRealization(EObject newValue);
	
	
	
	
	
	/**
	 * @return the ownedTrigger to add
	 */
	public List getOwnedTriggerToAdd();
	
	/**
	 * @return the ownedTrigger to remove
	 */
	public List getOwnedTriggerToRemove();
	
	/**
	 * @return the ownedTrigger to move
	 */
	public List getOwnedTriggerToMove();
	
	/**
	 * @return the ownedTrigger to edit
	 */
	public Map getOwnedTriggerToEdit();
	
	/**
	 * @return the current ownedTrigger
	 */
	public List getOwnedTriggerTable();
	
	/**
	 * Init the ownedTrigger
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedTrigger(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the ownedTrigger
	 * @param newValue the ownedTrigger to update
	 */
	public void updateOwnedTrigger(EObject newValue);
	
	
	
	
	
	/**
	 * @return the include to add
	 */
	public List getIncludeToAdd();
	
	/**
	 * @return the include to remove
	 */
	public List getIncludeToRemove();
	
	/**
	 * @return the include to move
	 */
	public List getIncludeToMove();
	
	/**
	 * @return the include to edit
	 */
	public Map getIncludeToEdit();
	
	/**
	 * @return the current include
	 */
	public List getIncludeTable();
	
	/**
	 * Init the include
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initInclude(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the include
	 * @param newValue the include to update
	 */
	public void updateInclude(EObject newValue);
	
	
	
	
	
	/**
	 * @return the extend to add
	 */
	public List getExtendToAdd();
	
	/**
	 * @return the extend to remove
	 */
	public List getExtendToRemove();
	
	/**
	 * @return the extend to move
	 */
	public List getExtendToMove();
	
	/**
	 * @return the extend to edit
	 */
	public Map getExtendToEdit();
	
	/**
	 * @return the current extend
	 */
	public List getExtendTable();
	
	/**
	 * Init the extend
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initExtend(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the extend
	 * @param newValue the extend to update
	 */
	public void updateExtend(EObject newValue);
	
	
	
	
	
	/**
	 * @return the extensionPoint to add
	 */
	public List getExtensionPointToAdd();
	
	/**
	 * @return the extensionPoint to remove
	 */
	public List getExtensionPointToRemove();
	
	/**
	 * @return the extensionPoint to move
	 */
	public List getExtensionPointToMove();
	
	/**
	 * @return the extensionPoint to edit
	 */
	public Map getExtensionPointToEdit();
	
	/**
	 * @return the current extensionPoint
	 */
	public List getExtensionPointTable();
	
	/**
	 * Init the extensionPoint
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initExtensionPoint(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the extensionPoint
	 * @param newValue the extensionPoint to update
	 */
	public void updateExtensionPoint(EObject newValue);
	
	
	
	
	
	/**
	 * @return the subject to add
	 */
	public List getSubjectToAdd();
	
	/**
	 * @return the subject to remove
	 */
	public List getSubjectToRemove();
	
	/**
	 * Init the subject
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSubject(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the subject
	 * @param newValue the subject to update
	 */
	public void updateSubject(EObject newValue);
	
	
	
	
	





	// Start of user code for additional methods
 	
	// End of user code
}

