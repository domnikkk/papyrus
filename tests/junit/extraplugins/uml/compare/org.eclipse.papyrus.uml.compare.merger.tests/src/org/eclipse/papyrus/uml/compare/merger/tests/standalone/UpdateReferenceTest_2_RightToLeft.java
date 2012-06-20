package org.eclipse.papyrus.uml.compare.merger.tests.standalone;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.UpdateReference;
import org.eclipse.osgi.util.NLS;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class UpdateReferenceTest_2_RightToLeft extends AbstractStandaloneCompareTest {

	private static final String MODEL_PATH = "updateReference_2/";

	@BeforeClass
	public static void init() throws CoreException, IOException {
		AbstractStandaloneCompareTest.init(MODEL_PATH, false);
	}

	@Override
	@Test
	public void testDifferences() throws InterruptedException {
		super.testDifferences();
	}

	@Override
	public void testLastDiffElements(List<DiffElement> diffElements) {
		Assert.assertTrue(NLS.bind("The number of DiffElement is not correct : we would like {0} DiffElement, and we found {1}", new Object[]{ 1, diffElements.size() }), diffElements.size() == 1);
		final DiffElement diffElement = diffElements.get(0);
		Assert.assertTrue(NLS.bind("The last DiffElement is not a {0}", UpdateReference.class), diffElement instanceof UpdateReference);
	}

	@Test
	@Override
	public void mergeTestAllExecutability() throws InterruptedException {
		super.mergeTestAllExecutability();
	}

	@Override
	@Test
	public void testCommandExecution() throws InterruptedException, IOException {
		super.testCommandExecution();
	}

	@Override
	@Test
	public void testResult() throws InterruptedException {
		super.testResult();
	}

	@Override
	@Test
	public void testXMIID() {
		//nothing to do
	}

	@Override
	@Test
	public void testUndo() throws IOException, InterruptedException {
		super.testUndo();
	}

	@Override
	@Test
	public void testRedo() throws IOException, InterruptedException {
		super.testRedo();
	}

}
