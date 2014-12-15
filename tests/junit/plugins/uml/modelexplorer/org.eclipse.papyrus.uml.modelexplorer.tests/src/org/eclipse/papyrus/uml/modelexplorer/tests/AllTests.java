/*******************************************************************************
 * Copyright (c) 2011, 2014 Mia-Software, CEA, and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *    Nicolas Guyomar (Mia-Software) - Bug 344413 - Facet Columns are never created when we begin with an empty table
 *    Nicolas Guyomar (Mia-Software) - Bug 344921 - Undo/Redo just after the creation of the table
 *    Nicolas Guyomar (Mia-Software) - Bug 346465 - [EMF Facet Table] Remove line does not remove obsolete column
 *    Gregoire Dupe (Mia-Software) - Bug 350700 - TableWidget: Wrong cell label in multi-valued facet reference columns
 *    Gregoire Dupe (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 *    Christian W. Damus (CEA) - bug 440795
 *    
 *******************************************************************************/
package org.eclipse.papyrus.uml.modelexplorer.tests;


import org.eclipse.papyrus.uml.modelexplorer.tests.paste.CopyPasteModelExplorerTest;
import org.eclipse.papyrus.uml.modelexplorer.tests.paste.CutPasteModelExplorerTest;
import org.eclipse.papyrus.uml.modelexplorer.tests.paste.DiagramCopyPasteModelExplorerTest;
import org.eclipse.papyrus.uml.modelexplorer.tests.paste.StereotypeCopyPasteModelExplorerTest;
import org.eclipse.papyrus.uml.modelexplorer.tests.paste.TableCopyPasteModelExplorerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ //
DeleteModelExplorerTest.class, RenameHandlerTest.class, ModelExplorerViewTests.class, CutPasteModelExplorerTest.class, CopyPasteModelExplorerTest.class, //
DiagramCopyPasteModelExplorerTest.class, TableCopyPasteModelExplorerTest.class, StereotypeCopyPasteModelExplorerTest.class, //
AdvancedModeTest.class })
public class AllTests {
	// JUnit for test suite
}
