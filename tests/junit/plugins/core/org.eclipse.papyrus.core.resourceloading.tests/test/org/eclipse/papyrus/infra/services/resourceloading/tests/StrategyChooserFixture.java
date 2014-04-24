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
package org.eclipse.papyrus.infra.services.resourceloading.tests;

import org.eclipse.papyrus.infra.services.resourceloading.preferences.StrategyChooser;


/**
 * A {@link StrategyChooser} fixture for the control-mode tests that ensures a normal control-mode strategy
 * is restored after completion for predictable/correct resource loading behaviour in the execution of
 * subsequent (and unrelated) tests.
 */
public class StrategyChooserFixture {

	private final int strategyToRestore;

	public StrategyChooserFixture(int choose) {
		strategyToRestore = new StrategyChooser().getCurrentStrategy();
		StrategyChooser.setCurrentStrategy(choose);
	}

	public void dispose() {
		StrategyChooser.setCurrentStrategy(strategyToRestore);
	}

}
