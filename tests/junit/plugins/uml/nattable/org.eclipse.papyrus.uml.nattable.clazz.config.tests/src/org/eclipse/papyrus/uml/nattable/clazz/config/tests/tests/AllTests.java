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
 *  Quentin Le Menez (CEA LIST) quentin.lemenez@cea.fr
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.nattable.clazz.config.tests.tests;

import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_Empty_H1_H1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_Empty_H1_V1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_Empty_H3_V1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_Empty_V3_H1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_Empty_V3_V1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_H1_H1_H1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_H1_H1_V1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_H1_H3_H1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_H1_V3_H1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_H1_V3_V1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_V1_H1_H1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_V1_H1_V1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_V1_V3_H1_MultiColumns_Test;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.paste.tests.PasteWithCategories_V1_V3_V1_MultiColumns_Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
		OpenTableTest.class,
		ContentsAndExpandWithCategories_0_1_2_Tests.class,
		PasteWithCategories_Empty_H1_H1_MultiColumns_Test.class,
		PasteWithCategories_Empty_H1_V1_MultiColumns_Test.class,
		PasteWithCategories_Empty_H3_V1_MultiColumns_Test.class,
		PasteWithCategories_Empty_V3_H1_MultiColumns_Test.class,
		PasteWithCategories_Empty_V3_V1_MultiColumns_Test.class,

		PasteWithCategories_H1_H1_H1_MultiColumns_Test.class,
		PasteWithCategories_H1_H1_V1_MultiColumns_Test.class,
		PasteWithCategories_H1_H3_H1_MultiColumns_Test.class,
		PasteWithCategories_H1_V3_H1_MultiColumns_Test.class,
		PasteWithCategories_H1_V3_V1_MultiColumns_Test.class,

		PasteWithCategories_V1_H1_H1_MultiColumns_Test.class,
		PasteWithCategories_V1_H1_V1_MultiColumns_Test.class,
		PasteWithCategories_V1_V3_H1_MultiColumns_Test.class,


		PasteWithCategories_V1_V3_V1_MultiColumns_Test.class, })
public class AllTests {
	// JUnit 4 test suite

}
