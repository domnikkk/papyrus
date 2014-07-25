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
package org.eclipse.papyrus.infra.core.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.papyrus.infra.core.Activator;
import org.eclipse.papyrus.infra.core.editor.reload.IEditorReloadListener;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;


/**
 * An {@linkplain IAdaptable adapter protocol} for editors that know how to internally
 * reload themselves without disturbing the workbench window's perspective layout.
 */
public interface IReloadableEditor {

	/**
	 * Reloads me in-place in the perspective layout.
	 * 
	 * @param save
	 *        whether to save before re-loading
	 * 
	 * @throws CoreException
	 *         on any failure to unload, reload, or whatever
	 */
	void reloadEditor(boolean save) throws CoreException;

	void addEditorReloadListener(IEditorReloadListener listener);

	void removeEditorReloadListener(IEditorReloadListener listener);

	/**
	 * A convenience adapter for editors that don't actually know how to reload themselves in place.
	 * It simply closes the editor and then opens it again on the original input.
	 */
	class Adapter implements IReloadableEditor {

		private final IEditorPart editor;

		public Adapter(IEditorPart editor) {
			super();

			this.editor = editor;
		}

		public static IReloadableEditor getAdapter(IMultiDiagramEditor editor) {
			return AdapterUtils.adapt(editor, IReloadableEditor.class, new Adapter(editor));
		}

		public void reloadEditor(boolean save) throws CoreException {
			final IWorkbenchPage page = editor.getSite().getPage();
			final IEditorInput currentInput = editor.getEditorInput();

			final Display display = editor.getSite().getShell().getDisplay();

			final String editorId = editor.getSite().getId();

			if(save) {
				editor.doSave(new NullProgressMonitor());
			}

			page.closeEditor(editor, save);

			display.asyncExec(new Runnable() {

				@Override
				public void run() {
					try {
						IDE.openEditor(page, currentInput, editorId);
					} catch (PartInitException ex) {
						Activator.log.error(ex);
					}
				}
			});

		}

		@Override
		public void addEditorReloadListener(IEditorReloadListener listener) {
			// Don't need to track these listeners because I never properly reload an editor
		}

		@Override
		public void removeEditorReloadListener(IEditorReloadListener listener) {
			// Don't need to track these listeners because I never properly reload an editor
		}
	}
}
