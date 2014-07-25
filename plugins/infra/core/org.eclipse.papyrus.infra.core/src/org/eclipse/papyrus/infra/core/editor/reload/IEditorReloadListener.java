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

import java.util.EventListener;

import org.eclipse.papyrus.infra.core.editor.IReloadableEditor;


/**
 * A protocol for notification of the phases of re-loading of an {@link IReloadableEditor}.
 */
public interface IEditorReloadListener extends EventListener {

	/**
	 * Notifies that an editor is about to reload. Implementors may put stuff into the {@code event}'s {@link EditorReloadEvent#putContext(Object)
	 * context} to retrieve in an eventual {@linkplain #editorReloaded(EditorReloadEvent) }re-load} notification. The canonical example of this
	 * usage is storing state such as selection, expanded tree nodes, etc. to restore after re-building a UI that depends on the reloaded
	 * editor.
	 * 
	 * @param event
	 *        notification that an editor is going to re-load itself
	 */
	void editorAboutToReload(EditorReloadEvent event);

	/**
	 * Notifies that an editor has reloaded. Implementors may retrieve from the {@code event} any {@link EditorReloadEvent#getContext()
	 * context} that they put in {@linkplain #editorAboutToReload(EditorReloadEvent) before} the re-load.
	 * 
	 * @param event
	 *        notification that an editor has reloaded
	 */
	void editorReloaded(EditorReloadEvent event);
}
