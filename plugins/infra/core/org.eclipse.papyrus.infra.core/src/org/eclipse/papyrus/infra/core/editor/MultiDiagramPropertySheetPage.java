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

package org.eclipse.papyrus.infra.core.editor;

import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.papyrus.infra.core.editor.reload.EditorReloadEvent;
import org.eclipse.papyrus.infra.core.editor.reload.IEditorReloadListener;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.IShowInSource;
import org.eclipse.ui.part.ShowInContext;
import org.eclipse.ui.views.properties.PropertyShowInContext;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;


/**
 * A specialized property-sheet page that knows how to restore the Property Sheet view's input from the workbench part
 * that most recently gave it its input, after a {@link CoreMultiDiagramEditor} has been re-loaded.
 */
class MultiDiagramPropertySheetPage extends TabbedPropertySheetPage implements IEditorReloadListener {

	private final CoreMultiDiagramEditor multiDiagramEditor;

	public MultiDiagramPropertySheetPage(CoreMultiDiagramEditor editor) {
		super(editor);

		this.multiDiagramEditor = editor;
		IReloadableEditor.Adapter.getAdapter(editor).addEditorReloadListener(this);
	}

	@Override
	public void dispose() {
		IReloadableEditor.Adapter.getAdapter(multiDiagramEditor).removeEditorReloadListener(this);

		super.dispose();
	}

	@Override
	public void editorAboutToReload(EditorReloadEvent event) {
		Object propertySheet = getSite().getService(IViewPart.class);
		if(propertySheet instanceof IShowInSource) {
			ShowInContext context = ((IShowInSource)propertySheet).getShowInContext();;
			if(context instanceof PropertyShowInContext) {
				IWorkbenchPart inputPart = ((PropertyShowInContext)context).getPart();
				if(inputPart != null) {
					event.putContext(inputPart);
				}
			}
		}
	}

	@Override
	public void editorReloaded(EditorReloadEvent event) {
		final IWorkbenchPart inputPart = (IWorkbenchPart)event.getContext();
		if(inputPart != null) {
			final Object propertySheet = getSite().getService(IViewPart.class);
			if(propertySheet instanceof IPartListener) {
				// Kick it with this part
				((IPartListener)propertySheet).partActivated(inputPart);

				// And again later to get its new selection (we don't know when its selection may be restored relative to us)
				getSite().getShell().getDisplay().asyncExec(new Runnable() {

					@Override
					public void run() {
						ISelectionProvider selectionProvider = inputPart.getSite().getSelectionProvider();
						if(selectionProvider != null) {
							((ISelectionListener)propertySheet).selectionChanged(inputPart, selectionProvider.getSelection());
						}
					}
				});
			}
		}
	}
}
