/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.tests.canonical;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.views.modelexplorer.NavigatorUtils;
import org.eclipse.uml2.uml.Element;
import org.junit.Assert;
import org.junit.Before;

/**
 * Abstract class to test diagrams :
 * - drop a diagram from model explorer to a diagram
 */
public abstract class AbstractTestDiagram extends org.eclipse.papyrus.uml.diagram.tests.canonical.AbstractPapyrusTestCase {


	/** command computed on the ui thread */
	protected Command command;

	/**
	 * @see org.eclipse.papyrus.diagram.clazz.test.canonical.AbstractPapyrusTestCase#setUp()
	 *
	 * @throws Exception
	 */
	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
	}
	
	
	/**
	 * @see org.eclipse.papyrus.diagram.clazz.test.canonical.AbstractPapyrusTestCase#getRootView()
	 *
	 * @return
	 */
	@Override
	protected View getRootView() {
			return (View) getDiagramEditPart().getModel();
	};

	public abstract DiagramUpdater getDiagramUpdater();


	/**
	 * TODO : Should be provided as an utility in Papyrus, but where ?  
	 * most of the code comes from
	 * org.eclipse.papyrus.infra.gmfdiag.modelexplorer.queries.GetContainedDiagrams
	 */
	protected Diagram getFirstDiagram() {
		Element rootSemanticModel = getRootSemanticModel();
		Iterator<EObject> roots = NavigatorUtils.getNotationRoots(rootSemanticModel);
		while (roots.hasNext()) {
			EObject root = roots.next();
			if (root instanceof Diagram) {
				Diagram diagram = (Diagram) root;
				return diagram;
			}
		}
		return null;
	}

	/**
	 * See Bug 450341
	 * Test the drop of a diagram to a diagram
	 * @param diagram
	 * @param expectedGraphicalChildren
	 * @param expectedSemanticChildren
	 * @param addedGraphicalChildren
	 */
	public void testDrop(Diagram diagram, int expectedGraphicalChildren, int expectedSemanticChildren, int addedGraphicalChildren) {
		// DROP
		assertEquals(DROP + INITIALIZATION_TEST, expectedGraphicalChildren, getRootView().getChildren().size());

		assertEquals(DROP + INITIALIZATION_TEST, expectedSemanticChildren, getRootSemanticModel().getOwnedElements().size());

		DropObjectsRequest dropObjectsRequest = new DropObjectsRequest();
		List<EObject> list = new ArrayList<EObject>();
		list.add(diagram);
		dropObjectsRequest.setObjects(list);
		dropObjectsRequest.setLocation(new Point(40, 40));
		Command command = getDiagramEditPart().getCommand(dropObjectsRequest);
		assertNotNull(DROP + COMMAND_NULL, command);
		assertTrue(DROP + TEST_IF_THE_COMMAND_IS_CREATED, command != UnexecutableCommand.INSTANCE);
		assertTrue(DROP + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute());
		// execute the drop
		executeOnUIThread(command);
		Assert.assertEquals(DROP + TEST_THE_EXECUTION, expectedGraphicalChildren + addedGraphicalChildren, getRootView().getChildren().size());
		Assert.assertEquals(DROP + TEST_THE_EXECUTION, expectedSemanticChildren, getRootSemanticModel().getOwnedElements().size());
		// undo the drop
		undoOnUIThread();
		Assert.assertEquals(DROP + TEST_THE_UNDO, expectedGraphicalChildren, getRootView().getChildren().size());
		Assert.assertEquals(DROP + TEST_THE_UNDO, expectedSemanticChildren, getRootSemanticModel().getOwnedElements().size());
		// redo the drop
		redoOnUIThread();
		Assert.assertEquals(DROP + TEST_THE_REDO, expectedGraphicalChildren + addedGraphicalChildren, getRootView().getChildren().size());
		Assert.assertEquals(DROP + TEST_THE_REDO, expectedSemanticChildren, getRootSemanticModel().getOwnedElements().size());
	}
}
