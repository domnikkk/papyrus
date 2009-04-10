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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
 

// End of user code
/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public interface TemplateBindingPropertiesEditionPart {

	/**
	 * @return the parameterSubstitution to add
	 */
	public List getParameterSubstitutionToAdd();
	
	/**
	 * @return the parameterSubstitution to remove
	 */
	public List getParameterSubstitutionToRemove();
	
	/**
	 * @return the parameterSubstitution to move
	 */
	public List getParameterSubstitutionToMove();
	
	/**
	 * @return the parameterSubstitution to edit
	 */
	public Map getParameterSubstitutionToEdit();
	
	/**
	 * @return the current parameterSubstitution
	 */
	public List getParameterSubstitutionTable();
	
	/**
	 * Init the parameterSubstitution
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initParameterSubstitution(EObject current, EReference containingFeature, EReference feature);

/**
	 * Update the parameterSubstitution
	 * @param newValue the parameterSubstitution to update
	 */
	public void updateParameterSubstitution(EObject newValue);
	
	
	
	
	





	// Start of user code for additional methods
 	
	// End of user code
}

