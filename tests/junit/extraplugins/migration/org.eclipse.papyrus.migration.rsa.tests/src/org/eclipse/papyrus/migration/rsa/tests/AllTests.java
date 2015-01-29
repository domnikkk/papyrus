/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Thibault Le Ouay (Sherpa Engineering) t.leouay@sherpa-eng.com - Initial API and implementation
 * 	Camille Letavernier (CEA LIST) camille.letavernier@cea.fr
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.tests;

import org.eclipse.papyrus.migration.rsa.concurrent.ThreadSafeResourceSet;
import org.eclipse.papyrus.migration.rsa.tests.qvt.BatchImportTest;
import org.eclipse.papyrus.migration.rsa.tests.qvt.ImportDiagramTest;
import org.eclipse.papyrus.migration.rsa.tests.qvt.ImportModelsTest;
import org.eclipse.papyrus.migration.rsa.tests.qvt.ImportProfilesTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({ ImportDiagramTest.class, ImportModelsTest.class, BatchImportTest.class, ImportProfilesTest.class, ThreadSafeResourceSet.class })
public class AllTests {
	// Test suite
}
