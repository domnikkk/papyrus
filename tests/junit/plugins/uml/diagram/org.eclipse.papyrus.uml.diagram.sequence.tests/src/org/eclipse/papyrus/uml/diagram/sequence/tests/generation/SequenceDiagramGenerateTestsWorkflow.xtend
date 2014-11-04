package org.eclipse.papyrus.uml.diagram.sequence.tests.generation

import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl
import org.eclipse.papyrus.tests.framework.mwe.GenerateTestsWorkflow

class SequenceDiagramGenerateTestsWorkflow {

	def static void main(String[] args) {
		val workflow = new GenerateTestsWorkflow()
		workflow.uriPrefix = "platform:/resource"
		runWorkflow(workflow);
	}

	def static void runWorkflow(GenerateTestsWorkflow workflow) {
		workflow.gmfgenUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.sequence/model/SequenceDiagram.gmfgen'
		workflow.testSrcGenLocation = 'test-gen/'
		workflow.qvtoScriptUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.sequence.tests/qvto/SequenceDiagramTest.qvto'
		workflow.testModelUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.sequence.tests/model/SequenceDiagramTest.uml'
		workflow.run(new WorkflowContextImpl());
	}

}
