/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.nattable.clazz.config.tests.tests;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.junit.utils.GenericUtils;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.Activator;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;

import ca.odell.glazedlists.TreeList;

/**
 * @author VL222926
 *
 */
public class TableFillingAndExpandTest extends AbstractEditorTest {
	protected Resource di;

	protected Resource notation;

	protected Resource uml;

	protected Model rootModel;

	protected Class classTest;

	protected List<?> elementListTest;

	protected Package packageTest;

	private List<?> root;

	private Object diagramTest;

	private final String modelName = "tableFillingAndTableExpandTest"; //$NON-NLS-1$

	private final String uml_EXT = "uml"; //$NON-NLS-1$
	private final String notation_EXT = "notation"; //$NON-NLS-1$
	private final String di_EXT = "di"; //$NON-NLS-1$
	private final String DOT = "."; //$NON-NLS-1$
	private final StringBuilder umlBuiler = new StringBuilder(modelName).append(DOT).append(uml_EXT);
	private final StringBuilder notationBuiler = new StringBuilder(modelName).append(DOT).append(notation_EXT);
	private final StringBuilder diBuilder = new StringBuilder(modelName).append(DOT).append(di_EXT);

	@Before
	public void initTests() throws CoreException, IOException {
		try {
			initModel(modelName, modelName, getBundle());
		} catch (Exception e) {
			Activator.log.error(e);
		}

		ResourceSet set = null;
		try {
			set = getModelSet();
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		List<Resource> resources = set.getResources();

		for (Resource current : resources) {
			if (current.getURI().lastSegment().equals(umlBuiler.toString())) {
				uml = current;
			} else if (current.getURI().lastSegment().equals(notationBuiler.toString())) {
				notation = current;
			} else if (current.getURI().lastSegment().equals(diBuilder.toString())) {
				di = current;
			}
		}

		rootModel = (Model) uml.getContents().get(0);
		root = notation.getContents();
		// TODO on luna : open diagram
	}

	@Override
	protected String getSourcePath() {
		return "/resources/"; //$NON-NLS-1$
	}

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@AfterClass
	public static void endOfTest() {
		GenericUtils.closeAllEditors();
	}

	@Test
	public void fullTest() {
		selectTablePage(0);
		INattableModelManager manager = (INattableModelManager) this.editor.getAdapter(INattableModelManager.class);
		List<?> elements = manager.getRowElementsList();
		Assert.isTrue(elements instanceof TreeList<?>, " the list managing the rows in not a TreeList"); //$NON-NLS-1$
		int size = elements.size();
		int i = 0;
		i++;
	}

	protected void selectTablePage(int index) {
		try {
			Object tablePage = getPageManager().allPages().get(index);
			// getPageManager().closeAllOpenedPages();
			// getPageManager().openPage(tablePage);
			getPageManager().selectPage(tablePage);
		} catch (ServiceException e) {
			Activator.log.error(e);
		}
	}

}
