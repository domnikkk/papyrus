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
public interface ActivityPartitionPropertiesEditionPart {

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
	 * @return the isDimension
	 */
	public Boolean getIsDimension();
	
	/**
	 * Defines a new isDimension
	 * @param newValue the new isDimension to set
	 */
	public void setIsDimension(Boolean newValue);
	
	
	
	
	
	/**
	 * @return the isExternal
	 */
	public Boolean getIsExternal();
	
	/**
	 * Defines a new isExternal
	 * @param newValue the new isExternal to set
	 */
	public void setIsExternal(Boolean newValue);
	
	
	
	
	
	/**
	 * @return the node to add
	 */
	public List getNodeToAdd();
	
	/**
	 * @return the node to remove
	 */
	public List getNodeToRemove();
	
	/**
	 * Init the node
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initNode(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the node
	 * @param newValue the node to update
	 */
	public void updateNode(EObject newValue);
	
	
	
	
	
	/**
	 * @return the subpartition to add
	 */
	public List getSubpartitionToAdd();
	
	/**
	 * @return the subpartition to remove
	 */
	public List getSubpartitionToRemove();
	
	/**
	 * @return the subpartition to move
	 */
	public List getSubpartitionToMove();
	
	/**
	 * @return the subpartition to edit
	 */
	public Map getSubpartitionToEdit();
	
	/**
	 * @return the current subpartition
	 */
	public List getSubpartitionTable();
	
	/**
	 * Init the subpartition
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSubpartition(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the subpartition
	 * @param newValue the subpartition to update
	 */
	public void updateSubpartition(EObject newValue);
	
	
	
	
	
	/**
	 * @return the edge to add
	 */
	public List getEdgeToAdd();
	
	/**
	 * @return the edge to remove
	 */
	public List getEdgeToRemove();
	
	/**
	 * Init the edge
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEdge(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the edge
	 * @param newValue the edge to update
	 */
	public void updateEdge(EObject newValue);
	
	
	
	
	





	// Start of user code for additional methods
 	
	// End of user code
}

