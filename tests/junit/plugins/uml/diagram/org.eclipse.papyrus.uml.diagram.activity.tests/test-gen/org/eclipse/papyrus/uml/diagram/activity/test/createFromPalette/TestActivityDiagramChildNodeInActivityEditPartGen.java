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

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
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
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateNodeFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestActivityDiagramChildNodeInActivityEditPartGen.
 */
public class TestActivityDiagramChildNodeInActivityEditPartGen extends CreateNodeFromPaletteTest {
	
	
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
	 * Test to manage component BroadcastSignalAction.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeBroadcastSignalActionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(BroadcastSignalActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DestroyObjectAction.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeDestroyObjectActionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DestroyObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DataStoreNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeDataStoreNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DataStoreNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ConditionalNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeConditionalNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConditionalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DecisionNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeDecisionNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DecisionNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InitialNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeInitialNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InitialNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component SequenceNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeSequenceNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(SequenceNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component CentralBufferNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCentralBufferNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CentralBufferNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component SendObjectAction.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeSendObjectActionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(SendObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ExpansionRegion.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeExpansionRegionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ExpansionRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ForkNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeForkNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ForkNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ReadStructuralFeatureAction.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeReadStructuralFeatureActionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ReadStructuralFeatureActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component MergeNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeMergeNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(MergeNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ReadSelfAction.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeReadSelfActionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ReadSelfActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ActivityPartition.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeActivityPartitionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ActivityPartitionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ReadVariableAction.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeReadVariableActionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ReadVariableActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component CreateObjectAction.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCreateObjectActionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CreateObjectActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ActivityFinalNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeActivityFinalNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ActivityFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component JoinNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeJoinNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(JoinNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ValueSpecificationAction.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeValueSpecificationActionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ValueSpecificationActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Activity.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeActivityEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ActivityEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterruptibleActivityRegion.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeInterruptibleActivityRegionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InterruptibleActivityRegionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component StructuredActivityNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeStructuredActivityNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(StructuredActivityNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component AcceptEventAction.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeAcceptEventActionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(AcceptEventActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component OpaqueAction.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeOpaqueActionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(OpaqueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component FlowFinalNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeFlowFinalNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(FlowFinalNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component AddVariableValueAction.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeAddVariableValueActionEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(AddVariableValueActionEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component LoopNode.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeLoopNodeEditPart() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(LoopNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(ActivityEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.TYPED_INSTANCE;
	}
	
}	
