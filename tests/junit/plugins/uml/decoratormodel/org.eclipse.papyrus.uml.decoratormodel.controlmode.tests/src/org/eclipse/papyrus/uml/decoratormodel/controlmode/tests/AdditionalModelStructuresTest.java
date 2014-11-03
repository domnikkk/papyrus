/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.controlmode.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.junit.Test;

/**
 * Tests the externalization of profiles.
 */
@PluginResource("/resources/testmodel.di")
public class AdditionalModelStructuresTest extends AbstractDecoratorModelControlModeTest {

	public AdditionalModelStructuresTest() {
		super();
	}

	/**
	 * Scenario: control a package in which the externalized profile application has a stereotype application
	 * with a one-to-many reference to model elements that needs refactoring.
	 */
	@Test
	public void nonBaseElementStereotypeCrossReferences() {
		// Add some cross-references from a multi-value stereotype property to elements in the model.
		execute(new Runnable() {

			@Override
			public void run() {
				Resource decorator = loadDecoratorModel("package2");

				Class bean = getClass2_1();
				Property name = bean.createOwnedAttribute("name", null);
				Property address = bean.createOwnedAttribute("address", null);

				@SuppressWarnings("unchecked")
				EList<EObject> keys = (EList<EObject>) bean.getValue(getBeanStereotype(), "key");
				keys.add(name);
				keys.add(address);

				try {
					decorator.save(null);
				} catch (IOException e) {
					e.printStackTrace();
					fail("Failed to save test decorator model: " + e.getLocalizedMessage());
				}

				unloadDecoratorModel("package2");
			}
		});

		control(getPackage2_1(), "Package2_1");

		Property name = getClass2_1().getOwnedAttribute("name", null);
		Property address = getClass2_1().getOwnedAttribute("address", null);

		loadDecoratorModel("package2");

		// these were refactored
		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "key"), is((Object) Arrays.asList(name, address)));
	}

	/**
	 * Scenario: control a package that contains nested packages, which all inherit profile applications
	 * from the parent unit. Verify that only the root package of the new unit copies externalized
	 * profile applications.
	 */
	@Test
	public void nestedPackagesInheritingExternalProfileApplications() {
		// Add some cross-references from a multi-value stereotype property to elements in the model.
		execute(new Runnable() {

			@Override
			public void run() {
				getPackage2_1().createNestedPackage("package2_1_1");
				getPackage2_1().createNestedPackage("package2_1_2").createNestedPackage("2_1_2_1");
			}
		});

		save();

		control(getPackage2_1(), "Package2_1");

		Package package2_1_1 = getPackage2_1().getNestedPackage("package2_1_1");
		Package package2_1_2 = getPackage2_1().getNestedPackage("package2_1_2");
		Package package2_1_2_1 = getPackage2_1().getNestedPackage("package2_1_2_1");

		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(set(getTestProfileURI())));

		// These inherited the externalized profile application from Package2_1
		assertThat(getExternalProfiles(package2_1_1, "package2_1"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(package2_1_2, "package2_1"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(package2_1_2_1, "package2_1"), is(Collections.<URI> emptySet()));
	}
}
