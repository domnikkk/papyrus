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

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.uml2.uml.Profile;
import org.junit.Test;

import com.google.common.collect.ImmutableSet;

/**
 * Tests the externalization of profiles.
 */
@PluginResource("/resources/testmodel.di")
public class ControlModeWithDecoratorModelsTest extends AbstractDecoratorModelControlModeTest {

	public ControlModeWithDecoratorModelsTest() {
		super();
	}

	/**
	 * Scenario: control a package that has two decorator models currently unloaded.
	 */
	@Test
	public void control_allDecoratorsUnloaded() {
		// Control test (haha)
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(Collections.<URI> emptySet()));

		control(getPackage2_1(), "Package2_1");

		// We had to save because of the unloaded decorator models
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(set(getTestProfileURI())));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(set(getTestProfileURI(), getEcoreProfileURI())));

		loadDecoratorModel("package2");

		// these were refactored
		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getSessionLiteral()));

		unloadDecoratorModel("package2");
		loadDecoratorModel("package2.ecore");

		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getEntityLiteral()));
		assertThat(getClass2_1(), isApplied(getEClassStereotype()));
	}

	/**
	 * Scenario: control a package that has some decorator models currently loaded and some not.
	 */
	@Test
	public void control_someDecoratorsLoaded() {
		// Control test (haha)
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(Collections.<URI> emptySet()));

		loadDecoratorModel("package2.ecore");
		control(getPackage2_1(), "Package2_1");

		// We had to save because of the unloaded decorator model
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(set(getTestProfileURI())));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(set(getTestProfileURI(), getEcoreProfileURI())));

		// these were refactored
		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getEntityLiteral()));
		assertThat(getClass2_1(), isApplied(getEClassStereotype()));

		loadDecoratorModel("package2");

		unloadDecoratorModel("package2.ecore");
		loadDecoratorModel("package2");

		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getSessionLiteral()));
	}

	/**
	 * Scenario: control a package that has all decorator models currently loaded.
	 */
	@Test
	public void control_allDecoratorsLoaded() throws CoreException {
		deleteDecoratorModel("package2.ecore");

		// Control test (haha)
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));

		loadDecoratorModel("package2");
		control(getPackage2_1(), "Package2_1");

		// We did not have to save because of any unloaded decorator models
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(DecoratorModelUtils.getDecoratorModelAppliedProfiles(getPackage2_1()), hasItem(getTestProfile()));

		// these were refactored
		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getSessionLiteral()));
	}

	/**
	 * Scenario: control a package that has two decorator models currently unloaded, then undo and redo.
	 */
	@Test
	public void control_undo_redo_allDecoratorsUnloaded() {
		// Control test (haha)
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(Collections.<URI> emptySet()));

		control(getPackage2_1(), "Package2_1");

		// We had to save because of the unloaded decorator models
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(set(getTestProfileURI())));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(set(getTestProfileURI(), getEcoreProfileURI())));

		undo();

		// Once again, we have no direct profile applications
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(Collections.<URI> emptySet()));

		redo();

		// And they're back
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(set(getTestProfileURI())));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(set(getTestProfileURI(), getEcoreProfileURI())));

		loadDecoratorModel("package2.ecore");

		// these were refactored
		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getEntityLiteral()));
		assertThat(getClass2_1(), isApplied(getEClassStereotype()));
	}

	/**
	 * Scenario: control a package that has some decorator models currently loaded and some not, then undo and redo.
	 */
	@Test
	public void control_undo_redo_someDecoratorsLoaded() {
		// Control test (haha)
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(Collections.<URI> emptySet()));

		loadDecoratorModel("package2.ecore");
		control(getPackage2_1(), "Package2_1");

		// We had to save because of the unloaded decorator model
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(set(getTestProfileURI())));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(set(getTestProfileURI(), getEcoreProfileURI())));

		undo();

		// Once again, we have no direct profile applications
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(Collections.<URI> emptySet()));

		redo();

		// And they're back
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(set(getTestProfileURI())));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(set(getTestProfileURI(), getEcoreProfileURI())));

		// these were refactored
		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getEntityLiteral()));
		assertThat(getClass2_1(), isApplied(getEClassStereotype()));
	}

	/**
	 * Scenario: control a package that has all decorator models currently loaded, then undo and redo.
	 */
	@Test
	public void control_undo_redo_allDecoratorsLoaded() throws CoreException {
		deleteDecoratorModel("package2.ecore");

		// Control test (haha)
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));

		loadDecoratorModel("package2");
		control(getPackage2_1(), "Package2_1");

		// We did not have to save because of any unloaded decorator models
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(DecoratorModelUtils.getDecoratorModelAppliedProfiles(getPackage2_1()), hasItem(getTestProfile()));

		undo();

		// Once again, we have no direct profile application
		assertThat(ImmutableSet.copyOf(DecoratorModelUtils.getDecoratorModelAppliedProfiles(getPackage2_1())), is(Collections.<Profile> emptySet()));

		redo();

		// And it's back
		assertThat(DecoratorModelUtils.getDecoratorModelAppliedProfiles(getPackage2_1()), hasItem(getTestProfile()));

		// these were refactored
		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getSessionLiteral()));
	}

	/**
	 * Scenario: uncontrol a package that has two decorator models currently unloaded.
	 */
	@Test
	public void uncontrol_allDecoratorsUnloaded() {
		control(getPackage2_1(), "Package2_1");

		// Control test (haha)
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(set(getTestProfileURI())));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(set(getTestProfileURI(), getEcoreProfileURI())));

		uncontrol(getPackage2_1());

		// The external profile applications are gone
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(Collections.<URI> emptySet()));

		loadDecoratorModel("package2");

		// these were refactored
		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getSessionLiteral()));

		unloadDecoratorModel("package2");
		loadDecoratorModel("package2.ecore");

		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getEntityLiteral()));
		assertThat(getClass2_1(), isApplied(getEClassStereotype()));
	}

	/**
	 * Scenario: uncontrol a package that has some decorator models currently loaded and some not.
	 */
	@Test
	public void uncontrol_someDecoratorsLoaded() {
		loadDecoratorModel("package2.ecore");
		control(getPackage2_1(), "Package2_1");

		// Control test (haha)
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(set(getTestProfileURI())));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(set(getTestProfileURI(), getEcoreProfileURI())));

		uncontrol(getPackage2_1());

		// The external profile applications are gone
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(Collections.<URI> emptySet()));

		// these were refactored
		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getEntityLiteral()));
		assertThat(getClass2_1(), isApplied(getEClassStereotype()));

		loadDecoratorModel("package2");

		unloadDecoratorModel("package2.ecore");
		loadDecoratorModel("package2");

		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getSessionLiteral()));
	}

	/**
	 * Scenario: uncontrol a package that has all decorator models currently loaded.
	 */
	@Test
	public void uncontrol_allDecoratorsLoaded() throws CoreException {
		deleteDecoratorModel("package2.ecore");
		loadDecoratorModel("package2");
		control(getPackage2_1(), "Package2_1");

		// Control test (haha)
		assertThat(DecoratorModelUtils.getDecoratorModelAppliedProfiles(getPackage2_1()), hasItem(getTestProfile()));

		uncontrol(getPackage2_1());

		// The external profile application is gone
		assertThat(ImmutableSet.copyOf(DecoratorModelUtils.getDecoratorModelAppliedProfiles(getPackage2_1())), is(Collections.<Profile> emptySet()));

		// these were refactored
		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getSessionLiteral()));
	}

	/**
	 * Scenario: uncontrol a package that has two decorator models currently unloaded, then undo and redo.
	 */
	@Test
	public void uncontrol_undo_redo_allDecoratorsUnloaded() {
		control(getPackage2_1(), "Package2_1");
		uncontrol(getPackage2_1());

		// Control test (haha)
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(Collections.<URI> emptySet()));

		undo();

		// And they're back
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(set(getTestProfileURI())));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(set(getTestProfileURI(), getEcoreProfileURI())));

		redo();

		// And they're gone again
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(Collections.<URI> emptySet()));

		loadDecoratorModel("package2");

		// these were refactored
		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getSessionLiteral()));

		unloadDecoratorModel("package2");
		loadDecoratorModel("package2.ecore");

		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getEntityLiteral()));
		assertThat(getClass2_1(), isApplied(getEClassStereotype()));
	}

	/**
	 * Scenario: uncontrol a package that has some decorator models currently loaded and some not, then undo and redo.
	 */
	@Test
	public void uncontrol_undo_redo_someDecoratorsLoaded() {
		loadDecoratorModel("package2.ecore");
		control(getPackage2_1(), "Package2_1");
		uncontrol(getPackage2_1());

		// Control test (haha)
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(Collections.<URI> emptySet()));

		undo();

		// And they're back
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(set(getTestProfileURI())));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(set(getTestProfileURI(), getEcoreProfileURI())));

		redo();

		// And they're gone again
		assertThat(getExternalProfiles(getPackage2_1(), "package2"), is(Collections.<URI> emptySet()));
		assertThat(getExternalProfiles(getPackage2_1(), "package2.ecore"), is(Collections.<URI> emptySet()));

		loadDecoratorModel("package2");

		unloadDecoratorModel("package2.ecore");
		loadDecoratorModel("package2");

		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getSessionLiteral()));
	}

	/**
	 * Scenario: uncontrol a package that has all decorator models currently loaded, then undo and redo.
	 */
	@Test
	public void uncontrol_undo_redo_allDecoratorsLoaded() throws CoreException {
		deleteDecoratorModel("package2.ecore");
		loadDecoratorModel("package2");
		control(getPackage2_1(), "Package2_1");
		uncontrol(getPackage2_1());

		// Control test (haha)
		assertThat(ImmutableSet.copyOf(DecoratorModelUtils.getDecoratorModelAppliedProfiles(getPackage2_1())), is(Collections.<Profile> emptySet()));

		undo();

		// And it's back
		assertThat(DecoratorModelUtils.getDecoratorModelAppliedProfiles(getPackage2_1()), hasItem(getTestProfile()));

		redo();

		// And it's gone again
		assertThat(ImmutableSet.copyOf(DecoratorModelUtils.getDecoratorModelAppliedProfiles(getPackage2_1())), is(Collections.<Profile> emptySet()));

		// these were refactored
		assertThat(getClass2_1(), isApplied(getBeanStereotype()));
		assertThat(getClass2_1().getValue(getBeanStereotype(), "kind"), is((Object) getSessionLiteral()));
	}
}
