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

package org.eclipse.papyrus.uml.decoratormodel.internal.resource.tests;

import static org.eclipse.papyrus.junit.matchers.MoreMatchers.isEmpty;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndex;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.DecoratorModelIndexEvent;
import org.eclipse.papyrus.uml.decoratormodel.internal.resource.IDecoratorModelIndexListener;
import org.eclipse.papyrus.uml.decoratormodel.tests.AbstractProfileExternalizationTest;
import org.eclipse.uml2.uml.Package;
import org.junit.Rule;
import org.junit.Test;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.SetMultimap;

/**
 * Tests the {@link DecoratorModelIndex} class.
 */
@SuppressWarnings("restriction")
@PluginResource("/resources/testmodel.di")
public class DecoratorModelIndexTest extends AbstractProfileExternalizationTest {
	static final String PACKAGE2_DECORATOR_MODEL = "package2.decorator.uml";
	static final String PACKAGE2_DECORATOR_MODEL_NAME = "profile_applications";

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	private DecoratorModelIndex fixture = DecoratorModelIndex.getInstance();

	public DecoratorModelIndexTest() {
		super();
	}

	@Test
	public void baseline() {
		assertDecoratorModels(getURI(PACKAGE2_DECORATOR_MODEL));
	}

	@Test
	public void addNewResource() {
		getDecoratorModels(); // Synchronize the index

		URI newURI = externalize(getPackage1(), getTestProfile(), "package1");
		save();

		assertDecoratorModels(getURI(PACKAGE2_DECORATOR_MODEL), newURI);
	}

	@Test
	public void removeResource() {
		getDecoratorModels(); // Synchronize the index

		delete(PACKAGE2_DECORATOR_MODEL);

		assertDecoratorModels();
	}

	@Test
	public void appliedProfilesByResourceIndex() {
		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		Package package2 = getPackage2();
		URI testProfile = EcoreUtil.getURI(getTestProfile());

		assertThat(getAppliedProfiles(package2, decoratorModel), is(Collections.singleton(testProfile)));
	}

	@Test
	public void allAppliedProfiles() {
		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		Package package2 = getPackage2();
		URI testProfile = EcoreUtil.getURI(getTestProfile());

		SetMultimap<URI, URI> profiles = getAllAppliedProfiles(package2);
		assertThat(profiles.size(), is(1));
		assertThat(profiles.get(testProfile), is(Collections.singleton(decoratorModel)));
	}

	@Test
	public void allAppliedProfilesAsync() throws Exception {
		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		Package package2 = getPackage2();
		URI testProfile = EcoreUtil.getURI(getTestProfile());

		Future<SetMultimap<URI, URI>> profiles = fixture.getAllAppliedProfilesAsync(EcoreUtil.getURI(package2));
		assertThat(get(profiles, true).size(), is(1));
		assertThat(get(profiles, false).get(testProfile), is(Collections.singleton(decoratorModel)));
	}

	@Test
	public void decoratorModelName() throws CoreException {
		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		assertThat(fixture.getDecoratorModelName(decoratorModel), is(PACKAGE2_DECORATOR_MODEL_NAME));
	}

	@Test
	public void decoratorModelNameAsync() {
		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		assertThat(get(fixture.getDecoratorModelNameAsync(decoratorModel), true), is(PACKAGE2_DECORATOR_MODEL_NAME));
	}

	@Test
	public void decoratorModelNames() throws CoreException {
		Map<URI, String> names = fixture.getDecoratorModelNames();

		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		assertThat(names.get(decoratorModel), is(PACKAGE2_DECORATOR_MODEL_NAME));
	}

	@Test
	public void decoratorModelNamesAsync() {
		Future<Map<URI, String>> names = fixture.getDecoratorModelNamesAsync();

		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		assertThat(get(names, true).get(decoratorModel), is(PACKAGE2_DECORATOR_MODEL_NAME));
	}

	@Test
	public void decoratorModels() throws CoreException {
		SetMultimap<URI, URI> decorators = fixture.getDecoratorModels();

		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		assertThat(decorators.get(modelSet.getModelResourceURI()), hasItem(decoratorModel));
	}

	@Test
	public void decoratorModelsAsync() {
		Future<SetMultimap<URI, URI>> decorators = fixture.getDecoratorModelsAsync();

		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		assertThat(get(decorators, true).get(modelSet.getModelResourceURI()), hasItem(decoratorModel));
	}

	@Test
	public void decoratorModels_uri() throws CoreException {
		Set<URI> decorators = fixture.getDecoratorModels(modelSet.getModelResourceURI());

		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		assertThat(decorators, hasItem(decoratorModel));
	}

	@Test
	public void decoratorModelsAsync_uri() {
		Future<Set<URI>> decorators = fixture.getDecoratorModelsAsync(modelSet.getModelResourceURI());

		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		assertThat(get(decorators, true), hasItem(decoratorModel));
	}

	@Test
	public void decoratorModelsForPackage() throws CoreException {
		Set<URI> decorators = fixture.getDecoratorModelsForPackage(EcoreUtil.getURI(getPackage2()));

		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		assertThat(decorators, hasItem(decoratorModel));
	}

	@Test
	public void decoratorModelsForPackage_none() throws CoreException {
		Set<URI> decorators = fixture.getDecoratorModelsForPackage(EcoreUtil.getURI(getPackage1()));

		assertThat(decorators, isEmpty());
	}

	@Test
	public void decoratorModelsForPackageAsync() {
		Future<Set<URI>> decorators = fixture.getDecoratorModelsForPackageAsync(EcoreUtil.getURI(getPackage2()));

		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		assertThat(get(decorators, true), hasItem(decoratorModel));
	}

	@Test
	public void decoratorModelsForPackageAsync_none() {
		Future<Set<URI>> decorators = fixture.getDecoratorModelsForPackageAsync(EcoreUtil.getURI(getPackage1()));

		assertThat(get(decorators, true), isEmpty());
	}

	@Test
	public void listener() throws Exception {
		final TestListener listener = new TestListener();

		DecoratorModelIndex.getInstance().addIndexListener(houseKeeper.cleanUpLater(listener));

		URI decoratorModel = getURI(PACKAGE2_DECORATOR_MODEL);
		URIConverter.INSTANCE.delete(decoratorModel, null);

		// Synchronize with the index
		DecoratorModelIndex.getInstance().getDecoratorModels();

		assertThat(listener.count, is(1));
	}

	//
	// Test framework
	//

	void assertDecoratorModels(URI... uris) {
		assertThat(getDecoratorModels(), is((Set<URI>) ImmutableSet.copyOf(uris)));
	}

	void delete(String filename) {
		try {
			modelSet.getProject().getProject().getFile(filename).delete(true, null);
		} catch (CoreException e) {
			e.printStackTrace();
			fail("Failed to delete resource: " + e.getLocalizedMessage());
		}
	}

	URI getURI(String filename) {
		return modelSet.getProject().getURI(filename);
	}

	Set<URI> getDecoratorModels() {
		return getDecoratorModels(modelSet.getModelResourceURI());
	}

	Set<URI> getDecoratorModels(URI modelResource) {
		try {
			return DecoratorModelIndex.getInstance().getDecoratorModels(modelResource);
		} catch (CoreException e) {
			e.printStackTrace();
			fail("Failed to get decorator models from index: " + e.getLocalizedMessage());
			return null; // Unreachable
		}
	}

	Set<URI> getAppliedProfiles(Package package_, URI decoratorModel) {
		try {
			return DecoratorModelIndex.getInstance().getAppliedProfiles(EcoreUtil.getURI(package_), decoratorModel);
		} catch (CoreException e) {
			e.printStackTrace();
			fail("Failed to get applied profiles from index: " + e.getLocalizedMessage());
			return null; // Unreachable
		}
	}

	SetMultimap<URI, URI> getAllAppliedProfiles(Package package_) {
		try {
			return DecoratorModelIndex.getInstance().getAllAppliedProfiles(EcoreUtil.getURI(package_));
		} catch (CoreException e) {
			e.printStackTrace();
			fail("Failed to get applied profiles from index: " + e.getLocalizedMessage());
			return null; // Unreachable
		}
	}

	//
	// Nested types
	//

	public static class TestListener implements IDecoratorModelIndexListener {
		int count;

		@Override
		public void indexChanged(DecoratorModelIndexEvent event) {
			assertThat(event.getEventType(), is(DecoratorModelIndexEvent.INDEX_CHANGED));
			assertThat(event.getIndex(), is(DecoratorModelIndex.getInstance()));
			count++;
		}

		public void dispose() {
			DecoratorModelIndex.getInstance().removeIndexListener(this);
		}
	}
}
