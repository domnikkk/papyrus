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

package org.eclipse.papyrus.infra.emf.resource.index;

import static org.eclipse.papyrus.junit.matchers.MoreMatchers.greaterThan;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * Test suite for the {@link WorkspaceModelIndex} class.
 */
public class WorkspaceModelIndexTest extends AbstractPapyrusTest {

	private static final CrossReferenceIndexer index = new CrossReferenceIndexer();
	private static WorkspaceModelIndex<CrossReferenceIndex> fixture;

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	private IProject referencingProject;
	private IFile referencingFile;
	private URI referencingURI;
	private IProject referencedProject;
	private IFile referencedFile;
	private URI referencedURI;

	public WorkspaceModelIndexTest() {
		super();
	}

	@Test
	public void indexBuilt() throws Exception {
		Map<IFile, CrossReferenceIndex> index = fixture.getIndex().get();

		assertIndex(index);
	}

	@Test
	public void indexRebuiltOnChanges() throws Exception {
		// Initial build
		Map<IFile, CrossReferenceIndex> index = fixture.getIndex().get();

		final String newFileName = "the_referencing_model.uml";

		RenameJob rename = new RenameJob(referencingFile, newFileName);

		// Update the identity of the file
		referencingFile = referencingProject.getFile(new Path(newFileName));
		referencingURI = uri(referencingFile);

		// Rename it
		rename.go();

		long requestIndex = System.currentTimeMillis();

		// Check the index
		index = fixture.getIndex().get();

		long gotIndex = System.currentTimeMillis();

		assertThat("Didn't have to wait for the index to be rebuilt", (gotIndex - requestIndex), greaterThan(1000L));

		assertIndex(index);
	}

	@Test
	public void indexRebuiltOnDeletion() throws Exception {
		// Initial build
		Map<IFile, CrossReferenceIndex> index = fixture.getIndex().get();

		DeleteJob delete = new DeleteJob(referencingFile);

		// Delete it
		delete.go();

		long requestIndex = System.currentTimeMillis();

		// Check the index
		index = fixture.getIndex().get();

		long gotIndex = System.currentTimeMillis();

		assertThat("Didn't have to wait for the index to be rebuilt", (gotIndex - requestIndex), greaterThan(1000L));

		assertIndex(index, true, Collections.<URI> emptySet(), Collections.<URI> emptySet(), false, null, null);
	}

	@Test
	public void indexRebuiltOnProjectClose() throws Exception {
		// Initial build
		Map<IFile, CrossReferenceIndex> index = fixture.getIndex().get();

		referencingFile.getProject().close(null);

		// Check the index
		index = fixture.getIndex().get();

		assertIndex(index, true, Collections.<URI> emptySet(), Collections.<URI> emptySet(), false, null, null);

		referencingFile.getProject().open(null);

		index = fixture.getIndex().get();
		assertIndex(index);
	}

	@Test
	public void indexRebuiltOnProjectDelete() throws Exception {
		// Initial build
		Map<IFile, CrossReferenceIndex> index = fixture.getIndex().get();

		referencingFile.getProject().delete(true, true, null);

		// Check the index
		index = fixture.getIndex().get();

		assertIndex(index, true, Collections.<URI> emptySet(), Collections.<URI> emptySet(), false, null, null);
	}

	@Test
	public void indexNotifiesOnReindex() throws Exception {
		// Initial build
		fixture.getIndex().get();

		class TestListener extends WorkspaceModelIndexAdapter {
			volatile int started;
			volatile int ended;

			@Override
			protected void indexAboutToCalculateOrRecalculate(WorkspaceModelIndexEvent event) {
				if (referencingProject.equals(event.getProject())) {
					started++;
				}
			}

			@Override
			protected void indexCalculatedOrRecalculated(WorkspaceModelIndexEvent event) {
				if (referencingProject.equals(event.getProject())) {
					ended++;
				}
			}
		}

		TestListener listener = attach(new TestListener());

		referencingFile.delete(true, null);

		// Access the index again to synchronize
		fixture.getIndex().get();

		assertThat(listener.started, is(1));
		assertThat(listener.ended, is(1));
	}

	//
	// Test framework
	//

	@BeforeClass
	public static void createFixture() {
		fixture = new WorkspaceModelIndex<CrossReferenceIndex>("test", UMLResource.UML_CONTENT_TYPE_IDENTIFIER, index, 2);
	}

	@AfterClass
	public static void destroyFixture() {
		fixture.dispose();
		fixture = null;
	}

	@Before
	public void createProjects() throws Exception {
		referencedProject = houseKeeper.createProject("referencedProject");
		referencingProject = houseKeeper.createProject("referencingProject");

		referencedFile = referencedProject.getFile("referenced.uml");
		InputStream input = getTestResource("resources/index/referenced.uml");
		try {
			referencedFile.create(input, true, null);
		} finally {
			input.close();
		}
		referencedURI = uri(referencedFile);

		referencingFile = referencingProject.getFile("referencing.uml");
		input = getTestResource("resources/index/referencing.uml");
		try {
			referencingFile.create(input, true, null);
		} finally {
			input.close();
		}
		referencingURI = uri(referencingFile);
	}

	static URI uri(IFile file) {
		return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
	}

	private InputStream getTestResource(String path) throws IOException {
		return Platform.getBundle("org.eclipse.papyrus.infra.emf.tests").getEntry(path).openStream();
	}

	void assertIndex(Map<IFile, CrossReferenceIndex> index) {
		assertIndex(index, true, Collections.<URI> emptySet(), Collections.singleton(referencingURI), true, Collections.<URI> emptySet(), Collections.singleton(referencedURI));
	}

	void assertIndex(Map<IFile, CrossReferenceIndex> index, boolean expectReferenced, Set<URI> referencedImports, Set<URI> referencedExports, boolean expectReferencing, Set<URI> referencingImports, Set<URI> referencingExports) {
		CrossReferenceIndex referenced = index.get(referencedFile);
		assertThat(referenced, expectReferenced ? notNullValue() : nullValue());
		if (referenced != null) {
			assertThat(referenced.imports, is(referencedImports));
			assertThat(referenced.exports, is(referencedExports));
		}

		CrossReferenceIndex referencing = index.get(referencingFile);
		assertThat(referencing, expectReferencing ? notNullValue() : nullValue());

		if (referencing != null) {
			assertThat(referencing.exports, is(referencingImports));
			assertThat(referencing.imports, is(referencingExports));
		}
	}

	<T extends IWorkspaceModelIndexListener> T attach(T listener) {
		fixture.addListener(houseKeeper.cleanUpLater(listener, new HouseKeeper.Disposer<T>() {
			@Override
			public void dispose(T object) {
				fixture.removeListener(object);
			}
		}));

		return listener;
	}

	//
	// Nested types
	//

	static class CrossReferenceIndexer implements WorkspaceModelIndex.IndexHandler<CrossReferenceIndex> {
		private final Map<IFile, CrossReferenceIndex> index = Maps.newHashMap();

		private CrossReferenceIndex get(IFile file) {
			CrossReferenceIndex result;

			synchronized (index) {
				result = index.get(file);
				if (result == null) {
					result = new CrossReferenceIndex();
					index.put(file, result);
				}
			}

			return result;
		}

		@Override
		public CrossReferenceIndex index(IFile file) {
			final CrossReferenceIndex result = get(file);

			Set<URI> imports = result.imports;

			ResourceSet resourceSet = new IndexingResourceSet();

			try {
				URI uri = uri(file);

				Resource resource = resourceSet.getResource(uri, true);
				for (Map.Entry<EObject, Collection<EStructuralFeature.Setting>> next : EcoreUtil.ProxyCrossReferencer.find(resource).entrySet()) {
					for (EStructuralFeature.Setting setting : next.getValue()) {
						Object references = setting.get(false);

						if (references instanceof EObject) {
							EObject ref = (EObject) references;
							if (ref.eIsProxy()) {
								URI href = EcoreUtil.getURI(ref).trimFragment();
								if (href.isPlatformResource() && imports.add(href)) {
									// add the corresponding export
									IFile other = file.getWorkspace().getRoot().getFile(new Path(href.toPlatformString(true)));
									get(other).exports.add(uri);
								}
							}
						}
					}
				}
			} finally {
				EMFHelper.unload(resourceSet);
			}

			return result;
		}

		@Override
		public void unindex(IFile file) {
			URI uri = uri(file);

			synchronized (index) {
				// Remove this file from the index
				index.remove(file);

				// Remove exports because the deleted resource no longer imports resources
				for (CrossReferenceIndex next : index.values()) {
					next.exports.remove(uri);
				}

				// DO NOT remove imports because resources that still exist will still have
				// proxies referencing the resource, despite that it is deleted
			}
		}
	}

	static class CrossReferenceIndex {
		final Set<URI> imports = Sets.newConcurrentHashSet();
		final Set<URI> exports = Sets.newConcurrentHashSet();
	}

	static class IndexingResourceSet extends ResourceSetImpl {
		@Override
		public EObject getEObject(URI uri, boolean loadOnDemand) {
			// Don't resolve any proxies
			return null;
		}
	}

	static abstract class FileManipulationJob extends Job {
		private final IFile file;

		private final CountDownLatch latch = new CountDownLatch(1);

		FileManipulationJob(String jobName, IFile file) {
			super(jobName);

			this.file = file;

			setRule(file.getProject());
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				manipulateFile(file, monitor);

				// Release the test case
				latch.countDown();

				// Delay a bit to ensure that the test case has to wait for the index to update
				Thread.sleep(TimeUnit.SECONDS.toMillis(3));
			} catch (InterruptedException e) {
				return Status.CANCEL_STATUS;
			} catch (CoreException e) {
				return e.getStatus();
			}

			return Status.OK_STATUS;
		}

		protected abstract void manipulateFile(IFile file, IProgressMonitor monitor) throws CoreException;

		void go() throws InterruptedException {
			schedule();
			await();
		}

		void await() throws InterruptedException {
			latch.await();
		}

	}

	static class RenameJob extends FileManipulationJob {
		private final String newName;

		RenameJob(IFile file, String name) {
			super(String.format("Rename %s as %s", file.getFullPath(), name), file);

			this.newName = name;
		}

		@Override
		protected void manipulateFile(IFile file, IProgressMonitor monitor) throws CoreException {
			file.move(file.getFullPath().removeLastSegments(1).append(newName), true, monitor);
		}
	}

	static class DeleteJob extends FileManipulationJob {
		DeleteJob(IFile file) {
			super(String.format("Delete %s", file.getFullPath()), file);
		}

		@Override
		protected void manipulateFile(IFile file, IProgressMonitor monitor) throws CoreException {
			file.delete(true, monitor);
		}
	}
}
