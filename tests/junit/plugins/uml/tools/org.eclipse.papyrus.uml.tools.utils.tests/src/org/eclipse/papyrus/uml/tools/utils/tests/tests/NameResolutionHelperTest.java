/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi  benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.tools.utils.tests.tests;

import java.util.List;

import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
import org.eclipse.papyrus.uml.tools.utils.NameResolutionHelper;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.papyrus.uml.tools.utils.tests.Activator;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NameResolutionHelperTest extends AbstractEditorTest {

	public static final String RESOURCES_PATH = "resources/"; //$NON-NLS-1$

	public static final String MODEL_NAME = "recursiveModelImport"; //$NON-NLS-1$

	public final static String PACKAGE1_NAME = "Package1"; //$NON-NLS-1$

	public final static String PACKAGE2_NAME = "Package2"; //$NON-NLS-1$

	public final static String CLASS1_NAME = "Class1"; //$NON-NLS-1$

	public static final String PROJECT_NAME = "NameResolutionHelperTest"; //$NON-NLS-1$

	@Before
	public void initModelForCutTest() {
		try {
			initModel(PROJECT_NAME, MODEL_NAME, Activator.getDefault().getBundle());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected String getSourcePath() {
		return RESOURCES_PATH;
	}

	/**
	 * Check NameResolution on a recursive model
	 */
	@Test
	public void recursiveImportPackage() {
		Package rootUMLModel = getRootUMLModel();
		Assert.assertNotNull("RootModel is null", rootUMLModel); //$NON-NLS-1$
		org.eclipse.uml2.uml.Package package1 = (org.eclipse.uml2.uml.Package)rootUMLModel.getPackagedElement(PACKAGE1_NAME);
		Assert.assertNotNull("The package 1 is not present", package1); //$NON-NLS-1$				
		NameResolutionHelper nameResolutionHelper = new NameResolutionHelper(package1, null);
		List<NamedElement> namedElements = nameResolutionHelper.getNamedElements(PACKAGE1_NAME + NamedElementUtil.QUALIFIED_NAME_SEPARATOR + PACKAGE2_NAME + NamedElementUtil.QUALIFIED_NAME_SEPARATOR + CLASS1_NAME);
		Assert.assertNotNull("NamedElements is  null", namedElements); //$NON-NLS-1$	
		Assert.assertFalse("NamedElements is empty", namedElements.isEmpty()); //$NON-NLS-1$	
	}

}
