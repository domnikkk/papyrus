/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
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
package org.eclipse.papyrus.uml.diagram.communication.tests.canonical;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.InvalidTest;
import org.eclipse.papyrus.uml.diagram.communication.CreateCommunicationDiagramCommand;
import org.eclipse.papyrus.uml.diagram.communication.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.communication.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.communication.tests.ICommunicationDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestLink;
import org.junit.Test;

/**
 * The Class TestCommunicationDiagramLink use to test link that are contained by the owner of the target and the source
 */
public class TestCommunicationDiagramLink extends TestLink {

	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
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
	
	/**
	* Test to manage component.
	*/
	@Test
	@InvalidTest
	public void testToMessage() {
	testToManageLink(UMLElementTypes.Lifeline_8001, UMLElementTypes.Lifeline_8001, UMLElementTypes.Message_8009, UMLElementTypes.Interaction_8002, false);
	}

}
