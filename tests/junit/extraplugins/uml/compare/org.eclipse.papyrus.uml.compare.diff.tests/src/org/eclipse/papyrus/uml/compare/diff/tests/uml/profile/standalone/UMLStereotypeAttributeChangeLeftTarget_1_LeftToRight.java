/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) Vincent.Lorenzo@cea.fr - Initial API and implementation
 *  Adapted code from EMF-Compare
 *****************************************************************************/
package org.eclipse.papyrus.uml.compare.diff.tests.uml.profile.standalone;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.papyrus.infra.core.resource.ModelMultiException;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class UMLStereotypeAttributeChangeLeftTarget_1_LeftToRight extends AbstractUMLStandaloneCompareTest {

	private static final String MODEL_PATH = "stereotypeAttributeChangeLeftTarget_1/";

	private static final String FOLDER_PATH = "/resources/uml_standalone/";

	@BeforeClass
	public static void init() throws CoreException, IOException, ModelMultiException, ServiceException {
		AbstractUMLStandaloneCompareTest.init(FOLDER_PATH, null, true);
	}


	@Ignore("not yet implemented")
	@Test
	public void testDifferences() throws InterruptedException {
		super.testDifferences();
	}

	public void testLastDiffElements(List<DiffElement> diffElements) {
		Assert.fail();
	}

	@Ignore("not yet implemented")
	@Test
	public void mergeTestAllExecutability() throws InterruptedException {
		super.mergeTestAllExecutability();
	}

	@Override
	@Ignore("not yet implemented")
	@Test
	public void testCommandExecution() throws InterruptedException, IOException {
		super.testCommandExecution();
	}

	@Ignore("not yet implemented")
	@Test
	public void testModificationOnDiFile() {
		super.testModificationOnDiFile(false);
	}


	@Ignore("not yet implemented")
	@Test
	public void testModificationOnNotationFile() {
		Assert.fail();
	}


	@Ignore("not yet implemented")
	@Test
	public void testModificationOnUMLFile() {
		Assert.fail();
	}


	@Override
	@Ignore("not yet implemented")
	@Test
	public void saveTest() throws IOException {
		super.saveTest();
	}

	@Override
	@Ignore("not yet implemented")
	@Test
	public void testResult() throws InterruptedException {
		super.testResult();
	}


	@Override
	@Ignore("not yet implemented")
	@Test
	public void testXMIID() {
		//nothing to do
	}

	@Override
	@Ignore("not yet implemented")
	@Test
	public void testUndo() throws IOException, InterruptedException {
		super.testUndo();
	}

	@Override
	@Ignore("not yet implemented")
	@Test
	public void testRedo() throws IOException, InterruptedException {
		super.testRedo();
	}

	//TODO this override method should be deleted when this test will be implemented 
	@Ignore("not yet implemented")
	@Override
	@Test
	public void testTestConformance() {
		super.testTestConformance();
	}

	@Ignore("not yet implemented")
	@Override
	@Test
	public void testOneDiffCommandExecution() throws IOException, InterruptedException {
		super.testOneDiffCommandExecution();
	}
}
