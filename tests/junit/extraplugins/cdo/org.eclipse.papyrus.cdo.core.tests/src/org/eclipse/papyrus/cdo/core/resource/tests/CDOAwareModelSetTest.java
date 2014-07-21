/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   Christian W. Damus (CEA) - bug 429242
 *   Christian W. Damus (CEA) - bug 429826
 *   Christian W. Damus (CEA) - bug 431953 (pre-requisite refactoring of ModelSet service start-up)
 *   Christian W. Damus (CEA) - bug 422257
 *   
 *****************************************************************************/
package org.eclipse.papyrus.cdo.core.resource.tests;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;

import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.net4j.util.lifecycle.LifecycleException;
import org.eclipse.papyrus.cdo.core.resource.CDOAwareModelSet;
import org.eclipse.papyrus.cdo.core.resource.CDOAwareTransactionalEditingDomain;
import org.eclipse.papyrus.cdo.core.resource.PapyrusCDOResourceFactory;
import org.eclipse.papyrus.cdo.core.tests.AbstractPapyrusCDOTest;
import org.eclipse.papyrus.cdo.internal.core.PapyrusRepositoryManager;
import org.eclipse.papyrus.infra.core.Activator;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ReadOnlyAxis;
import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceMultiException;
import org.eclipse.papyrus.infra.core.services.ServiceNotFoundException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.TransactionHelper;
import org.eclipse.papyrus.junit.utils.ModelUtils;
import org.eclipse.papyrus.junit.utils.resources.EcoreModel;
import org.eclipse.papyrus.junit.utils.resources.WorkspaceModificationAssertion;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

/**
 * This is the CDOAwareModelSetTest type. Enjoy.
 */
public class CDOAwareModelSetTest extends AbstractPapyrusCDOTest {

	private static final String MODEL_FILENAME = "model.uml";

	private ServicesRegistry services;

	private ModelSet fixture;

	public CDOAwareModelSetTest() {
		super();
	}

	@Test
	public void modelSetCreated() {
		Resource resource = fixture.getResource(getTestResourceURI(MODEL_FILENAME), false);
		assertThat(resource, notNullValue());

		CDOTransaction transaction = getTransaction(fixture);

		assertThat(transaction.isClosed(), is(false));
		assertThat(transaction.isDirty(), is(false));
	}

	@Test
	public void unloadModelSet() throws Exception {
		fixture.unload();

		assertThat(fixture.getResources(), equalTo(Collections.EMPTY_LIST));
	}

	@Test
	public void cdoResourceFactory() {
		CDOTransaction transaction = getTransaction(fixture);

		Resource resource = transaction.getOrCreateResource(getResourcePath(MODEL_FILENAME));
		assertThat(fixture.getResourceFactoryRegistry().getFactory(resource.getURI()), instanceOf(PapyrusCDOResourceFactory.class));
	}

	@Test
	public void editingDomain() {
		assertThat(fixture.getTransactionalEditingDomain(), instanceOf(CDOAwareTransactionalEditingDomain.class));
	}

	@Test
	public void cdoResourceNotReadOnly() {
		CDOTransaction transaction = getTransaction(fixture);

		Resource resource = transaction.getOrCreateResource(getResourcePath(MODEL_FILENAME));
		assertThat(fixture.getReadOnlyHandler().anyReadOnly(ReadOnlyAxis.anyAxis(), new URI[]{ resource.getURI() }), is(Optional.of(false)));
	}

	@Test
	public void getEObject() throws Exception {
		ResourceSet other = getPapyrusRepository().createTransaction(houseKeeper.createResourceSet());

		Resource resource = getTransaction(other).getOrCreateResource(getResourcePath("other.uml"));

		Model model = UMLFactory.eINSTANCE.createModel();
		model.setName("test");
		resource.getContents().add(model);

		getPapyrusRepository().commit(other);

		// must get the URI *after* commit, because the fragment of a
		// persisted object is different than that of a transient object
		URI uri = EcoreUtil.getURI(model);

		getPapyrusRepository().close(other);

		EObject retrieved = fixture.getEObject(uri, true);
		model = cast(retrieved, Model.class);
		assertThat(model.getName(), equalTo("test"));
	}

	@Test
	public void resolveProxy() throws Exception {
		ResourceSet other = getPapyrusRepository().createTransaction(houseKeeper.createResourceSet());

		Resource resource1 = getTransaction(other).getOrCreateResource(getResourcePath(MODEL_FILENAME));
		Model model1 = UMLFactory.eINSTANCE.createModel();
		model1.setName("model1");
		resource1.getContents().add(model1);

		Resource resource2 = getTransaction(other).getOrCreateResource(getResourcePath("other.uml"));
		Model model2 = UMLFactory.eINSTANCE.createModel();
		model2.setName("model2");
		resource2.getContents().add(model2);
		model2.createPackageImport(model1);

		URI uri = resource2.getURI();

		getPapyrusRepository().commit(other);
		getPapyrusRepository().close(other);

		Resource resource = fixture.getResource(uri, true);
		Model referencer = (Model)EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.MODEL);
		assertThat(referencer.getImportedPackages(), CoreMatchers.<Package> hasItem(CoreMatchers.anything()));
		Package imported = referencer.getImportedPackages().get(0);
		assertThat(imported.eIsProxy(), is(false));
		assertThat(imported.getName(), equalTo("model1"));
	}

	/**
	 * Tests that only modified workspace resources are saved, where we have only one model (no referenced libraries).
	 */
	@Test
	public void testSave_onlyModifiedWorkspaceResources1() throws Exception {
		final TransactionalEditingDomain domain = fixture.getTransactionalEditingDomain();

		EcoreModel model = new EcoreModel();

		fixture.registerModel(model);

		IProject p = houseKeeper.createProject(houseKeeper.getTestName());

		final IFile modelFile = p.getFile("ecore1." + model.getModelFileExtension());
		final URI modelURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

		final WorkspaceModificationAssertion mods = new WorkspaceModificationAssertion(houseKeeper);

		fixture.createModels(modelURI);
		mods.save(fixture);

		assertThat("workspace resource not created", modelFile.exists(), is(true));

		assertThat("EMF resource is null", model.getResource(), notNullValue());
		assertThat("EMF resource not created", model.getResource().getContents().isEmpty(), is(false));

		EPackage ePackage = model.getRoot();
		domain.getCommandStack().execute(SetCommand.create(domain, ePackage, EcorePackage.Literals.ENAMED_ELEMENT__NAME, "newname"));

		mods.requireChange(modelURI);
		mods.save(fixture);

		// Saving again should have no effect on the workspace
		mods.requireNoChange(modelURI);
		mods.save(fixture);
	}

	/**
	 * Tests that only modified workspace resources are saved, where we have multiple models (referenced libraries).
	 */
	@Test
	public void testSave_onlyModifiedWorkspaceResources2() throws Exception {
		final TransactionalEditingDomain domain = fixture.getTransactionalEditingDomain();

		final EcoreModel model = new EcoreModel();

		fixture.registerModel(model);

		IProject p = houseKeeper.createProject(houseKeeper.getTestName());

		final IFile modelFile1 = p.getFile("ecore1." + model.getModelFileExtension());
		final URI modelURI1 = URI.createPlatformResourceURI(modelFile1.getFullPath().toString(), true);

		final IFile modelFile2 = p.getFile("ecore2." + model.getModelFileExtension());
		final URI modelURI2 = URI.createPlatformResourceURI(modelFile2.getFullPath().toString(), true);

		final WorkspaceModificationAssertion mods = new WorkspaceModificationAssertion(houseKeeper);

		fixture.createModels(modelURI1);

		// Set up a second model and a dependency from the first
		final Resource res2 = fixture.createResource(modelURI2, EcorePackage.eCONTENT_TYPE);
		TransactionHelper.run(domain, new Runnable() {

			@Override
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
		ModelUtils.makeReferencedModelsWritable(fixture, modelURI2);
		mods.save(fixture);

		assertThat("workspace resource not created", modelFile1.exists(), is(true));
		assertThat("workspace resource not created", modelFile2.exists(), is(true));

		assertThat("EMF resource is null", model.getResource(), notNullValue());
		assertThat("EMF resource not created", model.getResource().getContents().isEmpty(), is(false));
		assertThat("EMF resource not created", res2.getContents().isEmpty(), is(false));

		// Change the referenced resource's URI.  This should make the resource and its dependents dirty
		final URI modelURI2New = modelURI2.trimSegments(1).appendSegment("library1").appendFileExtension(model.getModelFileExtension());
		res2.setURI(modelURI2New);

		ModelUtils.makeReferencedModelsWritable(fixture, modelURI2New);
		mods.requireChange(modelURI1); // Thanks to the ProxyModificationTrackingAdapter
		mods.requireChange(modelURI2New);
		mods.requireNoChange(modelURI2); // No longer an interesting URI
		mods.save(fixture);

		EPackage ePackage = model.getRoot();
		domain.getCommandStack().execute(SetCommand.create(domain, ePackage, EcorePackage.Literals.ENAMED_ELEMENT__NAME, "newname"));

		// Saving this should have no effect on the second resource
		mods.requireChange(modelURI1);
		mods.requireNoChange(modelURI2New);
		mods.requireNoChange(modelURI2);
		mods.save(fixture);
	}

	//
	// Test framework
	//

	@Before
	public void createModelSet() throws Exception {
		services = new ExtensionServicesRegistry(Activator.PLUGIN_ID);

		try {
			// Ensure that the CDOAwareModelSet is the ModelSet service implementation
			services.add(ModelSet.class, Integer.MAX_VALUE, new CDOAwareModelSet(PapyrusRepositoryManager.INSTANCE));

			// start the ModelSet and its dependencies
			services.startServicesByClassKeys(ModelSet.class, TransactionalEditingDomain.class);
		} catch (ServiceMultiException e) {
			for(ServiceNotFoundException next : Iterables.filter(e.getExceptions(), ServiceNotFoundException.class)) {
				assertThat(next.getLocalizedMessage(), not(containsString("ModelSet")));
			}
		}

		fixture = services.getService(ModelSet.class);
		assertThat(fixture, instanceOf(CDOAwareModelSet.class));

		// pre-emptively get the editing domain to avoid lock contention later
		services.getService(TransactionalEditingDomain.class);

		assumeThat(fixture, instanceOf(CDOAwareModelSet.class));

		fixture.createModels(getTestResourceURI(MODEL_FILENAME));
		getPapyrusRepository().commit(fixture);
	}

	@After
	public void disposeModelSet() throws Exception {
		try {
			services.disposeRegistry();
		} catch (ServiceMultiException e) {
			if(Iterables.any(Iterables.transform(e.getExceptions(), new Function<Throwable, Throwable>() {

				@Override
				public Throwable apply(Throwable input) {
					return input.getCause();
				}
			}), Predicates.instanceOf(LifecycleException.class))) {

				// known exception due to minimal CDOObject implementation
			} else {
				throw e;
			}
		} finally {
			services = null;
		}
	}
}
