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
import java.util.Iterator;
import java.util.List;

import org.eclipse.uml2.uml.Type;


/**
 * A {@link ITypeCatalog} made of subcollections of {@link ITypeCatalog}.
 * @author cedric dumoulin
 *
 */
public class CompoundTypeProvider implements ITypeCatalog {

	protected List<ITypeCatalog> catalogs;
	
	/**
	 * The union of provided types.
	 * TODO: consider using a TreeSet to avoid duplicate.
	 */
	protected List<Type> types;
	
	
	
	public CompoundTypeProvider(ITypeCatalog ... catalogs ) {
		
		this.catalogs = new ArrayList<ITypeCatalog>();
		this.types = new ArrayList<Type>();
		
		for( ITypeCatalog provider : catalogs) {
			addITypeProvider(provider);
		}
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

	@Override
	public Iterator<Type> iterator() {
		return types.iterator();
	}

	public void addITypeProvider( ITypeCatalog typeProvider) {
		catalogs.add(typeProvider);
		types.addAll(typeProvider.getTypes());
	}
}
