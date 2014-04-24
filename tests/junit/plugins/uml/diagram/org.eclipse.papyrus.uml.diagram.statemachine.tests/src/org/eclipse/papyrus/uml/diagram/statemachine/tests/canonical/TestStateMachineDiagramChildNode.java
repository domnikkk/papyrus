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

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.utils.classification.InvalidTest;
import org.eclipse.papyrus.uml.diagram.statemachine.CreateStateMachineDiagramCommand;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.statemachine.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.statemachine.tests.IStateMachineDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestChildNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;


/**
 * The Class TestClassDiagramChildNode.
 */
public class TestStateMachineDiagramChildNode extends AbstractSMTestChildNode {

	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	@Override
	protected CreateViewRequest createViewRequestShapeContainer() {
		return null;}

	@Override
	public boolean isTestAffixedNode() {
		return true;
	}
	@Override
	protected String getProjectName() {
		return IStateMachineDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IStateMachineDiagramTestsConstants.FILE_NAME;
	}

	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected boolean isSemanticTest() {
		return true;
	}

	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateStateMachineDiagramCommand();
	}
	/**
	* Test to manage Region.
	*/
	@Test
	@InvalidTest
	public void testToRegion() {
		testToManageNode(UMLElementTypes.Region_3000, UMLPackage.eINSTANCE.getRegion(), UMLElementTypes.Region_3000, false);
	}
	/**
	* Test to manage FinalState.
	*/
	@Test
	public void testToFinalState() {
		testToManageNode(UMLElementTypes.FinalState_5000, UMLPackage.eINSTANCE.getFinalState(), UMLElementTypes.Region_3000, false);
	}
	/**
	* Test to manage State.
	*/
	@Test
	public void testToState() {
		testToManageNode(UMLElementTypes.State_6000, UMLPackage.eINSTANCE.getState(), UMLElementTypes.Region_3000, false);
	}
	/**
	* Test to manage Pseudostate.
	*/
	@Test
	public void testToPseudostate8000() {
		testToManageNode(UMLElementTypes.Pseudostate_8000, UMLPackage.eINSTANCE.getPseudostate(), UMLElementTypes.Region_3000, false);
	}
	/**
	* Test to manage Pseudostate.
	*/
	@Test
	public void testToPseudostate9000() {
		testToManageNode(UMLElementTypes.Pseudostate_9000, UMLPackage.eINSTANCE.getPseudostate(), UMLElementTypes.Region_3000, false);
	}
	/**
	* Test to manage Pseudostate.
	*/
	@Test
	public void testToPseudostate10000() {
		testToManageNode(UMLElementTypes.Pseudostate_10000, UMLPackage.eINSTANCE.getPseudostate(), UMLElementTypes.Region_3000, false);
	}
	/**
	* Test to manage Pseudostate.
	*/
	@Test
	public void testToPseudostate1100() {
		testToManageNode(UMLElementTypes.Pseudostate_11000, UMLPackage.eINSTANCE.getPseudostate(), UMLElementTypes.Region_3000, false);
	}
	/**
	* Test to manage Pseudostate.
	*/
	@Test
	public void testToPseudostate12000() {
		testToManageNode(UMLElementTypes.Pseudostate_12000, UMLPackage.eINSTANCE.getPseudostate(), UMLElementTypes.Region_3000, false);
	}
	/**
	* Test to manage Pseudostate.
	*/
	@Test
	public void testToPseudostate13000() {
		testToManageNode(UMLElementTypes.Pseudostate_13000, UMLPackage.eINSTANCE.getPseudostate(), UMLElementTypes.Region_3000, false);
	}
	/**
	* Test to manage Pseudostate.
	*/
	@Test
	public void testToPseudostate14000() {
		testToManageNode(UMLElementTypes.Pseudostate_14000, UMLPackage.eINSTANCE.getPseudostate(), UMLElementTypes.Region_3000, false);
	}
	/**
	* Test to manage Pseudostate.
	*/
	@Test
	public void testToPseudostate15000() {
		testToManageNode(UMLElementTypes.Pseudostate_15000, UMLPackage.eINSTANCE.getPseudostate(), UMLElementTypes.Region_3000, false);
	}
	/**
	* Test to manage Comment.
	*/
	@Test
	@InvalidTest
	public void testToComment() {
		testToManageNode(UMLElementTypes.Comment_666, UMLPackage.eINSTANCE.getComment(), UMLElementTypes.Region_3000, false);
	}
	/**
	* Test to manage Constraint.
	*/
	@Test
	@InvalidTest
	public void testToConstraint() {
		testToManageNode(UMLElementTypes.Constraint_668, UMLPackage.eINSTANCE.getConstraint(), UMLElementTypes.Region_3000, false);
	}
}
