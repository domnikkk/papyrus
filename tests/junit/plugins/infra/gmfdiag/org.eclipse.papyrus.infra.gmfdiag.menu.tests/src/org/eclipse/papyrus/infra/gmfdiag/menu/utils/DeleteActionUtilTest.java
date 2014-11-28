/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.infra.gmfdiag.menu.utils;

import java.util.Arrays;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.papyrus.infra.gmfdiag.menu.utils.DeleteActionUtil;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.PapyrusEditorFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

/**
 * Test of utility class {@link DeleteActionUtil}.
 *
 * @author Gabriel Pascual
 */
@PluginResource("resources/deleteActionUtil/model.di")
public class DeleteActionUtilTest extends AbstractPapyrusTest {

	/** The Constant CONNECTION_ELEMENT_LABEL. */
	private static final String CONNECTION_ELEMENT_LABEL = "Connection";

	/** The Constant SEMANTIC_ELEMENT_NAME. */
	private static final String SEMANTIC_ELEMENT_NAME = "Class1";

	/** The Constant CLASS_DIAGRAM_TITLE. */
	private static final String CLASS_DIAGRAM_TITLE = "NewDiagram";

	/** The Constant NOTE_NOTATION_TYPE. */
	private static final String NOTE_NOTATION_TYPE = "Note";

	/** Papyrus editor fixture. */
	@Rule
	public PapyrusEditorFixture editorFixture = new PapyrusEditorFixture();

	/**
	 * Test of {@link DeleteActionUtil#isSemanticDeletion(IGraphicalEditPart)} with a TextNote element.
	 */
	@Test
	public void testDeleteTextNode() {
		editorFixture.open();
		EditPart noteNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findOrphanEditPart(NOTE_NOTATION_TYPE);
		Assert.assertFalse(DeleteActionUtil.isSemanticDeletion((IGraphicalEditPart) noteNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isSemanticDeletion(IGraphicalEditPart)} with an Orphan element.
	 */
	@Test
	public void testDeleteOrphan() {
		editorFixture.open();
		EditPart orphanNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findOrphanEditPart();

		Assert.assertFalse(DeleteActionUtil.isSemanticDeletion((IGraphicalEditPart) orphanNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isSemanticDeletion(IGraphicalEditPart)} with not orphan element.
	 */
	@Test
	public void testDeleteNotOrphanElement() {
		editorFixture.open();
		EditPart semanticNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findEditPart(SEMANTIC_ELEMENT_NAME, org.eclipse.uml2.uml.Class.class);
		Assert.assertTrue(DeleteActionUtil.isSemanticDeletion((IGraphicalEditPart) semanticNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isCanonical(EditPart)} with a Note.
	 */
	@Test
	public void testIsCanonicalWithNote() {
		editorFixture.open();
		EditPart orphanNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findOrphanEditPart(NOTE_NOTATION_TYPE);
		Assert.assertFalse(DeleteActionUtil.isCanonicalEditPart((IGraphicalEditPart) orphanNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isCanonical(EditPart)} with a connection.
	 */
	@Test
	public void testIsCanonicalWithConnection() {
		editorFixture.open();
		EditPart connectionNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findEditPart(CONNECTION_ELEMENT_LABEL, org.eclipse.uml2.uml.Dependency.class);
		Assert.assertFalse(DeleteActionUtil.isCanonicalEditPart((IGraphicalEditPart) connectionNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isCanonical(EditPart)} with an orphan view.
	 */
	@Test
	public void testIsCanonicalWithOrphan() {
		editorFixture.open();
		EditPart orphanNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findOrphanEditPart();
		Assert.assertFalse(DeleteActionUtil.isCanonicalEditPart((IGraphicalEditPart) orphanNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isCanonical(EditPart)} with a semantic element.
	 */
	@Test
	public void testIsCanonicalWithNotOrphan() {
		editorFixture.open();
		EditPart semanticNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findEditPart(SEMANTIC_ELEMENT_NAME, org.eclipse.uml2.uml.Class.class);
		Assert.assertFalse(DeleteActionUtil.isCanonicalEditPart((IGraphicalEditPart) semanticNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isSupportView(IGraphicalEditPart)} with an orphan view.
	 */
	@Test
	public void testIsSupportViewWithOrphan() {
		editorFixture.open();
		EditPart orphanNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findOrphanEditPart();
		Assert.assertTrue(DeleteActionUtil.isSupportView((IGraphicalEditPart) orphanNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isSupportView(IGraphicalEditPart)} with a semantic element.
	 */
	@Test
	public void testIsSupportViewWithNotOrphan() {
		editorFixture.open();
		EditPart semanticNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findEditPart(SEMANTIC_ELEMENT_NAME, org.eclipse.uml2.uml.Class.class);
		Assert.assertTrue(DeleteActionUtil.isSupportView((IGraphicalEditPart) semanticNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isSupportView(IGraphicalEditPart)} with a Note view.
	 */
	@Test
	public void testIsSupportViewWithNote() {
		editorFixture.open();
		EditPart noteNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findOrphanEditPart(NOTE_NOTATION_TYPE);
		Assert.assertTrue(DeleteActionUtil.isSupportView((IGraphicalEditPart) noteNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isCanonicalView(IGraphicalEditPart)} with orphan.
	 */
	@Test
	public void testIsCanonicalViewWithOrphan() {
		editorFixture.open();
		EditPart orphanNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findOrphanEditPart();
		Assert.assertTrue(DeleteActionUtil.isCanonicalView((IGraphicalEditPart) orphanNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isCanonicalView(IGraphicalEditPart)} with semantic element.
	 */
	@Test
	public void testIsCanonicalViewWithNotOrphan() {
		editorFixture.open();
		EditPart semanticNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findEditPart(SEMANTIC_ELEMENT_NAME, org.eclipse.uml2.uml.Class.class);
		Assert.assertTrue(DeleteActionUtil.isCanonicalView((IGraphicalEditPart) semanticNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isCanonicalView(IGraphicalEditPart)} with Note view.
	 */
	@Test
	public void testIsCanonicalViewWithNote() {
		editorFixture.open();
		EditPart noteNode = editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findOrphanEditPart(NOTE_NOTATION_TYPE);
		Assert.assertTrue(DeleteActionUtil.isCanonicalView((IGraphicalEditPart) noteNode));
	}

	/**
	 * Test of {@link DeleteActionUtil#isSupportView(List)}.
	 */
	@Test
	public void testIsSupportViews() {

		editorFixture.open();
		IGraphicalEditPart semanticNode = (IGraphicalEditPart) editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findEditPart(SEMANTIC_ELEMENT_NAME, org.eclipse.uml2.uml.Class.class);
		IGraphicalEditPart noteNode = (IGraphicalEditPart) editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findOrphanEditPart(NOTE_NOTATION_TYPE);
		IGraphicalEditPart orphanNode = (IGraphicalEditPart) editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findOrphanEditPart();
		List<IGraphicalEditPart> graphicalNodesList = Arrays.asList(new IGraphicalEditPart[] { semanticNode, noteNode, orphanNode });

		Assert.assertTrue(DeleteActionUtil.isSupportView(graphicalNodesList));

	}

	/**
	 * Test of {@link DeleteActionUtil#isCanonical(List)}.
	 */
	@Test
	public void testIsCanonical() {

		editorFixture.open();
		IGraphicalEditPart semanticNode = (IGraphicalEditPart) editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findEditPart(SEMANTIC_ELEMENT_NAME, org.eclipse.uml2.uml.Class.class);
		IGraphicalEditPart noteNode = (IGraphicalEditPart) editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findOrphanEditPart(NOTE_NOTATION_TYPE);
		IGraphicalEditPart orphanNode = (IGraphicalEditPart) editorFixture.activateDiagram(CLASS_DIAGRAM_TITLE).findOrphanEditPart();
		List<IGraphicalEditPart> graphicalNodesList = Arrays.asList(new IGraphicalEditPart[] { semanticNode, noteNode, orphanNode });

		Assert.assertFalse(DeleteActionUtil.isCanonical(graphicalNodesList));

	}

}
