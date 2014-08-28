/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Tessier (CEA LIST) - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.statemachine.tests.canonical;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.papyrus.uml.diagram.statemachine.custom.edit.part.CustomRegionCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.custom.edit.part.CustomRegionEditPart;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestChildNode;
import org.junit.Before;



public abstract class AbstractSMTestChildNode extends TestChildNode {

	/**
	 * @see org.eclipse.papyrus.diagram.clazz.test.canonical.AbstractPapyrusTestCase#setUp()
	 *
	 * @throws Exception
	 */
	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		CreateViewRequest requestcreation = createViewRequestShapeContainer();
		if(requestcreation != null) {
			requestcreation.setSize(new Dimension(500, 500));
			Command command = getDiagramEditPart().getCommand(requestcreation);
			assertNotNull(CONTAINER_CREATION + COMMAND_NULL, command);
			assertNotSame(CONTAINER_CREATION + TEST_IF_THE_COMMAND_IS_CREATED, UnexecutableCommand.INSTANCE, command);
			assertTrue(CONTAINER_CREATION + TEST_IF_THE_COMMAND_CAN_BE_EXECUTED, command.canExecute());
			executeOnUIThread(command);
		}
		assertEquals(CREATION + INITIALIZATION_TEST, 1, getDiagramEditPart().getChildren().size());
		GraphicalEditPart containerEditPart = (GraphicalEditPart)getDiagramEditPart().getChildren().get(0);
		rootCompartment = null;

		//compartment of statemachine
		int index = 0;
		while(rootCompartment == null && index < containerEditPart.getChildren().size()) {
			if((containerEditPart.getChildren().get(index)) instanceof ShapeCompartmentEditPart) {
				rootCompartment = (ShapeCompartmentEditPart)(containerEditPart.getChildren().get(index));
			}
			index++;
		}

		//compartment of CustomRegionEditPart
		index = 0;
		containerEditPart=rootCompartment;
		rootCompartment=null;
		CustomRegionEditPart regionEditPart=null;
		while(regionEditPart == null && index < containerEditPart.getChildren().size()) {
			if((containerEditPart.getChildren().get(index)) instanceof CustomRegionEditPart) {
				regionEditPart = (CustomRegionEditPart)(containerEditPart.getChildren().get(index));
			}
			index++;
		}
		//compartment of CustomRegionEditPart
		index = 0;
		containerEditPart=regionEditPart;
		rootCompartment=null;
		while(rootCompartment == null && index < containerEditPart.getChildren().size()) {
			if((containerEditPart.getChildren().get(index)) instanceof CustomRegionCompartmentEditPart) {
				rootCompartment = (ShapeCompartmentEditPart)(containerEditPart.getChildren().get(index));
			}
			index++;
		}
		assertNotNull("There should be at least one container for the node tests", rootCompartment);
	}
}
