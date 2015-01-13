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

import java.util.Collections;
import java.util.List;

import org.eclipse.papyrus.infra.nattable.common.editor.NatTableEditor;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.manager.table.ITreeNattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.tree.CollapseAndExpandActionsEnum;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.junit.utils.GenericUtils;
import org.eclipse.papyrus.uml.nattable.clazz.config.tests.Activator;
import org.eclipse.ui.IEditorPart;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * @author VL222926
 *
 */
public class ContentsAndExpandWithCategories_0_1_2_Tests extends AbstractOpenTableTest {

	public static String fileName = "contents_with_categories_0_1_2"; //$NON-NLS-1$

	private static final String CLASS1_NAME = "Class1"; //$NON-NLS-1$

	private static final String OPERATION1_NAME = "Operation1"; //$NON-NLS-1$

	@Before
	public void initModel() throws Exception {
		initModel("classTreeTable", fileName, getBundle()); //$NON-NLS-1$
	};


	/**
	 * This method tests the contents of the tree table and its filling expanding level one by one
	 *
	 * @throws Exception
	 */
	@Test
	public void testExpand_1_by_1() throws Exception {
		testOpenExistingTable("classTreeTable", "openTest"); //$NON-NLS-1$ //$NON-NLS-2$
		IEditorPart tableEditor = editor.getActiveEditor();
		Assert.assertTrue(tableEditor instanceof NatTableEditor);
		INattableModelManager manager = (INattableModelManager) tableEditor.getAdapter(INattableModelManager.class);
		Assert.assertTrue(manager instanceof ITreeNattableModelManager);
		ITreeNattableModelManager treeTableManager = (ITreeNattableModelManager) manager;
		List<?> rowElements = manager.getRowElementsList();
		int size = rowElements.size();

		// nothing is expanded into the table,
		Assert.assertEquals(1, size);
		ITreeItemAxis axis = (ITreeItemAxis) rowElements.get(0);
		Object representedElement = AxisUtils.getRepresentedElement(axis);
		Assert.assertTrue(representedElement instanceof TreeFillingConfiguration);
		Assert.assertEquals(UMLPackage.eINSTANCE.getPackage_PackagedElement(), ((TreeFillingConfiguration) representedElement).getAxisUsedAsAxisProvider().getElement());
		Assert.assertEquals(6, axis.getChildren().size());

		// the elements have no children because nothing has been expanded
		for (ITreeItemAxis child : axis.getChildren()) {
			Assert.assertEquals(0, child.getChildren().size());
		}

		// we expand the first class owned by the root package
		treeTableManager.doCollapseExpandAction(CollapseAndExpandActionsEnum.EXPAND_ONE_LEVEL, Collections.singletonList(axis));

		Class class1 = null;
		ITreeItemAxis class1Representation = null;
		// now the children must have elements
		for (ITreeItemAxis child : axis.getChildren()) {
			Object tmp = AxisUtils.getRepresentedElement(child);
			Assert.assertTrue(tmp instanceof Class);
			class1 = (Class) tmp;
			if (CLASS1_NAME.equals(class1.getName())) {
				class1Representation = child;
				Assert.assertEquals(3, child.getChildren().size());
			} else {
				Assert.assertEquals(0, child.getChildren().size());
			}
		}
		Assert.assertNotNull(class1);





		for (ITreeItemAxis child : class1Representation.getChildren()) {
			Assert.assertEquals(0, child.getChildren().size());
		}
		// we expand class1 in order to fill its children
		treeTableManager.doCollapseExpandAction(CollapseAndExpandActionsEnum.EXPAND_ONE_LEVEL, Collections.singletonList(class1Representation));

		// the children of class1 must have children now
		ITreeItemAxis ownedOperationAxis = null;
		for (ITreeItemAxis child : class1Representation.getChildren()) {
			Assert.assertEquals(3, child.getChildren().size());

			TreeFillingConfiguration conf = (TreeFillingConfiguration) child.getElement();
			if (conf.getAxisUsedAsAxisProvider().getElement() == UMLPackage.eINSTANCE.getClass_OwnedOperation()) {
				ownedOperationAxis = child;
			}
			// we expand each filling configuration to fill children
			treeTableManager.doCollapseExpandAction(CollapseAndExpandActionsEnum.EXPAND_ONE_LEVEL, Collections.singletonList(child));
		}

		Assert.assertNotNull(ownedOperationAxis);
		// we expand the ownedOperation axis
		treeTableManager.doCollapseExpandAction(CollapseAndExpandActionsEnum.EXPAND_ONE_LEVEL, Collections.singletonList(ownedOperationAxis));

		ITreeItemAxis operation1Representation = null;

		for (ITreeItemAxis child : ownedOperationAxis.getChildren()) {
			Assert.assertTrue(child.getElement() instanceof Operation);
			Operation op = (Operation) child.getElement();
			if (OPERATION1_NAME.equals(op.getName())) {
				operation1Representation = child;
				Assert.assertEquals(1, child.getChildren().size());
			} else {
				Assert.assertEquals(0, child.getChildren().size());
			}
		}

		Assert.assertNotNull(operation1Representation);
		// we expand operation1
		treeTableManager.doCollapseExpandAction(CollapseAndExpandActionsEnum.EXPAND_ONE_LEVEL, Collections.singletonList(operation1Representation));

		ITreeItemAxis parametersFeatureAxis = operation1Representation.getChildren().get(0);
		Assert.assertEquals(parametersFeatureAxis.getChildren().size(), 3);
	}

	@Test
	public void testExpandAll() throws Exception {
		testOpenExistingTable("classTreeTable", "openTest"); //$NON-NLS-1$ //$NON-NLS-2$
		IEditorPart tableEditor = editor.getActiveEditor();
		Assert.assertTrue(tableEditor instanceof NatTableEditor);
		INattableModelManager manager = (INattableModelManager) tableEditor.getAdapter(INattableModelManager.class);
		Assert.assertTrue(manager instanceof ITreeNattableModelManager);
		ITreeNattableModelManager treeTableManager = (ITreeNattableModelManager) manager;
		List<?> rowElements = manager.getRowElementsList();
		int size = rowElements.size();

		// nothing is expanded into the table,
		Assert.assertEquals(1, size);
		treeTableManager.doCollapseExpandAction(CollapseAndExpandActionsEnum.EXPAND_ALL, null);

		size = rowElements.size();
		Assert.assertEquals(23, size);
	}

	@Override
	protected String getSourcePath() {
		return "/resources/contents_and_expand_tests_resources/"; //$NON-NLS-1$
	}

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@AfterClass
	public static void endOfTest() {
		GenericUtils.closeAllEditors();
	}
}
