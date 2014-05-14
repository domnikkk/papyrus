package org.eclipse.papyrus.uml.diagram.component.test.generation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.tests.framework.m2t.xtend.PapyrusDiagramCanonicalTests;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource.Factory;
import org.junit.Assert;
import org.junit.Test;

public class GenerateCanonicalTests {

	@Test
	public void test() {
		final ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(UMLResource.FILE_EXTENSION, Factory.INSTANCE);
		
		//1. Load UML gmfgen file specific to the diagram type
		String gmfgenPath = "platform:/resource/org.eclipse.papyrus.uml.diagram.component/model/ComponentDiagram.gmfgen.uml";
		Resource gmfgenResource = resourceSet.getResource(URI.createURI(gmfgenPath), false);
		//Assert.assertNotNull(gmfgenResource);
		
		//2. Load the test model
		String pathName = "model/ComponentDiagramTest.uml";
		final Resource testModelResource = resourceSet.getResource(
				URI.createFileURI(pathName), true);
		final Model umlModel = ((Model) testModelResource.getContents().get(0));
		PapyrusDiagramCanonicalTests.generate(umlModel, "src-gen/");

	}

}
