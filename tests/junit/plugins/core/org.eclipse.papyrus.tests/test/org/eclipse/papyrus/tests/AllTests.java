/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bugs 402525, 323802, 431953, 433310, 434993
 *  Christian W. Damus - bug 399859
 *
 *****************************************************************************/
package org.eclipse.papyrus.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.eclipse.papyrus.junit.framework.classification.ClassificationConfig;
import org.eclipse.papyrus.junit.framework.classification.TestCategory;
import org.eclipse.papyrus.tests.launcher.FragmentTestSuiteClass;
import org.eclipse.papyrus.tests.launcher.ITestSuiteClass;
import org.eclipse.papyrus.tests.launcher.PluginTestSuiteClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;


/**
 * Test class for all tests for Papyrus
 */
@RunWith(AllTests.AllTestsRunner.class)
public class AllTests {

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
		/* developper */
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.bundles.tests.AllTests.class));

		/* core */
		suiteClasses.add(new FragmentTestSuiteClass(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID, "org.eclipse.papyrus.infra.core.tests.AllTests"));
		suiteClasses.add(new FragmentTestSuiteClass(org.eclipse.papyrus.infra.core.sasheditor.Activator.PLUGIN_ID, "org.eclipse.papyrus.infra.core.sasheditor.tests.AllTests"));
		suiteClasses.add(new FragmentTestSuiteClass("org.eclipse.papyrus.infra.core.sasheditor.di", "org.eclipse.papyrus.infra.core.sasheditor.di.tests.AllTests"));

		/* infra */
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.infra.tools.tests.AllTests.class));
		suiteClasses.add(new FragmentTestSuiteClass(org.eclipse.papyrus.infra.services.edit.Activator.PLUGIN_ID, "org.eclipse.papyrus.infra.services.edit.tests.suites.AllTests"));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.infra.services.labelprovider.tests.AllTests.class));
		suiteClasses.add(new FragmentTestSuiteClass(org.eclipse.papyrus.infra.emf.Activator.PLUGIN_ID, "org.eclipse.papyrus.infra.emf.tests.AllTests"));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.infra.extendedtypes.tests.AllTests.class));
		// suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.infra.services.openelement.tests.AllTests.class));
		suiteClasses.add(new FragmentTestSuiteClass(org.eclipse.papyrus.commands.Activator.PLUGIN_ID, "org.eclipse.papyrus.infra.gmfdiag.commands.tests.AllTests"));
		suiteClasses.add(new FragmentTestSuiteClass(org.eclipse.papyrus.infra.gmfdiag.common.Activator.ID, "org.eclipse.papyrus.infra.gmfdiag.common.tests.AllTests"));
		suiteClasses.add(new FragmentTestSuiteClass(org.eclipse.papyrus.infra.emf.readonly.Activator.PLUGIN_ID, "org.eclipse.papyrus.infra.emf.readonly.tests.AllTests"));

		/* views */
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.views.modelexplorer.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.customization.properties.tests.AllTests.class));

		/* integration */
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.editor.integration.tests.AllTests.class));

		// FIXME: Workaround for Bug 441246: Move the ResourceLoading tests after EditorReloadTest, since they are currently conflicting
		suiteClasses.add(new FragmentTestSuiteClass(org.eclipse.papyrus.infra.services.resourceloading.Activator.PLUGIN_ID, "org.eclipse.papyrus.infra.services.resourceloading.tests.AllTests"));

		/* search */
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.search.tests.suites.AllTests.class));

		/* css */
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.infra.gmfdiag.css.tests.tests.AllTests.class));

		/* menu */
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.infra.gmfdiag.menu.tests.tests.AllTests.class));

		/* control mode */
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.infra.services.controlmode.tests.AllTests.class));

		if (System.getProperty("no.SysML.tests") == null) {
			// SysML tests
			suiteClasses.addAll(AllSysMLTests.suiteClasses);
		}

		/* uml */
		suiteClasses.add(new FragmentTestSuiteClass(org.eclipse.papyrus.uml.service.types.Activator.PLUGIN_ID, "org.eclipse.papyrus.uml.service.types.tests.suites.AllTests"));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.modelexplorer.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.dnd.tests.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.tools.tests.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.tools.utils.tests.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.stereotypeproperty.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.wizards.AllTests.class));
		suiteClasses.add(new FragmentTestSuiteClass(org.eclipse.papyrus.uml.modelrepair.Activator.PLUGIN_ID, "org.eclipse.papyrus.uml.modelrepair.tests.AllTests"));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.decoratormodel.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.decoratormodel.controlmode.tests.AllTests.class));

		/* uml diagrams */
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.common.tests.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.clazz.test.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.activity.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.deployment.test.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.component.test.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.timing.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.usecase.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.composite.test.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.statemachine.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.communication.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.profile.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.sequence.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.diagram.interactionoverview.tests.AllTests.class));
		//

		// nattable tests
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.infra.nattable.views.tests.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.infra.nattable.model.editor.tests.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.infra.nattable.model.tests.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.infra.nattable.tests.tests.AllTests.class));

		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.nattable.tests.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.nattable.generic.tests.tests.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.nattable.clazz.config.tests.tests.AllTests.class));
		
		// uml textedit tests
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.textedit.port.tests.suites.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.textedit.property.tests.suites.AllTests.class));
		suiteClasses.add(new PluginTestSuiteClass(org.eclipse.papyrus.uml.textedit.parameter.tests.suites.AllTests.class));

		// end
	}

	/**
	 * Finds and runs tests.
	 */
	public static class AllTestsRunner extends Suite {

		/**
		 * Constructor.
		 *
		 * @param clazz
		 *            the suite class � AllTests2
		 * @throws InitializationError
		 *             if there's a problem
		 * @throws org.junit.runners.model.InitializationError
		 */
		public AllTestsRunner(final Class<?> clazz) throws InitializationError {
			super(clazz, getSuites());

			for (String arg : Platform.getApplicationArgs()) {
				if (arg.contains("-testConfig=")) {
					String configName = arg.substring("-testConfig=".length());
					Set<TestCategory> testsConfig = availableConfigs.get(configName);
					if (testsConfig != null) {
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
		for (final ITestSuiteClass testSuiteClass : suiteClasses) {
			final Class<?> class_ = testSuiteClass.getMainTestSuiteClass();
			if (class_ != null) {
				suites.add(class_);
			} else {
				System.err.println(testSuiteClass + " does not give a correct test suite class");
			}
		}
		return suites.toArray(new Class<?>[] {});
	}

}
