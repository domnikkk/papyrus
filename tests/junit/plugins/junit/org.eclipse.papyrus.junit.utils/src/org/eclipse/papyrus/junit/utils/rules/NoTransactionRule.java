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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * This rule provides a ResourceSet with a TransactionalEditingDomain
 *
 * All test methods are executed within a Transaction (Which means test method
 * do not need to care about transactions)
 *
 * Usage:
 *
 * <pre>
 * &#064;Rule
 * public NoTransactionRule noTransaction = new NoTransactionRule();
 * </pre>
 *
 * @author Camille Letavernier
 */
public class NoTransactionRule implements TestRule {

	private final ModelSetFixture modelSet = new ModelSetFixture();

	private final NoTransactionFixture noTransaction = new NoTransactionFixture(modelSet);

	public RuleChain getRuleChain() {
		return RuleChain.outerRule(modelSet).around(noTransaction);
	}

	public Statement apply(Statement base, Description description) {
		return getRuleChain().apply(base, description);
	}

	public ResourceSet getResourceSet() {
		return modelSet.getResourceSet();
	}

	public Resource getModelResource() {
		return modelSet.getModelResource();
	}
}
