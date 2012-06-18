package org.eclipse.papyrus.uml.compare.merger.tests.standalone;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.ReferenceOrderChange;
import org.eclipse.emf.compare.diff.metamodel.UpdateReference;
import org.eclipse.osgi.util.NLS;
import org.junit.Assert;
import org.junit.Test;


public class ReferenceOrderChangeTest_1 extends AbstractStandaloneCompareTest {

	private static final String MODEL_PATH = "referenceOrderChange_1/";

	public ReferenceOrderChangeTest_1() {
		super(MODEL_PATH);
	}
	
	@Test
	@Override
	public void leftToRightMergeCommand() throws InterruptedException {
		super.leftToRightMergeCommand();
	}

	@Test
	@Override
	public void rightToLeftMergeCommand() throws InterruptedException {
		super.rightToLeftMergeCommand();
	}

	@Test
	public void testDifferences() throws InterruptedException {
		super.testDifferences();
	}
	
	@Override
	public void testLastDiffElement(DiffElement diffElement) {
		if(diffElement instanceof DiffGroup){
			EList<DiffElement> subDiff = diffElement.getSubDiffElements();
			Assert.assertTrue("I don't found only 1 difference,differences.", subDiff.size() == 1);
			diffElement = diffElement.getSubDiffElements().get(0);
		}
		Assert.assertTrue(NLS.bind("The last DiffElement is not a {0}", ReferenceOrderChange.class), diffElement instanceof ReferenceOrderChange);
	}

}
