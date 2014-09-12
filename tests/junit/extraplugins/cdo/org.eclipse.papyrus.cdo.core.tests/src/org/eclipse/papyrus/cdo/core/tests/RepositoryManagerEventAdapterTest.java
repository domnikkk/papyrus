/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.cdo.core.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewInvalidationEvent;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.cdo.core.IPapyrusRepository;
import org.eclipse.papyrus.cdo.core.IPapyrusRepositoryManager;
import org.eclipse.papyrus.cdo.core.RepositoryManagerEventAdapter;
import org.eclipse.papyrus.cdo.internal.core.IInternalPapyrusRepository;
import org.eclipse.papyrus.cdo.internal.core.IInternalPapyrusRepositoryManager;
import org.eclipse.papyrus.cdo.internal.core.PapyrusRepositoryManager;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.junit.Test;

import com.google.common.collect.Lists;

/**
 * Test suite for the {@link RepositoryManagerEventAdapter} class.
 */
public class RepositoryManagerEventAdapterTest extends AbstractPapyrusCDOTest {

	public RepositoryManagerEventAdapterTest() {
		super();
	}

	/**
	 * Regression test for the invalid identity check bug (an actual bug) uncovered by FindBugs.
	 * 
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=443828
	 */
	@Test
	public void discoverExistingViews_bug443828() throws Exception {
		IInternalPapyrusRepository repo = getInternalPapyrusRepository();
		ResourceSet rset = repo.createTransaction(new ResourceSetImpl());
		rset.createResource(getTestResourceURI("foo.ecore"));
		repo.commit(rset);

		Fixture fixture = createFixture(rset);

		// Create a "remote session"
		IPapyrusRepositoryManager mgr = createRepositoryManager();
		IPapyrusRepository remote = mgr.getRepository(repo.getURL());
		assertThat(remote.connect().isOK(), is(true));
		ResourceSet remoteRset = remote.createTransaction(new ResourceSetImpl());

		// Create a resource in the "remote session"
		remoteRset.getResource(getTestResourceURI("foo.ecore"), true).getContents().add(EcoreFactory.eINSTANCE.createEPackage());
		remote.commit(remoteRset);

		fixture.assertInvalidation(0, repo, repo.getCDOView(rset));
	}

	//
	// Test framework
	//

	Fixture createFixture(ResourceSet rset) {
		Fixture result = new Fixture(rset);

		result.install(PapyrusRepositoryManager.INSTANCE);
		houseKeeper.cleanUpLater(result, new HouseKeeper.Disposer<RepositoryManagerEventAdapter>() {
			@Override
			public void dispose(RepositoryManagerEventAdapter object) throws Exception {
				object.uninstall(PapyrusRepositoryManager.INSTANCE);
			}
		});

		return result;
	}

	IInternalPapyrusRepositoryManager createRepositoryManager() {
		IInternalPapyrusRepositoryManager result = new PapyrusRepositoryManager();
		houseKeeper.cleanUpLater(result.getSessionsContainer(), containerDisposer());
		return result;
	}

	static class Fixture extends RepositoryManagerEventAdapter {
		private List<IPapyrusRepository> invalidatedRepositories = Lists.newArrayListWithExpectedSize(1);
		private List<CDOView> invalidatedViews = Lists.newArrayListWithExpectedSize(1);
		private List<CDOViewInvalidationEvent> invalidations = Lists.newArrayListWithExpectedSize(1);

		private final Lock lock = new ReentrantLock();
		private final Condition invalidationOccurred = lock.newCondition();

		Fixture() {
			super();
		}

		Fixture(ResourceSet rset) {
			super(rset);
		}

		void reset() {
			lock.lock();

			try {
				invalidatedRepositories.clear();
				invalidatedViews.clear();
				invalidations.clear();
			} finally {
				lock.unlock();
			}
		}

		CDOViewInvalidationEvent assertInvalidation(int index, IPapyrusRepository repository, CDOView view) {
			lock.lock();

			try {
				if (index >= invalidations.size()) {
					try {
						if (!invalidationOccurred.await(10, TimeUnit.SECONDS)) {
							fail("Timed out waiting for local view invalidation.");
						}
					} catch (InterruptedException e) {
						fail("Interrupted while waiting for local view invalidation.");
					}
				}

				assertThat("Local view invalidation not detected", index, lessThan(invalidations.size()));
				assertThat(invalidatedRepositories.get(index), sameInstance(repository));
				assertThat(invalidatedViews.get(index), sameInstance(view));
				return invalidations.get(index);
			} finally {
				lock.unlock();
			}
		}

		@Override
		protected void onInvalidation(IPapyrusRepository repository, CDOView view, CDOViewInvalidationEvent event) {
			lock.lock();

			try {
				invalidatedRepositories.add(repository);
				invalidatedViews.add(view);
				invalidations.add(event);
				invalidationOccurred.signalAll();
			} finally {
				lock.unlock();
			}
		}

	}
}
