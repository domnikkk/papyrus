/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.dd.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

/**
 * This is a page that shows a model tree for a DD editor
 */
public class DDModelPage extends DDEditorPage {

	/**
	 * The page id
	 */
	public static final String ID = DDModelPage.class.getName();

	/**
	 * The tree viewer of the page
	 */
	protected TreeViewer viewer;

	/**
	 * Constructs a new model page for a given DD editor
	 * 
	 * @param editor
	 *            The DD editor
	 */
	public DDModelPage(DDEditor editor) {
		super(editor, ID, getString("DDModelPage.title"));
	}

	@Override
	protected Viewer createViewer(Composite formBody) {
		EditingDomain editingDomain = getDDEditor().getEditingDomain();
		AdapterFactory adapterFactory = getDDEditor().getAdapterFactory();

		Tree tree = new Tree(formBody, SWT.MULTI);
		viewer = new TreeViewer(tree);
		viewer.setContentProvider(new AdapterFactoryContentProvider(
				adapterFactory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		viewer.setInput(editingDomain.getResourceSet());
		viewer.setSelection(new StructuredSelection(editingDomain
				.getResourceSet().getResources().get(0)), true);

		new AdapterFactoryTreeEditor(tree, adapterFactory);
		getDDEditor().createContextMenuFor(viewer);

		return viewer;
	}

}
