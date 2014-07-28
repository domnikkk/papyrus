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

import org.eclipse.papyrus.infra.core.editor.reload.EditorReloadEvent;
import org.eclipse.papyrus.infra.core.editor.reload.IEditorReloadListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.part.IShowInSource;
import org.eclipse.ui.part.IShowInTarget;
import org.eclipse.ui.part.ShowInContext;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;


/**
 * A specialized property-sheet page that knows how to restore the Property Sheet view's input from the workbench part
 * that most recently gave it its input, after a {@link CoreMultiDiagramEditor} has been re-loaded.
 */
class MultiDiagramPropertySheetPage extends TabbedPropertySheetPage implements IEditorReloadListener {

	private final CoreMultiDiagramEditor multiDiagramEditor;

	private ShowInContext inputContext;

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
			inputContext = ((IShowInSource)propertySheet).getShowInContext();
		}
	}

	@Override
	public void editorReloaded(EditorReloadEvent event) {
		if(inputContext != null) {
			Object propertySheet = getSite().getService(IViewPart.class);
			if(propertySheet instanceof IShowInTarget) {
				((IShowInTarget)propertySheet).show(inputContext);
			}
		}
	}

}
