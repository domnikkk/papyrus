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
package org.eclipse.papyrus.uml.diagram.usecase.test.createFromPalette;

import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.junit.framework.classification.GeneratedTest;
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkFromPaletteTest;
import org.eclipse.papyrus.uml.diagram.usecase.CreateUseCaseDiagramCommand;
import org.eclipse.papyrus.uml.diagram.usecase.custom.edit.parts.CustomUMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AbstractionEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.AssociationEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.CommentEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.DependencyEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.RealizationEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UsageEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.usecase.tests.IUseCaseTestsConstants;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestUseCaseLinkGen.
 */
public class TestUseCaseLinkGen extends CreateLinkFromPaletteTest {
	
	
	@Override
	protected ICreationCommand getDiagramCommandCreation() {
		return new CreateUseCaseDiagramCommand();
	}
	 
	@Override
	protected String getProjectName() {
		return IUseCaseTestsConstants.PROJECT_NAME;
	}

	@Override
	protected String getFileName() {
		return IUseCaseTestsConstants.FILE_NAME;
	}

	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromActorTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromUseCaseTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromActorTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromActorTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromUseCaseTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromUseCaseTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromActorTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromActorTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromActorTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromUseCaseTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromUseCaseTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromUseCaseTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromActorTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromUseCaseTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromActorTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromUseCaseTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromActorTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromActorTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromUseCaseTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromUseCaseTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromActorTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromUseCaseTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromActorTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromActorTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromUseCaseTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromUseCaseTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromActorTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromUseCaseTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromActorTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromActorTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromActorTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromActorTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromActorTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromConstraintTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromUseCaseTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromUseCaseTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromUseCaseTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromCommentTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromCommentTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromActorTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromUseCaseTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromUseCaseTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromConstraintTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromActorTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromPackageTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromActorTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromUseCaseTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromConstraintTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromUseCaseTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromPackageTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromCommentTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Association.
	 */
	@Test
	@GeneratedTest
	public void testLinkAssociationFromUseCaseTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AssociationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromActorTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromPackageTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromActorTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromUseCaseTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromPackageTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromUseCaseTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromCommentTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromPackageTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Abstraction.
	 */
	@Test
	@GeneratedTest
	public void testLinkAbstractionFromActorTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(AbstractionEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Usage.
	 */
	@Test
	@GeneratedTest
	public void testLinkUsageFromConstraintTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UsageEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Realization.
	 */
	@Test
	@GeneratedTest
	public void testLinkRealizationFromConstraintTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(RealizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromCommentTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Dependency.
	 */
	@Test
	@GeneratedTest
	public void testLinkDependencyFromUseCaseTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(DependencyEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}
}	
