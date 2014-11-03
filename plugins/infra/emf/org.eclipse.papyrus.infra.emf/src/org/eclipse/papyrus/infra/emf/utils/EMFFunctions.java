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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Function;

/**
 * Useful Guava {@link Function}s for working with EMF models.
 */
public class EMFFunctions {

	private EMFFunctions() {
		super();
	}

	/**
	 * Obtains a function that obtains the URI of an EMF object.
	 * 
	 * @return an EMF object URI function
	 * 
	 * @see EcoreUtil#getURI(EObject)
	 */
	public static Function<EObject, URI> objectURI() {
		return new Function<EObject, URI>() {
			@Override
			public URI apply(EObject input) {
				return (input == null) ? null : EcoreUtil.getURI(input);
			}
		};
	}

	/**
	 * Obtains a function that obtains the URI of a resource.
	 * 
	 * @return a resource URI function
	 * 
	 * @see Resource#getURI()
	 */
	public static Function<Resource, URI> resourceURI() {
		return new Function<Resource, URI>() {
			@Override
			public URI apply(Resource input) {
				return (input == null) ? null : input.getURI();
			}
		};
	}

	/**
	 * Obtains a function that trims the fragments of URIs.
	 * 
	 * @return a URI fragment trimming function
	 * 
	 * @see URI#trimFragment()
	 */
	public static Function<URI, URI> trimURIFragment() {
		return new Function<URI, URI>() {
			@Override
			public URI apply(URI input) {
				return (input == null) ? null : input.trimFragment();
			}
		};
	}

	public static Function<EObject, Object> getFeature(final EStructuralFeature feature) {
		return new Function<EObject, Object>() {
			@Override
			public Object apply(EObject input) {
				return (input == null) ? null : input.eGet(feature);
			}
		};
	}

	public static <T> Function<EObject, T> getFeature(final EStructuralFeature feature, final Class<T> ofType) {
		return new Function<EObject, T>() {
			@Override
			public T apply(EObject input) {
				return (input == null) ? null : ofType.cast(input.eGet(feature));
			}
		};
	}
}
