/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.component.test.canonical;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.uml.diagram.component.CreateComponentDiagramCommand;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.InterfaceAttributeCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.InterfaceOperationCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.component.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.component.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.component.test.IComponentDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestChildLabel;
import org.junit.Test;

/**
 * The Class TestComponentDiagramChildNode.
 */

public class TestComponentDiagramChildLabel extends TestChildLabel {

	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateComponentDiagramCommand();
	}

	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	@Override
	protected String getProjectName() {
		return IComponentDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IComponentDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage i package.
	 */
	@Test
	public void testToManageProperty() {
		testToManageTopNode(UMLElementTypes.Interface_3205,UMLElementTypes.Property_1,   InterfaceAttributeCompartmentEditPart.VISUAL_ID, "Attribute");
	}
	
	/**
	 * Test to manage i package.
	 */
	@Test
	public void testToManageOperation() {
		testToManageTopNode(UMLElementTypes.Interface_3205,UMLElementTypes.Operation_5,   InterfaceOperationCompartmentEditPart.VISUAL_ID);
	}
	
	/**
	 * Test to manage i package.
	 */
	@Test
	public void testToManageReception() {
		testToManageTopNode(UMLElementTypes.Interface_3205,UMLElementTypes.Reception_6,  InterfaceOperationCompartmentEditPart.VISUAL_ID);
	}

	
}
