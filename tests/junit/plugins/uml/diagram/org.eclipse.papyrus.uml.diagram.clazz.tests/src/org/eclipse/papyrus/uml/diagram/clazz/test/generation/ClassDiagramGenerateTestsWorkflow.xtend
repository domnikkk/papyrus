package org.eclipse.papyrus.uml.diagram.clazz.test.generation

import org.eclipse.papyrus.tests.framework.mwe.GenerateTestsWorkflow
import org.junit.Test

class ClassDiagramGenerateTestsWorkflow extends GenerateTestsWorkflow {

	def static void main(String[] args) {
		val workflow = new ClassDiagramGenerateTestsWorkflow()
		workflow.gmfgenUri = 'platform:/resource/org.eclipse.papyrus.uml.diagram.clazz/model/classdiagram.gmfgen'
		workflow.gmfgenUmlUri = 'platform:/resource/org.eclipse.papyrus.uml.diagram.clazz/model/ClassDiagram.gmfgen.uml'
		workflow.qvtoScriptUri = 'platform:/resource/org.eclipse.papyrus.uml.diagram.clazz.tests/qvto/classdiagramtest.qvto'
		workflow.testModelUri = 'platform:/resource/org.eclipse.papyrus.uml.diagram.clazz.tests/model/ClassDiagramTest.uml'
	}
	
	@Test def void test(){
		
	}
 

}
