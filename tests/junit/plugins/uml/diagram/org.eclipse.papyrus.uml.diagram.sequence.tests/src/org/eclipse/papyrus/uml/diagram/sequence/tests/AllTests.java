/*****************************************************************************
 * Copyright (c) 2009, 2014 CEA LIST and others.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 440284
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.sequence.tests;

import org.eclipse.papyrus.uml.diagram.sequence.tests.bug.BugTests;
import org.eclipse.papyrus.uml.diagram.sequence.tests.bug.BugTests2;
import org.eclipse.papyrus.uml.diagram.sequence.tests.bug.m7.BugTest_m7;
import org.eclipse.papyrus.uml.diagram.sequence.tests.bug.pro20130916.AllTests_20130916;
import org.eclipse.papyrus.uml.diagram.sequence.tests.canonical.AllCanonicalTests;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * All tests together.
 */
@RunWith(Suite.class)
@SuiteClasses({ AllCanonicalTests.class, BugTests.class, BugTests2.class, BugTest_m7.class, AllTests_20130916.class })
public class AllTests {

	@ClassRule
	public static final HideViewRule hideOutline = new HideViewRule("org.eclipse.ui.views.ContentOutline");

}
