/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.emf.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Predicate;

/**
 * Useful Guava {@link Predicate}s for working with EMF models.
 */
public class EMFPredicates {

	private EMFPredicates() {
		super();
	}

	/**
	 * Obtains a predicate testing that an EMF object is not a proxy. It is formulated this
	 * way on the expectation that usually one would want to filter for objects that aren't
	 * proxies. Otherwise, just do {@code Predicates.not(EMFPredicates.notProxy())}.
	 * 
	 * @return a predicate that matches EMF objects that are not proxies
	 * 
	 * @see EObject#eIsProxy()
	 */
	public static Predicate<EObject> notProxy() {
		return new Predicate<EObject>() {
			@Override
			public boolean apply(EObject input) {
				return (input != null) && !input.eIsProxy();
			}
		};
	}

	/**
	 * Obtains a predicate testing that a resource is loaded.
	 * 
	 * @return an is-loaded predicate
	 * 
	 * @see Resource#isLoaded()
	 */
	public static Predicate<Resource> isLoaded() {
		return new Predicate<Resource>() {
			@Override
			public boolean apply(Resource input) {
				return (input != null) && input.isLoaded();
			}
		};
	}
}
