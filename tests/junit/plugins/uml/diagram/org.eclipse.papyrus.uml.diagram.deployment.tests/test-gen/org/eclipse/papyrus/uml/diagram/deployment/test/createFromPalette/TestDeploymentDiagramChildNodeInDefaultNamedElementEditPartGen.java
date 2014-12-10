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
package org.eclipse.papyrus.uml.diagram.deployment.test.createFromPalette;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.deployment.CreateDeploymentDiagramCommand;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ArtifactEditPartACN;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ArtifactEditPartCN;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.CommentEditPartCN;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.DefaultNamedElementEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.DeviceEditPartCN;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ExecutionEnvironmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ModelEditPartCN;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.NestedArtifactNodeEditPartCN;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.NestedDeviceEditPartCN;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.NestedExecutionEnvironmentEditPartCN;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.NestedNodeEditPartCN;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.NodeEditPartCN;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.PackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.deployment.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.deployment.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.deployment.test.IDeploymentDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateNodeFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestDeploymentDiagramChildNodeInDefaultNamedElementEditPartGen.
 */
public class TestDeploymentDiagramChildNodeInDefaultNamedElementEditPartGen extends CreateNodeFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateDeploymentDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return IDeploymentDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IDeploymentDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeCommentEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(CommentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Artifact.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeArtifactEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ArtifactEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	@GeneratedTest
	public void testChildNodePackageEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(PackageEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Artifact.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeArtifactEditPartACN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ArtifactEditPartACN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Artifact.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeNestedArtifactNodeEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(NestedArtifactNodeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeModelEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ModelEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Node.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeNestedNodeEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(NestedNodeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Node.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeNodeEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(NodeEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Device.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeNestedDeviceEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(NestedDeviceEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ExecutionEnvironment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeExecutionEnvironmentEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Device.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeDeviceEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(DeviceEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeConstraintEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(ConstraintEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ExecutionEnvironment.
	 */
	@Test
	@GeneratedTest
	public void testChildNodeNestedExecutionEnvironmentEditPartCN() {
		testCreateNodeFromPalette(UMLElementTypes.getElementType(NestedExecutionEnvironmentEditPartCN.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), true);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override 
	protected CreateViewRequest createViewRequestShapeContainer() {
		return CreateViewRequestFactory.getCreateShapeRequest(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), getDiagramEditPart().getDiagramPreferencesHint());
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
	
}	
