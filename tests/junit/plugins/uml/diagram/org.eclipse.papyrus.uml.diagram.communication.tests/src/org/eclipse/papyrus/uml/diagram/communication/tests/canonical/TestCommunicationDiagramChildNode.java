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
package org.eclipse.papyrus.uml.diagram.communication.tests.canonical;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.diagram.tests.canonical.TestChildNode;
import org.eclipse.papyrus.junit.utils.classification.FailingTest;
import org.eclipse.papyrus.uml.diagram.communication.CreateCommunicationDiagramCommand;
import org.eclipse.papyrus.uml.diagram.communication.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.communication.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.communication.tests.ICommunicationDiagramTestsConstants;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

/**
 * The Class TestClassDiagramChildNode.
 */
public class TestCommunicationDiagramChildNode extends TestChildNode {

	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	@Override
	protected CreateViewRequest createViewRequestShapeContainer() {
		return null;
	}

	@Override
	public boolean isTestAffixedNode() {
		return false;
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
	 * {@inheritDoc}
	 */
	@Override
	protected boolean isSemanticTest() {
		return false;
	}
	/**
	* Test to manage Lifeline.
	*/
	@Test
	public void testToLifeline() {
		testToManageNode(UMLElementTypes.Lifeline_8001, UMLPackage.eINSTANCE.getLifeline(), UMLElementTypes.Interaction_8002, false);
	}
	/**
	* Test to manage Constraint.
	*/
	@Test
	public void testToConstraint() {
		testToManageNode(UMLElementTypes.Constraint_8004, UMLPackage.eINSTANCE.getConstraint(), UMLElementTypes.Interaction_8002, false);
	}
	/**
	* Test to manage Comment.
	*/
	@Test
	public void testToComment() {
		testToManageNode(UMLElementTypes.Comment_8005, UMLPackage.eINSTANCE.getComment(), UMLElementTypes.Interaction_8002, false);
	}
	/**
	* Test to manage TimeObservation.
	*/
	@Test
	@FailingTest
	public void testToTimeObservation() {
		testToManageNode(UMLElementTypes.TimeObservation_8006, UMLPackage.eINSTANCE.getTimeObservation(), UMLElementTypes.Interaction_8002, false);
	}
	/**
	* Test to manage DurationObservation.
	*/
	@Test
	@FailingTest
	public void testToDurationObservation() {
		testToManageNode(UMLElementTypes.DurationObservation_8007, UMLPackage.eINSTANCE.getDurationObservation(), UMLElementTypes.Interaction_8002, false);
	}
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateCommunicationDiagramCommand();
	}
}
