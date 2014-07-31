/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (camille.letavernier@cea.fr) - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 437217
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.core.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.core.Activator;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.editor.IReloadableEditor;
import org.eclipse.papyrus.infra.core.editor.IReloadableEditor.DirtyPolicy;
import org.eclipse.papyrus.infra.core.lifecycleevents.DoSaveEvent;
import org.eclipse.papyrus.infra.core.lifecycleevents.ILifeCycleEventsProvider;
import org.eclipse.papyrus.infra.core.lifecycleevents.ISaveEventListener;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.progress.IWorkbenchSiteProgressService;
import org.eclipse.ui.progress.UIJob;

import com.google.common.collect.Maps;

/**
 * A Service to check workspace modifications on current resources
 *
 * @author Camille Letavernier
 *
 */
public class ResourceUpdateService implements IService, IPartListener {

	protected ServicesRegistry registry;

	protected ModelSet modelSet;

	static int[] handledTypes = new int[]{ IResourceChangeEvent.POST_CHANGE, IResourceChangeEvent.PRE_DELETE, IResourceChangeEvent.PRE_CLOSE };

	protected boolean isSaving;

	protected ConcurrentMap<IMultiDiagramEditor, Job> pendingEditorCloseJobs = Maps.newConcurrentMap();

	private final ISaveEventListener preSaveListener = new ISaveEventListener() {

		@Override
		public void doSaveAs(DoSaveEvent event) {
			isSaving = true;
		}

		@Override
		public void doSave(DoSaveEvent event) {
			isSaving = true;
		}
	};

	private final ISaveEventListener postSaveListener = new ISaveEventListener() {

		@Override
		public void doSaveAs(DoSaveEvent event) {
			isSaving = false;
		}

		@Override
		public void doSave(DoSaveEvent event) {
			isSaving = false;
		}
	};

	@Override
	public void init(ServicesRegistry servicesRegistry) throws ServiceException {
		this.registry = servicesRegistry;
	}

	@Override
	public void startService() throws ServiceException {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
		modelSet = registry.getService(ModelSet.class);
		registry.getService(ILifeCycleEventsProvider.class).addAboutToDoSaveListener(preSaveListener);
		registry.getService(ILifeCycleEventsProvider.class).addPostDoSaveListener(postSaveListener);
	}

	@Override
	public void disposeService() throws ServiceException {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);
		modelSet = null;
	}

	protected void closeEditor() {
		closeEditor(Collections.<Resource> emptyList(), false);
	}

	protected void closeEditor(final Collection<? extends Resource> triggeringResources, final boolean reopen) {
		try {
			if(!reopen) {
				registry.remove(SaveLayoutBeforeClose.class.getName());
			}

			final IMultiDiagramEditor editor = registry.getService(IMultiDiagramEditor.class);
			if(editor != null) {
				final IWorkbenchPartSite site = editor.getSite();
				UIJob closeEditorJob = new UIJob(site.getShell().getDisplay(), NLS.bind("Reload editor {0}", editor.getTitle())) {

					@Override
					public IStatus runInUIThread(IProgressMonitor monitor) {
						// Remove the pending job
						pendingEditorCloseJobs.remove(editor);

						IStatus result = Status.OK_STATUS;
						monitor = SubMonitor.convert(monitor, IProgressMonitor.UNKNOWN);

						try {
							IReloadableEditor.ReloadReason reason = reopen ? IReloadableEditor.ReloadReason.RESOURCES_CHANGED : IReloadableEditor.ReloadReason.RESOURCES_DELETED;

							DirtyPolicy dirtyPolicy = DirtyPolicy.getDefault();
							if(!reopen && !editor.isDirty()) {
								// Check whether we're deleting one of our own resources. If so, just close
								URI principalURI = modelSet.getURIWithoutExtension();
								for(Resource next : triggeringResources) {
									if(next.getURI().trimFileExtension().equals(principalURI)) {
										dirtyPolicy = DirtyPolicy.DO_NOT_SAVE;
										break;
									}
								}
							}

							try {
								IReloadableEditor.Adapter.getAdapter(editor).reloadEditor(triggeringResources, reason, dirtyPolicy);
							} catch (CoreException e) {
								result = e.getStatus();
							}
						} finally {
							monitor.done();
						}

						return result;
					}
				};

				// We are notified usually of at least three resources (*.di, *.notation, *.uml) that are unloaded, but
				// there's no need to close and re-open the same editor three times
				if(pendingEditorCloseJobs.putIfAbsent(editor, closeEditorJob) == null) {
					//Async execution to avoid lock conflicts on the Workspace (Probably owned by this thread, and not the UI thread)
					IWorkbenchSiteProgressService progressService = (IWorkbenchSiteProgressService)site.getService(IWorkbenchSiteProgressService.class);
					progressService.schedule(closeEditorJob);
				}
			}
		} catch (ServiceException ex) {
			//Nothing
		}
	}

	protected void handleResourcesRemoved(Collection<Resource> emfResources) {
		closeEditor(emfResources, false);
	}

	protected void handleResourceChanged(Collection<Resource> emfResources) {
		closeEditor(emfResources, true);
	}

	//Copied from org.eclipse.emf.ecore.presentation.EcoreEditor
	protected IResourceChangeListener resourceChangeListener = new IResourceChangeListener() {

		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			IResourceDelta delta = event.getDelta();
			try {
				class ResourceDeltaVisitor implements IResourceDeltaVisitor {

					protected Collection<Resource> changedResources = new ArrayList<Resource>();

					protected Collection<Resource> removedResources = new ArrayList<Resource>();

					@Override
					public boolean visit(final IResourceDelta delta) {
						if(delta.getResource().getType() == IResource.FILE) {
							if(delta.getKind() == IResourceDelta.REMOVED || delta.getKind() == IResourceDelta.CHANGED) {
								URI resourceURI = URI.createPlatformResourceURI(delta.getFullPath().toString(), true);
								Resource resource = modelSet.getResource(resourceURI, false);
								if(resource == null) {
									// try again, with a pluginURI, see bug 418428
									URI pluginURI = URI.createPlatformPluginURI(delta.getFullPath().toString(), true);
									resource = modelSet.getResource(pluginURI, false);
								}
								if(resource != null) {

									if(delta.getKind() == IResourceDelta.REMOVED) {
										removedResources.add(resource);
									} else {
										if((delta.getFlags() & IResourceDelta.MARKERS) != 0) {
											//Skip markers
											//DiagnosticDecorator.DiagnosticAdapter.update(resource, markerHelper.getMarkerDiagnostics(resource, (IFile)delta.getResource()));
										}
										if((delta.getFlags() & IResourceDelta.CONTENT) != 0) {
											//if(!savedResources.remove(resource)) {
											//		changedResources.add(resource);
											//}
											if(!isSaving) {
												changedResources.add(resource);
											}
										}
									}
								}
							}
							return false;
						}

						return true;
					}

					public Collection<Resource> getChangedResources() {
						return changedResources;
					}

					public Collection<Resource> getRemovedResources() {
						return removedResources;
					}
				}

				final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();

				delta.accept(visitor);

				if(!visitor.getRemovedResources().isEmpty()) {
					handleResourcesRemoved(visitor.getRemovedResources());
				}

				if(!visitor.getChangedResources().isEmpty()) {
					handleResourceChanged(visitor.getChangedResources());
				}
			} catch (CoreException exception) {
				Activator.log.error(exception);
			}
		}
	};

	@Override
	public void partActivated(IWorkbenchPart part) {
		//Nothing
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
		//Nothing
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
		//Nothing
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
		//Nothing
	}

	@Override
	public void partOpened(IWorkbenchPart part) {
		//Nothing
	}

}
