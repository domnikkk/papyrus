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
package org.eclipse.papyrus.uml.diagram.deployment.test.appearance;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.deployment.CreateDeploymentDiagramCommand;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ArtifactEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.DefaultNamedElementEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.DependencyNodeEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.DeviceEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ExecutionEnvironmentEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ModelEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.NodeEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.deployment.test.IDeploymentDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.appearance.AppearanceNodeTest;
import org.junit.Test;

/**
 * The Class TestDeploymentDiagramAppearanceGen.
 */
public class TestDeploymentDiagramAppearanceGen extends AppearanceNodeTest {

	@Override
	public GraphicalEditPart getContainerEditPart() {
		return getDiagramEditPart();
	}
	
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
	 * Test to manage component Artifact.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeArtifactEditPart() {
		testAppearance(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Device.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeDeviceEditPart() {
		testAppearance(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeModelEditPart() {
		testAppearance(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodePackageEditPart() {
		testAppearance(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component NamedElement.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeDefaultNamedElementEditPart() {
		testAppearance(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeCommentEditPart() {
		testAppearance(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeDependencyNodeEditPart() {
		testAppearance(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Node.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeNodeEditPart() {
		testAppearance(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component ExecutionEnvironment.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeExecutionEnvironmentEditPart() {
		testAppearance(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID));
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testAppearanceNodeConstraintEditPart() {
		testAppearance(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID));
	}
}
