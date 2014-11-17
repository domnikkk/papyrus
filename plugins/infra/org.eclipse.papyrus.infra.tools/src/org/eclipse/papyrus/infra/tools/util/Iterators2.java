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

package org.eclipse.papyrus.infra.tools.util;

import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;

/**
 * Utilities for working with iterators that are not provided by {@linkplain Iterators Guava}.
 */
public class Iterators2 {
	/**
	 * Not instantiable by clients.
	 */
	private Iterators2() {
		super();
	}

	/**
	 * Filters an EMF tree iterator for elements of a particular {@code type}.
	 * 
	 * @param treeIterator
	 *            the tree iterator to filter
	 * @param type
	 *            the type of elements to include in the filtered tree iterator
	 * @return the filtered tree iterator
	 */
	public static <T> TreeIterator<T> filter(final TreeIterator<?> treeIterator, final Class<T> type) {
		class FilteredTreeIterator extends AbstractIterator<T> implements TreeIterator<T> {
			final Iterator<T> delegate = Iterators.filter(treeIterator, type);

			@Override
			protected T computeNext() {
				return delegate.hasNext() ? delegate.next() : endOfData();
			}

			public void prune() {
				treeIterator.prune();
			}
		}

		return new FilteredTreeIterator();
	}
}
