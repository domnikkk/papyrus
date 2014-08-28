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
package org.eclipse.papyrus.infra.core.resource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;


/**
 * Test suite for the {@link ResourceAdapter} class.
 */
public class ResourceAdapterTest extends AbstractPapyrusTest {

	private static final String RESOURCE_ADDED = "handleResourceAdded";

	private static final String RESOURCE_REMOVED = "handleResourceRemoved";

	private static final String RESOURCE_LOADED = "handleResourceLoaded";

	private static final String RESOURCE_UNLOADED = "handleResourceUnloaded";

	private static final String RESOURCE_URI = "handleResourceURI";

	private static final String RESOURCE_ROOT_ADDED = "handleRootAdded";

	private static final String RESOURCE_ROOT_REMOVED = "handleRootRemoved";

	private ResourceSet rset;

	private Fixture fixture;

	public ResourceAdapterTest() {
		super();
	}

	@Test
	public void testResourceAdded() {
		Resource res = new ResourceImpl();
		rset.getResources().add(res);

		fixture.assertHooks(RESOURCE_ADDED);
		fixture.assertResources(res);
	}

	@Test
	public void testResourceRemoved() {
		Resource res = new ResourceImpl();
		rset.getResources().add(res);

		fixture.reset();
		rset.getResources().remove(0);

		fixture.assertHooks(RESOURCE_REMOVED);
		fixture.assertResources(res);
	}

	@Test
	public void testResourceLoaded() throws Exception {
		Resource res = rset.createResource(getTestResourceURI());

		fixture.reset();
		res.load(null);

		fixture.assertHooks(RESOURCE_LOADED);
		fixture.assertResources(res);
	}

	@Test
	public void testResourceUnloaded() {
		Resource res = rset.getResource(getTestResourceURI(), true);

		fixture.reset();
		res.unload();

		fixture.assertHooks(RESOURCE_UNLOADED);
		fixture.assertResources(res);
	}

	@Test
	public void testResourceURI() {
		URI oldURI = getTestResourceURI();
		Resource res = rset.getResource(oldURI, true);

		fixture.reset();
		URI newURI = URI.createURI("http:///bogus.ecore");
		res.setURI(newURI);

		fixture.assertHooks(RESOURCE_URI);
		fixture.assertResources(res);
		fixture.assertURIs(oldURI, newURI);
	}

	@Test
	public void testRootAdded() {
		Resource res = rset.getResource(getTestResourceURI(), true);

		fixture.reset();
		EObject root = EcoreFactory.eINSTANCE.createEObject();
		res.getContents().add(root);

		fixture.assertHooks(RESOURCE_ROOT_ADDED);
		fixture.assertResources(res);
		fixture.assertRoots(root);
	}

	@Test
	public void testRootRemoved() {
		Resource res = rset.getResource(getTestResourceURI(), true);

		fixture.reset();
		EObject root = res.getContents().get(0);
		res.getContents().remove(root);

		fixture.assertHooks(RESOURCE_ROOT_REMOVED);
		fixture.assertResources(res);
		fixture.assertRoots(root);
	}

	//
	// Test framework
	//

	@Before
	public void createFixture() {
		rset = new ResourceSetImpl();
		fixture = new Fixture();

		rset.eAdapters().add(fixture);
	}

	@After
	public void disposeFixture() {
		fixture = null;

		for(Resource next : rset.getResources()) {
			next.unload();
			next.eAdapters().clear();
		}

		rset.getResources().clear();
		rset.eAdapters().clear();
		rset = null;
	}

	URI getTestResourceURI() {
		// Doesn't matter the resource; this one's conveniently available
		return URI.createURI(getClass().getResource("Bug402525.ecore").toExternalForm(), true);
	}

	static class Fixture extends ResourceAdapter {

		private Set<Resource> resources = Sets.newHashSet();

		private Set<String> hooksCalled = Sets.newHashSet();

		private Set<EObject> roots = Sets.newHashSet();

		private URI oldURI;

		private URI newURI;

		void reset() {
			resources.clear();
			hooksCalled.clear();
			roots.clear();
			oldURI = null;
			newURI = null;
		}

		void assertResources(Resource... resources) {
			assertThat(this.resources, is((Set<Resource>)ImmutableSet.copyOf(resources)));
		}

		void assertHooks(String... hooks) {
			assertThat(this.hooksCalled, is((Set<String>)ImmutableSet.copyOf(hooks)));
		}

		void assertRoots(EObject... objects) {
			assertThat(this.roots, is((Set<EObject>)ImmutableSet.copyOf(objects)));
		}

		void assertURIs(URI oldURI, URI newURI) {
			assertThat(this.oldURI, is(oldURI));
			assertThat(this.newURI, is(newURI));
		}

		private void called(Resource resource, String hook) {
			hooksCalled.add(hook);
			resources.add(resource);
		}

		private void root(EObject root) {
			roots.add(root);
		}

		private void uri(URI oldURI, URI newURI) {
			this.oldURI = oldURI;
			this.newURI = newURI;
		}

		@Override
		protected void handleResourceAdded(Resource resource) {
			called(resource, RESOURCE_ADDED);
		}

		@Override
		protected void handleResourceRemoved(Resource resource) {
			called(resource, RESOURCE_REMOVED);
		}

		@Override
		protected void handleResourceLoaded(Resource resource) {
			called(resource, RESOURCE_LOADED);
		}

		@Override
		protected void handleResourceUnloaded(Resource resource) {
			called(resource, RESOURCE_UNLOADED);
		}

		@Override
		protected void handleResourceURI(Resource resource, URI oldURI, URI newURI) {
			called(resource, RESOURCE_URI);
			uri(oldURI, newURI);
		}

		@Override
		protected void handleRootAdded(Resource resource, EObject root) {
			called(resource, RESOURCE_ROOT_ADDED);
			root(root);
		}

		@Override
		protected void handleRootRemoved(Resource resource, EObject root) {
			called(resource, RESOURCE_ROOT_REMOVED);
			root(root);
		}
	}
}
