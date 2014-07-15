package org.eclipse.papyrus.tests.framework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.gmf.internal.codegen.util.GMFGenResource;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.papyrus.papyrusgmfgenextension.PapyrusgmfgenextensionFactory;
import org.eclipse.papyrus.tests.framework.m2m.QvtoTransformation;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
//import org.eclipse.papyrus.tests.framework.m2t.GenerateTopNodeTestCode;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTransformGmfgen2Uml {

	private static ResourceSet rs = new ResourceSetImpl();
	private static EObject gmfgenMm;

	@BeforeClass
	public static void setUp() {
		registerFactory();
		URI gmfgenMmURI = URI
				.createURI("platform:/plugin/org.eclipse.gmf.codegen/models/gmfgen.uml");
		Resource resource = rs.getResource(gmfgenMmURI, true);
		gmfgenMm = resource.getContents().get(0);
	}

	@Test
	public void testGenerateClassDiagramTopNodeTests() throws IOException {
		URI gmfgenInURI = URI
				.createURI("platform:/plugin/org.eclipse.papyrus.uml.diagram.clazz/model/classdiagram.gmfgen");
		URI outUmlModelURI = URI
				.createURI("platform:/plugin/org.eclipse.papyrus.uml.diagram.clazz/model/classdiagram.gmfgen.uml");
		EObject gmfgenIn = rs.getResource(gmfgenInURI, true).getContents().get(0);
		List<EObject> inObjects = new ArrayList<EObject>();
		inObjects.add(gmfgenIn);
		inObjects.add(gmfgenMm);
		doGenerate(inObjects, outUmlModelURI);
	}

	@Test
	public void testGenerateComponentDiagramTopNodeTests() throws IOException {
		URI gmfgenInURI = URI
				.createURI("platform:/plugin/org.eclipse.papyrus.uml.diagram.component/model/ComponentDiagram.gmfgen");
		URI outUmlModelURI = URI
				.createURI("platform:/plugin/org.eclipse.papyrus.uml.diagram.component/model/ComponentDiagram.gmfgen.uml");
		EObject gmfgenIn = rs.getResource(gmfgenInURI, true).getContents().get(0);
		List<EObject> inObjects = new ArrayList<EObject>();
		inObjects.add(gmfgenIn);
		inObjects.add(gmfgenMm);
		doGenerate(inObjects, outUmlModelURI);
	}

	@Test
	public void testGenerateDeploymentDiagramTopNodeTests() throws IOException {
		URI gmfgenInURI = URI
				.createURI("platform:/plugin/org.eclipse.papyrus.uml.diagram.deployment/model/DeploymentDiagram.gmfgen");
		URI outUmlModelURI = URI
				.createURI("platform:/plugin/org.eclipse.papyrus.uml.diagram.deployment/model/DeploymentDiagram.gmfgen.uml");
		EObject gmfgenIn = rs.getResource(gmfgenInURI, true).getContents().get(0);
		EObject outUmlModel = UMLFactory.eINSTANCE.createModel();
		
		
		List<EObject> inObjects = new ArrayList<EObject>();
		inObjects.add(gmfgenIn);
		inObjects.add(gmfgenMm);
		inObjects.add(outUmlModel);
		doGenerate(inObjects, outUmlModelURI);
	}

	private void doGenerate(List<? extends EObject> inObjects,
			URI outUmlModelURI) throws IOException {

		URI transformationURI = URI
				.createURI("platform:/plugin/org.eclipse.papyrus.tests.framework/qvto/gmfgen2uml-instances.qvto");
		final QvtoTransformation qvtoTransformation = new QvtoTransformation();

		
		TransformationExecutor executor = new TransformationExecutor(transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();

		ArrayList<ModelExtent> modelExtents = new ArrayList<ModelExtent>();
		for(EObject eObject : inObjects){
			BasicModelExtent basicModelExtent = new BasicModelExtent();
			basicModelExtent.add(eObject);
			modelExtents.add(basicModelExtent);
		}

		context = new ExecutionContextImpl();
		context.setConfigProperty("keepModeling", true);

		ExecutionDiagnostic result = executor.execute(context, ((ModelExtent[]) modelExtents.toArray(new ModelExtent[]{})));

		// check the result for success
		if(result.getSeverity() == Diagnostic.OK) {
			// the output objects got captured in the output extent
			ModelExtent output = modelExtents.get(modelExtents.size()-1);
			List<EObject> outObjects = output.getContents();
			// let's persist them using a resource 
			ResourceSet resourceSet2 = new ResourceSetImpl();
			Resource outResource = resourceSet2.createResource(outUmlModelURI);
			outResource.getContents().addAll(outObjects);
			outResource.save(Collections.emptyMap());
		} else {
			// turn the result diagnostic into status and send it to error log			
			IStatus status = BasicDiagnostic.toIStatus(result);
			Activator.getDefault().getLog().log(status);
		}

		// Assert that the transformation was executed succesfully
		Assert.assertEquals(result.getMessage() + result.getSource()
				+ result.getChildren().toString(), Diagnostic.OK,
				result.getSeverity());

	}

	private static void registerFactory() {
		// register globally the Ecore Resource Factory to the ".ecore"
		// extension
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"gmfgen", new GMFGenResource.Factory2());
		PapyrusgmfgenextensionFactory papyrusgmfgenextensionFactory = PapyrusgmfgenextensionFactory.eINSTANCE;
		// enable extended metadata
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(
				rs.getPackageRegistry());
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
				extendedMetaData);

	}

}
