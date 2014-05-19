package org.eclipse.papyrus.uml.diagram.clazz.test.generation;

import org.eclipse.papyrus.tests.framework.mwe.GenerateTestsWorkflow;
import org.junit.Test;

@SuppressWarnings("all")
public class ClassDiagramGenerateTestsWorkflow extends GenerateTestsWorkflow {
  public static void main(final String[] args) {
    final ClassDiagramGenerateTestsWorkflow workflow = new ClassDiagramGenerateTestsWorkflow();
    workflow.setGmfgenUri("platform:/resource/org.eclipse.papyrus.uml.diagram.clazz/model/classdiagram.gmfgen");
    workflow.setGmfgenUmlUri("platform:/resource/org.eclipse.papyrus.uml.diagram.clazz/model/ClassDiagram.gmfgen.uml");
    workflow.setQvtoScriptUri("platform:/resource/org.eclipse.papyrus.uml.diagram.clazz.tests/qvto/classdiagramtest.qvto");
    workflow.setTestModelUri("platform:/resource/org.eclipse.papyrus.uml.diagram.clazz.tests/model/ClassDiagramTest.uml");
  }
  
  @Test
  public void test() {
  }
}
