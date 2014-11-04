package org.eclipse.papyrus.uml.diagram.component.test.generation

import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl
import org.eclipse.papyrus.tests.framework.mwe.GenerateTestsWorkflow

class ComponentDiagramGenerateTestsWorkflow {

	def static void main(String[] args) {
		val workflow = new GenerateTestsWorkflow()
		workflow.uriPrefix = "platform:/resource"
		runWorkflow(workflow);
	}

	def static void runWorkflow(GenerateTestsWorkflow workflow) {
		workflow.gmfgenUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.component/model/ComponentDiagram.gmfgen'
		workflow.testSrcGenLocation = 'test-gen/'
		workflow.qvtoScriptUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.component.tests/qvto/ComponentDiagramTest.qvto'
		workflow.testModelUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.component.tests/model/ComponentDiagramTest.uml'
		workflow.run(new WorkflowContextImpl());
	}

}
