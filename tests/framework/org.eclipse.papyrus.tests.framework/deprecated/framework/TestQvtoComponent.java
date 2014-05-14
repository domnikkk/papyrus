package org.eclipse.papyrus.tests.framework;

import static org.junit.Assert.fail;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.junit.Before;
import org.junit.Test;

public class TestQvtoComponent {

	@Test
	public void test() {
		URI transformationURI = URI.createPlatformResourceURI(
				"qvto/TestQvtoComponent/ChildTransformation.qvto", true);
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		Diagnostic loadTransformationDiagnostic = executor.loadTransformation();
		if (!loadTransformationDiagnostic.equals(Diagnostic.OK)) {
			fail("Error loading the model transformation: "
					+ loadTransformationDiagnostic);
		}
	}

}
