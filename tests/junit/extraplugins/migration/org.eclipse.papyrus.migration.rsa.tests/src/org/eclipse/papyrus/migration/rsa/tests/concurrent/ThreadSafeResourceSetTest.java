/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.tests.concurrent;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.junit.framework.classification.ExpensiveTest;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.PapyrusProjectUtils;
import org.eclipse.papyrus.junit.utils.ProjectUtils;
import org.eclipse.papyrus.migration.rsa.concurrent.ResourceAccessHelper;
import org.eclipse.papyrus.migration.rsa.concurrent.ThreadSafeResourceSet;
import org.eclipse.papyrus.migration.rsa.tests.Activator;
import org.eclipse.uml2.uml.Model;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Tests the {@link ThreadSafeResourceSet} and {@link ResourceAccessHelper} classes
 * 
 * @author Camille Letavernier
 *
 */
public class ThreadSafeResourceSetTest extends AbstractPapyrusTest{

	private final int NUM_THREADS = 8;

	private final int WRITE_THREADS = 3;

	private final int WRITE_LOOPS = 200;

	private boolean failed;

	private int writeThreadsComplete;

	private boolean writeComplete;

	@Before
	public void init() {
		failed = false;
		writeThreadsComplete = 0;
		writeComplete = false;
	}

	/**
	 * Read & Write a single big resource (1.3MB) concurrently on {@link NUM_THREADS} threads
	 * 
	 * Each thread has its own resource set
	 * 
	 * Expensive test (CPU, Disk and Memory)
	 * 
	 * @throws Exception
	 */
	@Ignore("The test is too expensive; completely disable it until the test suite supports a Lightweight vs Full test configuration")
	@ExpensiveTest("Expensive CPU, DISK and Memory usage. May cause Memory Leaks")
	@Test
	public void testThreadSafeResourceSet() throws Exception {

		IProject project = ProjectUtils.createProject("concurrent");
		IFile modelFile = PapyrusProjectUtils.copyIFile("resources/concurrent/model.uml", Activator.getDefault().getBundle(), project, "model.uml");
		final URI modelURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

		List<Thread> allThreads = new LinkedList<Thread>();

		for (int i = 0; i < WRITE_THREADS; i++) {
			Thread writeThread = new Thread() {
				@Override
				public void run() {

					// ResourceSet resourceSet = new ResourceSetImpl();
					ResourceSet resourceSet = new ThreadSafeResourceSet();
					Resource modelResource = resourceSet.getResource(modelURI, true);

					try {
						for (int i = 0; i < WRITE_LOOPS; i++) {

							((Model) modelResource.getContents().get(0)).setName("x" + System.nanoTime()); // Any change

							ResourceAccessHelper.INSTANCE.saveResource(modelResource, null);
							// modelResource.save(null);

							if (i % 20 == 0) {
								System.out.println("Write: " + i + "/" + WRITE_LOOPS);
							}
						}
					} catch (Throwable ex) {
						Activator.log.error(ex);
						fireWriteComplete();
						fail();
					}

					EMFHelper.unload(resourceSet);
					fireWriteComplete();
				}
			};

			writeThread.start();
			allThreads.add(writeThread);


		}

		for (int i = WRITE_THREADS; i < NUM_THREADS; i++) {
			Thread readThread = new Thread() {
				@Override
				public void run() {
					try {

						int i = 0;
						while (!writeComplete) {
							// ResourceSet resourceSet = new ResourceSetImpl();
							ResourceSet resourceSet = new ThreadSafeResourceSet();
							resourceSet.getResource(modelURI, true);
							EMFHelper.unload(resourceSet);

							if (i % 5 == 0) {
								System.out.println("Read: " + i);
							}

							i++;
						}

						System.out.println("Read complete");
					} catch (Throwable ex) {
						Activator.log.error(ex);
						fail();
					}
				}
			};

			readThread.start();
			allThreads.add(readThread);
		}

		for (Thread thread : allThreads) {
			thread.join();
		}

		Assert.assertFalse(failed);
	}

	protected synchronized void fireWriteComplete() {
		writeThreadsComplete++;

		System.out.println("Write complete (" + writeThreadsComplete + "/" + WRITE_THREADS + ")");

		if (writeThreadsComplete == WRITE_THREADS) {
			writeComplete = true;
		}
	}

	protected synchronized void fail() {
		this.failed = true;
	}
}
