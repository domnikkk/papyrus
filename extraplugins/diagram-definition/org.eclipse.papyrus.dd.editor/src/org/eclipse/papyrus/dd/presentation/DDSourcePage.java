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
package org.eclipse.papyrus.dd.presentation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.dd.presentation.DDEditorPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * This is a page that shows the source of the model for a DD editor
 */
public class DDSourcePage extends DDEditorPage {

	/**
	 * The page id
	 */
	public static final String ID = DDSourcePage.class.getName();

	/**
	 * The source viewer of the page
	 */
	protected SourceViewer viewer;

	/**
	 * Constructs a new source page for a given DD editor
	 * 
	 * @param editor
	 *        The DD editor
	 */
	public DDSourcePage(DDEditor editor) {
		super(editor, ID, getString("DDSourcePage.title"));
	}

	@Override
	protected Viewer createViewer(Composite formBody) {
		viewer = new SourceViewer(formBody, null, SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.getTextWidget().setAlwaysShowScrollBars(false);
		viewer.setEditable(false);
		return viewer;
	}

	@Override
	public void refresh() {
		EditingDomain editingDomain = getDDEditor().getEditingDomain();
		Resource resource = editingDomain.getResourceSet().getResources().get(0);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			resource.save(out, null);
		} catch (IOException e) {
			DDEditorPlugin.INSTANCE.log(e);
		}
		IDocument document = new Document();
		document.set(out.toString());
		viewer.setDocument(document);
	}
}
