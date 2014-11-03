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

package org.eclipse.papyrus.junit.matchers;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import com.google.common.collect.Iterables;

/**
 * Some useful matchers that Hamcrest doesn't provide.
 */
public class MoreMatchers {

	private MoreMatchers() {
		super();
	}

	public static <N extends Number & Comparable<N>> Matcher<N> greaterThan(final N minimum) {
		return new BaseMatcher<N>() {
			public void describeTo(Description description) {
				description.appendText("greater than ").appendValue(minimum);
			}

			@SuppressWarnings("unchecked")
			public boolean matches(Object item) {
				return ((N) item).compareTo(minimum) > 0;
			}
		};
	}

	public static Matcher<Iterable<?>> isEmpty() {
		return new BaseMatcher<Iterable<?>>() {
			public void describeTo(Description description) {
				description.appendText("is empty");
			}

			public boolean matches(Object item) {
				return Iterables.isEmpty((Iterable<?>) item);
			}
		};
	}
}
