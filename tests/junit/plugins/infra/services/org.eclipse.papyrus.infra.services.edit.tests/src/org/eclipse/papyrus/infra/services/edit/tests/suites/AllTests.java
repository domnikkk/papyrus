/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 
 *   Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *   Christian W. Damus (CEA) - bug 431618
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.services.edit.tests.suites;

import org.eclipse.papyrus.infra.services.edit.tests.commands.TestConfigureFeatureCommandFactory;
import org.eclipse.papyrus.infra.services.edit.tests.commands.TestConfigureFeatureListCommandFactory;
import org.eclipse.papyrus.infra.services.edit.tests.context.TestClientContext;
import org.eclipse.papyrus.infra.services.edit.tests.edit.advice.MarkerDeletionAdviceTest;
import org.eclipse.papyrus.infra.services.edit.tests.service.TestElementEditService;
import org.eclipse.papyrus.infra.services.edit.tests.service.TestElementEditServiceProvider;
import org.eclipse.papyrus.infra.services.edit.tests.service.TestElementEditServiceProviderFactory;
import org.eclipse.papyrus.infra.services.edit.tests.service.TestElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.tests.utils.TestElementTypeValidator;
import org.eclipse.papyrus.infra.services.edit.tests.utils.TestGMFCommandUtils;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Main Test suite.
 */
@RunWith(Suite.class)
@SuiteClasses({ 
	TestClientContext.class,
	TestElementEditService.class,
	TestElementEditServiceProvider.class,
	TestElementEditServiceProviderFactory.class,
	TestElementEditServiceUtils.class,
	TestElementTypeValidator.class,
	TestGMFCommandUtils.class,
	TestConfigureFeatureCommandFactory.class,
	TestConfigureFeatureListCommandFactory.class,
	MarkerDeletionAdviceTest.class
})
public class AllTests {

}
