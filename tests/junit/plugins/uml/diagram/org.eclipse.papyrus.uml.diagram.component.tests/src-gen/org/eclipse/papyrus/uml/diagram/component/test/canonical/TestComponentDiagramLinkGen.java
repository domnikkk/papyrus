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
package org.eclipse.papyrus.uml.diagram.component.test.canonical;

import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.diagram.tests.canonical.TestLink;
import org.eclipse.papyrus.uml.diagram.component.CreateComponentDiagramCommand;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.AbstractionEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ComponentRealizationEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.DependencyEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ManifestationEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.ModelEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.component.edit.parts.UsageEditPart;
import org.eclipse.papyrus.uml.diagram.component.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.component.test.IComponentDiagramTestsConstants;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestComponentDiagramLinkGen.
 */
public class TestComponentDiagramLinkGen extends TestLink {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateComponentDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return IComponentDiagramTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IComponentDiagramTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromModelToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromModelToModel() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromModelToModel() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInterfaceToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromComponentToModel() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelToModel() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromConstraintToModel() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromCommentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInterfaceToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromConstraintToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToModel() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromPackageToInterface() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromInterfaceToInterface() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromModelToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromCommentToModel() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromPackageToInterface() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromInterfaceToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromPackageToModel() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromInterfaceToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromModelToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromModelToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromPackageToInterface() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromModelToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromComponentToModel() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInterfaceToComment() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromCommentToModel() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromInterfaceToComment() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromInterfaceToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromModelToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromModelToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromModelToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromInterfaceToInterface() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInterfaceToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromModelToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromPackageToModel() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInterfaceToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromInterfaceToComment() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromConstraintToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromInterfaceToModel() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromModelToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromModelToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInterfaceToInterface() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToModel() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromModelToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInterfaceToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromModelToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromPackageToModel() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToModel() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToModel() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromInterfaceToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromInterfaceToModel() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromConstraintToModel() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromInterfaceToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInterfaceToInterface() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelToModel() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromCommentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromComponentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInterfaceToModel() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromComponentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromModelToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromInterfaceToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInterfaceToModel() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInterfaceToComment() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromModelToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromInterfaceToInterface() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromInterfaceToModel() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInterfaceToComment() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToModel() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromModelToModel() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromConstraintToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromComponentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToModel() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromPackageToInterface() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToModel() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInterfaceToInterface() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromInterfaceToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromInterfaceToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromModelToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromConstraintToModel() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromModelToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromComponentToModel() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToPackage() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromComponentToModel() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromInterfaceToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromComponentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromInterfaceToModel() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromModelToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToModel() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInterfaceToComponent() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromPackageToComponent() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromPackageToModel() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromCommentToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInterfaceToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromPackageToComment() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromConstraintToModel() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToComment() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromModelToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromModelToModel() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromModelToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromCommentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromInterfaceToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromComponentToComment() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromModelToComment() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToInterface() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromComponentToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromComponentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromInterfaceToComment() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromPackageToInterface() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	public void testLinkComponentRealizationFromCommentToModel() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromCommentToComponent() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromCommentToComment() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromCommentToInterface() {
		testToManageLink(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	public void testLinkManifestationFromInterfaceToPackage() {
		testToManageLink(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	public void testLinkDependencyFromPackageToConstraint() {
		testToManageLink(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	public void testLinkAbstractionFromConstraintToModel() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	public void testLinkInterfaceRealizationFromModelToComponent() {
		testToManageLink(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	public void testLinkUsageFromConstraintToPackage() {
		testToManageLink(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
}	
