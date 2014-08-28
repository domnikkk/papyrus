/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.uml.modelrepair.internal.stereotypes;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.papyrus.infra.core.utils.TransactionHelper;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.rules.ModelSetFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.google.common.base.Function;


/**
 * Specific bug regression tests for the {@link StereotypeApplicationRepairSnippet} class and its dependencies.
 */
public class StereotypeRepairRegressionTest extends AbstractPapyrusTest {

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	@Rule
	public final ModelSetFixture modelSet = new ModelSetFixture();

	private StereotypeApplicationRepairSnippet fixture;

	private ZombieStereotypesDescriptor zombies;

	private Package model;

	public StereotypeRepairRegressionTest() {
		super();
	}

	/**
	 * Tests that a scenario involving nested profiles and profile applications in nested packages that are all actually
	 * well-formed does not trigger the repair function.
	 * 
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=434302
	 */
	@Test
	@PluginResource("/resources/regression/bug434302/nested-profiles.uml")
	public void nestedProfilesAndNestedApplicationsWellFormed_bug434302() {
		assertThat("Should not have found zombie stereotypes", zombies, nullValue());
	}

	/**
	 * Tests that a scenario involving a nested profile gone AWOL in profile applications in a nested packages is
	 * correctly repaired.
	 * 
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=434302
	 */
	@Test
	@PluginResource("/resources/regression/bug434302/nested-profiles-nonamespace.uml")
	public void nestedProfileApplicationsMissingNamespace_bug434302() {
		EPackage schema = getOnlyZombieSchema();
		IRepairAction action = zombies.getSuggestedRepairAction(schema);
		assertThat("Wrong suggested repair action", action.kind(), is(IRepairAction.Kind.APPLY_LATEST_PROFILE_DEFINITION));

		repair(schema, action);

		assertThat("Profile was applied to root package", model.getAppliedProfile("Profile::Nested2"), nullValue());

		Package nested = model.getNestedPackage("Package2");
		Profile profile = nested.getAppliedProfile("Profile::Nested2");
		ProfileApplication application = nested.getProfileApplication(profile);
		assertThat("Profile was not re-applied to nested package", application.getAppliedDefinition(), is(profile.getDefinition()));

		// Verify the stereotype instance that was migrated
		Stereotype stereo = profile.getOwnedStereotype("Stereo2");
		Class class2 = (Class)nested.getOwnedType("Class2");
		Property class1 = class2.getAttribute("class1", null);
		assertThat(class1.getValue(stereo, "weight"), is((Object)15));
	}

	/**
	 * Tests that a scenario involving a single nested profile schema declaration gone AWOL in two different profile applications
	 * in two different nested packages is correctly repaired.
	 * 
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=434302
	 */
	@Test
	@PluginResource("/resources/regression/bug434302/nested-profiles-2pkgs1profile.uml")
	public void nestedProfileApplications2Pkgs1Profile_bug434302() {
		EPackage schema = getOnlyZombieSchema();
		IRepairAction action = zombies.getSuggestedRepairAction(schema);
		assertThat("Wrong suggested repair action", action.kind(), is(IRepairAction.Kind.APPLY_LATEST_PROFILE_DEFINITION));

		repair(schema, action);

		assertThat("Profile was applied to root package", model.getAppliedProfile("Profile::Nested1"), nullValue());

		Package nested = model.getNestedPackage("Package1");
		Profile profile = nested.getAppliedProfile("Profile::Nested1");
		ProfileApplication application = nested.getProfileApplication(profile);
		assertThat("Profile was not re-applied to first nested package", application.getAppliedDefinition(), is(profile.getDefinition()));

		// Verify the stereotype instance that was migrated
		Stereotype stereo = profile.getOwnedStereotype("Stereo1");
		Class class1 = (Class)nested.getOwnedType("Class1");
		assertThat(class1.getValue(stereo, "tag"), is((Object)"new version"));
		assertThat(class1.getValue(stereo, "reportable"), is((Object)true));

		nested = model.getNestedPackage("Package3");
		profile = nested.getAppliedProfile("Profile::Nested1");
		application = nested.getProfileApplication(profile);
		assertThat("Profile was not re-applied to second nested package", application.getAppliedDefinition(), is(profile.getDefinition()));

		// Verify the stereotype instance that was migrated
		stereo = profile.getOwnedStereotype("Stereo1");
		Class class4 = (Class)nested.getNestedPackage("p1").getOwnedType("Class4");
		assertThat(class4.getValue(stereo, "tag"), is((Object)"deeply nested"));
		assertThat(class4.getValue(stereo, "reportable"), is((Object)true));
	}

	//
	// Test framework
	//

	@Before
	public void createFixture() throws Exception {
		model = modelSet.getModel();

		final Profile rootProfile = model.getAppliedProfile("Profile");
		final Profile nested1 = model.getNestedPackage("Package1").getAppliedProfile("Profile::Nested1");
		final Profile nested2 = model.getNestedPackage("Package2").getAppliedProfile("Profile::Nested2");

		fixture = houseKeeper.cleanUpLater(new StereotypeApplicationRepairSnippet(new Function<EPackage, Profile>() {

			@Override
			public Profile apply(EPackage input) {
				Profile result = null;

				// Check starts-with to account for _1, _2, etc. suffixes
				if(input.getNsPrefix().startsWith("Nested2")) {
					result = nested2;
				} else if(input.getNsPrefix().startsWith("Nested1")) {
					result = nested1;
				}
				if(input.getNsPrefix().startsWith("Profile")) {
					result = rootProfile;
				}

				return result;
			}
		}), "dispose", modelSet.getResourceSet());

		fixture.start(modelSet.getResourceSet());
		houseKeeper.setField("zombies", fixture.getZombieStereotypes(modelSet.getModelResource(), modelSet.getModel()));
	}

	void repair(final EPackage schema, final IRepairAction action) {
		try {
			TransactionHelper.run(modelSet.getEditingDomain(), new Runnable() {

				@Override
				public void run() {
					zombies.repair(schema, action, null, null);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to run repair action: " + e.getLocalizedMessage());
		}
	}

	EPackage getOnlyZombieSchema() {
		Collection<? extends EPackage> schemata = zombies.getZombiePackages();
		assertThat("Wrong number of zombie packages", schemata.size(), is(1));
		return schemata.iterator().next();
	}
}
