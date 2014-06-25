package com.cea.qompass.architect.optimization.codegen;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Model;
import org.junit.Test;

import com.cea.qompass.architect.optimization.codegen.main.GenerateOptimizationData;

public class GenCodeTest {

	@Test
	public void test() {
		Resource resource = new ResourceSetImpl().getResource(URI.createURI("demo/optimizationIntermediateModel.uml"), false);
		Model im = (Model) resource.getContents().get(0);
		GenerateOptimizationData.generate(im);
	}

}
