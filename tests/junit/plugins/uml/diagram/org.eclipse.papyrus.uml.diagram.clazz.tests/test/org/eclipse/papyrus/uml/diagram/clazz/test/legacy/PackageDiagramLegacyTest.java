/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.clazz.test.legacy;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.uml.diagram.clazz.UmlClassDiagramForMultiEditor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * Test class for opening Papyrus 0.10.x Package Diagrams in Papyrus >= 1.0.x
 *
 * @author Camille Letavernier
 *
 */
public class PackageDiagramLegacyTest extends AbstractPapyrusTest {

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	protected IMultiDiagramEditor editor;

	protected IPageManager pageManager;

	@Before
	public void initModel() throws Exception {
		IProject project = houseKeeper.createProject("uml2.4diagrams");
		IFile diFile = houseKeeper.createFile(project, "package24.di", "model/legacyPackage/package24.di");
		houseKeeper.createFile(project, "package24.uml", "model/legacyPackage/package24.uml");
		houseKeeper.createFile(project, "package24.notation", "model/legacyPackage/package24.notation");

		editor = houseKeeper.openPapyrusEditor(diFile);
		pageManager = ServiceUtils.getInstance().getIPageManager(editor.getServicesRegistry());
	}

	@Test
	public void testOpening24PackageModel() throws Exception {
		Assert.assertEquals(3, pageManager.allPages().size());

		Diagram diagram1 = getDiagram("Diagram1");
		Assert.assertEquals("PapyrusUMLClassDiagram", diagram1.getType());
		pageManager.selectPage(diagram1);

		IEditorPart diagram1Editor = editor.getActiveEditor();
		Assert.assertTrue(diagram1Editor instanceof UmlClassDiagramForMultiEditor);
	}

	protected Diagram getDiagram(String name) {
		for(Object page : pageManager.allPages()) {
			if(page instanceof Diagram) {
				if(name.equals(((Diagram)page).getName())) {
					return (Diagram)page;
				}
			}
		}
		return null;
	}

	@Test
	public void testOpening24PackageDiagram() throws Exception {
		Assert.assertEquals(3, pageManager.allPages().size());

		Diagram closedDiagram = getDiagram("ClosedDiagram");
		Diagram invalidDiagram = getDiagram("InvalidDiagram");

		pageManager.closePage(invalidDiagram);

		pageManager.openPage(closedDiagram);

		//Assert.assertEquals("PapyrusUMLClassDiagram", closedDiagram.getType());

		pageManager.selectPage(closedDiagram); //Workaround for an unrelated bug: the page is not immediately selected after it has been opened

		IEditorPart closedDiagramEditor = editor.getActiveEditor();

		Assert.assertEquals(closedDiagramEditor.getClass(), UmlClassDiagramForMultiEditor.class);

		IEditorInput input = closedDiagramEditor.getEditorInput();
		Assert.assertTrue(input instanceof URIEditorInput);
		URIEditorInput uriInput = (URIEditorInput)input;

		Assert.assertTrue(uriInput.getURI().equals(EcoreUtil.getURI(closedDiagram)));
	}
}
