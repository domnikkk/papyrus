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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.uml2.uml.Type;


/**
 * A {@link ITypeCatalog} allowing to add {@link Type}.
 * This implementation is backuped by a {@link List}.
 * 
 * @author cedric dumoulin
 *
 */
public class TypeProvider implements ITypeCatalog {

	protected List<Type> types;
	
	/**
	 * Constructor.
	 */
	public TypeProvider() {
		this.types = new ArrayList<Type>();

	}
	
	/**
	 * Constructor.
	 */
	public TypeProvider( Type ...types) {
		List<Type> initials = Arrays.asList(types);
		this.types = new ArrayList<Type>(initials);
	}
	
	
	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.ITypeCatalog#getTypes()
	 *
	 * @return
	 */
	@Override
	public List<Type> getTypes() {
		return types;
	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.ITypeCatalog#iterator()
	 *
	 * @return
	 */
	@Override
	public Iterator<Type> iterator() {
		return types.iterator();
	}

	public void addType( Type type ) {
		types.add(type);
	}
}
