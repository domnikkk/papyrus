/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.junit.utils.rules;

import static org.junit.Assert.fail;

import java.util.concurrent.Callable;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;


/**
 * Utilities for working with JUnit {@linkplain TestRule rules}.
 */
public class RuleUtil {

	private RuleUtil() {
		super();
	}

	/**
	 * Ad hoc invocation of an operation wrapped in the start/finish behaviour of a JUnit rule.
	 * 
	 * @param run
	 *        the operation to run
	 * @param rule
	 *        the rule to wrap it in
	 * 
	 * @throws Exception
	 *         on any exception thrown by the runnable or the rule
	 */
	public static void runWith(Runnable run, TestRule rule) throws Exception {
		callWith(call(run), rule);
	}

	/**
	 * Safe ad hoc invocation of an operation wrapped in the start/finish behaviour of a JUnit rule.
	 * Fails JUnitishly on any exception in the callable or the rule.
	 * 
	 * @param run
	 *        the operation to run
	 * @param rule
	 *        the rule to wrap it in
	 */
	public static void safeRunWith(Runnable run, TestRule rule) throws Exception {
		safeCallWith(call(run), rule);
	}

	static Callable<?> call(final Runnable run) {
		return new Callable<Void>() {

			public Void call() throws Exception {
				run.run();
				return null;
			}
		};
	}

	/**
	 * Ad hoc invocation of a callable wrapped in the start/finish behaviour of a JUnit rule.
	 * 
	 * @param callable
	 *        the callable to execute
	 * @param rule
	 *        the rule to wrap it in
	 * 
	 * @throws Exception
	 *         on any exception thrown by the callable or the rule
	 */
	public static <V> V callWith(Callable<V> callable, TestRule rule) throws Exception {
		class CallableStatement extends Statement {

			final Callable<V> callable;

			V result;

			CallableStatement(Callable<V> callable) {
				this.callable = callable;
			}

			@Override
			public void evaluate() throws Throwable {
				result = callable.call();
			}
		}

		try {
			CallableStatement statement = new CallableStatement(callable);
			rule.apply(statement, Description.EMPTY).evaluate();
			return statement.result;
		} catch (Throwable t) {
			if(t instanceof Exception) {
				throw (Exception)t;
			} else {
				throw (Error)t;
			}
		}
	}

	/**
	 * Safe ad hoc invocation of a callable wrapped in the start/finish behaviour of a JUnit rule.
	 * Fails JUnitishly on any exception in the callable or the rule.
	 * 
	 * @param callable
	 *        the callable to execute
	 * @param rule
	 *        the rule to wrap it in
	 */
	public static <V> V safeCallWith(Callable<V> callable, TestRule rule) {
		try {
			return callWith(callable, rule);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to invoke callable with rule: " + e.getLocalizedMessage());
			return null; // Unreachable
		}
	}

}
