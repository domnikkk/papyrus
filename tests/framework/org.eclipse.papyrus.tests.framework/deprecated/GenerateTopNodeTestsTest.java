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
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class GenerateTopNodeTestsTest {

	private static GenerateTopNodeTestCode m2t;
	private static String testingEcorePath = "/org.eclipse.papyrus.tests.framework/model/papyrusTesting.ecore";
	
	@BeforeClass
	public static void setUp() {
		String[] templateNames = { "generateTopNodeTestsFromUMLPapyrusTesting" };
		String moduleName = "generateTopNodeTestsFromUMLPapyrusTesting";
		m2t = new GenerateTopNodeTestCode();
		m2t.setTestingEcorePath(testingEcorePath);
		m2t.setTemplateNames(templateNames);
		m2t.setModuleFileName(moduleName);
	}
	
	@Test
	public void testGenerateClassDiagramTopNodeTests() throws IOException {
		URI inURI = URI.createURI("platform:/resource/org.eclipse.papyrus.diagram.clazz/model/classdiagram.gmfgen");
		URI papyrusTestingModelURI = URI.createURI("platform:/resource/org.eclipse.papyrus.tests.framework/model/tests/TopNodeClassDiagramTestSuite.papyrustesting");
		String srcGenOutputPath = "src-gen/org/eclipse/papyrus/uml/diagram/clazz/test/canonical";
		doGenerate(inURI, srcGenOutputPath, papyrusTestingModelURI);
	}
	
	@Test
	public void testGenerateComponentDiagramTopNodeTests() throws IOException {
		URI inURI = URI.createURI("platform:/resource/org.eclipse.papyrus.diagram.component/model/ComponentDiagram.gmfgen");
		URI papyrusTestingModelURI = URI.createURI("platform:/resource/org.eclipse.papyrus.tests.framework/model/tests/TopNodeComponentDiagramTestSuite.papyrustesting");
		String srcGenOutputPath = "src-gen/org/eclipse/papyrus/uml/diagram/component/test/canonical";
		doGenerate(inURI, srcGenOutputPath, papyrusTestingModelURI);
	}
	
	@Test
	public void testGenerateDeploymentDiagramTopNodeTests() throws IOException {
		URI inURI = URI.createURI("platform:/resource/org.eclipse.papyrus.diagram.deployment/model/DeploymentDiagram.gmfgen");
		URI papyrusTestingModelURI = URI.createURI("platform:/resource/org.eclipse.papyrus.tests.framework/model/tests/TopNodeDeploymentDiagramTestSuite.papyrustesting");
		String srcGenOutputPath = "src-gen/org/eclipse/papyrus/uml/diagram/deployment/test/canonical";
		doGenerate(inURI, srcGenOutputPath, papyrusTestingModelURI);
	}
		
	private void doGenerate(URI inURI, String srcGenOutputPath, URI papyrusTestingModelURI)
			throws IOException {
		registerEcore(testingEcorePath);
		
		URI transformationURI = URI.createURI("platform:/resource/org.eclipse.papyrus.tests.framework/qvto/PapyrusGmfGenTesting.qvto");
		final GeneratePapyrusTestingModel generatePapyrusTestingModel = new GeneratePapyrusTestingModel();
		ExecutionDiagnostic result = generatePapyrusTestingModel.generate(inURI, transformationURI, papyrusTestingModelURI);

		//		Assert.assertNotNull(new File("qvto/PapyrusGmfGenTesting.qvto"));
		//Assert that the transformation was executed succesfully
		Assert.assertEquals(result.getMessage() + result.getSource() + result.getChildren().toString(), Diagnostic.OK, result.getSeverity());
		
		//2. M2T transformation
		m2t.generate(new File(srcGenOutputPath), papyrusTestingModelURI);
	}



	private void registerEcore(String testingEcorePath) {
		// register globally the Ecore Resource Factory to the ".ecore" extension
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
		    "ecore", new EcoreResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		// enable extended metadata
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(rs.getPackageRegistry());
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
		    extendedMetaData);

		Resource r = rs.getResource(URI.createPlatformPluginURI(testingEcorePath, true), true);
		EObject eObject = r.getContents().get(0);
		if (eObject instanceof EPackage) {
		    EPackage p = (EPackage)eObject;
		    rs.getPackageRegistry().put(p.getNsURI(), p);
		}
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
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class GenerateTopNodeTestsTest {

	private static GenerateTopNodeTestCode m2t;
	private static String testingEcorePath = "/org.eclipse.papyrus.tests.framework/model/papyrusTesting.ecore";
	
	@BeforeClass
	public static void setUp() {
		String[] templateNames = { "generateTopNodeTestsFromUMLPapyrusTesting" };
		String moduleName = "generateTopNodeTestsFromUMLPapyrusTesting";
		m2t = new GenerateTopNodeTestCode();
		m2t.setTestingEcorePath(testingEcorePath);
		m2t.setTemplateNames(templateNames);
		m2t.setModuleFileName(moduleName);
	}
	
	@Test
	public void testGenerateClassDiagramTopNodeTests() throws IOException {
		URI inURI = URI.createURI("platform:/resource/org.eclipse.papyrus.diagram.clazz/model/classdiagram.gmfgen");
		URI papyrusTestingModelURI = URI.createURI("platform:/resource/org.eclipse.papyrus.tests.framework/model/tests/TopNodeClassDiagramTestSuite.papyrustesting");
		String srcGenOutputPath = "src-gen/org/eclipse/papyrus/uml/diagram/clazz/test/canonical";
		doGenerate(inURI, srcGenOutputPath, papyrusTestingModelURI);
	}
	
	@Test
	public void testGenerateComponentDiagramTopNodeTests() throws IOException {
		URI inURI = URI.createURI("platform:/resource/org.eclipse.papyrus.diagram.component/model/ComponentDiagram.gmfgen");
		URI papyrusTestingModelURI = URI.createURI("platform:/resource/org.eclipse.papyrus.tests.framework/model/tests/TopNodeComponentDiagramTestSuite.papyrustesting");
		String srcGenOutputPath = "src-gen/org/eclipse/papyrus/uml/diagram/component/test/canonical";
		doGenerate(inURI, srcGenOutputPath, papyrusTestingModelURI);
	}
	
	@Test
	public void testGenerateDeploymentDiagramTopNodeTests() throws IOException {
		URI inURI = URI.createURI("platform:/resource/org.eclipse.papyrus.diagram.deployment/model/DeploymentDiagram.gmfgen");
		URI papyrusTestingModelURI = URI.createURI("platform:/resource/org.eclipse.papyrus.tests.framework/model/tests/TopNodeDeploymentDiagramTestSuite.papyrustesting");
		String srcGenOutputPath = "src-gen/org/eclipse/papyrus/uml/diagram/deployment/test/canonical";
		doGenerate(inURI, srcGenOutputPath, papyrusTestingModelURI);
	}
		
	private void doGenerate(URI inURI, String srcGenOutputPath, URI papyrusTestingModelURI)
			throws IOException {
		registerEcore(testingEcorePath);
		
		URI transformationURI = URI.createURI("platform:/resource/org.eclipse.papyrus.tests.framework/qvto/PapyrusGmfGenTesting.qvto");
		final GeneratePapyrusTestingModel generatePapyrusTestingModel = new GeneratePapyrusTestingModel();
		ExecutionDiagnostic result = generatePapyrusTestingModel.generate(inURI, transformationURI, papyrusTestingModelURI);

		//		Assert.assertNotNull(new File("qvto/PapyrusGmfGenTesting.qvto"));
		//Assert that the transformation was executed succesfully
		Assert.assertEquals(result.getMessage() + result.getSource() + result.getChildren().toString(), Diagnostic.OK, result.getSeverity());
		
		//2. M2T transformation
		m2t.generate(new File(srcGenOutputPath), papyrusTestingModelURI);
	}



	private void registerEcore(String testingEcorePath) {
		// register globally the Ecore Resource Factory to the ".ecore" extension
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
		    "ecore", new EcoreResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		// enable extended metadata
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(rs.getPackageRegistry());
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
		    extendedMetaData);

		Resource r = rs.getResource(URI.createPlatformPluginURI(testingEcorePath, true), true);
		EObject eObject = r.getContents().get(0);
		if (eObject instanceof EPackage) {
		    EPackage p = (EPackage)eObject;
		    rs.getPackageRegistry().put(p.getNsURI(), p);
		}
	}

}
>>>>>>> refs/remotes/origin/master
