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

package org.eclipse.papyrus.uml.decoratormodel.helper.tests;

import static org.eclipse.papyrus.junit.matchers.MoreMatchers.isEmpty;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.helper.IDeleteEmptyDecoratorModelsPolicy;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ProfileExternalizationPackage;
import org.eclipse.papyrus.uml.decoratormodel.tests.AbstractProfileExternalizationTest;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/**
 * Additional tests for the {@link DecoratorModelUtils} class not covered by the main test suites.
 */
@PluginResource("/resources/testmodel.di")
public class DecoratorModelUtilsTest extends AbstractProfileExternalizationTest {

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	private ResourceSet fixture;

	private Resource modelResource;

	/**
	 * Test externalizing a profile application in a normal resource set.
	 */
	@Test
	public void testExternalizeProfileApplication() {
		final ProfileApplication application = getPackage1().getProfileApplication(getTestProfile());

		execute(new Callable<Resource>() {
			@Override
			public Resource call() throws Exception {
				Resource result = fixture.createResource(createDecoratorModelURI("package1"), UMLPackage.eCONTENT_TYPE);
				Package root = UMLFactory.eINSTANCE.createPackage();
				root.setName("test");
				root.applyProfile(getProfileExternalizationProfile());
				result.getContents().add(root);

				DecoratorModelUtils.externalizeProfileApplication(application, result);
				return result;
			}
		});

		assertExternalApplication(getPackage1(), getTestProfile(), "package1", 4);
	}

	@Test
	public void testInternalizeProfileApplications() {
		loadDecoratorModel("package2");

		execute(new Runnable() {

			@Override
			public void run() {
				DecoratorModelUtils.internalizeProfileApplications(Collections.singleton(getPackage2().getProfileApplication(getTestProfile(), true)), alwaysDelete());
			}
		});

		assertInternalApplication(getPackage2(), getTestProfile(), 3);
	}

	@Test
	public void testGetExternalizationProfile() {
		Profile profile = DecoratorModelUtils.getExternalizationProfile(fixture);
		assertThat(profile, notNullValue());
		assertThat(profile.eIsProxy(), is(false));
		assertThat(profile.getURI(), is(ProfileExternalizationPackage.eNS_URI));
	}

	@Test
	public void testGetDecoratorPackages() {
		// Initial condition
		assertThat(DecoratorModelUtils.getDecoratorPackages(getPackage2()), isEmpty());

		loadDecoratorModel("package2");

		List<Package> packages = ImmutableList.copyOf(DecoratorModelUtils.getDecoratorPackages(getPackage2()));
		assertThat(packages.size(), is(1));
		assertThat(packages.get(0).isProfileApplied(getTestProfile()), is(true));
	}

	@Test
	public void testGetDecoratorModelProfileApplications() {
		// Initial condition
		assertThat(DecoratorModelUtils.getDecoratorModelProfileApplications(getPackage2()), isEmpty());

		loadDecoratorModel("package2");

		List<ProfileApplication> applications = ImmutableList.copyOf(DecoratorModelUtils.getDecoratorModelProfileApplications(getPackage2()));
		assertThat(applications.size(), is(1));
		assertThat(applications.get(0).getAppliedProfile(), is(getTestProfile()));
	}

	@Test
	public void testGetDecoratorProfileApplications() {
		Resource decoratorModel = loadDecoratorModel("package2");

		Map<Package, Profile> applications = DecoratorModelUtils.getDecoratorProfileApplications(decoratorModel);
		assertThat(applications.size(), is(1));
		assertThat(applications.get(getPackage2()), is(getTestProfile()));
	}

	@Test
	public void testGetDecoratorModelAppliedProfiles() {
		// Initial condition
		assertThat(DecoratorModelUtils.getDecoratorModelProfileApplications(getPackage2()), isEmpty());

		loadDecoratorModel("package2");

		List<Profile> applied = ImmutableList.copyOf(DecoratorModelUtils.getDecoratorModelAppliedProfiles(getPackage2()));
		assertThat(applied.size(), is(1));
		assertThat(applied.get(0), is(getTestProfile()));
	}

	@Test
	public void testHasExternalizationProfile() {
		Resource decoratorModel = loadDecoratorModel("package2");

		assertThat(DecoratorModelUtils.hasExternalizationProfile(getTestProfile()), is(false));
		assertThat(DecoratorModelUtils.hasExternalizationProfile((Package) decoratorModel.getContents().get(0)), is(true));
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils#isDecoratorModel(org.eclipse.emf.ecore.resource.Resource)}.
	 */
	@Test
	public void testIsDecoratorModelResource() {
		Resource decoratorModel = loadDecoratorModel("package2");

		assertThat(DecoratorModelUtils.isDecoratorModel(modelResource), is(false));
		assertThat(DecoratorModelUtils.isDecoratorModel(decoratorModel), is(true));
	}

	@Test
	public void testIsDecoratorModelFor() {
		Resource decoratorModel = loadDecoratorModel("package2");

		assertThat(DecoratorModelUtils.isDecoratorModelFor(decoratorModel, getTestProfile().eResource()), is(false));
		assertThat(DecoratorModelUtils.isDecoratorModelFor(decoratorModel, modelResource), is(true));
	}

	@Test
	public void testGetUserModelResources() {
		Resource decoratorModel = loadDecoratorModel("package2");

		List<URI> uris = ImmutableList.copyOf(DecoratorModelUtils.getUserModelResources(decoratorModel));
		assertThat(uris.size(), is(1));
		assertThat(uris.get(0), is(modelResource.getURI()));
	}

	@Test
	public void testIsDecoratorModelURI() throws Exception {
		URI decorator = createDecoratorModelURI("package2");
		assertThat(DecoratorModelUtils.isDecoratorModel(decorator), is(true));

		final Resource decoratorModel = loadDecoratorModel("package2");

		// Doesn't matter that it's loaded and cleared out
		execute(new Runnable() {

			@Override
			public void run() {
				decoratorModel.getContents().clear();
			}
		});
		assertThat(DecoratorModelUtils.isDecoratorModel(decoratorModel.getURI()), is(true));

		// But it does if we then save it
		decoratorModel.save(null);
		assertThat(DecoratorModelUtils.isDecoratorModel(decorator), is(false));
	}

	@Test
	public void testGetLoadedDecoratorModels() {
		assertThat(DecoratorModelUtils.getLoadedDecoratorModels(modelResource), isEmpty());

		Resource decoratorModel = loadDecoratorModel("package2");

		assertThat(DecoratorModelUtils.getLoadedDecoratorModels(modelResource), is(Collections.singleton(decoratorModel.getURI())));
	}

	@Test
	public void testGetUnloadedDecoratorModels() {
		URI uri = createDecoratorModelURI("package2");

		assertThat(DecoratorModelUtils.getUnloadedDecoratorModels(modelResource), is(Collections.singleton(uri)));

		loadDecoratorModel("package2");

		assertThat(DecoratorModelUtils.getUnloadedDecoratorModels(modelResource), isEmpty());
	}

	@Test
	public void testGetUnloadedDecoratorModelsAsyncResource() {
		URI uri = createDecoratorModelURI("package2");

		Future<Set<URI>> unloaded = DecoratorModelUtils.getUnloadedDecoratorModelsAsync(modelResource);
		assertThat(get(unloaded, true), is(Collections.singleton(uri)));

		loadDecoratorModel("package2");

		// This answer should be available pretty much immediately because there are no further workspace resource changes
		unloaded = DecoratorModelUtils.getUnloadedDecoratorModelsAsync(modelResource);
		assertThat(get(unloaded, false), isEmpty());
	}

	@Test
	public void testGetUnloadedDecoratorModelsAsyncIterableOfResource() {
		URI decorator1 = externalize(getPackage1(), getTestProfile(), "package1");
		URI decorator2 = createDecoratorModelURI("package2");

		loadDecoratorModel("package2").setModified(true); // For refactoring of units
		List<Resource> resources = ImmutableList.of(control(getPackage1()), control(getPackage2()));
		save();
		unloadDecoratorModel("package2");

		Future<Set<URI>> unloaded = DecoratorModelUtils.getUnloadedDecoratorModelsAsync(resources);
		assertThat(get(unloaded, true), is(set(decorator2)));

		unloadDecoratorModel("package1");

		unloaded = DecoratorModelUtils.getUnloadedDecoratorModelsAsync(resources);
		assertThat(get(unloaded, false), is(set(decorator1, decorator2)));
	}

	@Test
	public void testGetUnloadedDecoratorModelsAsyncPackage() {
		URI uri = createDecoratorModelURI("package2");

		Future<Set<URI>> unloaded = DecoratorModelUtils.getUnloadedDecoratorModelsAsync(getPackage2());
		assertThat(get(unloaded, true), is(set(uri)));

		loadDecoratorModel("package2");

		unloaded = DecoratorModelUtils.getUnloadedDecoratorModelsAsync(getPackage2());
		assertThat(get(unloaded, false), isEmpty());
	}

	@Test
	public void testHasUnloadedDecoratorModelsAsync() {
		Future<Boolean> hasUnloaded = DecoratorModelUtils.hasUnloadedDecoratorModelsAsync(getModel(), false);
		assertThat(get(hasUnloaded, true), is(Boolean.TRUE));

		loadDecoratorModel("package2");

		hasUnloaded = DecoratorModelUtils.hasUnloadedDecoratorModelsAsync(getModel(), false);
		assertThat(get(hasUnloaded, false), is(Boolean.FALSE));
	}

	@Test
	public void testHasUnloadedDecoratorModelsAsync_recursive() {
		loadDecoratorModel("package2").setModified(true); // Load it for unit refactoring
		control(getPackage2());
		save();
		unloadDecoratorModel("package2");

		Future<Boolean> hasUnloaded = DecoratorModelUtils.hasUnloadedDecoratorModelsAsync(getModel(), false);
		assertThat(get(hasUnloaded, true), is(Boolean.FALSE));

		hasUnloaded = DecoratorModelUtils.hasUnloadedDecoratorModelsAsync(getModel(), true);
		assertThat(get(hasUnloaded, false), is(Boolean.TRUE));

		loadDecoratorModel("package2");

		hasUnloaded = DecoratorModelUtils.hasUnloadedDecoratorModelsAsync(getModel(), true);
		assertThat(get(hasUnloaded, false), is(Boolean.FALSE));
	}

	@Test
	public void testGetLoadedSubUnitPackages() {
		Set<Package> subUnits = ImmutableSet.copyOf(DecoratorModelUtils.getLoadedSubUnitPackages(getModel()));
		assertThat(subUnits, isEmpty());

		Resource package2 = control(getPackage2());
		subUnits = ImmutableSet.copyOf(DecoratorModelUtils.getLoadedSubUnitPackages(getModel()));
		assertThat(subUnits, is(set(getPackage2())));

		package2.unload();
		subUnits = ImmutableSet.copyOf(DecoratorModelUtils.getLoadedSubUnitPackages(getModel()));
		assertThat(subUnits, isEmpty());

	}

	//
	// Test framework
	//

	@Before
	public void createFixture() {
		EditingDomain context = houseKeeper.createSimpleEditingDomain();
		fixture = context.getResourceSet();
		DecoratorModelUtils.configure(fixture);
		setTestContext(context);

		modelResource = getModel().eResource();
	}

	IDeleteEmptyDecoratorModelsPolicy alwaysDelete() {
		return new IDeleteEmptyDecoratorModelsPolicy() {

			@Override
			public boolean shouldDeleteDecoratorModels(Collection<? extends Resource> decoratorModels) {
				return true;
			}
		};
	}
}
