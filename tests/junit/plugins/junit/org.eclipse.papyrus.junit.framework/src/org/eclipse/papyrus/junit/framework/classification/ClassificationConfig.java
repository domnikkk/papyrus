/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.junit.framework.classification;

import static org.eclipse.papyrus.junit.framework.classification.TestCategory.ExpensiveTest;
import static org.eclipse.papyrus.junit.framework.classification.TestCategory.FailingTest;
import static org.eclipse.papyrus.junit.framework.classification.TestCategory.InteractiveTest;
import static org.eclipse.papyrus.junit.framework.classification.TestCategory.InvalidTest;
import static org.eclipse.papyrus.junit.framework.classification.TestCategory.GeneratedTest;
import static org.eclipse.papyrus.junit.framework.classification.TestCategory.NotImplemented;
import static org.eclipse.papyrus.junit.framework.classification.TestCategory.Standard;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.papyrus.infra.tools.util.ListHelper;

import com.google.common.collect.ImmutableSet;


/**
 * This class is used to configure the Classification Annotations which should be
 * excluded from a test job.
 *
 * Usage:
 *
 * ClassificationConfig.setExcludedTestCategories(TestCategory.InvalidTest, TestCategory.NotImplemented);
 *
 * or
 *
 * ClassificationConfig.setIncludedTestCategories(TestCategory.Standard, TestCategory.NotImplemented);
 *
 * @author Camille Letavernier
 *
 * @see {@link TestCategory}
 * @see {@link ClassificationRunner}
 *
 */
public class ClassificationConfig {

	public static final Set<TestCategory> excludedTestCategories = new HashSet<TestCategory>();

	/**
	 * Default tests configuration for Continuous Integration (Hudson): Excludes the tests which are
	 * identified as failing, as well as the interactive tests
	 *
	 * This configuration may require a couple of hours to run
	 */
	public static final Set<TestCategory> CI_TESTS_CONFIG = ImmutableSet.copyOf(new TestCategory[]{ NotImplemented, InvalidTest, FailingTest, InteractiveTest });

	/**
	 * This tests configuration runs all tests which are already identified as failing.
	 * If one test from this configuration passes, this might mean that the annotation should be removed
	 *
	 * InteractiveTests are excluded as well, as this configuration is supposed to be executed on Hudson
	 */
	public static final Set<TestCategory> FAILING_TESTS_CONFIG = ImmutableSet.copyOf(new TestCategory[]{ Standard, InteractiveTest });

	/**
	 * This tests configuration is expected to run in ~15 minutes. This is useful for quick testing,
	 * and validation through Gerrit
	 */
	public static final Set<TestCategory> LIGTHWEIGHT_TESTS_CONFIG = ImmutableSet.copyOf(new TestCategory[]{ InteractiveTest, NotImplemented, FailingTest, InvalidTest, ExpensiveTest });

	/**
	 * This tests configuration is expected to run in ~15 minutes. This is useful for quick testing,
	 * and validation through Gerrit
	 */
	public static final Set<TestCategory> GENERATED_TESTS_CONFIG = ImmutableSet.copyOf(new TestCategory[]{ GeneratedTest });

	/**
	 * This tests configuration is meant to execute all tests in an automated environment
	 * It includes all tests which are known to be failing, but excludes tests which
	 * require a user interaction
	 */
	public static final Set<TestCategory> FULL_CI_TESTS_CONFIG = ImmutableSet.copyOf(new TestCategory[]{ InteractiveTest });

	/**
	 * Executes all tests
	 */
	public static final Set<TestCategory> FULL_TESTS_CONFIG = Collections.emptySet();

	static {
		//Default on Hudson: exclude everything which is already identified as an issue (i.e. is not a (new) regression)
		setTestsConfiguration(CI_TESTS_CONFIG);

		//Check whether identified regressions are still failing
		//setIncludedTestCategories(FailingTest);
	}

	//Same as setExcludedTestsCategories, but renamed for clarity (To be used with predefined configurations)
	public static void setTestsConfiguration(Set<TestCategory> predefinedConfiguration) {
		setExcludedTestCategories(predefinedConfiguration);
	}

	/**
	 * Define the test categories which should be excluded from the TestSuite
	 *
	 * @param categoriesToInclude
	 */
	public static void setExcludedTestCategories(TestCategory... categories) {
		setExcludedTestCategories(Arrays.asList(categories));
	}

	/**
	 * Define the test categories which should be included in the TestSuite
	 *
	 * @param categoriesToInclude
	 */
	public static void setIncludedTestCategories(TestCategory... categories) {
		setIncludedTestCategories(Arrays.asList(categories));
	}

	/**
	 * Define the test categories which should be excluded from the TestSuite
	 *
	 * @param categoriesToInclude
	 */
	public static void setExcludedTestCategories(Collection<TestCategory> categoriesToExclude) {
		excludedTestCategories.clear();
		excludedTestCategories.addAll(categoriesToExclude);
	}

	/**
	 * Define the test categories which should be included in the TestSuite
	 *
	 * @param categoriesToInclude
	 */
	public static void setIncludedTestCategories(Collection<TestCategory> categoriesToInclude) {
		excludedTestCategories.clear();
		List<TestCategory> categoriesToExclude = ListHelper.asList(TestCategory.values());
		categoriesToExclude.removeAll(categoriesToInclude);
		excludedTestCategories.addAll(categoriesToExclude);
	}

	/**
	 * Tests whether a method containing the given set of Annotations should be executed
	 *
	 * @param annotations
	 *        The annotations applied to the Method
	 * @return
	 *         True if the test method should be executed, false if it should be ignored
	 */
	public static boolean shouldRun(Annotation[] annotations) {
		for(Annotation annotation : annotations) {
			Class<? extends Annotation> annotationClass = annotation.annotationType();
			if(isExcluded(annotationClass)) {
				return false;
			}
		}

		if(excludedTestCategories.contains(TestCategory.Standard)) {
			for(TestCategory testCategory : TestCategory.values()) {
				if(testCategory == TestCategory.Standard) {
					continue;
				}

				for(Annotation annotation : annotations) {
					if(testCategory.match(annotation.annotationType())) {
						return true;
					}
				}
			}

			return false;
		}

		return true;
	}

	/**
	 * Tests whether the given Annotation should be excluded
	 *
	 * @param annotationClass
	 * @return
	 */
	public static boolean isExcluded(Class<? extends Annotation> annotationClass) {
		for(TestCategory testCategory : excludedTestCategories) {
			if(testCategory.match(annotationClass)) {
				return true;
			}
		}

		return false;
	}

}
