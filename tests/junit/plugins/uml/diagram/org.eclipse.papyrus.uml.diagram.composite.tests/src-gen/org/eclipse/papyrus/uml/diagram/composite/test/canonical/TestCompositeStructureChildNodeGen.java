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
package org.eclipse.papyrus.uml.diagram.composite.test.canonical;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.papyrus.commands.ICreationCommand;

import org.eclipse.papyrus.uml.diagram.composite.test.ICompositeStructureTestsConstants;
import org.eclipse.papyrus.diagram.tests.canonical.TestChildNode;
import org.eclipse.papyrus.uml.diagram.composite.CreateCompositeStructureCommand;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CollaborationRoleEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.PropertyPartEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CommentEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InteractionCompositeEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CollaborationUseEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.OpaqueBehaviorCompositeEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ActivityCompositeEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CollaborationCompositeEditPartCN;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.FunctionBehaviorCompositeEditPartCN;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCompositeStructureChildNodeGen.
 */
public class TestCompositeStructureChildNodeGen extends TestChildNode {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateCompositeStructureCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return ICompositeStructureTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return ICompositeStructureTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component Comment.
	 */
	@Test
	public void testChildNodeCommentEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getComment()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	public void testChildNodeConstraintEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getConstraint()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Interaction.
	 */
	@Test
	public void testChildNodeInteractionCompositeEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(InteractionCompositeEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getInteraction()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Property.
	 */
	@Test
	public void testChildNodePropertyPartEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(PropertyPartEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getProperty()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component CollaborationUse.
	 */
	@Test
	public void testChildNodeCollaborationUseEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(CollaborationUseEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getCollaborationUse()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component FunctionBehavior.
	 */
	@Test
	public void testChildNodeFunctionBehaviorCompositeEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(FunctionBehaviorCompositeEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getFunctionBehavior()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ConnectableElement.
	 */
	@Test
	public void testChildNodeCollaborationRoleEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(CollaborationRoleEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getConnectableElement()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component OpaqueBehavior.
	 */
	@Test
	public void testChildNodeOpaqueBehaviorCompositeEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(OpaqueBehaviorCompositeEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getOpaqueBehavior()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Collaboration.
	 */
	@Test
	public void testChildNodeCollaborationCompositeEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(CollaborationCompositeEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getCollaboration()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Activity.
	 */
	@Test
	public void testChildNodeActivityCompositeEditPartCN() {
		testToManageNode(UMLElementTypes.getElementType(ActivityCompositeEditPartCN.VISUAL_ID), UMLPackage.eINSTANCE.getActivity()
		, UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(ClassCompositeEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
}	
