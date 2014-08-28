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

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.IService;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.tools.util.UIUtil;
import org.eclipse.papyrus.uml.modelrepair.service.IStereotypeRepairService;
import org.eclipse.swt.widgets.Display;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;


/**
 * The implementation of the stereotype repair service.
 */
public class StereotypeRepairService implements IStereotypeRepairService, IService {

	private static final Lock lock = new ReentrantLock();

	private static final Condition finishedRepairCond = lock.newCondition();

	private static final Map<ModelSet, Set<Resource>> modelSetsInRepair = Maps.newIdentityHashMap();

	private static final Set<PostRepairExecutor> pending = Sets.newLinkedHashSet();

	private static ExecutorService pendingExecutor;

	private ServicesRegistry registry;

	private ModelSet modelSet;

	private ExecutorService executor;

	public StereotypeRepairService() {
		super();
	}

	//
	// Service API
	//

	public boolean isRepairing() {
		return isInRepair(modelSet);
	}

	public ExecutorService getPostRepairExecutor() {
		return executor;
	}

	//
	// Service lifecycle
	//

	public void init(ServicesRegistry servicesRegistry) throws ServiceException {
		this.registry = servicesRegistry;
	}

	public void startService() throws ServiceException {
		modelSet = registry.getService(ModelSet.class);
		executor = new PostRepairExecutor(UIUtil.createUIExecutor(Display.getDefault()));
	}

	public void disposeService() throws ServiceException {
		modelSet = null;
		registry = null;

		if (executor != null) {
			// Don't need to run any tasks still pending because the model-set, editor, everything are all gone
			executor.shutdownNow();
			executor = null;
		}
	}

	//
	// Private API
	//

	static boolean isInRepair(ModelSet modelSet) {
		lock.lock();
		try {
			return modelSetsInRepair.containsKey(modelSet);
		} finally {
			lock.unlock();
		}
	}

	static void startedRepairing(ModelSet modelSet, Resource resource) {
		lock.lock();
		try {
			Set<Resource> resources = modelSetsInRepair.get(modelSet);
			if (resources == null) {
				resources = Sets.newIdentityHashSet();
				modelSetsInRepair.put(modelSet, resources);
			}
			resources.add(resource);
		} finally {
			lock.unlock();
		}
	}

	static void finishedRepairing(ModelSet modelSet, Resource resource) {
		lock.lock();
		try {
			Set<Resource> resources = modelSetsInRepair.get(modelSet);
			if (resources != null) {
				resources.remove(resource);
				if (resources.isEmpty()) {
					modelSetsInRepair.remove(modelSet);
					finishedRepairCond.signalAll();
				}
			}
		} finally {
			lock.unlock();
		}
	}

	private static void pending(PostRepairExecutor executor) {
		lock.lock();
		try {
			pending.add(executor);

			if (pendingExecutor == null) {
				pendingExecutor = Executors.newSingleThreadExecutor();
				start(pendingExecutor);
			}
		} finally {
			lock.unlock();
		}
	}

	private static void start(final ExecutorService executor) {
		lock.lock();
		try {
			executor.execute(new Runnable() {

				public void run() {
					lock.lock();
					try {
						try {
							finishedRepairCond.await();
						} catch (InterruptedException e) {
							// Doesn't matter. We'll just re-schedule. But, who would interrupt me?
						}

						for (Iterator<PostRepairExecutor> iter = pending.iterator(); iter.hasNext();) {
							if (iter.next().processPending()) {
								iter.remove();
							}
						}

						// Re-schedule me
						executor.execute(this);
					} finally {
						lock.unlock();
					}
				}
			});
		} finally {
			lock.unlock();
		}
	}

	//
	// Nested types
	//

	protected class PostRepairExecutor extends AbstractExecutorService {

		private final ExecutorService delegate;

		private volatile boolean shutdown;

		private final Lock lock = new ReentrantLock();

		private List<Runnable> pending = Lists.newLinkedList();

		protected PostRepairExecutor(ExecutorService delegate) {
			this.delegate = delegate;
		}

		public void execute(Runnable command) {
			if (shutdown) {
				throw new RejectedExecutionException("Executor is shut down"); //$NON-NLS-1$
			}

			if (!isInRepair(modelSet)) {
				// Fire away
				try {
					delegate.execute(command);
				} catch (RejectedExecutionException e) {
					// Must be shut down. Fine
				}
			} else {
				lock.lock();
				try {
					pending.add(command);

					// Add me to the list for processing when some repair operation finishes
					pending(this);
				} finally {
					lock.unlock();
				}
			}
		}

		public void shutdown() {
			shutdown = true;
			delegate.shutdown();
		}

		public List<Runnable> shutdownNow() {
			shutdown = true;

			List<Runnable> result = Lists.newArrayList();

			lock.lock();
			try {
				result.addAll(pending);
				pending.clear();
			} finally {
				lock.unlock();
			}

			result.addAll(delegate.shutdownNow());

			return result;
		}

		public boolean isShutdown() {
			return shutdown;
		}

		public boolean isTerminated() {
			return shutdown && delegate.isTerminated();
		}

		public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
			return delegate.awaitTermination(timeout, unit);
		}

		boolean processPending() {
			boolean result = !isInRepair(modelSet);

			if (result) {
				lock.lock();
				try {
					try {
						for (Runnable next : pending) {
							delegate.execute(next);
						}
					} catch (RejectedExecutionException e) {
						// Must be shut down. Fine
					}
					pending.clear();
				} finally {
					lock.unlock();
				}
			}

			return result;
		}
	}
}
