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
package org.eclipse.papyrus.dd.dg.presentation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;

import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.JSVGScrollPane;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.dd.dg.RootCanvas;
import org.eclipse.papyrus.dd.presentation.DDEditorPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * This is a page that renders on canvas the corresponding SVG for a DG model
 */
public class DGSVGCanvasPage extends DDEditorPage {

	/**
	 * The page id
	 */
	public static final String ID = DGSVGCanvasPage.class.getName();

	/**
	 * The canvas viewer of the page
	 */
	protected SVGCanvasViewer viewer;

	/**
	 * Constructs a new SVG canvas page for a given DG editor
	 * 
	 * @param editor
	 *        The DG editor
	 */
	public DGSVGCanvasPage(DGEditor editor) {
		super(editor, ID, getString("DGSVGCanvasPage.title"));
	}

	@Override
	protected Viewer createViewer(Composite formBody) {
		viewer = new SVGCanvasViewer(formBody);
		return viewer;
	}

	@Override
	public void refresh() {
		RootCanvas canvas = (RootCanvas)getDDEditor().getSelectedEObject();
		if(canvas == null) {
			viewer.setInput(null);
			return;
		}
		// (re)generate the SVG document
		Document svgDocument = getConverter().convert(canvas);
		// update the input of the viewer
		viewer.setInput(svgDocument);
	}

	/**
	 * Gets an instance of <code>DGToSVGConverter</code>
	 * 
	 * @return DGToSVGConverter
	 */
	protected DGToSVGConverter getConverter() {
		return new DGToSVGConverter();
	}

	/**
	 * This is a viewer that embeds a SVG canvas in a SWT composite
	 */
	public static class SVGCanvasViewer extends Viewer {

		/**
		 * This is main widget of the viewer
		 */
		private Composite composite;

		/**
		 * This is the embedded SVG canvas
		 */
		private JSVGCanvas svgCanvas;

		/**
		 * Constructs a new Canvas viewer
		 * 
		 * @param parent
		 *        the SWT composite parent control
		 */
		public SVGCanvasViewer(Composite parent) {
			composite = new Composite(parent, SWT.EMBEDDED);
			Frame frame = SWT_AWT.new_Frame(composite);
			frame.setVisible(true);
			svgCanvas = new JSVGCanvas();
			svgCanvas.setDocumentState(JSVGCanvas.ALWAYS_DYNAMIC);
			JSVGScrollPane pane = new JSVGScrollPane(svgCanvas);
			frame.add(pane);
		}

		@Override
		public Control getControl() {
			return composite;
		}

		@Override
		public Object getInput() {
			return svgCanvas.getSVGDocument();
		}

		@Override
		public void setInput(final Object input) {
			EventQueue.invokeLater(new Runnable() {

				@Override
				public void run() {
					Document doc = (Document)input;
					svgCanvas.setDocument(doc);
					// sets the background color of the canvas explicitly since
					// the CSS background-color
					// property is not supported by Batik yet
					Element svg = doc.getDocumentElement();
					String value = svg.getAttribute(DGToSVGConverter.SVG_BACKGROUND_COLOR_ATTRIBUTE);
					if(value != null && value.length() > 0)
						svgCanvas.setBackground(Color.decode(value));
					else
						svgCanvas.setBackground(Color.white);
				}
			});
		}

		@Override
		public ISelection getSelection() {
			return StructuredSelection.EMPTY;
		}

		@Override
		public void refresh() {
			// do nothing
		}

		@Override
		public void setSelection(ISelection selection, boolean reveal) {
			// do nothing
		}
	};
}
