/*****************************************************************************
 * Copyright (c) 2011 ATOS.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *		Olivier Mélois (ATOS) olivier.melois@atos.net - Bug 376703 
 *
 *****************************************************************************/

package org.eclipse.papyrus.sysml.diagram.blockdefinition.compartment.descriptors;

import org.eclipse.uml2.uml.Property;

/**
 * Interface used by the PropertryCompartmentDescription extension point. 
 */
public interface IPropertyCompartmentDescriptor {

	/**
	 * Gets the type of the associated compartment.
	 */
	public String getType();
	
	/**
	 * Tells whether a property fits in the associated compartment.
	 */
	public boolean isCompatibleWithProperty(Property property);
	
}
