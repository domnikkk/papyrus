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
package org.eclipse.papyrus.uml.diagram.activity.test.createFromPalette;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.activity.CreateActivityDiagramCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityEditPartCN;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityPartitionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.AddVariableValueActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.BroadcastSignalActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ConditionalNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.DestroyObjectActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExpansionRegionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.InterruptibleActivityRegionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.LoopNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ReadSelfActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ReadStructuralFeatureActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ReadVariableActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.SendObjectActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.SequenceNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ValueSpecificationActionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.activity.tests.IActivityDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestActivityDiagramLinkGen.
 */
public class TestActivityDiagramLinkGen extends CreateLinkFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateActivityDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return IActivityDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IActivityDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSequenceNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDecisionNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToSendObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromOpaqueActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDataStoreNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromJoinNodeToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCentralBufferNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToSequenceNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAcceptEventActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCreateObjectActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInterruptibleActivityRegionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromMergeNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityFinalNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityCNToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromLoopNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDestroyObjectActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadSelfActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInitialNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAcceptEventActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromValueSpecificationActionToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromSendObjectActionToBroadcastSignalAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToDestroyObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromAddVariableValueActionToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadVariableActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSendObjectActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromDestroyObjectActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromInitialNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityPartitionToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromInterruptibleActivityRegionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToDataStoreNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromJoinNodeToValueSpecificationAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToActivityFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadStructuralFeatureActionToActivityPartition() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromStructuredActivityNodeToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromForkNodeToMergeNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromConditionalNodeToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromCreateObjectActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityCNToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromMergeNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadVariableActionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromAddVariableValueActionToReadVariableAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromFlowFinalNodeToStructuredActivityNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromActivityPartitionToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToCreateObjectAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromForkNodeToLoopNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromStructuredActivityNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromBroadcastSignalActionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToAcceptEventAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromValueSpecificationActionToAddVariableValueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromCentralBufferNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToOpaqueAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityFinalNodeToDecisionNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDataStoreNodeToActivityCN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromBroadcastSignalActionToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromFlowFinalNodeToInterruptibleActivityRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromReadStructuralFeatureActionToInitialNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToExpansionRegion() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromSequenceNodeToActivity() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToFlowFinalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromExpansionRegionToJoinNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromReadSelfActionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromDecisionNodeToReadStructuralFeatureAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ControlFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkControlFlowFromOpaqueActionToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ControlFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromExpansionRegionToReadSelfAction() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromConditionalNodeToConditionalNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromActivityToForkNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ObjectFlow.
	 */
	@Test
	@GeneratedTest
	public void testLinkObjectFlowFromLoopNodeToCentralBufferNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ObjectFlowEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
}	
