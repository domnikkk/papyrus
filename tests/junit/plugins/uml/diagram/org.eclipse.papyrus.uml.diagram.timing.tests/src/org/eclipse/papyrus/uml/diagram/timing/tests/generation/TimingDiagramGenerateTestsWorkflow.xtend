package org.eclipse.papyrus.uml.diagram.timing.tests.generation

import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl
import org.eclipse.papyrus.tests.framework.mwe.GenerateTestsWorkflow

class TimingDiagramGenerateTestsWorkflow {

	def static void main(String[] args) {
		val workflow = new GenerateTestsWorkflow()
		workflow.uriPrefix = "platform:/resource"
		runWorkflow(workflow);
	}

	def static void runWorkflow(GenerateTestsWorkflow workflow) {
		workflow.gmfgenUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.timing/model/TimingDiagram.gmfgen'
		workflow.testSrcGenLocation = 'test-gen/'
		workflow.qvtoScriptUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.timing.tests/qvto/TimingDiagramTest.qvto'
		workflow.testModelUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.timing.tests/model/TimingDiagramTest.uml'
		workflow.run(new WorkflowContextImpl());
	}

}
