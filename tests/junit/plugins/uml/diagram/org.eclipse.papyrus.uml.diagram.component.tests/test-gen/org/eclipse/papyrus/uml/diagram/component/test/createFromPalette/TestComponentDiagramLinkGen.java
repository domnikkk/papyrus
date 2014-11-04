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
package org.eclipse.papyrus.uml.diagram.component.test.createFromPalette;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
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
import org.eclipse.papyrus.uml.diagram.component.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.component.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.component.test.IComponentDiagramTestsConstants;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkFromPaletteTest;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestComponentDiagramLinkGen.
 */
public class TestComponentDiagramLinkGen extends CreateLinkFromPaletteTest {
	
	
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
	@GeneratedTest
	public void testLinkUsageFromInterfaceToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromModelToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromComponentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInterfaceToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromModelToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromInterfaceToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInterfaceToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInterfaceToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromInterfaceToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromModelToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromModelToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromModelToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromModelToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromInterfaceToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInterfaceToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromInterfaceToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromInterfaceToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromModelToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInterfaceToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromModelToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInterfaceToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInterfaceToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkManifestationFromPackageToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromCommentToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromInterfaceToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromInterfaceToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromConstraintToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromCommentToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromPackageToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInterfaceToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromInterfaceToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInterfaceToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromInterfaceToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromInterfaceToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromInterfaceToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromInterfaceToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromCommentToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromConstraintToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromModelToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkManifestationFromComponentToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromConstraintToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInterfaceToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromInterfaceToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromInterfaceToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInterfaceToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInterfaceToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromInterfaceToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInterfaceToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromPackageToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromPackageToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromCommentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromConstraintToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromModelToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromModelToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromModelToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromComponentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromInterfaceToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromInterfaceToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromInterfaceToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromConstraintToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromInterfaceToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromPackageToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromModelToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromComponentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromModelToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInterfaceToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromInterfaceToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromComponentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromComponentToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromCommentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromComponentToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromModelToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromComponentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Manifestation.
	 */
	@Test
	@GeneratedTest
	public void testLinkManifestationFromInterfaceToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromConstraintToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromCommentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromCommentToConstraint() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	public void testLinkManifestationFromModelToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ManifestationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromPackageToPackage() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromComponentToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromComponentToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromPackageToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelToModel() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
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
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromPackageToComponent() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromConstraintToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component InterfaceRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkInterfaceRealizationFromComponentToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ComponentEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromModelToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromModelToInterface() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ModelEditPart.VISUAL_ID), UMLElementTypes.getElementType(InterfaceEditPart.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	/**
	 * Test to manage component ComponentRealization.
	 */
	@Test
	@GeneratedTest
	public void testLinkComponentRealizationFromPackageToComment() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPart.VISUAL_ID), UMLElementTypes.getElementType(ComponentRealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPart.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return UMLDiagramUpdater.INSTANCE;
	}
}	
