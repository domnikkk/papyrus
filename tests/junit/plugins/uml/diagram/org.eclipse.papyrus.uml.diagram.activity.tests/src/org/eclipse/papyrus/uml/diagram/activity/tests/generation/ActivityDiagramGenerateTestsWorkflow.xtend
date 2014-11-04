package org.eclipse.papyrus.uml.diagram.activity.tests.generation

import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl
import org.eclipse.papyrus.tests.framework.mwe.GenerateTestsWorkflow

class ActivityDiagramGenerateTestsWorkflow {

	
	def static void main(String[] args) {
		val workflow = new GenerateTestsWorkflow()
		workflow.uriPrefix = "platform:/resource"
		runWorkflow(workflow);
	}

	def static void runWorkflow(GenerateTestsWorkflow workflow) {
		workflow.gmfgenUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.activity/model/activityDiagram.gmfgen'
		workflow.testSrcGenLocation = 'test-gen/'
		workflow.qvtoScriptUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.activity.tests/qvto/ActivityDiagramTest.qvto'
		workflow.testModelUri = workflow.uriPrefix + '/org.eclipse.papyrus.uml.diagram.activity.tests/model/ActivityDiagramTest.uml'
		//workflow.projectUri = '/org.eclipse.papyrus.uml.diagram.activity.tests/'
		workflow.run(new WorkflowContextImpl());
	}

}
