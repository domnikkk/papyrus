package org.eclipse.papyrus.uml.diagram.component.test.generation;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl;
import org.eclipse.papyrus.tests.framework.m2m.QvtoTransformationWorkflowComponent;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.Test;

import com.google.inject.Injector;

public class GeneratePapyrusTestsWorkflow {

	@Test
	public void javaRun() {
		IWorkflowContext ctx = new WorkflowContextImpl();
		Reader reader = new Reader();

		//1. Transform GMFGen file to UML
		reader.setModelSlot("inputGmfgen");
		reader.setUri("platform:/resource/org.eclipse.papyrus.uml.diagram.component/model/ComponentDiagram.gmfgen");
		reader.invoke(ctx);
		
		reader.setModelSlot("gmfgenUmlMetamodel");
		reader.setUri("platform:/plugin/org.eclipse.papyrus.tests.framework/model/gmfgen.uml");
		reader.invoke(ctx);
		
		QvtoTransformationWorkflowComponent qvtoComponent = new QvtoTransformationWorkflowComponent();
		qvtoComponent.addInputSlots("inputGmfgen");
		qvtoComponent.addInputSlots("gmfgenUmlMetamodel");
		qvtoComponent.setTransformationURI("platform:/plugin/org.eclipse.papyrus.tests.framework/qvto/gmfgen2uml-instances.qvto");
		qvtoComponent.setOutResourceURI("platform:/resource/org.eclipse.papyrus.uml.diagram.component/model/ComponentDiagram.gmfgen.uml");;
		
		
		
	}
	
	//@Test
	public void test() {
		String workflowFile = "src/org/eclipse/papyrus/uml/diagram/component/test/generation/GeneratePapyrusTestsWorkflow.mwe2";
		
//		ProgressMonitor monitor = new NullProgressMonitor();
//        Map<String, String> properties = new HashMap<String, String>();
//        WorkflowRunner workflowRunner = new WorkflowRunner();
//
//        properties.put("outlet_path", "./src-gen");
//
//
//        Map<String, ?> slotContents = null;
//		workflowRunner.run(workflowFile, monitor, properties,	slotContents);
        
//		Map<String, String> properties = new HashMap<String, String>();
//		Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
//		Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
//		RuntimeResourceSetInitializer initializer = new RuntimeResourceSetInitializer();
//		mweRunner.setInitializer(initializer );
//		mweRunner.run(wfFile, properties);
//		Mwe2StandaloneSetup.doSetup();
//		new Mwe2Launcher().run(new String[]{workflowFile});
		EPackage.Registry.INSTANCE.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

		Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
		Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
		injector.getInstance(QvtoTransformationWorkflowComponent1.class);
		mweRunner.run(URI.createFileURI(workflowFile), new HashMap<String,String>());
	}

}
