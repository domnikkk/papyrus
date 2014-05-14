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
package org.eclipse.papyrus.uml.diagram.communication.test.canonical;

import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.diagram.tests.canonical.TestLinkOwnedBySource;
import org.eclipse.papyrus.uml.diagram.communication.CreateCommunicationDiagramCommand;
import org.eclipse.papyrus.uml.diagram.communication.test.ICommunicationDiagramTestsConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCommunicationDiagramLinkOwnedBySourceGen.
 */
public class TestCommunicationDiagramLinkOwnedBySourceGen extends TestLinkOwnedBySource {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateCommunicationDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return ICommunicationDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ICommunicationDiagramTestsConstants.FILE_NAME;
	}

}	
