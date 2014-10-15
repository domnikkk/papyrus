/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Juan Cadavid - juan.cadavid@cea.fr
 *
 *****************************************************************************/
package org.eclipse.papyrus.tests.generated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.eclipse.papyrus.junit.framework.classification.ClassificationConfig;
import org.eclipse.papyrus.junit.framework.classification.TestCategory;
import org.eclipse.papyrus.tests.generated.launcher.ITestSuiteClass;
import org.eclipse.papyrus.tests.generated.launcher.PluginTestSuiteClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;


/**
 * Tests generated with the Papyrus Test Generation Framework
 */
@RunWith(AllGenTests.AllTestsRunner.class)
public class AllGenTests {

	static Map<String, Set<TestCategory>> availableConfigs = new HashMap<String, Set<TestCategory>>();

	static {
		availableConfigs.put("CI_TESTS_CONFIG", ClassificationConfig.CI_TESTS_CONFIG);
		availableConfigs.put("FAILING_TESTS_CONFIG", ClassificationConfig.FAILING_TESTS_CONFIG);
		availableConfigs.put("FULL_CI_TESTS_CONFIG", ClassificationConfig.FULL_CI_TESTS_CONFIG);
		availableConfigs.put("FULL_TESTS_CONFIG", ClassificationConfig.FULL_TESTS_CONFIG);
		availableConfigs.put("LIGTHWEIGHT_TESTS_CONFIG", ClassificationConfig.LIGTHWEIGHT_TESTS_CONFIG);
	}

	public static final List<ITestSuiteClass> suiteClasses;
	/** list of classes to launch */
	static {
		suiteClasses = new ArrayList<ITestSuiteClass>();

		
		
		/* **************** plugins *********************** */
		
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.activity.test.AllGenTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.clazz.test.AllGenTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.component.test.AllGenTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.composite.test.AllGenTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.timing.test.AllGenTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.usecase.test.AllGenTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.deployment.test.AllGenTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.profile.tests.AllGenTests.class));
		//end
	}

	/**
	 * Finds and runs tests.
	 */
	public static class AllTestsRunner extends Suite {

		/**
		 * Constructor.
		 *
		 * @param clazz
		 *        the suite class � AllTests2
		 * @throws InitializationError
		 *         if there's a problem
		 * @throws org.junit.runners.model.InitializationError
		 */
		public AllTestsRunner(final Class<?> clazz) throws InitializationError {
			super(clazz, getSuites());

			for(String arg : Platform.getApplicationArgs()) {
				if(arg.contains("-testConfig=")) {
					String configName = arg.substring("-testConfig=".length());
					Set<TestCategory> testsConfig = availableConfigs.get(configName);
					if(testsConfig != null) {
						ClassificationConfig.setTestsConfiguration(testsConfig);
					}
					break;
				}
			}
		}
	}

	/**
	 * Returns the list of test classes
	 *
	 * @return the list of test classes
	 */
	private static Class<?>[] getSuites() {
		// retrieve all test suites.
		final Collection<Class<?>> suites = new ArrayList<Class<?>>();
		for(final ITestSuiteClass testSuiteClass : suiteClasses) {
			final Class<?> class_ = testSuiteClass.getMainTestSuiteClass();
			if(class_ != null) {
				suites.add(class_);
			} else {
				System.err.println(testSuiteClass + " does not give a correct test suite class");
			}
		}
		return suites.toArray(new Class<?>[]{});
	}

}
