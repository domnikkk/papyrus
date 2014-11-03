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

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

/**
 * This is the abstract superclass of all DD editor pages
 */
public abstract class DDEditorPage extends FormPage {

	/**
	 * This is the viewer of the page
	 */
	private Viewer viewer;

	/**
	 * Constructs a new DD editor page
	 * 
	 * @param editor
	 *            The DD editor
	 * @param id
	 *            The page's id
	 * @param title
	 *            The page's title
	 */
	public DDEditorPage(DDEditor editor, String id, String title) {
		super(editor, id, title);
	}

	/**
	 * Returns the DD editor owning with the page
	 * 
	 * @return DDEditor
	 */
	public DDEditor getDDEditor() {
		return (DDEditor) getEditor();
	}

	/**
	 * Gets a translatable string from the resource bundle
	 * 
	 * @param key
	 *            The translatable string
	 * @return The translated string
	 */
	protected static String getString(String key) {
		return DDEditorPlugin.INSTANCE.getString(key);
	}

	@Override
	protected void createFormContent(IManagedForm managedForm) {
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		toolkit.decorateFormHeading(form.getForm());
		form.setText(getTitle());
		Composite body = form.getBody();
		body.setLayout(new FillLayout());
		this.viewer = createViewer(body);
		setupActions(form.getToolBarManager());
		form.updateToolBar();
	}

	/**
	 * Creates the page's viewer in the given parent control Subclasses should
	 * override and return a newly created viewer instance
	 * 
	 * @param parent
	 *            The parent control
	 * @return a newly created viewer
	 */
	protected abstract Viewer createViewer(Composite parent);

	/**
	 * Gets the viewer associated with this page
	 * 
	 * @return Viewer
	 */
	public Viewer getViewer() {
		return viewer;
	}

	@Override
	public void setActive(boolean active) {
		if (active) {
			getDDEditor().setCurrentViewer(viewer);
			// refresh the page on activation
			refresh();
		}
		super.setActive(active);
	}

	/**
	 * Refreshs the content of the page Subclasses should override if the page
	 * is not actively listening and reacting to changes to its underlying
	 * content
	 */
	public void refresh() {
		// no default implementation
	}

	/**
	 * Adds actions to the page's toolbar
	 * 
	 * @param manager
	 *            The page's toolbar manager
	 */
	public void setupActions(IToolBarManager manager) {
		manager.add(new Separator("Page"));
		manager.add(new Separator("Common"));

		Action action;

		action = new Action("Help") {
			public void run() {
				PlatformUI.getWorkbench().getHelpSystem()
						.displayHelp(getPageHelpId());
			}
		};
		action.setToolTipText("Show help");
		action.setImageDescriptor(DDEditorPlugin
				.getImageDescriptor(DDEditorPlugin.IMAGE_HELP));
		manager.appendToGroup("Common", action);
	}

	/**
	 * Get the help id associated with this page
	 * 
	 * @return String the id of the help page
	 */
	protected String getPageHelpId() {
		return "";
	}

}
