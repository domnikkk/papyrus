<<<<<<< HEAD
package org.eclipse.papyrus.tests.framework;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.papyrus.tests.framework.m2m.GeneratePapyrusTestingModel;
import org.eclipse.papyrus.tests.framework.m2t.GenerateTopNodeTestCode;
import org.eclipse.papyrus.tests.framework.m2t.GenerateTopNodeTestsFromUMLPapyrusTesting;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class GenerateTopNodeTestsFromUMLTest {

	private static GenerateTopNodeTestsFromUMLPapyrusTesting m2t;
	
	@BeforeClass
	public static void setUp() {
		String[] templateNames = { "generateTopNodeTestsFromUMLPapyrusTesting" };
		String moduleName = "generateTopNodeTestsFromUMLPapyrusTesting";
		m2t = new GenerateTopNodeTestsFromUMLPapyrusTesting();
//		m2t.setTemplateNames(templateNames);
//		m2t.setModuleFileName(moduleName);
	}
	
	@Test
	public void testGenerateClassDiagramTopNodeTests() throws IOException {
		URI inURI = URI.createURI("platform:/resource/org.eclipse.papyrus.tests.framework/model/classdiagramtest.uml");
		String srcGenOutputPath = "src-gen/org/eclipse/papyrus/uml/diagram/clazz/test/canonical";
		doGenerate(inURI, srcGenOutputPath, inURI);
	}
	
	private void doGenerate(URI inURI, String srcGenOutputPath, URI papyrusTestingModelURI)
			throws IOException {
		
		m2t.generate(new File(srcGenOutputPath), papyrusTestingModelURI);
	}

}
=======
package org.eclipse.papyrus.tests.framework;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.papyrus.tests.framework.m2m.GeneratePapyrusTestingModel;
import org.eclipse.papyrus.tests.framework.m2t.GenerateTopNodeTestCode;
import org.eclipse.papyrus.tests.framework.m2t.GenerateTopNodeTestsFromUMLPapyrusTesting;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class GenerateTopNodeTestsFromUMLTest {

	private static GenerateTopNodeTestsFromUMLPapyrusTesting m2t;
	
	@BeforeClass
	public static void setUp() {
		String[] templateNames = { "generateTopNodeTestsFromUMLPapyrusTesting" };
		String moduleName = "generateTopNodeTestsFromUMLPapyrusTesting";
		m2t = new GenerateTopNodeTestsFromUMLPapyrusTesting();
//		m2t.setTemplateNames(templateNames);
//		m2t.setModuleFileName(moduleName);
	}
	
	@Test
	public void testGenerateClassDiagramTopNodeTests() throws IOException {
		URI inURI = URI.createURI("platform:/resource/org.eclipse.papyrus.tests.framework/model/classdiagramtest.uml");
		String srcGenOutputPath = "src-gen/org/eclipse/papyrus/uml/diagram/clazz/test/canonical";
		doGenerate(inURI, srcGenOutputPath, inURI);
	}
	
	private void doGenerate(URI inURI, String srcGenOutputPath, URI papyrusTestingModelURI)
			throws IOException {
		
		m2t.generate(new File(srcGenOutputPath), papyrusTestingModelURI);
	}

}
>>>>>>> refs/remotes/origin/master
