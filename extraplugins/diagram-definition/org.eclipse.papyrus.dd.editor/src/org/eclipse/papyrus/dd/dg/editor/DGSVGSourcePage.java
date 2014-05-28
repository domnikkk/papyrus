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
package org.eclipse.papyrus.dd.dg.editor;

import java.io.StringReader;
import java.io.StringWriter;

import org.apache.batik.dom.svg.SVGOMDocument;
import org.apache.batik.dom.util.DOMUtilities;
import org.apache.batik.transcoder.svg2svg.PrettyPrinter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.dd.editor.DDEditorPage;
import org.eclipse.papyrus.dd.editor.DDEditorPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * This is a page that shows the source of the corresponding SVG for a DG model
 */
public class DGSVGSourcePage extends DDEditorPage {

	/**
	 * The page id
	 */
	public static final String ID = DGSVGSourcePage.class.getName();

	/**
	 * The source viewer of the page
	 */
	protected SourceViewer viewer;

	/**
	 * Constructs a new SVG source page for a given DG editor
	 * 
	 * @param editor
	 *            The DG editor
	 */
	public DGSVGSourcePage(DGEditor editor) {
		super(editor, ID, getString("DGSVGSourcePage.title"));
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
		Resource resource = editingDomain.getResourceSet().getResources()
				.get(0);

		// (re)generate the SVG document
		SVGOMDocument svgDocument = getConverter().convert(resource);

		StringWriter out = new StringWriter();
		try {
			StringWriter writer = new StringWriter();
			DOMUtilities.writeDocument(svgDocument, writer);
			writer.close();
			PrettyPrinter printer = new PrettyPrinter();
			printer.setTabulationWidth(4);
			printer.setDocumentWidth(2000);
			printer.print(new StringReader(writer.toString()), out);
			out.close();
		} catch (Exception e) {
			DDEditorPlugin.INSTANCE.log(e);
		}

		// update the input of the viewer
		IDocument document = new Document();
		document.set(out.toString().substring(1));
		viewer.setDocument(document);
	}

	/**
	 * Gets an instance of <code>DGToSVGConverter</code>
	 * 
	 * @return DGToSVGConverter
	 */
	protected DGToSVGConverter getConverter() {
		return new DGToSVGConverter();
	}

}
