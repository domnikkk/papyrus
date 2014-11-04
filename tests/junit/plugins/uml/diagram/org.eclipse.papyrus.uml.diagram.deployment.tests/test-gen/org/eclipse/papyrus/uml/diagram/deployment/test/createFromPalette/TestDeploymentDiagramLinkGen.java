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

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.deployment.CreateDeploymentDiagramCommand;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ArtifactEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.DefaultNamedElementEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.DependencyBranchEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.DependencyEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.DependencyNodeEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.DeploymentEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.DeviceEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ExecutionEnvironmentEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ManifestationEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.ModelEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.NodeEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.deployment.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.deployment.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.deployment.test.IDeploymentDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestDeploymentDiagramLinkGen.
 */
public class TestDeploymentDiagramLinkGen extends CreateLinkFromPaletteTest {
	
	
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDefaultNamedElementToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDeviceToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDefaultNamedElementToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromModelToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromExecutionEnvironmentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromExecutionEnvironmentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromArtifactToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromNodeToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromArtifactToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDependencyNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDefaultNamedElementToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromConstraintToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromArtifactToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromModelToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromConstraintToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDependencyNodeToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDefaultNamedElementToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDefaultNamedElementToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDependencyNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDeviceToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDependencyNodeToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromNodeToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromArtifactToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDefaultNamedElementToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromArtifactToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromModelToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromModelToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromExecutionEnvironmentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDependencyNodeToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromNodeToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromModelToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromArtifactToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDefaultNamedElementToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDeviceToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromConstraintToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDependencyNodeToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromConstraintToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDeviceToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromArtifactToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDefaultNamedElementToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromNodeToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDependencyNodeToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromNodeToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromModelToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromCommentToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDependencyNodeToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromConstraintToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDependencyNodeToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromExecutionEnvironmentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromPackageToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDeviceToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDefaultNamedElementToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDefaultNamedElementToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromModelToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDependencyNodeToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromPackageToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDefaultNamedElementToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDeviceToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromArtifactToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromNodeToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDependencyNodeToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromModelToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDeviceToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDeviceToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDeviceToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromExecutionEnvironmentToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDependencyNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromNodeToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDeviceToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromPackageToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDeviceToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromModelToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromModelToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromPackageToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDefaultNamedElementToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromConstraintToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDeviceToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDefaultNamedElementToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromExecutionEnvironmentToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDeviceToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDeviceToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromModelToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDependencyNodeToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromModelToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromModelToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromArtifactToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDefaultNamedElementToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromArtifactToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromModelToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromModelToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromModelToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromArtifactToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDeviceToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromExecutionEnvironmentToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromModelToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDeviceToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromCommentToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromExecutionEnvironmentToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromExecutionEnvironmentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromModelToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDeviceToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDefaultNamedElementToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromNodeToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromArtifactToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDependencyNodeToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDependencyNodeToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDefaultNamedElementToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromExecutionEnvironmentToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromExecutionEnvironmentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDefaultNamedElementToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromArtifactToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDefaultNamedElementToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDeviceToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDeviceToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromArtifactToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromConstraintToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromArtifactToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromExecutionEnvironmentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDependencyNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromNodeToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDeviceToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromCommentToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromExecutionEnvironmentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromNodeToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromConstraintToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDefaultNamedElementToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromCommentToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromExecutionEnvironmentToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromExecutionEnvironmentToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromConstraintToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromConstraintToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromArtifactToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromExecutionEnvironmentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromArtifactToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromPackageToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDeviceToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromExecutionEnvironmentToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromCommentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromNodeToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromArtifactToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromExecutionEnvironmentToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDefaultNamedElementToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDefaultNamedElementToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromCommentToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDefaultNamedElementToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDefaultNamedElementToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromModelToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromArtifactToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDeviceToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromArtifactToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDeviceToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDeviceToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDependencyNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromArtifactToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromArtifactToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromPackageToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromCommentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromArtifactToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromNodeToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromExecutionEnvironmentToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromArtifactToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromNodeToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromNodeToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromArtifactToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDefaultNamedElementToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromExecutionEnvironmentToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDeviceToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDeviceToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromPackageToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromNodeToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromExecutionEnvironmentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDefaultNamedElementToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDeviceToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDefaultNamedElementToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromPackageToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromCommentToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromCommentToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromPackageToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromCommentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDefaultNamedElementToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDependencyNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromExecutionEnvironmentToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromExecutionEnvironmentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromExecutionEnvironmentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromModelToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromModelToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromExecutionEnvironmentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromArtifactToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromExecutionEnvironmentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromExecutionEnvironmentToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDependencyNodeToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromModelToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDefaultNamedElementToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDeviceToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromConstraintToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDependencyNodeToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDefaultNamedElementToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromExecutionEnvironmentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromArtifactToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromArtifactToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDependencyNodeToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromArtifactToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromConstraintToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromExecutionEnvironmentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDeviceToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromModelToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromConstraintToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromExecutionEnvironmentToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDependencyNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromExecutionEnvironmentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromCommentToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDeviceToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDeviceToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromExecutionEnvironmentToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromConstraintToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromExecutionEnvironmentToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromExecutionEnvironmentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromArtifactToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromNodeToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDeviceToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromExecutionEnvironmentToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromArtifactToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromNodeToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromArtifactToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDeviceToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDependencyNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDefaultNamedElementToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromNodeToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromModelToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDefaultNamedElementToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromCommentToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDeviceToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDeviceToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDependencyNodeToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDefaultNamedElementToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromExecutionEnvironmentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromNodeToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDefaultNamedElementToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromCommentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromPackageToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromArtifactToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromArtifactToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDependencyNodeToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromPackageToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDefaultNamedElementToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromArtifactToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromCommentToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDependencyNodeToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromPackageToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromNodeToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDependencyNodeToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDefaultNamedElementToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromPackageToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDefaultNamedElementToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromModelToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDeviceToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromExecutionEnvironmentToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDefaultNamedElementToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromExecutionEnvironmentToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDeviceToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromModelToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromNodeToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDependencyNodeToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromArtifactToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDependencyNodeToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromNodeToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromArtifactToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDeviceToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromArtifactToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromModelToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromExecutionEnvironmentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDependencyNodeToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromNodeToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDependencyNodeToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromArtifactToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToArtifact() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromArtifactToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ArtifactEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromPackageToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromDefaultNamedElementToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDeviceToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromNodeToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromExecutionEnvironmentToDevice() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromDefaultNamedElementToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromDefaultNamedElementToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromDeviceToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(DeviceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromModelToExecutionEnvironment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ExecutionEnvironmentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Deployment.
	 */
	@Test
	@GeneratedTest
	public void testLinkDeploymentFromModelToDependencyNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyNodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DeploymentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromConstraintToNode() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(NodeEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromModelToDefaultNamedElement() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DefaultNamedElementEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyBranchFromCommentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyBranchEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
}	
