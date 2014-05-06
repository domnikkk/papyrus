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

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.nattable.common.editor.NatTableEditor;
import org.eclipse.papyrus.infra.nattable.manager.axis.IAxisManager;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.junit.utils.rules.MemoryLeakRule;
import org.eclipse.papyrus.junit.utils.rules.MemoryLeakRule.SoftReferenceSensitive;
import org.eclipse.papyrus.junit.utils.rules.PapyrusEditorFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.nattable.menu.util.TableMenuUtils;
import org.eclipse.ui.IEditorPart;
import org.junit.Rule;
import org.junit.Test;


/**
 * Test cases checking slightly more complex editing scenarios for leaks of user models.
 */
@PluginResource("model/basic/simple_class_model.di")
public class EditingScenariosMemoryLeakTest extends AbstractPapyrusTest {

	@Rule
	public final MemoryLeakRule memory = new MemoryLeakRule();

	private final PapyrusEditorFixture editor = new PapyrusEditorFixture();

	@Rule
	public final EditingMemoryLeakFixture fixture = new EditingMemoryLeakFixture(editor);

	public EditingScenariosMemoryLeakTest() {
		super();
	}

	/**
	 * Verify that models do not leak when closing the editor after creating a new element.
	 */
	@Test
	@SoftReferenceSensitive
	public void testCreateNewElement() {
		memory.add(editor.getModel());

		CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.Class_2008, fixture.getDiagramEditPart().getDiagramPreferencesHint());
		Command command = fixture.getDiagramEditPart().getCommand(requestcreation);
		fixture.execute(command);
	}

	/**
	 * Verify that models do not leak when closing the editor after creating a new element in a table.
	 */
	@Test
	@SoftReferenceSensitive
	@PluginResource("model/basic/table.di")
	public void testCreateNewElement_table() {
		memory.add(editor.getModel());

		// The TableMenuUtils needs the table-editor to be active
		editor.activate();

		IEditorPart tableEditor = fixture.getActiveEditor();
		assertThat("Not a table editor", tableEditor, instanceOf(NatTableEditor.class));
		INattableModelManager manager = (INattableModelManager)tableEditor.getAdapter(INattableModelManager.class);
		assertThat(manager, notNullValue());
		IAxisManager axisManager = manager.getRowAxisManager();
		final int originalAxisSize = axisManager.getAllManagedAxis().size();

		fixture.execute(getCreateClassInTableCommand());

		// Verify that the element was added
		int newAxisSize = axisManager.getAllManagedAxis().size();
		assertThat("Class not added to table", newAxisSize > originalAxisSize);

		// Close the editor and open it again, to force actions etc. to forget the previous selection
		editor.close();
		editor.open();
		fixture.selectModelInModelExplorer();

		// Do another edit ...
		try {
			fixture.execute(getCreateClassInTableCommand());
		} catch (AssertionError failure) {
			// Doesn't matter to our purposes
		}
	}

	//
	// Test framework
	//

	org.eclipse.emf.common.command.Command getCreateClassInTableCommand() {
		CreateElementRequest request = new CreateElementRequest(fixture.getEditingDomain(), editor.getModel(), UMLElementTypes.Class_2008);
		IElementEditService edit = ElementEditServiceUtils.getCommandProvider(editor.getModel());
		org.eclipse.emf.common.command.Command create = GMFtoEMFCommandWrapper.wrap(edit.getEditCommand(request));
		return TableMenuUtils.buildNattableCreationCommand(create, request);
	}
}
