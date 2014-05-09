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

import static org.eclipse.papyrus.editor.integration.tests.tests.EditingMemoryLeakFixture.PROPERTY_SHEET;
import static org.junit.Assert.fail;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.papyrus.infra.services.validation.commands.ValidateModelCommand;
import org.eclipse.papyrus.junit.utils.classification.FailingTest;
import org.eclipse.papyrus.junit.utils.rules.MemoryLeakRule;
import org.eclipse.papyrus.junit.utils.rules.MemoryLeakRule.SoftReferenceSensitive;
import org.eclipse.papyrus.junit.utils.rules.PapyrusEditorFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.uml.service.validation.UMLDiagnostician;
import org.junit.Rule;
import org.junit.Test;


/**
 * Test cases checking that various different scenarios in the Papyrus Editor don't lead to memory leaks after the editor has been closed.
 */
@PluginResource("model/basic/simple_class_model.di")
public class EditorMemoryLeakTest extends AbstractPapyrusTest {

	@Rule
	public final MemoryLeakRule memory = new MemoryLeakRule();

	private final PapyrusEditorFixture editor = new PapyrusEditorFixture();

	@Rule
	public final EditingMemoryLeakFixture fixture = new EditingMemoryLeakFixture(editor);

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
		fixture.selectModelInModelExplorer();

		// Back to the Properties view
		editor.getView(PROPERTY_SHEET, false);

		memory.add(editor.getModel());
	}

	/**
	 * Verify that models with dynamic profiles applied (and the profiles and everything else) don't leak when the editor is closed
	 * (the case of profiles that do not have OCL constraints and, therefore, do not have {@link ETypedElement}s of {@link EGenericType} type).
	 */
	@Test
	@SoftReferenceSensitive
	@PluginResource("model/profile/model-no-j2ee-constraints.di")
	public void testProfileContentDoesNotLeak_noEGenericTypes() {
		// Activate the Properties view
		editor.getView(PROPERTY_SHEET, true);

		// Select the Model element to show it in the Properties
		fixture.selectModelInModelExplorer();

		// Back to the Properties view
		editor.getView(PROPERTY_SHEET, false);

		memory.add(editor.getModel());
		memory.add(editor.getModel().getAppliedProfile("j2ee"));
	}

	/**
	 * Verify that models with dynamic profiles applied (and the profiles and everything else) don't leak when when validation is run on them
	 * (the case of profiles that do not have OCL constraints and, therefore, do not have {@link ETypedElement}s of {@link EGenericType} type).
	 */
	@Test
	@SoftReferenceSensitive
	@PluginResource("model/profile/model-no-j2ee-constraints.di")
	public void testValidatedProfiledModelContentDoesNotLeak_noEGenericTypes() {
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

	/**
	 * Verify that models with dynamic profiles applied (and the profiles and everything else) don't leak when the editor is closed
	 * (the case of profiles that have OCL constraints and, therefore, do have {@link ETypedElement}s of {@link EGenericType} type).
	 */
	@Test
	@SoftReferenceSensitive
	@PluginResource("model/profile/model.di")
	public void testProfileContentDoesNotLeak() {
		// Activate the Properties view
		editor.getView(PROPERTY_SHEET, true);

		// Select the Model element to show it in the Properties
		fixture.selectModelInModelExplorer();

		// Back to the Properties view
		editor.getView(PROPERTY_SHEET, false);

		memory.add(editor.getModel());
		memory.add(editor.getModel().getAppliedProfile("j2ee"));
	}

	/**
	 * Verify that models with dynamic profiles applied (and the profiles and everything else) don't leak when when validation is run on them
	 * (the case of profiles that have OCL constraints and, therefore, do have {@link ETypedElement}s of {@link EGenericType} type).
	 */
	@FailingTest("OCL pivot environment has a memory leak: bug 434554")
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

}
