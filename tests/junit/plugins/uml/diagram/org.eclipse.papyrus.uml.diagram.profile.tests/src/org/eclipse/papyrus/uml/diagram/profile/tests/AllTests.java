/*****************************************************************************
 * Copyright (c) 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Thibault Le Ouay (Sherpa Engineering) t.leouay@sherpa-eng.com  - Initial API and implementation
 *   Christian W. Damus - bug 451613
 *  
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.profile.tests;

import org.eclipse.papyrus.uml.diagram.profile.custom.commands.tests.AllCustomCommandTests;
import org.eclipse.papyrus.uml.diagram.profile.tests.canonical.AllCanonicalTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({ AllCustomCommandTests.class, AllCanonicalTests.class })
public class AllTests {
	// Test suite
}
