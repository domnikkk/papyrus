/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.cdo.internal.ui.editors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.net4j.util.lifecycle.ILifecycle;
import org.eclipse.net4j.util.lifecycle.LifecycleEventAdapter;
import org.eclipse.papyrus.cdo.core.IPapyrusRepository;
import org.eclipse.papyrus.cdo.core.IResourceSetDisposalApprover;
import org.eclipse.papyrus.cdo.internal.core.IInternalPapyrusRepository;
import org.eclipse.papyrus.cdo.internal.core.PapyrusRepositoryManager;
import org.eclipse.papyrus.cdo.internal.ui.Activator;
import org.eclipse.papyrus.cdo.internal.ui.util.UIUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * This is the PapyrusCDOEditorManager type. Enjoy.
 */
public class PapyrusCDOEditorManager {

	public static final PapyrusCDOEditorManager INSTANCE = new PapyrusCDOEditorManager();

	private BiMap<IEditorPart, CDOView> editors = HashBiMap.create();

	private Cache<IWorkbenchPage, EditorListener> editorListeners = CacheBuilder
		.newBuilder().weakKeys()
		.build(new CacheLoader<IWorkbenchPage, EditorListener>() {

			@Override
			public EditorListener load(IWorkbenchPage key) {
				EditorListener result = new EditorListener();
				key.addPartListener(result);
				return result;
			}
		});

	private IResourceSetDisposalApprover disposalApprover;

	private PapyrusCDOEditorManager() {
		super();
	}

	public IEditorPart openEditor(IWorkbenchPage page, URI uri, String name)
			throws PartInitException {

		IInternalPapyrusRepository repository = getRepository(uri);
		repository.addResourceSetDisposalApprover(getDisposalApprover());

		IEditorPart result = page.openEditor(new PapyrusCDOEditorInput(uri,
			name), "org.eclipse.papyrus.infra.core.papyrusEditor");

		EditingDomain domain = (EditingDomain) result
			.getAdapter(EditingDomain.class);
		ResourceSet resourceSet = domain.getResourceSet();

		CDOView view = repository.getCDOView(resourceSet);
		add(view, result);

		if (view instanceof CDOTransaction) {
			view.addListener(new PapyrusTransactionListener());
		}

		return result;
	}

	private IResourceSetDisposalApprover getDisposalApprover() {
		if (disposalApprover == null) {
			disposalApprover = new ResourceSetDisposalApprover();
		}

		return disposalApprover;
	}

	IInternalPapyrusRepository getRepository(URI uri) {
		return (IInternalPapyrusRepository) PapyrusRepositoryManager.INSTANCE
			.getRepositoryForURI(uri);
	}

	void add(CDOView view, IEditorPart editor) {
		editors.put(editor, view);

		view.addListener(new CDOViewListener(editor));
		try {
			editorListeners.get(editor.getSite().getPage()).addEditor(editor);
		} catch (Exception e) {
			// this should be impossible with our cache loader
			Activator.log.error(e);
		}
	}

	void closed(IEditorPart editor) {
		editors.remove(editor);
		DawnEditorAdapter.removeAdapter(editor);
	}

	//
	// Nested types
	//

	private class CDOViewListener
			extends LifecycleEventAdapter {

		private final IEditorPart editor;

		CDOViewListener(IEditorPart editor) {
			this.editor = editor;
		}

		@Override
		protected void onDeactivated(ILifecycle lifecycle) {
			UIUtil.later(new Runnable() {

				public void run() {
					if (editors.containsKey(editor)) {
						editor.getSite().getPage().closeEditor(editor, false);
					}
				}
			});

			lifecycle.removeListener(this);
		}
	}

	private class EditorListener
			implements IPartListener {

		private Set<IEditorPart> editors = Sets.newHashSet();

		void addEditor(IEditorPart editor) {
			editors.add(editor);
		}

		public void partClosed(IWorkbenchPart part) {
			if (editors.remove(part)) {
				IEditorPart editor = (IEditorPart) part;
				closed(editor);
			}
		}

		public void partActivated(IWorkbenchPart part) {
			// pass
		}

		public void partBroughtToTop(IWorkbenchPart part) {
			// pass
		}

		public void partDeactivated(IWorkbenchPart part) {
			// pass
		}

		public void partOpened(IWorkbenchPart part) {
			// pass
		}
	}

	private class ResourceSetDisposalApprover
			implements IResourceSetDisposalApprover {

		public DisposeAction disposalRequested(IPapyrusRepository repository,
				Collection<ResourceSet> resourceSets) {

			DisposeAction result = DisposeAction.CLOSE;
			IInternalPapyrusRepository internal = (IInternalPapyrusRepository) repository;
			final List<IEditorPart> dirty = Lists.newArrayList();

			for (ResourceSet next : resourceSets) {
				CDOView view = internal.getCDOView(next);
				IEditorPart editor = editors.inverse().get(view);

				if ((editor != null) && editor.isDirty()) {
					dirty.add(editor);
				}
			}

			if (!dirty.isEmpty()) {
				Future<Integer> dlgResult = UIUtil
					.call(new Callable<Integer>() {

						public Integer call() {
							MessageDialog dlg = new MessageDialog(
								dirty.get(0).getSite().getShell(),
								"Unsaved Model Editors",
								null,
								"There are unsaved model editors using this repository.  Save them first?",
								MessageDialog.QUESTION_WITH_CANCEL, //
								new String[]{"Yes", "No", "Cancel"}, 2);

							return dlg.open();
						}
					});

				try {
					switch (dlgResult.get()) {
						case 0 : // Yes
							result = DisposeAction.SAVE;
							break;
						case 1 : // No
							result = DisposeAction.CLOSE;
							break;
						case 2 : // Cancel
							result = DisposeAction.NONE;
							break;
						default :
							break;
					}
				} catch (Exception e) {
					// shouldn't happen because the UIUtil doesn't support
					// interruption as it runs stuff on the UI thread
					Activator.log.error(e);
				}
			}

			return result;
		}
	}
}