/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.junit.utils.rules;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.junit.ClassRule;
import org.junit.rules.MethodRule;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;


/**
 * <p>
 * A JUnit rule that automatically cleans up resources when a test has finished. It provides a generic framework for cleaning stuff up, but it also
 * has special cases for commonly used items.
 * </p>
 * <p>
 * As a bonus, the {@code HouseKeeper} also automatically clears all non-{@code static} non-{@code final} fields of the test class that are of some
 * type conforming to {@link EObject}, just to make sure that they can't cause memory leaks.
 * </p>
 * <p>
 * To use the rule as a {@link ClassRule &#x40;ClassRule}, instantiate the {@linkplain Static} inner class.
 * </p>
 * 
 * @see Static
 * @see Disposer
 */
public class HouseKeeper extends AbstractHouseKeeperRule implements MethodRule {

	public HouseKeeper() {
		super();
	}

	@Override
	boolean isStatic() {
		return false;
	}

	@Override
	Class<?> getTestClass() {
		return test.getClass();
	}

	//
	// Rule protocol
	//

	public Statement apply(final Statement base, final FrameworkMethod method, final Object target) {
		return new Statement() {

			@Override
			public void evaluate() throws Throwable {
				test = target;
				testName = method.getName();

				try {
					base.evaluate();
				} finally {
					cleanUp();
				}
			}
		};
	}

	//
	// Nested types
	//

	/**
	 * A call-back interface for disposing of objects no longer needed by the test.
	 */
	public static interface Disposer<T> {

		void dispose(T object) throws Exception;
	}

	/**
	 * A variant of the {@link HouseKeeper} that is to be used for class rules. It cleans up static fields of the test class and runs disposers
	 * after the completion of the class's whole test suite.
	 */
	public static class Static extends AbstractHouseKeeperRule implements TestRule {

		@Override
		boolean isStatic() {
			return true;
		}

		@Override
		Class<?> getTestClass() {
			return (Class<?>)test;
		}

		public Statement apply(final Statement base, final Description description) {
			return new Statement() {

				@Override
				public void evaluate() throws Throwable {
					// description.getTestClass() is null for static rules
					test = findTestClass(description);
					testName = description.getMethodName();

					try {
						base.evaluate();
					} finally {
						cleanUp();
					}
				}

				Class<?> findTestClass(Description description) {
					Class<?> result = description.getTestClass();

					if(result == null) {
						for(Iterator<Description> iter = description.getChildren().iterator(); (result == null) && iter.hasNext();) {
							result = findTestClass(iter.next());
						}
					}

					return result;
				}
			};
		}

	}
}
