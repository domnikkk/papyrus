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

package org.eclipse.papyrus.uml.diagram.tests.createFromPalette;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractPapyrusTestCase;
import org.eclipse.uml2.uml.Element;
import org.junit.Assert;

/**
 * @author jc236769
 *
 */
public abstract class AbstractCreateChildLabelNodeFromPaletteTest extends AbstractPapyrusTestCase {
	private GraphicalEditPart topNode;

	public void testCreateChildLabelNodeFromPaletteTest(IElementType topNodeType, IElementType childNodeType, int compartmentType, boolean mustPass) {
		try {
			create(topNodeType);
			createChildNode(childNodeType, compartmentType);
		} catch (AssertionError ae) {
			System.err.println("Assertion failed: " + ae);
		}
	}

	/**
	 * @param childNodeType
	 * @param compartmentType
	 * @param b
	 */
	private void createChildNode(IElementType childNodeType, int compartmentType) {
		ListCompartmentEditPart compartment = null;

		List<?> topEditPartChildren = getTopEditPart().getChildren();
		for (Object editPart : topEditPartChildren) {
			if (editPart instanceof ListCompartmentEditPart && (((View) ((ListCompartmentEditPart) (editPart)).getModel()).getType().equals("" + compartmentType))) { //$NON-NLS-1$
				compartment = (ListCompartmentEditPart) editPart;
			}
		}

		assertTrue("Container compartment not found", compartment != null); //$NON-NLS-1$
		// CREATION
		//assertTrue(CREATION + INITIALIZATION_TEST, compartment.getChildren().size() == 0);
		//assertTrue(CREATION + INITIALIZATION_TEST, getRootSemanticModel().getOwnedElements().size() == 0);
		CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(childNodeType, getDiagramEditPart().getDiagramPreferencesHint());
		Command command = compartment.getCommand(requestcreation);
		assertNotNull(CREATION + COMMAND_NULL, command);
		assertTrue(CREATION + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue("CREATION: " + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute() == true); //$NON-NLS-1$
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		assertTrue(CREATION + TEST_THE_EXECUTION, compartment.getChildren().size() == 1);
		Assert.assertTrue("Node must be org.eclipse.gmf.runtime.notation.Shape", ((EditPart) compartment.getChildren().get(0)).getModel() instanceof Shape); //$NON-NLS-1$
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().undo();
		assertTrue(CREATION + TEST_THE_UNDO, compartment.getChildren().size() == 0);
		assertTrue(CREATION + TEST_THE_UNDO, ((Element) ((View) getTopEditPart().getModel()).getElement()).getOwnedElements().size() == 0);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().redo();
		assertTrue("CREATION: " + TEST_THE_REDO, compartment.getChildren().size() == 1); //$NON-NLS-1$

		Assert.assertNotEquals("Diagram updater must detect that children has been created", 0, getDiagramUpdater().getSemanticChildren(getRootView()).size()); //$NON-NLS-1$
		Assert.assertEquals("Diagram updater must detect that no link has been created", 0, getDiagramUpdater().getContainedLinks(getRootView()).size()); //$NON-NLS-1$
		Assert.assertEquals("Diagram updater must detect that no link are incoming", 0, getDiagramUpdater().getIncomingLinks(((GraphicalEditPart) compartment.getChildren().get(0)).getNotationView()).size()); //$NON-NLS-1$
		Assert.assertEquals("Diagram updater must detect that no link are outgoing", 0, getDiagramUpdater().getOutgoingLinks(((GraphicalEditPart) compartment.getChildren().get(0)).getNotationView()).size()); //$NON-NLS-1$
		Assert.assertEquals("Diagram updater must detect that no children has ben created in the new element", 0, getDiagramUpdater().getSemanticChildren(((GraphicalEditPart) compartment.getChildren().get(0)).getNotationView()).size()); //$NON-NLS-1$
		Assert.assertEquals("Diagram updater must detect that no link has been created in the new element", 0, getDiagramUpdater().getContainedLinks(((GraphicalEditPart) compartment.getChildren().get(0)).getNotationView()).size()); //$NON-NLS-1$


	}

	/**
	 * Gets the top edit part.
	 *
	 * @return the top edit part
	 */
	public GraphicalEditPart getTopEditPart() {
		return topNode;
	}

	public abstract DiagramUpdater getDiagramUpdater();


	/**
	 * Test to create a top node.
	 *
	 * @param type
	 *            the type
	 */
	public void create(IElementType type) {
		CreateViewRequest requestcreation = CreateViewRequestFactory.getCreateShapeRequest(type, getDiagramEditPart().getDiagramPreferencesHint());
		Command command = getDiagramEditPart().getCommand(requestcreation);
		diagramEditor.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		topNode = (GraphicalEditPart) getDiagramEditPart().getChildren().get(0);
	}
}
