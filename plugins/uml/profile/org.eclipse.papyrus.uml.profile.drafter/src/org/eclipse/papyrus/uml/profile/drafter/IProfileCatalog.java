/*****************************************************************************
 * Copyright (c) 2014 Cedric Dumoulin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.profile.drafter;

import java.util.List;

import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;


/**
 * Interface implemented by Catalog providing lists of {@link Stereotype}s and {@link Profile} from a
 * namespace (Current model, current project, project, workspace ...).
 * 
 * @author cedric dumoulin
 *
 */
public interface IProfileCatalog {

	/**
	 * Get All {@link Profile}s available in the namespace.
	 * 
	 * @return A list of available {@link Profile}, or an empty list.
	 */
	public List<Profile> getProfiles();
	
	/**
	 * Get All {@link Stereotype}s available in the namespace.
	 * 
	 * @return A list of available {@link Stereotype}, or an empty list.
	 */
	public List<Stereotype> getStereotypes();
	
	/**
	 * Get all the short names of {@link Profile}s available in the namespace.
	 * 
	 * @return A list of {@link Profile}'s names, or an empty list.
	 */
	public List<String> getProfileNames();
	
	/**
	 * Get all the short names of {@link Stereotype}s available in the namespace.
	 * 
	 * @return A list of {@link Stereotype}'s names, or an empty list.
	 */
	public List<String> getStereotypeNames();

	/**
	 * Get all the qualified names of {@link Profile}s available in the namespace.
	 * 
	 * @return A list of {@link Profile}'s qualified names, or an empty list.
	 */
	public List<String> getProfileQualifiedNames();
	
	/**
	 * Get all the qualified names of {@link Stereotype}s available in the namespace.
	 * 
	 * @return A list of {@link Stereotype}'s qualified names, or an empty list.
	 */
	public List<String> getStereotypeQualifiedNames();
	
	/**
	 * Return a list containing the all the names (short and qualified) of the {@link Stereotype} available
	 * in the namespace.
	 * A {@link Stereotype}'s name can appear more than one (short and qualified names).
	 * 
	 * @return A list of all the names available for {@link Stereotype}'s,  or an empty list.
	 */
	public List<String> getAllStereotypeNames();
	
}
