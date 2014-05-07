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

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.papyrus.infra.core.utils.TransactionHelper;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.rules.ModelSetFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
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
}
