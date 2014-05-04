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

import static org.junit.Assert.fail;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.infra.services.validation.commands.ValidateModelCommand;
import org.eclipse.papyrus.junit.utils.classification.FailingTest;
import org.eclipse.papyrus.junit.utils.rules.MemoryLeakRule;
import org.eclipse.papyrus.junit.utils.rules.MemoryLeakRule.SoftReferenceSensitive;
import org.eclipse.papyrus.junit.utils.rules.PapyrusEditorFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.uml.service.validation.UMLDiagnostician;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


/**
 * Test cases checking that various different scenarios in the Papyrus Editor don't lead to memory leaks after the editor has been closed.
 */
@PluginResource("model/basic/simple_class_model.di")
public class EditorMemoryLeakTest extends AbstractPapyrusTest {

	private static final String PROPERTY_SHEET = "org.eclipse.ui.views.PropertySheet";

	private static final String OUTLINE = "org.eclipse.ui.views.ContentOutline";

	private static final String PROJECT_EXPLORER = "org.eclipse.ui.navigator.ProjectExplorer";

	private static final String PACKAGE_EXPLORER = "org.eclipse.jdt.ui.PackageExplorer";

	@Rule
	public final MemoryLeakRule memory = new MemoryLeakRule();

	@Rule
	public final PapyrusEditorFixture editor = new PapyrusEditorFixture();

	public EditorMemoryLeakTest() {
		super();
	}

	/**
	 * Verify that the Model Set does not leak when closing the editor.
	 */
	@Test
	public void testModelSetDoesNotLeak() {
		memory.add(editor.getModelSet());
	}

	/**
	 * Verify that the UML Model content in the Model Explorer does not leak when closing the editor.
	 */
	@Test
	@SoftReferenceSensitive
	public void testModelExplorerContentDoesNotLeak() {
		memory.add(editor.getModel());
	}

	/**
	 * Verify that diagram view parts do not leak when closing the editor.
	 */
	@Test
	@SoftReferenceSensitive
	public void testDiagramContentDoesNotLeak() {
		DiagramEditor diagramEditor = (DiagramEditor)editor.getEditor().getActiveEditor();
		memory.add(diagramEditor.getDiagramEditPart());
	}

	/**
	 * Verify that the property sheet does not leak models when closing the editor.
	 */
	@Test
	@SoftReferenceSensitive
	public void testPropertySheetContentDoesNotLeak() {
		// Activate the Properties view
		editor.getView(PROPERTY_SHEET, true);

		// Select the Model element to show it in the Properties
		selectModelInModelExplorer();

		// Back to the Properties view
		editor.getView(PROPERTY_SHEET, false);

		memory.add(editor.getModel());
	}

	/**
	 * Verify that models with dynamic profiles applied (and the profiles and everything else) don't leak when the editor is closed.
	 */
	@FailingTest("Awaiting a build with fixes for EMF Core/Validation bugs 433027 and 433050")
	@Test
	@SoftReferenceSensitive
	@PluginResource("model/profile/model.di")
	public void testProfileContentDoesNotLeak() {
		// Activate the Properties view
		editor.getView(PROPERTY_SHEET, true);

		// Select the Model element to show it in the Properties
		selectModelInModelExplorer();

		// Back to the Properties view
		editor.getView(PROPERTY_SHEET, false);

		memory.add(editor.getModel());
		memory.add(editor.getModel().getAppliedProfile("j2ee"));
	}

	/**
	 * Verify that models with dynamic profiles applied (and the profiles and everything else) don't leak when when validation is run on them.
	 */
	@FailingTest("Awaiting a build with fixes for EMF Core/Validation bugs 433027 and 433050")
	@Test
	@SoftReferenceSensitive
	@PluginResource("model/profile/model.di")
	public void testValidatedProfiledModelContentDoesNotLeak() {
		// Validate the model
		try {
			new ValidateModelCommand(editor.getModel(), new UMLDiagnostician()).execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			e.printStackTrace();
			fail("Failed to validate model: " + e.getLocalizedMessage());
		}

		editor.flushDisplayEvents();
		
		memory.add(editor.getModel());
		memory.add(editor.getModel().getAppliedProfile("j2ee"));
	}

	//
	// Test framework
	//

	@Before
	public void selectModelInModelExplorer() {
		// Select the Model element
		editor.getModelExplorerView().revealSemanticElement(Collections.singletonList(editor.getModel()));
		editor.flushDisplayEvents();
	}

	@After
	public void closeEditor() throws Exception {
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
	}

	void selectProjectInProjectExplorer() {
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

}
