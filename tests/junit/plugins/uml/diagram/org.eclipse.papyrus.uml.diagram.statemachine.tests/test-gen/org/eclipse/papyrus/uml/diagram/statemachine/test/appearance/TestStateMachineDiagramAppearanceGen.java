/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This file has been generated automatically in the Papyrus Test Framework.
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.statemachine.test.appearance;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.CreateStateMachineDiagramCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.tests.IStateMachineDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.appearance.AppearanceNodeTest;

/**
 * The Class TestStateMachineDiagramAppearanceGen.
 */
public class TestStateMachineDiagramAppearanceGen extends AppearanceNodeTest {

	@Override
	public GraphicalEditPart getContainerEditPart() {
		return getDiagramEditPart();
	}
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateStateMachineDiagramCommand();
	}
	
	@Override
	protected String getProjectName() {
		return IStateMachineDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IStateMachineDiagramTestsConstants.FILE_NAME;
	}

}
