package org.eclipse.papyrus.uml.diagram.profile.tests.generation

import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl
import org.eclipse.papyrus.tests.framework.mwe.GenerateTestsWorkflow

class ProfileDiagramGenerateTestsWorkflow {

	def static void main(String[] args) {
		val workflow = new GenerateTestsWorkflow()
		workflow.uriPrefix = "platform:/resource"
		runWorkflow(workflow);
	}

	def static void runWorkflow(GenerateTestsWorkflow workflow) {
		workflow.gmfgenUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.profile/model/ProfileDiagram.gmfgen'
		workflow.testSrcGenLocation = 'test-gen/'
		workflow.qvtoScriptUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.profile.tests/qvto/ProfileDiagramTest.qvto'
		workflow.testModelUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.profile.tests/model/ProfileDiagramTest.uml'
		workflow.run(new WorkflowContextImpl());
	}

}
