/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.concurrent;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.papyrus.migration.rsa.Activator;

/**
 * Thread safe pool of Transformation Executors
 *
 * @author Camille Letavernier
 *
 */
public class ExecutorsPool {

	// The cache can be used to increase performances (For small and medium sized models, most of the execution time is spent in loading the transformation)
	// Warning: using the cache prevents dynamic transformations (i.e. it should not be used in Debug Mode)
	protected boolean cacheTransformations = true;

	private final int poolSize;

	public ExecutorsPool(int size) {
		this.poolSize = size;
	}

	private final Map<URI, Pool> executors = new HashMap<URI, Pool>();

	private final Map<TransformationExecutor, URI> executorsURIs = new HashMap<TransformationExecutor, URI>();

	/**
	 * Gets an available executor for the given transformation URI. Creates it if needed,
	 * and we haven't reached the poolSize for this transformationURI
	 *
	 * Transformation executor needs to be released after usage
	 *
	 * @param transformationURI
	 * @return
	 */
	public TransformationExecutor getExecutor(URI transformationURI) {
		if (!cacheTransformations) {
			return new Pool(transformationURI).createExecutor();
		}

		synchronized (executors) {
			if (!executors.containsKey(transformationURI)) {
				executors.put(transformationURI, new Pool(transformationURI));
			}
		}

		Pool pool = executors.get(transformationURI);
		return pool.getExecutor();
	}

	/**
	 * Preloads all instances for the given URI
	 *
	 * @param transformationURI
	 * @return
	 */
	public synchronized IStatus preLoad(URI transformationURI) {
		// Don't preload if there is no cache
		if (!cacheTransformations) {
			return Status.OK_STATUS;
		}

		synchronized (this) {
			if (!executors.containsKey(transformationURI)) {
				Pool pool = new Pool(transformationURI);
				executors.put(transformationURI, pool);
				pool.preload();
			}
		}

		return Status.OK_STATUS;
	}

	/**
	 * Releases a transformation executor after usage
	 *
	 * @param executor
	 */
	public void releaseExecutor(TransformationExecutor executor) {
		if (!cacheTransformations) {
			return;
		}
		URI transformationURI = executorsURIs.get(executor);
		Pool pool = executors.get(transformationURI);
		pool.release(executor);
	}

	private class Pool {
		private List<TransformationExecutor> allExecutors = new LinkedList<TransformationExecutor>();

		private List<TransformationExecutor> busyExecutors = new LinkedList<TransformationExecutor>();

		private final URI transformationURI;

		public Pool(URI transformationURI) {
			this.transformationURI = transformationURI;
		}

		public void preload() {
			for (int i = 0; i < poolSize; i++) {
				createExecutor();
			}
			busyExecutors.clear();
		}

		public synchronized void release(TransformationExecutor executor) {
			busyExecutors.remove(executor);
		}

		public TransformationExecutor getExecutor() {
			while (true) {
				synchronized (this) {
					for (TransformationExecutor executor : allExecutors) {
						if (isAvailable(executor)) {
							return getExecutor(executor);
						}
					}

					if (allExecutors.size() < poolSize) {
						return createExecutor();
					}
				}

				try {
					Thread.sleep(25);
				} catch (InterruptedException ex) {
					Activator.log.error(ex);
					return null;
				}
			}
		}

		private boolean isAvailable(TransformationExecutor executor) {
			return !busyExecutors.contains(executor);
		}

		private TransformationExecutor getExecutor(TransformationExecutor executor) {
			busyExecutors.add(executor);
			return executor;
		}

		private TransformationExecutor createExecutor() {
			TransformationExecutor executor = new TransformationExecutor(transformationURI);
			executor.loadTransformation();
			allExecutors.add(executor);
			executorsURIs.put(executor, transformationURI);
			return getExecutor(executor);
		}

	}
}
