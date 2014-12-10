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
package org.eclipse.papyrus.uml.diagram.deployment.test.drop;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
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
import org.eclipse.papyrus.uml.diagram.tests.drop.AbstractDropNodeTest;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

/**
 * The Class TestDeploymentDiagramDropGen.
 */
public class TestDeploymentDiagramDropGen extends AbstractDropNodeTest {

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
	 * {@inheritDoc}
	 */
	@Override
	protected View getRootView() {
		return (View)getContainerEditPart().getModel();
	}

	/**
	 * Test to manage component Device.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeDeviceEditPart() {
		testToDropNode(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getDevice()
		, true);
	}
	/**
	 * Test to manage component Node.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeNodeEditPart() {
		testToDropNode(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getNode()
		, true);
	}
	/**
	 * Test to manage component NamedElement.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeDefaultNamedElementEditPart() {
		testToDropNode(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getNamedElement()
		, true);
	}
	/**
	 * Test to manage component ExecutionEnvironment.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeExecutionEnvironmentEditPart() {
		testToDropNode(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getExecutionEnvironment()
		, true);
	}
	/**
	 * Test to manage component Constraint.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeConstraintEditPart() {
		testToDropNode(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getConstraint()
		, true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeDependencyNodeEditPart() {
		testToDropNode(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getDependency()
		, true);
	}
	/**
	 * Test to manage component Comment.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeCommentEditPart() {
		testToDropNode(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getComment()
		, true);
	}
	/**
	 * Test to manage component Package.
	 */
	@Test
	@GeneratedTest
	public void testDropNodePackageEditPart() {
		testToDropNode(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getPackage()
		, true);
	}
	/**
	 * Test to manage component Model.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeModelEditPart() {
		testToDropNode(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getModel()
		, true);
	}
	/**
	 * Test to manage component Artifact.
	 */
	@Test
	@GeneratedTest
	public void testDropNodeArtifactEditPart() {
		testToDropNode(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLPackage.eINSTANCE.getArtifact()
		, true);
	}
	
}
