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
package org.eclipse.papyrus.uml.diagram.composite.test.createFromPalette;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.composite.CreateCompositeDiagramCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CollaborationCompositeEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CollaborationRoleEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CollaborationUseEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CommentEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationObservationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.FunctionBehaviorCompositeEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InformationItemEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.OpaqueBehaviorCompositeEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.PropertyPartEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ProtocolStateMachineCompositeEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.test.ICompositeDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateNodeFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCompositeStructureChildNodeInDurationObservationEditPartGen.
 */
public class TestCompositeStructureChildNodeInDurationObservationEditPartGen extends CreateNodeFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateCompositeDiagramCommand();
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
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCommentEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Property.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePropertyPartEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PropertyPartEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component TimeConstraint.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeTimeConstraintEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(TimeConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component FunctionBehavior.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeFunctionBehaviorCompositeEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component DurationConstraint.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeDurationConstraintEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DurationConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component CollaborationUse.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCollaborationUseEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CollaborationUseEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component OpaqueBehavior.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeOpaqueBehaviorCompositeEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ProtocolStateMachine.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeProtocolStateMachineCompositeEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ProtocolStateMachineCompositeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InformationItem.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeInformationItemEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(InformationItemEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Collaboration.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCollaborationCompositeEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CollaborationCompositeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ConnectableElement.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCollaborationRoleEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CollaborationRoleEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(DurationObservationEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	
}	
