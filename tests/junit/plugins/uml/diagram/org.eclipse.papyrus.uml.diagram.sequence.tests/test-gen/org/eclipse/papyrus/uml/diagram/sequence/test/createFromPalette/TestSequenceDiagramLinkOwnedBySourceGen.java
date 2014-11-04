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
package org.eclipse.papyrus.uml.diagram.sequence.test.createFromPalette;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.uml.diagram.sequence.CreateSequenceDiagramCommand;
import org.eclipse.papyrus.uml.diagram.sequence.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.sequence.tests.ISequenceDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkOwnedBySourceFromPaletteTest;

// TODO: Auto-generated Javadoc
/**
 * The Class TestSequenceDiagramLinkOwnedBySourceGen.
 */
public class TestSequenceDiagramLinkOwnedBySourceGen extends CreateLinkOwnedBySourceFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateSequenceDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return ISequenceDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ISequenceDiagramTestsConstants.FILE_NAME;
	}

	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.TYPED_INSTANCE;
	}
}	
