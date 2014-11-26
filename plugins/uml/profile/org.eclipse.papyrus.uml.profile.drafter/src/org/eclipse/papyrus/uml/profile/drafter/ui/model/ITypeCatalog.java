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

package org.eclipse.papyrus.uml.profile.drafter.ui.model;

import java.util.Iterator;
import java.util.List;

import org.eclipse.uml2.uml.Type;


/**
 * A catalog of {@link Type}.
 * 
 * @author cedric dumoulin
 *
 */
public interface ITypeCatalog extends Iterable<Type> {

	/**
	 * Get the label (human representation) of the specified type.
	 * @param type
	 * @return
	 */
//	public String getTypeLabel(Type type);

	/**
	 * Get the type corresponding to the specified label.
	 * 
	 * @param typeLabel The name of the type to look for.
	 * 
	 * @return The {@link Type} corresponding to 
	 */
//	public Type getType(String typeLabel) throws NotFoundException;

	/**
	 * Return a list of available types.
	 * 
	 * @return A list of types.
	 */
	public List<Type> getTypes();

	/**
	 * Return an iterator over the list of types.
	 * 
	 * @see java.lang.Iterable#iterator()
	 *
	 * @return
	 */
	public Iterator<Type> iterator();
}
