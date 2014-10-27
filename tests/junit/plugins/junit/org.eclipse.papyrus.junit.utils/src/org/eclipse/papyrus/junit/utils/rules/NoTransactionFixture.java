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

import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * This rule provides a ResourceSet with a TransactionalEditingDomain
 *
 * All test methods are executed within a Transaction (Which means test method
 * do not need to care about transactions)
 *
 * This fixture is meant to be used through {@link NoTransactionRule}
 *
 * @author Camille Letavernier
 *
 * @see {@link NoTransactionRule}
 */
public class NoTransactionFixture implements TestRule {


	private final ModelSetFixture modelSet;

	public NoTransactionFixture(ModelSetFixture modelSet) {
		this.modelSet = modelSet;
	}

	/**
	 * @see org.junit.rules.TestRule#apply(org.junit.runners.model.Statement, org.junit.runner.Description)
	 *
	 * @param arg0
	 * @param arg1
	 * @return
	 */
	public Statement apply(final Statement base, final Description description) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {

				final AtomicReference<Throwable> throwable = new AtomicReference<Throwable>();
				modelSet.getEditingDomain().getCommandStack().execute(new AbstractCommand() {

					public void execute() {
						try {
							base.evaluate();
						} catch (Throwable t) {
							throwable.set(t);
						}
					}

					public void redo() {
						// Nothing
					}

					/**
					 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
					 *
					 * @return
					 */
					@Override
					protected boolean prepare() {
						return true;
					}

				});

				if (throwable.get() != null) {
					throw throwable.get();
				}
			}
		};
	}

	public ResourceSet getResourceSet() {
		return modelSet.getResourceSet();
	}

}
