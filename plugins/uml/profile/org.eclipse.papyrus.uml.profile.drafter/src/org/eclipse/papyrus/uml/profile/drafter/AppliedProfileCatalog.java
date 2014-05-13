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

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;

/**
 * 
 * @author cedric dumoulin
 *
 */
public class AppliedProfileCatalog {

	/**
	 * Uml Element from which we compute the AppliedProfileCatalog.
	 * 
	 */
	protected NamedElement umlElement;
	
	/**
	 * Constructor.
	 *
	 * @param umlElement
	 */
	public AppliedProfileCatalog(NamedElement umlElement) {
		super();
		this.umlElement = umlElement;
	}
	
	/**
	 * @return the umlElement
	 */
	public NamedElement getUmlElement() {
		return umlElement;
	}


	public List<Profile> getAppliedProfiles() {
		return null;
		
	}
}
