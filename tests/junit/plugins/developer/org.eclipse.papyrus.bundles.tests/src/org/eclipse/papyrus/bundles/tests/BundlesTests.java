/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) Vincent.Lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.bundles.tests;

import java.net.URL;
import java.util.Enumeration;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.Assert;
import org.eclipse.osgi.framework.internal.core.BundleFragment;
import org.eclipse.osgi.util.NLS;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class BundlesTests {

	/**
	 * Tests that all Papyrus Bundle name are finished by {@link #INCUBATION}
	 */
	@Test
	public void incubationTest() {
		testManifestProperty(BundleTestsUtils.BUNDLE_NAME, ".*\\(Incubation\\)", false); //$NON-NLS-1$
	}

	/**
	 * Tests the provider name (should be EL
	 */
	@Test
	public void vendorTest() {
		testManifestProperty(BundleTestsUtils.BUNDLE_VENDOR, BundleTestsUtils.VENDOR_NAME, false);
	}

	/**
	 * Tests that each papyrus plugins have the correct version
	 */
	@Test
	public void versionTest() {
		testManifestProperty(BundleTestsUtils.BUNDLE_VERSION, "0\\.9\\.0\\..*", false); //$NON-NLS-1$
	}

	/**
	 * Tests if the file about.html is included to the plugin
	 */
	@Test
	public void aboutTest() {
		fileTest("/about.html"); //$NON-NLS-1$
	}

	/**
	 * Tests the java version
	 */
	@Test
	public void javaVersionTest() {
		testManifestProperty(BundleTestsUtils.BUNDLE_REQUIREDEXECUTIONENVIRONMENT, BundleTestsUtils.JAVA_VERSION_5, false); //$NON-NLS-1$
	}

	/**
	 * Tests that we don't use import package
	 */
	@Test
	public void importPackage() {
		testManifestProperty(BundleTestsUtils.BUNDLE_IMPORT_PACKAGE, "", true); //$NON-NLS-1$
	}

	/**
	 * This test verify that we doesn't re-export dependencies
	 */
	@Test
	public void reexportDependencies() {
		String message = null;
		int nb = 0;
		for(Bundle current : BundleTestsUtils.getPapyrusBundles()) {
			final String value = (String)current.getHeaders().get(BundleTestsUtils.REQUIRE_BUNDLE);
			String[] bundles = value.split(","); //$NON-NLS-1$
			String localMessage = null;
			for(String bundle : bundles) {
				if(bundle.contains("visibility:=reexport")) { //$NON-NLS-1$
					nb++;
					if(localMessage == null) {
						localMessage = NLS.bind("{0} re-exports:", current.getSymbolicName()); //$NON-NLS-1$
					}
					localMessage += NLS.bind("\n  - {0}", bundle.substring(0, bundle.indexOf(";"))); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
			if(localMessage != null) {
				if(message == null) {
					message = "";
				}
				message += localMessage + "\n"; //$NON-NLS-1$
			}
		}
		Assert.isTrue(message == null, nb + " problems! " + message); //$NON-NLS-1$
	}

	/**
	 * Tests if a the value of a property in the Manifest is correct
	 * 
	 * @param property
	 *        the property to test
	 * @param regex
	 *        the regular expression to test the property
	 * @param mustBeNull
	 *        indicates that the value for the property must be <code>null</code>
	 */
	private void testManifestProperty(final String property, final String regex, boolean mustBeNull) {
		String message = null;
		int nb = 0;
		for(Bundle current : BundleTestsUtils.getPapyrusBundles()) {
			final String value = (String)current.getHeaders().get(property);
			boolean result = false;
			if(mustBeNull) {
				result = (value == null);
			} else if(value != null) {
				result = value.matches(regex);
			}
			if(!result) {
				if(message == null) {
					message = "Wrong " + property + " for :"; //$NON-NLS-1$ //$NON-NLS-2$
				}
				message += "\n "; //$NON-NLS-1$
				message += current.getSymbolicName();
				nb++;
			}
		}
		Assert.isTrue(message == null, nb + " problems! " + message); //$NON-NLS-1$
	}

	/**
	 * Tests if the file is owned by the bundle
	 * 
	 * @param filepath
	 *        the file path
	 */
	private void fileTest(final String filepath) {
		String message = null;
		int nb = 0;
		for(Bundle current : BundleTestsUtils.getPapyrusBundles()) {
			URL url = current.getResource(filepath);
			//specific behavior for the fragment!
			if(url == null && current instanceof BundleFragment) {
				BundleFragment fragment = (BundleFragment)current;
				Enumeration<URL> entries = fragment.findEntries("/", filepath, false); //$NON-NLS-1$
				if(entries != null) {
					if(entries.hasMoreElements()) {
						url = entries.nextElement();
					}
				}
			}

			if(url == null) {
				if(message == null) {
					message = "The following bundles don't have the file about.html :"; //$NON-NLS-1$
				}
				message += "\n "; //$NON-NLS-1$
				message += current.getSymbolicName();
				nb++;
			}
		}
		Assert.isTrue(message == null, nb + " problems!" + message); //$NON-NLS-1$
	}

}
