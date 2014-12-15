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
package org.eclipse.papyrus.uml.diagram.composite.test.canonical;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.InteractiveTest;
import org.eclipse.papyrus.uml.diagram.composite.CreateCompositeDiagramCommand;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.test.ICompositeDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestChildNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

/**
 * The Class TestComponentDiagramChildNode.
 */

public class TestCompositeDiagramCompositeChildNode extends TestChildNode {

	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}

	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateCompositeDiagramCommand();
	}

	@Override
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.Class_2073, getDiagramEditPart().getDiagramPreferencesHint());
	}

	@Override
	protected String getProjectName() {
		return ICompositeDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ICompositeDiagramTestsConstants.FILE_NAME;
	}


	/**
	 * Test to manage Property.
	 */
	@Test
	public void testToProperty() {
		testToManageNodeWithMask(UMLElementTypes.Property_3070, UMLPackage.eINSTANCE.getProperty(), UMLElementTypes.Class_2073, false, "Attribute", 0);
	}

	/**
	 * Test to manage CollaborationUse.
	 */
	@Test
	public void testToCollaborationUse() {
		testToManageNode(UMLElementTypes.CollaborationUse_3071, UMLPackage.eINSTANCE.getCollaborationUse(), UMLElementTypes.Class_2073, false);
	}

	/**
	 * Test to manage Activity.
	 */
	@Test
	@InteractiveTest
	public void testToActivity() {
		testToManageNode(UMLElementTypes.Activity_3072, UMLPackage.eINSTANCE.getActivity(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage Interaction.
	 */
	@Test
	@InteractiveTest
	public void testToInteraction() {
		testToManageNode(UMLElementTypes.Interaction_3073, UMLPackage.eINSTANCE.getInteraction(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage ProtocolStateMachine.
	 */
	@Test
	@InteractiveTest
	public void testToProtocolStateMachine() {
		testToManageNode(UMLElementTypes.ProtocolStateMachine_3074, UMLPackage.eINSTANCE.getProtocolStateMachine(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage StateMachine.
	 */
	@Test
	@InteractiveTest
	public void testToStateMachine() {
		testToManageNode(UMLElementTypes.StateMachine_3075, UMLPackage.eINSTANCE.getStateMachine(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage FunctionBehavior.
	 */
	@Test
	@InteractiveTest
	public void testToFunctionBehavior() {
		testToManageNode(UMLElementTypes.FunctionBehavior_3076, UMLPackage.eINSTANCE.getFunctionBehavior(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage OpaqueBehavior.
	 */
	@Test
	@InteractiveTest
	public void testToOpaqueBehavior() {
		testToManageNode(UMLElementTypes.OpaqueBehavior_3077, UMLPackage.eINSTANCE.getOpaqueBehavior(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage Component.
	 */
	@Test
	@InteractiveTest
	public void testToComponent() {
		testToManageNode(UMLElementTypes.Component_3081, UMLPackage.eINSTANCE.getComponent(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage Device.
	 */
	@Test
	@InteractiveTest
	public void testToDevice() {
		testToManageNode(UMLElementTypes.Device_3082, UMLPackage.eINSTANCE.getDevice(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage ExecutionEnvironment.
	 */
	@Test
	@InteractiveTest
	public void testToExecutionEnvironment() {
		testToManageNode(UMLElementTypes.ExecutionEnvironment_3083, UMLPackage.eINSTANCE.getExecutionEnvironment(), UMLElementTypes.Class_2073, false);
	}

	/**
	 * Test to manage Node.
	 */
	@Test
	@InteractiveTest
	public void testToNode() {
		testToManageNode(UMLElementTypes.Node_3084, UMLPackage.eINSTANCE.getNode(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage Class.
	 */
	@Test
	@InteractiveTest
	public void testToClass() {
		testToManageNode(UMLElementTypes.Class_3085, UMLPackage.eINSTANCE.getClass_(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage Collaboration.
	 */
	@Test
	@InteractiveTest
	public void testToCollaboration() {
		testToManageNode(UMLElementTypes.Collaboration_3086, UMLPackage.eINSTANCE.getCollaboration(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage Interface.
	 */
	@Test
	@InteractiveTest
	public void testToInterface() {
		testToManageNode(UMLElementTypes.Interface_3087, UMLPackage.eINSTANCE.getInterface(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage PrimitiveType.
	 */
	@Test
	@InteractiveTest
	public void testToPrimitiveType() {
		testToManageNode(UMLElementTypes.PrimitiveType_3078, UMLPackage.eINSTANCE.getPrimitiveType(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage Enumeration.
	 */
	@Test
	@InteractiveTest
	public void testToEnumeration() {
		testToManageNode(UMLElementTypes.Enumeration_3079, UMLPackage.eINSTANCE.getEnumeration(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage DataType.
	 */
	@Test
	@InteractiveTest
	public void testToDataType() {
		testToManageNode(UMLElementTypes.DataType_3080, UMLPackage.eINSTANCE.getDataType(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage Actor.
	 */
	@Test
	@InteractiveTest
	public void testToActor() {
		testToManageNode(UMLElementTypes.Actor_3091, UMLPackage.eINSTANCE.getActor(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage DeploymentSpecification.
	 */
	@Test
	@InteractiveTest
	public void testToDeploymentSpecification() {
		testToManageNode(UMLElementTypes.DeploymentSpecification_3092, UMLPackage.eINSTANCE.getDeploymentSpecification(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage Artifact.
	 */
	@Test
	@InteractiveTest
	public void testToArtifact() {
		testToManageNode(UMLElementTypes.Artifact_3093, UMLPackage.eINSTANCE.getArtifact(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage InformationItem.
	 */
	@Test
	@InteractiveTest
	public void testToInformationItem() {
		testToManageNode(UMLElementTypes.InformationItem_3094, UMLPackage.eINSTANCE.getInformationItem(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage Signal.
	 */
	@Test
	@InteractiveTest
	public void testToSignal() {
		testToManageNode(UMLElementTypes.Signal_3095, UMLPackage.eINSTANCE.getSignal(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage UseCase.
	 */
	@Test
	@InteractiveTest
	public void testToUseCase() {
		testToManageNode(UMLElementTypes.UseCase_3096, UMLPackage.eINSTANCE.getUseCase(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage Comment.
	 */
	@Test
	public void testToComment() {
		testToManageNode(UMLElementTypes.Comment_3097, UMLPackage.eINSTANCE.getComment(), UMLElementTypes.Class_2073, false);
	}

	/**
	 * Test to manage DurationConstraint.
	 */
	@Test
	@InteractiveTest
	public void testToDurationConstraint() {
		testToManageNode(UMLElementTypes.DurationConstraint_3116, UMLPackage.eINSTANCE.getDurationConstraint(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage TimeConstraint.
	 */
	@Test
	@InteractiveTest
	public void testToTimeConstraint() {
		testToManageNode(UMLElementTypes.TimeConstraint_3117, UMLPackage.eINSTANCE.getTimeConstraint(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage IntervalConstraint.
	 */
	@Test
	@InteractiveTest
	public void testToIntervalConstraint() {
		testToManageNode(UMLElementTypes.IntervalConstraint_3118, UMLPackage.eINSTANCE.getIntervalConstraint(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage InteractionConstraint.
	 */
	@Test
	@InteractiveTest
	public void testToInteractionConstraint() {
		testToManageNode(UMLElementTypes.InteractionConstraint_3119, UMLPackage.eINSTANCE.getInteractionConstraint(), UMLElementTypes.Class_2073, true);
	}

	/**
	 * Test to manage Constraint.
	 */
	@Test
	public void testToConstraint() {
		testToManageNode(UMLElementTypes.Constraint_3120, UMLPackage.eINSTANCE.getConstraint(), UMLElementTypes.Class_2073, false);
	}

	/**
	 * Test to manage Port.
	 */
	@Test
	public void testToPort() {
		setTestAffixedNode(true);
		testToManageNode(UMLElementTypes.Port_3069, UMLPackage.eINSTANCE.getPort(), UMLElementTypes.Class_2073, false, 4, 0, 1, 1, true, null, 0);
		setTestAffixedNode(false);
	}

}
