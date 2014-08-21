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
package org.eclipse.papyrus.infra.core.editor.reload;

import java.util.EventObject;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.core.Activator;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.editor.IReloadableEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;

import com.google.common.base.Supplier;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;


/**
 * The event object for notifications of each phase in the reloading of a {@linkplain IReloadableEditor reloadable editor}.
 */
public class EditorReloadEvent extends EventObject {

	private static final long serialVersionUID = 1L;

	public static final int ABOUT_TO_RELOAD = 1;

	public static final int RELOADED = 2;

	private int type;

	private transient Map<IEditorReloadListener, Object> context;

	private transient IEditorReloadListener currentListener;

	public EditorReloadEvent(IMultiDiagramEditor editor) {
		super(editor);
	}

	public final IMultiDiagramEditor getEditor() {
		return (IMultiDiagramEditor) getSource();
	}

	public final int getEventType() {
		return type;
	}

	/**
	 * Puts some opaque representation of contextual state for the caller to retrieve later when an editor is {@linkplain IEditorReloadListener#editorReloaded(EditorReloadEvent) reloaded}.
	 * The canonical example of this usage is storing state such as selection, expanded tree nodes, etc. to restore after re-building a UI that
	 * depends on the reloaded editor. After the editor re-load completes and all listeners are notified of that, then all context objects are
	 * released. Any that implement the {@link IDisposableReloadContext} interface are disposed according to that protocol. This is done even if it
	 * happens that the editor re-load procedure cannot complete normally and the editor is forced to close without notifying the post-reload
	 * listeners.
	 *
	 * @param object
	 *            some state to stash for later retrieval following the re-loading of the editor
	 *
	 * @return the previous context object, if any (there normally wouldn't be as each listener that is invoked has its own context storage
	 *
	 * @throws IllegalStateException
	 *             on any attempt to invoke this method except during an {@link IEditorReloadListener#editorAboutToReload(EditorReloadEvent)} call-back
	 */
	public Object putContext(Object object) {
		checkContext(ABOUT_TO_RELOAD);

		IInternalEMFSelectionContext emfContext = AdapterUtils.adapt(object, IInternalEMFSelectionContext.class, null);
		if (emfContext != null) {
			initContext(emfContext);
		}

		return context.put(currentListener, object);
	}

	/**
	 * Retrieves an opaque representation of contextual state that was previously {@linkplain #putContext(Object) put} by the caller.
	 *
	 * @return the previously stashed object, or {@code null} if none
	 *
	 * @throws IllegalStateException
	 *             on any attempt to invoke this method except during an {@link IEditorReloadListener#editorReloaded(EditorReloadEvent)} call-back
	 */
	public Object getContext() {
		checkContext(RELOADED);
		return context.get(currentListener);
	}

	private void initContext(IInternalEMFSelectionContext context) {
		Supplier<ResourceSet> resourceSetSupplier = new Supplier<ResourceSet>() {

			@Override
			public ResourceSet get() {
				try {
					return getEditor().getServicesRegistry().getService(ModelSet.class);
				} catch (ServiceException e) {
					Activator.log.error(e);
					throw new IllegalStateException("Invalid service registry in editor"); //$NON-NLS-1$
				}
			}
		};

		context.setResourceSetSupplier(resourceSetSupplier);
	}

	protected final void checkContext(int phase) {
		if (currentListener == null) {
			throw new IllegalStateException("Not in an IEditorReloadListener call-back"); //$NON-NLS-1$
		}

		if (phase != this.type) {
			throw new IllegalStateException(String.format("Not in '%s' listener call-back", (phase == ABOUT_TO_RELOAD) ? "editorAboutToReload" : "editorReloaded"));
		}
	}

	public final void dispatchEditorAboutToReload(Iterable<? extends IEditorReloadListener> listeners) {
		context = Maps.newHashMap();
		type = ABOUT_TO_RELOAD;

		for (Iterator<? extends IEditorReloadListener> iter = listeners.iterator(); iter.hasNext();) {
			currentListener = iter.next();

			try {
				currentListener.editorAboutToReload(this);
			} catch (Exception e) {
				Activator.log.error("Uncaught exception in editor reload listener.", e); //$NON-NLS-1$
			} finally {
				currentListener = null;
			}
		}
	}

	public final void dispatchEditorReloaded(Iterable<? extends IEditorReloadListener> listeners) {
		type = RELOADED;

		for (Iterator<? extends IEditorReloadListener> iter = listeners.iterator(); iter.hasNext();) {
			currentListener = iter.next();

			try {
				currentListener.editorReloaded(this);
			} catch (Exception e) {
				Activator.log.error("Uncaught exception in editor reload listener.", e); //$NON-NLS-1$
			} finally {
				currentListener = null;
			}
		}
	}

	public void dispose() {
		if (context != null) {
			Error error = null;

			try {
				for (IDisposableReloadContext next : Iterables.filter(context.values(), IDisposableReloadContext.class)) {
					try {
						next.dispose();
					} catch (Exception e) {
						Activator.log.error("Uncaught exception in editor reload context disposal.", e); //$NON-NLS-1$
					} catch (Error e) {
						if (error == null) {
							error = e;
						}
						Activator.log.error("Uncaught exception in editor reload context disposal.", e); //$NON-NLS-1$
					}
				}
			} finally {
				context = null;
			}

			if (error != null) {
				throw error;
			}
		}
	}

}
