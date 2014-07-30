/*****************************************************************************
 * Copyright (c) 2010, 2014 LIFL, CEA, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  LIFL - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 422257
 *  Christian W. Damus (CEA) - bug 436047
 *  Christian W. Damus (CEA) - bug 437052
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.resource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.resource.additional.AdditionalResourcesModel;
import org.eclipse.papyrus.infra.core.utils.TransactionHelper;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.ModelUtils;
import org.eclipse.papyrus.junit.utils.resources.EcoreModel;
import org.eclipse.papyrus.junit.utils.resources.WorkspaceModificationAssertion;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * Test for {@link ModelSet}. <br>
 * Run as "JUnit Plugin-Test"
 *
 * @author cedric dumoulin
 *
 */
public class ModelSetTest extends AbstractPapyrusTest {

	/**
	 * Name of the plugin that is created.
	 */
	final protected String PLUGIN_PROJECT_NAME = "org.eclipse.papyrus.infra.core";

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	/**
	 *
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 *
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.infra.core.resource.ModelSet.registerModel(IModel)} .
	 */
	@Test
	public void testRegisterModel() {
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());

		FakeModel model1 = new FakeModel("model1");

		mngr.registerModel(model1);

		assertNotNull("mngr is set", model1.getModelManager());
		assertNotNull("model is registered", mngr.getModel("model1"));
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.infra.core.resource.ModelSet#getModel(String)} .
	 */
	@Test
	public void testGetModel() {
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());

		FakeModel model1 = new FakeModel("model1");
		FakeModel model2 = new FakeModel("model2");

		mngr.registerModel(model1);
		mngr.registerModel(model2);

		assertNotNull("model is registered", mngr.getModel("model1"));
		assertNotNull("model is registered", mngr.getModel("model2"));
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.infra.core.resource.ModelSet#getTransactionalEditingDomain()} .
	 */
	@Test
	public void testGetTransactionalEditingDomain() {
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());

		assertNotNull("editing domain created", mngr.getTransactionalEditingDomain());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.infra.core.resource.ModelSet#createsModels(IFile)} .
	 */
	@Test
	public void testCreatesModels() throws IOException, CoreException {
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());

		String model1Key = "ecore";
		String model2Key = "genmodel";

		FakeModel model1 = new FakeModel(model1Key);
		FakeModel model2 = new FakeModel(model2Key);

		mngr.registerModel(model1);
		mngr.registerModel(model2);

		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("org.eclipse.papyrus.infra.core");

		IFile model1File = p.getFile("tmp/model1." + model1Key);

		// Do create
		mngr.createsModels(model1File);

		assertNotNull("resource created", model1.getResource());
		assertNotNull("resource created", model2.getResource());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.infra.core.resource.ModelSet#loadModels(IFile)} .
	 *
	 * @throws ModelMultiException
	 */
	@Test
	public void testLoadModels() throws IOException, CoreException, ModelMultiException {

		// Create models so they exists
		testSave();

		// Now do load
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());

		String model1Key = "ecore";
		String model2Key = "genmodel";

		FakeModel model1 = new FakeModel(model1Key);
		FakeModel model2 = new FakeModel(model2Key);

		mngr.registerModel(model1);
		mngr.registerModel(model2);

		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("org.eclipse.papyrus.infra.core");

		IFile model1File = p.getFile("tmp/model1." + model1Key);
		IFile model2File = p.getFile("tmp/model1." + model2Key);

		assertTrue("modelFile exist", model1File.exists());
		assertTrue("modelFile exist", model2File.exists());

		// Try to load
		mngr.loadModels(model1File);

		assertNotNull("resource created", model1.getResource());
		assertNotNull("resource created", model2.getResource());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.infra.core.resource.ModelSet#save(IProgressMonitor)} .
	 */
	@Test
	public void testSave() throws CoreException, IOException {
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());

		String model1Key = "ecore";
		String model2Key = "genmodel";

		FakeModel model1 = new FakeModel(model1Key);
		FakeModel model2 = new FakeModel(model2Key);

		mngr.registerModel(model1);
		mngr.registerModel(model2);

		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("org.eclipse.papyrus.infra.core");
		if(!p.exists()) {
			p.create(new NullProgressMonitor());
		}
		p.open(new NullProgressMonitor());

		IFile model1File = p.getFile("tmp/model1." + model1Key);
		IFile model2File = p.getFile("tmp/model1." + model2Key);

		// Do create and save
		mngr.createsModels(model1File);
		mngr.save(new NullProgressMonitor());
		//
		assertTrue("resource created", model1File.exists());
		assertTrue("resource created", model2File.exists());
		//
		assertNotNull("resource created", model1.getResource());
		assertNotNull("resource created", model2.getResource());
	}

	/**
	 * Tests that only modified resources are saved, where we have only one model (no referenced libraries).
	 */
	@Test
	public void testSave_onlyModifiedResources1() throws Exception {
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());
		TransactionalEditingDomain domain = houseKeeper.cleanUpLater(mngr.getTransactionalEditingDomain());

		EcoreModel model = new EcoreModel();

		mngr.registerModel(model);
		mngr.registerModel(new AdditionalResourcesModel());

		IProject p = houseKeeper.createProject(houseKeeper.getTestName());

		final IFile modelFile = p.getFile("model1." + model.getModelFileExtension());
		final URI modelURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

		final WorkspaceModificationAssertion mods = new WorkspaceModificationAssertion(houseKeeper);

		mngr.createModels(modelURI);
		mods.save(mngr);

		assertThat("workspace resource not created", modelFile.exists(), is(true));

		assertThat("EMF resource is null", model.getResource(), notNullValue());
		assertThat("EMF resource not created", model.getResource().getContents().isEmpty(), is(false));

		EPackage ePackage = model.getRoot();
		domain.getCommandStack().execute(SetCommand.create(domain, ePackage, EcorePackage.Literals.ENAMED_ELEMENT__NAME, "newname"));

		mods.requireChange(modelURI);
		mods.save(mngr);

		// Saving again should have no effect on the workspace
		mods.requireNoChange(modelURI);
		mods.save(mngr);
	}

	/**
	 * Tests that only modified resources are saved, where we have multiple models (referenced libraries).
	 */
	@Test
	public void testSave_onlyModifiedResources2() throws Exception {
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());
		TransactionalEditingDomain domain = houseKeeper.cleanUpLater(mngr.getTransactionalEditingDomain());

		final EcoreModel model = new EcoreModel();

		mngr.registerModel(model);
		mngr.registerModel(new AdditionalResourcesModel());

		IProject p = houseKeeper.createProject(houseKeeper.getTestName());

		final IFile modelFile1 = p.getFile("model1." + model.getModelFileExtension());
		final URI modelURI1 = URI.createPlatformResourceURI(modelFile1.getFullPath().toString(), true);

		final IFile modelFile2 = p.getFile("model2." + model.getModelFileExtension());
		final URI modelURI2 = URI.createPlatformResourceURI(modelFile2.getFullPath().toString(), true);

		final WorkspaceModificationAssertion mods = new WorkspaceModificationAssertion(houseKeeper);

		mngr.createModels(modelURI1);

		// Set up a second model and a dependency from the first
		final Resource res2 = mngr.createResource(modelURI2, EcorePackage.eCONTENT_TYPE);
		TransactionHelper.run(domain, new Runnable() {

			public void run() {
				EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
				ePackage.setName("library");
				ePackage.setNsPrefix("lib");
				ePackage.setNsURI("http://www.eclipse.org/papyrus/test/fakemodel/ecore/library");
				res2.getContents().add(ePackage);

				// A class in the library model
				EClass foo = EcoreFactory.eINSTANCE.createEClass();
				foo.setName("Foo");
				ePackage.getEClassifiers().add(foo);

				// A class in the main model
				EClass thing = EcoreFactory.eINSTANCE.createEClass();
				thing.setName("Thing");
				model.getRoot().getEClassifiers().add(thing);

				EReference reference = EcoreFactory.eINSTANCE.createEReference();
				reference.setName("foo");
				reference.setEType(foo);
				thing.getEStructuralFeatures().add(reference);
			}
		});

		// We need this referenced model to be writable in order to save it
		ModelUtils.makeReferencedModelsWritable(mngr, modelURI2);
		mods.save(mngr);

		assertThat("workspace resource not created", modelFile1.exists(), is(true));
		assertThat("workspace resource not created", modelFile2.exists(), is(true));

		assertThat("EMF resource is null", model.getResource(), notNullValue());
		assertThat("EMF resource not created", model.getResource().getContents().isEmpty(), is(false));
		assertThat("EMF resource not created", res2.getContents().isEmpty(), is(false));

		// Change the referenced resource's URI.  This should make the resource and its dependents dirty
		final URI modelURI2New = modelURI2.trimSegments(1).appendSegment("library1").appendFileExtension(model.getModelFileExtension());
		res2.setURI(modelURI2New);

		ModelUtils.makeReferencedModelsWritable(mngr, modelURI2New);
		mods.requireChange(modelURI1); // Thanks to the ProxyModificationTrackingAdapter
		mods.requireChange(modelURI2New);
		mods.requireNoChange(modelURI2); // No longer an interesting URI
		mods.save(mngr);

		EPackage ePackage = model.getRoot();
		domain.getCommandStack().execute(SetCommand.create(domain, ePackage, EcorePackage.Literals.ENAMED_ELEMENT__NAME, "newname"));

		// Saving this should have no effect on the second resource
		mods.requireChange(modelURI1);
		mods.requireNoChange(modelURI2New);
		mods.requireNoChange(modelURI2);
		mods.save(mngr);
	}

	/**
	 * Create some Resources for other test. This method should be called explicitly.
	 *
	 * @throws CoreException
	 * @throws IOException
	 */
	protected void createResources(String... filenames) throws CoreException, IOException {

		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(PLUGIN_PROJECT_NAME);
		if(!p.exists()) {
			p.create(new NullProgressMonitor());
		}
		p.open(new NullProgressMonitor());

		ResourceSet resourceSet = houseKeeper.createResourceSet();

		for(String filename : filenames) {
			createResource(p, resourceSet, filename);
		}

		// Save created resources
		for(Resource resource : resourceSet.getResources()) {
			resource.save(null);
		}
	}


	/**
	 * Create a resource.
	 *
	 * @param p
	 * @param resourceSet
	 * @param filename
	 */
	private void createResource(IProject p, ResourceSet resourceSet, String filename) {

		// Build a valid file
		IFile file = p.getFile(filename);


		URI uri = URI.createPlatformResourceURI(file.getFullPath().toOSString(), true);
		resourceSet.createResource(uri);

	}

	/**
	 * Test method for {@link org.eclipse.papyrus.infra.core.resource.ModelSet#saveAs(IPath)} .
	 */
	@Test
	public void testSaveAs() throws CoreException, IOException {
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());

		String model1Key = "ecore";
		String model2Key = "genmodel";

		FakeModel model1 = new FakeModel(model1Key);
		FakeModel model2 = new FakeModel(model2Key);

		mngr.registerModel(model1);
		mngr.registerModel(model2);

		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("org.eclipse.papyrus.infra.core");
		if(!p.exists()) {
			p.create(new NullProgressMonitor());
		}
		p.open(new NullProgressMonitor());

		IFile model1File = p.getFile("tmp/model1." + model1Key);

		// Do create and save
		mngr.createsModels(model1File);
		mngr.save(new NullProgressMonitor());

		// Change the name
		IFile newModel1File = p.getFile("tmp/model2." + model1Key);
		IFile newModel2File = p.getFile("tmp/model2." + model2Key);
		IPath newPath = newModel1File.getFullPath();

		mngr.saveAs(newPath);
		// check creation

		assertTrue("resource created", newModel2File.exists());
		assertTrue("resource created", newModel2File.exists());
		//
		assertNotNull("resource created", model1.getResource());
		assertNotNull("resource created", model2.getResource());

	}

	/**
	 * Test method for {@link org.eclipse.papyrus.infra.core.resource.ModelSet#unload()} .
	 */
	@Test
	public void testUnload() {
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());

		String model1Key = "ecore";
		String model2Key = "genmodel";

		FakeModel model1 = new FakeModel(model1Key);
		FakeModel model2 = new FakeModel(model2Key);

		mngr.registerModel(model1);
		mngr.registerModel(model2);

		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("org.eclipse.papyrus.infra.core");

		IFile model1File = p.getFile("tmp/model1." + model1Key);

		// Do create and then unload
		mngr.createsModels(model1File);
		mngr.unload();

		assertNull("resource unloaded", model1.getResource());
		assertNull("resource unloaded", model2.getResource());
	}

	/**
	 * Test method for {@link org.eclipse.papyrus.infra.core.resource.ModelSet#addModelSetSnippet(IModelManagerSnippet)} .
	 */
	@Test
	public void testAddModelSetSnippet() {
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());

		// Add snippets
		TestTrace trace = new TestTrace();
		mngr.addModelSetSnippet(new FakeModelManagerSnippet(trace, "snippet1"));
		mngr.addModelSetSnippet(new FakeModelManagerSnippet(trace, "snippet2"));

		// Do create
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("org.eclipse.papyrus.infra.core");
		IFile model1File = p.getFile("tmp/model1.ecore");
		mngr.createsModels(model1File);

		// Check calls
		assertTrue("snippet1 called", trace.contains("snippet1", "start"));
		assertTrue("snippet2 called", trace.contains("snippet2", "start"));

	}

	/**
	 * Test that snippets are called after a call to createsModels()
	 */
	@Test
	public void testSnippetCalledAfterCreateModels() {
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());

		// Add snippets
		TestTrace trace = new TestTrace();
		mngr.addModelSetSnippet(new FakeModelManagerSnippet(trace, "snippet1"));
		mngr.addModelSetSnippet(new FakeModelManagerSnippet(trace, "snippet2"));

		// Do create
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("org.eclipse.papyrus.infra.core");
		IFile model1File = p.getFile("tmp/model1.ecore");
		mngr.createsModels(model1File);

		// Check calls
		assertTrue("snippet1 called", trace.contains("snippet1", "start"));
		assertTrue("snippet2 called", trace.contains("snippet2", "start"));

		// dispose
		mngr.unload();
		// Check calls
		assertTrue("snippet1 called", trace.contains("snippet1", "dispose"));
		assertTrue("snippet2 called", trace.contains("snippet2", "dispose"));

	}

	/**
	 * Test that snippets are called after a call to loadModels()
	 *
	 * @throws ModelMultiException
	 */
	@Test
	public void testSnippetCalledAfterLoadModels() throws ModelMultiException {

		// force model creation
		testSnippetCalledAfterCreateModels();

		// now  do load.
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());

		// Add snippets
		TestTrace trace = new TestTrace();
		mngr.addModelSetSnippet(new FakeModelManagerSnippet(trace, "snippet1"));
		mngr.addModelSetSnippet(new FakeModelManagerSnippet(trace, "snippet2"));

		// Do create
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("org.eclipse.papyrus.infra.core");
		IFile model1File = p.getFile("tmp/model1.ecore");
		mngr.loadModels(model1File);

		// Check calls
		assertTrue("snippet1 called", trace.contains("snippet1", "start"));
		assertTrue("snippet2 called", trace.contains("snippet2", "start"));

		// dispose
		mngr.unload();
		// Check calls
		assertTrue("snippet1 called", trace.contains("snippet1", "dispose"));
		assertTrue("snippet2 called", trace.contains("snippet2", "dispose"));

	}

	/**
	 * Test {@link #createResources(String...)}. This is a test methods :-)
	 *
	 * @throws ModelMultiException
	 */
	@Test
	public void testCreateResource() throws IOException, CoreException, ModelMultiException {

		String model1Key = "ecore";
		String model2Key = "genmodel";
		String model3Key = "uml";

		// Create models
		createResources("tmp/model1." + model1Key, "tmp/model1." + model2Key, "tmp/model1." + model3Key);

		// Check model creation
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(PLUGIN_PROJECT_NAME);

		IFile model1File = p.getFile("tmp/model1." + model1Key);
		IFile model2File = p.getFile("tmp/model1." + model2Key);
		IFile model3File = p.getFile("tmp/model1." + model3Key);

		assertTrue("modelFile exist", model1File.exists());
		assertTrue("modelFile exist", model2File.exists());
		assertTrue("modelFile exist", model3File.exists());
	}

	/**
	 * Test {@link ModelSet#importModels(ModelIdentifiers, IFile)} called after {@link ModelSet#createsModels(IFile)} .
	 *
	 * @throws ModelException
	 */
	@Test
	public void testImportAfterCreate() throws IOException, CoreException, ModelException {

		String model1Key = "ecore";
		String model2Key = "genmodel";
		String model3Key = "uml";

		// Create models
		createResources("tmp/model1." + model1Key, "tmp/model1." + model2Key, "tmp/model1." + model3Key);

		// Now do registration
		ModelSet mngr = houseKeeper.cleanUpLater(new ModelSet());

		FakeModel model1 = new FakeModel(model1Key);
		FakeModel model2 = new FakeModel(model2Key);
		FakeModel model3 = new FakeModel(model3Key);

		mngr.registerModel(model1);
		mngr.registerModel(model2);
		mngr.registerModel(model3);


		// Get an handle on one of the files
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(PLUGIN_PROJECT_NAME);
		IFile createdFile = p.getFile("tmp/model2." + model1Key);


		// Try to create all models
		mngr.createsModels(createdFile);

		assertNotNull("resource created", model1.getResource());
		assertNotNull("resource created", model2.getResource());
		assertNotNull("resource created", model3.getResource());

		// Add something in the model
		model1.getResource().getContents().add(EcoreFactory.eINSTANCE.createEPackage());
		assertEquals("model1 has changed", 1, model1.getResource().getContents().size());

		// Try to import
		IFile importFile = p.getFile("tmp/model1." + model1Key);
		mngr.importModels(new ModelIdentifiers(model1Key, model2Key), importFile);

		assertNotNull("resource exist", model1.getResource());
		assertNotNull("resource exist", model2.getResource());
		assertNotNull("resource exist", model3.getResource());

		assertEquals("model1 has changed", 0, model1.getResource().getContents().size());


	}
}
