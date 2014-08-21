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
package org.eclipse.papyrus.infra.tools.databinding;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * The test suite for data-bindings API.
 */
@RunWith(Suite.class)
@SuiteClasses({ DelegatingObservableValueTest.class, DelegatingObservableSetTest.class, DelegatingObservableListTest.class })
public class AllDataBindingTests {

	private AllDataBindingTests() {
		super();
	}

}
