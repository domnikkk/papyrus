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

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.core.runtime.content.IContentTypeManager;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.core.utils.JobBasedFuture;
import org.eclipse.papyrus.infra.emf.Activator;

import com.google.common.base.Function;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Queues;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/**
 * A general-purpose index of model resources in the Eclipse workspace.
 */
public class WorkspaceModelIndex<T> {
	private static final int MAX_INDEX_RETRIES = 3;

	private final IndexHandler<? extends T> indexer;

	private final QualifiedName indexKey;
	private final IContentTypeManager mgr;
	private final IContentType contentType;

	private final SetMultimap<IProject, IFile> index = HashMultimap.create();
	private final IResourceChangeListener workspaceListener = new WorkspaceListener();

	private final Map<IProject, AbstractIndexJob> activeJobs = Maps.newHashMap();
	private final JobWrangler jobWrangler;

	private final CopyOnWriteArrayList<IWorkspaceModelIndexListener> listeners = Lists.newCopyOnWriteArrayList();

	public WorkspaceModelIndex(String name, String contentType, IndexHandler<? extends T> indexer) {
		this(name, contentType, indexer, 0);
	}

	public WorkspaceModelIndex(String name, String contentType, IndexHandler<? extends T> indexer, int maxConcurrentJobs) {
		super();

		this.indexKey = new QualifiedName("org.eclipse.papyrus.modelindex", name); //$NON-NLS-1$
		this.mgr = Platform.getContentTypeManager();
		this.contentType = this.mgr.getContentType(contentType);
		this.indexer = indexer;

		jobWrangler = new JobWrangler(maxConcurrentJobs);

		startIndex();
	}

	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(workspaceListener);
		Job.getJobManager().cancel(this);

		synchronized (index) {
			for (IFile next : index.values()) {
				try {
					next.setSessionProperty(indexKey, null);
				} catch (CoreException e) {
					// Just continue, best-effort. There's nothing else to do
				}
			}

			index.clear();
		}
	}

	private void startIndex() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		workspace.addResourceChangeListener(workspaceListener, IResourceChangeEvent.POST_CHANGE);

		index(Arrays.asList(workspace.getRoot().getProjects()));
	}

	void index(Collection<? extends IProject> projects) {
		List<Job> jobs = Lists.newArrayListWithCapacity(projects.size());
		for (IProject next : projects) {
			jobs.add(new IndexProjectJob(next));
		}
		schedule(jobs);
	}

	/**
	 * Obtains an asynchronous future result that is scheduled to run after any pending indexing work has completed.
	 * The {@code function} is <em>not</em> invoked under synchronization on the index; it is passed a copy of the
	 * last consistent state of the index after any pending calculations have completed.
	 * 
	 * @param function
	 *            the function to schedule. Its input is the complete index map
	 * 
	 * @return the future result of the function applied to the index
	 */
	public <V> ListenableFuture<V> afterIndex(final Function<? super Map<IFile, T>, V> function) {
		return Futures.transform(getIndex(), function);
	}

	/**
	 * Obtains an asynchronous future result that is scheduled to run after any pending indexing work has completed.
	 * The {@code callable} is invoked under synchronization on the index, so it must be careful about how it
	 * synchronizes on other objects to avoid deadlocks.
	 * 
	 * @param callable
	 *            the operation to schedule
	 * 
	 * @return the future result of the operation
	 */
	public <V> ListenableFuture<V> afterIndex(final Callable<V> callable) {
		ListenableFuture<V> result;

		if (Job.getJobManager().find(this).length == 0) {
			// Result is available now
			try {
				result = Futures.immediateFuture(callable.call());
			} catch (Exception e) {
				result = Futures.immediateFailedFuture(e);
			}
		} else {
			JobBasedFuture<V> job = new JobBasedFuture<V>(NLS.bind("Wait for model index \"{0}\"", indexKey.getLocalName())) {
				{
					// setSystem(true);
				}

				@Override
				protected V compute(IProgressMonitor monitor) throws Exception {
					V result;

					Job.getJobManager().join(WorkspaceModelIndex.this, monitor);
					synchronized (index) {
						result = callable.call();
					}

					return result;
				}
			};
			job.schedule();
			result = job;
		}

		return result;
	}

	/**
	 * Schedules an operation to run after any pending indexing work has completed.
	 * The {@code runnable} is invoked under synchronization on the index, so it must be careful about how it
	 * synchronizes on other objects to avoid deadlocks.
	 * 
	 * @param runnable
	 *            the operation to schedule
	 */
	public void afterIndex(final Runnable runnable) {
		afterIndex(new Callable<Void>() {
			@Override
			public Void call() throws Exception {
				runnable.run();
				return null;
			}
		});
	}

	/**
	 * Obtains the index when it is ready.
	 * 
	 * @return the future value of the index, when it is ready
	 */
	public ListenableFuture<Map<IFile, T>> getIndex() {
		return afterIndex(new Callable<Map<IFile, T>>() {
			@Override
			public Map<IFile, T> call() {
				return map();
			}
		});
	}

	/**
	 * @precondition The {@link #index} monitor is held.
	 */
	private Map<IFile, T> map() {
		ImmutableMap.Builder<IFile, T> result = ImmutableMap.builder();

		for (IFile next : index.values()) {
			try {
				@SuppressWarnings("unchecked")
				T value = (T) next.getSessionProperty(indexKey);
				if (value != null) {
					result.put(next, value);
				}
			} catch (CoreException e) {
				Activator.log.error("Failed to access index data for file " + next.getFullPath(), e); //$NON-NLS-1$
			}
		}

		return result.build();
	}

	void process(IFile file) throws CoreException {
		IProject project = file.getProject();

		if (match(file)) {
			add(project, file);
		} else {
			remove(project, file);
		}
	}

	boolean match(IFile file) {
		boolean result = false;

		if (file.isAccessible()) {
			InputStream input = null;

			try {
				input = file.getContents(true);
				IContentType[] contentTypes = mgr.findContentTypesFor(input, file.getName());
				for (int i = 0; (i < contentTypes.length) && !result; i++) {
					result = contentTypes[i].isKindOf(contentType);
				}
			} catch (Exception e) {
				Activator.log.error("Failed to index file " + file.getFullPath(), e); //$NON-NLS-1$
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						Activator.log.error("Failed to close indexed file " + file.getFullPath(), e); //$NON-NLS-1$
					}
				}
			}
		}

		return result;
	}

	void add(IProject project, IFile file) throws CoreException {
		synchronized (index) {
			index.put(project, file);
			file.setSessionProperty(indexKey, indexer.index(file));
		}
	}

	void remove(IProject project, IFile file) throws CoreException {
		synchronized (index) {
			index.remove(project, file);
			indexer.unindex(file);

			if (file.exists()) {
				file.setSessionProperty(indexKey, null);
			}
		}
	}

	void remove(IProject project) throws CoreException {
		synchronized (index) {
			if (index.containsKey(project)) {
				for (IFile next : index.get(project)) {
					indexer.unindex(next);
				}
				index.removeAll(project);
			}
		}
	}

	ReindexProjectJob reindex(IProject project, Iterable<? extends IndexDelta> deltas) {
		ReindexProjectJob result = null;

		synchronized (activeJobs) {
			AbstractIndexJob active = activeJobs.get(project);

			if (active != null) {
				switch (active.kind()) {
				case REINDEX:
					@SuppressWarnings("unchecked")
					ReindexProjectJob reindex = (ReindexProjectJob) active;
					reindex.addDeltas(deltas);
					break;
				case INDEX:
					@SuppressWarnings("unchecked")
					IndexProjectJob index = (IndexProjectJob) active;
					ReindexProjectJob followup = index.getFollowup();
					if (followup != null) {
						followup.addDeltas(deltas);
					} else {
						followup = new ReindexProjectJob(project, deltas);
						index.setFollowup(followup);
					}
					break;
				case MASTER:
					throw new IllegalStateException("Master job is in the active table."); //$NON-NLS-1$
				}
			} else {
				// No active job. We'll need a new one
				result = new ReindexProjectJob(project, deltas);
			}
		}

		return result;
	}

	IResourceVisitor getWorkspaceVisitor(final IProgressMonitor monitor) {
		return new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource.getType() == IResource.FILE) {
					process((IFile) resource);
				}

				return !monitor.isCanceled();
			}
		};
	}

	private void schedule(Collection<? extends Job> jobs) {
		// Synchronize on the active jobs because this potentially alters the wrangler's follow-up job
		synchronized (activeJobs) {
			jobWrangler.add(jobs);
		}
	}

	public void addListener(IWorkspaceModelIndexListener listener) {
		listeners.addIfAbsent(listener);
	}

	public void removeListener(IWorkspaceModelIndexListener listener) {
		listeners.remove(listener);
	}

	private void notifyStarting(AbstractIndexJob indexJob) {
		if (!listeners.isEmpty()) {
			WorkspaceModelIndexEvent event;

			switch (indexJob.kind()) {
			case INDEX:
				event = new WorkspaceModelIndexEvent(this, WorkspaceModelIndexEvent.ABOUT_TO_CALCULATE, indexJob.getProject());
				for (IWorkspaceModelIndexListener next : listeners) {
					try {
						next.indexAboutToCalculate(event);
					} catch (Exception e) {
						Activator.log.error("Uncaught exception in index listsner.", e); //$NON-NLS-1$
					}
				}
				break;
			case REINDEX:
				event = new WorkspaceModelIndexEvent(this, WorkspaceModelIndexEvent.ABOUT_TO_RECALCULATE, indexJob.getProject());
				for (IWorkspaceModelIndexListener next : listeners) {
					try {
						next.indexAboutToRecalculate(event);
					} catch (Exception e) {
						Activator.log.error("Uncaught exception in index listsner.", e); //$NON-NLS-1$
					}
				}
				break;
			case MASTER:
				// Pass
				break;
			}
		}
	}

	private void notifyFinished(AbstractIndexJob indexJob, IStatus status) {
		if (!listeners.isEmpty()) {
			WorkspaceModelIndexEvent event;

			if ((status != null) && (status.getSeverity() >= IStatus.ERROR)) {
				event = new WorkspaceModelIndexEvent(this, WorkspaceModelIndexEvent.FAILED, indexJob.getProject());
				for (IWorkspaceModelIndexListener next : listeners) {
					try {
						next.indexFailed(event);
					} catch (Exception e) {
						Activator.log.error("Uncaught exception in index listsner.", e); //$NON-NLS-1$
					}
				}
			} else {
				switch (indexJob.kind()) {
				case INDEX:
					event = new WorkspaceModelIndexEvent(this, WorkspaceModelIndexEvent.CALCULATED, indexJob.getProject());
					for (IWorkspaceModelIndexListener next : listeners) {
						try {
							next.indexCalculated(event);
						} catch (Exception e) {
							Activator.log.error("Uncaught exception in index listsner.", e); //$NON-NLS-1$
						}
					}
					break;
				case REINDEX:
					event = new WorkspaceModelIndexEvent(this, WorkspaceModelIndexEvent.RECALCULATED, indexJob.getProject());
					for (IWorkspaceModelIndexListener next : listeners) {
						try {
							next.indexRecalculated(event);
						} catch (Exception e) {
							Activator.log.error("Uncaught exception in index listsner.", e); //$NON-NLS-1$
						}
					}
					break;
				case MASTER:
					// Pass
					break;
				}
			}
		}
	}

	//
	// Nested types
	//

	/**
	 * Callback interface for the index client to update the index.
	 */
	public static interface IndexHandler<T> {
		/**
		 * Updates the index for a file that matches our selection criteria.
		 * 
		 * @param file
		 *            a file that exists and matches the index selection criteria
		 * 
		 * @return the object to store in the index for this {@code file}
		 */
		T index(IFile file);

		/**
		 * Updates the index for a file that no longer exists or no longer matches our selection criteria.
		 * 
		 * @param file
		 *            a file that no longer exists or otherwise no longer matches our selection criteria. It is removed from the index
		 */
		void unindex(IFile file);
	}

	private enum JobKind {
		MASTER, INDEX, REINDEX;

		boolean isSystem() {
			return this != MASTER;
		}
	}

	private abstract class AbstractIndexJob extends Job {
		private final IProject project;

		AbstractIndexJob(String name, IProject project) {
			super(name);

			this.project = project;

			if (project != null) {
				setRule(project);
				synchronized (activeJobs) {
					if (!activeJobs.containsKey(project)) {
						activeJobs.put(project, this);
					}
				}
			}

			setSystem(kind().isSystem());
		}

		@Override
		public boolean belongsTo(Object family) {
			return family == WorkspaceModelIndex.this;
		}

		final IProject getProject() {
			return project;
		}

		abstract JobKind kind();

		@Override
		protected final IStatus run(IProgressMonitor monitor) {
			IStatus result;

			try {
				result = doRun(monitor);
			} finally {
				synchronized (activeJobs) {
					AbstractIndexJob followup = getFollowup();

					if (project != null) {
						if (followup == null) {
							activeJobs.remove(project);
						} else {
							activeJobs.put(project, followup);
						}
					}

					if (followup != null) {
						// Kick off the follow-up job
						followup.schedule();
					}
				}
			}

			return result;
		}

		protected abstract IStatus doRun(IProgressMonitor monitor);

		protected AbstractIndexJob getFollowup() {
			return null;
		}
	}

	private class JobWrangler extends AbstractIndexJob {
		private final Queue<Job> queue = Queues.newArrayDeque();
		private final Set<Job> pending = Sets.newHashSet();
		private final Set<IProject> failedProjects = Sets.newHashSet();

		private final Lock pendingLock = new ReentrantLock();
		private final Condition pendingCheck = pendingLock.newCondition();

		private final int maxPending;

		JobWrangler(int maxConcurrentJobs) {
			super("Workspace model indexer", null);

			this.maxPending = (maxConcurrentJobs <= 0) ? Integer.MAX_VALUE : maxConcurrentJobs;
		}

		@Override
		JobKind kind() {
			return JobKind.MASTER;
		}

		void add(Iterable<? extends Job> jobs) {
			pendingLock.lock();

			try {
				if (queue.isEmpty() && pending.isEmpty()) {
					// I am a new job
					schedule();
				}

				Iterables.addAll(queue, jobs);
				pendingCheck.signalAll();
			} finally {
				pendingLock.unlock();
			}
		}

		@Override
		protected IStatus doRun(IProgressMonitor monitor) {
			IJobChangeListener listener = new JobChangeAdapter() {
				private final Map<IProject, Integer> retries = Maps.newHashMap();

				@Override
				public void aboutToRun(IJobChangeEvent event) {
					Job starting = event.getJob();

					if (pending.contains(starting)) {
						// one of mine is starting
						@SuppressWarnings("unchecked")
						AbstractIndexJob indexJob = (AbstractIndexJob) starting;
						notifyStarting(indexJob);
					}
				}

				@Override
				public void done(IJobChangeEvent event) {
					pendingLock.lock();
					try {
						final Job finished = event.getJob();
						if (pending.remove(finished)) {
							// one of mine finished
							pendingCheck.signalAll();

							@SuppressWarnings("unchecked")
							AbstractIndexJob indexJob = (AbstractIndexJob) finished;
							IProject project = indexJob.getProject();

							notifyFinished(indexJob, event.getResult());

							if ((event.getResult() != null) && (event.getResult().getSeverity() >= IStatus.ERROR)) {
								// Indexing failed to complete. Need to re-build the index
								if (project != null) {
									int count = retries.containsKey(project) ? retries.get(project) : 0;
									if (count++ < MAX_INDEX_RETRIES) {
										// Only retry up to three times
										failedProjects.add(project);
									}
									retries.put(project, ++count);
								}
							}
						}
					} finally {
						pendingLock.unlock();
					}
				}
			};

			getJobManager().addJobChangeListener(listener);

			try {
				pendingLock.lock();

				try {
					for (;;) {
						for (Job next = queue.poll(); next != null; next = queue.poll()) {
							while (pending.size() >= maxPending) {
								pendingCheck.awaitUninterruptibly();
							}
							pending.add(next);
							next.schedule();
						}

						if (pending.isEmpty() && queue.isEmpty()) {
							if (failedProjects.isEmpty()) {
								// Done with wrangling jobs, for now
								break;
							} else {
								// Rebuild the index for these projects, from scratch
								index(failedProjects); // This adds to my queue
								failedProjects.clear();
							}
						} else {
							// Wait for something new to come into the queue or for the pending set to drain
							pendingCheck.awaitUninterruptibly();
						}
					}
				} finally {
					pendingLock.unlock();
				}
			} finally {
				getJobManager().removeJobChangeListener(listener);
			}

			return Status.OK_STATUS;
		}
	}

	private class IndexProjectJob extends AbstractIndexJob {
		private ReindexProjectJob followup;

		IndexProjectJob(IProject project) {
			super("Indexing project " + project.getName(), project);
		}

		@Override
		JobKind kind() {
			return JobKind.INDEX;
		}

		@Override
		protected IStatus doRun(IProgressMonitor monitor) {
			IStatus result = Status.OK_STATUS;
			final IProject project = getProject();

			monitor.beginTask("Indexing models in project " + project.getName(), IProgressMonitor.UNKNOWN);

			try {
				if (project.isAccessible()) {
					project.accept(getWorkspaceVisitor(monitor));
				} else {
					remove(project);
				}

				if (monitor.isCanceled()) {
					result = Status.CANCEL_STATUS;
				}
			} catch (CoreException e) {
				result = e.getStatus();
			} finally {
				monitor.done();
			}

			return result;
		}

		void setFollowup(ReindexProjectJob followup) {
			this.followup = followup;
		}

		@Override
		protected ReindexProjectJob getFollowup() {
			return followup;
		}
	}

	private class WorkspaceListener implements IResourceChangeListener {
		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			final Multimap<IProject, IndexDelta> deltas = ArrayListMultimap.create();

			try {
				event.getDelta().accept(new IResourceDeltaVisitor() {

					@Override
					public boolean visit(IResourceDelta delta) throws CoreException {
						if (delta.getResource().getType() == IResource.FILE) {
							IFile file = (IFile) delta.getResource();

							switch (delta.getKind()) {
							case IResourceDelta.CHANGED:
								if ((delta.getFlags() & (IResourceDelta.SYNC | IResourceDelta.CONTENT | IResourceDelta.REPLACED)) != 0) {
									// Re-index in place
									deltas.put(file.getProject(), new IndexDelta(file, IndexDelta.DeltaKind.REINDEX));
								}
								break;
							case IResourceDelta.REMOVED:
								deltas.put(file.getProject(), new IndexDelta(file, IndexDelta.DeltaKind.UNINDEX));
								break;
							case IResourceDelta.ADDED:
								deltas.put(file.getProject(), new IndexDelta(file, IndexDelta.DeltaKind.INDEX));
								break;
							}
						}
						return true;
					}
				});
			} catch (CoreException e) {
				Activator.log.error("Failed to analyze resource changes for re-indexing.", e); //$NON-NLS-1$
			}

			if (!deltas.isEmpty()) {
				List<Job> jobs = Lists.newArrayListWithCapacity(deltas.keySet().size());
				for (IProject next : deltas.keySet()) {
					ReindexProjectJob reindex = reindex(next, deltas.get(next));
					if (reindex != null) {
						jobs.add(reindex);
					}
				}
				schedule(jobs);
			}
		}
	}

	private static class IndexDelta {
		private final IFile file;

		private final DeltaKind kind;

		IndexDelta(IFile file, DeltaKind kind) {
			this.file = file;
			this.kind = kind;
		}

		//
		// Nested types
		//

		enum DeltaKind {
			INDEX, REINDEX, UNINDEX
		}
	}

	private class ReindexProjectJob extends AbstractIndexJob {
		private final IProject project;
		private final ConcurrentLinkedQueue<IndexDelta> deltas;

		ReindexProjectJob(IProject project, Iterable<? extends IndexDelta> deltas) {
			super("Re-indexing project " + project.getName(), project);
			this.project = project;
			this.deltas = Queues.newConcurrentLinkedQueue(deltas);
		}

		@Override
		JobKind kind() {
			return JobKind.REINDEX;
		}

		void addDeltas(Iterable<? extends IndexDelta> deltas) {
			Iterables.addAll(this.deltas, deltas);
		}

		@Override
		protected IStatus doRun(IProgressMonitor monitor) {
			IStatus result = Status.OK_STATUS;

			monitor.beginTask("Re-indexing models in project " + project.getName(), IProgressMonitor.UNKNOWN);

			try {
				for (IndexDelta next = deltas.poll(); next != null; next = deltas.poll()) {
					if (monitor.isCanceled()) {
						result = Status.CANCEL_STATUS;
						break;
					}

					try {
						switch (next.kind) {
						case INDEX:
						case REINDEX:
							process(next.file);
							break;
						case UNINDEX:
							remove(project, next.file);
							break;
						}
					} catch (CoreException e) {
						result = e.getStatus();
						break;
					} finally {
						monitor.worked(1);
					}
				}
			} finally {
				monitor.done();
			}

			return result;
		}

		@Override
		protected AbstractIndexJob getFollowup() {
			// If I still have work to do, then I am my own follow-up
			return deltas.isEmpty() ? null : this;
		}
	}
}
