/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.clazz.test;

import org.eclipse.papyrus.uml.diagram.clazz.test.canonical.AllCanonicalTests;
import org.eclipse.papyrus.uml.diagram.clazz.test.canonical.TestClassDiagram;
import org.eclipse.papyrus.uml.diagram.clazz.test.copyPaste.ConstraintPasteStrategyTest;
import org.eclipse.papyrus.uml.diagram.clazz.test.legacy.PackageDiagramLegacyTest;
import org.eclipse.papyrus.uml.diagram.clazz.test.tests.Bug382954_InstanceSpecificationLink;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * All tests together.
 */
@RunWith(Suite.class)
@SuiteClasses({
		// canonical
		AllCanonicalTests.class,
		TestClassDiagram.class,
		PackageDiagramLegacyTest.class,
		Bug382954_InstanceSpecificationLink.class,
		ConstraintPasteStrategyTest.class
// load
// LoadTests.class

})
public class AllTests {
}
