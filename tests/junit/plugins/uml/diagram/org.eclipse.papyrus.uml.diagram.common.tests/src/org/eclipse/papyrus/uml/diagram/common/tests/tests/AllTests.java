/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.tests.tests;


import org.eclipse.papyrus.uml.diagram.common.tests.css.Bug431694_UndoDeleteTest;
import org.eclipse.papyrus.uml.diagram.common.tests.parser.HTMLCleanerTestCase;
import org.eclipse.papyrus.uml.diagram.common.tests.parser.HTMLCornerBentFigureTestCase;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CommonBendpointsTest.class ,HTMLCleanerTestCase.class, HTMLCornerBentFigureTestCase.class, Bug431694_UndoDeleteTest.class})
public class AllTests {
	// JUnit 4 test suite
}
