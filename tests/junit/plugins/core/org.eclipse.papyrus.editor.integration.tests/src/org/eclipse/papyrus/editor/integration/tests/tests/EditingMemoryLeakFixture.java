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
package org.eclipse.papyrus.editor.integration.tests.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Collections;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.commands.wrappers.GEFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;
import org.eclipse.papyrus.junit.utils.Duck;
import org.eclipse.papyrus.junit.utils.rules.PapyrusEditorFixture;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;


/**
 * A convenience fixture-rule for working with diagram editors in memory-leak test cases. It wraps a {@link PapyrusEditorFixture},
 * which must not be tagged a an {@link Rule &#x40;Rule} in its own right, because this fixture rule ensures that it decorates
 * the test with the appropriate precedence.
 */
class EditingMemoryLeakFixture extends TestWatcher {

	static final String PROPERTY_SHEET = "org.eclipse.ui.views.PropertySheet";

	static final String OUTLINE = "org.eclipse.ui.views.ContentOutline";

	static final String PROJECT_EXPLORER = "org.eclipse.ui.navigator.ProjectExplorer";

	static final String PACKAGE_EXPLORER = "org.eclipse.jdt.ui.PackageExplorer";

	private final PapyrusEditorFixture editor;

	EditingMemoryLeakFixture(PapyrusEditorFixture editor) {
		super();

		this.editor = editor;
	}

	public void selectModelInModelExplorer() {
		// Select the Model element
		editor.getModelExplorerView().revealSemanticElement(Collections.singletonList(editor.getModel()));
		editor.flushDisplayEvents();
	}

	public void closeEditor() {
		editor.close();

		// now, open a new editor and close it to ensure that views such as Model Explorer, Outline, etc. get
		// a new model into context and forget the previous
		editor.open("model/basic/empty_model.di"); // This will be closed automatically when finished
		selectModelInModelExplorer();

		editor.getView(PROPERTY_SHEET, true);
		editor.getView(OUTLINE, true);

		// Select something in the Project Explorer to flush the last model selection from the Properties view's default page
		selectProjectInProjectExplorer();

		editor.getView(PROPERTY_SHEET, true);
		editor.getView(OUTLINE, true);
		
		editor.activate();
	}

	public IEditorPart getActiveEditor() {
		return editor.getEditor().getActiveEditor();
	}

	public DiagramEditor getDiagramEditor() {
		return AdapterUtils.adapt(getActiveEditor(), DiagramEditor.class, null);
	}

	public DiagramEditPart getDiagramEditPart() {
		return AdapterUtils.adapt(getDiagramEditor(), DiagramEditPart.class, null);
	}

	public IDiagramEditDomain getEditDomain() {
		return getDiagramEditor().getDiagramEditDomain();
	}

	public TransactionalEditingDomain getEditingDomain() {
		TransactionalEditingDomain result = null;

		// Is the active inner editor a diagram editor?
		DiagramEditor diagram = getDiagramEditor();
		if(diagram != null) {
			result = diagram.getEditingDomain();
		}

		if(result == null) {
			// Maybe it's a table editor
			IEditorPart active = getActiveEditor();
			if(active != null) {
				result = new Duck(active).quackp("get.+", TransactionalEditingDomain.class);
			}
		}

		if(result == null) {
			// Fall back to the outer editor
			result = editor.getEditingDomain();
		}

		return result;
	}

	public CommandStack getCommandStack() {
		return getEditingDomain().getCommandStack();
	}

	public DiagramCommandStack getDiagramCommandStack() {
		return getEditDomain().getDiagramCommandStack();
	}

	public void execute(Command command) {
		execute(GEFtoEMFCommandWrapper.wrap(command));
	}

	public void execute(org.eclipse.emf.common.command.Command command) {
		final CommandStack stack = getCommandStack();

		stack.execute(command);

		editor.flushDisplayEvents();

		assertThat("Command execution failed. Checked the workspace log for details.", stack.getUndoCommand(), is(command));
	}

	public void selectProjectInProjectExplorer() {
		ISetSelectionTarget projectExplorer = getProjectOrPackageExplorer();
		projectExplorer.selectReveal(new StructuredSelection(editor.getProject().getProject()));
		editor.flushDisplayEvents();
	}

	ISetSelectionTarget getProjectOrPackageExplorer() {
		ISetSelectionTarget result = null;

		IViewPart explorer = editor.getView(PROJECT_EXPLORER, false);
		if(explorer == null) {
			// Maybe we're in the Java perspective
			explorer = editor.getView(PACKAGE_EXPLORER, false);
			if(explorer == null) {
				// Force the Project Explorer, then
				explorer = editor.getView(PROJECT_EXPLORER, true);
			}
		}

		result = (ISetSelectionTarget)explorer;

		return result;
	}

	//
	// Test lifecycle
	//

	public Statement apply(Statement base, Description description) {
		return editor.apply(super.apply(base, description), description);
	}

	@Override
	protected void starting(Description description) {
		selectModelInModelExplorer();
	}

	@Override
	protected void finished(Description description) {
		closeEditor();
	}
}
