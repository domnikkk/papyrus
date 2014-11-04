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
import org.eclipse.papyrus.uml.diagram.tests.createFromPalette.CreateLinkOwnedBySourceFromPaletteTest;
import org.eclipse.papyrus.uml.diagram.usecase.CreateUseCaseDiagramCommand;
import org.eclipse.papyrus.uml.diagram.usecase.custom.edit.parts.CustomUMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.CommentEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ConstraintEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ExtendEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.GeneralizationEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.IncludeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageImportEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.PackageMergeEditPart;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.UseCaseEditPartTN;
import org.eclipse.papyrus.uml.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.usecase.tests.IUseCaseTestsConstants;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestUseCaseLinkOwnedBySourceGen.
 */
public class TestUseCaseLinkOwnedBySourceGen extends CreateLinkOwnedBySourceFromPaletteTest {
	
	
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
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromPackageTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromPackageTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromUseCaseTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromActorTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromPackageTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromPackageTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromUseCaseTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromActorTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromCommentTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromCommentTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromUseCaseTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromCommentTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromActorTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromConstraintTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromUseCaseTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromActorTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromPackageTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromUseCaseTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromActorTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromConstraintTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromPackageTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromActorTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromActorTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromUseCaseTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromCommentTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromCommentTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromConstraintTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromPackageTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromConstraintTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromUseCaseTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromPackageTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromConstraintTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromConstraintTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromPackageTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromUseCaseTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromActorTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromConstraintTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromUseCaseTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromActorTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromPackageTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromConstraintTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromUseCaseTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromCommentTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromConstraintTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromPackageTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromCommentTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromActorTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromActorTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromActorTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromConstraintTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromActorTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromCommentTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromUseCaseTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromUseCaseTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromCommentTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromActorTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromActorTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromActorTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromUseCaseTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromPackageTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromCommentTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromUseCaseTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromUseCaseTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromCommentTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromUseCaseTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromActorTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromConstraintTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromPackageTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromActorTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromPackageTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromActorTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromUseCaseTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromConstraintTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromConstraintTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromCommentTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromUseCaseTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromUseCaseTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromActorTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromActorTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromUseCaseTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromActorTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromCommentTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromConstraintTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromUseCaseTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromUseCaseTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromConstraintTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromUseCaseTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromCommentTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromPackageTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromActorTNToCommentTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromActorTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromUseCaseTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromConstraintTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromCommentTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromCommentTNToConstraintTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Generalization.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceGeneralizationFromActorTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(GeneralizationEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageMerge.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageMergeFromCommentTNToActorTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(CommentEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ActorEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageMergeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromConstraintTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(ConstraintEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Include.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceIncludeFromPackageTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(IncludeEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component Extend.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourceExtendFromUseCaseTNToPackageTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(ExtendEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	/**
	 * Test to manage component PackageImport.
	 */
	@Test
	@GeneratedTest
	public void testLinkOwnedBySourcePackageImportFromPackageTNToUseCaseTN() {
		testCreateLinkFromPalette(UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(UseCaseEditPartTN.VISUAL_ID), UMLElementTypes.getElementType(PackageImportEditPart.VISUAL_ID), UMLElementTypes.getElementType(PackageEditPartTN.VISUAL_ID), true);
	}
	
	@Override
	public DiagramUpdater getDiagramUpdater() {
		return CustomUMLDiagramUpdater.INSTANCE;
	}
}	
