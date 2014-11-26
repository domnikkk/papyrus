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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Type;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;


/**
 * A {@link ITypeCatalog} prividing all {@link Type} available in a provided {@link Resource}.
 * 
 * @author cedric dumoulin
 *
 */
public class ResourceTypeProvider implements ITypeCatalog {

	protected Resource resource;
	protected EClassifier requestedType;
	
	protected Predicate<EObject> typePredicate;
	
	/**
	 * Constructor.
	 *
	 * @param resource
	 * @param requestedType
	 */
	public ResourceTypeProvider(Resource resource, EClass requestedType) {
		this.resource = resource;
		this.requestedType = requestedType;
		this.typePredicate = new TypePredicate();
	}

	/**
	 * @see org.eclipse.papyrus.uml.profile.drafter.ui.model.ITypeCatalog#getTypes()
	 *
	 * @return
	 */
	@Override
	public List<Type> getTypes() {
		   List<Type> result = new ArrayList<Type>();
		   
		   Iterator<EObject> iter = resource.getAllContents();
		   Iterators.filter(iter, getTypePredicate() );
		    while(iter.hasNext() )
		    
		    {
		    	EObject object = iter.next();
		      if (requestedType.isInstance(object))
		      {
		        result.add((Type)object);
		      }
		    }
		    return result;
	}

	private Predicate getTypePredicate() {
		return typePredicate;
	}

	@Override
	public Iterator<Type> iterator() {
		// Return an Iterator with filtering over original iterator
		return Iterators.filter(resource.getAllContents(), getTypePredicate() );
	}

	/**
	 * 
	 *
	 */
	class TypePredicate implements Predicate<EObject> {

		@Override
		public boolean apply(EObject input) {
			return requestedType.isInstance(input);
		}
		
	}
}
