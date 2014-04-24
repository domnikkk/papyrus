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
package org.eclipse.papyrus.uml.diagram.composite.test.canonical;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.uml.diagram.composite.CreateCompositeDiagramCommand;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.test.ICompositeDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.canonical.TestTopNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

/**
 * The Class TestCompositeDiagramLink use to test link.
 */
public class TestCompositeDiagramTopNode extends TestTopNode {
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	/**
	 * @see org.eclipse.papyrus.diagram.tests.canonical.AbstractPapyrusTestCase#getDiagramCommandCreation()
	 *
	 * @return
	 */
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateCompositeDiagramCommand();
	}

	/**
	 * @see org.eclipse.papyrus.diagram.tests.canonical.AbstractPapyrusTestCase#getProjectName()
	 *
	 * @return
	 */
	
	@Override
	protected String getProjectName() {
		return ICompositeDiagramTestsConstants.PROJECT_NAME;
	}

	/**
	 * @see org.eclipse.papyrus.diagram.tests.canonical.AbstractPapyrusTestCase#getFileName()
	 *
	 * @return
	 */
	
	@Override
	protected String getFileName() {
		return ICompositeDiagramTestsConstants.FILE_NAME;
	}

		
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.Class_2073, getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	/**
	* Test to manage Activity.
	*/
	@Test
	public void testToActivity() {
		testToManageNode(UMLElementTypes.Activity_2060, UMLPackage.eINSTANCE.getActivity(), UMLElementTypes.Activity_2060, false);
	}
	/**
	* Test to manage Interaction.
	*/
	@Test
	public void testToInteraction() {
		testToManageNode(UMLElementTypes.Interaction_2061, UMLPackage.eINSTANCE.getInteraction(), UMLElementTypes.Interaction_2061, false);
	}
	/**
	* Test to manage ProtocolStateMachine.
	*/
	@Test
	public void testToProtocolStateMachine() {
		testToManageNode(UMLElementTypes.ProtocolStateMachine_2062, UMLPackage.eINSTANCE.getProtocolStateMachine(), UMLElementTypes.ProtocolStateMachine_2062, false);
	}
	/**
	* Test to manage StateMachine.
	*/
	@Test
	public void testToStateMachine() {
		testToManageNode(UMLElementTypes.StateMachine_2063, UMLPackage.eINSTANCE.getStateMachine(), UMLElementTypes.StateMachine_2063, false);
	}
	/**
	* Test to manage FunctionBehavior.
	*/
	@Test
	public void testToFunctionBehavior() {
		testToManageNode(UMLElementTypes.FunctionBehavior_2064, UMLPackage.eINSTANCE.getFunctionBehavior(), UMLElementTypes.FunctionBehavior_2064, false);
	}
	/**
	* Test to manage OpaqueBehavior.
	*/
	@Test
	public void testToOpaqueBehavior() {
		testToManageNode(UMLElementTypes.OpaqueBehavior_2065, UMLPackage.eINSTANCE.getOpaqueBehavior(), UMLElementTypes.OpaqueBehavior_2065, false);
	}
	/**
	* Test to manage Component.
	*/
	@Test
	public void testToComponent() {
		testToManageNode(UMLElementTypes.Component_2069, UMLPackage.eINSTANCE.getComponent(), UMLElementTypes.Component_2069, false);
	}
	/**
	* Test to manage Device.
	*/
	@Test
	public void testToDevice() {
		testToManageNode(UMLElementTypes.Device_2070, UMLPackage.eINSTANCE.getDevice(), UMLElementTypes.Device_2070, false);
	}
	/**
	* Test to manage ExecutionEnvironment.
	*/
	@Test
	public void testToExecutionEnvironment() {
		testToManageNode(UMLElementTypes.ExecutionEnvironment_2071, UMLPackage.eINSTANCE.getExecutionEnvironment(), UMLElementTypes.ExecutionEnvironment_2071, false);
	}
	/**
	* Test to manage Node.
	*/
	@Test
	public void testToNode() {
		testToManageNode(UMLElementTypes.Node_2072, UMLPackage.eINSTANCE.getNode(), UMLElementTypes.Node_2072, false);
	}
	/**
	* Test to manage Class.
	*/
	@Test
	public void testToClass() {
		testToManageNode(UMLElementTypes.Class_2073, UMLPackage.eINSTANCE.getClass_(), UMLElementTypes.Class_2073, false);
	}
	/**
	* Test to manage Collaboration.
	*/
	@Test
	public void testToCollaboration() {
		testToManageNode(UMLElementTypes.Collaboration_2075, UMLPackage.eINSTANCE.getCollaboration(), UMLElementTypes.Collaboration_2075, false);
	}
	/**
	* Test to manage Interface.
	*/
	@Test
	public void testToInterface() {
		testToManageNode(UMLElementTypes.Interface_2076, UMLPackage.eINSTANCE.getInterface(), UMLElementTypes.Interface_2076, false);
	}
	/**
	* Test to manage PrimitiveType.
	*/
	@Test
	public void testToPrimitiveType() {
		testToManageNode(UMLElementTypes.PrimitiveType_2066, UMLPackage.eINSTANCE.getPrimitiveType(), UMLElementTypes.PrimitiveType_2066, false);
	}
	/**
	* Test to manage Enumeration.
	*/
	@Test
	public void testToEnumeration() {
		testToManageNode(UMLElementTypes.Enumeration_2067, UMLPackage.eINSTANCE.getEnumeration(), UMLElementTypes.Enumeration_2067, false);
	}
	/**
	* Test to manage DataType.
	*/
	@Test
	public void testToDataType() {
		testToManageNode(UMLElementTypes.DataType_2068, UMLPackage.eINSTANCE.getDataType(), UMLElementTypes.DataType_2068, false);
	}
	/**
	* Test to manage Actor.
	*/
	@Test
	public void testToActor() {
		testToManageNode(UMLElementTypes.Actor_2077, UMLPackage.eINSTANCE.getActor(), UMLElementTypes.Actor_2077, false);
	}
	/**
	* Test to manage DeploymentSpecification.
	*/
	@Test
	public void testToDeploymentSpecification() {
		testToManageNode(UMLElementTypes.DeploymentSpecification_2078, UMLPackage.eINSTANCE.getDeploymentSpecification(), UMLElementTypes.DeploymentSpecification_2078, false);
	}
	/**
	* Test to manage Artifact.
	*/
	@Test
	public void testToArtifact() {
		testToManageNode(UMLElementTypes.Artifact_2079, UMLPackage.eINSTANCE.getArtifact(), UMLElementTypes.Artifact_2079, false);
	}
	/**
	* Test to manage InformationItem.
	*/
	@Test
	public void testToInformationItem() {
		testToManageNode(UMLElementTypes.InformationItem_2080, UMLPackage.eINSTANCE.getInformationItem(), UMLElementTypes.InformationItem_2080, false);
	}
	/**
	* Test to manage Signal.
	*/
	@Test
	public void testToSignal() {
		testToManageNode(UMLElementTypes.Signal_2081, UMLPackage.eINSTANCE.getSignal(), UMLElementTypes.Signal_2081, false);
	}
	/**
	* Test to manage UseCase.
	*/
	@Test
	public void testToUseCase() {
		testToManageNode(UMLElementTypes.UseCase_2082, UMLPackage.eINSTANCE.getUseCase(), UMLElementTypes.UseCase_2082, false);
	}
	/**
	* Test to manage SignalEvent.
	*/
	@Test
	public void testToSignalEvent() {
		testToManageNode(UMLElementTypes.SignalEvent_2083, UMLPackage.eINSTANCE.getSignalEvent(), UMLElementTypes.SignalEvent_2083, false);
	}
	/**
	* Test to manage CallEvent.
	*/
	@Test
	public void testToCallEvent() {
		testToManageNode(UMLElementTypes.CallEvent_2084, UMLPackage.eINSTANCE.getCallEvent(), UMLElementTypes.CallEvent_2084, false);
	}
	/**
	* Test to manage AnyReceiveEvent.
	*/
	@Test
	public void testToAnyReceiveEvent() {
		testToManageNode(UMLElementTypes.AnyReceiveEvent_2085, UMLPackage.eINSTANCE.getAnyReceiveEvent(), UMLElementTypes.AnyReceiveEvent_2085, false);
	}
	/**
	* Test to manage ChangeEvent.
	*/
	@Test
	public void testToChangeEvent() {
		testToManageNode(UMLElementTypes.ChangeEvent_2088, UMLPackage.eINSTANCE.getChangeEvent(), UMLElementTypes.ChangeEvent_2088, false);
	}
	/**
	* Test to manage TimeEvent.
	*/
	@Test
	public void testToTimeEvent() {
		testToManageNode(UMLElementTypes.TimeEvent_2089, UMLPackage.eINSTANCE.getTimeEvent(), UMLElementTypes.TimeEvent_2089, false);
	}
	/**
	* Test to manage DurationObservation.
	*/
	@Test
	public void testToDurationObservation() {
		testToManageNode(UMLElementTypes.DurationObservation_2093, UMLPackage.eINSTANCE.getDurationObservation(), UMLElementTypes.DurationObservation_2093, false);
	}
	/**
	* Test to manage TimeObservation.
	*/
	@Test
	public void testToTimeObservation() {
		testToManageNode(UMLElementTypes.TimeObservation_2094, UMLPackage.eINSTANCE.getTimeObservation(), UMLElementTypes.TimeObservation_2094, false);
	}
	/**
	* Test to manage LiteralBoolean.
	*/
	@Test
	public void testToLiteralBoolean() {
		testToManageNode(UMLElementTypes.LiteralBoolean_2095, UMLPackage.eINSTANCE.getLiteralBoolean(), UMLElementTypes.LiteralBoolean_2095, false);
	}
	/**
	* Test to manage LiteralInteger.
	*/
	@Test
	public void testToLiteralInteger() {
		testToManageNode(UMLElementTypes.LiteralInteger_2096, UMLPackage.eINSTANCE.getLiteralInteger(), UMLElementTypes.LiteralInteger_2096, false);
	}
	/**
	* Test to manage LiteralNull.
	*/
	@Test
	public void testToLiteralNull() {
		testToManageNode(UMLElementTypes.LiteralNull_2097, UMLPackage.eINSTANCE.getLiteralNull(), UMLElementTypes.LiteralNull_2097, false);
	}
	/**
	* Test to manage LiteralString.
	*/
	@Test
	public void testToLiteralString() {
		testToManageNode(UMLElementTypes.LiteralString_2098, UMLPackage.eINSTANCE.getLiteralString(), UMLElementTypes.LiteralString_2098, false);
	}
	/**
	* Test to manage LiteralUnlimitedNatural.
	*/
	@Test
	public void testToLiteralUnlimitedNatural() {
		testToManageNode(UMLElementTypes.LiteralUnlimitedNatural_2099, UMLPackage.eINSTANCE.getLiteralUnlimitedNatural(), UMLElementTypes.LiteralUnlimitedNatural_2099, false);
	}
	/**
	* Test to manage StringExpression.
	*/
	@Test
	public void testToStringExpression() {
		testToManageNode(UMLElementTypes.StringExpression_2100, UMLPackage.eINSTANCE.getStringExpression(), UMLElementTypes.StringExpression_2100, false);
	}
	/**
	* Test to manage OpaqueExpression.
	*/
	@Test
	public void testToOpaqueExpression() {
		testToManageNode(UMLElementTypes.OpaqueExpression_2101, UMLPackage.eINSTANCE.getOpaqueExpression(), UMLElementTypes.OpaqueExpression_2101, false);
	}
	/**
	* Test to manage TimeExpression.
	*/
	@Test
	public void testToTimeExpression() {
		testToManageNode(UMLElementTypes.TimeExpression_2102, UMLPackage.eINSTANCE.getTimeExpression(), UMLElementTypes.TimeExpression_2102, false);
	}
	/**
	* Test to manage Expression.
	*/
	@Test
	public void testToExpression() {
		testToManageNode(UMLElementTypes.Expression_2103, UMLPackage.eINSTANCE.getExpression(), UMLElementTypes.Expression_2103, false);
	}
	/**
	* Test to manage Duration.
	*/
	@Test
	public void testToDuration() {
		testToManageNode(UMLElementTypes.Duration_2104, UMLPackage.eINSTANCE.getDuration(), UMLElementTypes.Duration_2104, false);
	}
	/**
	* Test to manage TimeInterval.
	*/
	@Test
	public void testToTimeInterval() {
		testToManageNode(UMLElementTypes.TimeInterval_2105, UMLPackage.eINSTANCE.getTimeInterval(), UMLElementTypes.TimeInterval_2105, false);
	}
	/**
	* Test to manage DurationInterval.
	*/
	@Test
	public void testToDurationInterval() {
		testToManageNode(UMLElementTypes.DurationInterval_2106, UMLPackage.eINSTANCE.getDurationInterval(), UMLElementTypes.DurationInterval_2106, false);
	}
	/**
	* Test to manage Interval.
	*/
	@Test
	public void testToInterval() {
		testToManageNode(UMLElementTypes.Interval_2107, UMLPackage.eINSTANCE.getInterval(), UMLElementTypes.Interval_2107, false);
	}
	/**
	* Test to manage InstanceValue.
	*/
	@Test
	public void testToInstanceValue() {
		testToManageNode(UMLElementTypes.InstanceValue_2108, UMLPackage.eINSTANCE.getInstanceValue(), UMLElementTypes.InstanceValue_2108, false);
	}
	/**
	* Test to manage Comment.
	*/
	@Test
	public void testToComment() {
		testToManageNode(UMLElementTypes.Comment_2109, UMLPackage.eINSTANCE.getComment(), UMLElementTypes.Comment_2109, false);
	}
	/**
	* Test to manage DurationConstraint.
	*/
	@Test
	public void testToDurationConstraint() {
		testToManageNode(UMLElementTypes.DurationConstraint_2110, UMLPackage.eINSTANCE.getDurationConstraint(), UMLElementTypes.DurationConstraint_2110, false);
	}
	/**
	* Test to manage TimeConstraint.
	*/
	@Test
	public void testToTimeConstraint() {
		testToManageNode(UMLElementTypes.TimeConstraint_2111, UMLPackage.eINSTANCE.getTimeConstraint(), UMLElementTypes.TimeConstraint_2111, false);
	}
	/**
	* Test to manage IntervalConstraint.
	*/
	@Test
	public void testToIntervalConstraint() {
		testToManageNode(UMLElementTypes.IntervalConstraint_2112, UMLPackage.eINSTANCE.getIntervalConstraint(), UMLElementTypes.IntervalConstraint_2112, false);
	}
	/**
	* Test to manage InteractionConstraint.
	*/
	@Test
	public void testToInteractionConstraint() {
		testToManageNode(UMLElementTypes.InteractionConstraint_2113, UMLPackage.eINSTANCE.getInteractionConstraint(), UMLElementTypes.InteractionConstraint_2113, false);
	}
	/**
	* Test to manage Constraint.
	*/
	@Test
	public void testToConstraint() {
		testToManageNode(UMLElementTypes.Constraint_2114, UMLPackage.eINSTANCE.getConstraint(), UMLElementTypes.Constraint_2114, false);
	}
}
